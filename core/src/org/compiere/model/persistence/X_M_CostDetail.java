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
/** Generated Model for M_CostDetail
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_CostDetail extends PO
{
/** Standard Constructor
@param ctx context
@param M_CostDetail_ID id
@param trxName transaction
*/
public X_M_CostDetail (Properties ctx, int M_CostDetail_ID, String trxName)
{
super (ctx, M_CostDetail_ID, trxName);
/** if (M_CostDetail_ID == 0)
{
setAmt (Env.ZERO);	
// 0
setC_AcctSchema_ID (0);
setIsSOTrx (false);	
// N
setM_AttributeSetInstance_ID (0);
setM_CostDetail_ID (0);
setM_Product_ID (0);
setProcessed (false);	
// N
setQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_CostDetail (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=808 */
public static int Table_ID=MTable.getTable_ID("M_CostDetail");

@XendraTrl(Identifier="0eba2c05-bceb-4fda-776f-f5e4182c99f8")
public static String es_PE_TAB_CostDetails_Description="Ver detalle de Costo de Producto";

@XendraTrl(Identifier="0eba2c05-bceb-4fda-776f-f5e4182c99f8")
public static String es_PE_TAB_CostDetails_Name="Detalle de Costo";
@XendraTab(Name="Cost Details",
Description="View Product Cost Details",Help="",
AD_Window_ID="8983f195-c186-47e9-7541-aa6e2d0eebfc",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="63aeda0c-7b10-65a7-8fca-6d27ee9b3ae6",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="0eba2c05-bceb-4fda-776f-f5e4182c99f8",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CostDetails="0eba2c05-bceb-4fda-776f-f5e4182c99f8";

@XendraTrl(Identifier="d7e53429-62cb-f8a8-febe-6cbdadc706d8")
public static String es_PE_TABLE_M_CostDetail_Name="Detallar Costo";

@XendraTable(Name="Cost Detail",Description="Cost Detail Information",Help="",
TableName="M_CostDetail",AccessLevel="3",AD_Window_ID="8983f195-c186-47e9-7541-aa6e2d0eebfc",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="d7e53429-62cb-f8a8-febe-6cbdadc706d8",Synchronized="2017-08-16 11:43:08.0")
/** TableName=M_CostDetail */
public static final String Table_Name="M_CostDetail";


@XendraIndex(Name="m_costdetail_product",Identifier="8467501a-a2c6-da8f-e54a-3642c1b2b311",
Column_Names="ad_org_id, m_product_id, m_attributesetinstance_id",IsUnique="false",
TableIdentifier="8467501a-a2c6-da8f-e54a-3642c1b2b311",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_costdetail_product = "8467501a-a2c6-da8f-e54a-3642c1b2b311";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_CostDetail");

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
    Table_ID = MTable.getTable_ID("M_CostDetail");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_CostDetail[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amt Amount */
public void setAmt (BigDecimal Amt)
{
if (Amt == null) throw new IllegalArgumentException ("Amt is mandatory.");
set_Value (COLUMNNAME_Amt, Amt);
}
/** Get Amount.
@return Amount */
public BigDecimal getAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="140ff029-d2ea-b7f8-f985-d088e89dafe8")
public static String es_PE_FIELD_CostDetails_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="140ff029-d2ea-b7f8-f985-d088e89dafe8")
public static String es_PE_FIELD_CostDetails_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraTrl(Identifier="140ff029-d2ea-b7f8-f985-d088e89dafe8")
public static String es_PE_FIELD_CostDetails_Amount_Name="Total";
@XendraField(AD_Column_ID="Amt",
IsCentrallyMaintained=true,AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="140ff029-d2ea-b7f8-f985-d088e89dafe8")
public static final String FIELDNAME_CostDetails_Amount="140ff029-d2ea-b7f8-f985-d088e89dafe8";

@XendraTrl(Identifier="02b936ea-d642-ae74-7a38-d40f33df4dc4")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02b936ea-d642-ae74-7a38-d40f33df4dc4",
Synchronized="2017-08-05 16:55:02.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="17d8814b-77a6-38e3-557e-3eb0d61ff62d")
public static String es_PE_FIELD_CostDetails_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="17d8814b-77a6-38e3-557e-3eb0d61ff62d")
public static String es_PE_FIELD_CostDetails_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="17d8814b-77a6-38e3-557e-3eb0d61ff62d")
public static String es_PE_FIELD_CostDetails_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17d8814b-77a6-38e3-557e-3eb0d61ff62d")
public static final String FIELDNAME_CostDetails_AccountingSchema="17d8814b-77a6-38e3-557e-3eb0d61ff62d";

