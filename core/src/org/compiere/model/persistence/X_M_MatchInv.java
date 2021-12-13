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
/** Generated Model for M_MatchInv
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MatchInv extends PO
{
/** Standard Constructor
@param ctx context
@param M_MatchInv_ID id
@param trxName transaction
*/
public X_M_MatchInv (Properties ctx, int M_MatchInv_ID, String trxName)
{
super (ctx, M_MatchInv_ID, trxName);
/** if (M_MatchInv_ID == 0)
{
setC_InvoiceLine_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setDateTrx (new Timestamp(System.currentTimeMillis()));
setM_InOutLine_ID (0);
setM_MatchInv_ID (0);
setM_Product_ID (0);
setPosted (false);
setProcessed (false);	
// N
setProcessing (false);
setQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_MatchInv (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=472 */
public static int Table_ID=MTable.getTable_ID("M_MatchInv");

@XendraTrl(Identifier="6f77aeaf-785c-7e9a-3d12-4c3917baddbd")
public static String es_PE_TAB_MatchedInvoices_Description="Facture las líneas emparejadas a esta línea material del recibo.";

@XendraTrl(Identifier="6f77aeaf-785c-7e9a-3d12-4c3917baddbd")
public static String es_PE_TAB_MatchedInvoices_Name="Facturas Cotejadas";

@XendraTab(Name="Matched Invoices",
Description="Invoice Lines matched to this Material Receipt Line",Help="",
AD_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",SeqNo=50,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="6f4ee220-bb78-1b06-8c13-7db1a3080667",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MatchedInvoices="6f77aeaf-785c-7e9a-3d12-4c3917baddbd";

@XendraTrl(Identifier="40c01004-aadb-9da6-65f7-9456151e3250")
public static String es_PE_TAB_MatchInvoice_Description="Ver facturas cotejadas";

@XendraTrl(Identifier="40c01004-aadb-9da6-65f7-9456151e3250")
public static String es_PE_TAB_MatchInvoice_Name="Cotejar Facturas";

@XendraTab(Name="Match Invoice",Description="View matched Invoices",
Help="View detals of matched invoice lines to material receipt lines",
AD_Window_ID="430016d4-ce08-fd49-fd73-d005d90b8b80",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="40c01004-aadb-9da6-65f7-9456151e3250",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MatchInvoice="40c01004-aadb-9da6-65f7-9456151e3250";

@XendraTrl(Identifier="fbb0622e-051d-c467-a15d-2ff028f60cf8")
public static String es_PE_TAB_MatchedReceipts_Description="Las líneas de recepción de material cotejadas a esta línea de la factura.";

@XendraTrl(Identifier="fbb0622e-051d-c467-a15d-2ff028f60cf8")
public static String es_PE_TAB_MatchedReceipts_Name="Recibos de Material Cotejados";

@XendraTab(Name="Matched Receipts",
Description="Material Receipt Lines matched to this Invoice Line",Help="",
AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",SeqNo=60,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="7f9851ea-340f-7b62-133c-426f1d245b6e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="fbb0622e-051d-c467-a15d-2ff028f60cf8",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MatchedReceipts="fbb0622e-051d-c467-a15d-2ff028f60cf8";

@XendraTrl(Identifier="c1e898d4-ec63-2990-41ca-21c86b204a01")
public static String es_PE_TABLE_M_MatchInv_Name="Corresponder Factura";

@XendraTable(Name="Match Invoice",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Match Shipment/Receipt to Invoice",Help="",TableName="M_MatchInv",AccessLevel="3",
AD_Window_ID="430016d4-ce08-fd49-fd73-d005d90b8b80",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="c1e898d4-ec63-2990-41ca-21c86b204a01",
Synchronized="2020-03-03 21:38:36.0")
/** TableName=M_MatchInv */
public static final String Table_Name="M_MatchInv";


@XendraIndex(Name="m_matchinv_ship",Identifier="343bd404-5df0-2dab-ab44-e6a1faac9a18",
Column_Names="c_invoiceline_id, m_inoutline_id",IsUnique="false",
TableIdentifier="343bd404-5df0-2dab-ab44-e6a1faac9a18",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_matchinv_ship = "343bd404-5df0-2dab-ab44-e6a1faac9a18";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MatchInv");

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
    Table_ID = MTable.getTable_ID("M_MatchInv");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MatchInv[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID < 1) throw new IllegalArgumentException ("C_InvoiceLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2d0e4a2b-98ac-7b67-2695-9a58a6ea06cd")
public static String es_PE_FIELD_MatchInvoice_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="2d0e4a2b-98ac-7b67-2695-9a58a6ea06cd")
public static String es_PE_FIELD_MatchInvoice_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="2d0e4a2b-98ac-7b67-2695-9a58a6ea06cd")
public static String es_PE_FIELD_MatchInvoice_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d0e4a2b-98ac-7b67-2695-9a58a6ea06cd")
public static final String FIELDNAME_MatchInvoice_InvoiceLine="2d0e4a2b-98ac-7b67-2695-9a58a6ea06cd";

@XendraTrl(Identifier="8d27e3a1-af36-27d8-7d72-10d0f07e5208")
public static String es_PE_FIELD_MatchedInvoices_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="8d27e3a1-af36-27d8-7d72-10d0f07e5208")
public static String es_PE_FIELD_MatchedInvoices_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="8d27e3a1-af36-27d8-7d72-10d0f07e5208")
public static String es_PE_FIELD_MatchedInvoices_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d27e3a1-af36-27d8-7d72-10d0f07e5208")
public static final String FIELDNAME_MatchedInvoices_InvoiceLine="8d27e3a1-af36-27d8-7d72-10d0f07e5208";

@XendraTrl(Identifier="87a6d6d1-bb16-bf83-4e50-81d7761f2ef2")
public static String es_PE_FIELD_MatchedReceipts_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="87a6d6d1-bb16-bf83-4e50-81d7761f2ef2")
public static String es_PE_FIELD_MatchedReceipts_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="87a6d6d1-bb16-bf83-4e50-81d7761f2ef2")
public static String es_PE_FIELD_MatchedReceipts_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87a6d6d1-bb16-bf83-4e50-81d7761f2ef2")
public static final String FIELDNAME_MatchedReceipts_InvoiceLine="87a6d6d1-bb16-bf83-4e50-81d7761f2ef2";

