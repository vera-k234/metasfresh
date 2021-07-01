/*
 * #%L
 * de-metas-camel-alberta-camelroutes
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

package de.metas.camel.externalsystems.alberta.patient;

import de.metas.common.bpartner.v2.response.JsonResponseBPartnerCompositeUpsertItem;
import de.metas.common.rest_api.common.JsonMetasfreshId;
import io.swagger.client.api.DoctorApi;
import io.swagger.client.api.HospitalApi;
import io.swagger.client.api.NursingHomeApi;
import io.swagger.client.api.NursingServiceApi;
import io.swagger.client.api.PatientApi;
import io.swagger.client.api.PayerApi;
import io.swagger.client.api.PharmacyApi;
import io.swagger.client.api.UserApi;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class GetPatientsRouteContext
{
	@NonNull
	private final PatientApi patientApi;

	@NonNull
	private final DoctorApi doctorApi;

	@NonNull
	private final NursingHomeApi nursingHomeApi;

	@NonNull
	private final NursingServiceApi nursingServiceApi;

	@NonNull
	private final HospitalApi hospitalApi;

	@NonNull
	private final PayerApi payerApi;

	@NonNull
	private final PharmacyApi pharmacyApi;

	@NonNull
	private final UserApi userApi;

	@NonNull
	private final AlbertaConnectionDetails albertaConnectionDetails;

	@Nullable
	private final JsonMetasfreshId rootBPartnerIdForUsers;

	private final List<JsonResponseBPartnerCompositeUpsertItem> importedBPartnerResponseList = new ArrayList<>();

	public void addResponseItems(@NonNull final List<JsonResponseBPartnerCompositeUpsertItem> responseBPartnerCompositeUpsertItems)
	{
		importedBPartnerResponseList.addAll(responseBPartnerCompositeUpsertItems);
	}

	public void removeAllResponseItems()
	{
		importedBPartnerResponseList.clear();
	}
}
