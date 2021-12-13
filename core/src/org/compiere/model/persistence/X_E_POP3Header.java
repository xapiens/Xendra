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
/** Generated Model for E_POP3Header
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_POP3Header extends PO
{
/** Standard Constructor
@param ctx context
@param E_POP3Header_ID id
@param trxName transaction
*/
public X_E_POP3Header (Properties ctx, int E_POP3Header_ID, String trxName)
{
super (ctx, E_POP3Header_ID, trxName);
/** if (E_POP3Header_ID == 0)
{
setE_POP3Header_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_POP3Header (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000340 */
public static int Table_ID=MTable.getTable_ID("E_POP3Header");

@XendraTrl(Identifier="385e9b07-3838-4fbb-adfa-1b0ac32d4f6f")
public static String es_PE_TABLE_E_POP3Header_Name="POP3 Header";

@XendraTable(Name="POP3 Header",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="E_POP3Header",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.communication",Identifier="385e9b07-3838-4fbb-adfa-1b0ac32d4f6f",
Synchronized="2020-03-03 21:37:49.0")
/** TableName=E_POP3Header */
public static final String Table_Name="E_POP3Header";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_POP3Header");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("E_POP3Header");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_POP3Header[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="a0d79558-b3ce-44c4-bcd8-6a1a1322f55a")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0d79558-b3ce-44c4-bcd8-6a1a1322f55a",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="1290fc08-23c0-4a4a-8ab1-049bbb41b763")
public static String es_PE_COLUMN_D_Cc_Name="D_Cc";

@XendraColumn(AD_Element_ID="b4da9d3b-f785-4182-bba5-88dfaa188fad",ColumnName="D_Cc",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="1290fc08-23c0-4a4a-8ab1-049bbb41b763",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="2d9e7273-aee9-4509-91eb-49ab1b6d11ec")
public static String es_PE_COLUMN_D_Content_Type_Name="D_Content_Type";

@XendraColumn(AD_Element_ID="ac9e2c7f-a3ae-4706-be65-710a6f2e46f4",ColumnName="D_Content_Type",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="2d9e7273-aee9-4509-91eb-49ab1b6d11ec",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="e599c448-63d0-4ddb-b943-9a3a191db793")
public static String es_PE_COLUMN_D_Date_Name="D_Date";

@XendraColumn(AD_Element_ID="e77feb5b-2284-43e5-a1d4-1fa30cafdcb7",ColumnName="D_Date",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="e599c448-63d0-4ddb-b943-9a3a191db793",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="c9a7eeb8-78dd-48f9-86c4-03ee7f87dd9e")
public static String es_PE_COLUMN_D_From_Name="D_From";

