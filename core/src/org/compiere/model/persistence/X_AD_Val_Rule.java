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
import org.compiere.model.reference.REF_AD_ValidationRuleTypes;
/** Generated Model for AD_Val_Rule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Val_Rule extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Val_Rule_ID id
@param trxName transaction
*/
public X_AD_Val_Rule (Properties ctx, int AD_Val_Rule_ID, String trxName)
{
super (ctx, AD_Val_Rule_ID, trxName);
/** if (AD_Val_Rule_ID == 0)
{
setAD_Val_Rule_ID (0);
setEntityType (null);	
// U
setName (null);
setType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Val_Rule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=108 */
public static int Table_ID=MTable.getTable_ID("AD_Val_Rule");

@XendraTrl(Identifier="b2da6be0-0467-2f04-9c2f-333192153f0b")
public static String es_PE_TAB_Validation_Description="Reglas de Validación";

@XendraTrl(Identifier="b2da6be0-0467-2f04-9c2f-333192153f0b")
public static String es_PE_TAB_Validation_Name="Validación";

@XendraTrl(Identifier="b2da6be0-0467-2f04-9c2f-333192153f0b")
public static String es_PE_TAB_Validation_Help="La pestaña de reglas de validación define todas las reglas dinámicas usadas cuando se entran y mantienen columnas y campos";

@XendraTab(Name="Validation",Description="Validation Rules",
Help="The Validation Rules Tab defines all dynamic rules used when entering and maintaining columns and fields.",
AD_Window_ID="99a7f75c-af6c-e8b5-54e4-de7e130aa960",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b2da6be0-0467-2f04-9c2f-333192153f0b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Validation="b2da6be0-0467-2f04-9c2f-333192153f0b";

@XendraTrl(Identifier="b5fa1ced-cf29-4d57-2c1e-2ff73ad005c9")
public static String es_PE_TABLE_AD_Val_Rule_Name="Validación";

@XendraTable(Name="Dynamic Validation",Description="Dynamic Validation Rule",Help="",
TableName="AD_Val_Rule",AccessLevel="4",AD_Window_ID="99a7f75c-af6c-e8b5-54e4-de7e130aa960",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=50,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="b5fa1ced-cf29-4d57-2c1e-2ff73ad005c9",Synchronized="2017-08-16 11:41:07.0")
/** TableName=AD_Val_Rule */
public static final String Table_Name="AD_Val_Rule";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Val_Rule");

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
    Table_ID = MTable.getTable_ID("AD_Val_Rule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Val_Rule[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Dynamic Validation.
@param AD_Val_Rule_ID Dynamic Validation Rule */
public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
{
if (AD_Val_Rule_ID < 1) throw new IllegalArgumentException ("AD_Val_Rule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
}
/** Get Dynamic Validation.
@return Dynamic Validation Rule */
public int getAD_Val_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e2ee7438-8b33-ac40-c69c-5bffb0210cb1")
public static String es_PE_FIELD_Validation_DynamicValidation_Description="Regla de validación";

@XendraTrl(Identifier="e2ee7438-8b33-ac40-c69c-5bffb0210cb1")
public static String es_PE_FIELD_Validation_DynamicValidation_Help="La Regla de validación indica una regla de validación única en el sistema. Esas reglas definen como una entidad se determina como válida ó inválida.";

@XendraTrl(Identifier="e2ee7438-8b33-ac40-c69c-5bffb0210cb1")
public static String es_PE_FIELD_Validation_DynamicValidation_Name="Validación";

@XendraField(AD_Column_ID="AD_Val_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b2da6be0-0467-2f04-9c2f-333192153f0b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2ee7438-8b33-ac40-c69c-5bffb0210cb1")
public static final String FIELDNAME_Validation_DynamicValidation="e2ee7438-8b33-ac40-c69c-5bffb0210cb1";
/** Column name AD_Val_Rule_ID */
public static final String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
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
@XendraTrl(Identifier="e8a8e9b7-141b-d7dc-ed2b-6a5e22bf2e60")
public static String es_PE_FIELD_Validation_ValidationCode_Description="Código de Validación";

@XendraTrl(Identifier="e8a8e9b7-141b-d7dc-ed2b-6a5e22bf2e60")
public static String es_PE_FIELD_Validation_ValidationCode_Help="El código validación despliega la fecha; hora y mensaje del error";

@XendraTrl(Identifier="e8a8e9b7-141b-d7dc-ed2b-6a5e22bf2e60")
public static String es_PE_FIELD_Validation_ValidationCode_Name="Código de Validación";

@XendraField(AD_Column_ID="Code",IsCentrallyMaintained=true,
AD_Tab_ID="b2da6be0-0467-2f04-9c2f-333192153f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8a8e9b7-141b-d7dc-ed2b-6a5e22bf2e60")
public static final String FIELDNAME_Validation_ValidationCode="e8a8e9b7-141b-d7dc-ed2b-6a5e22bf2e60";

@XendraTrl(Identifier="6410c9b0-1548-bef0-8c35-1bf1bdfd2561")
public static String es_PE_COLUMN_Code_Name="Código de Validación";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6410c9b0-1548-bef0-8c35-1bf1bdfd2561",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
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

@XendraTrl(Identifier="a535adee-788c-ca4d-b72a-1b66e7df620b")
public static String es_PE_FIELD_Validation_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="a535adee-788c-ca4d-b72a-1b66e7df620b")
public static String es_PE_FIELD_Validation_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="a535adee-788c-ca4d-b72a-1b66e7df620b")
public static String es_PE_FIELD_Validation_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b2da6be0-0467-2f04-9c2f-333192153f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a535adee-788c-ca4d-b72a-1b66e7df620b")
public static final String FIELDNAME_Validation_Description="a535adee-788c-ca4d-b72a-1b66e7df620b";

@XendraTrl(Identifier="56b32d83-76f3-2001-275e-cd4aad9cdc0b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56b32d83-76f3-2001-275e-cd4aad9cdc0b",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** EntityType AD_Reference=fae4ad31-8ff1-5d5c-8d47-2426c541cd74 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
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

@XendraTrl(Identifier="cfec8997-fd33-c177-946a-dd0e45671c0c")
public static String es_PE_FIELD_Validation_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="cfec8997-fd33-c177-946a-dd0e45671c0c")
public static String es_PE_FIELD_Validation_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="cfec8997-fd33-c177-946a-dd0e45671c0c")
public static String es_PE_FIELD_Validation_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="b2da6be0-0467-2f04-9c2f-333192153f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfec8997-fd33-c177-946a-dd0e45671c0c")
public static final String FIELDNAME_Validation_EntityType="cfec8997-fd33-c177-946a-dd0e45671c0c";

