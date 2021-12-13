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
/** Generated Model for AD_WF_EventAudit
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_EventAudit extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_EventAudit_ID id
@param trxName transaction
*/
public X_AD_WF_EventAudit (Properties ctx, int AD_WF_EventAudit_ID, String trxName)
{
super (ctx, AD_WF_EventAudit_ID, trxName);
/** if (AD_WF_EventAudit_ID == 0)
{
setAD_Table_ID (0);
setAD_WF_EventAudit_ID (0);
setAD_WF_Node_ID (0);
setAD_WF_Process_ID (0);
setAD_WF_Responsible_ID (0);
setElapsedTimeMS (Env.ZERO);
setEventType (null);
setRecord_ID (0);
setWFState (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_EventAudit (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=649 */
public static int Table_ID=MTable.getTable_ID("AD_WF_EventAudit");

@XendraTrl(Identifier="427df360-6880-8f67-1217-0232173bc2dd")
public static String es_PE_TAB_Event_Description="Información de proceso de la intervención del acontecimiento de la actividad del flujo de trabajo.";

@XendraTrl(Identifier="427df360-6880-8f67-1217-0232173bc2dd")
public static String es_PE_TAB_Event_Help="Historia de los cambios ó actividad del proceso de flujo de trabajo";

@XendraTrl(Identifier="427df360-6880-8f67-1217-0232173bc2dd")
public static String es_PE_TAB_Event_Name="Evento";
@XendraTab(Name="Event",
Description="Workflow Process Activity Event Audit Information",
Help="History of chenges ov the Workflow Process Activity",
AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="6c6a8704-4aa8-5847-b7f2-0420648e5031",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="427df360-6880-8f67-1217-0232173bc2dd",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Event="427df360-6880-8f67-1217-0232173bc2dd";

@XendraTrl(Identifier="5928edeb-9b05-0fab-3079-0b29cf8cac3b")
public static String es_PE_TABLE_AD_WF_EventAudit_Name="Auditoria de Evento en Flujo de Trabajo";


@XendraTable(Name="Workflow Event Audit",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Workflow Process Activity Event Audit Information",Help="",
TableName="AD_WF_EventAudit",AccessLevel="7",AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="5928edeb-9b05-0fab-3079-0b29cf8cac3b",Synchronized="2020-03-03 21:36:08.0")
/** TableName=AD_WF_EventAudit */
public static final String Table_Name="AD_WF_EventAudit";


@XendraIndex(Name="ad_wf_eventaudit_parent",Identifier="b73f5b9e-5367-e077-edd2-5b3b872d0b79",
Column_Names="ad_wf_process_id, ad_wf_node_id",IsUnique="false",
TableIdentifier="b73f5b9e-5367-e077-edd2-5b3b872d0b79",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_wf_eventaudit_parent = "b73f5b9e-5367-e077-edd2-5b3b872d0b79";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_EventAudit");

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
    Table_ID = MTable.getTable_ID("AD_WF_EventAudit");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_EventAudit[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="342d59f5-24b9-d76a-6a61-c9f37611e68f")
public static String es_PE_FIELD_Event_Table_Name="Tabla";

@XendraTrl(Identifier="342d59f5-24b9-d76a-6a61-c9f37611e68f")
public static String es_PE_FIELD_Event_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="342d59f5-24b9-d76a-6a61-c9f37611e68f")
public static String es_PE_FIELD_Event_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="342d59f5-24b9-d76a-6a61-c9f37611e68f")
public static final String FIELDNAME_Event_Table="342d59f5-24b9-d76a-6a61-c9f37611e68f";

@XendraTrl(Identifier="5fc2c31e-4847-5184-ae1f-b3eb93019848")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fc2c31e-4847-5184-ae1f-b3eb93019848",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9d097f60-ec1a-1b46-4198-07630326c7c4")
public static String es_PE_FIELD_Event_UserContact_Name="Usuario";

@XendraTrl(Identifier="9d097f60-ec1a-1b46-4198-07630326c7c4")
public static String es_PE_FIELD_Event_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="9d097f60-ec1a-1b46-4198-07630326c7c4")
public static String es_PE_FIELD_Event_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d097f60-ec1a-1b46-4198-07630326c7c4")
public static final String FIELDNAME_Event_UserContact="9d097f60-ec1a-1b46-4198-07630326c7c4";

