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
/** Generated Model for M_DemandLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DemandLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_DemandLine_ID id
@param trxName transaction
*/
public X_M_DemandLine (Properties ctx, int M_DemandLine_ID, String trxName)
{
super (ctx, M_DemandLine_ID, trxName);
/** if (M_DemandLine_ID == 0)
{
setC_Period_ID (0);
setM_Demand_ID (0);
setM_DemandLine_ID (0);
setM_Product_ID (0);
setQty (Env.ZERO);
setQtyCalculated (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DemandLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=719 */
public static int Table_ID=MTable.getTable_ID("M_DemandLine");

@XendraTrl(Identifier="3c5bd836-d3dd-c29b-968d-820c6066fae4")
public static String es_PE_TAB_Line_Description="Ìtem de demanda de material";

@XendraTrl(Identifier="3c5bd836-d3dd-c29b-968d-820c6066fae4")
public static String es_PE_TAB_Line_Name="Línea";

@XendraTrl(Identifier="3c5bd836-d3dd-c29b-968d-820c6066fae4")
public static String es_PE_TAB_Line_Help="Demanda para un producto en un periodo";

@XendraTab(Name="Line",Description="Material Demand Line",Help="Demand for a product in a period",
AD_Window_ID="6538f96e-bc28-b93f-fb99-b3302e2c3a01",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3c5bd836-d3dd-c29b-968d-820c6066fae4",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="3c5bd836-d3dd-c29b-968d-820c6066fae4";

@XendraTrl(Identifier="c077687b-083f-99d9-0a39-e21e16f7cfc8")
public static String es_PE_TABLE_M_DemandLine_Name="Línea de Demanda";

@XendraTable(Name="Demand Line",Description="Material Demand Line",Help="",
TableName="M_DemandLine",AccessLevel="2",AD_Window_ID="6538f96e-bc28-b93f-fb99-b3302e2c3a01",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="c077687b-083f-99d9-0a39-e21e16f7cfc8",Synchronized="2017-08-16 11:43:09.0")
/** TableName=M_DemandLine */
public static final String Table_Name="M_DemandLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DemandLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("M_DemandLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DemandLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Period_ID()));
}

@XendraTrl(Identifier="79299300-5078-70d8-1646-c797289259fe")
public static String es_PE_FIELD_Line_Period_Description="Período de Calendario";

@XendraTrl(Identifier="79299300-5078-70d8-1646-c797289259fe")
public static String es_PE_FIELD_Line_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="79299300-5078-70d8-1646-c797289259fe")
public static String es_PE_FIELD_Line_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c5bd836-d3dd-c29b-968d-820c6066fae4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79299300-5078-70d8-1646-c797289259fe")
public static final String FIELDNAME_Line_Period="79299300-5078-70d8-1646-c797289259fe";

@XendraTrl(Identifier="1ee18ae6-961d-d9dd-046a-76d5ae01105b")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8fc67d78-28c2-35aa-7d21-9b8fc4f92dd7",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1ee18ae6-961d-d9dd-046a-76d5ae01105b",Synchronized="2017-08-05 16:55:04.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
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
@XendraTrl(Identifier="d762baf3-f86d-49f9-a9b2-9cfadf3525f6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d762baf3-f86d-49f9-a9b2-9cfadf3525f6",
Synchronized="2017-08-05 16:55:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Demand.
@param M_Demand_ID Material Demand */
public void setM_Demand_ID (int M_Demand_ID)
{
if (M_Demand_ID < 1) throw new IllegalArgumentException ("M_Demand_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Demand_ID, Integer.valueOf(M_Demand_ID));
}
/** Get Demand.
@return Material Demand */
public int getM_Demand_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Demand_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="38add23a-5c09-75f0-7b9c-c5a38b6cbbaa")
public static String es_PE_FIELD_Line_Demand_Description="Demanda material";

@XendraTrl(Identifier="38add23a-5c09-75f0-7b9c-c5a38b6cbbaa")
public static String es_PE_FIELD_Line_Demand_Help="La demanda material se puede basar en el pronóstico, demandas, órdenes abiertas.";

@XendraTrl(Identifier="38add23a-5c09-75f0-7b9c-c5a38b6cbbaa")
public static String es_PE_FIELD_Line_Demand_Name="Demanda";

@XendraField(AD_Column_ID="M_Demand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c5bd836-d3dd-c29b-968d-820c6066fae4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38add23a-5c09-75f0-7b9c-c5a38b6cbbaa")
public static final String FIELDNAME_Line_Demand="38add23a-5c09-75f0-7b9c-c5a38b6cbbaa";

@XendraTrl(Identifier="3b921a7d-03e4-19d7-e9db-1d9c630bdadb")
public static String es_PE_COLUMN_M_Demand_ID_Name="Demanda";

@XendraColumn(AD_Element_ID="65b8c901-67ab-c0c1-e881-2dfb0c210553",ColumnName="M_Demand_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b921a7d-03e4-19d7-e9db-1d9c630bdadb",
Synchronized="2017-08-05 16:55:04.0")
/** Column name M_Demand_ID */
public static final String COLUMNNAME_M_Demand_ID = "M_Demand_ID";
/** Set Demand Line.
@param M_DemandLine_ID Material Demand Line */
public void setM_DemandLine_ID (int M_DemandLine_ID)
{
if (M_DemandLine_ID < 1) throw new IllegalArgumentException ("M_DemandLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DemandLine_ID, Integer.valueOf(M_DemandLine_ID));
}
/** Get Demand Line.
@return Material Demand Line */
public int getM_DemandLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DemandLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73514aed-d00a-0ea4-44ae-be44df63054c")
public static String es_PE_FIELD_Line_DemandLine_Description="Item de demanda de material.";

@XendraTrl(Identifier="73514aed-d00a-0ea4-44ae-be44df63054c")
public static String es_PE_FIELD_Line_DemandLine_Help="Demanda para un producto en un periodo.";

@XendraTrl(Identifier="73514aed-d00a-0ea4-44ae-be44df63054c")
public static String es_PE_FIELD_Line_DemandLine_Name="Item de Demanda";

@XendraField(AD_Column_ID="M_DemandLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c5bd836-d3dd-c29b-968d-820c6066fae4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73514aed-d00a-0ea4-44ae-be44df63054c")
public static final String FIELDNAME_Line_DemandLine="73514aed-d00a-0ea4-44ae-be44df63054c";
/** Column name M_DemandLine_ID */
public static final String COLUMNNAME_M_DemandLine_ID = "M_DemandLine_ID";
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

@XendraTrl(Identifier="85cc35dc-6338-dcf9-93ed-9f28905b1757")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="85cc35dc-6338-dcf9-93ed-9f28905b1757")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="85cc35dc-6338-dcf9-93ed-9f28905b1757")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3c5bd836-d3dd-c29b-968d-820c6066fae4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85cc35dc-6338-dcf9-93ed-9f28905b1757")
public static final String FIELDNAME_Line_Product="85cc35dc-6338-dcf9-93ed-9f28905b1757";

