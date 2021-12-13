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
/** Generated Model for AD_Modification
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Modification extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Modification_ID id
@param trxName transaction
*/
public X_AD_Modification (Properties ctx, int AD_Modification_ID, String trxName)
{
super (ctx, AD_Modification_ID, trxName);
/** if (AD_Modification_ID == 0)
{
setAD_Modification_ID (0);
setEntityType (null);
setName (null);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Modification WHERE EntityType='@EntityType@'
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Modification (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=883 */
public static int Table_ID=MTable.getTable_ID("AD_Modification");

@XendraTrl(Identifier="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a")
public static String es_PE_TAB_SystemModifin_Description="System Modification or Extension";

@XendraTrl(Identifier="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a")
public static String es_PE_TAB_SystemModifin_Help="Description of the System modification or extension";

@XendraTrl(Identifier="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a")
public static String es_PE_TAB_SystemModifin_Name="System Modifin";

@XendraTab(Name="System Modifin",Description="System Modification or Extension",
Help="Description of the System modification or extension",
AD_Window_ID="60e49d31-29c0-776f-a49c-81392b6c1e48",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="0d9775da-bb18-84fe-cc87-74f4042d5138",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SystemModifin="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a";

@XendraTrl(Identifier="079151d6-4d61-0008-b44a-29b56660b1ab")
public static String es_PE_TABLE_AD_Modification_Name="Modification";

@XendraTable(Name="Modification",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Modification",AccessLevel="4",AD_Window_ID="60e49d31-29c0-776f-a49c-81392b6c1e48",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="079151d6-4d61-0008-b44a-29b56660b1ab",Synchronized="2020-03-03 21:35:08.0")
/** TableName=AD_Modification */
public static final String Table_Name="AD_Modification";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Modification");

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
    Table_ID = MTable.getTable_ID("AD_Modification");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Modification[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Modification.
@param AD_Modification_ID System Modification or Extension */
public void setAD_Modification_ID (int AD_Modification_ID)
{
if (AD_Modification_ID < 1) throw new IllegalArgumentException ("AD_Modification_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Modification_ID, Integer.valueOf(AD_Modification_ID));
}
/** Get Modification.
@return System Modification or Extension */
public int getAD_Modification_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Modification_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0b6b0c3a-e4ef-4ce3-d07f-4c6c5636ca0e")
public static String es_PE_FIELD_SystemModifin_Modification_Name="Modification";

@XendraTrl(Identifier="0b6b0c3a-e4ef-4ce3-d07f-4c6c5636ca0e")
public static String es_PE_FIELD_SystemModifin_Modification_Description="System Modification or Extension";

@XendraTrl(Identifier="0b6b0c3a-e4ef-4ce3-d07f-4c6c5636ca0e")
public static String es_PE_FIELD_SystemModifin_Modification_Help="Description of the System modification or extension";

@XendraField(AD_Column_ID="AD_Modification_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b6b0c3a-e4ef-4ce3-d07f-4c6c5636ca0e")
public static final String FIELDNAME_SystemModifin_Modification="0b6b0c3a-e4ef-4ce3-d07f-4c6c5636ca0e";
/** Column name AD_Modification_ID */
public static final String COLUMNNAME_AD_Modification_ID = "AD_Modification_ID";
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

@XendraTrl(Identifier="650d07cd-3ae3-0dd8-8b71-e7fed2098433")
public static String es_PE_FIELD_SystemModifin_Description_Name="Observación";

@XendraTrl(Identifier="650d07cd-3ae3-0dd8-8b71-e7fed2098433")
public static String es_PE_FIELD_SystemModifin_Description_Description="Observación";

@XendraTrl(Identifier="650d07cd-3ae3-0dd8-8b71-e7fed2098433")
public static String es_PE_FIELD_SystemModifin_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="650d07cd-3ae3-0dd8-8b71-e7fed2098433")
public static final String FIELDNAME_SystemModifin_Description="650d07cd-3ae3-0dd8-8b71-e7fed2098433";

@XendraTrl(Identifier="fca59869-804e-ba7a-0113-c99580252f5c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fca59869-804e-ba7a-0113-c99580252f5c",
Synchronized="2019-08-30 22:20:28.0")
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
set_ValueNoCheck (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="dcbe8960-6905-e14b-7ba2-51f09e34f957")
public static String es_PE_FIELD_SystemModifin_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="dcbe8960-6905-e14b-7ba2-51f09e34f957")
public static String es_PE_FIELD_SystemModifin_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="dcbe8960-6905-e14b-7ba2-51f09e34f957")
public static String es_PE_FIELD_SystemModifin_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcbe8960-6905-e14b-7ba2-51f09e34f957")
public static final String FIELDNAME_SystemModifin_EntityType="dcbe8960-6905-e14b-7ba2-51f09e34f957";

@XendraTrl(Identifier="0d9775da-bb18-84fe-cc87-74f4042d5138")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0d9775da-bb18-84fe-cc87-74f4042d5138",Synchronized="2019-08-30 22:20:28.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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

@XendraTrl(Identifier="db541539-d90b-fb0b-a2bc-af8e1e8c810f")
public static String es_PE_FIELD_SystemModifin_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="db541539-d90b-fb0b-a2bc-af8e1e8c810f")
public static String es_PE_FIELD_SystemModifin_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="db541539-d90b-fb0b-a2bc-af8e1e8c810f")
public static String es_PE_FIELD_SystemModifin_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db541539-d90b-fb0b-a2bc-af8e1e8c810f")
public static final String FIELDNAME_SystemModifin_CommentHelp="db541539-d90b-fb0b-a2bc-af8e1e8c810f";

