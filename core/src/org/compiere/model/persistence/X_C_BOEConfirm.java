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
import org.compiere.model.reference.REF_C_BOEStatus;
/** Generated Model for C_BOEConfirm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BOEConfirm extends PO
{
/** Standard Constructor
@param ctx context
@param C_BOEConfirm_ID id
@param trxName transaction
*/
public X_C_BOEConfirm (Properties ctx, int C_BOEConfirm_ID, String trxName)
{
super (ctx, C_BOEConfirm_ID, trxName);
/** if (C_BOEConfirm_ID == 0)
{
setC_BankAccount_ID (0);
setC_BOEConfirm_ID (0);
setC_Currency_ID (0);
setDateBOE (new Timestamp(System.currentTimeMillis()));
setDocumentNo (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BOEConfirm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000119 */
public static int Table_ID=MTable.getTable_ID("C_BOEConfirm");

@XendraTrl(Identifier="894e0b34-49e8-ea20-054c-002a6293fcac")
public static String es_PE_TAB_C_BOEConfirm_Name="Planilla Bco / Letra";

@XendraTab(Name="C_BOEConfirm",Description="",Help="",
AD_Window_ID="85165053-23f9-b5e5-7ca7-3410730a2454",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="894e0b34-49e8-ea20-054c-002a6293fcac",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_C_BOEConfirm="894e0b34-49e8-ea20-054c-002a6293fcac";

@XendraTrl(Identifier="12cd27a3-8c8e-1a8d-5c11-c9bc74751a26")
public static String es_PE_TABLE_C_BOEConfirm_Name="Planilla de Letra Bco";

@XendraTable(Name="C_BOEConfirm",Description="C_BOEConfirm",Help="",TableName="C_BOEConfirm",
AccessLevel="3",AD_Window_ID="85165053-23f9-b5e5-7ca7-3410730a2454",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="12cd27a3-8c8e-1a8d-5c11-c9bc74751a26",Synchronized="2017-08-16 11:41:26.0")
/** TableName=C_BOEConfirm */
public static final String Table_Name="C_BOEConfirm";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BOEConfirm");

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
    Table_ID = MTable.getTable_ID("C_BOEConfirm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BOEConfirm[").append(get_ID()).append("]");
return sb.toString();
}
/** Set BOEAmt.
@param BOEAmt BOEAmt */
public void setBOEAmt (BigDecimal BOEAmt)
{
set_Value (COLUMNNAME_BOEAmt, BOEAmt);
}
/** Get BOEAmt.
@return BOEAmt */
public BigDecimal getBOEAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BOEAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="02cc8c0e-1bc8-aa19-7653-ef86f1fbc277")
public static String es_PE_FIELD_C_BOEConfirm_BOEAmt_Name="Monto de Control";

@XendraField(AD_Column_ID="BOEAmt",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02cc8c0e-1bc8-aa19-7653-ef86f1fbc277")
public static final String FIELDNAME_C_BOEConfirm_BOEAmt="02cc8c0e-1bc8-aa19-7653-ef86f1fbc277";

@XendraTrl(Identifier="1a4515cf-9b6b-f411-b0e7-b344c028d981")
public static String es_PE_COLUMN_BOEAmt_Name="BOEAmt";

@XendraColumn(AD_Element_ID="1fe9bbca-ceed-2a6e-9e4d-59ef82964606",ColumnName="BOEAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a4515cf-9b6b-f411-b0e7-b344c028d981",
Synchronized="2017-08-05 16:53:18.0")
/** Column name BOEAmt */
public static final String COLUMNNAME_BOEAmt = "BOEAmt";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID < 1) throw new IllegalArgumentException ("C_BankAccount_ID is mandatory.");
set_Value (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
}
/** Get Bank Account.
@return Account at the Bank */
public int getC_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="53b238d0-dbc7-b39e-cb29-e9357b81ec46")
public static String es_PE_FIELD_C_BOEConfirm_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="53b238d0-dbc7-b39e-cb29-e9357b81ec46")
public static String es_PE_FIELD_C_BOEConfirm_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="53b238d0-dbc7-b39e-cb29-e9357b81ec46")
public static String es_PE_FIELD_C_BOEConfirm_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53b238d0-dbc7-b39e-cb29-e9357b81ec46")
public static final String FIELDNAME_C_BOEConfirm_BankAccount="53b238d0-dbc7-b39e-cb29-e9357b81ec46";

