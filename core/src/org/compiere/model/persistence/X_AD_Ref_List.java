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
/** Generated Model for AD_Ref_List
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Ref_List extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Ref_List_ID id
@param trxName transaction
*/
public X_AD_Ref_List (Properties ctx, int AD_Ref_List_ID, String trxName)
{
super (ctx, AD_Ref_List_ID, trxName);
/** if (AD_Ref_List_ID == 0)
{
setAD_Reference_ID (0);
setAD_Ref_List_ID (0);
setEntityType (null);	
// U
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
public X_AD_Ref_List (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=104 */
public static int Table_ID=MTable.getTable_ID("AD_Ref_List");

@XendraTrl(Identifier="37950185-5bc2-9823-5d8a-53c6dc9d6933")
public static String es_PE_TAB_ListValidation_Description="Lista de Referencia";

@XendraTrl(Identifier="37950185-5bc2-9823-5d8a-53c6dc9d6933")
public static String es_PE_TAB_ListValidation_Help="La pestaña de lista de validación define listas para validar datos";

@XendraTrl(Identifier="37950185-5bc2-9823-5d8a-53c6dc9d6933")
public static String es_PE_TAB_ListValidation_Name="Validación de Lista";

@XendraTab(Name="List Validation",Description="Reference List",
Help="The List Validation Tab defines lists to validate data",
AD_Window_ID="3aa1b885-6192-d44a-f2c0-c82b9363e3f6",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",
DisplayLogic="@ValidationType@=L",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="37950185-5bc2-9823-5d8a-53c6dc9d6933",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ListValidation="37950185-5bc2-9823-5d8a-53c6dc9d6933";

@XendraTrl(Identifier="82104080-b0b8-7660-989f-e19b6bc733a1")
public static String es_PE_TABLE_AD_Ref_List_Name="Lista de Referencia";

@XendraTable(Name="Reference List",AD_Package_ID="24337a04-c03d-922c-e7ce-2876bf8880b5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Reference List based on Table",
Help="",TableName="AD_Ref_List",AccessLevel="4",
AD_Window_ID="3aa1b885-6192-d44a-f2c0-c82b9363e3f6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.request",Identifier="82104080-b0b8-7660-989f-e19b6bc733a1",
Synchronized="2020-03-03 21:35:49.0")
/** TableName=AD_Ref_List */
public static final String Table_Name="AD_Ref_List";


@XendraIndex(Name="ad_ref_list_value",Identifier="40a244dd-a146-4050-1e81-a0a6348e869c",
Column_Names="ad_reference_id, value",IsUnique="true",
TableIdentifier="40a244dd-a146-4050-1e81-a0a6348e869c",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_ref_list_value = "40a244dd-a146-4050-1e81-a0a6348e869c";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Ref_List");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_Ref_List");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Ref_List[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72f5b1f8-c7df-0bbf-4cc1-8f2ab6b8eac3")
public static String es_PE_FIELD_ListValidation_Reference_Name="Referencia";

@XendraTrl(Identifier="72f5b1f8-c7df-0bbf-4cc1-8f2ab6b8eac3")
public static String es_PE_FIELD_ListValidation_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="72f5b1f8-c7df-0bbf-4cc1-8f2ab6b8eac3")
public static String es_PE_FIELD_ListValidation_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="72f5b1f8-c7df-0bbf-4cc1-8f2ab6b8eac3")
public static final String FIELDNAME_ListValidation_Reference="72f5b1f8-c7df-0bbf-4cc1-8f2ab6b8eac3";

@XendraTrl(Identifier="237fcda6-9ebd-0de0-26b5-dd7d262bb690")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="237fcda6-9ebd-0de0-26b5-dd7d262bb690",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference List.
@param AD_Ref_List_ID Reference List based on Table */
public void setAD_Ref_List_ID (int AD_Ref_List_ID)
{
if (AD_Ref_List_ID < 1) throw new IllegalArgumentException ("AD_Ref_List_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Ref_List_ID, Integer.valueOf(AD_Ref_List_ID));
}
/** Get Reference List.
@return Reference List based on Table */
public int getAD_Ref_List_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Ref_List_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9b6948ba-4111-f905-9936-08c5f6369235")
public static String es_PE_FIELD_ListValidation_ReferenceList_Name="Lista de Referencia";

@XendraTrl(Identifier="9b6948ba-4111-f905-9936-08c5f6369235")
public static String es_PE_FIELD_ListValidation_ReferenceList_Description="Lista de Referencia basada en una Tabla";

@XendraTrl(Identifier="9b6948ba-4111-f905-9936-08c5f6369235")
public static String es_PE_FIELD_ListValidation_ReferenceList_Help="El campo lista de referencia indica una lista de valores de referencia desde las tablas de una base de datos. Las listas de referencia integran los cuadros de despliegue hacia abajo en las pantallas de entrada de datos";

@XendraField(AD_Column_ID="AD_Ref_List_ID",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ValidationType@=L",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9b6948ba-4111-f905-9936-08c5f6369235")
public static final String FIELDNAME_ListValidation_ReferenceList="9b6948ba-4111-f905-9936-08c5f6369235";
/** Column name AD_Ref_List_ID */
public static final String COLUMNNAME_AD_Ref_List_ID = "AD_Ref_List_ID";
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

@XendraTrl(Identifier="5873b3a0-c55e-aad5-50d3-7cca65e3826b")
public static String es_PE_FIELD_ListValidation_Description_Name="Observación";

@XendraTrl(Identifier="5873b3a0-c55e-aad5-50d3-7cca65e3826b")
public static String es_PE_FIELD_ListValidation_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="5873b3a0-c55e-aad5-50d3-7cca65e3826b")
public static String es_PE_FIELD_ListValidation_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5873b3a0-c55e-aad5-50d3-7cca65e3826b")
public static final String FIELDNAME_ListValidation_Description="5873b3a0-c55e-aad5-50d3-7cca65e3826b";

@XendraTrl(Identifier="92279dcd-510d-c818-1a9d-6ececbb56d57")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92279dcd-510d-c818-1a9d-6ececbb56d57",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="dcadf6fc-cc3e-32d0-7964-37ba2e4b78df")
public static String es_PE_FIELD_ListValidation_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="dcadf6fc-cc3e-32d0-7964-37ba2e4b78df")
public static String es_PE_FIELD_ListValidation_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="dcadf6fc-cc3e-32d0-7964-37ba2e4b78df")
public static String es_PE_FIELD_ListValidation_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dcadf6fc-cc3e-32d0-7964-37ba2e4b78df")
public static final String FIELDNAME_ListValidation_EntityType="dcadf6fc-cc3e-32d0-7964-37ba2e4b78df";

