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
import org.compiere.model.reference.REF_WF_Action;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.model.reference.REF_AD_WF_NodeEMailRecipient;
import org.compiere.model.reference.REF_WF_Start_FinishMode;
import org.compiere.model.reference.REF_WF_Join_Split;
import org.compiere.model.reference.REF_WF_SubFlowExecution;
/** Generated Model for AD_WF_Node
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_Node extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_Node_ID id
@param trxName transaction
*/
public X_AD_WF_Node (Properties ctx, int AD_WF_Node_ID, String trxName)
{
super (ctx, AD_WF_Node_ID, trxName);
/** if (AD_WF_Node_ID == 0)
{
setAction (null);	
// N
setAD_WF_Node_ID (0);
setAD_Workflow_ID (0);
setCost (Env.ZERO);
setDuration (0);
setEntityType (null);	
// U
setIsCentrallyMaintained (true);	
// Y
setJoinElement (null);	
// X
setName (null);
setSplitElement (null);	
// X
setValue (null);
setWaitingTime (0);
setXPosition (0);
setYPosition (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_WF_Node (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=129 */
public static int Table_ID=MTable.getTable_ID("AD_WF_Node");

@XendraTrl(Identifier="49fa629a-ffc0-760f-54ce-2f2c08aa0450")
public static String es_PE_TAB_Node_Description="Definir roles de flujo de trabajo";

@XendraTrl(Identifier="49fa629a-ffc0-760f-54ce-2f2c08aa0450")
public static String es_PE_TAB_Node_Name="Nodo";

@XendraTrl(Identifier="49fa629a-ffc0-760f-54ce-2f2c08aa0450")
public static String es_PE_TAB_Node_Help="La pestaña de nodo define cada nodo ó paso en este flujo de trabajo";

@XendraTab(Name="Node",Description="Define workflow nodes",
Help="The Node Tab defines each Node, Activity or step in this Workflow.<br> The action (actibity) type determines the execution: 'Route' may be used in routing control conditions.  'None' identifies manual execution.",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=50,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="49fa629a-ffc0-760f-54ce-2f2c08aa0450",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Node="49fa629a-ffc0-760f-54ce-2f2c08aa0450";

@XendraTrl(Identifier="fd3898d4-b14d-54e1-5b6f-156e0ee63a3e")
public static String es_PE_TABLE_AD_WF_Node_Name="Nodo";

@XendraTable(Name="Node",Description="Workflow Node (activity), step or process",Help="",
TableName="AD_WF_Node",AccessLevel="6",AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="fd3898d4-b14d-54e1-5b6f-156e0ee63a3e",Synchronized="2017-08-16 11:41:11.0")
/** TableName=AD_WF_Node */
public static final String Table_Name="AD_WF_Node";


@XendraIndex(Name="ad_wf_node_workflow",Identifier="42d75d07-1b8a-0681-5323-ebb2993dcf12",
Column_Names="ad_workflow_id",IsUnique="false",
TableIdentifier="42d75d07-1b8a-0681-5323-ebb2993dcf12",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_wf_node_workflow = "42d75d07-1b8a-0681-5323-ebb2993dcf12";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_Node");

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
    Table_ID = MTable.getTable_ID("AD_WF_Node");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_Node[").append(get_ID()).append("]");
return sb.toString();
}

/** Action AD_Reference=2b6d8133-4f63-4c86-1344-020528d8e0ef */
public static final int ACTION_AD_Reference_ID=302;
/** Set Action.
@param Action Indicates the Action to be performed */
public void setAction (String Action)
{
if (Action == null) throw new IllegalArgumentException ("Action is mandatory");
if (Action.equals(REF_WF_Action.DocumentAction) || Action.equals(REF_WF_Action.EMail) || Action.equals(REF_WF_Action.SubWorkflow) || Action.equals(REF_WF_Action.SetVariable) || Action.equals(REF_WF_Action.UserWindow) || Action.equals(REF_WF_Action.UserForm) || Action.equals(REF_WF_Action.AppsTask) || Action.equals(REF_WF_Action.AppsReport) || Action.equals(REF_WF_Action.AppsProcess) || Action.equals(REF_WF_Action.UserWorkbench) || Action.equals(REF_WF_Action.WaitSleep) || Action.equals(REF_WF_Action.UserChoice));
 else throw new IllegalArgumentException ("Action Invalid value - " + Action + " - Reference_ID=302 - D - M - F - V - W - X - T - R - P - B - Z - C");
if (Action.length() > 1)
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

@XendraTrl(Identifier="cae74953-f179-0204-353d-be527fa11954")
public static String es_PE_FIELD_Node_Action_Description="Indica la Acción a ser ejecutada";

@XendraTrl(Identifier="cae74953-f179-0204-353d-be527fa11954")
public static String es_PE_FIELD_Node_Action_Help="El campo Acción es una lista de despliegue hacia abajo que indica la acción a ser ejecutada por esta opción de menú.";

@XendraTrl(Identifier="cae74953-f179-0204-353d-be527fa11954")
public static String es_PE_FIELD_Node_Action_Name="Acción";
@XendraField(AD_Column_ID="Action",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cae74953-f179-0204-353d-be527fa11954")
public static final String FIELDNAME_Node_Action="cae74953-f179-0204-353d-be527fa11954";

@XendraTrl(Identifier="8b0a0768-eb65-5a91-5a76-787530de45ff")
public static String es_PE_COLUMN_Action_Name="Acción";

@XendraColumn(AD_Element_ID="b6288702-37a0-1060-f1a2-7db2ac231540",ColumnName="Action",
AD_Reference_ID=17,AD_Reference_Value_ID="2b6d8133-4f63-4c86-1344-020528d8e0ef",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b0a0768-eb65-5a91-5a76-787530de45ff",Synchronized="2017-08-05 16:53:00.0")
/** Column name Action */
public static final String COLUMNNAME_Action = "Action";
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID <= 0) set_Value (COLUMNNAME_AD_Column_ID, null);
 else 
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

@XendraTrl(Identifier="fef02f44-181e-dfaf-3bc1-baad10c9f35b")
public static String es_PE_FIELD_Node_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="fef02f44-181e-dfaf-3bc1-baad10c9f35b")
public static String es_PE_FIELD_Node_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="fef02f44-181e-dfaf-3bc1-baad10c9f35b")
public static String es_PE_FIELD_Node_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=V | @Action@=C",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fef02f44-181e-dfaf-3bc1-baad10c9f35b")
public static final String FIELDNAME_Node_Column="fef02f44-181e-dfaf-3bc1-baad10c9f35b";

@XendraTrl(Identifier="2c936052-269a-e65b-c71c-d939ae761261")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2c936052-269a-e65b-c71c-d939ae761261",Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
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

@XendraTrl(Identifier="24976840-272b-bf4e-2e54-19f017d84af3")
public static String es_PE_FIELD_Node_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="24976840-272b-bf4e-2e54-19f017d84af3")
public static String es_PE_FIELD_Node_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraTrl(Identifier="24976840-272b-bf4e-2e54-19f017d84af3")
public static String es_PE_FIELD_Node_SpecialForm_Name="Forma Especial";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=X",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24976840-272b-bf4e-2e54-19f017d84af3")
public static final String FIELDNAME_Node_SpecialForm="24976840-272b-bf4e-2e54-19f017d84af3";

@XendraTrl(Identifier="4daca908-f740-bc2c-1431-e891364a0a25")
public static String es_PE_COLUMN_AD_Form_ID_Name="Forma Especial";

@XendraColumn(AD_Element_ID="6e3fcf05-8a76-e0af-25a6-7a4ab20551f4",ColumnName="AD_Form_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4daca908-f740-bc2c-1431-e891364a0a25",
Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_Form_ID */
public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
/** Set Image.
@param AD_Image_ID Image or Icon */
public void setAD_Image_ID (int AD_Image_ID)
{
if (AD_Image_ID <= 0) set_Value (COLUMNNAME_AD_Image_ID, null);
 else 
set_Value (COLUMNNAME_AD_Image_ID, Integer.valueOf(AD_Image_ID));
}
/** Get Image.
@return Image or Icon */
public int getAD_Image_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Image_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0083e881-bcc6-3d96-fa84-d44557b3a95f")
public static String es_PE_FIELD_Node_Image_Description="Imagen del sistema";

@XendraTrl(Identifier="0083e881-bcc6-3d96-fa84-d44557b3a95f")
public static String es_PE_FIELD_Node_Image_Name="Imagen";
@XendraField(AD_Column_ID="AD_Image_ID",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0083e881-bcc6-3d96-fa84-d44557b3a95f")
public static final String FIELDNAME_Node_Image="0083e881-bcc6-3d96-fa84-d44557b3a95f";

@XendraTrl(Identifier="51e6f1ec-d8e8-3210-2ede-1f84f586f86b")
public static String es_PE_COLUMN_AD_Image_ID_Name="Imagen";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51e6f1ec-d8e8-3210-2ede-1f84f586f86b",
Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
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

@XendraTrl(Identifier="be79ddc9-30cb-20b8-93c4-d9c5acabf9da")
public static String es_PE_FIELD_Node_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="be79ddc9-30cb-20b8-93c4-d9c5acabf9da")
public static String es_PE_FIELD_Node_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="be79ddc9-30cb-20b8-93c4-d9c5acabf9da")
public static String es_PE_FIELD_Node_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=P | @Action@=R",DisplayLength=14,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="be79ddc9-30cb-20b8-93c4-d9c5acabf9da")
public static final String FIELDNAME_Node_Process="be79ddc9-30cb-20b8-93c4-d9c5acabf9da";

