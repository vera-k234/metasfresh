/*
 * #%L
 * de.metas.adempiere.adempiere.base
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

package de.metas.process;

import de.metas.util.lang.ReferenceListAwareEnum;
import de.metas.util.lang.ReferenceListAwareEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.compiere.model.X_AD_Process;

@AllArgsConstructor
public enum SpreadsheetFormat implements ReferenceListAwareEnum
{
	Excel(X_AD_Process.SPREADSHEETFORMAT_Excel),
	CSV(X_AD_Process.SPREADSHEETFORMAT_CSV),
	;

	private static final ReferenceListAwareEnums.ValuesIndex<SpreadsheetFormat> index = ReferenceListAwareEnums.index(values());

	@Getter
	String code;

	public static SpreadsheetFormat ofCode(@NonNull final String code)
	{
		return index.ofCode(code);
	}

	public static SpreadsheetFormat ofNullableCode(final String code)
	{
		return index.ofNullableCode(code);
	}

	public boolean isFormatExcelFile()
	{
		return this == Excel;
	}

}
