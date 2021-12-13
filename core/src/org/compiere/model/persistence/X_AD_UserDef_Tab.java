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
/** Generated Model for AD_UserDef_Tab
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_UserDef_Tab extends PO
{
/** Standard Constructor
@param ctx context
@param AD_UserDef_Tab_ID id
@param trxName transaction
*/
public X_AD_UserDef_Tab (Properties ctx, int AD_UserDef_Tab_ID, String trxName)
{
super (ctx, AD_UserDef_Tab_ID, trxName);
/** if (AD_UserDef_Tab_ID == 0)
{
setAD_Tab_ID (0);
setAD_UserDef_Tab_ID (0);
setAD_UserDef_Win_ID (0);
setIsMultiRowOnly (false);	
// N
setIsReadOnly (false);	
// N
setIsSingleRow (false);	
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
public X_AD_UserDef_Tab (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=466 */
public static int Table_ID=MTable.getTable_ID("AD_UserDef_Tab");

@XendraTrl(Identifier="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7")
public static String es_PE_TAB_TabCustomization_Name="Personalización de Pestaña";

@XendraTab(Name="Tab Customization",Description="",Help="",
AD_Window_ID="b1b1f4ea-07aa-32d8-5b9a-b3002bb6f98b",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TabCustomization="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7";

@XendraTrl(Identifier="836caa99-7e2c-41ea-0a35-1177140e31a3")
public static String es_PE_TABLE_AD_UserDef_Tab_Name="Pestaña Definida por el Usuario";


@XendraTable(Name="User defined Tab",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_UserDef_Tab",AccessLevel="4",AD_Window_ID="b1b1f4ea-07aa-32d8-5b9a-b3002bb6f98b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="836caa99-7e2c-41ea-0a35-1177140e31a3",Synchronized="2020-03-03 21:36:05.0")
/** TableName=AD_UserDef_Tab */
public static final String Table_Name="AD_UserDef_Tab";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_UserDef_Tab");

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
    Table_ID = MTable.getTable_ID("AD_UserDef_Tab");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_UserDef_Tab[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tab.
@param AD_Tab_ID Tab within a Window */
public void setAD_Tab_ID (int AD_Tab_ID)
{
if (AD_Tab_ID < 1) throw new IllegalArgumentException ("AD_Tab_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tab_ID, Integer.valueOf(AD_Tab_ID));
}
/** Get Tab.
@return Tab within a Window */
public int getAD_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f478707b-90fb-6010-69ad-8c0496689b91")
public static String es_PE_FIELD_TabCustomization_Tab_Name="Pestaña";

@XendraTrl(Identifier="f478707b-90fb-6010-69ad-8c0496689b91")
public static String es_PE_FIELD_TabCustomization_Tab_Description="Pestaña dentro de una ventana.";

@XendraTrl(Identifier="f478707b-90fb-6010-69ad-8c0496689b91")
public static String es_PE_FIELD_TabCustomization_Tab_Help="La pestaña indica que se despliega dentro de una ventana";

@XendraField(AD_Column_ID="AD_Tab_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f478707b-90fb-6010-69ad-8c0496689b91")
public static final String FIELDNAME_TabCustomization_Tab="f478707b-90fb-6010-69ad-8c0496689b91";

@XendraTrl(Identifier="75f351da-ada9-6b4b-f12b-e27cf13d83e9")
public static String es_PE_COLUMN_AD_Tab_ID_Name="Pestaña";

@XendraColumn(AD_Element_ID="1a7ad493-6088-5413-1098-1a8061a77e90",ColumnName="AD_Tab_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75f351da-ada9-6b4b-f12b-e27cf13d83e9",
Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_Tab_ID */
public static final String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
/** Set User defined Tab.
@param AD_UserDef_Tab_ID User defined Tab */
public void setAD_UserDef_Tab_ID (int AD_UserDef_Tab_ID)
{
if (AD_UserDef_Tab_ID < 1) throw new IllegalArgumentException ("AD_UserDef_Tab_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserDef_Tab_ID, Integer.valueOf(AD_UserDef_Tab_ID));
}
/** Get User defined Tab.
@return User defined Tab */
public int getAD_UserDef_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserDef_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a657e886-80f5-1f6e-ff93-2b20074a3399")
public static String es_PE_FIELD_TabCustomization_UserDefinedTab_Name="Pestaña Definida por el Usuario";

@XendraField(AD_Column_ID="AD_UserDef_Tab_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a657e886-80f5-1f6e-ff93-2b20074a3399")
public static final String FIELDNAME_TabCustomization_UserDefinedTab="a657e886-80f5-1f6e-ff93-2b20074a3399";
/** Column name AD_UserDef_Tab_ID */
public static final String COLUMNNAME_AD_UserDef_Tab_ID = "AD_UserDef_Tab_ID";
/** Set User defined Window.
@param AD_UserDef_Win_ID User defined Window */
public void setAD_UserDef_Win_ID (int AD_UserDef_Win_ID)
{
if (AD_UserDef_Win_ID < 1) throw new IllegalArgumentException ("AD_UserDef_Win_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserDef_Win_ID, Integer.valueOf(AD_UserDef_Win_ID));
}
/** Get User defined Window.
@return User defined Window */
public int getAD_UserDef_Win_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserDef_Win_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b2bc481c-a356-94c1-b4a8-e28897541d42")
public static String es_PE_FIELD_TabCustomization_UserDefinedWindow_Name="Ventana Definida por el Usuario";

@XendraField(AD_Column_ID="AD_UserDef_Win_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2bc481c-a356-94c1-b4a8-e28897541d42")
public static final String FIELDNAME_TabCustomization_UserDefinedWindow="b2bc481c-a356-94c1-b4a8-e28897541d42";

@XendraTrl(Identifier="0f93544a-d7db-6963-ab80-e78396d97d41")
public static String es_PE_COLUMN_AD_UserDef_Win_ID_Name="Ventana Definida por el Usuario";

@XendraColumn(AD_Element_ID="2b57b060-8b19-a668-cbe7-770e17f6739d",ColumnName="AD_UserDef_Win_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f93544a-d7db-6963-ab80-e78396d97d41",
Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_UserDef_Win_ID */
public static final String COLUMNNAME_AD_UserDef_Win_ID = "AD_UserDef_Win_ID";
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

@XendraTrl(Identifier="3b09d7de-262b-6416-f132-8391afd3d11d")
public static String es_PE_FIELD_TabCustomization_Description_Name="Observación";

@XendraTrl(Identifier="3b09d7de-262b-6416-f132-8391afd3d11d")
public static String es_PE_FIELD_TabCustomization_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="3b09d7de-262b-6416-f132-8391afd3d11d")
public static String es_PE_FIELD_TabCustomization_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b09d7de-262b-6416-f132-8391afd3d11d")
public static final String FIELDNAME_TabCustomization_Description="3b09d7de-262b-6416-f132-8391afd3d11d";

@XendraTrl(Identifier="ca4ce5f7-c5c9-74c5-812f-6c5414a5972b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca4ce5f7-c5c9-74c5-812f-6c5414a5972b",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="1fd05a6a-ae6f-9f1b-1253-c77acc912bf3")
public static String es_PE_FIELD_TabCustomization_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="1fd05a6a-ae6f-9f1b-1253-c77acc912bf3")
public static String es_PE_FIELD_TabCustomization_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="1fd05a6a-ae6f-9f1b-1253-c77acc912bf3")
public static String es_PE_FIELD_TabCustomization_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fd05a6a-ae6f-9f1b-1253-c77acc912bf3")
public static final String FIELDNAME_TabCustomization_CommentHelp="1fd05a6a-ae6f-9f1b-1253-c77acc912bf3";

@XendraTrl(Identifier="c988f936-f817-9dec-403e-009b860be7e9")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c988f936-f817-9dec-403e-009b860be7e9",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="50f7dd77-fd65-42fd-a5fb-bc31cc4d9817")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50f7dd77-fd65-42fd-a5fb-bc31cc4d9817",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Multi Row Only.
@param IsMultiRowOnly This applies to Multi-Row view only */
public void setIsMultiRowOnly (boolean IsMultiRowOnly)
{
set_Value (COLUMNNAME_IsMultiRowOnly, Boolean.valueOf(IsMultiRowOnly));
}
/** Get Multi Row Only.
@return This applies to Multi-Row view only */
public boolean isMultiRowOnly() 
{
Object oo = get_Value(COLUMNNAME_IsMultiRowOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="013de8e7-c368-c5cf-ea15-4ab0077b7cdb")
public static String es_PE_FIELD_TabCustomization_MultiRowOnly_Name="Sólo Multilineas";

@XendraTrl(Identifier="013de8e7-c368-c5cf-ea15-4ab0077b7cdb")
public static String es_PE_FIELD_TabCustomization_MultiRowOnly_Description="Esto se aplica a la opinión de la Multi-Fila solamente.";

@XendraField(AD_Column_ID="IsMultiRowOnly",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="013de8e7-c368-c5cf-ea15-4ab0077b7cdb")
public static final String FIELDNAME_TabCustomization_MultiRowOnly="013de8e7-c368-c5cf-ea15-4ab0077b7cdb";

@XendraTrl(Identifier="6d3ac97d-4462-941f-8b51-1a927d9955fd")
public static String es_PE_COLUMN_IsMultiRowOnly_Name="Sólo Multilineas";

@XendraColumn(AD_Element_ID="c018ce4b-265f-58a4-7fd0-60c4a31adff5",ColumnName="IsMultiRowOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d3ac97d-4462-941f-8b51-1a927d9955fd",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsMultiRowOnly */
public static final String COLUMNNAME_IsMultiRowOnly = "IsMultiRowOnly";
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

@XendraTrl(Identifier="f104f5ef-2a6b-1a9a-e698-8170e2cb6371")
public static String es_PE_FIELD_TabCustomization_ReadOnly_Name="Sólo Lectura";

@XendraTrl(Identifier="f104f5ef-2a6b-1a9a-e698-8170e2cb6371")
public static String es_PE_FIELD_TabCustomization_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="f104f5ef-2a6b-1a9a-e698-8170e2cb6371")
public static String es_PE_FIELD_TabCustomization_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f104f5ef-2a6b-1a9a-e698-8170e2cb6371")
public static final String FIELDNAME_TabCustomization_ReadOnly="f104f5ef-2a6b-1a9a-e698-8170e2cb6371";

@XendraTrl(Identifier="a35a9719-2d85-ca01-9cdb-4a29660ea283")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a35a9719-2d85-ca01-9cdb-4a29660ea283",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Single Row Layout.
@param IsSingleRow Default for toggle between Single- and Multi-Row (Grid) Layout */
public void setIsSingleRow (boolean IsSingleRow)
{
set_Value (COLUMNNAME_IsSingleRow, Boolean.valueOf(IsSingleRow));
}
/** Get Single Row Layout.
@return Default for toggle between Single- and Multi-Row (Grid) Layout */
public boolean isSingleRow() 
{
Object oo = get_Value(COLUMNNAME_IsSingleRow);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c1fcc71d-f7f6-684f-68f5-58c19d1e04df")
public static String es_PE_FIELD_TabCustomization_SingleRowLayout_Name="Disposición de Renglón Simple";

@XendraTrl(Identifier="c1fcc71d-f7f6-684f-68f5-58c19d1e04df")
public static String es_PE_FIELD_TabCustomization_SingleRowLayout_Description="Predeterminado para intercambiar entre la disposición simple y la de renglón múltiple (emparrillado)";

@XendraTrl(Identifier="c1fcc71d-f7f6-684f-68f5-58c19d1e04df")
public static String es_PE_FIELD_TabCustomization_SingleRowLayout_Help="El cuadro de verificación disposición de renglón simple indica si el tipo de despliegue predeterminado para esta ventana es un renglón simple en contraposición con múltiples renglones.";

@XendraField(AD_Column_ID="IsSingleRow",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1fcc71d-f7f6-684f-68f5-58c19d1e04df")
public static final String FIELDNAME_TabCustomization_SingleRowLayout="c1fcc71d-f7f6-684f-68f5-58c19d1e04df";

@XendraTrl(Identifier="b4118225-3a44-8e34-72cd-1aa4c1ebf6e5")
public static String es_PE_COLUMN_IsSingleRow_Name="Disposición de Renglón Simple";

@XendraColumn(AD_Element_ID="ffb47010-05a1-3a90-f054-5d6fcc0a411f",ColumnName="IsSingleRow",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4118225-3a44-8e34-72cd-1aa4c1ebf6e5",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsSingleRow */
public static final String COLUMNNAME_IsSingleRow = "IsSingleRow";
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

@XendraTrl(Identifier="823debf0-24f0-0071-6516-4dd969fe8220")
public static String es_PE_FIELD_TabCustomization_Name_Name="Nombre";

@XendraTrl(Identifier="823debf0-24f0-0071-6516-4dd969fe8220")
public static String es_PE_FIELD_TabCustomization_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="823debf0-24f0-0071-6516-4dd969fe8220")
public static String es_PE_FIELD_TabCustomization_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="7d9781fc-fc0c-f5e4-dd51-e6279bdacae7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="823debf0-24f0-0071-6516-4dd969fe8220")
public static final String FIELDNAME_TabCustomization_Name="823debf0-24f0-0071-6516-4dd969fe8220";

@XendraTrl(Identifier="6027a98f-6d90-85a4-f047-dadbb593bfd1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6027a98f-6d90-85a4-f047-dadbb593bfd1",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
