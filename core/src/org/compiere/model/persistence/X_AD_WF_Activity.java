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
/** Generated Model for AD_WF_Activity
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_WF_Activity extends PO
{
/** Standard Constructor
@param ctx context
@param AD_WF_Activity_ID id
@param trxName transaction
*/
public X_AD_WF_Activity (Properties ctx, int AD_WF_Activity_ID, String trxName)
{
super (ctx, AD_WF_Activity_ID, trxName);
/** if (AD_WF_Activity_ID == 0)
{
setAD_Table_ID (0);
setAD_WF_Activity_ID (0);
setAD_WF_Node_ID (0);
setAD_WF_Process_ID (0);
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
public X_AD_WF_Activity (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=644 */
public static int Table_ID=MTable.getTable_ID("AD_WF_Activity");

@XendraTrl(Identifier="d055f6f3-3922-f4bd-57ee-75099d058647")
public static String es_PE_TAB_Activity_Description="Actividad de Flujo de Trabajo";

@XendraTrl(Identifier="d055f6f3-3922-f4bd-57ee-75099d058647")
public static String es_PE_TAB_Activity_Help="La actividad del flujo de trabajo es el nodo real del flujo de trabajo en un caso del proceso del flujo de trabajo";

@XendraTrl(Identifier="d055f6f3-3922-f4bd-57ee-75099d058647")
public static String es_PE_TAB_Activity_Name="Actividad";
@XendraTab(Name="Activity",
Description="Workflow Activity",
Help="The Workflow Activity is the actual Workflow Node in a Workflow Process instance",
AD_Window_ID="5ec6ab47-c7c3-71bd-469d-29013c9621c7",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="5c4bce58-3176-b4ab-10f0-03ad90b74358",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d055f6f3-3922-f4bd-57ee-75099d058647",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Activity="d055f6f3-3922-f4bd-57ee-75099d058647";

@XendraTrl(Identifier="8d9858b0-adb6-a0a1-b949-0b37efd83a4c")
public static String es_PE_TAB_Activity2_Description="Sus Actividades del Flujo de Trabajo";

@XendraTrl(Identifier="8d9858b0-adb6-a0a1-b949-0b37efd83a4c")
public static String es_PE_TAB_Activity2_Help="La actividad del flujo de trabajo es el nodo real del flujo de trabajo en un caso del proceso del flujo de trabajo";

@XendraTrl(Identifier="8d9858b0-adb6-a0a1-b949-0b37efd83a4c")
public static String es_PE_TAB_Activity2_Name="Actividad";
@XendraTab(Name="Activity",
Description="Workflow Activities",
Help="The Workflow Activity is the actual Workflow Node in a Workflow Process instance",
AD_Window_ID="46c07676-49cc-c8c9-8ea0-8e0150726783",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Activity2="8d9858b0-adb6-a0a1-b949-0b37efd83a4c";

@XendraTrl(Identifier="05daf58d-9ffd-ba98-9e18-c42a1bc07e19")
public static String es_PE_TABLE_AD_WF_Activity_Name="Actividad de Flujo de Trabajo";

@XendraTable(Name="Workflow Activity",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Workflow Activity",Help="",
TableName="AD_WF_Activity",AccessLevel="7",AD_Window_ID="46c07676-49cc-c8c9-8ea0-8e0150726783",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="05daf58d-9ffd-ba98-9e18-c42a1bc07e19",Synchronized="2020-03-03 21:36:07.0")
/** TableName=AD_WF_Activity */
public static final String Table_Name="AD_WF_Activity";


@XendraIndex(Name="ad_wf_activity_item",Identifier="9987fd99-3b21-a002-c9b8-6ca32e787089",
Column_Names="ad_wf_process_id, ad_wf_node_id",IsUnique="false",
TableIdentifier="9987fd99-3b21-a002-c9b8-6ca32e787089",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_wf_activity_item = "9987fd99-3b21-a002-c9b8-6ca32e787089";


@XendraIndex(Name="ad_wf_activity_status",Identifier="057b5c5a-8985-debc-d127-d98c017a78dc",
Column_Names="processed, wfstate",IsUnique="false",
TableIdentifier="057b5c5a-8985-debc-d127-d98c017a78dc",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_wf_activity_status = "057b5c5a-8985-debc-d127-d98c017a78dc";


@XendraIndex(Name="ad_wf_activity_who",Identifier="7f453068-2c81-3fde-8219-608147d14868",
Column_Names="ad_wf_responsible_id, ad_user_id",IsUnique="false",
TableIdentifier="7f453068-2c81-3fde-8219-608147d14868",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_wf_activity_who = "7f453068-2c81-3fde-8219-608147d14868";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_WF_Activity");

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
    Table_ID = MTable.getTable_ID("AD_WF_Activity");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_WF_Activity[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ea99ac4f-c0f5-6e4d-95dd-0eb266319528")
public static String es_PE_FIELD_Activity_Message_Name="Mensaje";

@XendraTrl(Identifier="ea99ac4f-c0f5-6e4d-95dd-0eb266319528")
public static String es_PE_FIELD_Activity_Message_Description="Mensaje del sistema";

@XendraTrl(Identifier="ea99ac4f-c0f5-6e4d-95dd-0eb266319528")
public static String es_PE_FIELD_Activity_Message_Help="Mensajes de información y error.";

@XendraField(AD_Column_ID="AD_Message_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea99ac4f-c0f5-6e4d-95dd-0eb266319528")
public static final String FIELDNAME_Activity_Message="ea99ac4f-c0f5-6e4d-95dd-0eb266319528";

@XendraTrl(Identifier="9f3797fe-99a1-7c10-9775-a23c3cb956a6")
public static String es_PE_FIELD_Activity_Message2_Name="Mensaje";

@XendraTrl(Identifier="9f3797fe-99a1-7c10-9775-a23c3cb956a6")
public static String es_PE_FIELD_Activity_Message2_Description="Mensaje del sistema";

@XendraTrl(Identifier="9f3797fe-99a1-7c10-9775-a23c3cb956a6")
public static String es_PE_FIELD_Activity_Message2_Help="Mensajes de información y error.";

@XendraField(AD_Column_ID="AD_Message_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f3797fe-99a1-7c10-9775-a23c3cb956a6")
public static final String FIELDNAME_Activity_Message2="9f3797fe-99a1-7c10-9775-a23c3cb956a6";

@XendraTrl(Identifier="6a33363c-4e19-f049-e666-e7cf9199e3e1")
public static String es_PE_COLUMN_AD_Message_ID_Name="Mensaje";

@XendraColumn(AD_Element_ID="22f38416-0f51-247a-d8ef-f2266976960d",ColumnName="AD_Message_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a33363c-4e19-f049-e666-e7cf9199e3e1",
Synchronized="2019-08-30 22:20:49.0")
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

@XendraTrl(Identifier="390c855e-ace5-268a-7101-f600ce05ce4b")
public static String es_PE_FIELD_Activity_Table_Name="Tabla";

@XendraTrl(Identifier="390c855e-ace5-268a-7101-f600ce05ce4b")
public static String es_PE_FIELD_Activity_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="390c855e-ace5-268a-7101-f600ce05ce4b")
public static String es_PE_FIELD_Activity_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="390c855e-ace5-268a-7101-f600ce05ce4b")
public static final String FIELDNAME_Activity_Table="390c855e-ace5-268a-7101-f600ce05ce4b";

@XendraTrl(Identifier="18e5481a-4615-d0ce-3af3-1c6fa2aa347c")
public static String es_PE_FIELD_Activity_Table2_Name="Tabla";

@XendraTrl(Identifier="18e5481a-4615-d0ce-3af3-1c6fa2aa347c")
public static String es_PE_FIELD_Activity_Table2_Description="Tabla para los campos";

@XendraTrl(Identifier="18e5481a-4615-d0ce-3af3-1c6fa2aa347c")
public static String es_PE_FIELD_Activity_Table2_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18e5481a-4615-d0ce-3af3-1c6fa2aa347c")
public static final String FIELDNAME_Activity_Table2="18e5481a-4615-d0ce-3af3-1c6fa2aa347c";

@XendraTrl(Identifier="283461d1-31da-75df-825e-d524438841ae")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="283461d1-31da-75df-825e-d524438841ae",
Synchronized="2019-08-30 22:20:49.0")
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

@XendraTrl(Identifier="c54d2905-7f45-2467-725e-50bcbcdf6175")
public static String es_PE_FIELD_Activity_UserContact_Name="Usuario";

@XendraTrl(Identifier="c54d2905-7f45-2467-725e-50bcbcdf6175")
public static String es_PE_FIELD_Activity_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="c54d2905-7f45-2467-725e-50bcbcdf6175")
public static String es_PE_FIELD_Activity_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c54d2905-7f45-2467-725e-50bcbcdf6175")
public static final String FIELDNAME_Activity_UserContact="c54d2905-7f45-2467-725e-50bcbcdf6175";

@XendraTrl(Identifier="28a904a5-bc69-49a7-42c3-51008a179b31")
public static String es_PE_FIELD_Activity_UserContact2_Name="Usuario";

@XendraTrl(Identifier="28a904a5-bc69-49a7-42c3-51008a179b31")
public static String es_PE_FIELD_Activity_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="28a904a5-bc69-49a7-42c3-51008a179b31")
public static String es_PE_FIELD_Activity_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28a904a5-bc69-49a7-42c3-51008a179b31")
public static final String FIELDNAME_Activity_UserContact2="28a904a5-bc69-49a7-42c3-51008a179b31";

@XendraTrl(Identifier="b3179b1f-e335-5e74-e7d6-cbf70be27dd5")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="91f52193-02ab-6545-99f8-d6d30b9d03a1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b3179b1f-e335-5e74-e7d6-cbf70be27dd5",Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="bc670783-f1ad-ee17-82ed-1c082350658d")
public static String es_PE_FIELD_Activity_WorkflowActivity_Name="Actividad de Flujo de Trabajo";

@XendraTrl(Identifier="bc670783-f1ad-ee17-82ed-1c082350658d")
public static String es_PE_FIELD_Activity_WorkflowActivity_Description="Actividad de F.T.";

@XendraTrl(Identifier="bc670783-f1ad-ee17-82ed-1c082350658d")
public static String es_PE_FIELD_Activity_WorkflowActivity_Help="La actividad del flujo de trabajo indica el actual nodo de flujo de trabajo dentro de un proceso del flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=true,SeqNo=190,SortNo=-2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc670783-f1ad-ee17-82ed-1c082350658d")
public static final String FIELDNAME_Activity_WorkflowActivity="bc670783-f1ad-ee17-82ed-1c082350658d";

