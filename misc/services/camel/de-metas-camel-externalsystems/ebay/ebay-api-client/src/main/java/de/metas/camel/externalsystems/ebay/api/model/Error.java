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
import de.metas.camel.externalsystems.ebay.api.model.ErrorParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type contains a error or warning related to a call request.
 */
@ApiModel(description = "This type contains a error or warning related to a call request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class Error {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_ERROR_ID = "errorId";
  @SerializedName(SERIALIZED_NAME_ERROR_ID)
  private Integer errorId;

  public static final String SERIALIZED_NAME_INPUT_REF_IDS = "inputRefIds";
  @SerializedName(SERIALIZED_NAME_INPUT_REF_IDS)
  private List<String> inputRefIds = null;

  public static final String SERIALIZED_NAME_LONG_MESSAGE = "longMessage";
  @SerializedName(SERIALIZED_NAME_LONG_MESSAGE)
  private String longMessage;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OUTPUT_REF_IDS = "outputRefIds";
  @SerializedName(SERIALIZED_NAME_OUTPUT_REF_IDS)
  private List<String> outputRefIds = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<ErrorParameter> parameters = null;

  public static final String SERIALIZED_NAME_SUBDOMAIN = "subdomain";
  @SerializedName(SERIALIZED_NAME_SUBDOMAIN)
  private String subdomain;


  public Error category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The context or source of this error or warning.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The context or source of this error or warning.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public Error domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The name of the domain containing the service or application. For example, sell is a domain.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the domain containing the service or application. For example, sell is a domain.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public Error errorId(Integer errorId) {
    
    this.errorId = errorId;
    return this;
  }

   /**
   * A positive integer that uniquely identifies the specific error condition that occurred. Your application can use these values as error code identifiers in your customized error-handling algorithms.
   * @return errorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A positive integer that uniquely identifies the specific error condition that occurred. Your application can use these values as error code identifiers in your customized error-handling algorithms.")

  public Integer getErrorId() {
    return errorId;
  }


  public void setErrorId(Integer errorId) {
    this.errorId = errorId;
  }


  public Error inputRefIds(List<String> inputRefIds) {
    
    this.inputRefIds = inputRefIds;
    return this;
  }

  public Error addInputRefIdsItem(String inputRefIdsItem) {
    if (this.inputRefIds == null) {
      this.inputRefIds = new ArrayList<String>();
    }
    this.inputRefIds.add(inputRefIdsItem);
    return this;
  }

   /**
   * A list of one or more specific request elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
   * @return inputRefIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of one or more specific request elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.")

  public List<String> getInputRefIds() {
    return inputRefIds;
  }


  public void setInputRefIds(List<String> inputRefIds) {
    this.inputRefIds = inputRefIds;
  }


  public Error longMessage(String longMessage) {
    
    this.longMessage = longMessage;
    return this;
  }

   /**
   * An expanded version of the message field. Maximum length: 200 characters
   * @return longMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An expanded version of the message field. Maximum length: 200 characters")

  public String getLongMessage() {
    return longMessage;
  }


  public void setLongMessage(String longMessage) {
    this.longMessage = longMessage;
  }


  public Error message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A message about the error or warning which is device agnostic and readable by end users and application developers. It explains what the error or warning is, and how to fix it (in a general sense). If applicable, the value is localized to the end user&#39;s requested locale. Maximum length: 50 characters
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A message about the error or warning which is device agnostic and readable by end users and application developers. It explains what the error or warning is, and how to fix it (in a general sense). If applicable, the value is localized to the end user's requested locale. Maximum length: 50 characters")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Error outputRefIds(List<String> outputRefIds) {
    
    this.outputRefIds = outputRefIds;
    return this;
  }

  public Error addOutputRefIdsItem(String outputRefIdsItem) {
    if (this.outputRefIds == null) {
      this.outputRefIds = new ArrayList<String>();
    }
    this.outputRefIds.add(outputRefIdsItem);
    return this;
  }

   /**
   * A list of one or more specific response elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
   * @return outputRefIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of one or more specific response elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.")

  public List<String> getOutputRefIds() {
    return outputRefIds;
  }


  public void setOutputRefIds(List<String> outputRefIds) {
    this.outputRefIds = outputRefIds;
  }


  public Error parameters(List<ErrorParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public Error addParametersItem(ErrorParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ErrorParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Contains a list of name/value pairs that provide additional information concerning this error or warning. Each item in the list is an input parameter that contributed to the error or warning condition.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains a list of name/value pairs that provide additional information concerning this error or warning. Each item in the list is an input parameter that contributed to the error or warning condition.")

  public List<ErrorParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<ErrorParameter> parameters) {
    this.parameters = parameters;
  }


  public Error subdomain(String subdomain) {
    
    this.subdomain = subdomain;
    return this;
  }

   /**
   * The name of the domain&#39;s subsystem or subdivision. For example, fulfillment is a subdomain in the sell domain.
   * @return subdomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the domain's subsystem or subdivision. For example, fulfillment is a subdomain in the sell domain.")

  public String getSubdomain() {
    return subdomain;
  }


  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.category, error.category) &&
        Objects.equals(this.domain, error.domain) &&
        Objects.equals(this.errorId, error.errorId) &&
        Objects.equals(this.inputRefIds, error.inputRefIds) &&
        Objects.equals(this.longMessage, error.longMessage) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.outputRefIds, error.outputRefIds) &&
        Objects.equals(this.parameters, error.parameters) &&
        Objects.equals(this.subdomain, error.subdomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, domain, errorId, inputRefIds, longMessage, message, outputRefIds, parameters, subdomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    inputRefIds: ").append(toIndentedString(inputRefIds)).append("\n");
    sb.append("    longMessage: ").append(toIndentedString(longMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    outputRefIds: ").append(toIndentedString(outputRefIds)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
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

