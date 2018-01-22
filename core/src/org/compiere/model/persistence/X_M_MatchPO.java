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
/** Generated Model for M_MatchPO
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MatchPO extends PO
{
/** Standard Constructor
@param ctx context
@param M_MatchPO_ID id
@param trxName transaction
*/
public X_M_MatchPO (Properties ctx, int M_MatchPO_ID, String trxName)
{
super (ctx, M_MatchPO_ID, trxName);
/** if (M_MatchPO_ID == 0)
{
setC_OrderLine_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setDateTrx (new Timestamp(System.currentTimeMillis()));
setM_InOutLine_ID (0);
setM_MatchPO_ID (0);
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
public X_M_MatchPO (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=473 */
public static int Table_ID=MTable.getTable_ID("M_MatchPO");

@XendraTrl(Identifier="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006")
public static String es_PE_TAB_MatchedPOs_Description="Las líneas de la orden de compra cotejarón a esta línea material del recibo";

@XendraTrl(Identifier="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006")
public static String es_PE_TAB_MatchedPOs_Name="Órdenes de Compra Cotejadas";

@XendraTab(Name="Matched POs",
Description="Purchase Order Lines matched to this Material Receipt Line",Help="",
AD_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",SeqNo=40,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="7a005ed4-a339-b2d3-873d-b9bd666d8454",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MatchedPOs="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006";

@XendraTrl(Identifier="9764d368-480f-6552-5716-6cbd71358d02")
public static String es_PE_TAB_MatchPO_Description="Ver ordenes de compra cotejadas";

@XendraTrl(Identifier="9764d368-480f-6552-5716-6cbd71358d02")
public static String es_PE_TAB_MatchPO_Name="Cotejar OC";
@XendraTab(Name="Match PO",
Description="View matched Purchase Orders",
Help="View detals of matched purchase order lines to invoice lines and material receipt lines",
AD_Window_ID="22532ee9-817e-40b9-c3f0-1a6ed34148ee",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9764d368-480f-6552-5716-6cbd71358d02",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MatchPO="9764d368-480f-6552-5716-6cbd71358d02";

@XendraTrl(Identifier="9689049e-57a3-b7b0-a55b-153ce0ded065")
public static String es_PE_TAB_Matching_Description="Las líneas de materiales de recibo ó de la factura cotejarón a esta línea de la orden de compra.";

@XendraTrl(Identifier="9689049e-57a3-b7b0-a55b-153ce0ded065")
public static String es_PE_TAB_Matching_Name="Cotejados";
@XendraTab(Name="Matching",
Description="Material Receipt or Invoice Lines matched to this Purchse Order Line",Help="",
AD_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="9d803a66-6c76-ed92-c8f7-e02048637ce8",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="9689049e-57a3-b7b0-a55b-153ce0ded065",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Matching="9689049e-57a3-b7b0-a55b-153ce0ded065";

@XendraTrl(Identifier="521b8407-fc2e-841f-5784-ed49e5139bc9")
public static String es_PE_TAB_MatchedPOs2_Description="Las líneas de la orden de compra cotejarón a esta línea de la factura";

@XendraTrl(Identifier="521b8407-fc2e-841f-5784-ed49e5139bc9")
public static String es_PE_TAB_MatchedPOs2_Name="Órdenes de Compra Cotejadas";

@XendraTab(Name="Matched POs",Description="Purchase Order Lines matched to this Invoice Line",
Help="",AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",SeqNo=50,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="a1c769b2-48e4-7c7e-16ca-0ac0f84033ea",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="521b8407-fc2e-841f-5784-ed49e5139bc9",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MatchedPOs2="521b8407-fc2e-841f-5784-ed49e5139bc9";

@XendraTrl(Identifier="dffa7e3e-3d16-04f9-e616-4eb40e573b39")
public static String es_PE_TABLE_M_MatchPO_Name="Corresponder OC";

@XendraTable(Name="Match PO",Description="Match Purchase Order to Shipment/Receipt and Invoice",
Help="",TableName="M_MatchPO",AccessLevel="3",AD_Window_ID="22532ee9-817e-40b9-c3f0-1a6ed34148ee",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="dffa7e3e-3d16-04f9-e616-4eb40e573b39",Synchronized="2017-08-16 11:43:20.0")
/** TableName=M_MatchPO */
public static final String Table_Name="M_MatchPO";


@XendraIndex(Name="m_matchpo_ship",Identifier="b3ae2f91-7fe6-f80e-6185-370791ed6550",
Column_Names="c_orderline_id, m_inoutline_id",IsUnique="false",
TableIdentifier="b3ae2f91-7fe6-f80e-6185-370791ed6550",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_matchpo_ship = "b3ae2f91-7fe6-f80e-6185-370791ed6550";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MatchPO");

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
    Table_ID = MTable.getTable_ID("M_MatchPO");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MatchPO[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
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

@XendraTrl(Identifier="7a61f650-817e-6301-4353-d1433c3bba61")
public static String es_PE_FIELD_MatchPO_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="7a61f650-817e-6301-4353-d1433c3bba61")
public static String es_PE_FIELD_MatchPO_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="7a61f650-817e-6301-4353-d1433c3bba61")
public static String es_PE_FIELD_MatchPO_InvoiceLine_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a61f650-817e-6301-4353-d1433c3bba61")
public static final String FIELDNAME_MatchPO_InvoiceLine="7a61f650-817e-6301-4353-d1433c3bba61";

@XendraTrl(Identifier="3a160a53-1099-edc2-9725-6d7d2bec6836")
public static String es_PE_FIELD_MatchedPOs_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="3a160a53-1099-edc2-9725-6d7d2bec6836")
public static String es_PE_FIELD_MatchedPOs_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="3a160a53-1099-edc2-9725-6d7d2bec6836")
public static String es_PE_FIELD_MatchedPOs_InvoiceLine_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a160a53-1099-edc2-9725-6d7d2bec6836")
public static final String FIELDNAME_MatchedPOs_InvoiceLine="3a160a53-1099-edc2-9725-6d7d2bec6836";

@XendraTrl(Identifier="0fea8a61-fd3a-afc5-770d-51f9a7704789")
public static String es_PE_FIELD_MatchedPOs_InvoiceLine2_Description="Item de detalle de factura";

@XendraTrl(Identifier="0fea8a61-fd3a-afc5-770d-51f9a7704789")
public static String es_PE_FIELD_MatchedPOs_InvoiceLine2_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="0fea8a61-fd3a-afc5-770d-51f9a7704789")
public static String es_PE_FIELD_MatchedPOs_InvoiceLine2_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fea8a61-fd3a-afc5-770d-51f9a7704789")
public static final String FIELDNAME_MatchedPOs_InvoiceLine2="0fea8a61-fd3a-afc5-770d-51f9a7704789";

@XendraTrl(Identifier="9f051763-c166-553d-4275-ec0eced4a388")
public static String es_PE_FIELD_Matching_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="9f051763-c166-553d-4275-ec0eced4a388")
public static String es_PE_FIELD_Matching_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="9f051763-c166-553d-4275-ec0eced4a388")
public static String es_PE_FIELD_Matching_InvoiceLine_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f051763-c166-553d-4275-ec0eced4a388")
public static final String FIELDNAME_Matching_InvoiceLine="9f051763-c166-553d-4275-ec0eced4a388";

