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
 * This type contains information about a refund issued for an order. This does not include line item level refunds.
 */
@ApiModel(description = "This type contains information about a refund issued for an order. This does not include line item level refunds.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class OrderRefund {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_REFUND_DATE = "refundDate";
  @SerializedName(SERIALIZED_NAME_REFUND_DATE)
  private String refundDate;

  public static final String SERIALIZED_NAME_REFUND_ID = "refundId";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_REFUND_REFERENCE_ID = "refundReferenceId";
  @SerializedName(SERIALIZED_NAME_REFUND_REFERENCE_ID)
  private String refundReferenceId;

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refundStatus";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private String refundStatus;


  public OrderRefund amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public OrderRefund refundDate(String refundDate) {
    
    this.refundDate = refundDate;
    return this;
  }

   /**
   * The date and time that the refund was issued. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z
   * @return refundDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the refund was issued. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the refund has been issued. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")

  public String getRefundDate() {
    return refundDate;
  }


  public void setRefundDate(String refundDate) {
    this.refundDate = refundDate;
  }


  public OrderRefund refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * Unique identifier of a refund that was initiated for an order through the issueRefund method. If the issueRefund method was used to issue one or more refunds at the line item level, these refund identifiers are returned at the line item level instead (lineItems.refunds.refundId field). A refundId value is returned in the response of the issueRefund method, and this same value will be returned in the getOrders and getOrders responses for pending and completed refunds. The issueRefund method can only be used for eBay managed payment orders. For other refunds, see the refundReferenceId field.
   * @return refundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of a refund that was initiated for an order through the issueRefund method. If the issueRefund method was used to issue one or more refunds at the line item level, these refund identifiers are returned at the line item level instead (lineItems.refunds.refundId field). A refundId value is returned in the response of the issueRefund method, and this same value will be returned in the getOrders and getOrders responses for pending and completed refunds. The issueRefund method can only be used for eBay managed payment orders. For other refunds, see the refundReferenceId field.")

  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public OrderRefund refundReferenceId(String refundReferenceId) {
    
    this.refundReferenceId = refundReferenceId;
    return this;
  }

   /**
   * The eBay-generated unique identifier for the refund. This field is not returned until the refund has been issued.
   * @return refundReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The eBay-generated unique identifier for the refund. This field is not returned until the refund has been issued.")

  public String getRefundReferenceId() {
    return refundReferenceId;
  }


  public void setRefundReferenceId(String refundReferenceId) {
    this.refundReferenceId = refundReferenceId;
  }


  public OrderRefund refundStatus(String refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * This enumeration value indicates the current status of the refund to the buyer. This container is always returned for each refund. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This enumeration value indicates the current status of the refund to the buyer. This container is always returned for each refund. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum'>eBay API documentation</a>")

  public String getRefundStatus() {
    return refundStatus;
  }


  public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRefund orderRefund = (OrderRefund) o;
    return Objects.equals(this.amount, orderRefund.amount) &&
        Objects.equals(this.refundDate, orderRefund.refundDate) &&
        Objects.equals(this.refundId, orderRefund.refundId) &&
        Objects.equals(this.refundReferenceId, orderRefund.refundReferenceId) &&
        Objects.equals(this.refundStatus, orderRefund.refundStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, refundDate, refundId, refundReferenceId, refundStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRefund {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    refundDate: ").append(toIndentedString(refundDate)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    refundReferenceId: ").append(toIndentedString(refundReferenceId)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
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

