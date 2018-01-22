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
/** Generated Model for C_OrderLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_OrderLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_OrderLine_ID id
@param trxName transaction
*/
public X_C_OrderLine (Properties ctx, int C_OrderLine_ID, String trxName)
{
super (ctx, C_OrderLine_ID, trxName);
/** if (C_OrderLine_ID == 0)
{
setC_BPartner_Location_ID (0);	
// @C_BPartner_Location_ID@
setC_Currency_ID (0);	
// @C_Currency_ID@
setC_Order_ID (0);
setC_OrderLine_ID (0);
setC_Tax_ID (0);
setC_UOM_ID (0);	
// @#C_UOM_ID@
setDateOrdered (new Timestamp(System.currentTimeMillis()));	
// @DateOrdered@
setFreightAmt (Env.ZERO);	
// 0
setIsBonus (false);	
// N
setIsDescription (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_OrderLine WHERE C_Order_ID=@C_Order_ID@
setLineNetAmt (Env.ZERO);	
// 0
setM_AttributeSetInstance_ID (0);
setM_Warehouse_ID (0);	
// @M_Warehouse_ID@
setPriceActual (Env.ZERO);
setPriceEntered (Env.ZERO);
setPriceLimit (Env.ZERO);
setPriceList (Env.ZERO);
setProcessed (false);	
// N
setQtyDelivered (Env.ZERO);
setQtyEntered (Env.ZERO);	
// 1
setQtyInvoiced (Env.ZERO);
setQtyLostSales (Env.ZERO);
setQtyOrdered (Env.ZERO);	
// 1
setQtyReserved (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_OrderLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=260 */
public static int Table_ID=MTable.getTable_ID("C_OrderLine");

@XendraTrl(Identifier="aafba160-c717-057a-2cb5-f6a790af27de")
public static String es_PE_TAB_OrderLines_Description="Toda la línea de orden donde el agente \"posee\" la orden, el socio de negocio ó el producto";

@XendraTrl(Identifier="aafba160-c717-057a-2cb5-f6a790af27de")
public static String es_PE_TAB_OrderLines_Name="Orden Lineas";
@XendraTab(Name="Order Lines",
Description="All Order Lines where the Agent 'owns' the Order, the Business Partner or the Product",
Help="",AD_Window_ID="a9894ddd-fe3c-1c33-44c9-6f79a11cde9e",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="f2e58dae-f941-449b-b8f1-42f9e482b47b",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="aafba160-c717-057a-2cb5-f6a790af27de",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrderLines="aafba160-c717-057a-2cb5-f6a790af27de";

@XendraTrl(Identifier="f2ef4599-94d1-56b4-dd16-7408e751b1cd")
public static String es_PE_TAB_POLine_Description="Ìtem de la Orden";

@XendraTrl(Identifier="f2ef4599-94d1-56b4-dd16-7408e751b1cd")
public static String es_PE_TAB_POLine_Name="Ìtem Orden Compra";

@XendraTrl(Identifier="f2ef4599-94d1-56b4-dd16-7408e751b1cd")
public static String es_PE_TAB_POLine_Help="La pestaña Ìtem de la Orden define cada ítem de una orden.";

@XendraTab(Name="PO Line",Description="Purchase Order Line",
Help="The Purchase Order Line Tab defines the individual items in an order.",
AD_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f2ef4599-94d1-56b4-dd16-7408e751b1cd",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_POLine="f2ef4599-94d1-56b4-dd16-7408e751b1cd";

@XendraTrl(Identifier="860d73f5-603c-30fb-2a42-ea6f43f02b20")
public static String es_PE_TAB_OrderLine_Description="Ìtem de la Orden";

@XendraTrl(Identifier="860d73f5-603c-30fb-2a42-ea6f43f02b20")
public static String es_PE_TAB_OrderLine_Name="Ìtem de la Orden";

@XendraTrl(Identifier="860d73f5-603c-30fb-2a42-ea6f43f02b20")
public static String es_PE_TAB_OrderLine_Help="La pestaña de Ìtem de la orden define cada ítem individual que comprende una orden.";

@XendraTab(Name="Order Line",Description="Order Line",
Help="The Order Line Tab defines the individual line items that comprise an Order.",
AD_Window_ID="c6b21e03-9b7e-a7c6-27ff-50703fd13562",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="860d73f5-603c-30fb-2a42-ea6f43f02b20",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrderLine="860d73f5-603c-30fb-2a42-ea6f43f02b20";

@XendraTrl(Identifier="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4")
public static String es_PE_TAB_PurchaseOrders_Description="Ordenes de Compra Relacionadas";

@XendraTrl(Identifier="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4")
public static String es_PE_TAB_PurchaseOrders_Name="Ordenes de Compra";

@XendraTab(Name="Purchase Orders",Description="Related Purchase Orders",Help="",
AD_Window_ID="f15d0d2b-f9e2-c40d-7ba7-3c3f33dcaa08",SeqNo=30,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="f7005019-e4bb-cde9-3f9a-f0359fc55964",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PurchaseOrders="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4";

@XendraTrl(Identifier="1bd497f4-865f-36e8-19c3-549c1ea01882")
public static String es_PE_TABLE_C_OrderLine_Name="Línea";

@XendraTable(Name="Sales Order Line",Description="Sales Order Line",Help="",
TableName="C_OrderLine",AccessLevel="1",AD_Window_ID="c6b21e03-9b7e-a7c6-27ff-50703fd13562",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=115,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",
ID="org.xendra.commercial",Identifier="1bd497f4-865f-36e8-19c3-549c1ea01882",
Synchronized="2017-08-16 11:42:04.0")
/** TableName=C_OrderLine */
public static final String Table_Name="C_OrderLine";


@XendraIndex(Name="c_orderline_product",Identifier="962cd61a-a6a2-adec-9303-ed6407309dcb",
Column_Names="m_product_id",IsUnique="false",
TableIdentifier="962cd61a-a6a2-adec-9303-ed6407309dcb",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_orderline_product = "962cd61a-a6a2-adec-9303-ed6407309dcb";


@XendraIndex(Name="c_orderline_order",Identifier="f0b39281-d36e-2898-e6bf-10cd6f9bc2f1",
Column_Names="c_order_id",IsUnique="false",TableIdentifier="f0b39281-d36e-2898-e6bf-10cd6f9bc2f1",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_orderline_order = "f0b39281-d36e-2898-e6bf-10cd6f9bc2f1";


@XendraIndex(Name="c_orderline_identifier",Identifier="ef1177fb-2e5b-f1af-87f9-b6cf33cde5ef",
Column_Names="identifier",IsUnique="false",TableIdentifier="ef1177fb-2e5b-f1af-87f9-b6cf33cde5ef",
Synchronized="2016-05-28 10:37:58.0")
public static final String INDEXNAME_c_orderline_identifier = "ef1177fb-2e5b-f1af-87f9-b6cf33cde5ef";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_OrderLine");

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
    Table_ID = MTable.getTable_ID("C_OrderLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_OrderLine[").append(get_ID()).append("]");
return sb.toString();
}

/** AD_OrgTrx_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int AD_ORGTRX_ID_AD_Reference_ID=130;
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2563ff13-ba3c-066b-54f5-970f91723554")
public static String es_PE_FIELD_OrderLine_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="2563ff13-ba3c-066b-54f5-970f91723554")
public static String es_PE_FIELD_OrderLine_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="2563ff13-ba3c-066b-54f5-970f91723554")
public static String es_PE_FIELD_OrderLine_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2563ff13-ba3c-066b-54f5-970f91723554")
public static final String FIELDNAME_OrderLine_TrxOrganization="2563ff13-ba3c-066b-54f5-970f91723554";

@XendraTrl(Identifier="467e6fbb-8f4e-ebe9-6ce5-1505b6270eff")
public static String es_PE_FIELD_POLine_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="467e6fbb-8f4e-ebe9-6ce5-1505b6270eff")
public static String es_PE_FIELD_POLine_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="467e6fbb-8f4e-ebe9-6ce5-1505b6270eff")
public static String es_PE_FIELD_POLine_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="467e6fbb-8f4e-ebe9-6ce5-1505b6270eff")
public static final String FIELDNAME_POLine_TrxOrganization="467e6fbb-8f4e-ebe9-6ce5-1505b6270eff";

@XendraTrl(Identifier="51a110c1-4a9d-29a5-162e-5b52b72dda57")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="51a110c1-4a9d-29a5-162e-5b52b72dda57",Synchronized="2017-08-05 16:53:56.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c27c17ad-05f1-d865-2eb5-ec1f545e3898")
public static String es_PE_FIELD_OrderLine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="c27c17ad-05f1-d865-2eb5-ec1f545e3898")
public static String es_PE_FIELD_OrderLine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="c27c17ad-05f1-d865-2eb5-ec1f545e3898")
public static String es_PE_FIELD_OrderLine_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c27c17ad-05f1-d865-2eb5-ec1f545e3898")
public static final String FIELDNAME_OrderLine_Activity="c27c17ad-05f1-d865-2eb5-ec1f545e3898";

@XendraTrl(Identifier="d892acaf-586d-9411-cfc8-04e179ec33c5")
public static String es_PE_FIELD_POLine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="d892acaf-586d-9411-cfc8-04e179ec33c5")
public static String es_PE_FIELD_POLine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="d892acaf-586d-9411-cfc8-04e179ec33c5")
public static String es_PE_FIELD_POLine_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d892acaf-586d-9411-cfc8-04e179ec33c5")
public static final String FIELDNAME_POLine_Activity="d892acaf-586d-9411-cfc8-04e179ec33c5";

@XendraTrl(Identifier="2150ed05-0d95-90d8-e876-72c74b8202b3")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="079b2687-77a7-3004-9b77-18ca68ffe4fc",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2150ed05-0d95-90d8-e876-72c74b8202b3",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="26eb2d48-92fa-9704-4414-20340485441a")
public static String es_PE_FIELD_OrderLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="26eb2d48-92fa-9704-4414-20340485441a")
public static String es_PE_FIELD_OrderLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="26eb2d48-92fa-9704-4414-20340485441a")
public static String es_PE_FIELD_OrderLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@OrderType@='OB' | @OrderType@='SO' | @OrderType@='WP' | @Processed@='Y'",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26eb2d48-92fa-9704-4414-20340485441a")
public static final String FIELDNAME_OrderLine_BusinessPartner="26eb2d48-92fa-9704-4414-20340485441a";

@XendraTrl(Identifier="9d16bf2e-4194-74e5-3105-8294f5848d78")
public static String es_PE_FIELD_POLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="9d16bf2e-4194-74e5-3105-8294f5848d78")
public static String es_PE_FIELD_POLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="9d16bf2e-4194-74e5-3105-8294f5848d78")
public static String es_PE_FIELD_POLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d16bf2e-4194-74e5-3105-8294f5848d78")
public static final String FIELDNAME_POLine_BusinessPartner="9d16bf2e-4194-74e5-3105-8294f5848d78";

@XendraTrl(Identifier="7d3d5fac-4ad0-2666-dc3a-e077f7749130")
public static String es_PE_FIELD_OrderLines_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="7d3d5fac-4ad0-2666-dc3a-e077f7749130")
public static String es_PE_FIELD_OrderLines_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="7d3d5fac-4ad0-2666-dc3a-e077f7749130")
public static String es_PE_FIELD_OrderLines_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d3d5fac-4ad0-2666-dc3a-e077f7749130")
public static final String FIELDNAME_OrderLines_BusinessPartner="7d3d5fac-4ad0-2666-dc3a-e077f7749130";

@XendraTrl(Identifier="18cd46b3-2f2c-3389-2409-b25d050409f8")
public static String es_PE_FIELD_PurchaseOrders_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="18cd46b3-2f2c-3389-2409-b25d050409f8")
public static String es_PE_FIELD_PurchaseOrders_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="18cd46b3-2f2c-3389-2409-b25d050409f8")
public static String es_PE_FIELD_PurchaseOrders_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18cd46b3-2f2c-3389-2409-b25d050409f8")
public static final String FIELDNAME_PurchaseOrders_BusinessPartner="18cd46b3-2f2c-3389-2409-b25d050409f8";

@XendraTrl(Identifier="f58a9691-7b35-a92f-c8f5-428d5288c2e6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,
DefaultValue="@SQL=SELECT C_BPartner_ID AS DefaultValue FROM C_Order WHERE C_Order_ID=@C_Order_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f58a9691-7b35-a92f-c8f5-428d5288c2e6",
Synchronized="2017-08-05 16:53:56.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c771f51-3097-906a-618e-45f1612e9dac")
public static String es_PE_FIELD_OrderLine_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="2c771f51-3097-906a-618e-45f1612e9dac")
public static String es_PE_FIELD_OrderLine_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="2c771f51-3097-906a-618e-45f1612e9dac")
public static String es_PE_FIELD_OrderLine_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@OrderType@='OB' | @OrderType@='SO' | @OrderType@='WP' | @Processed@='Y'",
DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c771f51-3097-906a-618e-45f1612e9dac")
public static final String FIELDNAME_OrderLine_PartnerLocation="2c771f51-3097-906a-618e-45f1612e9dac";

@XendraTrl(Identifier="ea922eb7-e097-d163-d571-1ab299142b16")
public static String es_PE_FIELD_POLine_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="ea922eb7-e097-d163-d571-1ab299142b16")
public static String es_PE_FIELD_POLine_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="ea922eb7-e097-d163-d571-1ab299142b16")
public static String es_PE_FIELD_POLine_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea922eb7-e097-d163-d571-1ab299142b16")
public static final String FIELDNAME_POLine_PartnerLocation="ea922eb7-e097-d163-d571-1ab299142b16";

@XendraTrl(Identifier="3bedd584-a5a1-362d-7610-d715c40e4d6d")
public static String es_PE_FIELD_OrderLines_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="3bedd584-a5a1-362d-7610-d715c40e4d6d")
public static String es_PE_FIELD_OrderLines_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="3bedd584-a5a1-362d-7610-d715c40e4d6d")
public static String es_PE_FIELD_OrderLines_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3bedd584-a5a1-362d-7610-d715c40e4d6d")
public static final String FIELDNAME_OrderLines_PartnerLocation="3bedd584-a5a1-362d-7610-d715c40e4d6d";

@XendraTrl(Identifier="715b2024-7d52-8294-b40c-b29fd5176e18")
public static String es_PE_FIELD_PurchaseOrders_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="715b2024-7d52-8294-b40c-b29fd5176e18")
public static String es_PE_FIELD_PurchaseOrders_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="715b2024-7d52-8294-b40c-b29fd5176e18")
public static String es_PE_FIELD_PurchaseOrders_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="715b2024-7d52-8294-b40c-b29fd5176e18")
public static final String FIELDNAME_PurchaseOrders_PartnerLocation="715b2024-7d52-8294-b40c-b29fd5176e18";

@XendraTrl(Identifier="3c801790-6516-7a7a-cd7c-abf25ecdd788")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="94403aa1-55e7-94fb-41a3-ae8d99e809ba",FieldLength=22,
DefaultValue="@C_BPartner_Location_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutOrder.tax",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c801790-6516-7a7a-cd7c-abf25ecdd788",
Synchronized="2017-08-05 16:53:56.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Campaign.
@param C_CampaignBonus_ID Campaign */
public void setC_CampaignBonus_ID (int C_CampaignBonus_ID)
{
if (C_CampaignBonus_ID <= 0) set_Value (COLUMNNAME_C_CampaignBonus_ID, null);
 else 
set_Value (COLUMNNAME_C_CampaignBonus_ID, Integer.valueOf(C_CampaignBonus_ID));
}
/** Get Campaign.
@return Campaign */
public int getC_CampaignBonus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignBonus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="01a49343-9f8f-86c5-7732-e4ce711789e0")
public static String es_PE_FIELD_OrderLine_Campaign_Name="Cam.Bonificacion";

@XendraField(AD_Column_ID="C_CampaignBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01a49343-9f8f-86c5-7732-e4ce711789e0")
public static final String FIELDNAME_OrderLine_Campaign="01a49343-9f8f-86c5-7732-e4ce711789e0";

@XendraTrl(Identifier="0b1015cf-6319-2a71-55c6-eebd17a18e41")
public static String es_PE_FIELD_POLine_Campaign_Name="Campaign";

@XendraField(AD_Column_ID="C_CampaignBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b1015cf-6319-2a71-55c6-eebd17a18e41")
public static final String FIELDNAME_POLine_Campaign="0b1015cf-6319-2a71-55c6-eebd17a18e41";

@XendraTrl(Identifier="4deff16e-d63d-6e77-ebc1-f2f7ecc0f391")
public static String es_PE_COLUMN_C_CampaignBonus_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="a5f39b6e-5196-25a2-48dd-348f1075c264",ColumnName="C_CampaignBonus_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4deff16e-d63d-6e77-ebc1-f2f7ecc0f391",
Synchronized="2017-08-05 16:53:56.0")
/** Column name C_CampaignBonus_ID */
public static final String COLUMNNAME_C_CampaignBonus_ID = "C_CampaignBonus_ID";
/** Set C_CampaignDiscount_ID.
@param C_CampaignDiscount_ID C_CampaignDiscount_ID */
public void setC_CampaignDiscount_ID (int C_CampaignDiscount_ID)
{
if (C_CampaignDiscount_ID <= 0) set_Value (COLUMNNAME_C_CampaignDiscount_ID, null);
 else 
set_Value (COLUMNNAME_C_CampaignDiscount_ID, Integer.valueOf(C_CampaignDiscount_ID));
}
/** Get C_CampaignDiscount_ID.
@return C_CampaignDiscount_ID */
public int getC_CampaignDiscount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignDiscount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4e936b86-f0e9-4b9d-6e60-985efe1d9885")
public static String es_PE_FIELD_OrderLine_C_CampaignDiscount_ID_Name="Cam.Descuento";

@XendraField(AD_Column_ID="C_CampaignDiscount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e936b86-f0e9-4b9d-6e60-985efe1d9885")
public static final String FIELDNAME_OrderLine_C_CampaignDiscount_ID="4e936b86-f0e9-4b9d-6e60-985efe1d9885";

@XendraTrl(Identifier="d025f98e-6078-621e-918e-df1daa972409")
public static String es_PE_FIELD_POLine_C_CampaignDiscount_ID_Name="C_CampaignDiscount_ID";

@XendraField(AD_Column_ID="C_CampaignDiscount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d025f98e-6078-621e-918e-df1daa972409")
public static final String FIELDNAME_POLine_C_CampaignDiscount_ID="d025f98e-6078-621e-918e-df1daa972409";

@XendraTrl(Identifier="90925501-e3e0-47c4-3e18-e917f21ad568")
public static String es_PE_COLUMN_C_CampaignDiscount_ID_Name="C_CampaignDiscount_ID";

@XendraColumn(AD_Element_ID="e2aa5f05-083c-4f10-c01d-1ec55801a24f",
ColumnName="C_CampaignDiscount_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="90925501-e3e0-47c4-3e18-e917f21ad568",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_CampaignDiscount_ID */
public static final String COLUMNNAME_C_CampaignDiscount_ID = "C_CampaignDiscount_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="27dfe241-89c8-7840-768a-2c670dfd257a")
public static String es_PE_FIELD_OrderLine_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="27dfe241-89c8-7840-768a-2c670dfd257a")
public static String es_PE_FIELD_OrderLine_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="27dfe241-89c8-7840-768a-2c670dfd257a")
public static String es_PE_FIELD_OrderLine_Campaign2_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="27dfe241-89c8-7840-768a-2c670dfd257a")
public static final String FIELDNAME_OrderLine_Campaign2="27dfe241-89c8-7840-768a-2c670dfd257a";

@XendraTrl(Identifier="aaaf1bbb-f1b8-077c-43b4-d19e5996f672")
public static String es_PE_FIELD_POLine_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="aaaf1bbb-f1b8-077c-43b4-d19e5996f672")
public static String es_PE_FIELD_POLine_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="aaaf1bbb-f1b8-077c-43b4-d19e5996f672")
public static String es_PE_FIELD_POLine_Campaign2_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aaaf1bbb-f1b8-077c-43b4-d19e5996f672")
public static final String FIELDNAME_POLine_Campaign2="aaaf1bbb-f1b8-077c-43b4-d19e5996f672";

@XendraTrl(Identifier="122cf425-a8bc-d29a-30d4-69b351488df7")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8e0d532d-2e55-9877-ef0b-a5950455e031",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="122cf425-a8bc-d29a-30d4-69b351488df7",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0dcbd6e0-201a-a017-bc54-29ccc8769fb6")
public static String es_PE_FIELD_OrderLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="0dcbd6e0-201a-a017-bc54-29ccc8769fb6")
public static String es_PE_FIELD_OrderLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="0dcbd6e0-201a-a017-bc54-29ccc8769fb6")
public static String es_PE_FIELD_OrderLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dcbd6e0-201a-a017-bc54-29ccc8769fb6")
public static final String FIELDNAME_OrderLine_Charge="0dcbd6e0-201a-a017-bc54-29ccc8769fb6";

