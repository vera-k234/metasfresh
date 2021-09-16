/*
 * #%L
 * de.metas.workflow.rest-api
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

package de.metas.workflow.rest_api.service;

import de.metas.workflow.WFState;
import de.metas.workflow.rest_api.controller.v2.json.JsonOpts;
import de.metas.workflow.rest_api.model.UIComponent;
import de.metas.workflow.rest_api.model.WFActivity;
import de.metas.workflow.rest_api.model.WFActivityType;
import de.metas.workflow.rest_api.model.WFProcess;
import de.metas.workflow.rest_api.model.WFProcessHeaderProperties;
import lombok.NonNull;

public interface WFActivityHandler
{
	WFActivityType getHandledActivityType();

	default WFProcessHeaderProperties getHeaderProperties(
			@NonNull final WFProcess wfProcess,
			@NonNull final WFActivity wfActivity)
	{
		return WFProcessHeaderProperties.EMPTY;
	}

	UIComponent getUIComponent(
			@NonNull final WFProcess wfProcess,
			@NonNull final WFActivity wfActivity,
			@NonNull final JsonOpts jsonOpts);

	WFState computeActivityState(WFProcess wfProcess, WFActivity wfActivity);
}
