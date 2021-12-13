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
/** Generated Model for AD_ImpFormat_Row
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ImpFormat_Row extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ImpFormat_Row_ID id
@param trxName transaction
*/
public X_AD_ImpFormat_Row (Properties ctx, int AD_ImpFormat_Row_ID, String trxName)
{
super (ctx, AD_ImpFormat_Row_ID, trxName);
/** if (AD_ImpFormat_Row_ID == 0)
{
setAD_Column_ID (0);
setAD_ImpFormat_ID (0);
setAD_ImpFormat_Row_ID (0);
setDataType (null);
setDecimalPoint (null);	
// .
setDivideBy100 (false);	
// N
setName (null);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_ImpFormat_Row WHERE AD_ImpFormat_ID=@AD_ImpFormat_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ImpFormat_Row (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=382 */
public static int Table_ID=MTable.getTable_ID("AD_ImpFormat_Row");

@XendraTrl(Identifier="e0b2d6ba-e8a2-2395-2b40-d97178c51d72")
public static String es_PE_TAB_FormatField_Description="Mantener Campos de Formato";

@XendraTrl(Identifier="e0b2d6ba-e8a2-2395-2b40-d97178c51d72")
public static String es_PE_TAB_FormatField_Help="Define los Campos individuales basado en la definición de la tabla. Asegúrese que una constante tenga el tipo de dato SQL correcto. (ej. Si es una cadena de texto; esta debe estar entre apóstrofes como `estos`).  <p> Traz del Producto (Para los detalles vea la documentación): <pre> H_Item => Valor H_ItemDesc => Nombre / Descripción; H_ItemDefn => Help H_Item Tipo => Categoria de Producto H_PartnrID => Valor de Socios de Negocio H_Commodity1 => Vendor Product No H_Commodity2 => SKU H_ItemClass => Clasificación (A;B;C..) V_OperAmt_T_Cur => Currency V_OperAmt_T => Precio  </pre>";

@XendraTrl(Identifier="e0b2d6ba-e8a2-2395-2b40-d97178c51d72")
public static String es_PE_TAB_FormatField_Name="Campo de Formato";
@XendraTab(Name="Format Field",
Description="Maintain Format Fields",
Help="Define the individual field based on the table definition.  Please note that you have to make sure that a Constant has the correct  SQL data type (i.e. if it is a 'string', you need to enclose it like 'this'). <p>Product mapping (for details see documentation): <pre> H_Item => Value H_ItemDesc => Name / Description H_ItemDefn => Help H_ItemType => ProductCategory H_PartnrID => Value of Business Partner H_Commodity1 => Vendor Product No H_Commodity2 => SKU H_ItemClass => Classification (A,B,C..) V_OperAmt_T_Cur => Currency V_OperAmt_T => Price  </pre>",
AD_Window_ID="68101bd1-27c7-50e5-b950-c55d071f1f43",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FormatField="e0b2d6ba-e8a2-2395-2b40-d97178c51d72";

@XendraTrl(Identifier="1e9d16ba-b5b3-0752-0fbc-855aec614b26")
public static String es_PE_TABLE_AD_ImpFormat_Row_Name="Campos del Formato";

@XendraTable(Name="Format Field",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_ImpFormat_Row",AccessLevel="6",AD_Window_ID="68101bd1-27c7-50e5-b950-c55d071f1f43",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="1e9d16ba-b5b3-0752-0fbc-855aec614b26",Synchronized="2020-03-03 21:35:04.0")
/** TableName=AD_ImpFormat_Row */
public static final String Table_Name="AD_ImpFormat_Row";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ImpFormat_Row");

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
    Table_ID = MTable.getTable_ID("AD_ImpFormat_Row");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ImpFormat_Row[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1cd6e0f5-ee40-57c7-52c5-d1f4aef2ea20")
public static String es_PE_FIELD_FormatField_Column_Name="Columna";

@XendraTrl(Identifier="1cd6e0f5-ee40-57c7-52c5-d1f4aef2ea20")
public static String es_PE_FIELD_FormatField_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="1cd6e0f5-ee40-57c7-52c5-d1f4aef2ea20")
public static String es_PE_FIELD_FormatField_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cd6e0f5-ee40-57c7-52c5-d1f4aef2ea20")
public static final String FIELDNAME_FormatField_Column="1cd6e0f5-ee40-57c7-52c5-d1f4aef2ea20";

@XendraTrl(Identifier="41761ffa-f0bb-b9c8-be73-02331efcccb0")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="d61938b8-7e78-e16a-6382-575651a6421b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="41761ffa-f0bb-b9c8-be73-02331efcccb0",Synchronized="2019-08-30 22:20:23.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Import Format.
@param AD_ImpFormat_ID Import Format */
public void setAD_ImpFormat_ID (int AD_ImpFormat_ID)
{
if (AD_ImpFormat_ID < 1) throw new IllegalArgumentException ("AD_ImpFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ImpFormat_ID, Integer.valueOf(AD_ImpFormat_ID));
}
/** Get Import Format.
@return Import Format */
public int getAD_ImpFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ImpFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="03aefbf4-2b7d-99d8-c0ba-98868f0c9023")
public static String es_PE_FIELD_FormatField_ImportFormat_Name="Formato de Importación";

@XendraField(AD_Column_ID="AD_ImpFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03aefbf4-2b7d-99d8-c0ba-98868f0c9023")
public static final String FIELDNAME_FormatField_ImportFormat="03aefbf4-2b7d-99d8-c0ba-98868f0c9023";

@XendraTrl(Identifier="e01b5416-b6ed-4e18-1064-a8f2628c8beb")
public static String es_PE_COLUMN_AD_ImpFormat_ID_Name="Formato de Importación";

@XendraColumn(AD_Element_ID="a6a0c6a0-79cd-16c4-844e-b58899180c08",ColumnName="AD_ImpFormat_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e01b5416-b6ed-4e18-1064-a8f2628c8beb",
Synchronized="2019-08-30 22:20:23.0")
/** Column name AD_ImpFormat_ID */
public static final String COLUMNNAME_AD_ImpFormat_ID = "AD_ImpFormat_ID";
/** Set Format Field.
@param AD_ImpFormat_Row_ID Format Field */
public void setAD_ImpFormat_Row_ID (int AD_ImpFormat_Row_ID)
{
if (AD_ImpFormat_Row_ID < 1) throw new IllegalArgumentException ("AD_ImpFormat_Row_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ImpFormat_Row_ID, Integer.valueOf(AD_ImpFormat_Row_ID));
}
/** Get Format Field.
@return Format Field */
public int getAD_ImpFormat_Row_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ImpFormat_Row_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="10160ee1-b91e-f424-5b66-4ec8684f6293")
public static String es_PE_FIELD_FormatField_FormatField_Name="Campos del Formato";

@XendraField(AD_Column_ID="AD_ImpFormat_Row_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10160ee1-b91e-f424-5b66-4ec8684f6293")
public static final String FIELDNAME_FormatField_FormatField="10160ee1-b91e-f424-5b66-4ec8684f6293";
/** Column name AD_ImpFormat_Row_ID */
public static final String COLUMNNAME_AD_ImpFormat_Row_ID = "AD_ImpFormat_Row_ID";
/** Set Callout.
@param Callout Fully qualified class NAMEs and method - separated by semicolons */
public void setCallout (String Callout)
{
if (Callout != null && Callout.length() > 60)
{
log.warning("Length > 60 - truncated");
Callout = Callout.substring(0,59);
}
set_Value (COLUMNNAME_Callout, Callout);
}
/** Get Callout.
@return Fully qualified class NAMEs and method - separated by semicolons */
public String getCallout() 
{
String value = (String)get_Value(COLUMNNAME_Callout);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3976afcc-3e5e-e1e1-9dfd-7c41d4847d65")
public static String es_PE_FIELD_FormatField_Callout_Name="Llamada";

@XendraTrl(Identifier="3976afcc-3e5e-e1e1-9dfd-7c41d4847d65")
public static String es_PE_FIELD_FormatField_Callout_Description="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then function name.";

@XendraTrl(Identifier="3976afcc-3e5e-e1e1-9dfd-7c41d4847d65")
public static String es_PE_FIELD_FormatField_Callout_Help="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then Function Name";

@XendraField(AD_Column_ID="Callout",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3976afcc-3e5e-e1e1-9dfd-7c41d4847d65")
public static final String FIELDNAME_FormatField_Callout="3976afcc-3e5e-e1e1-9dfd-7c41d4847d65";

@XendraTrl(Identifier="9be51318-4dd3-913f-de9e-5344fa8d6466")
public static String es_PE_COLUMN_Callout_Name="Llamada";

@XendraColumn(AD_Element_ID="1041ce74-aa5e-c0d7-a1c1-ffb0202d26db",ColumnName="Callout",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9be51318-4dd3-913f-de9e-5344fa8d6466",
Synchronized="2019-08-30 22:20:23.0")
/** Column name Callout */
public static final String COLUMNNAME_Callout = "Callout";
/** Set Constant Value.
@param ConstantValue Constant value */
public void setConstantValue (String ConstantValue)
{
if (ConstantValue != null && ConstantValue.length() > 60)
{
log.warning("Length > 60 - truncated");
ConstantValue = ConstantValue.substring(0,59);
}
set_Value (COLUMNNAME_ConstantValue, ConstantValue);
}
/** Get Constant Value.
@return Constant value */
public String getConstantValue() 
{
String value = (String)get_Value(COLUMNNAME_ConstantValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0c96b1ff-b70c-5cf4-2328-843225aa837d")
public static String es_PE_FIELD_FormatField_ConstantValue_Name="Valor Constante";

@XendraField(AD_Column_ID="ConstantValue",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DataType@=C",DisplayLength=60,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c96b1ff-b70c-5cf4-2328-843225aa837d")
public static final String FIELDNAME_FormatField_ConstantValue="0c96b1ff-b70c-5cf4-2328-843225aa837d";

@XendraTrl(Identifier="b514f3bf-8777-bcf0-5156-1fc62a817863")
public static String es_PE_COLUMN_ConstantValue_Name="Valor Constante";

@XendraColumn(AD_Element_ID="f6f3ff1d-eb61-cfbb-7985-7438714289a2",ColumnName="ConstantValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b514f3bf-8777-bcf0-5156-1fc62a817863",
Synchronized="2019-08-30 22:20:23.0")
/** Column name ConstantValue */
public static final String COLUMNNAME_ConstantValue = "ConstantValue";
/** Set Data Format.
@param DataFormat Format String in Java Notation, e.g. ddMMyy */
public void setDataFormat (String DataFormat)
{
if (DataFormat != null && DataFormat.length() > 20)
{
log.warning("Length > 20 - truncated");
DataFormat = DataFormat.substring(0,19);
}
set_Value (COLUMNNAME_DataFormat, DataFormat);
}
/** Get Data Format.
@return Format String in Java Notation, e.g. ddMMyy */
public String getDataFormat() 
{
String value = (String)get_Value(COLUMNNAME_DataFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="36034e00-03fc-01da-b389-ac8fc67cb3c8")
public static String es_PE_FIELD_FormatField_DataFormat_Name="Formato de Datos";

@XendraTrl(Identifier="36034e00-03fc-01da-b389-ac8fc67cb3c8")
public static String es_PE_FIELD_FormatField_DataFormat_Description="Formato de cadena en notación Java; Ej. ddMMyy";

@XendraTrl(Identifier="36034e00-03fc-01da-b389-ac8fc67cb3c8")
public static String es_PE_FIELD_FormatField_DataFormat_Help="El formato fecha indica como las fechas son definidas en el registro a ser importado. Debe estar en notación Java";

@XendraField(AD_Column_ID="DataFormat",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DataType@=D",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36034e00-03fc-01da-b389-ac8fc67cb3c8")
public static final String FIELDNAME_FormatField_DataFormat="36034e00-03fc-01da-b389-ac8fc67cb3c8";

@XendraTrl(Identifier="f08c1010-8da3-94e7-1dd2-1fe21ac6d601")
public static String es_PE_COLUMN_DataFormat_Name="Formato de Datos";

@XendraColumn(AD_Element_ID="6cb52d89-636c-1a67-5c69-96b5775b6198",ColumnName="DataFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f08c1010-8da3-94e7-1dd2-1fe21ac6d601",
Synchronized="2019-08-30 22:20:23.0")
/** Column name DataFormat */
public static final String COLUMNNAME_DataFormat = "DataFormat";
/** Set Data Type.
@param DataType Type of data */
public void setDataType (String DataType)
{
if (DataType.length() > 1)
{
log.warning("Length > 1 - truncated");
DataType = DataType.substring(0,0);
}
set_Value (COLUMNNAME_DataType, DataType);
}
/** Get Data Type.
@return Type of data */
public String getDataType() 
{
return (String)get_Value(COLUMNNAME_DataType);
}

@XendraTrl(Identifier="d646cec8-fe2c-b8f1-1067-97836e69c3d9")
public static String es_PE_FIELD_FormatField_DataType_Name="Tipo de Datos";

@XendraTrl(Identifier="d646cec8-fe2c-b8f1-1067-97836e69c3d9")
public static String es_PE_FIELD_FormatField_DataType_Description="Tipo de datos";

@XendraField(AD_Column_ID="DataType",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d646cec8-fe2c-b8f1-1067-97836e69c3d9")
public static final String FIELDNAME_FormatField_DataType="d646cec8-fe2c-b8f1-1067-97836e69c3d9";

@XendraTrl(Identifier="5e4710ca-20ae-fbae-882e-30986164508b")
public static String es_PE_COLUMN_DataType_Name="Tipo de Datos";

@XendraColumn(AD_Element_ID="8dc3b1f4-318c-ea06-6b96-a691ad208b48",ColumnName="DataType",
AD_Reference_ID=17,AD_Reference_Value_ID="581876b5-c8de-c960-e396-a6cb7c8d52a1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5e4710ca-20ae-fbae-882e-30986164508b",Synchronized="2019-08-30 22:20:23.0")
/** Column name DataType */
public static final String COLUMNNAME_DataType = "DataType";
/** Set Decimal Point.
@param DecimalPoint Decimal Point in the data file - if any */
public void setDecimalPoint (String DecimalPoint)
{
if (DecimalPoint == null) throw new IllegalArgumentException ("DecimalPoint is mandatory.");
if (DecimalPoint.length() > 1)
{
log.warning("Length > 1 - truncated");
DecimalPoint = DecimalPoint.substring(0,0);
}
set_Value (COLUMNNAME_DecimalPoint, DecimalPoint);
}
/** Get Decimal Point.
@return Decimal Point in the data file - if any */
public String getDecimalPoint() 
{
String value = (String)get_Value(COLUMNNAME_DecimalPoint);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4dfba6fd-969f-44ac-86c7-2cbbc1047237")
public static String es_PE_FIELD_FormatField_DecimalPoint_Name="Punto Decimal";

@XendraTrl(Identifier="4dfba6fd-969f-44ac-86c7-2cbbc1047237")
public static String es_PE_FIELD_FormatField_DecimalPoint_Description="Punto decimal en el archivo de datos - si hay alguno";

@XendraField(AD_Column_ID="DecimalPoint",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DataType@=N",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4dfba6fd-969f-44ac-86c7-2cbbc1047237")
public static final String FIELDNAME_FormatField_DecimalPoint="4dfba6fd-969f-44ac-86c7-2cbbc1047237";

@XendraTrl(Identifier="7a64e638-7aba-4b8e-06cd-55c42225e57c")
public static String es_PE_COLUMN_DecimalPoint_Name="Punto Decimal";

@XendraColumn(AD_Element_ID="feb114ab-1323-cd9e-1d63-cdb430735c99",ColumnName="DecimalPoint",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a64e638-7aba-4b8e-06cd-55c42225e57c",
Synchronized="2019-08-30 22:20:23.0")
/** Column name DecimalPoint */
public static final String COLUMNNAME_DecimalPoint = "DecimalPoint";
/** Set Divide by 100.
@param DivideBy100 Divide number by 100 to get correct amount */
public void setDivideBy100 (boolean DivideBy100)
{
set_Value (COLUMNNAME_DivideBy100, Boolean.valueOf(DivideBy100));
}
/** Get Divide by 100.
@return Divide number by 100 to get correct amount */
public boolean isDivideBy100() 
{
Object oo = get_Value(COLUMNNAME_DivideBy100);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bff53771-4c53-1ae7-98f4-01fa9a3ed439")
public static String es_PE_FIELD_FormatField_DivideBy10_Name="Dividir entre 100";

@XendraTrl(Identifier="bff53771-4c53-1ae7-98f4-01fa9a3ed439")
public static String es_PE_FIELD_FormatField_DivideBy10_Description="Divide el número entre 100 para obtener el total correcto";

@XendraField(AD_Column_ID="DivideBy100",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DataType@=N",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bff53771-4c53-1ae7-98f4-01fa9a3ed439")
public static final String FIELDNAME_FormatField_DivideBy10="bff53771-4c53-1ae7-98f4-01fa9a3ed439";

@XendraTrl(Identifier="fd27d57d-ec3a-7882-44c9-2cd9be9a431e")
public static String es_PE_COLUMN_DivideBy100_Name="Dividir entre 100";

@XendraColumn(AD_Element_ID="9a5a9fac-dd38-da5f-eb0b-0ceef221af43",ColumnName="DivideBy100",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd27d57d-ec3a-7882-44c9-2cd9be9a431e",
Synchronized="2019-08-30 22:20:23.0")
/** Column name DivideBy100 */
public static final String COLUMNNAME_DivideBy100 = "DivideBy100";
/** Set End No.
@param EndNo End No */
public void setEndNo (int EndNo)
{
set_Value (COLUMNNAME_EndNo, Integer.valueOf(EndNo));
}
/** Get End No.
@return End No */
public int getEndNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_EndNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7ea9c28d-84c2-47f7-3c1c-b3f82089d8a6")
public static String es_PE_FIELD_FormatField_EndNo_Name="No. Final";

@XendraField(AD_Column_ID="EndNo",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DataType@!C & @FormatType@=F",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7ea9c28d-84c2-47f7-3c1c-b3f82089d8a6")
public static final String FIELDNAME_FormatField_EndNo="7ea9c28d-84c2-47f7-3c1c-b3f82089d8a6";

@XendraTrl(Identifier="38165176-d8b9-039c-6eca-ec1fa432fc2f")
public static String es_PE_COLUMN_EndNo_Name="No. Final";

@XendraColumn(AD_Element_ID="0a96a9b8-2c4b-3c6f-fe50-9a77904698b1",ColumnName="EndNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38165176-d8b9-039c-6eca-ec1fa432fc2f",
Synchronized="2019-08-30 22:20:23.0")
/** Column name EndNo */
public static final String COLUMNNAME_EndNo = "EndNo";
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
@XendraTrl(Identifier="3167ed32-f55c-491d-bd36-2e300b4f86f6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3167ed32-f55c-491d-bd36-2e300b4f86f6",
Synchronized="2019-08-30 22:20:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="0f0db6ec-9600-196a-15fe-7569a8c76994")
public static String es_PE_FIELD_FormatField_Name_Name="Nombre";

@XendraTrl(Identifier="0f0db6ec-9600-196a-15fe-7569a8c76994")
public static String es_PE_FIELD_FormatField_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="0f0db6ec-9600-196a-15fe-7569a8c76994")
public static String es_PE_FIELD_FormatField_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f0db6ec-9600-196a-15fe-7569a8c76994")
public static final String FIELDNAME_FormatField_Name="0f0db6ec-9600-196a-15fe-7569a8c76994";

@XendraTrl(Identifier="bb5e7061-e5e1-ce19-4a99-e449cb525548")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb5e7061-e5e1-ce19-4a99-e449cb525548",
Synchronized="2019-08-30 22:20:23.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Script.
@param Script Dynamic Java Language Script to calculate result */
public void setScript (String Script)
{
set_Value (COLUMNNAME_Script, Script);
}
/** Get Script.
@return Dynamic Java Language Script to calculate result */
public String getScript() 
{
String value = (String)get_Value(COLUMNNAME_Script);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7846dd62-fcf4-4080-b6d0-b8e6cefdc9b0")
public static String es_PE_FIELD_FormatField_Script_Name="Escritura";

@XendraTrl(Identifier="7846dd62-fcf4-4080-b6d0-b8e6cefdc9b0")
public static String es_PE_FIELD_FormatField_Script_Description="Escritura de lenguaje Java para calcular resultados";

@XendraTrl(Identifier="7846dd62-fcf4-4080-b6d0-b8e6cefdc9b0")
public static String es_PE_FIELD_FormatField_Script_Help="Usar constructores del lenguaje Java para definir el resultado del calculo";

@XendraField(AD_Column_ID="Script",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7846dd62-fcf4-4080-b6d0-b8e6cefdc9b0")
public static final String FIELDNAME_FormatField_Script="7846dd62-fcf4-4080-b6d0-b8e6cefdc9b0";

@XendraTrl(Identifier="919bbe93-c434-0580-6ace-afba7ba2ed9a")
public static String es_PE_COLUMN_Script_Name="Escritura";

@XendraColumn(AD_Element_ID="9cf04103-dbd5-c841-c159-641242e2c557",ColumnName="Script",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="919bbe93-c434-0580-6ace-afba7ba2ed9a",
Synchronized="2019-08-30 22:20:23.0")
/** Column name Script */
public static final String COLUMNNAME_Script = "Script";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa472151-1cde-429b-597d-60e643cb4935")
public static String es_PE_FIELD_FormatField_Sequence_Name="Secuencia";

@XendraTrl(Identifier="fa472151-1cde-429b-597d-60e643cb4935")
public static String es_PE_FIELD_FormatField_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="fa472151-1cde-429b-597d-60e643cb4935")
public static String es_PE_FIELD_FormatField_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa472151-1cde-429b-597d-60e643cb4935")
public static final String FIELDNAME_FormatField_Sequence="fa472151-1cde-429b-597d-60e643cb4935";

@XendraTrl(Identifier="e008a0b5-dcc1-aa3f-0f5a-76e92caf1ef8")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_ImpFormat_Row WHERE AD_ImpFormat_ID=@AD_ImpFormat_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e008a0b5-dcc1-aa3f-0f5a-76e92caf1ef8",
Synchronized="2019-08-30 22:20:23.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Start No.
@param StartNo Starting number/position */
public void setStartNo (int StartNo)
{
set_Value (COLUMNNAME_StartNo, Integer.valueOf(StartNo));
}
/** Get Start No.
@return Starting number/position */
public int getStartNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_StartNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1d70b5d3-95da-75da-e9de-7a324a98eb29")
public static String es_PE_FIELD_FormatField_StartNo_Name="No. de Inicio";

@XendraTrl(Identifier="1d70b5d3-95da-75da-e9de-7a324a98eb29")
public static String es_PE_FIELD_FormatField_StartNo_Description="Número de inicio / posición";

@XendraTrl(Identifier="1d70b5d3-95da-75da-e9de-7a324a98eb29")
public static String es_PE_FIELD_FormatField_StartNo_Help="El Número de Inicio indica el número inicial del documento ó posición";

@XendraField(AD_Column_ID="StartNo",IsCentrallyMaintained=true,
AD_Tab_ID="e0b2d6ba-e8a2-2395-2b40-d97178c51d72",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DataType@!C",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d70b5d3-95da-75da-e9de-7a324a98eb29")
public static final String FIELDNAME_FormatField_StartNo="1d70b5d3-95da-75da-e9de-7a324a98eb29";

@XendraTrl(Identifier="9c5d13b2-d517-b34b-815e-3ef8850a7ff1")
public static String es_PE_COLUMN_StartNo_Name="No. de Inicio";

@XendraColumn(AD_Element_ID="88d592be-43c4-2902-25a0-56584fd9c3f9",ColumnName="StartNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c5d13b2-d517-b34b-815e-3ef8850a7ff1",
Synchronized="2019-08-30 22:20:23.0")
/** Column name StartNo */
public static final String COLUMNNAME_StartNo = "StartNo";
}
