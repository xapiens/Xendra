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
import org.compiere.model.reference.REF_AD_MenuAction;
/** Generated Model for AD_Menu
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Menu extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Menu_ID id
@param trxName transaction
*/
public X_AD_Menu (Properties ctx, int AD_Menu_ID, String trxName)
{
super (ctx, AD_Menu_ID, trxName);
/** if (AD_Menu_ID == 0)
{
setAD_Menu_ID (0);
setEntityType (null);	
// U
setIsReadOnly (false);	
// N
setIsSOTrx (false);	
// N
setIsSummary (false);	
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
public X_AD_Menu (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=116 */
public static int Table_ID=MTable.getTable_ID("AD_Menu");

@XendraTrl(Identifier="5b1149d7-da39-c8eb-b339-62e5f55346b3")
public static String es_PE_TAB_Menu_Description="Mantener Menú";

@XendraTrl(Identifier="5b1149d7-da39-c8eb-b339-62e5f55346b3")
public static String es_PE_TAB_Menu_Name="Menú";

@XendraTrl(Identifier="5b1149d7-da39-c8eb-b339-62e5f55346b3")
public static String es_PE_TAB_Menu_Help="La pestaña de menú define un menú estructurado en forma de árbol el cual puede ser usado para la organización selecciónada";

@XendraTab(Name="Menu",Description="Maintain Menu",
Help="The Menu Tab defines the tree structured menu which will be used for the selected Organization. Note that the name and description will be automatically synchronized (overwritten), if not a summary node.",
AD_Window_ID="fd248a06-66dd-20be-4eb7-f84a7800e6ea",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5b1149d7-da39-c8eb-b339-62e5f55346b3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Menu="5b1149d7-da39-c8eb-b339-62e5f55346b3";

@XendraTrl(Identifier="f544111e-5a33-0eeb-9563-aff2f71bc18b")
public static String es_PE_TABLE_AD_Menu_Name="Menú";

@XendraTable(Name="Menu",Description="Identifies a Menu",Help="",TableName="AD_Menu",
AccessLevel="6",AD_Window_ID="fd248a06-66dd-20be-4eb7-f84a7800e6ea",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="f544111e-5a33-0eeb-9563-aff2f71bc18b",Synchronized="2017-08-16 11:40:28.0")
/** TableName=AD_Menu */
public static final String Table_Name="AD_Menu";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Menu");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_Menu");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Menu[").append(get_ID()).append("]");
return sb.toString();
}

/** Action AD_Reference=e7221c7b-2e98-09e1-fdde-58d677721189 */
public static final int ACTION_AD_Reference_ID=104;
/** Set Action.
@param Action Indicates the Action to be performed */
public void setAction (String Action)
{
if (Action == null || Action.equals(REF_AD_MenuAction.Process) || Action.equals(REF_AD_MenuAction.Workbench) || Action.equals(REF_AD_MenuAction.Window) || Action.equals(REF_AD_MenuAction.Task) || Action.equals(REF_AD_MenuAction.Form) || Action.equals(REF_AD_MenuAction.Report) || Action.equals(REF_AD_MenuAction.WorkFlow));
 else throw new IllegalArgumentException ("Action Invalid value - " + Action + " - Reference_ID=104 - P - B - W - T - X - R - F");
if (Action != null && Action.length() > 1)
{
log.warning("Length > 1 - truncated");
Action = Action.substring(0,0);
}
set_Value (COLUMNNAME_Action, Action);
}
/** Get Action.
@return Indicates the Action to be performed */
public String getAction() 
{
return (String)get_Value(COLUMNNAME_Action);
}

@XendraTrl(Identifier="4c5df7f3-d8c5-a588-7fe3-a48e4cd6754c")
public static String es_PE_FIELD_Menu_Action_Description="Indica la Acción a ser ejecutada";

