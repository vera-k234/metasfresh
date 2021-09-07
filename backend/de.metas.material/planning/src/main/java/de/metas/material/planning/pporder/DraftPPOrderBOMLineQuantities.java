/*
 * #%L
 * metasfresh-material-planning
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

package de.metas.material.planning.pporder;

import de.metas.product.ProductId;
import de.metas.quantity.Quantity;
import de.metas.quantity.QuantityUOMConverter;
import de.metas.util.Check;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class DraftPPOrderBOMLineQuantities
{
	@NonNull ProductId productId;
	@NonNull Quantity qtyIssuedOrReceived;

	public DraftPPOrderBOMLineQuantities add(@NonNull final DraftPPOrderBOMLineQuantities other, @NonNull final QuantityUOMConverter uomConverter)
	{
		Check.assumeEquals(productId, other.productId, "Lines shall have same product: {}, {}", this, other);

		final Quantity other_qtyIssuedOrReceived_conv = uomConverter.convertQuantityTo(other.qtyIssuedOrReceived, productId, qtyIssuedOrReceived.getUomId());
		if (other_qtyIssuedOrReceived_conv.signum() == 0)
		{
			return this;
		}

		final Quantity qtyIssuedOrReceivedNew = qtyIssuedOrReceived.add(other_qtyIssuedOrReceived_conv);
		if (qtyIssuedOrReceived.equals(qtyIssuedOrReceivedNew))
		{
			return this;
		}

		return toBuilder().qtyIssuedOrReceived(qtyIssuedOrReceivedNew).build();
	}
}
