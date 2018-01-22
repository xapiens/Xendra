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
/** Generated Model for S_TimeExpense
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_TimeExpense extends PO
{
/** Standard Constructor
@param ctx context
@param S_TimeExpense_ID id
@param trxName transaction
*/
public X_S_TimeExpense (Properties ctx, int S_TimeExpense_ID, String trxName)
{
super (ctx, S_TimeExpense_ID, trxName);
/** if (S_TimeExpense_ID == 0)
{
setC_BPartner_ID (0);
setDateReport (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsApproved (false);	
// N
setM_PriceList_ID (0);
setM_Warehouse_ID (0);
setProcessed (false);	
// N
setS_TimeExpense_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_TimeExpense (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=486 */
public static int Table_ID=MTable.getTable_ID("S_TimeExpense");

@XendraTrl(Identifier="88de64c5-b965-6215-1164-4bf93ce70f32")
public static String es_PE_TAB_ExpenseReport_Description="Informe de Tiempo y Gasto";

@XendraTrl(Identifier="88de64c5-b965-6215-1164-4bf93ce70f32")
public static String es_PE_TAB_ExpenseReport_Name="Informe de Gasto";

@XendraTab(Name="Expense Report",Description="Time and Expense Report",
Help="Enter the time and expenses for the Employee or Contractor (Business Partner). <br> The price list determines the default costs of the expenses, products or resource to be reimbursed. In that sense, it is a 'Purchase Price' list. The Warehouse is used to correct the inventory of items invoiced to customers (i.e. if not invoiced, the inventory is not adjusted).<br> Please note that the Business Partner <b>must</b> be an Employee with an Address and Contact!",
AD_Window_ID="34a30f99-cf17-9a6b-fa47-63536a0d865c",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="88de64c5-b965-6215-1164-4bf93ce70f32",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ExpenseReport="88de64c5-b965-6215-1164-4bf93ce70f32";

@XendraTrl(Identifier="d112ad22-9a7c-cbc5-a9fb-f71ad3d0eded")
public static String es_PE_TABLE_S_TimeExpense_Name="Informe de Gasto";

@XendraTable(Name="Expense Report",Description="Time and Expense Report",Help="",
TableName="S_TimeExpense",AccessLevel="1",AD_Window_ID="34a30f99-cf17-9a6b-fa47-63536a0d865c",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.services",
Identifier="d112ad22-9a7c-cbc5-a9fb-f71ad3d0eded",Synchronized="2017-08-16 11:44:15.0")
/** TableName=S_TimeExpense */
public static final String Table_Name="S_TimeExpense";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_TimeExpense");

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
    Table_ID = MTable.getTable_ID("S_TimeExpense");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_TimeExpense[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Approval Amount.
@param ApprovalAmt Document Approval Amount */
public void setApprovalAmt (BigDecimal ApprovalAmt)
{
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

@XendraTrl(Identifier="947ee0b6-bd42-a401-fc1c-109e6fe06c80")
public static String es_PE_FIELD_ExpenseReport_ApprovalAmount_Description="Documento de importe aprobado";

@XendraTrl(Identifier="947ee0b6-bd42-a401-fc1c-109e6fe06c80")
public static String es_PE_FIELD_ExpenseReport_ApprovalAmount_Help="Cantidad de la aprobación para el Flujo de trabajo";

@XendraTrl(Identifier="947ee0b6-bd42-a401-fc1c-109e6fe06c80")
public static String es_PE_FIELD_ExpenseReport_ApprovalAmount_Name="Importe Aprobado";

@XendraField(AD_Column_ID="ApprovalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="947ee0b6-bd42-a401-fc1c-109e6fe06c80")
public static final String FIELDNAME_ExpenseReport_ApprovalAmount="947ee0b6-bd42-a401-fc1c-109e6fe06c80";

@XendraTrl(Identifier="1054214e-8d56-da27-8229-f62fe9cb69d2")
public static String es_PE_COLUMN_ApprovalAmt_Name="Importe Aprobado";

@XendraColumn(AD_Element_ID="fd13a366-3264-4b86-b3f3-66490833103d",ColumnName="ApprovalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1054214e-8d56-da27-8229-f62fe9cb69d2",
Synchronized="2017-08-05 16:56:20.0")
/** Column name ApprovalAmt */
public static final String COLUMNNAME_ApprovalAmt = "ApprovalAmt";

/** C_BPartner_ID AD_Reference=ceb38c30-de7a-46bb-35b0-014c0684ff8d */
public static final int C_BPARTNER_ID_AD_Reference_ID=277;
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="88687db4-76a4-c5f3-2e00-f03c3c1e922b")
public static String es_PE_FIELD_ExpenseReport_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="88687db4-76a4-c5f3-2e00-f03c3c1e922b")
public static String es_PE_FIELD_ExpenseReport_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="88687db4-76a4-c5f3-2e00-f03c3c1e922b")
public static String es_PE_FIELD_ExpenseReport_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88687db4-76a4-c5f3-2e00-f03c3c1e922b")
public static final String FIELDNAME_ExpenseReport_BusinessPartner="88687db4-76a4-c5f3-2e00-f03c3c1e922b";

@XendraTrl(Identifier="dfae3337-e58d-8423-931e-c908627bbc5d")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="ceb38c30-de7a-46bb-35b0-014c0684ff8d",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dfae3337-e58d-8423-931e-c908627bbc5d",Synchronized="2017-08-05 16:56:20.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Report Date.
@param DateReport Expense/Time Report Date */
public void setDateReport (Timestamp DateReport)
{
if (DateReport == null) throw new IllegalArgumentException ("DateReport is mandatory.");
set_Value (COLUMNNAME_DateReport, DateReport);
}
/** Get Report Date.
@return Expense/Time Report Date */
public Timestamp getDateReport() 
{
return (Timestamp)get_Value(COLUMNNAME_DateReport);
}

@XendraTrl(Identifier="61b73069-1685-de26-2cef-20d44cba1ebb")
public static String es_PE_FIELD_ExpenseReport_ReportDate_Description="Fecha del Informe de gasto y tiempo";

@XendraTrl(Identifier="61b73069-1685-de26-2cef-20d44cba1ebb")
public static String es_PE_FIELD_ExpenseReport_ReportDate_Help="Fecha del Informe de tiempo y gastos";

@XendraTrl(Identifier="61b73069-1685-de26-2cef-20d44cba1ebb")
public static String es_PE_FIELD_ExpenseReport_ReportDate_Name="Fecha de Informe";

@XendraField(AD_Column_ID="DateReport",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61b73069-1685-de26-2cef-20d44cba1ebb")
public static final String FIELDNAME_ExpenseReport_ReportDate="61b73069-1685-de26-2cef-20d44cba1ebb";

@XendraTrl(Identifier="5d720616-082c-d42d-4aab-092c782a67aa")
public static String es_PE_COLUMN_DateReport_Name="Fecha de Informe";

@XendraColumn(AD_Element_ID="4289c497-57a2-6f4f-9004-c54eb35f32df",ColumnName="DateReport",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d720616-082c-d42d-4aab-092c782a67aa",
Synchronized="2017-08-05 16:56:20.0")
/** Column name DateReport */
public static final String COLUMNNAME_DateReport = "DateReport";
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

@XendraTrl(Identifier="c944cd99-665a-d715-0c2e-44a28c93a240")
public static String es_PE_FIELD_ExpenseReport_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c944cd99-665a-d715-0c2e-44a28c93a240")
public static String es_PE_FIELD_ExpenseReport_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="c944cd99-665a-d715-0c2e-44a28c93a240")
public static String es_PE_FIELD_ExpenseReport_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c944cd99-665a-d715-0c2e-44a28c93a240")
public static final String FIELDNAME_ExpenseReport_Description="c944cd99-665a-d715-0c2e-44a28c93a240";

@XendraTrl(Identifier="66427f1f-8752-961e-031b-4b99e6994663")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66427f1f-8752-961e-031b-4b99e6994663",
Synchronized="2017-08-05 16:56:20.0")
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

@XendraTrl(Identifier="cd13719e-db1a-84fd-d0bd-6a0513872298")
public static String es_PE_FIELD_ExpenseReport_ProcessExpenses_Name="Procesar Gastos";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd13719e-db1a-84fd-d0bd-6a0513872298")
public static final String FIELDNAME_ExpenseReport_ProcessExpenses="cd13719e-db1a-84fd-d0bd-6a0513872298";

@XendraTrl(Identifier="5e0a34d2-5e64-4c13-9990-a49c3d6bfd5d")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="7a3f79dc-ac88-81ed-3535-c1ffaaee2e85",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e0a34d2-5e64-4c13-9990-a49c3d6bfd5d",
Synchronized="2017-08-05 16:56:20.0")
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