@XendraTrl(Identifier="be1804c9-e0c5-632c-17f4-3233874f2294")
public static String es_PE_FIELD_Activity_WorkflowActivity2_Name="Actividad de Flujo de Trabajo";

@XendraTrl(Identifier="be1804c9-e0c5-632c-17f4-3233874f2294")
public static String es_PE_FIELD_Activity_WorkflowActivity2_Description="Actividad de F.T.";

@XendraTrl(Identifier="be1804c9-e0c5-632c-17f4-3233874f2294")
public static String es_PE_FIELD_Activity_WorkflowActivity2_Help="La actividad del flujo de trabajo indica el actual nodo de flujo de trabajo dentro de un proceso del flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=true,SeqNo=190,SortNo=-2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be1804c9-e0c5-632c-17f4-3233874f2294")
public static final String FIELDNAME_Activity_WorkflowActivity2="be1804c9-e0c5-632c-17f4-3233874f2294";
/** Column name AD_WF_Activity_ID */
public static final String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_WF_Node_ID()));
}

@XendraTrl(Identifier="a6160a9d-1dbc-53de-44ad-17aaad9be992")
public static String es_PE_FIELD_Activity_Node_Name="Nodo";

@XendraTrl(Identifier="a6160a9d-1dbc-53de-44ad-17aaad9be992")
public static String es_PE_FIELD_Activity_Node_Description="Nodo de flujo de trabajo; paso ó proceso";