@XendraTrl(Identifier="7f9851ea-340f-7b62-133c-426f1d245b6e")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f9851ea-340f-7b62-133c-426f1d245b6e",
Synchronized="2019-08-30 22:23:15.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
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

@XendraTrl(Identifier="77b92fd2-892a-cd5e-1d75-bf4539fff1f0")
public static String es_PE_FIELD_MatchInvoice_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="77b92fd2-892a-cd5e-1d75-bf4539fff1f0")
public static String es_PE_FIELD_MatchInvoice_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="77b92fd2-892a-cd5e-1d75-bf4539fff1f0")
public static String es_PE_FIELD_MatchInvoice_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77b92fd2-892a-cd5e-1d75-bf4539fff1f0")
public static final String FIELDNAME_MatchInvoice_AccountDate="77b92fd2-892a-cd5e-1d75-bf4539fff1f0";

@XendraTrl(Identifier="cc03b4c9-5421-2cb4-1a89-22fa0b3caa18")
public static String es_PE_FIELD_MatchedInvoices_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="cc03b4c9-5421-2cb4-1a89-22fa0b3caa18")
public static String es_PE_FIELD_MatchedInvoices_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="cc03b4c9-5421-2cb4-1a89-22fa0b3caa18")
public static String es_PE_FIELD_MatchedInvoices_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc03b4c9-5421-2cb4-1a89-22fa0b3caa18")
public static final String FIELDNAME_MatchedInvoices_AccountDate="cc03b4c9-5421-2cb4-1a89-22fa0b3caa18";

@XendraTrl(Identifier="f6413352-7229-5da7-fa7c-e249e9dd3450")
public static String es_PE_FIELD_MatchedReceipts_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="f6413352-7229-5da7-fa7c-e249e9dd3450")
public static String es_PE_FIELD_MatchedReceipts_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="f6413352-7229-5da7-fa7c-e249e9dd3450")
public static String es_PE_FIELD_MatchedReceipts_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6413352-7229-5da7-fa7c-e249e9dd3450")
public static final String FIELDNAME_MatchedReceipts_AccountDate="f6413352-7229-5da7-fa7c-e249e9dd3450";