@XendraTrl(Identifier="842e1b73-200d-1619-866c-504ac29e24c1")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="842e1b73-200d-1619-866c-504ac29e24c1",Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Workflow Event Audit.
@param AD_WF_EventAudit_ID Workflow Process Activity Event Audit Information */
public void setAD_WF_EventAudit_ID (int AD_WF_EventAudit_ID)
{
if (AD_WF_EventAudit_ID < 1) throw new IllegalArgumentException ("AD_WF_EventAudit_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_EventAudit_ID, Integer.valueOf(AD_WF_EventAudit_ID));
}
/** Get Workflow Event Audit.
@return Workflow Process Activity Event Audit Information */
public int getAD_WF_EventAudit_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_EventAudit_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_WF_EventAudit_ID()));
}

@XendraTrl(Identifier="972b6a9b-8072-bf7e-206d-ed64185cc290")
public static String es_PE_FIELD_Event_WorkflowEventAudit_Name="Auditoria de Evento en Flujo de Trabajo";

@XendraTrl(Identifier="972b6a9b-8072-bf7e-206d-ed64185cc290")
public static String es_PE_FIELD_Event_WorkflowEventAudit_Description="Información del proceso de intervención del acontecimiento de la actividad del flujo de trabajo";

@XendraTrl(Identifier="972b6a9b-8072-bf7e-206d-ed64185cc290")
public static String es_PE_FIELD_Event_WorkflowEventAudit_Help="Historia de los cambios de la actividad del proceso de flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_EventAudit_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=true,SeqNo=190,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="972b6a9b-8072-bf7e-206d-ed64185cc290")
public static final String FIELDNAME_Event_WorkflowEventAudit="972b6a9b-8072-bf7e-206d-ed64185cc290";
/** Column name AD_WF_EventAudit_ID */
public static final String COLUMNNAME_AD_WF_EventAudit_ID = "AD_WF_EventAudit_ID";
/** Set Node.
@param AD_WF_Node_ID Workflow Node (activity), step or process */
public void setAD_WF_Node_ID (int AD_WF_Node_ID)
{
if (AD_WF_Node_ID < 1) throw new IllegalArgumentException ("AD_WF_Node_ID is mandatory.");
set_Value (COLUMNNAME_AD_WF_Node_ID, Integer.valueOf(AD_WF_Node_ID));
}
/** Get Node.
@return Workflow Node (activity), step or process */
public int getAD_WF_Node_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Node_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b10945c4-ecd5-dd6e-5516-fc6743d6dbd4")
public static String es_PE_FIELD_Event_Node_Name="Nodo";

@XendraTrl(Identifier="b10945c4-ecd5-dd6e-5516-fc6743d6dbd4")
public static String es_PE_FIELD_Event_Node_Description="Nodo de flujo de trabajo; paso ó proceso";

@XendraTrl(Identifier="b10945c4-ecd5-dd6e-5516-fc6743d6dbd4")
public static String es_PE_FIELD_Event_Node_Help="El nodo de flujo de trabajo indica un paso ó proceso único en este flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Node_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b10945c4-ecd5-dd6e-5516-fc6743d6dbd4")
public static final String FIELDNAME_Event_Node="b10945c4-ecd5-dd6e-5516-fc6743d6dbd4";

@XendraTrl(Identifier="1d66631c-a53b-045b-01a4-6dd1c44fa5e6")
public static String es_PE_COLUMN_AD_WF_Node_ID_Name="Nodo";

