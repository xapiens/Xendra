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
/** Generated Model for C_BOE_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BOE_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_BOE_Acct_ID id
@param trxName transaction
*/
public X_C_BOE_Acct (Properties ctx, int C_BOE_Acct_ID, String trxName)
{
super (ctx, C_BOE_Acct_ID, trxName);
/** if (C_BOE_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BOE_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000112 */
public static int Table_ID=MTable.getTable_ID("C_BOE_Acct");

@XendraTrl(Identifier="a9c72ebf-cfc2-21e5-5209-39f77fe4c77b")
public static String es_PE_TABLE_C_BOE_Acct_Name="Bill Of Exchange Accounting";

@XendraTable(Name="Bill Of Exchange Accounting",
AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Bill Of Exchange Accounting",
Help="",TableName="C_BOE_Acct",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="a9c72ebf-cfc2-21e5-5209-39f77fe4c77b",Synchronized="2020-03-03 21:36:29.0")
/** TableName=C_BOE_Acct */
public static final String Table_Name="C_BOE_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BOE_Acct");

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
    Table_ID = MTable.getTable_ID("C_BOE_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BOE_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set BOE_Confirm_Acct.
@param BOE_Confirm_Acct BOE_Confirm_Acct */
public void setBOE_Confirm_Acct (int BOE_Confirm_Acct)
{
set_Value (COLUMNNAME_BOE_Confirm_Acct, Integer.valueOf(BOE_Confirm_Acct));
}
/** Get BOE_Confirm_Acct.
@return BOE_Confirm_Acct */
public int getBOE_Confirm_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Confirm_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad44064a-b61b-b611-71c5-4d76a6af0d3c")
public static String es_PE_COLUMN_BOE_Confirm_Acct_Name="BOE_Confirm_Acct";

@XendraColumn(AD_Element_ID="198a83eb-d96e-43ac-e04f-dacbb2ebb44a",ColumnName="BOE_Confirm_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad44064a-b61b-b611-71c5-4d76a6af0d3c",
Synchronized="2019-08-30 22:21:06.0")
/** Column name BOE_Confirm_Acct */
public static final String COLUMNNAME_BOE_Confirm_Acct = "BOE_Confirm_Acct";
/** Set BOE_Discount_Acct.
@param BOE_Discount_Acct BOE_Discount_Acct */
public void setBOE_Discount_Acct (int BOE_Discount_Acct)
{
set_Value (COLUMNNAME_BOE_Discount_Acct, Integer.valueOf(BOE_Discount_Acct));
}
/** Get BOE_Discount_Acct.
@return BOE_Discount_Acct */
public int getBOE_Discount_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Discount_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9ae40062-a2f2-fac8-cfc2-e3ff4598dfd1")
public static String es_PE_COLUMN_BOE_Discount_Acct_Name="Boe_Discount_Acct";

@XendraColumn(AD_Element_ID="3503a407-d579-dfde-64cb-2a8c12037352",ColumnName="BOE_Discount_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ae40062-a2f2-fac8-cfc2-e3ff4598dfd1",
Synchronized="2019-08-30 22:21:06.0")
/** Column name BOE_Discount_Acct */
public static final String COLUMNNAME_BOE_Discount_Acct = "BOE_Discount_Acct";
/** Set BOE_Portfolio_Acct.
@param BOE_Portfolio_Acct BOE_Portfolio_Acct */
public void setBOE_Portfolio_Acct (int BOE_Portfolio_Acct)
{
set_Value (COLUMNNAME_BOE_Portfolio_Acct, Integer.valueOf(BOE_Portfolio_Acct));
}
/** Get BOE_Portfolio_Acct.
@return BOE_Portfolio_Acct */
public int getBOE_Portfolio_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Portfolio_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5ac97cff-433b-e18d-76c6-7bfeb124cc28")
public static String es_PE_COLUMN_BOE_Portfolio_Acct_Name="Boe_Portfolio_Acct";

@XendraColumn(AD_Element_ID="faa5725b-53e5-cf39-01be-787e85b9d575",ColumnName="BOE_Portfolio_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ac97cff-433b-e18d-76c6-7bfeb124cc28",
Synchronized="2019-08-30 22:21:06.0")
/** Column name BOE_Portfolio_Acct */
public static final String COLUMNNAME_BOE_Portfolio_Acct = "BOE_Portfolio_Acct";
/** Set BOE_Protested_Acct.
@param BOE_Protested_Acct BOE_Protested_Acct */
public void setBOE_Protested_Acct (int BOE_Protested_Acct)
{
set_Value (COLUMNNAME_BOE_Protested_Acct, Integer.valueOf(BOE_Protested_Acct));
}
/** Get BOE_Protested_Acct.
@return BOE_Protested_Acct */
public int getBOE_Protested_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Protested_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="86c445f6-fcfc-8690-778e-b761915399c4")
public static String es_PE_COLUMN_BOE_Protested_Acct_Name="Boe_Protested_Acct";