@XendraTrl(Identifier="cf9a8a59-2f5b-8dae-92ea-06de5fa24e14")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cf9a8a59-2f5b-8dae-92ea-06de5fa24e14",Synchronized="2019-08-30 22:20:37.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
@XendraTrl(Identifier="7b614c93-4047-2b5b-f657-79ab3ce6b96b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b614c93-4047-2b5b-f657-79ab3ce6b96b",
Synchronized="2019-08-30 22:20:37.0")
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

@XendraTrl(Identifier="ff6044c2-6512-5297-dfc6-32bc41377b49")
public static String es_PE_FIELD_ListValidation_Name_Name="Nombre";

@XendraTrl(Identifier="ff6044c2-6512-5297-dfc6-32bc41377b49")
public static String es_PE_FIELD_ListValidation_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ff6044c2-6512-5297-dfc6-32bc41377b49")
public static String es_PE_FIELD_ListValidation_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ff6044c2-6512-5297-dfc6-32bc41377b49")
public static final String FIELDNAME_ListValidation_Name="ff6044c2-6512-5297-dfc6-32bc41377b49";

@XendraTrl(Identifier="6c0c5e04-9073-65d3-73fb-859dfb645dbf")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c0c5e04-9073-65d3-73fb-859dfb645dbf",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="a597a50b-7e3c-6465-7296-68f98f51d607")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a597a50b-7e3c-6465-7296-68f98f51d607",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="d2c62995-ad6c-5d06-c17a-95a1aa9636f1")
public static String es_PE_FIELD_ListValidation_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="d2c62995-ad6c-5d06-c17a-95a1aa9636f1")
public static String es_PE_FIELD_ListValidation_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="d2c62995-ad6c-5d06-c17a-95a1aa9636f1")
public static String es_PE_FIELD_ListValidation_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d2c62995-ad6c-5d06-c17a-95a1aa9636f1")
public static final String FIELDNAME_ListValidation_ValidFrom="d2c62995-ad6c-5d06-c17a-95a1aa9636f1";

@XendraTrl(Identifier="f3fc3141-5dae-6fd1-c554-d877ab0445ef")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3fc3141-5dae-6fd1-c554-d877ab0445ef",
Synchronized="2019-08-30 22:20:37.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="2f8e017c-e495-1ab3-c4f8-9eaac36f63ec")
public static String es_PE_FIELD_ListValidation_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="2f8e017c-e495-1ab3-c4f8-9eaac36f63ec")
public static String es_PE_FIELD_ListValidation_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="2f8e017c-e495-1ab3-c4f8-9eaac36f63ec")
public static String es_PE_FIELD_ListValidation_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2f8e017c-e495-1ab3-c4f8-9eaac36f63ec")
public static final String FIELDNAME_ListValidation_ValidTo="2f8e017c-e495-1ab3-c4f8-9eaac36f63ec";

@XendraTrl(Identifier="0fc06a8e-0fab-b7d2-ca22-15d8e46f187e")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fc06a8e-0fab-b7d2-ca22-15d8e46f187e",
Synchronized="2019-08-30 22:20:37.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 60)
{
log.warning("Length > 60 - truncated");
Value = Value.substring(0,59);
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
@XendraTrl(Identifier="2c86d4a9-52df-192d-a6aa-7b67175ab3b5")
public static String es_PE_FIELD_ListValidation_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="2c86d4a9-52df-192d-a6aa-7b67175ab3b5")
public static String es_PE_FIELD_ListValidation_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="2c86d4a9-52df-192d-a6aa-7b67175ab3b5")
public static String es_PE_FIELD_ListValidation_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="37950185-5bc2-9823-5d8a-53c6dc9d6933",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2c86d4a9-52df-192d-a6aa-7b67175ab3b5")
public static final String FIELDNAME_ListValidation_SearchKey="2c86d4a9-52df-192d-a6aa-7b67175ab3b5";

@XendraTrl(Identifier="89baff48-97ed-c3d4-a104-67fe0d9f8c11")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89baff48-97ed-c3d4-a104-67fe0d9f8c11",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
