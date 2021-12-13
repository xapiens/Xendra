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
/** Generated Model for AD_Task_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Task_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Task_Access_ID id
@param trxName transaction
*/
public X_AD_Task_Access (Properties ctx, int AD_Task_Access_ID, String trxName)
{
super (ctx, AD_Task_Access_ID, trxName);
/** if (AD_Task_Access_ID == 0)
{
setAD_Role_ID (0);
setAD_Task_ID (0);
setIsReadWrite (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Task_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=199 */
public static int Table_ID=MTable.getTable_ID("AD_Task_Access");

@XendraTrl(Identifier="d7e3b770-1a3e-ae73-0d00-7dec9e303578")
public static String es_PE_TAB_Access_Description="Acceso a Tarea";

@XendraTrl(Identifier="d7e3b770-1a3e-ae73-0d00-7dec9e303578")
public static String es_PE_TAB_Access_Help="La pestaña Acceso de Tareas define los roles que tienen acceso a esta tarea y el tipo de acceso que cada rol tiene.";

@XendraTrl(Identifier="d7e3b770-1a3e-ae73-0d00-7dec9e303578")
public static String es_PE_TAB_Access_Name="Acceso";
@XendraTab(Name="Access",
Description="Task Access",
Help="The Task Access Tab defines the Roles that will have access to this task and the type of access each Role is granted.",
AD_Window_ID="99f7c032-e7ea-1199-f548-822f722e43be",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="ca0c7cf9-2df1-2f36-4e68-c92e867545ca",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="d7e3b770-1a3e-ae73-0d00-7dec9e303578",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Access="d7e3b770-1a3e-ae73-0d00-7dec9e303578";

@XendraTrl(Identifier="1b14891d-3e13-135f-5da1-e9fd0dce7369")
public static String es_PE_TAB_TaskAccess_Description="Acceso a Tarea";

@XendraTrl(Identifier="1b14891d-3e13-135f-5da1-e9fd0dce7369")
public static String es_PE_TAB_TaskAccess_Help="La pestaña Acceso de Tareas define las tareas y tipo de acceso que este rol tiene.";

@XendraTrl(Identifier="1b14891d-3e13-135f-5da1-e9fd0dce7369")
public static String es_PE_TAB_TaskAccess_Name="Acceso a Tarea";
@XendraTab(Name="Task Access",
Description="Task Access",
Help="The Task Access Tab defines the Task and type of access that this Role is granted.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=90,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="58b01af1-44d1-5d01-cb59-299915914e93",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="1b14891d-3e13-135f-5da1-e9fd0dce7369",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TaskAccess="1b14891d-3e13-135f-5da1-e9fd0dce7369";

@XendraTrl(Identifier="16c043bb-cb3e-3522-14a5-b66553ff133f")
public static String es_PE_TABLE_AD_Task_Access_Name="AD_Task_Access";

@XendraTable(Name="AD_Task_Access",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Task_Access",AccessLevel="6",AD_Window_ID="99f7c032-e7ea-1199-f548-822f722e43be",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="16c043bb-cb3e-3522-14a5-b66553ff133f",Synchronized="2020-03-03 21:36:00.0")
/** TableName=AD_Task_Access */
public static final String Table_Name="AD_Task_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Task_Access");

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
    Table_ID = MTable.getTable_ID("AD_Task_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Task_Access[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c18a89be-3d80-b9f6-9ab2-4c3aac4e4d1e")
public static String es_PE_FIELD_Access_Role_Name="Rol";

@XendraTrl(Identifier="c18a89be-3d80-b9f6-9ab2-4c3aac4e4d1e")
public static String es_PE_FIELD_Access_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="c18a89be-3d80-b9f6-9ab2-4c3aac4e4d1e")
public static String es_PE_FIELD_Access_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d7e3b770-1a3e-ae73-0d00-7dec9e303578",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c18a89be-3d80-b9f6-9ab2-4c3aac4e4d1e")
public static final String FIELDNAME_Access_Role="c18a89be-3d80-b9f6-9ab2-4c3aac4e4d1e";

@XendraTrl(Identifier="59d9c0cd-78e7-38bb-dd5e-a2d778fb7d29")
public static String es_PE_FIELD_TaskAccess_Role_Name="Rol";

@XendraTrl(Identifier="59d9c0cd-78e7-38bb-dd5e-a2d778fb7d29")
public static String es_PE_FIELD_TaskAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="59d9c0cd-78e7-38bb-dd5e-a2d778fb7d29")
public static String es_PE_FIELD_TaskAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1b14891d-3e13-135f-5da1-e9fd0dce7369",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59d9c0cd-78e7-38bb-dd5e-a2d778fb7d29")
public static final String FIELDNAME_TaskAccess_Role="59d9c0cd-78e7-38bb-dd5e-a2d778fb7d29";