@XendraTrl(Identifier="a1c769b2-48e4-7c7e-16ca-0ac0f84033ea")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1c769b2-48e4-7c7e-16ca-0ac0f84033ea",
Synchronized="2017-08-05 16:55:15.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID < 1) throw new IllegalArgumentException ("C_OrderLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4f4c5dd-7a08-5c75-b22a-7955bd59f89a")
public static String es_PE_FIELD_MatchPO_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="b4f4c5dd-7a08-5c75-b22a-7955bd59f89a")
public static String es_PE_FIELD_MatchPO_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="b4f4c5dd-7a08-5c75-b22a-7955bd59f89a")
public static String es_PE_FIELD_MatchPO_PurchaseOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4f4c5dd-7a08-5c75-b22a-7955bd59f89a")
public static final String FIELDNAME_MatchPO_PurchaseOrderLine="b4f4c5dd-7a08-5c75-b22a-7955bd59f89a";

@XendraTrl(Identifier="d6314ebc-fa51-4dc8-c922-1145890cd558")
public static String es_PE_FIELD_MatchedPOs_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="d6314ebc-fa51-4dc8-c922-1145890cd558")
public static String es_PE_FIELD_MatchedPOs_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="d6314ebc-fa51-4dc8-c922-1145890cd558")
public static String es_PE_FIELD_MatchedPOs_PurchaseOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6314ebc-fa51-4dc8-c922-1145890cd558")
public static final String FIELDNAME_MatchedPOs_PurchaseOrderLine="d6314ebc-fa51-4dc8-c922-1145890cd558";

@XendraTrl(Identifier="cc1860c0-6331-b5ea-0844-9b5a01360f8b")
public static String es_PE_FIELD_MatchedPOs_PurchaseOrderLine2_Description="Item de orden de compra";

@XendraTrl(Identifier="cc1860c0-6331-b5ea-0844-9b5a01360f8b")
public static String es_PE_FIELD_MatchedPOs_PurchaseOrderLine2_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="cc1860c0-6331-b5ea-0844-9b5a01360f8b")
public static String es_PE_FIELD_MatchedPOs_PurchaseOrderLine2_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc1860c0-6331-b5ea-0844-9b5a01360f8b")
public static final String FIELDNAME_MatchedPOs_PurchaseOrderLine2="cc1860c0-6331-b5ea-0844-9b5a01360f8b";

@XendraTrl(Identifier="09350eba-40a0-e331-d51c-28082e89bd0a")
public static String es_PE_FIELD_Matching_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="09350eba-40a0-e331-d51c-28082e89bd0a")
public static String es_PE_FIELD_Matching_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="09350eba-40a0-e331-d51c-28082e89bd0a")
public static String es_PE_FIELD_Matching_PurchaseOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09350eba-40a0-e331-d51c-28082e89bd0a")
public static final String FIELDNAME_Matching_PurchaseOrderLine="09350eba-40a0-e331-d51c-28082e89bd0a";

@XendraTrl(Identifier="9d803a66-6c76-ed92-c8f7-e02048637ce8")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d803a66-6c76-ed92-c8f7-e02048637ce8",
Synchronized="2017-08-05 16:55:15.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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

@XendraTrl(Identifier="2da70605-9649-1f4b-bc97-2547230b9aab")
public static String es_PE_FIELD_MatchPO_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="2da70605-9649-1f4b-bc97-2547230b9aab")
public static String es_PE_FIELD_MatchPO_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="2da70605-9649-1f4b-bc97-2547230b9aab")
public static String es_PE_FIELD_MatchPO_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2da70605-9649-1f4b-bc97-2547230b9aab")
public static final String FIELDNAME_MatchPO_AccountDate="2da70605-9649-1f4b-bc97-2547230b9aab";

@XendraTrl(Identifier="8baf0ee1-cae6-82bf-8f5f-4aebe77cc8f4")
public static String es_PE_FIELD_MatchedPOs_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="8baf0ee1-cae6-82bf-8f5f-4aebe77cc8f4")
public static String es_PE_FIELD_MatchedPOs_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="8baf0ee1-cae6-82bf-8f5f-4aebe77cc8f4")
public static String es_PE_FIELD_MatchedPOs_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8baf0ee1-cae6-82bf-8f5f-4aebe77cc8f4")
public static final String FIELDNAME_MatchedPOs_AccountDate="8baf0ee1-cae6-82bf-8f5f-4aebe77cc8f4";

@XendraTrl(Identifier="bf02bead-266c-4861-f708-d14d934ab422")
public static String es_PE_FIELD_MatchedPOs_AccountDate2_Description="Fecha contable";

