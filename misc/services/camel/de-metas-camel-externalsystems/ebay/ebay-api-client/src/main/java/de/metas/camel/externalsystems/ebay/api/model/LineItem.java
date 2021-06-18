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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This type contains the details of each line item in an order.
 */
@ApiModel(description = "This type contains the details of each line item in an order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class LineItem
{
	public static final String SERIALIZED_NAME_APPLIED_PROMOTIONS = "appliedPromotions";
	@SerializedName(SERIALIZED_NAME_APPLIED_PROMOTIONS)
	private List<AppliedPromotion> appliedPromotions = null;

	public static final String SERIALIZED_NAME_DELIVERY_COST = "deliveryCost";
	@SerializedName(SERIALIZED_NAME_DELIVERY_COST)
	private DeliveryCost deliveryCost;

	public static final String SERIALIZED_NAME_DISCOUNTED_LINE_ITEM_COST = "discountedLineItemCost";
	@SerializedName(SERIALIZED_NAME_DISCOUNTED_LINE_ITEM_COST)
	private Amount discountedLineItemCost;

	public static final String SERIALIZED_NAME_EBAY_COLLECT_AND_REMIT_TAXES = "ebayCollectAndRemitTaxes";
	@SerializedName(SERIALIZED_NAME_EBAY_COLLECT_AND_REMIT_TAXES)
	private List<EbayCollectAndRemitTax> ebayCollectAndRemitTaxes = null;

	public static final String SERIALIZED_NAME_GIFT_DETAILS = "giftDetails";
	@SerializedName(SERIALIZED_NAME_GIFT_DETAILS)
	private GiftDetails giftDetails;

	public static final String SERIALIZED_NAME_LEGACY_ITEM_ID = "legacyItemId";
	@SerializedName(SERIALIZED_NAME_LEGACY_ITEM_ID)
	private String legacyItemId;

	public static final String SERIALIZED_NAME_LEGACY_VARIATION_ID = "legacyVariationId";
	@SerializedName(SERIALIZED_NAME_LEGACY_VARIATION_ID)
	private String legacyVariationId;

	public static final String SERIALIZED_NAME_LINE_ITEM_COST = "lineItemCost";
	@SerializedName(SERIALIZED_NAME_LINE_ITEM_COST)
	private Amount lineItemCost;

	public static final String SERIALIZED_NAME_LINE_ITEM_FULFILLMENT_INSTRUCTIONS = "lineItemFulfillmentInstructions";
	@SerializedName(SERIALIZED_NAME_LINE_ITEM_FULFILLMENT_INSTRUCTIONS)
	private LineItemFulfillmentInstructions lineItemFulfillmentInstructions;

	public static final String SERIALIZED_NAME_LINE_ITEM_FULFILLMENT_STATUS = "lineItemFulfillmentStatus";
	@SerializedName(SERIALIZED_NAME_LINE_ITEM_FULFILLMENT_STATUS)
	private String lineItemFulfillmentStatus;

	public static final String SERIALIZED_NAME_LINE_ITEM_ID = "lineItemId";
	@SerializedName(SERIALIZED_NAME_LINE_ITEM_ID)
	private String lineItemId;

	public static final String SERIALIZED_NAME_LISTING_MARKETPLACE_ID = "listingMarketplaceId";
	@SerializedName(SERIALIZED_NAME_LISTING_MARKETPLACE_ID)
	private String listingMarketplaceId;

	public static final String SERIALIZED_NAME_PROPERTIES = "properties";
	@SerializedName(SERIALIZED_NAME_PROPERTIES)
	private LineItemProperties properties;

	public static final String SERIALIZED_NAME_PURCHASE_MARKETPLACE_ID = "purchaseMarketplaceId";
	@SerializedName(SERIALIZED_NAME_PURCHASE_MARKETPLACE_ID)
	private String purchaseMarketplaceId;

	public static final String SERIALIZED_NAME_QUANTITY = "quantity";
	@SerializedName(SERIALIZED_NAME_QUANTITY)
	private Integer quantity;

	public static final String SERIALIZED_NAME_REFUNDS = "refunds";
	@SerializedName(SERIALIZED_NAME_REFUNDS)
	private List<LineItemRefund> refunds = null;

	public static final String SERIALIZED_NAME_SKU = "sku";
	@SerializedName(SERIALIZED_NAME_SKU)
	private String sku;

	public static final String SERIALIZED_NAME_SOLD_FORMAT = "soldFormat";
	@SerializedName(SERIALIZED_NAME_SOLD_FORMAT)
	private String soldFormat;

	public static final String SERIALIZED_NAME_TAXES = "taxes";
	@SerializedName(SERIALIZED_NAME_TAXES)
	private List<Tax> taxes = null;

	public static final String SERIALIZED_NAME_TITLE = "title";
	@SerializedName(SERIALIZED_NAME_TITLE)
	private String title;

	public static final String SERIALIZED_NAME_TOTAL = "total";
	@SerializedName(SERIALIZED_NAME_TOTAL)
	private Amount total;

	public LineItem appliedPromotions(List<AppliedPromotion> appliedPromotions)
	{

		this.appliedPromotions = appliedPromotions;
		return this;
	}

	public LineItem addAppliedPromotionsItem(AppliedPromotion appliedPromotionsItem)
	{
		if (this.appliedPromotions == null)
		{
			this.appliedPromotions = new ArrayList<AppliedPromotion>();
		}
		this.appliedPromotions.add(appliedPromotionsItem);
		return this;
	}

	/**
	 * This array contains information about one or more sales promotions or discounts applied to the line item. It is always returned, but will be returned as an empty array if no special sales promotions or discounts apply to the order line item.
	 * 
	 * @return appliedPromotions
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This array contains information about one or more sales promotions or discounts applied to the line item. It is always returned, but will be returned as an empty array if no special sales promotions or discounts apply to the order line item.")

	public List<AppliedPromotion> getAppliedPromotions()
	{
		return appliedPromotions;
	}

	public void setAppliedPromotions(List<AppliedPromotion> appliedPromotions)
	{
		this.appliedPromotions = appliedPromotions;
	}

	public LineItem deliveryCost(DeliveryCost deliveryCost)
	{

		this.deliveryCost = deliveryCost;
		return this;
	}

	/**
	 * Get deliveryCost
	 * 
	 * @return deliveryCost
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public DeliveryCost getDeliveryCost()
	{
		return deliveryCost;
	}

	public void setDeliveryCost(DeliveryCost deliveryCost)
	{
		this.deliveryCost = deliveryCost;
	}

	public LineItem discountedLineItemCost(Amount discountedLineItemCost)
	{

		this.discountedLineItemCost = discountedLineItemCost;
		return this;
	}

	/**
	 * Get discountedLineItemCost
	 * 
	 * @return discountedLineItemCost
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Amount getDiscountedLineItemCost()
	{
		return discountedLineItemCost;
	}

	public void setDiscountedLineItemCost(Amount discountedLineItemCost)
	{
		this.discountedLineItemCost = discountedLineItemCost;
	}

	public LineItem ebayCollectAndRemitTaxes(List<EbayCollectAndRemitTax> ebayCollectAndRemitTaxes)
	{

		this.ebayCollectAndRemitTaxes = ebayCollectAndRemitTaxes;
		return this;
	}

	public LineItem addEbayCollectAndRemitTaxesItem(EbayCollectAndRemitTax ebayCollectAndRemitTaxesItem)
	{
		if (this.ebayCollectAndRemitTaxes == null)
		{
			this.ebayCollectAndRemitTaxes = new ArrayList<EbayCollectAndRemitTax>();
		}
		this.ebayCollectAndRemitTaxes.add(ebayCollectAndRemitTaxesItem);
		return this;
	}

	/**
	 * This container will be returned if the order line item is subject to a &#39;Collect and Remit&#39; tax that eBay will collect and remit to the proper taxing authority on the buyer&#39;s behalf. &#39;Collect and Remit&#39; tax includes US state-mandated sales tax and &#39;Goods and Services&#39; tax (collected in Australia and New Zealand). The amount of this tax is shown in the amount
	 * field, and the type of tax is shown in the taxType field. eBay will display the tax type and amount during checkout in accordance with the buyer&#39;s address, and handle collection and remittance of the tax without requiring the seller to take any action.
	 * 
	 * @return ebayCollectAndRemitTaxes
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This container will be returned if the order line item is subject to a 'Collect and Remit' tax that eBay will collect and remit to the proper taxing authority on the buyer's behalf. 'Collect and Remit' tax includes US state-mandated sales tax and 'Goods and Services' tax (collected in Australia and New Zealand). The amount of this tax is shown in the amount field, and the type of tax is shown in the taxType field. eBay will display the tax type and amount during checkout in accordance with the buyer's address, and handle collection and remittance of the tax without requiring the seller to take any action.")

	public List<EbayCollectAndRemitTax> getEbayCollectAndRemitTaxes()
	{
		return ebayCollectAndRemitTaxes;
	}

	public void setEbayCollectAndRemitTaxes(List<EbayCollectAndRemitTax> ebayCollectAndRemitTaxes)
	{
		this.ebayCollectAndRemitTaxes = ebayCollectAndRemitTaxes;
	}

	public LineItem giftDetails(GiftDetails giftDetails)
	{

		this.giftDetails = giftDetails;
		return this;
	}

	/**
	 * Get giftDetails
	 * 
	 * @return giftDetails
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public GiftDetails getGiftDetails()
	{
		return giftDetails;
	}

	public void setGiftDetails(GiftDetails giftDetails)
	{
		this.giftDetails = giftDetails;
	}

	public LineItem legacyItemId(String legacyItemId)
	{

		this.legacyItemId = legacyItemId;
		return this;
	}

	/**
	 * The eBay-generated legacy listing item ID of the listing. Note that the unique identifier of a listing in REST-based APIs is called the listingId instead.
	 * 
	 * @return legacyItemId
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The eBay-generated legacy listing item ID of the listing. Note that the unique identifier of a listing in REST-based APIs is called the listingId instead.")

	public String getLegacyItemId()
	{
		return legacyItemId;
	}

	public void setLegacyItemId(String legacyItemId)
	{
		this.legacyItemId = legacyItemId;
	}

	public LineItem legacyVariationId(String legacyVariationId)
	{

		this.legacyVariationId = legacyVariationId;
		return this;
	}

	/**
	 * The unique identifier of a single variation within a multiple-variation listing. This field is only returned if the line item purchased was from a multiple-variation listing.
	 * 
	 * @return legacyVariationId
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The unique identifier of a single variation within a multiple-variation listing. This field is only returned if the line item purchased was from a multiple-variation listing.")

	public String getLegacyVariationId()
	{
		return legacyVariationId;
	}

	public void setLegacyVariationId(String legacyVariationId)
	{
		this.legacyVariationId = legacyVariationId;
	}

	public LineItem lineItemCost(Amount lineItemCost)
	{

		this.lineItemCost = lineItemCost;
		return this;
	}

	/**
	 * Get lineItemCost
	 * 
	 * @return lineItemCost
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Amount getLineItemCost()
	{
		return lineItemCost;
	}

	public void setLineItemCost(Amount lineItemCost)
	{
		this.lineItemCost = lineItemCost;
	}

	public LineItem lineItemFulfillmentInstructions(LineItemFulfillmentInstructions lineItemFulfillmentInstructions)
	{

		this.lineItemFulfillmentInstructions = lineItemFulfillmentInstructions;
		return this;
	}

	/**
	 * Get lineItemFulfillmentInstructions
	 * 
	 * @return lineItemFulfillmentInstructions
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public LineItemFulfillmentInstructions getLineItemFulfillmentInstructions()
	{
		return lineItemFulfillmentInstructions;
	}

	public void setLineItemFulfillmentInstructions(LineItemFulfillmentInstructions lineItemFulfillmentInstructions)
	{
		this.lineItemFulfillmentInstructions = lineItemFulfillmentInstructions;
	}

	public LineItem lineItemFulfillmentStatus(String lineItemFulfillmentStatus)
	{

		this.lineItemFulfillmentStatus = lineItemFulfillmentStatus;
		return this;
	}

	/**
	 * This enumeration value indicates the current fulfillment status of the line item. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:LineItemFulfillmentStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt;
	 * 
	 * @return lineItemFulfillmentStatus
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This enumeration value indicates the current fulfillment status of the line item. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:LineItemFulfillmentStatusEnum'>eBay API documentation</a>")

	public String getLineItemFulfillmentStatus()
	{
		return lineItemFulfillmentStatus;
	}

	public void setLineItemFulfillmentStatus(String lineItemFulfillmentStatus)
	{
		this.lineItemFulfillmentStatus = lineItemFulfillmentStatus;
	}

	public LineItem lineItemId(String lineItemId)
	{

		this.lineItemId = lineItemId;
		return this;
	}

	/**
	 * This is the unique identifier of an eBay order line item. This field is created as soon as there is a commitment to buy from the seller.
	 * 
	 * @return lineItemId
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This is the unique identifier of an eBay order line item. This field is created as soon as there is a commitment to buy from the seller.")

	public String getLineItemId()
	{
		return lineItemId;
	}

	public void setLineItemId(String lineItemId)
	{
		this.lineItemId = lineItemId;
	}

	public LineItem listingMarketplaceId(String listingMarketplaceId)
	{

		this.listingMarketplaceId = listingMarketplaceId;
		return this;
	}

	/**
	 * The unique identifier of the eBay marketplace where the line item was listed. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt;
	 * 
	 * @return listingMarketplaceId
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The unique identifier of the eBay marketplace where the line item was listed. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:MarketplaceIdEnum'>eBay API documentation</a>")

	public String getListingMarketplaceId()
	{
		return listingMarketplaceId;
	}

	public void setListingMarketplaceId(String listingMarketplaceId)
	{
		this.listingMarketplaceId = listingMarketplaceId;
	}

	public LineItem properties(LineItemProperties properties)
	{

		this.properties = properties;
		return this;
	}

	/**
	 * Get properties
	 * 
	 * @return properties
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public LineItemProperties getProperties()
	{
		return properties;
	}

	public void setProperties(LineItemProperties properties)
	{
		this.properties = properties;
	}

	public LineItem purchaseMarketplaceId(String purchaseMarketplaceId)
	{

		this.purchaseMarketplaceId = purchaseMarketplaceId;
		return this;
	}

	/**
	 * The unique identifier of the eBay marketplace where the line item was listed. Often, the listingMarketplaceId and the purchaseMarketplaceId identifier are the same, but there are occasions when an item will surface on multiple eBay marketplaces. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:MarketplaceIdEnum&#39;&gt;eBay
	 * API documentation&lt;/a&gt;
	 * 
	 * @return purchaseMarketplaceId
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The unique identifier of the eBay marketplace where the line item was listed. Often, the listingMarketplaceId and the purchaseMarketplaceId identifier are the same, but there are occasions when an item will surface on multiple eBay marketplaces. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:MarketplaceIdEnum'>eBay API documentation</a>")

	public String getPurchaseMarketplaceId()
	{
		return purchaseMarketplaceId;
	}

	public void setPurchaseMarketplaceId(String purchaseMarketplaceId)
	{
		this.purchaseMarketplaceId = purchaseMarketplaceId;
	}

	public LineItem quantity(Integer quantity)
	{

		this.quantity = quantity;
		return this;
	}

	/**
	 * The number of units of the line item in the order. These are represented as a group by a single lineItemId.
	 * 
	 * @return quantity
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The number of units of the line item in the order. These are represented as a group by a single lineItemId.")

	public Integer getQuantity()
	{
		return quantity;
	}

	public void setQuantity(Integer quantity)
	{
		this.quantity = quantity;
	}

	public LineItem refunds(List<LineItemRefund> refunds)
	{

		this.refunds = refunds;
		return this;
	}

	public LineItem addRefundsItem(LineItemRefund refundsItem)
	{
		if (this.refunds == null)
		{
			this.refunds = new ArrayList<LineItemRefund>();
		}
		this.refunds.add(refundsItem);
		return this;
	}

	/**
	 * This array is always returned, but is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
	 * 
	 * @return refunds
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This array is always returned, but is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.")

	public List<LineItemRefund> getRefunds()
	{
		return refunds;
	}

	public void setRefunds(List<LineItemRefund> refunds)
	{
		this.refunds = refunds;
	}

	public LineItem sku(String sku)
	{

		this.sku = sku;
		return this;
	}

	/**
	 * Seller-defined Stock-Keeping Unit (SKU). This inventory identifier must be unique within the seller&#39;s eBay inventory. SKUs are optional when listing in the legacy/Trading API system, but SKUs are required when listing items through the Inventory API model.
	 * 
	 * @return sku
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "Seller-defined Stock-Keeping Unit (SKU). This inventory identifier must be unique within the seller's eBay inventory. SKUs are optional when listing in the legacy/Trading API system, but SKUs are required when listing items through the Inventory API model.")

	public String getSku()
	{
		return sku;
	}

	public void setSku(String sku)
	{
		this.sku = sku;
	}

	public LineItem soldFormat(String soldFormat)
	{

		this.soldFormat = soldFormat;
		return this;
	}

	/**
	 * The eBay listing type of the line item. The most common listing types are AUCTION and FIXED_PRICE. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:SoldFormatEnum&#39;&gt;eBay API documentation&lt;/a&gt;
	 * 
	 * @return soldFormat
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The eBay listing type of the line item. The most common listing types are AUCTION and FIXED_PRICE. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:SoldFormatEnum'>eBay API documentation</a>")

	public String getSoldFormat()
	{
		return soldFormat;
	}

	public void setSoldFormat(String soldFormat)
	{
		this.soldFormat = soldFormat;
	}

	public LineItem taxes(List<Tax> taxes)
	{

		this.taxes = taxes;
		return this;
	}

	public LineItem addTaxesItem(Tax taxesItem)
	{
		if (this.taxes == null)
		{
			this.taxes = new ArrayList<Tax>();
		}
		this.taxes.add(taxesItem);
		return this;
	}

	/**
	 * Contains a list of taxes applied to the line item, if any. This array is always returned, but will be returned as empty if no taxes are applicable to the line item, or if the seller is opted in to eBay managed payments.
	 * 
	 * @return taxes
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "Contains a list of taxes applied to the line item, if any. This array is always returned, but will be returned as empty if no taxes are applicable to the line item, or if the seller is opted in to eBay managed payments.")

	public List<Tax> getTaxes()
	{
		return taxes;
	}

	public void setTaxes(List<Tax> taxes)
	{
		this.taxes = taxes;
	}

	public LineItem title(String title)
	{

		this.title = title;
		return this;
	}

	/**
	 * The title of the listing.
	 * 
	 * @return title
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "The title of the listing.")

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public LineItem total(Amount total)
	{

		this.total = total;
		return this;
	}

	/**
	 * Get total
	 * 
	 * @return total
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Amount getTotal()
	{
		return total;
	}

	public void setTotal(Amount total)
	{
		this.total = total;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		LineItem lineItem = (LineItem)o;
		return Objects.equals(this.appliedPromotions, lineItem.appliedPromotions) &&
				Objects.equals(this.deliveryCost, lineItem.deliveryCost) &&
				Objects.equals(this.discountedLineItemCost, lineItem.discountedLineItemCost) &&
				Objects.equals(this.ebayCollectAndRemitTaxes, lineItem.ebayCollectAndRemitTaxes) &&
				Objects.equals(this.giftDetails, lineItem.giftDetails) &&
				Objects.equals(this.legacyItemId, lineItem.legacyItemId) &&
				Objects.equals(this.legacyVariationId, lineItem.legacyVariationId) &&
				Objects.equals(this.lineItemCost, lineItem.lineItemCost) &&
				Objects.equals(this.lineItemFulfillmentInstructions, lineItem.lineItemFulfillmentInstructions) &&
				Objects.equals(this.lineItemFulfillmentStatus, lineItem.lineItemFulfillmentStatus) &&
				Objects.equals(this.lineItemId, lineItem.lineItemId) &&
				Objects.equals(this.listingMarketplaceId, lineItem.listingMarketplaceId) &&
				Objects.equals(this.properties, lineItem.properties) &&
				Objects.equals(this.purchaseMarketplaceId, lineItem.purchaseMarketplaceId) &&
				Objects.equals(this.quantity, lineItem.quantity) &&
				Objects.equals(this.refunds, lineItem.refunds) &&
				Objects.equals(this.sku, lineItem.sku) &&
				Objects.equals(this.soldFormat, lineItem.soldFormat) &&
				Objects.equals(this.taxes, lineItem.taxes) &&
				Objects.equals(this.title, lineItem.title) &&
				Objects.equals(this.total, lineItem.total);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(appliedPromotions, deliveryCost, discountedLineItemCost, ebayCollectAndRemitTaxes, giftDetails, legacyItemId, legacyVariationId, lineItemCost, lineItemFulfillmentInstructions, lineItemFulfillmentStatus, lineItemId, listingMarketplaceId, properties, purchaseMarketplaceId, quantity, refunds, sku, soldFormat, taxes, title, total);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class LineItem {\n");
		sb.append("    appliedPromotions: ").append(toIndentedString(appliedPromotions)).append("\n");
		sb.append("    deliveryCost: ").append(toIndentedString(deliveryCost)).append("\n");
		sb.append("    discountedLineItemCost: ").append(toIndentedString(discountedLineItemCost)).append("\n");
		sb.append("    ebayCollectAndRemitTaxes: ").append(toIndentedString(ebayCollectAndRemitTaxes)).append("\n");
		sb.append("    giftDetails: ").append(toIndentedString(giftDetails)).append("\n");
		sb.append("    legacyItemId: ").append(toIndentedString(legacyItemId)).append("\n");
		sb.append("    legacyVariationId: ").append(toIndentedString(legacyVariationId)).append("\n");
		sb.append("    lineItemCost: ").append(toIndentedString(lineItemCost)).append("\n");
		sb.append("    lineItemFulfillmentInstructions: ").append(toIndentedString(lineItemFulfillmentInstructions)).append("\n");
		sb.append("    lineItemFulfillmentStatus: ").append(toIndentedString(lineItemFulfillmentStatus)).append("\n");
		sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
		sb.append("    listingMarketplaceId: ").append(toIndentedString(listingMarketplaceId)).append("\n");
		sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
		sb.append("    purchaseMarketplaceId: ").append(toIndentedString(purchaseMarketplaceId)).append("\n");
		sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
		sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
		sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
		sb.append("    soldFormat: ").append(toIndentedString(soldFormat)).append("\n");
		sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o)
	{
		if (o == null)
		{
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
