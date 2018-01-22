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
/** Generated Model for AD_InfoWindow
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_InfoWindow extends PO
{
/** Standard Constructor
@param ctx context
@param AD_InfoWindow_ID id
@param trxName transaction
*/
public X_AD_InfoWindow (Properties ctx, int AD_InfoWindow_ID, String trxName)
{
super (ctx, AD_InfoWindow_ID, trxName);
/** if (AD_InfoWindow_ID == 0)
{
setAD_InfoWindow_ID (0);
setAD_Table_ID (0);
setEntityType (null);	
// U
setFromClause (null);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_InfoWindow (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=895 */
public static int Table_ID=MTable.getTable_ID("AD_InfoWindow");

@XendraTrl(Identifier="a1093105-e919-d85c-71e1-9b796f085000")
public static String es_PE_TAB_Window_Description="Info and search/select Window";

@XendraTrl(Identifier="a1093105-e919-d85c-71e1-9b796f085000")
public static String es_PE_TAB_Window_Name="Window";

@XendraTrl(Identifier="a1093105-e919-d85c-71e1-9b796f085000")
public static String es_PE_TAB_Window_Help="The Info window is used to search and select records as well as display information relevant to the selection.";

@XendraTab(Name="Window",Description="Info and search/select Window",
Help="The Info window is used to search and select records as well as display information relevant to the selection.",
AD_Window_ID="13edf8fc-28e0-a971-e179-35ed7fc64319",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a1093105-e919-d85c-71e1-9b796f085000",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Window="a1093105-e919-d85c-71e1-9b796f085000";

@XendraTrl(Identifier="142a5532-cfe8-c719-2e40-7b72bd09aade")
public static String es_PE_TABLE_AD_InfoWindow_Name="Info Window";

@XendraTable(Name="Info Window",Description="",Help="",TableName="AD_InfoWindow",AccessLevel="4",
AD_Window_ID="13edf8fc-28e0-a971-e179-35ed7fc64319",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="142a5532-cfe8-c719-2e40-7b72bd09aade",
Synchronized="2017-08-16 11:40:22.0")
/** TableName=AD_InfoWindow */
public static final String Table_Name="AD_InfoWindow";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_InfoWindow");

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
    Table_ID = MTable.getTable_ID("AD_InfoWindow");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_InfoWindow[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Info Window.
@param AD_InfoWindow_ID Info and search/select Window */
public void setAD_InfoWindow_ID (int AD_InfoWindow_ID)
{
if (AD_InfoWindow_ID < 1) throw new IllegalArgumentException ("AD_InfoWindow_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_InfoWindow_ID, Integer.valueOf(AD_InfoWindow_ID));
}
/** Get Info Window.
@return Info and search/select Window */
public int getAD_InfoWindow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_InfoWindow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f44b8124-3d3e-f5c4-a2fa-e149e545d649")
public static String es_PE_FIELD_Window_InfoWindow_Description="Info and search/select Window";

@XendraTrl(Identifier="f44b8124-3d3e-f5c4-a2fa-e149e545d649")
public static String es_PE_FIELD_Window_InfoWindow_Help="The Info window is used to search and select records as well as display information relevant to the selection.";

@XendraTrl(Identifier="f44b8124-3d3e-f5c4-a2fa-e149e545d649")
public static String es_PE_FIELD_Window_InfoWindow_Name="Info Window";

@XendraField(AD_Column_ID="AD_InfoWindow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f44b8124-3d3e-f5c4-a2fa-e149e545d649")
public static final String FIELDNAME_Window_InfoWindow="f44b8124-3d3e-f5c4-a2fa-e149e545d649";
/** Column name AD_InfoWindow_ID */
public static final String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
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

@XendraTrl(Identifier="fe31e29d-fad8-8bdf-8f92-16ee279a8965")
public static String es_PE_FIELD_Window_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="fe31e29d-fad8-8bdf-8f92-16ee279a8965")
public static String es_PE_FIELD_Window_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="fe31e29d-fad8-8bdf-8f92-16ee279a8965")
public static String es_PE_FIELD_Window_Table_Name="Tabla";
@XendraField(AD_Column_ID="AD_Table_ID",
IsCentrallyMaintained=true,AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fe31e29d-fad8-8bdf-8f92-16ee279a8965")
public static final String FIELDNAME_Window_Table="fe31e29d-fad8-8bdf-8f92-16ee279a8965";

@XendraTrl(Identifier="c9c5dcaa-2773-e2e0-c70c-b7c8109ebb92")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9c5dcaa-2773-e2e0-c70c-b7c8109ebb92",
Synchronized="2017-08-05 16:52:34.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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

@XendraTrl(Identifier="ab7bb377-9ff7-6298-c341-19a5ee75d6f9")
public static String es_PE_FIELD_Window_Description_Description="Observación";

@XendraTrl(Identifier="ab7bb377-9ff7-6298-c341-19a5ee75d6f9")
public static String es_PE_FIELD_Window_Description_Help="Observación";

@XendraTrl(Identifier="ab7bb377-9ff7-6298-c341-19a5ee75d6f9")
public static String es_PE_FIELD_Window_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab7bb377-9ff7-6298-c341-19a5ee75d6f9")
public static final String FIELDNAME_Window_Description="ab7bb377-9ff7-6298-c341-19a5ee75d6f9";

@XendraTrl(Identifier="8416129b-05b9-fdbc-c37b-25e5cbcccb75")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8416129b-05b9-fdbc-c37b-25e5cbcccb75",
Synchronized="2017-08-05 16:52:34.0")
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

@XendraTrl(Identifier="7811275e-3138-4f08-488e-8fff351e3552")
public static String es_PE_FIELD_Window_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="7811275e-3138-4f08-488e-8fff351e3552")
public static String es_PE_FIELD_Window_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="7811275e-3138-4f08-488e-8fff351e3552")
public static String es_PE_FIELD_Window_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7811275e-3138-4f08-488e-8fff351e3552")
public static final String FIELDNAME_Window_EntityType="7811275e-3138-4f08-488e-8fff351e3552";