@XendraTrl(Identifier="bf02bead-266c-4861-f708-d14d934ab422")
public static String es_PE_FIELD_MatchedPOs_AccountDate2_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="bf02bead-266c-4861-f708-d14d934ab422")
public static String es_PE_FIELD_MatchedPOs_AccountDate2_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf02bead-266c-4861-f708-d14d934ab422")
public static final String FIELDNAME_MatchedPOs_AccountDate2="bf02bead-266c-4861-f708-d14d934ab422";

@XendraTrl(Identifier="c4fa74a8-a694-e0e7-3091-11ec395d1970")
public static String es_PE_FIELD_Matching_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="c4fa74a8-a694-e0e7-3091-11ec395d1970")
public static String es_PE_FIELD_Matching_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="c4fa74a8-a694-e0e7-3091-11ec395d1970")
public static String es_PE_FIELD_Matching_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4fa74a8-a694-e0e7-3091-11ec395d1970")
public static final String FIELDNAME_Matching_AccountDate="c4fa74a8-a694-e0e7-3091-11ec395d1970";

@XendraTrl(Identifier="1ba0a36c-7bbf-1228-9527-2fe364d61459")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ba0a36c-7bbf-1228-9527-2fe364d61459",
Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="ded81d8b-c140-9cd0-5089-22481aa33cc6")
public static String es_PE_FIELD_MatchPO_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="ded81d8b-c140-9cd0-5089-22481aa33cc6")
public static String es_PE_FIELD_MatchPO_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="ded81d8b-c140-9cd0-5089-22481aa33cc6")
public static String es_PE_FIELD_MatchPO_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ded81d8b-c140-9cd0-5089-22481aa33cc6")
public static final String FIELDNAME_MatchPO_TransactionDate="ded81d8b-c140-9cd0-5089-22481aa33cc6";

@XendraTrl(Identifier="d4769e17-631a-7d5b-b240-40cb4e435d3f")
public static String es_PE_FIELD_MatchedPOs_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="d4769e17-631a-7d5b-b240-40cb4e435d3f")
public static String es_PE_FIELD_MatchedPOs_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="d4769e17-631a-7d5b-b240-40cb4e435d3f")
public static String es_PE_FIELD_MatchedPOs_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4769e17-631a-7d5b-b240-40cb4e435d3f")
public static final String FIELDNAME_MatchedPOs_TransactionDate="d4769e17-631a-7d5b-b240-40cb4e435d3f";

@XendraTrl(Identifier="1247673c-4f16-6327-e874-e193b847d91a")
public static String es_PE_FIELD_MatchedPOs_TransactionDate2_Description="Fecha de la transacción";

@XendraTrl(Identifier="1247673c-4f16-6327-e874-e193b847d91a")
public static String es_PE_FIELD_MatchedPOs_TransactionDate2_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="1247673c-4f16-6327-e874-e193b847d91a")
public static String es_PE_FIELD_MatchedPOs_TransactionDate2_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1247673c-4f16-6327-e874-e193b847d91a")
public static final String FIELDNAME_MatchedPOs_TransactionDate2="1247673c-4f16-6327-e874-e193b847d91a";

@XendraTrl(Identifier="8daaacbe-eaa1-9d97-a40c-15c162b021cc")
public static String es_PE_FIELD_Matching_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="8daaacbe-eaa1-9d97-a40c-15c162b021cc")
public static String es_PE_FIELD_Matching_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="8daaacbe-eaa1-9d97-a40c-15c162b021cc")
public static String es_PE_FIELD_Matching_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8daaacbe-eaa1-9d97-a40c-15c162b021cc")
public static final String FIELDNAME_Matching_TransactionDate="8daaacbe-eaa1-9d97-a40c-15c162b021cc";

@XendraTrl(Identifier="f81cbef3-079f-795a-11e7-d56deaa05038")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f81cbef3-079f-795a-11e7-d56deaa05038",
Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="804850d8-1106-f3f9-0ac9-9e53960db22d")
public static String es_PE_FIELD_MatchPO_Description_Description="Observación";

@XendraTrl(Identifier="804850d8-1106-f3f9-0ac9-9e53960db22d")
public static String es_PE_FIELD_MatchPO_Description_Help="Observación";

@XendraTrl(Identifier="804850d8-1106-f3f9-0ac9-9e53960db22d")
public static String es_PE_FIELD_MatchPO_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="804850d8-1106-f3f9-0ac9-9e53960db22d")
public static final String FIELDNAME_MatchPO_Description="804850d8-1106-f3f9-0ac9-9e53960db22d";

@XendraTrl(Identifier="a7bbe211-6662-53c5-d4bd-cff53af52961")
public static String es_PE_FIELD_Matching_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="a7bbe211-6662-53c5-d4bd-cff53af52961")
public static String es_PE_FIELD_Matching_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="a7bbe211-6662-53c5-d4bd-cff53af52961")
public static String es_PE_FIELD_Matching_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7bbe211-6662-53c5-d4bd-cff53af52961")
public static final String FIELDNAME_Matching_Description="a7bbe211-6662-53c5-d4bd-cff53af52961";

@XendraTrl(Identifier="e3ace2cf-fbbe-3d68-b76d-91a48f8868e2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="e3ace2cf-fbbe-3d68-b76d-91a48f8868e2",
Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="a39504ef-7523-319e-e7f9-df880e7112c5")
public static String es_PE_FIELD_MatchPO_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="a39504ef-7523-319e-e7f9-df880e7112c5")
public static String es_PE_FIELD_MatchPO_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="a39504ef-7523-319e-e7f9-df880e7112c5")
public static String es_PE_FIELD_MatchPO_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a39504ef-7523-319e-e7f9-df880e7112c5")
public static final String FIELDNAME_MatchPO_DocumentNo="a39504ef-7523-319e-e7f9-df880e7112c5";