@XendraTrl(Identifier="2b57d22f-6202-0b0b-e300-52bb7eeec93c")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b57d22f-6202-0b0b-e300-52bb7eeec93c",
Synchronized="2017-08-05 16:55:03.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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

@XendraTrl(Identifier="63834660-287b-2731-ef56-5988d034f9a1")
public static String es_PE_FIELD_CostDetails_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="63834660-287b-2731-ef56-5988d034f9a1")
public static String es_PE_FIELD_CostDetails_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="63834660-287b-2731-ef56-5988d034f9a1")
public static String es_PE_FIELD_CostDetails_InvoiceLine_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63834660-287b-2731-ef56-5988d034f9a1")
public static final String FIELDNAME_CostDetails_InvoiceLine="63834660-287b-2731-ef56-5988d034f9a1";

@XendraTrl(Identifier="9a5fe34b-535b-2fe7-1928-265533005396")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a5fe34b-535b-2fe7-1928-265533005396",
Synchronized="2017-08-05 16:55:03.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, null);
 else 
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

@XendraTrl(Identifier="f913cd60-d934-9aa6-4370-571c7ca2af2e")
public static String es_PE_FIELD_CostDetails_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="f913cd60-d934-9aa6-4370-571c7ca2af2e")
public static String es_PE_FIELD_CostDetails_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="f913cd60-d934-9aa6-4370-571c7ca2af2e")
public static String es_PE_FIELD_CostDetails_PurchaseOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f913cd60-d934-9aa6-4370-571c7ca2af2e")
public static final String FIELDNAME_CostDetails_PurchaseOrderLine="f913cd60-d934-9aa6-4370-571c7ca2af2e";

@XendraTrl(Identifier="daab877f-9a81-60ef-1ec2-e2fd2a0d75e0")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="daab877f-9a81-60ef-1ec2-e2fd2a0d75e0",
Synchronized="2017-08-05 16:55:03.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
/** Set Project Issue.
@param C_ProjectIssue_ID Project Issues (Material, Labor) */
public void setC_ProjectIssue_ID (int C_ProjectIssue_ID)
{
if (C_ProjectIssue_ID <= 0) set_Value (COLUMNNAME_C_ProjectIssue_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectIssue_ID, Integer.valueOf(C_ProjectIssue_ID));
}
/** Get Project Issue.
@return Project Issues (Material, Labor) */
public int getC_ProjectIssue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectIssue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aa0d7fb1-731b-7a79-626b-13c549229ba6")
public static String es_PE_FIELD_CostDetails_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="aa0d7fb1-731b-7a79-626b-13c549229ba6")
public static String es_PE_FIELD_CostDetails_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="aa0d7fb1-731b-7a79-626b-13c549229ba6")
public static String es_PE_FIELD_CostDetails_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa0d7fb1-731b-7a79-626b-13c549229ba6")
public static final String FIELDNAME_CostDetails_ProjectIssue="aa0d7fb1-731b-7a79-626b-13c549229ba6";

@XendraTrl(Identifier="73662d44-cc45-997d-7731-f9f63d6d3038")
public static String es_PE_COLUMN_C_ProjectIssue_ID_Name="Asunto del Proyecto";

@XendraColumn(AD_Element_ID="6c6aa911-79e0-a8ca-00de-c0e2aa4fd667",ColumnName="C_ProjectIssue_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73662d44-cc45-997d-7731-f9f63d6d3038",
Synchronized="2017-08-05 16:55:03.0")
/** Column name C_ProjectIssue_ID */
public static final String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
/** Set Delta Amount.
@param DeltaAmt Difference Amount */
public void setDeltaAmt (BigDecimal DeltaAmt)
{
set_Value (COLUMNNAME_DeltaAmt, DeltaAmt);
}
/** Get Delta Amount.
@return Difference Amount */
public BigDecimal getDeltaAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DeltaAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0f2d974c-822a-71cd-fbdb-7f3fd1eb7e5d")
public static String es_PE_FIELD_CostDetails_DeltaAmount_Description="Difference Amount";

@XendraTrl(Identifier="0f2d974c-822a-71cd-fbdb-7f3fd1eb7e5d")
public static String es_PE_FIELD_CostDetails_DeltaAmount_Name="Delta Amount";