@XendraTrl(Identifier="16f33faf-c9a5-47a8-2543-ac5f83b0d12a")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16f33faf-c9a5-47a8-2543-ac5f83b0d12a",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set C_BOEConfirm_ID.
@param C_BOEConfirm_ID C_BOEConfirm_ID */
public void setC_BOEConfirm_ID (int C_BOEConfirm_ID)
{
if (C_BOEConfirm_ID < 1) throw new IllegalArgumentException ("C_BOEConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOEConfirm_ID, Integer.valueOf(C_BOEConfirm_ID));
}
/** Get C_BOEConfirm_ID.
@return C_BOEConfirm_ID */
public int getC_BOEConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="249e5703-459b-9157-60c6-ff152678bbb4")
public static String es_PE_FIELD_C_BOEConfirm_C_BOEConfirm_ID_Name="c_boeconfirm_id";

@XendraField(AD_Column_ID="C_BOEConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="249e5703-459b-9157-60c6-ff152678bbb4")
public static final String FIELDNAME_C_BOEConfirm_C_BOEConfirm_ID="249e5703-459b-9157-60c6-ff152678bbb4";
/** Column name C_BOEConfirm_ID */
public static final String COLUMNNAME_C_BOEConfirm_ID = "C_BOEConfirm_ID";
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

@XendraTrl(Identifier="7d57ce1c-0c21-2f47-4663-1d63ac8301af")
public static String es_PE_FIELD_C_BOEConfirm_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="7d57ce1c-0c21-2f47-4663-1d63ac8301af")
public static String es_PE_FIELD_C_BOEConfirm_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="7d57ce1c-0c21-2f47-4663-1d63ac8301af")
public static String es_PE_FIELD_C_BOEConfirm_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d57ce1c-0c21-2f47-4663-1d63ac8301af")
public static final String FIELDNAME_C_BOEConfirm_Currency="7d57ce1c-0c21-2f47-4663-1d63ac8301af";

@XendraTrl(Identifier="9531174f-fdef-66b2-146b-7c48e3ddd8e7")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9531174f-fdef-66b2-146b-7c48e3ddd8e7",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Bill Of Exchange Date.
@param DateBOE Bill Of Exchange Date */
public void setDateBOE (Timestamp DateBOE)
{
if (DateBOE == null) throw new IllegalArgumentException ("DateBOE is mandatory.");
set_Value (COLUMNNAME_DateBOE, DateBOE);
}
/** Get Bill Of Exchange Date.
@return Bill Of Exchange Date */
public Timestamp getDateBOE() 
{
return (Timestamp)get_Value(COLUMNNAME_DateBOE);
}

@XendraTrl(Identifier="7539b49f-567b-2efc-965e-4053d7b09ffc")
public static String es_PE_FIELD_C_BOEConfirm_BillOfExchangeDate_Description="Fecha de la Letra de Cambio";

@XendraTrl(Identifier="7539b49f-567b-2efc-965e-4053d7b09ffc")
public static String es_PE_FIELD_C_BOEConfirm_BillOfExchangeDate_Help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.";

@XendraTrl(Identifier="7539b49f-567b-2efc-965e-4053d7b09ffc")
public static String es_PE_FIELD_C_BOEConfirm_BillOfExchangeDate_Name="Fecha de la Plla";

@XendraField(AD_Column_ID="DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7539b49f-567b-2efc-965e-4053d7b09ffc")
public static final String FIELDNAME_C_BOEConfirm_BillOfExchangeDate="7539b49f-567b-2efc-965e-4053d7b09ffc";

