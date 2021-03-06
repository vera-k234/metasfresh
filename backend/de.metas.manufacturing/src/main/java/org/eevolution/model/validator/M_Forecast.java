package org.eevolution.model.validator;

/*
 * #%L
 * de.metas.adempiere.libero.libero
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


import de.metas.distribution.ddorder.lowlevel.DDOrderLowLevelService;
import org.adempiere.ad.modelvalidator.annotations.Interceptor;
import org.adempiere.ad.modelvalidator.annotations.ModelChange;
import org.adempiere.ad.modelvalidator.annotations.Validator;
import org.adempiere.model.InterfaceWrapperHelper;
import org.compiere.model.I_M_Forecast;
import org.compiere.model.ModelValidator;

import de.metas.util.Services;

@Interceptor(I_M_Forecast.class)
public class M_Forecast
{
	private final DDOrderLowLevelService ddOrderLowLevelService;

	public M_Forecast(final DDOrderLowLevelService ddOrderLowLevelService) {this.ddOrderLowLevelService = ddOrderLowLevelService;}

	@ModelChange(timings = ModelValidator.TYPE_AFTER_CHANGE, ifColumnsChanged = I_M_Forecast.COLUMNNAME_Processing)
	public void completeBackwardDDOrders(final I_M_Forecast forecast)
	{
		final boolean wasJustProcessed =
				// Processed
				forecast.isProcessing()
						// Just changed to processed
						&& InterfaceWrapperHelper.isValueChanged(forecast, I_M_Forecast.COLUMNNAME_Processing);

		if (!wasJustProcessed)
		{
			return;
		}

		ddOrderLowLevelService.completeBackwardDDOrders(forecast);
	}
}
