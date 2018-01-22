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
/** Generated Model for M_FreightCategory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_FreightCategory extends PO
{
/** Standard Constructor
@param ctx context
@param M_FreightCategory_ID id
@param trxName transaction
*/
public X_M_FreightCategory (Properties ctx, int M_FreightCategory_ID, String trxName)
{
super (ctx, M_FreightCategory_ID, trxName);
/** if (M_FreightCategory_ID == 0)
{
setM_FreightCategory_ID (0);
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_FreightCategory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=595 */
public static int Table_ID=MTable.getTable_ID("M_FreightCategory");

@XendraTrl(Identifier="6d01c853-294a-ae12-5bbb-bd008c7ba790")
public static String es_PE_TAB_FreightCategory_Description="Categoria de Fletes";

@XendraTrl(Identifier="6d01c853-294a-ae12-5bbb-bd008c7ba790")
public static String es_PE_TAB_FreightCategory_Name="Categoría Fletes";

@XendraTrl(Identifier="6d01c853-294a-ae12-5bbb-bd008c7ba790")
public static String es_PE_TAB_FreightCategory_Help="Las Categorías de la Fletes se utilizan para calcular los fletes para el expedidor seleccionado";

@XendraTab(Name="Freight Category",Description="Category of the Freight",
Help="Freight Categories are used to calculate the Freight for the Shipper selected",
AD_Window_ID="6538ebf5-2abc-9321-4c7a-36cdbbfe77aa",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6d01c853-294a-ae12-5bbb-bd008c7ba790",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FreightCategory="6d01c853-294a-ae12-5bbb-bd008c7ba790";

@XendraTrl(Identifier="c041757e-71f0-8c1f-f1ba-1cc068f2cffe")
public static String es_PE_TABLE_M_FreightCategory_Name="Categoría de Fletes";

@XendraTable(Name="Freight Category",Description="Category of the Freight",Help="",
TableName="M_FreightCategory",AccessLevel="3",AD_Window_ID="6538ebf5-2abc-9321-4c7a-36cdbbfe77aa",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="c041757e-71f0-8c1f-f1ba-1cc068f2cffe",Synchronized="2017-08-16 11:43:12.0")
/** TableName=M_FreightCategory */
public static final String Table_Name="M_FreightCategory";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_FreightCategory");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("M_FreightCategory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_FreightCategory[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="1a535d0e-da2d-70d7-7b02-af70981701bb")
public static String es_PE_FIELD_FreightCategory_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="1a535d0e-da2d-70d7-7b02-af70981701bb")
public static String es_PE_FIELD_FreightCategory_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="1a535d0e-da2d-70d7-7b02-af70981701bb")
public static String es_PE_FIELD_FreightCategory_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6d01c853-294a-ae12-5bbb-bd008c7ba790",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a535d0e-da2d-70d7-7b02-af70981701bb")
public static final String FIELDNAME_FreightCategory_Description="1a535d0e-da2d-70d7-7b02-af70981701bb";

@XendraTrl(Identifier="8a094930-3a1a-295f-4548-ebe7b44cdf4c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a094930-3a1a-295f-4548-ebe7b44cdf4c",
Synchronized="2017-08-05 16:55:07.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="a3f0b087-4d28-57b2-903e-b06ca5eaf6ab")
public static String es_PE_FIELD_FreightCategory_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="a3f0b087-4d28-57b2-903e-b06ca5eaf6ab")
public static String es_PE_FIELD_FreightCategory_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="a3f0b087-4d28-57b2-903e-b06ca5eaf6ab")
public static String es_PE_FIELD_FreightCategory_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="6d01c853-294a-ae12-5bbb-bd008c7ba790",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3f0b087-4d28-57b2-903e-b06ca5eaf6ab")
public static final String FIELDNAME_FreightCategory_CommentHelp="a3f0b087-4d28-57b2-903e-b06ca5eaf6ab";

@XendraTrl(Identifier="f18c1bf2-9086-b372-00f9-433d4380f263")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f18c1bf2-9086-b372-00f9-433d4380f263",
Synchronized="2017-08-05 16:55:07.0")
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
@XendraTrl(Identifier="4ffd69f5-81b1-4b64-b4e8-7780f745e720")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ffd69f5-81b1-4b64-b4e8-7780f745e720",
Synchronized="2017-08-05 16:55:07.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Freight Category.
@param M_FreightCategory_ID Category of the Freight */
public void setM_FreightCategory_ID (int M_FreightCategory_ID)
{
if (M_FreightCategory_ID < 1) throw new IllegalArgumentException ("M_FreightCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_FreightCategory_ID, Integer.valueOf(M_FreightCategory_ID));
}
/** Get Freight Category.
@return Category of the Freight */
public int getM_FreightCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_FreightCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="996353ac-d393-557c-e068-0a5bf35f4700")
public static String es_PE_FIELD_FreightCategory_FreightCategory_Description="Categoría de Fletes";

@XendraTrl(Identifier="996353ac-d393-557c-e068-0a5bf35f4700")
public static String es_PE_FIELD_FreightCategory_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="996353ac-d393-557c-e068-0a5bf35f4700")
public static String es_PE_FIELD_FreightCategory_FreightCategory_Name="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6d01c853-294a-ae12-5bbb-bd008c7ba790",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="996353ac-d393-557c-e068-0a5bf35f4700")
public static final String FIELDNAME_FreightCategory_FreightCategory="996353ac-d393-557c-e068-0a5bf35f4700";
/** Column name M_FreightCategory_ID */
public static final String COLUMNNAME_M_FreightCategory_ID = "M_FreightCategory_ID";
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

@XendraTrl(Identifier="be5476d8-34dc-533f-ee84-7245cd1d433e")
public static String es_PE_FIELD_FreightCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="be5476d8-34dc-533f-ee84-7245cd1d433e")
public static String es_PE_FIELD_FreightCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="be5476d8-34dc-533f-ee84-7245cd1d433e")
public static String es_PE_FIELD_FreightCategory_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="6d01c853-294a-ae12-5bbb-bd008c7ba790",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be5476d8-34dc-533f-ee84-7245cd1d433e")
public static final String FIELDNAME_FreightCategory_Name="be5476d8-34dc-533f-ee84-7245cd1d433e";

@XendraTrl(Identifier="e1e4338f-4f7a-42cb-8a31-abc70fd58ccc")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1e4338f-4f7a-42cb-8a31-abc70fd58ccc",
Synchronized="2017-08-05 16:55:07.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6ee8b6e6-e3a1-cac1-e473-9a8bba0a648f")
public static String es_PE_FIELD_FreightCategory_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="6ee8b6e6-e3a1-cac1-e473-9a8bba0a648f")
public static String es_PE_FIELD_FreightCategory_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="6ee8b6e6-e3a1-cac1-e473-9a8bba0a648f")
public static String es_PE_FIELD_FreightCategory_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="6d01c853-294a-ae12-5bbb-bd008c7ba790",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ee8b6e6-e3a1-cac1-e473-9a8bba0a648f")
public static final String FIELDNAME_FreightCategory_SearchKey="6ee8b6e6-e3a1-cac1-e473-9a8bba0a648f";

@XendraTrl(Identifier="c8145609-4be1-39d9-f477-f3e6aee33692")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8145609-4be1-39d9-f477-f3e6aee33692",
Synchronized="2017-08-05 16:55:07.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