@XendraTrl(Identifier="c37f27a7-5205-36a4-9d72-8c6d84345ac6")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c37f27a7-5205-36a4-9d72-8c6d84345ac6",
Synchronized="2017-08-05 16:53:00.0")
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

@XendraTrl(Identifier="cf76e8c3-c224-f159-e2a7-a47435692ea2")
public static String es_PE_FIELD_Node_OSTask_Description="Identificador de la tarea";

@XendraTrl(Identifier="cf76e8c3-c224-f159-e2a7-a47435692ea2")
public static String es_PE_FIELD_Node_OSTask_Help="El campo tarea indica una tarea única en el sistema";

@XendraTrl(Identifier="cf76e8c3-c224-f159-e2a7-a47435692ea2")
public static String es_PE_FIELD_Node_OSTask_Name="Tarea";
@XendraField(AD_Column_ID="AD_Task_ID",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Action@=T",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cf76e8c3-c224-f159-e2a7-a47435692ea2")
public static final String FIELDNAME_Node_OSTask="cf76e8c3-c224-f159-e2a7-a47435692ea2";

@XendraTrl(Identifier="b658be35-9f18-1217-8a00-6389416ca687")
public static String es_PE_COLUMN_AD_Task_ID_Name="Tarea";

@XendraColumn(AD_Element_ID="b760b68d-e9b1-5100-eab2-b34b6c0a1e20",ColumnName="AD_Task_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b658be35-9f18-1217-8a00-6389416ca687",
Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_Task_ID */
public static final String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
/** Set Workflow Block.
@param AD_WF_Block_ID Workflow Transaction Execution Block */
public void setAD_WF_Block_ID (int AD_WF_Block_ID)
{
if (AD_WF_Block_ID <= 0) set_Value (COLUMNNAME_AD_WF_Block_ID, null);
 else 
set_Value (COLUMNNAME_AD_WF_Block_ID, Integer.valueOf(AD_WF_Block_ID));
}
/** Get Workflow Block.
@return Workflow Transaction Execution Block */
public int getAD_WF_Block_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Block_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7abddd68-daa1-92f8-11bd-a5ea0fe31414")
public static String es_PE_FIELD_Node_WorkflowBlock_Description="Workflow Transaction Execution Block";

@XendraTrl(Identifier="7abddd68-daa1-92f8-11bd-a5ea0fe31414")
public static String es_PE_FIELD_Node_WorkflowBlock_Help="A workflow execution block is optional and allows all work to be performed in a single transaction. If one step (node activity) fails, the entire work is rolled back.";

@XendraTrl(Identifier="7abddd68-daa1-92f8-11bd-a5ea0fe31414")
public static String es_PE_FIELD_Node_WorkflowBlock_Name="Workflow Block";

@XendraField(AD_Column_ID="AD_WF_Block_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=P",DisplayLength=14,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7abddd68-daa1-92f8-11bd-a5ea0fe31414")
public static final String FIELDNAME_Node_WorkflowBlock="7abddd68-daa1-92f8-11bd-a5ea0fe31414";

@XendraTrl(Identifier="5610170b-b8cd-b8cd-a8dc-c5697914902a")
public static String es_PE_COLUMN_AD_WF_Block_ID_Name="Bloque de Flujo de Trabajo";

@XendraColumn(AD_Element_ID="2dada8ea-4c2c-ca42-6ecf-7c3b0b1ea75f",ColumnName="AD_WF_Block_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="0b6b938c-c896-eae5-4877-798340374247",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5610170b-b8cd-b8cd-a8dc-c5697914902a",Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_WF_Block_ID */
public static final String COLUMNNAME_AD_WF_Block_ID = "AD_WF_Block_ID";
/** Set Node.
@param AD_WF_Node_ID Workflow Node (activity), step or process */
public void setAD_WF_Node_ID (int AD_WF_Node_ID)
{
if (AD_WF_Node_ID < 1) throw new IllegalArgumentException ("AD_WF_Node_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_WF_Node_ID, Integer.valueOf(AD_WF_Node_ID));
}
/** Get Node.
@return Workflow Node (activity), step or process */
public int getAD_WF_Node_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Node_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ba52a178-f831-7c4b-0fd8-7c1dc3d5d133")
public static String es_PE_FIELD_Node_Node_Description="Nodo de flujo de trabajo; paso ó proceso";

@XendraTrl(Identifier="ba52a178-f831-7c4b-0fd8-7c1dc3d5d133")
public static String es_PE_FIELD_Node_Node_Help="El nodo de flujo de trabajo indica un paso ó proceso único en este flujo de trabajo.";

@XendraTrl(Identifier="ba52a178-f831-7c4b-0fd8-7c1dc3d5d133")
public static String es_PE_FIELD_Node_Node_Name="Nodo";
@XendraField(AD_Column_ID="AD_WF_Node_ID",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ba52a178-f831-7c4b-0fd8-7c1dc3d5d133")
public static final String FIELDNAME_Node_Node="ba52a178-f831-7c4b-0fd8-7c1dc3d5d133";
/** Column name AD_WF_Node_ID */
public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
/** Set Workflow Responsible.
@param AD_WF_Responsible_ID Responsible for Workflow Execution */
public void setAD_WF_Responsible_ID (int AD_WF_Responsible_ID)
{
if (AD_WF_Responsible_ID <= 0) set_Value (COLUMNNAME_AD_WF_Responsible_ID, null);
 else 
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

@XendraTrl(Identifier="46c694b6-e2e8-534a-784a-5ca55ffb5ea0")
public static String es_PE_FIELD_Node_WorkflowResponsible_Description="Responsable para la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="46c694b6-e2e8-534a-784a-5ca55ffb5ea0")
public static String es_PE_FIELD_Node_WorkflowResponsible_Help="La última responsabilidad para el flujo de trabajo es con un usuario actual. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario final.";

@XendraTrl(Identifier="46c694b6-e2e8-534a-784a-5ca55ffb5ea0")
public static String es_PE_FIELD_Node_WorkflowResponsible_Name="Responsable del Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_WF_Responsible_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46c694b6-e2e8-534a-784a-5ca55ffb5ea0")
public static final String FIELDNAME_Node_WorkflowResponsible="46c694b6-e2e8-534a-784a-5ca55ffb5ea0";

@XendraTrl(Identifier="10f83737-110d-ba82-34af-8ba0072afa5f")
public static String es_PE_COLUMN_AD_WF_Responsible_ID_Name="Responsable del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="4977b0dd-ed8d-9bb5-1edb-a21110bcf169",
ColumnName="AD_WF_Responsible_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10f83737-110d-ba82-34af-8ba0072afa5f",Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_WF_Responsible_ID */
public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
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

@XendraTrl(Identifier="7e6be2a7-1fa5-feeb-82b5-50585d9de8b0")
public static String es_PE_FIELD_Node_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="7e6be2a7-1fa5-feeb-82b5-50585d9de8b0")
public static String es_PE_FIELD_Node_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraTrl(Identifier="7e6be2a7-1fa5-feeb-82b5-50585d9de8b0")
public static String es_PE_FIELD_Node_Window_Name="Ventana";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=W",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e6be2a7-1fa5-feeb-82b5-50585d9de8b0")
public static final String FIELDNAME_Node_Window="7e6be2a7-1fa5-feeb-82b5-50585d9de8b0";

@XendraTrl(Identifier="01468fd6-4625-92d1-4402-f7995d61fb0f")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01468fd6-4625-92d1-4402-f7995d61fb0f",
Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID < 1) throw new IllegalArgumentException ("AD_Workflow_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
}
/** Get Workflow.
@return Workflow or combination of tasks */
public int getAD_Workflow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="360296fd-c59c-ca87-fadc-7eb0047c803d")
public static String es_PE_FIELD_Node_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="360296fd-c59c-ca87-fadc-7eb0047c803d")
public static String es_PE_FIELD_Node_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraTrl(Identifier="360296fd-c59c-ca87-fadc-7eb0047c803d")
public static String es_PE_FIELD_Node_Workflow_Name="Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="360296fd-c59c-ca87-fadc-7eb0047c803d")
public static final String FIELDNAME_Node_Workflow="360296fd-c59c-ca87-fadc-7eb0047c803d";

@XendraTrl(Identifier="faefae75-3ea1-1b39-cde7-7e1cd016763e")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="faefae75-3ea1-1b39-cde7-7e1cd016763e",
Synchronized="2017-08-05 16:53:00.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
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
@XendraTrl(Identifier="d995e4cc-b9a7-f987-2038-882264b5bd5e")
public static String es_PE_FIELD_Node_AttributeName_Description="Nombre del atributo";

@XendraTrl(Identifier="d995e4cc-b9a7-f987-2038-882264b5bd5e")
public static String es_PE_FIELD_Node_AttributeName_Help="Identificación del atributo";

@XendraTrl(Identifier="d995e4cc-b9a7-f987-2038-882264b5bd5e")
public static String es_PE_FIELD_Node_AttributeName_Name="Nombre del Atributo";

@XendraField(AD_Column_ID="AttributeName",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=V",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d995e4cc-b9a7-f987-2038-882264b5bd5e")
public static final String FIELDNAME_Node_AttributeName="d995e4cc-b9a7-f987-2038-882264b5bd5e";

@XendraTrl(Identifier="e5ad3cbe-ac38-70ab-77ab-4e5f6e423745")
public static String es_PE_COLUMN_AttributeName_Name="Nombre del Atributo";

@XendraColumn(AD_Element_ID="8f4d88cb-23d3-78f4-8ce5-981e45136e01",ColumnName="AttributeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5ad3cbe-ac38-70ab-77ab-4e5f6e423745",
Synchronized="2017-08-05 16:53:00.0")
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
@XendraTrl(Identifier="97bf191f-e8d5-42d8-6e36-20177c59fd6b")
public static String es_PE_FIELD_Node_AttributeValue_Description="Valor de el atributo";

