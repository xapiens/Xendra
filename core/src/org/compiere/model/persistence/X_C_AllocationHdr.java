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
import org.compiere.model.reference.REF__DocumentStatus;
/** Generated Model for C_AllocationHdr
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_AllocationHdr extends PO
{
/** Standard Constructor
@param ctx context
@param C_AllocationHdr_ID id
@param trxName transaction
*/
public X_C_AllocationHdr (Properties ctx, int C_AllocationHdr_ID, String trxName)
{
super (ctx, C_AllocationHdr_ID, trxName);
/** if (C_AllocationHdr_ID == 0)
{
setApprovalAmt (Env.ZERO);	
// 0
setC_AllocationHdr_ID (0);
setC_Currency_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setDateTrx (new Timestamp(System.currentTimeMillis()));
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsApproved (false);	
// N
setIsExchange (false);	
// N
setIsManual (false);	
// N
setPosted (false);
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_AllocationHdr (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=735 */
public static int Table_ID=MTable.getTable_ID("C_AllocationHdr");

@XendraTrl(Identifier="188fac8e-5839-9bec-38d7-9ed132ba9e81")
public static String es_PE_TAB_Allocation_Description="Visión y Asignación Reversa";

@XendraTrl(Identifier="188fac8e-5839-9bec-38d7-9ed132ba9e81")
public static String es_PE_TAB_Allocation_Name="Asignación";

@XendraTrl(Identifier="188fac8e-5839-9bec-38d7-9ed132ba9e81")
public static String es_PE_TAB_Allocation_Help="La tabla reversa de la asignación define la asignación del pago que se invertirá.";

@XendraTab(Name="Allocation",Description="View and Reverse Allocation",
Help="The Reverse Allocation Tab defines the Payment Allocation to be reversed.",
AD_Window_ID="0c6f825a-c39d-a995-137a-cbcea65e7fe1",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="188fac8e-5839-9bec-38d7-9ed132ba9e81",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Allocation="188fac8e-5839-9bec-38d7-9ed132ba9e81";

@XendraTrl(Identifier="cd8fb645-af6d-0007-902c-83119a322c11")
public static String es_PE_TABLE_C_AllocationHdr_Name="Asignación";

@XendraTable(Name="Allocation",Description="Payment allocation",Help="",
TableName="C_AllocationHdr",AccessLevel="1",AD_Window_ID="0c6f825a-c39d-a995-137a-cbcea65e7fe1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="cd8fb645-af6d-0007-902c-83119a322c11",Synchronized="2017-08-16 11:41:21.0")
/** TableName=C_AllocationHdr */
public static final String Table_Name="C_AllocationHdr";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_AllocationHdr");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_AllocationHdr");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_AllocationHdr[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Approval Amount.
@param ApprovalAmt Document Approval Amount */
public void setApprovalAmt (BigDecimal ApprovalAmt)
{
if (ApprovalAmt == null) throw new IllegalArgumentException ("ApprovalAmt is mandatory.");
set_Value (COLUMNNAME_ApprovalAmt, ApprovalAmt);
}
/** Get Approval Amount.
@return Document Approval Amount */
public BigDecimal getApprovalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ApprovalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c1039f4c-0cc2-b5e7-6afd-f603e0976e35")
public static String es_PE_FIELD_Allocation_ApprovalAmount_Description="Documento de importe aprobado";

@XendraTrl(Identifier="c1039f4c-0cc2-b5e7-6afd-f603e0976e35")
public static String es_PE_FIELD_Allocation_ApprovalAmount_Help="Cantidad de la aprobación para el Flujo de trabajo";

@XendraTrl(Identifier="c1039f4c-0cc2-b5e7-6afd-f603e0976e35")
public static String es_PE_FIELD_Allocation_ApprovalAmount_Name="Importe Aprobado";

@XendraField(AD_Column_ID="ApprovalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1039f4c-0cc2-b5e7-6afd-f603e0976e35")
public static final String FIELDNAME_Allocation_ApprovalAmount="c1039f4c-0cc2-b5e7-6afd-f603e0976e35";

@XendraTrl(Identifier="91fdfdde-6d1b-fb39-1f4e-a6d4357fab7e")
public static String es_PE_COLUMN_ApprovalAmt_Name="Importe Aprobado";

@XendraColumn(AD_Element_ID="fd13a366-3264-4b86-b3f3-66490833103d",ColumnName="ApprovalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91fdfdde-6d1b-fb39-1f4e-a6d4357fab7e",
Synchronized="2017-08-05 16:53:11.0")
/** Column name ApprovalAmt */
public static final String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
/** Set Allocation.
@param C_AllocationHdr_ID Payment allocation */
public void setC_AllocationHdr_ID (int C_AllocationHdr_ID)
{
if (C_AllocationHdr_ID < 1) throw new IllegalArgumentException ("C_AllocationHdr_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AllocationHdr_ID, Integer.valueOf(C_AllocationHdr_ID));
}
/** Get Allocation.
@return Payment allocation */
public int getC_AllocationHdr_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AllocationHdr_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8d772a86-eb67-11e7-e912-67c65a159783")
public static String es_PE_FIELD_Allocation_Allocation_Description="Asignación de pagos";

@XendraTrl(Identifier="8d772a86-eb67-11e7-e912-67c65a159783")
public static String es_PE_FIELD_Allocation_Allocation_Name="Asignación";

@XendraField(AD_Column_ID="C_AllocationHdr_ID",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d772a86-eb67-11e7-e912-67c65a159783")
public static final String FIELDNAME_Allocation_Allocation="8d772a86-eb67-11e7-e912-67c65a159783";
/** Column name C_AllocationHdr_ID */
public static final String COLUMNNAME_C_AllocationHdr_ID = "C_AllocationHdr_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="054e9bac-382c-25a0-f5e3-96fc58becb31")
public static String es_PE_FIELD_Allocation_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="054e9bac-382c-25a0-f5e3-96fc58becb31")
public static String es_PE_FIELD_Allocation_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="054e9bac-382c-25a0-f5e3-96fc58becb31")
public static String es_PE_FIELD_Allocation_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="054e9bac-382c-25a0-f5e3-96fc58becb31")
public static final String FIELDNAME_Allocation_Currency="054e9bac-382c-25a0-f5e3-96fc58becb31";

@XendraTrl(Identifier="98b2fddb-211e-5d92-c023-3e9157cbf862")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98b2fddb-211e-5d92-c023-3e9157cbf862",
Synchronized="2017-08-05 16:53:11.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set C_GroupDoc_ID.
@param C_GroupDoc_ID C_GroupDoc_ID */
public void setC_GroupDoc_ID (int C_GroupDoc_ID)
{
if (C_GroupDoc_ID <= 0) set_Value (COLUMNNAME_C_GroupDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_GroupDoc_ID, Integer.valueOf(C_GroupDoc_ID));
}
/** Get C_GroupDoc_ID.
@return C_GroupDoc_ID */
public int getC_GroupDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_GroupDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d50aa000-b5f7-8937-57c1-2bdbd28f285d")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="C_GroupDoc_ID";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d50aa000-b5f7-8937-57c1-2bdbd28f285d",
Synchronized="2017-08-05 16:53:11.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="799deb45-429b-ceab-a1c4-55e87347f284")
public static String es_PE_FIELD_Allocation_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="799deb45-429b-ceab-a1c4-55e87347f284")
public static String es_PE_FIELD_Allocation_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="799deb45-429b-ceab-a1c4-55e87347f284")
public static String es_PE_FIELD_Allocation_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="799deb45-429b-ceab-a1c4-55e87347f284")
public static final String FIELDNAME_Allocation_AccountDate="799deb45-429b-ceab-a1c4-55e87347f284";

