package de.metas.ui.web.window.exceptions;

import lombok.NonNull;
import org.adempiere.exceptions.AdempiereException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Nullable;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2016 metas GmbH
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

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class DocumentFieldReadonlyException extends AdempiereException
{
	public DocumentFieldReadonlyException(@NonNull final String fieldName, @Nullable final Object value)
	{
		super(buildMsg(fieldName, value));
	}

	private static String buildMsg(@NonNull final String fieldName, @Nullable final Object value)
	{
		return "Changing " + fieldName + " to '" + value + "' is not allowed because the field is readonly";
	}
}