@XendraTrl(Identifier="d9eec164-c59c-db3d-a4ed-003b2cfd4dbe")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d9eec164-c59c-db3d-a4ed-003b2cfd4dbe",Synchronized="2017-08-05 16:52:58.0")
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
@XendraTrl(Identifier="82c28296-1d0d-7cbf-5d04-50c01c7347a0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82c28296-1d0d-7cbf-5d04-50c01c7347a0",
Synchronized="2017-08-05 16:52:58.0")
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

@XendraTrl(Identifier="4539d1f6-a396-556f-3523-e038bfc74c5e")
public static String es_PE_FIELD_Validation_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4539d1f6-a396-556f-3523-e038bfc74c5e")
public static String es_PE_FIELD_Validation_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="4539d1f6-a396-556f-3523-e038bfc74c5e")
public static String es_PE_FIELD_Validation_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="b2da6be0-0467-2f04-9c2f-333192153f0b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4539d1f6-a396-556f-3523-e038bfc74c5e")
public static final String FIELDNAME_Validation_Name="4539d1f6-a396-556f-3523-e038bfc74c5e";

@XendraTrl(Identifier="640bdc7a-3eb3-7a76-069c-c0f1cb81e34e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="640bdc7a-3eb3-7a76-069c-c0f1cb81e34e",
Synchronized="2017-08-05 16:52:58.0")
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

@XendraTrl(Identifier="d1eab9bb-a313-e49e-fd0b-b41e71068ef4")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1eab9bb-a313-e49e-fd0b-b41e71068ef4",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";

/** Type AD_Reference=6873df46-d6ca-4407-b7b1-70f380708881 */
public static final int TYPE_AD_Reference_ID=101;
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (String Type)
{
if (Type == null) throw new IllegalArgumentException ("Type is mandatory");
if (Type.equals(REF_AD_ValidationRuleTypes.SQL) || Type.equals(REF_AD_ValidationRuleTypes.JavaLanguage) || Type.equals(REF_AD_ValidationRuleTypes.JavaScript));
 else throw new IllegalArgumentException ("Type Invalid value - " + Type + " - Reference_ID=101 - S - J - E");
if (Type.length() > 1)
{
log.warning("Length > 1 - truncated");
Type = Type.substring(0,0);
}
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public String getType() 
{
return (String)get_Value(COLUMNNAME_Type);
}

@XendraTrl(Identifier="0be35630-89ff-56ec-a1dc-fc8418dfc2a6")
public static String es_PE_FIELD_Validation_Type_Description="Tipo de validación (SQL; Java Script; Java Language)";

@XendraTrl(Identifier="0be35630-89ff-56ec-a1dc-fc8418dfc2a6")
public static String es_PE_FIELD_Validation_Type_Help="Indica el tipo de validación que ocurrirá. Esto puede ser SQL; Java Script ó Java Language.";

@XendraTrl(Identifier="0be35630-89ff-56ec-a1dc-fc8418dfc2a6")
public static String es_PE_FIELD_Validation_Type_Name="Tipo";
@XendraField(AD_Column_ID="Type",
IsCentrallyMaintained=true,AD_Tab_ID="b2da6be0-0467-2f04-9c2f-333192153f0b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0be35630-89ff-56ec-a1dc-fc8418dfc2a6")
public static final String FIELDNAME_Validation_Type="0be35630-89ff-56ec-a1dc-fc8418dfc2a6";

@XendraTrl(Identifier="1b959e1c-1906-3cb0-c808-c714b4f41f4c")
public static String es_PE_COLUMN_Type_Name="Tipo";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=17,AD_Reference_Value_ID="6873df46-d6ca-4407-b7b1-70f380708881",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1b959e1c-1906-3cb0-c808-c714b4f41f4c",Synchronized="2017-08-05 16:52:58.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