@XendraTrl(Identifier="10caec27-dbd9-24ef-b48f-20fdd79c14d7")
public static String es_PE_FIELD_POLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="10caec27-dbd9-24ef-b48f-20fdd79c14d7")
public static String es_PE_FIELD_POLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="10caec27-dbd9-24ef-b48f-20fdd79c14d7")
public static String es_PE_FIELD_POLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Line",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10caec27-dbd9-24ef-b48f-20fdd79c14d7")
public static final String FIELDNAME_POLine_Charge="10caec27-dbd9-24ef-b48f-20fdd79c14d7";

@XendraTrl(Identifier="554d9900-041a-890f-de4e-8a289d917def")
public static String es_PE_FIELD_OrderLines_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="554d9900-041a-890f-de4e-8a289d917def")
public static String es_PE_FIELD_OrderLines_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="554d9900-041a-890f-de4e-8a289d917def")
public static String es_PE_FIELD_OrderLines_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="554d9900-041a-890f-de4e-8a289d917def")
public static final String FIELDNAME_OrderLines_Charge="554d9900-041a-890f-de4e-8a289d917def";

@XendraTrl(Identifier="9d43153c-981a-adae-b62d-b38d747e4600")
public static String es_PE_FIELD_PurchaseOrders_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="9d43153c-981a-adae-b62d-b38d747e4600")
public static String es_PE_FIELD_PurchaseOrders_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="9d43153c-981a-adae-b62d-b38d747e4600")
public static String es_PE_FIELD_PurchaseOrders_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d43153c-981a-adae-b62d-b38d747e4600")
public static final String FIELDNAME_PurchaseOrders_Charge="9d43153c-981a-adae-b62d-b38d747e4600";

@XendraTrl(Identifier="4d974488-c6eb-e551-42d3-6a2262ffd6a7")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.charge",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4d974488-c6eb-e551-42d3-6a2262ffd6a7",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7249ff9-1a72-ebd3-a8b7-768281a1aad1")
public static String es_PE_FIELD_OrderLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="d7249ff9-1a72-ebd3-a8b7-768281a1aad1")
public static String es_PE_FIELD_OrderLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="d7249ff9-1a72-ebd3-a8b7-768281a1aad1")
public static String es_PE_FIELD_OrderLine_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7249ff9-1a72-ebd3-a8b7-768281a1aad1")
public static final String FIELDNAME_OrderLine_Currency="d7249ff9-1a72-ebd3-a8b7-768281a1aad1";

@XendraTrl(Identifier="8efa3db3-ba0d-7305-6c34-f02eb26f04f8")
public static String es_PE_FIELD_POLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="8efa3db3-ba0d-7305-6c34-f02eb26f04f8")
public static String es_PE_FIELD_POLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="8efa3db3-ba0d-7305-6c34-f02eb26f04f8")
public static String es_PE_FIELD_POLine_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8efa3db3-ba0d-7305-6c34-f02eb26f04f8")
public static final String FIELDNAME_POLine_Currency="8efa3db3-ba0d-7305-6c34-f02eb26f04f8";

@XendraTrl(Identifier="305dafc0-7906-fd03-6e65-999a4feecd29")
public static String es_PE_FIELD_OrderLines_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="305dafc0-7906-fd03-6e65-999a4feecd29")
public static String es_PE_FIELD_OrderLines_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="305dafc0-7906-fd03-6e65-999a4feecd29")
public static String es_PE_FIELD_OrderLines_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="305dafc0-7906-fd03-6e65-999a4feecd29")
public static final String FIELDNAME_OrderLines_Currency="305dafc0-7906-fd03-6e65-999a4feecd29";

@XendraTrl(Identifier="9e3093f2-5713-7e5b-69e4-aea3d1f78408")
public static String es_PE_FIELD_PurchaseOrders_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9e3093f2-5713-7e5b-69e4-aea3d1f78408")
public static String es_PE_FIELD_PurchaseOrders_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="9e3093f2-5713-7e5b-69e4-aea3d1f78408")
public static String es_PE_FIELD_PurchaseOrders_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e3093f2-5713-7e5b-69e4-aea3d1f78408")
public static final String FIELDNAME_PurchaseOrders_Currency="9e3093f2-5713-7e5b-69e4-aea3d1f78408";

@XendraTrl(Identifier="11c84cb1-0b18-3d97-b4e6-34ff110044da")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="11c84cb1-0b18-3d97-b4e6-34ff110044da",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID < 1) throw new IllegalArgumentException ("C_Order_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Order_ID()));
}

@XendraTrl(Identifier="60e7f165-c39f-ac4b-5278-e2971c69d5fc")
public static String es_PE_FIELD_OrderLine_Order_Description="Orden de Venta";

@XendraTrl(Identifier="60e7f165-c39f-ac4b-5278-e2971c69d5fc")
public static String es_PE_FIELD_OrderLine_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="60e7f165-c39f-ac4b-5278-e2971c69d5fc")
public static String es_PE_FIELD_OrderLine_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60e7f165-c39f-ac4b-5278-e2971c69d5fc")
public static final String FIELDNAME_OrderLine_Order="60e7f165-c39f-ac4b-5278-e2971c69d5fc";

@XendraTrl(Identifier="6155f6fb-9e76-a5a4-6e45-d4cdda5ab3b6")
public static String es_PE_FIELD_POLine_PurchaseOrder_Description="Orden de compra";

@XendraTrl(Identifier="6155f6fb-9e76-a5a4-6e45-d4cdda5ab3b6")
public static String es_PE_FIELD_POLine_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraTrl(Identifier="6155f6fb-9e76-a5a4-6e45-d4cdda5ab3b6")
public static String es_PE_FIELD_POLine_PurchaseOrder_Name="Orden de compra";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6155f6fb-9e76-a5a4-6e45-d4cdda5ab3b6")
public static final String FIELDNAME_POLine_PurchaseOrder="6155f6fb-9e76-a5a4-6e45-d4cdda5ab3b6";

@XendraTrl(Identifier="3a082a28-96f9-4eea-62d9-32e29b4c46f7")
public static String es_PE_FIELD_OrderLines_Order_Description="Orden de Venta";

@XendraTrl(Identifier="3a082a28-96f9-4eea-62d9-32e29b4c46f7")
public static String es_PE_FIELD_OrderLines_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="3a082a28-96f9-4eea-62d9-32e29b4c46f7")
public static String es_PE_FIELD_OrderLines_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a082a28-96f9-4eea-62d9-32e29b4c46f7")
public static final String FIELDNAME_OrderLines_Order="3a082a28-96f9-4eea-62d9-32e29b4c46f7";

@XendraTrl(Identifier="4ad0ab7c-2021-0a3a-e6d8-208e2900ccc6")
public static String es_PE_FIELD_PurchaseOrders_PurchaseOrder_Description="Orden de compra";

@XendraTrl(Identifier="4ad0ab7c-2021-0a3a-e6d8-208e2900ccc6")
public static String es_PE_FIELD_PurchaseOrders_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraTrl(Identifier="4ad0ab7c-2021-0a3a-e6d8-208e2900ccc6")
public static String es_PE_FIELD_PurchaseOrders_PurchaseOrder_Name="Orden de compra";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ad0ab7c-2021-0a3a-e6d8-208e2900ccc6")
public static final String FIELDNAME_PurchaseOrders_PurchaseOrder="4ad0ab7c-2021-0a3a-e6d8-208e2900ccc6";

@XendraTrl(Identifier="f2e58dae-f941-449b-b8f1-42f9e482b47b")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2e58dae-f941-449b-b8f1-42f9e482b47b",
Synchronized="2017-08-05 16:53:56.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
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

@XendraTrl(Identifier="158c5e20-67c2-02fd-197e-4a986303e302")
public static String es_PE_FIELD_OrderLine_SalesOrderLine_Description="Item de orden de venta";

@XendraTrl(Identifier="158c5e20-67c2-02fd-197e-4a986303e302")
public static String es_PE_FIELD_OrderLine_SalesOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="158c5e20-67c2-02fd-197e-4a986303e302")
public static String es_PE_FIELD_OrderLine_SalesOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="158c5e20-67c2-02fd-197e-4a986303e302")
public static final String FIELDNAME_OrderLine_SalesOrderLine="158c5e20-67c2-02fd-197e-4a986303e302";

@XendraTrl(Identifier="88e9ae25-8cad-34b9-e77a-00dc16242356")
public static String es_PE_FIELD_POLine_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="88e9ae25-8cad-34b9-e77a-00dc16242356")
public static String es_PE_FIELD_POLine_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="88e9ae25-8cad-34b9-e77a-00dc16242356")
public static String es_PE_FIELD_POLine_PurchaseOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88e9ae25-8cad-34b9-e77a-00dc16242356")
public static final String FIELDNAME_POLine_PurchaseOrderLine="88e9ae25-8cad-34b9-e77a-00dc16242356";

@XendraTrl(Identifier="5c5c1fea-dc64-bc99-92eb-ac3551570e7d")
public static String es_PE_FIELD_OrderLines_SalesOrderLine_Description="Item de orden de venta";

@XendraTrl(Identifier="5c5c1fea-dc64-bc99-92eb-ac3551570e7d")
public static String es_PE_FIELD_OrderLines_SalesOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="5c5c1fea-dc64-bc99-92eb-ac3551570e7d")
public static String es_PE_FIELD_OrderLines_SalesOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c5c1fea-dc64-bc99-92eb-ac3551570e7d")
public static final String FIELDNAME_OrderLines_SalesOrderLine="5c5c1fea-dc64-bc99-92eb-ac3551570e7d";

@XendraTrl(Identifier="89ee2675-0336-0c69-f669-803d5790dd09")
public static String es_PE_FIELD_PurchaseOrders_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="89ee2675-0336-0c69-f669-803d5790dd09")
public static String es_PE_FIELD_PurchaseOrders_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="89ee2675-0336-0c69-f669-803d5790dd09")
public static String es_PE_FIELD_PurchaseOrders_PurchaseOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89ee2675-0336-0c69-f669-803d5790dd09")
public static final String FIELDNAME_PurchaseOrders_PurchaseOrderLine="89ee2675-0336-0c69-f669-803d5790dd09";
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
/** Set POS Log.
@param C_POSLog_ID POS Log */
public void setC_POSLog_ID (int C_POSLog_ID)
{
if (C_POSLog_ID <= 0) set_Value (COLUMNNAME_C_POSLog_ID, null);
 else 
set_Value (COLUMNNAME_C_POSLog_ID, Integer.valueOf(C_POSLog_ID));
}
/** Get POS Log.
@return POS Log */
public int getC_POSLog_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSLog_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="28c3db8f-cbd9-4241-8a0f-1c77318dbdef")
public static String es_PE_COLUMN_C_POSLog_ID_Name="POS Log";

@XendraColumn(AD_Element_ID="6ca0b543-bed1-f146-e899-b13e2b257821",ColumnName="C_POSLog_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28c3db8f-cbd9-4241-8a0f-1c77318dbdef",
Synchronized="2017-08-05 16:53:56.0")
/** Column name C_POSLog_ID */
public static final String COLUMNNAME_C_POSLog_ID = "C_POSLog_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c41b4193-de25-e927-daf3-171b360b8570")
public static String es_PE_FIELD_OrderLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="c41b4193-de25-e927-daf3-171b360b8570")
public static String es_PE_FIELD_OrderLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="c41b4193-de25-e927-daf3-171b360b8570")
public static String es_PE_FIELD_OrderLine_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c41b4193-de25-e927-daf3-171b360b8570")
public static final String FIELDNAME_OrderLine_Project="c41b4193-de25-e927-daf3-171b360b8570";

@XendraTrl(Identifier="b9c70c74-e006-ab5e-6fe5-c5cbe2d50c19")
public static String es_PE_FIELD_POLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="b9c70c74-e006-ab5e-6fe5-c5cbe2d50c19")
public static String es_PE_FIELD_POLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="b9c70c74-e006-ab5e-6fe5-c5cbe2d50c19")
public static String es_PE_FIELD_POLine_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b9c70c74-e006-ab5e-6fe5-c5cbe2d50c19")
public static final String FIELDNAME_POLine_Project="b9c70c74-e006-ab5e-6fe5-c5cbe2d50c19";

@XendraTrl(Identifier="a57a83ac-6645-2e03-8e0e-9c43e788bbaa")
public static String es_PE_FIELD_PurchaseOrders_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="a57a83ac-6645-2e03-8e0e-9c43e788bbaa")
public static String es_PE_FIELD_PurchaseOrders_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="a57a83ac-6645-2e03-8e0e-9c43e788bbaa")
public static String es_PE_FIELD_PurchaseOrders_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a57a83ac-6645-2e03-8e0e-9c43e788bbaa")
public static final String FIELDNAME_PurchaseOrders_Project="a57a83ac-6645-2e03-8e0e-9c43e788bbaa";

@XendraTrl(Identifier="7f046531-565e-5044-2cad-f853a724f4bc")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7f046531-565e-5044-2cad-f853a724f4bc",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7aaa2a02-c8c2-3af1-6345-48938586429b")
public static String es_PE_FIELD_OrderLine_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="7aaa2a02-c8c2-3af1-6345-48938586429b")
public static String es_PE_FIELD_OrderLine_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7aaa2a02-c8c2-3af1-6345-48938586429b")
public static final String FIELDNAME_OrderLine_ProjectPhase="7aaa2a02-c8c2-3af1-6345-48938586429b";

@XendraTrl(Identifier="8e71ccd5-53fe-3063-f0f3-7062ecdcf17b")
public static String es_PE_FIELD_POLine_ProjectPhase_Description="Fase del Proyecto";

@XendraTrl(Identifier="8e71ccd5-53fe-3063-f0f3-7062ecdcf17b")
public static String es_PE_FIELD_POLine_ProjectPhase_Name="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e71ccd5-53fe-3063-f0f3-7062ecdcf17b")
public static final String FIELDNAME_POLine_ProjectPhase="8e71ccd5-53fe-3063-f0f3-7062ecdcf17b";

@XendraTrl(Identifier="625b3f02-45cc-7f9d-ba72-4c1ef3ece2ed")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="69e5a46c-92d0-8660-9d0d-a7f1b354e9b9",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="625b3f02-45cc-7f9d-ba72-4c1ef3ece2ed",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f81f9b7-be26-5b7c-c9c0-7f423ef040c2")
public static String es_PE_FIELD_OrderLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="1f81f9b7-be26-5b7c-c9c0-7f423ef040c2")
public static String es_PE_FIELD_OrderLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="1f81f9b7-be26-5b7c-c9c0-7f423ef040c2")
public static String es_PE_FIELD_OrderLine_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f81f9b7-be26-5b7c-c9c0-7f423ef040c2")
public static final String FIELDNAME_OrderLine_ProjectTask="1f81f9b7-be26-5b7c-c9c0-7f423ef040c2";

@XendraTrl(Identifier="7c1d37b6-471f-4673-32f5-725651ffb6dc")
public static String es_PE_FIELD_POLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="7c1d37b6-471f-4673-32f5-725651ffb6dc")
public static String es_PE_FIELD_POLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraTrl(Identifier="7c1d37b6-471f-4673-32f5-725651ffb6dc")
public static String es_PE_FIELD_POLine_ProjectTask_Name="Tarea del Proyecto";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c1d37b6-471f-4673-32f5-725651ffb6dc")
public static final String FIELDNAME_POLine_ProjectTask="7c1d37b6-471f-4673-32f5-725651ffb6dc";

@XendraTrl(Identifier="492ed353-cf8f-47ca-c079-d3913a496a34")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="53906434-74e2-0844-02ba-0367c21ac60c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="492ed353-cf8f-47ca-c079-d3913a496a34",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1532ef6e-4692-d487-28e2-dd95bd411119")
public static String es_PE_FIELD_OrderLine_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="1532ef6e-4692-d487-28e2-dd95bd411119")
public static String es_PE_FIELD_OrderLine_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="1532ef6e-4692-d487-28e2-dd95bd411119")
public static String es_PE_FIELD_OrderLine_Tax_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1532ef6e-4692-d487-28e2-dd95bd411119")
public static final String FIELDNAME_OrderLine_Tax="1532ef6e-4692-d487-28e2-dd95bd411119";

@XendraTrl(Identifier="b34bba7c-af7c-8948-e630-d7f6eff317ae")
public static String es_PE_FIELD_POLine_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="b34bba7c-af7c-8948-e630-d7f6eff317ae")
public static String es_PE_FIELD_POLine_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="b34bba7c-af7c-8948-e630-d7f6eff317ae")
public static String es_PE_FIELD_POLine_Tax_Name="Impuesto";
@XendraField(AD_Column_ID="C_Tax_ID",
IsCentrallyMaintained=true,AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b34bba7c-af7c-8948-e630-d7f6eff317ae")
public static final String FIELDNAME_POLine_Tax="b34bba7c-af7c-8948-e630-d7f6eff317ae";

@XendraTrl(Identifier="2d9d9462-476e-1f15-85ad-858ed723105f")
public static String es_PE_FIELD_OrderLines_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="2d9d9462-476e-1f15-85ad-858ed723105f")
public static String es_PE_FIELD_OrderLines_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="2d9d9462-476e-1f15-85ad-858ed723105f")
public static String es_PE_FIELD_OrderLines_Tax_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d9d9462-476e-1f15-85ad-858ed723105f")
public static final String FIELDNAME_OrderLines_Tax="2d9d9462-476e-1f15-85ad-858ed723105f";

@XendraTrl(Identifier="f58c8162-5c03-4d5b-3376-90db2a5f1fd6")
public static String es_PE_FIELD_PurchaseOrders_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="f58c8162-5c03-4d5b-3376-90db2a5f1fd6")
public static String es_PE_FIELD_PurchaseOrders_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="f58c8162-5c03-4d5b-3376-90db2a5f1fd6")
public static String es_PE_FIELD_PurchaseOrders_Tax_Name="Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f58c8162-5c03-4d5b-3376-90db2a5f1fd6")
public static final String FIELDNAME_PurchaseOrders_Tax="f58c8162-5c03-4d5b-3376-90db2a5f1fd6";

@XendraTrl(Identifier="76960e13-9a4d-bef4-61d3-1f524c1ef720")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76960e13-9a4d-bef4-61d3-1f524c1ef720",
Synchronized="2017-08-05 16:53:56.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d1b1c8d4-36dd-3de1-a8b3-b03348be77b1")
public static String es_PE_FIELD_OrderLine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="d1b1c8d4-36dd-3de1-a8b3-b03348be77b1")
public static String es_PE_FIELD_OrderLine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="d1b1c8d4-36dd-3de1-a8b3-b03348be77b1")
public static String es_PE_FIELD_OrderLine_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",
AD_FieldGroup_ID="Quantities",IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,
SeqNo=150,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d1b1c8d4-36dd-3de1-a8b3-b03348be77b1")
public static final String FIELDNAME_OrderLine_UOM="d1b1c8d4-36dd-3de1-a8b3-b03348be77b1";

@XendraTrl(Identifier="e84019b4-9951-8918-ec70-f77cd10beabb")
public static String es_PE_FIELD_POLine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="e84019b4-9951-8918-ec70-f77cd10beabb")
public static String es_PE_FIELD_POLine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="e84019b4-9951-8918-ec70-f77cd10beabb")
public static String es_PE_FIELD_POLine_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",
AD_FieldGroup_ID="Quantities",IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,
SeqNo=140,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e84019b4-9951-8918-ec70-f77cd10beabb")
public static final String FIELDNAME_POLine_UOM="e84019b4-9951-8918-ec70-f77cd10beabb";

@XendraTrl(Identifier="696ac684-1e77-939c-8a66-faf0a129d105")
public static String es_PE_FIELD_OrderLines_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="696ac684-1e77-939c-8a66-faf0a129d105")
public static String es_PE_FIELD_OrderLines_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="696ac684-1e77-939c-8a66-faf0a129d105")
public static String es_PE_FIELD_OrderLines_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="696ac684-1e77-939c-8a66-faf0a129d105")
public static final String FIELDNAME_OrderLines_UOM="696ac684-1e77-939c-8a66-faf0a129d105";

@XendraTrl(Identifier="a4cb04bd-be74-94bd-b956-2eeca92bb03f")
public static String es_PE_FIELD_PurchaseOrders_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="a4cb04bd-be74-94bd-b956-2eeca92bb03f")
public static String es_PE_FIELD_PurchaseOrders_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="a4cb04bd-be74-94bd-b956-2eeca92bb03f")
public static String es_PE_FIELD_PurchaseOrders_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a4cb04bd-be74-94bd-b956-2eeca92bb03f")
public static final String FIELDNAME_PurchaseOrders_UOM="a4cb04bd-be74-94bd-b956-2eeca92bb03f";