@XendraTrl(Identifier="5cfbc2f3-05f2-bc5e-6057-0d47e513a5b8")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cfbc2f3-05f2-bc5e-6057-0d47e513a5b8",
Synchronized="2019-08-30 22:23:15.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
if (DateTrx == null) throw new IllegalArgumentException ("DateTrx is mandatory.");
set_ValueNoCheck (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="49b07824-d4c1-452f-697d-7e4ee2563998")
public static String es_PE_FIELD_MatchInvoice_TransactionDate_Name="Fecha de la Transacción";

@XendraTrl(Identifier="49b07824-d4c1-452f-697d-7e4ee2563998")
public static String es_PE_FIELD_MatchInvoice_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="49b07824-d4c1-452f-697d-7e4ee2563998")
public static String es_PE_FIELD_MatchInvoice_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49b07824-d4c1-452f-697d-7e4ee2563998")
public static final String FIELDNAME_MatchInvoice_TransactionDate="49b07824-d4c1-452f-697d-7e4ee2563998";

@XendraTrl(Identifier="66a2cd30-8bf4-84ae-1b66-1d8baa7eab12")
public static String es_PE_FIELD_MatchedInvoices_TransactionDate_Name="Fecha de la Transacción";

@XendraTrl(Identifier="66a2cd30-8bf4-84ae-1b66-1d8baa7eab12")
public static String es_PE_FIELD_MatchedInvoices_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="66a2cd30-8bf4-84ae-1b66-1d8baa7eab12")
public static String es_PE_FIELD_MatchedInvoices_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66a2cd30-8bf4-84ae-1b66-1d8baa7eab12")
public static final String FIELDNAME_MatchedInvoices_TransactionDate="66a2cd30-8bf4-84ae-1b66-1d8baa7eab12";

@XendraTrl(Identifier="c57eb77b-89fd-6a12-f5b8-a1964d6254b1")
public static String es_PE_FIELD_MatchedReceipts_TransactionDate_Name="Fecha de la Transacción";

@XendraTrl(Identifier="c57eb77b-89fd-6a12-f5b8-a1964d6254b1")
public static String es_PE_FIELD_MatchedReceipts_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="c57eb77b-89fd-6a12-f5b8-a1964d6254b1")
public static String es_PE_FIELD_MatchedReceipts_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c57eb77b-89fd-6a12-f5b8-a1964d6254b1")
public static final String FIELDNAME_MatchedReceipts_TransactionDate="c57eb77b-89fd-6a12-f5b8-a1964d6254b1";

@XendraTrl(Identifier="694d6d96-7a99-7926-4491-9d33cbf2dcc2")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="694d6d96-7a99-7926-4491-9d33cbf2dcc2",
Synchronized="2019-08-30 22:23:16.0")
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

@XendraTrl(Identifier="28c856df-93d2-758a-ee1b-dc49ad0e48f9")
public static String es_PE_FIELD_MatchInvoice_Description_Name="Observación";

@XendraTrl(Identifier="28c856df-93d2-758a-ee1b-dc49ad0e48f9")
public static String es_PE_FIELD_MatchInvoice_Description_Description="Observación";

@XendraTrl(Identifier="28c856df-93d2-758a-ee1b-dc49ad0e48f9")
public static String es_PE_FIELD_MatchInvoice_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28c856df-93d2-758a-ee1b-dc49ad0e48f9")
public static final String FIELDNAME_MatchInvoice_Description="28c856df-93d2-758a-ee1b-dc49ad0e48f9";

@XendraTrl(Identifier="202aedc9-dd12-cf61-d50e-d52101649a4b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="202aedc9-dd12-cf61-d50e-d52101649a4b",
Synchronized="2019-08-30 22:23:16.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
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

@XendraTrl(Identifier="a8d43e59-3f6c-c522-8f93-ce58d219b86b")
public static String es_PE_FIELD_MatchInvoice_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="a8d43e59-3f6c-c522-8f93-ce58d219b86b")
public static String es_PE_FIELD_MatchInvoice_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="a8d43e59-3f6c-c522-8f93-ce58d219b86b")
public static String es_PE_FIELD_MatchInvoice_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8d43e59-3f6c-c522-8f93-ce58d219b86b")
public static final String FIELDNAME_MatchInvoice_DocumentNo="a8d43e59-3f6c-c522-8f93-ce58d219b86b";

