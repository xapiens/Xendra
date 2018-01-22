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
/** Generated Model for E_Message
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_Message extends PO
{
/** Standard Constructor
@param ctx context
@param E_Message_ID id
@param trxName transaction
*/
public X_E_Message (Properties ctx, int E_Message_ID, String trxName)
{
super (ctx, E_Message_ID, trxName);
/** if (E_Message_ID == 0)
{
setE_Message_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_Message (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000305 */
public static int Table_ID=MTable.getTable_ID("E_Message");

@XendraTrl(Identifier="c6b27b43-8e74-450d-b9b8-3f41fd05c657")
public static String es_PE_TABLE_E_Message_Name="Messages ";

@XendraTable(Name="Messages ",Description="",Help="",TableName="E_Message",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.communication",
Identifier="c6b27b43-8e74-450d-b9b8-3f41fd05c657",Synchronized="2017-08-16 11:42:36.0")
/** TableName=E_Message */
public static final String Table_Name="E_Message";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_Message");

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
    Table_ID = MTable.getTable_ID("E_Message");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_Message[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="f589e405-10da-4551-9c19-550ed17c5b8e")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f589e405-10da-4551-9c19-550ed17c5b8e",
Synchronized="2014-03-03 10:17:01.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="c308db41-d73f-42fe-9955-bc4ff5ad9216")
public static String es_PE_COLUMN_E_Folder_ID_Name="E_Folder_ID";

@XendraColumn(AD_Element_ID="c635db32-2123-4d21-b86e-41418be636ff",ColumnName="E_Folder_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c308db41-d73f-42fe-9955-bc4ff5ad9216",
Synchronized="2017-08-05 16:54:34.0")
/** Column name E_Folder_ID */
public static final String COLUMNNAME_E_Folder_ID = "E_Folder_ID";
/** Set E_Header_ID.
@param E_Header_ID E_Header_ID */
public void setE_Header_ID (int E_Header_ID)
{
if (E_Header_ID <= 0) set_Value (COLUMNNAME_E_Header_ID, null);
 else 
set_Value (COLUMNNAME_E_Header_ID, Integer.valueOf(E_Header_ID));
}
/** Get E_Header_ID.
@return E_Header_ID */
public int getE_Header_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Header_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8b9b6c8-ced0-48c0-bbe8-0a9ded7fd1b6")
public static String es_PE_COLUMN_E_Header_ID_Name="E_Header_ID";

@XendraColumn(AD_Element_ID="cbd2fd18-bcd3-4f72-abf6-8acda7994d50",ColumnName="E_Header_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8b9b6c8-ced0-48c0-bbe8-0a9ded7fd1b6",
Synchronized="2014-03-01 19:04:56.0")
/** Column name E_Header_ID */
public static final String COLUMNNAME_E_Header_ID = "E_Header_ID";
/** Set Messages .
@param E_Message_ID Messages  */
public void setE_Message_ID (int E_Message_ID)
{
if (E_Message_ID < 1) throw new IllegalArgumentException ("E_Message_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_Message_ID, Integer.valueOf(E_Message_ID));
}
/** Get Messages .
@return Messages  */
public int getE_Message_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Message_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_Message_ID */
public static final String COLUMNNAME_E_Message_ID = "E_Message_ID";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
if (ID != null && ID.length() > 20)
{
log.warning("Length > 20 - truncated");
ID = ID.substring(0,19);
}
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
@XendraTrl(Identifier="c29a09e6-ca60-4aff-85c1-3944b0bca528")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c29a09e6-ca60-4aff-85c1-3944b0bca528",
Synchronized="2017-08-05 16:54:34.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
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
@XendraTrl(Identifier="7921a9e7-cbb3-4013-8fac-205895ce197b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7921a9e7-cbb3-4013-8fac-205895ce197b",
Synchronized="2014-03-01 17:31:42.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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
@XendraTrl(Identifier="4d48f707-847c-4f45-83dc-28926c0c9c13")
public static String es_PE_COLUMN_Message_Name="Message";

@XendraColumn(AD_Element_ID="2bb1f4e6-4970-9212-47bb-51c6eb788a65",ColumnName="Message",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="4d48f707-847c-4f45-83dc-28926c0c9c13",
Synchronized="2014-03-01 17:31:42.0")
/** Column name Message */
public static final String COLUMNNAME_Message = "Message";
}
