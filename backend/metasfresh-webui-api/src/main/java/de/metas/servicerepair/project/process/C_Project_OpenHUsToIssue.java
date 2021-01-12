/*
 * #%L
 * metasfresh-webui-api
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

package de.metas.servicerepair.project.process;

import com.google.common.collect.ImmutableSet;
import de.metas.process.IProcessPrecondition;
import de.metas.process.IProcessPreconditionsContext;
import de.metas.process.ProcessExecutionResult;
import de.metas.process.ProcessPreconditionsResolution;
import de.metas.project.ProjectAndLineId;
import de.metas.project.ProjectId;
import de.metas.project.ProjectLine;
import de.metas.servicerepair.project.hu_to_issue.HUsToIssueViewFactory;
import de.metas.ui.web.view.IView;
import de.metas.ui.web.view.IViewsRepository;
import lombok.NonNull;
import org.compiere.SpringContextHolder;

public class C_Project_OpenHUsToIssue
		extends ServiceOrRepairProjectBasedProcess
		implements IProcessPrecondition
{
	private final IViewsRepository viewsRepository = SpringContextHolder.instance.getBean(IViewsRepository.class);
	private final HUsToIssueViewFactory husToIssueViewFactory = SpringContextHolder.instance.getBean(HUsToIssueViewFactory.class);

	@Override
	public ProcessPreconditionsResolution checkPreconditionsApplicable(final @NonNull IProcessPreconditionsContext context)
	{
		final ProjectId projectId = ProjectId.ofRepoIdOrNull(context.getSingleSelectedRecordId());
		if (projectId == null)
		{
			return ProcessPreconditionsResolution.rejectBecauseNotSingleSelection().toInternal();
		}

		final ImmutableSet<ProjectAndLineId> projectLineIds = getSelectedProjectLineIds(context);
		if (projectLineIds.size() != 1)
		{
			return ProcessPreconditionsResolution.rejectWithInternalReason("one and only one project line shall be selected");
		}

		return checkIsServiceOrRepairProject(projectId);
	}

	@Override
	protected String doIt()
	{
		final ProjectAndLineId projectLineId = getSingleSelectedProjectLineId();

		final ProjectLine projectLine = projectService.getLineById(projectLineId);

		final IView view = viewsRepository.createView(husToIssueViewFactory.createViewRequest(projectLine));

		getResult().setWebuiViewToOpen(ProcessExecutionResult.WebuiViewToOpen.builder()
				.viewId(view.getViewId().toJson())
				.target(ProcessExecutionResult.ViewOpenTarget.ModalOverlay)
				.build());

		return MSG_OK;
	}
}