@XendraTrl(Identifier="195ef41c-2a1c-6961-08a9-8db0d46088a8")
public static String es_PE_FIELD_ExpenseReport_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="195ef41c-2a1c-6961-08a9-8db0d46088a8")
public static String es_PE_FIELD_ExpenseReport_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="195ef41c-2a1c-6961-08a9-8db0d46088a8")
public static String es_PE_FIELD_ExpenseReport_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="195ef41c-2a1c-6961-08a9-8db0d46088a8")
public static final String FIELDNAME_ExpenseReport_DocumentStatus="195ef41c-2a1c-6961-08a9-8db0d46088a8";

@XendraTrl(Identifier="04e15215-0447-bfbb-1078-4493528aa440")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="04e15215-0447-bfbb-1078-4493528aa440",Synchronized="2017-08-05 16:56:20.0")
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

@XendraTrl(Identifier="641f6a9d-1abf-2cd1-fb27-1081a5d4e5d6")
public static String es_PE_FIELD_ExpenseReport_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="641f6a9d-1abf-2cd1-fb27-1081a5d4e5d6")
public static String es_PE_FIELD_ExpenseReport_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="641f6a9d-1abf-2cd1-fb27-1081a5d4e5d6")
public static String es_PE_FIELD_ExpenseReport_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="641f6a9d-1abf-2cd1-fb27-1081a5d4e5d6")
public static final String FIELDNAME_ExpenseReport_DocumentNo="641f6a9d-1abf-2cd1-fb27-1081a5d4e5d6";