@XendraTrl(Identifier="200938eb-6890-fa64-8fc9-c9655286150c")
public static String es_PE_FIELD_MatchedPOs_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="200938eb-6890-fa64-8fc9-c9655286150c")
public static String es_PE_FIELD_MatchedPOs_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="200938eb-6890-fa64-8fc9-c9655286150c")
public static String es_PE_FIELD_MatchedPOs_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="200938eb-6890-fa64-8fc9-c9655286150c")
public static final String FIELDNAME_MatchedPOs_DocumentNo="200938eb-6890-fa64-8fc9-c9655286150c";

@XendraTrl(Identifier="1070b91e-37ad-d093-0c47-4b4094ef4baa")
public static String es_PE_FIELD_MatchedPOs_DocumentNo2_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="1070b91e-37ad-d093-0c47-4b4094ef4baa")
public static String es_PE_FIELD_MatchedPOs_DocumentNo2_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="1070b91e-37ad-d093-0c47-4b4094ef4baa")
public static String es_PE_FIELD_MatchedPOs_DocumentNo2_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1070b91e-37ad-d093-0c47-4b4094ef4baa")
public static final String FIELDNAME_MatchedPOs_DocumentNo2="1070b91e-37ad-d093-0c47-4b4094ef4baa";

@XendraTrl(Identifier="9242bb3e-b6fb-a0e2-7b08-57ba151405d1")
public static String es_PE_FIELD_Matching_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="9242bb3e-b6fb-a0e2-7b08-57ba151405d1")
public static String es_PE_FIELD_Matching_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="9242bb3e-b6fb-a0e2-7b08-57ba151405d1")
public static String es_PE_FIELD_Matching_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9242bb3e-b6fb-a0e2-7b08-57ba151405d1")
public static final String FIELDNAME_Matching_DocumentNo="9242bb3e-b6fb-a0e2-7b08-57ba151405d1";

@XendraTrl(Identifier="13ffb920-aa59-aea2-992e-7723fd3b9d04")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13ffb920-aa59-aea2-992e-7723fd3b9d04",
Synchronized="2017-08-05 16:55:15.0")
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
@XendraTrl(Identifier="d4f4fba6-fdfa-4603-ba31-e24be59de111")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4f4fba6-fdfa-4603-ba31-e24be59de111",
Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="153b7719-8ba4-9f1e-3caf-9b2e46486ed3")
public static String es_PE_FIELD_MatchPO_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="153b7719-8ba4-9f1e-3caf-9b2e46486ed3")
public static String es_PE_FIELD_MatchPO_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="153b7719-8ba4-9f1e-3caf-9b2e46486ed3")
public static String es_PE_FIELD_MatchPO_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="153b7719-8ba4-9f1e-3caf-9b2e46486ed3")
public static final String FIELDNAME_MatchPO_Approved="153b7719-8ba4-9f1e-3caf-9b2e46486ed3";

@XendraTrl(Identifier="cfda69a2-40ee-28c3-cf78-d652d7c9dca2")
public static String es_PE_FIELD_Matching_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="cfda69a2-40ee-28c3-cf78-d652d7c9dca2")
public static String es_PE_FIELD_Matching_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="cfda69a2-40ee-28c3-cf78-d652d7c9dca2")
public static String es_PE_FIELD_Matching_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfda69a2-40ee-28c3-cf78-d652d7c9dca2")
public static final String FIELDNAME_Matching_Approved="cfda69a2-40ee-28c3-cf78-d652d7c9dca2";

@XendraTrl(Identifier="008d90ea-e8bd-d1ba-c122-66587c1e27af")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@IsApproved@=Y",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="008d90ea-e8bd-d1ba-c122-66587c1e27af",Synchronized="2017-08-05 16:55:15.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
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

@XendraTrl(Identifier="2da606f4-3fcf-c1df-ab33-26df12ad68a4")
public static String es_PE_FIELD_MatchPO_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="2da606f4-3fcf-c1df-ab33-26df12ad68a4")
public static String es_PE_FIELD_MatchPO_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="2da606f4-3fcf-c1df-ab33-26df12ad68a4")
public static String es_PE_FIELD_MatchPO_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2da606f4-3fcf-c1df-ab33-26df12ad68a4")
public static final String FIELDNAME_MatchPO_AttributeSetInstance="2da606f4-3fcf-c1df-ab33-26df12ad68a4";

@XendraTrl(Identifier="1aa5e5d8-40a6-4e5a-4d84-f7961fca7a86")
public static String es_PE_FIELD_MatchedPOs_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="1aa5e5d8-40a6-4e5a-4d84-f7961fca7a86")
public static String es_PE_FIELD_MatchedPOs_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="1aa5e5d8-40a6-4e5a-4d84-f7961fca7a86")
public static String es_PE_FIELD_MatchedPOs_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1aa5e5d8-40a6-4e5a-4d84-f7961fca7a86")
public static final String FIELDNAME_MatchedPOs_AttributeSetInstance="1aa5e5d8-40a6-4e5a-4d84-f7961fca7a86";

@XendraTrl(Identifier="6047760b-09c9-9f50-8a1e-e8cfa1ab72dd")
public static String es_PE_FIELD_MatchedPOs_AttributeSetInstance2_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="6047760b-09c9-9f50-8a1e-e8cfa1ab72dd")
public static String es_PE_FIELD_MatchedPOs_AttributeSetInstance2_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="6047760b-09c9-9f50-8a1e-e8cfa1ab72dd")
public static String es_PE_FIELD_MatchedPOs_AttributeSetInstance2_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6047760b-09c9-9f50-8a1e-e8cfa1ab72dd")
public static final String FIELDNAME_MatchedPOs_AttributeSetInstance2="6047760b-09c9-9f50-8a1e-e8cfa1ab72dd";

@XendraTrl(Identifier="44eab204-8178-74eb-a3e3-3f1f3f285861")
public static String es_PE_FIELD_Matching_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="44eab204-8178-74eb-a3e3-3f1f3f285861")
public static String es_PE_FIELD_Matching_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="44eab204-8178-74eb-a3e3-3f1f3f285861")
public static String es_PE_FIELD_Matching_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44eab204-8178-74eb-a3e3-3f1f3f285861")
public static final String FIELDNAME_Matching_AttributeSetInstance="44eab204-8178-74eb-a3e3-3f1f3f285861";