@XendraTrl(Identifier="75c99ba0-c62a-8d77-fbf0-ab5ac29507e7")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75c99ba0-c62a-8d77-fbf0-ab5ac29507e7",
Synchronized="2019-08-30 22:20:28.0")
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
@XendraTrl(Identifier="e716f110-28eb-4ed3-ba18-9a1915f8f991")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e716f110-28eb-4ed3-ba18-9a1915f8f991",
Synchronized="2019-08-30 22:20:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="09cb5799-3fe8-f448-a681-d1826562f447")
public static String es_PE_FIELD_SystemModifin_Name_Name="Nombre";

@XendraTrl(Identifier="09cb5799-3fe8-f448-a681-d1826562f447")
public static String es_PE_FIELD_SystemModifin_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="09cb5799-3fe8-f448-a681-d1826562f447")
public static String es_PE_FIELD_SystemModifin_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09cb5799-3fe8-f448-a681-d1826562f447")
public static final String FIELDNAME_SystemModifin_Name="09cb5799-3fe8-f448-a681-d1826562f447";

@XendraTrl(Identifier="5fc8bdae-d7fd-453f-1401-7505be7ac15f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fc8bdae-d7fd-453f-1401-7505be7ac15f",
Synchronized="2019-08-30 22:20:28.0")
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

@XendraTrl(Identifier="c847702a-a7ce-fd61-7aee-3933815e5bb0")
public static String es_PE_FIELD_SystemModifin_Sequence_Name="Secuencia";

@XendraTrl(Identifier="c847702a-a7ce-fd61-7aee-3933815e5bb0")
public static String es_PE_FIELD_SystemModifin_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="c847702a-a7ce-fd61-7aee-3933815e5bb0")
public static String es_PE_FIELD_SystemModifin_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c847702a-a7ce-fd61-7aee-3933815e5bb0")
public static final String FIELDNAME_SystemModifin_Sequence="c847702a-a7ce-fd61-7aee-3933815e5bb0";

@XendraTrl(Identifier="9f29fd99-00e4-8f56-6735-088cf68f652f")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_Modification WHERE EntityType='@EntityType@'",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f29fd99-00e4-8f56-6735-088cf68f652f",
Synchronized="2019-08-30 22:20:28.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (String Version)
{
if (Version != null && Version.length() > 20)
{
log.warning("Length > 20 - truncated");
Version = Version.substring(0,19);
}
set_Value (COLUMNNAME_Version, Version);
}
/** Get Version.
@return Version of the table definition */
public String getVersion() 
{
String value = (String)get_Value(COLUMNNAME_Version);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4ca33db5-07ff-b62f-daa6-dafbca910e34")
public static String es_PE_FIELD_SystemModifin_Version_Name="Versión";

@XendraTrl(Identifier="4ca33db5-07ff-b62f-daa6-dafbca910e34")
public static String es_PE_FIELD_SystemModifin_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="4ca33db5-07ff-b62f-daa6-dafbca910e34")
public static String es_PE_FIELD_SystemModifin_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="9c5e8c33-c5d9-eb3f-55d9-d03c4070bd5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ca33db5-07ff-b62f-daa6-dafbca910e34")
public static final String FIELDNAME_SystemModifin_Version="4ca33db5-07ff-b62f-daa6-dafbca910e34";

@XendraTrl(Identifier="97c9cbb8-1a0a-d326-3bc6-b3cc5629a998")
public static String es_PE_COLUMN_Version_Name="Versión";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97c9cbb8-1a0a-d326-3bc6-b3cc5629a998",
Synchronized="2019-08-30 22:20:28.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
}
