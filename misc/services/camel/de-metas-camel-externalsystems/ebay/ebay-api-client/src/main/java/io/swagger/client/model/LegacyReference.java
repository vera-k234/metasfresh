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
 * Type defining the legacyReference container. This container is needed if the seller is issuing a refund for an individual order line item, and wishes to use an item ID and transaction ID to identify the order line item.
 */
@Schema(description = "Type defining the legacyReference container. This container is needed if the seller is issuing a refund for an individual order line item, and wishes to use an item ID and transaction ID to identify the order line item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-02T10:53:33.276748+01:00[Europe/Berlin]")
public class LegacyReference {
  @SerializedName("legacyItemId")
  private String legacyItemId = null;

  @SerializedName("legacyTransactionId")
  private String legacyTransactionId = null;

  public LegacyReference legacyItemId(String legacyItemId) {
    this.legacyItemId = legacyItemId;
    return this;
  }

   /**
   * The unique identifier of a listing in legacy/Trading API format. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
   * @return legacyItemId
  **/
  @Schema(description = "The unique identifier of a listing in legacy/Trading API format. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.")
  public String getLegacyItemId() {
    return legacyItemId;
  }

  public void setLegacyItemId(String legacyItemId) {
    this.legacyItemId = legacyItemId;
  }

  public LegacyReference legacyTransactionId(String legacyTransactionId) {
    this.legacyTransactionId = legacyTransactionId;
    return this;
  }

   /**
   * The unique identifier of a sale/transaction in legacy/Trading API format. A &#x27;transaction ID&#x27; is created once a buyer purchases a &#x27;Buy It Now&#x27; item or if an auction listing ends with a winning bidder. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
   * @return legacyTransactionId
  **/
  @Schema(description = "The unique identifier of a sale/transaction in legacy/Trading API format. A 'transaction ID' is created once a buyer purchases a 'Buy It Now' item or if an auction listing ends with a winning bidder. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.")
  public String getLegacyTransactionId() {
    return legacyTransactionId;
  }

  public void setLegacyTransactionId(String legacyTransactionId) {
    this.legacyTransactionId = legacyTransactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyReference legacyReference = (LegacyReference) o;
    return Objects.equals(this.legacyItemId, legacyReference.legacyItemId) &&
        Objects.equals(this.legacyTransactionId, legacyReference.legacyTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyItemId, legacyTransactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyReference {\n");
    
    sb.append("    legacyItemId: ").append(toIndentedString(legacyItemId)).append("\n");
    sb.append("    legacyTransactionId: ").append(toIndentedString(legacyTransactionId)).append("\n");
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