@XendraTrl(Identifier="e661b752-6480-e677-04d9-4937c05e3ec4")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e661b752-6480-e677-04d9-4937c05e3ec4",
Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="ff879979-8e69-4ece-e089-b1e02d16bb99")
public static String es_PE_FIELD_MatchPO_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="ff879979-8e69-4ece-e089-b1e02d16bb99")
public static String es_PE_FIELD_MatchPO_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="ff879979-8e69-4ece-e089-b1e02d16bb99")
public static String es_PE_FIELD_MatchPO_ReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff879979-8e69-4ece-e089-b1e02d16bb99")
public static final String FIELDNAME_MatchPO_ReceiptLine="ff879979-8e69-4ece-e089-b1e02d16bb99";

@XendraTrl(Identifier="ae15a449-1c0d-b8ee-7e46-f23ce6b49a44")
public static String es_PE_FIELD_MatchedPOs_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="ae15a449-1c0d-b8ee-7e46-f23ce6b49a44")
public static String es_PE_FIELD_MatchedPOs_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="ae15a449-1c0d-b8ee-7e46-f23ce6b49a44")
public static String es_PE_FIELD_MatchedPOs_ReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae15a449-1c0d-b8ee-7e46-f23ce6b49a44")
public static final String FIELDNAME_MatchedPOs_ReceiptLine="ae15a449-1c0d-b8ee-7e46-f23ce6b49a44";

@XendraTrl(Identifier="3e9efbfc-da6a-838f-ced6-8977af5053d1")
public static String es_PE_FIELD_MatchedPOs_ReceiptLine2_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="3e9efbfc-da6a-838f-ced6-8977af5053d1")
public static String es_PE_FIELD_MatchedPOs_ReceiptLine2_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="3e9efbfc-da6a-838f-ced6-8977af5053d1")
public static String es_PE_FIELD_MatchedPOs_ReceiptLine2_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e9efbfc-da6a-838f-ced6-8977af5053d1")
public static final String FIELDNAME_MatchedPOs_ReceiptLine2="3e9efbfc-da6a-838f-ced6-8977af5053d1";

@XendraTrl(Identifier="98afab00-ad91-65e5-d680-40ba088d997a")
public static String es_PE_FIELD_Matching_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="98afab00-ad91-65e5-d680-40ba088d997a")
public static String es_PE_FIELD_Matching_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="98afab00-ad91-65e5-d680-40ba088d997a")
public static String es_PE_FIELD_Matching_ReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98afab00-ad91-65e5-d680-40ba088d997a")
public static final String FIELDNAME_Matching_ReceiptLine="98afab00-ad91-65e5-d680-40ba088d997a";

@XendraTrl(Identifier="7a005ed4-a339-b2d3-873d-b9bd666d8454")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a005ed4-a339-b2d3-873d-b9bd666d8454",
Synchronized="2017-08-05 16:55:15.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Match PO.
@param M_MatchPO_ID Match Purchase Order to Shipment/Receipt and Invoice */
public void setM_MatchPO_ID (int M_MatchPO_ID)
{
if (M_MatchPO_ID < 1) throw new IllegalArgumentException ("M_MatchPO_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MatchPO_ID, Integer.valueOf(M_MatchPO_ID));
}
/** Get Match PO.
@return Match Purchase Order to Shipment/Receipt and Invoice */
public int getM_MatchPO_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MatchPO_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e80004ab-51c4-ecc0-5da2-df63c5e8a583")
public static String es_PE_FIELD_MatchPO_MatchPO_Description="Corresponder OC con entrega / recibo";

@XendraTrl(Identifier="e80004ab-51c4-ecc0-5da2-df63c5e8a583")
public static String es_PE_FIELD_MatchPO_MatchPO_Name="Corresponder OC";

@XendraField(AD_Column_ID="M_MatchPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e80004ab-51c4-ecc0-5da2-df63c5e8a583")
public static final String FIELDNAME_MatchPO_MatchPO="e80004ab-51c4-ecc0-5da2-df63c5e8a583";

@XendraTrl(Identifier="f0004da2-a315-4e18-cc32-fe4c9eb89957")
public static String es_PE_FIELD_MatchedPOs_MatchPO_Description="Corresponder OC con entrega / recibo";

@XendraTrl(Identifier="f0004da2-a315-4e18-cc32-fe4c9eb89957")
public static String es_PE_FIELD_MatchedPOs_MatchPO_Name="Corresponder OC";

@XendraField(AD_Column_ID="M_MatchPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0004da2-a315-4e18-cc32-fe4c9eb89957")
public static final String FIELDNAME_MatchedPOs_MatchPO="f0004da2-a315-4e18-cc32-fe4c9eb89957";

@XendraTrl(Identifier="89017721-22e0-7df4-1f25-e82f9c3168c2")
public static String es_PE_FIELD_MatchedPOs_MatchPO2_Description="Corresponder OC con entrega / recibo";

@XendraTrl(Identifier="89017721-22e0-7df4-1f25-e82f9c3168c2")
public static String es_PE_FIELD_MatchedPOs_MatchPO2_Name="Corresponder OC";

@XendraField(AD_Column_ID="M_MatchPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89017721-22e0-7df4-1f25-e82f9c3168c2")
public static final String FIELDNAME_MatchedPOs_MatchPO2="89017721-22e0-7df4-1f25-e82f9c3168c2";

@XendraTrl(Identifier="a3f8badb-305a-5b00-c7fe-871b94edbac0")
public static String es_PE_FIELD_Matching_MatchPO_Description="Corresponder OC con entrega / recibo";

@XendraTrl(Identifier="a3f8badb-305a-5b00-c7fe-871b94edbac0")
public static String es_PE_FIELD_Matching_MatchPO_Name="Corresponder OC";

@XendraField(AD_Column_ID="M_MatchPO_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3f8badb-305a-5b00-c7fe-871b94edbac0")
public static final String FIELDNAME_Matching_MatchPO="a3f8badb-305a-5b00-c7fe-871b94edbac0";
/** Column name M_MatchPO_ID */
public static final String COLUMNNAME_M_MatchPO_ID = "M_MatchPO_ID";
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

@XendraTrl(Identifier="f59c252f-bdf0-08c9-f95b-414b9788f41d")
public static String es_PE_FIELD_MatchPO_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="f59c252f-bdf0-08c9-f95b-414b9788f41d")
public static String es_PE_FIELD_MatchPO_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="f59c252f-bdf0-08c9-f95b-414b9788f41d")
public static String es_PE_FIELD_MatchPO_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f59c252f-bdf0-08c9-f95b-414b9788f41d")
public static final String FIELDNAME_MatchPO_Product="f59c252f-bdf0-08c9-f95b-414b9788f41d";