@XendraTrl(Identifier="4c5df7f3-d8c5-a588-7fe3-a48e4cd6754c")
public static String es_PE_FIELD_Menu_Action_Help="El campo Acción es una lista de despliegue hacia abajo que indica la acción a ser ejecutada por esta opción de menú.";

@XendraTrl(Identifier="4c5df7f3-d8c5-a588-7fe3-a48e4cd6754c")
public static String es_PE_FIELD_Menu_Action_Name="Acción";
@XendraField(AD_Column_ID="Action",
IsCentrallyMaintained=true,AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@IsSummary@=N",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4c5df7f3-d8c5-a588-7fe3-a48e4cd6754c")
public static final String FIELDNAME_Menu_Action="4c5df7f3-d8c5-a588-7fe3-a48e4cd6754c";

@XendraTrl(Identifier="97ac97ae-8e9e-16e2-463f-de63f3e6d11e")
public static String es_PE_COLUMN_Action_Name="Acción";

@XendraColumn(AD_Element_ID="b6288702-37a0-1060-f1a2-7db2ac231540",ColumnName="Action",
AD_Reference_ID=17,AD_Reference_Value_ID="e7221c7b-2e98-09e1-fdde-58d677721189",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="97ac97ae-8e9e-16e2-463f-de63f3e6d11e",Synchronized="2017-08-05 16:52:36.0")
/** Column name Action */
public static final String COLUMNNAME_Action = "Action";
/** Set Special Form.
@param AD_Form_ID Special Form */
public void setAD_Form_ID (int AD_Form_ID)
{
if (AD_Form_ID <= 0) set_Value (COLUMNNAME_AD_Form_ID, null);
 else 
set_Value (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
}
/** Get Special Form.
@return Special Form */
public int getAD_Form_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c74285e5-8e84-1c35-5035-2e06281f3c38")
public static String es_PE_FIELD_Menu_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="c74285e5-8e84-1c35-5035-2e06281f3c38")
public static String es_PE_FIELD_Menu_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraTrl(Identifier="c74285e5-8e84-1c35-5035-2e06281f3c38")
public static String es_PE_FIELD_Menu_SpecialForm_Name="Forma Especial";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=X",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c74285e5-8e84-1c35-5035-2e06281f3c38")
public static final String FIELDNAME_Menu_SpecialForm="c74285e5-8e84-1c35-5035-2e06281f3c38";

@XendraTrl(Identifier="7c9cf2a1-45ad-f097-9f62-7c66bee151c6")
public static String es_PE_COLUMN_AD_Form_ID_Name="Forma Especial";

@XendraColumn(AD_Element_ID="6e3fcf05-8a76-e0af-25a6-7a4ab20551f4",ColumnName="AD_Form_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c9cf2a1-45ad-f097-9f62-7c66bee151c6",
Synchronized="2017-08-05 16:52:36.0")
/** Column name AD_Form_ID */
public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
/** Set Menu.
@param AD_Menu_ID Identifies a Menu */
public void setAD_Menu_ID (int AD_Menu_ID)
{
if (AD_Menu_ID < 1) throw new IllegalArgumentException ("AD_Menu_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Menu_ID, Integer.valueOf(AD_Menu_ID));
}
/** Get Menu.
@return Identifies a Menu */
public int getAD_Menu_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Menu_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="af587c9e-ebb0-6302-0203-d648f30f296a")
public static String es_PE_FIELD_Menu_Menu_Description="Identifica un menú";

@XendraTrl(Identifier="af587c9e-ebb0-6302-0203-d648f30f296a")
public static String es_PE_FIELD_Menu_Menu_Help="El menú identifica un menú único. Los menús son usados para controlar el despliegue de aquellas pantallas a las que un usuario tiene que acceder.";