@XendraColumn(AD_Element_ID="f9e6f145-286a-8ede-1d92-e2d95d73f2cd",ColumnName="BOE_Protested_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86c445f6-fcfc-8690-778e-b761915399c4",
Synchronized="2019-08-30 22:21:06.0")
/** Column name BOE_Protested_Acct */
public static final String COLUMNNAME_BOE_Protested_Acct = "BOE_Protested_Acct";
/** Set BOE_Receivables_Acct.
@param BOE_Receivables_Acct BOE_Receivables_Acct */
public void setBOE_Receivables_Acct (int BOE_Receivables_Acct)
{
set_Value (COLUMNNAME_BOE_Receivables_Acct, Integer.valueOf(BOE_Receivables_Acct));
}
/** Get BOE_Receivables_Acct.
@return BOE_Receivables_Acct */
public int getBOE_Receivables_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Receivables_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4ca9645b-ac26-2f67-7dde-acd4eec06463")
public static String es_PE_COLUMN_BOE_Receivables_Acct_Name="Boe_Receivables_Acct";

@XendraColumn(AD_Element_ID="708648d2-902e-94e8-377f-457403cac9a3",
ColumnName="BOE_Receivables_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4ca9645b-ac26-2f67-7dde-acd4eec06463",Synchronized="2019-08-30 22:21:06.0")
/** Column name BOE_Receivables_Acct */
public static final String COLUMNNAME_BOE_Receivables_Acct = "BOE_Receivables_Acct";
/** Set BOE_Vendor_Acct.
@param BOE_Vendor_Acct BOE_Vendor_Acct */
public void setBOE_Vendor_Acct (int BOE_Vendor_Acct)
{
set_Value (COLUMNNAME_BOE_Vendor_Acct, Integer.valueOf(BOE_Vendor_Acct));
}
/** Get BOE_Vendor_Acct.
@return BOE_Vendor_Acct */
public int getBOE_Vendor_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Vendor_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="07a315be-b21c-f204-8c54-5e97ebe2be52")
public static String es_PE_COLUMN_BOE_Vendor_Acct_Name="boe_vendor_acct";

@XendraColumn(AD_Element_ID="d5ca5a84-d87e-c994-d2be-7a0f04e03922",ColumnName="BOE_Vendor_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07a315be-b21c-f204-8c54-5e97ebe2be52",
Synchronized="2019-08-30 22:21:06.0")
/** Column name BOE_Vendor_Acct */
public static final String COLUMNNAME_BOE_Vendor_Acct = "BOE_Vendor_Acct";
/** Set BOE_Warranty_Acct.
@param BOE_Warranty_Acct BOE_Warranty_Acct */
public void setBOE_Warranty_Acct (int BOE_Warranty_Acct)
{
set_Value (COLUMNNAME_BOE_Warranty_Acct, Integer.valueOf(BOE_Warranty_Acct));
}
/** Get BOE_Warranty_Acct.
@return BOE_Warranty_Acct */
public int getBOE_Warranty_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BOE_Warranty_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="df9b8894-1eda-ab1f-87df-0ba92d3c540a")
public static String es_PE_COLUMN_BOE_Warranty_Acct_Name="Boe_Warranty_Acct";

@XendraColumn(AD_Element_ID="731dad94-baf8-75f2-d4cc-8e21723ded92",ColumnName="BOE_Warranty_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="df9b8894-1eda-ab1f-87df-0ba92d3c540a",
Synchronized="2019-08-30 22:21:06.0")
/** Column name BOE_Warranty_Acct */
public static final String COLUMNNAME_BOE_Warranty_Acct = "BOE_Warranty_Acct";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
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

@XendraTrl(Identifier="87e0963b-cc61-b284-5cbc-8340090b1fda")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87e0963b-cc61-b284-5cbc-8340090b1fda",
Synchronized="2019-08-30 22:21:06.0")
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
@XendraTrl(Identifier="4672fc22-8260-4ab2-abcc-fe83f9d06d7e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4672fc22-8260-4ab2-abcc-fe83f9d06d7e",
Synchronized="2019-08-30 22:21:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
