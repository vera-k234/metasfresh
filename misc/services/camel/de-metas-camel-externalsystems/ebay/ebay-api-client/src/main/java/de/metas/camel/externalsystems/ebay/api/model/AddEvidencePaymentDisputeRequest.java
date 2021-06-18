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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This type is used by the request payload of the addEvidence method. The addEvidence method is used to create a new evidence set against a payment dispute with one or more evidence files.
 */
@ApiModel(description = "This type is used by the request payload of the addEvidence method. The addEvidence method is used to create a new evidence set against a payment dispute with one or more evidence files.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class AddEvidencePaymentDisputeRequest
{
	public static final String SERIALIZED_NAME_EVIDENCE_TYPE = "evidenceType";
	@SerializedName(SERIALIZED_NAME_EVIDENCE_TYPE)
	private String evidenceType;

	public static final String SERIALIZED_NAME_FILES = "files";
	@SerializedName(SERIALIZED_NAME_FILES)
	private List<FileEvidence> files = null;

	public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
	@SerializedName(SERIALIZED_NAME_LINE_ITEMS)
	private List<OrderLineItems> lineItems = null;

	public AddEvidencePaymentDisputeRequest evidenceType(String evidenceType)
	{

		this.evidenceType = evidenceType;
		return this;
	}

	/**
	 * This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field. See the EvidenceTypeEnum type for the supported evidence types. For implementation help, refer to &lt;a
	 * href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
	 * 
	 * @return evidenceType
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field. See the EvidenceTypeEnum type for the supported evidence types. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum'>eBay API documentation</a>")

	public String getEvidenceType()
	{
		return evidenceType;
	}

	public void setEvidenceType(String evidenceType)
	{
		this.evidenceType = evidenceType;
	}

	public AddEvidencePaymentDisputeRequest files(List<FileEvidence> files)
	{

		this.files = files;
		return this;
	}

	public AddEvidencePaymentDisputeRequest addFilesItem(FileEvidence filesItem)
	{
		if (this.files == null)
		{
			this.files = new ArrayList<FileEvidence>();
		}
		this.files.add(filesItem);
		return this;
	}

	/**
	 * This array is used to specify one or more evidence files that will become part of a new evidence set associated with a payment dispute. At least one evidence file must be specified in the files array. The unique identifier of an evidence file is returned in the response payload of the uploadEvidence method.
	 * 
	 * @return files
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This array is used to specify one or more evidence files that will become part of a new evidence set associated with a payment dispute. At least one evidence file must be specified in the files array. The unique identifier of an evidence file is returned in the response payload of the uploadEvidence method.")

	public List<FileEvidence> getFiles()
	{
		return files;
	}

	public void setFiles(List<FileEvidence> files)
	{
		this.files = files;
	}

	public AddEvidencePaymentDisputeRequest lineItems(List<OrderLineItems> lineItems)
	{

		this.lineItems = lineItems;
		return this;
	}

	public AddEvidencePaymentDisputeRequest addLineItemsItem(OrderLineItems lineItemsItem)
	{
		if (this.lineItems == null)
		{
			this.lineItems = new ArrayList<OrderLineItems>();
		}
		this.lineItems.add(lineItemsItem);
		return this;
	}

	/**
	 * This required array identifies the order line item(s) for which the evidence file(s) will be applicable. Both the itemId and lineItemID fields are needed to identify each order line item, and both of these values are returned under the evidenceRequests.lineItems array in the getPaymentDispute response.
	 * 
	 * @return lineItems
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "This required array identifies the order line item(s) for which the evidence file(s) will be applicable. Both the itemId and lineItemID fields are needed to identify each order line item, and both of these values are returned under the evidenceRequests.lineItems array in the getPaymentDispute response.")

	public List<OrderLineItems> getLineItems()
	{
		return lineItems;
	}

	public void setLineItems(List<OrderLineItems> lineItems)
	{
		this.lineItems = lineItems;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		AddEvidencePaymentDisputeRequest addEvidencePaymentDisputeRequest = (AddEvidencePaymentDisputeRequest)o;
		return Objects.equals(this.evidenceType, addEvidencePaymentDisputeRequest.evidenceType) &&
				Objects.equals(this.files, addEvidencePaymentDisputeRequest.files) &&
				Objects.equals(this.lineItems, addEvidencePaymentDisputeRequest.lineItems);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(evidenceType, files, lineItems);
	}

	@Override
	public String toString()
	{
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
	private String toIndentedString(Object o)
	{
		if (o == null)
		{
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
