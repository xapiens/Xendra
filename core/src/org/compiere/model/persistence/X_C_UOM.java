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
/** Generated Model for C_UOM
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_UOM extends PO
{
/** Standard Constructor
@param ctx context
@param C_UOM_ID id
@param trxName transaction
*/
public X_C_UOM (Properties ctx, int C_UOM_ID, String trxName)
{
super (ctx, C_UOM_ID, trxName);
/** if (C_UOM_ID == 0)
{
setCostingPrecision (0);
setC_UOM_ID (0);
setIsDefault (false);	
// N
setName (null);
setStdPrecision (0);
setX12DE355 (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_UOM (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=146 */
public static int Table_ID=MTable.getTable_ID("C_UOM");

@XendraTrl(Identifier="bf1eeb45-f122-c899-3a47-8707ab33c81f")
public static String es_PE_TAB_UnitOfMeasure_Description="Definir Unidades de Medida";

@XendraTrl(Identifier="bf1eeb45-f122-c899-3a47-8707ab33c81f")
public static String es_PE_TAB_UnitOfMeasure_Name="Unidad de Medida";

@XendraTrl(Identifier="bf1eeb45-f122-c899-3a47-8707ab33c81f")
public static String es_PE_TAB_UnitOfMeasure_Help="La pestaña de Unidad de Medida define una unidad de medida no monetaria.";

@XendraTab(Name="Unit of Measure",Description="Define units of measure",
Help="The Unit of Measure Tab defines a non monetary Unit of Measure.",
AD_Window_ID="4cb6f057-709d-8cf0-3914-7a771cf787e9",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bf1eeb45-f122-c899-3a47-8707ab33c81f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UnitOfMeasure="bf1eeb45-f122-c899-3a47-8707ab33c81f";

@XendraTrl(Identifier="50db7efe-0108-a111-2330-746d0bcd0ea1")
public static String es_PE_TABLE_C_UOM_Name="UM";

@XendraTable(Name="UOM",Description="Unit of Measure",Help="",TableName="C_UOM",AccessLevel="6",
AD_Window_ID="4cb6f057-709d-8cf0-3914-7a771cf787e9",AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="50db7efe-0108-a111-2330-746d0bcd0ea1",
Synchronized="2017-08-16 11:42:32.0")
/** TableName=C_UOM */
public static final String Table_Name="C_UOM";


@XendraIndex(Name="c_uom_x12",Identifier="906797b7-0125-cb6a-486b-d610a402e7b4",
Column_Names="x12de355",IsUnique="false",TableIdentifier="906797b7-0125-cb6a-486b-d610a402e7b4",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_uom_x12 = "906797b7-0125-cb6a-486b-d610a402e7b4";


@XendraIndex(Name="c_uom_name",Identifier="05c4d9c0-ca41-3131-e2c9-9ce180633234",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="05c4d9c0-ca41-3131-e2c9-9ce180633234",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_uom_name = "05c4d9c0-ca41-3131-e2c9-9ce180633234";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_UOM");

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
    Table_ID = MTable.getTable_ID("C_UOM");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_UOM[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Sunat Document Code.
@param CodSunat Sunat Document Code */
public void setCodSunat (String CodSunat)
{
if (CodSunat != null && CodSunat.length() > 2)
{
log.warning("Length > 2 - truncated");
CodSunat = CodSunat.substring(0,1);
}
set_Value (COLUMNNAME_CodSunat, CodSunat);
}
/** Get Sunat Document Code.
@return Sunat Document Code */
public String getCodSunat() 
{
String value = (String)get_Value(COLUMNNAME_CodSunat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6fb6b282-5e8b-e151-4fc4-0900aa9ab9a2")
public static String es_PE_FIELD_UnitOfMeasure_SunatDocumentCode_Name="Código Sunat";

@XendraField(AD_Column_ID="CodSunat",IsCentrallyMaintained=true,
AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fb6b282-5e8b-e151-4fc4-0900aa9ab9a2")
public static final String FIELDNAME_UnitOfMeasure_SunatDocumentCode="6fb6b282-5e8b-e151-4fc4-0900aa9ab9a2";

@XendraTrl(Identifier="862d0f52-c46d-9769-3a7c-1b5575275a13")
public static String es_PE_COLUMN_CodSunat_Name="Código Sunat";

@XendraColumn(AD_Element_ID="84884f14-1f72-b5d2-c38f-d807ef550fd4",ColumnName="CodSunat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="862d0f52-c46d-9769-3a7c-1b5575275a13",
Synchronized="2017-08-05 16:54:29.0")
/** Column name CodSunat */
public static final String COLUMNNAME_CodSunat = "CodSunat";
/** Set Costing Precision.
@param CostingPrecision Rounding used costing calculations */
public void setCostingPrecision (int CostingPrecision)
{
set_Value (COLUMNNAME_CostingPrecision, Integer.valueOf(CostingPrecision));
}
/** Get Costing Precision.
@return Rounding used costing calculations */
public int getCostingPrecision() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CostingPrecision);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ebbfe6d1-53a4-9376-c520-1e5e6e939ab6")
public static String es_PE_FIELD_UnitOfMeasure_CostingPrecision_Description="Redondeo usado en el cálculo de costos";

@XendraTrl(Identifier="ebbfe6d1-53a4-9376-c520-1e5e6e939ab6")
public static String es_PE_FIELD_UnitOfMeasure_CostingPrecision_Help="La precisión del costeo define el número de lugares decimales en que los totales serán redondeados cuando se ejecuten los cálculos de costeo.";

@XendraTrl(Identifier="ebbfe6d1-53a4-9376-c520-1e5e6e939ab6")
public static String es_PE_FIELD_UnitOfMeasure_CostingPrecision_Name="Redondeo del Costo";

@XendraField(AD_Column_ID="CostingPrecision",IsCentrallyMaintained=true,
AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebbfe6d1-53a4-9376-c520-1e5e6e939ab6")
public static final String FIELDNAME_UnitOfMeasure_CostingPrecision="ebbfe6d1-53a4-9376-c520-1e5e6e939ab6";

@XendraTrl(Identifier="96a57214-c9d1-b5b6-1252-d6aeb8d01773")
public static String es_PE_COLUMN_CostingPrecision_Name="Redondeo del Costo";

@XendraColumn(AD_Element_ID="027f70ef-7a81-55fc-9e9b-84193d267732",ColumnName="CostingPrecision",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96a57214-c9d1-b5b6-1252-d6aeb8d01773",
Synchronized="2017-08-05 16:54:29.0")
/** Column name CostingPrecision */
public static final String COLUMNNAME_CostingPrecision = "CostingPrecision";
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

@XendraTrl(Identifier="66ca6164-296a-f4bf-79b9-72d7256b7319")
public static String es_PE_FIELD_UnitOfMeasure_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="66ca6164-296a-f4bf-79b9-72d7256b7319")
public static String es_PE_FIELD_UnitOfMeasure_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="66ca6164-296a-f4bf-79b9-72d7256b7319")
public static String es_PE_FIELD_UnitOfMeasure_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="66ca6164-296a-f4bf-79b9-72d7256b7319")
public static final String FIELDNAME_UnitOfMeasure_UOM="66ca6164-296a-f4bf-79b9-72d7256b7319";
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="fae091b2-84e0-b85e-4a78-3b2d26854dae")
public static String es_PE_FIELD_UnitOfMeasure_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="fae091b2-84e0-b85e-4a78-3b2d26854dae")
public static String es_PE_FIELD_UnitOfMeasure_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="fae091b2-84e0-b85e-4a78-3b2d26854dae")
public static String es_PE_FIELD_UnitOfMeasure_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fae091b2-84e0-b85e-4a78-3b2d26854dae")
public static final String FIELDNAME_UnitOfMeasure_Description="fae091b2-84e0-b85e-4a78-3b2d26854dae";

@XendraTrl(Identifier="d3c25754-70a2-ec3b-f32e-acf5688ef7b3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3c25754-70a2-ec3b-f32e-acf5688ef7b3",
Synchronized="2017-08-05 16:54:29.0")
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
@XendraTrl(Identifier="c07ce443-d3ef-4dca-a273-b480fdf51c8e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c07ce443-d3ef-4dca-a273-b480fdf51c8e",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bb85897c-ca70-4d82-daff-7b2f7efbf3d3")
public static String es_PE_FIELD_UnitOfMeasure_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="bb85897c-ca70-4d82-daff-7b2f7efbf3d3")
public static String es_PE_FIELD_UnitOfMeasure_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="bb85897c-ca70-4d82-daff-7b2f7efbf3d3")
public static String es_PE_FIELD_UnitOfMeasure_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb85897c-ca70-4d82-daff-7b2f7efbf3d3")
public static final String FIELDNAME_UnitOfMeasure_Default="bb85897c-ca70-4d82-daff-7b2f7efbf3d3";

@XendraTrl(Identifier="0b0129b5-2731-e6b2-792b-904c81520b7b")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b0129b5-2731-e6b2-792b-904c81520b7b",
Synchronized="2017-08-05 16:54:29.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set IsSplit.
@param IsSplit IsSplit */
public void setIsSplit (boolean IsSplit)
{
set_Value (COLUMNNAME_IsSplit, Boolean.valueOf(IsSplit));
}
/** Get IsSplit.
@return IsSplit */
public boolean isSplit() 
{
Object oo = get_Value(COLUMNNAME_IsSplit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5d905d3f-3faf-46eb-9ce7-bd74159b7672")
public static String es_PE_COLUMN_IsSplit_Name="issplit";

@XendraColumn(AD_Element_ID="2cb01d8f-ace6-4394-b9d0-ba55e2579f8e",ColumnName="IsSplit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d905d3f-3faf-46eb-9ce7-bd74159b7672",
Synchronized="2014-03-27 21:01:05.0")
/** Column name IsSplit */
public static final String COLUMNNAME_IsSplit = "IsSplit";
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

@XendraTrl(Identifier="9c930626-3ca6-3186-4f04-a6728d015e99")
public static String es_PE_FIELD_UnitOfMeasure_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9c930626-3ca6-3186-4f04-a6728d015e99")
public static String es_PE_FIELD_UnitOfMeasure_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="9c930626-3ca6-3186-4f04-a6728d015e99")
public static String es_PE_FIELD_UnitOfMeasure_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9c930626-3ca6-3186-4f04-a6728d015e99")
public static final String FIELDNAME_UnitOfMeasure_Name="9c930626-3ca6-3186-4f04-a6728d015e99";

@XendraTrl(Identifier="f1fea666-28a6-73e4-5191-646b85ebd441")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1fea666-28a6-73e4-5191-646b85ebd441",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Standard Precision.
@param StdPrecision Rule for rounding  calculated amounts */
public void setStdPrecision (int StdPrecision)
{
set_Value (COLUMNNAME_StdPrecision, Integer.valueOf(StdPrecision));
}
/** Get Standard Precision.
@return Rule for rounding  calculated amounts */
public int getStdPrecision() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_StdPrecision);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d58b2db7-2fc7-980d-55e0-1c111dbbe83d")
public static String es_PE_FIELD_UnitOfMeasure_StandardPrecision_Description="Regla de redondeo para los totales calculados";

@XendraTrl(Identifier="d58b2db7-2fc7-980d-55e0-1c111dbbe83d")
public static String es_PE_FIELD_UnitOfMeasure_StandardPrecision_Help="La precisión estándar define el número de lugares decimales que serán redondeados los totales para transacciones contables y documentos";

@XendraTrl(Identifier="d58b2db7-2fc7-980d-55e0-1c111dbbe83d")
public static String es_PE_FIELD_UnitOfMeasure_StandardPrecision_Name="Redondeo Estándar";

@XendraField(AD_Column_ID="StdPrecision",IsCentrallyMaintained=true,
AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d58b2db7-2fc7-980d-55e0-1c111dbbe83d")
public static final String FIELDNAME_UnitOfMeasure_StandardPrecision="d58b2db7-2fc7-980d-55e0-1c111dbbe83d";

@XendraTrl(Identifier="74cfbec6-a135-bdc9-7ee9-e45901dd1eeb")
public static String es_PE_COLUMN_StdPrecision_Name="Redondeo Estándar";

@XendraColumn(AD_Element_ID="e68597be-fc06-38e3-84d4-408355922e9d",ColumnName="StdPrecision",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74cfbec6-a135-bdc9-7ee9-e45901dd1eeb",
Synchronized="2017-08-05 16:54:29.0")
/** Column name StdPrecision */
public static final String COLUMNNAME_StdPrecision = "StdPrecision";
/** Set Symbol.
@param UOMSymbol Symbol for a Unit of Measure */
public void setUOMSymbol (String UOMSymbol)
{
if (UOMSymbol != null && UOMSymbol.length() > 10)
{
log.warning("Length > 10 - truncated");
UOMSymbol = UOMSymbol.substring(0,9);
}
set_Value (COLUMNNAME_UOMSymbol, UOMSymbol);
}
/** Get Symbol.
@return Symbol for a Unit of Measure */
public String getUOMSymbol() 
{
String value = (String)get_Value(COLUMNNAME_UOMSymbol);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6131015f-295a-1616-9cd9-c9ae3833b0a6")
public static String es_PE_FIELD_UnitOfMeasure_Symbol_Description="Símbolo para una unidad de medida";

@XendraTrl(Identifier="6131015f-295a-1616-9cd9-c9ae3833b0a6")
public static String es_PE_FIELD_UnitOfMeasure_Symbol_Help="El símbolo identifica el simbolo ha ser desplegado e impreso para una unidad de medida";

@XendraTrl(Identifier="6131015f-295a-1616-9cd9-c9ae3833b0a6")
public static String es_PE_FIELD_UnitOfMeasure_Symbol_Name="Símbolo";

@XendraField(AD_Column_ID="UOMSymbol",IsCentrallyMaintained=true,
AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6131015f-295a-1616-9cd9-c9ae3833b0a6")
public static final String FIELDNAME_UnitOfMeasure_Symbol="6131015f-295a-1616-9cd9-c9ae3833b0a6";

@XendraTrl(Identifier="8390c7a2-12ad-3517-adfe-c4e168313516")
public static String es_PE_COLUMN_UOMSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8390c7a2-12ad-3517-adfe-c4e168313516",
Synchronized="2017-08-05 16:54:30.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";
/** Set UOM Code.
@param X12DE355 UOM EDI X12 Code */
public void setX12DE355 (String X12DE355)
{
if (X12DE355 == null) throw new IllegalArgumentException ("X12DE355 is mandatory.");
if (X12DE355.length() > 4)
{
log.warning("Length > 4 - truncated");
X12DE355 = X12DE355.substring(0,3);
}
set_Value (COLUMNNAME_X12DE355, X12DE355);
}
/** Get UOM Code.
@return UOM EDI X12 Code */
public String getX12DE355() 
{
String value = (String)get_Value(COLUMNNAME_X12DE355);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="17a68198-f53e-1e43-0363-2541dec252b8")
public static String es_PE_FIELD_UnitOfMeasure_UOMCode_Description="Código EDI";

@XendraTrl(Identifier="17a68198-f53e-1e43-0363-2541dec252b8")
public static String es_PE_FIELD_UnitOfMeasure_UOMCode_Help="El código EDI indica el Elemento de Dato del Código EDI X!12 355 (Unidad ó Base para Medida)";

@XendraTrl(Identifier="17a68198-f53e-1e43-0363-2541dec252b8")
public static String es_PE_FIELD_UnitOfMeasure_UOMCode_Name="Código EDI";

@XendraField(AD_Column_ID="X12DE355",IsCentrallyMaintained=true,
AD_Tab_ID="bf1eeb45-f122-c899-3a47-8707ab33c81f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17a68198-f53e-1e43-0363-2541dec252b8")
public static final String FIELDNAME_UnitOfMeasure_UOMCode="17a68198-f53e-1e43-0363-2541dec252b8";

@XendraTrl(Identifier="f7d7c0ce-530b-7fc8-222e-91f40881c147")
public static String es_PE_COLUMN_X12DE355_Name="Código EDI";

@XendraColumn(AD_Element_ID="f1c4cca9-24fe-9fb1-505a-36bc2f9545f1",ColumnName="X12DE355",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7d7c0ce-530b-7fc8-222e-91f40881c147",
Synchronized="2017-08-05 16:54:30.0")
/** Column name X12DE355 */
public static final String COLUMNNAME_X12DE355 = "X12DE355";
}