@XendraTrl(Identifier="2b764a0c-58bc-4592-ab96-de2b8a7eb352")
public static String es_PE_FIELD_MatchedPOs_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="2b764a0c-58bc-4592-ab96-de2b8a7eb352")
public static String es_PE_FIELD_MatchedPOs_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="2b764a0c-58bc-4592-ab96-de2b8a7eb352")
public static String es_PE_FIELD_MatchedPOs_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b764a0c-58bc-4592-ab96-de2b8a7eb352")
public static final String FIELDNAME_MatchedPOs_Product="2b764a0c-58bc-4592-ab96-de2b8a7eb352";

@XendraTrl(Identifier="04c70819-d155-e005-f907-287d62e6b3d7")
public static String es_PE_FIELD_MatchedPOs_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="04c70819-d155-e005-f907-287d62e6b3d7")
public static String es_PE_FIELD_MatchedPOs_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="04c70819-d155-e005-f907-287d62e6b3d7")
public static String es_PE_FIELD_MatchedPOs_Product2_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04c70819-d155-e005-f907-287d62e6b3d7")
public static final String FIELDNAME_MatchedPOs_Product2="04c70819-d155-e005-f907-287d62e6b3d7";

@XendraTrl(Identifier="5a655dc6-120b-251f-20b5-faa53d23cd2e")
public static String es_PE_FIELD_Matching_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="5a655dc6-120b-251f-20b5-faa53d23cd2e")
public static String es_PE_FIELD_Matching_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="5a655dc6-120b-251f-20b5-faa53d23cd2e")
public static String es_PE_FIELD_Matching_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a655dc6-120b-251f-20b5-faa53d23cd2e")
public static final String FIELDNAME_Matching_Product="5a655dc6-120b-251f-20b5-faa53d23cd2e";

@XendraTrl(Identifier="088fa103-80ce-aa83-7499-1c12e096eab3")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="088fa103-80ce-aa83-7499-1c12e096eab3",Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="f3e6d2de-6875-17d7-b3b5-6fc9f1a55fbe")
public static String es_PE_FIELD_MatchPO_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="f3e6d2de-6875-17d7-b3b5-6fc9f1a55fbe")
public static String es_PE_FIELD_MatchPO_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="f3e6d2de-6875-17d7-b3b5-6fc9f1a55fbe")
public static String es_PE_FIELD_MatchPO_Posted_Name="Fijada";
@XendraField(AD_Column_ID="Posted",
IsCentrallyMaintained=true,AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="@Processed@=Y",DisplayLength=23,IsReadOnly=true,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f3e6d2de-6875-17d7-b3b5-6fc9f1a55fbe")
public static final String FIELDNAME_MatchPO_Posted="f3e6d2de-6875-17d7-b3b5-6fc9f1a55fbe";

@XendraTrl(Identifier="9c0b3d08-ef1d-8498-323f-b989876545d5")
public static String es_PE_FIELD_MatchedPOs_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="9c0b3d08-ef1d-8498-323f-b989876545d5")
public static String es_PE_FIELD_MatchedPOs_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="9c0b3d08-ef1d-8498-323f-b989876545d5")
public static String es_PE_FIELD_MatchedPOs_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c0b3d08-ef1d-8498-323f-b989876545d5")
public static final String FIELDNAME_MatchedPOs_Posted="9c0b3d08-ef1d-8498-323f-b989876545d5";

@XendraTrl(Identifier="077ce78c-4452-af5a-ec54-e39d7c191a44")
public static String es_PE_FIELD_MatchedPOs_Posted2_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="077ce78c-4452-af5a-ec54-e39d7c191a44")
public static String es_PE_FIELD_MatchedPOs_Posted2_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="077ce78c-4452-af5a-ec54-e39d7c191a44")
public static String es_PE_FIELD_MatchedPOs_Posted2_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="077ce78c-4452-af5a-ec54-e39d7c191a44")
public static final String FIELDNAME_MatchedPOs_Posted2="077ce78c-4452-af5a-ec54-e39d7c191a44";

@XendraTrl(Identifier="91ea4eb6-01e3-eabf-9ab6-68471c3bf3df")
public static String es_PE_FIELD_Matching_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="91ea4eb6-01e3-eabf-9ab6-68471c3bf3df")
public static String es_PE_FIELD_Matching_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="91ea4eb6-01e3-eabf-9ab6-68471c3bf3df")
public static String es_PE_FIELD_Matching_Posted_Name="Fijada";
@XendraField(AD_Column_ID="Posted",
IsCentrallyMaintained=true,AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="91ea4eb6-01e3-eabf-9ab6-68471c3bf3df")
public static final String FIELDNAME_Matching_Posted="91ea4eb6-01e3-eabf-9ab6-68471c3bf3df";