@XendraTrl(Identifier="a6160a9d-1dbc-53de-44ad-17aaad9be992")
public static String es_PE_FIELD_Activity_Node_Help="El nodo de flujo de trabajo indica un paso ó proceso único en este flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Node_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6160a9d-1dbc-53de-44ad-17aaad9be992")
public static final String FIELDNAME_Activity_Node="a6160a9d-1dbc-53de-44ad-17aaad9be992";

@XendraTrl(Identifier="f04465d4-e7d3-e196-7559-ba30ec44b0e1")
public static String es_PE_FIELD_Activity_Node2_Name="Nodo";

@XendraTrl(Identifier="f04465d4-e7d3-e196-7559-ba30ec44b0e1")
public static String es_PE_FIELD_Activity_Node2_Description="Nodo de flujo de trabajo; paso ó proceso";

@XendraTrl(Identifier="f04465d4-e7d3-e196-7559-ba30ec44b0e1")
public static String es_PE_FIELD_Activity_Node2_Help="El nodo de flujo de trabajo indica un paso ó proceso único en este flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Node_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f04465d4-e7d3-e196-7559-ba30ec44b0e1")
public static final String FIELDNAME_Activity_Node2="f04465d4-e7d3-e196-7559-ba30ec44b0e1";

@XendraTrl(Identifier="d4d82ea3-520b-6f4b-b3a9-22800415671d")
public static String es_PE_COLUMN_AD_WF_Node_ID_Name="Nodo";

