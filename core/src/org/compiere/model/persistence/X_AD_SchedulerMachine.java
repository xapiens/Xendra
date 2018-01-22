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
/** Generated Model for AD_SchedulerMachine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_SchedulerMachine extends PO
{
/** Standard Constructor
@param ctx context
@param AD_SchedulerMachine_ID id
@param trxName transaction
*/
public X_AD_SchedulerMachine (Properties ctx, int AD_SchedulerMachine_ID, String trxName)
{
super (ctx, AD_SchedulerMachine_ID, trxName);
/** if (AD_SchedulerMachine_ID == 0)
{
setAD_Scheduler_ID (0);
setA_Machine_ID (0);
setIsReadWrite (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_SchedulerMachine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000319 */
public static int Table_ID=MTable.getTable_ID("AD_SchedulerMachine");

@XendraTrl(Identifier="ee25549e-746f-4ff9-8ea2-bd55425c29c5")
public static String es_PE_TAB_ScheduleMachine_Description="Schedule Machine Access";

@XendraTrl(Identifier="ee25549e-746f-4ff9-8ea2-bd55425c29c5")
public static String es_PE_TAB_ScheduleMachine_Name="Schedule Machine";

@XendraTab(Name="Schedule Machine",Description="Schedule Machine Access",Help="",
AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ee25549e-746f-4ff9-8ea2-bd55425c29c5",Synchronized="2015-05-01 18:12:40.0")
public static final String TABNAME_ScheduleMachine="ee25549e-746f-4ff9-8ea2-bd55425c29c5";

@XendraTrl(Identifier="b1313058-cda4-434d-a39a-0ce29e39302e")
public static String es_PE_TABLE_AD_SchedulerMachine_Name="Scheduler by Machine";

@XendraTable(Name="Scheduler by Machine",Description="",Help="",TableName="AD_SchedulerMachine",
AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="b1313058-cda4-434d-a39a-0ce29e39302e",
Synchronized="2017-08-16 11:40:58.0")
/** TableName=AD_SchedulerMachine */
public static final String Table_Name="AD_SchedulerMachine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_SchedulerMachine");

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
    Table_ID = MTable.getTable_ID("AD_SchedulerMachine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_SchedulerMachine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Scheduler.
@param AD_Scheduler_ID Schedule Processes */
public void setAD_Scheduler_ID (int AD_Scheduler_ID)
{
if (AD_Scheduler_ID < 1) throw new IllegalArgumentException ("AD_Scheduler_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Scheduler_ID, Integer.valueOf(AD_Scheduler_ID));
}
/** Get Scheduler.
@return Schedule Processes */
public int getAD_Scheduler_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Scheduler_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a59f8300-496d-44ca-84b9-30543edfbe98")
public static String es_PE_FIELD_ScheduleMachine_Scheduler_Description="Programación de procesos";

@XendraTrl(Identifier="a59f8300-496d-44ca-84b9-30543edfbe98")
public static String es_PE_FIELD_ScheduleMachine_Scheduler_Help="Programación de procesos para ser ejecutada la sincronización.";

@XendraTrl(Identifier="a59f8300-496d-44ca-84b9-30543edfbe98")
public static String es_PE_FIELD_ScheduleMachine_Scheduler_Name="Programación";

@XendraField(AD_Column_ID="AD_Scheduler_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ee25549e-746f-4ff9-8ea2-bd55425c29c5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-01 18:12:40.0",
Identifier="a59f8300-496d-44ca-84b9-30543edfbe98")
public static final String FIELDNAME_ScheduleMachine_Scheduler="a59f8300-496d-44ca-84b9-30543edfbe98";

@XendraTrl(Identifier="43bc57db-5c98-4aca-9baf-45ec8451d272")
public static String es_PE_COLUMN_AD_Scheduler_ID_Name="Scheduler";

@XendraColumn(AD_Element_ID="7c943646-ecd0-4485-0c20-0616c91ca579",ColumnName="AD_Scheduler_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43bc57db-5c98-4aca-9baf-45ec8451d272",
Synchronized="2017-08-05 16:52:50.0")
/** Column name AD_Scheduler_ID */
public static final String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
/** Set Machine .
@param A_Machine_ID Machine  */
public void setA_Machine_ID (int A_Machine_ID)
{
if (A_Machine_ID < 1) throw new IllegalArgumentException ("A_Machine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Machine_ID, Integer.valueOf(A_Machine_ID));
}
/** Get Machine .
@return Machine  */
public int getA_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ed052c3c-632a-40b2-9443-660a37bcee6b")
public static String es_PE_FIELD_ScheduleMachine_Machine_Name="Machine ";

@XendraField(AD_Column_ID="A_Machine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ee25549e-746f-4ff9-8ea2-bd55425c29c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-01 18:12:40.0",
Identifier="ed052c3c-632a-40b2-9443-660a37bcee6b")
public static final String FIELDNAME_ScheduleMachine_Machine="ed052c3c-632a-40b2-9443-660a37bcee6b";

@XendraTrl(Identifier="3cec5a51-c7e3-42f5-83c0-a30ffb55caf0")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cec5a51-c7e3-42f5-83c0-a30ffb55caf0",
Synchronized="2017-08-05 16:52:50.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
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
@XendraTrl(Identifier="5a5e1c64-8f26-4efd-8e47-c7885aa2a5f8")
public static String es_PE_FIELD_ScheduleMachine_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="ee25549e-746f-4ff9-8ea2-bd55425c29c5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-01 18:12:40.0",
Identifier="5a5e1c64-8f26-4efd-8e47-c7885aa2a5f8")
public static final String FIELDNAME_ScheduleMachine_Identifier="5a5e1c64-8f26-4efd-8e47-c7885aa2a5f8";

@XendraTrl(Identifier="82508c77-ce8b-4495-b84e-df076ac078d0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82508c77-ce8b-4495-b84e-df076ac078d0",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Read Write.
@param IsReadWrite Field is read / write */
public void setIsReadWrite (boolean IsReadWrite)
{
set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
}
/** Get Read Write.
@return Field is read / write */
public boolean isReadWrite() 
{
Object oo = get_Value(COLUMNNAME_IsReadWrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e24814ff-098d-4e9c-bc0b-f4e4d096e5b8")
public static String es_PE_FIELD_ScheduleMachine_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="e24814ff-098d-4e9c-bc0b-f4e4d096e5b8")
public static String es_PE_FIELD_ScheduleMachine_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraTrl(Identifier="e24814ff-098d-4e9c-bc0b-f4e4d096e5b8")
public static String es_PE_FIELD_ScheduleMachine_ReadWrite_Name="Lectura Escritura";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="ee25549e-746f-4ff9-8ea2-bd55425c29c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-01 18:12:40.0",
Identifier="e24814ff-098d-4e9c-bc0b-f4e4d096e5b8")
public static final String FIELDNAME_ScheduleMachine_ReadWrite="e24814ff-098d-4e9c-bc0b-f4e4d096e5b8";

@XendraTrl(Identifier="75cbdc4a-ff1e-40e3-b1ad-378be3232786")
public static String es_PE_COLUMN_IsReadWrite_Name="Read Write";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75cbdc4a-ff1e-40e3-b1ad-378be3232786",
Synchronized="2017-08-05 16:52:50.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