@XendraTrl(Identifier="d28b38c6-a256-8ed9-460f-b9f25d1ef914")
public static String es_PE_COLUMN_DateBOE_Name="Fecha de la Letra de Cambio";

@XendraColumn(AD_Element_ID="ca3fdb3d-2d28-4b77-a7fa-22bc925a41e1",ColumnName="DateBOE",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d28b38c6-a256-8ed9-460f-b9f25d1ef914",
Synchronized="2017-08-05 16:53:18.0")
/** Column name DateBOE */
public static final String COLUMNNAME_DateBOE = "DateBOE";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null || DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction != null && DocAction.length() > 2)
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

@XendraTrl(Identifier="753984e7-d31c-451f-1b1e-2b5841d0d6a3")
public static String es_PE_FIELD_C_BOEConfirm_DocumentAction_Description="El estado destino del documento";

@XendraTrl(Identifier="753984e7-d31c-451f-1b1e-2b5841d0d6a3")
public static String es_PE_FIELD_C_BOEConfirm_DocumentAction_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraTrl(Identifier="753984e7-d31c-451f-1b1e-2b5841d0d6a3")
public static String es_PE_FIELD_C_BOEConfirm_DocumentAction_Name="Acción en el Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="753984e7-d31c-451f-1b1e-2b5841d0d6a3")
public static final String FIELDNAME_C_BOEConfirm_DocumentAction="753984e7-d31c-451f-1b1e-2b5841d0d6a3";

@XendraTrl(Identifier="ca405baf-656b-afd1-9d2d-05321cf3751f")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,
AD_Process_ID="c63aa122-fba0-a6a8-c71a-3af1952a1246",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca405baf-656b-afd1-9d2d-05321cf3751f",
Synchronized="2017-08-05 16:53:18.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null || DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
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

@XendraTrl(Identifier="9955d416-3957-b96d-f04b-3411d2e1487a")
public static String es_PE_FIELD_C_BOEConfirm_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="9955d416-3957-b96d-f04b-3411d2e1487a")
public static String es_PE_FIELD_C_BOEConfirm_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="9955d416-3957-b96d-f04b-3411d2e1487a")
public static String es_PE_FIELD_C_BOEConfirm_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9955d416-3957-b96d-f04b-3411d2e1487a")
public static final String FIELDNAME_C_BOEConfirm_DocumentStatus="9955d416-3957-b96d-f04b-3411d2e1487a";

@XendraTrl(Identifier="5ce78b72-15b6-0127-3936-3dfea55c021e")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5ce78b72-15b6-0127-3936-3dfea55c021e",Synchronized="2017-08-05 16:53:18.0")
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

@XendraTrl(Identifier="859a6315-50ca-7b12-931b-4af800854e5d")
public static String es_PE_FIELD_C_BOEConfirm_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="859a6315-50ca-7b12-931b-4af800854e5d")
public static String es_PE_FIELD_C_BOEConfirm_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="859a6315-50ca-7b12-931b-4af800854e5d")
public static String es_PE_FIELD_C_BOEConfirm_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="859a6315-50ca-7b12-931b-4af800854e5d")
public static final String FIELDNAME_C_BOEConfirm_DocumentNo="859a6315-50ca-7b12-931b-4af800854e5d";

@XendraTrl(Identifier="96f48d2a-5ef3-78e8-777f-0ea1296646ce")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96f48d2a-5ef3-78e8-777f-0ea1296646ce",
Synchronized="2017-08-05 16:53:18.0")
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
@XendraTrl(Identifier="880e9850-5673-4bf8-aef6-1b123f69826d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="880e9850-5673-4bf8-aef6-1b123f69826d",
Synchronized="2017-08-05 16:53:18.0")
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

@XendraTrl(Identifier="88173dc7-0bda-1f46-d88b-8922767a0eed")
public static String es_PE_FIELD_C_BOEConfirm_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="88173dc7-0bda-1f46-d88b-8922767a0eed")
public static String es_PE_FIELD_C_BOEConfirm_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="88173dc7-0bda-1f46-d88b-8922767a0eed")
public static String es_PE_FIELD_C_BOEConfirm_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88173dc7-0bda-1f46-d88b-8922767a0eed")
public static final String FIELDNAME_C_BOEConfirm_Processed="88173dc7-0bda-1f46-d88b-8922767a0eed";