@XendraTrl(Identifier="a5bf724e-bbcd-3209-d919-c9b812d5729a")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5bf724e-bbcd-3209-d919-c9b812d5729a",
Synchronized="2017-08-05 16:56:20.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="6ec76b07-6f97-40ff-9cd1-f5afb35d1219")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ec76b07-6f97-40ff-9cd1-f5afb35d1219",
Synchronized="2017-08-05 16:56:20.0")
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

@XendraTrl(Identifier="c4f9ffc6-c65e-d931-86c8-d6488313f722")
public static String es_PE_FIELD_ExpenseReport_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="c4f9ffc6-c65e-d931-86c8-d6488313f722")
public static String es_PE_FIELD_ExpenseReport_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="c4f9ffc6-c65e-d931-86c8-d6488313f722")
public static String es_PE_FIELD_ExpenseReport_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4f9ffc6-c65e-d931-86c8-d6488313f722")
public static final String FIELDNAME_ExpenseReport_Approved="c4f9ffc6-c65e-d931-86c8-d6488313f722";

@XendraTrl(Identifier="5ceca12f-1044-e6bd-6d6a-17ce4e299ed0")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ceca12f-1044-e6bd-6d6a-17ce4e299ed0",
Synchronized="2017-08-05 16:56:20.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5f4d8581-82dd-7b91-f8d6-27dd9f08eed8")
public static String es_PE_FIELD_ExpenseReport_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="5f4d8581-82dd-7b91-f8d6-27dd9f08eed8")
public static String es_PE_FIELD_ExpenseReport_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraTrl(Identifier="5f4d8581-82dd-7b91-f8d6-27dd9f08eed8")
public static String es_PE_FIELD_ExpenseReport_M_PriceList_ID_Name="Lista de Precios";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f4d8581-82dd-7b91-f8d6-27dd9f08eed8")
public static final String FIELDNAME_ExpenseReport_M_PriceList_ID="5f4d8581-82dd-7b91-f8d6-27dd9f08eed8";