@XendraTrl(Identifier="8152c278-e60c-880c-4469-ec9486d66bba")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8152c278-e60c-880c-4469-ec9486d66bba",Synchronized="2017-08-05 16:55:15.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
/** Set Price Match Difference.
@param PriceMatchDifference Difference between Purchase and Invoice Price per matched line */
public void setPriceMatchDifference (BigDecimal PriceMatchDifference)
{
set_Value (COLUMNNAME_PriceMatchDifference, PriceMatchDifference);
}
/** Get Price Match Difference.
@return Difference between Purchase and Invoice Price per matched line */
public BigDecimal getPriceMatchDifference() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceMatchDifference);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="89d430a4-b036-6899-8c45-d5da1169c565")
public static String es_PE_FIELD_MatchPO_PriceMatchDifference_Description="Diferencia entre Precio de Compra y Precio Facturado por línea cotejada ";

@XendraTrl(Identifier="89d430a4-b036-6899-8c45-d5da1169c565")
public static String es_PE_FIELD_MatchPO_PriceMatchDifference_Help="La diferencia entre Precio de Compra y Precio Facturado puede ser empleada  para requerir aprobación explícita, si es definida una Tolerancia de Precio Cotejado en Nível Grupo Socio del Negocio.";

@XendraTrl(Identifier="89d430a4-b036-6899-8c45-d5da1169c565")
public static String es_PE_FIELD_MatchPO_PriceMatchDifference_Name="Précio Cotejar Diferencia";

@XendraField(AD_Column_ID="PriceMatchDifference",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89d430a4-b036-6899-8c45-d5da1169c565")
public static final String FIELDNAME_MatchPO_PriceMatchDifference="89d430a4-b036-6899-8c45-d5da1169c565";

@XendraTrl(Identifier="f276092d-02fe-dbb0-d7e5-6b0ce8e09ac5")
public static String es_PE_FIELD_Matching_PriceMatchDifference_Description="Diferencia entre Precio de Compra y Precio Facturado por línea cotejada ";

@XendraTrl(Identifier="f276092d-02fe-dbb0-d7e5-6b0ce8e09ac5")
public static String es_PE_FIELD_Matching_PriceMatchDifference_Help="La diferencia entre Precio de Compra y Precio Facturado puede ser empleada  para requerir aprobación explícita, si es definida una Tolerancia de Precio Cotejado en Nível Grupo Socio del Negocio.";

@XendraTrl(Identifier="f276092d-02fe-dbb0-d7e5-6b0ce8e09ac5")
public static String es_PE_FIELD_Matching_PriceMatchDifference_Name="Précio Cotejar Diferencia";

@XendraField(AD_Column_ID="PriceMatchDifference",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f276092d-02fe-dbb0-d7e5-6b0ce8e09ac5")
public static final String FIELDNAME_Matching_PriceMatchDifference="f276092d-02fe-dbb0-d7e5-6b0ce8e09ac5";

@XendraTrl(Identifier="3141126d-0374-b761-ca52-1f334e4e8eab")
public static String es_PE_COLUMN_PriceMatchDifference_Name="Précio Cotejar Diferencia";

@XendraColumn(AD_Element_ID="028f47d0-58b4-7327-bbf8-632b86920e8a",
ColumnName="PriceMatchDifference",AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3141126d-0374-b761-ca52-1f334e4e8eab",Synchronized="2017-08-05 16:55:15.0")
/** Column name PriceMatchDifference */
public static final String COLUMNNAME_PriceMatchDifference = "PriceMatchDifference";
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

@XendraTrl(Identifier="0422f86c-848a-e76c-71cc-20fa21b43c84")
public static String es_PE_FIELD_MatchPO_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="0422f86c-848a-e76c-71cc-20fa21b43c84")
public static String es_PE_FIELD_MatchPO_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="0422f86c-848a-e76c-71cc-20fa21b43c84")
public static String es_PE_FIELD_MatchPO_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0422f86c-848a-e76c-71cc-20fa21b43c84")
public static final String FIELDNAME_MatchPO_Processed="0422f86c-848a-e76c-71cc-20fa21b43c84";

@XendraTrl(Identifier="9d136ee9-c1bc-e8de-dcb4-58c5de3273ae")
public static String es_PE_FIELD_MatchedPOs_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="9d136ee9-c1bc-e8de-dcb4-58c5de3273ae")
public static String es_PE_FIELD_MatchedPOs_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="9d136ee9-c1bc-e8de-dcb4-58c5de3273ae")
public static String es_PE_FIELD_MatchedPOs_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d136ee9-c1bc-e8de-dcb4-58c5de3273ae")
public static final String FIELDNAME_MatchedPOs_Processed="9d136ee9-c1bc-e8de-dcb4-58c5de3273ae";

@XendraTrl(Identifier="aecd8451-494e-fd62-8cd9-0da823984817")
public static String es_PE_FIELD_MatchedPOs_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="aecd8451-494e-fd62-8cd9-0da823984817")
public static String es_PE_FIELD_MatchedPOs_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="aecd8451-494e-fd62-8cd9-0da823984817")
public static String es_PE_FIELD_MatchedPOs_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aecd8451-494e-fd62-8cd9-0da823984817")
public static final String FIELDNAME_MatchedPOs_Processed2="aecd8451-494e-fd62-8cd9-0da823984817";

@XendraTrl(Identifier="a266414a-e004-082e-e2e1-98733eefdcf5")
public static String es_PE_FIELD_Matching_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a266414a-e004-082e-e2e1-98733eefdcf5")
public static String es_PE_FIELD_Matching_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="a266414a-e004-082e-e2e1-98733eefdcf5")
public static String es_PE_FIELD_Matching_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a266414a-e004-082e-e2e1-98733eefdcf5")
public static final String FIELDNAME_Matching_Processed="a266414a-e004-082e-e2e1-98733eefdcf5";

@XendraTrl(Identifier="83afd494-b051-2531-208f-f666b906e33f")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83afd494-b051-2531-208f-f666b906e33f",
Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="6b491559-bd02-32a6-bccc-114776b88979")
public static String es_PE_FIELD_MatchPO_ProcessNow_Description="Deshacer correspondencia de registros de Ordenes de Compra.";

@XendraTrl(Identifier="6b491559-bd02-32a6-bccc-114776b88979")
public static String es_PE_FIELD_MatchPO_ProcessNow_Name="Borra";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b491559-bd02-32a6-bccc-114776b88979")
public static final String FIELDNAME_MatchPO_ProcessNow="6b491559-bd02-32a6-bccc-114776b88979";