@XendraColumn(AD_Element_ID="a21db5d2-692a-84ae-07db-7083b2eac74c",ColumnName="AD_WF_Node_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d66631c-a53b-045b-01a4-6dd1c44fa5e6",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_WF_Node_ID */
public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
/** Set Workflow Process.
@param AD_WF_Process_ID Actual Workflow Process Instance */
public void setAD_WF_Process_ID (int AD_WF_Process_ID)
{
if (AD_WF_Process_ID < 1) throw new IllegalArgumentException ("AD_WF_Process_ID is mandatory.");
set_Value (COLUMNNAME_AD_WF_Process_ID, Integer.valueOf(AD_WF_Process_ID));
}
/** Get Workflow Process.
@return Actual Workflow Process Instance */
public int getAD_WF_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d79e0464-db88-10b0-c22c-30ce4de88f91")
public static String es_PE_FIELD_Event_WorkflowProcess_Name="Proceso de Flujo de Trabajo";

@XendraTrl(Identifier="d79e0464-db88-10b0-c22c-30ce4de88f91")
public static String es_PE_FIELD_Event_WorkflowProcess_Description="Proceso actual del flujo de trabajo.";

@XendraTrl(Identifier="d79e0464-db88-10b0-c22c-30ce4de88f91")
public static String es_PE_FIELD_Event_WorkflowProcess_Help="Actual ejecución de un flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d79e0464-db88-10b0-c22c-30ce4de88f91")
public static final String FIELDNAME_Event_WorkflowProcess="d79e0464-db88-10b0-c22c-30ce4de88f91";

@XendraTrl(Identifier="6c6a8704-4aa8-5847-b7f2-0420648e5031")
public static String es_PE_COLUMN_AD_WF_Process_ID_Name="Proceso de Flujo de Trabajo";

@XendraColumn(AD_Element_ID="0153e3d9-957f-59bc-2db9-d8016b5ec7cd",ColumnName="AD_WF_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c6a8704-4aa8-5847-b7f2-0420648e5031",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_WF_Process_ID */
public static final String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
/** Set Workflow Responsible.
@param AD_WF_Responsible_ID Responsible for Workflow Execution */
public void setAD_WF_Responsible_ID (int AD_WF_Responsible_ID)
{
if (AD_WF_Responsible_ID < 1) throw new IllegalArgumentException ("AD_WF_Responsible_ID is mandatory.");
set_Value (COLUMNNAME_AD_WF_Responsible_ID, Integer.valueOf(AD_WF_Responsible_ID));
}
/** Get Workflow Responsible.
@return Responsible for Workflow Execution */
public int getAD_WF_Responsible_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Responsible_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="89eabb72-5892-17c0-d8f9-33ea1f79e89c")
public static String es_PE_FIELD_Event_WorkflowResponsible_Name="Responsable del Flujo de Trabajo";

@XendraTrl(Identifier="89eabb72-5892-17c0-d8f9-33ea1f79e89c")
public static String es_PE_FIELD_Event_WorkflowResponsible_Description="Responsable para la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="89eabb72-5892-17c0-d8f9-33ea1f79e89c")
public static String es_PE_FIELD_Event_WorkflowResponsible_Help="La última responsabilidad para el flujo de trabajo es con un usuario actual. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario final.";

@XendraField(AD_Column_ID="AD_WF_Responsible_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89eabb72-5892-17c0-d8f9-33ea1f79e89c")
public static final String FIELDNAME_Event_WorkflowResponsible="89eabb72-5892-17c0-d8f9-33ea1f79e89c";