@XendraTrl(Identifier="97bf191f-e8d5-42d8-6e36-20177c59fd6b")
public static String es_PE_FIELD_Node_AttributeValue_Name="Valor de Atributo";

@XendraField(AD_Column_ID="AttributeValue",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=V",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97bf191f-e8d5-42d8-6e36-20177c59fd6b")
public static final String FIELDNAME_Node_AttributeValue="97bf191f-e8d5-42d8-6e36-20177c59fd6b";

@XendraTrl(Identifier="8eeb648a-01a3-5171-bdc3-d28c7db697be")
public static String es_PE_COLUMN_AttributeValue_Name="Valor de Atributo";

@XendraColumn(AD_Element_ID="e747c580-b4ad-e317-bd0d-dcb2a80c135e",ColumnName="AttributeValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8eeb648a-01a3-5171-bdc3-d28c7db697be",
Synchronized="2017-08-05 16:53:00.0")
/** Column name AttributeValue */
public static final String COLUMNNAME_AttributeValue = "AttributeValue";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aba0e9e9-efb1-411d-ab4b-e676f6ba7920")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aba0e9e9-efb1-411d-ab4b-e676f6ba7920",
Synchronized="2017-08-05 16:53:00.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Cost.
@param Cost Cost information */
public void setCost (BigDecimal Cost)
{
if (Cost == null) throw new IllegalArgumentException ("Cost is mandatory.");
set_Value (COLUMNNAME_Cost, Cost);
}
/** Get Cost.
@return Cost information */
public BigDecimal getCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="49c5981a-37bd-2eb6-702c-f50e3fc7d8a3")
public static String es_PE_FIELD_Node_Cost_Description="Información Costo";

@XendraTrl(Identifier="49c5981a-37bd-2eb6-702c-f50e3fc7d8a3")
public static String es_PE_FIELD_Node_Cost_Name="Costo";
@XendraField(AD_Column_ID="Cost",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",
AD_FieldGroup_ID="Simulation",IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,
SeqNo=390,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="49c5981a-37bd-2eb6-702c-f50e3fc7d8a3")
public static final String FIELDNAME_Node_Cost="49c5981a-37bd-2eb6-702c-f50e3fc7d8a3";

@XendraTrl(Identifier="701f593e-4ca1-5a6c-fa82-0c3f0116423b")
public static String es_PE_COLUMN_Cost_Name="Costo";

@XendraColumn(AD_Element_ID="ea07eea5-cd5c-5001-0f53-dfcaf5256889",ColumnName="Cost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="701f593e-4ca1-5a6c-fa82-0c3f0116423b",
Synchronized="2017-08-05 16:53:00.0")
/** Column name Cost */
public static final String COLUMNNAME_Cost = "Cost";
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

@XendraTrl(Identifier="a48607e5-466e-c49f-ef46-6658bc5cff13")
public static String es_PE_FIELD_Node_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="a48607e5-466e-c49f-ef46-6658bc5cff13")
public static String es_PE_FIELD_Node_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="a48607e5-466e-c49f-ef46-6658bc5cff13")
public static String es_PE_FIELD_Node_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a48607e5-466e-c49f-ef46-6658bc5cff13")
public static final String FIELDNAME_Node_Description="a48607e5-466e-c49f-ef46-6658bc5cff13";

@XendraTrl(Identifier="4421707e-deb8-37a4-7dc4-f9d724938b3e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4421707e-deb8-37a4-7dc4-f9d724938b3e",
Synchronized="2017-08-05 16:53:00.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null || DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction != null && DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="a855488a-5f72-ee20-e060-cc7142fc1898")
public static String es_PE_FIELD_Node_DocumentAction_Description="El estado destino del documento";

@XendraTrl(Identifier="a855488a-5f72-ee20-e060-cc7142fc1898")
public static String es_PE_FIELD_Node_DocumentAction_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraTrl(Identifier="a855488a-5f72-ee20-e060-cc7142fc1898")
public static String es_PE_FIELD_Node_DocumentAction_Name="Acción en el Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=D",DisplayLength=14,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a855488a-5f72-ee20-e060-cc7142fc1898")
public static final String FIELDNAME_Node_DocumentAction="a855488a-5f72-ee20-e060-cc7142fc1898";

@XendraTrl(Identifier="3fc47b66-8521-2909-6fb0-e44ae783a362")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=17,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3fc47b66-8521-2909-6fb0-e44ae783a362",Synchronized="2017-08-05 16:53:00.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set Duration.
@param Duration Normal Duration in Duration Unit */
public void setDuration (int Duration)
{
set_Value (COLUMNNAME_Duration, Integer.valueOf(Duration));
}
/** Get Duration.
@return Normal Duration in Duration Unit */
public int getDuration() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Duration);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a45fdb9f-0fb7-f633-8ef0-ebe92c768413")
public static String es_PE_FIELD_Node_Duration_Description="Duración en unidad de la duración";

@XendraTrl(Identifier="a45fdb9f-0fb7-f633-8ef0-ebe92c768413")
public static String es_PE_FIELD_Node_Duration_Help="Esperando la hora prevista para la ejecución";

@XendraTrl(Identifier="a45fdb9f-0fb7-f633-8ef0-ebe92c768413")
public static String es_PE_FIELD_Node_Duration_Name="Duración";

@XendraField(AD_Column_ID="Duration",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="Simulation",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a45fdb9f-0fb7-f633-8ef0-ebe92c768413")
public static final String FIELDNAME_Node_Duration="a45fdb9f-0fb7-f633-8ef0-ebe92c768413";

@XendraTrl(Identifier="1dbcbd7f-e88e-d369-e726-51d12d6f5ddb")
public static String es_PE_COLUMN_Duration_Name="Duración";

@XendraColumn(AD_Element_ID="84f247b5-401b-1072-23eb-df85d67fee81",ColumnName="Duration",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1dbcbd7f-e88e-d369-e726-51d12d6f5ddb",
Synchronized="2017-08-05 16:53:00.0")
/** Column name Duration */
public static final String COLUMNNAME_Duration = "Duration";
/** Set DurationLimit.
@param DurationLimit Normal Duration in Duration Unit */
public void setDurationLimit (int DurationLimit)
{
set_Value (COLUMNNAME_DurationLimit, Integer.valueOf(DurationLimit));
}
/** Get DurationLimit.
@return Normal Duration in Duration Unit */
public int getDurationLimit() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DurationLimit);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8e634b42-48dd-4623-a29c-4bb1255bcef9")
public static String es_PE_FIELD_Node_DurationLimit_Description="Normal Duration in Duration Unit";

@XendraTrl(Identifier="8e634b42-48dd-4623-a29c-4bb1255bcef9")
public static String es_PE_FIELD_Node_DurationLimit_Help="Expected (normal) Length of time for the execution";

@XendraTrl(Identifier="8e634b42-48dd-4623-a29c-4bb1255bcef9")
public static String es_PE_FIELD_Node_DurationLimit_Name="DurationLimit";

@XendraField(AD_Column_ID="DurationLimit",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:00.0",
Identifier="8e634b42-48dd-4623-a29c-4bb1255bcef9")
public static final String FIELDNAME_Node_DurationLimit="8e634b42-48dd-4623-a29c-4bb1255bcef9";

@XendraTrl(Identifier="535dab51-dbfe-051b-88f5-36c72bceba02")
public static String es_PE_COLUMN_DurationLimit_Name="DurationLimit";

@XendraColumn(AD_Element_ID="39e4bcd3-0fa4-efbd-8bf3-39fde04fb3db",ColumnName="DurationLimit",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="535dab51-dbfe-051b-88f5-36c72bceba02",
Synchronized="2017-08-05 16:53:00.0")
/** Column name DurationLimit */
public static final String COLUMNNAME_DurationLimit = "DurationLimit";
/** Set Dynamic Priority Change.
@param DynPriorityChange Change of priority when Activity is suspended waiting for user */
public void setDynPriorityChange (BigDecimal DynPriorityChange)
{
set_Value (COLUMNNAME_DynPriorityChange, DynPriorityChange);
}
/** Get Dynamic Priority Change.
@return Change of priority when Activity is suspended waiting for user */
public BigDecimal getDynPriorityChange() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DynPriorityChange);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d55f2818-8e04-29d5-d303-5b4018d82deb")
public static String es_PE_FIELD_Node_DynamicPriorityChange_Description="Cambio de la prioridad cuando la actividad es suspendida para usuario que espera.";

@XendraTrl(Identifier="d55f2818-8e04-29d5-d303-5b4018d82deb")
public static String es_PE_FIELD_Node_DynamicPriorityChange_Help="Comenzando con el proceso / nivel de la prioridad del nodo, la prioridad de la actividad suspendida puede ser cambiado dinamicamente. Ejemplo +5 cada minutos.";

@XendraTrl(Identifier="d55f2818-8e04-29d5-d303-5b4018d82deb")
public static String es_PE_FIELD_Node_DynamicPriorityChange_Name="Prioridad de Cambio Dinámico";