@XendraTrl(Identifier="3e0789ab-01a0-552c-952c-4f3d6347e706")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3e0789ab-01a0-552c-952c-4f3d6347e706",Synchronized="2017-08-05 16:52:34.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set Sql FROM.
@param FromClause SQL FROM clause */
public void setFromClause (String FromClause)
{
if (FromClause == null) throw new IllegalArgumentException ("FromClause is mandatory.");
set_Value (COLUMNNAME_FromClause, FromClause);
}
/** Get Sql FROM.
@return SQL FROM clause */
public String getFromClause() 
{
String value = (String)get_Value(COLUMNNAME_FromClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9417f219-07ab-53e7-058f-6be87b925015")
public static String es_PE_FIELD_Window_SqlFROM_Description="SQL de clausula";

@XendraTrl(Identifier="9417f219-07ab-53e7-058f-6be87b925015")
public static String es_PE_FIELD_Window_SqlFROM_Name="De Clausula";

@XendraField(AD_Column_ID="FromClause",IsCentrallyMaintained=true,
AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9417f219-07ab-53e7-058f-6be87b925015")
public static final String FIELDNAME_Window_SqlFROM="9417f219-07ab-53e7-058f-6be87b925015";

@XendraTrl(Identifier="4ac63aca-2ce1-217c-8c15-3d69f2ae539c")
public static String es_PE_COLUMN_FromClause_Name="De Clausula";

@XendraColumn(AD_Element_ID="4615afab-b3c6-aeee-2229-28fffab53111",ColumnName="FromClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ac63aca-2ce1-217c-8c15-3d69f2ae539c",
Synchronized="2017-08-05 16:52:34.0")
/** Column name FromClause */
public static final String COLUMNNAME_FromClause = "FromClause";
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

@XendraTrl(Identifier="775bca58-b16e-9e8e-27b6-53c9bb166173")
public static String es_PE_FIELD_Window_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="775bca58-b16e-9e8e-27b6-53c9bb166173")
public static String es_PE_FIELD_Window_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="775bca58-b16e-9e8e-27b6-53c9bb166173")
public static String es_PE_FIELD_Window_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="775bca58-b16e-9e8e-27b6-53c9bb166173")
public static final String FIELDNAME_Window_CommentHelp="775bca58-b16e-9e8e-27b6-53c9bb166173";