@XendraTrl(Identifier="715ed30e-718b-7f85-b099-7f18d8eb99ef")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="715ed30e-718b-7f85-b099-7f18d8eb99ef",
Synchronized="2017-08-05 16:53:11.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
if (DateTrx == null) throw new IllegalArgumentException ("DateTrx is mandatory.");
set_Value (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="0f5096fa-02e6-d7c9-5c12-6eb1d98626a7")
public static String es_PE_FIELD_Allocation_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="0f5096fa-02e6-d7c9-5c12-6eb1d98626a7")
public static String es_PE_FIELD_Allocation_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="0f5096fa-02e6-d7c9-5c12-6eb1d98626a7")
public static String es_PE_FIELD_Allocation_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f5096fa-02e6-d7c9-5c12-6eb1d98626a7")
public static final String FIELDNAME_Allocation_TransactionDate="0f5096fa-02e6-d7c9-5c12-6eb1d98626a7";

@XendraTrl(Identifier="a64a0d38-c670-7ec9-aa00-4619c569e648")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a64a0d38-c670-7ec9-aa00-4619c569e648",
Synchronized="2017-08-05 16:53:11.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="4c36f9b4-af7d-508b-cc4f-3c6d80d5f763")
public static String es_PE_FIELD_Allocation_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="4c36f9b4-af7d-508b-cc4f-3c6d80d5f763")
public static String es_PE_FIELD_Allocation_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="4c36f9b4-af7d-508b-cc4f-3c6d80d5f763")
public static String es_PE_FIELD_Allocation_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c36f9b4-af7d-508b-cc4f-3c6d80d5f763")
public static final String FIELDNAME_Allocation_Description="4c36f9b4-af7d-508b-cc4f-3c6d80d5f763";

