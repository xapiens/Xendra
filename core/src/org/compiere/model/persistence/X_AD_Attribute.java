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
/** Generated Model for AD_Attribute
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Attribute extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Attribute_ID id
@param trxName transaction
*/
public X_AD_Attribute (Properties ctx, int AD_Attribute_ID, String trxName)
{
super (ctx, AD_Attribute_ID, trxName);
/** if (AD_Attribute_ID == 0)
{
setAD_Attribute_ID (0);
setAD_Reference_ID (0);
setAD_Table_ID (0);
setIsEncrypted (false);	
// N
setIsFieldOnly (false);	
// N
setIsHeading (false);	
// N
setIsMandatory (false);	
// N
setIsReadOnly (false);	
// N
setIsSameLine (false);	
// N
setIsUpdateable (false);	
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
public X_AD_Attribute (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=405 */
public static int Table_ID=MTable.getTable_ID("AD_Attribute");

@XendraTrl(Identifier="825b7984-f755-968c-6669-7334c98b6f8a")
public static String es_PE_TAB_CustomAttribute_Description="Definir Atributo Personalizado";

@XendraTrl(Identifier="825b7984-f755-968c-6669-7334c98b6f8a")
public static String es_PE_TAB_CustomAttribute_Name="Atributo Personalizado";

@XendraTrl(Identifier="825b7984-f755-968c-6669-7334c98b6f8a")
public static String es_PE_TAB_CustomAttribute_Help="La pestaña Atributos Personalizados define atributos ó información adicional para un producto ó entidad.";

@XendraTab(Name="Custom Attribute",Description="Define Custom Attribute",
Help="The Custom Attribute Tab defines additional attributes or information for a product or entity.",
AD_Window_ID="545edb7a-56cf-9857-622b-b8c9cc333346",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="825b7984-f755-968c-6669-7334c98b6f8a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CustomAttribute="825b7984-f755-968c-6669-7334c98b6f8a";

@XendraTrl(Identifier="1cabb384-0b43-ca5e-5b9d-e3295111e87b")
public static String es_PE_TABLE_AD_Attribute_Name="Atributo";

@XendraTable(Name="System Attribute",Description="",Help="",TableName="AD_Attribute",
AccessLevel="7",AD_Window_ID="545edb7a-56cf-9857-622b-b8c9cc333346",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="1cabb384-0b43-ca5e-5b9d-e3295111e87b",Synchronized="2017-08-16 11:39:59.0")
/** TableName=AD_Attribute */
public static final String Table_Name="AD_Attribute";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Attribute");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_Attribute");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Attribute[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Attribute.
@param AD_Attribute_ID System Attribute */
public void setAD_Attribute_ID (int AD_Attribute_ID)
{
if (AD_Attribute_ID < 1) throw new IllegalArgumentException ("AD_Attribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Attribute_ID, Integer.valueOf(AD_Attribute_ID));
}
/** Get System Attribute.
@return System Attribute */
public int getAD_Attribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Attribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e23a6035-6379-6da3-5143-1d5bca16a497")
public static String es_PE_FIELD_CustomAttribute_SystemAttribute_Name="Atributo";

@XendraField(AD_Column_ID="AD_Attribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e23a6035-6379-6da3-5143-1d5bca16a497")
public static final String FIELDNAME_CustomAttribute_SystemAttribute="e23a6035-6379-6da3-5143-1d5bca16a497";
/** Column name AD_Attribute_ID */
public static final String COLUMNNAME_AD_Attribute_ID = "AD_Attribute_ID";

/** AD_Reference_ID AD_Reference=17ec718c-707b-498f-3a6c-e81d1630e510 */
public static final int AD_REFERENCE_ID_AD_Reference_ID=1;
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ae4b89eb-dffd-8c64-8533-176b6b95daaa")
public static String es_PE_FIELD_CustomAttribute_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="ae4b89eb-dffd-8c64-8533-176b6b95daaa")
public static String es_PE_FIELD_CustomAttribute_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraTrl(Identifier="ae4b89eb-dffd-8c64-8533-176b6b95daaa")
public static String es_PE_FIELD_CustomAttribute_Reference_Name="Referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae4b89eb-dffd-8c64-8533-176b6b95daaa")
public static final String FIELDNAME_CustomAttribute_Reference="ae4b89eb-dffd-8c64-8533-176b6b95daaa";

@XendraTrl(Identifier="810a4239-e8e2-3f8f-17da-3e9f20935e34")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="810a4239-e8e2-3f8f-17da-3e9f20935e34",Synchronized="2017-08-05 16:52:22.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";

/** AD_Reference_Value_ID AD_Reference=12253474-e61c-58a4-3fd3-2c2ccf236272 */
public static final int AD_REFERENCE_VALUE_ID_AD_Reference_ID=4;
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d529d655-1ada-58f6-1f50-f4ee1a875bbd")
public static String es_PE_FIELD_CustomAttribute_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="d529d655-1ada-58f6-1f50-f4ee1a875bbd")
public static String es_PE_FIELD_CustomAttribute_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="d529d655-1ada-58f6-1f50-f4ee1a875bbd")
public static String es_PE_FIELD_CustomAttribute_ReferenceKey_Name="Valor de Referencia";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d529d655-1ada-58f6-1f50-f4ee1a875bbd")
public static final String FIELDNAME_CustomAttribute_ReferenceKey="d529d655-1ada-58f6-1f50-f4ee1a875bbd";

