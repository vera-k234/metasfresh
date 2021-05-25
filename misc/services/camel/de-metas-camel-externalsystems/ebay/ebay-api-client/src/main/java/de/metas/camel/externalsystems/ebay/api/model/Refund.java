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
 * This is the base type of the issueRefund response payload. As long as the issueRefund method does not trigger an error, a response payload will be returned.
 */
@ApiModel(description = "This is the base type of the issueRefund response payload. As long as the issueRefund method does not trigger an error, a response payload will be returned.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class Refund {
  public static final String SERIALIZED_NAME_REFUND_ID = "refundId";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refundStatus";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private String refundStatus;


  public Refund refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * The unique identifier of the order refund. This value is returned unless the refund operation fails (refundStatus value shows FAILED). This identifier can be used to track the status of the refund through a getOrder or getOrders call. For order-level refunds, check the paymentSummary.refunds.refundId field in the getOrder/getOrders response, and for line item level refunds, check the lineItems.refunds.refundId field(s) in the getOrder/getOrders response.
   * @return refundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the order refund. This value is returned unless the refund operation fails (refundStatus value shows FAILED). This identifier can be used to track the status of the refund through a getOrder or getOrders call. For order-level refunds, check the paymentSummary.refunds.refundId field in the getOrder/getOrders response, and for line item level refunds, check the lineItems.refunds.refundId field(s) in the getOrder/getOrders response.")

  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public Refund refundStatus(String refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * The value returned in this field indicates the success or failure of the refund operation. A successful issueRefund operation should result in a value of PENDING. A failed issueRefund operation should result in a value of FAILED, and an HTTP status code and/or and API error code may also get returned to possibly indicate the issue. The refunds issued through this method are processed asynchronously, so the refund will not show as &#39;Refunded&#39; right away. A seller will have to make a subsequent getOrder call to check the status of the refund. The status of an order refund can be found in the paymentSummary.refunds.refundStatus field of the getOrder response. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value returned in this field indicates the success or failure of the refund operation. A successful issueRefund operation should result in a value of PENDING. A failed issueRefund operation should result in a value of FAILED, and an HTTP status code and/or and API error code may also get returned to possibly indicate the issue. The refunds issued through this method are processed asynchronously, so the refund will not show as 'Refunded' right away. A seller will have to make a subsequent getOrder call to check the status of the refund. The status of an order refund can be found in the paymentSummary.refunds.refundStatus field of the getOrder response. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:RefundStatusEnum'>eBay API documentation</a>")

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
    Refund refund = (Refund) o;
    return Objects.equals(this.refundId, refund.refundId) &&
        Objects.equals(this.refundStatus, refund.refundStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundId, refundStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
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

