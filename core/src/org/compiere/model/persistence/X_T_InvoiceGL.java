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
/** Generated Model for T_InvoiceGL
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_InvoiceGL extends PO
{
/** Standard Constructor
@param ctx context
@param T_InvoiceGL_ID id
@param trxName transaction
*/
public X_T_InvoiceGL (Properties ctx, int T_InvoiceGL_ID, String trxName)
{
super (ctx, T_InvoiceGL_ID, trxName);
/** if (T_InvoiceGL_ID == 0)
{
setAD_PInstance_ID (0);
setAmtAcctBalance (Env.ZERO);	
// 0
setAmtRevalCr (Env.ZERO);	
// 0
setAmtRevalCrDiff (Env.ZERO);	
// 0
setAmtRevalDr (Env.ZERO);	
// 0
setAmtRevalDrDiff (Env.ZERO);	
// 0
setAmtSourceBalance (Env.ZERO);	
// 0
setC_ConversionTypeReval_ID (0);
setC_Invoice_ID (0);
setDateReval (new Timestamp(System.currentTimeMillis()));
setFact_Acct_ID (0);
setGrandTotal (Env.ZERO);	
// 0
setIsAllCurrencies (false);	
// N
setOpenAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_InvoiceGL (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=803 */
public static int Table_ID=MTable.getTable_ID("T_InvoiceGL");

@XendraTrl(Identifier="8b7b8f85-2758-752f-897e-5ce5979f2388")
public static String es_PE_TABLE_T_InvoiceGL_Name="T_Invoicegl";

@XendraTable(Name="T_InvoiceGL",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Gain/Loss - actual data shown id T_InvoiceGL_v",Help="",TableName="T_InvoiceGL",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.standard",Identifier="8b7b8f85-2758-752f-897e-5ce5979f2388",
Synchronized="2020-03-03 21:40:25.0")
/** TableName=T_InvoiceGL */
public static final String Table_Name="T_InvoiceGL";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_InvoiceGL");

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
    Table_ID = MTable.getTable_ID("T_InvoiceGL");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_InvoiceGL[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_Value (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="60bc7680-882d-2329-fbf2-71f97ccaf73f")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60bc7680-882d-2329-fbf2-71f97ccaf73f",
Synchronized="2019-08-30 22:24:24.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Accounted Balance.
@param AmtAcctBalance Accounted Balance Amount */
public void setAmtAcctBalance (BigDecimal AmtAcctBalance)
{
if (AmtAcctBalance == null) throw new IllegalArgumentException ("AmtAcctBalance is mandatory.");
set_Value (COLUMNNAME_AmtAcctBalance, AmtAcctBalance);
}
/** Get Accounted Balance.
@return Accounted Balance Amount */
public BigDecimal getAmtAcctBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7d1581f4-5511-f7e5-4ebb-6dedfd006f0e")
public static String es_PE_COLUMN_AmtAcctBalance_Name="Balance Contable";

@XendraColumn(AD_Element_ID="37a156c9-083d-471f-c206-06304dffb44b",ColumnName="AmtAcctBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d1581f4-5511-f7e5-4ebb-6dedfd006f0e",
Synchronized="2019-08-30 22:24:24.0")
/** Column name AmtAcctBalance */
public static final String COLUMNNAME_AmtAcctBalance = "AmtAcctBalance";
/** Set Revaluated Amount Cr.
@param AmtRevalCr Revaluated Cr Amount */
public void setAmtRevalCr (BigDecimal AmtRevalCr)
{
if (AmtRevalCr == null) throw new IllegalArgumentException ("AmtRevalCr is mandatory.");
set_Value (COLUMNNAME_AmtRevalCr, AmtRevalCr);
}
/** Get Revaluated Amount Cr.
@return Revaluated Cr Amount */
public BigDecimal getAmtRevalCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="241098d2-d4f8-140b-bfa6-bd807aa18467")
public static String es_PE_COLUMN_AmtRevalCr_Name="Importe de CXC Revaluado";

@XendraColumn(AD_Element_ID="cbde817c-44df-f0f5-6e8f-851786191d2a",ColumnName="AmtRevalCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="241098d2-d4f8-140b-bfa6-bd807aa18467",
Synchronized="2019-08-30 22:24:24.0")
/** Column name AmtRevalCr */
public static final String COLUMNNAME_AmtRevalCr = "AmtRevalCr";
/** Set Revaluated Difference Cr.
@param AmtRevalCrDiff Revaluated Cr Amount Difference */
public void setAmtRevalCrDiff (BigDecimal AmtRevalCrDiff)
{
if (AmtRevalCrDiff == null) throw new IllegalArgumentException ("AmtRevalCrDiff is mandatory.");
set_Value (COLUMNNAME_AmtRevalCrDiff, AmtRevalCrDiff);
}
/** Get Revaluated Difference Cr.
@return Revaluated Cr Amount Difference */
public BigDecimal getAmtRevalCrDiff() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalCrDiff);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2252a933-db3f-724f-e525-b1edabe6f838")
public static String es_PE_COLUMN_AmtRevalCrDiff_Name="Diferencia de CXC Revaluado";

