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
import org.compiere.model.reference.REF_WF_InstanceState;
/** Generated Model for AD_WF_Process
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_Process extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_Process_ID id
@param trxName transaction
*/
public X_AD_WF_Process (Properties ctx, int AD_WF_Process_ID, String trxName)
{
super (ctx, AD_WF_Process_ID, trxName);
/** if (AD_WF_Process_ID == 0)
{
setAD_Table_ID (0);
setAD_WF_Process_ID (0);
setAD_WF_Responsible_ID (0);
setAD_Workflow_ID (0);
setProcessed (false);	
// N
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
public X_AD_WF_Process (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=645 */
public static int Table_ID=MTable.getTable_ID("AD_WF_Process");

@XendraTrl(Identifier="177a0240-7b39-5024-2123-11378d230f7b")
public static String es_PE_TAB_Process_Description="Caso real del proceso del flujo del trabajo";

@XendraTrl(Identifier="177a0240-7b39-5024-2123-11378d230f7b")
public static String es_PE_TAB_Process_Name="Proceso";

@XendraTrl(Identifier="177a0240-7b39-5024-2123-11378d230f7b")
public static String es_PE_TAB_Process_Help="Caso de una ejecución del flujo del trabajo.";

@XendraTab(Name="Process",Description="Actual Workflow Process Instance",
Help="Instance of a workflow execution",AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",
SeqNo=10,TabLevel=0,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="177a0240-7b39-5024-2123-11378d230f7b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Process="177a0240-7b39-5024-2123-11378d230f7b";

@XendraTrl(Identifier="1cb230d2-a6e8-fa36-12bb-cceea798d1f0")
public static String es_PE_TABLE_AD_WF_Process_Name="Proceso de Flujo de Trabajo";

@XendraTable(Name="Workflow Process",Description="Actual Workflow Process Instance",Help="",
TableName="AD_WF_Process",AccessLevel="7",AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="1cb230d2-a6e8-fa36-12bb-cceea798d1f0",Synchronized="2017-08-16 11:41:12.0")
/** TableName=AD_WF_Process */
public static final String Table_Name="AD_WF_Process";


@XendraIndex(Name="ad_wf_process_workflow",Identifier="41e8c430-acef-d2af-142c-67859210b002",
Column_Names="ad_workflow_id",IsUnique="false",
TableIdentifier="41e8c430-acef-d2af-142c-67859210b002",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_wf_process_workflow = "41e8c430-acef-d2af-142c-67859210b002";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_Process");

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
    Table_ID = MTable.getTable_ID("AD_WF_Process");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_Process[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Message.
@param AD_Message_ID System Message */
public void setAD_Message_ID (int AD_Message_ID)
{
if (AD_Message_ID <= 0) set_Value (COLUMNNAME_AD_Message_ID, null);
 else 
set_Value (COLUMNNAME_AD_Message_ID, Integer.valueOf(AD_Message_ID));
}
/** Get Message.
@return System Message */
public int getAD_Message_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Message_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="81ba1698-4edc-3a2c-f698-fb13d8b80c1b")
public static String es_PE_FIELD_Process_Message_Description="Mensaje del sistema";

@XendraTrl(Identifier="81ba1698-4edc-3a2c-f698-fb13d8b80c1b")
public static String es_PE_FIELD_Process_Message_Help="Mensajes de información y error.";

@XendraTrl(Identifier="81ba1698-4edc-3a2c-f698-fb13d8b80c1b")
public static String es_PE_FIELD_Process_Message_Name="Mensaje";

@XendraField(AD_Column_ID="AD_Message_ID",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81ba1698-4edc-3a2c-f698-fb13d8b80c1b")
public static final String FIELDNAME_Process_Message="81ba1698-4edc-3a2c-f698-fb13d8b80c1b";

@XendraTrl(Identifier="81e86b6d-472e-a976-4460-81ea3b6797f9")
public static String es_PE_COLUMN_AD_Message_ID_Name="Mensaje";

@XendraColumn(AD_Element_ID="22f38416-0f51-247a-d8ef-f2266976960d",ColumnName="AD_Message_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81e86b6d-472e-a976-4460-81ea3b6797f9",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_Message_ID */
public static final String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
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

@XendraTrl(Identifier="4f1ad364-8663-ff25-fdb5-579c94685ead")
public static String es_PE_FIELD_Process_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="4f1ad364-8663-ff25-fdb5-579c94685ead")
public static String es_PE_FIELD_Process_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="4f1ad364-8663-ff25-fdb5-579c94685ead")
public static String es_PE_FIELD_Process_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f1ad364-8663-ff25-fdb5-579c94685ead")
public static final String FIELDNAME_Process_Table="4f1ad364-8663-ff25-fdb5-579c94685ead";

@XendraTrl(Identifier="1d715e4c-027c-92c5-6024-ae6fae516703")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d715e4c-027c-92c5-6024-ae6fae516703",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

/** AD_User_ID AD_Reference=91f52193-02ab-6545-99f8-d6d30b9d03a1 */
public static final int AD_USER_ID_AD_Reference_ID=286;
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

@XendraTrl(Identifier="2a283b99-5036-6b8f-b7ca-ecaae441a484")
public static String es_PE_FIELD_Process_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="2a283b99-5036-6b8f-b7ca-ecaae441a484")
public static String es_PE_FIELD_Process_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="2a283b99-5036-6b8f-b7ca-ecaae441a484")
public static String es_PE_FIELD_Process_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a283b99-5036-6b8f-b7ca-ecaae441a484")
public static final String FIELDNAME_Process_UserContact="2a283b99-5036-6b8f-b7ca-ecaae441a484";

@XendraTrl(Identifier="1acf8b9c-5f98-1f72-0b16-78a12cb37d0b")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1acf8b9c-5f98-1f72-0b16-78a12cb37d0b",Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="ca2bef65-e98e-b500-9251-826541099a09")
public static String es_PE_FIELD_Process_WorkflowProcess_Description="Proceso actual del flujo de trabajo.";

@XendraTrl(Identifier="ca2bef65-e98e-b500-9251-826541099a09")
public static String es_PE_FIELD_Process_WorkflowProcess_Help="Actual ejecución de un flujo de trabajo.";

@XendraTrl(Identifier="ca2bef65-e98e-b500-9251-826541099a09")
public static String es_PE_FIELD_Process_WorkflowProcess_Name="Proceso de Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca2bef65-e98e-b500-9251-826541099a09")
public static final String FIELDNAME_Process_WorkflowProcess="ca2bef65-e98e-b500-9251-826541099a09";
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