@XendraTrl(Identifier="3ab8100f-03f4-a077-ac9a-c82cace39371")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ab8100f-03f4-a077-ac9a-c82cace39371",
Synchronized="2017-08-05 16:56:20.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5baa49f1-3575-503c-8944-c6283d40e22a")
public static String es_PE_FIELD_ExpenseReport_Warehouse_Description="Almacén";

@XendraTrl(Identifier="5baa49f1-3575-503c-8944-c6283d40e22a")
public static String es_PE_FIELD_ExpenseReport_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="5baa49f1-3575-503c-8944-c6283d40e22a")
public static String es_PE_FIELD_ExpenseReport_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5baa49f1-3575-503c-8944-c6283d40e22a")
public static final String FIELDNAME_ExpenseReport_Warehouse="5baa49f1-3575-503c-8944-c6283d40e22a";

@XendraTrl(Identifier="fae16531-c8fd-28aa-1a45-25b8cb07cc2a")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fae16531-c8fd-28aa-1a45-25b8cb07cc2a",
Synchronized="2017-08-05 16:56:20.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="550c8e64-9b00-d429-b3a4-e20fd907c86f")
public static String es_PE_FIELD_ExpenseReport_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="550c8e64-9b00-d429-b3a4-e20fd907c86f")
public static String es_PE_FIELD_ExpenseReport_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="550c8e64-9b00-d429-b3a4-e20fd907c86f")
public static String es_PE_FIELD_ExpenseReport_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="550c8e64-9b00-d429-b3a4-e20fd907c86f")
public static final String FIELDNAME_ExpenseReport_Processed="550c8e64-9b00-d429-b3a4-e20fd907c86f";

@XendraTrl(Identifier="9eac2933-8404-99b9-d949-783b842dc461")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9eac2933-8404-99b9-d949-783b842dc461",
Synchronized="2017-08-05 16:56:20.0")
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

@XendraTrl(Identifier="58bfb52f-e304-9e37-ed7e-a0c05f60c7c4")
public static String es_PE_FIELD_ExpenseReport_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58bfb52f-e304-9e37-ed7e-a0c05f60c7c4")
public static final String FIELDNAME_ExpenseReport_ProcessNow="58bfb52f-e304-9e37-ed7e-a0c05f60c7c4";

@XendraTrl(Identifier="8f68e412-f141-667d-7a4a-e7b34787a54d")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f68e412-f141-667d-7a4a-e7b34787a54d",
Synchronized="2017-08-05 16:56:20.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Expense Report.
@param S_TimeExpense_ID Time and Expense Report */
public void setS_TimeExpense_ID (int S_TimeExpense_ID)
{
if (S_TimeExpense_ID < 1) throw new IllegalArgumentException ("S_TimeExpense_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_TimeExpense_ID, Integer.valueOf(S_TimeExpense_ID));
}
/** Get Expense Report.
@return Time and Expense Report */
public int getS_TimeExpense_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_TimeExpense_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4263d6fa-86d5-14d0-b92d-4768f10b65a5")
public static String es_PE_FIELD_ExpenseReport_ExpenseReport_Description="Informe de tiempo y gasto";

@XendraTrl(Identifier="4263d6fa-86d5-14d0-b92d-4768f10b65a5")
public static String es_PE_FIELD_ExpenseReport_ExpenseReport_Name="Informe de Gasto";

@XendraField(AD_Column_ID="S_TimeExpense_ID",IsCentrallyMaintained=true,
AD_Tab_ID="88de64c5-b965-6215-1164-4bf93ce70f32",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4263d6fa-86d5-14d0-b92d-4768f10b65a5")
public static final String FIELDNAME_ExpenseReport_ExpenseReport="4263d6fa-86d5-14d0-b92d-4768f10b65a5";
/** Column name S_TimeExpense_ID */
public static final String COLUMNNAME_S_TimeExpense_ID = "S_TimeExpense_ID";
}
