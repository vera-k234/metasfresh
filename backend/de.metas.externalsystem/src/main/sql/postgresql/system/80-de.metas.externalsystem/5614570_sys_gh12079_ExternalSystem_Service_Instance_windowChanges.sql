-- 2021-11-19T11:22:38.817Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_Tab SET IsInsertRecord='N', IsReadOnly='Y',Updated=TO_TIMESTAMP('2021-11-19 13:22:38','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Tab_ID=544883
;

-- 2021-11-19T11:23:19.309Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_Tab SET IsInsertRecord='N', IsReadOnly='Y',Updated=TO_TIMESTAMP('2021-11-19 13:23:19','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Tab_ID=544884
;

-- 2021-11-19T11:23:47.032Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Column (AD_Client_ID,AD_Org_ID,AD_UI_Column_ID,AD_UI_Section_ID,Created,CreatedBy,IsActive,SeqNo,Updated,UpdatedBy) VALUES (0,0,544796,543878,TO_TIMESTAMP('2021-11-19 13:23:46','YYYY-MM-DD HH24:MI:SS'),100,'Y',20,TO_TIMESTAMP('2021-11-19 13:23:46','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:25:23.494Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_ElementGroup (AD_Client_ID,AD_Org_ID,AD_UI_Column_ID,AD_UI_ElementGroup_ID,Created,CreatedBy,IsActive,Name,SeqNo,Updated,UpdatedBy) VALUES (0,0,544795,547257,TO_TIMESTAMP('2021-11-19 13:25:23','YYYY-MM-DD HH24:MI:SS'),100,'Y','infos',20,TO_TIMESTAMP('2021-11-19 13:25:23','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:25:35.520Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Element (AD_Client_ID,AD_Field_ID,AD_Org_ID,AD_Tab_ID,AD_UI_Element_ID,AD_UI_ElementGroup_ID,AD_UI_ElementType,Created,CreatedBy,IsActive,IsAdvancedField,IsAllowFiltering,IsDisplayed,IsDisplayed_SideList,IsDisplayedGrid,IsMultiLine,MultiLine_LinesCount,Name,SeqNo,SeqNo_SideList,SeqNoGrid,Updated,UpdatedBy) VALUES (0,669510,0,544884,595406,547257,'F',TO_TIMESTAMP('2021-11-19 13:25:35','YYYY-MM-DD HH24:MI:SS'),100,'Y','N','N','Y','N','N','N',0,'Message',10,0,0,TO_TIMESTAMP('2021-11-19 13:25:35','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:25:51.760Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Element (AD_Client_ID,AD_Field_ID,AD_Org_ID,AD_Tab_ID,AD_UI_Element_ID,AD_UI_ElementGroup_ID,AD_UI_ElementType,Created,CreatedBy,IsActive,IsAdvancedField,IsAllowFiltering,IsDisplayed,IsDisplayed_SideList,IsDisplayedGrid,IsMultiLine,MultiLine_LinesCount,Name,SeqNo,SeqNo_SideList,SeqNoGrid,Updated,UpdatedBy) VALUES (0,669505,0,544884,595407,547257,'F',TO_TIMESTAMP('2021-11-19 13:25:51','YYYY-MM-DD HH24:MI:SS'),100,'Y','N','N','Y','N','N','N',0,'Probleme',20,0,0,TO_TIMESTAMP('2021-11-19 13:25:51','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:26:03.552Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Element (AD_Client_ID,AD_Field_ID,AD_Org_ID,AD_Tab_ID,AD_UI_Element_ID,AD_UI_ElementGroup_ID,AD_UI_ElementType,Created,CreatedBy,Description,IsActive,IsAdvancedField,IsAllowFiltering,IsDisplayed,IsDisplayed_SideList,IsDisplayedGrid,IsMultiLine,MultiLine_LinesCount,Name,SeqNo,SeqNo_SideList,SeqNoGrid,Updated,UpdatedBy) VALUES (0,669507,0,544884,595408,547257,'F',TO_TIMESTAMP('2021-11-19 13:26:03','YYYY-MM-DD HH24:MI:SS'),100,'Instanz eines Prozesses','Y','N','N','Y','N','N','N',0,'Prozess-Instanz',30,0,0,TO_TIMESTAMP('2021-11-19 13:26:03','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:26:22.883Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Element (AD_Client_ID,AD_Field_ID,AD_Org_ID,AD_Tab_ID,AD_UI_Element_ID,AD_UI_ElementGroup_ID,AD_UI_ElementType,Created,CreatedBy,Description,Help,IsActive,IsAdvancedField,IsAllowFiltering,IsDisplayed,IsDisplayed_SideList,IsDisplayedGrid,IsMultiLine,MultiLine_LinesCount,Name,SeqNo,SeqNo_SideList,SeqNoGrid,Updated,UpdatedBy) VALUES (0,669513,0,544884,595409,547257,'F',TO_TIMESTAMP('2021-11-19 13:26:22','YYYY-MM-DD HH24:MI:SS'),100,'Datum, an dem dieser Eintrag erstellt wurde','Das Feld Erstellt zeigt an, zu welchem Datum dieser Eintrag erstellt wurde.','Y','N','N','Y','N','N','N',0,'Erstellt',40,0,0,TO_TIMESTAMP('2021-11-19 13:26:22','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:26:36.722Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
DELETE FROM AD_UI_Element WHERE AD_UI_Element_ID=595405
;

-- 2021-11-19T11:26:49.950Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_ElementGroup (AD_Client_ID,AD_Org_ID,AD_UI_Column_ID,AD_UI_ElementGroup_ID,Created,CreatedBy,IsActive,Name,SeqNo,Updated,UpdatedBy) VALUES (0,0,544796,547258,TO_TIMESTAMP('2021-11-19 13:26:49','YYYY-MM-DD HH24:MI:SS'),100,'Y','flag',10,TO_TIMESTAMP('2021-11-19 13:26:49','YYYY-MM-DD HH24:MI:SS'),100)
;

/*
 * #%L
 * de.metas.externalsystem
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

-- 2021-11-19T11:27:00.057Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Element (AD_Client_ID,AD_Field_ID,AD_Org_ID,AD_Tab_ID,AD_UI_Element_ID,AD_UI_ElementGroup_ID,AD_UI_ElementType,Created,CreatedBy,Description,Help,IsActive,IsAdvancedField,IsAllowFiltering,IsDisplayed,IsDisplayed_SideList,IsDisplayedGrid,IsMultiLine,MultiLine_LinesCount,Name,SeqNo,SeqNo_SideList,SeqNoGrid,Updated,UpdatedBy) VALUES (0,669512,0,544884,595410,547258,'F',TO_TIMESTAMP('2021-11-19 13:26:59','YYYY-MM-DD HH24:MI:SS'),100,'Der Eintrag ist im System aktiv','Es gibt zwei M??glichkeiten, einen Datensatz nicht mehr verf??gbar zu machen: einer ist, ihn zu l??schen; der andere, ihn zu deaktivieren. Ein deaktivierter Eintrag ist nicht mehr f??r eine Auswahl verf??gbar, aber verf??gbar f??r die Verwendung in Berichten. Es gibt zwei Gr??nde, Datens??tze zu deaktivieren und nicht zu l??schen: (1) Das System braucht den Datensatz f??r Revisionszwecke. (2) Der Datensatz wird von anderen Datens??tzen referenziert. Z.B. k??nnen Sie keinen Gesch??ftspartner l??schen, wenn es Rechnungen f??r diesen Gesch??ftspartner gibt. Sie deaktivieren den Gesch??ftspartner und verhindern, dass dieser Eintrag in zuk??nftigen Vorg??ngen verwendet wird.','Y','N','N','Y','N','N','N',0,'Aktiv',10,0,0,TO_TIMESTAMP('2021-11-19 13:26:59','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:27:09.116Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_ElementGroup (AD_Client_ID,AD_Org_ID,AD_UI_Column_ID,AD_UI_ElementGroup_ID,Created,CreatedBy,IsActive,Name,SeqNo,Updated,UpdatedBy) VALUES (0,0,544796,547259,TO_TIMESTAMP('2021-11-19 13:27:08','YYYY-MM-DD HH24:MI:SS'),100,'Y','org',20,TO_TIMESTAMP('2021-11-19 13:27:08','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:27:25.585Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Element (AD_Client_ID,AD_Field_ID,AD_Org_ID,AD_Tab_ID,AD_UI_Element_ID,AD_UI_ElementGroup_ID,AD_UI_ElementType,Created,CreatedBy,Description,Help,IsActive,IsAdvancedField,IsAllowFiltering,IsDisplayed,IsDisplayed_SideList,IsDisplayedGrid,IsMultiLine,MultiLine_LinesCount,Name,SeqNo,SeqNo_SideList,SeqNoGrid,Updated,UpdatedBy) VALUES (0,669506,0,544884,595411,547259,'F',TO_TIMESTAMP('2021-11-19 13:27:25','YYYY-MM-DD HH24:MI:SS'),100,'Organisatorische Einheit des Mandanten','Eine Organisation ist ein Bereich ihres Mandanten - z.B. Laden oder Abteilung. Sie k??nnen Daten ??ber Organisationen hinweg gemeinsam verwenden.','Y','N','N','Y','N','N','N',0,'Sektion',10,0,0,TO_TIMESTAMP('2021-11-19 13:27:25','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:27:33.425Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_UI_Element (AD_Client_ID,AD_Field_ID,AD_Org_ID,AD_Tab_ID,AD_UI_Element_ID,AD_UI_ElementGroup_ID,AD_UI_ElementType,Created,CreatedBy,Description,Help,IsActive,IsAdvancedField,IsAllowFiltering,IsDisplayed,IsDisplayed_SideList,IsDisplayedGrid,IsMultiLine,MultiLine_LinesCount,Name,SeqNo,SeqNo_SideList,SeqNoGrid,Updated,UpdatedBy) VALUES (0,669504,0,544884,595412,547259,'F',TO_TIMESTAMP('2021-11-19 13:27:33','YYYY-MM-DD HH24:MI:SS'),100,'Mandant f??r diese Installation.','Ein Mandant ist eine Firma oder eine juristische Person. Sie k??nnen keine Daten ??ber Mandanten hinweg verwenden. .','Y','N','N','Y','N','N','N',0,'Mandant',20,0,0,TO_TIMESTAMP('2021-11-19 13:27:33','YYYY-MM-DD HH24:MI:SS'),100)
;

-- 2021-11-19T11:28:26.312Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_UI_Element SET IsDisplayedGrid='Y', SeqNoGrid=30,Updated=TO_TIMESTAMP('2021-11-19 13:28:26','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_UI_Element_ID=595409
;

-- 2021-11-19T11:29:16.897Z
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_Field SET IsDisplayedGrid='Y',Updated=TO_TIMESTAMP('2021-11-19 13:29:16','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=669513
;