@XendraTrl(Identifier="9f1a2134-f91e-be68-c0ad-44c4061a6ad9")
public static String es_PE_FIELD_MatchedInvoices_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="9f1a2134-f91e-be68-c0ad-44c4061a6ad9")
public static String es_PE_FIELD_MatchedInvoices_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="9f1a2134-f91e-be68-c0ad-44c4061a6ad9")
public static String es_PE_FIELD_MatchedInvoices_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f1a2134-f91e-be68-c0ad-44c4061a6ad9")
public static final String FIELDNAME_MatchedInvoices_DocumentNo="9f1a2134-f91e-be68-c0ad-44c4061a6ad9";

@XendraTrl(Identifier="34af7c74-43be-e2d9-9355-7b3cf9264e1b")
public static String es_PE_FIELD_MatchedReceipts_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="34af7c74-43be-e2d9-9355-7b3cf9264e1b")
public static String es_PE_FIELD_MatchedReceipts_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="34af7c74-43be-e2d9-9355-7b3cf9264e1b")
public static String es_PE_FIELD_MatchedReceipts_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34af7c74-43be-e2d9-9355-7b3cf9264e1b")
public static final String FIELDNAME_MatchedReceipts_DocumentNo="34af7c74-43be-e2d9-9355-7b3cf9264e1b";

@XendraTrl(Identifier="31b0c938-0490-4406-8c38-98c9e6dd08f8")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31b0c938-0490-4406-8c38-98c9e6dd08f8",
Synchronized="2019-08-30 22:23:16.0")
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
@XendraTrl(Identifier="1f66051a-d105-421b-a269-fc3d2480fafe")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f66051a-d105-421b-a269-fc3d2480fafe",
Synchronized="2019-08-30 22:23:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4dbe040e-99f9-f8fe-1774-bcefb4581c76")
public static String es_PE_FIELD_MatchInvoice_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="4dbe040e-99f9-f8fe-1774-bcefb4581c76")
public static String es_PE_FIELD_MatchInvoice_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="4dbe040e-99f9-f8fe-1774-bcefb4581c76")
public static String es_PE_FIELD_MatchInvoice_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4dbe040e-99f9-f8fe-1774-bcefb4581c76")
public static final String FIELDNAME_MatchInvoice_AttributeSetInstance="4dbe040e-99f9-f8fe-1774-bcefb4581c76";

@XendraTrl(Identifier="697b73a0-f428-6784-6511-f8e123008d60")
public static String es_PE_FIELD_MatchedInvoices_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="697b73a0-f428-6784-6511-f8e123008d60")
public static String es_PE_FIELD_MatchedInvoices_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="697b73a0-f428-6784-6511-f8e123008d60")
public static String es_PE_FIELD_MatchedInvoices_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="697b73a0-f428-6784-6511-f8e123008d60")
public static final String FIELDNAME_MatchedInvoices_AttributeSetInstance="697b73a0-f428-6784-6511-f8e123008d60";

@XendraTrl(Identifier="0903cf7f-a4bd-4562-0179-61a6ab4b3c43")
public static String es_PE_FIELD_MatchedReceipts_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="0903cf7f-a4bd-4562-0179-61a6ab4b3c43")
public static String es_PE_FIELD_MatchedReceipts_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="0903cf7f-a4bd-4562-0179-61a6ab4b3c43")
public static String es_PE_FIELD_MatchedReceipts_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0903cf7f-a4bd-4562-0179-61a6ab4b3c43")
public static final String FIELDNAME_MatchedReceipts_AttributeSetInstance="0903cf7f-a4bd-4562-0179-61a6ab4b3c43";