@XendraTrl(Identifier="fbcd7f5f-b634-48dd-6f89-7bfd08fc8e55")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbcd7f5f-b634-48dd-6f89-7bfd08fc8e55",
Synchronized="2019-08-30 22:20:45.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set OS Task.
@param AD_Task_ID Operation System Task */
public void setAD_Task_ID (int AD_Task_ID)
{
if (AD_Task_ID < 1) throw new IllegalArgumentException ("AD_Task_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Task_ID, Integer.valueOf(AD_Task_ID));
}
/** Get OS Task.
@return Operation System Task */
public int getAD_Task_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Task_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4ef675d7-5d93-d3d3-a969-02565144cf05")
public static String es_PE_FIELD_Access_OSTask_Name="Tarea";

@XendraTrl(Identifier="4ef675d7-5d93-d3d3-a969-02565144cf05")
public static String es_PE_FIELD_Access_OSTask_Description="Identificador de la tarea";

@XendraTrl(Identifier="4ef675d7-5d93-d3d3-a969-02565144cf05")
public static String es_PE_FIELD_Access_OSTask_Help="El campo tarea indica una tarea única en el sistema";

@XendraField(AD_Column_ID="AD_Task_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d7e3b770-1a3e-ae73-0d00-7dec9e303578",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ef675d7-5d93-d3d3-a969-02565144cf05")
public static final String FIELDNAME_Access_OSTask="4ef675d7-5d93-d3d3-a969-02565144cf05";

@XendraTrl(Identifier="50778f9e-5e6b-ab22-3061-a2ba427051a0")
public static String es_PE_FIELD_TaskAccess_OSTask_Name="Tarea";

@XendraTrl(Identifier="50778f9e-5e6b-ab22-3061-a2ba427051a0")
public static String es_PE_FIELD_TaskAccess_OSTask_Description="Identificador de la tarea";

@XendraTrl(Identifier="50778f9e-5e6b-ab22-3061-a2ba427051a0")
public static String es_PE_FIELD_TaskAccess_OSTask_Help="El campo tarea indica una tarea única en el sistema";

@XendraField(AD_Column_ID="AD_Task_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1b14891d-3e13-135f-5da1-e9fd0dce7369",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50778f9e-5e6b-ab22-3061-a2ba427051a0")
public static final String FIELDNAME_TaskAccess_OSTask="50778f9e-5e6b-ab22-3061-a2ba427051a0";

@XendraTrl(Identifier="ca0c7cf9-2df1-2f36-4e68-c92e867545ca")
public static String es_PE_COLUMN_AD_Task_ID_Name="Tarea";

@XendraColumn(AD_Element_ID="b760b68d-e9b1-5100-eab2-b34b6c0a1e20",ColumnName="AD_Task_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca0c7cf9-2df1-2f36-4e68-c92e867545ca",
Synchronized="2019-08-30 22:20:45.0")
/** Column name AD_Task_ID */
public static final String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
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
@XendraTrl(Identifier="6d216f9c-e7fe-409a-bd6d-5155e36c828a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d216f9c-e7fe-409a-bd6d-5155e36c828a",
Synchronized="2019-08-30 22:20:45.0")
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

@XendraTrl(Identifier="28019971-dbd2-b2c5-5792-017121df5b26")
public static String es_PE_FIELD_Access_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="28019971-dbd2-b2c5-5792-017121df5b26")
public static String es_PE_FIELD_Access_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="28019971-dbd2-b2c5-5792-017121df5b26")
public static String es_PE_FIELD_Access_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="d7e3b770-1a3e-ae73-0d00-7dec9e303578",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28019971-dbd2-b2c5-5792-017121df5b26")
public static final String FIELDNAME_Access_ReadWrite="28019971-dbd2-b2c5-5792-017121df5b26";

@XendraTrl(Identifier="c453de47-3c77-e7f8-cf2f-96e5b9f14ce6")
public static String es_PE_FIELD_TaskAccess_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="c453de47-3c77-e7f8-cf2f-96e5b9f14ce6")
public static String es_PE_FIELD_TaskAccess_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="c453de47-3c77-e7f8-cf2f-96e5b9f14ce6")
public static String es_PE_FIELD_TaskAccess_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="1b14891d-3e13-135f-5da1-e9fd0dce7369",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c453de47-3c77-e7f8-cf2f-96e5b9f14ce6")
public static final String FIELDNAME_TaskAccess_ReadWrite="c453de47-3c77-e7f8-cf2f-96e5b9f14ce6";

@XendraTrl(Identifier="9e39ec9b-9e87-cd54-9ec6-60a8bd31d40e")
public static String es_PE_COLUMN_IsReadWrite_Name="Lectura Escritura";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e39ec9b-9e87-cd54-9ec6-60a8bd31d40e",
Synchronized="2019-08-30 22:20:45.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