@XendraTrl(Identifier="7c76311a-ae13-153f-a5f1-44bd2d39df16")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="7c76311a-ae13-153f-a5f1-44bd2d39df16",
Synchronized="2017-08-05 16:53:11.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null) throw new IllegalArgumentException ("DocAction is mandatory");
if (DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="4130a7cd-846e-e946-0f6e-7539baa2e2e0")
public static String es_PE_FIELD_Allocation_ProcessAllocation_Description="Esta acción revierte la asignación y permite asignar la factura y pagar de nuevo";

@XendraTrl(Identifier="4130a7cd-846e-e946-0f6e-7539baa2e2e0")
public static String es_PE_FIELD_Allocation_ProcessAllocation_Name="Revertir Asignación";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4130a7cd-846e-e946-0f6e-7539baa2e2e0")
public static final String FIELDNAME_Allocation_ProcessAllocation="4130a7cd-846e-e946-0f6e-7539baa2e2e0";

@XendraTrl(Identifier="41908f1d-389a-d4ce-f025-601e414cc2f4")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="0c5990a0-1394-e141-1a02-88522502c7c9",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="41908f1d-389a-d4ce-f025-601e414cc2f4",
Synchronized="2017-08-05 16:53:11.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null) throw new IllegalArgumentException ("DocStatus is mandatory");
if (DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (DocStatus.length() > 2)
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

@XendraTrl(Identifier="ca021051-5043-6dcd-14f1-799ae116d965")
public static String es_PE_FIELD_Allocation_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="ca021051-5043-6dcd-14f1-799ae116d965")
public static String es_PE_FIELD_Allocation_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="ca021051-5043-6dcd-14f1-799ae116d965")
public static String es_PE_FIELD_Allocation_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca021051-5043-6dcd-14f1-799ae116d965")
public static final String FIELDNAME_Allocation_DocumentStatus="ca021051-5043-6dcd-14f1-799ae116d965";

@XendraTrl(Identifier="9be8a7c3-6686-1453-9753-06a7235c1f3a")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9be8a7c3-6686-1453-9753-06a7235c1f3a",Synchronized="2017-08-05 16:53:11.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="73391796-9b23-0500-aad4-68574581964d")
public static String es_PE_FIELD_Allocation_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="73391796-9b23-0500-aad4-68574581964d")
public static String es_PE_FIELD_Allocation_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="73391796-9b23-0500-aad4-68574581964d")
public static String es_PE_FIELD_Allocation_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73391796-9b23-0500-aad4-68574581964d")
public static final String FIELDNAME_Allocation_DocumentNo="73391796-9b23-0500-aad4-68574581964d";

@XendraTrl(Identifier="de8804fa-958c-50f0-834f-5381b23267fa")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de8804fa-958c-50f0-834f-5381b23267fa",
Synchronized="2017-08-05 16:53:12.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_Value (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="32f4ab6b-9660-9a3d-2c12-6f20d79cb7b5")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32f4ab6b-9660-9a3d-2c12-6f20d79cb7b5",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
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
@XendraTrl(Identifier="a109ca8b-83b7-4ed1-ad5c-79d8dcf422f0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a109ca8b-83b7-4ed1-ad5c-79d8dcf422f0",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9ee5aee4-1406-21c7-44ec-e179960a33f0")
public static String es_PE_FIELD_Allocation_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="9ee5aee4-1406-21c7-44ec-e179960a33f0")
public static String es_PE_FIELD_Allocation_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="9ee5aee4-1406-21c7-44ec-e179960a33f0")
public static String es_PE_FIELD_Allocation_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ee5aee4-1406-21c7-44ec-e179960a33f0")
public static final String FIELDNAME_Allocation_Approved="9ee5aee4-1406-21c7-44ec-e179960a33f0";

