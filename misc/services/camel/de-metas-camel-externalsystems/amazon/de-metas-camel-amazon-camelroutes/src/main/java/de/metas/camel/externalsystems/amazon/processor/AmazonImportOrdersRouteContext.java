/*
 * #%L
 * de-metas-camel-amazon-camelroutes
 * %%
 * Copyright (C) 2021 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.camel.externalsystems.amazon.processor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.annotation.Nullable;

import de.metas.camel.externalsystems.amazon.api.model.orders.Order;
import de.metas.camel.externalsystems.common.DateAndImportStatus;
import de.metas.common.externalsystem.JsonExternalSystemRequest;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Data
@Builder
public class AmazonImportOrdersRouteContext
{
	
	@NonNull
	@Setter(AccessLevel.NONE)
	private final String orgCode;
	
	/** Initiator of this request and params for it. */
	@NonNull
	@Setter(AccessLevel.NONE)
	private JsonExternalSystemRequest externalSystemRequest;

	@NonNull
	@Builder.Default
	@Setter(AccessLevel.NONE)
	private Set<String> importedExternalHeaderIds = new HashSet<>();
	
	/** Current processed order after splitting. */
	@Nullable
	private Order order;

	@Nullable
	private String bpLocationCustomJsonPath;

	/** Shipping BPID after generation / query. */
	@Nullable
	@Getter(AccessLevel.NONE)
	private String shippingBPLocationExternalId;

	/** Billling BIPD after generation / query. */
	@Nullable
	@Getter(AccessLevel.NONE)
	private String billingBPLocationExternalId;

	/** Next TS for import based on processed orders. */
	@Nullable
	@Setter(AccessLevel.NONE)
	@Getter(AccessLevel.NONE)
	private DateAndImportStatus nextImportStartingTimestamp;
	
	@NonNull
	public Order getOrderNotNull()
	{
		if (order == null)
		{
			throw new RuntimeException("order cannot be null at this stage!");
		}

		return order;
	}

	@NonNull
	public String getBillingBPLocationExternalIdNotNull()
	{
		if (billingBPLocationExternalId == null)
		{
			throw new RuntimeException("billingBPLocationExternalId cannot be null at this stage!");
		}

		return billingBPLocationExternalId;
	}

	@NonNull
	public String getShippingBPLocationExternalIdNotNull()
	{
		if (shippingBPLocationExternalId == null)
		{
			throw new RuntimeException("shippingBPLocationExternalId cannot be null at this stage!");
		}

		return shippingBPLocationExternalId;
	}

	public void setOrder(@NonNull final Order order)
	{
		this.order = order;
		importedExternalHeaderIds.add(order.getAmazonOrderId());
	}
	
	@NonNull
	public Optional<Instant> getNextImportStartingTimestamp()
	{
		if (nextImportStartingTimestamp == null)
		{
			return Optional.empty();
		}

		return Optional.of(nextImportStartingTimestamp.getTimestamp());
	}
	
	/**
	 * Update next import timestamp to the most current one.
	 */
	public void setNextImportStartingTimestamp(@NonNull final DateAndImportStatus dateAndImportStatus)
	{
		if (this.nextImportStartingTimestamp == null)
		{
			this.nextImportStartingTimestamp = dateAndImportStatus;
			return;
		}

		if (this.nextImportStartingTimestamp.isOkToImport())
		{
			if (dateAndImportStatus.isOkToImport()
					&& dateAndImportStatus.getTimestamp().isAfter(this.nextImportStartingTimestamp.getTimestamp()))
			{
				this.nextImportStartingTimestamp = dateAndImportStatus;
				return;
			}

			if (!dateAndImportStatus.isOkToImport())
			{
				this.nextImportStartingTimestamp = dateAndImportStatus;
				return;
			}
		}

		if (!this.nextImportStartingTimestamp.isOkToImport()
				&& !dateAndImportStatus.isOkToImport()
				&& dateAndImportStatus.getTimestamp().isBefore(this.nextImportStartingTimestamp.getTimestamp()))
		{
			this.nextImportStartingTimestamp = dateAndImportStatus;
		}
	}

}
