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
/** Generated Model for M_Product_PO
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_PO extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_PO_ID id
@param trxName transaction
*/
public X_M_Product_PO (Properties ctx, int M_Product_PO_ID, String trxName)
{
super (ctx, M_Product_PO_ID, trxName);
/** if (M_Product_PO_ID == 0)
{
setC_BPartner_ID (0);	
// 0
setIsCurrentVendor (true);	
// Y
setM_Product_ID (0);	
// @M_Product_ID@
setVendorProductNo (null);	
// @Value@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Product_PO (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=210 */
public static int Table_ID=MTable.getTable_ID("M_Product_PO");

@XendraTrl(Identifier="530e626e-0933-8063-f1e9-9d698656a5ea")
public static String es_PE_TAB_Purchasing_Description="Compras";

@XendraTrl(Identifier="530e626e-0933-8063-f1e9-9d698656a5ea")
public static String es_PE_TAB_Purchasing_Name="Compras";

@XendraTrl(Identifier="530e626e-0933-8063-f1e9-9d698656a5ea")
public static String es_PE_TAB_Purchasing_Help="La pestaña Compras define los precios y reglas (cantidad en paquetes; UPC; cantidad mínima para ordenar) para cada producto.";

@XendraTab(Name="Purchasing",Description="Purchasing",
Help="The Purchasing Tab define the pricing and rules ( pack quantity, UPC, minimum order quantity) for each product.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="21358f51-08ba-bacd-38dd-810d55975c51",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="530e626e-0933-8063-f1e9-9d698656a5ea",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Purchasing="530e626e-0933-8063-f1e9-9d698656a5ea";

@XendraTrl(Identifier="60108fb4-09bd-5780-d945-318ab8d62449")
public static String es_PE_TAB_ProductDetails_Description="Detalles del Producto";

@XendraTrl(Identifier="60108fb4-09bd-5780-d945-318ab8d62449")
public static String es_PE_TAB_ProductDetails_Name="Detalles del Producto";

@XendraTrl(Identifier="60108fb4-09bd-5780-d945-318ab8d62449")
public static String es_PE_TAB_ProductDetails_Help="La pestaña Detalles de Producto permite desplegar y mantener todos los productos para un proveedor seleccionado";

@XendraTab(Name="Product Details",Description="Product Details",
Help="The Product Details Tab allows you to display and maintain all products for a selected Vendor.",
AD_Window_ID="a274e93f-bb6e-8b17-ecfe-75f241a520d8",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="b4b950b3-b99a-1f62-c603-e76c9f74e67f",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="60108fb4-09bd-5780-d945-318ab8d62449",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductDetails="60108fb4-09bd-5780-d945-318ab8d62449";

@XendraTrl(Identifier="10ce492c-43ad-3a51-3f70-7d04122d6544")
public static String es_PE_TABLE_M_Product_PO_Name="M_Product_PO";

@XendraTable(Name="Product Purchasing",Description="",Help="",TableName="M_Product_PO",
AccessLevel="3",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="10ce492c-43ad-3a51-3f70-7d04122d6544",Synchronized="2017-08-16 11:43:30.0")
/** TableName=M_Product_PO */
public static final String Table_Name="M_Product_PO";


@XendraIndex(Name="m_product_po_vendorprodno",Identifier="ffb1323a-9da3-92db-d038-f39e1e9fa434",
Column_Names="c_bpartner_id, vendorproductno",IsUnique="true",
TableIdentifier="ffb1323a-9da3-92db-d038-f39e1e9fa434",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_product_po_vendorprodno = "ffb1323a-9da3-92db-d038-f39e1e9fa434";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_PO");

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
    Table_ID = MTable.getTable_ID("M_Product_PO");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_PO[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
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

@XendraTrl(Identifier="8a9ec218-4399-2a55-3922-a8964555c2e5")
public static String es_PE_FIELD_Purchasing_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="8a9ec218-4399-2a55-3922-a8964555c2e5")
public static String es_PE_FIELD_Purchasing_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="8a9ec218-4399-2a55-3922-a8964555c2e5")
public static String es_PE_FIELD_Purchasing_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a9ec218-4399-2a55-3922-a8964555c2e5")
public static final String FIELDNAME_Purchasing_BusinessPartner="8a9ec218-4399-2a55-3922-a8964555c2e5";

@XendraTrl(Identifier="e6d86f09-9090-f4a7-d96b-9a04bc5b15d4")
public static String es_PE_FIELD_ProductDetails_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="e6d86f09-9090-f4a7-d96b-9a04bc5b15d4")
public static String es_PE_FIELD_ProductDetails_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="e6d86f09-9090-f4a7-d96b-9a04bc5b15d4")
public static String es_PE_FIELD_ProductDetails_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6d86f09-9090-f4a7-d96b-9a04bc5b15d4")
public static final String FIELDNAME_ProductDetails_BusinessPartner="e6d86f09-9090-f4a7-d96b-9a04bc5b15d4";

@XendraTrl(Identifier="b4b950b3-b99a-1f62-c603-e76c9f74e67f")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b4b950b3-b99a-1f62-c603-e76c9f74e67f",Synchronized="2017-08-05 16:55:28.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="ce04670c-2ea6-e55c-257e-ef926d39506a")
public static String es_PE_FIELD_Purchasing_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="ce04670c-2ea6-e55c-257e-ef926d39506a")
public static String es_PE_FIELD_Purchasing_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="ce04670c-2ea6-e55c-257e-ef926d39506a")
public static String es_PE_FIELD_Purchasing_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce04670c-2ea6-e55c-257e-ef926d39506a")
public static final String FIELDNAME_Purchasing_Currency="ce04670c-2ea6-e55c-257e-ef926d39506a";

@XendraTrl(Identifier="e5e9008b-540c-e038-9070-ae918a1b9132")
public static String es_PE_FIELD_ProductDetails_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="e5e9008b-540c-e038-9070-ae918a1b9132")
public static String es_PE_FIELD_ProductDetails_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="e5e9008b-540c-e038-9070-ae918a1b9132")
public static String es_PE_FIELD_ProductDetails_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5e9008b-540c-e038-9070-ae918a1b9132")
public static final String FIELDNAME_ProductDetails_Currency="e5e9008b-540c-e038-9070-ae918a1b9132";

@XendraTrl(Identifier="3f14d974-1a71-15f4-a7bf-efb553210e3e")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f14d974-1a71-15f4-a7bf-efb553210e3e",
Synchronized="2017-08-05 16:55:28.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Cost per Order.
@param CostPerOrder Fixed Cost Per Order */
public void setCostPerOrder (BigDecimal CostPerOrder)
{
set_Value (COLUMNNAME_CostPerOrder, CostPerOrder);
}
/** Get Cost per Order.
@return Fixed Cost Per Order */
public BigDecimal getCostPerOrder() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostPerOrder);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ff773858-4541-f4e1-61cb-79c66e54cede")
public static String es_PE_FIELD_Purchasing_CostPerOrder_Description="Costo de ordenar";

@XendraTrl(Identifier="ff773858-4541-f4e1-61cb-79c66e54cede")
public static String es_PE_FIELD_Purchasing_CostPerOrder_Help="El costo de ordenar indica el cargo fijo evaluado cuando se coloca una orden para este producto";

@XendraTrl(Identifier="ff773858-4541-f4e1-61cb-79c66e54cede")
public static String es_PE_FIELD_Purchasing_CostPerOrder_Name="Costo por Orden";