@XendraColumn(AD_Element_ID="3fdaaf89-40f2-6879-9473-4ac32915eaeb",ColumnName="AmtRevalCrDiff",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2252a933-db3f-724f-e525-b1edabe6f838",
Synchronized="2019-08-30 22:24:24.0")
/** Column name AmtRevalCrDiff */
public static final String COLUMNNAME_AmtRevalCrDiff = "AmtRevalCrDiff";
/** Set Revaluated Amount Dr.
@param AmtRevalDr Revaluated Dr Amount */
public void setAmtRevalDr (BigDecimal AmtRevalDr)
{
if (AmtRevalDr == null) throw new IllegalArgumentException ("AmtRevalDr is mandatory.");
set_Value (COLUMNNAME_AmtRevalDr, AmtRevalDr);
}
/** Get Revaluated Amount Dr.
@return Revaluated Dr Amount */
public BigDecimal getAmtRevalDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6cde9e5c-5b2c-d86b-6713-6b7757a1c18e")
public static String es_PE_COLUMN_AmtRevalDr_Name="Importe de CXP Revaluado";

@XendraColumn(AD_Element_ID="5c004382-c809-e061-8936-716213937bcd",ColumnName="AmtRevalDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cde9e5c-5b2c-d86b-6713-6b7757a1c18e",
Synchronized="2019-08-30 22:24:24.0")
/** Column name AmtRevalDr */
public static final String COLUMNNAME_AmtRevalDr = "AmtRevalDr";
/** Set Revaluated Difference Dr.
@param AmtRevalDrDiff Revaluated Dr Amount Difference */
public void setAmtRevalDrDiff (BigDecimal AmtRevalDrDiff)
{
if (AmtRevalDrDiff == null) throw new IllegalArgumentException ("AmtRevalDrDiff is mandatory.");
set_Value (COLUMNNAME_AmtRevalDrDiff, AmtRevalDrDiff);
}
/** Get Revaluated Difference Dr.
@return Revaluated Dr Amount Difference */
public BigDecimal getAmtRevalDrDiff() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtRevalDrDiff);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ff6dc4ba-b250-43e0-b7f3-9a3b0bb4ae0f")
public static String es_PE_COLUMN_AmtRevalDrDiff_Name="Diferencia de CXP Revaluado";

@XendraColumn(AD_Element_ID="123c0f4c-fc8c-bd4b-20c2-7469f4dea729",ColumnName="AmtRevalDrDiff",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff6dc4ba-b250-43e0-b7f3-9a3b0bb4ae0f",
Synchronized="2019-08-30 22:24:24.0")
/** Column name AmtRevalDrDiff */
public static final String COLUMNNAME_AmtRevalDrDiff = "AmtRevalDrDiff";
/** Set Source Balance.
@param AmtSourceBalance Source Balance Amount */
public void setAmtSourceBalance (BigDecimal AmtSourceBalance)
{
if (AmtSourceBalance == null) throw new IllegalArgumentException ("AmtSourceBalance is mandatory.");
set_Value (COLUMNNAME_AmtSourceBalance, AmtSourceBalance);
}
/** Get Source Balance.
@return Source Balance Amount */
public BigDecimal getAmtSourceBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7fa1e876-3d4a-632e-d641-cab839d1082a")
public static String es_PE_COLUMN_AmtSourceBalance_Name="Monto Fuente del Balance";