@XendraField(AD_Column_ID="DynPriorityChange",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=C | @Action@=W | @Action@=X | @Action@=B",DisplayLength=26,IsReadOnly=false,
SeqNo=370,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d55f2818-8e04-29d5-d303-5b4018d82deb")
public static final String FIELDNAME_Node_DynamicPriorityChange="d55f2818-8e04-29d5-d303-5b4018d82deb";

@XendraTrl(Identifier="c2f21edc-6590-1a66-06cb-e482ee231540")
public static String es_PE_COLUMN_DynPriorityChange_Name="Prioridad de Cambio Dinámico";

@XendraColumn(AD_Element_ID="cd3a2ef0-6d28-66b6-6a72-784161802223",ColumnName="DynPriorityChange",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2f21edc-6590-1a66-06cb-e482ee231540",
Synchronized="2017-08-05 16:53:00.0")
/** Column name DynPriorityChange */
public static final String COLUMNNAME_DynPriorityChange = "DynPriorityChange";

/** DynPriorityUnit AD_Reference=a8e24598-16fb-a392-7587-12a112938032 */
public static final int DYNPRIORITYUNIT_AD_Reference_ID=221;
/** Set Dynamic Priority Unit.
@param DynPriorityUnit Change of priority when Activity is suspended waiting for user */
public void setDynPriorityUnit (String DynPriorityUnit)
{
if (DynPriorityUnit == null || DynPriorityUnit.equals(REF__FrequencyType.Minute) || DynPriorityUnit.equals(REF__FrequencyType.Hour) || DynPriorityUnit.equals(REF__FrequencyType.Day) || DynPriorityUnit.equals(REF__FrequencyType.Once) || DynPriorityUnit.equals(REF__FrequencyType.Notification));
 else throw new IllegalArgumentException ("DynPriorityUnit Invalid value - " + DynPriorityUnit + " - Reference_ID=221 - M - H - D - O - N");
if (DynPriorityUnit != null && DynPriorityUnit.length() > 1)
{
log.warning("Length > 1 - truncated");
DynPriorityUnit = DynPriorityUnit.substring(0,0);
}
set_Value (COLUMNNAME_DynPriorityUnit, DynPriorityUnit);
}
/** Get Dynamic Priority Unit.
@return Change of priority when Activity is suspended waiting for user */
public String getDynPriorityUnit() 
{
return (String)get_Value(COLUMNNAME_DynPriorityUnit);
}

@XendraTrl(Identifier="fe3651ce-43d2-e783-fd0e-0322f18bad6b")
public static String es_PE_FIELD_Node_DynamicPriorityUnit_Description="Change of priority when Activity is suspended waiting for user";

@XendraTrl(Identifier="fe3651ce-43d2-e783-fd0e-0322f18bad6b")
public static String es_PE_FIELD_Node_DynamicPriorityUnit_Help="Starting with the Process / Node priority level, the priority of the suspended activity can be changed dynamically. Example +5 every 10 minutes";

@XendraTrl(Identifier="fe3651ce-43d2-e783-fd0e-0322f18bad6b")
public static String es_PE_FIELD_Node_DynamicPriorityUnit_Name="Prioridad Dinámica Unitaria";

@XendraField(AD_Column_ID="DynPriorityUnit",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=C | @Action@=W | @Action@=X | @Action@=B",DisplayLength=14,IsReadOnly=false,
SeqNo=360,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fe3651ce-43d2-e783-fd0e-0322f18bad6b")
public static final String FIELDNAME_Node_DynamicPriorityUnit="fe3651ce-43d2-e783-fd0e-0322f18bad6b";

@XendraTrl(Identifier="0732643a-e5a3-68d1-7ccc-b91a853342b0")
public static String es_PE_COLUMN_DynPriorityUnit_Name="Prioridad Dinámica Unitaria";

@XendraColumn(AD_Element_ID="80be4819-d4ca-d02b-f2c7-9765cf665ce9",ColumnName="DynPriorityUnit",
AD_Reference_ID=17,AD_Reference_Value_ID="a8e24598-16fb-a392-7587-12a112938032",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0732643a-e5a3-68d1-7ccc-b91a853342b0",Synchronized="2017-08-05 16:53:00.0")
/** Column name DynPriorityUnit */
public static final String COLUMNNAME_DynPriorityUnit = "DynPriorityUnit";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="90e3027b-b199-4be1-be4e-6f85c9e106d6")
public static String es_PE_FIELD_Node_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="90e3027b-b199-4be1-be4e-6f85c9e106d6")
public static String es_PE_FIELD_Node_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraTrl(Identifier="90e3027b-b199-4be1-be4e-6f85c9e106d6")
public static String es_PE_FIELD_Node_EMailAddress_Name="Email";
@XendraField(AD_Column_ID="EMail",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Action@=M",DisplayLength=25,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="90e3027b-b199-4be1-be4e-6f85c9e106d6")
public static final String FIELDNAME_Node_EMailAddress="90e3027b-b199-4be1-be4e-6f85c9e106d6";

@XendraTrl(Identifier="5b997d9f-23fd-d78a-6bc9-01784044426e")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b997d9f-23fd-d78a-6bc9-01784044426e",
Synchronized="2017-08-05 16:53:00.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";

/** EMailRecipient AD_Reference=2dfcfdc2-fe65-78db-4afa-de529d641aa1 */
public static final int EMAILRECIPIENT_AD_Reference_ID=363;
/** Set EMail Recipient.
@param EMailRecipient Recipient of the EMail */
public void setEMailRecipient (String EMailRecipient)
{
if (EMailRecipient == null || EMailRecipient.equals(REF_AD_WF_NodeEMailRecipient.DocumentOwner) || EMailRecipient.equals(REF_AD_WF_NodeEMailRecipient.DocumentBusinessPartner) || EMailRecipient.equals(REF_AD_WF_NodeEMailRecipient.WFResponsible));
 else throw new IllegalArgumentException ("EMailRecipient Invalid value - " + EMailRecipient + " - Reference_ID=363 - D - B - R");
if (EMailRecipient != null && EMailRecipient.length() > 1)
{
log.warning("Length > 1 - truncated");
EMailRecipient = EMailRecipient.substring(0,0);
}
set_Value (COLUMNNAME_EMailRecipient, EMailRecipient);
}
/** Get EMail Recipient.
@return Recipient of the EMail */
public String getEMailRecipient() 
{
return (String)get_Value(COLUMNNAME_EMailRecipient);
}

@XendraTrl(Identifier="2e28dea1-eda8-88c3-2a0a-a92b4e6106ba")
public static String es_PE_FIELD_Node_EMailRecipient_Description="Bandeja de Entrada del Correo Electrónico";

@XendraTrl(Identifier="2e28dea1-eda8-88c3-2a0a-a92b4e6106ba")
public static String es_PE_FIELD_Node_EMailRecipient_Name="EMail Bamdeja de Entrada";

@XendraField(AD_Column_ID="EMailRecipient",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=M",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e28dea1-eda8-88c3-2a0a-a92b4e6106ba")
public static final String FIELDNAME_Node_EMailRecipient="2e28dea1-eda8-88c3-2a0a-a92b4e6106ba";

@XendraTrl(Identifier="4f41698d-0dd7-998a-9164-f8504989759e")
public static String es_PE_COLUMN_EMailRecipient_Name="EMail Bamdeja de Entrada";

@XendraColumn(AD_Element_ID="18b999a9-48d7-6b26-950f-332a89198c15",ColumnName="EMailRecipient",
AD_Reference_ID=17,AD_Reference_Value_ID="2dfcfdc2-fe65-78db-4afa-de529d641aa1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4f41698d-0dd7-998a-9164-f8504989759e",Synchronized="2017-08-05 16:53:00.0")
/** Column name EMailRecipient */
public static final String COLUMNNAME_EMailRecipient = "EMailRecipient";

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

@XendraTrl(Identifier="0d4da88d-a580-6a14-cb64-c0dc2d794e35")
public static String es_PE_FIELD_Node_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="0d4da88d-a580-6a14-cb64-c0dc2d794e35")
public static String es_PE_FIELD_Node_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="0d4da88d-a580-6a14-cb64-c0dc2d794e35")
public static String es_PE_FIELD_Node_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d4da88d-a580-6a14-cb64-c0dc2d794e35")
public static final String FIELDNAME_Node_EntityType="0d4da88d-a580-6a14-cb64-c0dc2d794e35";

@XendraTrl(Identifier="fedc793f-1250-c2b5-7c71-595a3e9422fa")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fedc793f-1250-c2b5-7c71-595a3e9422fa",Synchronized="2017-08-05 16:53:00.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";

/** FinishMode AD_Reference=79c2f961-e1bf-3839-2291-e2231f520ca5 */
public static final int FINISHMODE_AD_Reference_ID=303;
/** Set Finish Mode.
@param FinishMode Workflow Activity Finish Mode */
public void setFinishMode (String FinishMode)
{
if (FinishMode == null || FinishMode.equals(REF_WF_Start_FinishMode.Automatic) || FinishMode.equals(REF_WF_Start_FinishMode.Manual));
 else throw new IllegalArgumentException ("FinishMode Invalid value - " + FinishMode + " - Reference_ID=303 - A - M");
if (FinishMode != null && FinishMode.length() > 1)
{
log.warning("Length > 1 - truncated");
FinishMode = FinishMode.substring(0,0);
}
set_Value (COLUMNNAME_FinishMode, FinishMode);
}
/** Get Finish Mode.
@return Workflow Activity Finish Mode */
public String getFinishMode() 
{
return (String)get_Value(COLUMNNAME_FinishMode);
}

@XendraTrl(Identifier="b5b6673a-7207-decd-104f-be40cb0a04d8")
public static String es_PE_FIELD_Node_FinishMode_Description="Modo de Terminación de la actividad de flujo de trabajo";

@XendraTrl(Identifier="b5b6673a-7207-decd-104f-be40cb0a04d8")
public static String es_PE_FIELD_Node_FinishMode_Help="Cómo el sistema funcionó en el final de una actividad. En automático implica vuelta cuando los usos invocados finalizan el control - El manual de usuario tiene que terminar explícitamente la actividad.";

