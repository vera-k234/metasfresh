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
 * This type is used by each recorded activity on a payment dispute, from creation to resolution.
 */
@ApiModel(description = "This type is used by each recorded activity on a payment dispute, from creation to resolution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class PaymentDisputeActivity {
  public static final String SERIALIZED_NAME_ACTIVITY_DATE = "activityDate";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DATE)
  private String activityDate;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activityType";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private String activityType;

  public static final String SERIALIZED_NAME_ACTOR = "actor";
  @SerializedName(SERIALIZED_NAME_ACTOR)
  private String actor;


  public PaymentDisputeActivity activityDate(String activityDate) {
    
    this.activityDate = activityDate;
    return this;
  }

   /**
   * The timestamp in this field shows the date/time of the payment dispute activity. The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: yyyy-MM-ddThh:mm.ss.sssZ. An example would be 2019-08-04T19:09:02.768Z.
   * @return activityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp in this field shows the date/time of the payment dispute activity. The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: yyyy-MM-ddThh:mm.ss.sssZ. An example would be 2019-08-04T19:09:02.768Z.")

  public String getActivityDate() {
    return activityDate;
  }


  public void setActivityDate(String activityDate) {
    this.activityDate = activityDate;
  }


  public PaymentDisputeActivity activityType(String activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * This enumeration value indicates the type of activity that occured on the payment dispute. For example, a value of DISPUTE_OPENED is returned when a payment disute is first created, a value indicating the seller&#39;s decision on the dispute, such as SELLER_CONTEST, is returned when seller makes a decision to accept or contest dispute, and a value of DISPUTE_CLOSED is returned when a payment disute is resolved. See ActivityEnum for an explanation of each of the values that may be returned here. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ActivityEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return activityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This enumeration value indicates the type of activity that occured on the payment dispute. For example, a value of DISPUTE_OPENED is returned when a payment disute is first created, a value indicating the seller's decision on the dispute, such as SELLER_CONTEST, is returned when seller makes a decision to accept or contest dispute, and a value of DISPUTE_CLOSED is returned when a payment disute is resolved. See ActivityEnum for an explanation of each of the values that may be returned here. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ActivityEnum'>eBay API documentation</a>")

  public String getActivityType() {
    return activityType;
  }


  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }


  public PaymentDisputeActivity actor(String actor) {
    
    this.actor = actor;
    return this;
  }

   /**
   * This enumeration value indicates the actor that performed the action. Possible values include the BUYER, SELLER, CS_AGENT (eBay customer service), or SYSTEM. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ActorEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return actor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This enumeration value indicates the actor that performed the action. Possible values include the BUYER, SELLER, CS_AGENT (eBay customer service), or SYSTEM. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ActorEnum'>eBay API documentation</a>")

  public String getActor() {
    return actor;
  }


  public void setActor(String actor) {
    this.actor = actor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDisputeActivity paymentDisputeActivity = (PaymentDisputeActivity) o;
    return Objects.equals(this.activityDate, paymentDisputeActivity.activityDate) &&
        Objects.equals(this.activityType, paymentDisputeActivity.activityType) &&
        Objects.equals(this.actor, paymentDisputeActivity.actor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDate, activityType, actor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDisputeActivity {\n");
    sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
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

