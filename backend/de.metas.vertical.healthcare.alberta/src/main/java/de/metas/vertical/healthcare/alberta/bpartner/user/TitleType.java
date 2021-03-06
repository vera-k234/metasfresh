/*
 * #%L
 * de.metas.vertical.healthcare.alberta
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

package de.metas.vertical.healthcare.alberta.bpartner.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import de.metas.util.Check;
import de.metas.util.lang.ReferenceListAwareEnum;
import de.metas.vertical.healthcare.alberta.model.X_AD_User_Alberta;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.adempiere.exceptions.AdempiereException;

import javax.annotation.Nullable;
import java.util.Arrays;

@AllArgsConstructor
public enum TitleType implements ReferenceListAwareEnum
{
	Unbekannt(X_AD_User_Alberta.TITLE_Unbekannt),
	Dr(X_AD_User_Alberta.TITLE_Dr),
	ProfDr(X_AD_User_Alberta.TITLE_ProfDr),
	DiplIng(X_AD_User_Alberta.TITLE_DiplIng),
	DiplMed(X_AD_User_Alberta.TITLE_DiplMed),
	DiplPsych(X_AD_User_Alberta.TITLE_DiplPsych),
	DrDr(X_AD_User_Alberta.TITLE_DrDr),
	DrMed(X_AD_User_Alberta.TITLE_DrMed),
	ProfDrDr(X_AD_User_Alberta.TITLE_ProfDrDr),
	Prof(X_AD_User_Alberta.TITLE_Prof),
	ProfDrMed(X_AD_User_Alberta.TITLE_ProfDrMed),
	Rechtsanwalt(X_AD_User_Alberta.TITLE_Rechtsanwalt),
	Rechtsanwaeltin(X_AD_User_Alberta.TITLE_Rechtsanwaeltin),
	SchwesterOrden(X_AD_User_Alberta.TITLE_SchwesterOrden),
	;
	private final String code;

	@Override
	public String getCode()
	{
		return code;
	}

	@Nullable
	public static TitleType ofCodeNullable(@Nullable final String code)
	{
		if (Check.isBlank(code))
		{
			return null;
		}

		return ofCode(code);
	}

	@JsonCreator
	public static TitleType ofCode(@NonNull final String code)
	{
		final TitleType type = typesByCode.get(code);
		if (type == null)
		{
			throw new AdempiereException("No " + TitleType.class + " found for code: " + code);
		}
		return type;
	}

	private static final ImmutableMap<String, TitleType> typesByCode = Maps.uniqueIndex(Arrays.asList(values()), TitleType::getCode);
}
