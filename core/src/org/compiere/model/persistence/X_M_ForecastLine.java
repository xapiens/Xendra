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
/** Generated Model for M_ForecastLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ForecastLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_ForecastLine_ID id
@param trxName transaction
*/
public X_M_ForecastLine (Properties ctx, int M_ForecastLine_ID, String trxName)
{
super (ctx, M_ForecastLine_ID, trxName);
/** if (M_ForecastLine_ID == 0)
{
setC_Period_ID (0);
setM_Forecast_ID (0);
setM_ForecastLine_ID (0);
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
public X_M_ForecastLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=722 */
public static int Table_ID=MTable.getTable_ID("M_ForecastLine");

@XendraTrl(Identifier="36bee53b-53d7-f4ab-455b-944e07efc1e0")
public static String es_PE_TAB_Line_Description="Ìtem de pronóstico";

@XendraTrl(Identifier="36bee53b-53d7-f4ab-455b-944e07efc1e0")
public static String es_PE_TAB_Line_Name="Línea";

@XendraTrl(Identifier="36bee53b-53d7-f4ab-455b-944e07efc1e0")
public static String es_PE_TAB_Line_Help="Pronóstico de la cantidad del producto por periodo";

@XendraTab(Name="Line",Description="Forecast Line",Help="Forecast of Product Qyantity by Period",
AD_Window_ID="06d44e37-f9cc-1106-262a-5b7b41954a21",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="36bee53b-53d7-f4ab-455b-944e07efc1e0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="36bee53b-53d7-f4ab-455b-944e07efc1e0";

@XendraTrl(Identifier="96382c0f-50b2-9752-ed56-e63293105ac4")
public static String es_PE_TABLE_M_ForecastLine_Name="Línea de Pronostico";

@XendraTable(Name="Forecast Line",Description="Forecast Line",Help="",TableName="M_ForecastLine",
AccessLevel="2",AD_Window_ID="06d44e37-f9cc-1106-262a-5b7b41954a21",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="96382c0f-50b2-9752-ed56-e63293105ac4",Synchronized="2017-08-16 11:43:11.0")
/** TableName=M_ForecastLine */
public static final String Table_Name="M_ForecastLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ForecastLine");

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
    Table_ID = MTable.getTable_ID("M_ForecastLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ForecastLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="0916ca75-d48c-98e6-556b-b71a03f690ad")
public static String es_PE_FIELD_Line_Period_Description="Período de Calendario";

@XendraTrl(Identifier="0916ca75-d48c-98e6-556b-b71a03f690ad")
public static String es_PE_FIELD_Line_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="0916ca75-d48c-98e6-556b-b71a03f690ad")
public static String es_PE_FIELD_Line_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="36bee53b-53d7-f4ab-455b-944e07efc1e0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0916ca75-d48c-98e6-556b-b71a03f690ad")
public static final String FIELDNAME_Line_Period="0916ca75-d48c-98e6-556b-b71a03f690ad";

