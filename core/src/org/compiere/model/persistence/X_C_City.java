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
/** Generated Model for C_City
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_City extends PO
{
/** Standard Constructor
@param ctx context
@param C_City_ID id
@param trxName transaction
*/
public X_C_City (Properties ctx, int C_City_ID, String trxName)
{
super (ctx, C_City_ID, trxName);
/** if (C_City_ID == 0)
{
setC_City_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_City (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=186 */
public static int Table_ID=MTable.getTable_ID("C_City");

@XendraTrl(Identifier="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee")
public static String es_PE_TAB_City_Description="Definir Ciudades";

@XendraTrl(Identifier="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee")
public static String es_PE_TAB_City_Help="La pestaña Ciudades define ciudades dentro de un país ó región.";

@XendraTrl(Identifier="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee")
public static String es_PE_TAB_City_Name="Ciudad";
@XendraTab(Name="City",
Description="Define Cities",
Help="The Cities Tab defines Cities within a Country or Region.  Cities entered here are not referenced when entering the address.",
AD_Window_ID="566e8b2a-6be5-463e-f216-e211f099e497",SeqNo=40,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_City="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee";

@XendraTrl(Identifier="6e48c88e-a589-0c81-d592-c3ed6a876ff5")
public static String es_PE_TABLE_C_City_Name="Ciudad";

@XendraTable(Name="City",Description="City",Help="",TableName="C_City",AccessLevel="6",
AD_Window_ID="566e8b2a-6be5-463e-f216-e211f099e497",AD_Val_Rule_ID="",IsKey=1,LoadSeq=65,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="6e48c88e-a589-0c81-d592-c3ed6a876ff5",
Synchronized="2017-12-13 15:36:05.0")
/** TableName=C_City */
public static final String Table_Name="C_City";


@XendraIndex(Name="c_city_citycode",Identifier="5613d6cf-66ad-2e67-945f-721e3fc73cd3",
Column_Names="citycode",IsUnique="false",TableIdentifier="5613d6cf-66ad-2e67-945f-721e3fc73cd3",
Synchronized="2017-05-01 11:07:58.0")
public static final String INDEXNAME_c_city_citycode = "5613d6cf-66ad-2e67-945f-721e3fc73cd3";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_City");

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
    Table_ID = MTable.getTable_ID("C_City");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_City[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Area Code.
@param AreaCode Phone Area Code */
public void setAreaCode (String AreaCode)
{
if (AreaCode != null && AreaCode.length() > 10)
{
log.warning("Length > 10 - truncated");
AreaCode = AreaCode.substring(0,9);
}
set_Value (COLUMNNAME_AreaCode, AreaCode);
}
/** Get Area Code.
@return Phone Area Code */
public String getAreaCode() 
{
String value = (String)get_Value(COLUMNNAME_AreaCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4d241367-60fe-910b-95d1-d825e6899d92")
public static String es_PE_FIELD_City_AreaCode_Name="Código Ciudad";

@XendraTrl(Identifier="4d241367-60fe-910b-95d1-d825e6899d92")
public static String es_PE_FIELD_City_AreaCode_Description="Código telefónico de la ciudad";

@XendraTrl(Identifier="4d241367-60fe-910b-95d1-d825e6899d92")
public static String es_PE_FIELD_City_AreaCode_Help="Código telefónico de la ciudad";

@XendraField(AD_Column_ID="AreaCode",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d241367-60fe-910b-95d1-d825e6899d92")
public static final String FIELDNAME_City_AreaCode="4d241367-60fe-910b-95d1-d825e6899d92";

@XendraTrl(Identifier="14053e15-99f0-4565-9094-fe7dccc47c1e")
public static String es_PE_COLUMN_AreaCode_Name="Código Ciudad";

@XendraColumn(AD_Element_ID="f819055a-1b87-230a-c7ca-0ba1561a4f2d",ColumnName="AreaCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14053e15-99f0-4565-9094-fe7dccc47c1e",
Synchronized="2017-08-28 09:55:29.0")
/** Column name AreaCode */
public static final String COLUMNNAME_AreaCode = "AreaCode";
/** Set City.
@param C_City_ID City */
public void setC_City_ID (int C_City_ID)
{
if (C_City_ID < 1) throw new IllegalArgumentException ("C_City_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_City_ID, Integer.valueOf(C_City_ID));
}
/** Get City.
@return City */
public int getC_City_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_City_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ec9b86d-618d-adf8-c3a2-4692200adf35")
public static String es_PE_FIELD_City_City_Name="Ciudad";

@XendraTrl(Identifier="0ec9b86d-618d-adf8-c3a2-4692200adf35")
public static String es_PE_FIELD_City_City_Description="Ciudad";

@XendraTrl(Identifier="0ec9b86d-618d-adf8-c3a2-4692200adf35")
public static String es_PE_FIELD_City_City_Help="Ciudad en el país";

@XendraField(AD_Column_ID="C_City_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ec9b86d-618d-adf8-c3a2-4692200adf35")
public static final String FIELDNAME_City_City="0ec9b86d-618d-adf8-c3a2-4692200adf35";
/** Column name C_City_ID */
public static final String COLUMNNAME_C_City_ID = "C_City_ID";
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Country_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
}
/** Get Country_ID.
@return Country  */
public int getC_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="efc240cd-af62-be54-994d-a05e3776d57b")
public static String es_PE_FIELD_City_Country_ID_Name="País";

@XendraTrl(Identifier="efc240cd-af62-be54-994d-a05e3776d57b")
public static String es_PE_FIELD_City_Country_ID_Description="País";

@XendraTrl(Identifier="efc240cd-af62-be54-994d-a05e3776d57b")
public static String es_PE_FIELD_City_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efc240cd-af62-be54-994d-a05e3776d57b")
public static final String FIELDNAME_City_Country_ID="efc240cd-af62-be54-994d-a05e3776d57b";

@XendraTrl(Identifier="f940fce3-d678-2d5a-3697-f93b541001b4")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f940fce3-d678-2d5a-3697-f93b541001b4",
Synchronized="2017-08-28 09:55:29.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set CityCode.
@param CityCode CityCode */
public void setCityCode (String CityCode)
{
if (CityCode != null && CityCode.length() > 2)
{
log.warning("Length > 2 - truncated");
CityCode = CityCode.substring(0,1);
}
set_Value (COLUMNNAME_CityCode, CityCode);
}
/** Get CityCode.
@return CityCode */
public String getCityCode() 
{
String value = (String)get_Value(COLUMNNAME_CityCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cb6e6963-a0ba-4349-b847-f6c993c502ba")
public static String es_PE_COLUMN_CityCode_Name="citycode";

@XendraColumn(AD_Element_ID="cfc01415-2a00-4980-87b6-d131f0555e60",ColumnName="CityCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb6e6963-a0ba-4349-b847-f6c993c502ba",
Synchronized="2017-08-28 09:55:29.0")
/** Column name CityCode */
public static final String COLUMNNAME_CityCode = "CityCode";
/** Set Coordinates.
@param Coordinates Location coordinate */
public void setCoordinates (String Coordinates)
{
if (Coordinates != null && Coordinates.length() > 15)
{
log.warning("Length > 15 - truncated");
Coordinates = Coordinates.substring(0,14);
}
set_Value (COLUMNNAME_Coordinates, Coordinates);
}
/** Get Coordinates.
@return Location coordinate */
public String getCoordinates() 
{
String value = (String)get_Value(COLUMNNAME_Coordinates);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5c7e4276-c05a-a739-e802-7ba5a6398993")
public static String es_PE_FIELD_City_Coordinates_Name="Coordenadas";

@XendraTrl(Identifier="5c7e4276-c05a-a739-e802-7ba5a6398993")
public static String es_PE_FIELD_City_Coordinates_Help="Esta columna contiene las coordenadas geográficas (latitud/longitud) de la localización. Con el fín de evitar el uso innecesario de caracteres y espacio no estandar; la siguiente presentación es usada: 0000N 00000W 0000S 00000E donde los dos últimos dígitos se refiere a minutos y los dos ó tres primeros indican grados.";

@XendraField(AD_Column_ID="Coordinates",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=15,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c7e4276-c05a-a739-e802-7ba5a6398993")
public static final String FIELDNAME_City_Coordinates="5c7e4276-c05a-a739-e802-7ba5a6398993";

@XendraTrl(Identifier="fc131b01-ae21-3775-94e2-7e913595b941")
public static String es_PE_COLUMN_Coordinates_Name="Coordenadas";

@XendraColumn(AD_Element_ID="fc286c62-1ecd-80a7-6fcc-979df324563e",ColumnName="Coordinates",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=15,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fc131b01-ae21-3775-94e2-7e913595b941",
Synchronized="2017-08-28 09:55:29.0")
/** Column name Coordinates */
public static final String COLUMNNAME_Coordinates = "Coordinates";
/** Set C_Province_ID.
@param C_Province_ID C_Province_ID */
public void setC_Province_ID (int C_Province_ID)
{
if (C_Province_ID <= 0) set_Value (COLUMNNAME_C_Province_ID, null);
 else 
set_Value (COLUMNNAME_C_Province_ID, Integer.valueOf(C_Province_ID));
}
/** Get C_Province_ID.
@return C_Province_ID */
public int getC_Province_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Province_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="659c017d-1c2a-db66-b705-fa45f8557619")
public static String es_PE_COLUMN_C_Province_ID_Name="c_province_id";

@XendraColumn(AD_Element_ID="cde63be0-fa0b-9319-77c6-a6b10bb61b08",ColumnName="C_Province_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="659c017d-1c2a-db66-b705-fa45f8557619",
Synchronized="2017-08-28 09:55:29.0")
/** Column name C_Province_ID */
public static final String COLUMNNAME_C_Province_ID = "C_Province_ID";

/** C_Region_ID AD_Reference=f560243f-2ea5-bcb4-265f-52555b17a707 */
public static final int C_REGION_ID_AD_Reference_ID=157;
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID <= 0) set_Value (COLUMNNAME_C_Region_ID, null);
 else 
set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
}
/** Get Region.
@return Identifies a geographical Region */
public int getC_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3352d57b-4f58-41a0-3e55-cda8cf5ba557")
public static String es_PE_FIELD_City_Region_Name="Región";

@XendraTrl(Identifier="3352d57b-4f58-41a0-3e55-cda8cf5ba557")
public static String es_PE_FIELD_City_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="3352d57b-4f58-41a0-3e55-cda8cf5ba557")
public static String es_PE_FIELD_City_Region_Help="La región indica una región única para este país";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3352d57b-4f58-41a0-3e55-cda8cf5ba557")
public static final String FIELDNAME_City_Region="3352d57b-4f58-41a0-3e55-cda8cf5ba557";

@XendraTrl(Identifier="b016694a-11ee-4219-65a0-fdab1d9d0607")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f560243f-2ea5-bcb4-265f-52555b17a707",
AD_Val_Rule_ID="2f48b18b-cc01-4a24-2f77-91b0071e443b",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b016694a-11ee-4219-65a0-fdab1d9d0607",
Synchronized="2017-08-28 09:55:29.0")
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
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
@XendraTrl(Identifier="c9d26800-ce42-48de-9e00-fd05e0390101")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9d26800-ce42-48de-9e00-fd05e0390101",
Synchronized="2017-08-28 09:55:29.0")
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

@XendraTrl(Identifier="5bc3975e-214e-49e1-9eb4-cf36152e6f6b")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="'N'",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bc3975e-214e-49e1-9eb4-cf36152e6f6b",
Synchronized="2017-12-13 15:33:11.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Locode.
@param Locode Location code - UN/LOCODE  */
public void setLocode (String Locode)
{
if (Locode != null && Locode.length() > 10)
{
log.warning("Length > 10 - truncated");
Locode = Locode.substring(0,9);
}
set_Value (COLUMNNAME_Locode, Locode);
}
/** Get Locode.
@return Location code - UN/LOCODE  */
public String getLocode() 
{
String value = (String)get_Value(COLUMNNAME_Locode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4ca9085e-ee8d-a80f-5b1f-62dec3824f2a")
public static String es_PE_FIELD_City_Locode_Name="Código de Localización";

@XendraTrl(Identifier="4ca9085e-ee8d-a80f-5b1f-62dec3824f2a")
public static String es_PE_FIELD_City_Locode_Description="Código de Localización - UN/LOCODE";

@XendraTrl(Identifier="4ca9085e-ee8d-a80f-5b1f-62dec3824f2a")
public static String es_PE_FIELD_City_Locode_Help="UN/LOCODE es una combinación de un código de país de dos caractéres y un código de localización de tres caractéres; por ejemplo; CLSCL corresponde a la ciudad de Santiago (SCL) en Chile (CL). Ver : http://www.unece.org/cefact/locode/service/main.htm";

@XendraField(AD_Column_ID="Locode",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ca9085e-ee8d-a80f-5b1f-62dec3824f2a")
public static final String FIELDNAME_City_Locode="4ca9085e-ee8d-a80f-5b1f-62dec3824f2a";

@XendraTrl(Identifier="5f06bca2-d9e0-770d-1ff4-d2268f2605dd")
public static String es_PE_COLUMN_Locode_Name="Código de Localización";

@XendraColumn(AD_Element_ID="ebd05341-193e-82a7-6f31-5c9c967deb70",ColumnName="Locode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f06bca2-d9e0-770d-1ff4-d2268f2605dd",
Synchronized="2017-08-28 09:55:29.0")
/** Column name Locode */
public static final String COLUMNNAME_Locode = "Locode";
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

@XendraTrl(Identifier="34b4f041-a923-cbf8-c32a-91ad1fde4406")
public static String es_PE_FIELD_City_Name_Name="Nombre";

@XendraTrl(Identifier="34b4f041-a923-cbf8-c32a-91ad1fde4406")
public static String es_PE_FIELD_City_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="34b4f041-a923-cbf8-c32a-91ad1fde4406")
public static String es_PE_FIELD_City_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34b4f041-a923-cbf8-c32a-91ad1fde4406")
public static final String FIELDNAME_City_Name="34b4f041-a923-cbf8-c32a-91ad1fde4406";

@XendraTrl(Identifier="a79c7b95-104d-0754-69b6-e0e89c3ec82c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a79c7b95-104d-0754-69b6-e0e89c3ec82c",
Synchronized="2017-08-28 09:55:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set ZIP.
@param Postal Postal code */
public void setPostal (String Postal)
{
if (Postal != null && Postal.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal = Postal.substring(0,9);
}
set_Value (COLUMNNAME_Postal, Postal);
}
/** Get ZIP.
@return Postal code */
public String getPostal() 
{
String value = (String)get_Value(COLUMNNAME_Postal);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ef0753e5-5cfd-de73-f8f3-4a772406bec2")
public static String es_PE_FIELD_City_ZIP_Name="Código Postal";

@XendraTrl(Identifier="ef0753e5-5cfd-de73-f8f3-4a772406bec2")
public static String es_PE_FIELD_City_ZIP_Description="Código Postal";

@XendraTrl(Identifier="ef0753e5-5cfd-de73-f8f3-4a772406bec2")
public static String es_PE_FIELD_City_ZIP_Help="El campo Código Postal identifica el código postal para esta entidad";

@XendraField(AD_Column_ID="Postal",IsCentrallyMaintained=true,
AD_Tab_ID="8742cfab-d7dd-dc6f-03a8-a8651de4f4ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef0753e5-5cfd-de73-f8f3-4a772406bec2")
public static final String FIELDNAME_City_ZIP="ef0753e5-5cfd-de73-f8f3-4a772406bec2";

@XendraTrl(Identifier="80c21319-f063-62a4-b73c-a46905059fd5")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80c21319-f063-62a4-b73c-a46905059fd5",
Synchronized="2017-08-28 09:55:29.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";
/** Set Supervisor.
@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval */
public void setSupervisor_ID (int Supervisor_ID)
{
if (Supervisor_ID <= 0) set_Value (COLUMNNAME_Supervisor_ID, null);
 else 
set_Value (COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
}
/** Get Supervisor.
@return Supervisor for this user/organization - used for escalation and approval */
public int getSupervisor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Supervisor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2fbfd7c1-57ca-8b8b-e386-2a19f8b69f14")
public static String es_PE_COLUMN_Supervisor_ID_Name="Supervisor";

@XendraColumn(AD_Element_ID="cb6ad258-6bb2-80b2-a90f-63c4d947479b",ColumnName="Supervisor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fbfd7c1-57ca-8b8b-e386-2a19f8b69f14",
Synchronized="2017-08-28 09:55:29.0")
/** Column name Supervisor_ID */
public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
}