@XendraTrl(Identifier="efa910dd-697c-0e9d-a3ef-2430d0c81339")
public static String es_PE_FIELD_Process_WorkflowResponsible_Description="Responsable para la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="efa910dd-697c-0e9d-a3ef-2430d0c81339")
public static String es_PE_FIELD_Process_WorkflowResponsible_Help="La última responsabilidad para el flujo de trabajo es con un usuario actual. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario final.";

@XendraTrl(Identifier="efa910dd-697c-0e9d-a3ef-2430d0c81339")
public static String es_PE_FIELD_Process_WorkflowResponsible_Name="Responsable del Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_Responsible_ID",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efa910dd-697c-0e9d-a3ef-2430d0c81339")
public static final String FIELDNAME_Process_WorkflowResponsible="efa910dd-697c-0e9d-a3ef-2430d0c81339";

@XendraTrl(Identifier="26ce5a47-f4cf-d2e3-5d81-79252fce9f23")
public static String es_PE_COLUMN_AD_WF_Responsible_ID_Name="Responsable del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="4977b0dd-ed8d-9bb5-1edb-a21110bcf169",
ColumnName="AD_WF_Responsible_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="26ce5a47-f4cf-d2e3-5d81-79252fce9f23",Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_WF_Responsible_ID */
public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID < 1) throw new IllegalArgumentException ("AD_Workflow_ID is mandatory.");
set_Value (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
}
/** Get Workflow.
@return Workflow or combination of tasks */
public int getAD_Workflow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Workflow_ID()));
}

