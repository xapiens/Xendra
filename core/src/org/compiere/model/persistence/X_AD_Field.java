/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software. you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model.persistence;

/** Generated Model - DO NOT CHANGE */
import org.compiere.model.*;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.xendra.annotations.*;
import org.compiere.util.*;
import org.compiere.model.reference.REF__YesNo;
import org.compiere.model.reference.REF_AD_FieldObscureType;
/** Generated Model for AD_Field
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Field extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Field_ID id
@param trxName transaction
*/
public X_AD_Field (Properties ctx, int AD_Field_ID, String trxName)
{
super (ctx, AD_Field_ID, trxName);
/** if (AD_Field_ID == 0)
{
setAD_Column_ID (0);
setAD_Field_ID (0);
setAD_Tab_ID (0);
setEntityType (null);	
// U
setIsCentrallyMaintained (true);	
// Y
setIsDisplayed (true);	
// Y
setIsEncrypted (false);	
// N
setIsFieldOnly (false);	
// N
setIsHeading (false);	
// N
setIsReadOnly (false);	
// N
setIsSameLine (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Field (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=107 */
public static int Table_ID=MTable.getTable_ID("AD_Field");

@XendraTrl(Identifier="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569")
public static String es_PE_TAB_FieldSequence_Description="Secuencia de los campos en una pestaña";

@XendraTrl(Identifier="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569")
public static String es_PE_TAB_FieldSequence_Name="Secuencia de Campos";

@XendraTab(Name="Field Sequence",Description="Sequence if the Fields in a Tab",Help="",
AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",SeqNo=60,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="a093bcde-2eae-9f53-dbe5-68d241ea5dfa",
AD_ColumnSortYesNo_ID="ad5da716-c54d-794f-361d-d324dbe131bc",IsSortTab=true,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FieldSequence="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569";

@XendraTrl(Identifier="7f8d217e-6d6a-339b-e946-58bae65bed6b")
public static String es_PE_TAB_Field_Description="Definición de Campos dentro de pestañas de Ventanas";

@XendraTrl(Identifier="7f8d217e-6d6a-339b-e946-58bae65bed6b")
public static String es_PE_TAB_Field_Name="Campo";

@XendraTrl(Identifier="7f8d217e-6d6a-339b-e946-58bae65bed6b")
public static String es_PE_TAB_Field_Help="La pestaña de Campos define los campos desplegados dentro de cada pestaña. Los cambios que se hagan a la pestaña de campos solo serán visibles despues de volver a entrar en el sistema.";

@XendraTab(Name="Field",Description="Field definitions in tabs in windows",
Help="The Field Tab defines the Fields displayed within a tab.  Changes made to the Field Tab become visible after restart due to caching. If the Sequence is negative, the record are ordered descending. Note that the name, description and help is automatically synchronized if centrally maintained.",
AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",SeqNo=70,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="AD_Field.IsDisplayed='Y'",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7f8d217e-6d6a-339b-e946-58bae65bed6b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Field="7f8d217e-6d6a-339b-e946-58bae65bed6b";

@XendraTrl(Identifier="5ce7c99b-d152-22e5-dce9-d99df0a80589")
public static String es_PE_TABLE_AD_Field_Name="Campo";

@XendraTable(Name="Field",Description="Field on a database table",Help="",TableName="AD_Field",
AccessLevel="4",AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="5ce7c99b-d152-22e5-dce9-d99df0a80589",Synchronized="2017-08-16 11:40:13.0")
/** TableName=AD_Field */
public static final String Table_Name="AD_Field";


@XendraIndex(Name="ad_field_column",Identifier="30f08f14-6c05-9b11-1deb-e42cfb26e177",
Column_Names="ad_tab_id, ad_column_id",IsUnique="true",
TableIdentifier="30f08f14-6c05-9b11-1deb-e42cfb26e177",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_field_column = "30f08f14-6c05-9b11-1deb-e42cfb26e177";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Field");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
  if (Table_ID == 0)
    Table_ID = MTable.getTable_ID("AD_Field");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Field[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="42d307e2-c28c-7cfd-23b6-9e64383c521d")
public static String es_PE_FIELD_Field_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="42d307e2-c28c-7cfd-23b6-9e64383c521d")
public static String es_PE_FIELD_Field_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="42d307e2-c28c-7cfd-23b6-9e64383c521d")
public static String es_PE_FIELD_Field_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42d307e2-c28c-7cfd-23b6-9e64383c521d")
public static final String FIELDNAME_Field_Column="42d307e2-c28c-7cfd-23b6-9e64383c521d";

@XendraTrl(Identifier="71d02ee1-5267-49c2-bd36-71775f53a251")
public static String es_PE_FIELD_FieldSequence_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="71d02ee1-5267-49c2-bd36-71775f53a251")
public static String es_PE_FIELD_FieldSequence_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="71d02ee1-5267-49c2-bd36-71775f53a251")
public static String es_PE_FIELD_FieldSequence_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="71d02ee1-5267-49c2-bd36-71775f53a251")
public static final String FIELDNAME_FieldSequence_Column="71d02ee1-5267-49c2-bd36-71775f53a251";

@XendraTrl(Identifier="cb82664e-87a6-0ecf-9fc9-ed2d5f12427d")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cb82664e-87a6-0ecf-9fc9-ed2d5f12427d",Synchronized="2017-08-05 16:52:30.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Field Group.
@param AD_FieldGroup_ID Logical grouping of fields */
public void setAD_FieldGroup_ID (int AD_FieldGroup_ID)
{
if (AD_FieldGroup_ID <= 0) set_Value (COLUMNNAME_AD_FieldGroup_ID, null);
 else 
set_Value (COLUMNNAME_AD_FieldGroup_ID, Integer.valueOf(AD_FieldGroup_ID));
}
/** Get Field Group.
@return Logical grouping of fields */
public int getAD_FieldGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_FieldGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8200d64e-d3b8-ad63-da09-31967c0237af")
public static String es_PE_FIELD_Field_FieldGroup_Description="Agrupación Lógica del campo";

@XendraTrl(Identifier="8200d64e-d3b8-ad63-da09-31967c0237af")
public static String es_PE_FIELD_Field_FieldGroup_Help="El grupo del campo indica el grupo lógico al que este campo pertenece (Historia; Totales; Cantidades)";

@XendraTrl(Identifier="8200d64e-d3b8-ad63-da09-31967c0237af")
public static String es_PE_FIELD_Field_FieldGroup_Name="Grupo del Campo";

@XendraField(AD_Column_ID="AD_FieldGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8200d64e-d3b8-ad63-da09-31967c0237af")
public static final String FIELDNAME_Field_FieldGroup="8200d64e-d3b8-ad63-da09-31967c0237af";

@XendraTrl(Identifier="e465460b-7811-91ef-1dbd-c1b16c6d5a8f")
public static String es_PE_COLUMN_AD_FieldGroup_ID_Name="Grupo del Campo";

