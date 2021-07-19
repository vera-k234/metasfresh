/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.metas.camel.externalsystems.amazon.api.model.orders;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.metas.camel.externalsystems.amazon.api.model.orders.Money;
import de.metas.camel.externalsystems.amazon.api.model.orders.PointsGrantedDetail;
import de.metas.camel.externalsystems.amazon.api.model.orders.ProductInfoDetail;
import de.metas.camel.externalsystems.amazon.api.model.orders.TaxCollection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A single order item.
 */
@ApiModel(description = "A single order item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-19T18:02:29.893848+02:00[Europe/Berlin]")
public class OrderItem {
  public static final String SERIALIZED_NAME_A_S_I_N = "ASIN";
  @SerializedName(SERIALIZED_NAME_A_S_I_N)
  private String ASIN;

  public static final String SERIALIZED_NAME_SELLER_S_K_U = "SellerSKU";
  @SerializedName(SERIALIZED_NAME_SELLER_S_K_U)
  private String sellerSKU;

  public static final String SERIALIZED_NAME_ORDER_ITEM_ID = "OrderItemId";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_ID)
  private String orderItemId;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "QuantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_QUANTITY_SHIPPED = "QuantityShipped";
  @SerializedName(SERIALIZED_NAME_QUANTITY_SHIPPED)
  private Integer quantityShipped;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "ProductInfo";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private ProductInfoDetail productInfo;

  public static final String SERIALIZED_NAME_POINTS_GRANTED = "PointsGranted";
  @SerializedName(SERIALIZED_NAME_POINTS_GRANTED)
  private PointsGrantedDetail pointsGranted;

  public static final String SERIALIZED_NAME_ITEM_PRICE = "ItemPrice";
  @SerializedName(SERIALIZED_NAME_ITEM_PRICE)
  private Money itemPrice;

  public static final String SERIALIZED_NAME_SHIPPING_PRICE = "ShippingPrice";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PRICE)
  private Money shippingPrice;

  public static final String SERIALIZED_NAME_ITEM_TAX = "ItemTax";
  @SerializedName(SERIALIZED_NAME_ITEM_TAX)
  private Money itemTax;

  public static final String SERIALIZED_NAME_SHIPPING_TAX = "ShippingTax";
  @SerializedName(SERIALIZED_NAME_SHIPPING_TAX)
  private Money shippingTax;

  public static final String SERIALIZED_NAME_SHIPPING_DISCOUNT = "ShippingDiscount";
  @SerializedName(SERIALIZED_NAME_SHIPPING_DISCOUNT)
  private Money shippingDiscount;

  public static final String SERIALIZED_NAME_SHIPPING_DISCOUNT_TAX = "ShippingDiscountTax";
  @SerializedName(SERIALIZED_NAME_SHIPPING_DISCOUNT_TAX)
  private Money shippingDiscountTax;

  public static final String SERIALIZED_NAME_PROMOTION_DISCOUNT = "PromotionDiscount";
  @SerializedName(SERIALIZED_NAME_PROMOTION_DISCOUNT)
  private Money promotionDiscount;

  public static final String SERIALIZED_NAME_PROMOTION_DISCOUNT_TAX = "PromotionDiscountTax";
  @SerializedName(SERIALIZED_NAME_PROMOTION_DISCOUNT_TAX)
  private Money promotionDiscountTax;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "PromotionIds";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<String> promotionIds = null;

  public static final String SERIALIZED_NAME_CO_D_FEE = "CODFee";
  @SerializedName(SERIALIZED_NAME_CO_D_FEE)
  private Money coDFee;

  public static final String SERIALIZED_NAME_CO_D_FEE_DISCOUNT = "CODFeeDiscount";
  @SerializedName(SERIALIZED_NAME_CO_D_FEE_DISCOUNT)
  private Money coDFeeDiscount;

  public static final String SERIALIZED_NAME_IS_GIFT = "IsGift";
  @SerializedName(SERIALIZED_NAME_IS_GIFT)
  private Boolean isGift;

  public static final String SERIALIZED_NAME_CONDITION_NOTE = "ConditionNote";
  @SerializedName(SERIALIZED_NAME_CONDITION_NOTE)
  private String conditionNote;

  public static final String SERIALIZED_NAME_CONDITION_ID = "ConditionId";
  @SerializedName(SERIALIZED_NAME_CONDITION_ID)
  private String conditionId;

  public static final String SERIALIZED_NAME_CONDITION_SUBTYPE_ID = "ConditionSubtypeId";
  @SerializedName(SERIALIZED_NAME_CONDITION_SUBTYPE_ID)
  private String conditionSubtypeId;

  public static final String SERIALIZED_NAME_SCHEDULED_DELIVERY_START_DATE = "ScheduledDeliveryStartDate";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_DELIVERY_START_DATE)
  private String scheduledDeliveryStartDate;

  public static final String SERIALIZED_NAME_SCHEDULED_DELIVERY_END_DATE = "ScheduledDeliveryEndDate";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_DELIVERY_END_DATE)
  private String scheduledDeliveryEndDate;

  public static final String SERIALIZED_NAME_PRICE_DESIGNATION = "PriceDesignation";
  @SerializedName(SERIALIZED_NAME_PRICE_DESIGNATION)
  private String priceDesignation;

  public static final String SERIALIZED_NAME_TAX_COLLECTION = "TaxCollection";
  @SerializedName(SERIALIZED_NAME_TAX_COLLECTION)
  private TaxCollection taxCollection;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER_REQUIRED = "SerialNumberRequired";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER_REQUIRED)
  private Boolean serialNumberRequired;

  public static final String SERIALIZED_NAME_IS_TRANSPARENCY = "IsTransparency";
  @SerializedName(SERIALIZED_NAME_IS_TRANSPARENCY)
  private Boolean isTransparency;

  public static final String SERIALIZED_NAME_IOSS_NUMBER = "IossNumber";
  @SerializedName(SERIALIZED_NAME_IOSS_NUMBER)
  private String iossNumber;

  public static final String SERIALIZED_NAME_STORE_CHAIN_STORE_ID = "StoreChainStoreId";
  @SerializedName(SERIALIZED_NAME_STORE_CHAIN_STORE_ID)
  private String storeChainStoreId;

  /**
   * The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to help them meet the VAT Deemed Reseller tax laws in the EU and UK.
   */
  @JsonAdapter(DeemedResellerCategoryEnum.Adapter.class)
  public enum DeemedResellerCategoryEnum {
    IOSS("IOSS"),
    
    UOSS("UOSS");

    private String value;

    DeemedResellerCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeemedResellerCategoryEnum fromValue(String value) {
      for (DeemedResellerCategoryEnum b : DeemedResellerCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeemedResellerCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeemedResellerCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeemedResellerCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeemedResellerCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEEMED_RESELLER_CATEGORY = "DeemedResellerCategory";
  @SerializedName(SERIALIZED_NAME_DEEMED_RESELLER_CATEGORY)
  private DeemedResellerCategoryEnum deemedResellerCategory;


  public OrderItem ASIN(String ASIN) {
    
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(required = true, value = "The Amazon Standard Identification Number (ASIN) of the item.")

  public String getASIN() {
    return ASIN;
  }


  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }


  public OrderItem sellerSKU(String sellerSKU) {
    
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item.
   * @return sellerSKU
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The seller stock keeping unit (SKU) of the item.")

  public String getSellerSKU() {
    return sellerSKU;
  }


  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }


  public OrderItem orderItemId(String orderItemId) {
    
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * An Amazon-defined order item identifier.
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined order item identifier.")

  public String getOrderItemId() {
    return orderItemId;
  }


  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }


  public OrderItem title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The name of the item.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the item.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public OrderItem quantityOrdered(Integer quantityOrdered) {
    
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The number of items in the order. 
   * @return quantityOrdered
  **/
  @ApiModelProperty(required = true, value = "The number of items in the order. ")

  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }


  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public OrderItem quantityShipped(Integer quantityShipped) {
    
    this.quantityShipped = quantityShipped;
    return this;
  }

   /**
   * The number of items shipped.
   * @return quantityShipped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items shipped.")

  public Integer getQuantityShipped() {
    return quantityShipped;
  }


  public void setQuantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
  }


  public OrderItem productInfo(ProductInfoDetail productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductInfoDetail getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(ProductInfoDetail productInfo) {
    this.productInfo = productInfo;
  }


  public OrderItem pointsGranted(PointsGrantedDetail pointsGranted) {
    
    this.pointsGranted = pointsGranted;
    return this;
  }

   /**
   * Get pointsGranted
   * @return pointsGranted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PointsGrantedDetail getPointsGranted() {
    return pointsGranted;
  }


  public void setPointsGranted(PointsGrantedDetail pointsGranted) {
    this.pointsGranted = pointsGranted;
  }


  public OrderItem itemPrice(Money itemPrice) {
    
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * Get itemPrice
   * @return itemPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getItemPrice() {
    return itemPrice;
  }


  public void setItemPrice(Money itemPrice) {
    this.itemPrice = itemPrice;
  }


  public OrderItem shippingPrice(Money shippingPrice) {
    
    this.shippingPrice = shippingPrice;
    return this;
  }

   /**
   * Get shippingPrice
   * @return shippingPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getShippingPrice() {
    return shippingPrice;
  }


  public void setShippingPrice(Money shippingPrice) {
    this.shippingPrice = shippingPrice;
  }


  public OrderItem itemTax(Money itemTax) {
    
    this.itemTax = itemTax;
    return this;
  }

   /**
   * Get itemTax
   * @return itemTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getItemTax() {
    return itemTax;
  }


  public void setItemTax(Money itemTax) {
    this.itemTax = itemTax;
  }


  public OrderItem shippingTax(Money shippingTax) {
    
    this.shippingTax = shippingTax;
    return this;
  }

   /**
   * Get shippingTax
   * @return shippingTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getShippingTax() {
    return shippingTax;
  }


  public void setShippingTax(Money shippingTax) {
    this.shippingTax = shippingTax;
  }


  public OrderItem shippingDiscount(Money shippingDiscount) {
    
    this.shippingDiscount = shippingDiscount;
    return this;
  }

   /**
   * Get shippingDiscount
   * @return shippingDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getShippingDiscount() {
    return shippingDiscount;
  }


  public void setShippingDiscount(Money shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
  }


  public OrderItem shippingDiscountTax(Money shippingDiscountTax) {
    
    this.shippingDiscountTax = shippingDiscountTax;
    return this;
  }

   /**
   * Get shippingDiscountTax
   * @return shippingDiscountTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getShippingDiscountTax() {
    return shippingDiscountTax;
  }


  public void setShippingDiscountTax(Money shippingDiscountTax) {
    this.shippingDiscountTax = shippingDiscountTax;
  }


  public OrderItem promotionDiscount(Money promotionDiscount) {
    
    this.promotionDiscount = promotionDiscount;
    return this;
  }

   /**
   * Get promotionDiscount
   * @return promotionDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getPromotionDiscount() {
    return promotionDiscount;
  }


  public void setPromotionDiscount(Money promotionDiscount) {
    this.promotionDiscount = promotionDiscount;
  }


  public OrderItem promotionDiscountTax(Money promotionDiscountTax) {
    
    this.promotionDiscountTax = promotionDiscountTax;
    return this;
  }

   /**
   * Get promotionDiscountTax
   * @return promotionDiscountTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getPromotionDiscountTax() {
    return promotionDiscountTax;
  }


  public void setPromotionDiscountTax(Money promotionDiscountTax) {
    this.promotionDiscountTax = promotionDiscountTax;
  }


  public OrderItem promotionIds(List<String> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public OrderItem addPromotionIdsItem(String promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * A list of promotion identifiers provided by the seller when the promotions were created.
   * @return promotionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of promotion identifiers provided by the seller when the promotions were created.")

  public List<String> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<String> promotionIds) {
    this.promotionIds = promotionIds;
  }


  public OrderItem coDFee(Money coDFee) {
    
    this.coDFee = coDFee;
    return this;
  }

   /**
   * Get coDFee
   * @return coDFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getCoDFee() {
    return coDFee;
  }


  public void setCoDFee(Money coDFee) {
    this.coDFee = coDFee;
  }


  public OrderItem coDFeeDiscount(Money coDFeeDiscount) {
    
    this.coDFeeDiscount = coDFeeDiscount;
    return this;
  }

   /**
   * Get coDFeeDiscount
   * @return coDFeeDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getCoDFeeDiscount() {
    return coDFeeDiscount;
  }


  public void setCoDFeeDiscount(Money coDFeeDiscount) {
    this.coDFeeDiscount = coDFeeDiscount;
  }


  public OrderItem isGift(Boolean isGift) {
    
    this.isGift = isGift;
    return this;
  }

   /**
   * When true, the item is a gift.
   * @return isGift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, the item is a gift.")

  public Boolean getIsGift() {
    return isGift;
  }


  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }


  public OrderItem conditionNote(String conditionNote) {
    
    this.conditionNote = conditionNote;
    return this;
  }

   /**
   * The condition of the item as described by the seller.
   * @return conditionNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The condition of the item as described by the seller.")

  public String getConditionNote() {
    return conditionNote;
  }


  public void setConditionNote(String conditionNote) {
    this.conditionNote = conditionNote;
  }


  public OrderItem conditionId(String conditionId) {
    
    this.conditionId = conditionId;
    return this;
  }

   /**
   * The condition of the item.  Possible values: New, Used, Collectible, Refurbished, Preorder, Club.
   * @return conditionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The condition of the item.  Possible values: New, Used, Collectible, Refurbished, Preorder, Club.")

  public String getConditionId() {
    return conditionId;
  }


  public void setConditionId(String conditionId) {
    this.conditionId = conditionId;
  }


  public OrderItem conditionSubtypeId(String conditionSubtypeId) {
    
    this.conditionSubtypeId = conditionSubtypeId;
    return this;
  }

   /**
   * The subcondition of the item.  Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, Any, Other.
   * @return conditionSubtypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subcondition of the item.  Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, Any, Other.")

  public String getConditionSubtypeId() {
    return conditionSubtypeId;
  }


  public void setConditionSubtypeId(String conditionSubtypeId) {
    this.conditionSubtypeId = conditionSubtypeId;
  }


  public OrderItem scheduledDeliveryStartDate(String scheduledDeliveryStartDate) {
    
    this.scheduledDeliveryStartDate = scheduledDeliveryStartDate;
    return this;
  }

   /**
   * The start date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.
   * @return scheduledDeliveryStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.")

  public String getScheduledDeliveryStartDate() {
    return scheduledDeliveryStartDate;
  }


  public void setScheduledDeliveryStartDate(String scheduledDeliveryStartDate) {
    this.scheduledDeliveryStartDate = scheduledDeliveryStartDate;
  }


  public OrderItem scheduledDeliveryEndDate(String scheduledDeliveryEndDate) {
    
    this.scheduledDeliveryEndDate = scheduledDeliveryEndDate;
    return this;
  }

   /**
   * The end date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.
   * @return scheduledDeliveryEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.")

  public String getScheduledDeliveryEndDate() {
    return scheduledDeliveryEndDate;
  }


  public void setScheduledDeliveryEndDate(String scheduledDeliveryEndDate) {
    this.scheduledDeliveryEndDate = scheduledDeliveryEndDate;
  }


  public OrderItem priceDesignation(String priceDesignation) {
    
    this.priceDesignation = priceDesignation;
    return this;
  }

   /**
   * Indicates that the selling price is a special price that is available only for Amazon Business orders. For more information about the Amazon Business Seller Program, see the [Amazon Business website](https://www.amazon.com/b2b/info/amazon-business).   Possible values: BusinessPrice - A special price that is available only for Amazon Business orders.
   * @return priceDesignation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the selling price is a special price that is available only for Amazon Business orders. For more information about the Amazon Business Seller Program, see the [Amazon Business website](https://www.amazon.com/b2b/info/amazon-business).   Possible values: BusinessPrice - A special price that is available only for Amazon Business orders.")

  public String getPriceDesignation() {
    return priceDesignation;
  }


  public void setPriceDesignation(String priceDesignation) {
    this.priceDesignation = priceDesignation;
  }


  public OrderItem taxCollection(TaxCollection taxCollection) {
    
    this.taxCollection = taxCollection;
    return this;
  }

   /**
   * Get taxCollection
   * @return taxCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxCollection getTaxCollection() {
    return taxCollection;
  }


  public void setTaxCollection(TaxCollection taxCollection) {
    this.taxCollection = taxCollection;
  }


  public OrderItem serialNumberRequired(Boolean serialNumberRequired) {
    
    this.serialNumberRequired = serialNumberRequired;
    return this;
  }

   /**
   * When true, the product type for this item has a serial number.  Returned only for Amazon Easy Ship orders.
   * @return serialNumberRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, the product type for this item has a serial number.  Returned only for Amazon Easy Ship orders.")

  public Boolean getSerialNumberRequired() {
    return serialNumberRequired;
  }


  public void setSerialNumberRequired(Boolean serialNumberRequired) {
    this.serialNumberRequired = serialNumberRequired;
  }


  public OrderItem isTransparency(Boolean isTransparency) {
    
    this.isTransparency = isTransparency;
    return this;
  }

   /**
   * When true, transparency codes are required.
   * @return isTransparency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, transparency codes are required.")

  public Boolean getIsTransparency() {
    return isTransparency;
  }


  public void setIsTransparency(Boolean isTransparency) {
    this.isTransparency = isTransparency;
  }


  public OrderItem iossNumber(String iossNumber) {
    
    this.iossNumber = iossNumber;
    return this;
  }

   /**
   * The IOSS number for the marketplace. Sellers shipping to the European Union (EU) from outside of the EU must provide this IOSS number to their carrier when Amazon has collected the VAT on the sale.
   * @return iossNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IOSS number for the marketplace. Sellers shipping to the European Union (EU) from outside of the EU must provide this IOSS number to their carrier when Amazon has collected the VAT on the sale.")

  public String getIossNumber() {
    return iossNumber;
  }


  public void setIossNumber(String iossNumber) {
    this.iossNumber = iossNumber;
  }


  public OrderItem storeChainStoreId(String storeChainStoreId) {
    
    this.storeChainStoreId = storeChainStoreId;
    return this;
  }

   /**
   * The store chain store identifier. Linked to a specific store in a store chain.
   * @return storeChainStoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The store chain store identifier. Linked to a specific store in a store chain.")

  public String getStoreChainStoreId() {
    return storeChainStoreId;
  }


  public void setStoreChainStoreId(String storeChainStoreId) {
    this.storeChainStoreId = storeChainStoreId;
  }


  public OrderItem deemedResellerCategory(DeemedResellerCategoryEnum deemedResellerCategory) {
    
    this.deemedResellerCategory = deemedResellerCategory;
    return this;
  }

   /**
   * The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to help them meet the VAT Deemed Reseller tax laws in the EU and UK.
   * @return deemedResellerCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to help them meet the VAT Deemed Reseller tax laws in the EU and UK.")

  public DeemedResellerCategoryEnum getDeemedResellerCategory() {
    return deemedResellerCategory;
  }


  public void setDeemedResellerCategory(DeemedResellerCategoryEnum deemedResellerCategory) {
    this.deemedResellerCategory = deemedResellerCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.ASIN, orderItem.ASIN) &&
        Objects.equals(this.sellerSKU, orderItem.sellerSKU) &&
        Objects.equals(this.orderItemId, orderItem.orderItemId) &&
        Objects.equals(this.title, orderItem.title) &&
        Objects.equals(this.quantityOrdered, orderItem.quantityOrdered) &&
        Objects.equals(this.quantityShipped, orderItem.quantityShipped) &&
        Objects.equals(this.productInfo, orderItem.productInfo) &&
        Objects.equals(this.pointsGranted, orderItem.pointsGranted) &&
        Objects.equals(this.itemPrice, orderItem.itemPrice) &&
        Objects.equals(this.shippingPrice, orderItem.shippingPrice) &&
        Objects.equals(this.itemTax, orderItem.itemTax) &&
        Objects.equals(this.shippingTax, orderItem.shippingTax) &&
        Objects.equals(this.shippingDiscount, orderItem.shippingDiscount) &&
        Objects.equals(this.shippingDiscountTax, orderItem.shippingDiscountTax) &&
        Objects.equals(this.promotionDiscount, orderItem.promotionDiscount) &&
        Objects.equals(this.promotionDiscountTax, orderItem.promotionDiscountTax) &&
        Objects.equals(this.promotionIds, orderItem.promotionIds) &&
        Objects.equals(this.coDFee, orderItem.coDFee) &&
        Objects.equals(this.coDFeeDiscount, orderItem.coDFeeDiscount) &&
        Objects.equals(this.isGift, orderItem.isGift) &&
        Objects.equals(this.conditionNote, orderItem.conditionNote) &&
        Objects.equals(this.conditionId, orderItem.conditionId) &&
        Objects.equals(this.conditionSubtypeId, orderItem.conditionSubtypeId) &&
        Objects.equals(this.scheduledDeliveryStartDate, orderItem.scheduledDeliveryStartDate) &&
        Objects.equals(this.scheduledDeliveryEndDate, orderItem.scheduledDeliveryEndDate) &&
        Objects.equals(this.priceDesignation, orderItem.priceDesignation) &&
        Objects.equals(this.taxCollection, orderItem.taxCollection) &&
        Objects.equals(this.serialNumberRequired, orderItem.serialNumberRequired) &&
        Objects.equals(this.isTransparency, orderItem.isTransparency) &&
        Objects.equals(this.iossNumber, orderItem.iossNumber) &&
        Objects.equals(this.storeChainStoreId, orderItem.storeChainStoreId) &&
        Objects.equals(this.deemedResellerCategory, orderItem.deemedResellerCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASIN, sellerSKU, orderItemId, title, quantityOrdered, quantityShipped, productInfo, pointsGranted, itemPrice, shippingPrice, itemTax, shippingTax, shippingDiscount, shippingDiscountTax, promotionDiscount, promotionDiscountTax, promotionIds, coDFee, coDFeeDiscount, isGift, conditionNote, conditionId, conditionSubtypeId, scheduledDeliveryStartDate, scheduledDeliveryEndDate, priceDesignation, taxCollection, serialNumberRequired, isTransparency, iossNumber, storeChainStoreId, deemedResellerCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityShipped: ").append(toIndentedString(quantityShipped)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    pointsGranted: ").append(toIndentedString(pointsGranted)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
    sb.append("    itemTax: ").append(toIndentedString(itemTax)).append("\n");
    sb.append("    shippingTax: ").append(toIndentedString(shippingTax)).append("\n");
    sb.append("    shippingDiscount: ").append(toIndentedString(shippingDiscount)).append("\n");
    sb.append("    shippingDiscountTax: ").append(toIndentedString(shippingDiscountTax)).append("\n");
    sb.append("    promotionDiscount: ").append(toIndentedString(promotionDiscount)).append("\n");
    sb.append("    promotionDiscountTax: ").append(toIndentedString(promotionDiscountTax)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    coDFee: ").append(toIndentedString(coDFee)).append("\n");
    sb.append("    coDFeeDiscount: ").append(toIndentedString(coDFeeDiscount)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
    sb.append("    conditionNote: ").append(toIndentedString(conditionNote)).append("\n");
    sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
    sb.append("    conditionSubtypeId: ").append(toIndentedString(conditionSubtypeId)).append("\n");
    sb.append("    scheduledDeliveryStartDate: ").append(toIndentedString(scheduledDeliveryStartDate)).append("\n");
    sb.append("    scheduledDeliveryEndDate: ").append(toIndentedString(scheduledDeliveryEndDate)).append("\n");
    sb.append("    priceDesignation: ").append(toIndentedString(priceDesignation)).append("\n");
    sb.append("    taxCollection: ").append(toIndentedString(taxCollection)).append("\n");
    sb.append("    serialNumberRequired: ").append(toIndentedString(serialNumberRequired)).append("\n");
    sb.append("    isTransparency: ").append(toIndentedString(isTransparency)).append("\n");
    sb.append("    iossNumber: ").append(toIndentedString(iossNumber)).append("\n");
    sb.append("    storeChainStoreId: ").append(toIndentedString(storeChainStoreId)).append("\n");
    sb.append("    deemedResellerCategory: ").append(toIndentedString(deemedResellerCategory)).append("\n");
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