@XendraTrl(Identifier="087cd15e-645e-6a21-65b9-6b25699db3fe")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="087cd15e-645e-6a21-65b9-6b25699db3fe",
Synchronized="2019-08-30 22:23:16.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID < 1) throw new IllegalArgumentException ("M_InOutLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b0e45fe9-355e-b569-33cb-0749b296ae41")
public static String es_PE_FIELD_MatchInvoice_ReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="b0e45fe9-355e-b569-33cb-0749b296ae41")
public static String es_PE_FIELD_MatchInvoice_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="b0e45fe9-355e-b569-33cb-0749b296ae41")
public static String es_PE_FIELD_MatchInvoice_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0e45fe9-355e-b569-33cb-0749b296ae41")
public static final String FIELDNAME_MatchInvoice_ReceiptLine="b0e45fe9-355e-b569-33cb-0749b296ae41";

@XendraTrl(Identifier="3a1e4b5a-470c-f96c-de6e-403ad50a225a")
public static String es_PE_FIELD_MatchedInvoices_ReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="3a1e4b5a-470c-f96c-de6e-403ad50a225a")
public static String es_PE_FIELD_MatchedInvoices_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="3a1e4b5a-470c-f96c-de6e-403ad50a225a")
public static String es_PE_FIELD_MatchedInvoices_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a1e4b5a-470c-f96c-de6e-403ad50a225a")
public static final String FIELDNAME_MatchedInvoices_ReceiptLine="3a1e4b5a-470c-f96c-de6e-403ad50a225a";

@XendraTrl(Identifier="421f9e77-743a-470a-e6fc-dc714710a655")
public static String es_PE_FIELD_MatchedReceipts_ReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="421f9e77-743a-470a-e6fc-dc714710a655")
public static String es_PE_FIELD_MatchedReceipts_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="421f9e77-743a-470a-e6fc-dc714710a655")
public static String es_PE_FIELD_MatchedReceipts_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="421f9e77-743a-470a-e6fc-dc714710a655")
public static final String FIELDNAME_MatchedReceipts_ReceiptLine="421f9e77-743a-470a-e6fc-dc714710a655";

@XendraTrl(Identifier="6f4ee220-bb78-1b06-8c13-7db1a3080667")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f4ee220-bb78-1b06-8c13-7db1a3080667",
Synchronized="2019-08-30 22:23:16.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Match Invoice.
@param M_MatchInv_ID Match Shipment/Receipt to Invoice */
public void setM_MatchInv_ID (int M_MatchInv_ID)
{
if (M_MatchInv_ID < 1) throw new IllegalArgumentException ("M_MatchInv_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MatchInv_ID, Integer.valueOf(M_MatchInv_ID));
}
/** Get Match Invoice.
@return Match Shipment/Receipt to Invoice */
public int getM_MatchInv_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MatchInv_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ff19ca3-1cc1-4bd5-542b-04ca35911d40")
public static String es_PE_FIELD_MatchInvoice_MatchInvoice_Name="Corresponder Factura";

@XendraTrl(Identifier="2ff19ca3-1cc1-4bd5-542b-04ca35911d40")
public static String es_PE_FIELD_MatchInvoice_MatchInvoice_Description="Corresponder entrega / recibo con Factura";

@XendraField(AD_Column_ID="M_MatchInv_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ff19ca3-1cc1-4bd5-542b-04ca35911d40")
public static final String FIELDNAME_MatchInvoice_MatchInvoice="2ff19ca3-1cc1-4bd5-542b-04ca35911d40";

@XendraTrl(Identifier="49c20bbb-59ec-390a-6adc-5e7cfff7f44d")
public static String es_PE_FIELD_MatchedInvoices_MatchInvoice_Name="Corresponder Factura";

@XendraTrl(Identifier="49c20bbb-59ec-390a-6adc-5e7cfff7f44d")
public static String es_PE_FIELD_MatchedInvoices_MatchInvoice_Description="Corresponder entrega / recibo con Factura";

@XendraField(AD_Column_ID="M_MatchInv_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49c20bbb-59ec-390a-6adc-5e7cfff7f44d")
public static final String FIELDNAME_MatchedInvoices_MatchInvoice="49c20bbb-59ec-390a-6adc-5e7cfff7f44d";

@XendraTrl(Identifier="c49a6533-ba3d-9c4f-ddf7-a408a3ae90e1")
public static String es_PE_FIELD_MatchedReceipts_MatchInvoice_Name="Corresponder Factura";

@XendraTrl(Identifier="c49a6533-ba3d-9c4f-ddf7-a408a3ae90e1")
public static String es_PE_FIELD_MatchedReceipts_MatchInvoice_Description="Corresponder entrega / recibo con Factura";

@XendraField(AD_Column_ID="M_MatchInv_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c49a6533-ba3d-9c4f-ddf7-a408a3ae90e1")
public static final String FIELDNAME_MatchedReceipts_MatchInvoice="c49a6533-ba3d-9c4f-ddf7-a408a3ae90e1";
/** Column name M_MatchInv_ID */
public static final String COLUMNNAME_M_MatchInv_ID = "M_MatchInv_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a80f4747-e65f-aa43-a666-ad369f3378d5")
public static String es_PE_FIELD_MatchInvoice_Product_Name="Producto";

