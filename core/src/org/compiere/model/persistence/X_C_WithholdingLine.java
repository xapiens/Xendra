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
/** Generated Model for C_WithholdingLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_WithholdingLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_WithholdingLine_ID id
@param trxName transaction
*/
public X_C_WithholdingLine (Properties ctx, int C_WithholdingLine_ID, String trxName)
{
super (ctx, C_WithholdingLine_ID, trxName);
/** if (C_WithholdingLine_ID == 0)
{
setC_WithholdingLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_WithholdingLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000279 */
public static int Table_ID=MTable.getTable_ID("C_WithholdingLine");

@XendraTrl(Identifier="f7b50a39-f7a5-4db8-b090-e132e6730427")
public static String es_PE_TABLE_C_WithholdingLine_Name="Withholding Line";

@XendraTable(Name="Withholding Line",Description="",Help="",TableName="C_WithholdingLine",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="f7b50a39-f7a5-4db8-b090-e132e6730427",
Synchronized="2017-08-16 11:42:34.0")
/** TableName=C_WithholdingLine */
public static final String Table_Name="C_WithholdingLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_WithholdingLine");

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
    Table_ID = MTable.getTable_ID("C_WithholdingLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_WithholdingLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="78097697-ca64-42b1-8a75-f6c3bf540985")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78097697-ca64-42b1-8a75-f6c3bf540985",
Synchronized="2017-08-05 16:54:31.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID <= 0) set_Value (COLUMNNAME_C_BOE_ID, null);
 else 
set_Value (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac93c2c2-f57f-46e4-8e9c-44a856e4c136")
public static String es_PE_COLUMN_C_BOE_ID_Name="Bill Of Exchange";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac93c2c2-f57f-46e4-8e9c-44a856e4c136",
Synchronized="2017-08-05 16:54:31.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
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

@XendraTrl(Identifier="2bb4b739-4c9c-4713-a7e7-9240f9256e03")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2bb4b739-4c9c-4713-a7e7-9240f9256e03",
Synchronized="2017-08-05 16:54:31.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Withholding Header.
@param C_WithholdingHdr_ID Withholding Header */
public void setC_WithholdingHdr_ID (int C_WithholdingHdr_ID)
{
if (C_WithholdingHdr_ID <= 0) set_Value (COLUMNNAME_C_WithholdingHdr_ID, null);
 else 
set_Value (COLUMNNAME_C_WithholdingHdr_ID, Integer.valueOf(C_WithholdingHdr_ID));
}
/** Get Withholding Header.
@return Withholding Header */
public int getC_WithholdingHdr_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_WithholdingHdr_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0abdb28e-a1a5-442f-8c36-7c16f65cd807")
public static String es_PE_COLUMN_C_WithholdingHdr_ID_Name="Withholding Header";

@XendraColumn(AD_Element_ID="488a7bc4-04a7-4c5f-95e2-190323fac34c",
ColumnName="C_WithholdingHdr_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0abdb28e-a1a5-442f-8c36-7c16f65cd807",Synchronized="2017-08-05 16:54:31.0")
/** Column name C_WithholdingHdr_ID */
public static final String COLUMNNAME_C_WithholdingHdr_ID = "C_WithholdingHdr_ID";
/** Set Withholding.
@param C_Withholding_ID Withholding type defined */
public void setC_Withholding_ID (int C_Withholding_ID)
{
if (C_Withholding_ID <= 0) set_Value (COLUMNNAME_C_Withholding_ID, null);
 else 
set_Value (COLUMNNAME_C_Withholding_ID, Integer.valueOf(C_Withholding_ID));
}
/** Get Withholding.
@return Withholding type defined */
public int getC_Withholding_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Withholding_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5280057e-384c-4624-bf5a-a2c37b660495")
public static String es_PE_COLUMN_C_Withholding_ID_Name="Withholding";

@XendraColumn(AD_Element_ID="518d5ae2-65ee-2bb8-8c37-13beaceecf15",ColumnName="C_Withholding_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5280057e-384c-4624-bf5a-a2c37b660495",
Synchronized="2017-08-05 16:54:31.0")
/** Column name C_Withholding_ID */
public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
/** Set Withholding Line.
@param C_WithholdingLine_ID Withholding Line */
public void setC_WithholdingLine_ID (int C_WithholdingLine_ID)
{
if (C_WithholdingLine_ID < 1) throw new IllegalArgumentException ("C_WithholdingLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_WithholdingLine_ID, Integer.valueOf(C_WithholdingLine_ID));
}
/** Get Withholding Line.
@return Withholding Line */
public int getC_WithholdingLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_WithholdingLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_WithholdingLine_ID */
public static final String COLUMNNAME_C_WithholdingLine_ID = "C_WithholdingLine_ID";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
set_Value (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a90ea19a-1a2e-401e-95b9-5739cf89fb7e")
public static String es_PE_COLUMN_GrandTotal_Name="Grand Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a90ea19a-1a2e-401e-95b9-5739cf89fb7e",
Synchronized="2017-08-05 16:54:31.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
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
@XendraTrl(Identifier="c51c953f-a89f-4844-820f-8144d8a30231")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c51c953f-a89f-4844-820f-8144d8a30231",
Synchronized="2017-08-05 16:54:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="bf2367ce-e3d9-4d40-8a12-851e91bfb077")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf2367ce-e3d9-4d40-8a12-851e91bfb077",
Synchronized="2017-08-05 16:54:31.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f14f1bfb-74b8-4fac-82d1-562d20b92f21")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f14f1bfb-74b8-4fac-82d1-562d20b92f21",
Synchronized="2017-08-05 16:54:31.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Tax base Amount.
@param TaxBaseAmt Base for calculating the tax amount */
public void setTaxBaseAmt (BigDecimal TaxBaseAmt)
{
set_Value (COLUMNNAME_TaxBaseAmt, TaxBaseAmt);
}
/** Get Tax base Amount.
@return Base for calculating the tax amount */
public BigDecimal getTaxBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d7b88709-c77d-4526-b28a-aa4183e2d48e")
public static String es_PE_COLUMN_TaxBaseAmt_Name="Tax base Amount";

@XendraColumn(AD_Element_ID="11beb746-5f42-cac6-2ece-2c64fb573db9",ColumnName="TaxBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7b88709-c77d-4526-b28a-aa4183e2d48e",
Synchronized="2017-08-05 16:54:31.0")
/** Column name TaxBaseAmt */
public static final String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";
/** Set WithholdingAmt.
@param WithholdingAmt WithholdingAmt */
public void setWithholdingAmt (BigDecimal WithholdingAmt)
{
set_Value (COLUMNNAME_WithholdingAmt, WithholdingAmt);
}
/** Get WithholdingAmt.
@return WithholdingAmt */
public BigDecimal getWithholdingAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithholdingAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a0d13f14-1aa6-4f15-9846-93b99608625c")
public static String es_PE_COLUMN_WithholdingAmt_Name="WithholdingAmt";

@XendraColumn(AD_Element_ID="750228fc-a0da-46c7-b584-2e34797d13d0",ColumnName="WithholdingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0d13f14-1aa6-4f15-9846-93b99608625c",
Synchronized="2017-08-05 16:54:31.0")
/** Column name WithholdingAmt */
public static final String COLUMNNAME_WithholdingAmt = "WithholdingAmt";
}