@XendraField(AD_Column_ID="DeltaAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f2d974c-822a-71cd-fbdb-7f3fd1eb7e5d")
public static final String FIELDNAME_CostDetails_DeltaAmount="0f2d974c-822a-71cd-fbdb-7f3fd1eb7e5d";

@XendraTrl(Identifier="5e12191d-9165-15ca-0e46-4ad4952859bd")
public static String es_PE_COLUMN_DeltaAmt_Name="Delta Amount";

@XendraColumn(AD_Element_ID="d46ab95b-0fd3-dbe1-1812-8adbb0a85ff8",ColumnName="DeltaAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e12191d-9165-15ca-0e46-4ad4952859bd",
Synchronized="2017-08-05 16:55:03.0")
/** Column name DeltaAmt */
public static final String COLUMNNAME_DeltaAmt = "DeltaAmt";
/** Set Delta Quantity.
@param DeltaQty Quantity Difference */
public void setDeltaQty (BigDecimal DeltaQty)
{
set_Value (COLUMNNAME_DeltaQty, DeltaQty);
}
/** Get Delta Quantity.
@return Quantity Difference */
public BigDecimal getDeltaQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DeltaQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1a2e7bf1-34b8-edfc-971a-79c8b815ab4f")
public static String es_PE_FIELD_CostDetails_DeltaQuantity_Description="Quantity Difference";

@XendraTrl(Identifier="1a2e7bf1-34b8-edfc-971a-79c8b815ab4f")
public static String es_PE_FIELD_CostDetails_DeltaQuantity_Name="Delta Quantity";

@XendraField(AD_Column_ID="DeltaQty",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a2e7bf1-34b8-edfc-971a-79c8b815ab4f")
public static final String FIELDNAME_CostDetails_DeltaQuantity="1a2e7bf1-34b8-edfc-971a-79c8b815ab4f";

@XendraTrl(Identifier="f8cd9807-f975-a0a7-9deb-cdddb0cb690d")
public static String es_PE_COLUMN_DeltaQty_Name="Delta Quantity";

@XendraColumn(AD_Element_ID="50c02170-e758-15ae-3dae-2bc91e5c6f15",ColumnName="DeltaQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8cd9807-f975-a0a7-9deb-cdddb0cb690d",
Synchronized="2017-08-05 16:55:03.0")
/** Column name DeltaQty */
public static final String COLUMNNAME_DeltaQty = "DeltaQty";
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

@XendraTrl(Identifier="f52e07d3-df3c-9252-bf6b-5d7c338ac06b")
public static String es_PE_FIELD_CostDetails_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f52e07d3-df3c-9252-bf6b-5d7c338ac06b")
public static String es_PE_FIELD_CostDetails_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="f52e07d3-df3c-9252-bf6b-5d7c338ac06b")
public static String es_PE_FIELD_CostDetails_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f52e07d3-df3c-9252-bf6b-5d7c338ac06b")
public static final String FIELDNAME_CostDetails_Description="f52e07d3-df3c-9252-bf6b-5d7c338ac06b";

@XendraTrl(Identifier="1ff65ffb-d41c-05f8-9ba9-01d03213eab5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="1ff65ffb-d41c-05f8-9ba9-01d03213eab5",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="39e3330f-ba2a-436b-a481-85e248910f31")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39e3330f-ba2a-436b-a481-85e248910f31",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f3f85838-0c3f-bfc7-6474-0a10ad62f17d")
public static String es_PE_FIELD_CostDetails_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="f3f85838-0c3f-bfc7-6474-0a10ad62f17d")
public static String es_PE_FIELD_CostDetails_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="f3f85838-0c3f-bfc7-6474-0a10ad62f17d")
public static String es_PE_FIELD_CostDetails_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3f85838-0c3f-bfc7-6474-0a10ad62f17d")
public static final String FIELDNAME_CostDetails_SalesTransaction="f3f85838-0c3f-bfc7-6474-0a10ad62f17d";

@XendraTrl(Identifier="730576bc-2755-571c-2002-b84f19462bfa")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="730576bc-2755-571c-2002-b84f19462bfa",
Synchronized="2017-08-05 16:55:03.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
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

@XendraTrl(Identifier="3633be35-4fb0-81b1-1db8-7dc7b80dcbc3")
public static String es_PE_FIELD_CostDetails_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="3633be35-4fb0-81b1-1db8-7dc7b80dcbc3")
public static String es_PE_FIELD_CostDetails_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="3633be35-4fb0-81b1-1db8-7dc7b80dcbc3")
public static String es_PE_FIELD_CostDetails_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=60,SortNo=2,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3633be35-4fb0-81b1-1db8-7dc7b80dcbc3")
public static final String FIELDNAME_CostDetails_AttributeSetInstance="3633be35-4fb0-81b1-1db8-7dc7b80dcbc3";

