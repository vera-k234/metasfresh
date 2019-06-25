/// <reference types="Cypress" />

import {BPartner} from '../../support/utils/bpartner';
import {SalesInvoice, SalesInvoiceLine} from '../../support/utils/sales_invoice';
import {DiscountSchema} from "../../support/utils/discountschema";
import {Bank} from "../../support/utils/bank";
import {Builder} from "../../support/utils/builder";

describe('Create a manual Payment for a Sales Invoice', function () {
  // const timestamp = new Date().getTime();
  const timestamp = '1561461010659'; // to use this just comment the `before` function


  const salesInvoiceTargetDocumentType = 'Sales Invoice';
  let salesInvoiceNumber;
  let salesInvoiceTotalAmount = 0;
  let salesInvoiceID = 0;

  const paymentDocumentType = 'Zahlungseingang';
  let paymentTotalAmount = 0; // may be different from salesInvoiceTotalAmount because there could be some discounts


  // data for "before" section
  // priceList
  const priceSystemName = `PriceSystem ${timestamp}`;
  const priceListName = `PriceList ${timestamp}`;
  const priceListVersionName = `PriceListVersion ${timestamp}`;

  // product
  const productCategoryName = `ProductCategory ${timestamp}`;
  const productCategoryValue = productCategoryName;
  const productName = `Product ${timestamp}`;
  const productValue = productName;

  // BPartner
  const discountSchemaName = `DiscountSchema ${timestamp}`;
  const bPartnerName = `bPartner ${timestamp}`;


  before(function () {
    // Builder.createBasicPriceEntities(priceSystemName, priceListVersionName, priceListName);
    //
    // Builder.createBasicProductEntities(productCategoryName, productCategoryValue, priceListName, productName, productValue);

    // cy.fixture('discount/discountschema.json').then(discountSchemaJson => {
    //   Object.assign(new DiscountSchema(), discountSchemaJson)
    //     .setName(discountSchemaName)
    //     .apply();
    // });
    // cy.fixture('finance/bank.json').then(productJson => {
    //   Object.assign(new Bank(), productJson)
    //     .apply();
    // });
    cy.fixture('sales/simple_customer.json').then(customerJson => {
      Object.assign(new BPartner(), customerJson)
        .setName(bPartnerName)
        .setCustomerDiscountSchema(discountSchemaName)
        .apply();
    });

    cy.readAllNotifications();
  });


  it('Creates a Sales Invoice', function () {
    new SalesInvoice(bPartnerName, salesInvoiceTargetDocumentType)
      .addLine(
        new SalesInvoiceLine()
          .setProduct(productName)
          .setQuantity(20)
        // todo @dh: how to add packing item
        // .setPackingItem('IFCO 6410 x 10 Stk')
        // .setTuQuantity(2)
      )
      // .addLine(
      // todo @dh: how to add this line which depends on the packing item?
      //   new SalesInvoiceLine()
      //     .setProduct('IFCO 6410_P001512')
      //     .setQuantity(2)
      // )
      .setPriceList(priceListName)
      .setDocumentAction('Complete')
      .setDocumentStatus('Completed')
      .apply();
  });


  it('The Sales Invoice should not be paid', function () {
    cy.isChecked('IsPaid').then(checkBoxValue => {
      assert.equal(checkBoxValue, false);
    });
  });


  it('Save values needed for the next step', function () {
    cy.getFieldValue('DocumentNo').then(documentNumber => {
      salesInvoiceNumber = documentNumber;
    });

    cy.get('.header-breadcrumb-sitename').then(si => {
      salesInvoiceTotalAmount = parseFloat(si.html().split(' ')[2], 10); // the format is "DOC_NO MM/DD/YYYY total"
    });

    cy.url().then(ulrr => {
      salesInvoiceID = ulrr.split('/').pop();
      cy.log(`salesInvoiceID is ${salesInvoiceID}`);
    });
  });

  it('Creates a manual Payment', function () {
    cy.visitWindow('195', 'NEW');

    cy.writeIntoLookupListField('C_BPartner_ID', bPartnerName, bPartnerName);

    cy.getFieldValue('DocumentNo').should('be.empty');
    cy.selectInListField('C_DocType_ID', paymentDocumentType);
    cy.getFieldValue('DocumentNo').should('not.be.empty');

    cy.getFieldValue('PayAmt').then(val => {
      const cast = parseFloat(val);
      assert.equal(cast, 0);
    });

    cy.writeIntoLookupListField('C_Invoice_ID', salesInvoiceNumber, salesInvoiceNumber);

    cy.processDocument('Complete', 'Completed');
  });


  it('Checks the paid + discount amount', function () {
    // discount amount is taken from the advanced edit dialog of the line
    cy.selectTab('C_AllocationLine');
    cy.selectSingleTabRow();
    cy.openAdvancedEdit();

    let discountAmount;
    cy.getFieldValue('DiscountAmt', true).then(val => {
      discountAmount = parseFloat(val);
    });

    cy.getFieldValue('Amount').then(val => {
      const value = parseFloat(val).toFixed(2);
      paymentTotalAmount = parseFloat(salesInvoiceTotalAmount - discountAmount).toFixed(2);
      assert.equal(value, paymentTotalAmount);
    });

    cy.pressDoneButton();
  });


  it('Accounting transactions are created', function () {
    cy.wait(5000);  // give the system some breathing space
    cy.get('body').type('{alt}6'); // open referenced-records-sidelist
    cy.selectReference('AD_RelationType_ID-540201');
  });


  it('The paid Sales Invoice is linked to this Payment', function () {
    cy.selectTab('C_AllocationLine');

    cy.get('.table-flex-wrapper')
      .find('tbody td')
      .contains(salesInvoiceNumber)
      .click()
      .trigger('contextmenu');

    // - invoice of the bpartner can be selected/zoomed into
    cy.get('.context-menu-item')
      .contains('Zoom Into');

    // note: we must not click the zoom into button, since that will open a new browser tab, and cypress
    // cannot handle that.
    // instead we have to save the ID of the sales invoice we want to return to, and use that one to visit the window.

    cy.visitWindow('167', salesInvoiceID);
  });


  it('Sales Invoice is now marked as paid', function () {
    cy.isChecked('IsPaid').then(checkBoxValue => {
      cy.log(`IsPaid = ${checkBoxValue}`);
      assert.equal(checkBoxValue, true);
    });
  });
});