@XendraTrl(Identifier="a80f4747-e65f-aa43-a666-ad369f3378d5")
public static String es_PE_FIELD_MatchInvoice_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="a80f4747-e65f-aa43-a666-ad369f3378d5")
public static String es_PE_FIELD_MatchInvoice_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a80f4747-e65f-aa43-a666-ad369f3378d5")
public static final String FIELDNAME_MatchInvoice_Product="a80f4747-e65f-aa43-a666-ad369f3378d5";

@XendraTrl(Identifier="b7bbe3d8-6e10-a51f-d812-0d5d5ebe3786")
public static String es_PE_FIELD_MatchedInvoices_Product_Name="Producto";

@XendraTrl(Identifier="b7bbe3d8-6e10-a51f-d812-0d5d5ebe3786")
public static String es_PE_FIELD_MatchedInvoices_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="b7bbe3d8-6e10-a51f-d812-0d5d5ebe3786")
public static String es_PE_FIELD_MatchedInvoices_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7bbe3d8-6e10-a51f-d812-0d5d5ebe3786")
public static final String FIELDNAME_MatchedInvoices_Product="b7bbe3d8-6e10-a51f-d812-0d5d5ebe3786";

@XendraTrl(Identifier="dac79e51-2694-7756-a7a0-d53fe36d2898")
public static String es_PE_FIELD_MatchedReceipts_Product_Name="Producto";

@XendraTrl(Identifier="dac79e51-2694-7756-a7a0-d53fe36d2898")
public static String es_PE_FIELD_MatchedReceipts_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="dac79e51-2694-7756-a7a0-d53fe36d2898")
public static String es_PE_FIELD_MatchedReceipts_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dac79e51-2694-7756-a7a0-d53fe36d2898")
public static final String FIELDNAME_MatchedReceipts_Product="dac79e51-2694-7756-a7a0-d53fe36d2898";

@XendraTrl(Identifier="c75d280d-0287-ea12-7a0c-b99bce45823a")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c75d280d-0287-ea12-7a0c-b99bce45823a",Synchronized="2019-08-30 22:23:16.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_ValueNoCheck (COLUMNNAME_Posted, Boolean.valueOf(Posted));
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

@XendraTrl(Identifier="e0419e4a-b959-6689-e0e5-23ad97c31861")
public static String es_PE_FIELD_MatchInvoice_Posted_Name="Fijada";

@XendraTrl(Identifier="e0419e4a-b959-6689-e0e5-23ad97c31861")
public static String es_PE_FIELD_MatchInvoice_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="e0419e4a-b959-6689-e0e5-23ad97c31861")
public static String es_PE_FIELD_MatchInvoice_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@Processed@=Y",DisplayLength=23,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0419e4a-b959-6689-e0e5-23ad97c31861")
public static final String FIELDNAME_MatchInvoice_Posted="e0419e4a-b959-6689-e0e5-23ad97c31861";

@XendraTrl(Identifier="a9e5fa22-8225-0c2b-5f1c-2c8cedb337bb")
public static String es_PE_FIELD_MatchedInvoices_Posted_Name="Fijada";

