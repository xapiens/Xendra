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
/** Generated Model for C_InvoiceAdvanceLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoiceAdvanceLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoiceAdvanceLine_ID id
@param trxName transaction
*/
public X_C_InvoiceAdvanceLine (Properties ctx, int C_InvoiceAdvanceLine_ID, String trxName)
{
super (ctx, C_InvoiceAdvanceLine_ID, trxName);
/** if (C_InvoiceAdvanceLine_ID == 0)
{
setC_InvoiceAdvanceLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_InvoiceAdvanceLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000209 */
public static int Table_ID=MTable.getTable_ID("C_InvoiceAdvanceLine");

@XendraTrl(Identifier="fcf2e43a-3d97-5a49-15f2-6b39042a6a16")
public static String es_PE_TABLE_C_InvoiceAdvanceLine_Name="C_InvoiceAdvanceLine";

@XendraTable(Name="C_InvoiceAdvanceLine",Description="",Help="",TableName="C_InvoiceAdvanceLine",
AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="fcf2e43a-3d97-5a49-15f2-6b39042a6a16",
Synchronized="2017-08-16 11:41:50.0")
/** TableName=C_InvoiceAdvanceLine */
public static final String Table_Name="C_InvoiceAdvanceLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoiceAdvanceLine");

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
    Table_ID = MTable.getTable_ID("C_InvoiceAdvanceLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoiceAdvanceLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="854f3171-ede8-485f-83e1-ff921f490e4f")
public static String es_PE_COLUMN_Amount_Name="Amount";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="854f3171-ede8-485f-83e1-ff921f490e4f",
Synchronized="2017-08-05 16:53:43.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set C_InvoiceAdvance.
@param C_InvoiceAdvance_ID C_InvoiceAdvance */
public void setC_InvoiceAdvance_ID (int C_InvoiceAdvance_ID)
{
if (C_InvoiceAdvance_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_InvoiceAdvance_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_InvoiceAdvance_ID, Integer.valueOf(C_InvoiceAdvance_ID));
}
/** Get C_InvoiceAdvance.
@return C_InvoiceAdvance */
public int getC_InvoiceAdvance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceAdvance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="53bba05d-2d67-e00b-2a7c-3fa935d9a92b")
public static String es_PE_COLUMN_C_InvoiceAdvance_ID_Name="C_InvoiceAdvance";

@XendraColumn(AD_Element_ID="73d5858f-7fab-c200-0aa4-6028ec6f6e29",
ColumnName="C_InvoiceAdvance_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="53bba05d-2d67-e00b-2a7c-3fa935d9a92b",Synchronized="2017-08-05 16:53:43.0")
/** Column name C_InvoiceAdvance_ID */
public static final String COLUMNNAME_C_InvoiceAdvance_ID = "C_InvoiceAdvance_ID";
/** Set C_InvoiceAdvanceLine_ID.
@param C_InvoiceAdvanceLine_ID C_InvoiceAdvanceLine_ID */
public void setC_InvoiceAdvanceLine_ID (int C_InvoiceAdvanceLine_ID)
{
if (C_InvoiceAdvanceLine_ID < 1) throw new IllegalArgumentException ("C_InvoiceAdvanceLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceAdvanceLine_ID, Integer.valueOf(C_InvoiceAdvanceLine_ID));
}
/** Get C_InvoiceAdvanceLine_ID.
@return C_InvoiceAdvanceLine_ID */
public int getC_InvoiceAdvanceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceAdvanceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_InvoiceAdvanceLine_ID */
public static final String COLUMNNAME_C_InvoiceAdvanceLine_ID = "C_InvoiceAdvanceLine_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cb5dac56-c8b2-4afa-bd33-38ff402301fa")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb5dac56-c8b2-4afa-bd33-38ff402301fa",
Synchronized="2017-08-05 16:53:43.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_Value (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="843c12f1-2d58-ac4c-917f-a2d5528827f3")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Invoice Line";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="843c12f1-2d58-ac4c-917f-a2d5528827f3",
Synchronized="2017-08-05 16:53:43.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
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
@XendraTrl(Identifier="bc4d9f9a-3df5-4710-9a6b-7299a1dfc0c5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc4d9f9a-3df5-4710-9a6b-7299a1dfc0c5",
Synchronized="2017-08-05 16:53:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