@XendraTrl(Identifier="f449fde1-7726-1917-e7ba-50777759a024")
public static String es_PE_FIELD_Process_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="f449fde1-7726-1917-e7ba-50777759a024")
public static String es_PE_FIELD_Process_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraTrl(Identifier="f449fde1-7726-1917-e7ba-50777759a024")
public static String es_PE_FIELD_Process_Workflow_Name="Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f449fde1-7726-1917-e7ba-50777759a024")
public static final String FIELDNAME_Process_Workflow="f449fde1-7726-1917-e7ba-50777759a024";

@XendraTrl(Identifier="66466245-136c-54b4-9c55-d6bf37f75623")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66466245-136c-54b4-9c55-d6bf37f75623",
Synchronized="2017-08-05 16:53:01.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
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
@XendraTrl(Identifier="d62a4c11-f510-47a1-a1f3-30e64344cff2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d62a4c11-f510-47a1-a1f3-30e64344cff2",
Synchronized="2017-08-05 16:53:01.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Priority.
@param Priority Indicates if this request is of a high, medium or low priority. */
public void setPriority (int Priority)
{
set_Value (COLUMNNAME_Priority, Integer.valueOf(Priority));
}
/** Get Priority.
@return Indicates if this request is of a high, medium or low priority. */
public int getPriority() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Priority);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d2e8ccc-5018-0918-b98c-5396dad92ae6")
public static String es_PE_FIELD_Process_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="0d2e8ccc-5018-0918-b98c-5396dad92ae6")
public static String es_PE_FIELD_Process_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraTrl(Identifier="0d2e8ccc-5018-0918-b98c-5396dad92ae6")
public static String es_PE_FIELD_Process_Priority_Name="Prioridad";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d2e8ccc-5018-0918-b98c-5396dad92ae6")
public static final String FIELDNAME_Process_Priority="0d2e8ccc-5018-0918-b98c-5396dad92ae6";

@XendraTrl(Identifier="60baa77e-c9fd-0256-3600-159a236f424d")
public static String es_PE_COLUMN_Priority_Name="Prioridad";

@XendraColumn(AD_Element_ID="5057921e-c21f-a6bc-898d-053fcc239847",ColumnName="Priority",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60baa77e-c9fd-0256-3600-159a236f424d",
Synchronized="2017-08-05 16:53:01.0")
/** Column name Priority */
public static final String COLUMNNAME_Priority = "Priority";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e1290e19-14a2-905d-36b1-da05abe5f962")
public static String es_PE_FIELD_Process_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="e1290e19-14a2-905d-36b1-da05abe5f962")
public static String es_PE_FIELD_Process_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="e1290e19-14a2-905d-36b1-da05abe5f962")
public static String es_PE_FIELD_Process_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1290e19-14a2-905d-36b1-da05abe5f962")
public static final String FIELDNAME_Process_Processed="e1290e19-14a2-905d-36b1-da05abe5f962";

@XendraTrl(Identifier="f457010e-bb23-5197-c565-126576ae28b3")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f457010e-bb23-5197-c565-126576ae28b3",
Synchronized="2017-08-05 16:53:01.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e0d8d18a-e06f-d90a-8ca8-1d1803175e35")
public static String es_PE_FIELD_Process_ProcessNow_Description="Manejador de Proceso";

@XendraTrl(Identifier="e0d8d18a-e06f-d90a-8ca8-1d1803175e35")
public static String es_PE_FIELD_Process_ProcessNow_Name="Manejador de Procesos";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0d8d18a-e06f-d90a-8ca8-1d1803175e35")
public static final String FIELDNAME_Process_ProcessNow="e0d8d18a-e06f-d90a-8ca8-1d1803175e35";

