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
 * This type is used to state possible action(s) that a seller can take to release a payment hold placed against an order.
 */
@Schema(description = "This type is used to state possible action(s) that a seller can take to release a payment hold placed against an order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-02T10:53:33.276748+01:00[Europe/Berlin]")
public class SellerActionsToRelease {
  @SerializedName("sellerActionToRelease")
  private String sellerActionToRelease = null;

  public SellerActionsToRelease sellerActionToRelease(String sellerActionToRelease) {
    this.sellerActionToRelease = sellerActionToRelease;
    return this;
  }

   /**
   * A possible action that the seller can take to expedite the release of a payment hold. A sellerActionToRelease field is returned for each possible action that a seller may take. Possible actions may include providing shipping/tracking information, issuing a refund, providing refund information, contacting customer support, etc.
   * @return sellerActionToRelease
  **/
  @Schema(description = "A possible action that the seller can take to expedite the release of a payment hold. A sellerActionToRelease field is returned for each possible action that a seller may take. Possible actions may include providing shipping/tracking information, issuing a refund, providing refund information, contacting customer support, etc.")
  public String getSellerActionToRelease() {
    return sellerActionToRelease;
  }

  public void setSellerActionToRelease(String sellerActionToRelease) {
    this.sellerActionToRelease = sellerActionToRelease;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerActionsToRelease sellerActionsToRelease = (SellerActionsToRelease) o;
    return Objects.equals(this.sellerActionToRelease, sellerActionsToRelease.sellerActionToRelease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerActionToRelease);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerActionsToRelease {\n");
    
    sb.append("    sellerActionToRelease: ").append(toIndentedString(sellerActionToRelease)).append("\n");
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
