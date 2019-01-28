package de.metas.ui.web.window.descriptor.factory.dataentry;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

import de.metas.dataentry.DataEntryField;
import de.metas.dataentry.DataEntryField.Type;
import de.metas.dataentry.DataEntryFieldId;
import de.metas.dataentry.DataEntryGroup;
import de.metas.dataentry.DataEntryGroupId;
import de.metas.dataentry.DataEntrySubGroup;
import de.metas.dataentry.DataEntrySubGroupId;
import de.metas.i18n.ImmutableTranslatableString;
import de.metas.ui.web.window.datatypes.WindowId;
import de.metas.ui.web.window.datatypes.json.JSONDocumentLayoutTab;
import de.metas.ui.web.window.datatypes.json.JSONOptions;
import de.metas.ui.web.window.descriptor.DocumentEntityDescriptor;
import de.metas.ui.web.window.descriptor.DocumentLayoutDetailDescriptor;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2019 metas GmbH
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

public class DataEntryTabLoaderTest
{

	private JSONOptions jsonOptions;

	@Before
	public void init()
	{
		jsonOptions = JSONOptions.builder(null).setAD_LanguageIfNotEmpty("en_US").build();
	}

	@Test
	public void createLayoutDescriptors()
	{
		final DataEntryGroup dataEntryGroup = createSimpleDataEntryGroup();

		final List<DocumentLayoutDetailDescriptor> descriptors = new DataEntryTabLoader(5, WindowId.of(5))
				.createLayoutDescriptors(ImmutableList.of(dataEntryGroup));

		assertThat(descriptors).hasSize(1);
		assertThat(descriptors.isEmpty()).isFalse();

		final List<JSONDocumentLayoutTab> jsonTabs = JSONDocumentLayoutTab.ofList(descriptors, jsonOptions);
		assertThat(jsonTabs).hasSize(1);
	}

	@Test
	public void createGroupEntityDescriptors()
	{
		final DataEntryGroup dataEntryGroup = createSimpleDataEntryGroup();

		final List<DocumentEntityDescriptor> descriptors = new DataEntryTabLoader(5, WindowId.of(5))
				.createGroupEntityDescriptors(ImmutableList.of(dataEntryGroup));

		assertThat(descriptors).hasSize(1);
		assertThat(descriptors.isEmpty()).isFalse();

	}

	private DataEntryGroup createSimpleDataEntryGroup()
	{
		final DataEntryGroup dataEntryGroup = DataEntryGroup
				.builder()
				.id(DataEntryGroupId.ofRepoId(10))
				.internalName("dataEntryGroup_internalName")
				.name(ImmutableTranslatableString.constant("dataEntryGroup_name"))
				.description(ImmutableTranslatableString.constant("dataEntryGroup_description"))
				.dataEntrySubGroup(DataEntrySubGroup.builder()
						.id(DataEntrySubGroupId.ofRepoId(20))
						.internalName("dataEntrySubGroup_internalName")
						.name(ImmutableTranslatableString.constant("dataEntrySubGroup_name"))
						.description(ImmutableTranslatableString.constant("dataEntrySubGroup_description"))
						.dataEntryField(DataEntryField.builder()
								.id(DataEntryFieldId.ofRepoId(31))
								.caption(ImmutableTranslatableString.constant("dataEntryField1_name"))
								.description(ImmutableTranslatableString.constant("dataEntryField1_description"))
								.type(Type.STRING)
								.build())
						.dataEntryField(DataEntryField.builder()
								.id(DataEntryFieldId.ofRepoId(32))
								.caption(ImmutableTranslatableString.constant("dataEntryField2_name"))
								.description(ImmutableTranslatableString.constant("dataEntryField2_description"))
								.type(Type.NUMBER)
								.build())
						.dataEntryField(DataEntryField.builder()
								.id(DataEntryFieldId.ofRepoId(33))
								.caption(ImmutableTranslatableString.constant("dataEntryField3_name"))
								.description(ImmutableTranslatableString.constant("dataEntryField3_description"))
								.type(Type.DATE)
								.build())
						.dataEntryField(DataEntryField.builder()
								.id(DataEntryFieldId.ofRepoId(34))
								.caption(ImmutableTranslatableString.constant("dataEntryField4_name"))
								.description(ImmutableTranslatableString.constant("dataEntryField4_description"))
								.type(Type.YESNO)
								.build())

						// TODO make it work for lists!
//						.dataEntryField(DataEntryField.builder()
//								.id(DataEntryFieldId.ofRepoId(35))
//								.caption(ImmutableTranslatableString.constant("dataEntryField5_name"))
//								.description(ImmutableTranslatableString.constant("dataEntryField5_description"))
//								.type(Type.LIST)
//								.listValue(new DataEntryListValue(
//										ImmutableTranslatableString.constant("listValue_name"),
//										ImmutableTranslatableString.constant("listValue_description")))
//								.build())
						.build())
				.build();
		return dataEntryGroup;
	}

}
