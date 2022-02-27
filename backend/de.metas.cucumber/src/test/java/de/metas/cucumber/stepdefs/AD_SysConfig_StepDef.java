/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2022 metas GmbH
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

package de.metas.cucumber.stepdefs;

import de.metas.cache.CacheMgt;
import de.metas.util.Services;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import lombok.NonNull;
import org.adempiere.service.ClientId;
import org.adempiere.service.ISysConfigBL;
import org.compiere.model.I_AD_SysConfig;
import org.compiere.model.I_AD_User;

import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class AD_SysConfig_StepDef
{
	private final ISysConfigBL sysConfigBL = Services.get(ISysConfigBL.class);

	private final StepDefData<I_AD_User> userTable;

	public AD_SysConfig_StepDef(@NonNull final StepDefData<I_AD_User> userTable)
	{
		this.userTable = userTable;
	}

	@And("enable sys config {string}")
	public void enable_sys_config(@NonNull final String sysConfigName)
	{
		setSysConfigBoolValue(sysConfigName, true);
	}

	@And("disable sys config {string}")
	public void disable_sys_config(@NonNull final String sysConfigName)
	{
		setSysConfigBoolValue(sysConfigName, false);
	}

	@And("update AD_SysConfig with login AD_User_ID")
	public void set_sysConfig_login_user(@NonNull final DataTable dataTable)
	{
		for (final Map<String, String> row : dataTable.asMaps())
		{
			final String name = DataTableUtil.extractStringForColumnName(row, I_AD_SysConfig.COLUMNNAME_Name);

			final String userIdentifier = DataTableUtil.extractStringForColumnName(row, I_AD_User.COLUMNNAME_AD_User_ID + "." + StepDefConstants.TABLECOLUMN_IDENTIFIER);
			final I_AD_User user = userTable.get(userIdentifier);
			assertThat(user).isNotNull();

			setSysConfigIntValue(name, user.getAD_User_ID());
		}
	}

	@And("update AD_SysConfig int value")
	public void set_sysConfig_int_value(@NonNull final DataTable dataTable)
	{
		for (final Map<String, String> row : dataTable.asMaps())
		{
			final String name = DataTableUtil.extractStringForColumnName(row, I_AD_SysConfig.COLUMNNAME_Name);
			final int value = DataTableUtil.extractIntForColumnName(row, I_AD_SysConfig.COLUMNNAME_Value);

			setSysConfigIntValue(name, value);
		}
	}

	@And("reset all cache")
	public void reset_cache()
	{
		CacheMgt.get().reset();
	}

	private void setSysConfigIntValue(@NonNull final String name, final int value)
	{
		sysConfigBL.setValue(name, value, ClientId.SYSTEM, StepDefConstants.ORG_ID_SYSTEM);
	}

	private void setSysConfigBoolValue(@NonNull final String name, final boolean value)
	{
		sysConfigBL.setValue(name, value, ClientId.SYSTEM, StepDefConstants.ORG_ID_SYSTEM);
	}
}
