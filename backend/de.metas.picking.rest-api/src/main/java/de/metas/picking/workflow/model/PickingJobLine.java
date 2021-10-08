/*
 * #%L
 * de.metas.picking.rest-api
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

package de.metas.picking.workflow.model;

import com.google.common.collect.ImmutableList;
import de.metas.i18n.ITranslatableString;
import de.metas.inoutcandidate.ShipmentScheduleId;
import de.metas.product.ProductId;
import de.metas.quantity.Quantity;
import de.metas.util.Check;
import de.metas.util.collections.CollectionUtils;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

@Value
public class PickingJobLine
{
	@NonNull ProductId productId;
	@NonNull ITranslatableString productName;
	@NonNull ImmutableList<PickingJobStep> steps;

	// computed values
	@NonNull Quantity qtyToPick;
	@NonNull Quantity qtyPicked;
	@NonNull PickingJobProgress progress;

	@Builder(toBuilder = true)
	@SuppressWarnings("OptionalGetWithoutIsPresent")
	private PickingJobLine(
			@NonNull final ProductId productId,
			@NonNull final ITranslatableString productName,
			@NonNull final ImmutableList<PickingJobStep> steps)
	{
		Check.assumeNotEmpty(steps, "steps not empty");

		this.productId = productId;
		this.productName = productName;
		this.steps = steps;

		this.progress = computeProgress(steps);
		this.qtyToPick = steps.stream().map(PickingJobStep::getQtyToPick).reduce(Quantity::add).get();
		this.qtyPicked = steps.stream().map(PickingJobStep::getQtyPicked).reduce(Quantity::add).get();
	}

	private static PickingJobProgress computeProgress(@NonNull ImmutableList<PickingJobStep> steps)
	{
		int countDoneSteps = 0;
		int countNotDoneSteps = 0;
		for (final PickingJobStep step : steps)
		{
			if (step.isQtyPickedConfirmed())
			{
				countDoneSteps++;
			}
			else
			{
				countNotDoneSteps++;
			}
		}

		if (countDoneSteps <= 0)
		{
			return PickingJobProgress.NOTHING_PICKED;
		}
		else if (countNotDoneSteps <= 0)
		{
			return PickingJobProgress.FULLY_PICKED;
		}
		else
		{
			return PickingJobProgress.PARTIAL_PICKED;
		}
	}

	Stream<ShipmentScheduleId> streamShipmentScheduleId()
	{
		return steps.stream().map(PickingJobStep::getShipmentScheduleId);
	}

	public PickingJobLine withChangedSteps(@NonNull final UnaryOperator<PickingJobStep> stepMapper)
	{
		final ImmutableList<PickingJobStep> changedSteps = CollectionUtils.map(steps, stepMapper);
		return changedSteps.equals(steps)
				? this
				: toBuilder().steps(changedSteps).build();
	}

}
