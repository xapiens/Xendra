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
/** Generated Model for C_LandedCostAllocation
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_LandedCostAllocation extends PO
{
/** Standard Constructor
@param ctx context
@param C_LandedCostAllocation_ID id
@param trxName transaction
*/
public X_C_LandedCostAllocation (Properties ctx, int C_LandedCostAllocation_ID, String trxName)
{
super (ctx, C_LandedCostAllocation_ID, trxName);
/** if (C_LandedCostAllocation_ID == 0)
{
setAmt (Env.ZERO);	
// 0
setBase (Env.ZERO);
setC_InvoiceLine_ID (0);
setC_LandedCostAllocation_ID (0);
setM_CostElement_ID (0);
setM_Product_ID (0);
setQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_LandedCostAllocation (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=760 */
public static int Table_ID=MTable.getTable_ID("C_LandedCostAllocation");

@XendraTrl(Identifier="e39b72f7-6473-67aa-02b1-7f4012881d60")
public static String es_PE_TAB_LandedCostAllocation_Description="Asignación de Costo para Producto";

@XendraTrl(Identifier="e39b72f7-6473-67aa-02b1-7f4012881d60")
public static String es_PE_TAB_LandedCostAllocation_Help="Calculado al preparar la factura";

@XendraTrl(Identifier="e39b72f7-6473-67aa-02b1-7f4012881d60")
public static String es_PE_TAB_LandedCostAllocation_Name="Asignación de Costo para Producto";

@XendraTab(Name="Landed Cost Allocation",Description="Allocation of Landed Costs to Product",
Help="Calculated when preparing the Invoice",AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",
SeqNo=40,TabLevel=2,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="48645463-cf70-b278-b836-4e0d7cee5767",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="e39b72f7-6473-67aa-02b1-7f4012881d60",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_LandedCostAllocation="e39b72f7-6473-67aa-02b1-7f4012881d60";

@XendraTrl(Identifier="6856b270-328e-452c-0f44-4f62fd68bd0c")
public static String es_PE_TABLE_C_LandedCostAllocation_Name="Asignación Costo Adicional";


@XendraTable(Name="Landed Cost Allocation",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_LandedCostAllocation",AccessLevel="1",
AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="6856b270-328e-452c-0f44-4f62fd68bd0c",
Synchronized="2020-03-03 21:37:09.0")
/** TableName=C_LandedCostAllocation */
public static final String Table_Name="C_LandedCostAllocation";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_LandedCostAllocation");

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
    Table_ID = MTable.getTable_ID("C_LandedCostAllocation");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_LandedCostAllocation[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="e8ced4a0-8449-8fe4-b0e7-c1a0f8b4fc60")
public static String es_PE_FIELD_LandedCostAllocation_Amount_Name="Total";

@XendraTrl(Identifier="e8ced4a0-8449-8fe4-b0e7-c1a0f8b4fc60")
public static String es_PE_FIELD_LandedCostAllocation_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="e8ced4a0-8449-8fe4-b0e7-c1a0f8b4fc60")
public static String es_PE_FIELD_LandedCostAllocation_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraField(AD_Column_ID="Amt",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8ced4a0-8449-8fe4-b0e7-c1a0f8b4fc60")
public static final String FIELDNAME_LandedCostAllocation_Amount="e8ced4a0-8449-8fe4-b0e7-c1a0f8b4fc60";

@XendraTrl(Identifier="59328bd0-7b53-3dd6-64b7-de683f51abdd")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59328bd0-7b53-3dd6-64b7-de683f51abdd",
Synchronized="2019-08-30 22:21:47.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
/** Set Base.
@param Base Calculation Base */
public void setBase (BigDecimal Base)
{
if (Base == null) throw new IllegalArgumentException ("Base is mandatory.");
set_Value (COLUMNNAME_Base, Base);
}
/** Get Base.
@return Calculation Base */
public BigDecimal getBase() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Base);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1c7824ac-1188-09c6-503c-8a54e95e2472")
public static String es_PE_FIELD_LandedCostAllocation_Base_Name="Base";

@XendraTrl(Identifier="1c7824ac-1188-09c6-503c-8a54e95e2472")
public static String es_PE_FIELD_LandedCostAllocation_Base_Description="Base de Cálculo";

@XendraField(AD_Column_ID="Base",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c7824ac-1188-09c6-503c-8a54e95e2472")
public static final String FIELDNAME_LandedCostAllocation_Base="1c7824ac-1188-09c6-503c-8a54e95e2472";

@XendraTrl(Identifier="17248b58-da0d-aef3-b6fa-24dec8fb9059")
public static String es_PE_COLUMN_Base_Name="Base";

@XendraColumn(AD_Element_ID="723c5fdf-f90f-0904-115b-3d9ee8e6d105",ColumnName="Base",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17248b58-da0d-aef3-b6fa-24dec8fb9059",
Synchronized="2019-08-30 22:21:47.0")
/** Column name Base */
public static final String COLUMNNAME_Base = "Base";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_InvoiceLine_ID()));
}

@XendraTrl(Identifier="a9f06b6e-5600-43f0-cd0b-e6e8f2fff6e2")
public static String es_PE_FIELD_LandedCostAllocation_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="a9f06b6e-5600-43f0-cd0b-e6e8f2fff6e2")
public static String es_PE_FIELD_LandedCostAllocation_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="a9f06b6e-5600-43f0-cd0b-e6e8f2fff6e2")
public static String es_PE_FIELD_LandedCostAllocation_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9f06b6e-5600-43f0-cd0b-e6e8f2fff6e2")
public static final String FIELDNAME_LandedCostAllocation_InvoiceLine="a9f06b6e-5600-43f0-cd0b-e6e8f2fff6e2";