@XendraTrl(Identifier="b5b6673a-7207-decd-104f-be40cb0a04d8")
public static String es_PE_FIELD_Node_FinishMode_Name="Modo de Terminación";

@XendraField(AD_Column_ID="FinishMode",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5b6673a-7207-decd-104f-be40cb0a04d8")
public static final String FIELDNAME_Node_FinishMode="b5b6673a-7207-decd-104f-be40cb0a04d8";

@XendraTrl(Identifier="761df583-a4cc-71a9-98cc-a79aefe6a433")
public static String es_PE_COLUMN_FinishMode_Name="Modo de Terminación";

@XendraColumn(AD_Element_ID="fa3ddc4c-dc45-2b58-9e63-8ef60ac880f5",ColumnName="FinishMode",
AD_Reference_ID=17,AD_Reference_Value_ID="79c2f961-e1bf-3839-2291-e2231f520ca5",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="761df583-a4cc-71a9-98cc-a79aefe6a433",Synchronized="2017-08-05 16:53:00.0")
/** Column name FinishMode */
public static final String COLUMNNAME_FinishMode = "FinishMode";
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

@XendraTrl(Identifier="413aef60-8c42-59b9-297b-22e12ee12c86")
public static String es_PE_FIELD_Node_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="413aef60-8c42-59b9-297b-22e12ee12c86")
public static String es_PE_FIELD_Node_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="413aef60-8c42-59b9-297b-22e12ee12c86")
public static String es_PE_FIELD_Node_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="413aef60-8c42-59b9-297b-22e12ee12c86")
public static final String FIELDNAME_Node_CommentHelp="413aef60-8c42-59b9-297b-22e12ee12c86";

@XendraTrl(Identifier="9f1471d9-86b4-edb4-10bd-703dc7f4e00a")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f1471d9-86b4-edb4-10bd-703dc7f4e00a",
Synchronized="2017-08-05 16:53:00.0")
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
@XendraTrl(Identifier="42c76034-402d-4f1e-bed9-2600a1a05fc7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42c76034-402d-4f1e-bed9-2600a1a05fc7",
Synchronized="2017-08-05 16:53:00.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="82ea1027-4228-e244-4544-107e5ec3901c")
public static String es_PE_FIELD_Node_CentrallyMaintained_Description="Información mantenida en la tabla elementos de sistema.";

@XendraTrl(Identifier="82ea1027-4228-e244-4544-107e5ec3901c")
public static String es_PE_FIELD_Node_CentrallyMaintained_Help="El cuadro de verificación mantenido centralmente indica si el nombre; descripción y ayuda son mantenidos centralmente.";

@XendraTrl(Identifier="82ea1027-4228-e244-4544-107e5ec3901c")
public static String es_PE_FIELD_Node_CentrallyMaintained_Name="Mantenido Centralmente";

@XendraField(AD_Column_ID="IsCentrallyMaintained",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82ea1027-4228-e244-4544-107e5ec3901c")
public static final String FIELDNAME_Node_CentrallyMaintained="82ea1027-4228-e244-4544-107e5ec3901c";

@XendraTrl(Identifier="97c64cd4-5ddd-0ade-038e-45adc7f0c6b1")
public static String es_PE_COLUMN_IsCentrallyMaintained_Name="Mantenido Centralmente";

@XendraColumn(AD_Element_ID="aec11edc-fae1-bcfe-5a84-d685b53a80a6",
ColumnName="IsCentrallyMaintained",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="97c64cd4-5ddd-0ade-038e-45adc7f0c6b1",Synchronized="2017-08-05 16:53:00.0")
/** Column name IsCentrallyMaintained */
public static final String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
/** Set IsMilestone.
@param IsMilestone IsMilestone */
public void setIsMilestone (boolean IsMilestone)
{
set_Value (COLUMNNAME_IsMilestone, Boolean.valueOf(IsMilestone));
}
/** Get IsMilestone.
@return IsMilestone */
public boolean isMilestone() 
{
Object oo = get_Value(COLUMNNAME_IsMilestone);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="43e7a743-8053-798d-c5ef-d7defcf97998")
public static String es_PE_COLUMN_IsMilestone_Name="IsMilestone";

@XendraColumn(AD_Element_ID="9558e462-b12f-671c-7589-a50ec872bfe6",ColumnName="IsMilestone",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43e7a743-8053-798d-c5ef-d7defcf97998",
Synchronized="2017-08-05 16:53:00.0")
/** Column name IsMilestone */
public static final String COLUMNNAME_IsMilestone = "IsMilestone";
/** Set IsSubcontracting.
@param IsSubcontracting IsSubcontracting */
public void setIsSubcontracting (boolean IsSubcontracting)
{
set_Value (COLUMNNAME_IsSubcontracting, Boolean.valueOf(IsSubcontracting));
}
/** Get IsSubcontracting.
@return IsSubcontracting */
public boolean isSubcontracting() 
{
Object oo = get_Value(COLUMNNAME_IsSubcontracting);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0c136e06-3337-adfd-1764-c21c55775986")
public static String es_PE_COLUMN_IsSubcontracting_Name="IsSubcontracting";

@XendraColumn(AD_Element_ID="ab53f1ae-ed05-61b9-2637-9e29d256fcdb",ColumnName="IsSubcontracting",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c136e06-3337-adfd-1764-c21c55775986",
Synchronized="2017-08-05 16:53:00.0")
/** Column name IsSubcontracting */
public static final String COLUMNNAME_IsSubcontracting = "IsSubcontracting";

/** JoinElement AD_Reference=b6a82eee-8ff1-fe8a-4224-1c7647d4fa98 */
public static final int JOINELEMENT_AD_Reference_ID=301;
/** Set Join Element.
@param JoinElement Semantics for multiple incoming Transitions */
public void setJoinElement (String JoinElement)
{
if (JoinElement == null) throw new IllegalArgumentException ("JoinElement is mandatory");
if (JoinElement.equals(REF_WF_Join_Split.AND) || JoinElement.equals(REF_WF_Join_Split.XOR));
 else throw new IllegalArgumentException ("JoinElement Invalid value - " + JoinElement + " - Reference_ID=301 - A - X");
if (JoinElement.length() > 1)
{
log.warning("Length > 1 - truncated");
JoinElement = JoinElement.substring(0,0);
}
set_Value (COLUMNNAME_JoinElement, JoinElement);
}
/** Get Join Element.
@return Semantics for multiple incoming Transitions */
public String getJoinElement() 
{
return (String)get_Value(COLUMNNAME_JoinElement);
}

@XendraTrl(Identifier="a5354896-d895-7cf8-b091-9c7452945f6b")
public static String es_PE_FIELD_Node_JoinElement_Description="Semantica para multiples transiciones";

@XendraTrl(Identifier="a5354896-d895-7cf8-b091-9c7452945f6b")
public static String es_PE_FIELD_Node_JoinElement_Help="Semántica para las múltiples transiciones entrantes para un Nodo/Activitidad. Y ensambla todos los hilos de rosca concurrentes - XOR requiere un hilo de rosca (ninguna sincronización).";

@XendraTrl(Identifier="a5354896-d895-7cf8-b091-9c7452945f6b")
public static String es_PE_FIELD_Node_JoinElement_Name="Elemento Unido";

@XendraField(AD_Column_ID="JoinElement",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5354896-d895-7cf8-b091-9c7452945f6b")
public static final String FIELDNAME_Node_JoinElement="a5354896-d895-7cf8-b091-9c7452945f6b";

@XendraTrl(Identifier="af24c1fb-b2cb-5a9c-7e3f-88a69c2cfd37")
public static String es_PE_COLUMN_JoinElement_Name="Elemento Unido";

@XendraColumn(AD_Element_ID="74634994-4014-e3db-54c0-8aeabc69984e",ColumnName="JoinElement",
AD_Reference_ID=17,AD_Reference_Value_ID="b6a82eee-8ff1-fe8a-4224-1c7647d4fa98",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="X",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="af24c1fb-b2cb-5a9c-7e3f-88a69c2cfd37",Synchronized="2017-08-05 16:53:00.0")
/** Column name JoinElement */
public static final String COLUMNNAME_JoinElement = "JoinElement";
/** Set MovingTime.
@param MovingTime MovingTime */
public void setMovingTime (int MovingTime)
{
set_Value (COLUMNNAME_MovingTime, Integer.valueOf(MovingTime));
}
/** Get MovingTime.
@return MovingTime */
public int getMovingTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_MovingTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a170a1ab-3d50-f788-8ed6-6a18064bf938")
public static String es_PE_COLUMN_MovingTime_Name="MovingTime";

@XendraColumn(AD_Element_ID="daf9f423-b9fd-9014-0b57-e53575bd7e97",ColumnName="MovingTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a170a1ab-3d50-f788-8ed6-6a18064bf938",
Synchronized="2017-08-05 16:53:00.0")
/** Column name MovingTime */
public static final String COLUMNNAME_MovingTime = "MovingTime";
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

@XendraTrl(Identifier="bb7e4364-c604-0652-f9f5-71395bc6671a")
public static String es_PE_FIELD_Node_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="bb7e4364-c604-0652-f9f5-71395bc6671a")
public static String es_PE_FIELD_Node_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="bb7e4364-c604-0652-f9f5-71395bc6671a")
public static String es_PE_FIELD_Node_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bb7e4364-c604-0652-f9f5-71395bc6671a")
public static final String FIELDNAME_Node_Name="bb7e4364-c604-0652-f9f5-71395bc6671a";

@XendraTrl(Identifier="3c4414ec-0f3b-daa8-b73f-8a96508384bc")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c4414ec-0f3b-daa8-b73f-8a96508384bc",
Synchronized="2017-08-05 16:53:00.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set overlapunits.
@param overlapunits overlapunits */
public void setoverlapunits (int overlapunits)
{
set_Value (COLUMNNAME_overlapunits, Integer.valueOf(overlapunits));
}
/** Get overlapunits.
@return overlapunits */
public int getoverlapunits() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_overlapunits);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3cd1d0ce-227a-45b6-81cd-6bb9d07e4472")
public static String es_PE_COLUMN_overlapunits_Name="overlapunits";

@XendraColumn(AD_Element_ID="80b6dae3-b46c-432b-aad7-c75186377c1f",ColumnName="overlapunits",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cd1d0ce-227a-45b6-81cd-6bb9d07e4472",
Synchronized="2017-08-05 16:53:00.0")
/** Column name overlapunits */
public static final String COLUMNNAME_overlapunits = "overlapunits";
/** Set Overlap_Units.
@param Overlap_Units Overlap_Units */
public void setOverlap_Units (int Overlap_Units)
{
set_Value (COLUMNNAME_Overlap_Units, Integer.valueOf(Overlap_Units));
}
/** Get Overlap_Units.
@return Overlap_Units */
public int getOverlap_Units() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Overlap_Units);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f00c1448-67ff-f9d4-56fe-d5d1495511c4")
public static String es_PE_COLUMN_Overlap_Units_Name="overlapunits";