@XendraTrl(Identifier="af587c9e-ebb0-6302-0203-d648f30f296a")
public static String es_PE_FIELD_Menu_Menu_Name="Menú";
@XendraField(AD_Column_ID="AD_Menu_ID",
IsCentrallyMaintained=true,AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="af587c9e-ebb0-6302-0203-d648f30f296a")
public static final String FIELDNAME_Menu_Menu="af587c9e-ebb0-6302-0203-d648f30f296a";
/** Column name AD_Menu_ID */
public static final String COLUMNNAME_AD_Menu_ID = "AD_Menu_ID";
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID <= 0) set_Value (COLUMNNAME_AD_Process_ID, null);
 else 
set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bcb3f9de-b9f9-2317-5ebb-6e4310317605")
public static String es_PE_FIELD_Menu_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="bcb3f9de-b9f9-2317-5ebb-6e4310317605")
public static String es_PE_FIELD_Menu_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="bcb3f9de-b9f9-2317-5ebb-6e4310317605")
public static String es_PE_FIELD_Menu_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=P | @Action@=R",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bcb3f9de-b9f9-2317-5ebb-6e4310317605")
public static final String FIELDNAME_Menu_Process="bcb3f9de-b9f9-2317-5ebb-6e4310317605";

@XendraTrl(Identifier="6777f5f2-9a59-ba2c-90f2-3193d288786d")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6777f5f2-9a59-ba2c-90f2-3193d288786d",
Synchronized="2017-08-05 16:52:37.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set OS Task.
@param AD_Task_ID Operation System Task */
public void setAD_Task_ID (int AD_Task_ID)
{
if (AD_Task_ID <= 0) set_Value (COLUMNNAME_AD_Task_ID, null);
 else 
set_Value (COLUMNNAME_AD_Task_ID, Integer.valueOf(AD_Task_ID));
}
/** Get OS Task.
@return Operation System Task */
public int getAD_Task_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Task_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ac811b2-b713-7bd3-6689-2a1e64926e3e")
public static String es_PE_FIELD_Menu_OSTask_Description="Identificador de la tarea";

@XendraTrl(Identifier="2ac811b2-b713-7bd3-6689-2a1e64926e3e")
public static String es_PE_FIELD_Menu_OSTask_Help="El campo tarea indica una tarea única en el sistema";

@XendraTrl(Identifier="2ac811b2-b713-7bd3-6689-2a1e64926e3e")
public static String es_PE_FIELD_Menu_OSTask_Name="Tarea";
@XendraField(AD_Column_ID="AD_Task_ID",
IsCentrallyMaintained=true,AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Action@=T",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2ac811b2-b713-7bd3-6689-2a1e64926e3e")
public static final String FIELDNAME_Menu_OSTask="2ac811b2-b713-7bd3-6689-2a1e64926e3e";

@XendraTrl(Identifier="faa6b0fb-b71a-ac4a-12f2-b18a62f1427a")
public static String es_PE_COLUMN_AD_Task_ID_Name="Tarea";

@XendraColumn(AD_Element_ID="b760b68d-e9b1-5100-eab2-b34b6c0a1e20",ColumnName="AD_Task_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="faa6b0fb-b71a-ac4a-12f2-b18a62f1427a",
Synchronized="2017-08-05 16:52:37.0")
/** Column name AD_Task_ID */
public static final String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID <= 0) set_Value (COLUMNNAME_AD_Window_ID, null);
 else 
set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="119d2323-6c3a-943d-b217-40d176e0352f")
public static String es_PE_FIELD_Menu_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="119d2323-6c3a-943d-b217-40d176e0352f")
public static String es_PE_FIELD_Menu_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraTrl(Identifier="119d2323-6c3a-943d-b217-40d176e0352f")
public static String es_PE_FIELD_Menu_Window_Name="Ventana";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=W",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="119d2323-6c3a-943d-b217-40d176e0352f")
public static final String FIELDNAME_Menu_Window="119d2323-6c3a-943d-b217-40d176e0352f";

