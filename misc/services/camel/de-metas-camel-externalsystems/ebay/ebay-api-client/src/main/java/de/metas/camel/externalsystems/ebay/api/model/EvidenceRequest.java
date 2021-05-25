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
import de.metas.camel.externalsystems.ebay.api.model.OrderLineItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type is used by the evidenceRequests array that is returned in the getPaymentDispute response if one or more evidential documents are being requested to help resolve the payment dispute.
 */
@ApiModel(description = "This type is used by the evidenceRequests array that is returned in the getPaymentDispute response if one or more evidential documents are being requested to help resolve the payment dispute.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class EvidenceRequest {
  public static final String SERIALIZED_NAME_EVIDENCE_ID = "evidenceId";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_ID)
  private String evidenceId;

  public static final String SERIALIZED_NAME_EVIDENCE_TYPE = "evidenceType";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_TYPE)
  private String evidenceType;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<OrderLineItems> lineItems = null;

  public static final String SERIALIZED_NAME_REQUEST_DATE = "requestDate";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATE)
  private String requestDate;

  public static final String SERIALIZED_NAME_RESPOND_BY_DATE = "respondByDate";
  @SerializedName(SERIALIZED_NAME_RESPOND_BY_DATE)
  private String respondByDate;


  public EvidenceRequest evidenceId(String evidenceId) {
    
    this.evidenceId = evidenceId;
    return this;
  }

   /**
   * Unique identifier of the evidential file set. Potentially, each evidential file set can have more than one file, that is why there is this file set identifier, and then an identifier for each file within this file set.
   * @return evidenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the evidential file set. Potentially, each evidential file set can have more than one file, that is why there is this file set identifier, and then an identifier for each file within this file set.")

  public String getEvidenceId() {
    return evidenceId;
  }


  public void setEvidenceId(String evidenceId) {
    this.evidenceId = evidenceId;
  }


  public EvidenceRequest evidenceType(String evidenceType) {
    
    this.evidenceType = evidenceType;
    return this;
  }

   /**
   * This enumeration value shows the type of evidential document provided. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return evidenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This enumeration value shows the type of evidential document provided. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum'>eBay API documentation</a>")

  public String getEvidenceType() {
    return evidenceType;
  }


  public void setEvidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
  }


  public EvidenceRequest lineItems(List<OrderLineItems> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public EvidenceRequest addLineItemsItem(OrderLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<OrderLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This array shows one or more order line items associated with the evidential document that has been provided.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This array shows one or more order line items associated with the evidential document that has been provided.")

  public List<OrderLineItems> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<OrderLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  public EvidenceRequest requestDate(String requestDate) {
    
    this.requestDate = requestDate;
    return this;
  }

   /**
   * The timestamp in this field shows the date/time when eBay requested the evidential document from the seller in response to a payment dispute. The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: yyyy-MM-ddThh:mm.ss.sssZ. An example would be 2019-08-04T19:09:02.768Z.
   * @return requestDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp in this field shows the date/time when eBay requested the evidential document from the seller in response to a payment dispute. The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: yyyy-MM-ddThh:mm.ss.sssZ. An example would be 2019-08-04T19:09:02.768Z.")

  public String getRequestDate() {
    return requestDate;
  }


  public void setRequestDate(String requestDate) {
    this.requestDate = requestDate;
  }


  public EvidenceRequest respondByDate(String respondByDate) {
    
    this.respondByDate = respondByDate;
    return this;
  }

   /**
   * The timestamp in this field shows the date/time when the seller is expected to provide a requested evidential document to eBay. The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: yyyy-MM-ddThh:mm.ss.sssZ. An example would be 2019-08-04T19:09:02.768Z.
   * @return respondByDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp in this field shows the date/time when the seller is expected to provide a requested evidential document to eBay. The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: yyyy-MM-ddThh:mm.ss.sssZ. An example would be 2019-08-04T19:09:02.768Z.")

  public String getRespondByDate() {
    return respondByDate;
  }


  public void setRespondByDate(String respondByDate) {
    this.respondByDate = respondByDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvidenceRequest evidenceRequest = (EvidenceRequest) o;
    return Objects.equals(this.evidenceId, evidenceRequest.evidenceId) &&
        Objects.equals(this.evidenceType, evidenceRequest.evidenceType) &&
        Objects.equals(this.lineItems, evidenceRequest.lineItems) &&
        Objects.equals(this.requestDate, evidenceRequest.requestDate) &&
        Objects.equals(this.respondByDate, evidenceRequest.respondByDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceId, evidenceType, lineItems, requestDate, respondByDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvidenceRequest {\n");
    sb.append("    evidenceId: ").append(toIndentedString(evidenceId)).append("\n");
    sb.append("    evidenceType: ").append(toIndentedString(evidenceType)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    respondByDate: ").append(toIndentedString(respondByDate)).append("\n");
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

