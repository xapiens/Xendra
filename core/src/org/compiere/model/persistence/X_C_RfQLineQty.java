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
/** Generated Model for C_RfQLineQty
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQLineQty extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQLineQty_ID id
@param trxName transaction
*/
public X_C_RfQLineQty (Properties ctx, int C_RfQLineQty_ID, String trxName)
{
super (ctx, C_RfQLineQty_ID, trxName);
/** if (C_RfQLineQty_ID == 0)
{
setBenchmarkPrice (Env.ZERO);
setC_RfQLine_ID (0);
setC_RfQLineQty_ID (0);
setC_UOM_ID (0);
setIsOfferQty (false);	
// N
setIsPurchaseQty (false);	
// N
setIsRfQQty (true);	
// Y
setQty (Env.ZERO);	
// 1
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQLineQty (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=675 */
public static int Table_ID=MTable.getTable_ID("C_RfQLineQty");

@XendraTrl(Identifier="4b845809-1690-d5fb-5c15-e252be744dce")
public static String es_PE_TAB_Quantity_Description="Cantidad en linea RfQ ";

@XendraTrl(Identifier="4b845809-1690-d5fb-5c15-e252be744dce")
public static String es_PE_TAB_Quantity_Help="Cantidad en linea pedido de cita - ";

@XendraTrl(Identifier="4b845809-1690-d5fb-5c15-e252be744dce")
public static String es_PE_TAB_Quantity_Name="Cantidad";
@XendraTab(Name="Quantity",
Description="RfQ Line Quantity",
Help="Request for Quotation Line Quantity - You may request a quotation for different quantities",
AD_Window_ID="5489b4f6-e5c1-38be-86b2-ee5f7e420113",SeqNo=30,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4b845809-1690-d5fb-5c15-e252be744dce",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Quantity="4b845809-1690-d5fb-5c15-e252be744dce";

@XendraTrl(Identifier="dbac613a-c665-0511-dda5-5301ce606169")
public static String es_PE_TABLE_C_RfQLineQty_Name="Cantidad Línea SPC (RfQ)";

@XendraTable(Name="RfQ Line Quantity",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Request for Quotation Line Quantity",Help="",TableName="C_RfQLineQty",AccessLevel="1",
AD_Window_ID="5489b4f6-e5c1-38be-86b2-ee5f7e420113",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="dbac613a-c665-0511-dda5-5301ce606169",
Synchronized="2020-03-03 21:37:37.0")
/** TableName=C_RfQLineQty */
public static final String Table_Name="C_RfQLineQty";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQLineQty");

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
    Table_ID = MTable.getTable_ID("C_RfQLineQty");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQLineQty[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Benchmark Price.
@param BenchmarkPrice Price to compare responses to */
public void setBenchmarkPrice (BigDecimal BenchmarkPrice)
{
if (BenchmarkPrice == null) throw new IllegalArgumentException ("BenchmarkPrice is mandatory.");
set_Value (COLUMNNAME_BenchmarkPrice, BenchmarkPrice);
}
/** Get Benchmark Price.
@return Price to compare responses to */
public BigDecimal getBenchmarkPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BenchmarkPrice);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6a20424a-2441-3770-a1f6-d0bd86cc514f")
public static String es_PE_FIELD_Quantity_BenchmarkPrice_Name="Precio Prueba patrón";

@XendraTrl(Identifier="6a20424a-2441-3770-a1f6-d0bd86cc514f")
public static String es_PE_FIELD_Quantity_BenchmarkPrice_Description="Precio para comparar respuestas";

@XendraField(AD_Column_ID="BenchmarkPrice",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a20424a-2441-3770-a1f6-d0bd86cc514f")
public static final String FIELDNAME_Quantity_BenchmarkPrice="6a20424a-2441-3770-a1f6-d0bd86cc514f";

@XendraTrl(Identifier="9ba5ff3d-31ff-30dd-9c97-4649edab28a3")
public static String es_PE_COLUMN_BenchmarkPrice_Name="Precio Prueba patrón";

@XendraColumn(AD_Element_ID="952d2ebb-b4b4-6959-e9a0-9ecae843eaad",ColumnName="BenchmarkPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ba5ff3d-31ff-30dd-9c97-4649edab28a3",
Synchronized="2019-08-30 22:22:14.0")
/** Column name BenchmarkPrice */
public static final String COLUMNNAME_BenchmarkPrice = "BenchmarkPrice";
/** Set Best Response Amount.
@param BestResponseAmt Best Response Amount */
public void setBestResponseAmt (BigDecimal BestResponseAmt)
{
set_Value (COLUMNNAME_BestResponseAmt, BestResponseAmt);
}
/** Get Best Response Amount.
@return Best Response Amount */
public BigDecimal getBestResponseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BestResponseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="52382d24-5be3-68e1-d228-dcb4a23f41df")
public static String es_PE_FIELD_Quantity_BestResponseAmount_Name="El Mejor Importe de la Respuesta";

@XendraTrl(Identifier="52382d24-5be3-68e1-d228-dcb4a23f41df")
public static String es_PE_FIELD_Quantity_BestResponseAmount_Description="El mejor importe de la respuesta";

@XendraTrl(Identifier="52382d24-5be3-68e1-d228-dcb4a23f41df")
public static String es_PE_FIELD_Quantity_BestResponseAmount_Help="Llenado por la fila proceso de la respuesta";

@XendraField(AD_Column_ID="BestResponseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52382d24-5be3-68e1-d228-dcb4a23f41df")
public static final String FIELDNAME_Quantity_BestResponseAmount="52382d24-5be3-68e1-d228-dcb4a23f41df";

@XendraTrl(Identifier="d519f10f-cf3e-aec7-23b3-b094147e5091")
public static String es_PE_COLUMN_BestResponseAmt_Name="El Mejor Importe de la Respuesta";

@XendraColumn(AD_Element_ID="3b50edf3-67da-e6fa-19e3-854ea9805537",ColumnName="BestResponseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d519f10f-cf3e-aec7-23b3-b094147e5091",
Synchronized="2019-08-30 22:22:14.0")
/** Column name BestResponseAmt */
public static final String COLUMNNAME_BestResponseAmt = "BestResponseAmt";
/** Set RfQ Line.
@param C_RfQLine_ID Request for Quotation Line */
public void setC_RfQLine_ID (int C_RfQLine_ID)
{
if (C_RfQLine_ID < 1) throw new IllegalArgumentException ("C_RfQLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQLine_ID, Integer.valueOf(C_RfQLine_ID));
}
/** Get RfQ Line.
@return Request for Quotation Line */
public int getC_RfQLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f16cb1e5-dc66-f630-8a95-f86f44af1c48")
public static String es_PE_FIELD_Quantity_RfQLine_Name="Ítem Solicitud de Cotización";

@XendraTrl(Identifier="f16cb1e5-dc66-f630-8a95-f86f44af1c48")
public static String es_PE_FIELD_Quantity_RfQLine_Description="Item SPC (RfQ)";

@XendraTrl(Identifier="f16cb1e5-dc66-f630-8a95-f86f44af1c48")
public static String es_PE_FIELD_Quantity_RfQLine_Help="Pedido para el Item de la cita.";

@XendraField(AD_Column_ID="C_RfQLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f16cb1e5-dc66-f630-8a95-f86f44af1c48")
public static final String FIELDNAME_Quantity_RfQLine="f16cb1e5-dc66-f630-8a95-f86f44af1c48";

@XendraTrl(Identifier="ab5b6299-9db6-9ddd-af35-71aa65b83a0c")
public static String es_PE_COLUMN_C_RfQLine_ID_Name="Línea SPC (RfQ)";

@XendraColumn(AD_Element_ID="aec09b62-5630-9404-c995-62b10762d39c",ColumnName="C_RfQLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab5b6299-9db6-9ddd-af35-71aa65b83a0c",
Synchronized="2019-08-30 22:22:14.0")
/** Column name C_RfQLine_ID */
public static final String COLUMNNAME_C_RfQLine_ID = "C_RfQLine_ID";
/** Set RfQ Line Quantity.
@param C_RfQLineQty_ID Request for Quotation Line Quantity */
public void setC_RfQLineQty_ID (int C_RfQLineQty_ID)
{
if (C_RfQLineQty_ID < 1) throw new IllegalArgumentException ("C_RfQLineQty_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQLineQty_ID, Integer.valueOf(C_RfQLineQty_ID));
}
/** Get RfQ Line Quantity.
@return Request for Quotation Line Quantity */
public int getC_RfQLineQty_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQLineQty_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6daf9ca8-bd1d-dcd2-bb24-d1a246e19ba9")
public static String es_PE_FIELD_Quantity_RfQLineQuantity_Name="Cantidad Línea SPC (RfQ)";

@XendraTrl(Identifier="6daf9ca8-bd1d-dcd2-bb24-d1a246e19ba9")
public static String es_PE_FIELD_Quantity_RfQLineQuantity_Description="Solicitud para la cita de la cantida de la linea";

@XendraTrl(Identifier="6daf9ca8-bd1d-dcd2-bb24-d1a246e19ba9")
public static String es_PE_FIELD_Quantity_RfQLineQuantity_Help="Usted puede solicitar una cita para diversas cantidades";

@XendraField(AD_Column_ID="C_RfQLineQty_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6daf9ca8-bd1d-dcd2-bb24-d1a246e19ba9")
public static final String FIELDNAME_Quantity_RfQLineQuantity="6daf9ca8-bd1d-dcd2-bb24-d1a246e19ba9";
/** Column name C_RfQLineQty_ID */
public static final String COLUMNNAME_C_RfQLineQty_ID = "C_RfQLineQty_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_UOM_ID()));
}

@XendraTrl(Identifier="5d10098e-9ab0-f579-b045-ccbab552b934")
public static String es_PE_FIELD_Quantity_UOM_Name="UM";

@XendraTrl(Identifier="5d10098e-9ab0-f579-b045-ccbab552b934")
public static String es_PE_FIELD_Quantity_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="5d10098e-9ab0-f579-b045-ccbab552b934")
public static String es_PE_FIELD_Quantity_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d10098e-9ab0-f579-b045-ccbab552b934")
public static final String FIELDNAME_Quantity_UOM="5d10098e-9ab0-f579-b045-ccbab552b934";

@XendraTrl(Identifier="8798a402-29cd-0c8a-1a70-709001a62c7c")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8798a402-29cd-0c8a-1a70-709001a62c7c",
Synchronized="2019-08-30 22:22:14.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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
@XendraTrl(Identifier="7f126245-ea0f-4d40-b81a-9ad4cd39e187")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f126245-ea0f-4d40-b81a-9ad4cd39e187",
Synchronized="2019-08-30 22:22:14.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Offer Quantity.
@param IsOfferQty This quantity is used in the Offer to the Customer */
public void setIsOfferQty (boolean IsOfferQty)
{
set_Value (COLUMNNAME_IsOfferQty, Boolean.valueOf(IsOfferQty));
}
/** Get Offer Quantity.
@return This quantity is used in the Offer to the Customer */
public boolean isOfferQty() 
{
Object oo = get_Value(COLUMNNAME_IsOfferQty);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1d0b5a77-468a-ee43-bda2-7d7e44cd1360")
public static String es_PE_FIELD_Quantity_OfferQuantity_Name="Cantidad de Propuesta";

@XendraTrl(Identifier="1d0b5a77-468a-ee43-bda2-7d7e44cd1360")
public static String es_PE_FIELD_Quantity_OfferQuantity_Description="Cantidad de Propuesta";

@XendraTrl(Identifier="1d0b5a77-468a-ee43-bda2-7d7e44cd1360")
public static String es_PE_FIELD_Quantity_OfferQuantity_Help="Cuando las cantidades múltiples se utilizan en una petición para la cita, la cantidad seleccionada se utiliza para generar la oferta. Si no seleccionarón ninguno utiliza el número más bajo.";

@XendraField(AD_Column_ID="IsOfferQty",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d0b5a77-468a-ee43-bda2-7d7e44cd1360")
public static final String FIELDNAME_Quantity_OfferQuantity="1d0b5a77-468a-ee43-bda2-7d7e44cd1360";

@XendraTrl(Identifier="6d6966a8-87d0-d1af-fdcd-3e974230c6e9")
public static String es_PE_COLUMN_IsOfferQty_Name="Cantidad de Propuesta";

@XendraColumn(AD_Element_ID="83478d69-6233-cbb1-bf00-47dc1a8b8347",ColumnName="IsOfferQty",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d6966a8-87d0-d1af-fdcd-3e974230c6e9",
Synchronized="2019-08-30 22:22:14.0")
/** Column name IsOfferQty */
public static final String COLUMNNAME_IsOfferQty = "IsOfferQty";
/** Set Purchase Quantity.
@param IsPurchaseQty This quantity is used in the Purchase Order to the Supplier */
public void setIsPurchaseQty (boolean IsPurchaseQty)
{
set_Value (COLUMNNAME_IsPurchaseQty, Boolean.valueOf(IsPurchaseQty));
}
/** Get Purchase Quantity.
@return This quantity is used in the Purchase Order to the Supplier */
public boolean isPurchaseQty() 
{
Object oo = get_Value(COLUMNNAME_IsPurchaseQty);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f7792360-8576-24f7-86a8-4131ec37806e")
public static String es_PE_FIELD_Quantity_PurchaseQuantity_Name="Cantidad De Compra";

@XendraTrl(Identifier="f7792360-8576-24f7-86a8-4131ec37806e")
public static String es_PE_FIELD_Quantity_PurchaseQuantity_Description="Esta cantidad se utiliza en la orden de compra al surtidor";

@XendraTrl(Identifier="f7792360-8576-24f7-86a8-4131ec37806e")
public static String es_PE_FIELD_Quantity_PurchaseQuantity_Help="Cuando las cantidades múltiples se utilizan en una petición para la cita, la cantidad seleccionada se utiliza para generar la orden de compra. Si ningunos seleccionarón se utiliza el número más bajo.";

@XendraField(AD_Column_ID="IsPurchaseQty",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7792360-8576-24f7-86a8-4131ec37806e")
public static final String FIELDNAME_Quantity_PurchaseQuantity="f7792360-8576-24f7-86a8-4131ec37806e";

@XendraTrl(Identifier="74ac720d-a113-119f-0636-9a7c2876512c")
public static String es_PE_COLUMN_IsPurchaseQty_Name="Cantidad De Compra";

@XendraColumn(AD_Element_ID="20dfb065-bec2-6582-779e-a1e8b72d25fa",ColumnName="IsPurchaseQty",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74ac720d-a113-119f-0636-9a7c2876512c",
Synchronized="2019-08-30 22:22:14.0")
/** Column name IsPurchaseQty */
public static final String COLUMNNAME_IsPurchaseQty = "IsPurchaseQty";
/** Set RfQ Quantity.
@param IsRfQQty The quantity is used when generating RfQ Responses */
public void setIsRfQQty (boolean IsRfQQty)
{
set_Value (COLUMNNAME_IsRfQQty, Boolean.valueOf(IsRfQQty));
}
/** Get RfQ Quantity.
@return The quantity is used when generating RfQ Responses */
public boolean isRfQQty() 
{
Object oo = get_Value(COLUMNNAME_IsRfQQty);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7e7de3c9-14d7-d07f-14db-78815a24fb33")
public static String es_PE_FIELD_Quantity_RfQQuantity_Name="SPC (RfQ) Cantidad";

@XendraTrl(Identifier="7e7de3c9-14d7-d07f-14db-78815a24fb33")
public static String es_PE_FIELD_Quantity_RfQQuantity_Description="La cantidad es cuando el generador de SPC (RfQ) tiene respuestas.";

@XendraTrl(Identifier="7e7de3c9-14d7-d07f-14db-78815a24fb33")
public static String es_PE_FIELD_Quantity_RfQQuantity_Help="Al generar las respuestas de SPC (RfQ), esta cantidad es incluida.";

@XendraField(AD_Column_ID="IsRfQQty",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e7de3c9-14d7-d07f-14db-78815a24fb33")
public static final String FIELDNAME_Quantity_RfQQuantity="7e7de3c9-14d7-d07f-14db-78815a24fb33";

@XendraTrl(Identifier="fbc3d08c-c6e7-362c-1463-f01b38484520")
public static String es_PE_COLUMN_IsRfQQty_Name="SPC (RfQ) Cantidad";

@XendraColumn(AD_Element_ID="ed96ff44-e19b-db45-18e1-5558d8f068b7",ColumnName="IsRfQQty",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbc3d08c-c6e7-362c-1463-f01b38484520",
Synchronized="2019-08-30 22:22:14.0")
/** Column name IsRfQQty */
public static final String COLUMNNAME_IsRfQQty = "IsRfQQty";
/** Set Margin %.
@param Margin Margin for a product as a percentage */
public void setMargin (BigDecimal Margin)
{
set_Value (COLUMNNAME_Margin, Margin);
}
/** Get Margin %.
@return Margin for a product as a percentage */
public BigDecimal getMargin() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Margin);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c5c96378-9c38-dcd2-03fb-f2ff1b407a8a")
public static String es_PE_FIELD_Quantity_Margin_Name="% de Margen";

@XendraTrl(Identifier="c5c96378-9c38-dcd2-03fb-f2ff1b407a8a")
public static String es_PE_FIELD_Quantity_Margin_Description="Margen para un producto como porcentaje";

@XendraTrl(Identifier="c5c96378-9c38-dcd2-03fb-f2ff1b407a8a")
public static String es_PE_FIELD_Quantity_Margin_Help="El Margen indica el margen para este producto como un porcentaje del precio límite y precio de venta";

@XendraField(AD_Column_ID="Margin",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOfferQty@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c5c96378-9c38-dcd2-03fb-f2ff1b407a8a")
public static final String FIELDNAME_Quantity_Margin="c5c96378-9c38-dcd2-03fb-f2ff1b407a8a";

@XendraTrl(Identifier="a14185de-0078-f4d9-6fde-762b5860d8b0")
public static String es_PE_COLUMN_Margin_Name="% de Margen";

@XendraColumn(AD_Element_ID="14b27ba5-057c-e645-4ad3-0c71d34dc0af",ColumnName="Margin",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a14185de-0078-f4d9-6fde-762b5860d8b0",
Synchronized="2019-08-30 22:22:14.0")
/** Column name Margin */
public static final String COLUMNNAME_Margin = "Margin";
/** Set Offer Amount.
@param OfferAmt Amount of the Offer */
public void setOfferAmt (BigDecimal OfferAmt)
{
set_Value (COLUMNNAME_OfferAmt, OfferAmt);
}
/** Get Offer Amount.
@return Amount of the Offer */
public BigDecimal getOfferAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OfferAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8557eb90-284d-0677-50dc-7ea210778fd6")
public static String es_PE_FIELD_Quantity_OfferAmount_Name="Importe de Propuesta";

@XendraTrl(Identifier="8557eb90-284d-0677-50dc-7ea210778fd6")
public static String es_PE_FIELD_Quantity_OfferAmount_Description="Cantidad de la propuesta";

@XendraField(AD_Column_ID="OfferAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOfferQty@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8557eb90-284d-0677-50dc-7ea210778fd6")
public static final String FIELDNAME_Quantity_OfferAmount="8557eb90-284d-0677-50dc-7ea210778fd6";

@XendraTrl(Identifier="77677ba9-c6fa-356d-1d96-b5a2236995fa")
public static String es_PE_COLUMN_OfferAmt_Name="Importe de Propuesta";

@XendraColumn(AD_Element_ID="ed1ad61d-6e59-fd27-7a25-47971f08a5ca",ColumnName="OfferAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77677ba9-c6fa-356d-1d96-b5a2236995fa",
Synchronized="2019-08-30 22:22:14.0")
/** Column name OfferAmt */
public static final String COLUMNNAME_OfferAmt = "OfferAmt";
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

@XendraTrl(Identifier="057ea49f-308f-12d0-5ec5-3426d13154fa")
public static String es_PE_FIELD_Quantity_Quantity_Name="Cantidad";

@XendraTrl(Identifier="057ea49f-308f-12d0-5ec5-3426d13154fa")
public static String es_PE_FIELD_Quantity_Quantity_Description="Cantidad";

@XendraTrl(Identifier="057ea49f-308f-12d0-5ec5-3426d13154fa")
public static String es_PE_FIELD_Quantity_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="4b845809-1690-d5fb-5c15-e252be744dce",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="057ea49f-308f-12d0-5ec5-3426d13154fa")
public static final String FIELDNAME_Quantity_Quantity="057ea49f-308f-12d0-5ec5-3426d13154fa";

@XendraTrl(Identifier="77eb1544-c9fa-2817-df8a-4dfdc784ee92")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77eb1544-c9fa-2817-df8a-4dfdc784ee92",
Synchronized="2019-08-30 22:22:14.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
