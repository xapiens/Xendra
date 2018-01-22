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
import org.compiere.model.reference.REF__DocumentAction;
/** Generated Model for AD_Document
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Document extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Document_ID id
@param trxName transaction
*/
public X_AD_Document (Properties ctx, int AD_Document_ID, String trxName)
{
super (ctx, AD_Document_ID, trxName);
/** if (AD_Document_ID == 0)
{
setAD_Document_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Document (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000381 */
public static int Table_ID=MTable.getTable_ID("AD_Document");

@XendraTrl(Identifier="eb19205c-7fc2-4ebd-8d63-83ba6f885d5b")
public static String es_PE_TABLE_AD_Document_Name="Document Engine";

@XendraTable(Name="Document Engine",Description="",Help="",TableName="AD_Document",AccessLevel="4",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="eb19205c-7fc2-4ebd-8d63-83ba6f885d5b",Synchronized="2017-08-16 11:40:09.0")
/** TableName=AD_Document */
public static final String Table_Name="AD_Document";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Document");

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
    Table_ID = MTable.getTable_ID("AD_Document");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Document[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Document Engine.
@param AD_Document_ID Document Engine */
public void setAD_Document_ID (int AD_Document_ID)
{
if (AD_Document_ID < 1) throw new IllegalArgumentException ("AD_Document_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Document_ID, Integer.valueOf(AD_Document_ID));
}
/** Get Document Engine.
@return Document Engine */
public int getAD_Document_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Document_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Document_ID */
public static final String COLUMNNAME_AD_Document_ID = "AD_Document_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e0b0b7b5-0b5b-4aa2-9a4e-24b83c8d004c")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0b0b7b5-0b5b-4aa2-9a4e-24b83c8d004c",
Synchronized="2017-08-05 16:52:29.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

/** DocStatus AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCSTATUS_AD_Reference_ID=135;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null || DocStatus.equals(REF__DocumentAction.Complete) || DocStatus.equals(REF__DocumentAction.Approve) || DocStatus.equals(REF__DocumentAction.Reject) || DocStatus.equals(REF__DocumentAction.Post) || DocStatus.equals(REF__DocumentAction.WaitComplete) || DocStatus.equals(REF__DocumentAction.Prepare) || DocStatus.equals(REF__DocumentAction.Close) || DocStatus.equals(REF__DocumentAction.Placed) || DocStatus.equals(REF__DocumentAction.Discount) || DocStatus.equals(REF__DocumentAction.Portofolio) || DocStatus.equals(REF__DocumentAction.Warranty) || DocStatus.equals(REF__DocumentAction.Reverse_Correct) || DocStatus.equals(REF__DocumentAction.Reverse_Accrual) || DocStatus.equals(REF__DocumentAction.Invalidate) || DocStatus.equals(REF__DocumentAction.Re_Activate) || DocStatus.equals(REF__DocumentAction.None) || DocStatus.equals(REF__DocumentAction.Unlock) || DocStatus.equals(REF__DocumentAction.Returned) || DocStatus.equals(REF__DocumentAction.Apply) || DocStatus.equals(REF__DocumentAction.Collect) || DocStatus.equals(REF__DocumentAction.ToCollect) || DocStatus.equals(REF__DocumentAction.Restore) || DocStatus.equals(REF__DocumentAction.Protested) || DocStatus.equals(REF__DocumentAction.Receivables) || DocStatus.equals(REF__DocumentAction.Void) || DocStatus.equals(REF__DocumentAction.Draft) || DocStatus.equals(REF__DocumentAction.InProgress) || DocStatus.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocStatus != null && DocStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
DocStatus = DocStatus.substring(0,1);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
return (String)get_Value(COLUMNNAME_DocStatus);
}

@XendraTrl(Identifier="004fd29b-18f1-4c85-861b-9f25945b672c")
public static String es_PE_COLUMN_DocStatus_Name="Document Status";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="004fd29b-18f1-4c85-861b-9f25945b672c",Synchronized="2017-08-05 16:52:29.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 37)
{
log.warning("Length > 37 - truncated");
Identifier = Identifier.substring(0,36);
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
@XendraTrl(Identifier="a3a1cea0-ee94-4fd0-aebc-fd194e44e958")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=37,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3a1cea0-ee94-4fd0-aebc-fd194e44e958",
Synchronized="2017-08-05 16:52:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";

/** NextStatus AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int NEXTSTATUS_AD_Reference_ID=135;
/** Set NextStatus.
@param NextStatus NextStatus */
public void setNextStatus (String NextStatus)
{
if (NextStatus == null || NextStatus.equals(REF__DocumentAction.Complete) || NextStatus.equals(REF__DocumentAction.Approve) || NextStatus.equals(REF__DocumentAction.Reject) || NextStatus.equals(REF__DocumentAction.Post) || NextStatus.equals(REF__DocumentAction.WaitComplete) || NextStatus.equals(REF__DocumentAction.Prepare) || NextStatus.equals(REF__DocumentAction.Close) || NextStatus.equals(REF__DocumentAction.Placed) || NextStatus.equals(REF__DocumentAction.Discount) || NextStatus.equals(REF__DocumentAction.Portofolio) || NextStatus.equals(REF__DocumentAction.Warranty) || NextStatus.equals(REF__DocumentAction.Reverse_Correct) || NextStatus.equals(REF__DocumentAction.Reverse_Accrual) || NextStatus.equals(REF__DocumentAction.Invalidate) || NextStatus.equals(REF__DocumentAction.Re_Activate) || NextStatus.equals(REF__DocumentAction.None) || NextStatus.equals(REF__DocumentAction.Unlock) || NextStatus.equals(REF__DocumentAction.Returned) || NextStatus.equals(REF__DocumentAction.Apply) || NextStatus.equals(REF__DocumentAction.Collect) || NextStatus.equals(REF__DocumentAction.ToCollect) || NextStatus.equals(REF__DocumentAction.Restore) || NextStatus.equals(REF__DocumentAction.Protested) || NextStatus.equals(REF__DocumentAction.Receivables) || NextStatus.equals(REF__DocumentAction.Void) || NextStatus.equals(REF__DocumentAction.Draft) || NextStatus.equals(REF__DocumentAction.InProgress) || NextStatus.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("NextStatus Invalid value - " + NextStatus + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (NextStatus != null && NextStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
NextStatus = NextStatus.substring(0,1);
}
set_Value (COLUMNNAME_NextStatus, NextStatus);
}
/** Get NextStatus.
@return NextStatus */
public String getNextStatus() 
{
return (String)get_Value(COLUMNNAME_NextStatus);
}

@XendraTrl(Identifier="d490e4a0-0ec0-4e95-94dc-29c2fe871cbb")
public static String es_PE_COLUMN_NextStatus_Name="nextstatus";

@XendraColumn(AD_Element_ID="8f2c712c-b5c1-41ce-b0b3-6207efbe29f3",ColumnName="NextStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d490e4a0-0ec0-4e95-94dc-29c2fe871cbb",Synchronized="2017-08-05 16:52:29.0")
/** Column name NextStatus */
public static final String COLUMNNAME_NextStatus = "NextStatus";
}