@XendraField(AD_Column_ID="CostPerOrder",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff773858-4541-f4e1-61cb-79c66e54cede")
public static final String FIELDNAME_Purchasing_CostPerOrder="ff773858-4541-f4e1-61cb-79c66e54cede";

@XendraTrl(Identifier="3e58ca0a-02db-3260-a874-8e2c17000ce9")
public static String es_PE_FIELD_ProductDetails_CostPerOrder_Description="Costo de ordenar";

@XendraTrl(Identifier="3e58ca0a-02db-3260-a874-8e2c17000ce9")
public static String es_PE_FIELD_ProductDetails_CostPerOrder_Help="El costo de ordenar indica el cargo fijo evaluado cuando se coloca una orden para este producto";

@XendraTrl(Identifier="3e58ca0a-02db-3260-a874-8e2c17000ce9")
public static String es_PE_FIELD_ProductDetails_CostPerOrder_Name="Costo por Orden";

@XendraField(AD_Column_ID="CostPerOrder",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e58ca0a-02db-3260-a874-8e2c17000ce9")
public static final String FIELDNAME_ProductDetails_CostPerOrder="3e58ca0a-02db-3260-a874-8e2c17000ce9";

@XendraTrl(Identifier="aaf9e35b-ec98-1104-01ec-c81654ca042c")
public static String es_PE_COLUMN_CostPerOrder_Name="Costo por Orden";

@XendraColumn(AD_Element_ID="c3b3deb1-8242-c8f0-ff7f-70f69fad92ea",ColumnName="CostPerOrder",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aaf9e35b-ec98-1104-01ec-c81654ca042c",
Synchronized="2017-08-05 16:55:28.0")
/** Column name CostPerOrder */
public static final String COLUMNNAME_CostPerOrder = "CostPerOrder";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8f69ffbb-4a0b-8911-031f-235807ba392a")
public static String es_PE_FIELD_Purchasing_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="8f69ffbb-4a0b-8911-031f-235807ba392a")
public static String es_PE_FIELD_Purchasing_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="8f69ffbb-4a0b-8911-031f-235807ba392a")
public static String es_PE_FIELD_Purchasing_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8f69ffbb-4a0b-8911-031f-235807ba392a")
public static final String FIELDNAME_Purchasing_UOM="8f69ffbb-4a0b-8911-031f-235807ba392a";

@XendraTrl(Identifier="d1022569-bcde-b565-a34f-413161fcbe0a")
public static String es_PE_FIELD_ProductDetails_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="d1022569-bcde-b565-a34f-413161fcbe0a")
public static String es_PE_FIELD_ProductDetails_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="d1022569-bcde-b565-a34f-413161fcbe0a")
public static String es_PE_FIELD_ProductDetails_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d1022569-bcde-b565-a34f-413161fcbe0a")
public static final String FIELDNAME_ProductDetails_UOM="d1022569-bcde-b565-a34f-413161fcbe0a";

@XendraTrl(Identifier="952f699c-873c-5d7a-4f03-f88b014f7337")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="952f699c-873c-5d7a-4f03-f88b014f7337",
Synchronized="2017-08-05 16:55:28.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Actual Delivery Time.
@param DeliveryTime_Actual Actual days between order and delivery */
public void setDeliveryTime_Actual (int DeliveryTime_Actual)
{
set_Value (COLUMNNAME_DeliveryTime_Actual, Integer.valueOf(DeliveryTime_Actual));
}
/** Get Actual Delivery Time.
@return Actual days between order and delivery */
public int getDeliveryTime_Actual() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DeliveryTime_Actual);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ae62a298-7295-d223-4039-b589d1c5af33")
public static String es_PE_FIELD_Purchasing_ActualDeliveryTime_Description="Días efectivos entre la orden y la entrega";

@XendraTrl(Identifier="ae62a298-7295-d223-4039-b589d1c5af33")
public static String es_PE_FIELD_Purchasing_ActualDeliveryTime_Help="El tiempo de entrega actual indica el número de días transcurridos entre la colocación y la entrega de la orden.";

@XendraTrl(Identifier="ae62a298-7295-d223-4039-b589d1c5af33")
public static String es_PE_FIELD_Purchasing_ActualDeliveryTime_Name="Tiempo de Entrega Actual";

@XendraField(AD_Column_ID="DeliveryTime_Actual",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae62a298-7295-d223-4039-b589d1c5af33")
public static final String FIELDNAME_Purchasing_ActualDeliveryTime="ae62a298-7295-d223-4039-b589d1c5af33";

@XendraTrl(Identifier="499e23df-44a5-e16c-28fc-d848a8d02dd4")
public static String es_PE_FIELD_ProductDetails_ActualDeliveryTime_Description="Días efectivos entre la orden y la entrega";

@XendraTrl(Identifier="499e23df-44a5-e16c-28fc-d848a8d02dd4")
public static String es_PE_FIELD_ProductDetails_ActualDeliveryTime_Help="El tiempo de entrega actual indica el número de días transcurridos entre la colocación y la entrega de la orden.";

@XendraTrl(Identifier="499e23df-44a5-e16c-28fc-d848a8d02dd4")
public static String es_PE_FIELD_ProductDetails_ActualDeliveryTime_Name="Tiempo de Entrega Actual";

@XendraField(AD_Column_ID="DeliveryTime_Actual",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="499e23df-44a5-e16c-28fc-d848a8d02dd4")
public static final String FIELDNAME_ProductDetails_ActualDeliveryTime="499e23df-44a5-e16c-28fc-d848a8d02dd4";

@XendraTrl(Identifier="d036175e-f709-a02b-a533-6d4d7635cec0")
public static String es_PE_COLUMN_DeliveryTime_Actual_Name="Tiempo de Entrega Actual";

@XendraColumn(AD_Element_ID="aa9d586e-bdae-0c3b-286d-ba9cc21d7ad4",
ColumnName="DeliveryTime_Actual",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d036175e-f709-a02b-a533-6d4d7635cec0",Synchronized="2017-08-05 16:55:28.0")
/** Column name DeliveryTime_Actual */
public static final String COLUMNNAME_DeliveryTime_Actual = "DeliveryTime_Actual";
/** Set Promised Delivery Time.
@param DeliveryTime_Promised Promised days between order and delivery */
public void setDeliveryTime_Promised (int DeliveryTime_Promised)
{
set_Value (COLUMNNAME_DeliveryTime_Promised, Integer.valueOf(DeliveryTime_Promised));
}
/** Get Promised Delivery Time.
@return Promised days between order and delivery */
public int getDeliveryTime_Promised() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DeliveryTime_Promised);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="75ee3041-538a-92f7-b3d2-0f9de0c3073b")
public static String es_PE_FIELD_Purchasing_PromisedDeliveryTime_Description="Días prometidos entre la orden y la entrega";

@XendraTrl(Identifier="75ee3041-538a-92f7-b3d2-0f9de0c3073b")
public static String es_PE_FIELD_Purchasing_PromisedDeliveryTime_Help="El tiempo de entrega prometido indica el número de días transcurridos entre la fecha de la orden y la fecha en que la entrega fue prometida.";

@XendraTrl(Identifier="75ee3041-538a-92f7-b3d2-0f9de0c3073b")
public static String es_PE_FIELD_Purchasing_PromisedDeliveryTime_Name="Tiempo de Entrega Prometido";