@XendraTrl(Identifier="55301b2e-d718-bc65-9e85-56551e02ca75")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="55301b2e-d718-bc65-9e85-56551e02ca75",Synchronized="2017-08-05 16:55:03.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Cost Detail.
@param M_CostDetail_ID Cost Detail Information */
public void setM_CostDetail_ID (int M_CostDetail_ID)
{
if (M_CostDetail_ID < 1) throw new IllegalArgumentException ("M_CostDetail_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_CostDetail_ID, Integer.valueOf(M_CostDetail_ID));
}
/** Get Cost Detail.
@return Cost Detail Information */
public int getM_CostDetail_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostDetail_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="64a4184e-5c86-4977-1641-2a7144932b60")
public static String es_PE_FIELD_CostDetails_CostDetail_Description="Información Detallar Costo";

@XendraTrl(Identifier="64a4184e-5c86-4977-1641-2a7144932b60")
public static String es_PE_FIELD_CostDetails_CostDetail_Name="Detallar Costo";

@XendraField(AD_Column_ID="M_CostDetail_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64a4184e-5c86-4977-1641-2a7144932b60")
public static final String FIELDNAME_CostDetails_CostDetail="64a4184e-5c86-4977-1641-2a7144932b60";
/** Column name M_CostDetail_ID */
public static final String COLUMNNAME_M_CostDetail_ID = "M_CostDetail_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_CostElement_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="210e2df0-0372-ff15-aee4-3ef2073c6348")
public static String es_PE_FIELD_CostDetails_CostElement_Description="Elemento de costo de producto";

@XendraTrl(Identifier="210e2df0-0372-ff15-aee4-3ef2073c6348")
public static String es_PE_FIELD_CostDetails_CostElement_Name="Elemento de Costo";

@XendraField(AD_Column_ID="M_CostElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="210e2df0-0372-ff15-aee4-3ef2073c6348")
public static final String FIELDNAME_CostDetails_CostElement="210e2df0-0372-ff15-aee4-3ef2073c6348";

@XendraTrl(Identifier="303f3c60-caf2-8647-65e7-c28993e2c0b5")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Elemento de Costo";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="303f3c60-caf2-8647-65e7-c28993e2c0b5",
Synchronized="2017-08-05 16:55:03.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, null);
 else 
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

@XendraTrl(Identifier="775b5d20-b3de-c3e6-f440-873a7c37488b")
public static String es_PE_FIELD_CostDetails_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="775b5d20-b3de-c3e6-f440-873a7c37488b")
public static String es_PE_FIELD_CostDetails_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="775b5d20-b3de-c3e6-f440-873a7c37488b")
public static String es_PE_FIELD_CostDetails_ReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="775b5d20-b3de-c3e6-f440-873a7c37488b")
public static final String FIELDNAME_CostDetails_ReceiptLine="775b5d20-b3de-c3e6-f440-873a7c37488b";

@XendraTrl(Identifier="a8bc22e0-40a3-3b67-84fe-9f4d1b2655d3")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8bc22e0-40a3-3b67-84fe-9f4d1b2655d3",
Synchronized="2017-08-05 16:55:03.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID <= 0) set_Value (COLUMNNAME_M_InventoryLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="062b8a6b-3acd-7d78-f5f2-3a6d8fedb02a")
public static String es_PE_FIELD_CostDetails_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="062b8a6b-3acd-7d78-f5f2-3a6d8fedb02a")
public static String es_PE_FIELD_CostDetails_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="062b8a6b-3acd-7d78-f5f2-3a6d8fedb02a")
public static String es_PE_FIELD_CostDetails_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="062b8a6b-3acd-7d78-f5f2-3a6d8fedb02a")
public static final String FIELDNAME_CostDetails_PhysInventoryLine="062b8a6b-3acd-7d78-f5f2-3a6d8fedb02a";

