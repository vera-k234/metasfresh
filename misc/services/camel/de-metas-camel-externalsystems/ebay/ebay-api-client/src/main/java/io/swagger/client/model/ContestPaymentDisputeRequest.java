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
import io.swagger.client.model.ReturnAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This type is used by the request payload of the contestPaymentDispute method.
 */
@Schema(description = "This type is used by the request payload of the contestPaymentDispute method.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-02T10:53:33.276748+01:00[Europe/Berlin]")
public class ContestPaymentDisputeRequest {
  @SerializedName("returnAddress")
  private ReturnAddress returnAddress = null;

  @SerializedName("revision")
  private Integer revision = null;

  public ContestPaymentDisputeRequest returnAddress(ReturnAddress returnAddress) {
    this.returnAddress = returnAddress;
    return this;
  }

   /**
   * Get returnAddress
   * @return returnAddress
  **/
  @Schema(description = "")
  public ReturnAddress getReturnAddress() {
    return returnAddress;
  }

  public void setReturnAddress(ReturnAddress returnAddress) {
    this.returnAddress = returnAddress;
  }

  public ContestPaymentDisputeRequest revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * This integer value indicates the revision number of the payment dispute. This field is required. The current revision number for a payment dispute can be retrieved with the getPaymentDispute method. Each time an action is taken against a payment dispute, this integer value increases by 1.
   * @return revision
  **/
  @Schema(description = "This integer value indicates the revision number of the payment dispute. This field is required. The current revision number for a payment dispute can be retrieved with the getPaymentDispute method. Each time an action is taken against a payment dispute, this integer value increases by 1.")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestPaymentDisputeRequest contestPaymentDisputeRequest = (ContestPaymentDisputeRequest) o;
    return Objects.equals(this.returnAddress, contestPaymentDisputeRequest.returnAddress) &&
        Objects.equals(this.revision, contestPaymentDisputeRequest.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnAddress, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestPaymentDisputeRequest {\n");
    
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