@XendraTrl(Identifier="caba310b-fa21-87be-7d45-e3875d1d306e")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=22,DefaultValue="@#C_UOM_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutOrder.qty;org.compiere.model.CalloutOrder.amt",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="caba310b-fa21-87be-7d45-e3875d1d306e",Synchronized="2017-08-05 16:53:56.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Date Delivered.
@param DateDelivered Date when the product was delivered */
public void setDateDelivered (Timestamp DateDelivered)
{
set_ValueNoCheck (COLUMNNAME_DateDelivered, DateDelivered);
}
/** Get Date Delivered.
@return Date when the product was delivered */
public Timestamp getDateDelivered() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDelivered);
}

@XendraTrl(Identifier="2249f776-4239-626f-1b11-712ce452398d")
public static String es_PE_FIELD_OrderLine_DateDelivered_Description="Fecha en que se realizó la última entrega de Material";

@XendraTrl(Identifier="2249f776-4239-626f-1b11-712ce452398d")
public static String es_PE_FIELD_OrderLine_DateDelivered_Name="Fecha de Última Entrega";

@XendraField(AD_Column_ID="DateDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2249f776-4239-626f-1b11-712ce452398d")
public static final String FIELDNAME_OrderLine_DateDelivered="2249f776-4239-626f-1b11-712ce452398d";

@XendraTrl(Identifier="2cebad07-1325-51c8-4b17-df38967766c5")
public static String es_PE_FIELD_POLine_DateDelivered_Description="Fecha en que se realizó la última entrega de Material";

@XendraTrl(Identifier="2cebad07-1325-51c8-4b17-df38967766c5")
public static String es_PE_FIELD_POLine_DateDelivered_Name="Fecha de Última Entrega";

@XendraField(AD_Column_ID="DateDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2cebad07-1325-51c8-4b17-df38967766c5")
public static final String FIELDNAME_POLine_DateDelivered="2cebad07-1325-51c8-4b17-df38967766c5";

@XendraTrl(Identifier="887eae4c-b8eb-331c-e227-763f572b1f25")
public static String es_PE_FIELD_OrderLines_DateDelivered_Description="Fecha en que se realizó la última entrega de Material";

@XendraTrl(Identifier="887eae4c-b8eb-331c-e227-763f572b1f25")
public static String es_PE_FIELD_OrderLines_DateDelivered_Name="Fecha de Última Entrega";

@XendraField(AD_Column_ID="DateDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="887eae4c-b8eb-331c-e227-763f572b1f25")
public static final String FIELDNAME_OrderLines_DateDelivered="887eae4c-b8eb-331c-e227-763f572b1f25";

@XendraTrl(Identifier="1c006bea-be1b-a2f4-27f1-71afb650c9ef")
public static String es_PE_FIELD_PurchaseOrders_DateDelivered_Description="Fecha en que se realizó la última entrega de Material";

@XendraTrl(Identifier="1c006bea-be1b-a2f4-27f1-71afb650c9ef")
public static String es_PE_FIELD_PurchaseOrders_DateDelivered_Name="Fecha de Última Entrega";

@XendraField(AD_Column_ID="DateDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c006bea-be1b-a2f4-27f1-71afb650c9ef")
public static final String FIELDNAME_PurchaseOrders_DateDelivered="1c006bea-be1b-a2f4-27f1-71afb650c9ef";

@XendraTrl(Identifier="1d027629-c044-7766-f276-fdeb8e604ecb")
public static String es_PE_COLUMN_DateDelivered_Name="Fecha de Última Entrega";

@XendraColumn(AD_Element_ID="0384c88b-0a77-d437-63f3-52924ee8c070",ColumnName="DateDelivered",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d027629-c044-7766-f276-fdeb8e604ecb",
Synchronized="2017-08-05 16:53:56.0")
/** Column name DateDelivered */
public static final String COLUMNNAME_DateDelivered = "DateDelivered";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
set_ValueNoCheck (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="74584528-689d-ff69-5752-2842c04b869b")
public static String es_PE_FIELD_OrderLine_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="74584528-689d-ff69-5752-2842c04b869b")
public static String es_PE_FIELD_OrderLine_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraTrl(Identifier="74584528-689d-ff69-5752-2842c04b869b")
public static String es_PE_FIELD_OrderLine_DateInvoiced_Name="Fecha de Facturación";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74584528-689d-ff69-5752-2842c04b869b")
public static final String FIELDNAME_OrderLine_DateInvoiced="74584528-689d-ff69-5752-2842c04b869b";

@XendraTrl(Identifier="291f0ca4-730f-eae9-3df3-c605245f5bd7")
public static String es_PE_FIELD_POLine_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="291f0ca4-730f-eae9-3df3-c605245f5bd7")
public static String es_PE_FIELD_POLine_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraTrl(Identifier="291f0ca4-730f-eae9-3df3-c605245f5bd7")
public static String es_PE_FIELD_POLine_DateInvoiced_Name="Fecha de Facturación";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="291f0ca4-730f-eae9-3df3-c605245f5bd7")
public static final String FIELDNAME_POLine_DateInvoiced="291f0ca4-730f-eae9-3df3-c605245f5bd7";

@XendraTrl(Identifier="74ff9b5b-dc2f-b1e2-e690-785f6b83d81f")
public static String es_PE_FIELD_OrderLines_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="74ff9b5b-dc2f-b1e2-e690-785f6b83d81f")
public static String es_PE_FIELD_OrderLines_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraTrl(Identifier="74ff9b5b-dc2f-b1e2-e690-785f6b83d81f")
public static String es_PE_FIELD_OrderLines_DateInvoiced_Name="Fecha de Facturación";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74ff9b5b-dc2f-b1e2-e690-785f6b83d81f")
public static final String FIELDNAME_OrderLines_DateInvoiced="74ff9b5b-dc2f-b1e2-e690-785f6b83d81f";

@XendraTrl(Identifier="d1536eb5-7b84-2bb0-0c0c-24eb9623b7b1")
public static String es_PE_FIELD_PurchaseOrders_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="d1536eb5-7b84-2bb0-0c0c-24eb9623b7b1")
public static String es_PE_FIELD_PurchaseOrders_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraTrl(Identifier="d1536eb5-7b84-2bb0-0c0c-24eb9623b7b1")
public static String es_PE_FIELD_PurchaseOrders_DateInvoiced_Name="Fecha de Facturación";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1536eb5-7b84-2bb0-0c0c-24eb9623b7b1")
public static final String FIELDNAME_PurchaseOrders_DateInvoiced="d1536eb5-7b84-2bb0-0c0c-24eb9623b7b1";

@XendraTrl(Identifier="b3276c7c-a17e-c550-11b0-bd7843c02350")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3276c7c-a17e-c550-11b0-bd7843c02350",
Synchronized="2017-08-05 16:53:56.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
/** Set Date Ordered.
@param DateOrdered Date of Order */
public void setDateOrdered (Timestamp DateOrdered)
{
if (DateOrdered == null) throw new IllegalArgumentException ("DateOrdered is mandatory.");
set_Value (COLUMNNAME_DateOrdered, DateOrdered);
}
/** Get Date Ordered.
@return Date of Order */
public Timestamp getDateOrdered() 
{
return (Timestamp)get_Value(COLUMNNAME_DateOrdered);
}

@XendraTrl(Identifier="3ea0a8ff-8ff4-240e-f51b-aa31ec25280b")
public static String es_PE_FIELD_OrderLine_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="3ea0a8ff-8ff4-240e-f51b-aa31ec25280b")
public static String es_PE_FIELD_OrderLine_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraTrl(Identifier="3ea0a8ff-8ff4-240e-f51b-aa31ec25280b")
public static String es_PE_FIELD_OrderLine_DateOrdered_Name="Fecha de la Orden";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@OrderType@='OB' | @OrderType@='SO' | @OrderType@='WP'",DisplayLength=14,
IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ea0a8ff-8ff4-240e-f51b-aa31ec25280b")
public static final String FIELDNAME_OrderLine_DateOrdered="3ea0a8ff-8ff4-240e-f51b-aa31ec25280b";

@XendraTrl(Identifier="154c38c3-24bd-26c4-44d6-49615cf6cabb")
public static String es_PE_FIELD_POLine_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="154c38c3-24bd-26c4-44d6-49615cf6cabb")
public static String es_PE_FIELD_POLine_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraTrl(Identifier="154c38c3-24bd-26c4-44d6-49615cf6cabb")
public static String es_PE_FIELD_POLine_DateOrdered_Name="Fecha de la Orden";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="154c38c3-24bd-26c4-44d6-49615cf6cabb")
public static final String FIELDNAME_POLine_DateOrdered="154c38c3-24bd-26c4-44d6-49615cf6cabb";

@XendraTrl(Identifier="b3921b06-a719-bf4c-64b0-4759fcec1fe3")
public static String es_PE_FIELD_OrderLines_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="b3921b06-a719-bf4c-64b0-4759fcec1fe3")
public static String es_PE_FIELD_OrderLines_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraTrl(Identifier="b3921b06-a719-bf4c-64b0-4759fcec1fe3")
public static String es_PE_FIELD_OrderLines_DateOrdered_Name="Fecha de la Orden";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3921b06-a719-bf4c-64b0-4759fcec1fe3")
public static final String FIELDNAME_OrderLines_DateOrdered="b3921b06-a719-bf4c-64b0-4759fcec1fe3";

@XendraTrl(Identifier="1ac96045-92d6-8963-9ea0-7f136e75cd38")
public static String es_PE_FIELD_PurchaseOrders_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="1ac96045-92d6-8963-9ea0-7f136e75cd38")
public static String es_PE_FIELD_PurchaseOrders_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraTrl(Identifier="1ac96045-92d6-8963-9ea0-7f136e75cd38")
public static String es_PE_FIELD_PurchaseOrders_DateOrdered_Name="Fecha de la Orden";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ac96045-92d6-8963-9ea0-7f136e75cd38")
public static final String FIELDNAME_PurchaseOrders_DateOrdered="1ac96045-92d6-8963-9ea0-7f136e75cd38";

@XendraTrl(Identifier="eb1a622c-d954-9057-a226-4192624e3f2d")
public static String es_PE_COLUMN_DateOrdered_Name="Fecha de la Orden";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DateOrdered@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="eb1a622c-d954-9057-a226-4192624e3f2d",Synchronized="2017-08-05 16:53:56.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";
/** Set Date Promised.
@param DatePromised Date Order was promised */
public void setDatePromised (Timestamp DatePromised)
{
set_Value (COLUMNNAME_DatePromised, DatePromised);
}
/** Get Date Promised.
@return Date Order was promised */
public Timestamp getDatePromised() 
{
return (Timestamp)get_Value(COLUMNNAME_DatePromised);
}

@XendraTrl(Identifier="b52625e8-1bbb-cfe2-ee9c-bc4ea074f1e9")
public static String es_PE_FIELD_OrderLine_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="b52625e8-1bbb-cfe2-ee9c-bc4ea074f1e9")
public static String es_PE_FIELD_OrderLine_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraTrl(Identifier="b52625e8-1bbb-cfe2-ee9c-bc4ea074f1e9")
public static String es_PE_FIELD_OrderLine_DatePromised_Name="Fecha Prometida";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@OrderType@='OB' | @OrderType@='SO' | @OrderType@='WP'",DisplayLength=14,
IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b52625e8-1bbb-cfe2-ee9c-bc4ea074f1e9")
public static final String FIELDNAME_OrderLine_DatePromised="b52625e8-1bbb-cfe2-ee9c-bc4ea074f1e9";

@XendraTrl(Identifier="fa80f19c-81d6-8bc0-d70f-974b57869ffc")
public static String es_PE_FIELD_POLine_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="fa80f19c-81d6-8bc0-d70f-974b57869ffc")
public static String es_PE_FIELD_POLine_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraTrl(Identifier="fa80f19c-81d6-8bc0-d70f-974b57869ffc")
public static String es_PE_FIELD_POLine_DatePromised_Name="Fecha Prometida";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa80f19c-81d6-8bc0-d70f-974b57869ffc")
public static final String FIELDNAME_POLine_DatePromised="fa80f19c-81d6-8bc0-d70f-974b57869ffc";

@XendraTrl(Identifier="618e142a-a618-f541-b4e4-21b5fa7a3e8c")
public static String es_PE_FIELD_OrderLines_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="618e142a-a618-f541-b4e4-21b5fa7a3e8c")
public static String es_PE_FIELD_OrderLines_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraTrl(Identifier="618e142a-a618-f541-b4e4-21b5fa7a3e8c")
public static String es_PE_FIELD_OrderLines_DatePromised_Name="Fecha Prometida";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="618e142a-a618-f541-b4e4-21b5fa7a3e8c")
public static final String FIELDNAME_OrderLines_DatePromised="618e142a-a618-f541-b4e4-21b5fa7a3e8c";

@XendraTrl(Identifier="e5dd72d2-78dd-58af-0d40-d6992f0973f0")
public static String es_PE_FIELD_PurchaseOrders_DatePromised_Description="Fecha de promesa de la orden.";

@XendraTrl(Identifier="e5dd72d2-78dd-58af-0d40-d6992f0973f0")
public static String es_PE_FIELD_PurchaseOrders_DatePromised_Help="La fecha prometida indica la fecha; si hay alguna; en que la orden fue prometida al cliente.";

@XendraTrl(Identifier="e5dd72d2-78dd-58af-0d40-d6992f0973f0")
public static String es_PE_FIELD_PurchaseOrders_DatePromised_Name="Fecha Prometida";

@XendraField(AD_Column_ID="DatePromised",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5dd72d2-78dd-58af-0d40-d6992f0973f0")
public static final String FIELDNAME_PurchaseOrders_DatePromised="e5dd72d2-78dd-58af-0d40-d6992f0973f0";

@XendraTrl(Identifier="0709a2f0-b77e-05f4-9545-936d05283466")
public static String es_PE_COLUMN_DatePromised_Name="Fecha Prometida";

@XendraColumn(AD_Element_ID="d2ffe555-d546-1a8a-bb07-b98f3ba547cf",ColumnName="DatePromised",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DatePromised@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0709a2f0-b77e-05f4-9545-936d05283466",Synchronized="2017-08-05 16:53:56.0")
/** Column name DatePromised */
public static final String COLUMNNAME_DatePromised = "DatePromised";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="799ab3c0-e9a9-2a0d-485a-8b872aac9ae3")
public static String es_PE_FIELD_OrderLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="799ab3c0-e9a9-2a0d-485a-8b872aac9ae3")
public static String es_PE_FIELD_OrderLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="799ab3c0-e9a9-2a0d-485a-8b872aac9ae3")
public static String es_PE_FIELD_OrderLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="799ab3c0-e9a9-2a0d-485a-8b872aac9ae3")
public static final String FIELDNAME_OrderLine_Description="799ab3c0-e9a9-2a0d-485a-8b872aac9ae3";

@XendraTrl(Identifier="8ea1ce1f-cf1c-bdb9-b84b-048bd40704a8")
public static String es_PE_FIELD_POLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="8ea1ce1f-cf1c-bdb9-b84b-048bd40704a8")
public static String es_PE_FIELD_POLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="8ea1ce1f-cf1c-bdb9-b84b-048bd40704a8")
public static String es_PE_FIELD_POLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Line",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ea1ce1f-cf1c-bdb9-b84b-048bd40704a8")
public static final String FIELDNAME_POLine_Description="8ea1ce1f-cf1c-bdb9-b84b-048bd40704a8";

@XendraTrl(Identifier="ca8e496e-8e78-6087-6913-beb694a81eba")
public static String es_PE_FIELD_OrderLines_Description_Description="Observación";

@XendraTrl(Identifier="ca8e496e-8e78-6087-6913-beb694a81eba")
public static String es_PE_FIELD_OrderLines_Description_Help="Observación";

@XendraTrl(Identifier="ca8e496e-8e78-6087-6913-beb694a81eba")
public static String es_PE_FIELD_OrderLines_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca8e496e-8e78-6087-6913-beb694a81eba")
public static final String FIELDNAME_OrderLines_Description="ca8e496e-8e78-6087-6913-beb694a81eba";

@XendraTrl(Identifier="6afe7c00-6672-c3bf-e3a1-63426b45dd98")
public static String es_PE_FIELD_PurchaseOrders_Description_Description="Observación";

@XendraTrl(Identifier="6afe7c00-6672-c3bf-e3a1-63426b45dd98")
public static String es_PE_FIELD_PurchaseOrders_Description_Help="Observación";

@XendraTrl(Identifier="6afe7c00-6672-c3bf-e3a1-63426b45dd98")
public static String es_PE_FIELD_PurchaseOrders_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6afe7c00-6672-c3bf-e3a1-63426b45dd98")
public static final String FIELDNAME_PurchaseOrders_Description="6afe7c00-6672-c3bf-e3a1-63426b45dd98";

@XendraTrl(Identifier="534741f5-035a-e4bd-325d-e459dd20102e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="534741f5-035a-e4bd-325d-e459dd20102e",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Discount %.
@param Discount Discount in percent */
public void setDiscount (BigDecimal Discount)
{
set_Value (COLUMNNAME_Discount, Discount);
}
/** Get Discount %.
@return Discount in percent */
public BigDecimal getDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5d179bb8-7855-76af-8f95-09e45ff4155b")
public static String es_PE_FIELD_OrderLine_Discount_Description="Descuento en porcentaje";

@XendraTrl(Identifier="5d179bb8-7855-76af-8f95-09e45ff4155b")
public static String es_PE_FIELD_OrderLine_Discount_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="5d179bb8-7855-76af-8f95-09e45ff4155b")
public static String es_PE_FIELD_OrderLine_Discount_Name="% Descuento";

@XendraField(AD_Column_ID="Discount",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d179bb8-7855-76af-8f95-09e45ff4155b")
public static final String FIELDNAME_OrderLine_Discount="5d179bb8-7855-76af-8f95-09e45ff4155b";

@XendraTrl(Identifier="603a7767-a003-6790-f4c5-884f2c3d6024")
public static String es_PE_FIELD_POLine_Discount_Description="Descuento en porcentaje";

@XendraTrl(Identifier="603a7767-a003-6790-f4c5-884f2c3d6024")
public static String es_PE_FIELD_POLine_Discount_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="603a7767-a003-6790-f4c5-884f2c3d6024")
public static String es_PE_FIELD_POLine_Discount_Name="% Descuento";

@XendraField(AD_Column_ID="Discount",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="603a7767-a003-6790-f4c5-884f2c3d6024")
public static final String FIELDNAME_POLine_Discount="603a7767-a003-6790-f4c5-884f2c3d6024";

@XendraTrl(Identifier="3d70bc0b-d546-6586-4bd6-401aaa9b7184")
public static String es_PE_FIELD_OrderLines_Discount_Description="Descuento en porcentaje";

@XendraTrl(Identifier="3d70bc0b-d546-6586-4bd6-401aaa9b7184")
public static String es_PE_FIELD_OrderLines_Discount_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="3d70bc0b-d546-6586-4bd6-401aaa9b7184")
public static String es_PE_FIELD_OrderLines_Discount_Name="% Descuento";

@XendraField(AD_Column_ID="Discount",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d70bc0b-d546-6586-4bd6-401aaa9b7184")
public static final String FIELDNAME_OrderLines_Discount="3d70bc0b-d546-6586-4bd6-401aaa9b7184";

@XendraTrl(Identifier="45bc3abc-bbce-f033-1746-6740bcd2d23d")
public static String es_PE_FIELD_PurchaseOrders_Discount_Description="Descuento en porcentaje";

@XendraTrl(Identifier="45bc3abc-bbce-f033-1746-6740bcd2d23d")
public static String es_PE_FIELD_PurchaseOrders_Discount_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="45bc3abc-bbce-f033-1746-6740bcd2d23d")
public static String es_PE_FIELD_PurchaseOrders_Discount_Name="% Descuento";

@XendraField(AD_Column_ID="Discount",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45bc3abc-bbce-f033-1746-6740bcd2d23d")
public static final String FIELDNAME_PurchaseOrders_Discount="45bc3abc-bbce-f033-1746-6740bcd2d23d";

@XendraTrl(Identifier="0c578ccc-7f70-1da9-0845-389da1a58bcc")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.amt",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0c578ccc-7f70-1da9-0845-389da1a58bcc",Synchronized="2017-08-05 16:53:57.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";
/** Set Discount1.
@param Discount1 Discount1 */
public void setDiscount1 (BigDecimal Discount1)
{
set_Value (COLUMNNAME_Discount1, Discount1);
}
/** Get Discount1.
@return Discount1 */
public BigDecimal getDiscount1() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount1);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="52b077ba-e310-a4e1-c38b-972034bee15d")
public static String es_PE_FIELD_OrderLine_Discount12_Name="% D1";

