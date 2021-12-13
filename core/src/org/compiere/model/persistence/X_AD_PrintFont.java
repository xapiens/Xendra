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
/** Generated Model for AD_PrintFont
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintFont extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintFont_ID id
@param trxName transaction
*/
public X_AD_PrintFont (Properties ctx, int AD_PrintFont_ID, String trxName)
{
super (ctx, AD_PrintFont_ID, trxName);
/** if (AD_PrintFont_ID == 0)
{
setAD_PrintFont_ID (0);
setCode (null);
setIsDefault (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintFont (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=491 */
public static int Table_ID=MTable.getTable_ID("AD_PrintFont");

@XendraTrl(Identifier="6150de68-2e31-10bf-7466-09efbeab1a55")
public static String es_PE_TAB_PrintFont_Description="Mantener Fuente de Impresión";

@XendraTrl(Identifier="6150de68-2e31-10bf-7466-09efbeab1a55")
public static String es_PE_TAB_PrintFont_Help="Fuentes usadas para impresión.";

@XendraTrl(Identifier="6150de68-2e31-10bf-7466-09efbeab1a55")
public static String es_PE_TAB_PrintFont_Name="Fuente de Impresión";
@XendraTab(Name="Print Font",
Description="Maintain Print Font",Help="Font used for printing",
AD_Window_ID="fa7b9d5b-b388-9020-de37-49d253bee908",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6150de68-2e31-10bf-7466-09efbeab1a55",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PrintFont="6150de68-2e31-10bf-7466-09efbeab1a55";

@XendraTrl(Identifier="c80dcae2-ebd1-38ff-9774-8e06e883dbb6")
public static String es_PE_TABLE_AD_PrintFont_Name="Fuente de Impresión";

@XendraTable(Name="Print Font",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Maintain Print Font",Help="",
TableName="AD_PrintFont",AccessLevel="6",AD_Window_ID="fa7b9d5b-b388-9020-de37-49d253bee908",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=55,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="c80dcae2-ebd1-38ff-9774-8e06e883dbb6",Synchronized="2020-03-03 21:35:19.0")
/** TableName=AD_PrintFont */
public static final String Table_Name="AD_PrintFont";


@XendraIndex(Name="ad_printfont_name",Identifier="8723fbeb-d0d7-3b02-2804-c163765e95a0",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="8723fbeb-d0d7-3b02-2804-c163765e95a0",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_printfont_name = "8723fbeb-d0d7-3b02-2804-c163765e95a0";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintFont");

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
    Table_ID = MTable.getTable_ID("AD_PrintFont");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintFont[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Font.
@param AD_PrintFont_ID Maintain Print Font */
public void setAD_PrintFont_ID (int AD_PrintFont_ID)
{
if (AD_PrintFont_ID < 1) throw new IllegalArgumentException ("AD_PrintFont_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintFont_ID, Integer.valueOf(AD_PrintFont_ID));
}
/** Get Print Font.
@return Maintain Print Font */
public int getAD_PrintFont_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFont_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="375d115d-65d5-f036-65fc-2a6fc44231a0")
public static String es_PE_FIELD_PrintFont_PrintFont_Name="Fuente de Impresión";

@XendraTrl(Identifier="375d115d-65d5-f036-65fc-2a6fc44231a0")
public static String es_PE_FIELD_PrintFont_PrintFont_Description="Mantener fuentes de impresión";

@XendraTrl(Identifier="375d115d-65d5-f036-65fc-2a6fc44231a0")
public static String es_PE_FIELD_PrintFont_PrintFont_Help="Fuente usado para imprimir";

@XendraField(AD_Column_ID="AD_PrintFont_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6150de68-2e31-10bf-7466-09efbeab1a55",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="375d115d-65d5-f036-65fc-2a6fc44231a0")
public static final String FIELDNAME_PrintFont_PrintFont="375d115d-65d5-f036-65fc-2a6fc44231a0";
/** Column name AD_PrintFont_ID */
public static final String COLUMNNAME_AD_PrintFont_ID = "AD_PrintFont_ID";
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
if (Code == null) throw new IllegalArgumentException ("Code is mandatory.");
if (Code.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Code = Code.substring(0,1999);
}
set_Value (COLUMNNAME_Code, Code);
}
/** Get Validation code.
@return Validation Code */
public String getCode() 
{
String value = (String)get_Value(COLUMNNAME_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a4c7ee97-1920-3473-ce1b-108fd46c8134")
public static String es_PE_FIELD_PrintFont_ValidationCode_Name="Código de Validación";

@XendraTrl(Identifier="a4c7ee97-1920-3473-ce1b-108fd46c8134")
public static String es_PE_FIELD_PrintFont_ValidationCode_Description="Código de Validación";

@XendraTrl(Identifier="a4c7ee97-1920-3473-ce1b-108fd46c8134")
public static String es_PE_FIELD_PrintFont_ValidationCode_Help="El código validación despliega la fecha; hora y mensaje del error";

@XendraField(AD_Column_ID="Code",IsCentrallyMaintained=true,
AD_Tab_ID="6150de68-2e31-10bf-7466-09efbeab1a55",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4c7ee97-1920-3473-ce1b-108fd46c8134")
public static final String FIELDNAME_PrintFont_ValidationCode="a4c7ee97-1920-3473-ce1b-108fd46c8134";

@XendraTrl(Identifier="15b72900-c6ac-e7fe-54a0-366f98f68e5b")
public static String es_PE_COLUMN_Code_Name="Código de Validación";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15b72900-c6ac-e7fe-54a0-366f98f68e5b",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
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
@XendraTrl(Identifier="54a1b3a3-f3f6-4992-ba82-7286836b5c11")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54a1b3a3-f3f6-4992-ba82-7286836b5c11",
Synchronized="2019-08-30 22:20:31.0")
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

@XendraTrl(Identifier="306d7761-6226-0f09-7cd2-417bdbe294f2")
public static String es_PE_FIELD_PrintFont_Default_Name="Predeterminado";

@XendraTrl(Identifier="306d7761-6226-0f09-7cd2-417bdbe294f2")
public static String es_PE_FIELD_PrintFont_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="306d7761-6226-0f09-7cd2-417bdbe294f2")
public static String es_PE_FIELD_PrintFont_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="6150de68-2e31-10bf-7466-09efbeab1a55",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="306d7761-6226-0f09-7cd2-417bdbe294f2")
public static final String FIELDNAME_PrintFont_Default="306d7761-6226-0f09-7cd2-417bdbe294f2";

@XendraTrl(Identifier="0a4d3150-bb21-45ca-527f-706e27636577")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a4d3150-bb21-45ca-527f-706e27636577",
Synchronized="2019-08-30 22:20:31.0")
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

@XendraTrl(Identifier="c55db977-b643-a90c-fc91-f2a5938dc593")
public static String es_PE_FIELD_PrintFont_Name_Name="Nombre";

@XendraTrl(Identifier="c55db977-b643-a90c-fc91-f2a5938dc593")
public static String es_PE_FIELD_PrintFont_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c55db977-b643-a90c-fc91-f2a5938dc593")
public static String es_PE_FIELD_PrintFont_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="6150de68-2e31-10bf-7466-09efbeab1a55",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c55db977-b643-a90c-fc91-f2a5938dc593")
public static final String FIELDNAME_PrintFont_Name="c55db977-b643-a90c-fc91-f2a5938dc593";

@XendraTrl(Identifier="5b43203b-5907-290a-6dc2-e7e01ee17a8f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b43203b-5907-290a-6dc2-e7e01ee17a8f",
Synchronized="2019-08-30 22:20:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
