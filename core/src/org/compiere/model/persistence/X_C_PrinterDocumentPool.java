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
/** Generated Model for C_PrinterDocumentPool
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PrinterDocumentPool extends PO
{
/** Standard Constructor
@param ctx context
@param C_PrinterDocumentPool_ID id
@param trxName transaction
*/
public X_C_PrinterDocumentPool (Properties ctx, int C_PrinterDocumentPool_ID, String trxName)
{
super (ctx, C_PrinterDocumentPool_ID, trxName);
/** if (C_PrinterDocumentPool_ID == 0)
{
setC_PrinterDocumentPool_ID (0);
setEnvironment (null);
setQueueName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PrinterDocumentPool (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000301 */
public static int Table_ID=MTable.getTable_ID("C_PrinterDocumentPool");

@XendraTrl(Identifier="bfba69f9-652a-4397-957f-df0ac2a70cd6")
public static String es_PE_TABLE_C_PrinterDocumentPool_Name="C_PrinterDocumentPool";

@XendraTable(Name="C_PrinterDocumentPool",Description="",Help="",TableName="C_PrinterDocumentPool",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="bfba69f9-652a-4397-957f-df0ac2a70cd6",
Synchronized="2017-08-16 11:42:17.0")
/** TableName=C_PrinterDocumentPool */
public static final String Table_Name="C_PrinterDocumentPool";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PrinterDocumentPool");

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
    Table_ID = MTable.getTable_ID("C_PrinterDocumentPool");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PrinterDocumentPool[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_PrinterDocumentFormat_ID.
@param C_PrinterDocumentFormat_ID C_PrinterDocumentFormat_ID */
public void setC_PrinterDocumentFormat_ID (int C_PrinterDocumentFormat_ID)
{
if (C_PrinterDocumentFormat_ID <= 0) set_Value (COLUMNNAME_C_PrinterDocumentFormat_ID, null);
 else 
set_Value (COLUMNNAME_C_PrinterDocumentFormat_ID, Integer.valueOf(C_PrinterDocumentFormat_ID));
}
/** Get C_PrinterDocumentFormat_ID.
@return C_PrinterDocumentFormat_ID */
public int getC_PrinterDocumentFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PrinterDocumentFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="66b4b875-11e8-4754-9f61-43c55faba359")
public static String es_PE_COLUMN_C_PrinterDocumentFormat_ID_Name="C_PrinterDocumentFormat_ID";

@XendraColumn(AD_Element_ID="443bb6f7-8eb3-4556-98cf-f2ccd4d59324",
ColumnName="C_PrinterDocumentFormat_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66b4b875-11e8-4754-9f61-43c55faba359",Synchronized="2017-08-05 16:54:13.0")
/** Column name C_PrinterDocumentFormat_ID */
public static final String COLUMNNAME_C_PrinterDocumentFormat_ID = "C_PrinterDocumentFormat_ID";
/** Set C_PrinterDocumentPool_ID.
@param C_PrinterDocumentPool_ID C_PrinterDocumentPool_ID */
public void setC_PrinterDocumentPool_ID (int C_PrinterDocumentPool_ID)
{
if (C_PrinterDocumentPool_ID < 1) throw new IllegalArgumentException ("C_PrinterDocumentPool_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PrinterDocumentPool_ID, Integer.valueOf(C_PrinterDocumentPool_ID));
}
/** Get C_PrinterDocumentPool_ID.
@return C_PrinterDocumentPool_ID */
public int getC_PrinterDocumentPool_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PrinterDocumentPool_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_PrinterDocumentPool_ID */
public static final String COLUMNNAME_C_PrinterDocumentPool_ID = "C_PrinterDocumentPool_ID";
/** Set Environment.
@param Environment Environment */
public void setEnvironment (String Environment)
{
if (Environment == null) throw new IllegalArgumentException ("Environment is mandatory.");
set_Value (COLUMNNAME_Environment, Environment);
}
/** Get Environment.
@return Environment */
public String getEnvironment() 
{
String value = (String)get_Value(COLUMNNAME_Environment);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="37ab837b-cee0-4d12-a4c1-6183f8b5af40")
public static String es_PE_COLUMN_Environment_Name="Environment";

@XendraColumn(AD_Element_ID="0c9ce29b-350c-44db-95a8-71de4d80d501",ColumnName="Environment",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=65535,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37ab837b-cee0-4d12-a4c1-6183f8b5af40",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Environment */
public static final String COLUMNNAME_Environment = "Environment";
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
@XendraTrl(Identifier="c88e1c16-95b7-4a07-9112-7f3ff4717fe3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c88e1c16-95b7-4a07-9112-7f3ff4717fe3",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set QueueName.
@param QueueName QueueName */
public void setQueueName (String QueueName)
{
if (QueueName == null) throw new IllegalArgumentException ("QueueName is mandatory.");
if (QueueName.length() > 20)
{
log.warning("Length > 20 - truncated");
QueueName = QueueName.substring(0,19);
}
set_Value (COLUMNNAME_QueueName, QueueName);
}
/** Get QueueName.
@return QueueName */
public String getQueueName() 
{
String value = (String)get_Value(COLUMNNAME_QueueName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a81b7de2-704a-4283-b4e1-0a3bb686294a")
public static String es_PE_COLUMN_QueueName_Name="QueueName";

@XendraColumn(AD_Element_ID="8a1919b0-ec3e-4e5c-a763-aa074f903244",ColumnName="QueueName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a81b7de2-704a-4283-b4e1-0a3bb686294a",
Synchronized="2017-08-05 16:54:13.0")
/** Column name QueueName */
public static final String COLUMNNAME_QueueName = "QueueName";
}