@XendraTrl(Identifier="3d903df8-bbf6-3ce5-a772-059d7364c1e3")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3d903df8-bbf6-3ce5-a772-059d7364c1e3",Synchronized="2017-08-05 16:55:04.0")
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

@XendraTrl(Identifier="952297dc-c670-5802-ce01-cc0660d7234d")
public static String es_PE_FIELD_Line_Quantity_Description="Cantidad";

@XendraTrl(Identifier="952297dc-c670-5802-ce01-cc0660d7234d")
public static String es_PE_FIELD_Line_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="952297dc-c670-5802-ce01-cc0660d7234d")
public static String es_PE_FIELD_Line_Quantity_Name="Cantidad";
@XendraField(AD_Column_ID="Qty",
IsCentrallyMaintained=true,AD_Tab_ID="3c5bd836-d3dd-c29b-968d-820c6066fae4",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="952297dc-c670-5802-ce01-cc0660d7234d")
public static final String FIELDNAME_Line_Quantity="952297dc-c670-5802-ce01-cc0660d7234d";

@XendraTrl(Identifier="8cdc4c2c-3ca0-da34-0903-f3acff6e7d7c")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cdc4c2c-3ca0-da34-0903-f3acff6e7d7c",
Synchronized="2017-08-05 16:55:04.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Calculated Quantity.
@param QtyCalculated Calculated Quantity */
public void setQtyCalculated (BigDecimal QtyCalculated)
{
if (QtyCalculated == null) throw new IllegalArgumentException ("QtyCalculated is mandatory.");
set_Value (COLUMNNAME_QtyCalculated, QtyCalculated);
}
/** Get Calculated Quantity.
@return Calculated Quantity */
public BigDecimal getQtyCalculated() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyCalculated);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="81392e3c-7993-0599-d95c-cf98d414e482")
public static String es_PE_FIELD_Line_CalculatedQuantity_Description="Cantidad Calculada";

@XendraTrl(Identifier="81392e3c-7993-0599-d95c-cf98d414e482")
public static String es_PE_FIELD_Line_CalculatedQuantity_Name="Cantidad Calculada";

@XendraField(AD_Column_ID="QtyCalculated",IsCentrallyMaintained=true,
AD_Tab_ID="3c5bd836-d3dd-c29b-968d-820c6066fae4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81392e3c-7993-0599-d95c-cf98d414e482")
public static final String FIELDNAME_Line_CalculatedQuantity="81392e3c-7993-0599-d95c-cf98d414e482";

@XendraTrl(Identifier="25a4ab70-2ce7-d935-efbf-4ad982f0bf79")
public static String es_PE_COLUMN_QtyCalculated_Name="Cantidad Calculada";

@XendraColumn(AD_Element_ID="ce76ba85-ebc1-f0a9-207f-a429dbebd4c3",ColumnName="QtyCalculated",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25a4ab70-2ce7-d935-efbf-4ad982f0bf79",
Synchronized="2017-08-05 16:55:04.0")
/** Column name QtyCalculated */
public static final String COLUMNNAME_QtyCalculated = "QtyCalculated";
}
