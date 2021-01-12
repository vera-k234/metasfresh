package de.metas.ui.web.pporder.process;

import static de.metas.ui.web.handlingunits.WEBUI_HU_Constants.MSG_WEBUI_SELECT_ACTIVE_UNSELECTED_HU;

import java.util.List;
import java.util.stream.Stream;

import org.adempiere.exceptions.AdempiereException;

import com.google.common.collect.ImmutableList;

import de.metas.handlingunits.model.I_M_HU;
import de.metas.handlingunits.pporder.api.IHUPPOrderBL;
import de.metas.i18n.IMsgBL;
import de.metas.i18n.ITranslatableString;
import org.eevolution.api.PPOrderId;
import de.metas.process.IProcessPrecondition;
import de.metas.process.ProcessPreconditionsResolution;
import de.metas.ui.web.handlingunits.HUEditorRow;
import de.metas.ui.web.handlingunits.HUEditorRowFilter;
import de.metas.ui.web.handlingunits.HUEditorRowFilter.Select;
import de.metas.ui.web.handlingunits.HUEditorView;
import de.metas.ui.web.pporder.PPOrderLinesView;
import de.metas.util.Services;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2017 metas GmbH
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

public class WEBUI_PP_Order_HUEditor_IssueTopLevelHUs
		extends WEBUI_PP_Order_HUEditor_ProcessBase
		implements IProcessPrecondition
{
	@Override
	public final ProcessPreconditionsResolution checkPreconditionsApplicable()
	{
		final boolean anyHuMatches = retrieveSelectedAndEligibleHUEditorRows()
				.anyMatch(huRow -> huRow.isTopLevel());
		if (anyHuMatches)
		{
			return ProcessPreconditionsResolution.accept();
		}

		final ITranslatableString reason = Services.get(IMsgBL.class).getTranslatableMsgText(MSG_WEBUI_SELECT_ACTIVE_UNSELECTED_HU);
		return ProcessPreconditionsResolution.reject(reason);
	}

	@Override
	protected String doIt()
	{
		final Stream<HUEditorRow> selectedTopLevelHuRows = streamSelectedRows(HUEditorRowFilter.select(Select.ONLY_TOPLEVEL));

		final List<I_M_HU> hus = retrieveEligibleHUEditorRows(selectedTopLevelHuRows)
				.map(HUEditorRow::getM_HU)
				.collect(ImmutableList.toImmutableList());
		if (hus.isEmpty())
		{
			throw new AdempiereException("@NoSelection@");
		}

		final PPOrderLinesView ppOrderView = getPPOrderView().get();
		final PPOrderId ppOrderId = ppOrderView.getPpOrderId();

		Services.get(IHUPPOrderBL.class)
				.createIssueProducer(ppOrderId)
				.createIssues(hus);

		final HUEditorView huEditorView = getView();
		huEditorView.removeHUsAndInvalidate(hus);

		ppOrderView.invalidateAll();

		return MSG_OK;
	}

}
