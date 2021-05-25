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
 * This type contains a breakdown of all costs associated with the fulfillment of a line item.
 */
@ApiModel(description = "This type contains a breakdown of all costs associated with the fulfillment of a line item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class DeliveryCost {
  public static final String SERIALIZED_NAME_IMPORT_CHARGES = "importCharges";
  @SerializedName(SERIALIZED_NAME_IMPORT_CHARGES)
  private Amount importCharges;

  public static final String SERIALIZED_NAME_SHIPPING_COST = "shippingCost";
  @SerializedName(SERIALIZED_NAME_SHIPPING_COST)
  private Amount shippingCost;

  public static final String SERIALIZED_NAME_SHIPPING_INTERMEDIATION_FEE = "shippingIntermediationFee";
  @SerializedName(SERIALIZED_NAME_SHIPPING_INTERMEDIATION_FEE)
  private Amount shippingIntermediationFee;


  public DeliveryCost importCharges(Amount importCharges) {
    
    this.importCharges = importCharges;
    return this;
  }

   /**
   * Get importCharges
   * @return importCharges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getImportCharges() {
    return importCharges;
  }


  public void setImportCharges(Amount importCharges) {
    this.importCharges = importCharges;
  }


  public DeliveryCost shippingCost(Amount shippingCost) {
    
    this.shippingCost = shippingCost;
    return this;
  }

   /**
   * Get shippingCost
   * @return shippingCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getShippingCost() {
    return shippingCost;
  }


  public void setShippingCost(Amount shippingCost) {
    this.shippingCost = shippingCost;
  }


  public DeliveryCost shippingIntermediationFee(Amount shippingIntermediationFee) {
    
    this.shippingIntermediationFee = shippingIntermediationFee;
    return this;
  }

   /**
   * Get shippingIntermediationFee
   * @return shippingIntermediationFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getShippingIntermediationFee() {
    return shippingIntermediationFee;
  }


  public void setShippingIntermediationFee(Amount shippingIntermediationFee) {
    this.shippingIntermediationFee = shippingIntermediationFee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryCost deliveryCost = (DeliveryCost) o;
    return Objects.equals(this.importCharges, deliveryCost.importCharges) &&
        Objects.equals(this.shippingCost, deliveryCost.shippingCost) &&
        Objects.equals(this.shippingIntermediationFee, deliveryCost.shippingIntermediationFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importCharges, shippingCost, shippingIntermediationFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryCost {\n");
    sb.append("    importCharges: ").append(toIndentedString(importCharges)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shippingIntermediationFee: ").append(toIndentedString(shippingIntermediationFee)).append("\n");
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

