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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This type is used by the taxIdentifier container that is returned in getOrder. The taxIdentifier container consists of taxpayer identification information for buyers from Italy, Spain, or Guatemala. It is currently only returned for orders occurring on the eBay Italy or eBay Spain marketplaces. Note: Currently, the taxIdentifier container is only returned in getOrder and not in getOrders. So, if a seller wanted to view a buyer&#39;s tax information for a particular order returned in getOrders, that seller would need to use the orderId value for that particular order, and then run a getOrder call against that order ID.
 */
@ApiModel(description = "This type is used by the taxIdentifier container that is returned in getOrder. The taxIdentifier container consists of taxpayer identification information for buyers from Italy, Spain, or Guatemala. It is currently only returned for orders occurring on the eBay Italy or eBay Spain marketplaces. Note: Currently, the taxIdentifier container is only returned in getOrder and not in getOrders. So, if a seller wanted to view a buyer's tax information for a particular order returned in getOrders, that seller would need to use the orderId value for that particular order, and then run a getOrder call against that order ID.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class TaxIdentifier {
  public static final String SERIALIZED_NAME_TAXPAYER_ID = "taxpayerId";
  @SerializedName(SERIALIZED_NAME_TAXPAYER_ID)
  private String taxpayerId;

  public static final String SERIALIZED_NAME_TAX_IDENTIFIER_TYPE = "taxIdentifierType";
  @SerializedName(SERIALIZED_NAME_TAX_IDENTIFIER_TYPE)
  private String taxIdentifierType;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuingCountry";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private String issuingCountry;


  public TaxIdentifier taxpayerId(String taxpayerId) {
    
    this.taxpayerId = taxpayerId;
    return this;
  }

   /**
   * This value is the unique tax ID associated with the buyer. The type of tax identification is shown in the taxIdentifierType field.
   * @return taxpayerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This value is the unique tax ID associated with the buyer. The type of tax identification is shown in the taxIdentifierType field.")

  public String getTaxpayerId() {
    return taxpayerId;
  }


  public void setTaxpayerId(String taxpayerId) {
    this.taxpayerId = taxpayerId;
  }


  public TaxIdentifier taxIdentifierType(String taxIdentifierType) {
    
    this.taxIdentifierType = taxIdentifierType;
    return this;
  }

   /**
   * This enumeration value indicates the type of tax identification being used for the buyer. The different tax types are defined in the TaxIdentifierTypeEnum type. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:TaxIdentifierTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return taxIdentifierType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This enumeration value indicates the type of tax identification being used for the buyer. The different tax types are defined in the TaxIdentifierTypeEnum type. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:TaxIdentifierTypeEnum'>eBay API documentation</a>")

  public String getTaxIdentifierType() {
    return taxIdentifierType;
  }


  public void setTaxIdentifierType(String taxIdentifierType) {
    this.taxIdentifierType = taxIdentifierType;
  }


  public TaxIdentifier issuingCountry(String issuingCountry) {
    
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * This two-letter code indicates the country that issued the buyer&#39;s tax ID. The country that the two-letter code represents can be found in the CountryCodeEnum type, or in the ISO 3166 standard. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CountryCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return issuingCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This two-letter code indicates the country that issued the buyer's tax ID. The country that the two-letter code represents can be found in the CountryCodeEnum type, or in the ISO 3166 standard. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CountryCodeEnum'>eBay API documentation</a>")

  public String getIssuingCountry() {
    return issuingCountry;
  }


  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxIdentifier taxIdentifier = (TaxIdentifier) o;
    return Objects.equals(this.taxpayerId, taxIdentifier.taxpayerId) &&
        Objects.equals(this.taxIdentifierType, taxIdentifier.taxIdentifierType) &&
        Objects.equals(this.issuingCountry, taxIdentifier.issuingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxpayerId, taxIdentifierType, issuingCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxIdentifier {\n");
    sb.append("    taxpayerId: ").append(toIndentedString(taxpayerId)).append("\n");
    sb.append("    taxIdentifierType: ").append(toIndentedString(taxIdentifierType)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
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

