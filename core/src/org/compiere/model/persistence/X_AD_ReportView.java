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
/** Generated Model for AD_ReportView
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ReportView extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ReportView_ID id
@param trxName transaction
*/
public X_AD_ReportView (Properties ctx, int AD_ReportView_ID, String trxName)
{
super (ctx, AD_ReportView_ID, trxName);
/** if (AD_ReportView_ID == 0)
{
setAD_ReportView_ID (0);
setAD_Table_ID (0);
setEntityType (null);	
// U
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ReportView (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=361 */
public static int Table_ID=MTable.getTable_ID("AD_ReportView");

@XendraTrl(Identifier="4eb7c248-6c22-0e21-6536-5dc535416e50")
public static String es_PE_TAB_ReportView_Description="Definir Vista del Informe";

@XendraTrl(Identifier="4eb7c248-6c22-0e21-6536-5dc535416e50")
public static String es_PE_TAB_ReportView_Help="Definir Vista de Informe define las vistas usadas en la generación de Informes.";

@XendraTrl(Identifier="4eb7c248-6c22-0e21-6536-5dc535416e50")
public static String es_PE_TAB_ReportView_Name="Vista del Informe";
@XendraTab(Name="Report View",
Description="Define Report View",
Help="The Define Report View defines the views used in report generation",
AD_Window_ID="dd35bdde-cc7b-8f79-1962-33f8253fe1b6",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4eb7c248-6c22-0e21-6536-5dc535416e50",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportView="4eb7c248-6c22-0e21-6536-5dc535416e50";

@XendraTrl(Identifier="6237795a-6f26-388f-ee6f-6ad9fdc708c1")
public static String es_PE_TABLE_AD_ReportView_Name="Vista del Informe";

@XendraTable(Name="Report View",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="View used to generate this report",Help="",TableName="AD_ReportView",AccessLevel="4",
AD_Window_ID="dd35bdde-cc7b-8f79-1962-33f8253fe1b6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=60,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="6237795a-6f26-388f-ee6f-6ad9fdc708c1",
Synchronized="2020-03-03 21:35:51.0")
/** TableName=AD_ReportView */
public static final String Table_Name="AD_ReportView";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ReportView");

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
    Table_ID = MTable.getTable_ID("AD_ReportView");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ReportView[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Report View.
@param AD_ReportView_ID View used to generate this report */
public void setAD_ReportView_ID (int AD_ReportView_ID)
{
if (AD_ReportView_ID < 1) throw new IllegalArgumentException ("AD_ReportView_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ReportView_ID, Integer.valueOf(AD_ReportView_ID));
}
/** Get Report View.
@return View used to generate this report */
public int getAD_ReportView_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="23144aad-e585-2f13-c84a-cbd3ad49c3ab")
public static String es_PE_FIELD_ReportView_ReportView_Name="Vista del Informe";

@XendraTrl(Identifier="23144aad-e585-2f13-c84a-cbd3ad49c3ab")
public static String es_PE_FIELD_ReportView_ReportView_Description="Vista usada para generar este Informe";

@XendraTrl(Identifier="23144aad-e585-2f13-c84a-cbd3ad49c3ab")
public static String es_PE_FIELD_ReportView_ReportView_Help="La Vista del Informe indica la vista usada para generar este Informe";

@XendraField(AD_Column_ID="AD_ReportView_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4eb7c248-6c22-0e21-6536-5dc535416e50",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23144aad-e585-2f13-c84a-cbd3ad49c3ab")
public static final String FIELDNAME_ReportView_ReportView="23144aad-e585-2f13-c84a-cbd3ad49c3ab";
/** Column name AD_ReportView_ID */
public static final String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
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

@XendraTrl(Identifier="1c4b7b08-65e9-da5b-61fd-701ac1c52f70")
public static String es_PE_FIELD_ReportView_Table_Name="Tabla";

@XendraTrl(Identifier="1c4b7b08-65e9-da5b-61fd-701ac1c52f70")
public static String es_PE_FIELD_ReportView_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="1c4b7b08-65e9-da5b-61fd-701ac1c52f70")
public static String es_PE_FIELD_ReportView_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4eb7c248-6c22-0e21-6536-5dc535416e50",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c4b7b08-65e9-da5b-61fd-701ac1c52f70")
public static final String FIELDNAME_ReportView_Table="1c4b7b08-65e9-da5b-61fd-701ac1c52f70";

@XendraTrl(Identifier="93fbf4b5-fe49-0c41-b047-ae941da4d329")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93fbf4b5-fe49-0c41-b047-ae941da4d329",
Synchronized="2019-08-30 22:20:38.0")
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

@XendraTrl(Identifier="fd039b5c-225a-076e-9aca-2b7a24eb32d2")
public static String es_PE_FIELD_ReportView_Description_Name="Observación";

@XendraTrl(Identifier="fd039b5c-225a-076e-9aca-2b7a24eb32d2")
public static String es_PE_FIELD_ReportView_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="fd039b5c-225a-076e-9aca-2b7a24eb32d2")
public static String es_PE_FIELD_ReportView_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4eb7c248-6c22-0e21-6536-5dc535416e50",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd039b5c-225a-076e-9aca-2b7a24eb32d2")
public static final String FIELDNAME_ReportView_Description="fd039b5c-225a-076e-9aca-2b7a24eb32d2";

