package de.metas.adempiere.service;

/*
 * #%L
 * de.metas.swat.base
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

import java.util.List;

import de.metas.adempiere.model.I_AD_Printer;
import de.metas.util.ISingletonService;
import de.metas.adempiere.model.I_AD_PrinterRouting;
import lombok.NonNull;

import javax.annotation.Nullable;

public interface IPrinterRoutingDAO extends ISingletonService
{
	/**
	 * @return the matching records that have the smallest (common) SeqNo.
	 */
	List<I_AD_PrinterRouting> fetchPrinterRoutings(@NonNull PrinterRoutingsQuery query);

	@Nullable
	I_AD_Printer findPrinterByName(@Nullable String printerName);

}
