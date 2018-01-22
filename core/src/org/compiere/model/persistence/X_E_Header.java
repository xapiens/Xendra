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
/** Generated Model for E_Header
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_Header extends PO
{
/** Standard Constructor
@param ctx context
@param E_Header_ID id
@param trxName transaction
*/
public X_E_Header (Properties ctx, int E_Header_ID, String trxName)
{
super (ctx, E_Header_ID, trxName);
/** if (E_Header_ID == 0)
{
setE_Header_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_Header (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000285 */
public static int Table_ID=MTable.getTable_ID("E_Header");

@XendraTrl(Identifier="78f1a460-9499-477b-8b56-f9b81764a2a8")
public static String es_PE_TABLE_E_Header_Name="E_Header";

@XendraTable(Name="E_Header",Description="",Help="",TableName="E_Header",AccessLevel="6",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.communication",
Identifier="78f1a460-9499-477b-8b56-f9b81764a2a8",Synchronized="2017-08-16 11:42:36.0")
/** TableName=E_Header */
public static final String Table_Name="E_Header";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_Header");

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
    Table_ID = MTable.getTable_ID("E_Header");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_Header[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="202c9e34-1473-481a-9221-ba734eea9f0c")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="202c9e34-1473-481a-9221-ba734eea9f0c",
Synchronized="2017-08-05 16:54:33.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set D_Cc.
@param D_Cc D_Cc */
public void setD_Cc (String D_Cc)
{
set_Value (COLUMNNAME_D_Cc, D_Cc);
}
/** Get D_Cc.
@return D_Cc */
public String getD_Cc() 
{
String value = (String)get_Value(COLUMNNAME_D_Cc);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="61b3f7b6-1504-4b37-ac0e-828d79d89463")
public static String es_PE_COLUMN_D_Cc_Name="D_Cc";

@XendraColumn(AD_Element_ID="b4da9d3b-f785-4182-bba5-88dfaa188fad",ColumnName="D_Cc",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="61b3f7b6-1504-4b37-ac0e-828d79d89463",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_Cc */
public static final String COLUMNNAME_D_Cc = "D_Cc";
/** Set D_Content_Type.
@param D_Content_Type D_Content_Type */
public void setD_Content_Type (String D_Content_Type)
{
set_Value (COLUMNNAME_D_Content_Type, D_Content_Type);
}
/** Get D_Content_Type.
@return D_Content_Type */
public String getD_Content_Type() 
{
String value = (String)get_Value(COLUMNNAME_D_Content_Type);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3790794d-6f26-4d3e-8e74-ac9b53f4902f")
public static String es_PE_COLUMN_D_Content_Type_Name="D_Content_Type";

@XendraColumn(AD_Element_ID="ac9e2c7f-a3ae-4706-be65-710a6f2e46f4",ColumnName="D_Content_Type",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="3790794d-6f26-4d3e-8e74-ac9b53f4902f",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_Content_Type */
public static final String COLUMNNAME_D_Content_Type = "D_Content_Type";
/** Set D_Date.
@param D_Date D_Date */
public void setD_Date (String D_Date)
{
set_Value (COLUMNNAME_D_Date, D_Date);
}
/** Get D_Date.
@return D_Date */
public String getD_Date() 
{
String value = (String)get_Value(COLUMNNAME_D_Date);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7c46630f-0440-4268-974f-59164c7b3b54")
public static String es_PE_COLUMN_D_Date_Name="D_Date";

@XendraColumn(AD_Element_ID="e77feb5b-2284-43e5-a1d4-1fa30cafdcb7",ColumnName="D_Date",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="7c46630f-0440-4268-974f-59164c7b3b54",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_Date */
public static final String COLUMNNAME_D_Date = "D_Date";
/** Set D_From.
@param D_From D_From */
public void setD_From (String D_From)
{
set_Value (COLUMNNAME_D_From, D_From);
}
/** Get D_From.
@return D_From */
public String getD_From() 
{
String value = (String)get_Value(COLUMNNAME_D_From);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="53ab475b-85a2-40bd-92dc-fab8b8358e33")
public static String es_PE_COLUMN_D_From_Name="D_From";

@XendraColumn(AD_Element_ID="30747b84-1463-429c-ae41-65e378d25971",ColumnName="D_From",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="53ab475b-85a2-40bd-92dc-fab8b8358e33",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_From */
public static final String COLUMNNAME_D_From = "D_From";
/** Set D_In_Reply_To.
@param D_In_Reply_To D_In_Reply_To */
public void setD_In_Reply_To (String D_In_Reply_To)
{
set_Value (COLUMNNAME_D_In_Reply_To, D_In_Reply_To);
}
/** Get D_In_Reply_To.
@return D_In_Reply_To */
public String getD_In_Reply_To() 
{
String value = (String)get_Value(COLUMNNAME_D_In_Reply_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="54e1174a-a2e4-4425-96fd-afc1a4f3097b")
public static String es_PE_COLUMN_D_In_Reply_To_Name="D_In_Reply_To";

@XendraColumn(AD_Element_ID="43a67cbd-c5cd-4292-9423-a146b5eac5a1",ColumnName="D_In_Reply_To",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="54e1174a-a2e4-4425-96fd-afc1a4f3097b",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_In_Reply_To */
public static final String COLUMNNAME_D_In_Reply_To = "D_In_Reply_To";
/** Set D_Message_ID.
@param D_Message_ID D_Message_ID */
public void setD_Message_ID (String D_Message_ID)
{
set_Value (COLUMNNAME_D_Message_ID, D_Message_ID);
}
/** Get D_Message_ID.
@return D_Message_ID */
public String getD_Message_ID() 
{
String value = (String)get_Value(COLUMNNAME_D_Message_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8663db27-f94f-43f0-a5dd-2cd36c563898")
public static String es_PE_COLUMN_D_Message_ID_Name="D_Message_ID";

@XendraColumn(AD_Element_ID="db82a414-b4e5-4fd8-a0d5-c847e243d2cb",ColumnName="D_Message_ID",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="8663db27-f94f-43f0-a5dd-2cd36c563898",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_Message_ID */
public static final String COLUMNNAME_D_Message_ID = "D_Message_ID";
/** Set D_References.
@param D_References D_References */
public void setD_References (String D_References)
{
set_Value (COLUMNNAME_D_References, D_References);
}
/** Get D_References.
@return D_References */
public String getD_References() 
{
String value = (String)get_Value(COLUMNNAME_D_References);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9dbcd579-5bd3-4e43-8761-23085fb351bf")
public static String es_PE_COLUMN_D_References_Name="D_References";

@XendraColumn(AD_Element_ID="afcc2edd-4a3f-46a5-af5a-59fbeaee16aa",ColumnName="D_References",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="9dbcd579-5bd3-4e43-8761-23085fb351bf",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_References */
public static final String COLUMNNAME_D_References = "D_References";
/** Set D_Subject.
@param D_Subject D_Subject */
public void setD_Subject (String D_Subject)
{
set_Value (COLUMNNAME_D_Subject, D_Subject);
}
/** Get D_Subject.
@return D_Subject */
public String getD_Subject() 
{
String value = (String)get_Value(COLUMNNAME_D_Subject);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bb194b72-bc1b-4acb-b126-89a82c7e6115")
public static String es_PE_COLUMN_D_Subject_Name="D_Subject";

@XendraColumn(AD_Element_ID="42dec507-525a-4842-983d-0c2b10b03daa",ColumnName="D_Subject",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="bb194b72-bc1b-4acb-b126-89a82c7e6115",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_Subject */
public static final String COLUMNNAME_D_Subject = "D_Subject";
/** Set D_To.
@param D_To D_To */
public void setD_To (String D_To)
{
set_Value (COLUMNNAME_D_To, D_To);
}
/** Get D_To.
@return D_To */
public String getD_To() 
{
String value = (String)get_Value(COLUMNNAME_D_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6fc66feb-6c15-45d4-9e8b-73116c694fcc")
public static String es_PE_COLUMN_D_To_Name="D_To";

@XendraColumn(AD_Element_ID="f41917c2-ddbc-4fd5-95ff-0f13d08e3c23",ColumnName="D_To",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="6fc66feb-6c15-45d4-9e8b-73116c694fcc",
Synchronized="2017-08-05 16:54:33.0")
/** Column name D_To */
public static final String COLUMNNAME_D_To = "D_To";
/** Set E_Folder_ID.
@param E_Folder_ID E_Folder_ID */
public void setE_Folder_ID (int E_Folder_ID)
{
if (E_Folder_ID <= 0) set_Value (COLUMNNAME_E_Folder_ID, null);
 else 
set_Value (COLUMNNAME_E_Folder_ID, Integer.valueOf(E_Folder_ID));
}
/** Get E_Folder_ID.
@return E_Folder_ID */
public int getE_Folder_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Folder_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="41d8b809-0f63-4789-84c5-8e5967bfb735")
public static String es_PE_COLUMN_E_Folder_ID_Name="E_Folder_ID";

@XendraColumn(AD_Element_ID="c635db32-2123-4d21-b86e-41418be636ff",ColumnName="E_Folder_ID",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41d8b809-0f63-4789-84c5-8e5967bfb735",
Synchronized="2017-08-05 16:54:33.0")
/** Column name E_Folder_ID */
public static final String COLUMNNAME_E_Folder_ID = "E_Folder_ID";
/** Set E_Header_ID.
@param E_Header_ID E_Header_ID */
public void setE_Header_ID (int E_Header_ID)
{
if (E_Header_ID < 1) throw new IllegalArgumentException ("E_Header_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_Header_ID, Integer.valueOf(E_Header_ID));
}
/** Get E_Header_ID.
@return E_Header_ID */
public int getE_Header_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Header_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_Header_ID */
public static final String COLUMNNAME_E_Header_ID = "E_Header_ID";
/** Set I_AccountUID.
@param I_AccountUID I_AccountUID */
public void setI_AccountUID (int I_AccountUID)
{
set_Value (COLUMNNAME_I_AccountUID, Integer.valueOf(I_AccountUID));
}
/** Get I_AccountUID.
@return I_AccountUID */
public int getI_AccountUID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_AccountUID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1243c80d-6a85-4782-b35c-d13574a82fa9")
public static String es_PE_COLUMN_I_AccountUID_Name="I_AccountUID";

@XendraColumn(AD_Element_ID="f71bb6f2-6906-4d88-a6e1-a0dac732ce7e",ColumnName="I_AccountUID",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1243c80d-6a85-4782-b35c-d13574a82fa9",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_AccountUID */
public static final String COLUMNNAME_I_AccountUID = "I_AccountUID";
/** Set I_Cc.
@param I_Cc I_Cc */
public void setI_Cc (String I_Cc)
{
set_Value (COLUMNNAME_I_Cc, I_Cc);
}
/** Get I_Cc.
@return I_Cc */
public String getI_Cc() 
{
String value = (String)get_Value(COLUMNNAME_I_Cc);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d0f6b044-358a-4351-be97-6ad421888163")
public static String es_PE_COLUMN_I_Cc_Name="I_Cc";

@XendraColumn(AD_Element_ID="bea6ffb1-5d2a-4533-ac73-4631f0ea65dc",ColumnName="I_Cc",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="d0f6b044-358a-4351-be97-6ad421888163",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_Cc */
public static final String COLUMNNAME_I_Cc = "I_Cc";
/** Set I_Color.
@param I_Color I_Color */
public void setI_Color (String I_Color)
{
set_Value (COLUMNNAME_I_Color, I_Color);
}
/** Get I_Color.
@return I_Color */
public String getI_Color() 
{
String value = (String)get_Value(COLUMNNAME_I_Color);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="249b8959-1513-4f98-bf98-ebc27b71f298")
public static String es_PE_COLUMN_I_Color_Name="I_Color";

@XendraColumn(AD_Element_ID="248ee7c2-af3b-4ce2-aaf9-71b7199d136c",ColumnName="I_Color",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="249b8959-1513-4f98-bf98-ebc27b71f298",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_Color */
public static final String COLUMNNAME_I_Color = "I_Color";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d9fbe5da-d6dd-4e7f-be69-dbdb28c60e05")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="d9fbe5da-d6dd-4e7f-be69-dbdb28c60e05",
Synchronized="2017-08-05 16:54:33.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
/** Set I_Date.
@param I_Date I_Date */
public void setI_Date (Timestamp I_Date)
{
set_Value (COLUMNNAME_I_Date, I_Date);
}
/** Get I_Date.
@return I_Date */
public Timestamp getI_Date() 
{
return (Timestamp)get_Value(COLUMNNAME_I_Date);
}

@XendraTrl(Identifier="b4ed5dc5-7c84-4be0-b694-01b39c4c0e35")
public static String es_PE_COLUMN_I_Date_Name="I_Date";

@XendraColumn(AD_Element_ID="508efde3-256a-4dec-bf3d-c761592236f5",ColumnName="I_Date",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4ed5dc5-7c84-4be0-b694-01b39c4c0e35",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_Date */
public static final String COLUMNNAME_I_Date = "I_Date";
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
@XendraTrl(Identifier="9318f0d4-88f4-4baf-8143-1d4c2b764a9b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9318f0d4-88f4-4baf-8143-1d4c2b764a9b",
Synchronized="2017-08-05 16:54:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set I_From.
@param I_From I_From */
public void setI_From (String I_From)
{
set_Value (COLUMNNAME_I_From, I_From);
}
/** Get I_From.
@return I_From */
public String getI_From() 
{
String value = (String)get_Value(COLUMNNAME_I_From);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="da2aa129-04e5-4cb3-8bf4-4c3e03d2ed6d")
public static String es_PE_COLUMN_I_From_Name="I_From";

@XendraColumn(AD_Element_ID="fd9a17d6-7fd4-4ffd-8200-f5817c0bb4b3",ColumnName="I_From",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="da2aa129-04e5-4cb3-8bf4-4c3e03d2ed6d",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_From */
public static final String COLUMNNAME_I_From = "I_From";
/** Set I_Host.
@param I_Host I_Host */
public void setI_Host (String I_Host)
{
set_Value (COLUMNNAME_I_Host, I_Host);
}
/** Get I_Host.
@return I_Host */
public String getI_Host() 
{
String value = (String)get_Value(COLUMNNAME_I_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f6d2f5c7-59ef-40c7-939c-60b063b95c64")
public static String es_PE_COLUMN_I_Host_Name="I_Host";

@XendraColumn(AD_Element_ID="640d4ddb-0ebd-470c-97c6-0624ec7bc912",ColumnName="I_Host",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f6d2f5c7-59ef-40c7-939c-60b063b95c64",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_Host */
public static final String COLUMNNAME_I_Host = "I_Host";
/** Set I_Priority.
@param I_Priority I_Priority */
public void setI_Priority (int I_Priority)
{
set_Value (COLUMNNAME_I_Priority, Integer.valueOf(I_Priority));
}
/** Get I_Priority.
@return I_Priority */
public int getI_Priority() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Priority);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad091b1e-7c54-4eba-bcfb-ecc0b464a20d")
public static String es_PE_COLUMN_I_Priority_Name="I_Priority";

@XendraColumn(AD_Element_ID="e1ec25e7-3587-439b-a73a-6d1751b1d5af",ColumnName="I_Priority",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad091b1e-7c54-4eba-bcfb-ecc0b464a20d",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_Priority */
public static final String COLUMNNAME_I_Priority = "I_Priority";
/** Set IsAnswered.
@param IsAnswered IsAnswered */
public void setIsAnswered (boolean IsAnswered)
{
set_Value (COLUMNNAME_IsAnswered, Boolean.valueOf(IsAnswered));
}
/** Get IsAnswered.
@return IsAnswered */
public boolean isAnswered() 
{
Object oo = get_Value(COLUMNNAME_IsAnswered);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="22994ba3-1d69-4be2-91bb-5f066d32e861")
public static String es_PE_COLUMN_IsAnswered_Name="IsAnswered";

@XendraColumn(AD_Element_ID="c9581a59-7321-4dde-b9e6-5f86a4aefef3",ColumnName="IsAnswered",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22994ba3-1d69-4be2-91bb-5f066d32e861",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsAnswered */
public static final String COLUMNNAME_IsAnswered = "IsAnswered";
/** Set IsAttachment.
@param IsAttachment IsAttachment */
public void setIsAttachment (boolean IsAttachment)
{
set_Value (COLUMNNAME_IsAttachment, Boolean.valueOf(IsAttachment));
}
/** Get IsAttachment.
@return IsAttachment */
public boolean isAttachment() 
{
Object oo = get_Value(COLUMNNAME_IsAttachment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="43739a20-9bba-4700-96c0-146059290d45")
public static String es_PE_COLUMN_IsAttachment_Name="IsAttachment";

@XendraColumn(AD_Element_ID="b67fe61a-8ed5-4649-bd08-62e0a7100ea3",ColumnName="IsAttachment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43739a20-9bba-4700-96c0-146059290d45",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsAttachment */
public static final String COLUMNNAME_IsAttachment = "IsAttachment";
/** Set IsDraft.
@param IsDraft IsDraft */
public void setIsDraft (boolean IsDraft)
{
set_Value (COLUMNNAME_IsDraft, Boolean.valueOf(IsDraft));
}
/** Get IsDraft.
@return IsDraft */
public boolean isDraft() 
{
Object oo = get_Value(COLUMNNAME_IsDraft);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="efd7cbd5-6ba7-4148-b1a7-03ead2a475cd")
public static String es_PE_COLUMN_IsDraft_Name="IsDraft";

@XendraColumn(AD_Element_ID="0540a4f4-7f8a-4602-a81d-f3a13104495a",ColumnName="IsDraft",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efd7cbd5-6ba7-4148-b1a7-03ead2a475cd",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsDraft */
public static final String COLUMNNAME_IsDraft = "IsDraft";
/** Set IsExpunged.
@param IsExpunged IsExpunged */
public void setIsExpunged (boolean IsExpunged)
{
set_Value (COLUMNNAME_IsExpunged, Boolean.valueOf(IsExpunged));
}
/** Get IsExpunged.
@return IsExpunged */
public boolean isExpunged() 
{
Object oo = get_Value(COLUMNNAME_IsExpunged);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a298a63b-a622-4795-9d0e-269fbbca3185")
public static String es_PE_COLUMN_IsExpunged_Name="IsExpunged";

@XendraColumn(AD_Element_ID="df80b337-de70-4c6f-95ae-42d6fd5789d5",ColumnName="IsExpunged",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a298a63b-a622-4795-9d0e-269fbbca3185",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsExpunged */
public static final String COLUMNNAME_IsExpunged = "IsExpunged";
/** Set IsFlagged.
@param IsFlagged IsFlagged */
public void setIsFlagged (boolean IsFlagged)
{
set_Value (COLUMNNAME_IsFlagged, Boolean.valueOf(IsFlagged));
}
/** Get IsFlagged.
@return IsFlagged */
public boolean isFlagged() 
{
Object oo = get_Value(COLUMNNAME_IsFlagged);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a52d3f58-26ef-4871-b1ab-4891f2e505b8")
public static String es_PE_COLUMN_IsFlagged_Name="IsFlagged";

@XendraColumn(AD_Element_ID="2b84c9db-c043-4bc2-b19d-55a7b021a19d",ColumnName="IsFlagged",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a52d3f58-26ef-4871-b1ab-4891f2e505b8",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsFlagged */
public static final String COLUMNNAME_IsFlagged = "IsFlagged";
/** Set I_Size.
@param I_Size I_Size */
public void setI_Size (int I_Size)
{
set_Value (COLUMNNAME_I_Size, Integer.valueOf(I_Size));
}
/** Get I_Size.
@return I_Size */
public int getI_Size() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Size);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e1c9e771-7852-4ee4-b5ed-8c701187d374")
public static String es_PE_COLUMN_I_Size_Name="I_Size";

@XendraColumn(AD_Element_ID="964e72b6-9b10-4207-a6d1-a1ccf641a9a5",ColumnName="I_Size",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1c9e771-7852-4ee4-b5ed-8c701187d374",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_Size */
public static final String COLUMNNAME_I_Size = "I_Size";
/** Set IsRecent.
@param IsRecent IsRecent */
public void setIsRecent (boolean IsRecent)
{
set_Value (COLUMNNAME_IsRecent, Boolean.valueOf(IsRecent));
}
/** Get IsRecent.
@return IsRecent */
public boolean isRecent() 
{
Object oo = get_Value(COLUMNNAME_IsRecent);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b240d816-47b2-414f-be37-7437ec649cfd")
public static String es_PE_COLUMN_IsRecent_Name="IsRecent";

@XendraColumn(AD_Element_ID="4adb4526-0121-4308-b10a-f59c0516b7b3",ColumnName="IsRecent",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b240d816-47b2-414f-be37-7437ec649cfd",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsRecent */
public static final String COLUMNNAME_IsRecent = "IsRecent";
/** Set IsSeen.
@param IsSeen IsSeen */
public void setIsSeen (boolean IsSeen)
{
set_Value (COLUMNNAME_IsSeen, Boolean.valueOf(IsSeen));
}
/** Get IsSeen.
@return IsSeen */
public boolean isSeen() 
{
Object oo = get_Value(COLUMNNAME_IsSeen);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cc3f2e20-4c56-4fa4-9ed3-7ca90991da90")
public static String es_PE_COLUMN_IsSeen_Name="IsSeen";

@XendraColumn(AD_Element_ID="68a86f56-c020-4a76-b34f-5b75a7df5e4a",ColumnName="IsSeen",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc3f2e20-4c56-4fa4-9ed3-7ca90991da90",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsSeen */
public static final String COLUMNNAME_IsSeen = "IsSeen";
/** Set IsSpam.
@param IsSpam IsSpam */
public void setIsSpam (boolean IsSpam)
{
set_Value (COLUMNNAME_IsSpam, Boolean.valueOf(IsSpam));
}
/** Get IsSpam.
@return IsSpam */
public boolean isSpam() 
{
Object oo = get_Value(COLUMNNAME_IsSpam);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ca23e9d3-6d3d-448f-ab1c-4dc94b819ab3")
public static String es_PE_COLUMN_IsSpam_Name="IsSpam";

@XendraColumn(AD_Element_ID="62f9cad0-5656-4041-a9d5-6e3e7c084dda",ColumnName="IsSpam",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca23e9d3-6d3d-448f-ab1c-4dc94b819ab3",
Synchronized="2017-08-05 16:54:33.0")
/** Column name IsSpam */
public static final String COLUMNNAME_IsSpam = "IsSpam";
/** Set I_Subject.
@param I_Subject I_Subject */
public void setI_Subject (String I_Subject)
{
set_Value (COLUMNNAME_I_Subject, I_Subject);
}
/** Get I_Subject.
@return I_Subject */
public String getI_Subject() 
{
String value = (String)get_Value(COLUMNNAME_I_Subject);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="94813737-9d48-4d91-be69-23e28aa7f1f5")
public static String es_PE_COLUMN_I_Subject_Name="I_Subject";

@XendraColumn(AD_Element_ID="ffba60d1-0218-4cd5-b5c2-99b509a34c5e",ColumnName="I_Subject",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="94813737-9d48-4d91-be69-23e28aa7f1f5",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_Subject */
public static final String COLUMNNAME_I_Subject = "I_Subject";
/** Set I_To.
@param I_To I_To */
public void setI_To (String I_To)
{
set_Value (COLUMNNAME_I_To, I_To);
}
/** Get I_To.
@return I_To */
public String getI_To() 
{
String value = (String)get_Value(COLUMNNAME_I_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3a024aba-61ed-4d88-a15c-f768d5d46484")
public static String es_PE_COLUMN_I_To_Name="I_To";

@XendraColumn(AD_Element_ID="d46aa1e5-a25d-49e6-b1fb-06f338fb5408",ColumnName="I_To",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="3a024aba-61ed-4d88-a15c-f768d5d46484",
Synchronized="2017-08-05 16:54:33.0")
/** Column name I_To */
public static final String COLUMNNAME_I_To = "I_To";
/** Set Message.
@param Message EMail Message */
public void setMessage (String Message)
{
set_Value (COLUMNNAME_Message, Message);
}
/** Get Message.
@return EMail Message */
public String getMessage() 
{
String value = (String)get_Value(COLUMNNAME_Message);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="840bd467-1b8e-4dbb-b9f8-0dc86fa49374")
public static String es_PE_COLUMN_Message_Name="Message";

@XendraColumn(AD_Element_ID="2bb1f4e6-4970-9212-47bb-51c6eb788a65",ColumnName="Message",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="840bd467-1b8e-4dbb-b9f8-0dc86fa49374",
Synchronized="2017-08-05 16:54:33.0")
/** Column name Message */
public static final String COLUMNNAME_Message = "Message";
}
