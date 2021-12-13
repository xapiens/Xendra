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
/** Generated Model for A_MessageLogging
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_MessageLogging extends PO
{
/** Standard Constructor
@param ctx context
@param A_MessageLogging_ID id
@param trxName transaction
*/
public X_A_MessageLogging (Properties ctx, int A_MessageLogging_ID, String trxName)
{
super (ctx, A_MessageLogging_ID, trxName);
/** if (A_MessageLogging_ID == 0)
{
setA_MessageLogging_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_MessageLogging (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000304 */
public static int Table_ID=MTable.getTable_ID("A_MessageLogging");

@XendraTrl(Identifier="3137ea2d-3a6e-47d4-a73a-1ac1a9fb705e")
public static String es_PE_TABLE_A_MessageLogging_Name="Message Logging";

@XendraTable(Name="Message Logging",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="A_MessageLogging",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="3137ea2d-3a6e-47d4-a73a-1ac1a9fb705e",
Synchronized="2020-03-03 21:36:14.0")
/** TableName=A_MessageLogging */
public static final String Table_Name="A_MessageLogging";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_MessageLogging");

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
    Table_ID = MTable.getTable_ID("A_MessageLogging");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_MessageLogging[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Message Logging.
@param A_MessageLogging_ID Message Logging */
public void setA_MessageLogging_ID (int A_MessageLogging_ID)
{
if (A_MessageLogging_ID < 1) throw new IllegalArgumentException ("A_MessageLogging_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_MessageLogging_ID, Integer.valueOf(A_MessageLogging_ID));
}
/** Get Message Logging.
@return Message Logging */
public int getA_MessageLogging_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_MessageLogging_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name A_MessageLogging_ID */
public static final String COLUMNNAME_A_MessageLogging_ID = "A_MessageLogging_ID";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 32)
{
log.warning("Length > 32 - truncated");
Identifier = Identifier.substring(0,31);
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
@XendraTrl(Identifier="73242761-7e7a-4765-8244-f549b9b323a5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=32,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73242761-7e7a-4765-8244-f549b9b323a5",
Synchronized="2019-08-30 22:20:55.0")
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
@XendraTrl(Identifier="3f775d9d-ad9c-4eab-b028-9d5db6a6dba0")
public static String es_PE_COLUMN_Message_Name="Message";

@XendraColumn(AD_Element_ID="2bb1f4e6-4970-9212-47bb-51c6eb788a65",ColumnName="Message",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f775d9d-ad9c-4eab-b028-9d5db6a6dba0",
Synchronized="2019-08-30 22:20:55.0")
/** Column name Message */
public static final String COLUMNNAME_Message = "Message";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type != null && Type.length() > 10)
{
log.warning("Length > 10 - truncated");
Type = Type.substring(0,9);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
String value = (String)get_Value(COLUMNNAME_Type);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="06d15413-90c7-42ca-913b-761b74ca4031")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06d15413-90c7-42ca-913b-761b74ca4031",
Synchronized="2019-08-30 22:20:55.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