@XendraColumn(AD_Element_ID="7eefe83d-05f1-c92d-30cf-e7ecd0e6f5e0",ColumnName="AmtSourceBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fa1e876-3d4a-632e-d641-cab839d1082a",
Synchronized="2019-08-30 22:24:24.0")
/** Column name AmtSourceBalance */
public static final String COLUMNNAME_AmtSourceBalance = "AmtSourceBalance";
/** Set AP - AR.
@param APAR Include Receivables and/or Payables transactions */
public void setAPAR (String APAR)
{
if (APAR != null && APAR.length() > 1)
{
log.warning("Length > 1 - truncated");
APAR = APAR.substring(0,0);
}
set_Value (COLUMNNAME_APAR, APAR);
}
/** Get AP - AR.
@return Include Receivables and/or Payables transactions */
public String getAPAR() 
{
return (String)get_Value(COLUMNNAME_APAR);
}

@XendraTrl(Identifier="fa32019a-23d4-e671-2dbb-de70b0ae1b99")
public static String es_PE_COLUMN_APAR_Name="CP - CC";

@XendraColumn(AD_Element_ID="8eb4c1f0-0d7d-766b-777b-afa3aa6b74ef",ColumnName="APAR",
AD_Reference_ID=17,AD_Reference_Value_ID="f7f54ef7-c97e-a561-fa1c-241fadd391d4",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fa32019a-23d4-e671-2dbb-de70b0ae1b99",Synchronized="2019-08-30 22:24:24.0")
/** Column name APAR */
public static final String COLUMNNAME_APAR = "APAR";
/** Set Revaluation Conversion Type.
@param C_ConversionTypeReval_ID Revaluation Currency Conversion Type */
public void setC_ConversionTypeReval_ID (int C_ConversionTypeReval_ID)
{
if (C_ConversionTypeReval_ID < 1) throw new IllegalArgumentException ("C_ConversionTypeReval_ID is mandatory.");
set_Value (COLUMNNAME_C_ConversionTypeReval_ID, Integer.valueOf(C_ConversionTypeReval_ID));
}
/** Get Revaluation Conversion Type.
@return Revaluation Currency Conversion Type */
public int getC_ConversionTypeReval_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionTypeReval_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1869ec1f-d000-c0e5-798f-88b219ddb8da")
public static String es_PE_COLUMN_C_ConversionTypeReval_ID_Name="Tipo de Conversión de Revaluación";

@XendraColumn(AD_Element_ID="7e9d71c9-6e00-10e1-dfed-d7296154356a",
ColumnName="C_ConversionTypeReval_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="41dda287-7ecf-a6d1-d177-b35716a62768",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="1869ec1f-d000-c0e5-798f-88b219ddb8da",
Synchronized="2019-08-30 22:24:24.0")
/** Column name C_ConversionTypeReval_ID */
public static final String COLUMNNAME_C_ConversionTypeReval_ID = "C_ConversionTypeReval_ID";
/** Set Revaluation Document Type.
@param C_DocTypeReval_ID Document Type for Revaluation Journal */
public void setC_DocTypeReval_ID (int C_DocTypeReval_ID)
{
if (C_DocTypeReval_ID <= 0) set_Value (COLUMNNAME_C_DocTypeReval_ID, null);
 else 
set_Value (COLUMNNAME_C_DocTypeReval_ID, Integer.valueOf(C_DocTypeReval_ID));
}
/** Get Revaluation Document Type.
@return Document Type for Revaluation Journal */
public int getC_DocTypeReval_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeReval_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5621b8d7-0f61-bbee-5c4f-9b0680f1c891")
public static String es_PE_COLUMN_C_DocTypeReval_ID_Name="Revaloración Tipo del Documento";

@XendraColumn(AD_Element_ID="3ecc8896-3763-01dc-2721-99f7f4768ea5",ColumnName="C_DocTypeReval_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5621b8d7-0f61-bbee-5c4f-9b0680f1c891",Synchronized="2019-08-30 22:24:24.0")
/** Column name C_DocTypeReval_ID */
public static final String COLUMNNAME_C_DocTypeReval_ID = "C_DocTypeReval_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
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

@XendraTrl(Identifier="57d9711c-6b45-7927-53ba-727a4b1353e7")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57d9711c-6b45-7927-53ba-727a4b1353e7",
Synchronized="2019-08-30 22:24:24.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Revaluation Date.
@param DateReval Date of Revaluation */
public void setDateReval (Timestamp DateReval)
{
if (DateReval == null) throw new IllegalArgumentException ("DateReval is mandatory.");
set_Value (COLUMNNAME_DateReval, DateReval);
}
/** Get Revaluation Date.
@return Date of Revaluation */
public Timestamp getDateReval() 
{
return (Timestamp)get_Value(COLUMNNAME_DateReval);
}

@XendraTrl(Identifier="0304313d-82bf-38fc-0279-ddc4227361b9")
public static String es_PE_COLUMN_DateReval_Name="Fecha de Revaluación";

@XendraColumn(AD_Element_ID="85941f8b-52f4-3ebb-455b-e36bb69b0d47",ColumnName="DateReval",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0304313d-82bf-38fc-0279-ddc4227361b9",
Synchronized="2019-08-30 22:24:24.0")
/** Column name DateReval */
public static final String COLUMNNAME_DateReval = "DateReval";
/** Set Accounting Fact.
@param Fact_Acct_ID Accounting Fact */
public void setFact_Acct_ID (int Fact_Acct_ID)
{
if (Fact_Acct_ID < 1) throw new IllegalArgumentException ("Fact_Acct_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Fact_Acct_ID, Integer.valueOf(Fact_Acct_ID));
}
/** Get Accounting Fact.
@return Accounting Fact */
public int getFact_Acct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Fact_Acct_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Fact_Acct_ID */
public static final String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
if (GrandTotal == null) throw new IllegalArgumentException ("GrandTotal is mandatory.");
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

@XendraTrl(Identifier="3ea58402-c46f-c536-a9ae-507239a36d83")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ea58402-c46f-c536-a9ae-507239a36d83",
Synchronized="2019-08-30 22:24:24.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
/** Set Include All Currencies.
@param IsAllCurrencies Report not just foreign currency Invoices */
public void setIsAllCurrencies (boolean IsAllCurrencies)
{
set_Value (COLUMNNAME_IsAllCurrencies, Boolean.valueOf(IsAllCurrencies));
}
/** Get Include All Currencies.
@return Report not just foreign currency Invoices */
public boolean isAllCurrencies() 
{
Object oo = get_Value(COLUMNNAME_IsAllCurrencies);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3df83162-199c-7619-a97c-e39c26f903c8")
public static String es_PE_COLUMN_IsAllCurrencies_Name="Incluir Todas las Monédas";

@XendraColumn(AD_Element_ID="032ac3b1-b41a-b558-93e0-602474e94be5",ColumnName="IsAllCurrencies",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3df83162-199c-7619-a97c-e39c26f903c8",
Synchronized="2019-08-30 22:24:24.0")
/** Column name IsAllCurrencies */
public static final String COLUMNNAME_IsAllCurrencies = "IsAllCurrencies";
/** Set Open Amount.
@param OpenAmt Open item amount */
public void setOpenAmt (BigDecimal OpenAmt)
{
if (OpenAmt == null) throw new IllegalArgumentException ("OpenAmt is mandatory.");
set_Value (COLUMNNAME_OpenAmt, OpenAmt);
}
/** Get Open Amount.
@return Open item amount */
public BigDecimal getOpenAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OpenAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="df0e4047-4e16-13b5-af84-14b1262d3133")
public static String es_PE_COLUMN_OpenAmt_Name="Total Abierto";

@XendraColumn(AD_Element_ID="89a287e4-b72d-e4d4-2a42-90bcfde3d1ae",ColumnName="OpenAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="df0e4047-4e16-13b5-af84-14b1262d3133",
Synchronized="2019-08-30 22:24:24.0")
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";
/** Set Percent.
@param Percent Percentage */
public void setPercent (BigDecimal Percent)
{
set_Value (COLUMNNAME_Percent, Percent);
}
/** Get Percent.
@return Percentage */
public BigDecimal getPercent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5c2df5d1-2149-bb9b-81eb-01cde5a7a9ea")
public static String es_PE_COLUMN_Percent_Name="Porcentaje";

@XendraColumn(AD_Element_ID="a70b0c31-700a-d879-f313-b31531c93f04",ColumnName="Percent",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c2df5d1-2149-bb9b-81eb-01cde5a7a9ea",
Synchronized="2019-08-30 22:24:24.0")
/** Column name Percent */
public static final String COLUMNNAME_Percent = "Percent";
}