@XendraColumn(AD_Element_ID="71c32fa5-e7d5-a799-41dd-b4ef9d9f64a8",ColumnName="Overlap_Units",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f00c1448-67ff-f9d4-56fe-d5d1495511c4",
Synchronized="2017-08-05 16:53:00.0")
/** Column name Overlap_Units */
public static final String COLUMNNAME_Overlap_Units = "Overlap_Units";
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

@XendraTrl(Identifier="3814ba95-cfee-b397-7740-1bf040684293")
public static String es_PE_FIELD_Node_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="3814ba95-cfee-b397-7740-1bf040684293")
public static String es_PE_FIELD_Node_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraTrl(Identifier="3814ba95-cfee-b397-7740-1bf040684293")
public static String es_PE_FIELD_Node_Priority_Name="Prioridad";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3814ba95-cfee-b397-7740-1bf040684293")
public static final String FIELDNAME_Node_Priority="3814ba95-cfee-b397-7740-1bf040684293";

@XendraTrl(Identifier="9b886a86-3f3e-ed62-416a-d6573e788c3b")
public static String es_PE_COLUMN_Priority_Name="Prioridad";

@XendraColumn(AD_Element_ID="5057921e-c21f-a6bc-898d-053fcc239847",ColumnName="Priority",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b886a86-3f3e-ed62-416a-d6573e788c3b",
Synchronized="2017-08-05 16:53:00.0")
/** Column name Priority */
public static final String COLUMNNAME_Priority = "Priority";
/** Set QueuingTime.
@param QueuingTime QueuingTime */
public void setQueuingTime (int QueuingTime)
{
set_Value (COLUMNNAME_QueuingTime, Integer.valueOf(QueuingTime));
}
/** Get QueuingTime.
@return QueuingTime */
public int getQueuingTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_QueuingTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="15d92178-e5d9-6e62-b7c8-d5b2ef9f6f3d")
public static String es_PE_COLUMN_QueuingTime_Name="QueuingTime";

@XendraColumn(AD_Element_ID="0927dce8-f6c3-08c5-0c0a-5761f2a1b839",ColumnName="QueuingTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15d92178-e5d9-6e62-b7c8-d5b2ef9f6f3d",
Synchronized="2017-08-05 16:53:00.0")
/** Column name QueuingTime */
public static final String COLUMNNAME_QueuingTime = "QueuingTime";
/** Set Mail Template.
@param R_MailText_ID Text templates for mailings */
public void setR_MailText_ID (int R_MailText_ID)
{
if (R_MailText_ID <= 0) set_Value (COLUMNNAME_R_MailText_ID, null);
 else 
set_Value (COLUMNNAME_R_MailText_ID, Integer.valueOf(R_MailText_ID));
}
/** Get Mail Template.
@return Text templates for mailings */
public int getR_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78d92563-b2b0-0c8b-0692-8326e1b6544f")
public static String es_PE_FIELD_Node_MailTemplate_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="78d92563-b2b0-0c8b-0692-8326e1b6544f")
public static String es_PE_FIELD_Node_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="78d92563-b2b0-0c8b-0692-8326e1b6544f")
public static String es_PE_FIELD_Node_MailTemplate_Name="Patrón de Correo";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=M",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78d92563-b2b0-0c8b-0692-8326e1b6544f")
public static final String FIELDNAME_Node_MailTemplate="78d92563-b2b0-0c8b-0692-8326e1b6544f";

@XendraTrl(Identifier="844f705f-5bd9-14ad-db79-52a9d1613743")
public static String es_PE_COLUMN_R_MailText_ID_Name="Patrón de Correo";

@XendraColumn(AD_Element_ID="02b75e55-f80b-d8c7-5f34-dfc8b6205e3e",ColumnName="R_MailText_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="844f705f-5bd9-14ad-db79-52a9d1613743",
Synchronized="2017-08-05 16:53:00.0")
/** Column name R_MailText_ID */
public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
/** Set Setup Time.
@param SetupTime Setup time before starting Production */
public void setSetupTime (int SetupTime)
{
set_Value (COLUMNNAME_SetupTime, Integer.valueOf(SetupTime));
}
/** Get Setup Time.
@return Setup time before starting Production */
public int getSetupTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SetupTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5939bc57-2324-99ae-9a27-00b88f89299e")
public static String es_PE_COLUMN_SetupTime_Name="Setup Time";

@XendraColumn(AD_Element_ID="a4a9a3ef-8759-dcb2-f229-535e609f1fed",ColumnName="SetupTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5939bc57-2324-99ae-9a27-00b88f89299e",
Synchronized="2017-08-05 16:53:00.0")
/** Column name SetupTime */
public static final String COLUMNNAME_SetupTime = "SetupTime";

/** SplitElement AD_Reference=b6a82eee-8ff1-fe8a-4224-1c7647d4fa98 */
public static final int SPLITELEMENT_AD_Reference_ID=301;
/** Set Split Element.
@param SplitElement Semantics for multiple outgoing Transitions */
public void setSplitElement (String SplitElement)
{
if (SplitElement == null) throw new IllegalArgumentException ("SplitElement is mandatory");
if (SplitElement.equals(REF_WF_Join_Split.AND) || SplitElement.equals(REF_WF_Join_Split.XOR));
 else throw new IllegalArgumentException ("SplitElement Invalid value - " + SplitElement + " - Reference_ID=301 - A - X");
if (SplitElement.length() > 1)
{
log.warning("Length > 1 - truncated");
SplitElement = SplitElement.substring(0,0);
}
set_Value (COLUMNNAME_SplitElement, SplitElement);
}
/** Get Split Element.
@return Semantics for multiple outgoing Transitions */
public String getSplitElement() 
{
return (String)get_Value(COLUMNNAME_SplitElement);
}

@XendraTrl(Identifier="6b49d3f2-7ab9-66af-3ac8-964a8d408188")
public static String es_PE_FIELD_Node_SplitElement_Description="Semántica para las múltiples transiciones salientes.";

@XendraTrl(Identifier="6b49d3f2-7ab9-66af-3ac8-964a8d408188")
public static String es_PE_FIELD_Node_SplitElement_Help="Semántica para las múltiples transiciones salientes para un Nodo/Actividad. Y representa multiples actividades concurrentes - XOR representa la primera transición con una condición verdadera de transición.";

@XendraTrl(Identifier="6b49d3f2-7ab9-66af-3ac8-964a8d408188")
public static String es_PE_FIELD_Node_SplitElement_Name="Partir Elemento";

