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

package de.metas.bpartner.process;

import de.metas.util.lang.ReferenceListAwareEnum;
import de.metas.util.lang.ReferenceListAwareEnums;
import lombok.Getter;
import lombok.NonNull;

import javax.annotation.Nullable;

public enum SetCreditStatusEnum implements ReferenceListAwareEnum
{

	CreditStop("S"),
	CreditOK("O"),
	Calculate("U");

	@Getter
	private final String code;

	SetCreditStatusEnum(@NonNull final String code)
	{
		this.code = code;
	}

	public static SetCreditStatusEnum ofCode(@NonNull final String code)
	{
		return index.ofCode(code);
	}

	@Nullable
	public static SetCreditStatusEnum ofNullableCode(@Nullable final String code)
	{
		return index.ofNullableCode(code);
	}

	private static final ReferenceListAwareEnums.ValuesIndex<SetCreditStatusEnum> index = ReferenceListAwareEnums.index(values());
}