@XendraTrl(Identifier="32c6883b-0d72-18af-146f-12445ddccd1b")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32c6883b-0d72-18af-146f-12445ddccd1b",
Synchronized="2017-08-05 16:53:18.0")
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

@XendraTrl(Identifier="33d5f923-339e-4cba-a576-f3bbc21016b1")
public static String es_PE_FIELD_C_BOEConfirm_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33d5f923-339e-4cba-a576-f3bbc21016b1")
public static final String FIELDNAME_C_BOEConfirm_ProcessNow="33d5f923-339e-4cba-a576-f3bbc21016b1";

@XendraTrl(Identifier="548de634-097e-226b-73ce-e5ed6de08c3a")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="548de634-097e-226b-73ce-e5ed6de08c3a",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** Status AD_Reference=1b58b585-4d7b-c473-9e0c-13d85b7d49bb */
public static final int STATUS_AD_Reference_ID=1000018;
/** Set Status.
@param Status Status of the currently running check */
public void setStatus (String Status)
{
if (Status == null || Status.equals(REF_C_BOEStatus.Draft) || Status.equals(REF_C_BOEStatus.Refinanced) || Status.equals(REF_C_BOEStatus.Invalid) || Status.equals(REF_C_BOEStatus.Receivables) || Status.equals(REF_C_BOEStatus.Protested) || Status.equals(REF_C_BOEStatus.Portfolio) || Status.equals(REF_C_BOEStatus.Discount) || Status.equals(REF_C_BOEStatus.Warranty) || Status.equals(REF_C_BOEStatus.Canceled));
 else throw new IllegalArgumentException ("Status Invalid value - " + Status + " - Reference_ID=1000018 - DR - RF - IN - RC - PD - PT - DS - WR - CN");
if (Status != null && Status.length() > 5)
{
log.warning("Length > 5 - truncated");
Status = Status.substring(0,4);
}
set_Value (COLUMNNAME_Status, Status);
}
/** Get Status.
@return Status of the currently running check */
public String getStatus() 
{
return (String)get_Value(COLUMNNAME_Status);
}

@XendraTrl(Identifier="a57204ed-3ba4-1661-200d-e0d380433720")
public static String es_PE_FIELD_C_BOEConfirm_Status_Description="Status of the currently running check";

@XendraTrl(Identifier="a57204ed-3ba4-1661-200d-e0d380433720")
public static String es_PE_FIELD_C_BOEConfirm_Status_Help="Status of the currently running check";

@XendraTrl(Identifier="a57204ed-3ba4-1661-200d-e0d380433720")
public static String es_PE_FIELD_C_BOEConfirm_Status_Name="Estado de Letra Detalle";

@XendraField(AD_Column_ID="Status",IsCentrallyMaintained=true,
AD_Tab_ID="894e0b34-49e8-ea20-054c-002a6293fcac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a57204ed-3ba4-1661-200d-e0d380433720")
public static final String FIELDNAME_C_BOEConfirm_Status="a57204ed-3ba4-1661-200d-e0d380433720";

@XendraTrl(Identifier="c0d168aa-dd2b-8f12-ab61-a1c5841e4856")
public static String es_PE_COLUMN_Status_Name="Status";

@XendraColumn(AD_Element_ID="0b9968a2-c050-f756-f519-4b5d48d463a0",ColumnName="Status",
AD_Reference_ID=17,AD_Reference_Value_ID="1b58b585-4d7b-c473-9e0c-13d85b7d49bb",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="DS",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c0d168aa-dd2b-8f12-ab61-a1c5841e4856",Synchronized="2017-08-05 16:53:18.0")
/** Column name Status */
public static final String COLUMNNAME_Status = "Status";
}
