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
/** Generated Model for C_UOM_Conversion
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_UOM_Conversion extends PO
{
/** Standard Constructor
@param ctx context
@param C_UOM_Conversion_ID id
@param trxName transaction
*/
public X_C_UOM_Conversion (Properties ctx, int C_UOM_Conversion_ID, String trxName)
{
super (ctx, C_UOM_Conversion_ID, trxName);
/** if (C_UOM_Conversion_ID == 0)
{
setC_UOM_Conversion_ID (0);
setC_UOM_ID (0);
setC_UOM_To_ID (0);
setDivideRate (Env.ZERO);
setMultiplyRate (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_UOM_Conversion (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=175 */
public static int Table_ID=MTable.getTable_ID("C_UOM_Conversion");

@XendraTrl(Identifier="b69dd96c-d1ac-bbb3-5129-032ce7568377")
public static String es_PE_TAB_Conversion_Description="Definir conversión de unidad de medida estándar";

@XendraTrl(Identifier="b69dd96c-d1ac-bbb3-5129-032ce7568377")
public static String es_PE_TAB_Conversion_Help="La pestaña de conversión define las tasas para convertir una unidad de medida. El sistema provee algunas conversiones de forma automática (ej. Día; hora; minuto;) si estas conversiones no son definidas en forma explicita aquí. Las conversiones solo pueden ser directas (ej. Si se definen las conversiones A-B y B-C; el sistema no puede calcular la conversión A-C a menos que se defina una tasa de conversión específica para A-C).";

@XendraTrl(Identifier="b69dd96c-d1ac-bbb3-5129-032ce7568377")
public static String es_PE_TAB_Conversion_Name="Conversión";
@XendraTab(Name="Conversion",
Description="Define standard Unit of Measure Conversion",
Help="The Conversion Tab defines the rates for converting a Unit of Measure. The system provides some automatic conversions between units of measures (e.g. minute, hour, day, working day, etc.) if they are not explicitly defined here. Conversions need to be direct (i.e. if you have only a conversion between A-B and B-C, the system cannot convert A-C, you need to define it explicitly).",
AD_Window_ID="4cb6f057-709d-8cf0-3914-7a771cf787e9",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="dac0810d-3304-1039-99f1-d747267bfaa1",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="b69dd96c-d1ac-bbb3-5129-032ce7568377",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Conversion="b69dd96c-d1ac-bbb3-5129-032ce7568377";

@XendraTrl(Identifier="7de5be8f-cb6d-5283-322e-7a5220d4afac")
public static String es_PE_TABLE_C_UOM_Conversion_Name="UM de Conversión";

@XendraTable(Name="UOM Conversion",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Unit of Measure Conversion",
Help="",TableName="C_UOM_Conversion",AccessLevel="6",
AD_Window_ID="4cb6f057-709d-8cf0-3914-7a771cf787e9",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="7de5be8f-cb6d-5283-322e-7a5220d4afac",
Synchronized="2020-03-03 21:37:44.0")
/** TableName=C_UOM_Conversion */
public static final String Table_Name="C_UOM_Conversion";


@XendraIndex(Name="c_uom_conversion_product",Identifier="853cad62-6651-01d1-817d-c989c4c6819f",
Column_Names="c_uom_id, c_uom_to_id, m_product_id",IsUnique="true",
TableIdentifier="853cad62-6651-01d1-817d-c989c4c6819f",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_uom_conversion_product = "853cad62-6651-01d1-817d-c989c4c6819f";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_UOM_Conversion");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("C_UOM_Conversion");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_UOM_Conversion[").append(get_ID()).append("]");
return sb.toString();
}
/** Set UOM Conversion.
@param C_UOM_Conversion_ID Unit of Measure Conversion */
public void setC_UOM_Conversion_ID (int C_UOM_Conversion_ID)
{
if (C_UOM_Conversion_ID < 1) throw new IllegalArgumentException ("C_UOM_Conversion_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_UOM_Conversion_ID, Integer.valueOf(C_UOM_Conversion_ID));
}
/** Get UOM Conversion.
@return Unit of Measure Conversion */
public int getC_UOM_Conversion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_Conversion_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_UOM_Conversion_ID()));
}

@XendraTrl(Identifier="385cf374-34c0-81aa-ddca-12a14495a957")
public static String es_PE_FIELD_Conversion_UOMConversion_Name="UM de Conversión";

@XendraTrl(Identifier="385cf374-34c0-81aa-ddca-12a14495a957")
public static String es_PE_FIELD_Conversion_UOMConversion_Description="Unidad de medida para conversión";