@XendraTrl(Identifier="231e5108-d3ba-dee9-2668-0bf1d763017a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="231e5108-d3ba-dee9-2668-0bf1d763017a",
Synchronized="2019-08-30 22:20:38.0")
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

@XendraTrl(Identifier="83c1d916-9ae2-9678-2416-2333e02ac1d9")
public static String es_PE_FIELD_ReportView_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="83c1d916-9ae2-9678-2416-2333e02ac1d9")
public static String es_PE_FIELD_ReportView_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="83c1d916-9ae2-9678-2416-2333e02ac1d9")
public static String es_PE_FIELD_ReportView_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="4eb7c248-6c22-0e21-6536-5dc535416e50",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83c1d916-9ae2-9678-2416-2333e02ac1d9")
public static final String FIELDNAME_ReportView_EntityType="83c1d916-9ae2-9678-2416-2333e02ac1d9";

@XendraTrl(Identifier="48d32955-6fe5-8ab0-aee8-0d5a1aff4d03")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="48d32955-6fe5-8ab0-aee8-0d5a1aff4d03",Synchronized="2019-08-30 22:20:38.0")
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
@XendraTrl(Identifier="ac12e12f-2286-438b-9adb-5edc7ba3f365")
public static String es_PE_COLUMN_Identifier_Name="identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac12e12f-2286-438b-9adb-5edc7ba3f365",
Synchronized="2019-08-30 22:20:38.0")
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

@XendraTrl(Identifier="a3222962-ff07-fc7b-e625-851b5cdac56d")
public static String es_PE_FIELD_ReportView_Name_Name="Nombre";

@XendraTrl(Identifier="a3222962-ff07-fc7b-e625-851b5cdac56d")
public static String es_PE_FIELD_ReportView_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a3222962-ff07-fc7b-e625-851b5cdac56d")
public static String es_PE_FIELD_ReportView_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="4eb7c248-6c22-0e21-6536-5dc535416e50",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3222962-ff07-fc7b-e625-851b5cdac56d")
public static final String FIELDNAME_ReportView_Name="a3222962-ff07-fc7b-e625-851b5cdac56d";

