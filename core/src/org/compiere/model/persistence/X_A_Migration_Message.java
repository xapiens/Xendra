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
/** Generated Model for A_Migration_Message
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Migration_Message extends PO
{
/** Standard Constructor
@param ctx context
@param A_Migration_Message_ID id
@param trxName transaction
*/
public X_A_Migration_Message (Properties ctx, int A_Migration_Message_ID, String trxName)
{
super (ctx, A_Migration_Message_ID, trxName);
/** if (A_Migration_Message_ID == 0)
{
setA_Migration_Message_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Migration_Message (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000323 */
public static int Table_ID=MTable.getTable_ID("A_Migration_Message");

@XendraTrl(Identifier="b265669e-87ea-40ab-aa47-bf27fd290134")
public static String es_PE_TABLE_A_Migration_Message_Name="Migration Message";

@XendraTable(Name="Migration Message",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="A_Migration_Message",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="b265669e-87ea-40ab-aa47-bf27fd290134",Synchronized="2020-03-03 21:36:15.0")
/** TableName=A_Migration_Message */
public static final String Table_Name="A_Migration_Message";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Migration_Message");

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
    Table_ID = MTable.getTable_ID("A_Migration_Message");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Migration_Message[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="cddee466-cd9b-40e5-b808-d5f6de28ab03")
public static String es_PE_COLUMN_AD_Process_ID_Name="Process";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cddee466-cd9b-40e5-b808-d5f6de28ab03",
Synchronized="2019-08-30 22:20:55.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Migration Message.
@param A_Migration_Message_ID Migration Message */
public void setA_Migration_Message_ID (int A_Migration_Message_ID)
{
if (A_Migration_Message_ID < 1) throw new IllegalArgumentException ("A_Migration_Message_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Migration_Message_ID, Integer.valueOf(A_Migration_Message_ID));
}
/** Get Migration Message.
@return Migration Message */
public int getA_Migration_Message_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Migration_Message_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name A_Migration_Message_ID */
public static final String COLUMNNAME_A_Migration_Message_ID = "A_Migration_Message_ID";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
if (ErrorMsg != null && ErrorMsg.length() > 100)
{
log.warning("Length > 100 - truncated");
ErrorMsg = ErrorMsg.substring(0,99);
}
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="170af119-749f-4a35-90ea-ab6e6a128f0e")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="170af119-749f-4a35-90ea-ab6e6a128f0e",
Synchronized="2019-08-30 22:20:55.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
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
@XendraTrl(Identifier="d6fb1dda-5b8c-4d5c-861c-e0f10116a7f7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6fb1dda-5b8c-4d5c-861c-e0f10116a7f7",
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
@XendraTrl(Identifier="e183dfb3-b0fc-4453-9718-ea0113e1ccee")
public static String es_PE_COLUMN_Message_Name="Message";

@XendraColumn(AD_Element_ID="2bb1f4e6-4970-9212-47bb-51c6eb788a65",ColumnName="Message",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e183dfb3-b0fc-4453-9718-ea0113e1ccee",
Synchronized="2019-08-30 22:20:55.0")
/** Column name Message */
public static final String COLUMNNAME_Message = "Message";
/** Set MigrateMessage.
@param MigrateMessage MigrateMessage */
public void setMigrateMessage (String MigrateMessage)
{
set_Value (COLUMNNAME_MigrateMessage, MigrateMessage);
}
/** Get MigrateMessage.
@return MigrateMessage */
public String getMigrateMessage() 
{
String value = (String)get_Value(COLUMNNAME_MigrateMessage);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7fbc4dc4-ea34-4361-bebd-3b7749ba50f4")
public static String es_PE_COLUMN_MigrateMessage_Name="migratemessage";

@XendraColumn(AD_Element_ID="6dc8ad96-90c1-45de-b007-b71d6ab5e590",ColumnName="MigrateMessage",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fbc4dc4-ea34-4361-bebd-3b7749ba50f4",
Synchronized="2019-08-30 22:20:55.0")
/** Column name MigrateMessage */
public static final String COLUMNNAME_MigrateMessage = "MigrateMessage";
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

@XendraTrl(Identifier="7755e324-c405-455d-a180-861bc408fc13")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7755e324-c405-455d-a180-861bc408fc13",
Synchronized="2019-08-30 22:20:55.0")
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

@XendraTrl(Identifier="f2e44330-b056-4430-bff0-d0627bc775a3")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2e44330-b056-4430-bff0-d0627bc775a3",
Synchronized="2019-08-30 22:20:55.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
