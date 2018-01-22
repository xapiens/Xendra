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
/** Generated Model for C_Region
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Region extends PO
{
/** Standard Constructor
@param ctx context
@param C_Region_ID id
@param trxName transaction
*/
public X_C_Region (Properties ctx, int C_Region_ID, String trxName)
{
super (ctx, C_Region_ID, trxName);
/** if (C_Region_ID == 0)
{
setC_Country_ID (0);
setC_Region_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Region (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=164 */
public static int Table_ID=MTable.getTable_ID("C_Region");

@XendraTrl(Identifier="c79b6057-7fa8-07a1-c583-d6043b4b60c5")
public static String es_PE_TAB_Region_Description="Definir regiones";

@XendraTrl(Identifier="c79b6057-7fa8-07a1-c583-d6043b4b60c5")
public static String es_PE_TAB_Region_Name="Región";

@XendraTrl(Identifier="c79b6057-7fa8-07a1-c583-d6043b4b60c5")
public static String es_PE_TAB_Region_Help="La pestaña de Región define una región dentro de un país. Esta pestaña es activa solamente si en la pestaña de país el cuadro de validación `Tiene Región` ha sido activado.";

@XendraTab(Name="Region",Description="Define Regions",
Help="The Region Tab  defines a Region within a Country.  This tab is enabled only if the Has Region checkbox is selected for the Country.",
AD_Window_ID="566e8b2a-6be5-463e-f216-e211f099e497",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",
CommitWarning="Please create a support request (http://www.adempiere.org/support/requests.html), if the region info is not correct/incomplete.",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="c79b6057-7fa8-07a1-c583-d6043b4b60c5",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Region="c79b6057-7fa8-07a1-c583-d6043b4b60c5";

@XendraTrl(Identifier="9b6cb04e-a6a7-93f6-84c5-4ac0d83424a0")
public static String es_PE_TABLE_C_Region_Name="Región";

@XendraTable(Name="Region",Description="Identifies a geographical Region",Help="",
TableName="C_Region",AccessLevel="6",AD_Window_ID="566e8b2a-6be5-463e-f216-e211f099e497",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=60,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="9b6cb04e-a6a7-93f6-84c5-4ac0d83424a0",Synchronized="2017-08-16 11:42:23.0")
/** TableName=C_Region */
public static final String Table_Name="C_Region";


@XendraIndex(Name="c_region_regioncode",Identifier="d68e8e0b-c36a-5368-5fa1-2b080ad94c1b",
Column_Names="regioncode",IsUnique="false",TableIdentifier="d68e8e0b-c36a-5368-5fa1-2b080ad94c1b",
Synchronized="2017-05-01 11:07:58.0")
public static final String INDEXNAME_c_region_regioncode = "d68e8e0b-c36a-5368-5fa1-2b080ad94c1b";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Region");

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
    Table_ID = MTable.getTable_ID("C_Region");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Region[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID < 1) throw new IllegalArgumentException ("C_Country_ID is mandatory.");
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

@XendraTrl(Identifier="8315f15c-015a-cf15-d851-dc6efd46146d")
public static String es_PE_FIELD_Region_Country_ID_Description="País";

@XendraTrl(Identifier="8315f15c-015a-cf15-d851-dc6efd46146d")
public static String es_PE_FIELD_Region_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraTrl(Identifier="8315f15c-015a-cf15-d851-dc6efd46146d")
public static String es_PE_FIELD_Region_Country_ID_Name="País";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c79b6057-7fa8-07a1-c583-d6043b4b60c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasRegion@='Y'",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8315f15c-015a-cf15-d851-dc6efd46146d")
public static final String FIELDNAME_Region_Country_ID="8315f15c-015a-cf15-d851-dc6efd46146d";

@XendraTrl(Identifier="23b4ca73-e0f3-3944-2251-923971eae0b0")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23b4ca73-e0f3-3944-2251-923971eae0b0",
Synchronized="2017-08-05 16:54:20.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID < 1) throw new IllegalArgumentException ("C_Region_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
}
/** Get Region.
@return Identifies a geographical Region */
public int getC_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="772f14fe-80ae-8d25-bafb-2197c4499725")
public static String es_PE_FIELD_Region_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="772f14fe-80ae-8d25-bafb-2197c4499725")
public static String es_PE_FIELD_Region_Region_Help="La región indica una región única para este país";

