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

package de.metas.camel.externalsystems.ebay.api.invoker;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T10:27:35.061216+02:00[Europe/Berlin]")
public class Pair
{
	private String name = "";
	private String value = "";

	public Pair(String name, String value)
	{
		setName(name);
		setValue(value);
	}

	private void setName(String name)
	{
		if (!isValidString(name))
		{
			return;
		}

		this.name = name;
	}

	private void setValue(String value)
	{
		if (!isValidString(value))
		{
			return;
		}

		this.value = value;
	}

	public String getName()
	{
		return this.name;
	}

	public String getValue()
	{
		return this.value;
	}

	private boolean isValidString(String arg)
	{
		if (arg == null)
		{
			return false;
		}

		if (arg.trim().isEmpty())
		{
			return false;
		}

		return true;
	}
}
