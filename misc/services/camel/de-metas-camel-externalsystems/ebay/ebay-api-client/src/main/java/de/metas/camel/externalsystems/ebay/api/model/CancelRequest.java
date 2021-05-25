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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This type contains information about a buyer request to cancel an order.
 */
@ApiModel(description = "This type contains information about a buyer request to cancel an order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class CancelRequest {
  public static final String SERIALIZED_NAME_CANCEL_COMPLETED_DATE = "cancelCompletedDate";
  @SerializedName(SERIALIZED_NAME_CANCEL_COMPLETED_DATE)
  private String cancelCompletedDate;

  public static final String SERIALIZED_NAME_CANCEL_INITIATOR = "cancelInitiator";
  @SerializedName(SERIALIZED_NAME_CANCEL_INITIATOR)
  private String cancelInitiator;

  public static final String SERIALIZED_NAME_CANCEL_REASON = "cancelReason";
  @SerializedName(SERIALIZED_NAME_CANCEL_REASON)
  private String cancelReason;

  public static final String SERIALIZED_NAME_CANCEL_REQUESTED_DATE = "cancelRequestedDate";
  @SerializedName(SERIALIZED_NAME_CANCEL_REQUESTED_DATE)
  private String cancelRequestedDate;

  public static final String SERIALIZED_NAME_CANCEL_REQUEST_ID = "cancelRequestId";
  @SerializedName(SERIALIZED_NAME_CANCEL_REQUEST_ID)
  private String cancelRequestId;

  public static final String SERIALIZED_NAME_CANCEL_REQUEST_STATE = "cancelRequestState";
  @SerializedName(SERIALIZED_NAME_CANCEL_REQUEST_STATE)
  private String cancelRequestState;


  public CancelRequest cancelCompletedDate(String cancelCompletedDate) {
    
    this.cancelCompletedDate = cancelCompletedDate;
    return this;
  }

   /**
   * The date and time that the order cancellation was completed, if applicable. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the cancellation request has actually been approved by the seller. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z
   * @return cancelCompletedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the order cancellation was completed, if applicable. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned until the cancellation request has actually been approved by the seller. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")

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
   * This string value indicates the party who made the initial cancellation request. Typically, either the &#39;Buyer&#39; or &#39;Seller&#39;. If a cancellation request has been made, this field should be returned.
   * @return cancelInitiator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This string value indicates the party who made the initial cancellation request. Typically, either the 'Buyer' or 'Seller'. If a cancellation request has been made, this field should be returned.")

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
   * The reason why the cancelInitiator initiated the cancellation request. Cancellation reasons for a buyer might include &#39;order placed by mistake&#39; or &#39;order won&#39;t arrive in time&#39;. For a seller, a typical cancellation reason is &#39;out of stock&#39;. If a cancellation request has been made, this field should be returned.
   * @return cancelReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason why the cancelInitiator initiated the cancellation request. Cancellation reasons for a buyer might include 'order placed by mistake' or 'order won't arrive in time'. For a seller, a typical cancellation reason is 'out of stock'. If a cancellation request has been made, this field should be returned.")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the order cancellation was requested. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is returned for each cancellation request. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the order cancellation request. This field is returned for each cancellation request.")

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
   * The current stage or condition of the cancellation request. This field is returned for each cancellation request. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CancelRequestStateEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return cancelRequestState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current stage or condition of the cancellation request. This field is returned for each cancellation request. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CancelRequestStateEnum'>eBay API documentation</a>")

  public String getCancelRequestState() {
    return cancelRequestState;
  }


  public void setCancelRequestState(String cancelRequestState) {
    this.cancelRequestState = cancelRequestState;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

