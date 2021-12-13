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
/** Generated Model for AD_SysConfig
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_SysConfig extends PO
{
/** Standard Constructor
@param ctx context
@param AD_SysConfig_ID id
@param trxName transaction
*/
public X_AD_SysConfig (Properties ctx, int AD_SysConfig_ID, String trxName)
{
super (ctx, AD_SysConfig_ID, trxName);
/** if (AD_SysConfig_ID == 0)
{
setAD_SysConfig_ID (0);
setEntityType (null);
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
public X_AD_SysConfig (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=50009 */
public static int Table_ID=MTable.getTable_ID("AD_SysConfig");

@XendraTrl(Identifier="9ad8fd77-c0e5-5b2a-24b0-934da761dbf3")
public static String es_PE_TAB_SystemConfigurator_Name="System Configurator";

@XendraTab(Name="System Configurator",Description="",Help="",
AD_Window_ID="7da5877e-1188-68e4-9ce1-0ac12366ad10",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9ad8fd77-c0e5-5b2a-24b0-934da761dbf3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SystemConfigurator="9ad8fd77-c0e5-5b2a-24b0-934da761dbf3";

@XendraTrl(Identifier="91b64a8b-d61b-65b6-cccf-726456552c4c")
public static String es_PE_TABLE_AD_SysConfig_Name="System Configurator";

@XendraTable(Name="System Configurator",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_SysConfig",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="91b64a8b-d61b-65b6-cccf-726456552c4c",
Synchronized="2020-03-03 21:35:56.0")
/** TableName=AD_SysConfig */
public static final String Table_Name="AD_SysConfig";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_SysConfig");

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
    Table_ID = MTable.getTable_ID("AD_SysConfig");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_SysConfig[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Configurator.
@param AD_SysConfig_ID System Configurator */
public void setAD_SysConfig_ID (int AD_SysConfig_ID)
{
if (AD_SysConfig_ID < 1) throw new IllegalArgumentException ("AD_SysConfig_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_SysConfig_ID, Integer.valueOf(AD_SysConfig_ID));
}
/** Get System Configurator.
@return System Configurator */
public int getAD_SysConfig_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_SysConfig_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d3ca86a5-e6de-a98a-91f6-ed422bc41366")
public static String es_PE_FIELD_SystemConfigurator_SystemConfigurator_Name="System Configurator";

@XendraField(AD_Column_ID="AD_SysConfig_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ad8fd77-c0e5-5b2a-24b0-934da761dbf3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3ca86a5-e6de-a98a-91f6-ed422bc41366")
public static final String FIELDNAME_SystemConfigurator_SystemConfigurator="d3ca86a5-e6de-a98a-91f6-ed422bc41366";
/** Column name AD_SysConfig_ID */
public static final String COLUMNNAME_AD_SysConfig_ID = "AD_SysConfig_ID";
/** Set Configuration Level.
@param ConfigurationLevel Configuration Level for this parameter */
public void setConfigurationLevel (String ConfigurationLevel)
{
if (ConfigurationLevel != null && ConfigurationLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
ConfigurationLevel = ConfigurationLevel.substring(0,0);
}
set_Value (COLUMNNAME_ConfigurationLevel, ConfigurationLevel);
}
/** Get Configuration Level.
@return Configuration Level for this parameter */
public String getConfigurationLevel() 
{
return (String)get_Value(COLUMNNAME_ConfigurationLevel);
}

@XendraTrl(Identifier="f8e5c580-ddc2-7efe-1275-f9d09bfbbda9")
public static String es_PE_COLUMN_ConfigurationLevel_Name="configurationlevel";

@XendraColumn(AD_Element_ID="9c4120e3-aa96-354f-ed4e-f4dec7fa7db6",ColumnName="ConfigurationLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="457c7edc-dcc7-84ca-cff6-775cac78f43e",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f8e5c580-ddc2-7efe-1275-f9d09bfbbda9",Synchronized="2019-08-30 22:20:42.0")
/** Column name ConfigurationLevel */
public static final String COLUMNNAME_ConfigurationLevel = "ConfigurationLevel";
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

@XendraTrl(Identifier="6c34507c-ac0e-7bb0-b396-f2fcb1f7956e")
public static String es_PE_FIELD_SystemConfigurator_Description_Name="Observación";

@XendraTrl(Identifier="6c34507c-ac0e-7bb0-b396-f2fcb1f7956e")
public static String es_PE_FIELD_SystemConfigurator_Description_Description="Observación";

@XendraTrl(Identifier="6c34507c-ac0e-7bb0-b396-f2fcb1f7956e")
public static String es_PE_FIELD_SystemConfigurator_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9ad8fd77-c0e5-5b2a-24b0-934da761dbf3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c34507c-ac0e-7bb0-b396-f2fcb1f7956e")
public static final String FIELDNAME_SystemConfigurator_Description="6c34507c-ac0e-7bb0-b396-f2fcb1f7956e";

@XendraTrl(Identifier="f33e9bec-dd6a-d502-0753-f509e53ef7ab")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f33e9bec-dd6a-d502-0753-f509e53ef7ab",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 40)
{
log.warning("Length > 40 - truncated");
EntityType = EntityType.substring(0,39);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="7bc04281-9c1d-99b5-f2e6-e30d36240fa3")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=40,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7bc04281-9c1d-99b5-f2e6-e30d36240fa3",Synchronized="2019-08-30 22:20:42.0")
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
@XendraTrl(Identifier="d76be74b-53eb-4b42-b456-37b04eefca55")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d76be74b-53eb-4b42-b456-37b04eefca55",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 100)
{
log.warning("Length > 100 - truncated");
Name = Name.substring(0,99);
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

@XendraTrl(Identifier="a422b4de-32e4-a29e-8328-5d7800c2a188")
public static String es_PE_FIELD_SystemConfigurator_Name_Name="Nombre";

@XendraTrl(Identifier="a422b4de-32e4-a29e-8328-5d7800c2a188")
public static String es_PE_FIELD_SystemConfigurator_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a422b4de-32e4-a29e-8328-5d7800c2a188")
public static String es_PE_FIELD_SystemConfigurator_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="9ad8fd77-c0e5-5b2a-24b0-934da761dbf3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=100,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a422b4de-32e4-a29e-8328-5d7800c2a188")
public static final String FIELDNAME_SystemConfigurator_Name="a422b4de-32e4-a29e-8328-5d7800c2a188";

@XendraTrl(Identifier="266c51a2-1579-71dc-5dbd-06e87610ffe4")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="266c51a2-1579-71dc-5dbd-06e87610ffe4",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 255)
{
log.warning("Length > 255 - truncated");
Value = Value.substring(0,254);
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
@XendraTrl(Identifier="ab53f87f-a7b6-5f3c-82de-93fef1329834")
public static String es_PE_FIELD_SystemConfigurator_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="ab53f87f-a7b6-5f3c-82de-93fef1329834")
public static String es_PE_FIELD_SystemConfigurator_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="ab53f87f-a7b6-5f3c-82de-93fef1329834")
public static String es_PE_FIELD_SystemConfigurator_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="9ad8fd77-c0e5-5b2a-24b0-934da761dbf3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab53f87f-a7b6-5f3c-82de-93fef1329834")
public static final String FIELDNAME_SystemConfigurator_SearchKey="ab53f87f-a7b6-5f3c-82de-93fef1329834";

@XendraTrl(Identifier="715a0e49-eb8a-4b0f-1206-9cfcf31c6a46")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="715a0e49-eb8a-4b0f-1206-9cfcf31c6a46",
Synchronized="2019-08-30 22:20:42.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