@XendraField(AD_Column_ID="DeliveryTime_Promised",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75ee3041-538a-92f7-b3d2-0f9de0c3073b")
public static final String FIELDNAME_Purchasing_PromisedDeliveryTime="75ee3041-538a-92f7-b3d2-0f9de0c3073b";

@XendraTrl(Identifier="379072a9-1af1-b887-457d-8cdcec1200ef")
public static String es_PE_FIELD_ProductDetails_PromisedDeliveryTime_Description="Días prometidos entre la orden y la entrega";

@XendraTrl(Identifier="379072a9-1af1-b887-457d-8cdcec1200ef")
public static String es_PE_FIELD_ProductDetails_PromisedDeliveryTime_Help="El tiempo de entrega prometido indica el número de días transcurridos entre la fecha de la orden y la fecha en que la entrega fue prometida.";

@XendraTrl(Identifier="379072a9-1af1-b887-457d-8cdcec1200ef")
public static String es_PE_FIELD_ProductDetails_PromisedDeliveryTime_Name="Tiempo de Entrega Prometido";

@XendraField(AD_Column_ID="DeliveryTime_Promised",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="379072a9-1af1-b887-457d-8cdcec1200ef")
public static final String FIELDNAME_ProductDetails_PromisedDeliveryTime="379072a9-1af1-b887-457d-8cdcec1200ef";

@XendraTrl(Identifier="8f44dfb8-1fb5-82c9-6fe7-6100355af10a")
public static String es_PE_COLUMN_DeliveryTime_Promised_Name="Tiempo de Entrega Prometido";

@XendraColumn(AD_Element_ID="02ec830c-bb55-b286-1a11-54a08825d9d9",
ColumnName="DeliveryTime_Promised",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8f44dfb8-1fb5-82c9-6fe7-6100355af10a",Synchronized="2017-08-05 16:55:28.0")
/** Column name DeliveryTime_Promised */
public static final String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";
/** Set Discontinued.
@param Discontinued This product is no longer available */
public void setDiscontinued (boolean Discontinued)
{
set_Value (COLUMNNAME_Discontinued, Boolean.valueOf(Discontinued));
}
/** Get Discontinued.
@return This product is no longer available */
public boolean isDiscontinued() 
{
Object oo = get_Value(COLUMNNAME_Discontinued);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8a84545a-6066-2967-0953-adb2c8d41ea7")
public static String es_PE_FIELD_Purchasing_Discontinued_Description="Este registro no está disponible";

@XendraTrl(Identifier="8a84545a-6066-2967-0953-adb2c8d41ea7")
public static String es_PE_FIELD_Purchasing_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="8a84545a-6066-2967-0953-adb2c8d41ea7")
public static String es_PE_FIELD_Purchasing_Discontinued_Name="Suspendido";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a84545a-6066-2967-0953-adb2c8d41ea7")
public static final String FIELDNAME_Purchasing_Discontinued="8a84545a-6066-2967-0953-adb2c8d41ea7";

@XendraTrl(Identifier="3a281c7b-02b9-af46-136c-6021742af597")
public static String es_PE_FIELD_ProductDetails_Discontinued_Description="Este registro no está disponible";

@XendraTrl(Identifier="3a281c7b-02b9-af46-136c-6021742af597")
public static String es_PE_FIELD_ProductDetails_Discontinued_Help="El cuadro de verificación descontinuado indica un producto que ha sido descontinuado.";

@XendraTrl(Identifier="3a281c7b-02b9-af46-136c-6021742af597")
public static String es_PE_FIELD_ProductDetails_Discontinued_Name="Suspendido";

@XendraField(AD_Column_ID="Discontinued",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a281c7b-02b9-af46-136c-6021742af597")
public static final String FIELDNAME_ProductDetails_Discontinued="3a281c7b-02b9-af46-136c-6021742af597";

@XendraTrl(Identifier="a1e49c45-20a4-d510-7b3a-44a929cf2a03")
public static String es_PE_COLUMN_Discontinued_Name="Suspendido";

@XendraColumn(AD_Element_ID="d1d87912-d08c-5658-dda1-868e7beda7fb",ColumnName="Discontinued",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1e49c45-20a4-d510-7b3a-44a929cf2a03",
Synchronized="2017-08-05 16:55:28.0")
/** Column name Discontinued */
public static final String COLUMNNAME_Discontinued = "Discontinued";
/** Set Discontinued by.
@param DiscontinuedBy Discontinued By */
public void setDiscontinuedBy (Timestamp DiscontinuedBy)
{
set_Value (COLUMNNAME_DiscontinuedBy, DiscontinuedBy);
}
/** Get Discontinued by.
@return Discontinued By */
public Timestamp getDiscontinuedBy() 
{
return (Timestamp)get_Value(COLUMNNAME_DiscontinuedBy);
}

@XendraTrl(Identifier="b9aba840-47ef-b834-16b3-9c77114c0252")
public static String es_PE_FIELD_Purchasing_DiscontinuedBy_Description="Descontinuado Por";

@XendraTrl(Identifier="b9aba840-47ef-b834-16b3-9c77114c0252")
public static String es_PE_FIELD_Purchasing_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="b9aba840-47ef-b834-16b3-9c77114c0252")
public static String es_PE_FIELD_Purchasing_DiscontinuedBy_Name="Suspendido Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Discontinued@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b9aba840-47ef-b834-16b3-9c77114c0252")
public static final String FIELDNAME_Purchasing_DiscontinuedBy="b9aba840-47ef-b834-16b3-9c77114c0252";

@XendraTrl(Identifier="61f174f5-4382-e9cf-6463-9882e4248c4b")
public static String es_PE_FIELD_ProductDetails_DiscontinuedBy_Description="Descontinuado Por";

@XendraTrl(Identifier="61f174f5-4382-e9cf-6463-9882e4248c4b")
public static String es_PE_FIELD_ProductDetails_DiscontinuedBy_Help="El suspendido por indica el individuo que suspendió este producto.";

@XendraTrl(Identifier="61f174f5-4382-e9cf-6463-9882e4248c4b")
public static String es_PE_FIELD_ProductDetails_DiscontinuedBy_Name="Suspendido Por";

@XendraField(AD_Column_ID="DiscontinuedBy",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Discontinued@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="61f174f5-4382-e9cf-6463-9882e4248c4b")
public static final String FIELDNAME_ProductDetails_DiscontinuedBy="61f174f5-4382-e9cf-6463-9882e4248c4b";

@XendraTrl(Identifier="ff77abb5-20c8-defd-9623-331e2d304b8d")
public static String es_PE_COLUMN_DiscontinuedBy_Name="Suspendido Por";

@XendraColumn(AD_Element_ID="27a2ca99-0516-37b9-6667-e8a6634b9141",ColumnName="DiscontinuedBy",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff77abb5-20c8-defd-9623-331e2d304b8d",
Synchronized="2017-08-05 16:55:28.0")
/** Column name DiscontinuedBy */
public static final String COLUMNNAME_DiscontinuedBy = "DiscontinuedBy";
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
@XendraTrl(Identifier="733f4f63-ebe9-4a15-88ac-a9901d10f0f9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="733f4f63-ebe9-4a15-88ac-a9901d10f0f9",
Synchronized="2017-08-05 16:55:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Current vendor.
@param IsCurrentVendor Use this Vendor for pricing and stock replenishment */
public void setIsCurrentVendor (boolean IsCurrentVendor)
{
set_Value (COLUMNNAME_IsCurrentVendor, Boolean.valueOf(IsCurrentVendor));
}
/** Get Current vendor.
@return Use this Vendor for pricing and stock replenishment */
public boolean isCurrentVendor() 
{
Object oo = get_Value(COLUMNNAME_IsCurrentVendor);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d5b59a51-8096-bc87-00d9-6f362c1d4c2b")
public static String es_PE_FIELD_Purchasing_CurrentVendor_Description="Use este proveedor para el cálculo de precio y reabastecimiento de inventario.";

@XendraTrl(Identifier="d5b59a51-8096-bc87-00d9-6f362c1d4c2b")
public static String es_PE_FIELD_Purchasing_CurrentVendor_Help="El proveedor actual indica si los precios son usados y los productos reordenados desde este proveedor.";

@XendraTrl(Identifier="d5b59a51-8096-bc87-00d9-6f362c1d4c2b")
public static String es_PE_FIELD_Purchasing_CurrentVendor_Name="Proveedor Actual";

@XendraField(AD_Column_ID="IsCurrentVendor",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5b59a51-8096-bc87-00d9-6f362c1d4c2b")
public static final String FIELDNAME_Purchasing_CurrentVendor="d5b59a51-8096-bc87-00d9-6f362c1d4c2b";

@XendraTrl(Identifier="6475dd65-51f8-fcd6-ab17-35a08eed2d02")
public static String es_PE_FIELD_ProductDetails_CurrentVendor_Description="Use este proveedor para el cálculo de precio y reabastecimiento de inventario.";

@XendraTrl(Identifier="6475dd65-51f8-fcd6-ab17-35a08eed2d02")
public static String es_PE_FIELD_ProductDetails_CurrentVendor_Help="El proveedor actual indica si los precios son usados y los productos reordenados desde este proveedor.";

@XendraTrl(Identifier="6475dd65-51f8-fcd6-ab17-35a08eed2d02")
public static String es_PE_FIELD_ProductDetails_CurrentVendor_Name="Proveedor Actual";

@XendraField(AD_Column_ID="IsCurrentVendor",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6475dd65-51f8-fcd6-ab17-35a08eed2d02")
public static final String FIELDNAME_ProductDetails_CurrentVendor="6475dd65-51f8-fcd6-ab17-35a08eed2d02";

@XendraTrl(Identifier="352db28c-4f6a-5123-74c8-c50c3060f56c")
public static String es_PE_COLUMN_IsCurrentVendor_Name="Proveedor Actual";

@XendraColumn(AD_Element_ID="2c3d557c-f0a9-6c68-2ee7-08e26ec84733",ColumnName="IsCurrentVendor",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="352db28c-4f6a-5123-74c8-c50c3060f56c",
Synchronized="2017-08-05 16:55:28.0")
/** Column name IsCurrentVendor */
public static final String COLUMNNAME_IsCurrentVendor = "IsCurrentVendor";
/** Set Manufacturer.
@param Manufacturer Manufacturer of the Product */
public void setManufacturer (String Manufacturer)
{
if (Manufacturer != null && Manufacturer.length() > 30)
{
log.warning("Length > 30 - truncated");
Manufacturer = Manufacturer.substring(0,29);
}
set_Value (COLUMNNAME_Manufacturer, Manufacturer);
}
/** Get Manufacturer.
@return Manufacturer of the Product */
public String getManufacturer() 
{
String value = (String)get_Value(COLUMNNAME_Manufacturer);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6e5e5529-c788-5621-c38c-b9e3850e668a")
public static String es_PE_FIELD_Purchasing_Manufacturer_Name="Manufactura";

@XendraField(AD_Column_ID="Manufacturer",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e5e5529-c788-5621-c38c-b9e3850e668a")
public static final String FIELDNAME_Purchasing_Manufacturer="6e5e5529-c788-5621-c38c-b9e3850e668a";

@XendraTrl(Identifier="cd43950d-79c7-7780-f123-07d1dd2eae79")
public static String es_PE_FIELD_ProductDetails_Manufacturer_Name="Manufactura";

@XendraField(AD_Column_ID="Manufacturer",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd43950d-79c7-7780-f123-07d1dd2eae79")
public static final String FIELDNAME_ProductDetails_Manufacturer="cd43950d-79c7-7780-f123-07d1dd2eae79";

@XendraTrl(Identifier="5c6936a2-b394-4956-13e6-7601139b8945")
public static String es_PE_COLUMN_Manufacturer_Name="Manufactura";

@XendraColumn(AD_Element_ID="0978599c-589f-e3c5-586b-8346ff97ccbd",ColumnName="Manufacturer",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c6936a2-b394-4956-13e6-7601139b8945",
Synchronized="2017-08-05 16:55:28.0")
/** Column name Manufacturer */
public static final String COLUMNNAME_Manufacturer = "Manufacturer";
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

@XendraTrl(Identifier="e4131dd5-62f3-a710-15e5-c2e76bcb54a9")
public static String es_PE_FIELD_Purchasing_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="e4131dd5-62f3-a710-15e5-c2e76bcb54a9")
public static String es_PE_FIELD_Purchasing_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="e4131dd5-62f3-a710-15e5-c2e76bcb54a9")
public static String es_PE_FIELD_Purchasing_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4131dd5-62f3-a710-15e5-c2e76bcb54a9")
public static final String FIELDNAME_Purchasing_Product="e4131dd5-62f3-a710-15e5-c2e76bcb54a9";

@XendraTrl(Identifier="5901acbb-5730-f6a8-6894-5c0a00d3c7ef")
public static String es_PE_FIELD_ProductDetails_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="5901acbb-5730-f6a8-6894-5c0a00d3c7ef")
public static String es_PE_FIELD_ProductDetails_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="5901acbb-5730-f6a8-6894-5c0a00d3c7ef")
public static String es_PE_FIELD_ProductDetails_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5901acbb-5730-f6a8-6894-5c0a00d3c7ef")
public static final String FIELDNAME_ProductDetails_Product="5901acbb-5730-f6a8-6894-5c0a00d3c7ef";

@XendraTrl(Identifier="21358f51-08ba-bacd-38dd-810d55975c51")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="@M_Product_ID@",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="21358f51-08ba-bacd-38dd-810d55975c51",Synchronized="2017-08-05 16:55:28.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Minimum Order Qty.
@param Order_Min Minimum order quantity in UOM */
public void setOrder_Min (BigDecimal Order_Min)
{
set_Value (COLUMNNAME_Order_Min, Order_Min);
}
/** Get Minimum Order Qty.
@return Minimum order quantity in UOM */
public BigDecimal getOrder_Min() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Order_Min);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="39888a21-db31-7366-f2dc-6198b366bd3c")
public static String es_PE_FIELD_Purchasing_MinimumOrderQty_Description="Cantidad a ordenar mínima en la UM";

@XendraTrl(Identifier="39888a21-db31-7366-f2dc-6198b366bd3c")
public static String es_PE_FIELD_Purchasing_MinimumOrderQty_Help="La cantidad mínima a ordenar indica la cantidad mas pequeña de este producto que puede ser ordenada.";

@XendraTrl(Identifier="39888a21-db31-7366-f2dc-6198b366bd3c")
public static String es_PE_FIELD_Purchasing_MinimumOrderQty_Name="Mínimo a Ordenar";

@XendraField(AD_Column_ID="Order_Min",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39888a21-db31-7366-f2dc-6198b366bd3c")
public static final String FIELDNAME_Purchasing_MinimumOrderQty="39888a21-db31-7366-f2dc-6198b366bd3c";

@XendraTrl(Identifier="3812c4d0-6d6a-1a22-1faa-5f0fcf965fcf")
public static String es_PE_FIELD_ProductDetails_MinimumOrderQty_Description="Cantidad a ordenar mínima en la UM";

@XendraTrl(Identifier="3812c4d0-6d6a-1a22-1faa-5f0fcf965fcf")
public static String es_PE_FIELD_ProductDetails_MinimumOrderQty_Help="La cantidad mínima a ordenar indica la cantidad mas pequeña de este producto que puede ser ordenada.";

@XendraTrl(Identifier="3812c4d0-6d6a-1a22-1faa-5f0fcf965fcf")
public static String es_PE_FIELD_ProductDetails_MinimumOrderQty_Name="Mínimo a Ordenar";

@XendraField(AD_Column_ID="Order_Min",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3812c4d0-6d6a-1a22-1faa-5f0fcf965fcf")
public static final String FIELDNAME_ProductDetails_MinimumOrderQty="3812c4d0-6d6a-1a22-1faa-5f0fcf965fcf";

@XendraTrl(Identifier="134b6580-a53a-d110-5a53-cf5547390ddf")
public static String es_PE_COLUMN_Order_Min_Name="Mínimo a Ordenar";

@XendraColumn(AD_Element_ID="1d8d0ab1-eadf-b653-858e-9d9d56f1ef39",ColumnName="Order_Min",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="134b6580-a53a-d110-5a53-cf5547390ddf",
Synchronized="2017-08-05 16:55:28.0")
/** Column name Order_Min */
public static final String COLUMNNAME_Order_Min = "Order_Min";
/** Set Order Pack Qty.
@param Order_Pack Package order size in UOM (e.g. order set of 5 units) */
public void setOrder_Pack (BigDecimal Order_Pack)
{
set_Value (COLUMNNAME_Order_Pack, Order_Pack);
}
/** Get Order Pack Qty.
@return Package order size in UOM (e.g. order set of 5 units) */
public BigDecimal getOrder_Pack() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Order_Pack);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2c7be39d-2ede-3091-1d00-4939a8507346")
public static String es_PE_FIELD_Purchasing_OrderPackQty_Description="Tamaño del paquete a ordenar en UM (Ej. Conjunto a ordenar de 5 unidades)";

@XendraTrl(Identifier="2c7be39d-2ede-3091-1d00-4939a8507346")
public static String es_PE_FIELD_Purchasing_OrderPackQty_Help="La cantidad del paquete a ordenar indica el número de unidades en cada paquete de este producto.";

@XendraTrl(Identifier="2c7be39d-2ede-3091-1d00-4939a8507346")
public static String es_PE_FIELD_Purchasing_OrderPackQty_Name="Múltiplo a Ordenar";

@XendraField(AD_Column_ID="Order_Pack",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c7be39d-2ede-3091-1d00-4939a8507346")
public static final String FIELDNAME_Purchasing_OrderPackQty="2c7be39d-2ede-3091-1d00-4939a8507346";

@XendraTrl(Identifier="70f8c7ba-7502-67e1-e05d-f79bb4fb5a69")
public static String es_PE_FIELD_ProductDetails_OrderPackQty_Description="Tamaño del paquete a ordenar en UM (Ej. Conjunto a ordenar de 5 unidades)";

@XendraTrl(Identifier="70f8c7ba-7502-67e1-e05d-f79bb4fb5a69")
public static String es_PE_FIELD_ProductDetails_OrderPackQty_Help="La cantidad del paquete a ordenar indica el número de unidades en cada paquete de este producto.";

@XendraTrl(Identifier="70f8c7ba-7502-67e1-e05d-f79bb4fb5a69")
public static String es_PE_FIELD_ProductDetails_OrderPackQty_Name="Múltiplo a Ordenar";

@XendraField(AD_Column_ID="Order_Pack",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70f8c7ba-7502-67e1-e05d-f79bb4fb5a69")
public static final String FIELDNAME_ProductDetails_OrderPackQty="70f8c7ba-7502-67e1-e05d-f79bb4fb5a69";

@XendraTrl(Identifier="edc79d97-737f-fee7-50ab-de54c1f63c03")
public static String es_PE_COLUMN_Order_Pack_Name="Múltiplo a Ordenar";

@XendraColumn(AD_Element_ID="96c8897c-422d-34b0-315a-2fb2c4e49ff7",ColumnName="Order_Pack",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edc79d97-737f-fee7-50ab-de54c1f63c03",
Synchronized="2017-08-05 16:55:28.0")
/** Column name Order_Pack */
public static final String COLUMNNAME_Order_Pack = "Order_Pack";
/** Set Price effective.
@param PriceEffective Effective Date of Price */
public void setPriceEffective (Timestamp PriceEffective)
{
set_Value (COLUMNNAME_PriceEffective, PriceEffective);
}
/** Get Price effective.
@return Effective Date of Price */
public Timestamp getPriceEffective() 
{
return (Timestamp)get_Value(COLUMNNAME_PriceEffective);
}

@XendraTrl(Identifier="0a2ad851-83d5-3445-cc8a-e56b076a68ae")
public static String es_PE_FIELD_Purchasing_PriceEffective_Description="Fecha efectiva del Precio";

@XendraTrl(Identifier="0a2ad851-83d5-3445-cc8a-e56b076a68ae")
public static String es_PE_FIELD_Purchasing_PriceEffective_Help="La efectividad del precio indica la fecha en que el precio es efectivo. Esto le permite introducir precios futuros a productos que llegarán a ser efectivos cuando sea apropiado.";

@XendraTrl(Identifier="0a2ad851-83d5-3445-cc8a-e56b076a68ae")
public static String es_PE_FIELD_Purchasing_PriceEffective_Name="Fecha de Efectividad del Precio";

@XendraField(AD_Column_ID="PriceEffective",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a2ad851-83d5-3445-cc8a-e56b076a68ae")
public static final String FIELDNAME_Purchasing_PriceEffective="0a2ad851-83d5-3445-cc8a-e56b076a68ae";

@XendraTrl(Identifier="0c288f41-1675-0be4-16d9-3de9ef29d0b3")
public static String es_PE_FIELD_ProductDetails_PriceEffective_Description="Fecha efectiva del Precio";

@XendraTrl(Identifier="0c288f41-1675-0be4-16d9-3de9ef29d0b3")
public static String es_PE_FIELD_ProductDetails_PriceEffective_Help="La efectividad del precio indica la fecha en que el precio es efectivo. Esto le permite introducir precios futuros a productos que llegarán a ser efectivos cuando sea apropiado.";

@XendraTrl(Identifier="0c288f41-1675-0be4-16d9-3de9ef29d0b3")
public static String es_PE_FIELD_ProductDetails_PriceEffective_Name="Fecha de Efectividad del Precio";

@XendraField(AD_Column_ID="PriceEffective",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c288f41-1675-0be4-16d9-3de9ef29d0b3")
public static final String FIELDNAME_ProductDetails_PriceEffective="0c288f41-1675-0be4-16d9-3de9ef29d0b3";

@XendraTrl(Identifier="deb07f59-a478-7f78-852e-22a560bfa595")
public static String es_PE_COLUMN_PriceEffective_Name="Fecha de Efectividad del Precio";

@XendraColumn(AD_Element_ID="673c6705-3bc2-09fb-7ef7-2dcb71a80536",ColumnName="PriceEffective",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="deb07f59-a478-7f78-852e-22a560bfa595",
Synchronized="2017-08-05 16:55:28.0")
/** Column name PriceEffective */
public static final String COLUMNNAME_PriceEffective = "PriceEffective";
/** Set Last Invoice Price.
@param PriceLastInv Price of the last invoice for the product */
public void setPriceLastInv (BigDecimal PriceLastInv)
{
set_ValueNoCheck (COLUMNNAME_PriceLastInv, PriceLastInv);
}
/** Get Last Invoice Price.
@return Price of the last invoice for the product */
public BigDecimal getPriceLastInv() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLastInv);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a10ef7e4-7cf1-632c-29ca-bd5bd901ae2b")
public static String es_PE_FIELD_Purchasing_LastInvoicePrice_Description="Precio de la última factura para el producto";

@XendraTrl(Identifier="a10ef7e4-7cf1-632c-29ca-bd5bd901ae2b")
public static String es_PE_FIELD_Purchasing_LastInvoicePrice_Help="El Precio de última factura indica el último precio pagado (unitario en la factura) para este producto";

@XendraTrl(Identifier="a10ef7e4-7cf1-632c-29ca-bd5bd901ae2b")
public static String es_PE_FIELD_Purchasing_LastInvoicePrice_Name="Último Precio de la Factura";

@XendraField(AD_Column_ID="PriceLastInv",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a10ef7e4-7cf1-632c-29ca-bd5bd901ae2b")
public static final String FIELDNAME_Purchasing_LastInvoicePrice="a10ef7e4-7cf1-632c-29ca-bd5bd901ae2b";

@XendraTrl(Identifier="101f199d-36f9-c977-5f49-f46396688d24")
public static String es_PE_FIELD_ProductDetails_LastInvoicePrice_Description="Precio de la última factura para el producto";

@XendraTrl(Identifier="101f199d-36f9-c977-5f49-f46396688d24")
public static String es_PE_FIELD_ProductDetails_LastInvoicePrice_Help="El Precio de última factura indica el último precio pagado (unitario en la factura) para este producto";

@XendraTrl(Identifier="101f199d-36f9-c977-5f49-f46396688d24")
public static String es_PE_FIELD_ProductDetails_LastInvoicePrice_Name="Último Precio de la Factura";

@XendraField(AD_Column_ID="PriceLastInv",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="101f199d-36f9-c977-5f49-f46396688d24")
public static final String FIELDNAME_ProductDetails_LastInvoicePrice="101f199d-36f9-c977-5f49-f46396688d24";

@XendraTrl(Identifier="7cec0b7f-dadd-0276-e265-e3e42be616f7")
public static String es_PE_COLUMN_PriceLastInv_Name="Último Precio de la Factura";

@XendraColumn(AD_Element_ID="79d5f96d-d602-00ac-43e5-ed89fc511cb4",ColumnName="PriceLastInv",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7cec0b7f-dadd-0276-e265-e3e42be616f7",
Synchronized="2017-08-05 16:55:28.0")
/** Column name PriceLastInv */
public static final String COLUMNNAME_PriceLastInv = "PriceLastInv";
/** Set Last PO Price.
@param PriceLastPO Price of the last purchase order for the product */
public void setPriceLastPO (BigDecimal PriceLastPO)
{
set_ValueNoCheck (COLUMNNAME_PriceLastPO, PriceLastPO);
}
/** Get Last PO Price.
@return Price of the last purchase order for the product */
public BigDecimal getPriceLastPO() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLastPO);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8437b33b-e472-9c81-418b-bcc316820220")
public static String es_PE_FIELD_Purchasing_LastPOPrice_Description="Precio de la última orden de compra del producto";

@XendraTrl(Identifier="8437b33b-e472-9c81-418b-bcc316820220")
public static String es_PE_FIELD_Purchasing_LastPOPrice_Help="El Precio de última orden de compra indica el último precio pagado (unitario de la orden de compra) para este producto";

@XendraTrl(Identifier="8437b33b-e472-9c81-418b-bcc316820220")
public static String es_PE_FIELD_Purchasing_LastPOPrice_Name="Último Precio de OC";

@XendraField(AD_Column_ID="PriceLastPO",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8437b33b-e472-9c81-418b-bcc316820220")
public static final String FIELDNAME_Purchasing_LastPOPrice="8437b33b-e472-9c81-418b-bcc316820220";

@XendraTrl(Identifier="cc5b8fd7-9285-1745-b822-dcd60b7b1d7c")
public static String es_PE_FIELD_ProductDetails_LastPOPrice_Description="Precio de la última orden de compra del producto";

@XendraTrl(Identifier="cc5b8fd7-9285-1745-b822-dcd60b7b1d7c")
public static String es_PE_FIELD_ProductDetails_LastPOPrice_Help="El Precio de última orden de compra indica el último precio pagado (unitario de la orden de compra) para este producto";

@XendraTrl(Identifier="cc5b8fd7-9285-1745-b822-dcd60b7b1d7c")
public static String es_PE_FIELD_ProductDetails_LastPOPrice_Name="Último Precio de OC";

@XendraField(AD_Column_ID="PriceLastPO",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc5b8fd7-9285-1745-b822-dcd60b7b1d7c")
public static final String FIELDNAME_ProductDetails_LastPOPrice="cc5b8fd7-9285-1745-b822-dcd60b7b1d7c";

@XendraTrl(Identifier="6d375c82-2d5d-08dc-857a-d260b5b403ff")
public static String es_PE_COLUMN_PriceLastPO_Name="Último Precio de OC";

@XendraColumn(AD_Element_ID="71f85667-7f69-a76d-4634-c8bab5c2ef8f",ColumnName="PriceLastPO",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d375c82-2d5d-08dc-857a-d260b5b403ff",
Synchronized="2017-08-05 16:55:28.0")
/** Column name PriceLastPO */
public static final String COLUMNNAME_PriceLastPO = "PriceLastPO";
/** Set List Price.
@param PriceList List Price */
public void setPriceList (BigDecimal PriceList)
{
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

@XendraTrl(Identifier="a4308ef1-0204-7c6a-74ce-bc1c430eb325")
public static String es_PE_FIELD_Purchasing_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="a4308ef1-0204-7c6a-74ce-bc1c430eb325")
public static String es_PE_FIELD_Purchasing_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraTrl(Identifier="a4308ef1-0204-7c6a-74ce-bc1c430eb325")
public static String es_PE_FIELD_Purchasing_ListPrice_Name="Precio de Lista";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4308ef1-0204-7c6a-74ce-bc1c430eb325")
public static final String FIELDNAME_Purchasing_ListPrice="a4308ef1-0204-7c6a-74ce-bc1c430eb325";

@XendraTrl(Identifier="86b1c134-d605-4262-ce14-fb337e4eb228")
public static String es_PE_FIELD_ProductDetails_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="86b1c134-d605-4262-ce14-fb337e4eb228")
public static String es_PE_FIELD_ProductDetails_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraTrl(Identifier="86b1c134-d605-4262-ce14-fb337e4eb228")
public static String es_PE_FIELD_ProductDetails_ListPrice_Name="Precio de Lista";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86b1c134-d605-4262-ce14-fb337e4eb228")
public static final String FIELDNAME_ProductDetails_ListPrice="86b1c134-d605-4262-ce14-fb337e4eb228";

@XendraTrl(Identifier="8644553f-4f4a-64f1-33fc-7056507d55f2")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8644553f-4f4a-64f1-33fc-7056507d55f2",
Synchronized="2017-08-05 16:55:28.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";
/** Set PO Price.
@param PricePO Price based on a purchase order */
public void setPricePO (BigDecimal PricePO)
{
set_Value (COLUMNNAME_PricePO, PricePO);
}
/** Get PO Price.
@return Price based on a purchase order */
public BigDecimal getPricePO() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PricePO);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4d2d7204-7dae-771c-cd18-011e5eaa927f")
public static String es_PE_FIELD_Purchasing_POPrice_Description="Precio basado en una orden de compra";

@XendraTrl(Identifier="4d2d7204-7dae-771c-cd18-011e5eaa927f")
public static String es_PE_FIELD_Purchasing_POPrice_Help="El Precio de la OC indica el precio unitario de un producto para la orden de compra";

@XendraTrl(Identifier="4d2d7204-7dae-771c-cd18-011e5eaa927f")
public static String es_PE_FIELD_Purchasing_POPrice_Name="Precio OC";

@XendraField(AD_Column_ID="PricePO",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d2d7204-7dae-771c-cd18-011e5eaa927f")
public static final String FIELDNAME_Purchasing_POPrice="4d2d7204-7dae-771c-cd18-011e5eaa927f";

@XendraTrl(Identifier="83206af2-398b-1c7e-5f5e-10dc31223011")
public static String es_PE_FIELD_ProductDetails_POPrice_Description="Precio basado en una orden de compra";

@XendraTrl(Identifier="83206af2-398b-1c7e-5f5e-10dc31223011")
public static String es_PE_FIELD_ProductDetails_POPrice_Help="El Precio de la OC indica el precio unitario de un producto para la orden de compra";

@XendraTrl(Identifier="83206af2-398b-1c7e-5f5e-10dc31223011")
public static String es_PE_FIELD_ProductDetails_POPrice_Name="Precio OC";

@XendraField(AD_Column_ID="PricePO",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83206af2-398b-1c7e-5f5e-10dc31223011")
public static final String FIELDNAME_ProductDetails_POPrice="83206af2-398b-1c7e-5f5e-10dc31223011";

@XendraTrl(Identifier="12aa94bb-5256-dd97-1a41-9535d9f6c5c9")
public static String es_PE_COLUMN_PricePO_Name="Precio OC";

@XendraColumn(AD_Element_ID="1dc1da18-70d5-3909-dc1c-cf7fe1faefaf",ColumnName="PricePO",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12aa94bb-5256-dd97-1a41-9535d9f6c5c9",
Synchronized="2017-08-05 16:55:28.0")
/** Column name PricePO */
public static final String COLUMNNAME_PricePO = "PricePO";
/** Set Quality Rating.
@param QualityRating Method for rating vendors */
public void setQualityRating (int QualityRating)
{
set_Value (COLUMNNAME_QualityRating, Integer.valueOf(QualityRating));
}
/** Get Quality Rating.
@return Method for rating vendors */
public int getQualityRating() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_QualityRating);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="de46253b-4848-f071-9444-043d51c5d862")
public static String es_PE_FIELD_Purchasing_QualityRating_Description="Método para evaluar proveedores";

@XendraTrl(Identifier="de46253b-4848-f071-9444-043d51c5d862")
public static String es_PE_FIELD_Purchasing_QualityRating_Help="La valuación de la calidad indica cómo un proveedor es evaluado (número mayor = calidad mayor)";

@XendraTrl(Identifier="de46253b-4848-f071-9444-043d51c5d862")
public static String es_PE_FIELD_Purchasing_QualityRating_Name="Valoración de la Calidad";

@XendraField(AD_Column_ID="QualityRating",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de46253b-4848-f071-9444-043d51c5d862")
public static final String FIELDNAME_Purchasing_QualityRating="de46253b-4848-f071-9444-043d51c5d862";

@XendraTrl(Identifier="a987b831-6c22-6e9a-b220-197f54b1b252")
public static String es_PE_FIELD_ProductDetails_QualityRating_Description="Método para evaluar proveedores";

@XendraTrl(Identifier="a987b831-6c22-6e9a-b220-197f54b1b252")
public static String es_PE_FIELD_ProductDetails_QualityRating_Help="La valuación de la calidad indica cómo un proveedor es evaluado (número mayor = calidad mayor)";

@XendraTrl(Identifier="a987b831-6c22-6e9a-b220-197f54b1b252")
public static String es_PE_FIELD_ProductDetails_QualityRating_Name="Valoración de la Calidad";

@XendraField(AD_Column_ID="QualityRating",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a987b831-6c22-6e9a-b220-197f54b1b252")
public static final String FIELDNAME_ProductDetails_QualityRating="a987b831-6c22-6e9a-b220-197f54b1b252";

@XendraTrl(Identifier="7a9f0bc9-bcf6-ceae-f2ee-12e0835d63b4")
public static String es_PE_COLUMN_QualityRating_Name="Valoración de la Calidad";

@XendraColumn(AD_Element_ID="3c5a3b4a-865d-e1e0-cb17-af1c750a9244",ColumnName="QualityRating",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a9f0bc9-bcf6-ceae-f2ee-12e0835d63b4",
Synchronized="2017-08-05 16:55:28.0")
/** Column name QualityRating */
public static final String COLUMNNAME_QualityRating = "QualityRating";
/** Set Royalty Amount.
@param RoyaltyAmt (Included) Amount for copyright, etc. */
public void setRoyaltyAmt (BigDecimal RoyaltyAmt)
{
set_Value (COLUMNNAME_RoyaltyAmt, RoyaltyAmt);
}
/** Get Royalty Amount.
@return (Included) Amount for copyright, etc. */
public BigDecimal getRoyaltyAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RoyaltyAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0ca1db48-2cc4-f168-8234-1d703277adc0")
public static String es_PE_FIELD_Purchasing_RoyaltyAmount_Description="(incluido) cantidad para el copyright, etc.";

@XendraTrl(Identifier="0ca1db48-2cc4-f168-8234-1d703277adc0")
public static String es_PE_FIELD_Purchasing_RoyaltyAmount_Name="Importe de los Derechos";

@XendraField(AD_Column_ID="RoyaltyAmt",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ca1db48-2cc4-f168-8234-1d703277adc0")
public static final String FIELDNAME_Purchasing_RoyaltyAmount="0ca1db48-2cc4-f168-8234-1d703277adc0";

@XendraTrl(Identifier="b660fcd5-fc57-4060-123c-d79aad77ce46")
public static String es_PE_FIELD_ProductDetails_RoyaltyAmount_Description="(incluido) cantidad para el copyright, etc.";

@XendraTrl(Identifier="b660fcd5-fc57-4060-123c-d79aad77ce46")
public static String es_PE_FIELD_ProductDetails_RoyaltyAmount_Name="Importe de los Derechos";

@XendraField(AD_Column_ID="RoyaltyAmt",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b660fcd5-fc57-4060-123c-d79aad77ce46")
public static final String FIELDNAME_ProductDetails_RoyaltyAmount="b660fcd5-fc57-4060-123c-d79aad77ce46";

@XendraTrl(Identifier="7847a47d-af86-5c54-aa7b-f7df3c993a43")
public static String es_PE_COLUMN_RoyaltyAmt_Name="Importe de los Derechos";

@XendraColumn(AD_Element_ID="4947b9a2-6c54-c15b-1d8e-8b78ac569677",ColumnName="RoyaltyAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7847a47d-af86-5c54-aa7b-f7df3c993a43",
Synchronized="2017-08-05 16:55:28.0")
/** Column name RoyaltyAmt */
public static final String COLUMNNAME_RoyaltyAmt = "RoyaltyAmt";
/** Set UPC/EAN.
@param UPC Bar Code (Universal Product Code or its superset European Article Number) */
public void setUPC (String UPC)
{
if (UPC != null && UPC.length() > 20)
{
log.warning("Length > 20 - truncated");
UPC = UPC.substring(0,19);
}
set_Value (COLUMNNAME_UPC, UPC);
}
/** Get UPC/EAN.
@return Bar Code (Universal Product Code or its superset European Article Number) */
public String getUPC() 
{
String value = (String)get_Value(COLUMNNAME_UPC);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9d57f936-47a7-47e7-4f7b-50f462a51c08")
public static String es_PE_FIELD_Purchasing_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="9d57f936-47a7-47e7-4f7b-50f462a51c08")
public static String es_PE_FIELD_Purchasing_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="9d57f936-47a7-47e7-4f7b-50f462a51c08")
public static String es_PE_FIELD_Purchasing_UPCEAN_Name="UPC/EAN";
@XendraField(AD_Column_ID="UPC",
IsCentrallyMaintained=true,AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9d57f936-47a7-47e7-4f7b-50f462a51c08")
public static final String FIELDNAME_Purchasing_UPCEAN="9d57f936-47a7-47e7-4f7b-50f462a51c08";

@XendraTrl(Identifier="37a630ac-44e7-4757-e90a-ff31619fa814")
public static String es_PE_FIELD_ProductDetails_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="37a630ac-44e7-4757-e90a-ff31619fa814")
public static String es_PE_FIELD_ProductDetails_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="37a630ac-44e7-4757-e90a-ff31619fa814")
public static String es_PE_FIELD_ProductDetails_UPCEAN_Name="UPC/EAN";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37a630ac-44e7-4757-e90a-ff31619fa814")
public static final String FIELDNAME_ProductDetails_UPCEAN="37a630ac-44e7-4757-e90a-ff31619fa814";

@XendraTrl(Identifier="af379b35-1f3d-e618-e13a-d9f349efbdd2")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af379b35-1f3d-e618-e13a-d9f349efbdd2",
Synchronized="2017-08-05 16:55:29.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
/** Set Partner Category.
@param VendorCategory Product Category of the Business Partner */
public void setVendorCategory (String VendorCategory)
{
if (VendorCategory != null && VendorCategory.length() > 30)
{
log.warning("Length > 30 - truncated");
VendorCategory = VendorCategory.substring(0,29);
}
set_Value (COLUMNNAME_VendorCategory, VendorCategory);
}
/** Get Partner Category.
@return Product Category of the Business Partner */
public String getVendorCategory() 
{
String value = (String)get_Value(COLUMNNAME_VendorCategory);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8a8ac87b-3f2e-c47e-88e3-dfb759233f2e")
public static String es_PE_FIELD_Purchasing_PartnerCategory_Description="Proveedor";

@XendraTrl(Identifier="8a8ac87b-3f2e-c47e-88e3-dfb759233f2e")
public static String es_PE_FIELD_Purchasing_PartnerCategory_Help="La categoría del proveedor identifica la categoría usada por el proveedor para este producto";

@XendraTrl(Identifier="8a8ac87b-3f2e-c47e-88e3-dfb759233f2e")
public static String es_PE_FIELD_Purchasing_PartnerCategory_Name="Categoría del Proveedor";

@XendraField(AD_Column_ID="VendorCategory",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a8ac87b-3f2e-c47e-88e3-dfb759233f2e")
public static final String FIELDNAME_Purchasing_PartnerCategory="8a8ac87b-3f2e-c47e-88e3-dfb759233f2e";

@XendraTrl(Identifier="73e91c77-ab77-51d4-c28e-7cb3519a6ec3")
public static String es_PE_FIELD_ProductDetails_PartnerCategory_Description="Proveedor";

@XendraTrl(Identifier="73e91c77-ab77-51d4-c28e-7cb3519a6ec3")
public static String es_PE_FIELD_ProductDetails_PartnerCategory_Help="La categoría del proveedor identifica la categoría usada por el proveedor para este producto";

@XendraTrl(Identifier="73e91c77-ab77-51d4-c28e-7cb3519a6ec3")
public static String es_PE_FIELD_ProductDetails_PartnerCategory_Name="Categoría del Proveedor";

@XendraField(AD_Column_ID="VendorCategory",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73e91c77-ab77-51d4-c28e-7cb3519a6ec3")
public static final String FIELDNAME_ProductDetails_PartnerCategory="73e91c77-ab77-51d4-c28e-7cb3519a6ec3";

@XendraTrl(Identifier="39ec9047-affe-008b-3c2d-3169714ed10a")
public static String es_PE_COLUMN_VendorCategory_Name="Categoría del Proveedor";

@XendraColumn(AD_Element_ID="e4cdee60-a64a-b5fe-51f4-6759366bdb6e",ColumnName="VendorCategory",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39ec9047-affe-008b-3c2d-3169714ed10a",
Synchronized="2017-08-05 16:55:29.0")
/** Column name VendorCategory */
public static final String COLUMNNAME_VendorCategory = "VendorCategory";
/** Set Partner Product Key.
@param VendorProductNo Product Key of the Business Partner */
public void setVendorProductNo (String VendorProductNo)
{
if (VendorProductNo == null) throw new IllegalArgumentException ("VendorProductNo is mandatory.");
if (VendorProductNo.length() > 30)
{
log.warning("Length > 30 - truncated");
VendorProductNo = VendorProductNo.substring(0,29);
}
set_Value (COLUMNNAME_VendorProductNo, VendorProductNo);
}
/** Get Partner Product Key.
@return Product Key of the Business Partner */
public String getVendorProductNo() 
{
String value = (String)get_Value(COLUMNNAME_VendorProductNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4e4cdb79-2be1-244c-e539-af2836084841")
public static String es_PE_FIELD_Purchasing_PartnerProductKey_Description="Proveedor";

@XendraTrl(Identifier="4e4cdb79-2be1-244c-e539-af2836084841")
public static String es_PE_FIELD_Purchasing_PartnerProductKey_Help="El número de producto del proveedor identifica el número usado por el proveedor para este producto.";

@XendraTrl(Identifier="4e4cdb79-2be1-244c-e539-af2836084841")
public static String es_PE_FIELD_Purchasing_PartnerProductKey_Name="No. de Producto del Proveedor";

@XendraField(AD_Column_ID="VendorProductNo",IsCentrallyMaintained=true,
AD_Tab_ID="530e626e-0933-8063-f1e9-9d698656a5ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e4cdb79-2be1-244c-e539-af2836084841")
public static final String FIELDNAME_Purchasing_PartnerProductKey="4e4cdb79-2be1-244c-e539-af2836084841";

@XendraTrl(Identifier="16853276-48ab-535f-2c10-23116db4b778")
public static String es_PE_FIELD_ProductDetails_PartnerProductKey_Description="Proveedor";

@XendraTrl(Identifier="16853276-48ab-535f-2c10-23116db4b778")
public static String es_PE_FIELD_ProductDetails_PartnerProductKey_Help="El número de producto del proveedor identifica el número usado por el proveedor para este producto.";

@XendraTrl(Identifier="16853276-48ab-535f-2c10-23116db4b778")
public static String es_PE_FIELD_ProductDetails_PartnerProductKey_Name="No. de Producto del Proveedor";

@XendraField(AD_Column_ID="VendorProductNo",IsCentrallyMaintained=true,
AD_Tab_ID="60108fb4-09bd-5780-d945-318ab8d62449",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16853276-48ab-535f-2c10-23116db4b778")
public static final String FIELDNAME_ProductDetails_PartnerProductKey="16853276-48ab-535f-2c10-23116db4b778";

@XendraTrl(Identifier="d52d6304-568f-b0bd-7c18-2698431b96ad")
public static String es_PE_COLUMN_VendorProductNo_Name="No. de Producto del Proveedor";

@XendraColumn(AD_Element_ID="c028b618-164f-85b1-8821-99e6545860ce",ColumnName="VendorProductNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,
DefaultValue="@Value@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d52d6304-568f-b0bd-7c18-2698431b96ad",Synchronized="2017-08-05 16:55:29.0")
/** Column name VendorProductNo */
public static final String COLUMNNAME_VendorProductNo = "VendorProductNo";
}