@XendraTrl(Identifier="8f0ffb2b-8142-5ec3-d5d8-70e08cb762bf")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f0ffb2b-8142-5ec3-d5d8-70e08cb762bf",
Synchronized="2017-08-05 16:52:37.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Workbench.
@param AD_Workbench_ID Collection of windows, reports */
public void setAD_Workbench_ID (int AD_Workbench_ID)
{
if (AD_Workbench_ID <= 0) set_Value (COLUMNNAME_AD_Workbench_ID, null);
 else 
set_Value (COLUMNNAME_AD_Workbench_ID, Integer.valueOf(AD_Workbench_ID));
}
/** Get Workbench.
@return Collection of windows, reports */
public int getAD_Workbench_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workbench_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e74c606-f2d8-eaae-b09c-888c0b47e62f")
public static String es_PE_FIELD_Menu_Workbench_Description="Colección de ventanas; Informes";

@XendraTrl(Identifier="2e74c606-f2d8-eaae-b09c-888c0b47e62f")
public static String es_PE_FIELD_Menu_Workbench_Name="Banco de Trabajo";

@XendraField(AD_Column_ID="AD_Workbench_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=B",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e74c606-f2d8-eaae-b09c-888c0b47e62f")
public static final String FIELDNAME_Menu_Workbench="2e74c606-f2d8-eaae-b09c-888c0b47e62f";

@XendraTrl(Identifier="34c1c376-3a4f-da91-c790-eacf295b1824")
public static String es_PE_COLUMN_AD_Workbench_ID_Name="Banco de Trabajo";

@XendraColumn(AD_Element_ID="0180b8d1-3c69-6355-84ad-0f02bb7058a2",ColumnName="AD_Workbench_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34c1c376-3a4f-da91-c790-eacf295b1824",
Synchronized="2017-08-05 16:52:37.0")
/** Column name AD_Workbench_ID */
public static final String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID <= 0) set_Value (COLUMNNAME_AD_Workflow_ID, null);
 else 
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

@XendraTrl(Identifier="cf07e44c-b792-7ea0-fa4b-c7efe5b1a450")
public static String es_PE_FIELD_Menu_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="cf07e44c-b792-7ea0-fa4b-c7efe5b1a450")
public static String es_PE_FIELD_Menu_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraTrl(Identifier="cf07e44c-b792-7ea0-fa4b-c7efe5b1a450")
public static String es_PE_FIELD_Menu_Workflow_Name="Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=F",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf07e44c-b792-7ea0-fa4b-c7efe5b1a450")
public static final String FIELDNAME_Menu_Workflow="cf07e44c-b792-7ea0-fa4b-c7efe5b1a450";

@XendraTrl(Identifier="60998dc0-5f98-b790-57b0-fdfaa99ddab7")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60998dc0-5f98-b790-57b0-fdfaa99ddab7",
Synchronized="2017-08-05 16:52:37.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
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

@XendraTrl(Identifier="8c08cb07-a04a-68b7-e36f-f7811c07fe89")
public static String es_PE_FIELD_Menu_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="8c08cb07-a04a-68b7-e36f-f7811c07fe89")
public static String es_PE_FIELD_Menu_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="8c08cb07-a04a-68b7-e36f-f7811c07fe89")
public static String es_PE_FIELD_Menu_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c08cb07-a04a-68b7-e36f-f7811c07fe89")
public static final String FIELDNAME_Menu_Description="8c08cb07-a04a-68b7-e36f-f7811c07fe89";

@XendraTrl(Identifier="73306b75-f532-a43a-63a9-8ac267bf4662")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73306b75-f532-a43a-63a9-8ac267bf4662",
Synchronized="2017-08-05 16:52:37.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

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

@XendraTrl(Identifier="700a40fb-4b4d-aac7-ff23-58df2bf913a8")
public static String es_PE_FIELD_Menu_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="700a40fb-4b4d-aac7-ff23-58df2bf913a8")
public static String es_PE_FIELD_Menu_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="700a40fb-4b4d-aac7-ff23-58df2bf913a8")
public static String es_PE_FIELD_Menu_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="700a40fb-4b4d-aac7-ff23-58df2bf913a8")
public static final String FIELDNAME_Menu_EntityType="700a40fb-4b4d-aac7-ff23-58df2bf913a8";