@XendraTrl(Identifier="48c7c65f-572b-f5a8-d907-d4df50af0b6e")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Valor de Referencia";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",
AD_Val_Rule_ID="147ddeef-c150-2ac8-67e8-346cc5225ef4",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48c7c65f-572b-f5a8-d907-d4df50af0b6e",
Synchronized="2017-08-05 16:52:22.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f63a3c79-dd4f-d704-e518-661e146bbd00")
public static String es_PE_FIELD_CustomAttribute_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="f63a3c79-dd4f-d704-e518-661e146bbd00")
public static String es_PE_FIELD_CustomAttribute_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="f63a3c79-dd4f-d704-e518-661e146bbd00")
public static String es_PE_FIELD_CustomAttribute_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f63a3c79-dd4f-d704-e518-661e146bbd00")
public static final String FIELDNAME_CustomAttribute_Table="f63a3c79-dd4f-d704-e518-661e146bbd00";

@XendraTrl(Identifier="8ee38ef4-5fc6-7166-2446-a2871fa6fdb9")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ee38ef4-5fc6-7166-2446-a2871fa6fdb9",
Synchronized="2017-08-05 16:52:22.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Dynamic Validation.
@param AD_Val_Rule_ID Dynamic Validation Rule */
public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
{
if (AD_Val_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
}
/** Get Dynamic Validation.
@return Dynamic Validation Rule */
public int getAD_Val_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7c8a962d-195a-b9a5-8976-a8edac07144c")
public static String es_PE_FIELD_CustomAttribute_DynamicValidation_Description="Regla de validación";

@XendraTrl(Identifier="7c8a962d-195a-b9a5-8976-a8edac07144c")
public static String es_PE_FIELD_CustomAttribute_DynamicValidation_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraTrl(Identifier="7c8a962d-195a-b9a5-8976-a8edac07144c")
public static String es_PE_FIELD_CustomAttribute_DynamicValidation_Name="Validación";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c8a962d-195a-b9a5-8976-a8edac07144c")
public static final String FIELDNAME_CustomAttribute_DynamicValidation="7c8a962d-195a-b9a5-8976-a8edac07144c";

@XendraTrl(Identifier="27eec355-3920-4262-bbda-eb3d119cd48a")
public static String es_PE_COLUMN_AD_Val_Rule_ID_Name="Validación";

@XendraColumn(AD_Element_ID="c0a45383-82fd-7e33-a355-80b15115b36b",ColumnName="AD_Val_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27eec355-3920-4262-bbda-eb3d119cd48a",
Synchronized="2017-08-05 16:52:22.0")
/** Column name AD_Val_Rule_ID */
public static final String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
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
@XendraTrl(Identifier="3148699a-94f1-ca0b-ce81-93b707e6f6ce")
public static String es_PE_FIELD_CustomAttribute_Callout_Description="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then function name.";

@XendraTrl(Identifier="3148699a-94f1-ca0b-ce81-93b707e6f6ce")
public static String es_PE_FIELD_CustomAttribute_Callout_Help="Llamadas de función separadas por punto y coma; SE_/SL_/UE_/UL_ - 1st: System / User; 2nd: Enter / Leave; 3rd: _ Unserscore; - then Function Name";

@XendraTrl(Identifier="3148699a-94f1-ca0b-ce81-93b707e6f6ce")
public static String es_PE_FIELD_CustomAttribute_Callout_Name="Llamada";

@XendraField(AD_Column_ID="Callout",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3148699a-94f1-ca0b-ce81-93b707e6f6ce")
public static final String FIELDNAME_CustomAttribute_Callout="3148699a-94f1-ca0b-ce81-93b707e6f6ce";

@XendraTrl(Identifier="68d30876-1d80-7059-1f59-986f12275bbe")
public static String es_PE_COLUMN_Callout_Name="Llamada";

@XendraColumn(AD_Element_ID="1041ce74-aa5e-c0d7-a1c1-ffb0202d26db",ColumnName="Callout",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68d30876-1d80-7059-1f59-986f12275bbe",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Callout */
public static final String COLUMNNAME_Callout = "Callout";
/** Set Default Logic.
@param DefaultValue Default value hierarchy, separated by : */
public void setDefaultValue (String DefaultValue)
{
if (DefaultValue != null && DefaultValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DefaultValue = DefaultValue.substring(0,1999);
}
set_Value (COLUMNNAME_DefaultValue, DefaultValue);
}
/** Get Default Logic.
@return Default value hierarchy, separated by : */
public String getDefaultValue() 
{
String value = (String)get_Value(COLUMNNAME_DefaultValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9bb8b761-5f70-e75c-a987-f0605255cbda")
public static String es_PE_FIELD_CustomAttribute_DefaultLogic_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="9bb8b761-5f70-e75c-a987-f0605255cbda")
public static String es_PE_FIELD_CustomAttribute_DefaultLogic_Help="Los valores predeterminados son evaluados en el orden de la definición; el primer valor no nulo de la columna  llega a ser el valor predeterminado. Los valores son separados por coma ó punto y coma.";

@XendraTrl(Identifier="9bb8b761-5f70-e75c-a987-f0605255cbda")
public static String es_PE_FIELD_CustomAttribute_DefaultLogic_Name="Lógica Predeterminada";

@XendraField(AD_Column_ID="DefaultValue",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bb8b761-5f70-e75c-a987-f0605255cbda")
public static final String FIELDNAME_CustomAttribute_DefaultLogic="9bb8b761-5f70-e75c-a987-f0605255cbda";

@XendraTrl(Identifier="e65c6946-9e53-b78d-67df-0ca962ad8112")
public static String es_PE_COLUMN_DefaultValue_Name="Lógica Predeterminada";

@XendraColumn(AD_Element_ID="85c6e06b-cd4c-c419-f8e4-9e93236b9219",ColumnName="DefaultValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e65c6946-9e53-b78d-67df-0ca962ad8112",
Synchronized="2017-08-05 16:52:22.0")
/** Column name DefaultValue */
public static final String COLUMNNAME_DefaultValue = "DefaultValue";
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

@XendraTrl(Identifier="c0413670-0645-3bd1-a3fe-e91f01369798")
public static String es_PE_FIELD_CustomAttribute_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c0413670-0645-3bd1-a3fe-e91f01369798")
public static String es_PE_FIELD_CustomAttribute_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="c0413670-0645-3bd1-a3fe-e91f01369798")
public static String es_PE_FIELD_CustomAttribute_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0413670-0645-3bd1-a3fe-e91f01369798")
public static final String FIELDNAME_CustomAttribute_Description="c0413670-0645-3bd1-a3fe-e91f01369798";

@XendraTrl(Identifier="7d72e88e-4f03-f2b7-3e76-2de733e67bed")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d72e88e-4f03-f2b7-3e76-2de733e67bed",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Display Length.
@param DisplayLength Length of the display in characters */
public void setDisplayLength (int DisplayLength)
{
set_Value (COLUMNNAME_DisplayLength, Integer.valueOf(DisplayLength));
}
/** Get Display Length.
@return Length of the display in characters */
public int getDisplayLength() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DisplayLength);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c9c3fdf-fbe7-8e03-2111-52abdf032869")
public static String es_PE_FIELD_CustomAttribute_DisplayLength_Description="Longitud del despliegue en caracteres";

@XendraTrl(Identifier="2c9c3fdf-fbe7-8e03-2111-52abdf032869")
public static String es_PE_FIELD_CustomAttribute_DisplayLength_Help="La longitud de despliegue es principalmente para campos de cadena. La longitud no tiene impacto; si el tipo de datos del campo es - Entero; Número; Total (longitud determinada por el sistema) - Si No (Cuadro de Verificación) - Lista; Tabla; Dirección tabla (longitud de cuadros determinadas)";

@XendraTrl(Identifier="2c9c3fdf-fbe7-8e03-2111-52abdf032869")
public static String es_PE_FIELD_CustomAttribute_DisplayLength_Name="Longitud del Despliegue";

@XendraField(AD_Column_ID="DisplayLength",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c9c3fdf-fbe7-8e03-2111-52abdf032869")
public static final String FIELDNAME_CustomAttribute_DisplayLength="2c9c3fdf-fbe7-8e03-2111-52abdf032869";

@XendraTrl(Identifier="987acf77-141a-60a0-0c34-2eb5c0969000")
public static String es_PE_COLUMN_DisplayLength_Name="Longitud del Despliegue";

@XendraColumn(AD_Element_ID="dce6fb37-2aa2-ab65-ac11-c4ce9c6c5d0a",ColumnName="DisplayLength",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="987acf77-141a-60a0-0c34-2eb5c0969000",
Synchronized="2017-08-05 16:52:22.0")
/** Column name DisplayLength */
public static final String COLUMNNAME_DisplayLength = "DisplayLength";
/** Set Display Logic.
@param DisplayLogic If the Field is displayed, the result determines if the field is actually displayed */
public void setDisplayLogic (String DisplayLogic)
{
if (DisplayLogic != null && DisplayLogic.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DisplayLogic = DisplayLogic.substring(0,1999);
}
set_Value (COLUMNNAME_DisplayLogic, DisplayLogic);
}
/** Get Display Logic.
@return If the Field is displayed, the result determines if the field is actually displayed */
public String getDisplayLogic() 
{
String value = (String)get_Value(COLUMNNAME_DisplayLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="53102349-dd03-f389-5b82-3ec79ed71190")
public static String es_PE_FIELD_CustomAttribute_DisplayLogic_Description="Si el campo es desplegado; el resultado determina si el campo es efectivamente desplegado";

@XendraTrl(Identifier="53102349-dd03-f389-5b82-3ec79ed71190")
public static String es_PE_FIELD_CustomAttribute_DisplayLogic_Help="formato:= <expresion> [<logica> <expresion>] expresion	:= @<contexto>@=<valor> o @<contexto>@!<valor> logica:= <|>|<&>contexto:= cualquier valor global ó de la ventana del contexto		:= secuencia a operadores de la logica:=  Y/O con el previo resultado de izquierda a derecha E";

@XendraTrl(Identifier="53102349-dd03-f389-5b82-3ec79ed71190")
public static String es_PE_FIELD_CustomAttribute_DisplayLogic_Name="Despliegue Lógico";

@XendraField(AD_Column_ID="DisplayLogic",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53102349-dd03-f389-5b82-3ec79ed71190")
public static final String FIELDNAME_CustomAttribute_DisplayLogic="53102349-dd03-f389-5b82-3ec79ed71190";

@XendraTrl(Identifier="14f02f5c-51f7-7240-da8c-897f005cd7d2")
public static String es_PE_COLUMN_DisplayLogic_Name="Despliegue Lógico";

@XendraColumn(AD_Element_ID="fcb60996-c818-2f09-e6c4-b7544353cf56",ColumnName="DisplayLogic",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14f02f5c-51f7-7240-da8c-897f005cd7d2",
Synchronized="2017-08-05 16:52:22.0")
/** Column name DisplayLogic */
public static final String COLUMNNAME_DisplayLogic = "DisplayLogic";
/** Set Length.
@param FieldLength Length of the column in the database */
public void setFieldLength (int FieldLength)
{
set_Value (COLUMNNAME_FieldLength, Integer.valueOf(FieldLength));
}
/** Get Length.
@return Length of the column in the database */
public int getFieldLength() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_FieldLength);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bccc5594-f213-b0d3-259c-97273651ec93")
public static String es_PE_FIELD_CustomAttribute_Length_Description="Longitud de la columna en la base de datos.";

@XendraTrl(Identifier="bccc5594-f213-b0d3-259c-97273651ec93")
public static String es_PE_FIELD_CustomAttribute_Length_Help="La longitud indica la longitud de una columna tal como se definió en la base de datos.";

@XendraTrl(Identifier="bccc5594-f213-b0d3-259c-97273651ec93")
public static String es_PE_FIELD_CustomAttribute_Length_Name="Longitud";

@XendraField(AD_Column_ID="FieldLength",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bccc5594-f213-b0d3-259c-97273651ec93")
public static final String FIELDNAME_CustomAttribute_Length="bccc5594-f213-b0d3-259c-97273651ec93";

@XendraTrl(Identifier="63096264-f1ff-e358-065b-142386a6a460")
public static String es_PE_COLUMN_FieldLength_Name="Longitud";

@XendraColumn(AD_Element_ID="6b33873b-028e-abd7-6aea-0aec9b6e54e1",ColumnName="FieldLength",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63096264-f1ff-e358-065b-142386a6a460",
Synchronized="2017-08-05 16:52:22.0")
/** Column name FieldLength */
public static final String COLUMNNAME_FieldLength = "FieldLength";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="18d24c15-573d-42ee-094e-ac7616b09a2d")
public static String es_PE_FIELD_CustomAttribute_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="18d24c15-573d-42ee-094e-ac7616b09a2d")
public static String es_PE_FIELD_CustomAttribute_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="18d24c15-573d-42ee-094e-ac7616b09a2d")
public static String es_PE_FIELD_CustomAttribute_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18d24c15-573d-42ee-094e-ac7616b09a2d")
public static final String FIELDNAME_CustomAttribute_CommentHelp="18d24c15-573d-42ee-094e-ac7616b09a2d";

@XendraTrl(Identifier="c103204a-7928-7f4b-22a9-5423b76dc014")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c103204a-7928-7f4b-22a9-5423b76dc014",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="25f4dc7f-d910-4b0d-a7cb-8ce23647adaa")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25f4dc7f-d910-4b0d-a7cb-8ce23647adaa",
Synchronized="2017-08-05 16:52:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Encrypted.
@param IsEncrypted Display or Storage is encrypted */
public void setIsEncrypted (boolean IsEncrypted)
{
set_Value (COLUMNNAME_IsEncrypted, Boolean.valueOf(IsEncrypted));
}
/** Get Encrypted.
@return Display or Storage is encrypted */
public boolean isEncrypted() 
{
Object oo = get_Value(COLUMNNAME_IsEncrypted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1ca5a5c9-c15d-c13d-bec9-4713020affb4")
public static String es_PE_FIELD_CustomAttribute_Encrypted_Description="Despliegue encriptado";

@XendraTrl(Identifier="1ca5a5c9-c15d-c13d-bec9-4713020affb4")
public static String es_PE_FIELD_CustomAttribute_Encrypted_Help="Despliegue encriptado - todos los caracteres se despliegan de esta manera";

@XendraTrl(Identifier="1ca5a5c9-c15d-c13d-bec9-4713020affb4")
public static String es_PE_FIELD_CustomAttribute_Encrypted_Name="Despliegue Encriptado";

@XendraField(AD_Column_ID="IsEncrypted",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ca5a5c9-c15d-c13d-bec9-4713020affb4")
public static final String FIELDNAME_CustomAttribute_Encrypted="1ca5a5c9-c15d-c13d-bec9-4713020affb4";

@XendraTrl(Identifier="f722d6b8-10fa-9697-200e-0b53b2565dd3")
public static String es_PE_COLUMN_IsEncrypted_Name="Despliegue Encriptado";

@XendraColumn(AD_Element_ID="c0df59ef-8893-5340-a5d8-c855ca33c9dc",ColumnName="IsEncrypted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f722d6b8-10fa-9697-200e-0b53b2565dd3",
Synchronized="2017-08-05 16:52:22.0")
/** Column name IsEncrypted */
public static final String COLUMNNAME_IsEncrypted = "IsEncrypted";
/** Set Field Only.
@param IsFieldOnly Label is not displayed */
public void setIsFieldOnly (boolean IsFieldOnly)
{
set_Value (COLUMNNAME_IsFieldOnly, Boolean.valueOf(IsFieldOnly));
}
/** Get Field Only.
@return Label is not displayed */
public boolean isFieldOnly() 
{
Object oo = get_Value(COLUMNNAME_IsFieldOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="434af685-39c8-6da3-6184-f8ac491c72d2")
public static String es_PE_FIELD_CustomAttribute_FieldOnly_Description="La etiqueta no se despliega";

@XendraTrl(Identifier="434af685-39c8-6da3-6184-f8ac491c72d2")
public static String es_PE_FIELD_CustomAttribute_FieldOnly_Help="El cuadro de verificación sólo campo indica que la columna se desplegará si una etiqueta.";

@XendraTrl(Identifier="434af685-39c8-6da3-6184-f8ac491c72d2")
public static String es_PE_FIELD_CustomAttribute_FieldOnly_Name="Sólo Campo";

@XendraField(AD_Column_ID="IsFieldOnly",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="434af685-39c8-6da3-6184-f8ac491c72d2")
public static final String FIELDNAME_CustomAttribute_FieldOnly="434af685-39c8-6da3-6184-f8ac491c72d2";

@XendraTrl(Identifier="0a1c2c60-e389-409f-2d5e-0cbaf89bb702")
public static String es_PE_COLUMN_IsFieldOnly_Name="Sólo Campo";

@XendraColumn(AD_Element_ID="c5052e98-77cf-c61e-27bf-8596700627af",ColumnName="IsFieldOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a1c2c60-e389-409f-2d5e-0cbaf89bb702",
Synchronized="2017-08-05 16:52:22.0")
/** Column name IsFieldOnly */
public static final String COLUMNNAME_IsFieldOnly = "IsFieldOnly";
/** Set Heading only.
@param IsHeading Field without Column - Only label is displayed */
public void setIsHeading (boolean IsHeading)
{
set_Value (COLUMNNAME_IsHeading, Boolean.valueOf(IsHeading));
}
/** Get Heading only.
@return Field without Column - Only label is displayed */
public boolean isHeading() 
{
Object oo = get_Value(COLUMNNAME_IsHeading);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f91d5ebd-ed33-c701-38c2-bf3ef9fe0b1f")
public static String es_PE_FIELD_CustomAttribute_HeadingOnly_Description="Campo sin columna - Solamente la etiqueta es desplegada";

@XendraTrl(Identifier="f91d5ebd-ed33-c701-38c2-bf3ef9fe0b1f")
public static String es_PE_FIELD_CustomAttribute_HeadingOnly_Help="El Cuadro de Verificación Solamente Encabezados indica si solamente la etiqueta se desplegará  en la pantalla";

@XendraTrl(Identifier="f91d5ebd-ed33-c701-38c2-bf3ef9fe0b1f")
public static String es_PE_FIELD_CustomAttribute_HeadingOnly_Name="Sólo Encabezado";

@XendraField(AD_Column_ID="IsHeading",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f91d5ebd-ed33-c701-38c2-bf3ef9fe0b1f")
public static final String FIELDNAME_CustomAttribute_HeadingOnly="f91d5ebd-ed33-c701-38c2-bf3ef9fe0b1f";

@XendraTrl(Identifier="5146fbbe-5899-e157-2076-7f4474a3f750")
public static String es_PE_COLUMN_IsHeading_Name="Sólo Encabezado";

@XendraColumn(AD_Element_ID="5c4865de-34f5-4fd5-6e1e-15db9ff13073",ColumnName="IsHeading",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5146fbbe-5899-e157-2076-7f4474a3f750",
Synchronized="2017-08-05 16:52:22.0")
/** Column name IsHeading */
public static final String COLUMNNAME_IsHeading = "IsHeading";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="43ff85cc-4f28-0f86-861b-5d87d6e09e07")
public static String es_PE_FIELD_CustomAttribute_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="43ff85cc-4f28-0f86-861b-5d87d6e09e07")
public static String es_PE_FIELD_CustomAttribute_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="43ff85cc-4f28-0f86-861b-5d87d6e09e07")
public static String es_PE_FIELD_CustomAttribute_Mandatory_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43ff85cc-4f28-0f86-861b-5d87d6e09e07")
public static final String FIELDNAME_CustomAttribute_Mandatory="43ff85cc-4f28-0f86-861b-5d87d6e09e07";

@XendraTrl(Identifier="4b71500b-3429-34ee-9f7d-de54176e1cb4")
public static String es_PE_COLUMN_IsMandatory_Name="Entrada Obligatoria";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b71500b-3429-34ee-9f7d-de54176e1cb4",
Synchronized="2017-08-05 16:52:23.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0479af64-02bb-180f-c211-241737d33654")
public static String es_PE_FIELD_CustomAttribute_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="0479af64-02bb-180f-c211-241737d33654")
public static String es_PE_FIELD_CustomAttribute_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="0479af64-02bb-180f-c211-241737d33654")
public static String es_PE_FIELD_CustomAttribute_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0479af64-02bb-180f-c211-241737d33654")
public static final String FIELDNAME_CustomAttribute_ReadOnly="0479af64-02bb-180f-c211-241737d33654";

@XendraTrl(Identifier="550f7bb5-f389-9ac7-d62a-474a79900d0f")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="550f7bb5-f389-9ac7-d62a-474a79900d0f",
Synchronized="2017-08-05 16:52:23.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Same Line.
@param IsSameLine Displayed on same line as previous field */
public void setIsSameLine (boolean IsSameLine)
{
set_Value (COLUMNNAME_IsSameLine, Boolean.valueOf(IsSameLine));
}
/** Get Same Line.
@return Displayed on same line as previous field */
public boolean isSameLine() 
{
Object oo = get_Value(COLUMNNAME_IsSameLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="efff89e6-96ba-250c-17d1-8efdc4164adf")
public static String es_PE_FIELD_CustomAttribute_SameLine_Description="Desplegado en la misma línea que el campo previo";

@XendraTrl(Identifier="efff89e6-96ba-250c-17d1-8efdc4164adf")
public static String es_PE_FIELD_CustomAttribute_SameLine_Help="El cuadro de verificación misma línea indica que este campo se desplegará en la misma línea que el campo previo.";

@XendraTrl(Identifier="efff89e6-96ba-250c-17d1-8efdc4164adf")
public static String es_PE_FIELD_CustomAttribute_SameLine_Name="Misma Línea";

@XendraField(AD_Column_ID="IsSameLine",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="efff89e6-96ba-250c-17d1-8efdc4164adf")
public static final String FIELDNAME_CustomAttribute_SameLine="efff89e6-96ba-250c-17d1-8efdc4164adf";

@XendraTrl(Identifier="a9d61e5d-292e-6a76-dd95-2fe0f3c1bb43")
public static String es_PE_COLUMN_IsSameLine_Name="Misma Línea";

@XendraColumn(AD_Element_ID="855d68c0-e401-f8a8-00b1-ed4eeb2e6138",ColumnName="IsSameLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9d61e5d-292e-6a76-dd95-2fe0f3c1bb43",
Synchronized="2017-08-05 16:52:23.0")
/** Column name IsSameLine */
public static final String COLUMNNAME_IsSameLine = "IsSameLine";
/** Set Updateable.
@param IsUpdateable Determines, if the field can be UPDATED */
public void setIsUpdateable (boolean IsUpdateable)
{
set_Value (COLUMNNAME_IsUpdateable, Boolean.valueOf(IsUpdateable));
}
/** Get Updateable.
@return Determines, if the field can be UPDATED */
public boolean isUpdateable() 
{
Object oo = get_Value(COLUMNNAME_IsUpdateable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ab0af88b-5443-471d-70c1-c38deef9cc5d")
public static String es_PE_FIELD_CustomAttribute_Updateable_Description="Determina si el campo puede ser actualizado";

@XendraTrl(Identifier="ab0af88b-5443-471d-70c1-c38deef9cc5d")
public static String es_PE_FIELD_CustomAttribute_Updateable_Help="El Cuadro de Verificación Actualizable indica si este campo puede ser actualizado por el usuario";

@XendraTrl(Identifier="ab0af88b-5443-471d-70c1-c38deef9cc5d")
public static String es_PE_FIELD_CustomAttribute_Updateable_Name="Actualizable";

@XendraField(AD_Column_ID="IsUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab0af88b-5443-471d-70c1-c38deef9cc5d")
public static final String FIELDNAME_CustomAttribute_Updateable="ab0af88b-5443-471d-70c1-c38deef9cc5d";

@XendraTrl(Identifier="6ff3b424-d89c-8959-861f-61fbade4880b")
public static String es_PE_COLUMN_IsUpdateable_Name="Actualizable";

@XendraColumn(AD_Element_ID="a793d4db-fec3-ab3c-10ca-23558b3015cb",ColumnName="IsUpdateable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ff3b424-d89c-8959-861f-61fbade4880b",
Synchronized="2017-08-05 16:52:23.0")
/** Column name IsUpdateable */
public static final String COLUMNNAME_IsUpdateable = "IsUpdateable";
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

@XendraTrl(Identifier="8810c77a-6f62-99bd-fc7b-0dea584dec2f")
public static String es_PE_FIELD_CustomAttribute_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="8810c77a-6f62-99bd-fc7b-0dea584dec2f")
public static String es_PE_FIELD_CustomAttribute_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="8810c77a-6f62-99bd-fc7b-0dea584dec2f")
public static String es_PE_FIELD_CustomAttribute_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8810c77a-6f62-99bd-fc7b-0dea584dec2f")
public static final String FIELDNAME_CustomAttribute_Name="8810c77a-6f62-99bd-fc7b-0dea584dec2f";

@XendraTrl(Identifier="38de6d5b-24f2-efb4-ca03-094b42a8c725")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38de6d5b-24f2-efb4-ca03-094b42a8c725",
Synchronized="2017-08-05 16:52:23.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="5079ee4e-f945-1c87-f10a-6bbf49b20699")
public static String es_PE_FIELD_CustomAttribute_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="5079ee4e-f945-1c87-f10a-6bbf49b20699")
public static String es_PE_FIELD_CustomAttribute_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="5079ee4e-f945-1c87-f10a-6bbf49b20699")
public static String es_PE_FIELD_CustomAttribute_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5079ee4e-f945-1c87-f10a-6bbf49b20699")
public static final String FIELDNAME_CustomAttribute_Sequence="5079ee4e-f945-1c87-f10a-6bbf49b20699";

@XendraTrl(Identifier="e3fd6ee6-9c89-4803-eaeb-7a329841999e")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3fd6ee6-9c89-4803-eaeb-7a329841999e",
Synchronized="2017-08-05 16:52:23.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Max. Value.
@param ValueMax Maximum Value for a field */
public void setValueMax (String ValueMax)
{
if (ValueMax != null && ValueMax.length() > 20)
{
log.warning("Length > 20 - truncated");
ValueMax = ValueMax.substring(0,19);
}
set_Value (COLUMNNAME_ValueMax, ValueMax);
}
/** Get Max. Value.
@return Maximum Value for a field */
public String getValueMax() 
{
String value = (String)get_Value(COLUMNNAME_ValueMax);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cb821939-5734-ef27-31a4-d83de0e95ac8")
public static String es_PE_FIELD_CustomAttribute_MaxValue_Description="Valor Máximo de un campo";

@XendraTrl(Identifier="cb821939-5734-ef27-31a4-d83de0e95ac8")
public static String es_PE_FIELD_CustomAttribute_MaxValue_Help="El Valor Máximo indica el valor más alto permisible para un campo";

@XendraTrl(Identifier="cb821939-5734-ef27-31a4-d83de0e95ac8")
public static String es_PE_FIELD_CustomAttribute_MaxValue_Name="Valor Máximo";

@XendraField(AD_Column_ID="ValueMax",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb821939-5734-ef27-31a4-d83de0e95ac8")
public static final String FIELDNAME_CustomAttribute_MaxValue="cb821939-5734-ef27-31a4-d83de0e95ac8";

@XendraTrl(Identifier="2cf744ee-3658-936b-d615-41f2a8c0edb4")
public static String es_PE_COLUMN_ValueMax_Name="Valor Máximo";

@XendraColumn(AD_Element_ID="9a379735-7a4d-6bc7-3c02-7c24576e4604",ColumnName="ValueMax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2cf744ee-3658-936b-d615-41f2a8c0edb4",
Synchronized="2017-08-05 16:52:23.0")
/** Column name ValueMax */
public static final String COLUMNNAME_ValueMax = "ValueMax";
/** Set Min. Value.
@param ValueMin Minimum Value for a field */
public void setValueMin (String ValueMin)
{
if (ValueMin != null && ValueMin.length() > 20)
{
log.warning("Length > 20 - truncated");
ValueMin = ValueMin.substring(0,19);
}
set_Value (COLUMNNAME_ValueMin, ValueMin);
}
/** Get Min. Value.
@return Minimum Value for a field */
public String getValueMin() 
{
String value = (String)get_Value(COLUMNNAME_ValueMin);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c4f420fd-707d-d825-8447-a2d4f6f277ef")
public static String es_PE_FIELD_CustomAttribute_MinValue_Description="Valor Mínimo de un campo";

@XendraTrl(Identifier="c4f420fd-707d-d825-8447-a2d4f6f277ef")
public static String es_PE_FIELD_CustomAttribute_MinValue_Help="El Valor Mínimo indica el menor valor permisible para un campo";

@XendraTrl(Identifier="c4f420fd-707d-d825-8447-a2d4f6f277ef")
public static String es_PE_FIELD_CustomAttribute_MinValue_Name="Valor Mínimo";

@XendraField(AD_Column_ID="ValueMin",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4f420fd-707d-d825-8447-a2d4f6f277ef")
public static final String FIELDNAME_CustomAttribute_MinValue="c4f420fd-707d-d825-8447-a2d4f6f277ef";

@XendraTrl(Identifier="725d9972-874f-3c1b-4242-ecc7ac443aa3")
public static String es_PE_COLUMN_ValueMin_Name="Valor Mínimo";

@XendraColumn(AD_Element_ID="4017e4d8-25ab-786b-f835-a0847fb18a89",ColumnName="ValueMin",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="725d9972-874f-3c1b-4242-ecc7ac443aa3",
Synchronized="2017-08-05 16:52:23.0")
/** Column name ValueMin */
public static final String COLUMNNAME_ValueMin = "ValueMin";
/** Set Value Format.
@param VFormat Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setVFormat (String VFormat)
{
if (VFormat != null && VFormat.length() > 60)
{
log.warning("Length > 60 - truncated");
VFormat = VFormat.substring(0,59);
}
set_Value (COLUMNNAME_VFormat, VFormat);
}
/** Get Value Format.
@return Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getVFormat() 
{
String value = (String)get_Value(COLUMNNAME_VFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ac2f64a7-278b-9a55-d906-0229f945f716")
public static String es_PE_FIELD_CustomAttribute_ValueFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="ac2f64a7-278b-9a55-d906-0229f945f716")
public static String es_PE_FIELD_CustomAttribute_ValueFormat_Help="<B>Elementos de validación:</B>";

@XendraTrl(Identifier="ac2f64a7-278b-9a55-d906-0229f945f716")
public static String es_PE_FIELD_CustomAttribute_ValueFormat_Name="Formato del Valor";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="825b7984-f755-968c-6669-7334c98b6f8a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac2f64a7-278b-9a55-d906-0229f945f716")
public static final String FIELDNAME_CustomAttribute_ValueFormat="ac2f64a7-278b-9a55-d906-0229f945f716";

@XendraTrl(Identifier="b4ec8702-a3bd-b601-0f61-88654e44ee2b")
public static String es_PE_COLUMN_VFormat_Name="Formato del Valor";

@XendraColumn(AD_Element_ID="041d14f4-3102-bf3a-cf36-5153817cbfad",ColumnName="VFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4ec8702-a3bd-b601-0f61-88654e44ee2b",
Synchronized="2017-08-05 16:52:23.0")
/** Column name VFormat */
public static final String COLUMNNAME_VFormat = "VFormat";
}
