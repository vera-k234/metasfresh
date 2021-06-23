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

package de.metas.bpartner.related_changes;

public enum BPartnerRelatedChangeType
{
	;

	public static final String SUBSCRIPTIONACTIONTYPE_Cancel = "C";
	public static final String SUBSCRIPTIONACTIONTYPE_Suspend = "S";
	public static final String SUBSCRIPTIONACTIONTYPE_TemporaryAddress = "T";
	public static final String SUBSCRIPTIONACTIONTYPE_ChangeBillPartner = "I";
	public static final String SUBSCRIPTIONACTIONTYPE_PriceChange = "P";
}
