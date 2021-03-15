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
import io.swagger.client.model.Amount;
import io.swagger.client.model.PaymentHold;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This type is used to provide details about the seller payments for an order.
 */
@Schema(description = "This type is used to provide details about the seller payments for an order.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-02T10:53:33.276748+01:00[Europe/Berlin]")
public class Payment {
  @SerializedName("amount")
  private Amount amount = null;

  @SerializedName("paymentDate")
  private String paymentDate = null;

  @SerializedName("paymentHolds")
  private List<PaymentHold> paymentHolds = null;

  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  @SerializedName("paymentReferenceId")
  private String paymentReferenceId = null;

  @SerializedName("paymentStatus")
  private String paymentStatus = null;

  public Payment amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Payment paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The date and time that the payment was received by the seller. This field will not be returned if buyer has yet to pay for the order. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z
   * @return paymentDate
  **/
  @Schema(description = "The date and time that the payment was received by the seller. This field will not be returned if buyer has yet to pay for the order. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2015-08-04T19:09:02.768Z")
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Payment paymentHolds(List<PaymentHold> paymentHolds) {
    this.paymentHolds = paymentHolds;
    return this;
  }

  public Payment addPaymentHoldsItem(PaymentHold paymentHoldsItem) {
    if (this.paymentHolds == null) {
      this.paymentHolds = new ArrayList<PaymentHold>();
    }
    this.paymentHolds.add(paymentHoldsItem);
    return this;
  }

   /**
   * This container is only returned if eBay is temporarily holding the seller&#x27;s funds for the order. If a payment hold has been placed on the order, this container includes the reason for the payment hold, the expected release date of the funds into the seller&#x27;s account, the current state of the hold, and as soon as the payment hold has been released, the actual release date.
   * @return paymentHolds
  **/
  @Schema(description = "This container is only returned if eBay is temporarily holding the seller's funds for the order. If a payment hold has been placed on the order, this container includes the reason for the payment hold, the expected release date of the funds into the seller's account, the current state of the hold, and as soon as the payment hold has been released, the actual release date.")
  public List<PaymentHold> getPaymentHolds() {
    return paymentHolds;
  }

  public void setPaymentHolds(List<PaymentHold> paymentHolds) {
    this.paymentHolds = paymentHolds;
  }

  public Payment paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method used to pay for the order. See the PaymentMethodTypeEnum type for more information on the payment methods. For implementation help, refer to &lt;a href&#x3D;&#x27;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:PaymentMethodTypeEnum&#x27;&gt;eBay API documentation&lt;/a&gt;
   * @return paymentMethod
  **/
  @Schema(description = "The payment method used to pay for the order. See the PaymentMethodTypeEnum type for more information on the payment methods. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:PaymentMethodTypeEnum'>eBay API documentation</a>")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Payment paymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
    return this;
  }

   /**
   * This field is only returned if payment has been made by the buyer, and the paymentMethod is PAYPAL or ESCROW. This field contains the PayPal-generated transaction identifier in case of payment made via PAYPAL.
   * @return paymentReferenceId
  **/
  @Schema(description = "This field is only returned if payment has been made by the buyer, and the paymentMethod is PAYPAL or ESCROW. This field contains the PayPal-generated transaction identifier in case of payment made via PAYPAL.")
  public String getPaymentReferenceId() {
    return paymentReferenceId;
  }

  public void setPaymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
  }

  public Payment paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * The enumeration value returned in this field indicates the status of the payment for the order. See the PaymentStatusEnum type definition for more information on the possible payment states. For implementation help, refer to &lt;a href&#x3D;&#x27;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:PaymentStatusEnum&#x27;&gt;eBay API documentation&lt;/a&gt;
   * @return paymentStatus
  **/
  @Schema(description = "The enumeration value returned in this field indicates the status of the payment for the order. See the PaymentStatusEnum type definition for more information on the possible payment states. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:PaymentStatusEnum'>eBay API documentation</a>")
  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.paymentDate, payment.paymentDate) &&
        Objects.equals(this.paymentHolds, payment.paymentHolds) &&
        Objects.equals(this.paymentMethod, payment.paymentMethod) &&
        Objects.equals(this.paymentReferenceId, payment.paymentReferenceId) &&
        Objects.equals(this.paymentStatus, payment.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, paymentDate, paymentHolds, paymentMethod, paymentReferenceId, paymentStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentHolds: ").append(toIndentedString(paymentHolds)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentReferenceId: ").append(toIndentedString(paymentReferenceId)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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