@XendraTrl(Identifier="0d2a1dfc-fbe6-99ae-f5ea-e8bcfd428be6")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d2a1dfc-fbe6-99ae-f5ea-e8bcfd428be6",
Synchronized="2017-08-05 16:55:03.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Move Line.
@param M_MovementLine_ID Inventory Move document Line */
public void setM_MovementLine_ID (int M_MovementLine_ID)
{
if (M_MovementLine_ID <= 0) set_Value (COLUMNNAME_M_MovementLine_ID, null);
 else 
set_Value (COLUMNNAME_M_MovementLine_ID, Integer.valueOf(M_MovementLine_ID));
}
/** Get Move Line.
@return Inventory Move document Line */
public int getM_MovementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c952bce5-6d09-f6ad-6584-088bde172db7")
public static String es_PE_FIELD_CostDetails_MoveLine_Description="Item del documento de movimiento de inventario";

@XendraTrl(Identifier="c952bce5-6d09-f6ad-6584-088bde172db7")
public static String es_PE_FIELD_CostDetails_MoveLine_Help="Indica el Item del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraTrl(Identifier="c952bce5-6d09-f6ad-6584-088bde172db7")
public static String es_PE_FIELD_CostDetails_MoveLine_Name="Item del Movimiento";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c952bce5-6d09-f6ad-6584-088bde172db7")
public static final String FIELDNAME_CostDetails_MoveLine="c952bce5-6d09-f6ad-6584-088bde172db7";

@XendraTrl(Identifier="7a6d6fcd-131c-cba8-6dea-e9d8ec5ec692")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Línea del Movimiento";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a6d6fcd-131c-cba8-6dea-e9d8ec5ec692",
Synchronized="2017-08-05 16:55:03.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
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

@XendraTrl(Identifier="b740db58-8052-303e-55c9-087620186011")
public static String es_PE_FIELD_CostDetails_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="b740db58-8052-303e-55c9-087620186011")
public static String es_PE_FIELD_CostDetails_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="b740db58-8052-303e-55c9-087620186011")
public static String es_PE_FIELD_CostDetails_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b740db58-8052-303e-55c9-087620186011")
public static final String FIELDNAME_CostDetails_Product="b740db58-8052-303e-55c9-087620186011";

@XendraTrl(Identifier="63aeda0c-7b10-65a7-8fca-6d27ee9b3ae6")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63aeda0c-7b10-65a7-8fca-6d27ee9b3ae6",
Synchronized="2017-08-05 16:55:03.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Production Line.
@param M_ProductionLine_ID Document Line representing a production */
public void setM_ProductionLine_ID (int M_ProductionLine_ID)
{
if (M_ProductionLine_ID <= 0) set_Value (COLUMNNAME_M_ProductionLine_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductionLine_ID, Integer.valueOf(M_ProductionLine_ID));
}
/** Get Production Line.
@return Document Line representing a production */
public int getM_ProductionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fcfc30e7-fdf5-7cb5-d697-1a665007f9ce")
public static String es_PE_FIELD_CostDetails_ProductionLine_Description="Item del documento representando una producción.";

@XendraTrl(Identifier="fcfc30e7-fdf5-7cb5-d697-1a665007f9ce")
public static String es_PE_FIELD_CostDetails_ProductionLine_Help="Indica el Item del documento de producción (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="fcfc30e7-fdf5-7cb5-d697-1a665007f9ce")
public static String es_PE_FIELD_CostDetails_ProductionLine_Name="Item de Producción";

@XendraField(AD_Column_ID="M_ProductionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcfc30e7-fdf5-7cb5-d697-1a665007f9ce")
public static final String FIELDNAME_CostDetails_ProductionLine="fcfc30e7-fdf5-7cb5-d697-1a665007f9ce";

@XendraTrl(Identifier="9bcdf713-f54e-d243-12e6-5b2ce5e08054")
public static String es_PE_COLUMN_M_ProductionLine_ID_Name="Línea de Producción";

@XendraColumn(AD_Element_ID="cd41491f-514d-42fd-aaf9-36308e165c0b",
ColumnName="M_ProductionLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9bcdf713-f54e-d243-12e6-5b2ce5e08054",Synchronized="2017-08-05 16:55:03.0")
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
/** Set Price.
@param Price Price */
public void setPrice (BigDecimal Price)
{
throw new IllegalArgumentException ("Price is virtual column");
}
/** Get Price.
@return Price */
public BigDecimal getPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Price);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="eaef97d4-ddc2-0ea2-c75f-62fbe8fae27b")
public static String es_PE_FIELD_CostDetails_Price_Description="Precio";

@XendraTrl(Identifier="eaef97d4-ddc2-0ea2-c75f-62fbe8fae27b")
public static String es_PE_FIELD_CostDetails_Price_Help="El Precio indica el precio de un producto ó servicio";