@XendraTrl(Identifier="4725ece9-808f-c603-fcad-9c0b7af1c253")
public static String es_PE_COLUMN_AD_WF_Responsible_ID_Name="Responsable del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="4977b0dd-ed8d-9bb5-1edb-a21110bcf169",
ColumnName="AD_WF_Responsible_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4725ece9-808f-c603-fcad-9c0b7af1c253",Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_WF_Responsible_ID */
public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
/** Set Attribute Name.
@param AttributeName Name of the Attribute */
public void setAttributeName (String AttributeName)
{
if (AttributeName != null && AttributeName.length() > 60)
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
@XendraTrl(Identifier="d1f430d3-4487-92c9-af6c-12990d33b468")
public static String es_PE_FIELD_Event_AttributeName_Name="Nombre del Atributo";

@XendraTrl(Identifier="d1f430d3-4487-92c9-af6c-12990d33b468")
public static String es_PE_FIELD_Event_AttributeName_Description="Nombre del atributo";

@XendraTrl(Identifier="d1f430d3-4487-92c9-af6c-12990d33b468")
public static String es_PE_FIELD_Event_AttributeName_Help="Identificación del atributo";

@XendraField(AD_Column_ID="AttributeName",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1f430d3-4487-92c9-af6c-12990d33b468")
public static final String FIELDNAME_Event_AttributeName="d1f430d3-4487-92c9-af6c-12990d33b468";

@XendraTrl(Identifier="526bdfac-f1b0-f480-8e14-aa7bcc77eb55")
public static String es_PE_COLUMN_AttributeName_Name="Nombre del Atributo";

@XendraColumn(AD_Element_ID="8f4d88cb-23d3-78f4-8ce5-981e45136e01",ColumnName="AttributeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="526bdfac-f1b0-f480-8e14-aa7bcc77eb55",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AttributeName */
public static final String COLUMNNAME_AttributeName = "AttributeName";
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

@XendraTrl(Identifier="7cbacab0-bca6-931d-0424-3d570cd4374f")
public static String es_PE_FIELD_Event_Description_Name="Observación";

@XendraTrl(Identifier="7cbacab0-bca6-931d-0424-3d570cd4374f")
public static String es_PE_FIELD_Event_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="7cbacab0-bca6-931d-0424-3d570cd4374f")
public static String es_PE_FIELD_Event_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7cbacab0-bca6-931d-0424-3d570cd4374f")
public static final String FIELDNAME_Event_Description="7cbacab0-bca6-931d-0424-3d570cd4374f";

@XendraTrl(Identifier="e92886b1-4b2e-fede-4c42-1e7eac9e0b20")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e92886b1-4b2e-fede-4c42-1e7eac9e0b20",
Synchronized="2019-08-30 22:20:50.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Elapsed Time ms.
@param ElapsedTimeMS Elapsed Time in mili seconds */
public void setElapsedTimeMS (BigDecimal ElapsedTimeMS)
{
if (ElapsedTimeMS == null) throw new IllegalArgumentException ("ElapsedTimeMS is mandatory.");
set_Value (COLUMNNAME_ElapsedTimeMS, ElapsedTimeMS);
}
/** Get Elapsed Time ms.
@return Elapsed Time in mili seconds */
public BigDecimal getElapsedTimeMS() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ElapsedTimeMS);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a77ccb13-7e94-ecea-fffb-a8d63d24213c")
public static String es_PE_FIELD_Event_ElapsedTimeMs_Name="Lapso de tiempo transcurrido en MS";

@XendraTrl(Identifier="a77ccb13-7e94-ecea-fffb-a8d63d24213c")
public static String es_PE_FIELD_Event_ElapsedTimeMs_Description="Tiempo transcurrido en milesimas de segundo.";

@XendraTrl(Identifier="a77ccb13-7e94-ecea-fffb-a8d63d24213c")
public static String es_PE_FIELD_Event_ElapsedTimeMs_Help="Tiempo transcurrido en milesimas de segundo.";

@XendraField(AD_Column_ID="ElapsedTimeMS",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a77ccb13-7e94-ecea-fffb-a8d63d24213c")
public static final String FIELDNAME_Event_ElapsedTimeMs="a77ccb13-7e94-ecea-fffb-a8d63d24213c";

@XendraTrl(Identifier="28f5e670-a96f-4886-1c44-5c682b8cc29e")
public static String es_PE_COLUMN_ElapsedTimeMS_Name="Lapso de tiempo transcurrido en MS";

@XendraColumn(AD_Element_ID="35202ddc-4639-6317-f582-66a478771e26",ColumnName="ElapsedTimeMS",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28f5e670-a96f-4886-1c44-5c682b8cc29e",
Synchronized="2019-08-30 22:20:50.0")
/** Column name ElapsedTimeMS */
public static final String COLUMNNAME_ElapsedTimeMS = "ElapsedTimeMS";
/** Set Event Type.
@param EventType Type of Event */
public void setEventType (String EventType)
{
if (EventType.length() > 2)
{
log.warning("Length > 2 - truncated");
EventType = EventType.substring(0,1);
}
set_Value (COLUMNNAME_EventType, EventType);
}
/** Get Event Type.
@return Type of Event */
public String getEventType() 
{
return (String)get_Value(COLUMNNAME_EventType);
}

@XendraTrl(Identifier="e7c4d8c0-a5bf-b01d-6b89-3d565bb15df8")
public static String es_PE_FIELD_Event_EventType_Name="Tipo de Evento";

@XendraTrl(Identifier="e7c4d8c0-a5bf-b01d-6b89-3d565bb15df8")
public static String es_PE_FIELD_Event_EventType_Description="Tipo de Evento";

@XendraField(AD_Column_ID="EventType",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7c4d8c0-a5bf-b01d-6b89-3d565bb15df8")
public static final String FIELDNAME_Event_EventType="e7c4d8c0-a5bf-b01d-6b89-3d565bb15df8";

@XendraTrl(Identifier="80febc59-f435-5d77-2c9a-ca49f4dc8b3a")
public static String es_PE_COLUMN_EventType_Name="Tipo de Evento";

@XendraColumn(AD_Element_ID="f03adee7-3329-d849-eaf3-946618429e03",ColumnName="EventType",
AD_Reference_ID=17,AD_Reference_Value_ID="cd347785-1613-d1ad-918e-848e30db21c1",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="80febc59-f435-5d77-2c9a-ca49f4dc8b3a",Synchronized="2019-08-30 22:20:50.0")
/** Column name EventType */
public static final String COLUMNNAME_EventType = "EventType";
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
@XendraTrl(Identifier="d3516e81-77e3-4d1a-a9dc-d63bfa40db8c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3516e81-77e3-4d1a-a9dc-d63bfa40db8c",
Synchronized="2019-08-30 22:20:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set New Value.
@param NewValue New field value */
public void setNewValue (String NewValue)
{
if (NewValue != null && NewValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
NewValue = NewValue.substring(0,1999);
}
set_Value (COLUMNNAME_NewValue, NewValue);
}
/** Get New Value.
@return New field value */
public String getNewValue() 
{
String value = (String)get_Value(COLUMNNAME_NewValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7748ce50-a341-50bd-c387-235476e283cd")
public static String es_PE_FIELD_Event_NewValue_Name="Nuevo Valor";

@XendraTrl(Identifier="7748ce50-a341-50bd-c387-235476e283cd")
public static String es_PE_FIELD_Event_NewValue_Description="Nuevo valor de campo";

@XendraTrl(Identifier="7748ce50-a341-50bd-c387-235476e283cd")
public static String es_PE_FIELD_Event_NewValue_Help="Los nuevos datos entrarón en el campo.";

@XendraField(AD_Column_ID="NewValue",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7748ce50-a341-50bd-c387-235476e283cd")
public static final String FIELDNAME_Event_NewValue="7748ce50-a341-50bd-c387-235476e283cd";

@XendraTrl(Identifier="a55401b1-acbd-0d04-c592-7a2d410a7915")
public static String es_PE_COLUMN_NewValue_Name="Nuevo Valor";

@XendraColumn(AD_Element_ID="84162433-510b-6d06-35b4-a6e497b4a42c",ColumnName="NewValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a55401b1-acbd-0d04-c592-7a2d410a7915",
Synchronized="2019-08-30 22:20:50.0")
/** Column name NewValue */
public static final String COLUMNNAME_NewValue = "NewValue";
/** Set Old Value.
@param OldValue The old file data */
public void setOldValue (String OldValue)
{
if (OldValue != null && OldValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
OldValue = OldValue.substring(0,1999);
}
set_Value (COLUMNNAME_OldValue, OldValue);
}
/** Get Old Value.
@return The old file data */
public String getOldValue() 
{
String value = (String)get_Value(COLUMNNAME_OldValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="099133fe-ffba-9402-d57e-ec38063ef3c0")
public static String es_PE_FIELD_Event_OldValue_Name="Valor Antiguo";

@XendraTrl(Identifier="099133fe-ffba-9402-d57e-ec38063ef3c0")
public static String es_PE_FIELD_Event_OldValue_Description="Fichero antiguo de datos";

@XendraTrl(Identifier="099133fe-ffba-9402-d57e-ec38063ef3c0")
public static String es_PE_FIELD_Event_OldValue_Help="Antiguos datos sobreescritos en el campo";

@XendraField(AD_Column_ID="OldValue",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="099133fe-ffba-9402-d57e-ec38063ef3c0")
public static final String FIELDNAME_Event_OldValue="099133fe-ffba-9402-d57e-ec38063ef3c0";

@XendraTrl(Identifier="f9d1e5c9-53cb-4ff2-df79-759ab8bae4ef")
public static String es_PE_COLUMN_OldValue_Name="Valor Antiguo";

@XendraColumn(AD_Element_ID="4feb6453-1db6-f048-7af2-0279ff7859ea",ColumnName="OldValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9d1e5c9-53cb-4ff2-df79-759ab8bae4ef",
Synchronized="2019-08-30 22:20:50.0")
/** Column name OldValue */
public static final String COLUMNNAME_OldValue = "OldValue";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="32138015-5e3e-73c4-0461-10ebcfd16427")
public static String es_PE_FIELD_Event_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="32138015-5e3e-73c4-0461-10ebcfd16427")
public static String es_PE_FIELD_Event_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="32138015-5e3e-73c4-0461-10ebcfd16427")
public static String es_PE_FIELD_Event_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32138015-5e3e-73c4-0461-10ebcfd16427")
public static final String FIELDNAME_Event_RecordID="32138015-5e3e-73c4-0461-10ebcfd16427";

@XendraTrl(Identifier="5fb2d1df-4367-772d-d37f-f1c8c9b33a45")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fb2d1df-4367-772d-d37f-f1c8c9b33a45",
Synchronized="2019-08-30 22:20:50.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
set_Value (COLUMNNAME_TextMsg, TextMsg);
}
/** Get Text Message.
@return Text Message */
public String getTextMsg() 
{
String value = (String)get_Value(COLUMNNAME_TextMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a42ec4d1-005c-a17d-899d-c05405a6b7ab")
public static String es_PE_FIELD_Event_TextMessage_Name="Mensaje de texto";

@XendraTrl(Identifier="a42ec4d1-005c-a17d-899d-c05405a6b7ab")
public static String es_PE_FIELD_Event_TextMessage_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a42ec4d1-005c-a17d-899d-c05405a6b7ab")
public static final String FIELDNAME_Event_TextMessage="a42ec4d1-005c-a17d-899d-c05405a6b7ab";

@XendraTrl(Identifier="9b4074cf-5e24-ec50-79ac-617247945a8d")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b4074cf-5e24-ec50-79ac-617247945a8d",
Synchronized="2019-08-30 22:20:50.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
/** Set Workflow State.
@param WFState State of the execution of the workflow */
public void setWFState (String WFState)
{
if (WFState.length() > 2)
{
log.warning("Length > 2 - truncated");
WFState = WFState.substring(0,1);
}
set_Value (COLUMNNAME_WFState, WFState);
}
/** Get Workflow State.
@return State of the execution of the workflow */
public String getWFState() 
{
return (String)get_Value(COLUMNNAME_WFState);
}

@XendraTrl(Identifier="40af8897-6cc3-c768-b07d-e383b0bcea4e")
public static String es_PE_FIELD_Event_WorkflowState_Name="Estado del Flujo de Trabajo";

@XendraTrl(Identifier="40af8897-6cc3-c768-b07d-e383b0bcea4e")
public static String es_PE_FIELD_Event_WorkflowState_Description="Estado de la ejecución del flujo de trabajo.";

@XendraField(AD_Column_ID="WFState",IsCentrallyMaintained=true,
AD_Tab_ID="427df360-6880-8f67-1217-0232173bc2dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40af8897-6cc3-c768-b07d-e383b0bcea4e")
public static final String FIELDNAME_Event_WorkflowState="40af8897-6cc3-c768-b07d-e383b0bcea4e";

@XendraTrl(Identifier="af1dc5f2-cfd6-3367-1920-d4541ab75ecd")
public static String es_PE_COLUMN_WFState_Name="Estado del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="1c1cad98-960c-5434-c428-01af08ef4e75",ColumnName="WFState",
AD_Reference_ID=17,AD_Reference_Value_ID="28a0900a-bee4-008a-c714-8d99ca7ab5d6",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="af1dc5f2-cfd6-3367-1920-d4541ab75ecd",Synchronized="2019-08-30 22:20:50.0")
/** Column name WFState */
public static final String COLUMNNAME_WFState = "WFState";
}