@XendraTrl(Identifier="a9e5fa22-8225-0c2b-5f1c-2c8cedb337bb")
public static String es_PE_FIELD_MatchedInvoices_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="a9e5fa22-8225-0c2b-5f1c-2c8cedb337bb")
public static String es_PE_FIELD_MatchedInvoices_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9e5fa22-8225-0c2b-5f1c-2c8cedb337bb")
public static final String FIELDNAME_MatchedInvoices_Posted="a9e5fa22-8225-0c2b-5f1c-2c8cedb337bb";

@XendraTrl(Identifier="c1e4693d-3365-be38-433d-b53003d68837")
public static String es_PE_FIELD_MatchedReceipts_Posted_Name="Fijada";

@XendraTrl(Identifier="c1e4693d-3365-be38-433d-b53003d68837")
public static String es_PE_FIELD_MatchedReceipts_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="c1e4693d-3365-be38-433d-b53003d68837")
public static String es_PE_FIELD_MatchedReceipts_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1e4693d-3365-be38-433d-b53003d68837")
public static final String FIELDNAME_MatchedReceipts_Posted="c1e4693d-3365-be38-433d-b53003d68837";

@XendraTrl(Identifier="afd6bfd6-f362-c5d2-3a25-2a1fb8da068d")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="afd6bfd6-f362-c5d2-3a25-2a1fb8da068d",Synchronized="2019-08-30 22:23:16.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_ValueNoCheck (COLUMNNAME_Processed, Boolean.valueOf(Processed));
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

@XendraTrl(Identifier="27c75f10-744d-ae52-ef25-7210fd304b27")
public static String es_PE_FIELD_MatchInvoice_Processed_Name="Procesado";

@XendraTrl(Identifier="27c75f10-744d-ae52-ef25-7210fd304b27")
public static String es_PE_FIELD_MatchInvoice_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="27c75f10-744d-ae52-ef25-7210fd304b27")
public static String es_PE_FIELD_MatchInvoice_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27c75f10-744d-ae52-ef25-7210fd304b27")
public static final String FIELDNAME_MatchInvoice_Processed="27c75f10-744d-ae52-ef25-7210fd304b27";

@XendraTrl(Identifier="97bd59f0-d291-1f40-2e6a-43341ef5fb81")
public static String es_PE_FIELD_MatchedInvoices_Processed_Name="Procesado";

@XendraTrl(Identifier="97bd59f0-d291-1f40-2e6a-43341ef5fb81")
public static String es_PE_FIELD_MatchedInvoices_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="97bd59f0-d291-1f40-2e6a-43341ef5fb81")
public static String es_PE_FIELD_MatchedInvoices_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97bd59f0-d291-1f40-2e6a-43341ef5fb81")
public static final String FIELDNAME_MatchedInvoices_Processed="97bd59f0-d291-1f40-2e6a-43341ef5fb81";

@XendraTrl(Identifier="39a3762d-ed18-a3fc-88e1-c21b1eca4e48")
public static String es_PE_FIELD_MatchedReceipts_Processed_Name="Procesado";

@XendraTrl(Identifier="39a3762d-ed18-a3fc-88e1-c21b1eca4e48")
public static String es_PE_FIELD_MatchedReceipts_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="39a3762d-ed18-a3fc-88e1-c21b1eca4e48")
public static String es_PE_FIELD_MatchedReceipts_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39a3762d-ed18-a3fc-88e1-c21b1eca4e48")
public static final String FIELDNAME_MatchedReceipts_Processed="39a3762d-ed18-a3fc-88e1-c21b1eca4e48";

@XendraTrl(Identifier="2d0c17cb-0917-8352-0fbc-6399ddfc15c1")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d0c17cb-0917-8352-0fbc-6399ddfc15c1",
Synchronized="2019-08-30 22:23:16.0")
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

@XendraTrl(Identifier="210a5c6c-73aa-a1bb-248d-0ea11437f0cd")
public static String es_PE_FIELD_MatchInvoice_ProcessNow_Name="Borra";

@XendraTrl(Identifier="210a5c6c-73aa-a1bb-248d-0ea11437f0cd")
public static String es_PE_FIELD_MatchInvoice_ProcessNow_Description="Cancelación de correspondencia del Registro de la Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="210a5c6c-73aa-a1bb-248d-0ea11437f0cd")
public static final String FIELDNAME_MatchInvoice_ProcessNow="210a5c6c-73aa-a1bb-248d-0ea11437f0cd";