@XendraField(AD_Column_ID="Discount1",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52b077ba-e310-a4e1-c38b-972034bee15d")
public static final String FIELDNAME_OrderLine_Discount12="52b077ba-e310-a4e1-c38b-972034bee15d";

@XendraTrl(Identifier="3ef31e26-2895-e955-0ec0-733e3e18fbd3")
public static String es_PE_FIELD_POLine_Discount12_Name="%D1";

@XendraField(AD_Column_ID="Discount1",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ef31e26-2895-e955-0ec0-733e3e18fbd3")
public static final String FIELDNAME_POLine_Discount12="3ef31e26-2895-e955-0ec0-733e3e18fbd3";

@XendraTrl(Identifier="38cbc136-8648-1c08-57de-74778c9278ba")
public static String es_PE_COLUMN_Discount1_Name="Discount1";

@XendraColumn(AD_Element_ID="477a8511-8bcb-feca-7140-a0b2ad1183b9",ColumnName="Discount1",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38cbc136-8648-1c08-57de-74778c9278ba",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Discount1 */
public static final String COLUMNNAME_Discount1 = "Discount1";
/** Set Discount 2 %.
@param Discount2 Discount in percent */
public void setDiscount2 (BigDecimal Discount2)
{
set_Value (COLUMNNAME_Discount2, Discount2);
}
/** Get Discount 2 %.
@return Discount in percent */
public BigDecimal getDiscount2() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount2);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5b73f706-e7cc-5d5a-af1d-4ab6a3967da9")
public static String es_PE_FIELD_OrderLine_Discount23_Description="Descuento en porcentaje";

@XendraTrl(Identifier="5b73f706-e7cc-5d5a-af1d-4ab6a3967da9")
public static String es_PE_FIELD_OrderLine_Discount23_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="5b73f706-e7cc-5d5a-af1d-4ab6a3967da9")
public static String es_PE_FIELD_OrderLine_Discount23_Name="% D2";

@XendraField(AD_Column_ID="Discount2",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b73f706-e7cc-5d5a-af1d-4ab6a3967da9")
public static final String FIELDNAME_OrderLine_Discount23="5b73f706-e7cc-5d5a-af1d-4ab6a3967da9";

@XendraTrl(Identifier="f564d336-d1c3-0596-30c0-0912f15324d8")
public static String es_PE_FIELD_POLine_Discount23_Description="Descuento en porcentaje";

@XendraTrl(Identifier="f564d336-d1c3-0596-30c0-0912f15324d8")
public static String es_PE_FIELD_POLine_Discount23_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="f564d336-d1c3-0596-30c0-0912f15324d8")
public static String es_PE_FIELD_POLine_Discount23_Name="% D2";

@XendraField(AD_Column_ID="Discount2",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f564d336-d1c3-0596-30c0-0912f15324d8")
public static final String FIELDNAME_POLine_Discount23="f564d336-d1c3-0596-30c0-0912f15324d8";

@XendraTrl(Identifier="ba1103ef-b5fb-e819-2684-2bfcae2b2a7f")
public static String es_PE_COLUMN_Discount2_Name="Discount 2 %";

@XendraColumn(AD_Element_ID="f316139b-9edb-4d81-7a3b-369e45352498",ColumnName="Discount2",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba1103ef-b5fb-e819-2684-2bfcae2b2a7f",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Discount2 */
public static final String COLUMNNAME_Discount2 = "Discount2";
/** Set Discount3.
@param Discount3 Discount3 */
public void setDiscount3 (BigDecimal Discount3)
{
set_Value (COLUMNNAME_Discount3, Discount3);
}
/** Get Discount3.
@return Discount3 */
public BigDecimal getDiscount3() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount3);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6f8f81e3-c721-8c56-8c56-634fd6c6e100")
public static String es_PE_FIELD_OrderLine_Discount34_Name="% D3";

@XendraField(AD_Column_ID="Discount3",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f8f81e3-c721-8c56-8c56-634fd6c6e100")
public static final String FIELDNAME_OrderLine_Discount34="6f8f81e3-c721-8c56-8c56-634fd6c6e100";

@XendraTrl(Identifier="80061f10-6df4-a1f9-3281-9cab674a9f19")
public static String es_PE_FIELD_POLine_Discount34_Name="% D3";

@XendraField(AD_Column_ID="Discount3",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80061f10-6df4-a1f9-3281-9cab674a9f19")
public static final String FIELDNAME_POLine_Discount34="80061f10-6df4-a1f9-3281-9cab674a9f19";

@XendraTrl(Identifier="9b8d6fe3-339a-1c15-a5c8-35fcf08a1a02")
public static String es_PE_COLUMN_Discount3_Name="Discount3";

@XendraColumn(AD_Element_ID="c30e9759-37f1-0c5e-0b40-72d7e2b396b9",ColumnName="Discount3",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b8d6fe3-339a-1c15-a5c8-35fcf08a1a02",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Discount3 */
public static final String COLUMNNAME_Discount3 = "Discount3";
/** Set Discount4.
@param Discount4 Discount4 */
public void setDiscount4 (BigDecimal Discount4)
{
set_Value (COLUMNNAME_Discount4, Discount4);
}
/** Get Discount4.
@return Discount4 */
public BigDecimal getDiscount4() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount4);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="aede9330-6946-1866-8040-c174cafc8ef5")
public static String es_PE_FIELD_OrderLine_Discount45_Name="% D3";

@XendraField(AD_Column_ID="Discount4",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aede9330-6946-1866-8040-c174cafc8ef5")
public static final String FIELDNAME_OrderLine_Discount45="aede9330-6946-1866-8040-c174cafc8ef5";

@XendraTrl(Identifier="12e2de2d-d4ff-7f11-bb24-f0f7ac1a418a")
public static String es_PE_FIELD_POLine_Discount45_Name="% D4";

@XendraField(AD_Column_ID="Discount4",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12e2de2d-d4ff-7f11-bb24-f0f7ac1a418a")
public static final String FIELDNAME_POLine_Discount45="12e2de2d-d4ff-7f11-bb24-f0f7ac1a418a";

@XendraTrl(Identifier="8c949ab3-f0eb-b700-2a89-b4a720e6c7dc")
public static String es_PE_COLUMN_Discount4_Name="Discount4";

@XendraColumn(AD_Element_ID="608dc743-7c00-576c-d5c1-b0a29a888a94",ColumnName="Discount4",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c949ab3-f0eb-b700-2a89-b4a720e6c7dc",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Discount4 */
public static final String COLUMNNAME_Discount4 = "Discount4";
/** Set DiscountAcquire1.
@param DiscountAcquire1 DiscountAcquire1 */
public void setDiscountAcquire1 (BigDecimal DiscountAcquire1)
{
set_Value (COLUMNNAME_DiscountAcquire1, DiscountAcquire1);
}
/** Get DiscountAcquire1.
@return DiscountAcquire1 */
public BigDecimal getDiscountAcquire1() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAcquire1);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="904e69e6-6265-1ccf-d40c-ca8196564ad3")
public static String es_PE_FIELD_OrderLine_DiscountAcquire_Name="DiscountAcquire1";

@XendraField(AD_Column_ID="DiscountAcquire1",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="904e69e6-6265-1ccf-d40c-ca8196564ad3")
public static final String FIELDNAME_OrderLine_DiscountAcquire="904e69e6-6265-1ccf-d40c-ca8196564ad3";

@XendraTrl(Identifier="ef14aa3d-a86d-f429-ccf9-9eed0be27f5f")
public static String es_PE_FIELD_POLine_DiscountAcquire_Name="DiscountAcquire1";

@XendraField(AD_Column_ID="DiscountAcquire1",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef14aa3d-a86d-f429-ccf9-9eed0be27f5f")
public static final String FIELDNAME_POLine_DiscountAcquire="ef14aa3d-a86d-f429-ccf9-9eed0be27f5f";

@XendraTrl(Identifier="5cff7762-09e8-9379-6ad6-b52715af805b")
public static String es_PE_COLUMN_DiscountAcquire1_Name="DiscountAcquire1";

@XendraColumn(AD_Element_ID="dfb9142b-ec3b-1733-80c8-b48c82bb39e1",ColumnName="DiscountAcquire1",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cff7762-09e8-9379-6ad6-b52715af805b",
Synchronized="2017-08-05 16:53:57.0")
/** Column name DiscountAcquire1 */
public static final String COLUMNNAME_DiscountAcquire1 = "DiscountAcquire1";
/** Set Freight Amount.
@param FreightAmt Freight Amount  */
public void setFreightAmt (BigDecimal FreightAmt)
{
if (FreightAmt == null) throw new IllegalArgumentException ("FreightAmt is mandatory.");
set_Value (COLUMNNAME_FreightAmt, FreightAmt);
}
/** Get Freight Amount.
@return Freight Amount  */
public BigDecimal getFreightAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FreightAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dde27260-9802-0f21-949f-cf3f6532b8f9")
public static String es_PE_FIELD_OrderLine_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="dde27260-9802-0f21-949f-cf3f6532b8f9")
public static String es_PE_FIELD_OrderLine_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="dde27260-9802-0f21-949f-cf3f6532b8f9")
public static String es_PE_FIELD_OrderLine_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="@FreightCostRule@='L'",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dde27260-9802-0f21-949f-cf3f6532b8f9")
public static final String FIELDNAME_OrderLine_FreightAmount="dde27260-9802-0f21-949f-cf3f6532b8f9";

@XendraTrl(Identifier="aa04f470-6272-07e1-c8f2-b7fcf020f029")
public static String es_PE_FIELD_POLine_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="aa04f470-6272-07e1-c8f2-b7fcf020f029")
public static String es_PE_FIELD_POLine_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="aa04f470-6272-07e1-c8f2-b7fcf020f029")
public static String es_PE_FIELD_POLine_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="@FreightCostRule@='L'",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aa04f470-6272-07e1-c8f2-b7fcf020f029")
public static final String FIELDNAME_POLine_FreightAmount="aa04f470-6272-07e1-c8f2-b7fcf020f029";

@XendraTrl(Identifier="ea38f7df-def1-d445-aac6-c995e7fe28ee")
public static String es_PE_FIELD_OrderLines_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="ea38f7df-def1-d445-aac6-c995e7fe28ee")
public static String es_PE_FIELD_OrderLines_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="ea38f7df-def1-d445-aac6-c995e7fe28ee")
public static String es_PE_FIELD_OrderLines_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea38f7df-def1-d445-aac6-c995e7fe28ee")
public static final String FIELDNAME_OrderLines_FreightAmount="ea38f7df-def1-d445-aac6-c995e7fe28ee";

@XendraTrl(Identifier="89a43bc5-fe93-b353-4252-4d3bfddff1fc")
public static String es_PE_FIELD_PurchaseOrders_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="89a43bc5-fe93-b353-4252-4d3bfddff1fc")
public static String es_PE_FIELD_PurchaseOrders_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="89a43bc5-fe93-b353-4252-4d3bfddff1fc")
public static String es_PE_FIELD_PurchaseOrders_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89a43bc5-fe93-b353-4252-4d3bfddff1fc")
public static final String FIELDNAME_PurchaseOrders_FreightAmount="89a43bc5-fe93-b353-4252-4d3bfddff1fc";

@XendraTrl(Identifier="08733c12-607c-4140-73d1-40c104f2bfef")
public static String es_PE_COLUMN_FreightAmt_Name="Total de Flete";

@XendraColumn(AD_Element_ID="b2162c75-bbbe-b49a-7ffe-6020ce78c453",ColumnName="FreightAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08733c12-607c-4140-73d1-40c104f2bfef",
Synchronized="2017-08-05 16:53:57.0")
/** Column name FreightAmt */
public static final String COLUMNNAME_FreightAmt = "FreightAmt";
/** Set Hash.
@param Hash Hash */
public void setHash (String Hash)
{
if (Hash != null && Hash.length() > 20)
{
log.warning("Length > 20 - truncated");
Hash = Hash.substring(0,19);
}
set_Value (COLUMNNAME_Hash, Hash);
}
/** Get Hash.
@return Hash */
public String getHash() 
{
String value = (String)get_Value(COLUMNNAME_Hash);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="20614dad-6de3-43c5-b37f-3037b4dbc525")
public static String es_PE_COLUMN_Hash_Name="hash";

@XendraColumn(AD_Element_ID="6341ee51-d945-4671-8c24-18f4704aff4e",ColumnName="Hash",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20614dad-6de3-43c5-b37f-3037b4dbc525",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Hash */
public static final String COLUMNNAME_Hash = "Hash";
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
@XendraTrl(Identifier="89cff775-32eb-4407-9405-69270421e0a2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89cff775-32eb-4407-9405-69270421e0a2",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsBonus.
@param IsBonus IsBonus */
public void setIsBonus (boolean IsBonus)
{
set_Value (COLUMNNAME_IsBonus, Boolean.valueOf(IsBonus));
}
/** Get IsBonus.
@return IsBonus */
public boolean isBonus() 
{
Object oo = get_Value(COLUMNNAME_IsBonus);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9d55e185-00c9-44bb-b1de-264a6b6693d6")
public static String es_PE_COLUMN_IsBonus_Name="isbonus";

@XendraColumn(AD_Element_ID="efe176bb-7325-4be3-b2ee-797370dd03e6",ColumnName="IsBonus",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d55e185-00c9-44bb-b1de-264a6b6693d6",
Synchronized="2017-08-05 16:53:57.0")
/** Column name IsBonus */
public static final String COLUMNNAME_IsBonus = "IsBonus";
/** Set Description Only.
@param IsDescription if true, the line is just DESCRIPTION and no transaction */
public void setIsDescription (boolean IsDescription)
{
set_Value (COLUMNNAME_IsDescription, Boolean.valueOf(IsDescription));
}
/** Get Description Only.
@return if true, the line is just DESCRIPTION and no transaction */
public boolean isDescription() 
{
Object oo = get_Value(COLUMNNAME_IsDescription);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="58f4690a-ea6b-507b-1324-11e2f8040d2a")
public static String es_PE_FIELD_OrderLine_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="58f4690a-ea6b-507b-1324-11e2f8040d2a")
public static String es_PE_FIELD_OrderLine_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraTrl(Identifier="58f4690a-ea6b-507b-1324-11e2f8040d2a")
public static String es_PE_FIELD_OrderLine_DescriptionOnly_Name="Sólo Descripción";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58f4690a-ea6b-507b-1324-11e2f8040d2a")
public static final String FIELDNAME_OrderLine_DescriptionOnly="58f4690a-ea6b-507b-1324-11e2f8040d2a";

@XendraTrl(Identifier="b15788f0-415f-dc7d-b0cc-b7af690d2cf6")
public static String es_PE_FIELD_POLine_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="b15788f0-415f-dc7d-b0cc-b7af690d2cf6")
public static String es_PE_FIELD_POLine_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraTrl(Identifier="b15788f0-415f-dc7d-b0cc-b7af690d2cf6")
public static String es_PE_FIELD_POLine_DescriptionOnly_Name="Sólo Descripción";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b15788f0-415f-dc7d-b0cc-b7af690d2cf6")
public static final String FIELDNAME_POLine_DescriptionOnly="b15788f0-415f-dc7d-b0cc-b7af690d2cf6";

@XendraTrl(Identifier="b49156ee-04a3-8a13-8e0a-fdb6b2eb12df")
public static String es_PE_FIELD_OrderLines_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="b49156ee-04a3-8a13-8e0a-fdb6b2eb12df")
public static String es_PE_FIELD_OrderLines_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraTrl(Identifier="b49156ee-04a3-8a13-8e0a-fdb6b2eb12df")
public static String es_PE_FIELD_OrderLines_DescriptionOnly_Name="Sólo Descripción";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b49156ee-04a3-8a13-8e0a-fdb6b2eb12df")
public static final String FIELDNAME_OrderLines_DescriptionOnly="b49156ee-04a3-8a13-8e0a-fdb6b2eb12df";

@XendraTrl(Identifier="086a31d2-61d4-1a13-7808-2b2986b8880f")
public static String es_PE_FIELD_PurchaseOrders_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="086a31d2-61d4-1a13-7808-2b2986b8880f")
public static String es_PE_FIELD_PurchaseOrders_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraTrl(Identifier="086a31d2-61d4-1a13-7808-2b2986b8880f")
public static String es_PE_FIELD_PurchaseOrders_DescriptionOnly_Name="Sólo Descripción";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="086a31d2-61d4-1a13-7808-2b2986b8880f")
public static final String FIELDNAME_PurchaseOrders_DescriptionOnly="086a31d2-61d4-1a13-7808-2b2986b8880f";

@XendraTrl(Identifier="70989f0a-e9c3-e145-6c1c-61b6c0a4fe91")
public static String es_PE_COLUMN_IsDescription_Name="Sólo Descripción";

@XendraColumn(AD_Element_ID="bd7f450d-a061-1b08-60d8-19c8943042f0",ColumnName="IsDescription",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70989f0a-e9c3-e145-6c1c-61b6c0a4fe91",
Synchronized="2017-08-05 16:53:57.0")
/** Column name IsDescription */
public static final String COLUMNNAME_IsDescription = "IsDescription";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7503e5d-ecdf-2bc0-9fff-10265500208e")
public static String es_PE_FIELD_OrderLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="d7503e5d-ecdf-2bc0-9fff-10265500208e")
public static String es_PE_FIELD_OrderLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="d7503e5d-ecdf-2bc0-9fff-10265500208e")
public static String es_PE_FIELD_OrderLine_LineNo_Name="No. Ítem";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d7503e5d-ecdf-2bc0-9fff-10265500208e")
public static final String FIELDNAME_OrderLine_LineNo="d7503e5d-ecdf-2bc0-9fff-10265500208e";

@XendraTrl(Identifier="e44d348b-e145-1b18-64e4-c141fbab442c")
public static String es_PE_FIELD_POLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="e44d348b-e145-1b18-64e4-c141fbab442c")
public static String es_PE_FIELD_POLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="e44d348b-e145-1b18-64e4-c141fbab442c")
public static String es_PE_FIELD_POLine_LineNo_Name="No. Item";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",
AD_FieldGroup_ID="Line",IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,
SeqNo=80,SortNo=1,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e44d348b-e145-1b18-64e4-c141fbab442c")
public static final String FIELDNAME_POLine_LineNo="e44d348b-e145-1b18-64e4-c141fbab442c";

@XendraTrl(Identifier="a88dc1b0-966a-825d-8193-69318e347229")
public static String es_PE_FIELD_OrderLines_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="a88dc1b0-966a-825d-8193-69318e347229")
public static String es_PE_FIELD_OrderLines_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="a88dc1b0-966a-825d-8193-69318e347229")
public static String es_PE_FIELD_OrderLines_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a88dc1b0-966a-825d-8193-69318e347229")
public static final String FIELDNAME_OrderLines_LineNo="a88dc1b0-966a-825d-8193-69318e347229";

@XendraTrl(Identifier="2ccb89f3-0511-216e-e6b0-3451b3579ccd")
public static String es_PE_FIELD_PurchaseOrders_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="2ccb89f3-0511-216e-e6b0-3451b3579ccd")
public static String es_PE_FIELD_PurchaseOrders_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="2ccb89f3-0511-216e-e6b0-3451b3579ccd")
public static String es_PE_FIELD_PurchaseOrders_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=40,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ccb89f3-0511-216e-e6b0-3451b3579ccd")
public static final String FIELDNAME_PurchaseOrders_LineNo="2ccb89f3-0511-216e-e6b0-3451b3579ccd";

