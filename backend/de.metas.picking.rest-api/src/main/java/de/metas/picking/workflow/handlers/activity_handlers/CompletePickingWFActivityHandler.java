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

package de.metas.picking.workflow.handlers.activity_handlers;

import de.metas.picking.workflow.model.PickingJob;
import de.metas.workflow.WFState;
import de.metas.workflow.rest_api.activity_features.user_confirmation.UserConfirmationRequest;
import de.metas.workflow.rest_api.activity_features.user_confirmation.UserConfirmationSupport;
import de.metas.workflow.rest_api.controller.v2.json.JsonOpts;
import de.metas.workflow.rest_api.model.UIComponent;
import de.metas.workflow.rest_api.model.UIComponentType;
import de.metas.workflow.rest_api.model.WFActivity;
import de.metas.workflow.rest_api.model.WFActivityType;
import de.metas.workflow.rest_api.model.WFProcess;
import de.metas.workflow.rest_api.service.WFActivityHandler;
import lombok.NonNull;
import org.adempiere.util.api.Params;
import org.springframework.stereotype.Component;

import static de.metas.picking.workflow.handlers.activity_handlers.PickingWFActivityHelper.getPickingJob;

@Component
public class CompletePickingWFActivityHandler implements WFActivityHandler, UserConfirmationSupport
{
	public static final WFActivityType HANDLED_ACTIVITY_TYPE = WFActivityType.ofString("picking.completePicking");

	@Override
	public WFActivityType getHandledActivityType()
	{
		return HANDLED_ACTIVITY_TYPE;
	}

	@Override
	public UIComponent getUIComponent(
			final @NonNull WFProcess wfProcess,
			final @NonNull WFActivity wfActivity,
			final @NonNull JsonOpts jsonOpts)
	{
		return UIComponent.builder()
				.type(UIComponentType.CONFIRM_BUTTON)
				.readonly(!wfActivity.getStatus().isSuspended())
				.properties(Params.builder()
						.value("question", "Are you sure?")
						.build())
				.build();
	}

	@Override
	public WFState computeActivityState(final WFProcess wfProcess, final WFActivity completePickingWFActivity)
	{
		final PickingJob pickingJob = getPickingJob(wfProcess);

		if (pickingJob.isCompleted())
		{
			return WFState.Completed;
		}
		else if (pickingJob.getProgress().isFullyPicked())
		{
			return WFState.Suspended;
		}
		else
		{
			return WFState.NotStarted;
		}
	}

	@Override
	public void userConfirmed(final UserConfirmationRequest request)
	{
		final PickingJob pickingJob = getPickingJob(request.getWfProcess());

		// TODO process the picking and mark the workflow as DONE
		throw new UnsupportedOperationException();
	}
}
