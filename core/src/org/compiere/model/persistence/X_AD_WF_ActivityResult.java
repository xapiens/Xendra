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
/** Generated Model for AD_WF_ActivityResult
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_ActivityResult extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_ActivityResult_ID id
@param trxName transaction
*/
public X_AD_WF_ActivityResult (Properties ctx, int AD_WF_ActivityResult_ID, String trxName)
{
super (ctx, AD_WF_ActivityResult_ID, trxName);
/** if (AD_WF_ActivityResult_ID == 0)
{
setAD_WF_Activity_ID (0);
setAD_WF_ActivityResult_ID (0);
setAttributeName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_ActivityResult (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=650 */
public static int Table_ID=MTable.getTable_ID("AD_WF_ActivityResult");

@XendraTrl(Identifier="097762fb-a410-4fa8-9195-50a5dd8f00f8")
public static String es_PE_TAB_Result_Description="Resultado de la actividad del proceso de flujo de trabajo";

@XendraTrl(Identifier="097762fb-a410-4fa8-9195-50a5dd8f00f8")
public static String es_PE_TAB_Result_Name="Resultado";

@XendraTrl(Identifier="097762fb-a410-4fa8-9195-50a5dd8f00f8")
public static String es_PE_TAB_Result_Help="Resultado de la actividad mientras se realiza la ejecución del flujo de trabajo";

@XendraTab(Name="Result",Description="Result of the Workflow Process Activity",
Help="Activity Result of the execution of the Workflow Process Instrance",
AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="097762fb-a410-4fa8-9195-50a5dd8f00f8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Result="097762fb-a410-4fa8-9195-50a5dd8f00f8";

@XendraTrl(Identifier="76f91261-7695-bf7e-a11b-72e4146de53b")
public static String es_PE_TABLE_AD_WF_ActivityResult_Name="Resultado de Actividad en Flujo de trabajo";


@XendraTable(Name="Workflow Activity Result",Description="Result of the Workflow Process Activity",
Help="",TableName="AD_WF_ActivityResult",AccessLevel="7",
AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.workflow",Identifier="76f91261-7695-bf7e-a11b-72e4146de53b",
Synchronized="2017-08-16 11:41:08.0")
/** TableName=AD_WF_ActivityResult */
public static final String Table_Name="AD_WF_ActivityResult";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_ActivityResult");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_WF_ActivityResult");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_ActivityResult[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Workflow Activity.
@param AD_WF_Activity_ID Workflow Activity */
public void setAD_WF_Activity_ID (int AD_WF_Activity_ID)
{
if (AD_WF_Activity_ID < 1) throw new IllegalArgumentException ("AD_WF_Activity_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_Activity_ID, Integer.valueOf(AD_WF_Activity_ID));
}
/** Get Workflow Activity.
@return Workflow Activity */
public int getAD_WF_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_WF_Activity_ID()));
}

@XendraTrl(Identifier="f4cc16af-d518-6b53-5a6f-b9fcdf54ba1d")
public static String es_PE_FIELD_Result_WorkflowActivity_Description="Actividad de F.T.";

@XendraTrl(Identifier="f4cc16af-d518-6b53-5a6f-b9fcdf54ba1d")
public static String es_PE_FIELD_Result_WorkflowActivity_Help="La actividad del flujo de trabajo indica el actual nodo de flujo de trabajo dentro de un proceso del flujo de trabajo.";

@XendraTrl(Identifier="f4cc16af-d518-6b53-5a6f-b9fcdf54ba1d")
public static String es_PE_FIELD_Result_WorkflowActivity_Name="Actividad de Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="097762fb-a410-4fa8-9195-50a5dd8f00f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4cc16af-d518-6b53-5a6f-b9fcdf54ba1d")
public static final String FIELDNAME_Result_WorkflowActivity="f4cc16af-d518-6b53-5a6f-b9fcdf54ba1d";

@XendraTrl(Identifier="e43e235f-97af-083b-d84c-6858712fb47f")
public static String es_PE_COLUMN_AD_WF_Activity_ID_Name="Actividad de Flujo de Trabajo";