@XendraField(AD_Column_ID="SplitElement",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b49d3f2-7ab9-66af-3ac8-964a8d408188")
public static final String FIELDNAME_Node_SplitElement="6b49d3f2-7ab9-66af-3ac8-964a8d408188";

@XendraTrl(Identifier="5bdfb604-ef93-31ac-31b4-5513235786ad")
public static String es_PE_COLUMN_SplitElement_Name="Partir Elemento";

@XendraColumn(AD_Element_ID="ed9f1280-3ee1-bc28-6b32-d482e1b8049e",ColumnName="SplitElement",
AD_Reference_ID=17,AD_Reference_Value_ID="b6a82eee-8ff1-fe8a-4224-1c7647d4fa98",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="X",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5bdfb604-ef93-31ac-31b4-5513235786ad",Synchronized="2017-08-05 16:53:00.0")
/** Column name SplitElement */
public static final String COLUMNNAME_SplitElement = "SplitElement";
/** Set Resource.
@param S_Resource_ID Resource */
public void setS_Resource_ID (int S_Resource_ID)
{
if (S_Resource_ID <= 0) set_Value (COLUMNNAME_S_Resource_ID, null);
 else 
set_Value (COLUMNNAME_S_Resource_ID, Integer.valueOf(S_Resource_ID));
}
/** Get Resource.
@return Resource */
public int getS_Resource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Resource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="69c55340-fa02-19a6-7675-4d4d51787263")
public static String es_PE_COLUMN_S_Resource_ID_Name="Resource";

@XendraColumn(AD_Element_ID="22f30913-1545-c2d4-4092-f033c05219ea",ColumnName="S_Resource_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69c55340-fa02-19a6-7675-4d4d51787263",
Synchronized="2017-08-05 16:53:00.0")
/** Column name S_Resource_ID */
public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";

/** StartMode AD_Reference=79c2f961-e1bf-3839-2291-e2231f520ca5 */
public static final int STARTMODE_AD_Reference_ID=303;
/** Set Start Mode.
@param StartMode Workflow Activity Start Mode  */
public void setStartMode (String StartMode)
{
if (StartMode == null || StartMode.equals(REF_WF_Start_FinishMode.Automatic) || StartMode.equals(REF_WF_Start_FinishMode.Manual));
 else throw new IllegalArgumentException ("StartMode Invalid value - " + StartMode + " - Reference_ID=303 - A - M");
if (StartMode != null && StartMode.length() > 1)
{
log.warning("Length > 1 - truncated");
StartMode = StartMode.substring(0,0);
}
set_Value (COLUMNNAME_StartMode, StartMode);
}
/** Get Start Mode.
@return Workflow Activity Start Mode  */
public String getStartMode() 
{
return (String)get_Value(COLUMNNAME_StartMode);
}

@XendraTrl(Identifier="135185d6-fe0b-59b2-c782-b80f375374da")
public static String es_PE_FIELD_Node_StartMode_Description="Modo de Inicio de la actividad FT";

@XendraTrl(Identifier="135185d6-fe0b-59b2-c782-b80f375374da")
public static String es_PE_FIELD_Node_StartMode_Help="Cómo es la ejecución de una actividad accionada. Automáticamente son accionados implícito por el sistema, manual explícitamente por el usuario.";

@XendraTrl(Identifier="135185d6-fe0b-59b2-c782-b80f375374da")
public static String es_PE_FIELD_Node_StartMode_Name="Modo de Inicio";

@XendraField(AD_Column_ID="StartMode",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="135185d6-fe0b-59b2-c782-b80f375374da")
public static final String FIELDNAME_Node_StartMode="135185d6-fe0b-59b2-c782-b80f375374da";

@XendraTrl(Identifier="4fb32324-2110-c547-d77c-99800f2d0bcc")
public static String es_PE_COLUMN_StartMode_Name="Modo de Inicio";

@XendraColumn(AD_Element_ID="fea26d73-7bc8-eb2f-be58-2fe661d56c40",ColumnName="StartMode",
AD_Reference_ID=17,AD_Reference_Value_ID="79c2f961-e1bf-3839-2291-e2231f520ca5",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4fb32324-2110-c547-d77c-99800f2d0bcc",Synchronized="2017-08-05 16:53:00.0")
/** Column name StartMode */
public static final String COLUMNNAME_StartMode = "StartMode";

/** SubflowExecution AD_Reference=d935a599-c6cd-7f8b-02ff-011b87736b21 */
public static final int SUBFLOWEXECUTION_AD_Reference_ID=307;
/** Set Subflow Execution.
@param SubflowExecution Mode how the sub-workflow is executed */
public void setSubflowExecution (String SubflowExecution)
{
if (SubflowExecution == null || SubflowExecution.equals(REF_WF_SubFlowExecution.Asynchronously) || SubflowExecution.equals(REF_WF_SubFlowExecution.Synchronously));
 else throw new IllegalArgumentException ("SubflowExecution Invalid value - " + SubflowExecution + " - Reference_ID=307 - A - S");
if (SubflowExecution != null && SubflowExecution.length() > 1)
{
log.warning("Length > 1 - truncated");
SubflowExecution = SubflowExecution.substring(0,0);
}
set_Value (COLUMNNAME_SubflowExecution, SubflowExecution);
}
/** Get Subflow Execution.
@return Mode how the sub-workflow is executed */
public String getSubflowExecution() 
{
return (String)get_Value(COLUMNNAME_SubflowExecution);
}

@XendraTrl(Identifier="7bc36937-55f8-e0c4-837a-7d3b934693f7")
public static String es_PE_FIELD_Node_SubflowExecution_Description="Modo cómo se ejecuta el sub - flujo de trabajo.";

@XendraTrl(Identifier="7bc36937-55f8-e0c4-837a-7d3b934693f7")
public static String es_PE_FIELD_Node_SubflowExecution_Name="Execución de SubFlujo";

@XendraField(AD_Column_ID="SubflowExecution",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=F",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7bc36937-55f8-e0c4-837a-7d3b934693f7")
public static final String FIELDNAME_Node_SubflowExecution="7bc36937-55f8-e0c4-837a-7d3b934693f7";

@XendraTrl(Identifier="87ebc4ea-ca69-4cda-0ff0-f266517f8bd2")
public static String es_PE_COLUMN_SubflowExecution_Name="Execución de SubFlujo";

@XendraColumn(AD_Element_ID="7d9d3eb4-5945-360b-6639-8fd9765397d2",ColumnName="SubflowExecution",
AD_Reference_ID=17,AD_Reference_Value_ID="d935a599-c6cd-7f8b-02ff-011b87736b21",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="87ebc4ea-ca69-4cda-0ff0-f266517f8bd2",Synchronized="2017-08-05 16:53:00.0")
/** Column name SubflowExecution */
public static final String COLUMNNAME_SubflowExecution = "SubflowExecution";
/** Set UnitsCycles.
@param UnitsCycles UnitsCycles */
public void setUnitsCycles (BigDecimal UnitsCycles)
{
set_Value (COLUMNNAME_UnitsCycles, UnitsCycles);
}
/** Get UnitsCycles.
@return UnitsCycles */
public BigDecimal getUnitsCycles() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UnitsCycles);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="433464c0-4b26-4c60-b9d0-e39905a154ca")
public static String es_PE_FIELD_Node_UnitsCycles_Name="UnitsCycles";

@XendraField(AD_Column_ID="UnitsCycles",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-08-05 16:53:01.0",
Identifier="433464c0-4b26-4c60-b9d0-e39905a154ca")
public static final String FIELDNAME_Node_UnitsCycles="433464c0-4b26-4c60-b9d0-e39905a154ca";

@XendraTrl(Identifier="6e978d89-94cc-c7ce-d26e-9022c1d891da")
public static String es_PE_COLUMN_UnitsCycles_Name="UnitsCycles";

@XendraColumn(AD_Element_ID="67f72ca4-e0d4-bfdf-326c-ec37b5f937da",ColumnName="UnitsCycles",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e978d89-94cc-c7ce-d26e-9022c1d891da",
Synchronized="2017-08-05 16:53:01.0")
/** Column name UnitsCycles */
public static final String COLUMNNAME_UnitsCycles = "UnitsCycles";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="e90b6e4f-4b83-c113-3685-e8ace878f2cc")
public static String es_PE_COLUMN_ValidFrom_Name="Valid from";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e90b6e4f-4b83-c113-3685-e8ace878f2cc",
Synchronized="2017-08-05 16:53:01.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="2d62b03d-6cc2-d606-0603-cb887592b1c2")
public static String es_PE_COLUMN_ValidTo_Name="Valid to";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d62b03d-6cc2-d606-0603-cb887592b1c2",
Synchronized="2017-08-05 16:53:01.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1a69e0b6-702a-d216-f16f-9c0cf2eca14d")
public static String es_PE_FIELD_Node_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="1a69e0b6-702a-d216-f16f-9c0cf2eca14d")
public static String es_PE_FIELD_Node_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="1a69e0b6-702a-d216-f16f-9c0cf2eca14d")
public static String es_PE_FIELD_Node_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a69e0b6-702a-d216-f16f-9c0cf2eca14d")
public static final String FIELDNAME_Node_SearchKey="1a69e0b6-702a-d216-f16f-9c0cf2eca14d";

@XendraTrl(Identifier="4aec30f6-7fad-f769-d847-4b4565d12537")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4aec30f6-7fad-f769-d847-4b4565d12537",
Synchronized="2017-08-05 16:53:01.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Waiting Time.
@param WaitingTime Workflow Simulation Waiting time */
public void setWaitingTime (int WaitingTime)
{
set_Value (COLUMNNAME_WaitingTime, Integer.valueOf(WaitingTime));
}
/** Get Waiting Time.
@return Workflow Simulation Waiting time */
public int getWaitingTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WaitingTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="80a6df28-3a6d-c120-d2e5-f25557c9986d")
public static String es_PE_FIELD_Node_WaitingTime_Description="Tiempo de espera para la simulación del flujo de trabajo.";

@XendraTrl(Identifier="80a6df28-3a6d-c120-d2e5-f25557c9986d")
public static String es_PE_FIELD_Node_WaitingTime_Help="Cantidad de hora necesaria de preparar el funcionamiento de la tarea en unidades de la duración.";

@XendraTrl(Identifier="80a6df28-3a6d-c120-d2e5-f25557c9986d")
public static String es_PE_FIELD_Node_WaitingTime_Name="Tiempo de Espera";