@XendraColumn(AD_Element_ID="a5a39854-6e5d-0e7d-d616-199d5ccf9a25",ColumnName="AD_FieldGroup_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e465460b-7811-91ef-1dbd-c1b16c6d5a8f",
Synchronized="2017-08-05 16:52:30.0")
/** Column name AD_FieldGroup_ID */
public static final String COLUMNNAME_AD_FieldGroup_ID = "AD_FieldGroup_ID";
/** Set Field.
@param AD_Field_ID Field on a database table */
public void setAD_Field_ID (int AD_Field_ID)
{
if (AD_Field_ID < 1) throw new IllegalArgumentException ("AD_Field_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Field_ID, Integer.valueOf(AD_Field_ID));
}
/** Get Field.
@return Field on a database table */
public int getAD_Field_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Field_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1d90dc9f-0a12-1aba-d6df-b5dc88944799")
public static String es_PE_FIELD_Field_Field_Description="Campo en una base de datos";

@XendraTrl(Identifier="1d90dc9f-0a12-1aba-d6df-b5dc88944799")
public static String es_PE_FIELD_Field_Field_Help="El Campo identifica un campo en una tabla de base de datos";

@XendraTrl(Identifier="1d90dc9f-0a12-1aba-d6df-b5dc88944799")
public static String es_PE_FIELD_Field_Field_Name="Campo";
@XendraField(AD_Column_ID="AD_Field_ID",
IsCentrallyMaintained=true,AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1d90dc9f-0a12-1aba-d6df-b5dc88944799")
public static final String FIELDNAME_Field_Field="1d90dc9f-0a12-1aba-d6df-b5dc88944799";

@XendraTrl(Identifier="7ed8fab3-6f53-4021-adb2-a9a39970dcf5")
public static String es_PE_FIELD_FieldSequence_Field_Description="Campo en una base de datos";

@XendraTrl(Identifier="7ed8fab3-6f53-4021-adb2-a9a39970dcf5")
public static String es_PE_FIELD_FieldSequence_Field_Help="El Campo identifica un campo en una tabla de base de datos";

@XendraTrl(Identifier="7ed8fab3-6f53-4021-adb2-a9a39970dcf5")
public static String es_PE_FIELD_FieldSequence_Field_Name="Campo";

@XendraField(AD_Column_ID="AD_Field_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="7ed8fab3-6f53-4021-adb2-a9a39970dcf5")
public static final String FIELDNAME_FieldSequence_Field="7ed8fab3-6f53-4021-adb2-a9a39970dcf5";
/** Column name AD_Field_ID */
public static final String COLUMNNAME_AD_Field_ID = "AD_Field_ID";

/** AD_Reference_ID AD_Reference=17ec718c-707b-498f-3a6c-e81d1630e510 */
public static final int AD_REFERENCE_ID_AD_Reference_ID=1;
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID <= 0) set_Value (COLUMNNAME_AD_Reference_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d0bdb49b-cd60-8d98-43af-cf2b9edd485b")
public static String es_PE_FIELD_Field_ReferenceOverwrite_Description="System Reference - optional Overwrite";

@XendraTrl(Identifier="d0bdb49b-cd60-8d98-43af-cf2b9edd485b")
public static String es_PE_FIELD_Field_ReferenceOverwrite_Help="You can overwrite the Display Type, but only use this if you aware of the consequences.";

@XendraTrl(Identifier="d0bdb49b-cd60-8d98-43af-cf2b9edd485b")
public static String es_PE_FIELD_Field_ReferenceOverwrite_Name="Reference Overwrite";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=false,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0bdb49b-cd60-8d98-43af-cf2b9edd485b")
public static final String FIELDNAME_Field_ReferenceOverwrite="d0bdb49b-cd60-8d98-43af-cf2b9edd485b";

@XendraTrl(Identifier="41e35ab1-33ac-ea86-0f52-d6dcd9c6b724")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="41e35ab1-33ac-ea86-0f52-d6dcd9c6b724",Synchronized="2017-08-05 16:52:30.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="283e2187-80f3-3c39-48f8-9763ee96d6c9")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="283e2187-80f3-3c39-48f8-9763ee96d6c9",Synchronized="2017-08-05 16:52:30.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
/** Set Tab.
@param AD_Tab_ID Tab within a Window */
public void setAD_Tab_ID (int AD_Tab_ID)
{
if (AD_Tab_ID < 1) throw new IllegalArgumentException ("AD_Tab_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Tab_ID, Integer.valueOf(AD_Tab_ID));
}
/** Get Tab.
@return Tab within a Window */
public int getAD_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c573f28f-3fa4-a489-d993-98554d174fb8")
public static String es_PE_FIELD_Field_Tab_Description="Pestaña dentro de una ventana.";

@XendraTrl(Identifier="c573f28f-3fa4-a489-d993-98554d174fb8")
public static String es_PE_FIELD_Field_Tab_Help="La pestaña indica que se despliega dentro de una ventana";

@XendraTrl(Identifier="c573f28f-3fa4-a489-d993-98554d174fb8")
public static String es_PE_FIELD_Field_Tab_Name="Pestaña";
@XendraField(AD_Column_ID="AD_Tab_ID",
IsCentrallyMaintained=true,AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c573f28f-3fa4-a489-d993-98554d174fb8")
public static final String FIELDNAME_Field_Tab="c573f28f-3fa4-a489-d993-98554d174fb8";

@XendraTrl(Identifier="b036e3cc-319f-432a-8cf9-21a4fc8020fe")
public static String es_PE_FIELD_FieldSequence_Tab_Description="Pestaña dentro de una ventana.";

@XendraTrl(Identifier="b036e3cc-319f-432a-8cf9-21a4fc8020fe")
public static String es_PE_FIELD_FieldSequence_Tab_Help="La pestaña indica que se despliega dentro de una ventana";

@XendraTrl(Identifier="b036e3cc-319f-432a-8cf9-21a4fc8020fe")
public static String es_PE_FIELD_FieldSequence_Tab_Name="Pestaña";

@XendraField(AD_Column_ID="AD_Tab_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="b036e3cc-319f-432a-8cf9-21a4fc8020fe")
public static final String FIELDNAME_FieldSequence_Tab="b036e3cc-319f-432a-8cf9-21a4fc8020fe";

@XendraTrl(Identifier="25e1267a-9211-8a34-07b7-bde78d16fd7e")
public static String es_PE_COLUMN_AD_Tab_ID_Name="Pestaña";

@XendraColumn(AD_Element_ID="1a7ad493-6088-5413-1098-1a8061a77e90",ColumnName="AD_Tab_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25e1267a-9211-8a34-07b7-bde78d16fd7e",
Synchronized="2017-08-05 16:52:30.0")
/** Column name AD_Tab_ID */
public static final String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
/** Set Dynamic Validation.
@param AD_Val_Rule_ID Dynamic Validation Rule */
public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
{
if (AD_Val_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
}
/** Get Dynamic Validation.
@return Dynamic Validation Rule */
public int getAD_Val_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6e403af-6be2-f817-f23d-d3d424443a89")
public static String es_PE_COLUMN_AD_Val_Rule_ID_Name="Dynamic Validation";

@XendraColumn(AD_Element_ID="c0a45383-82fd-7e33-a355-80b15115b36b",ColumnName="AD_Val_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6e403af-6be2-f817-f23d-d3d424443a89",
Synchronized="2017-08-05 16:52:30.0")
/** Column name AD_Val_Rule_ID */
public static final String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
/** Set Default Logic.
@param DefaultValue Default value hierarchy, separated by : */
public void setDefaultValue (String DefaultValue)
{
set_Value (COLUMNNAME_DefaultValue, DefaultValue);
}
/** Get Default Logic.
@return Default value hierarchy, separated by : */
public String getDefaultValue() 
{
String value = (String)get_Value(COLUMNNAME_DefaultValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="25d4538f-f655-8de8-87d5-795360793c21")
public static String es_PE_COLUMN_DefaultValue_Name="Default Logic";

@XendraColumn(AD_Element_ID="85c6e06b-cd4c-c419-f8e4-9e93236b9219",ColumnName="DefaultValue",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25d4538f-f655-8de8-87d5-795360793c21",
Synchronized="2017-08-05 16:52:30.0")
/** Column name DefaultValue */
public static final String COLUMNNAME_DefaultValue = "DefaultValue";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="628d7367-975a-9b18-7c05-d14dde6ba44d")
public static String es_PE_FIELD_Field_Description_Description="Observación";

@XendraTrl(Identifier="628d7367-975a-9b18-7c05-d14dde6ba44d")
public static String es_PE_FIELD_Field_Description_Help="Observación";

@XendraTrl(Identifier="628d7367-975a-9b18-7c05-d14dde6ba44d")
public static String es_PE_FIELD_Field_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="628d7367-975a-9b18-7c05-d14dde6ba44d")
public static final String FIELDNAME_Field_Description="628d7367-975a-9b18-7c05-d14dde6ba44d";

@XendraTrl(Identifier="0e9111aa-75e5-a8da-155a-605d840b48e3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e9111aa-75e5-a8da-155a-605d840b48e3",
Synchronized="2017-08-05 16:52:30.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Display Length.
@param DisplayLength Length of the display in characters */
public void setDisplayLength (int DisplayLength)
{
set_Value (COLUMNNAME_DisplayLength, Integer.valueOf(DisplayLength));
}
/** Get Display Length.
@return Length of the display in characters */
public int getDisplayLength() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DisplayLength);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="91e33dd4-b431-6435-86e4-71f56fd28b7a")
public static String es_PE_FIELD_Field_DisplayLength_Description="Longitud del despliegue en caracteres";

@XendraTrl(Identifier="91e33dd4-b431-6435-86e4-71f56fd28b7a")
public static String es_PE_FIELD_Field_DisplayLength_Help="La longitud de despliegue es principalmente para campos de cadena. La longitud no tiene impacto; si el tipo de datos del campo es - Entero; Número; Total (longitud determinada por el sistema) - Si No (Cuadro de Verificación) - Lista; Tabla; Dirección tabla (longitud de cuadros determinadas)";

@XendraTrl(Identifier="91e33dd4-b431-6435-86e4-71f56fd28b7a")
public static String es_PE_FIELD_Field_DisplayLength_Name="Longitud del Despliegue";

@XendraField(AD_Column_ID="DisplayLength",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDisplayed@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="91e33dd4-b431-6435-86e4-71f56fd28b7a")
public static final String FIELDNAME_Field_DisplayLength="91e33dd4-b431-6435-86e4-71f56fd28b7a";

@XendraTrl(Identifier="710928eb-5697-cd76-c188-d42a1f8b0f50")
public static String es_PE_COLUMN_DisplayLength_Name="Longitud del Despliegue";

@XendraColumn(AD_Element_ID="dce6fb37-2aa2-ab65-ac11-c4ce9c6c5d0a",ColumnName="DisplayLength",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="710928eb-5697-cd76-c188-d42a1f8b0f50",
Synchronized="2017-08-05 16:52:30.0")
/** Column name DisplayLength */
public static final String COLUMNNAME_DisplayLength = "DisplayLength";
/** Set Display Logic.
@param DisplayLogic If the Field is displayed, the result determines if the field is actually displayed */
public void setDisplayLogic (String DisplayLogic)
{
set_Value (COLUMNNAME_DisplayLogic, DisplayLogic);
}
/** Get Display Logic.
@return If the Field is displayed, the result determines if the field is actually displayed */
public String getDisplayLogic() 
{
String value = (String)get_Value(COLUMNNAME_DisplayLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1244e0ed-58d2-fd88-e174-9c09788e5f1a")
public static String es_PE_FIELD_Field_DisplayLogic_Description="Si el campo es desplegado; el resultado determina si el campo es efectivamente desplegado";

@XendraTrl(Identifier="1244e0ed-58d2-fd88-e174-9c09788e5f1a")
public static String es_PE_FIELD_Field_DisplayLogic_Help="formato:= <expresion> [<logica> <expresion>] expresion	:= @<contexto>@=<valor> o @<contexto>@!<valor> logica:= <|>|<&>contexto:= cualquier valor global ó de la ventana del contexto		:= secuencia a operadores de la logica:=  Y/O con el previo resultado de izquierda a derecha E";

@XendraTrl(Identifier="1244e0ed-58d2-fd88-e174-9c09788e5f1a")
public static String es_PE_FIELD_Field_DisplayLogic_Name="Despliegue Lógico";

@XendraField(AD_Column_ID="DisplayLogic",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDisplayed@=Y",DisplayLength=60,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1244e0ed-58d2-fd88-e174-9c09788e5f1a")
public static final String FIELDNAME_Field_DisplayLogic="1244e0ed-58d2-fd88-e174-9c09788e5f1a";

@XendraTrl(Identifier="8fcb0c80-53eb-48b2-6f45-b91e1bb56968")
public static String es_PE_COLUMN_DisplayLogic_Name="Despliegue Lógico";

@XendraColumn(AD_Element_ID="fcb60996-c818-2f09-e6c4-b7544353cf56",ColumnName="DisplayLogic",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fcb0c80-53eb-48b2-6f45-b91e1bb56968",
Synchronized="2017-08-05 16:52:30.0")
/** Column name DisplayLogic */
public static final String COLUMNNAME_DisplayLogic = "DisplayLogic";

/** EntityType AD_Reference=fae4ad31-8ff1-5d5c-8d47-2426c541cd74 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="3fd89957-f4b7-044f-a7c5-e6468760f764")
public static String es_PE_FIELD_Field_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="3fd89957-f4b7-044f-a7c5-e6468760f764")
public static String es_PE_FIELD_Field_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="3fd89957-f4b7-044f-a7c5-e6468760f764")
public static String es_PE_FIELD_Field_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fd89957-f4b7-044f-a7c5-e6468760f764")
public static final String FIELDNAME_Field_EntityType="3fd89957-f4b7-044f-a7c5-e6468760f764";

@XendraTrl(Identifier="d37e80a1-9041-411f-8e46-c4f61c576000")
public static String es_PE_FIELD_FieldSequence_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="d37e80a1-9041-411f-8e46-c4f61c576000")
public static String es_PE_FIELD_FieldSequence_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="d37e80a1-9041-411f-8e46-c4f61c576000")
public static String es_PE_FIELD_FieldSequence_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="d37e80a1-9041-411f-8e46-c4f61c576000")
public static final String FIELDNAME_FieldSequence_EntityType="d37e80a1-9041-411f-8e46-c4f61c576000";

@XendraTrl(Identifier="99f84130-fb4b-e6d0-8b77-e7971b646711")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="99f84130-fb4b-e6d0-8b77-e7971b646711",Synchronized="2017-08-05 16:52:30.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="1d6685aa-4894-0318-e4d0-823356af2ebd")
public static String es_PE_FIELD_Field_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="1d6685aa-4894-0318-e4d0-823356af2ebd")
public static String es_PE_FIELD_Field_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="1d6685aa-4894-0318-e4d0-823356af2ebd")
public static String es_PE_FIELD_Field_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1d6685aa-4894-0318-e4d0-823356af2ebd")
public static final String FIELDNAME_Field_CommentHelp="1d6685aa-4894-0318-e4d0-823356af2ebd";

@XendraTrl(Identifier="50dcdcfd-bb18-6dfb-60b3-8163dce0a099")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50dcdcfd-bb18-6dfb-60b3-8163dce0a099",
Synchronized="2017-08-05 16:52:30.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set Hide in list view.
@param HideInListView When checked this field will be hidden by default in list view */
public void setHideInListView (boolean HideInListView)
{
set_Value (COLUMNNAME_HideInListView, Boolean.valueOf(HideInListView));
}
/** Get Hide in list view.
@return When checked this field will be hidden by default in list view */
public boolean isHideInListView() 
{
Object oo = get_Value(COLUMNNAME_HideInListView);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e7c8f488-9187-ad6a-3b32-27412d86a841")
public static String es_PE_FIELD_Field_HideInListView_Description="When checked this field will be hidden by default in list view";

@XendraTrl(Identifier="e7c8f488-9187-ad6a-3b32-27412d86a841")
public static String es_PE_FIELD_Field_HideInListView_Name="Hide in list view";

@XendraField(AD_Column_ID="HideInListView",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7c8f488-9187-ad6a-3b32-27412d86a841")
public static final String FIELDNAME_Field_HideInListView="e7c8f488-9187-ad6a-3b32-27412d86a841";

@XendraTrl(Identifier="d2e77fa8-a496-e17e-58a0-265cf7a816be")
public static String es_PE_COLUMN_HideInListView_Name="Hide in list view";

@XendraColumn(AD_Element_ID="8e849cbb-3083-c74a-2607-625581a88a5d",ColumnName="HideInListView",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=true,Identifier="d2e77fa8-a496-e17e-58a0-265cf7a816be",
Synchronized="2017-08-05 16:52:30.0")
/** Column name HideInListView */
public static final String COLUMNNAME_HideInListView = "HideInListView";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 36)
{
log.warning("Length > 36 - truncated");
Identifier = Identifier.substring(0,35);
}
set_Value (COLUMNNAME_Identifier, Identifier);
}
/** Get Identifier.
@return Identifier */
public String getIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_Identifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="31f78d81-c907-3c41-5512-5c7c3be2687f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31f78d81-c907-3c41-5512-5c7c3be2687f",
Synchronized="2017-08-05 16:52:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Included Tab.
@param Included_Tab_ID Included Tab in this Tab (Master Dateail) */
public void setIncluded_Tab_ID (int Included_Tab_ID)
{
if (Included_Tab_ID <= 0) set_Value (COLUMNNAME_Included_Tab_ID, null);
 else 
set_Value (COLUMNNAME_Included_Tab_ID, Integer.valueOf(Included_Tab_ID));
}
/** Get Included Tab.
@return Included Tab in this Tab (Master Dateail) */
public int getIncluded_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Included_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aeb457e3-50a4-8a03-7da1-bbe5c795c36d")
public static String es_PE_COLUMN_Included_Tab_ID_Name="Included Tab";

@XendraColumn(AD_Element_ID="037f5040-b11d-f7ef-7ff9-611d1192edc0",ColumnName="Included_Tab_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aeb457e3-50a4-8a03-7da1-bbe5c795c36d",
Synchronized="2017-08-05 16:52:30.0")
/** Column name Included_Tab_ID */
public static final String COLUMNNAME_Included_Tab_ID = "Included_Tab_ID";
/** Set InfoFactoryClass.
@param InfoFactoryClass InfoFactoryClass */
public void setInfoFactoryClass (String InfoFactoryClass)
{
if (InfoFactoryClass != null && InfoFactoryClass.length() > 255)
{
log.warning("Length > 255 - truncated");
InfoFactoryClass = InfoFactoryClass.substring(0,254);
}
set_Value (COLUMNNAME_InfoFactoryClass, InfoFactoryClass);
}
/** Get InfoFactoryClass.
@return InfoFactoryClass */
public String getInfoFactoryClass() 
{
String value = (String)get_Value(COLUMNNAME_InfoFactoryClass);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="27bb0c42-a18f-f13b-9fb7-1ba68c3d67a6")
public static String es_PE_COLUMN_InfoFactoryClass_Name="InfoFactoryClass";

@XendraColumn(AD_Element_ID="b5b3ea5a-b643-cadc-a98b-d0c27368b16c",ColumnName="InfoFactoryClass",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27bb0c42-a18f-f13b-9fb7-1ba68c3d67a6",
Synchronized="2017-08-05 16:52:30.0")
/** Column name InfoFactoryClass */
public static final String COLUMNNAME_InfoFactoryClass = "InfoFactoryClass";
/** Set Centrally maintained.
@param IsCentrallyMaintained Information maintained in System Element table */
public void setIsCentrallyMaintained (boolean IsCentrallyMaintained)
{
set_Value (COLUMNNAME_IsCentrallyMaintained, Boolean.valueOf(IsCentrallyMaintained));
}
/** Get Centrally maintained.
@return Information maintained in System Element table */
public boolean isCentrallyMaintained() 
{
Object oo = get_Value(COLUMNNAME_IsCentrallyMaintained);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="98b6eff6-2cfa-0541-a896-da48d2180b95")
public static String es_PE_FIELD_Field_CentrallyMaintained_Description="Información mantenida en la tabla elementos de sistema.";

@XendraTrl(Identifier="98b6eff6-2cfa-0541-a896-da48d2180b95")
public static String es_PE_FIELD_Field_CentrallyMaintained_Help="El cuadro de verificación mantenido centralmente indica si el nombre; descripción y ayuda son mantenidos centralmente.";

@XendraTrl(Identifier="98b6eff6-2cfa-0541-a896-da48d2180b95")
public static String es_PE_FIELD_Field_CentrallyMaintained_Name="Mantenido Centralmente";

@XendraField(AD_Column_ID="IsCentrallyMaintained",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98b6eff6-2cfa-0541-a896-da48d2180b95")
public static final String FIELDNAME_Field_CentrallyMaintained="98b6eff6-2cfa-0541-a896-da48d2180b95";

@XendraTrl(Identifier="ad5f3850-ae27-4e50-a564-7c5050bfab73")
public static String es_PE_FIELD_FieldSequence_CentrallyMaintained_Description="Información mantenida en la tabla elementos de sistema.";

@XendraTrl(Identifier="ad5f3850-ae27-4e50-a564-7c5050bfab73")
public static String es_PE_FIELD_FieldSequence_CentrallyMaintained_Help="El cuadro de verificación mantenido centralmente indica si el nombre; descripción y ayuda son mantenidos centralmente.";

@XendraTrl(Identifier="ad5f3850-ae27-4e50-a564-7c5050bfab73")
public static String es_PE_FIELD_FieldSequence_CentrallyMaintained_Name="Mantenido Centralmente";

@XendraField(AD_Column_ID="IsCentrallyMaintained",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="ad5f3850-ae27-4e50-a564-7c5050bfab73")
public static final String FIELDNAME_FieldSequence_CentrallyMaintained="ad5f3850-ae27-4e50-a564-7c5050bfab73";

@XendraTrl(Identifier="91e6177e-e037-219b-110e-3e0406b5b7c1")
public static String es_PE_COLUMN_IsCentrallyMaintained_Name="Mantenido Centralmente";

@XendraColumn(AD_Element_ID="aec11edc-fae1-bcfe-5a84-d685b53a80a6",
ColumnName="IsCentrallyMaintained",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="91e6177e-e037-219b-110e-3e0406b5b7c1",Synchronized="2017-08-05 16:52:30.0")
/** Column name IsCentrallyMaintained */
public static final String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
/** Set Displayed.
@param IsDisplayed Determines, if this field is displayed */
public void setIsDisplayed (boolean IsDisplayed)
{
set_Value (COLUMNNAME_IsDisplayed, Boolean.valueOf(IsDisplayed));
}
/** Get Displayed.
@return Determines, if this field is displayed */
public boolean isDisplayed() 
{
Object oo = get_Value(COLUMNNAME_IsDisplayed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="00c8f061-b3b3-87ef-2b2f-19ed6deceacb")
public static String es_PE_FIELD_Field_Displayed_Description="Determina; si este campo es desplegado";

@XendraTrl(Identifier="00c8f061-b3b3-87ef-2b2f-19ed6deceacb")
public static String es_PE_FIELD_Field_Displayed_Help="Si el campo es desplegado; el campo lógica de despliegue determinará en tiempo de ejecución si es actualmente desplegado";

@XendraTrl(Identifier="00c8f061-b3b3-87ef-2b2f-19ed6deceacb")
public static String es_PE_FIELD_Field_Displayed_Name="Desplegado";

@XendraField(AD_Column_ID="IsDisplayed",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c8f061-b3b3-87ef-2b2f-19ed6deceacb")
public static final String FIELDNAME_Field_Displayed="00c8f061-b3b3-87ef-2b2f-19ed6deceacb";

@XendraTrl(Identifier="7ba4ec45-156e-4e4f-89f6-3d2866355cd4")
public static String es_PE_FIELD_FieldSequence_Displayed_Description="Determina; si este campo es desplegado";

@XendraTrl(Identifier="7ba4ec45-156e-4e4f-89f6-3d2866355cd4")
public static String es_PE_FIELD_FieldSequence_Displayed_Help="Si el campo es desplegado; el campo lógica de despliegue determinará en tiempo de ejecución si es actualmente desplegado";

@XendraTrl(Identifier="7ba4ec45-156e-4e4f-89f6-3d2866355cd4")
public static String es_PE_FIELD_FieldSequence_Displayed_Name="Desplegado";

@XendraField(AD_Column_ID="IsDisplayed",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="7ba4ec45-156e-4e4f-89f6-3d2866355cd4")
public static final String FIELDNAME_FieldSequence_Displayed="7ba4ec45-156e-4e4f-89f6-3d2866355cd4";

@XendraTrl(Identifier="ad5da716-c54d-794f-361d-d324dbe131bc")
public static String es_PE_COLUMN_IsDisplayed_Name="Desplegado";

@XendraColumn(AD_Element_ID="c1bfb876-0c16-8bbc-3714-fb5c9f0481b5",ColumnName="IsDisplayed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad5da716-c54d-794f-361d-d324dbe131bc",
Synchronized="2017-08-05 16:52:30.0")
/** Column name IsDisplayed */
public static final String COLUMNNAME_IsDisplayed = "IsDisplayed";
/** Set Encrypted.
@param IsEncrypted Display or Storage is encrypted */
public void setIsEncrypted (boolean IsEncrypted)
{
set_Value (COLUMNNAME_IsEncrypted, Boolean.valueOf(IsEncrypted));
}
/** Get Encrypted.
@return Display or Storage is encrypted */
public boolean isEncrypted() 
{
Object oo = get_Value(COLUMNNAME_IsEncrypted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ffd3800a-8bdc-9710-ff02-52f5b1dc96f0")
public static String es_PE_FIELD_Field_Encrypted_Description="Despliegue encriptado";

@XendraTrl(Identifier="ffd3800a-8bdc-9710-ff02-52f5b1dc96f0")
public static String es_PE_FIELD_Field_Encrypted_Help="Despliegue encriptado - todos los caracteres se despliegan de esta manera";

@XendraTrl(Identifier="ffd3800a-8bdc-9710-ff02-52f5b1dc96f0")
public static String es_PE_FIELD_Field_Encrypted_Name="Despliegue Encriptado";

@XendraField(AD_Column_ID="IsEncrypted",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDisplayed@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffd3800a-8bdc-9710-ff02-52f5b1dc96f0")
public static final String FIELDNAME_Field_Encrypted="ffd3800a-8bdc-9710-ff02-52f5b1dc96f0";

@XendraTrl(Identifier="78f08579-8ac7-46cc-b2ba-80cb6aaf7322")
public static String es_PE_FIELD_FieldSequence_Encrypted_Description="Despliegue encriptado";

@XendraTrl(Identifier="78f08579-8ac7-46cc-b2ba-80cb6aaf7322")
public static String es_PE_FIELD_FieldSequence_Encrypted_Help="Despliegue encriptado - todos los caracteres se despliegan de esta manera";

@XendraTrl(Identifier="78f08579-8ac7-46cc-b2ba-80cb6aaf7322")
public static String es_PE_FIELD_FieldSequence_Encrypted_Name="Despliegue Encriptado";

@XendraField(AD_Column_ID="IsEncrypted",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="78f08579-8ac7-46cc-b2ba-80cb6aaf7322")
public static final String FIELDNAME_FieldSequence_Encrypted="78f08579-8ac7-46cc-b2ba-80cb6aaf7322";

@XendraTrl(Identifier="ffd0ceb6-eb5b-0e67-3037-03db7f8933de")
public static String es_PE_COLUMN_IsEncrypted_Name="Despliegue Encriptado";

@XendraColumn(AD_Element_ID="c0df59ef-8893-5340-a5d8-c855ca33c9dc",ColumnName="IsEncrypted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffd0ceb6-eb5b-0e67-3037-03db7f8933de",
Synchronized="2017-08-05 16:52:30.0")
/** Column name IsEncrypted */
public static final String COLUMNNAME_IsEncrypted = "IsEncrypted";
/** Set Field Only.
@param IsFieldOnly Label is not displayed */
public void setIsFieldOnly (boolean IsFieldOnly)
{
set_Value (COLUMNNAME_IsFieldOnly, Boolean.valueOf(IsFieldOnly));
}
/** Get Field Only.
@return Label is not displayed */
public boolean isFieldOnly() 
{
Object oo = get_Value(COLUMNNAME_IsFieldOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9cc15d05-9a68-5271-c0d2-3b5a122c0799")
public static String es_PE_FIELD_Field_FieldOnly_Description="La etiqueta no se despliega";

@XendraTrl(Identifier="9cc15d05-9a68-5271-c0d2-3b5a122c0799")
public static String es_PE_FIELD_Field_FieldOnly_Help="El cuadro de verificación sólo campo indica que la columna se desplegará si una etiqueta.";

@XendraTrl(Identifier="9cc15d05-9a68-5271-c0d2-3b5a122c0799")
public static String es_PE_FIELD_Field_FieldOnly_Name="Sólo Campo";

@XendraField(AD_Column_ID="IsFieldOnly",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cc15d05-9a68-5271-c0d2-3b5a122c0799")
public static final String FIELDNAME_Field_FieldOnly="9cc15d05-9a68-5271-c0d2-3b5a122c0799";

@XendraTrl(Identifier="ee1ce8b4-5be7-4616-8a17-224e6d153842")
public static String es_PE_FIELD_FieldSequence_FieldOnly_Description="La etiqueta no se despliega";

@XendraTrl(Identifier="ee1ce8b4-5be7-4616-8a17-224e6d153842")
public static String es_PE_FIELD_FieldSequence_FieldOnly_Help="El cuadro de verificación sólo campo indica que la columna se desplegará si una etiqueta.";

@XendraTrl(Identifier="ee1ce8b4-5be7-4616-8a17-224e6d153842")
public static String es_PE_FIELD_FieldSequence_FieldOnly_Name="Sólo Campo";

@XendraField(AD_Column_ID="IsFieldOnly",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="ee1ce8b4-5be7-4616-8a17-224e6d153842")
public static final String FIELDNAME_FieldSequence_FieldOnly="ee1ce8b4-5be7-4616-8a17-224e6d153842";

@XendraTrl(Identifier="0e686686-30d4-8ae7-5d65-c8e3195bb0eb")
public static String es_PE_COLUMN_IsFieldOnly_Name="Sólo Campo";

@XendraColumn(AD_Element_ID="c5052e98-77cf-c61e-27bf-8596700627af",ColumnName="IsFieldOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e686686-30d4-8ae7-5d65-c8e3195bb0eb",
Synchronized="2017-08-05 16:52:30.0")
/** Column name IsFieldOnly */
public static final String COLUMNNAME_IsFieldOnly = "IsFieldOnly";
/** Set Heading only.
@param IsHeading Field without Column - Only label is displayed */
public void setIsHeading (boolean IsHeading)
{
set_Value (COLUMNNAME_IsHeading, Boolean.valueOf(IsHeading));
}
/** Get Heading only.
@return Field without Column - Only label is displayed */
public boolean isHeading() 
{
Object oo = get_Value(COLUMNNAME_IsHeading);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4daecf5d-d7c3-4bb2-1539-302b94249360")
public static String es_PE_FIELD_Field_HeadingOnly_Description="Campo sin columna - Solamente la etiqueta es desplegada";

@XendraTrl(Identifier="4daecf5d-d7c3-4bb2-1539-302b94249360")
public static String es_PE_FIELD_Field_HeadingOnly_Help="El Cuadro de Verificación Solamente Encabezados indica si solamente la etiqueta se desplegará  en la pantalla";

@XendraTrl(Identifier="4daecf5d-d7c3-4bb2-1539-302b94249360")
public static String es_PE_FIELD_Field_HeadingOnly_Name="Sólo Encabezado";

@XendraField(AD_Column_ID="IsHeading",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4daecf5d-d7c3-4bb2-1539-302b94249360")
public static final String FIELDNAME_Field_HeadingOnly="4daecf5d-d7c3-4bb2-1539-302b94249360";

@XendraTrl(Identifier="ee093fb8-be56-4943-af25-2e3f74a0f0e1")
public static String es_PE_FIELD_FieldSequence_HeadingOnly_Description="Campo sin columna - Solamente la etiqueta es desplegada";

@XendraTrl(Identifier="ee093fb8-be56-4943-af25-2e3f74a0f0e1")
public static String es_PE_FIELD_FieldSequence_HeadingOnly_Help="El Cuadro de Verificación Solamente Encabezados indica si solamente la etiqueta se desplegará  en la pantalla";

@XendraTrl(Identifier="ee093fb8-be56-4943-af25-2e3f74a0f0e1")
public static String es_PE_FIELD_FieldSequence_HeadingOnly_Name="Sólo Encabezado";

@XendraField(AD_Column_ID="IsHeading",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="ee093fb8-be56-4943-af25-2e3f74a0f0e1")
public static final String FIELDNAME_FieldSequence_HeadingOnly="ee093fb8-be56-4943-af25-2e3f74a0f0e1";

@XendraTrl(Identifier="a0816c05-c712-9671-ea4d-3db8fa5dd919")
public static String es_PE_COLUMN_IsHeading_Name="Sólo Encabezado";

@XendraColumn(AD_Element_ID="5c4865de-34f5-4fd5-6e1e-15db9ff13073",ColumnName="IsHeading",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0816c05-c712-9671-ea4d-3db8fa5dd919",
Synchronized="2017-08-05 16:52:30.0")
/** Column name IsHeading */
public static final String COLUMNNAME_IsHeading = "IsHeading";

/** IsMandatory AD_Reference=9d5d423d-1f38-e653-2094-21cc989d1234 */
public static final int ISMANDATORY_AD_Reference_ID=319;
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (String IsMandatory)
{
if (IsMandatory == null || IsMandatory.equals(REF__YesNo.Yes) || IsMandatory.equals(REF__YesNo.No));
 else throw new IllegalArgumentException ("IsMandatory Invalid value - " + IsMandatory + " - Reference_ID=319 - Y - N");
if (IsMandatory != null && IsMandatory.length() > 1)
{
log.warning("Length > 1 - truncated");
IsMandatory = IsMandatory.substring(0,0);
}
set_Value (COLUMNNAME_IsMandatory, IsMandatory);
}
/** Get Mandatory.
@return Data entry is required in this column */
public String getIsMandatory() 
{
return (String)get_Value(COLUMNNAME_IsMandatory);
}

@XendraTrl(Identifier="4a911be7-f9be-4989-f697-a865ec10e13f")
public static String es_PE_FIELD_Field_MandatoryOverwrite_Description="Overwrite Field Mandatory status";

@XendraTrl(Identifier="4a911be7-f9be-4989-f697-a865ec10e13f")
public static String es_PE_FIELD_Field_MandatoryOverwrite_Help="The field must have a value for the record to be saved to the database.";

@XendraTrl(Identifier="4a911be7-f9be-4989-f697-a865ec10e13f")
public static String es_PE_FIELD_Field_MandatoryOverwrite_Name="Mandatory Overwrite";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=false,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a911be7-f9be-4989-f697-a865ec10e13f")
public static final String FIELDNAME_Field_MandatoryOverwrite="4a911be7-f9be-4989-f697-a865ec10e13f";

@XendraTrl(Identifier="a78d5512-2a82-9309-ec0f-25c2b6eaef87")
public static String es_PE_COLUMN_IsMandatory_Name="Entrada Obligatoria";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=17,AD_Reference_Value_ID="9d5d423d-1f38-e653-2094-21cc989d1234",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a78d5512-2a82-9309-ec0f-25c2b6eaef87",Synchronized="2017-08-05 16:52:30.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="49c1d7e5-717a-3af7-c195-beb2da44aad6")
public static String es_PE_FIELD_Field_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="49c1d7e5-717a-3af7-c195-beb2da44aad6")
public static String es_PE_FIELD_Field_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="49c1d7e5-717a-3af7-c195-beb2da44aad6")
public static String es_PE_FIELD_Field_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDisplayed@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49c1d7e5-717a-3af7-c195-beb2da44aad6")
public static final String FIELDNAME_Field_ReadOnly="49c1d7e5-717a-3af7-c195-beb2da44aad6";

@XendraTrl(Identifier="cf5345e4-065a-4fd8-a7cc-b850bb0aef85")
public static String es_PE_FIELD_FieldSequence_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="cf5345e4-065a-4fd8-a7cc-b850bb0aef85")
public static String es_PE_FIELD_FieldSequence_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="cf5345e4-065a-4fd8-a7cc-b850bb0aef85")
public static String es_PE_FIELD_FieldSequence_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="cf5345e4-065a-4fd8-a7cc-b850bb0aef85")
public static final String FIELDNAME_FieldSequence_ReadOnly="cf5345e4-065a-4fd8-a7cc-b850bb0aef85";

@XendraTrl(Identifier="55f2ad4f-b8eb-19b4-9fa0-2fc845603d67")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55f2ad4f-b8eb-19b4-9fa0-2fc845603d67",
Synchronized="2017-08-05 16:52:31.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Same Line.
@param IsSameLine Displayed on same line as previous field */
public void setIsSameLine (boolean IsSameLine)
{
set_Value (COLUMNNAME_IsSameLine, Boolean.valueOf(IsSameLine));
}
/** Get Same Line.
@return Displayed on same line as previous field */
public boolean isSameLine() 
{
Object oo = get_Value(COLUMNNAME_IsSameLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8fd35bee-4e89-ba9d-6227-707d35d94692")
public static String es_PE_FIELD_Field_SameLine_Description="Desplegado en la misma línea que el campo previo";

@XendraTrl(Identifier="8fd35bee-4e89-ba9d-6227-707d35d94692")
public static String es_PE_FIELD_Field_SameLine_Help="El cuadro de verificación misma línea indica que este campo se desplegará en la misma línea que el campo previo.";

@XendraTrl(Identifier="8fd35bee-4e89-ba9d-6227-707d35d94692")
public static String es_PE_FIELD_Field_SameLine_Name="Misma Línea";

@XendraField(AD_Column_ID="IsSameLine",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fd35bee-4e89-ba9d-6227-707d35d94692")
public static final String FIELDNAME_Field_SameLine="8fd35bee-4e89-ba9d-6227-707d35d94692";

@XendraTrl(Identifier="465614d1-7263-4f8a-a37a-51a81df2a7ab")
public static String es_PE_FIELD_FieldSequence_SameLine_Description="Desplegado en la misma línea que el campo previo";

@XendraTrl(Identifier="465614d1-7263-4f8a-a37a-51a81df2a7ab")
public static String es_PE_FIELD_FieldSequence_SameLine_Help="El cuadro de verificación misma línea indica que este campo se desplegará en la misma línea que el campo previo.";

@XendraTrl(Identifier="465614d1-7263-4f8a-a37a-51a81df2a7ab")
public static String es_PE_FIELD_FieldSequence_SameLine_Name="Misma Línea";

@XendraField(AD_Column_ID="IsSameLine",IsCentrallyMaintained=true,
AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-08-12 00:00:00.0",
Identifier="465614d1-7263-4f8a-a37a-51a81df2a7ab")
public static final String FIELDNAME_FieldSequence_SameLine="465614d1-7263-4f8a-a37a-51a81df2a7ab";

@XendraTrl(Identifier="845d48a9-213b-7f3f-6778-87e7ed2854ee")
public static String es_PE_COLUMN_IsSameLine_Name="Misma Línea";

@XendraColumn(AD_Element_ID="855d68c0-e401-f8a8-00b1-ed4eeb2e6138",ColumnName="IsSameLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="845d48a9-213b-7f3f-6778-87e7ed2854ee",
Synchronized="2017-08-05 16:52:31.0")
/** Column name IsSameLine */
public static final String COLUMNNAME_IsSameLine = "IsSameLine";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="f8e6cfff-1d4d-299b-dedf-ca4e15e153bc")
public static String es_PE_FIELD_Field_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f8e6cfff-1d4d-299b-dedf-ca4e15e153bc")
public static String es_PE_FIELD_Field_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="f8e6cfff-1d4d-299b-dedf-ca4e15e153bc")
public static String es_PE_FIELD_Field_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f8e6cfff-1d4d-299b-dedf-ca4e15e153bc")
public static final String FIELDNAME_Field_Name="f8e6cfff-1d4d-299b-dedf-ca4e15e153bc";

@XendraTrl(Identifier="037caad3-7331-458c-8a96-1f5e4ae13a2c")
public static String es_PE_FIELD_FieldSequence_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="037caad3-7331-458c-8a96-1f5e4ae13a2c")
public static String es_PE_FIELD_FieldSequence_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="037caad3-7331-458c-8a96-1f5e4ae13a2c")
public static String es_PE_FIELD_FieldSequence_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="e8ce3f5a-a1c2-82b9-7188-83dd6ca79569",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-08-12 00:00:00.0",Identifier="037caad3-7331-458c-8a96-1f5e4ae13a2c")
public static final String FIELDNAME_FieldSequence_Name="037caad3-7331-458c-8a96-1f5e4ae13a2c";

@XendraTrl(Identifier="34d910b0-f52b-1cb0-e0f0-66fc7e7ecebf")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34d910b0-f52b-1cb0-e0f0-66fc7e7ecebf",
Synchronized="2017-08-05 16:52:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** ObscureType AD_Reference=3aff5650-9d13-fa70-7eca-ed23026eb8ea */
public static final int OBSCURETYPE_AD_Reference_ID=291;
/** Set Obscure.
@param ObscureType Type of obscuring the data (limiting the display) */
public void setObscureType (String ObscureType)
{
if (ObscureType == null || ObscureType.equals(REF_AD_FieldObscureType.ObscureDigitsButLast4) || ObscureType.equals(REF_AD_FieldObscureType.ObscureDigitsButFirstLast4) || ObscureType.equals(REF_AD_FieldObscureType.ObscureAlphaNumericButFirstLast4) || ObscureType.equals(REF_AD_FieldObscureType.ObscureAlphaNumericButLast4));
 else throw new IllegalArgumentException ("ObscureType Invalid value - " + ObscureType + " - Reference_ID=291 - 904 - 944 - A44 - A04");
if (ObscureType != null && ObscureType.length() > 3)
{
log.warning("Length > 3 - truncated");
ObscureType = ObscureType.substring(0,2);
}
set_Value (COLUMNNAME_ObscureType, ObscureType);
}
/** Get Obscure.
@return Type of obscuring the data (limiting the display) */
public String getObscureType() 
{
return (String)get_Value(COLUMNNAME_ObscureType);
}

@XendraTrl(Identifier="ba644e29-87e1-ed84-7fe0-c448ed752e3e")
public static String es_PE_FIELD_Field_Obscure_Description="Tipo de datos obscuros (limitados por la pantalla)";

@XendraTrl(Identifier="ba644e29-87e1-ed84-7fe0-c448ed752e3e")
public static String es_PE_FIELD_Field_Obscure_Name="Obscuro";

@XendraField(AD_Column_ID="ObscureType",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba644e29-87e1-ed84-7fe0-c448ed752e3e")
public static final String FIELDNAME_Field_Obscure="ba644e29-87e1-ed84-7fe0-c448ed752e3e";

@XendraTrl(Identifier="2874db18-7151-359f-ee0e-811d3fc4aa49")
public static String es_PE_COLUMN_ObscureType_Name="Obscuro";

@XendraColumn(AD_Element_ID="4af50f72-41a8-62ae-f197-631357ec9f17",ColumnName="ObscureType",
AD_Reference_ID=17,AD_Reference_Value_ID="3aff5650-9d13-fa70-7eca-ed23026eb8ea",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2874db18-7151-359f-ee0e-811d3fc4aa49",Synchronized="2017-08-05 16:52:31.0")
/** Column name ObscureType */
public static final String COLUMNNAME_ObscureType = "ObscureType";
/** Set Preferred Width.
@param PreferredWidth Preferred width in pixels */
public void setPreferredWidth (int PreferredWidth)
{
set_Value (COLUMNNAME_PreferredWidth, Integer.valueOf(PreferredWidth));
}
/** Get Preferred Width.
@return Preferred width in pixels */
public int getPreferredWidth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PreferredWidth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2bc6aac-b4c5-956c-9000-0f925e1fb6ed")
public static String es_PE_FIELD_Field_PreferredWidth_Description="Preferred width in pixels";

@XendraTrl(Identifier="f2bc6aac-b4c5-956c-9000-0f925e1fb6ed")
public static String es_PE_FIELD_Field_PreferredWidth_Name="Preferred Width";

@XendraField(AD_Column_ID="PreferredWidth",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2bc6aac-b4c5-956c-9000-0f925e1fb6ed")
public static final String FIELDNAME_Field_PreferredWidth="f2bc6aac-b4c5-956c-9000-0f925e1fb6ed";

@XendraTrl(Identifier="85687d49-35a4-b514-eafa-728de9938fe4")
public static String es_PE_COLUMN_PreferredWidth_Name="Preferred Width";

@XendraColumn(AD_Element_ID="2d4cb170-2853-d2eb-05a8-fa5dd24b681e",ColumnName="PreferredWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=true,Identifier="85687d49-35a4-b514-eafa-728de9938fe4",
Synchronized="2017-08-05 16:52:31.0")
/** Column name PreferredWidth */
public static final String COLUMNNAME_PreferredWidth = "PreferredWidth";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0aff32f5-c175-abbd-e044-51628343aa8b")
public static String es_PE_FIELD_Field_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="0aff32f5-c175-abbd-e044-51628343aa8b")
public static String es_PE_FIELD_Field_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="0aff32f5-c175-abbd-e044-51628343aa8b")
public static String es_PE_FIELD_Field_Sequence_Name="Secuencia";
@XendraField(AD_Column_ID="SeqNo",
IsCentrallyMaintained=true,AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=200,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0aff32f5-c175-abbd-e044-51628343aa8b")
public static final String FIELDNAME_Field_Sequence="0aff32f5-c175-abbd-e044-51628343aa8b";

@XendraTrl(Identifier="a093bcde-2eae-9f53-dbe5-68d241ea5dfa")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Field WHERE AD_Tab_ID=@AD_Tab_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a093bcde-2eae-9f53-dbe5-68d241ea5dfa",
Synchronized="2017-08-05 16:52:31.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Record Sort No.
@param SortNo Determines in what order the records are displayed */
public void setSortNo (BigDecimal SortNo)
{
set_Value (COLUMNNAME_SortNo, SortNo);
}
/** Get Record Sort No.
@return Determines in what order the records are displayed */
public BigDecimal getSortNo() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SortNo);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3f3028b4-d737-2186-4e2b-b4263fd9a9be")
public static String es_PE_FIELD_Field_RecordSortNo_Description="Determina en que orden son desplegados los productos";

@XendraTrl(Identifier="3f3028b4-d737-2186-4e2b-b4263fd9a9be")
public static String es_PE_FIELD_Field_RecordSortNo_Help="El No. de clasificación del registro indica la secuencia de clasificación ascendente de los registros";

@XendraTrl(Identifier="3f3028b4-d737-2186-4e2b-b4263fd9a9be")
public static String es_PE_FIELD_Field_RecordSortNo_Name="No. de Clasificación del Registro";

@XendraField(AD_Column_ID="SortNo",IsCentrallyMaintained=true,
AD_Tab_ID="7f8d217e-6d6a-339b-e946-58bae65bed6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f3028b4-d737-2186-4e2b-b4263fd9a9be")
public static final String FIELDNAME_Field_RecordSortNo="3f3028b4-d737-2186-4e2b-b4263fd9a9be";

@XendraTrl(Identifier="3c4697b9-8602-0490-65e0-9115f0bc8ce5")
public static String es_PE_COLUMN_SortNo_Name="No. de Clasificación del Registro";

@XendraColumn(AD_Element_ID="929301a0-e5a0-7f21-9aa1-b7e9061fe6ed",ColumnName="SortNo",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c4697b9-8602-0490-65e0-9115f0bc8ce5",
Synchronized="2017-08-05 16:52:31.0")
/** Column name SortNo */
public static final String COLUMNNAME_SortNo = "SortNo";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="06b2e118-2597-0d24-3534-b2159864b772")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06b2e118-2597-0d24-3534-b2159864b772",
Synchronized="2017-08-05 16:52:31.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