@XendraColumn(AD_Element_ID="30747b84-1463-429c-ae41-65e378d25971",ColumnName="D_From",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c9a7eeb8-78dd-48f9-86c4-03ee7f87dd9e",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="d3304bc1-3557-42db-9d33-ce3a2f4134fa")
public static String es_PE_COLUMN_D_In_Reply_To_Name="D_In_Reply_To";

@XendraColumn(AD_Element_ID="43a67cbd-c5cd-4292-9423-a146b5eac5a1",ColumnName="D_In_Reply_To",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="d3304bc1-3557-42db-9d33-ce3a2f4134fa",
Synchronized="2019-08-30 22:22:26.0")
/** Column name D_In_Reply_To */
public static final String COLUMNNAME_D_In_Reply_To = "D_In_Reply_To";
/** Set D_Message_ID.
@param D_Message_ID D_Message_ID */
public void setD_Message_ID (int D_Message_ID)
{
if (D_Message_ID <= 0) set_Value (COLUMNNAME_D_Message_ID, null);
 else 
set_Value (COLUMNNAME_D_Message_ID, Integer.valueOf(D_Message_ID));
}
/** Get D_Message_ID.
@return D_Message_ID */
public int getD_Message_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_D_Message_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8033352-fe89-439a-b2d4-846a5bcf4fd9")
public static String es_PE_COLUMN_D_Message_ID_Name="D_Message_ID";

@XendraColumn(AD_Element_ID="db82a414-b4e5-4fd8-a0d5-c847e243d2cb",ColumnName="D_Message_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f8033352-fe89-439a-b2d4-846a5bcf4fd9",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="ebbf47e6-8da3-42c2-a963-c0b1c71dcd10")
public static String es_PE_COLUMN_D_References_Name="D_References";

@XendraColumn(AD_Element_ID="afcc2edd-4a3f-46a5-af5a-59fbeaee16aa",ColumnName="D_References",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="ebbf47e6-8da3-42c2-a963-c0b1c71dcd10",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="c1061d1c-f231-4640-aea2-63fafa522a7f")
public static String es_PE_COLUMN_D_Subject_Name="D_Subject";

@XendraColumn(AD_Element_ID="42dec507-525a-4842-983d-0c2b10b03daa",ColumnName="D_Subject",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c1061d1c-f231-4640-aea2-63fafa522a7f",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="39a71d5c-ce02-4d98-b31d-ae5c09fbd0c1")
public static String es_PE_COLUMN_D_To_Name="D_To";

@XendraColumn(AD_Element_ID="f41917c2-ddbc-4fd5-95ff-0f13d08e3c23",ColumnName="D_To",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="39a71d5c-ce02-4d98-b31d-ae5c09fbd0c1",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="cc3e76d5-72ce-4032-a296-c0e460d2b09f")
public static String es_PE_COLUMN_E_Folder_ID_Name="E_Folder_ID";

@XendraColumn(AD_Element_ID="c635db32-2123-4d21-b86e-41418be636ff",ColumnName="E_Folder_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc3e76d5-72ce-4032-a296-c0e460d2b09f",
Synchronized="2019-08-30 22:22:26.0")
/** Column name E_Folder_ID */
public static final String COLUMNNAME_E_Folder_ID = "E_Folder_ID";
/** Set Messages .
@param E_Message_ID Messages  */
public void setE_Message_ID (int E_Message_ID)
{
if (E_Message_ID <= 0) set_Value (COLUMNNAME_E_Message_ID, null);
 else 
set_Value (COLUMNNAME_E_Message_ID, Integer.valueOf(E_Message_ID));
}
/** Get Messages .
@return Messages  */
public int getE_Message_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Message_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="298e6cba-80ce-453a-a572-0ca3d0cb96ca")
public static String es_PE_COLUMN_E_Message_ID_Name="Messages ";

@XendraColumn(AD_Element_ID="5c30ad86-9c9a-4b13-a54b-af3acc97fee7",ColumnName="E_Message_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="298e6cba-80ce-453a-a572-0ca3d0cb96ca",
Synchronized="2019-08-30 22:22:26.0")
/** Column name E_Message_ID */
public static final String COLUMNNAME_E_Message_ID = "E_Message_ID";
/** Set POP3 Header.
@param E_POP3Header_ID POP3 Header */
public void setE_POP3Header_ID (int E_POP3Header_ID)
{
if (E_POP3Header_ID < 1) throw new IllegalArgumentException ("E_POP3Header_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_POP3Header_ID, Integer.valueOf(E_POP3Header_ID));
}
/** Get POP3 Header.
@return POP3 Header */
public int getE_POP3Header_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_POP3Header_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_POP3Header_ID */
public static final String COLUMNNAME_E_POP3Header_ID = "E_POP3Header_ID";
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

@XendraTrl(Identifier="0b99d803-4dc8-443f-9208-8e23a59df4f3")
public static String es_PE_COLUMN_I_AccountUID_Name="I_AccountUID";

@XendraColumn(AD_Element_ID="f71bb6f2-6906-4d88-a6e1-a0dac732ce7e",ColumnName="I_AccountUID",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b99d803-4dc8-443f-9208-8e23a59df4f3",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="fac4bba8-9f8e-413e-a7d9-9646147102aa")
public static String es_PE_COLUMN_I_Cc_Name="I_Cc";

@XendraColumn(AD_Element_ID="bea6ffb1-5d2a-4533-ac73-4631f0ea65dc",ColumnName="I_Cc",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="fac4bba8-9f8e-413e-a7d9-9646147102aa",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="1d632051-4e53-446c-8424-db2110c9b945")
public static String es_PE_COLUMN_I_Color_Name="I_Color";

@XendraColumn(AD_Element_ID="248ee7c2-af3b-4ce2-aaf9-71b7199d136c",ColumnName="I_Color",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="1d632051-4e53-446c-8424-db2110c9b945",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="e71d8493-f7a2-4ad5-8dde-d24c70e881d9")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="e71d8493-f7a2-4ad5-8dde-d24c70e881d9",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="31e80098-688a-4dbf-98df-a430b1486dbf")
public static String es_PE_COLUMN_I_Date_Name="I_Date";

@XendraColumn(AD_Element_ID="508efde3-256a-4dec-bf3d-c761592236f5",ColumnName="I_Date",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31e80098-688a-4dbf-98df-a430b1486dbf",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="45a1eddf-aff2-4b47-9e1c-55a09d15b1d9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45a1eddf-aff2-4b47-9e1c-55a09d15b1d9",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="ac6e022f-d998-4ff7-ba83-1d0cebeb37b7")
public static String es_PE_COLUMN_I_From_Name="I_From";

@XendraColumn(AD_Element_ID="fd9a17d6-7fd4-4ffd-8200-f5817c0bb4b3",ColumnName="I_From",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="ac6e022f-d998-4ff7-ba83-1d0cebeb37b7",
Synchronized="2019-08-30 22:22:26.0")
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
@XendraTrl(Identifier="44689d5c-c4ca-4911-af71-0d88289c85e7")
public static String es_PE_COLUMN_I_Host_Name="I_Host";

@XendraColumn(AD_Element_ID="640d4ddb-0ebd-470c-97c6-0624ec7bc912",ColumnName="I_Host",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="44689d5c-c4ca-4911-af71-0d88289c85e7",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="6f7b43ea-292e-4f43-9ede-c2bd4100f70e")
public static String es_PE_COLUMN_I_Priority_Name="I_Priority";

@XendraColumn(AD_Element_ID="e1ec25e7-3587-439b-a73a-6d1751b1d5af",ColumnName="I_Priority",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f7b43ea-292e-4f43-9ede-c2bd4100f70e",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="65115897-8dbb-4825-af76-c9f3354943e2")
public static String es_PE_COLUMN_IsAnswered_Name="IsAnswered";

@XendraColumn(AD_Element_ID="c9581a59-7321-4dde-b9e6-5f86a4aefef3",ColumnName="IsAnswered",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65115897-8dbb-4825-af76-c9f3354943e2",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="89a9da9a-70b1-4b08-9484-9d56c3867d84")
public static String es_PE_COLUMN_IsAttachment_Name="IsAttachment";

@XendraColumn(AD_Element_ID="b67fe61a-8ed5-4649-bd08-62e0a7100ea3",ColumnName="IsAttachment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89a9da9a-70b1-4b08-9484-9d56c3867d84",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="7df28c5a-bd0b-4fd8-87d3-5685e6817951")
public static String es_PE_COLUMN_IsDraft_Name="IsDraft";

@XendraColumn(AD_Element_ID="0540a4f4-7f8a-4602-a81d-f3a13104495a",ColumnName="IsDraft",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7df28c5a-bd0b-4fd8-87d3-5685e6817951",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="492fb35f-203c-4edc-b795-e4ea1e64dfb9")
public static String es_PE_COLUMN_IsExpunged_Name="IsExpunged";

@XendraColumn(AD_Element_ID="df80b337-de70-4c6f-95ae-42d6fd5789d5",ColumnName="IsExpunged",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="492fb35f-203c-4edc-b795-e4ea1e64dfb9",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="e1080ee1-6a68-4f1e-b4ce-10d516fc6445")
public static String es_PE_COLUMN_IsFlagged_Name="IsFlagged";

@XendraColumn(AD_Element_ID="2b84c9db-c043-4bc2-b19d-55a7b021a19d",ColumnName="IsFlagged",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1080ee1-6a68-4f1e-b4ce-10d516fc6445",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="7855aa08-2d56-421f-b714-1426ab98dd24")
public static String es_PE_COLUMN_I_Size_Name="I_Size";

@XendraColumn(AD_Element_ID="964e72b6-9b10-4207-a6d1-a1ccf641a9a5",ColumnName="I_Size",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7855aa08-2d56-421f-b714-1426ab98dd24",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="5d0ea34d-0e9c-4e38-b3a7-009eea63d285")
public static String es_PE_COLUMN_IsRecent_Name="IsRecent";

@XendraColumn(AD_Element_ID="4adb4526-0121-4308-b10a-f59c0516b7b3",ColumnName="IsRecent",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d0ea34d-0e9c-4e38-b3a7-009eea63d285",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="e8cc9f58-765c-4389-b3d3-06bdb50a30a4")
public static String es_PE_COLUMN_IsSeen_Name="IsSeen";

@XendraColumn(AD_Element_ID="68a86f56-c020-4a76-b34f-5b75a7df5e4a",ColumnName="IsSeen",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8cc9f58-765c-4389-b3d3-06bdb50a30a4",
Synchronized="2019-08-30 22:22:26.0")
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

@XendraTrl(Identifier="2978c8b0-8f30-4e32-bad2-e9a6cd06e64d")
public static String es_PE_COLUMN_IsSpam_Name="IsSpam";

@XendraColumn(AD_Element_ID="62f9cad0-5656-4041-a9d5-6e3e7c084dda",ColumnName="IsSpam",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2978c8b0-8f30-4e32-bad2-e9a6cd06e64d",
Synchronized="2019-08-30 22:22:27.0")
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
@XendraTrl(Identifier="0537389e-45a9-4590-bec2-a93e8782f27c")
public static String es_PE_COLUMN_I_Subject_Name="I_Subject";

@XendraColumn(AD_Element_ID="ffba60d1-0218-4cd5-b5c2-99b509a34c5e",ColumnName="I_Subject",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="0537389e-45a9-4590-bec2-a93e8782f27c",
Synchronized="2019-08-30 22:22:27.0")
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
@XendraTrl(Identifier="f7477e37-9c17-4d49-9161-29d3c33ffb3a")
public static String es_PE_COLUMN_I_To_Name="I_To";

@XendraColumn(AD_Element_ID="d46aa1e5-a25d-49e6-b1fb-06f338fb5408",ColumnName="I_To",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f7477e37-9c17-4d49-9161-29d3c33ffb3a",
Synchronized="2019-08-30 22:22:27.0")
/** Column name I_To */
public static final String COLUMNNAME_I_To = "I_To";
}