@XendraTrl(Identifier="4db9247e-2356-8b36-96d4-f3ff7444f3a3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4db9247e-2356-8b36-96d4-f3ff7444f3a3",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sql ORDER BY.
@param OrderByClause Fully qualified ORDER BY clause */
public void setOrderByClause (String OrderByClause)
{
if (OrderByClause != null && OrderByClause.length() > 2000)
{
log.warning("Length > 2000 - truncated");
OrderByClause = OrderByClause.substring(0,1999);
}
set_Value (COLUMNNAME_OrderByClause, OrderByClause);
}
/** Get Sql ORDER BY.
@return Fully qualified ORDER BY clause */
public String getOrderByClause() 
{
String value = (String)get_Value(COLUMNNAME_OrderByClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3efa6ceb-54e4-8a40-3650-be1c1ea7498b")
public static String es_PE_FIELD_ReportView_SqlORDERBY_Name="Cláusula ORDER BY SQL";

@XendraTrl(Identifier="3efa6ceb-54e4-8a40-3650-be1c1ea7498b")
public static String es_PE_FIELD_ReportView_SqlORDERBY_Description="Cláusula completamente calificada ORDER BY";

@XendraTrl(Identifier="3efa6ceb-54e4-8a40-3650-be1c1ea7498b")
public static String es_PE_FIELD_ReportView_SqlORDERBY_Help="La cláusula ORDER BY indica la cláusula SQL ORDER BY a usar para la selección del registro";

@XendraField(AD_Column_ID="OrderByClause",IsCentrallyMaintained=true,
AD_Tab_ID="4eb7c248-6c22-0e21-6536-5dc535416e50",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3efa6ceb-54e4-8a40-3650-be1c1ea7498b")
public static final String FIELDNAME_ReportView_SqlORDERBY="3efa6ceb-54e4-8a40-3650-be1c1ea7498b";

@XendraTrl(Identifier="06b24982-e593-aff3-a248-31ade4ceeca6")
public static String es_PE_COLUMN_OrderByClause_Name="Cláusula ORDER BY SQL";

@XendraColumn(AD_Element_ID="32eea30b-0ac3-b494-48bb-535e80217e7e",ColumnName="OrderByClause",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06b24982-e593-aff3-a248-31ade4ceeca6",
Synchronized="2019-08-30 22:20:38.0")
/** Column name OrderByClause */
public static final String COLUMNNAME_OrderByClause = "OrderByClause";
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

@XendraTrl(Identifier="3db384ad-43e3-4a97-8d3e-d66003d47d0b")
public static String es_PE_COLUMN_Synchronized_Name="synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3db384ad-43e3-4a97-8d3e-d66003d47d0b",
Synchronized="2019-08-30 22:20:38.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Sql WHERE.
@param WhereClause Fully qualified SQL WHERE clause */
public void setWhereClause (String WhereClause)
{
if (WhereClause != null && WhereClause.length() > 2000)
{
log.warning("Length > 2000 - truncated");
WhereClause = WhereClause.substring(0,1999);
}
set_Value (COLUMNNAME_WhereClause, WhereClause);
}
/** Get Sql WHERE.
@return Fully qualified SQL WHERE clause */
public String getWhereClause() 
{
String value = (String)get_Value(COLUMNNAME_WhereClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cc3badcb-b4c5-ee8f-e5b4-f717d51137f1")
public static String es_PE_FIELD_ReportView_SqlWHERE_Name="Cláusula Where SQL";

@XendraTrl(Identifier="cc3badcb-b4c5-ee8f-e5b4-f717d51137f1")
public static String es_PE_FIELD_ReportView_SqlWHERE_Description="Cláusula WHERE completamente calificada";

@XendraTrl(Identifier="cc3badcb-b4c5-ee8f-e5b4-f717d51137f1")
public static String es_PE_FIELD_ReportView_SqlWHERE_Help="La cláusula Where indica la cláusula SQL WHERE a usar para la selección del registro";

@XendraField(AD_Column_ID="WhereClause",IsCentrallyMaintained=true,
AD_Tab_ID="4eb7c248-6c22-0e21-6536-5dc535416e50",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc3badcb-b4c5-ee8f-e5b4-f717d51137f1")
public static final String FIELDNAME_ReportView_SqlWHERE="cc3badcb-b4c5-ee8f-e5b4-f717d51137f1";

@XendraTrl(Identifier="83f50cb8-d9db-e75b-f898-eae2b1de143e")
public static String es_PE_COLUMN_WhereClause_Name="Cláusula Where SQL";

@XendraColumn(AD_Element_ID="7528e2a5-0b7f-8c17-e919-8343497249ca",ColumnName="WhereClause",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83f50cb8-d9db-e75b-f898-eae2b1de143e",
Synchronized="2019-08-30 22:20:38.0")
/** Column name WhereClause */
public static final String COLUMNNAME_WhereClause = "WhereClause";
}
