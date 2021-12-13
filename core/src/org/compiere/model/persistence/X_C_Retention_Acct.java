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
/** Generated Model for C_Retention_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Retention_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_Retention_Acct_ID id
@param trxName transaction
*/
public X_C_Retention_Acct (Properties ctx, int C_Retention_Acct_ID, String trxName)
{
super (ctx, C_Retention_Acct_ID, trxName);
/** if (C_Retention_Acct_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Retention_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000131 */
public static int Table_ID=MTable.getTable_ID("C_Retention_Acct");

@XendraTrl(Identifier="9075cd39-81d7-24e0-76dc-c2709207fbf4")
public static String es_PE_TABLE_C_Retention_Acct_Name="Retention Acct";

@XendraTable(Name="Retention Acct",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_Retention_Acct",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=65,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="9075cd39-81d7-24e0-76dc-c2709207fbf4",
Synchronized="2020-03-03 21:37:36.0")
/** TableName=C_Retention_Acct */
public static final String Table_Name="C_Retention_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Retention_Acct");

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
    Table_ID = MTable.getTable_ID("C_Retention_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Retention_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID <= 0) set_Value (COLUMNNAME_C_AcctSchema_ID, null);
 else 
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b1dcf9af-f5d0-5ce7-5a85-ed719862862c")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Accounting Schema";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1dcf9af-f5d0-5ce7-5a85-ed719862862c",
Synchronized="2019-08-30 22:22:13.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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
@XendraTrl(Identifier="0a0259bf-2bb7-47f5-8643-d6fd219d16b3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a0259bf-2bb7-47f5-8643-d6fd219d16b3",
Synchronized="2019-08-30 22:22:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Retention_Apply_Acct.
@param Retention_Apply_Acct Retention_Apply_Acct */
public void setRetention_Apply_Acct (int Retention_Apply_Acct)
{
set_Value (COLUMNNAME_Retention_Apply_Acct, Integer.valueOf(Retention_Apply_Acct));
}
/** Get Retention_Apply_Acct.
@return Retention_Apply_Acct */
public int getRetention_Apply_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Retention_Apply_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bb616d10-f58d-ec46-8782-67656a1c2905")
public static String es_PE_COLUMN_Retention_Apply_Acct_Name="Retention_Apply_Acct";

@XendraColumn(AD_Element_ID="19ef3935-22b9-5bec-6f82-921baf250424",
ColumnName="Retention_Apply_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bb616d10-f58d-ec46-8782-67656a1c2905",Synchronized="2019-08-30 22:22:13.0")
/** Column name Retention_Apply_Acct */
public static final String COLUMNNAME_Retention_Apply_Acct = "Retention_Apply_Acct";
/** Set Retention_Collect_Acct.
@param Retention_Collect_Acct Retention_Collect_Acct */
public void setRetention_Collect_Acct (int Retention_Collect_Acct)
{
set_Value (COLUMNNAME_Retention_Collect_Acct, Integer.valueOf(Retention_Collect_Acct));
}
/** Get Retention_Collect_Acct.
@return Retention_Collect_Acct */
public int getRetention_Collect_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Retention_Collect_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="32aaa410-cf91-e347-fdda-69066c62050c")
public static String es_PE_COLUMN_Retention_Collect_Acct_Name="retention_collect_acct";

@XendraColumn(AD_Element_ID="f020fe33-b24b-76ba-0b78-f8cad9560505",
ColumnName="Retention_Collect_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="32aaa410-cf91-e347-fdda-69066c62050c",Synchronized="2019-08-30 22:22:13.0")
/** Column name Retention_Collect_Acct */
public static final String COLUMNNAME_Retention_Collect_Acct = "Retention_Collect_Acct";
/** Set Retention_ToCollect_Acct.
@param Retention_ToCollect_Acct Retention_ToCollect_Acct */
public void setRetention_ToCollect_Acct (int Retention_ToCollect_Acct)
{
set_Value (COLUMNNAME_Retention_ToCollect_Acct, Integer.valueOf(Retention_ToCollect_Acct));
}
/** Get Retention_ToCollect_Acct.
@return Retention_ToCollect_Acct */
public int getRetention_ToCollect_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Retention_ToCollect_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eb48d045-f615-e7a0-bac1-0291033be63a")
public static String es_PE_COLUMN_Retention_ToCollect_Acct_Name="retention_tocollect_acct";

@XendraColumn(AD_Element_ID="4b6a6e7f-1853-b77c-3773-906e86f8683d",
ColumnName="Retention_ToCollect_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="eb48d045-f615-e7a0-bac1-0291033be63a",Synchronized="2019-08-30 22:22:13.0")
/** Column name Retention_ToCollect_Acct */
public static final String COLUMNNAME_Retention_ToCollect_Acct = "Retention_ToCollect_Acct";
}