@XendraTrl(Identifier="d4713955-5985-36bc-8cf4-9205206d4967")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4713955-5985-36bc-8cf4-9205206d4967",
Synchronized="2017-08-05 16:52:34.0")
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
@XendraTrl(Identifier="f348cbf2-dd5e-4a7d-9735-9bd6119182ef")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f348cbf2-dd5e-4a7d-9735-9bd6119182ef",
Synchronized="2017-08-05 16:52:34.0")
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

@XendraTrl(Identifier="abcde1a3-46bc-cc53-ab39-6752700f9c32")
public static String es_PE_FIELD_Window_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="abcde1a3-46bc-cc53-ab39-6752700f9c32")
public static String es_PE_FIELD_Window_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="abcde1a3-46bc-cc53-ab39-6752700f9c32")
public static String es_PE_FIELD_Window_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="abcde1a3-46bc-cc53-ab39-6752700f9c32")
public static final String FIELDNAME_Window_Name="abcde1a3-46bc-cc53-ab39-6752700f9c32";

@XendraTrl(Identifier="01d77805-62db-721f-28af-bc919aa7f1bb")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01d77805-62db-721f-28af-bc919aa7f1bb",
Synchronized="2017-08-05 16:52:34.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Other SQL Clause.
@param OtherClause Other SQL Clause */
public void setOtherClause (String OtherClause)
{
set_Value (COLUMNNAME_OtherClause, OtherClause);
}
/** Get Other SQL Clause.
@return Other SQL Clause */
public String getOtherClause() 
{
String value = (String)get_Value(COLUMNNAME_OtherClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ebae88e5-4f74-a0d2-c1b3-bbb2a3f9ab41")
public static String es_PE_FIELD_Window_OtherSQLClause_Description="Otra Cláusula SQL ";

@XendraTrl(Identifier="ebae88e5-4f74-a0d2-c1b3-bbb2a3f9ab41")
public static String es_PE_FIELD_Window_OtherSQLClause_Help="Cualquier otra cláusula completa al gusto GRUPO CERCA, TENIENDO, ORDEN CERCA, Etc. Despues DONDE cláusula.";

@XendraTrl(Identifier="ebae88e5-4f74-a0d2-c1b3-bbb2a3f9ab41")
public static String es_PE_FIELD_Window_OtherSQLClause_Name="Otra Cláusula";

@XendraField(AD_Column_ID="OtherClause",IsCentrallyMaintained=true,
AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebae88e5-4f74-a0d2-c1b3-bbb2a3f9ab41")
public static final String FIELDNAME_Window_OtherSQLClause="ebae88e5-4f74-a0d2-c1b3-bbb2a3f9ab41";

@XendraTrl(Identifier="14ce0e40-fbb8-e9e8-68e8-c427b45c1282")
public static String es_PE_COLUMN_OtherClause_Name="Otra Cláusula";

@XendraColumn(AD_Element_ID="bf9f57e0-0ef0-76eb-e275-e43e5bab2a49",ColumnName="OtherClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14ce0e40-fbb8-e9e8-68e8-c427b45c1282",
Synchronized="2017-08-05 16:52:34.0")
/** Column name OtherClause */
public static final String COLUMNNAME_OtherClause = "OtherClause";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5cb61d04-f6a6-a357-ce04-abb31db51af8")
public static String es_PE_FIELD_Window_ProcessNow_Description="Validate Info Window SQL";

@XendraTrl(Identifier="5cb61d04-f6a6-a357-ce04-abb31db51af8")
public static String es_PE_FIELD_Window_ProcessNow_Help="Validate generated Info Window SQL";

@XendraTrl(Identifier="5cb61d04-f6a6-a357-ce04-abb31db51af8")
public static String es_PE_FIELD_Window_ProcessNow_Name="Validate";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="a1093105-e919-d85c-71e1-9b796f085000",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cb61d04-f6a6-a357-ce04-abb31db51af8")
public static final String FIELDNAME_Window_ProcessNow="5cb61d04-f6a6-a357-ce04-abb31db51af8";

@XendraTrl(Identifier="906da695-e267-14a9-c5a8-1fb0e9942fa2")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="d236ef3a-8fa9-b8dd-c929-76fccbc0cc2d",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="906da695-e267-14a9-c5a8-1fb0e9942fa2",Synchronized="2017-08-05 16:52:34.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