@XendraTrl(Identifier="385cf374-34c0-81aa-ddca-12a14495a957")
public static String es_PE_FIELD_Conversion_UOMConversion_Help="La conversión de UM identifica una unidad de medida única A y Desde; una tasa de conversión y un rango de fechas";

@XendraField(AD_Column_ID="C_UOM_Conversion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b69dd96c-d1ac-bbb3-5129-032ce7568377",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="385cf374-34c0-81aa-ddca-12a14495a957")
public static final String FIELDNAME_Conversion_UOMConversion="385cf374-34c0-81aa-ddca-12a14495a957";
/** Column name C_UOM_Conversion_ID */
public static final String COLUMNNAME_C_UOM_Conversion_ID = "C_UOM_Conversion_ID";
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

@XendraTrl(Identifier="97f6fb89-c039-c11a-9e82-7d288cbca72e")
public static String es_PE_FIELD_Conversion_UOM_Name="UM";

@XendraTrl(Identifier="97f6fb89-c039-c11a-9e82-7d288cbca72e")
public static String es_PE_FIELD_Conversion_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="97f6fb89-c039-c11a-9e82-7d288cbca72e")
public static String es_PE_FIELD_Conversion_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b69dd96c-d1ac-bbb3-5129-032ce7568377",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97f6fb89-c039-c11a-9e82-7d288cbca72e")
public static final String FIELDNAME_Conversion_UOM="97f6fb89-c039-c11a-9e82-7d288cbca72e";

@XendraTrl(Identifier="dac0810d-3304-1039-99f1-d747267bfaa1")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="723d7831-ccf2-1634-fe46-62dbc58e9a8e",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dac0810d-3304-1039-99f1-d747267bfaa1",Synchronized="2019-08-30 22:22:21.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set UoM To.
@param C_UOM_To_ID Target or destination Unit of Measure */
public void setC_UOM_To_ID (int C_UOM_To_ID)
{
if (C_UOM_To_ID < 1) throw new IllegalArgumentException ("C_UOM_To_ID is mandatory.");
set_Value (COLUMNNAME_C_UOM_To_ID, Integer.valueOf(C_UOM_To_ID));
}
/** Get UoM To.
@return Target or destination Unit of Measure */
public int getC_UOM_To_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_To_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5c82d59d-1d04-647f-693c-08fdd6fa1577")
public static String es_PE_FIELD_Conversion_UoMTo_Name="A UM";

@XendraTrl(Identifier="5c82d59d-1d04-647f-693c-08fdd6fa1577")
public static String es_PE_FIELD_Conversion_UoMTo_Description="Unidad de Medida destino u objetivo.";

@XendraTrl(Identifier="5c82d59d-1d04-647f-693c-08fdd6fa1577")
public static String es_PE_FIELD_Conversion_UoMTo_Help="La UM A indica la Unidad de Medida destino para una conversión de un par de UM";

