/*
 * #%L
 * de.metas.contracts
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

package de.metas.contracts.commission.commissioninstance.services;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import de.metas.contracts.FlatrateTermId;
import de.metas.contracts.commission.commissioninstance.businesslogic.CommissionConfig;

public interface ICommissionConfigFactory
{
	ImmutableList<CommissionConfig> createForNewCommissionInstances(CommissionConfigProvider.ConfigRequestForNewInstance contractRequest);

	ImmutableMap<FlatrateTermId, CommissionConfig> createForExistingInstance(CommissionConfigProvider.ConfigRequestForExistingInstance commissionConfigRequest);

	boolean appliesFor(CommissionConfigProvider.ConfigRequestForNewInstance contractRequest);

	boolean isFurtherSearchForConfigTypesAllowed();

	CommissionConfigPriority getPriority();
}