@XendraColumn(AD_Element_ID="a21db5d2-692a-84ae-07db-7083b2eac74c",ColumnName="AD_WF_Node_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4d82ea3-520b-6f4b-b3a9-22800415671d",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_WF_Node_ID */
public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
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

@XendraTrl(Identifier="a82bc6f1-15ec-24d2-1d3e-ab2e88c684a0")
public static String es_PE_FIELD_Activity_WorkflowProcess_Name="Proceso de Flujo de Trabajo";

@XendraTrl(Identifier="a82bc6f1-15ec-24d2-1d3e-ab2e88c684a0")
public static String es_PE_FIELD_Activity_WorkflowProcess_Description="Proceso actual del flujo de trabajo.";

@XendraTrl(Identifier="a82bc6f1-15ec-24d2-1d3e-ab2e88c684a0")
public static String es_PE_FIELD_Activity_WorkflowProcess_Help="Actual ejecución de un flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a82bc6f1-15ec-24d2-1d3e-ab2e88c684a0")
public static final String FIELDNAME_Activity_WorkflowProcess="a82bc6f1-15ec-24d2-1d3e-ab2e88c684a0";

@XendraTrl(Identifier="453dfe3e-0cbf-5734-92a8-ae21ccbe9909")
public static String es_PE_FIELD_Activity_WorkflowProcess2_Name="Proceso de Flujo de Trabajo";

@XendraTrl(Identifier="453dfe3e-0cbf-5734-92a8-ae21ccbe9909")
public static String es_PE_FIELD_Activity_WorkflowProcess2_Description="Proceso actual del flujo de trabajo.";

@XendraTrl(Identifier="453dfe3e-0cbf-5734-92a8-ae21ccbe9909")
public static String es_PE_FIELD_Activity_WorkflowProcess2_Help="Actual ejecución de un flujo de trabajo.";

@XendraField(AD_Column_ID="AD_WF_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="453dfe3e-0cbf-5734-92a8-ae21ccbe9909")
public static final String FIELDNAME_Activity_WorkflowProcess2="453dfe3e-0cbf-5734-92a8-ae21ccbe9909";

@XendraTrl(Identifier="5c4bce58-3176-b4ab-10f0-03ad90b74358")
public static String es_PE_COLUMN_AD_WF_Process_ID_Name="Proceso de Flujo de Trabajo";

@XendraColumn(AD_Element_ID="0153e3d9-957f-59bc-2db9-d8016b5ec7cd",ColumnName="AD_WF_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c4bce58-3176-b4ab-10f0-03ad90b74358",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_WF_Process_ID */
public static final String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
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

@XendraTrl(Identifier="44607294-a937-8b26-f78c-52ce46e1ab70")
public static String es_PE_FIELD_Activity_WorkflowResponsible_Name="Responsable del Flujo de Trabajo";

@XendraTrl(Identifier="44607294-a937-8b26-f78c-52ce46e1ab70")
public static String es_PE_FIELD_Activity_WorkflowResponsible_Description="Responsable para la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="44607294-a937-8b26-f78c-52ce46e1ab70")
public static String es_PE_FIELD_Activity_WorkflowResponsible_Help="La última responsabilidad para el flujo de trabajo es con un usuario actual. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario final.";

@XendraField(AD_Column_ID="AD_WF_Responsible_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44607294-a937-8b26-f78c-52ce46e1ab70")
public static final String FIELDNAME_Activity_WorkflowResponsible="44607294-a937-8b26-f78c-52ce46e1ab70";

@XendraTrl(Identifier="ebf0d38f-8567-43fd-3702-2672dfc3f80a")
public static String es_PE_FIELD_Activity_WorkflowResponsible2_Name="Responsable del Flujo de Trabajo";

@XendraTrl(Identifier="ebf0d38f-8567-43fd-3702-2672dfc3f80a")
public static String es_PE_FIELD_Activity_WorkflowResponsible2_Description="Responsable para la ejecución del flujo de trabajo.";

@XendraTrl(Identifier="ebf0d38f-8567-43fd-3702-2672dfc3f80a")
public static String es_PE_FIELD_Activity_WorkflowResponsible2_Help="La última responsabilidad para el flujo de trabajo es con un usuario actual. El flujo de trabajo responsable permite definir maneras de encontrar a ese usuario final.";

@XendraField(AD_Column_ID="AD_WF_Responsible_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebf0d38f-8567-43fd-3702-2672dfc3f80a")
public static final String FIELDNAME_Activity_WorkflowResponsible2="ebf0d38f-8567-43fd-3702-2672dfc3f80a";

@XendraTrl(Identifier="1b727cbd-3d2e-4f02-0f54-bca4db6b0c1b")
public static String es_PE_COLUMN_AD_WF_Responsible_ID_Name="Responsable del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="4977b0dd-ed8d-9bb5-1edb-a21110bcf169",
ColumnName="AD_WF_Responsible_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1b727cbd-3d2e-4f02-0f54-bca4db6b0c1b",Synchronized="2019-08-30 22:20:50.0")
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

@XendraTrl(Identifier="156f612f-ad94-5590-d8f2-145030976ea9")
public static String es_PE_FIELD_Activity_Workflow_Name="Flujo de Trabajo";

@XendraTrl(Identifier="156f612f-ad94-5590-d8f2-145030976ea9")
public static String es_PE_FIELD_Activity_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="156f612f-ad94-5590-d8f2-145030976ea9")
public static String es_PE_FIELD_Activity_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="156f612f-ad94-5590-d8f2-145030976ea9")
public static final String FIELDNAME_Activity_Workflow="156f612f-ad94-5590-d8f2-145030976ea9";