@XendraTrl(Identifier="772f14fe-80ae-8d25-bafb-2197c4499725")
public static String es_PE_FIELD_Region_Region_Name="Región";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c79b6057-7fa8-07a1-c583-d6043b4b60c5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="772f14fe-80ae-8d25-bafb-2197c4499725")
public static final String FIELDNAME_Region_Region="772f14fe-80ae-8d25-bafb-2197c4499725";
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
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

@XendraTrl(Identifier="02d0e40e-0de5-f867-9eac-20101bdaa51c")
public static String es_PE_FIELD_Region_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="02d0e40e-0de5-f867-9eac-20101bdaa51c")
public static String es_PE_FIELD_Region_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="02d0e40e-0de5-f867-9eac-20101bdaa51c")
public static String es_PE_FIELD_Region_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c79b6057-7fa8-07a1-c583-d6043b4b60c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasRegion@='Y'",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="02d0e40e-0de5-f867-9eac-20101bdaa51c")
public static final String FIELDNAME_Region_Description="02d0e40e-0de5-f867-9eac-20101bdaa51c";

@XendraTrl(Identifier="4155e31e-4049-8abd-47da-b3e93122a29c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4155e31e-4049-8abd-47da-b3e93122a29c",
Synchronized="2017-08-05 16:54:20.0")
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
@XendraTrl(Identifier="69412dd4-38bd-4b5b-931d-d3b368020082")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69412dd4-38bd-4b5b-931d-d3b368020082",
Synchronized="2017-08-05 16:54:20.0")
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

@XendraTrl(Identifier="6b082b0c-09f2-a682-e6e6-6540e0b69c1a")
public static String es_PE_FIELD_Region_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="6b082b0c-09f2-a682-e6e6-6540e0b69c1a")
public static String es_PE_FIELD_Region_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="6b082b0c-09f2-a682-e6e6-6540e0b69c1a")
public static String es_PE_FIELD_Region_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="c79b6057-7fa8-07a1-c583-d6043b4b60c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasRegion@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b082b0c-09f2-a682-e6e6-6540e0b69c1a")
public static final String FIELDNAME_Region_Default="6b082b0c-09f2-a682-e6e6-6540e0b69c1a";

@XendraTrl(Identifier="45cc238f-0e20-127e-4b74-ef0b2d6a5d6e")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45cc238f-0e20-127e-4b74-ef0b2d6a5d6e",
Synchronized="2017-08-05 16:54:20.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="36cad63c-e497-1171-36ca-cebc8cb833ac")
public static String es_PE_FIELD_Region_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="36cad63c-e497-1171-36ca-cebc8cb833ac")
public static String es_PE_FIELD_Region_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="36cad63c-e497-1171-36ca-cebc8cb833ac")
public static String es_PE_FIELD_Region_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c79b6057-7fa8-07a1-c583-d6043b4b60c5",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@HasRegion@='Y'",DisplayLength=60,IsReadOnly=false,SeqNo=50,
SortNo=1,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="36cad63c-e497-1171-36ca-cebc8cb833ac")
public static final String FIELDNAME_Region_Name="36cad63c-e497-1171-36ca-cebc8cb833ac";

@XendraTrl(Identifier="8d91d2a7-8f94-9018-d18e-034fbc5e87ba")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d91d2a7-8f94-9018-d18e-034fbc5e87ba",
Synchronized="2017-08-05 16:54:20.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set RegionCode.
@param RegionCode RegionCode */
public void setRegionCode (String RegionCode)
{
if (RegionCode != null && RegionCode.length() > 2)
{
log.warning("Length > 2 - truncated");
RegionCode = RegionCode.substring(0,1);
}
set_Value (COLUMNNAME_RegionCode, RegionCode);
}
/** Get RegionCode.
@return RegionCode */
public String getRegionCode() 
{
String value = (String)get_Value(COLUMNNAME_RegionCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a90f3ca2-c2ca-49e9-acac-3c0f0bd21e71")
public static String es_PE_COLUMN_RegionCode_Name="regioncode";

@XendraColumn(AD_Element_ID="92ed2afb-5fc6-4f5c-9392-b4910e99333b",ColumnName="RegionCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a90f3ca2-c2ca-49e9-acac-3c0f0bd21e71",
Synchronized="2017-08-05 16:54:20.0")
/** Column name RegionCode */
public static final String COLUMNNAME_RegionCode = "RegionCode";
}
