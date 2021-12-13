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
/** Generated Model for A_Xendrian_Replication
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Xendrian_Replication extends PO
{
/** Standard Constructor
@param ctx context
@param A_Xendrian_Replication_ID id
@param trxName transaction
*/
public X_A_Xendrian_Replication (Properties ctx, int A_Xendrian_Replication_ID, String trxName)
{
super (ctx, A_Xendrian_Replication_ID, trxName);
/** if (A_Xendrian_Replication_ID == 0)
{
setA_Xendrian_Replication_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Xendrian_Replication (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000325 */
public static int Table_ID=MTable.getTable_ID("A_Xendrian_Replication");

@XendraTrl(Identifier="312026bc-ffeb-4778-a283-f4b4f7176b74")
public static String es_PE_TABLE_A_Xendrian_Replication_Name="Xendrian Replication";

@XendraTable(Name="Xendrian Replication",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="A_Xendrian_Replication",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="312026bc-ffeb-4778-a283-f4b4f7176b74",Synchronized="2020-03-03 21:36:16.0")
/** TableName=A_Xendrian_Replication */
public static final String Table_Name="A_Xendrian_Replication";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Xendrian_Replication");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("A_Xendrian_Replication");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Xendrian_Replication[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Xendrian Replication.
@param A_Xendrian_Replication_ID Xendrian Replication */
public void setA_Xendrian_Replication_ID (int A_Xendrian_Replication_ID)
{
if (A_Xendrian_Replication_ID < 1) throw new IllegalArgumentException ("A_Xendrian_Replication_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Xendrian_Replication_ID, Integer.valueOf(A_Xendrian_Replication_ID));
}
/** Get Xendrian Replication.
@return Xendrian Replication */
public int getA_Xendrian_Replication_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Xendrian_Replication_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name A_Xendrian_Replication_ID */
public static final String COLUMNNAME_A_Xendrian_Replication_ID = "A_Xendrian_Replication_ID";
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
@XendraTrl(Identifier="eebe28e4-a6b8-46f6-a8f4-5dd09394b889")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eebe28e4-a6b8-46f6-a8f4-5dd09394b889",
Synchronized="2019-08-30 22:20:56.0")
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
@XendraTrl(Identifier="b3713a5a-95b1-4d9d-8af8-145624f17048")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3713a5a-95b1-4d9d-8af8-145624f17048",
Synchronized="2019-08-30 22:20:57.0")
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
@XendraTrl(Identifier="99312412-64df-41b9-8302-6257693e5ca5")
public static String es_PE_COLUMN_Message_Name="Message";

@XendraColumn(AD_Element_ID="2bb1f4e6-4970-9212-47bb-51c6eb788a65",ColumnName="Message",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99312412-64df-41b9-8302-6257693e5ca5",
Synchronized="2019-08-30 22:20:57.0")
/** Column name Message */
public static final String COLUMNNAME_Message = "Message";
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

@XendraTrl(Identifier="1b843bd3-f16b-4012-964a-e0922e57d778")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b843bd3-f16b-4012-964a-e0922e57d778",
Synchronized="2019-08-30 22:20:57.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Replication Type.
@param ReplicationType Type of Data Replication */
public void setReplicationType (String ReplicationType)
{
if (ReplicationType != null && ReplicationType.length() > 1)
{
log.warning("Length > 1 - truncated");
ReplicationType = ReplicationType.substring(0,0);
}
set_Value (COLUMNNAME_ReplicationType, ReplicationType);
}
/** Get Replication Type.
@return Type of Data Replication */
public String getReplicationType() 
{
return (String)get_Value(COLUMNNAME_ReplicationType);
}

@XendraTrl(Identifier="19ca07fb-018a-452a-9672-8fc70bfd058b")
public static String es_PE_COLUMN_ReplicationType_Name="Replication Type";

@XendraColumn(AD_Element_ID="fab2f42c-8051-1227-bbbd-e69e4837f172",ColumnName="ReplicationType",
AD_Reference_ID=17,AD_Reference_Value_ID="b21a4af6-31d2-3c66-8ee7-fca98e903ccb",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="19ca07fb-018a-452a-9672-8fc70bfd058b",Synchronized="2019-08-30 22:20:57.0")
/** Column name ReplicationType */
public static final String COLUMNNAME_ReplicationType = "ReplicationType";
}