@XendraTrl(Identifier="a581800d-ad5c-a287-6822-c271259e0d00")
public static String es_PE_FIELD_Activity_Workflow2_Name="Flujo de Trabajo";

@XendraTrl(Identifier="a581800d-ad5c-a287-6822-c271259e0d00")
public static String es_PE_FIELD_Activity_Workflow2_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="a581800d-ad5c-a287-6822-c271259e0d00")
public static String es_PE_FIELD_Activity_Workflow2_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a581800d-ad5c-a287-6822-c271259e0d00")
public static final String FIELDNAME_Activity_Workflow2="a581800d-ad5c-a287-6822-c271259e0d00";

@XendraTrl(Identifier="466e2c68-c114-91cd-89b1-388fd731b474")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="466e2c68-c114-91cd-89b1-388fd731b474",
Synchronized="2019-08-30 22:20:50.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
/** Set Last Alert.
@param DateLastAlert Date when last alert were sent */
public void setDateLastAlert (Timestamp DateLastAlert)
{
set_Value (COLUMNNAME_DateLastAlert, DateLastAlert);
}
/** Get Last Alert.
@return Date when last alert were sent */
public Timestamp getDateLastAlert() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastAlert);
}

@XendraTrl(Identifier="57e9deae-3209-0017-19bf-aa62525e456d")
public static String es_PE_FIELD_Activity_LastAlert_Name="ID de Planeación Mensual";

@XendraField(AD_Column_ID="DateLastAlert",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57e9deae-3209-0017-19bf-aa62525e456d")
public static final String FIELDNAME_Activity_LastAlert="57e9deae-3209-0017-19bf-aa62525e456d";

@XendraTrl(Identifier="5406f2d7-8e28-e52f-5f0e-9617a43723fa")
public static String es_PE_FIELD_Activity_LastAlert2_Name="ID de Planeación Mensual";

@XendraField(AD_Column_ID="DateLastAlert",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5406f2d7-8e28-e52f-5f0e-9617a43723fa")
public static final String FIELDNAME_Activity_LastAlert2="5406f2d7-8e28-e52f-5f0e-9617a43723fa";

@XendraTrl(Identifier="96c16d0c-38bb-5d6d-af17-c9238400dd4a")
public static String es_PE_COLUMN_DateLastAlert_Name="ID de Planeación Mensual";

@XendraColumn(AD_Element_ID="2ac1a16e-afc2-d10f-8c06-5b372bd7bfa9",ColumnName="DateLastAlert",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96c16d0c-38bb-5d6d-af17-c9238400dd4a",
Synchronized="2019-08-30 22:20:50.0")
/** Column name DateLastAlert */
public static final String COLUMNNAME_DateLastAlert = "DateLastAlert";
/** Set Dyn Priority Start.
@param DynPriorityStart Starting priority before changed dynamically */
public void setDynPriorityStart (int DynPriorityStart)
{
set_Value (COLUMNNAME_DynPriorityStart, Integer.valueOf(DynPriorityStart));
}
/** Get Dyn Priority Start.
@return Starting priority before changed dynamically */
public int getDynPriorityStart() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DynPriorityStart);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="feb603a6-92b4-4176-936d-df00cf8e990c")
public static String es_PE_FIELD_Activity_DynPriorityStart_Name="Prioridad Inicial Dinámica";

@XendraTrl(Identifier="feb603a6-92b4-4176-936d-df00cf8e990c")
public static String es_PE_FIELD_Activity_DynPriorityStart_Description="Comenzando prioridad antes de el cambio dinámicamente.";

@XendraField(AD_Column_ID="DynPriorityStart",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="feb603a6-92b4-4176-936d-df00cf8e990c")
public static final String FIELDNAME_Activity_DynPriorityStart="feb603a6-92b4-4176-936d-df00cf8e990c";

@XendraTrl(Identifier="078524b9-b532-b2fd-d961-7502f6ba07fa")
public static String es_PE_FIELD_Activity_DynPriorityStart2_Name="Prioridad Inicial Dinámica";

@XendraTrl(Identifier="078524b9-b532-b2fd-d961-7502f6ba07fa")
public static String es_PE_FIELD_Activity_DynPriorityStart2_Description="Comenzando prioridad antes de el cambio dinámicamente.";