@XendraField(AD_Column_ID="C_UOM_To_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b69dd96c-d1ac-bbb3-5129-032ce7568377",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c82d59d-1d04-647f-693c-08fdd6fa1577")
public static final String FIELDNAME_Conversion_UoMTo="5c82d59d-1d04-647f-693c-08fdd6fa1577";

@XendraTrl(Identifier="fa9345c8-5e79-6d93-5af0-1537f9038fec")
public static String es_PE_COLUMN_C_UOM_To_ID_Name="A UM";

@XendraColumn(AD_Element_ID="777cf299-7f3f-238d-f3e3-c96f11acd9cc",ColumnName="C_UOM_To_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="723d7831-ccf2-1634-fe46-62dbc58e9a8e",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fa9345c8-5e79-6d93-5af0-1537f9038fec",Synchronized="2019-08-30 22:22:21.0")
/** Column name C_UOM_To_ID */
public static final String COLUMNNAME_C_UOM_To_ID = "C_UOM_To_ID";
/** Set Divide Rate.
@param DivideRate To convert Source number to Target number, the Source is divided */
public void setDivideRate (BigDecimal DivideRate)
{
if (DivideRate == null) throw new IllegalArgumentException ("DivideRate is mandatory.");
set_Value (COLUMNNAME_DivideRate, DivideRate);
}
/** Get Divide Rate.
@return To convert Source number to Target number, the Source is divided */
public BigDecimal getDivideRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DivideRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f11638c6-b0c8-b928-d440-5353adf87e60")
public static String es_PE_FIELD_Conversion_DivideRate_Name="Tasa Divisora";

@XendraTrl(Identifier="f11638c6-b0c8-b928-d440-5353adf87e60")
public static String es_PE_FIELD_Conversion_DivideRate_Description="Convierte el número fuente a número destino; el fuente entre el número divisor.";

@XendraTrl(Identifier="f11638c6-b0c8-b928-d440-5353adf87e60")
public static String es_PE_FIELD_Conversion_DivideRate_Help="Para convertir el número fuente a número destino; la fuente es dividida entre la tasa divisora. Si usted introduce una tasa divisora; la tasa multiplicadora será calculada automáticamente;";

@XendraField(AD_Column_ID="DivideRate",IsCentrallyMaintained=true,
AD_Tab_ID="b69dd96c-d1ac-bbb3-5129-032ce7568377",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f11638c6-b0c8-b928-d440-5353adf87e60")
public static final String FIELDNAME_Conversion_DivideRate="f11638c6-b0c8-b928-d440-5353adf87e60";

@XendraTrl(Identifier="8488da09-925f-e04b-816e-e4b1364f05fb")
public static String es_PE_COLUMN_DivideRate_Name="Tasa Divisora";

@XendraColumn(AD_Element_ID="1a9c1cdd-c0a8-f71b-09ec-c1e93b1b7b06",ColumnName="DivideRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutEngine.rate",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8488da09-925f-e04b-816e-e4b1364f05fb",Synchronized="2019-08-30 22:22:21.0")
/** Column name DivideRate */
public static final String COLUMNNAME_DivideRate = "DivideRate";
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
@XendraTrl(Identifier="43fbb4f0-5a23-4924-b422-2ceb6f52d9cc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43fbb4f0-5a23-4924-b422-2ceb6f52d9cc",
Synchronized="2019-08-30 22:22:21.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="d3e549d0-aee0-253f-e41b-caf1bfe42004")
public static String es_PE_FIELD_Conversion_Product_Name="Producto";

@XendraTrl(Identifier="d3e549d0-aee0-253f-e41b-caf1bfe42004")
public static String es_PE_FIELD_Conversion_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="d3e549d0-aee0-253f-e41b-caf1bfe42004")
public static String es_PE_FIELD_Conversion_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b69dd96c-d1ac-bbb3-5129-032ce7568377",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3e549d0-aee0-253f-e41b-caf1bfe42004")
public static final String FIELDNAME_Conversion_Product="d3e549d0-aee0-253f-e41b-caf1bfe42004";

@XendraTrl(Identifier="97632278-8ab1-7d90-3e48-2ea26c44fd9a")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="97632278-8ab1-7d90-3e48-2ea26c44fd9a",Synchronized="2019-08-30 22:22:21.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Multiply Rate.
@param MultiplyRate Rate to multiple the source by to calculate the target. */
public void setMultiplyRate (BigDecimal MultiplyRate)
{
if (MultiplyRate == null) throw new IllegalArgumentException ("MultiplyRate is mandatory.");
set_Value (COLUMNNAME_MultiplyRate, MultiplyRate);
}
/** Get Multiply Rate.
@return Rate to multiple the source by to calculate the target. */
public BigDecimal getMultiplyRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MultiplyRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="203947a0-6ace-5d6f-2c53-27e75353dcc5")
public static String es_PE_FIELD_Conversion_MultiplyRate_Name="Tasa Multiplicadora";

@XendraTrl(Identifier="203947a0-6ace-5d6f-2c53-27e75353dcc5")
public static String es_PE_FIELD_Conversion_MultiplyRate_Description="Tasa por la que se multiplica la fuente para encontrar el objetivo";

@XendraTrl(Identifier="203947a0-6ace-5d6f-2c53-27e75353dcc5")
public static String es_PE_FIELD_Conversion_MultiplyRate_Help="Para convertir un número fuente a un número destino el fuente es multiplicado por la tasa multiplicadora. Si la tasa multiplicadora es introducida; entonces la tasa divisora será calculada automáticamente.";

@XendraField(AD_Column_ID="MultiplyRate",IsCentrallyMaintained=true,
AD_Tab_ID="b69dd96c-d1ac-bbb3-5129-032ce7568377",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="203947a0-6ace-5d6f-2c53-27e75353dcc5")
public static final String FIELDNAME_Conversion_MultiplyRate="203947a0-6ace-5d6f-2c53-27e75353dcc5";

@XendraTrl(Identifier="7546c2cb-6182-e4a5-0870-6382b1093018")
public static String es_PE_COLUMN_MultiplyRate_Name="Tasa Multiplicadora";

@XendraColumn(AD_Element_ID="01f1ea55-fcce-bdc6-b676-8dbecf680a30",ColumnName="MultiplyRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutEngine.rate",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7546c2cb-6182-e4a5-0870-6382b1093018",Synchronized="2019-08-30 22:22:21.0")
/** Column name MultiplyRate */
public static final String COLUMNNAME_MultiplyRate = "MultiplyRate";
}