@XendraTrl(Identifier="2cccedd5-532a-5818-2d5d-f738f784ca32")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2cccedd5-532a-5818-2d5d-f738f784ca32",Synchronized="2017-08-05 16:52:37.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
@XendraTrl(Identifier="88e1927a-e311-4133-890e-69c222cff88e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88e1927a-e311-4133-890e-69c222cff88e",
Synchronized="2017-08-05 16:52:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="2d1368e8-0aac-823c-b858-7eecc5d1b5ab")
public static String es_PE_FIELD_Menu_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="2d1368e8-0aac-823c-b858-7eecc5d1b5ab")
public static String es_PE_FIELD_Menu_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="2d1368e8-0aac-823c-b858-7eecc5d1b5ab")
public static String es_PE_FIELD_Menu_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d1368e8-0aac-823c-b858-7eecc5d1b5ab")
public static final String FIELDNAME_Menu_ReadOnly="2d1368e8-0aac-823c-b858-7eecc5d1b5ab";

@XendraTrl(Identifier="f2fa5fed-6e60-2a4d-f318-aad9ffdea772")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2fa5fed-6e60-2a4d-f318-aad9ffdea772",
Synchronized="2017-08-05 16:52:37.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="856d25f5-8be9-1564-b505-ebfeb6e3b6f4")
public static String es_PE_FIELD_Menu_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="856d25f5-8be9-1564-b505-ebfeb6e3b6f4")
public static String es_PE_FIELD_Menu_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="856d25f5-8be9-1564-b505-ebfeb6e3b6f4")
public static String es_PE_FIELD_Menu_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@=N",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="856d25f5-8be9-1564-b505-ebfeb6e3b6f4")
public static final String FIELDNAME_Menu_SalesTransaction="856d25f5-8be9-1564-b505-ebfeb6e3b6f4";

@XendraTrl(Identifier="2af56272-b958-6338-1f86-b482fc6be62c")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2af56272-b958-6338-1f86-b482fc6be62c",
Synchronized="2017-08-05 16:52:37.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2c158337-5519-b05d-60c8-7c67f8ce7ce3")
public static String es_PE_FIELD_Menu_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="2c158337-5519-b05d-60c8-7c67f8ce7ce3")
public static String es_PE_FIELD_Menu_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="2c158337-5519-b05d-60c8-7c67f8ce7ce3")
public static String es_PE_FIELD_Menu_SummaryLevel_Name="Entidad Acumulada";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c158337-5519-b05d-60c8-7c67f8ce7ce3")
public static final String FIELDNAME_Menu_SummaryLevel="2c158337-5519-b05d-60c8-7c67f8ce7ce3";

@XendraTrl(Identifier="fdff738a-d88b-b3f1-b2e8-808cd6793a7b")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdff738a-d88b-b3f1-b2e8-808cd6793a7b",
Synchronized="2017-08-05 16:52:37.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
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

@XendraTrl(Identifier="15f887ad-2e88-37a3-760d-83926e967943")
public static String es_PE_FIELD_Menu_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="15f887ad-2e88-37a3-760d-83926e967943")
public static String es_PE_FIELD_Menu_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="15f887ad-2e88-37a3-760d-83926e967943")
public static String es_PE_FIELD_Menu_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="5b1149d7-da39-c8eb-b339-62e5f55346b3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="15f887ad-2e88-37a3-760d-83926e967943")
public static final String FIELDNAME_Menu_Name="15f887ad-2e88-37a3-760d-83926e967943";

@XendraTrl(Identifier="98cb4236-25ae-7527-b968-902255771b79")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98cb4236-25ae-7527-b968-902255771b79",
Synchronized="2017-08-05 16:52:37.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="848e88c6-a030-499f-8b9f-79897a24b6b1")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="848e88c6-a030-499f-8b9f-79897a24b6b1",
Synchronized="2017-08-05 16:52:37.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