@XendraField(AD_Column_ID="DynPriorityStart",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="078524b9-b532-b2fd-d961-7502f6ba07fa")
public static final String FIELDNAME_Activity_DynPriorityStart2="078524b9-b532-b2fd-d961-7502f6ba07fa";

@XendraTrl(Identifier="5b3c5f0c-b480-fce1-a18a-2a4577f2b2e5")
public static String es_PE_COLUMN_DynPriorityStart_Name="Prioridad Inicial Dinámica";

@XendraColumn(AD_Element_ID="2ef50d80-495a-ec7d-3c09-f1c880745f6d",ColumnName="DynPriorityStart",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b3c5f0c-b480-fce1-a18a-2a4577f2b2e5",
Synchronized="2019-08-30 22:20:50.0")
/** Column name DynPriorityStart */
public static final String COLUMNNAME_DynPriorityStart = "DynPriorityStart";
/** Set End Wait.
@param EndWaitTime End of sleep time */
public void setEndWaitTime (Timestamp EndWaitTime)
{
set_Value (COLUMNNAME_EndWaitTime, EndWaitTime);
}
/** Get End Wait.
@return End of sleep time */
public Timestamp getEndWaitTime() 
{
return (Timestamp)get_Value(COLUMNNAME_EndWaitTime);
}

@XendraTrl(Identifier="b5bb5e4b-d1b7-57d0-cb4b-76d3e934b4ae")
public static String es_PE_FIELD_Activity_EndWait_Name="Espera el fin";

@XendraTrl(Identifier="b5bb5e4b-d1b7-57d0-cb4b-76d3e934b4ae")
public static String es_PE_FIELD_Activity_EndWait_Description="Espere el fin de tiempo.";

@XendraTrl(Identifier="b5bb5e4b-d1b7-57d0-cb4b-76d3e934b4ae")
public static String es_PE_FIELD_Activity_EndWait_Help="Fin de la suspención (espere).";

@XendraField(AD_Column_ID="EndWaitTime",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5bb5e4b-d1b7-57d0-cb4b-76d3e934b4ae")
public static final String FIELDNAME_Activity_EndWait="b5bb5e4b-d1b7-57d0-cb4b-76d3e934b4ae";

@XendraTrl(Identifier="8dd0402e-3c21-d257-a82c-a99f9f7c9117")
public static String es_PE_FIELD_Activity_EndWait2_Name="Espera el fin";

@XendraTrl(Identifier="8dd0402e-3c21-d257-a82c-a99f9f7c9117")
public static String es_PE_FIELD_Activity_EndWait2_Description="Espere el fin de tiempo.";

@XendraTrl(Identifier="8dd0402e-3c21-d257-a82c-a99f9f7c9117")
public static String es_PE_FIELD_Activity_EndWait2_Help="Fin de la suspención (espere).";

@XendraField(AD_Column_ID="EndWaitTime",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dd0402e-3c21-d257-a82c-a99f9f7c9117")
public static final String FIELDNAME_Activity_EndWait2="8dd0402e-3c21-d257-a82c-a99f9f7c9117";

@XendraTrl(Identifier="f4359de8-d451-e6bb-576f-26ef03989412")
public static String es_PE_COLUMN_EndWaitTime_Name="Espera el fin";

@XendraColumn(AD_Element_ID="9ac76504-c58c-c93f-fabf-9694dbd16e4b",ColumnName="EndWaitTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4359de8-d451-e6bb-576f-26ef03989412",
Synchronized="2019-08-30 22:20:50.0")
/** Column name EndWaitTime */
public static final String COLUMNNAME_EndWaitTime = "EndWaitTime";
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
@XendraTrl(Identifier="cbb6b622-1992-43a7-aaab-c51b78e458ee")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cbb6b622-1992-43a7-aaab-c51b78e458ee",
Synchronized="2019-08-30 22:20:50.0")
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

@XendraTrl(Identifier="02eafc6a-aa34-2912-6074-e080b3bec8de")
public static String es_PE_FIELD_Activity_Priority_Name="Prioridad";

@XendraTrl(Identifier="02eafc6a-aa34-2912-6074-e080b3bec8de")
public static String es_PE_FIELD_Activity_Priority_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="02eafc6a-aa34-2912-6074-e080b3bec8de")
public static String es_PE_FIELD_Activity_Priority_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02eafc6a-aa34-2912-6074-e080b3bec8de")
public static final String FIELDNAME_Activity_Priority="02eafc6a-aa34-2912-6074-e080b3bec8de";

@XendraTrl(Identifier="306d3659-25e0-7317-3447-55f4d7f6ddde")
public static String es_PE_FIELD_Activity_Priority2_Name="Prioridad";