@XendraTrl(Identifier="3181eda0-d4f4-6af2-7021-baa2310077ba")
public static String es_PE_FIELD_MatchedInvoices_ProcessNow_Name="Borra";

@XendraTrl(Identifier="3181eda0-d4f4-6af2-7021-baa2310077ba")
public static String es_PE_FIELD_MatchedInvoices_ProcessNow_Description="Cancelación de correspondencia del Registro de la Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3181eda0-d4f4-6af2-7021-baa2310077ba")
public static final String FIELDNAME_MatchedInvoices_ProcessNow="3181eda0-d4f4-6af2-7021-baa2310077ba";

@XendraTrl(Identifier="c856523d-b73d-325f-2046-f271101c17c2")
public static String es_PE_FIELD_MatchedReceipts_ProcessNow_Name="Borra";

@XendraTrl(Identifier="c856523d-b73d-325f-2046-f271101c17c2")
public static String es_PE_FIELD_MatchedReceipts_ProcessNow_Description="Cancelación de correspondencia del Registro de la Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c856523d-b73d-325f-2046-f271101c17c2")
public static final String FIELDNAME_MatchedReceipts_ProcessNow="c856523d-b73d-325f-2046-f271101c17c2";

@XendraTrl(Identifier="54a3f6bb-1efd-49b6-9841-37812ad5490f")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="381ba379-9b0a-2374-b072-2cb48770debf",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="54a3f6bb-1efd-49b6-9841-37812ad5490f",Synchronized="2019-08-30 22:23:16.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_ValueNoCheck (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0c73dcba-d99a-feaa-ccb3-41789a21aa95")
public static String es_PE_FIELD_MatchInvoice_Quantity_Name="Cantidad";

@XendraTrl(Identifier="0c73dcba-d99a-feaa-ccb3-41789a21aa95")
public static String es_PE_FIELD_MatchInvoice_Quantity_Description="Cantidad";

@XendraTrl(Identifier="0c73dcba-d99a-feaa-ccb3-41789a21aa95")
public static String es_PE_FIELD_MatchInvoice_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="40c01004-aadb-9da6-65f7-9456151e3250",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c73dcba-d99a-feaa-ccb3-41789a21aa95")
public static final String FIELDNAME_MatchInvoice_Quantity="0c73dcba-d99a-feaa-ccb3-41789a21aa95";

@XendraTrl(Identifier="e79a8132-3e0f-3708-fe0a-adb818687115")
public static String es_PE_FIELD_MatchedInvoices_Quantity_Name="Cantidad";

@XendraTrl(Identifier="e79a8132-3e0f-3708-fe0a-adb818687115")
public static String es_PE_FIELD_MatchedInvoices_Quantity_Description="Cantidad";

@XendraTrl(Identifier="e79a8132-3e0f-3708-fe0a-adb818687115")
public static String es_PE_FIELD_MatchedInvoices_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="6f77aeaf-785c-7e9a-3d12-4c3917baddbd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e79a8132-3e0f-3708-fe0a-adb818687115")
public static final String FIELDNAME_MatchedInvoices_Quantity="e79a8132-3e0f-3708-fe0a-adb818687115";

@XendraTrl(Identifier="75364692-2453-585a-cbf8-0aceffd026f3")
public static String es_PE_FIELD_MatchedReceipts_Quantity_Name="Cantidad";

@XendraTrl(Identifier="75364692-2453-585a-cbf8-0aceffd026f3")
public static String es_PE_FIELD_MatchedReceipts_Quantity_Description="Cantidad";

@XendraTrl(Identifier="75364692-2453-585a-cbf8-0aceffd026f3")
public static String es_PE_FIELD_MatchedReceipts_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="fbb0622e-051d-c467-a15d-2ff028f60cf8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75364692-2453-585a-cbf8-0aceffd026f3")
public static final String FIELDNAME_MatchedReceipts_Quantity="75364692-2453-585a-cbf8-0aceffd026f3";

@XendraTrl(Identifier="c67ce9f8-3cdb-d51c-71cd-f3e4b97cd3f3")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c67ce9f8-3cdb-d51c-71cd-f3e4b97cd3f3",
Synchronized="2019-08-30 22:23:16.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