@XendraTrl(Identifier="eaef97d4-ddc2-0ea2-c75f-62fbe8fae27b")
public static String es_PE_FIELD_CostDetails_Price_Name="Precio";
@XendraField(AD_Column_ID="Price",
IsCentrallyMaintained=true,AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="eaef97d4-ddc2-0ea2-c75f-62fbe8fae27b")
public static final String FIELDNAME_CostDetails_Price="eaef97d4-ddc2-0ea2-c75f-62fbe8fae27b";

@XendraTrl(Identifier="b0d6a2c0-85e8-d1ec-bebc-6ed23eeaa582")
public static String es_PE_COLUMN_Price_Name="Precio";

@XendraColumn(AD_Element_ID="aafaa7a6-6897-fb14-1b29-1dc3b61047b9",ColumnName="Price",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(CASE WHEN Qty=0 THEN 0 ELSE Amt/Qty END)",IsAllowLogging=false,
Identifier="b0d6a2c0-85e8-d1ec-bebc-6ed23eeaa582",Synchronized="2017-08-05 16:55:03.0")
/** Column name Price */
public static final String COLUMNNAME_Price = "Price";
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

@XendraTrl(Identifier="738649b9-728a-11e5-f11a-5617ea6ea490")
public static String es_PE_FIELD_CostDetails_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="738649b9-728a-11e5-f11a-5617ea6ea490")
public static String es_PE_FIELD_CostDetails_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="738649b9-728a-11e5-f11a-5617ea6ea490")
public static String es_PE_FIELD_CostDetails_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="738649b9-728a-11e5-f11a-5617ea6ea490")
public static final String FIELDNAME_CostDetails_Processed="738649b9-728a-11e5-f11a-5617ea6ea490";

@XendraTrl(Identifier="f352fb2c-70da-9fad-c12d-d72d4ea076ff")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f352fb2c-70da-9fad-c12d-d72d4ea076ff",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7dc88f61-182d-60d8-ff65-86a8e5d03969")
public static String es_PE_FIELD_CostDetails_Quantity_Description="Cantidad";

@XendraTrl(Identifier="7dc88f61-182d-60d8-ff65-86a8e5d03969")
public static String es_PE_FIELD_CostDetails_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="7dc88f61-182d-60d8-ff65-86a8e5d03969")
public static String es_PE_FIELD_CostDetails_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7dc88f61-182d-60d8-ff65-86a8e5d03969")
public static final String FIELDNAME_CostDetails_Quantity="7dc88f61-182d-60d8-ff65-86a8e5d03969";

@XendraTrl(Identifier="5a91f07f-e527-541e-6bca-3b0e21c8fb07")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a91f07f-e527-541e-6bca-3b0e21c8fb07",
Synchronized="2017-08-05 16:55:03.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Total Cost.
@param TotalCost Total Cost  (Freight, etc.) */
public void setTotalCost (BigDecimal TotalCost)
{
set_Value (COLUMNNAME_TotalCost, TotalCost);
}
/** Get Total Cost.
@return Total Cost  (Freight, etc.) */
public BigDecimal getTotalCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="152ceac5-277d-4539-6fd5-c31d182dc54c")
public static String es_PE_FIELD_CostDetails_TotalCost_Description="Total Cost  (Freight, etc.)";

@XendraTrl(Identifier="152ceac5-277d-4539-6fd5-c31d182dc54c")
public static String es_PE_FIELD_CostDetails_TotalCost_Help="Optional Purchase Order Line Total cost price.";

@XendraTrl(Identifier="152ceac5-277d-4539-6fd5-c31d182dc54c")
public static String es_PE_FIELD_CostDetails_TotalCost_Name="Total Cost";

@XendraField(AD_Column_ID="TotalCost",IsCentrallyMaintained=true,
AD_Tab_ID="0eba2c05-bceb-4fda-776f-f5e4182c99f8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=95,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="152ceac5-277d-4539-6fd5-c31d182dc54c")
public static final String FIELDNAME_CostDetails_TotalCost="152ceac5-277d-4539-6fd5-c31d182dc54c";

@XendraTrl(Identifier="5744b5aa-1b50-982c-2136-27966c6a3e14")
public static String es_PE_COLUMN_TotalCost_Name="Total Cost";

@XendraColumn(AD_Element_ID="99a761fd-2d83-588e-13a0-eec11b2c5ea0",ColumnName="TotalCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5744b5aa-1b50-982c-2136-27966c6a3e14",
Synchronized="2017-08-05 16:55:03.0")
/** Column name TotalCost */
public static final String COLUMNNAME_TotalCost = "TotalCost";
}