@XendraTrl(Identifier="306d3659-25e0-7317-3447-55f4d7f6ddde")
public static String es_PE_FIELD_Activity_Priority2_Description="Indica si este requerimiento es de una alta; media ó baja prioridad";

@XendraTrl(Identifier="306d3659-25e0-7317-3447-55f4d7f6ddde")
public static String es_PE_FIELD_Activity_Priority2_Help="La Prioridad indica la importancia de este requerimiento";

@XendraField(AD_Column_ID="Priority",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="306d3659-25e0-7317-3447-55f4d7f6ddde")
public static final String FIELDNAME_Activity_Priority2="306d3659-25e0-7317-3447-55f4d7f6ddde";

@XendraTrl(Identifier="817aca5a-a23e-7cc6-0e30-8065eaff6c3a")
public static String es_PE_COLUMN_Priority_Name="Prioridad";

@XendraColumn(AD_Element_ID="5057921e-c21f-a6bc-898d-053fcc239847",ColumnName="Priority",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="817aca5a-a23e-7cc6-0e30-8065eaff6c3a",
Synchronized="2019-08-30 22:20:50.0")
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

@XendraTrl(Identifier="5b54956b-1e98-ac8d-3daf-896bc12efedf")
public static String es_PE_FIELD_Activity_Processed_Name="Procesado";

@XendraTrl(Identifier="5b54956b-1e98-ac8d-3daf-896bc12efedf")
public static String es_PE_FIELD_Activity_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="5b54956b-1e98-ac8d-3daf-896bc12efedf")
public static String es_PE_FIELD_Activity_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b54956b-1e98-ac8d-3daf-896bc12efedf")
public static final String FIELDNAME_Activity_Processed="5b54956b-1e98-ac8d-3daf-896bc12efedf";

@XendraTrl(Identifier="5f0e7488-1bf3-211f-7957-33c911afeb82")
public static String es_PE_FIELD_Activity_Processed2_Name="Procesado";

@XendraTrl(Identifier="5f0e7488-1bf3-211f-7957-33c911afeb82")
public static String es_PE_FIELD_Activity_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="5f0e7488-1bf3-211f-7957-33c911afeb82")
public static String es_PE_FIELD_Activity_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f0e7488-1bf3-211f-7957-33c911afeb82")
public static final String FIELDNAME_Activity_Processed2="5f0e7488-1bf3-211f-7957-33c911afeb82";

@XendraTrl(Identifier="ad2c0e10-303b-5004-05a7-dc82136cf8e0")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad2c0e10-303b-5004-05a7-dc82136cf8e0",
Synchronized="2019-08-30 22:20:50.0")
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

@XendraTrl(Identifier="ba0941e2-63d1-7b74-bce9-3fa10ba1da48")
public static String es_PE_FIELD_Activity_ProcessNow_Name="Manejador de Actividades";

@XendraTrl(Identifier="ba0941e2-63d1-7b74-bce9-3fa10ba1da48")
public static String es_PE_FIELD_Activity_ProcessNow_Description="Manejador de Actividades";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba0941e2-63d1-7b74-bce9-3fa10ba1da48")
public static final String FIELDNAME_Activity_ProcessNow="ba0941e2-63d1-7b74-bce9-3fa10ba1da48";

@XendraTrl(Identifier="cf536736-6ef1-6be0-f419-f4fac33e6fd3")
public static String es_PE_FIELD_Activity_ProcessNow2_Name="Manejador de Actividades";

@XendraTrl(Identifier="cf536736-6ef1-6be0-f419-f4fac33e6fd3")
public static String es_PE_FIELD_Activity_ProcessNow2_Description="Manejador de Actividades";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf536736-6ef1-6be0-f419-f4fac33e6fd3")
public static final String FIELDNAME_Activity_ProcessNow2="cf536736-6ef1-6be0-f419-f4fac33e6fd3";

@XendraTrl(Identifier="b3c94049-2862-e935-9478-e87ed7a5521e")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="bfa68ed2-9dd7-d08b-16d9-f578be87f33a",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b3c94049-2862-e935-9478-e87ed7a5521e",Synchronized="2019-08-30 22:20:50.0")
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

@XendraTrl(Identifier="211527ea-0a39-0889-adba-f6c44fce5f11")
public static String es_PE_FIELD_Activity_RecordID_Name="ID de Registro";

@XendraTrl(Identifier="211527ea-0a39-0889-adba-f6c44fce5f11")
public static String es_PE_FIELD_Activity_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="211527ea-0a39-0889-adba-f6c44fce5f11")
public static String es_PE_FIELD_Activity_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="211527ea-0a39-0889-adba-f6c44fce5f11")
public static final String FIELDNAME_Activity_RecordID="211527ea-0a39-0889-adba-f6c44fce5f11";