@XendraField(AD_Column_ID="WaitingTime",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="Simulation",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80a6df28-3a6d-c120-d2e5-f25557c9986d")
public static final String FIELDNAME_Node_WaitingTime="80a6df28-3a6d-c120-d2e5-f25557c9986d";

@XendraTrl(Identifier="43daa279-86d0-f3f0-98e7-c86f26a2a928")
public static String es_PE_COLUMN_WaitingTime_Name="Tiempo de Espera";

@XendraColumn(AD_Element_ID="a11e21ad-f8b1-98c5-688c-50458c652cc9",ColumnName="WaitingTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43daa279-86d0-f3f0-98e7-c86f26a2a928",
Synchronized="2017-08-05 16:53:01.0")
/** Column name WaitingTime */
public static final String COLUMNNAME_WaitingTime = "WaitingTime";
/** Set Wait Time.
@param WaitTime Time in minutes to wait (sleep) */
public void setWaitTime (int WaitTime)
{
set_Value (COLUMNNAME_WaitTime, Integer.valueOf(WaitTime));
}
/** Get Wait Time.
@return Time in minutes to wait (sleep) */
public int getWaitTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WaitTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c57ba1fa-4ce4-313b-0f29-06493668d2dc")
public static String es_PE_FIELD_Node_WaitTime_Description="Tiempo en minutos de espera (suspender)";

@XendraTrl(Identifier="c57ba1fa-4ce4-313b-0f29-06493668d2dc")
public static String es_PE_FIELD_Node_WaitTime_Help="Tiempo en minutos para la suspención.";

@XendraTrl(Identifier="c57ba1fa-4ce4-313b-0f29-06493668d2dc")
public static String es_PE_FIELD_Node_WaitTime_Name="Tiempo de espera en Minutos";

@XendraField(AD_Column_ID="WaitTime",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=Z",DisplayLength=11,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c57ba1fa-4ce4-313b-0f29-06493668d2dc")
public static final String FIELDNAME_Node_WaitTime="c57ba1fa-4ce4-313b-0f29-06493668d2dc";

@XendraTrl(Identifier="459a90cf-89a2-37e4-add8-dda41e386b4b")
public static String es_PE_COLUMN_WaitTime_Name="Tiempo de espera en Minutos";

@XendraColumn(AD_Element_ID="b5662883-99de-660d-b5af-7aba8c5d2ac9",ColumnName="WaitTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="459a90cf-89a2-37e4-add8-dda41e386b4b",
Synchronized="2017-08-05 16:53:01.0")
/** Column name WaitTime */
public static final String COLUMNNAME_WaitTime = "WaitTime";

/** Workflow_ID AD_Reference=d816afbe-eb9a-f55c-29ca-d18b459a8e3f */
public static final int WORKFLOW_ID_AD_Reference_ID=174;
/** Set Workflow.
@param Workflow_ID Workflow or tasks */
public void setWorkflow_ID (int Workflow_ID)
{
if (Workflow_ID <= 0) set_Value (COLUMNNAME_Workflow_ID, null);
 else 
set_Value (COLUMNNAME_Workflow_ID, Integer.valueOf(Workflow_ID));
}
/** Get Workflow.
@return Workflow or tasks */
public int getWorkflow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Workflow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="acd36f06-6d8b-3d51-d4d7-50bbde87e3ee")
public static String es_PE_FIELD_Node_Workflow2_Description="Flujo de trabajo ó tarea";

@XendraTrl(Identifier="acd36f06-6d8b-3d51-d4d7-50bbde87e3ee")
public static String es_PE_FIELD_Node_Workflow2_Help="El campo flujo de trabajo identifica un flujo de trabajo único. Un flujo de trabajo es un grupo de tareas relacionadas; en una secuencia específica y opcionalmente incluye aprobaciones.";

@XendraTrl(Identifier="acd36f06-6d8b-3d51-d4d7-50bbde87e3ee")
public static String es_PE_FIELD_Node_Workflow2_Name="Flujo de Trabajo";

@XendraField(AD_Column_ID="Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Action@=F | @Action@=L",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="acd36f06-6d8b-3d51-d4d7-50bbde87e3ee")
public static final String FIELDNAME_Node_Workflow2="acd36f06-6d8b-3d51-d4d7-50bbde87e3ee";

@XendraTrl(Identifier="1e025112-2d41-c14c-df2a-a8e257f4f7b4")
public static String es_PE_COLUMN_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="8fa5ba91-16c9-df5a-eae2-49dd03b1519f",ColumnName="Workflow_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="d816afbe-eb9a-f55c-29ca-d18b459a8e3f",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1e025112-2d41-c14c-df2a-a8e257f4f7b4",Synchronized="2017-08-05 16:53:01.0")
/** Column name Workflow_ID */
public static final String COLUMNNAME_Workflow_ID = "Workflow_ID";
/** Set Working Time.
@param WorkingTime Workflow Simulation Execution Time */
public void setWorkingTime (int WorkingTime)
{
set_Value (COLUMNNAME_WorkingTime, Integer.valueOf(WorkingTime));
}
/** Get Working Time.
@return Workflow Simulation Execution Time */
public int getWorkingTime() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WorkingTime);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d43287c7-6aef-204b-3993-9e728b345670")
public static String es_PE_FIELD_Node_WorkingTime_Description="Simulación de la ejecución del tiempo acumulado en el flujo de trabajo.";

@XendraTrl(Identifier="d43287c7-6aef-204b-3993-9e728b345670")
public static String es_PE_FIELD_Node_WorkingTime_Help="Cantidad de tiempo de duración que necesita una unidad despues de ser ejecutada.";

@XendraTrl(Identifier="d43287c7-6aef-204b-3993-9e728b345670")
public static String es_PE_FIELD_Node_WorkingTime_Name="Tiempo Acumulado";

@XendraField(AD_Column_ID="WorkingTime",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="Simulation",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d43287c7-6aef-204b-3993-9e728b345670")
public static final String FIELDNAME_Node_WorkingTime="d43287c7-6aef-204b-3993-9e728b345670";

@XendraTrl(Identifier="97ae683e-c4fc-6257-d5c7-146c61690264")
public static String es_PE_COLUMN_WorkingTime_Name="Tiempo Acumulado";

@XendraColumn(AD_Element_ID="925c4d88-5bf2-df3b-9790-c0bffaa2d0c4",ColumnName="WorkingTime",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97ae683e-c4fc-6257-d5c7-146c61690264",
Synchronized="2017-08-05 16:53:01.0")
/** Column name WorkingTime */
public static final String COLUMNNAME_WorkingTime = "WorkingTime";
/** Set X Position.
@param XPosition Absolute X (horizontal) position in 1/72 of an inch */
public void setXPosition (int XPosition)
{
set_Value (COLUMNNAME_XPosition, Integer.valueOf(XPosition));
}
/** Get X Position.
@return Absolute X (horizontal) position in 1/72 of an inch */
public int getXPosition() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_XPosition);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b6e71bfd-afb7-2057-36cd-dda894e707d2")
public static String es_PE_FIELD_Node_XPosition_Description="Posición absoluta X (horizontal) en 1/72 de pulgada";

@XendraTrl(Identifier="b6e71bfd-afb7-2057-36cd-dda894e707d2")
public static String es_PE_FIELD_Node_XPosition_Help="Posición absoluta X (horizontal) en 1/72 de pulgada";

@XendraTrl(Identifier="b6e71bfd-afb7-2057-36cd-dda894e707d2")
public static String es_PE_FIELD_Node_XPosition_Name="Posición X";

@XendraField(AD_Column_ID="XPosition",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6e71bfd-afb7-2057-36cd-dda894e707d2")
public static final String FIELDNAME_Node_XPosition="b6e71bfd-afb7-2057-36cd-dda894e707d2";

@XendraTrl(Identifier="5fedd367-cf79-7219-2226-a50292e04ed4")
public static String es_PE_COLUMN_XPosition_Name="Posición X";

@XendraColumn(AD_Element_ID="c9e199b8-4285-b714-7ca0-2a2ce8f49a8c",ColumnName="XPosition",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fedd367-cf79-7219-2226-a50292e04ed4",
Synchronized="2017-08-05 16:53:01.0")
/** Column name XPosition */
public static final String COLUMNNAME_XPosition = "XPosition";
/** Set Yield.
@param Yield Yield */
public void setYield (int Yield)
{
set_Value (COLUMNNAME_Yield, Integer.valueOf(Yield));
}
/** Get Yield.
@return Yield */
public int getYield() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Yield);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a31a413-cd28-0279-29d4-f55b4f70efba")
public static String es_PE_COLUMN_Yield_Name="Yield";

@XendraColumn(AD_Element_ID="35c8f2b5-da04-0c43-b3df-f98eb95b529b",ColumnName="Yield",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a31a413-cd28-0279-29d4-f55b4f70efba",
Synchronized="2017-08-05 16:53:01.0")
/** Column name Yield */
public static final String COLUMNNAME_Yield = "Yield";
/** Set Y Position.
@param YPosition Absolute Y (vertical) position in 1/72 of an inch */
public void setYPosition (int YPosition)
{
set_Value (COLUMNNAME_YPosition, Integer.valueOf(YPosition));
}
/** Get Y Position.
@return Absolute Y (vertical) position in 1/72 of an inch */
public int getYPosition() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_YPosition);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8f17054-6c74-40e8-eba7-0c5f8b8813a4")
public static String es_PE_FIELD_Node_YPosition_Description="Posición absoluta Y (vertical) en 1/72 de pulgada";

@XendraTrl(Identifier="f8f17054-6c74-40e8-eba7-0c5f8b8813a4")
public static String es_PE_FIELD_Node_YPosition_Help="Posición absoluta Y (vertical) en 1/72 de pulgada";

@XendraTrl(Identifier="f8f17054-6c74-40e8-eba7-0c5f8b8813a4")
public static String es_PE_FIELD_Node_YPosition_Name="Posición Y";

@XendraField(AD_Column_ID="YPosition",IsCentrallyMaintained=true,
AD_Tab_ID="49fa629a-ffc0-760f-54ce-2f2c08aa0450",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8f17054-6c74-40e8-eba7-0c5f8b8813a4")
public static final String FIELDNAME_Node_YPosition="f8f17054-6c74-40e8-eba7-0c5f8b8813a4";

@XendraTrl(Identifier="bbbb82bf-5d55-35eb-5a31-eafbdd00a3f6")
public static String es_PE_COLUMN_YPosition_Name="Posición Y";

@XendraColumn(AD_Element_ID="fa498dfa-2429-1705-70ab-df8eb3c62eab",ColumnName="YPosition",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bbbb82bf-5d55-35eb-5a31-eafbdd00a3f6",
Synchronized="2017-08-05 16:53:01.0")
/** Column name YPosition */
public static final String COLUMNNAME_YPosition = "YPosition";
}