@XendraTrl(Identifier="80e0ea8c-8601-20b2-744f-430b935c4b83")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80e0ea8c-8601-20b2-744f-430b935c4b83",
Synchronized="2017-08-05 16:53:12.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set IsExchange.
@param IsExchange IsExchange */
public void setIsExchange (boolean IsExchange)
{
set_Value (COLUMNNAME_IsExchange, Boolean.valueOf(IsExchange));
}
/** Get IsExchange.
@return IsExchange */
public boolean isExchange() 
{
Object oo = get_Value(COLUMNNAME_IsExchange);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e8e97b14-4a4e-372b-3bf0-3fb0fd21ffb8")
public static String es_PE_COLUMN_IsExchange_Name="isexchange";

@XendraColumn(AD_Element_ID="44c655f9-a9d9-bd62-5865-b5cb3de5daa4",ColumnName="IsExchange",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8e97b14-4a4e-372b-3bf0-3fb0fd21ffb8",
Synchronized="2017-08-05 16:53:12.0")
/** Column name IsExchange */
public static final String COLUMNNAME_IsExchange = "IsExchange";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6c5e1df9-df31-432c-ef87-750354252cd2")
public static String es_PE_FIELD_Allocation_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="6c5e1df9-df31-432c-ef87-750354252cd2")
public static String es_PE_FIELD_Allocation_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraTrl(Identifier="6c5e1df9-df31-432c-ef87-750354252cd2")
public static String es_PE_FIELD_Allocation_Manual_Name="Manual";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c5e1df9-df31-432c-ef87-750354252cd2")
public static final String FIELDNAME_Allocation_Manual="6c5e1df9-df31-432c-ef87-750354252cd2";

@XendraTrl(Identifier="b2ccad8c-2892-7c9c-8364-3f025d96a277")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2ccad8c-2892-7c9c-8364-3f025d96a277",
Synchronized="2017-08-05 16:53:12.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
}
/** Get Posted.
@return Posting status */
public boolean isPosted() 
{
Object oo = get_Value(COLUMNNAME_Posted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2c309383-2bd6-ff89-245d-fa706f0a4970")
public static String es_PE_FIELD_Allocation_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="2c309383-2bd6-ff89-245d-fa706f0a4970")
public static String es_PE_FIELD_Allocation_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="2c309383-2bd6-ff89-245d-fa706f0a4970")
public static String es_PE_FIELD_Allocation_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c309383-2bd6-ff89-245d-fa706f0a4970")
public static final String FIELDNAME_Allocation_Posted="2c309383-2bd6-ff89-245d-fa706f0a4970";

@XendraTrl(Identifier="ef51a55d-78a5-60db-f68e-e25accc7e138")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ef51a55d-78a5-60db-f68e-e25accc7e138",Synchronized="2017-08-05 16:53:12.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
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

@XendraTrl(Identifier="8dadd19f-238b-b040-7e0d-fe95009cd296")
public static String es_PE_FIELD_Allocation_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8dadd19f-238b-b040-7e0d-fe95009cd296")
public static String es_PE_FIELD_Allocation_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="8dadd19f-238b-b040-7e0d-fe95009cd296")
public static String es_PE_FIELD_Allocation_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dadd19f-238b-b040-7e0d-fe95009cd296")
public static final String FIELDNAME_Allocation_Processed="8dadd19f-238b-b040-7e0d-fe95009cd296";

@XendraTrl(Identifier="76ac034c-792b-d73a-248e-12d1f5d4e310")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76ac034c-792b-d73a-248e-12d1f5d4e310",
Synchronized="2017-08-05 16:53:12.0")
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

@XendraTrl(Identifier="03c07b39-5ade-49aa-2cb9-83e7af49b2b8")
public static String es_PE_FIELD_Allocation_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="188fac8e-5839-9bec-38d7-9ed132ba9e81",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03c07b39-5ade-49aa-2cb9-83e7af49b2b8")
public static final String FIELDNAME_Allocation_ProcessNow="03c07b39-5ade-49aa-2cb9-83e7af49b2b8";

@XendraTrl(Identifier="f9133c30-a5fd-d7eb-06e8-724d109d15dc")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9133c30-a5fd-d7eb-06e8-724d109d15dc",
Synchronized="2017-08-05 16:53:12.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