@XendraTrl(Identifier="20b9206b-9c8e-65d3-195e-8767fd961f66")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8fc67d78-28c2-35aa-7d21-9b8fc4f92dd7",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="20b9206b-9c8e-65d3-195e-8767fd961f66",Synchronized="2017-08-05 16:55:06.0")
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
@XendraTrl(Identifier="995bd27e-bafb-48bb-a5be-057948661f16")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="995bd27e-bafb-48bb-a5be-057948661f16",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Forecast.
@param M_Forecast_ID Material Forecast */
public void setM_Forecast_ID (int M_Forecast_ID)
{
if (M_Forecast_ID < 1) throw new IllegalArgumentException ("M_Forecast_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Forecast_ID, Integer.valueOf(M_Forecast_ID));
}
/** Get Forecast.
@return Material Forecast */
public int getM_Forecast_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Forecast_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1afaa1ea-a4f2-b82b-b502-5f7dbe5e5274")
public static String es_PE_FIELD_Line_Forecast_Description="Pronóstico de material";

@XendraTrl(Identifier="1afaa1ea-a4f2-b82b-b502-5f7dbe5e5274")
public static String es_PE_FIELD_Line_Forecast_Help="Pronóstico de material";

@XendraTrl(Identifier="1afaa1ea-a4f2-b82b-b502-5f7dbe5e5274")
public static String es_PE_FIELD_Line_Forecast_Name="Pronóstico";

@XendraField(AD_Column_ID="M_Forecast_ID",IsCentrallyMaintained=true,
AD_Tab_ID="36bee53b-53d7-f4ab-455b-944e07efc1e0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1afaa1ea-a4f2-b82b-b502-5f7dbe5e5274")
public static final String FIELDNAME_Line_Forecast="1afaa1ea-a4f2-b82b-b502-5f7dbe5e5274";

@XendraTrl(Identifier="e834def9-3716-9227-cffa-a304a78ec9f1")
public static String es_PE_COLUMN_M_Forecast_ID_Name="Pronóstico";

@XendraColumn(AD_Element_ID="867abf7a-468e-b4c5-119e-018e31869ece",ColumnName="M_Forecast_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e834def9-3716-9227-cffa-a304a78ec9f1",
Synchronized="2017-08-05 16:55:06.0")
/** Column name M_Forecast_ID */
public static final String COLUMNNAME_M_Forecast_ID = "M_Forecast_ID";
/** Set Forecast Line.
@param M_ForecastLine_ID Forecast Line */
public void setM_ForecastLine_ID (int M_ForecastLine_ID)
{
if (M_ForecastLine_ID < 1) throw new IllegalArgumentException ("M_ForecastLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ForecastLine_ID, Integer.valueOf(M_ForecastLine_ID));
}
/** Get Forecast Line.
@return Forecast Line */
public int getM_ForecastLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ForecastLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5e63bdc7-47ed-0dfe-67e7-a6e9e2f2c548")
public static String es_PE_FIELD_Line_ForecastLine_Description="Item de pronóstico";

@XendraTrl(Identifier="5e63bdc7-47ed-0dfe-67e7-a6e9e2f2c548")
public static String es_PE_FIELD_Line_ForecastLine_Help="Pronóstico de producto cantidad y periodo.";

@XendraTrl(Identifier="5e63bdc7-47ed-0dfe-67e7-a6e9e2f2c548")
public static String es_PE_FIELD_Line_ForecastLine_Name="Item de Pronostico";

@XendraField(AD_Column_ID="M_ForecastLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="36bee53b-53d7-f4ab-455b-944e07efc1e0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e63bdc7-47ed-0dfe-67e7-a6e9e2f2c548")
public static final String FIELDNAME_Line_ForecastLine="5e63bdc7-47ed-0dfe-67e7-a6e9e2f2c548";
/** Column name M_ForecastLine_ID */
public static final String COLUMNNAME_M_ForecastLine_ID = "M_ForecastLine_ID";
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

@XendraTrl(Identifier="52ee5a2b-b302-2612-6d97-4f5ca498a4b0")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="52ee5a2b-b302-2612-6d97-4f5ca498a4b0")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="52ee5a2b-b302-2612-6d97-4f5ca498a4b0")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="36bee53b-53d7-f4ab-455b-944e07efc1e0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52ee5a2b-b302-2612-6d97-4f5ca498a4b0")
public static final String FIELDNAME_Line_Product="52ee5a2b-b302-2612-6d97-4f5ca498a4b0";

@XendraTrl(Identifier="d6fe23ac-fa1b-8926-ab21-1af0dfa9ba65")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d6fe23ac-fa1b-8926-ab21-1af0dfa9ba65",Synchronized="2017-08-05 16:55:06.0")
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

@XendraTrl(Identifier="7f63365b-a173-d1c0-6d46-6bba2d6eb9e2")
public static String es_PE_FIELD_Line_Quantity_Description="Cantidad";

@XendraTrl(Identifier="7f63365b-a173-d1c0-6d46-6bba2d6eb9e2")
public static String es_PE_FIELD_Line_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="7f63365b-a173-d1c0-6d46-6bba2d6eb9e2")
public static String es_PE_FIELD_Line_Quantity_Name="Cantidad";
@XendraField(AD_Column_ID="Qty",
IsCentrallyMaintained=true,AD_Tab_ID="36bee53b-53d7-f4ab-455b-944e07efc1e0",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7f63365b-a173-d1c0-6d46-6bba2d6eb9e2")
public static final String FIELDNAME_Line_Quantity="7f63365b-a173-d1c0-6d46-6bba2d6eb9e2";

@XendraTrl(Identifier="6f41c455-14c6-9774-9537-c00749938e29")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f41c455-14c6-9774-9537-c00749938e29",
Synchronized="2017-08-05 16:55:06.0")
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

@XendraTrl(Identifier="fba4aad6-1a68-9bb4-eba0-257db36d633f")
public static String es_PE_FIELD_Line_CalculatedQuantity_Description="Cantidad Calculada";

@XendraTrl(Identifier="fba4aad6-1a68-9bb4-eba0-257db36d633f")
public static String es_PE_FIELD_Line_CalculatedQuantity_Name="Cantidad Calculada";

@XendraField(AD_Column_ID="QtyCalculated",IsCentrallyMaintained=true,
AD_Tab_ID="36bee53b-53d7-f4ab-455b-944e07efc1e0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fba4aad6-1a68-9bb4-eba0-257db36d633f")
public static final String FIELDNAME_Line_CalculatedQuantity="fba4aad6-1a68-9bb4-eba0-257db36d633f";

@XendraTrl(Identifier="e6e23146-ea3a-642e-7d0d-c16900500776")
public static String es_PE_COLUMN_QtyCalculated_Name="Cantidad Calculada";

@XendraColumn(AD_Element_ID="ce76ba85-ebc1-f0a9-207f-a429dbebd4c3",ColumnName="QtyCalculated",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6e23146-ea3a-642e-7d0d-c16900500776",
Synchronized="2017-08-05 16:55:06.0")
/** Column name QtyCalculated */
public static final String COLUMNNAME_QtyCalculated = "QtyCalculated";
}
