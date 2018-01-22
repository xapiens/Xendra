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
/** Generated Model for AD_PInstance_Log
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PInstance_Log extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PInstance_Log_ID id
@param trxName transaction
*/
public X_AD_PInstance_Log (Properties ctx, int AD_PInstance_Log_ID, String trxName)
{
super (ctx, AD_PInstance_Log_ID, trxName);
/** if (AD_PInstance_Log_ID == 0)
{
setAD_PInstance_ID (0);
setLog_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PInstance_Log (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=578 */
public static int Table_ID=MTable.getTable_ID("AD_PInstance_Log");

@XendraTrl(Identifier="af7c7915-561a-802c-6551-07de0aef7d02")
public static String es_PE_TAB_Log_Description="Procesador Log";

@XendraTrl(Identifier="af7c7915-561a-802c-6551-07de0aef7d02")
public static String es_PE_TAB_Log_Name="Log";
@XendraTab(Name="Log",Description="Process Log",
Help="",AD_Window_ID="08dcb8f3-54eb-187f-4e28-3d300e974ac2",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="af7c7915-561a-802c-6551-07de0aef7d02",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Log="af7c7915-561a-802c-6551-07de0aef7d02";

@XendraTrl(Identifier="8d839d1b-4ce1-1b4a-750f-63dc074e17cc")
public static String es_PE_TABLE_AD_PInstance_Log_Name="AD_PInstance_Log";

@XendraTable(Name="AD_PInstance_Log",Description="(Non Standard Table)",Help="",
TableName="AD_PInstance_Log",AccessLevel="6",AD_Window_ID="08dcb8f3-54eb-187f-4e28-3d300e974ac2",
AD_Val_Rule_ID="",IsKey=2,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="8d839d1b-4ce1-1b4a-750f-63dc074e17cc",Synchronized="2017-08-16 11:40:35.0")
/** TableName=AD_PInstance_Log */
public static final String Table_Name="AD_PInstance_Log";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PInstance_Log");

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
    Table_ID = MTable.getTable_ID("AD_PInstance_Log");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PInstance_Log[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b101f31f-ef38-49aa-5281-5ffc82434e78")
public static String es_PE_FIELD_Log_ProcessInstance_Name="Instancia del Proceso";

@XendraField(AD_Column_ID="AD_PInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="af7c7915-561a-802c-6551-07de0aef7d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b101f31f-ef38-49aa-5281-5ffc82434e78")
public static final String FIELDNAME_Log_ProcessInstance="b101f31f-ef38-49aa-5281-5ffc82434e78";
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
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
@XendraTrl(Identifier="b76bf5f4-ec8b-4f77-b006-b8d581499834")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b76bf5f4-ec8b-4f77-b006-b8d581499834",
Synchronized="2017-08-05 16:52:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Log.
@param Log_ID Log */
public void setLog_ID (int Log_ID)
{
if (Log_ID < 1) throw new IllegalArgumentException ("Log_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Log_ID, Integer.valueOf(Log_ID));
}
/** Get Log.
@return Log */
public int getLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Log_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bc5dc545-9f96-0668-c408-4def129e5bf1")
public static String es_PE_FIELD_Log_Log_Name="Log";
@XendraField(AD_Column_ID="Log_ID",
IsCentrallyMaintained=true,AD_Tab_ID="af7c7915-561a-802c-6551-07de0aef7d02",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bc5dc545-9f96-0668-c408-4def129e5bf1")
public static final String FIELDNAME_Log_Log="bc5dc545-9f96-0668-c408-4def129e5bf1";
/** Column name Log_ID */
public static final String COLUMNNAME_Log_ID = "Log_ID";
/** Set Process Date.
@param P_Date Process Parameter */
public void setP_Date (Timestamp P_Date)
{
set_ValueNoCheck (COLUMNNAME_P_Date, P_Date);
}
/** Get Process Date.
@return Process Parameter */
public Timestamp getP_Date() 
{
return (Timestamp)get_Value(COLUMNNAME_P_Date);
}

@XendraTrl(Identifier="1e1adc27-6323-dfa1-deb0-eaa22957b128")
public static String es_PE_FIELD_Log_ProcessDate_Name="Fecha";
@XendraField(AD_Column_ID="P_Date",
IsCentrallyMaintained=true,AD_Tab_ID="af7c7915-561a-802c-6551-07de0aef7d02",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1e1adc27-6323-dfa1-deb0-eaa22957b128")
public static final String FIELDNAME_Log_ProcessDate="1e1adc27-6323-dfa1-deb0-eaa22957b128";

@XendraTrl(Identifier="0d46a540-1617-4b3f-4e1d-dfc00d9ceae4")
public static String es_PE_COLUMN_P_Date_Name="Fecha";

@XendraColumn(AD_Element_ID="790305e7-f6b8-9b15-744a-432f8f76f5e8",ColumnName="P_Date",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d46a540-1617-4b3f-4e1d-dfc00d9ceae4",
Synchronized="2017-08-05 16:52:39.0")
/** Column name P_Date */
public static final String COLUMNNAME_P_Date = "P_Date";
/** Set Process ID.
@param P_ID Process ID */
public void setP_ID (int P_ID)
{
if (P_ID <= 0) set_ValueNoCheck (COLUMNNAME_P_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_P_ID, Integer.valueOf(P_ID));
}
/** Get Process ID.
@return Process ID */
public int getP_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_P_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="298da437-f78c-91f2-a203-3e86598deb9e")
public static String es_PE_FIELD_Log_ProcessID_Name="ID Proceso";
@XendraField(AD_Column_ID="P_ID",
IsCentrallyMaintained=true,AD_Tab_ID="af7c7915-561a-802c-6551-07de0aef7d02",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="298da437-f78c-91f2-a203-3e86598deb9e")
public static final String FIELDNAME_Log_ProcessID="298da437-f78c-91f2-a203-3e86598deb9e";

@XendraTrl(Identifier="a5083745-cc2b-373e-d58f-ae0a3eb5d0a8")
public static String es_PE_COLUMN_P_ID_Name="ID Proceso";

@XendraColumn(AD_Element_ID="c93f10f7-3ddf-e32c-316c-8099ff3f1670",ColumnName="P_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5083745-cc2b-373e-d58f-ae0a3eb5d0a8",
Synchronized="2017-08-05 16:52:39.0")
/** Column name P_ID */
public static final String COLUMNNAME_P_ID = "P_ID";
/** Set Process Message.
@param P_Msg Process Message */
public void setP_Msg (String P_Msg)
{
if (P_Msg != null && P_Msg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
P_Msg = P_Msg.substring(0,1999);
}
set_ValueNoCheck (COLUMNNAME_P_Msg, P_Msg);
}
/** Get Process Message.
@return Process Message */
public String getP_Msg() 
{
String value = (String)get_Value(COLUMNNAME_P_Msg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2aabb5ec-f6a6-42cb-0929-53e2ea5adcc9")
public static String es_PE_FIELD_Log_ProcessMessage_Name="Procesar Mensaje";

@XendraField(AD_Column_ID="P_Msg",IsCentrallyMaintained=true,
AD_Tab_ID="af7c7915-561a-802c-6551-07de0aef7d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2aabb5ec-f6a6-42cb-0929-53e2ea5adcc9")
public static final String FIELDNAME_Log_ProcessMessage="2aabb5ec-f6a6-42cb-0929-53e2ea5adcc9";

@XendraTrl(Identifier="471d9b42-fb80-dbb9-73ca-3a4ba662fd6d")
public static String es_PE_COLUMN_P_Msg_Name="Procesar Mensaje";

@XendraColumn(AD_Element_ID="12ed5d73-880f-0ec1-2200-033d82213bd8",ColumnName="P_Msg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="471d9b42-fb80-dbb9-73ca-3a4ba662fd6d",
Synchronized="2017-08-05 16:52:39.0")
/** Column name P_Msg */
public static final String COLUMNNAME_P_Msg = "P_Msg";
/** Set Process Number.
@param P_Number Process Parameter */
public void setP_Number (BigDecimal P_Number)
{
set_ValueNoCheck (COLUMNNAME_P_Number, P_Number);
}
/** Get Process Number.
@return Process Parameter */
public BigDecimal getP_Number() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_P_Number);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cb5c7089-14dd-1c27-f423-287a16a0f056")
public static String es_PE_FIELD_Log_ProcessNumber_Name="Número";

@XendraField(AD_Column_ID="P_Number",IsCentrallyMaintained=true,
AD_Tab_ID="af7c7915-561a-802c-6551-07de0aef7d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb5c7089-14dd-1c27-f423-287a16a0f056")
public static final String FIELDNAME_Log_ProcessNumber="cb5c7089-14dd-1c27-f423-287a16a0f056";

@XendraTrl(Identifier="f0b095db-fd30-0cc0-8874-7cdc6b06160c")
public static String es_PE_COLUMN_P_Number_Name="Número";

@XendraColumn(AD_Element_ID="09e1d4c5-95ad-6214-9fa3-baa4772c5453",ColumnName="P_Number",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0b095db-fd30-0cc0-8874-7cdc6b06160c",
Synchronized="2017-08-05 16:52:39.0")
/** Column name P_Number */
public static final String COLUMNNAME_P_Number = "P_Number";
}