@XendraTrl(Identifier="6d6f8496-49d5-79da-829b-d77f1d4e35eb")
public static String es_PE_FIELD_MatchedPOs_ProcessNow_Description="Deshacer correspondencia de registros de Ordenes de Compra.";

@XendraTrl(Identifier="6d6f8496-49d5-79da-829b-d77f1d4e35eb")
public static String es_PE_FIELD_MatchedPOs_ProcessNow_Name="Borra";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d6f8496-49d5-79da-829b-d77f1d4e35eb")
public static final String FIELDNAME_MatchedPOs_ProcessNow="6d6f8496-49d5-79da-829b-d77f1d4e35eb";

@XendraTrl(Identifier="e4cceede-b5b3-10c9-c0e2-8b311cb28b9c")
public static String es_PE_FIELD_MatchedPOs_ProcessNow2_Description="Deshacer correspondencia de registros de Ordenes de Compra.";

@XendraTrl(Identifier="e4cceede-b5b3-10c9-c0e2-8b311cb28b9c")
public static String es_PE_FIELD_MatchedPOs_ProcessNow2_Name="Borra";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4cceede-b5b3-10c9-c0e2-8b311cb28b9c")
public static final String FIELDNAME_MatchedPOs_ProcessNow2="e4cceede-b5b3-10c9-c0e2-8b311cb28b9c";

@XendraTrl(Identifier="ba5c5ea9-e8a1-948c-9f71-bcbcbd4367ee")
public static String es_PE_FIELD_Matching_ProcessNow_Description="Deshacer correspondencia de registros de Ordenes de Compra.";

@XendraTrl(Identifier="ba5c5ea9-e8a1-948c-9f71-bcbcbd4367ee")
public static String es_PE_FIELD_Matching_ProcessNow_Name="Borra";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba5c5ea9-e8a1-948c-9f71-bcbcbd4367ee")
public static final String FIELDNAME_Matching_ProcessNow="ba5c5ea9-e8a1-948c-9f71-bcbcbd4367ee";

@XendraTrl(Identifier="19a9af70-dbc8-a99e-96b1-ca727c65188a")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="2b56348e-2620-2a6e-82f4-ce7c213dddec",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="19a9af70-dbc8-a99e-96b1-ca727c65188a",Synchronized="2017-08-05 16:55:15.0")
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

@XendraTrl(Identifier="fc2bf1f6-7242-a51d-c8f2-93403a58512a")
public static String es_PE_FIELD_MatchPO_Quantity_Description="Cantidad";

@XendraTrl(Identifier="fc2bf1f6-7242-a51d-c8f2-93403a58512a")
public static String es_PE_FIELD_MatchPO_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="fc2bf1f6-7242-a51d-c8f2-93403a58512a")
public static String es_PE_FIELD_MatchPO_Quantity_Name="Cantidad";
@XendraField(AD_Column_ID="Qty",
IsCentrallyMaintained=true,AD_Tab_ID="9764d368-480f-6552-5716-6cbd71358d02",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fc2bf1f6-7242-a51d-c8f2-93403a58512a")
public static final String FIELDNAME_MatchPO_Quantity="fc2bf1f6-7242-a51d-c8f2-93403a58512a";

@XendraTrl(Identifier="bebea3fc-2c94-3e3b-d4eb-d22b798fdde8")
public static String es_PE_FIELD_MatchedPOs_Quantity_Description="Cantidad";

@XendraTrl(Identifier="bebea3fc-2c94-3e3b-d4eb-d22b798fdde8")
public static String es_PE_FIELD_MatchedPOs_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="bebea3fc-2c94-3e3b-d4eb-d22b798fdde8")
public static String es_PE_FIELD_MatchedPOs_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="8e83d44e-90e3-2ecd-ee7e-8ddb41eab006",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bebea3fc-2c94-3e3b-d4eb-d22b798fdde8")
public static final String FIELDNAME_MatchedPOs_Quantity="bebea3fc-2c94-3e3b-d4eb-d22b798fdde8";

@XendraTrl(Identifier="a4914bc4-5b3d-20c3-f163-d0103a652442")
public static String es_PE_FIELD_MatchedPOs_Quantity2_Description="Cantidad";

@XendraTrl(Identifier="a4914bc4-5b3d-20c3-f163-d0103a652442")
public static String es_PE_FIELD_MatchedPOs_Quantity2_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="a4914bc4-5b3d-20c3-f163-d0103a652442")
public static String es_PE_FIELD_MatchedPOs_Quantity2_Name="Cantidad";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="521b8407-fc2e-841f-5784-ed49e5139bc9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4914bc4-5b3d-20c3-f163-d0103a652442")
public static final String FIELDNAME_MatchedPOs_Quantity2="a4914bc4-5b3d-20c3-f163-d0103a652442";

@XendraTrl(Identifier="cc8cea3c-b9b3-e2f9-6d80-61c413b93459")
public static String es_PE_FIELD_Matching_Quantity_Description="Cantidad";

@XendraTrl(Identifier="cc8cea3c-b9b3-e2f9-6d80-61c413b93459")
public static String es_PE_FIELD_Matching_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="cc8cea3c-b9b3-e2f9-6d80-61c413b93459")
public static String es_PE_FIELD_Matching_Quantity_Name="Cantidad";
@XendraField(AD_Column_ID="Qty",
IsCentrallyMaintained=true,AD_Tab_ID="9689049e-57a3-b7b0-a55b-153ce0ded065",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cc8cea3c-b9b3-e2f9-6d80-61c413b93459")
public static final String FIELDNAME_Matching_Quantity="cc8cea3c-b9b3-e2f9-6d80-61c413b93459";

@XendraTrl(Identifier="427b8280-9692-140f-518d-cfb06cd7df76")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="427b8280-9692-140f-518d-cfb06cd7df76",
Synchronized="2017-08-05 16:55:15.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
