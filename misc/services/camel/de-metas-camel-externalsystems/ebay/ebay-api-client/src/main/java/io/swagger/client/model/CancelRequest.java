/*
 * Fulfillment API
 * Use the Fulfillment API to complete the process of packaging, addressing, handling, and shipping each order on behalf of the seller, in accordance with the payment method and timing specified at checkout.
 *
 * OpenAPI spec version: v1.19.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This type contains information about a buyer request to cancel an order.
 */
@Schema(description = "This type contains information about a buyer request to cancel an order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-02T10:53:33.276748+01:00[Europe/Berlin]")
public class CancelRequest {
  @SerializedName("cancelCompletedDate")
  private String cancelCompletedDate = null;

  @SerializedName("cancelInitiator")
  private String cancelInitiator = null;

  @SerializedName("cancelReason")
  private String cancelReason = null;

  @SerializedName("cancelRequestedDate")
  private String cancelRequestedDate = null;

  @SerializedName("cancelRequestId")
  private String cancelRequestId = null;

  @SerializedName("cancelRequestState")
  private String cancelRequestState = null;

  public CancelRequest cancelCompletedDate(String cancelCompletedDate) {
    this.cancelCompletedDate = cancelCompletedDate;
    return this;
  }

   /**
   * The date and time that the order cancellation was completed, if applicable. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the cancellation request has actually been approved by the seller. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z
   * @return cancelCompletedDate
  **/
  @Schema(description = "The date and time that the order cancellation was completed, if applicable. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the cancellation request has actually been approved by the seller. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")
  public String getCancelCompletedDate() {
    return cancelCompletedDate;
  }

  public void setCancelCompletedDate(String cancelCompletedDate) {
    this.cancelCompletedDate = cancelCompletedDate;
  }

  public CancelRequest cancelInitiator(String cancelInitiator) {
    this.cancelInitiator = cancelInitiator;
    return this;
  }

   /**
   * This string value indicates the party who made the initial cancellation request. Typically, either the &#x27;Buyer&#x27; or &#x27;Seller&#x27;. If a cancellation request has been made, this field should be returned.
   * @return cancelInitiator
  **/
  @Schema(description = "This string value indicates the party who made the initial cancellation request. Typically, either the 'Buyer' or 'Seller'. If a cancellation request has been made, this field should be returned.")
  public String getCancelInitiator() {
    return cancelInitiator;
  }

  public void setCancelInitiator(String cancelInitiator) {
    this.cancelInitiator = cancelInitiator;
  }

  public CancelRequest cancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    return this;
  }

   /**
   * The reason why the cancelInitiator initiated the cancellation request. Cancellation reasons for a buyer might include &#x27;order placed by mistake&#x27; or &#x27;order won&#x27;t arrive in time&#x27;. For a seller, a typical cancellation reason is &#x27;out of stock&#x27;. If a cancellation request has been made, this field should be returned.
   * @return cancelReason
  **/
  @Schema(description = "The reason why the cancelInitiator initiated the cancellation request. Cancellation reasons for a buyer might include 'order placed by mistake' or 'order won't arrive in time'. For a seller, a typical cancellation reason is 'out of stock'. If a cancellation request has been made, this field should be returned.")
  public String getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }

  public CancelRequest cancelRequestedDate(String cancelRequestedDate) {
    this.cancelRequestedDate = cancelRequestedDate;
    return this;
  }

   /**
   * The date and time that the order cancellation was requested. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is returned for each cancellation request. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z
   * @return cancelRequestedDate
  **/
  @Schema(description = "The date and time that the order cancellation was requested. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is returned for each cancellation request. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")
  public String getCancelRequestedDate() {
    return cancelRequestedDate;
  }

  public void setCancelRequestedDate(String cancelRequestedDate) {
    this.cancelRequestedDate = cancelRequestedDate;
  }

  public CancelRequest cancelRequestId(String cancelRequestId) {
    this.cancelRequestId = cancelRequestId;
    return this;
  }

   /**
   * The unique identifier of the order cancellation request. This field is returned for each cancellation request.
   * @return cancelRequestId
  **/
  @Schema(description = "The unique identifier of the order cancellation request. This field is returned for each cancellation request.")
  public String getCancelRequestId() {
    return cancelRequestId;
  }

  public void setCancelRequestId(String cancelRequestId) {
    this.cancelRequestId = cancelRequestId;
  }

  public CancelRequest cancelRequestState(String cancelRequestState) {
    this.cancelRequestState = cancelRequestState;
    return this;
  }

   /**
   * The current stage or condition of the cancellation request. This field is returned for each cancellation request. For implementation help, refer to &lt;a href&#x3D;&#x27;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CancelRequestStateEnum&#x27;&gt;eBay API documentation&lt;/a&gt;
   * @return cancelRequestState
  **/
  @Schema(description = "The current stage or condition of the cancellation request. This field is returned for each cancellation request. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CancelRequestStateEnum'>eBay API documentation</a>")
  public String getCancelRequestState() {
    return cancelRequestState;
  }

  public void setCancelRequestState(String cancelRequestState) {
    this.cancelRequestState = cancelRequestState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelRequest cancelRequest = (CancelRequest) o;
    return Objects.equals(this.cancelCompletedDate, cancelRequest.cancelCompletedDate) &&
        Objects.equals(this.cancelInitiator, cancelRequest.cancelInitiator) &&
        Objects.equals(this.cancelReason, cancelRequest.cancelReason) &&
        Objects.equals(this.cancelRequestedDate, cancelRequest.cancelRequestedDate) &&
        Objects.equals(this.cancelRequestId, cancelRequest.cancelRequestId) &&
        Objects.equals(this.cancelRequestState, cancelRequest.cancelRequestState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelCompletedDate, cancelInitiator, cancelReason, cancelRequestedDate, cancelRequestId, cancelRequestState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelRequest {\n");
    
    sb.append("    cancelCompletedDate: ").append(toIndentedString(cancelCompletedDate)).append("\n");
    sb.append("    cancelInitiator: ").append(toIndentedString(cancelInitiator)).append("\n");
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
    sb.append("    cancelRequestedDate: ").append(toIndentedString(cancelRequestedDate)).append("\n");
    sb.append("    cancelRequestId: ").append(toIndentedString(cancelRequestId)).append("\n");
    sb.append("    cancelRequestState: ").append(toIndentedString(cancelRequestState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