@XendraTrl(Identifier="0d2fa597-51ac-146f-d1bb-4a6420cec98b")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_OrderLine WHERE C_Order_ID=@C_Order_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d2fa597-51ac-146f-d1bb-4a6420cec98b",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Line Amount.
@param LineNetAmt Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public void setLineNetAmt (BigDecimal LineNetAmt)
{
if (LineNetAmt == null) throw new IllegalArgumentException ("LineNetAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_LineNetAmt, LineNetAmt);
}
/** Get Line Amount.
@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public BigDecimal getLineNetAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fd1b0c51-c780-2dec-0291-7da090ad6696")
public static String es_PE_FIELD_OrderLine_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="fd1b0c51-c780-2dec-0291-7da090ad6696")
public static String es_PE_FIELD_OrderLine_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraTrl(Identifier="fd1b0c51-c780-2dec-0291-7da090ad6696")
public static String es_PE_FIELD_OrderLine_LineAmount_Name="Neto de Ítem";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd1b0c51-c780-2dec-0291-7da090ad6696")
public static final String FIELDNAME_OrderLine_LineAmount="fd1b0c51-c780-2dec-0291-7da090ad6696";

@XendraTrl(Identifier="ee9de8a1-c19a-ce77-d77b-6d75b9e81477")
public static String es_PE_FIELD_POLine_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="ee9de8a1-c19a-ce77-d77b-6d75b9e81477")
public static String es_PE_FIELD_POLine_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraTrl(Identifier="ee9de8a1-c19a-ce77-d77b-6d75b9e81477")
public static String es_PE_FIELD_POLine_LineAmount_Name="Neto de Ítem";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee9de8a1-c19a-ce77-d77b-6d75b9e81477")
public static final String FIELDNAME_POLine_LineAmount="ee9de8a1-c19a-ce77-d77b-6d75b9e81477";

@XendraTrl(Identifier="b9283dd0-47df-db63-801a-6bea08e23b5e")
public static String es_PE_FIELD_OrderLines_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="b9283dd0-47df-db63-801a-6bea08e23b5e")
public static String es_PE_FIELD_OrderLines_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraTrl(Identifier="b9283dd0-47df-db63-801a-6bea08e23b5e")
public static String es_PE_FIELD_OrderLines_LineAmount_Name="Neto de Línea";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9283dd0-47df-db63-801a-6bea08e23b5e")
public static final String FIELDNAME_OrderLines_LineAmount="b9283dd0-47df-db63-801a-6bea08e23b5e";

@XendraTrl(Identifier="28a184c1-ecdc-dc1e-cd97-96a4768a1393")
public static String es_PE_FIELD_PurchaseOrders_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="28a184c1-ecdc-dc1e-cd97-96a4768a1393")
public static String es_PE_FIELD_PurchaseOrders_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraTrl(Identifier="28a184c1-ecdc-dc1e-cd97-96a4768a1393")
public static String es_PE_FIELD_PurchaseOrders_LineAmount_Name="Neto de Línea";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28a184c1-ecdc-dc1e-cd97-96a4768a1393")
public static final String FIELDNAME_PurchaseOrders_LineAmount="28a184c1-ecdc-dc1e-cd97-96a4768a1393";

@XendraTrl(Identifier="cc42a95a-29cc-110f-3cfe-0bfaecd22854")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc42a95a-29cc-110f-3cfe-0bfaecd22854",
Synchronized="2017-08-05 16:53:57.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="60725fc7-3a91-b9c9-26b6-fd6e0a605d31")
public static String es_PE_FIELD_OrderLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="60725fc7-3a91-b9c9-26b6-fd6e0a605d31")
public static String es_PE_FIELD_OrderLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="60725fc7-3a91-b9c9-26b6-fd6e0a605d31")
public static String es_PE_FIELD_OrderLine_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60725fc7-3a91-b9c9-26b6-fd6e0a605d31")
public static final String FIELDNAME_OrderLine_AttributeSetInstance="60725fc7-3a91-b9c9-26b6-fd6e0a605d31";

@XendraTrl(Identifier="c04b08a6-c3e5-4acf-6fb9-1aefdcf4f24a")
public static String es_PE_FIELD_POLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="c04b08a6-c3e5-4acf-6fb9-1aefdcf4f24a")
public static String es_PE_FIELD_POLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="c04b08a6-c3e5-4acf-6fb9-1aefdcf4f24a")
public static String es_PE_FIELD_POLine_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Line",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c04b08a6-c3e5-4acf-6fb9-1aefdcf4f24a")
public static final String FIELDNAME_POLine_AttributeSetInstance="c04b08a6-c3e5-4acf-6fb9-1aefdcf4f24a";

@XendraTrl(Identifier="77b4a258-d661-708f-95bb-f0518b078589")
public static String es_PE_FIELD_OrderLines_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="77b4a258-d661-708f-95bb-f0518b078589")
public static String es_PE_FIELD_OrderLines_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="77b4a258-d661-708f-95bb-f0518b078589")
public static String es_PE_FIELD_OrderLines_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77b4a258-d661-708f-95bb-f0518b078589")
public static final String FIELDNAME_OrderLines_AttributeSetInstance="77b4a258-d661-708f-95bb-f0518b078589";

@XendraTrl(Identifier="48254787-a893-28bf-e4d8-e26dfd0adddb")
public static String es_PE_FIELD_PurchaseOrders_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="48254787-a893-28bf-e4d8-e26dfd0adddb")
public static String es_PE_FIELD_PurchaseOrders_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="48254787-a893-28bf-e4d8-e26dfd0adddb")
public static String es_PE_FIELD_PurchaseOrders_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48254787-a893-28bf-e4d8-e26dfd0adddb")
public static final String FIELDNAME_PurchaseOrders_AttributeSetInstance="48254787-a893-28bf-e4d8-e26dfd0adddb";

@XendraTrl(Identifier="2bdab3c4-abb6-df01-c574-3642a90a91d2")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="org.compiere.model.CalloutOrder.qty",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="2bdab3c4-abb6-df01-c574-3642a90a91d2",
Synchronized="2017-08-05 16:53:57.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a03dbd0-a6ec-d6c0-6b75-94c1bb45d6cb")
public static String es_PE_FIELD_OrderLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="0a03dbd0-a6ec-d6c0-6b75-94c1bb45d6cb")
public static String es_PE_FIELD_OrderLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="0a03dbd0-a6ec-d6c0-6b75-94c1bb45d6cb")
public static String es_PE_FIELD_OrderLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a03dbd0-a6ec-d6c0-6b75-94c1bb45d6cb")
public static final String FIELDNAME_OrderLine_Product="0a03dbd0-a6ec-d6c0-6b75-94c1bb45d6cb";

@XendraTrl(Identifier="a7799498-f950-9c1b-38ad-3d79bcfe0521")
public static String es_PE_FIELD_POLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="a7799498-f950-9c1b-38ad-3d79bcfe0521")
public static String es_PE_FIELD_POLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="a7799498-f950-9c1b-38ad-3d79bcfe0521")
public static String es_PE_FIELD_POLine_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Line",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7799498-f950-9c1b-38ad-3d79bcfe0521")
public static final String FIELDNAME_POLine_Product="a7799498-f950-9c1b-38ad-3d79bcfe0521";

@XendraTrl(Identifier="bd511bcc-9738-fa90-6bc9-a304ae21ceb3")
public static String es_PE_FIELD_OrderLines_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="bd511bcc-9738-fa90-6bc9-a304ae21ceb3")
public static String es_PE_FIELD_OrderLines_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="bd511bcc-9738-fa90-6bc9-a304ae21ceb3")
public static String es_PE_FIELD_OrderLines_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd511bcc-9738-fa90-6bc9-a304ae21ceb3")
public static final String FIELDNAME_OrderLines_Product="bd511bcc-9738-fa90-6bc9-a304ae21ceb3";

@XendraTrl(Identifier="db93aac5-12fb-4410-fad5-861b5507917e")
public static String es_PE_FIELD_PurchaseOrders_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="db93aac5-12fb-4410-fad5-861b5507917e")
public static String es_PE_FIELD_PurchaseOrders_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="db93aac5-12fb-4410-fad5-861b5507917e")
public static String es_PE_FIELD_PurchaseOrders_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db93aac5-12fb-4410-fad5-861b5507917e")
public static final String FIELDNAME_PurchaseOrders_Product="db93aac5-12fb-4410-fad5-861b5507917e";

@XendraTrl(Identifier="bf7e2b80-3679-8f0b-fc2f-299b636f3d06")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@S_ResourceAssignment_ID@!0 | @C_Charge_ID@!0",IsIdentifier=false,
SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutOrder.product;org.compiere.model.CalloutOrder.amt;org.compiere.model.CalloutOrder.qty",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bf7e2b80-3679-8f0b-fc2f-299b636f3d06",Synchronized="2017-08-05 16:53:57.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Shipper.
@param M_Shipper_ID Method or manner of product delivery */
public void setM_Shipper_ID (int M_Shipper_ID)
{
if (M_Shipper_ID <= 0) set_Value (COLUMNNAME_M_Shipper_ID, null);
 else 
set_Value (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
}
/** Get Shipper.
@return Method or manner of product delivery */
public int getM_Shipper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="590550bd-28a2-84c4-1280-a3593f8c0d77")
public static String es_PE_FIELD_OrderLine_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="590550bd-28a2-84c4-1280-a3593f8c0d77")
public static String es_PE_FIELD_OrderLine_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="590550bd-28a2-84c4-1280-a3593f8c0d77")
public static String es_PE_FIELD_OrderLine_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@='S'",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="590550bd-28a2-84c4-1280-a3593f8c0d77")
public static final String FIELDNAME_OrderLine_Shipper="590550bd-28a2-84c4-1280-a3593f8c0d77";

@XendraTrl(Identifier="3bb5f198-f71c-9223-a23a-0a6806a02cda")
public static String es_PE_FIELD_POLine_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="3bb5f198-f71c-9223-a23a-0a6806a02cda")
public static String es_PE_FIELD_POLine_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="3bb5f198-f71c-9223-a23a-0a6806a02cda")
public static String es_PE_FIELD_POLine_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@='S'",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3bb5f198-f71c-9223-a23a-0a6806a02cda")
public static final String FIELDNAME_POLine_Shipper="3bb5f198-f71c-9223-a23a-0a6806a02cda";

@XendraTrl(Identifier="a15faae5-9176-8315-3bed-d901c73cbc14")
public static String es_PE_FIELD_OrderLines_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="a15faae5-9176-8315-3bed-d901c73cbc14")
public static String es_PE_FIELD_OrderLines_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="a15faae5-9176-8315-3bed-d901c73cbc14")
public static String es_PE_FIELD_OrderLines_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a15faae5-9176-8315-3bed-d901c73cbc14")
public static final String FIELDNAME_OrderLines_Shipper="a15faae5-9176-8315-3bed-d901c73cbc14";

@XendraTrl(Identifier="c705649c-378e-2945-97f5-05f4140a2f12")
public static String es_PE_FIELD_PurchaseOrders_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="c705649c-378e-2945-97f5-05f4140a2f12")
public static String es_PE_FIELD_PurchaseOrders_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="c705649c-378e-2945-97f5-05f4140a2f12")
public static String es_PE_FIELD_PurchaseOrders_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c705649c-378e-2945-97f5-05f4140a2f12")
public static final String FIELDNAME_PurchaseOrders_Shipper="c705649c-378e-2945-97f5-05f4140a2f12";

@XendraTrl(Identifier="38758f20-50b1-dbdf-f3d3-83e41ab099cd")
public static String es_PE_COLUMN_M_Shipper_ID_Name="Transportista";

@XendraColumn(AD_Element_ID="9aa20cfc-6f2b-2463-7be0-888a548ba3ad",ColumnName="M_Shipper_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@M_Shipper_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="38758f20-50b1-dbdf-f3d3-83e41ab099cd",Synchronized="2017-08-05 16:53:57.0")
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";

/** M_Warehouse_ID AD_Reference=e3999c76-66f0-38b0-a95e-fb0d580cde7a */
public static final int M_WAREHOUSE_ID_AD_Reference_ID=197;
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

@XendraTrl(Identifier="4b78f058-6ff0-1e01-da43-5f4cc4186563")
public static String es_PE_FIELD_OrderLine_Warehouse_Description="Almacén";

@XendraTrl(Identifier="4b78f058-6ff0-1e01-da43-5f4cc4186563")
public static String es_PE_FIELD_OrderLine_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="4b78f058-6ff0-1e01-da43-5f4cc4186563")
public static String es_PE_FIELD_OrderLine_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DirectShip@='N' & @OrderType@='OB' | @OrderType@='SO' | @Processed@='Y'",
DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b78f058-6ff0-1e01-da43-5f4cc4186563")
public static final String FIELDNAME_OrderLine_Warehouse="4b78f058-6ff0-1e01-da43-5f4cc4186563";

@XendraTrl(Identifier="9795578d-e702-1b16-3fe0-2b98a663a41a")
public static String es_PE_FIELD_POLine_Warehouse_Description="Almacén";

@XendraTrl(Identifier="9795578d-e702-1b16-3fe0-2b98a663a41a")
public static String es_PE_FIELD_POLine_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="9795578d-e702-1b16-3fe0-2b98a663a41a")
public static String es_PE_FIELD_POLine_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Line",IsDisplayed=true,
DisplayLogic="@DirectShip@='N'",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9795578d-e702-1b16-3fe0-2b98a663a41a")
public static final String FIELDNAME_POLine_Warehouse="9795578d-e702-1b16-3fe0-2b98a663a41a";

@XendraTrl(Identifier="68adb624-4342-91f6-bd10-49bafb7ce523")
public static String es_PE_FIELD_OrderLines_Warehouse_Description="Almacén";

@XendraTrl(Identifier="68adb624-4342-91f6-bd10-49bafb7ce523")
public static String es_PE_FIELD_OrderLines_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="68adb624-4342-91f6-bd10-49bafb7ce523")
public static String es_PE_FIELD_OrderLines_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68adb624-4342-91f6-bd10-49bafb7ce523")
public static final String FIELDNAME_OrderLines_Warehouse="68adb624-4342-91f6-bd10-49bafb7ce523";

@XendraTrl(Identifier="59a9c735-cedf-5202-ae67-73bcf5a08c27")
public static String es_PE_FIELD_PurchaseOrders_Warehouse_Description="Almacén";

@XendraTrl(Identifier="59a9c735-cedf-5202-ae67-73bcf5a08c27")
public static String es_PE_FIELD_PurchaseOrders_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="59a9c735-cedf-5202-ae67-73bcf5a08c27")
public static String es_PE_FIELD_PurchaseOrders_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59a9c735-cedf-5202-ae67-73bcf5a08c27")
public static final String FIELDNAME_PurchaseOrders_Warehouse="59a9c735-cedf-5202-ae67-73bcf5a08c27";

@XendraTrl(Identifier="3bfb6399-ede0-a6e5-6481-5e7254507c26")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="e3999c76-66f0-38b0-a95e-fb0d580cde7a",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="@M_Warehouse_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="@OrderType@!'SO'",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bfb6399-ede0-a6e5-6481-5e7254507c26",
Synchronized="2017-08-05 16:53:57.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set PriceAcquisition.
@param PriceAcquisition PriceAcquisition */
public void setPriceAcquisition (BigDecimal PriceAcquisition)
{
set_Value (COLUMNNAME_PriceAcquisition, PriceAcquisition);
}
/** Get PriceAcquisition.
@return PriceAcquisition */
public BigDecimal getPriceAcquisition() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceAcquisition);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fa42688a-22c8-bcee-499d-98562c72301f")
public static String es_PE_FIELD_OrderLine_PriceAcquisition_Name="PriceAcquisition";

@XendraField(AD_Column_ID="PriceAcquisition",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa42688a-22c8-bcee-499d-98562c72301f")
public static final String FIELDNAME_OrderLine_PriceAcquisition="fa42688a-22c8-bcee-499d-98562c72301f";

@XendraTrl(Identifier="1819b6b9-0df8-f035-eb1b-60ab8ec697aa")
public static String es_PE_FIELD_POLine_PriceAcquisition_Name="Precio de Final";

@XendraField(AD_Column_ID="PriceAcquisition",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1819b6b9-0df8-f035-eb1b-60ab8ec697aa")
public static final String FIELDNAME_POLine_PriceAcquisition="1819b6b9-0df8-f035-eb1b-60ab8ec697aa";

@XendraTrl(Identifier="31218ca5-4422-8cd5-a4da-8f1a7f961f21")
public static String es_PE_COLUMN_PriceAcquisition_Name="PriceAcquisition";

@XendraColumn(AD_Element_ID="646f765c-eaa2-f974-85cd-df7e3e16c293",ColumnName="PriceAcquisition",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31218ca5-4422-8cd5-a4da-8f1a7f961f21",
Synchronized="2017-08-05 16:53:57.0")
/** Column name PriceAcquisition */
public static final String COLUMNNAME_PriceAcquisition = "PriceAcquisition";
/** Set Unit Price.
@param PriceActual Actual Price  */
public void setPriceActual (BigDecimal PriceActual)
{
if (PriceActual == null) throw new IllegalArgumentException ("PriceActual is mandatory.");
set_ValueNoCheck (COLUMNNAME_PriceActual, PriceActual);
}
/** Get Unit Price.
@return Actual Price  */
public BigDecimal getPriceActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b57632f6-3b27-40fe-944f-80c7f2a46bb9")
public static String es_PE_FIELD_OrderLine_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="b57632f6-3b27-40fe-944f-80c7f2a46bb9")
public static String es_PE_FIELD_OrderLine_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraTrl(Identifier="b57632f6-3b27-40fe-944f-80c7f2a46bb9")
public static String es_PE_FIELD_OrderLine_UnitPrice_Name="Precio Actual";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b57632f6-3b27-40fe-944f-80c7f2a46bb9")
public static final String FIELDNAME_OrderLine_UnitPrice="b57632f6-3b27-40fe-944f-80c7f2a46bb9";

@XendraTrl(Identifier="28a8ec59-3f49-8c60-66bc-4277549bea59")
public static String es_PE_FIELD_POLine_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="28a8ec59-3f49-8c60-66bc-4277549bea59")
public static String es_PE_FIELD_POLine_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraTrl(Identifier="28a8ec59-3f49-8c60-66bc-4277549bea59")
public static String es_PE_FIELD_POLine_UnitPrice_Name="Precio Actual";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28a8ec59-3f49-8c60-66bc-4277549bea59")
public static final String FIELDNAME_POLine_UnitPrice="28a8ec59-3f49-8c60-66bc-4277549bea59";

@XendraTrl(Identifier="2b61b1c9-f530-04e7-622e-0b5735c2b728")
public static String es_PE_FIELD_OrderLines_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="2b61b1c9-f530-04e7-622e-0b5735c2b728")
public static String es_PE_FIELD_OrderLines_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraTrl(Identifier="2b61b1c9-f530-04e7-622e-0b5735c2b728")
public static String es_PE_FIELD_OrderLines_UnitPrice_Name="Precio Actual";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b61b1c9-f530-04e7-622e-0b5735c2b728")
public static final String FIELDNAME_OrderLines_UnitPrice="2b61b1c9-f530-04e7-622e-0b5735c2b728";

@XendraTrl(Identifier="d7235717-ff41-c882-4735-5cf75ebba529")
public static String es_PE_FIELD_PurchaseOrders_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="d7235717-ff41-c882-4735-5cf75ebba529")
public static String es_PE_FIELD_PurchaseOrders_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraTrl(Identifier="d7235717-ff41-c882-4735-5cf75ebba529")
public static String es_PE_FIELD_PurchaseOrders_UnitPrice_Name="Precio Actual";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7235717-ff41-c882-4735-5cf75ebba529")
public static final String FIELDNAME_PurchaseOrders_UnitPrice="d7235717-ff41-c882-4735-5cf75ebba529";

@XendraTrl(Identifier="3925d9b6-7973-678b-5d6c-c3d1bfb55201")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3925d9b6-7973-678b-5d6c-c3d1bfb55201",Synchronized="2017-08-05 16:53:57.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";
/** Set PriceBase.
@param PriceBase PriceBase */
public void setPriceBase (BigDecimal PriceBase)
{
set_Value (COLUMNNAME_PriceBase, PriceBase);
}
/** Get PriceBase.
@return PriceBase */
public BigDecimal getPriceBase() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceBase);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a9b12d5a-132c-a071-ab7d-b07b1391be9a")
public static String es_PE_FIELD_OrderLine_PriceBase_Name="Precio Base";