@XendraTrl(Identifier="1392d33b-1e4f-ab8b-81fe-e805b1c591cc")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="147bebd9-c691-9f9d-6d72-93af4877a510",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1392d33b-1e4f-ab8b-81fe-e805b1c591cc",Synchronized="2017-08-05 16:53:01.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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

@XendraTrl(Identifier="880beeab-4983-faa2-ffac-9c47199bf69b")
public static String es_PE_FIELD_Process_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="880beeab-4983-faa2-ffac-9c47199bf69b")
public static String es_PE_FIELD_Process_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="880beeab-4983-faa2-ffac-9c47199bf69b")
public static String es_PE_FIELD_Process_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="880beeab-4983-faa2-ffac-9c47199bf69b")
public static final String FIELDNAME_Process_RecordID="880beeab-4983-faa2-ffac-9c47199bf69b";

@XendraTrl(Identifier="5cad4dc3-716d-0e7a-87d9-5ae68c3f58d0")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cad4dc3-716d-0e7a-87d9-5ae68c3f58d0",
Synchronized="2017-08-05 16:53:01.0")
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
@XendraTrl(Identifier="fe61443c-ad1b-993f-bc75-d2978d08c00e")
public static String es_PE_FIELD_Process_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="fe61443c-ad1b-993f-bc75-d2978d08c00e")
public static String es_PE_FIELD_Process_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe61443c-ad1b-993f-bc75-d2978d08c00e")
public static final String FIELDNAME_Process_TextMessage="fe61443c-ad1b-993f-bc75-d2978d08c00e";

@XendraTrl(Identifier="b214a8e2-35b0-26db-65f3-c7afa4be28be")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b214a8e2-35b0-26db-65f3-c7afa4be28be",
Synchronized="2017-08-05 16:53:01.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";

/** WFState AD_Reference=28a0900a-bee4-008a-c714-8d99ca7ab5d6 */
public static final int WFSTATE_AD_Reference_ID=305;
/** Set Workflow State.
@param WFState State of the execution of the workflow */
public void setWFState (String WFState)
{
if (WFState == null) throw new IllegalArgumentException ("WFState is mandatory");
if (WFState.equals(REF_WF_InstanceState.NotStarted) || WFState.equals(REF_WF_InstanceState.Running) || WFState.equals(REF_WF_InstanceState.Suspended) || WFState.equals(REF_WF_InstanceState.Completed) || WFState.equals(REF_WF_InstanceState.Aborted) || WFState.equals(REF_WF_InstanceState.Terminated));
 else throw new IllegalArgumentException ("WFState Invalid value - " + WFState + " - Reference_ID=305 - ON - OR - OS - CC - CA - CT");
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

@XendraTrl(Identifier="a5c7c615-64c6-76c4-4b4f-7128816eaf8f")
public static String es_PE_FIELD_Process_WorkflowState_Description="Estado de la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="a5c7c615-64c6-76c4-4b4f-7128816eaf8f")
public static String es_PE_FIELD_Process_WorkflowState_Name="Estado del Flujo de Trabajo";

@XendraField(AD_Column_ID="WFState",IsCentrallyMaintained=true,
AD_Tab_ID="177a0240-7b39-5024-2123-11378d230f7b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5c7c615-64c6-76c4-4b4f-7128816eaf8f")
public static final String FIELDNAME_Process_WorkflowState="a5c7c615-64c6-76c4-4b4f-7128816eaf8f";

@XendraTrl(Identifier="8f44945b-e69b-7ca1-2cc0-aa90f3628b7c")
public static String es_PE_COLUMN_WFState_Name="Estado del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="1c1cad98-960c-5434-c428-01af08ef4e75",ColumnName="WFState",
AD_Reference_ID=17,AD_Reference_Value_ID="28a0900a-bee4-008a-c714-8d99ca7ab5d6",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8f44945b-e69b-7ca1-2cc0-aa90f3628b7c",Synchronized="2017-08-05 16:53:01.0")
/** Column name WFState */
public static final String COLUMNNAME_WFState = "WFState";
}