@XendraTrl(Identifier="e0932131-10d8-5b61-62d0-8b3d132234af")
public static String es_PE_FIELD_Activity_RecordID2_Name="ID de Registro";

@XendraTrl(Identifier="e0932131-10d8-5b61-62d0-8b3d132234af")
public static String es_PE_FIELD_Activity_RecordID2_Description="Identificador de registro interno";

@XendraTrl(Identifier="e0932131-10d8-5b61-62d0-8b3d132234af")
public static String es_PE_FIELD_Activity_RecordID2_Help="La ID de registro es el identificador único interno de un registro.";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0932131-10d8-5b61-62d0-8b3d132234af")
public static final String FIELDNAME_Activity_RecordID2="e0932131-10d8-5b61-62d0-8b3d132234af";

@XendraTrl(Identifier="64442adc-f8dd-f553-7bd7-bf1603fc5f54")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64442adc-f8dd-f553-7bd7-bf1603fc5f54",
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
@XendraTrl(Identifier="7dd01fd9-b1f4-f432-3a53-12b45b1508b9")
public static String es_PE_FIELD_Activity_TextMessage_Name="Mensaje de texto";

@XendraTrl(Identifier="7dd01fd9-b1f4-f432-3a53-12b45b1508b9")
public static String es_PE_FIELD_Activity_TextMessage_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7dd01fd9-b1f4-f432-3a53-12b45b1508b9")
public static final String FIELDNAME_Activity_TextMessage="7dd01fd9-b1f4-f432-3a53-12b45b1508b9";

@XendraTrl(Identifier="c1c800b7-0167-22ab-b1d1-c121ecf991da")
public static String es_PE_FIELD_Activity_TextMessage2_Name="Mensaje de texto";

@XendraTrl(Identifier="c1c800b7-0167-22ab-b1d1-c121ecf991da")
public static String es_PE_FIELD_Activity_TextMessage2_Description="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1c800b7-0167-22ab-b1d1-c121ecf991da")
public static final String FIELDNAME_Activity_TextMessage2="c1c800b7-0167-22ab-b1d1-c121ecf991da";

@XendraTrl(Identifier="c7ff8a46-5b88-1967-fbaf-cfccf6a160f2")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7ff8a46-5b88-1967-fbaf-cfccf6a160f2",
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

@XendraTrl(Identifier="64e15a4b-eb3e-aae1-dbc7-2e9ad853465e")
public static String es_PE_FIELD_Activity_WorkflowState_Name="Estado del Flujo de Trabajo";

@XendraTrl(Identifier="64e15a4b-eb3e-aae1-dbc7-2e9ad853465e")
public static String es_PE_FIELD_Activity_WorkflowState_Description="Estado de la ejecución del flujo de trabajo.";

@XendraField(AD_Column_ID="WFState",IsCentrallyMaintained=true,
AD_Tab_ID="d055f6f3-3922-f4bd-57ee-75099d058647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64e15a4b-eb3e-aae1-dbc7-2e9ad853465e")
public static final String FIELDNAME_Activity_WorkflowState="64e15a4b-eb3e-aae1-dbc7-2e9ad853465e";

@XendraTrl(Identifier="0558063a-8fb0-78a0-b110-c0f31a9b9db3")
public static String es_PE_FIELD_Activity_WorkflowState2_Name="Estado del Flujo de Trabajo";

@XendraTrl(Identifier="0558063a-8fb0-78a0-b110-c0f31a9b9db3")
public static String es_PE_FIELD_Activity_WorkflowState2_Description="Estado de la ejecución del flujo de trabajo.";

@XendraField(AD_Column_ID="WFState",IsCentrallyMaintained=true,
AD_Tab_ID="8d9858b0-adb6-a0a1-b949-0b37efd83a4c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0558063a-8fb0-78a0-b110-c0f31a9b9db3")
public static final String FIELDNAME_Activity_WorkflowState2="0558063a-8fb0-78a0-b110-c0f31a9b9db3";

@XendraTrl(Identifier="dd947240-d342-5325-8f39-5f6b4eff9944")
public static String es_PE_COLUMN_WFState_Name="Estado del Flujo de Trabajo";

@XendraColumn(AD_Element_ID="1c1cad98-960c-5434-c428-01af08ef4e75",ColumnName="WFState",
AD_Reference_ID=17,AD_Reference_Value_ID="28a0900a-bee4-008a-c714-8d99ca7ab5d6",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dd947240-d342-5325-8f39-5f6b4eff9944",Synchronized="2019-08-30 22:20:50.0")
/** Column name WFState */
public static final String COLUMNNAME_WFState = "WFState";
}