@XendraTrl(Identifier="48645463-cf70-b278-b836-4e0d7cee5767")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48645463-cf70-b278-b836-4e0d7cee5767",
Synchronized="2019-08-30 22:21:47.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Landed Cost Allocation.
@param C_LandedCostAllocation_ID Allocation for Land Costs */
public void setC_LandedCostAllocation_ID (int C_LandedCostAllocation_ID)
{
if (C_LandedCostAllocation_ID < 1) throw new IllegalArgumentException ("C_LandedCostAllocation_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_LandedCostAllocation_ID, Integer.valueOf(C_LandedCostAllocation_ID));
}
/** Get Landed Cost Allocation.
@return Allocation for Land Costs */
public int getC_LandedCostAllocation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LandedCostAllocation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2e2c921-347c-6708-9624-cac365264f39")
public static String es_PE_FIELD_LandedCostAllocation_LandedCostAllocation_Name="Asignación Costo Adicional";

@XendraTrl(Identifier="c2e2c921-347c-6708-9624-cac365264f39")
public static String es_PE_FIELD_LandedCostAllocation_LandedCostAllocation_Description="Asignación de Costo Adicional ";

@XendraField(AD_Column_ID="C_LandedCostAllocation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2e2c921-347c-6708-9624-cac365264f39")
public static final String FIELDNAME_LandedCostAllocation_LandedCostAllocation="c2e2c921-347c-6708-9624-cac365264f39";
/** Column name C_LandedCostAllocation_ID */
public static final String COLUMNNAME_C_LandedCostAllocation_ID = "C_LandedCostAllocation_ID";
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
@XendraTrl(Identifier="e72fe0d7-72c9-411c-9672-f01980b3d44f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e72fe0d7-72c9-411c-9672-f01980b3d44f",
Synchronized="2019-08-30 22:21:47.0")
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

@XendraTrl(Identifier="5e0a3a25-bd5a-185c-d370-df18146c7db2")
public static String es_PE_FIELD_LandedCostAllocation_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="5e0a3a25-bd5a-185c-d370-df18146c7db2")
public static String es_PE_FIELD_LandedCostAllocation_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="5e0a3a25-bd5a-185c-d370-df18146c7db2")
public static String es_PE_FIELD_LandedCostAllocation_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e0a3a25-bd5a-185c-d370-df18146c7db2")
public static final String FIELDNAME_LandedCostAllocation_AttributeSetInstance="5e0a3a25-bd5a-185c-d370-df18146c7db2";

@XendraTrl(Identifier="97b287d4-f2f0-23d4-df0c-9202c9583b51")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97b287d4-f2f0-23d4-df0c-9202c9583b51",
Synchronized="2019-08-30 22:21:47.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID < 1) throw new IllegalArgumentException ("M_CostElement_ID is mandatory.");
set_Value (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7b8d747e-11be-853f-8a97-494d8aab2da2")
public static String es_PE_FIELD_LandedCostAllocation_CostElement_Name="Elemento de Costo";

@XendraTrl(Identifier="7b8d747e-11be-853f-8a97-494d8aab2da2")
public static String es_PE_FIELD_LandedCostAllocation_CostElement_Description="Elemento de costo de producto";

@XendraField(AD_Column_ID="M_CostElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b8d747e-11be-853f-8a97-494d8aab2da2")
public static final String FIELDNAME_LandedCostAllocation_CostElement="7b8d747e-11be-853f-8a97-494d8aab2da2";

@XendraTrl(Identifier="d2890f52-4efe-4930-8262-b5546c5681d2")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Elemento de Costo";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2890f52-4efe-4930-8262-b5546c5681d2",
Synchronized="2019-08-30 22:21:47.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
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

@XendraTrl(Identifier="59520eeb-dd5b-a5a4-140f-38057360990e")
public static String es_PE_FIELD_LandedCostAllocation_Product_Name="Producto";

@XendraTrl(Identifier="59520eeb-dd5b-a5a4-140f-38057360990e")
public static String es_PE_FIELD_LandedCostAllocation_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="59520eeb-dd5b-a5a4-140f-38057360990e")
public static String es_PE_FIELD_LandedCostAllocation_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59520eeb-dd5b-a5a4-140f-38057360990e")
public static final String FIELDNAME_LandedCostAllocation_Product="59520eeb-dd5b-a5a4-140f-38057360990e";

@XendraTrl(Identifier="bb0bc947-fc64-400a-e723-12256dac1422")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bb0bc947-fc64-400a-e723-12256dac1422",Synchronized="2019-08-30 22:21:47.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="c9b07d0e-eeb6-2f41-e045-9f3585f39f82")
public static String es_PE_FIELD_LandedCostAllocation_Quantity_Name="Cantidad";

@XendraTrl(Identifier="c9b07d0e-eeb6-2f41-e045-9f3585f39f82")
public static String es_PE_FIELD_LandedCostAllocation_Quantity_Description="Cantidad";

@XendraTrl(Identifier="c9b07d0e-eeb6-2f41-e045-9f3585f39f82")
public static String es_PE_FIELD_LandedCostAllocation_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="e39b72f7-6473-67aa-02b1-7f4012881d60",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9b07d0e-eeb6-2f41-e045-9f3585f39f82")
public static final String FIELDNAME_LandedCostAllocation_Quantity="c9b07d0e-eeb6-2f41-e045-9f3585f39f82";

@XendraTrl(Identifier="696e0599-7d9a-753e-eff5-2eb3279713a7")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="696e0599-7d9a-753e-eff5-2eb3279713a7",
Synchronized="2019-08-30 22:21:47.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