@XendraField(AD_Column_ID="PriceBase",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9b12d5a-132c-a071-ab7d-b07b1391be9a")
public static final String FIELDNAME_OrderLine_PriceBase="a9b12d5a-132c-a071-ab7d-b07b1391be9a";

@XendraTrl(Identifier="ada91a30-7c01-4d94-b525-8fa428b1c07f")
public static String es_PE_FIELD_POLine_PriceBase_Name="Precio Base";

@XendraField(AD_Column_ID="PriceBase",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ada91a30-7c01-4d94-b525-8fa428b1c07f")
public static final String FIELDNAME_POLine_PriceBase="ada91a30-7c01-4d94-b525-8fa428b1c07f";

@XendraTrl(Identifier="73206858-3090-f47a-d7ff-a769febf5f15")
public static String es_PE_COLUMN_PriceBase_Name="pricebase";

@XendraColumn(AD_Element_ID="2342314a-e1c4-dc0e-b83e-ec9a9a83fd0a",ColumnName="PriceBase",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73206858-3090-f47a-d7ff-a769febf5f15",
Synchronized="2017-08-05 16:53:57.0")
/** Column name PriceBase */
public static final String COLUMNNAME_PriceBase = "PriceBase";
/** Set Cost Price.
@param PriceCost Price per Unit of Measure including all indirect costs (Freight, etc.) */
public void setPriceCost (BigDecimal PriceCost)
{
set_Value (COLUMNNAME_PriceCost, PriceCost);
}
/** Get Cost Price.
@return Price per Unit of Measure including all indirect costs (Freight, etc.) */
public BigDecimal getPriceCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f72c560c-11f8-c192-050b-2abac118a8a0")
public static String es_PE_FIELD_OrderLine_CostPrice_Description="Precio por Unidad de Medida incluyendo todos los costos indirectos (Flete, etc.)";

@XendraTrl(Identifier="f72c560c-11f8-c192-050b-2abac118a8a0")
public static String es_PE_FIELD_OrderLine_CostPrice_Help="Opcional precio de costo Línea Orden de Compra ";

@XendraTrl(Identifier="f72c560c-11f8-c192-050b-2abac118a8a0")
public static String es_PE_FIELD_OrderLine_CostPrice_Name="Precio de Costo";

@XendraField(AD_Column_ID="PriceCost",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f72c560c-11f8-c192-050b-2abac118a8a0")
public static final String FIELDNAME_OrderLine_CostPrice="f72c560c-11f8-c192-050b-2abac118a8a0";

@XendraTrl(Identifier="08c0ae40-27ce-efb9-f6be-fc36bf34bcf0")
public static String es_PE_FIELD_POLine_CostPrice_Description="Precio por Unidad de Medida incluyendo todos los costos indirectos (Flete, etc.)";

@XendraTrl(Identifier="08c0ae40-27ce-efb9-f6be-fc36bf34bcf0")
public static String es_PE_FIELD_POLine_CostPrice_Help="Opcional precio de costo Línea Orden de Compra ";

@XendraTrl(Identifier="08c0ae40-27ce-efb9-f6be-fc36bf34bcf0")
public static String es_PE_FIELD_POLine_CostPrice_Name="Precio de Costo";

@XendraField(AD_Column_ID="PriceCost",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08c0ae40-27ce-efb9-f6be-fc36bf34bcf0")
public static final String FIELDNAME_POLine_CostPrice="08c0ae40-27ce-efb9-f6be-fc36bf34bcf0";

@XendraTrl(Identifier="fe4dfe64-3502-997a-83eb-e569e671e960")
public static String es_PE_FIELD_PurchaseOrders_CostPrice_Description="Precio por Unidad de Medida incluyendo todos los costos indirectos (Flete, etc.)";

@XendraTrl(Identifier="fe4dfe64-3502-997a-83eb-e569e671e960")
public static String es_PE_FIELD_PurchaseOrders_CostPrice_Help="Opcional precio de costo Línea Orden de Compra ";

@XendraTrl(Identifier="fe4dfe64-3502-997a-83eb-e569e671e960")
public static String es_PE_FIELD_PurchaseOrders_CostPrice_Name="Precio de Costo";

@XendraField(AD_Column_ID="PriceCost",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe4dfe64-3502-997a-83eb-e569e671e960")
public static final String FIELDNAME_PurchaseOrders_CostPrice="fe4dfe64-3502-997a-83eb-e569e671e960";

@XendraTrl(Identifier="d2dcbb19-c76c-b3c8-3b8c-4ef46c3f60f0")
public static String es_PE_COLUMN_PriceCost_Name="Precio de Costo";

@XendraColumn(AD_Element_ID="decf6dde-230c-11ea-c777-e7b052b8e69e",ColumnName="PriceCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2dcbb19-c76c-b3c8-3b8c-4ef46c3f60f0",
Synchronized="2017-08-05 16:53:57.0")
/** Column name PriceCost */
public static final String COLUMNNAME_PriceCost = "PriceCost";
/** Set Price.
@param PriceEntered Price Entered - the price based on the selected/base UoM */
public void setPriceEntered (BigDecimal PriceEntered)
{
if (PriceEntered == null) throw new IllegalArgumentException ("PriceEntered is mandatory.");
set_Value (COLUMNNAME_PriceEntered, PriceEntered);
}
/** Get Price.
@return Price Entered - the price based on the selected/base UoM */
public BigDecimal getPriceEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="656c2e9d-a7fb-e3ff-53ed-535b19e00584")
public static String es_PE_FIELD_OrderLine_Price_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="656c2e9d-a7fb-e3ff-53ed-535b19e00584")
public static String es_PE_FIELD_OrderLine_Price_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraTrl(Identifier="656c2e9d-a7fb-e3ff-53ed-535b19e00584")
public static String es_PE_FIELD_OrderLine_Price_Name="Precio";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="656c2e9d-a7fb-e3ff-53ed-535b19e00584")
public static final String FIELDNAME_OrderLine_Price="656c2e9d-a7fb-e3ff-53ed-535b19e00584";

@XendraTrl(Identifier="8ab9e448-e50c-8102-3c99-7a721455179c")
public static String es_PE_FIELD_POLine_Price_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="8ab9e448-e50c-8102-3c99-7a721455179c")
public static String es_PE_FIELD_POLine_Price_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraTrl(Identifier="8ab9e448-e50c-8102-3c99-7a721455179c")
public static String es_PE_FIELD_POLine_Price_Name="Precio";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ab9e448-e50c-8102-3c99-7a721455179c")
public static final String FIELDNAME_POLine_Price="8ab9e448-e50c-8102-3c99-7a721455179c";

@XendraTrl(Identifier="a3a95f79-3e10-c7e0-2cf5-ae881bf9da6d")
public static String es_PE_FIELD_OrderLines_Price_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="a3a95f79-3e10-c7e0-2cf5-ae881bf9da6d")
public static String es_PE_FIELD_OrderLines_Price_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraTrl(Identifier="a3a95f79-3e10-c7e0-2cf5-ae881bf9da6d")
public static String es_PE_FIELD_OrderLines_Price_Name="Precio";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3a95f79-3e10-c7e0-2cf5-ae881bf9da6d")
public static final String FIELDNAME_OrderLines_Price="a3a95f79-3e10-c7e0-2cf5-ae881bf9da6d";

@XendraTrl(Identifier="55b8b1dd-218e-6332-318e-4c69a9771963")
public static String es_PE_FIELD_PurchaseOrders_Price_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="55b8b1dd-218e-6332-318e-4c69a9771963")
public static String es_PE_FIELD_PurchaseOrders_Price_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraTrl(Identifier="55b8b1dd-218e-6332-318e-4c69a9771963")
public static String es_PE_FIELD_PurchaseOrders_Price_Name="Precio";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55b8b1dd-218e-6332-318e-4c69a9771963")
public static final String FIELDNAME_PurchaseOrders_Price="55b8b1dd-218e-6332-318e-4c69a9771963";

@XendraTrl(Identifier="4938cff4-1fec-b393-40fe-75bc24caf3d8")
public static String es_PE_COLUMN_PriceEntered_Name="Precio";

@XendraColumn(AD_Element_ID="c0a272c7-da17-7089-b9a4-6aeab9e222ef",ColumnName="PriceEntered",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4938cff4-1fec-b393-40fe-75bc24caf3d8",Synchronized="2017-08-05 16:53:57.0")
/** Column name PriceEntered */
public static final String COLUMNNAME_PriceEntered = "PriceEntered";
/** Set Limit Price.
@param PriceLimit Lowest price for a product */
public void setPriceLimit (BigDecimal PriceLimit)
{
if (PriceLimit == null) throw new IllegalArgumentException ("PriceLimit is mandatory.");
set_Value (COLUMNNAME_PriceLimit, PriceLimit);
}
/** Get Limit Price.
@return Lowest price for a product */
public BigDecimal getPriceLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2432341f-aa00-5d80-5dd4-15488ea9ece5")
public static String es_PE_FIELD_OrderLine_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="2432341f-aa00-5d80-5dd4-15488ea9ece5")
public static String es_PE_FIELD_OrderLine_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraTrl(Identifier="2432341f-aa00-5d80-5dd4-15488ea9ece5")
public static String es_PE_FIELD_OrderLine_LimitPrice_Name="Precio Límite";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2432341f-aa00-5d80-5dd4-15488ea9ece5")
public static final String FIELDNAME_OrderLine_LimitPrice="2432341f-aa00-5d80-5dd4-15488ea9ece5";

@XendraTrl(Identifier="3334ae35-8d26-072b-ef68-ac72e4c1af77")
public static String es_PE_FIELD_POLine_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="3334ae35-8d26-072b-ef68-ac72e4c1af77")
public static String es_PE_FIELD_POLine_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraTrl(Identifier="3334ae35-8d26-072b-ef68-ac72e4c1af77")
public static String es_PE_FIELD_POLine_LimitPrice_Name="Precio Límite";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Amounts",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3334ae35-8d26-072b-ef68-ac72e4c1af77")
public static final String FIELDNAME_POLine_LimitPrice="3334ae35-8d26-072b-ef68-ac72e4c1af77";

@XendraTrl(Identifier="75238320-4521-bfc9-cf85-ce02f5cf1a4f")
public static String es_PE_FIELD_OrderLines_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="75238320-4521-bfc9-cf85-ce02f5cf1a4f")
public static String es_PE_FIELD_OrderLines_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraTrl(Identifier="75238320-4521-bfc9-cf85-ce02f5cf1a4f")
public static String es_PE_FIELD_OrderLines_LimitPrice_Name="Precio Límite";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75238320-4521-bfc9-cf85-ce02f5cf1a4f")
public static final String FIELDNAME_OrderLines_LimitPrice="75238320-4521-bfc9-cf85-ce02f5cf1a4f";

@XendraTrl(Identifier="20d94a17-8b79-4ce5-a243-cd98ef9bdc78")
public static String es_PE_FIELD_PurchaseOrders_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="20d94a17-8b79-4ce5-a243-cd98ef9bdc78")
public static String es_PE_FIELD_PurchaseOrders_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraTrl(Identifier="20d94a17-8b79-4ce5-a243-cd98ef9bdc78")
public static String es_PE_FIELD_PurchaseOrders_LimitPrice_Name="Precio Límite";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20d94a17-8b79-4ce5-a243-cd98ef9bdc78")
public static final String FIELDNAME_PurchaseOrders_LimitPrice="20d94a17-8b79-4ce5-a243-cd98ef9bdc78";

@XendraTrl(Identifier="a91d9e08-84ab-b73d-c6a0-88d6ec6f8d67")
public static String es_PE_COLUMN_PriceLimit_Name="Precio Límite";

@XendraColumn(AD_Element_ID="0dbee629-4878-ced9-eafa-0f6bdfb99af4",ColumnName="PriceLimit",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a91d9e08-84ab-b73d-c6a0-88d6ec6f8d67",
Synchronized="2017-08-05 16:53:57.0")
/** Column name PriceLimit */
public static final String COLUMNNAME_PriceLimit = "PriceLimit";
/** Set List Price.
@param PriceList List Price */
public void setPriceList (BigDecimal PriceList)
{
if (PriceList == null) throw new IllegalArgumentException ("PriceList is mandatory.");
set_Value (COLUMNNAME_PriceList, PriceList);
}
/** Get List Price.
@return List Price */
public BigDecimal getPriceList() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceList);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="66639bae-de65-f238-6614-cabba605dbe0")
public static String es_PE_FIELD_OrderLine_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="66639bae-de65-f238-6614-cabba605dbe0")
public static String es_PE_FIELD_OrderLine_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraTrl(Identifier="66639bae-de65-f238-6614-cabba605dbe0")
public static String es_PE_FIELD_OrderLine_ListPrice_Name="Precio de Lista";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66639bae-de65-f238-6614-cabba605dbe0")
public static final String FIELDNAME_OrderLine_ListPrice="66639bae-de65-f238-6614-cabba605dbe0";

@XendraTrl(Identifier="53f7263f-1eef-69a5-fd3b-a37f25e11dbe")
public static String es_PE_FIELD_POLine_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="53f7263f-1eef-69a5-fd3b-a37f25e11dbe")
public static String es_PE_FIELD_POLine_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraTrl(Identifier="53f7263f-1eef-69a5-fd3b-a37f25e11dbe")
public static String es_PE_FIELD_POLine_ListPrice_Name="Precio de Lista";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53f7263f-1eef-69a5-fd3b-a37f25e11dbe")
public static final String FIELDNAME_POLine_ListPrice="53f7263f-1eef-69a5-fd3b-a37f25e11dbe";

@XendraTrl(Identifier="f3b1611e-d1f1-5dd9-150a-751c9db89cb6")
public static String es_PE_FIELD_OrderLines_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="f3b1611e-d1f1-5dd9-150a-751c9db89cb6")
public static String es_PE_FIELD_OrderLines_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraTrl(Identifier="f3b1611e-d1f1-5dd9-150a-751c9db89cb6")
public static String es_PE_FIELD_OrderLines_ListPrice_Name="Precio de Lista";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3b1611e-d1f1-5dd9-150a-751c9db89cb6")
public static final String FIELDNAME_OrderLines_ListPrice="f3b1611e-d1f1-5dd9-150a-751c9db89cb6";

@XendraTrl(Identifier="a8ac3cb7-4f1e-7813-9c73-ed6a9f0fc21c")
public static String es_PE_FIELD_PurchaseOrders_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="a8ac3cb7-4f1e-7813-9c73-ed6a9f0fc21c")
public static String es_PE_FIELD_PurchaseOrders_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraTrl(Identifier="a8ac3cb7-4f1e-7813-9c73-ed6a9f0fc21c")
public static String es_PE_FIELD_PurchaseOrders_ListPrice_Name="Precio de Lista";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8ac3cb7-4f1e-7813-9c73-ed6a9f0fc21c")
public static final String FIELDNAME_PurchaseOrders_ListPrice="a8ac3cb7-4f1e-7813-9c73-ed6a9f0fc21c";

@XendraTrl(Identifier="45cb98d8-66f5-5fa0-c00e-2b11a57a969e")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutOrder.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="45cb98d8-66f5-5fa0-c00e-2b11a57a969e",Synchronized="2017-08-05 16:53:57.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";
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

@XendraTrl(Identifier="b6678e91-3b6e-142d-acd9-06b89c646e92")
public static String es_PE_FIELD_OrderLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b6678e91-3b6e-142d-acd9-06b89c646e92")
public static String es_PE_FIELD_OrderLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b6678e91-3b6e-142d-acd9-06b89c646e92")
public static String es_PE_FIELD_OrderLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=1,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6678e91-3b6e-142d-acd9-06b89c646e92")
public static final String FIELDNAME_OrderLine_Processed="b6678e91-3b6e-142d-acd9-06b89c646e92";

@XendraTrl(Identifier="ebca9d6d-5abb-8a70-8b1a-bbb4c4039b29")
public static String es_PE_FIELD_POLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="ebca9d6d-5abb-8a70-8b1a-bbb4c4039b29")
public static String es_PE_FIELD_POLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="ebca9d6d-5abb-8a70-8b1a-bbb4c4039b29")
public static String es_PE_FIELD_POLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebca9d6d-5abb-8a70-8b1a-bbb4c4039b29")
public static final String FIELDNAME_POLine_Processed="ebca9d6d-5abb-8a70-8b1a-bbb4c4039b29";

@XendraTrl(Identifier="b157176c-e8aa-7e7a-7367-ccec89f40725")
public static String es_PE_FIELD_OrderLines_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b157176c-e8aa-7e7a-7367-ccec89f40725")
public static String es_PE_FIELD_OrderLines_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b157176c-e8aa-7e7a-7367-ccec89f40725")
public static String es_PE_FIELD_OrderLines_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b157176c-e8aa-7e7a-7367-ccec89f40725")
public static final String FIELDNAME_OrderLines_Processed="b157176c-e8aa-7e7a-7367-ccec89f40725";

@XendraTrl(Identifier="387a4fb0-f9e8-3964-9c41-67d3d944edc4")
public static String es_PE_FIELD_PurchaseOrders_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="387a4fb0-f9e8-3964-9c41-67d3d944edc4")
public static String es_PE_FIELD_PurchaseOrders_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="387a4fb0-f9e8-3964-9c41-67d3d944edc4")
public static String es_PE_FIELD_PurchaseOrders_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="387a4fb0-f9e8-3964-9c41-67d3d944edc4")
public static final String FIELDNAME_PurchaseOrders_Processed="387a4fb0-f9e8-3964-9c41-67d3d944edc4";

@XendraTrl(Identifier="603f41a6-6941-311c-277e-1ae89fdeea19")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="603f41a6-6941-311c-277e-1ae89fdeea19",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set QtyBonus.
@param QtyBonus QtyBonus */
public void setQtyBonus (BigDecimal QtyBonus)
{
set_Value (COLUMNNAME_QtyBonus, QtyBonus);
}
/** Get QtyBonus.
@return QtyBonus */
public BigDecimal getQtyBonus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyBonus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fcd62051-8ceb-1757-0526-785476520499")
public static String es_PE_FIELD_OrderLine_QtyBonus_Name="Cant.Bonificada";

@XendraField(AD_Column_ID="QtyBonus",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcd62051-8ceb-1757-0526-785476520499")
public static final String FIELDNAME_OrderLine_QtyBonus="fcd62051-8ceb-1757-0526-785476520499";

@XendraTrl(Identifier="7b601913-8fe3-48ef-aefd-a57104a78ae5")
public static String es_PE_FIELD_POLine_QtyBonus_Name="Cantidad Bonificada";

@XendraField(AD_Column_ID="QtyBonus",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b601913-8fe3-48ef-aefd-a57104a78ae5")
public static final String FIELDNAME_POLine_QtyBonus="7b601913-8fe3-48ef-aefd-a57104a78ae5";

@XendraTrl(Identifier="008a6f45-62c5-0397-9ae3-5f45bf0ae906")
public static String es_PE_COLUMN_QtyBonus_Name="QtyBonus";

@XendraColumn(AD_Element_ID="6b9c3175-594a-52b1-5954-95db31e6038c",ColumnName="QtyBonus",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="008a6f45-62c5-0397-9ae3-5f45bf0ae906",
Synchronized="2017-08-05 16:53:57.0")
/** Column name QtyBonus */
public static final String COLUMNNAME_QtyBonus = "QtyBonus";
/** Set Delivered Quantity.
@param QtyDelivered Delivered Quantity */
public void setQtyDelivered (BigDecimal QtyDelivered)
{
if (QtyDelivered == null) throw new IllegalArgumentException ("QtyDelivered is mandatory.");
set_ValueNoCheck (COLUMNNAME_QtyDelivered, QtyDelivered);
}
/** Get Delivered Quantity.
@return Delivered Quantity */
public BigDecimal getQtyDelivered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyDelivered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3bf38d5c-20f3-8a16-6551-a901b13891bf")
public static String es_PE_FIELD_OrderLine_DeliveredQuantity_Description="Cantidad entregada";

@XendraTrl(Identifier="3bf38d5c-20f3-8a16-6551-a901b13891bf")
public static String es_PE_FIELD_OrderLine_DeliveredQuantity_Help="La cantidad entregada indica la cantidad de un producto que ha sido entregada";

@XendraTrl(Identifier="3bf38d5c-20f3-8a16-6551-a901b13891bf")
public static String es_PE_FIELD_OrderLine_DeliveredQuantity_Name="Cantidad Entregada";

@XendraField(AD_Column_ID="QtyDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="@OrderType@='OB' | @OrderType@='SO' | @Processed@='Y'",DisplayLength=26,
IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3bf38d5c-20f3-8a16-6551-a901b13891bf")
public static final String FIELDNAME_OrderLine_DeliveredQuantity="3bf38d5c-20f3-8a16-6551-a901b13891bf";

@XendraTrl(Identifier="f468b46e-d97e-6619-42e3-0c8dbfbdcdf4")
public static String es_PE_FIELD_POLine_DeliveredQuantity_Description="Cantidad entregada";

@XendraTrl(Identifier="f468b46e-d97e-6619-42e3-0c8dbfbdcdf4")
public static String es_PE_FIELD_POLine_DeliveredQuantity_Help="La cantidad entregada indica la cantidad de un producto que ha sido entregada";

@XendraTrl(Identifier="f468b46e-d97e-6619-42e3-0c8dbfbdcdf4")
public static String es_PE_FIELD_POLine_DeliveredQuantity_Name="Cantidad Entregada";

@XendraField(AD_Column_ID="QtyDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f468b46e-d97e-6619-42e3-0c8dbfbdcdf4")
public static final String FIELDNAME_POLine_DeliveredQuantity="f468b46e-d97e-6619-42e3-0c8dbfbdcdf4";

@XendraTrl(Identifier="1b69805b-18e6-e08b-7281-31ec97d9b2f5")
public static String es_PE_FIELD_OrderLines_DeliveredQuantity_Description="Cantidad entregada";

@XendraTrl(Identifier="1b69805b-18e6-e08b-7281-31ec97d9b2f5")
public static String es_PE_FIELD_OrderLines_DeliveredQuantity_Help="La cantidad entregada indica la cantidad de un producto que ha sido entregada";

@XendraTrl(Identifier="1b69805b-18e6-e08b-7281-31ec97d9b2f5")
public static String es_PE_FIELD_OrderLines_DeliveredQuantity_Name="Cantidad Entregada";

@XendraField(AD_Column_ID="QtyDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b69805b-18e6-e08b-7281-31ec97d9b2f5")
public static final String FIELDNAME_OrderLines_DeliveredQuantity="1b69805b-18e6-e08b-7281-31ec97d9b2f5";

@XendraTrl(Identifier="1b161007-a38d-9aa3-be4f-9a9b7c2a7e3e")
public static String es_PE_FIELD_PurchaseOrders_DeliveredQuantity_Description="Cantidad entregada";

@XendraTrl(Identifier="1b161007-a38d-9aa3-be4f-9a9b7c2a7e3e")
public static String es_PE_FIELD_PurchaseOrders_DeliveredQuantity_Help="La cantidad entregada indica la cantidad de un producto que ha sido entregada";

@XendraTrl(Identifier="1b161007-a38d-9aa3-be4f-9a9b7c2a7e3e")
public static String es_PE_FIELD_PurchaseOrders_DeliveredQuantity_Name="Cantidad Entregada";

@XendraField(AD_Column_ID="QtyDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b161007-a38d-9aa3-be4f-9a9b7c2a7e3e")
public static final String FIELDNAME_PurchaseOrders_DeliveredQuantity="1b161007-a38d-9aa3-be4f-9a9b7c2a7e3e";

@XendraTrl(Identifier="9ef02562-9c7b-c9a9-4942-7701840dd778")
public static String es_PE_COLUMN_QtyDelivered_Name="Cantidad Entregada";

@XendraColumn(AD_Element_ID="a3a641d6-7605-bf7c-26be-366ed1709eb0",ColumnName="QtyDelivered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ef02562-9c7b-c9a9-4942-7701840dd778",
Synchronized="2017-08-05 16:53:57.0")
/** Column name QtyDelivered */
public static final String COLUMNNAME_QtyDelivered = "QtyDelivered";
/** Set Quantity.
@param QtyEntered The Quantity Entered is based on the selected UoM */
public void setQtyEntered (BigDecimal QtyEntered)
{
if (QtyEntered == null) throw new IllegalArgumentException ("QtyEntered is mandatory.");
set_Value (COLUMNNAME_QtyEntered, QtyEntered);
}
/** Get Quantity.
@return The Quantity Entered is based on the selected UoM */
public BigDecimal getQtyEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dc40ca46-b67b-83e9-aceb-e2d0b66053ce")
public static String es_PE_FIELD_OrderLine_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="dc40ca46-b67b-83e9-aceb-e2d0b66053ce")
public static String es_PE_FIELD_OrderLine_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraTrl(Identifier="dc40ca46-b67b-83e9-aceb-e2d0b66053ce")
public static String es_PE_FIELD_OrderLine_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc40ca46-b67b-83e9-aceb-e2d0b66053ce")
public static final String FIELDNAME_OrderLine_Quantity="dc40ca46-b67b-83e9-aceb-e2d0b66053ce";

@XendraTrl(Identifier="30a7e94b-2fb9-2638-6938-c4d5875550e4")
public static String es_PE_FIELD_POLine_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="30a7e94b-2fb9-2638-6938-c4d5875550e4")
public static String es_PE_FIELD_POLine_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraTrl(Identifier="30a7e94b-2fb9-2638-6938-c4d5875550e4")
public static String es_PE_FIELD_POLine_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30a7e94b-2fb9-2638-6938-c4d5875550e4")
public static final String FIELDNAME_POLine_Quantity="30a7e94b-2fb9-2638-6938-c4d5875550e4";

@XendraTrl(Identifier="97a494f3-79de-bf74-40ad-fc7904cba910")
public static String es_PE_FIELD_OrderLines_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="97a494f3-79de-bf74-40ad-fc7904cba910")
public static String es_PE_FIELD_OrderLines_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraTrl(Identifier="97a494f3-79de-bf74-40ad-fc7904cba910")
public static String es_PE_FIELD_OrderLines_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97a494f3-79de-bf74-40ad-fc7904cba910")
public static final String FIELDNAME_OrderLines_Quantity="97a494f3-79de-bf74-40ad-fc7904cba910";

