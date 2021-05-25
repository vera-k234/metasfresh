/*
 * Fulfillment API
 * Use the Fulfillment API to complete the process of packaging, addressing, handling, and shipping each order on behalf of the seller, in accordance with the payment method and timing specified at checkout.
 *
 * The version of the OpenAPI document: v1.19.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.metas.camel.externalsystems.ebay.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.metas.camel.externalsystems.ebay.api.model.Amount;
import de.metas.camel.externalsystems.ebay.api.model.Buyer;
import de.metas.camel.externalsystems.ebay.api.model.CancelStatus;
import de.metas.camel.externalsystems.ebay.api.model.FulfillmentStartInstruction;
import de.metas.camel.externalsystems.ebay.api.model.LineItem;
import de.metas.camel.externalsystems.ebay.api.model.PaymentSummary;
import de.metas.camel.externalsystems.ebay.api.model.PricingSummary;
import de.metas.camel.externalsystems.ebay.api.model.Program;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type contains the details of an order, including information about the buyer, order history, shipping fulfillments, line items, costs, payments, and order fulfillment status.
 */
@ApiModel(description = "This type contains the details of an order, including information about the buyer, order history, shipping fulfillments, line items, costs, payments, and order fulfillment status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class Order {
  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private Buyer buyer;

  public static final String SERIALIZED_NAME_BUYER_CHECKOUT_NOTES = "buyerCheckoutNotes";
  @SerializedName(SERIALIZED_NAME_BUYER_CHECKOUT_NOTES)
  private String buyerCheckoutNotes;

  public static final String SERIALIZED_NAME_CANCEL_STATUS = "cancelStatus";
  @SerializedName(SERIALIZED_NAME_CANCEL_STATUS)
  private CancelStatus cancelStatus;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_EBAY_COLLECT_AND_REMIT_TAX = "ebayCollectAndRemitTax";
  @SerializedName(SERIALIZED_NAME_EBAY_COLLECT_AND_REMIT_TAX)
  private Boolean ebayCollectAndRemitTax;

  public static final String SERIALIZED_NAME_FULFILLMENT_HREFS = "fulfillmentHrefs";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_HREFS)
  private List<String> fulfillmentHrefs = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_START_INSTRUCTIONS = "fulfillmentStartInstructions";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_START_INSTRUCTIONS)
  private List<FulfillmentStartInstruction> fulfillmentStartInstructions = null;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_LEGACY_ORDER_ID = "legacyOrderId";
  @SerializedName(SERIALIZED_NAME_LEGACY_ORDER_ID)
  private String legacyOrderId;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<LineItem> lineItems = null;

  public static final String SERIALIZED_NAME_ORDER_FULFILLMENT_STATUS = "orderFulfillmentStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_FULFILLMENT_STATUS)
  private String orderFulfillmentStatus;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_PAYMENT_STATUS = "orderPaymentStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_PAYMENT_STATUS)
  private String orderPaymentStatus;

  public static final String SERIALIZED_NAME_PAYMENT_SUMMARY = "paymentSummary";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SUMMARY)
  private PaymentSummary paymentSummary;

  public static final String SERIALIZED_NAME_PRICING_SUMMARY = "pricingSummary";
  @SerializedName(SERIALIZED_NAME_PRICING_SUMMARY)
  private PricingSummary pricingSummary;

  public static final String SERIALIZED_NAME_PROGRAM = "program";
  @SerializedName(SERIALIZED_NAME_PROGRAM)
  private Program program;

  public static final String SERIALIZED_NAME_SALES_RECORD_REFERENCE = "salesRecordReference";
  @SerializedName(SERIALIZED_NAME_SALES_RECORD_REFERENCE)
  private String salesRecordReference;

  public static final String SERIALIZED_NAME_SELLER_ID = "sellerId";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_TOTAL_FEE_BASIS_AMOUNT = "totalFeeBasisAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEE_BASIS_AMOUNT)
  private Amount totalFeeBasisAmount;

  public static final String SERIALIZED_NAME_TOTAL_MARKETPLACE_FEE = "totalMarketplaceFee";
  @SerializedName(SERIALIZED_NAME_TOTAL_MARKETPLACE_FEE)
  private Amount totalMarketplaceFee;


  public Order buyer(Buyer buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Buyer getBuyer() {
    return buyer;
  }


  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }


  public Order buyerCheckoutNotes(String buyerCheckoutNotes) {
    
    this.buyerCheckoutNotes = buyerCheckoutNotes;
    return this;
  }

   /**
   * This field contains any comments that the buyer left for the seller about the order during checkout process. This field is only returned if a buyer left comments at checkout time.
   * @return buyerCheckoutNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field contains any comments that the buyer left for the seller about the order during checkout process. This field is only returned if a buyer left comments at checkout time.")

  public String getBuyerCheckoutNotes() {
    return buyerCheckoutNotes;
  }


  public void setBuyerCheckoutNotes(String buyerCheckoutNotes) {
    this.buyerCheckoutNotes = buyerCheckoutNotes;
  }


  public Order cancelStatus(CancelStatus cancelStatus) {
    
    this.cancelStatus = cancelStatus;
    return this;
  }

   /**
   * Get cancelStatus
   * @return cancelStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CancelStatus getCancelStatus() {
    return cancelStatus;
  }


  public void setCancelStatus(CancelStatus cancelStatus) {
    this.cancelStatus = cancelStatus;
  }


  public Order creationDate(String creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time that the order was created. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the order was created. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")

  public String getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public Order ebayCollectAndRemitTax(Boolean ebayCollectAndRemitTax) {
    
    this.ebayCollectAndRemitTax = ebayCollectAndRemitTax;
    return this;
  }

   /**
   * This field is only returned if true, and indicates that eBay will collect tax (US state-mandates sales tax or &#39;goods and services&#39; tax in Australia or New Zealand) for at least one line item in the order, and remit the tax to the taxing authority of the buyer&#39;s residence. If this field is returned, the seller should search for one or more ebayCollectAndRemitTaxes containers at the line item level to get more information about the type of tax and the amount.
   * @return ebayCollectAndRemitTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is only returned if true, and indicates that eBay will collect tax (US state-mandates sales tax or 'goods and services' tax in Australia or New Zealand) for at least one line item in the order, and remit the tax to the taxing authority of the buyer's residence. If this field is returned, the seller should search for one or more ebayCollectAndRemitTaxes containers at the line item level to get more information about the type of tax and the amount.")

  public Boolean getEbayCollectAndRemitTax() {
    return ebayCollectAndRemitTax;
  }


  public void setEbayCollectAndRemitTax(Boolean ebayCollectAndRemitTax) {
    this.ebayCollectAndRemitTax = ebayCollectAndRemitTax;
  }


  public Order fulfillmentHrefs(List<String> fulfillmentHrefs) {
    
    this.fulfillmentHrefs = fulfillmentHrefs;
    return this;
  }

  public Order addFulfillmentHrefsItem(String fulfillmentHrefsItem) {
    if (this.fulfillmentHrefs == null) {
      this.fulfillmentHrefs = new ArrayList<String>();
    }
    this.fulfillmentHrefs.add(fulfillmentHrefsItem);
    return this;
  }

   /**
   * This array contains a list of one or more getShippingFulfillment call URIs that can be used to retrieve shipping fulfillments that have been set up for the order.
   * @return fulfillmentHrefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This array contains a list of one or more getShippingFulfillment call URIs that can be used to retrieve shipping fulfillments that have been set up for the order.")

  public List<String> getFulfillmentHrefs() {
    return fulfillmentHrefs;
  }


  public void setFulfillmentHrefs(List<String> fulfillmentHrefs) {
    this.fulfillmentHrefs = fulfillmentHrefs;
  }


  public Order fulfillmentStartInstructions(List<FulfillmentStartInstruction> fulfillmentStartInstructions) {
    
    this.fulfillmentStartInstructions = fulfillmentStartInstructions;
    return this;
  }

  public Order addFulfillmentStartInstructionsItem(FulfillmentStartInstruction fulfillmentStartInstructionsItem) {
    if (this.fulfillmentStartInstructions == null) {
      this.fulfillmentStartInstructions = new ArrayList<FulfillmentStartInstruction>();
    }
    this.fulfillmentStartInstructions.add(fulfillmentStartInstructionsItem);
    return this;
  }

   /**
   * This container consists of a set of specifications for fulfilling the order, including the type of fulfillment, shipping carrier and service, shipping address, and estimated delivery window. These instructions are derived from the buyer&#39;s and seller&#39;s eBay account preferences, the listing parameters, and the buyer&#39;s checkout selections. The seller can use them as a starting point for packaging, addressing, and shipping the order. Note: Although this container is presented as an array, it currently returns only one set of fulfillment specifications. Additional array members will be supported in future functionality.
   * @return fulfillmentStartInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This container consists of a set of specifications for fulfilling the order, including the type of fulfillment, shipping carrier and service, shipping address, and estimated delivery window. These instructions are derived from the buyer's and seller's eBay account preferences, the listing parameters, and the buyer's checkout selections. The seller can use them as a starting point for packaging, addressing, and shipping the order. Note: Although this container is presented as an array, it currently returns only one set of fulfillment specifications. Additional array members will be supported in future functionality.")

  public List<FulfillmentStartInstruction> getFulfillmentStartInstructions() {
    return fulfillmentStartInstructions;
  }


  public void setFulfillmentStartInstructions(List<FulfillmentStartInstruction> fulfillmentStartInstructions) {
    this.fulfillmentStartInstructions = fulfillmentStartInstructions;
  }


  public Order lastModifiedDate(String lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * The date and time that the order was last modified. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the order was last modified. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")

  public String getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public Order legacyOrderId(String legacyOrderId) {
    
    this.legacyOrderId = legacyOrderId;
    return this;
  }

   /**
   * The unique identifier of the order in legacy format, as traditionally used by the Trading API (and other legacy APIs). Both the orderId field and this field are always returned. Note: In June 2019, Order IDs in REST APIs transitioned to a new format. For the Trading and other legacy APIs, by using version control/compatibility level, users have the option of using the older legacy order ID format, or they can migrate to the new order ID format, which is the same order ID format being used by REST APIs. Although users of the Trading API (and other legacy APIs) can now transition to the new order ID format, this legacyOrderId field will still return order IDs in the old format to distinguish between the old and new order IDs.
   * @return legacyOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the order in legacy format, as traditionally used by the Trading API (and other legacy APIs). Both the orderId field and this field are always returned. Note: In June 2019, Order IDs in REST APIs transitioned to a new format. For the Trading and other legacy APIs, by using version control/compatibility level, users have the option of using the older legacy order ID format, or they can migrate to the new order ID format, which is the same order ID format being used by REST APIs. Although users of the Trading API (and other legacy APIs) can now transition to the new order ID format, this legacyOrderId field will still return order IDs in the old format to distinguish between the old and new order IDs.")

  public String getLegacyOrderId() {
    return legacyOrderId;
  }


  public void setLegacyOrderId(String legacyOrderId) {
    this.legacyOrderId = legacyOrderId;
  }


  public Order lineItems(List<LineItem> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public Order addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This array contains the details for all line items that comprise the order.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This array contains the details for all line items that comprise the order.")

  public List<LineItem> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }


  public Order orderFulfillmentStatus(String orderFulfillmentStatus) {
    
    this.orderFulfillmentStatus = orderFulfillmentStatus;
    return this;
  }

   /**
   * The degree to which fulfillment of the order is complete. See the OrderFulfillmentStatus type definition for more information about each possible fulfillment state. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:OrderFulfillmentStatus&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return orderFulfillmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The degree to which fulfillment of the order is complete. See the OrderFulfillmentStatus type definition for more information about each possible fulfillment state. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:OrderFulfillmentStatus'>eBay API documentation</a>")

  public String getOrderFulfillmentStatus() {
    return orderFulfillmentStatus;
  }


  public void setOrderFulfillmentStatus(String orderFulfillmentStatus) {
    this.orderFulfillmentStatus = orderFulfillmentStatus;
  }


  public Order orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * The unique identifier of the order. Both the legacyOrderId field (traditionally used by Trading and other legacy APIS) and this field are always returned. Note: In June 2019, Order IDs in REST APIs transitioned to a new format. For the Trading and other legacy APIs, by using version control/compatibility level, users have the option of using the older legacy order ID format, or they can migrate to the new order ID format, which is the same order ID format being used by REST APIs. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers are automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the order. Both the legacyOrderId field (traditionally used by Trading and other legacy APIS) and this field are always returned. Note: In June 2019, Order IDs in REST APIs transitioned to a new format. For the Trading and other legacy APIs, by using version control/compatibility level, users have the option of using the older legacy order ID format, or they can migrate to the new order ID format, which is the same order ID format being used by REST APIs. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers are automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support.")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Order orderPaymentStatus(String orderPaymentStatus) {
    
    this.orderPaymentStatus = orderPaymentStatus;
    return this;
  }

   /**
   * The enumeration value returned in this field indicates the current payment status of an order, or in case of a refund request, the current status of the refund. See the OrderPaymentStatusEnum type definition for more information about each possible payment/refund state. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:OrderPaymentStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return orderPaymentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The enumeration value returned in this field indicates the current payment status of an order, or in case of a refund request, the current status of the refund. See the OrderPaymentStatusEnum type definition for more information about each possible payment/refund state. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:OrderPaymentStatusEnum'>eBay API documentation</a>")

  public String getOrderPaymentStatus() {
    return orderPaymentStatus;
  }


  public void setOrderPaymentStatus(String orderPaymentStatus) {
    this.orderPaymentStatus = orderPaymentStatus;
  }


  public Order paymentSummary(PaymentSummary paymentSummary) {
    
    this.paymentSummary = paymentSummary;
    return this;
  }

   /**
   * Get paymentSummary
   * @return paymentSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentSummary getPaymentSummary() {
    return paymentSummary;
  }


  public void setPaymentSummary(PaymentSummary paymentSummary) {
    this.paymentSummary = paymentSummary;
  }


  public Order pricingSummary(PricingSummary pricingSummary) {
    
    this.pricingSummary = pricingSummary;
    return this;
  }

   /**
   * Get pricingSummary
   * @return pricingSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingSummary getPricingSummary() {
    return pricingSummary;
  }


  public void setPricingSummary(PricingSummary pricingSummary) {
    this.pricingSummary = pricingSummary;
  }


  public Order program(Program program) {
    
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Program getProgram() {
    return program;
  }


  public void setProgram(Program program) {
    this.program = program;
  }


  public Order salesRecordReference(String salesRecordReference) {
    
    this.salesRecordReference = salesRecordReference;
    return this;
  }

   /**
   * An eBay-generated identifier that is used to identify and manage orders through the Selling Manager and Selling Manager Pro tools. This order identifier can also be found on the Orders grid page and in the Sales Record pages in Seller Hub. A salesRecordReference number is only generated and returned at the order level, and not at the order line item level. In cases where the seller does not have a Selling Manager or Selling Manager Pro subscription nor access to Seller Hub, this field may not be returned.
   * @return salesRecordReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An eBay-generated identifier that is used to identify and manage orders through the Selling Manager and Selling Manager Pro tools. This order identifier can also be found on the Orders grid page and in the Sales Record pages in Seller Hub. A salesRecordReference number is only generated and returned at the order level, and not at the order line item level. In cases where the seller does not have a Selling Manager or Selling Manager Pro subscription nor access to Seller Hub, this field may not be returned.")

  public String getSalesRecordReference() {
    return salesRecordReference;
  }


  public void setSalesRecordReference(String salesRecordReference) {
    this.salesRecordReference = salesRecordReference;
  }


  public Order sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The unique eBay user ID of the seller who sold the order.
   * @return sellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique eBay user ID of the seller who sold the order.")

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public Order totalFeeBasisAmount(Amount totalFeeBasisAmount) {
    
    this.totalFeeBasisAmount = totalFeeBasisAmount;
    return this;
  }

   /**
   * Get totalFeeBasisAmount
   * @return totalFeeBasisAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getTotalFeeBasisAmount() {
    return totalFeeBasisAmount;
  }


  public void setTotalFeeBasisAmount(Amount totalFeeBasisAmount) {
    this.totalFeeBasisAmount = totalFeeBasisAmount;
  }


  public Order totalMarketplaceFee(Amount totalMarketplaceFee) {
    
    this.totalMarketplaceFee = totalMarketplaceFee;
    return this;
  }

   /**
   * Get totalMarketplaceFee
   * @return totalMarketplaceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getTotalMarketplaceFee() {
    return totalMarketplaceFee;
  }


  public void setTotalMarketplaceFee(Amount totalMarketplaceFee) {
    this.totalMarketplaceFee = totalMarketplaceFee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.buyer, order.buyer) &&
        Objects.equals(this.buyerCheckoutNotes, order.buyerCheckoutNotes) &&
        Objects.equals(this.cancelStatus, order.cancelStatus) &&
        Objects.equals(this.creationDate, order.creationDate) &&
        Objects.equals(this.ebayCollectAndRemitTax, order.ebayCollectAndRemitTax) &&
        Objects.equals(this.fulfillmentHrefs, order.fulfillmentHrefs) &&
        Objects.equals(this.fulfillmentStartInstructions, order.fulfillmentStartInstructions) &&
        Objects.equals(this.lastModifiedDate, order.lastModifiedDate) &&
        Objects.equals(this.legacyOrderId, order.legacyOrderId) &&
        Objects.equals(this.lineItems, order.lineItems) &&
        Objects.equals(this.orderFulfillmentStatus, order.orderFulfillmentStatus) &&
        Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.orderPaymentStatus, order.orderPaymentStatus) &&
        Objects.equals(this.paymentSummary, order.paymentSummary) &&
        Objects.equals(this.pricingSummary, order.pricingSummary) &&
        Objects.equals(this.program, order.program) &&
        Objects.equals(this.salesRecordReference, order.salesRecordReference) &&
        Objects.equals(this.sellerId, order.sellerId) &&
        Objects.equals(this.totalFeeBasisAmount, order.totalFeeBasisAmount) &&
        Objects.equals(this.totalMarketplaceFee, order.totalMarketplaceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyer, buyerCheckoutNotes, cancelStatus, creationDate, ebayCollectAndRemitTax, fulfillmentHrefs, fulfillmentStartInstructions, lastModifiedDate, legacyOrderId, lineItems, orderFulfillmentStatus, orderId, orderPaymentStatus, paymentSummary, pricingSummary, program, salesRecordReference, sellerId, totalFeeBasisAmount, totalMarketplaceFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    buyerCheckoutNotes: ").append(toIndentedString(buyerCheckoutNotes)).append("\n");
    sb.append("    cancelStatus: ").append(toIndentedString(cancelStatus)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    ebayCollectAndRemitTax: ").append(toIndentedString(ebayCollectAndRemitTax)).append("\n");
    sb.append("    fulfillmentHrefs: ").append(toIndentedString(fulfillmentHrefs)).append("\n");
    sb.append("    fulfillmentStartInstructions: ").append(toIndentedString(fulfillmentStartInstructions)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    legacyOrderId: ").append(toIndentedString(legacyOrderId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    orderFulfillmentStatus: ").append(toIndentedString(orderFulfillmentStatus)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderPaymentStatus: ").append(toIndentedString(orderPaymentStatus)).append("\n");
    sb.append("    paymentSummary: ").append(toIndentedString(paymentSummary)).append("\n");
    sb.append("    pricingSummary: ").append(toIndentedString(pricingSummary)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    salesRecordReference: ").append(toIndentedString(salesRecordReference)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    totalFeeBasisAmount: ").append(toIndentedString(totalFeeBasisAmount)).append("\n");
    sb.append("    totalMarketplaceFee: ").append(toIndentedString(totalMarketplaceFee)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

