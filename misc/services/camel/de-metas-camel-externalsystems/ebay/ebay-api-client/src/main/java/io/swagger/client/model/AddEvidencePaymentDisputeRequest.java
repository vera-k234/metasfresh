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
import io.swagger.client.model.FileEvidence;
import io.swagger.client.model.OrderLineItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This type is used by the request payload of the addEvidence method. The addEvidence method is used to create a new evidence set against a payment dispute with one or more evidence files.
 */
@Schema(description = "This type is used by the request payload of the addEvidence method. The addEvidence method is used to create a new evidence set against a payment dispute with one or more evidence files.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-02T10:53:33.276748+01:00[Europe/Berlin]")
public class AddEvidencePaymentDisputeRequest {
  @SerializedName("evidenceType")
  private String evidenceType = null;

  @SerializedName("files")
  private List<FileEvidence> files = null;

  @SerializedName("lineItems")
  private List<OrderLineItems> lineItems = null;

  public AddEvidencePaymentDisputeRequest evidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
    return this;
  }

   /**
   * This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field. See the EvidenceTypeEnum type for the supported evidence types. For implementation help, refer to &lt;a href&#x3D;&#x27;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&#x27;&gt;eBay API documentation&lt;/a&gt;
   * @return evidenceType
  **/
  @Schema(description = "This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field. See the EvidenceTypeEnum type for the supported evidence types. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum'>eBay API documentation</a>")
  public String getEvidenceType() {
    return evidenceType;
  }

  public void setEvidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
  }

  public AddEvidencePaymentDisputeRequest files(List<FileEvidence> files) {
    this.files = files;
    return this;
  }

  public AddEvidencePaymentDisputeRequest addFilesItem(FileEvidence filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<FileEvidence>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * This array is used to specify one or more evidence files that will become part of a new evidence set associated with a payment dispute. At least one evidence file must be specified in the files array. The unique identifier of an evidence file is returned in the response payload of the uploadEvidence method.
   * @return files
  **/
  @Schema(description = "This array is used to specify one or more evidence files that will become part of a new evidence set associated with a payment dispute. At least one evidence file must be specified in the files array. The unique identifier of an evidence file is returned in the response payload of the uploadEvidence method.")
  public List<FileEvidence> getFiles() {
    return files;
  }

  public void setFiles(List<FileEvidence> files) {
    this.files = files;
  }

  public AddEvidencePaymentDisputeRequest lineItems(List<OrderLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public AddEvidencePaymentDisputeRequest addLineItemsItem(OrderLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<OrderLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This required array identifies the order line item(s) for which the evidence file(s) will be applicable. Both the itemId and lineItemID fields are needed to identify each order line item, and both of these values are returned under the evidenceRequests.lineItems array in the getPaymentDispute response.
   * @return lineItems
  **/
  @Schema(description = "This required array identifies the order line item(s) for which the evidence file(s) will be applicable. Both the itemId and lineItemID fields are needed to identify each order line item, and both of these values are returned under the evidenceRequests.lineItems array in the getPaymentDispute response.")
  public List<OrderLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<OrderLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddEvidencePaymentDisputeRequest addEvidencePaymentDisputeRequest = (AddEvidencePaymentDisputeRequest) o;
    return Objects.equals(this.evidenceType, addEvidencePaymentDisputeRequest.evidenceType) &&
        Objects.equals(this.files, addEvidencePaymentDisputeRequest.files) &&
        Objects.equals(this.lineItems, addEvidencePaymentDisputeRequest.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceType, files, lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEvidencePaymentDisputeRequest {\n");
    
    sb.append("    evidenceType: ").append(toIndentedString(evidenceType)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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