@XendraTrl(Identifier="470827c6-3865-6e84-912c-5fa0d5d73a23")
public static String es_PE_FIELD_PurchaseOrders_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="470827c6-3865-6e84-912c-5fa0d5d73a23")
public static String es_PE_FIELD_PurchaseOrders_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraTrl(Identifier="470827c6-3865-6e84-912c-5fa0d5d73a23")
public static String es_PE_FIELD_PurchaseOrders_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="470827c6-3865-6e84-912c-5fa0d5d73a23")
public static final String FIELDNAME_PurchaseOrders_Quantity="470827c6-3865-6e84-912c-5fa0d5d73a23";

@XendraTrl(Identifier="7510ac14-a5a9-e59d-bddf-78d964d87331")
public static String es_PE_COLUMN_QtyEntered_Name="Cantidad";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutOrder.qty;org.compiere.model.CalloutOrder.amt",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7510ac14-a5a9-e59d-bddf-78d964d87331",Synchronized="2017-08-05 16:53:57.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
/** Set Quantity Invoiced.
@param QtyInvoiced Invoiced Quantity */
public void setQtyInvoiced (BigDecimal QtyInvoiced)
{
if (QtyInvoiced == null) throw new IllegalArgumentException ("QtyInvoiced is mandatory.");
set_ValueNoCheck (COLUMNNAME_QtyInvoiced, QtyInvoiced);
}
/** Get Quantity Invoiced.
@return Invoiced Quantity */
public BigDecimal getQtyInvoiced() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInvoiced);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="933d7841-c1ce-56ba-bc55-f0edb1679e39")
public static String es_PE_FIELD_OrderLine_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="933d7841-c1ce-56ba-bc55-f0edb1679e39")
public static String es_PE_FIELD_OrderLine_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraTrl(Identifier="933d7841-c1ce-56ba-bc55-f0edb1679e39")
public static String es_PE_FIELD_OrderLine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="@OrderType@='SO' | @Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=190,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="933d7841-c1ce-56ba-bc55-f0edb1679e39")
public static final String FIELDNAME_OrderLine_QuantityInvoiced="933d7841-c1ce-56ba-bc55-f0edb1679e39";

@XendraTrl(Identifier="b24af9e6-cf7c-9d62-1533-60bf165d09ed")
public static String es_PE_FIELD_POLine_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="b24af9e6-cf7c-9d62-1533-60bf165d09ed")
public static String es_PE_FIELD_POLine_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraTrl(Identifier="b24af9e6-cf7c-9d62-1533-60bf165d09ed")
public static String es_PE_FIELD_POLine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b24af9e6-cf7c-9d62-1533-60bf165d09ed")
public static final String FIELDNAME_POLine_QuantityInvoiced="b24af9e6-cf7c-9d62-1533-60bf165d09ed";

@XendraTrl(Identifier="9aa88fd5-9b2b-522f-df86-9f7ccf2c783f")
public static String es_PE_FIELD_OrderLines_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="9aa88fd5-9b2b-522f-df86-9f7ccf2c783f")
public static String es_PE_FIELD_OrderLines_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraTrl(Identifier="9aa88fd5-9b2b-522f-df86-9f7ccf2c783f")
public static String es_PE_FIELD_OrderLines_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9aa88fd5-9b2b-522f-df86-9f7ccf2c783f")
public static final String FIELDNAME_OrderLines_QuantityInvoiced="9aa88fd5-9b2b-522f-df86-9f7ccf2c783f";

@XendraTrl(Identifier="1c675022-cda2-3b69-b3b8-e30214ccd5cc")
public static String es_PE_FIELD_PurchaseOrders_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="1c675022-cda2-3b69-b3b8-e30214ccd5cc")
public static String es_PE_FIELD_PurchaseOrders_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraTrl(Identifier="1c675022-cda2-3b69-b3b8-e30214ccd5cc")
public static String es_PE_FIELD_PurchaseOrders_QuantityInvoiced_Name="Cantidad Facturada";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c675022-cda2-3b69-b3b8-e30214ccd5cc")
public static final String FIELDNAME_PurchaseOrders_QuantityInvoiced="1c675022-cda2-3b69-b3b8-e30214ccd5cc";

@XendraTrl(Identifier="0382f780-c35e-cb9e-564d-4f9e7f1bb2f8")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0382f780-c35e-cb9e-564d-4f9e7f1bb2f8",
Synchronized="2017-08-05 16:53:57.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
/** Set Lost Sales Qty.
@param QtyLostSales Quantity of potential sales */
public void setQtyLostSales (BigDecimal QtyLostSales)
{
if (QtyLostSales == null) throw new IllegalArgumentException ("QtyLostSales is mandatory.");
set_Value (COLUMNNAME_QtyLostSales, QtyLostSales);
}
/** Get Lost Sales Qty.
@return Quantity of potential sales */
public BigDecimal getQtyLostSales() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyLostSales);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="856f8bb3-1d44-0e37-748e-ae77c43f4ebc")
public static String es_PE_FIELD_OrderLine_LostSalesQty_Description="Cantidad de Venta Potencial";

@XendraTrl(Identifier="856f8bb3-1d44-0e37-748e-ae77c43f4ebc")
public static String es_PE_FIELD_OrderLine_LostSalesQty_Help="Cuando una Orden es cerrada, hay una diferencia entre la cantidad ordenada y la cantidad entregada (Facturada) es la Cantidad de Venta Perdida. Note que la Cantidad de Venta Perdida es cero si usted cancela una orden, así cierra la órden si desea seguir lsd oportunidades èrdicas. (Cancelar = error en la entrada de datos-  Cerrar = la órden es finalizada).";

@XendraTrl(Identifier="856f8bb3-1d44-0e37-748e-ae77c43f4ebc")
public static String es_PE_FIELD_OrderLine_LostSalesQty_Name="Cantidad Pérdida de Venta";

@XendraField(AD_Column_ID="QtyLostSales",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=22,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="856f8bb3-1d44-0e37-748e-ae77c43f4ebc")
public static final String FIELDNAME_OrderLine_LostSalesQty="856f8bb3-1d44-0e37-748e-ae77c43f4ebc";

@XendraTrl(Identifier="9f9d8cb1-22cc-d079-fe11-cfd1d1c8a204")
public static String es_PE_FIELD_POLine_LostSalesQty_Description="Cantidad de Venta Potencial";

@XendraTrl(Identifier="9f9d8cb1-22cc-d079-fe11-cfd1d1c8a204")
public static String es_PE_FIELD_POLine_LostSalesQty_Help="Cuando una Orden es cerrada, hay una diferencia entre la cantidad ordenada y la cantidad entregada (Facturada) es la Cantidad de Venta Perdida. Note que la Cantidad de Venta Perdida es cero si usted cancela una orden, así cierra la órden si desea seguir lsd oportunidades èrdicas. (Cancelar = error en la entrada de datos-  Cerrar = la órden es finalizada).";

@XendraTrl(Identifier="9f9d8cb1-22cc-d079-fe11-cfd1d1c8a204")
public static String es_PE_FIELD_POLine_LostSalesQty_Name="Cantidad Pérdida de Venta";