@XendraColumn(AD_Element_ID="80055366-7780-c8b6-b645-12ad4f4a6195",ColumnName="AD_WF_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e43e235f-97af-083b-d84c-6858712fb47f",
Synchronized="2017-08-05 16:52:59.0")
/** Column name AD_WF_Activity_ID */
public static final String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
/** Set Workflow Activity Result.
@param AD_WF_ActivityResult_ID Result of the Workflow Process Activity */
public void setAD_WF_ActivityResult_ID (int AD_WF_ActivityResult_ID)
{
if (AD_WF_ActivityResult_ID < 1) throw new IllegalArgumentException ("AD_WF_ActivityResult_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_ActivityResult_ID, Integer.valueOf(AD_WF_ActivityResult_ID));
}
/** Get Workflow Activity Result.
@return Result of the Workflow Process Activity */
public int getAD_WF_ActivityResult_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_ActivityResult_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a4704339-2ee7-be5a-c322-80f44fc55e9b")
public static String es_PE_FIELD_Result_WorkflowActivityResult_Description="Resultado de actividad en flujo de trabajo.";

@XendraTrl(Identifier="a4704339-2ee7-be5a-c322-80f44fc55e9b")
public static String es_PE_FIELD_Result_WorkflowActivityResult_Help="Resultado de la ejecución de actividad del proceso de flujo de trabajo.";

@XendraTrl(Identifier="a4704339-2ee7-be5a-c322-80f44fc55e9b")
public static String es_PE_FIELD_Result_WorkflowActivityResult_Name="Resultado de Actividad en Flujo de trabajo";

@XendraField(AD_Column_ID="AD_WF_ActivityResult_ID",IsCentrallyMaintained=true,
AD_Tab_ID="097762fb-a410-4fa8-9195-50a5dd8f00f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4704339-2ee7-be5a-c322-80f44fc55e9b")
public static final String FIELDNAME_Result_WorkflowActivityResult="a4704339-2ee7-be5a-c322-80f44fc55e9b";
/** Column name AD_WF_ActivityResult_ID */
public static final String COLUMNNAME_AD_WF_ActivityResult_ID = "AD_WF_ActivityResult_ID";
/** Set Attribute Name.
@param AttributeName Name of the Attribute */
public void setAttributeName (String AttributeName)
{
if (AttributeName == null) throw new IllegalArgumentException ("AttributeName is mandatory.");
if (AttributeName.length() > 60)
{
log.warning("Length > 60 - truncated");
AttributeName = AttributeName.substring(0,59);
}
set_Value (COLUMNNAME_AttributeName, AttributeName);
}
/** Get Attribute Name.
@return Name of the Attribute */
public String getAttributeName() 
{
String value = (String)get_Value(COLUMNNAME_AttributeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6130c5e4-8b45-738a-0003-2cf6235b966f")
public static String es_PE_FIELD_Result_AttributeName_Description="Nombre del atributo";

@XendraTrl(Identifier="6130c5e4-8b45-738a-0003-2cf6235b966f")
public static String es_PE_FIELD_Result_AttributeName_Help="Identificación del atributo";

@XendraTrl(Identifier="6130c5e4-8b45-738a-0003-2cf6235b966f")
public static String es_PE_FIELD_Result_AttributeName_Name="Nombre del Atributo";

@XendraField(AD_Column_ID="AttributeName",IsCentrallyMaintained=true,
AD_Tab_ID="097762fb-a410-4fa8-9195-50a5dd8f00f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6130c5e4-8b45-738a-0003-2cf6235b966f")
public static final String FIELDNAME_Result_AttributeName="6130c5e4-8b45-738a-0003-2cf6235b966f";

@XendraTrl(Identifier="0f6a05b0-bc3b-d30a-593e-aee236295621")
public static String es_PE_COLUMN_AttributeName_Name="Nombre del Atributo";

@XendraColumn(AD_Element_ID="8f4d88cb-23d3-78f4-8ce5-981e45136e01",ColumnName="AttributeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f6a05b0-bc3b-d30a-593e-aee236295621",
Synchronized="2017-08-05 16:52:59.0")
/** Column name AttributeName */
public static final String COLUMNNAME_AttributeName = "AttributeName";
/** Set Attribute Value.
@param AttributeValue Value of the Attribute */
public void setAttributeValue (String AttributeValue)
{
if (AttributeValue != null && AttributeValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
AttributeValue = AttributeValue.substring(0,1999);
}
set_Value (COLUMNNAME_AttributeValue, AttributeValue);
}
/** Get Attribute Value.
@return Value of the Attribute */
public String getAttributeValue() 
{
String value = (String)get_Value(COLUMNNAME_AttributeValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5afcd519-8e96-5784-ce1d-0485ea27bf7c")
public static String es_PE_FIELD_Result_AttributeValue_Description="Valor de el atributo";

@XendraTrl(Identifier="5afcd519-8e96-5784-ce1d-0485ea27bf7c")
public static String es_PE_FIELD_Result_AttributeValue_Name="Valor de Atributo";

@XendraField(AD_Column_ID="AttributeValue",IsCentrallyMaintained=true,
AD_Tab_ID="097762fb-a410-4fa8-9195-50a5dd8f00f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5afcd519-8e96-5784-ce1d-0485ea27bf7c")
public static final String FIELDNAME_Result_AttributeValue="5afcd519-8e96-5784-ce1d-0485ea27bf7c";

@XendraTrl(Identifier="47e79597-8668-9812-cf9b-5798c9827a65")
public static String es_PE_COLUMN_AttributeValue_Name="Valor de Atributo";

@XendraColumn(AD_Element_ID="e747c580-b4ad-e317-bd0d-dcb2a80c135e",ColumnName="AttributeValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47e79597-8668-9812-cf9b-5798c9827a65",
Synchronized="2017-08-05 16:52:59.0")
/** Column name AttributeValue */
public static final String COLUMNNAME_AttributeValue = "AttributeValue";
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

@XendraTrl(Identifier="8318f807-8978-a483-35de-e7ee0d9617c9")
public static String es_PE_FIELD_Result_Description_Description="Observación";

@XendraTrl(Identifier="8318f807-8978-a483-35de-e7ee0d9617c9")
public static String es_PE_FIELD_Result_Description_Help="Observación";

@XendraTrl(Identifier="8318f807-8978-a483-35de-e7ee0d9617c9")
public static String es_PE_FIELD_Result_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="097762fb-a410-4fa8-9195-50a5dd8f00f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8318f807-8978-a483-35de-e7ee0d9617c9")
public static final String FIELDNAME_Result_Description="8318f807-8978-a483-35de-e7ee0d9617c9";

@XendraTrl(Identifier="3a261c78-36ca-5b39-7064-530429deb266")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a261c78-36ca-5b39-7064-530429deb266",
Synchronized="2017-08-05 16:52:59.0")
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

@XendraTrl(Identifier="b9a22eb3-8d52-febd-dc83-c6581d8bc745")
public static String es_PE_FIELD_Result_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="b9a22eb3-8d52-febd-dc83-c6581d8bc745")
public static String es_PE_FIELD_Result_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="b9a22eb3-8d52-febd-dc83-c6581d8bc745")
public static String es_PE_FIELD_Result_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="097762fb-a410-4fa8-9195-50a5dd8f00f8",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b9a22eb3-8d52-febd-dc83-c6581d8bc745")
public static final String FIELDNAME_Result_CommentHelp="b9a22eb3-8d52-febd-dc83-c6581d8bc745";

@XendraTrl(Identifier="01ddac57-9651-061f-ad2d-a8b0965db02e")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01ddac57-9651-061f-ad2d-a8b0965db02e",
Synchronized="2017-08-05 16:52:59.0")
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
@XendraTrl(Identifier="2d9a36ea-ba3f-4d90-ae8e-ac8a5c741fb6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d9a36ea-ba3f-4d90-ae8e-ac8a5c741fb6",
Synchronized="2017-08-05 16:52:59.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
