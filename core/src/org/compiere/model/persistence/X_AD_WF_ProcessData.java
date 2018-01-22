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
/** Generated Model for AD_WF_ProcessData
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_ProcessData extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_ProcessData_ID id
@param trxName transaction
*/
public X_AD_WF_ProcessData (Properties ctx, int AD_WF_ProcessData_ID, String trxName)
{
super (ctx, AD_WF_ProcessData_ID, trxName);
/** if (AD_WF_ProcessData_ID == 0)
{
setAD_WF_ProcessData_ID (0);
setAD_WF_Process_ID (0);
setAttributeName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_ProcessData (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=648 */
public static int Table_ID=MTable.getTable_ID("AD_WF_ProcessData");

@XendraTrl(Identifier="217d9b2c-da78-ad27-ed93-b0e2a7267679")
public static String es_PE_TAB_Data_Description="Contexto de proceso de flujo de trabajo";

@XendraTrl(Identifier="217d9b2c-da78-ad27-ed93-b0e2a7267679")
public static String es_PE_TAB_Data_Name="Dato";

@XendraTrl(Identifier="217d9b2c-da78-ad27-ed93-b0e2a7267679")
public static String es_PE_TAB_Data_Help="Contexto de información del proceso y actividad de flujo de trabajo.";

@XendraTab(Name="Data",Description="Workflow Process Context",
Help="Context information of the workflow process and activity",
AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="217d9b2c-da78-ad27-ed93-b0e2a7267679",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Data="217d9b2c-da78-ad27-ed93-b0e2a7267679";

@XendraTrl(Identifier="64c2a3ac-2251-59c0-5a64-daa9ca5a8a77")
public static String es_PE_TABLE_AD_WF_ProcessData_Name="Fecha de Proceso de Flujo de Trabajo";


@XendraTable(Name="Workflow Process Data",Description="Workflow Process Context",Help="",
TableName="AD_WF_ProcessData",AccessLevel="7",AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="64c2a3ac-2251-59c0-5a64-daa9ca5a8a77",Synchronized="2017-08-16 11:41:12.0")
/** TableName=AD_WF_ProcessData */
public static final String Table_Name="AD_WF_ProcessData";


@XendraIndex(Name="ad_wf_processdata_process",Identifier="21bdd1f1-7df1-f2c5-848b-b746bcdacfc1",
Column_Names="ad_wf_process_id",IsUnique="false",
TableIdentifier="21bdd1f1-7df1-f2c5-848b-b746bcdacfc1",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_wf_processdata_process = "21bdd1f1-7df1-f2c5-848b-b746bcdacfc1";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_ProcessData");

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
    Table_ID = MTable.getTable_ID("AD_WF_ProcessData");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_ProcessData[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Workflow Process Data.
@param AD_WF_ProcessData_ID Workflow Process Context */
public void setAD_WF_ProcessData_ID (int AD_WF_ProcessData_ID)
{
if (AD_WF_ProcessData_ID < 1) throw new IllegalArgumentException ("AD_WF_ProcessData_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_ProcessData_ID, Integer.valueOf(AD_WF_ProcessData_ID));
}
/** Get Workflow Process Data.
@return Workflow Process Context */
public int getAD_WF_ProcessData_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_ProcessData_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="19b5d08a-b2f5-5af7-2550-e6f215eefef7")
public static String es_PE_FIELD_Data_WorkflowProcessData_Description="Contexto de proceso flujo de trabajo";

@XendraTrl(Identifier="19b5d08a-b2f5-5af7-2550-e6f215eefef7")
public static String es_PE_FIELD_Data_WorkflowProcessData_Help="Contexto de información del proceso y actividad de el flujo de trabajo.";

@XendraTrl(Identifier="19b5d08a-b2f5-5af7-2550-e6f215eefef7")
public static String es_PE_FIELD_Data_WorkflowProcessData_Name="Fecha de Proceso de Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_ProcessData_ID",IsCentrallyMaintained=true,
AD_Tab_ID="217d9b2c-da78-ad27-ed93-b0e2a7267679",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19b5d08a-b2f5-5af7-2550-e6f215eefef7")
public static final String FIELDNAME_Data_WorkflowProcessData="19b5d08a-b2f5-5af7-2550-e6f215eefef7";
/** Column name AD_WF_ProcessData_ID */
public static final String COLUMNNAME_AD_WF_ProcessData_ID = "AD_WF_ProcessData_ID";
/** Set Workflow Process.
@param AD_WF_Process_ID Actual Workflow Process Instance */
public void setAD_WF_Process_ID (int AD_WF_Process_ID)
{
if (AD_WF_Process_ID < 1) throw new IllegalArgumentException ("AD_WF_Process_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_Process_ID, Integer.valueOf(AD_WF_Process_ID));
}
/** Get Workflow Process.
@return Actual Workflow Process Instance */
public int getAD_WF_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_WF_Process_ID()));
}

@XendraTrl(Identifier="f81d680c-1ccd-6aed-f001-bc06d965cbec")
public static String es_PE_FIELD_Data_WorkflowProcess_Description="Proceso actual del flujo de trabajo.";

@XendraTrl(Identifier="f81d680c-1ccd-6aed-f001-bc06d965cbec")
public static String es_PE_FIELD_Data_WorkflowProcess_Help="Actual ejecución de un flujo de trabajo.";

@XendraTrl(Identifier="f81d680c-1ccd-6aed-f001-bc06d965cbec")
public static String es_PE_FIELD_Data_WorkflowProcess_Name="Proceso de Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="217d9b2c-da78-ad27-ed93-b0e2a7267679",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f81d680c-1ccd-6aed-f001-bc06d965cbec")
public static final String FIELDNAME_Data_WorkflowProcess="f81d680c-1ccd-6aed-f001-bc06d965cbec";

@XendraTrl(Identifier="022774f7-cd49-6c9c-1497-f72b5a7bed2d")
public static String es_PE_COLUMN_AD_WF_Process_ID_Name="Proceso de Flujo de Trabajo";

@XendraColumn(AD_Element_ID="0153e3d9-957f-59bc-2db9-d8016b5ec7cd",ColumnName="AD_WF_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="022774f7-cd49-6c9c-1497-f72b5a7bed2d",
Synchronized="2017-08-05 16:53:02.0")
/** Column name AD_WF_Process_ID */
public static final String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
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
@XendraTrl(Identifier="bf927c3d-1da2-bbcf-8d63-9c2b61eca62e")
public static String es_PE_FIELD_Data_AttributeName_Description="Nombre del atributo";

@XendraTrl(Identifier="bf927c3d-1da2-bbcf-8d63-9c2b61eca62e")
public static String es_PE_FIELD_Data_AttributeName_Help="Identificación del atributo";

@XendraTrl(Identifier="bf927c3d-1da2-bbcf-8d63-9c2b61eca62e")
public static String es_PE_FIELD_Data_AttributeName_Name="Nombre del Atributo";

@XendraField(AD_Column_ID="AttributeName",IsCentrallyMaintained=true,
AD_Tab_ID="217d9b2c-da78-ad27-ed93-b0e2a7267679",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf927c3d-1da2-bbcf-8d63-9c2b61eca62e")
public static final String FIELDNAME_Data_AttributeName="bf927c3d-1da2-bbcf-8d63-9c2b61eca62e";

@XendraTrl(Identifier="9b50e777-2db7-a356-42b7-3b3ef997254f")
public static String es_PE_COLUMN_AttributeName_Name="Nombre del Atributo";

@XendraColumn(AD_Element_ID="8f4d88cb-23d3-78f4-8ce5-981e45136e01",ColumnName="AttributeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b50e777-2db7-a356-42b7-3b3ef997254f",
Synchronized="2017-08-05 16:53:02.0")
/** Column name AttributeName */
public static final String COLUMNNAME_AttributeName = "AttributeName";
/** Set Attribute Value.
@param AttributeValue Value of the Attribute */
public void setAttributeValue (String AttributeValue)
{
if (AttributeValue != null && AttributeValue.length() > 60)
{
log.warning("Length > 60 - truncated");
AttributeValue = AttributeValue.substring(0,59);
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
@XendraTrl(Identifier="fc19d4ba-e8f8-6816-1232-d87753146c88")
public static String es_PE_FIELD_Data_AttributeValue_Description="Valor de el atributo";

@XendraTrl(Identifier="fc19d4ba-e8f8-6816-1232-d87753146c88")
public static String es_PE_FIELD_Data_AttributeValue_Name="Valor de Atributo";

@XendraField(AD_Column_ID="AttributeValue",IsCentrallyMaintained=true,
AD_Tab_ID="217d9b2c-da78-ad27-ed93-b0e2a7267679",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc19d4ba-e8f8-6816-1232-d87753146c88")
public static final String FIELDNAME_Data_AttributeValue="fc19d4ba-e8f8-6816-1232-d87753146c88";

@XendraTrl(Identifier="5978dfac-1294-80d6-7ee2-730b8e091de4")
public static String es_PE_COLUMN_AttributeValue_Name="Valor de Atributo";

@XendraColumn(AD_Element_ID="e747c580-b4ad-e317-bd0d-dcb2a80c135e",ColumnName="AttributeValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5978dfac-1294-80d6-7ee2-730b8e091de4",
Synchronized="2017-08-05 16:53:02.0")
/** Column name AttributeValue */
public static final String COLUMNNAME_AttributeValue = "AttributeValue";
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
@XendraTrl(Identifier="3f5eaf54-7233-45f8-af69-aa0810565629")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f5eaf54-7233-45f8-af69-aa0810565629",
Synchronized="2017-08-05 16:53:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