@XendraField(AD_Column_ID="QtyLostSales",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f9d8cb1-22cc-d079-fe11-cfd1d1c8a204")
public static final String FIELDNAME_POLine_LostSalesQty="9f9d8cb1-22cc-d079-fe11-cfd1d1c8a204";

@XendraTrl(Identifier="e3ff6d9a-3f2a-82cc-c728-81afab4bfb55")
public static String es_PE_FIELD_PurchaseOrders_LostSalesQty_Description="Cantidad de Venta Potencial";

@XendraTrl(Identifier="e3ff6d9a-3f2a-82cc-c728-81afab4bfb55")
public static String es_PE_FIELD_PurchaseOrders_LostSalesQty_Help="Cuando una Orden es cerrada, hay una diferencia entre la cantidad ordenada y la cantidad entregada (Facturada) es la Cantidad de Venta Perdida. Note que la Cantidad de Venta Perdida es cero si usted cancela una orden, así cierra la órden si desea seguir lsd oportunidades èrdicas. (Cancelar = error en la entrada de datos-  Cerrar = la órden es finalizada).";

@XendraTrl(Identifier="e3ff6d9a-3f2a-82cc-c728-81afab4bfb55")
public static String es_PE_FIELD_PurchaseOrders_LostSalesQty_Name="Cantidad Pérdida de Venta";

@XendraField(AD_Column_ID="QtyLostSales",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e3ff6d9a-3f2a-82cc-c728-81afab4bfb55")
public static final String FIELDNAME_PurchaseOrders_LostSalesQty="e3ff6d9a-3f2a-82cc-c728-81afab4bfb55";

@XendraTrl(Identifier="0179b579-b8ed-2184-0a37-99fe834eece0")
public static String es_PE_COLUMN_QtyLostSales_Name="Cantidad Pérdida de Venta";

@XendraColumn(AD_Element_ID="a16fbc85-1e28-a1e0-c277-17b64f097cbf",ColumnName="QtyLostSales",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0179b579-b8ed-2184-0a37-99fe834eece0",
Synchronized="2017-08-05 16:53:57.0")
/** Column name QtyLostSales */
public static final String COLUMNNAME_QtyLostSales = "QtyLostSales";
/** Set Ordered Quantity.
@param QtyOrdered Ordered Quantity */
public void setQtyOrdered (BigDecimal QtyOrdered)
{
if (QtyOrdered == null) throw new IllegalArgumentException ("QtyOrdered is mandatory.");
set_Value (COLUMNNAME_QtyOrdered, QtyOrdered);
}
/** Get Ordered Quantity.
@return Ordered Quantity */
public BigDecimal getQtyOrdered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOrdered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f881fece-561b-5b7a-6268-520ddf049004")
public static String es_PE_FIELD_OrderLine_OrderedQuantity_Description="Cantidad ordenada";

@XendraTrl(Identifier="f881fece-561b-5b7a-6268-520ddf049004")
public static String es_PE_FIELD_OrderLine_OrderedQuantity_Help="La Cantidad Ordenada indica la cantidad de un producto que fue ordenada";

@XendraTrl(Identifier="f881fece-561b-5b7a-6268-520ddf049004")
public static String es_PE_FIELD_OrderLine_OrderedQuantity_Name="Cantidad Ordenada";

@XendraField(AD_Column_ID="QtyOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="@UOMConversion@=Y | @Processed@='Y'",DisplayLength=26,IsReadOnly=true,SeqNo=160,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f881fece-561b-5b7a-6268-520ddf049004")
public static final String FIELDNAME_OrderLine_OrderedQuantity="f881fece-561b-5b7a-6268-520ddf049004";

@XendraTrl(Identifier="d8fca0a5-5bec-f847-8753-c75d9fe0785a")
public static String es_PE_FIELD_POLine_POQuantity_Description="Cantidad ordenada";

@XendraTrl(Identifier="d8fca0a5-5bec-f847-8753-c75d9fe0785a")
public static String es_PE_FIELD_POLine_POQuantity_Help="La Cantidad Ordenada indica la cantidad de un producto que fue ordenada";

@XendraTrl(Identifier="d8fca0a5-5bec-f847-8753-c75d9fe0785a")
public static String es_PE_FIELD_POLine_POQuantity_Name="Cantidad Ordenada";

@XendraField(AD_Column_ID="QtyOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8fca0a5-5bec-f847-8753-c75d9fe0785a")
public static final String FIELDNAME_POLine_POQuantity="d8fca0a5-5bec-f847-8753-c75d9fe0785a";

@XendraTrl(Identifier="1ca518f1-f3d0-2c14-d589-fdf24c3dd80a")
public static String es_PE_FIELD_OrderLines_OrderedQuantity_Description="Cantidad ordenada";

@XendraTrl(Identifier="1ca518f1-f3d0-2c14-d589-fdf24c3dd80a")
public static String es_PE_FIELD_OrderLines_OrderedQuantity_Help="La Cantidad Ordenada indica la cantidad de un producto que fue ordenada";

@XendraTrl(Identifier="1ca518f1-f3d0-2c14-d589-fdf24c3dd80a")
public static String es_PE_FIELD_OrderLines_OrderedQuantity_Name="Cantidad Ordenada";

@XendraField(AD_Column_ID="QtyOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ca518f1-f3d0-2c14-d589-fdf24c3dd80a")
public static final String FIELDNAME_OrderLines_OrderedQuantity="1ca518f1-f3d0-2c14-d589-fdf24c3dd80a";

@XendraTrl(Identifier="c2e53187-8c85-c9c8-8fb0-69de34d15ce2")
public static String es_PE_FIELD_PurchaseOrders_POQuantity_Description="Cantidad ordenada";

@XendraTrl(Identifier="c2e53187-8c85-c9c8-8fb0-69de34d15ce2")
public static String es_PE_FIELD_PurchaseOrders_POQuantity_Help="La Cantidad Ordenada indica la cantidad de un producto que fue ordenada";

@XendraTrl(Identifier="c2e53187-8c85-c9c8-8fb0-69de34d15ce2")
public static String es_PE_FIELD_PurchaseOrders_POQuantity_Name="Cantidad Ordenada";

@XendraField(AD_Column_ID="QtyOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2e53187-8c85-c9c8-8fb0-69de34d15ce2")
public static final String FIELDNAME_PurchaseOrders_POQuantity="c2e53187-8c85-c9c8-8fb0-69de34d15ce2";

@XendraTrl(Identifier="4b8f9e82-2530-9d45-ef19-66b10bacce79")
public static String es_PE_COLUMN_QtyOrdered_Name="Cantidad Ordenada";

@XendraColumn(AD_Element_ID="2f601325-19ce-9544-d9df-693c76cbde8a",ColumnName="QtyOrdered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutOrder.qty;org.compiere.model.CalloutOrder.amt",VFormat="",
ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4b8f9e82-2530-9d45-ef19-66b10bacce79",Synchronized="2017-08-05 16:53:57.0")
/** Column name QtyOrdered */
public static final String COLUMNNAME_QtyOrdered = "QtyOrdered";
/** Set Reserved Quantity.
@param QtyReserved Reserved Quantity */
public void setQtyReserved (BigDecimal QtyReserved)
{
if (QtyReserved == null) throw new IllegalArgumentException ("QtyReserved is mandatory.");
set_ValueNoCheck (COLUMNNAME_QtyReserved, QtyReserved);
}
/** Get Reserved Quantity.
@return Reserved Quantity */
public BigDecimal getQtyReserved() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyReserved);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="59a062f2-c003-9430-4228-f78207a372a1")
public static String es_PE_FIELD_OrderLine_ReservedQuantity_Description="Cantidad reservada";

@XendraTrl(Identifier="59a062f2-c003-9430-4228-f78207a372a1")
public static String es_PE_FIELD_OrderLine_ReservedQuantity_Help="La cantidad reservada indica la cantidad de un producto que se encuentra reservada para otras órdenes";

@XendraTrl(Identifier="59a062f2-c003-9430-4228-f78207a372a1")
public static String es_PE_FIELD_OrderLine_ReservedQuantity_Name="Cantidad Reservada";

@XendraField(AD_Column_ID="QtyReserved",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="@OrderType@='OB' | @OrderType@='SO' | @Processed@='Y'",DisplayLength=26,
IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59a062f2-c003-9430-4228-f78207a372a1")
public static final String FIELDNAME_OrderLine_ReservedQuantity="59a062f2-c003-9430-4228-f78207a372a1";

@XendraTrl(Identifier="c78746c5-d418-134b-5217-ff2147a37b58")
public static String es_PE_FIELD_POLine_OnOrderQuantity_Description="Cantidad reservada";

@XendraTrl(Identifier="c78746c5-d418-134b-5217-ff2147a37b58")
public static String es_PE_FIELD_POLine_OnOrderQuantity_Help="La cantidad reservada indica la cantidad de un producto que se encuentra reservada para otras órdenes";

@XendraTrl(Identifier="c78746c5-d418-134b-5217-ff2147a37b58")
public static String es_PE_FIELD_POLine_OnOrderQuantity_Name="Cantidad Reservada";

@XendraField(AD_Column_ID="QtyReserved",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c78746c5-d418-134b-5217-ff2147a37b58")
public static final String FIELDNAME_POLine_OnOrderQuantity="c78746c5-d418-134b-5217-ff2147a37b58";

@XendraTrl(Identifier="4a65e4cc-558f-ced8-3efa-036630edd448")
public static String es_PE_FIELD_OrderLines_ReservedQuantity_Description="Cantidad reservada";

@XendraTrl(Identifier="4a65e4cc-558f-ced8-3efa-036630edd448")
public static String es_PE_FIELD_OrderLines_ReservedQuantity_Help="La cantidad reservada indica la cantidad de un producto que se encuentra reservada para otras órdenes";

@XendraTrl(Identifier="4a65e4cc-558f-ced8-3efa-036630edd448")
public static String es_PE_FIELD_OrderLines_ReservedQuantity_Name="Cantidad Reservada";

@XendraField(AD_Column_ID="QtyReserved",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a65e4cc-558f-ced8-3efa-036630edd448")
public static final String FIELDNAME_OrderLines_ReservedQuantity="4a65e4cc-558f-ced8-3efa-036630edd448";

@XendraTrl(Identifier="89a25343-4cb2-4d08-255f-eb0ee3236ea5")
public static String es_PE_FIELD_PurchaseOrders_OnOrderQuantity_Description="Cantidad reservada";

@XendraTrl(Identifier="89a25343-4cb2-4d08-255f-eb0ee3236ea5")
public static String es_PE_FIELD_PurchaseOrders_OnOrderQuantity_Help="La cantidad reservada indica la cantidad de un producto que se encuentra reservada para otras órdenes";

@XendraTrl(Identifier="89a25343-4cb2-4d08-255f-eb0ee3236ea5")
public static String es_PE_FIELD_PurchaseOrders_OnOrderQuantity_Name="Cantidad Reservada";

@XendraField(AD_Column_ID="QtyReserved",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89a25343-4cb2-4d08-255f-eb0ee3236ea5")
public static final String FIELDNAME_PurchaseOrders_OnOrderQuantity="89a25343-4cb2-4d08-255f-eb0ee3236ea5";

@XendraTrl(Identifier="6b1db7ed-1b75-39a9-d29b-e270e19828fc")
public static String es_PE_COLUMN_QtyReserved_Name="Cantidad Reservada";

@XendraColumn(AD_Element_ID="9e1b819d-9985-da9d-e2e7-a1fe07d429e4",ColumnName="QtyReserved",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b1db7ed-1b75-39a9-d29b-e270e19828fc",
Synchronized="2017-08-05 16:53:57.0")
/** Column name QtyReserved */
public static final String COLUMNNAME_QtyReserved = "QtyReserved";

/** Ref_AttributeSetInstance_ID AD_Reference=bb57b2f2-25be-b966-04c4-2e0c6ea9b4e2 */
public static final int REF_ATTRIBUTESETINSTANCE_ID_AD_Reference_ID=1000046;
/** Set Ref Attribute Set Instance.
@param Ref_AttributeSetInstance_ID Product Attribute Set Instance */
public void setRef_AttributeSetInstance_ID (int Ref_AttributeSetInstance_ID)
{
if (Ref_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_Ref_AttributeSetInstance_ID, null);
 else 
set_Value (COLUMNNAME_Ref_AttributeSetInstance_ID, Integer.valueOf(Ref_AttributeSetInstance_ID));
}
/** Get Ref Attribute Set Instance.
@return Product Attribute Set Instance */
public int getRef_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7b634faf-127c-fb0c-74ac-29ef90f1663b")
public static String es_PE_COLUMN_Ref_AttributeSetInstance_ID_Name="Ref Attribute Set Instance";

@XendraColumn(AD_Element_ID="ff673d87-9520-c2f6-12c6-9576a3b5423f",
ColumnName="Ref_AttributeSetInstance_ID",AD_Reference_ID=11,
AD_Reference_Value_ID="bb57b2f2-25be-b966-04c4-2e0c6ea9b4e2",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="7b634faf-127c-fb0c-74ac-29ef90f1663b",
Synchronized="2017-08-05 16:53:57.0")
/** Column name Ref_AttributeSetInstance_ID */
public static final String COLUMNNAME_Ref_AttributeSetInstance_ID = "Ref_AttributeSetInstance_ID";

/** Ref_OrderLine_ID AD_Reference=8e7a8b36-b7aa-df26-9eda-1d35457a9157 */
public static final int REF_ORDERLINE_ID_AD_Reference_ID=271;
/** Set Referenced Order Line.
@param Ref_OrderLine_ID Reference to corresponding Sales/Purchase Order */
public void setRef_OrderLine_ID (int Ref_OrderLine_ID)
{
if (Ref_OrderLine_ID <= 0) set_Value (COLUMNNAME_Ref_OrderLine_ID, null);
 else 
set_Value (COLUMNNAME_Ref_OrderLine_ID, Integer.valueOf(Ref_OrderLine_ID));
}
/** Get Referenced Order Line.
@return Reference to corresponding Sales/Purchase Order */
public int getRef_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fcefa2fe-30f9-5d91-07d4-6c1f8243050b")
public static String es_PE_FIELD_OrderLine_ReferencedOrderLine_Description="Referencia para las ventas correspondientes / orden de compras.";

@XendraTrl(Identifier="fcefa2fe-30f9-5d91-07d4-6c1f8243050b")
public static String es_PE_FIELD_OrderLine_ReferencedOrderLine_Help="Referencia de las lineas de orden de ventas a la línea correspondiente de la orden de compra ó viceversa.";

@XendraTrl(Identifier="fcefa2fe-30f9-5d91-07d4-6c1f8243050b")
public static String es_PE_FIELD_OrderLine_ReferencedOrderLine_Name="Referencia OV / OC ";

@XendraField(AD_Column_ID="Ref_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcefa2fe-30f9-5d91-07d4-6c1f8243050b")
public static final String FIELDNAME_OrderLine_ReferencedOrderLine="fcefa2fe-30f9-5d91-07d4-6c1f8243050b";

@XendraTrl(Identifier="563bc645-5e21-47c6-a0d7-9cccb0f50959")
public static String es_PE_FIELD_POLine_ReferencedOrderLine_Description="Referencia para las ventas correspondientes / orden de compras.";

@XendraTrl(Identifier="563bc645-5e21-47c6-a0d7-9cccb0f50959")
public static String es_PE_FIELD_POLine_ReferencedOrderLine_Help="Referencia de las lineas de orden de ventas a la línea correspondiente de la orden de compra ó viceversa.";

@XendraTrl(Identifier="563bc645-5e21-47c6-a0d7-9cccb0f50959")
public static String es_PE_FIELD_POLine_ReferencedOrderLine_Name="Referencia OV / OC ";

@XendraField(AD_Column_ID="Ref_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="563bc645-5e21-47c6-a0d7-9cccb0f50959")
public static final String FIELDNAME_POLine_ReferencedOrderLine="563bc645-5e21-47c6-a0d7-9cccb0f50959";

@XendraTrl(Identifier="fad8a13c-2f68-8dad-ebc9-c7febdae396e")
public static String es_PE_FIELD_OrderLines_ReferencedOrderLine_Description="Referencia para las ventas correspondientes / orden de compras.";

@XendraTrl(Identifier="fad8a13c-2f68-8dad-ebc9-c7febdae396e")
public static String es_PE_FIELD_OrderLines_ReferencedOrderLine_Help="Referencia de las lineas de orden de ventas a la línea correspondiente de la orden de compra ó viceversa.";

@XendraTrl(Identifier="fad8a13c-2f68-8dad-ebc9-c7febdae396e")
public static String es_PE_FIELD_OrderLines_ReferencedOrderLine_Name="Referencia OV / OC ";

@XendraField(AD_Column_ID="Ref_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fad8a13c-2f68-8dad-ebc9-c7febdae396e")
public static final String FIELDNAME_OrderLines_ReferencedOrderLine="fad8a13c-2f68-8dad-ebc9-c7febdae396e";

@XendraTrl(Identifier="d92c37db-4987-b422-76d5-39b133151ff2")
public static String es_PE_FIELD_PurchaseOrders_ReferencedOrderLine_Description="Referencia para las ventas correspondientes / orden de compras.";

@XendraTrl(Identifier="d92c37db-4987-b422-76d5-39b133151ff2")
public static String es_PE_FIELD_PurchaseOrders_ReferencedOrderLine_Help="Referencia de las lineas de orden de ventas a la línea correspondiente de la orden de compra ó viceversa.";

@XendraTrl(Identifier="d92c37db-4987-b422-76d5-39b133151ff2")
public static String es_PE_FIELD_PurchaseOrders_ReferencedOrderLine_Name="Referencia OV / OC ";

@XendraField(AD_Column_ID="Ref_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d92c37db-4987-b422-76d5-39b133151ff2")
public static final String FIELDNAME_PurchaseOrders_ReferencedOrderLine="d92c37db-4987-b422-76d5-39b133151ff2";

@XendraTrl(Identifier="c1069948-3ab9-baac-a14e-63e2944c9866")
public static String es_PE_COLUMN_Ref_OrderLine_ID_Name="Referencia OV / OC ";

@XendraColumn(AD_Element_ID="734773e2-96a2-e6c6-1904-6e0a5f015c52",ColumnName="Ref_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="8e7a8b36-b7aa-df26-9eda-1d35457a9157",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c1069948-3ab9-baac-a14e-63e2944c9866",Synchronized="2017-08-05 16:53:57.0")
/** Column name Ref_OrderLine_ID */
public static final String COLUMNNAME_Ref_OrderLine_ID = "Ref_OrderLine_ID";
/** Set Revenue Recognition Amt.
@param RRAmt Revenue Recognition Amount */
public void setRRAmt (BigDecimal RRAmt)
{
set_Value (COLUMNNAME_RRAmt, RRAmt);
}
/** Get Revenue Recognition Amt.
@return Revenue Recognition Amount */
public BigDecimal getRRAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RRAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e7c63a42-1239-ef28-57b5-84a20ab56ba3")
public static String es_PE_FIELD_OrderLine_RevenueRecognitionAmt_Description="Revenue Recognition Amount";

@XendraTrl(Identifier="e7c63a42-1239-ef28-57b5-84a20ab56ba3")
public static String es_PE_FIELD_OrderLine_RevenueRecognitionAmt_Help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.";

@XendraTrl(Identifier="e7c63a42-1239-ef28-57b5-84a20ab56ba3")
public static String es_PE_FIELD_OrderLine_RevenueRecognitionAmt_Name="Revenue Recognition Amt";

@XendraField(AD_Column_ID="RRAmt",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7c63a42-1239-ef28-57b5-84a20ab56ba3")
public static final String FIELDNAME_OrderLine_RevenueRecognitionAmt="e7c63a42-1239-ef28-57b5-84a20ab56ba3";

@XendraTrl(Identifier="8b17d02b-681b-19fa-5745-d9e0237b4138")
public static String es_PE_FIELD_POLine_RevenueRecognitionAmt_Description="Revenue Recognition Amount";

@XendraTrl(Identifier="8b17d02b-681b-19fa-5745-d9e0237b4138")
public static String es_PE_FIELD_POLine_RevenueRecognitionAmt_Help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.";

@XendraTrl(Identifier="8b17d02b-681b-19fa-5745-d9e0237b4138")
public static String es_PE_FIELD_POLine_RevenueRecognitionAmt_Name="Revenue Recognition Amt";

@XendraField(AD_Column_ID="RRAmt",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b17d02b-681b-19fa-5745-d9e0237b4138")
public static final String FIELDNAME_POLine_RevenueRecognitionAmt="8b17d02b-681b-19fa-5745-d9e0237b4138";

@XendraTrl(Identifier="bf21b97c-b2b2-909d-c8dc-65c19a883772")
public static String es_PE_COLUMN_RRAmt_Name="Revenue Recognition Amt";

@XendraColumn(AD_Element_ID="4c89d321-da8c-565e-c050-3172ca737c4b",ColumnName="RRAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf21b97c-b2b2-909d-c8dc-65c19a883772",
Synchronized="2017-08-05 16:53:57.0")
/** Column name RRAmt */
public static final String COLUMNNAME_RRAmt = "RRAmt";
/** Set Revenue Recognition Start.
@param RRStartDate Revenue Recognition Start Date */
public void setRRStartDate (Timestamp RRStartDate)
{
set_Value (COLUMNNAME_RRStartDate, RRStartDate);
}
/** Get Revenue Recognition Start.
@return Revenue Recognition Start Date */
public Timestamp getRRStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_RRStartDate);
}

@XendraTrl(Identifier="ce566bc7-63cf-693d-5b24-5205b7f6a5c2")
public static String es_PE_FIELD_OrderLine_RevenueRecognitionStart_Description="Revenue Recognition Start Date";

@XendraTrl(Identifier="ce566bc7-63cf-693d-5b24-5205b7f6a5c2")
public static String es_PE_FIELD_OrderLine_RevenueRecognitionStart_Help="The date the revenue reconition starts.";

@XendraTrl(Identifier="ce566bc7-63cf-693d-5b24-5205b7f6a5c2")
public static String es_PE_FIELD_OrderLine_RevenueRecognitionStart_Name="Revenue Recognition Start";

@XendraField(AD_Column_ID="RRStartDate",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce566bc7-63cf-693d-5b24-5205b7f6a5c2")
public static final String FIELDNAME_OrderLine_RevenueRecognitionStart="ce566bc7-63cf-693d-5b24-5205b7f6a5c2";

@XendraTrl(Identifier="ffc9c76e-117b-df61-27f7-96fdc852452e")
public static String es_PE_FIELD_POLine_RevenueRecognitionStart_Description="Revenue Recognition Start Date";

@XendraTrl(Identifier="ffc9c76e-117b-df61-27f7-96fdc852452e")
public static String es_PE_FIELD_POLine_RevenueRecognitionStart_Help="The date the revenue reconition starts.";

@XendraTrl(Identifier="ffc9c76e-117b-df61-27f7-96fdc852452e")
public static String es_PE_FIELD_POLine_RevenueRecognitionStart_Name="Revenue Recognition Start";

@XendraField(AD_Column_ID="RRStartDate",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffc9c76e-117b-df61-27f7-96fdc852452e")
public static final String FIELDNAME_POLine_RevenueRecognitionStart="ffc9c76e-117b-df61-27f7-96fdc852452e";

@XendraTrl(Identifier="b78b2368-f18e-ce61-d9ef-eb49ec224b51")
public static String es_PE_COLUMN_RRStartDate_Name="Revenue Recognition Start";

@XendraColumn(AD_Element_ID="cb48e150-f63c-6446-4432-1a24dd47f886",ColumnName="RRStartDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b78b2368-f18e-ce61-d9ef-eb49ec224b51",
Synchronized="2017-08-05 16:53:57.0")
/** Column name RRStartDate */
public static final String COLUMNNAME_RRStartDate = "RRStartDate";
/** Set Resource Assignment.
@param S_ResourceAssignment_ID Resource Assignment */
public void setS_ResourceAssignment_ID (int S_ResourceAssignment_ID)
{
if (S_ResourceAssignment_ID <= 0) set_Value (COLUMNNAME_S_ResourceAssignment_ID, null);
 else 
set_Value (COLUMNNAME_S_ResourceAssignment_ID, Integer.valueOf(S_ResourceAssignment_ID));
}
/** Get Resource Assignment.
@return Resource Assignment */
public int getS_ResourceAssignment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ResourceAssignment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="abd49fde-bf9f-f217-54ea-b74cdb4e77a7")
public static String es_PE_FIELD_OrderLine_ResourceAssignment_Description="Asignación de Recursos";

@XendraTrl(Identifier="abd49fde-bf9f-f217-54ea-b74cdb4e77a7")
public static String es_PE_FIELD_OrderLine_ResourceAssignment_Name="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abd49fde-bf9f-f217-54ea-b74cdb4e77a7")
public static final String FIELDNAME_OrderLine_ResourceAssignment="abd49fde-bf9f-f217-54ea-b74cdb4e77a7";

@XendraTrl(Identifier="0936e78b-2b58-3ba0-3ad5-73751e891ba6")
public static String es_PE_FIELD_POLine_ResourceAssignment_Description="Asignación de Recursos";

@XendraTrl(Identifier="0936e78b-2b58-3ba0-3ad5-73751e891ba6")
public static String es_PE_FIELD_POLine_ResourceAssignment_Name="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0936e78b-2b58-3ba0-3ad5-73751e891ba6")
public static final String FIELDNAME_POLine_ResourceAssignment="0936e78b-2b58-3ba0-3ad5-73751e891ba6";

@XendraTrl(Identifier="bb0de9b4-7f11-04a6-35fa-1f209b33df37")
public static String es_PE_FIELD_OrderLines_ResourceAssignment_Description="Asignación de Recursos";

@XendraTrl(Identifier="bb0de9b4-7f11-04a6-35fa-1f209b33df37")
public static String es_PE_FIELD_OrderLines_ResourceAssignment_Name="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aafba160-c717-057a-2cb5-f6a790af27de",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb0de9b4-7f11-04a6-35fa-1f209b33df37")
public static final String FIELDNAME_OrderLines_ResourceAssignment="bb0de9b4-7f11-04a6-35fa-1f209b33df37";

@XendraTrl(Identifier="ab6a5dba-8697-fb18-6e12-6a2d662c5073")
public static String es_PE_FIELD_PurchaseOrders_ResourceAssignment_Description="Asignación de Recursos";

@XendraTrl(Identifier="ab6a5dba-8697-fb18-6e12-6a2d662c5073")
public static String es_PE_FIELD_PurchaseOrders_ResourceAssignment_Name="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="02d8c6d8-8087-8e1e-7fb7-4c85df71b1e4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab6a5dba-8697-fb18-6e12-6a2d662c5073")
public static final String FIELDNAME_PurchaseOrders_ResourceAssignment="ab6a5dba-8697-fb18-6e12-6a2d662c5073";

@XendraTrl(Identifier="05ca2de6-83f8-7385-84da-2753d0b673ab")
public static String es_PE_COLUMN_S_ResourceAssignment_ID_Name="Asignación de Recursos";

@XendraColumn(AD_Element_ID="5b04aabc-c98f-1f47-d00c-ef5ca7e86447",
ColumnName="S_ResourceAssignment_ID",AD_Reference_ID=33,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@C_Charge_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutAssignment.product",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05ca2de6-83f8-7385-84da-2753d0b673ab",
Synchronized="2017-08-05 16:53:57.0")
/** Column name S_ResourceAssignment_ID */
public static final String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";

/** User1_ID AD_Reference=5a2fe161-044f-67cb-3791-6d615980cabb */
public static final int USER1_ID_AD_Reference_ID=134;
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3ba13697-3e8b-ebc6-f268-1da785b0d307")
public static String es_PE_FIELD_OrderLine_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="3ba13697-3e8b-ebc6-f268-1da785b0d307")
public static String es_PE_FIELD_OrderLine_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="3ba13697-3e8b-ebc6-f268-1da785b0d307")
public static String es_PE_FIELD_OrderLine_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3ba13697-3e8b-ebc6-f268-1da785b0d307")
public static final String FIELDNAME_OrderLine_UserList="3ba13697-3e8b-ebc6-f268-1da785b0d307";

@XendraTrl(Identifier="307874fd-ea97-ec96-bbdd-ae207977f975")
public static String es_PE_FIELD_POLine_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="307874fd-ea97-ec96-bbdd-ae207977f975")
public static String es_PE_FIELD_POLine_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="307874fd-ea97-ec96-bbdd-ae207977f975")
public static String es_PE_FIELD_POLine_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="307874fd-ea97-ec96-bbdd-ae207977f975")
public static final String FIELDNAME_POLine_UserList="307874fd-ea97-ec96-bbdd-ae207977f975";

@XendraTrl(Identifier="2e4a5425-04ec-0512-72b9-81a0ab8e4f48")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2e4a5425-04ec-0512-72b9-81a0ab8e4f48",Synchronized="2017-08-05 16:53:57.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

/** User2_ID AD_Reference=6a357ab2-7bb6-fce4-ffee-8bdd855a77fc */
public static final int USER2_ID_AD_Reference_ID=137;
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="43c0d568-7d9b-3437-0a29-bc8f628bca7f")
public static String es_PE_FIELD_OrderLine_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="43c0d568-7d9b-3437-0a29-bc8f628bca7f")
public static String es_PE_FIELD_OrderLine_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="43c0d568-7d9b-3437-0a29-bc8f628bca7f")
public static String es_PE_FIELD_OrderLine_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="860d73f5-603c-30fb-2a42-ea6f43f02b20",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="43c0d568-7d9b-3437-0a29-bc8f628bca7f")
public static final String FIELDNAME_OrderLine_UserList22="43c0d568-7d9b-3437-0a29-bc8f628bca7f";

@XendraTrl(Identifier="8a2ec0a3-dd6f-f18e-03b9-25438af13135")
public static String es_PE_FIELD_POLine_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="8a2ec0a3-dd6f-f18e-03b9-25438af13135")
public static String es_PE_FIELD_POLine_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="8a2ec0a3-dd6f-f18e-03b9-25438af13135")
public static String es_PE_FIELD_POLine_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2ef4599-94d1-56b4-dd16-7408e751b1cd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8a2ec0a3-dd6f-f18e-03b9-25438af13135")
public static final String FIELDNAME_POLine_UserList22="8a2ec0a3-dd6f-f18e-03b9-25438af13135";

@XendraTrl(Identifier="a0ffa955-151f-e3e4-3c06-ba9a23905c0e")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a0ffa955-151f-e3e4-3c06-ba9a23905c0e",Synchronized="2017-08-05 16:53:57.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
