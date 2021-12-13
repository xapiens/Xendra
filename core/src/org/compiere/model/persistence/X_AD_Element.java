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
/** Generated Model for AD_Element
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Element extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Element_ID id
@param trxName transaction
*/
public X_AD_Element (Properties ctx, int AD_Element_ID, String trxName)
{
super (ctx, AD_Element_ID, trxName);
/** if (AD_Element_ID == 0)
{
setAD_Element_ID (0);
setColumnName (null);
setEntityType (null);	
// U
setName (null);
setPrintName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Element (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=276 */
public static int Table_ID=MTable.getTable_ID("AD_Element");

@XendraTrl(Identifier="ab12e2fb-f744-9a00-d43a-145d9a09e6bd")
public static String es_PE_TAB_Element_Description="Elemento";

@XendraTrl(Identifier="ab12e2fb-f744-9a00-d43a-145d9a09e6bd")
public static String es_PE_TAB_Element_Help="La pestaña de elemento define cada elemento del sistema.";

@XendraTrl(Identifier="ab12e2fb-f744-9a00-d43a-145d9a09e6bd")
public static String es_PE_TAB_Element_Name="Elemento";
@XendraTab(Name="Element",
Description="Element",Help="The Element Tab defines each system level element.",
AD_Window_ID="3ac9d23a-ddd0-cc17-b61e-06302a89c737",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",Synchronized="2015-11-26 11:06:53.0")
public static final String TABNAME_Element="ab12e2fb-f744-9a00-d43a-145d9a09e6bd";

@XendraTrl(Identifier="bea4be47-30d7-e555-59b2-1520f0ab7932")
public static String es_PE_TABLE_AD_Element_Name="Elemento";

@XendraTable(Name="System Element",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="System Element enables the central maintenance of column description and help.",
Help="",TableName="AD_Element",AccessLevel="4",AD_Window_ID="3ac9d23a-ddd0-cc17-b61e-06302a89c737",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="bea4be47-30d7-e555-59b2-1520f0ab7932",Synchronized="2020-03-03 21:34:59.0")
/** TableName=AD_Element */
public static final String Table_Name="AD_Element";


@XendraIndex(Name="ad_element_columnname",Identifier="ccc5378a-4228-b342-e3f0-3a6a58c6281e",
Column_Names="columnname",IsUnique="true",TableIdentifier="ccc5378a-4228-b342-e3f0-3a6a58c6281e",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_element_columnname = "ccc5378a-4228-b342-e3f0-3a6a58c6281e";


@XendraIndex(Name="ad_element_clientorg",Identifier="4dbce49b-d1d1-54fe-89ba-426f6f87f946",
Column_Names="ad_client_id, ad_org_id",IsUnique="false",
TableIdentifier="4dbce49b-d1d1-54fe-89ba-426f6f87f946",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_element_clientorg = "4dbce49b-d1d1-54fe-89ba-426f6f87f946";


@XendraIndex(Name="ad_element_name",Identifier="b891189f-b476-c2e7-c53e-0b6e059a056c",
Column_Names="name",IsUnique="false",TableIdentifier="b891189f-b476-c2e7-c53e-0b6e059a056c",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_element_name = "b891189f-b476-c2e7-c53e-0b6e059a056c";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Element");

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
    Table_ID = MTable.getTable_ID("AD_Element");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Element[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Element.
@param AD_Element_ID System Element enables the central maintenance of column DESCRIPTION and HELP. */
public void setAD_Element_ID (int AD_Element_ID)
{
if (AD_Element_ID < 1) throw new IllegalArgumentException ("AD_Element_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Element_ID, Integer.valueOf(AD_Element_ID));
}
/** Get System Element.
@return System Element enables the central maintenance of column DESCRIPTION and HELP. */
public int getAD_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="361aabba-6be0-2d5a-b765-83011be2c4fd")
public static String es_PE_FIELD_Element_SystemElement_Name="Elemento";

@XendraTrl(Identifier="361aabba-6be0-2d5a-b765-83011be2c4fd")
public static String es_PE_FIELD_Element_SystemElement_Description="El elemento del sistema permite el mantenimiento central de la descripción y ayuda de la columna";

@XendraTrl(Identifier="361aabba-6be0-2d5a-b765-83011be2c4fd")
public static String es_PE_FIELD_Element_SystemElement_Help="El elemento sistema permite el mantenimiento central de la ayuda descripciones y terminología para una columna base de datos.";

@XendraField(AD_Column_ID="AD_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="361aabba-6be0-2d5a-b765-83011be2c4fd")
public static final String FIELDNAME_Element_SystemElement="361aabba-6be0-2d5a-b765-83011be2c4fd";
/** Column name AD_Element_ID */
public static final String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
/** Set DB Column Name.
@param ColumnName Name of the column in the database */
public void setColumnName (String ColumnName)
{
if (ColumnName == null) throw new IllegalArgumentException ("ColumnName is mandatory.");
if (ColumnName.length() > 40)
{
log.warning("Length > 40 - truncated");
ColumnName = ColumnName.substring(0,39);
}
set_Value (COLUMNNAME_ColumnName, ColumnName);
}
/** Get DB Column Name.
@return Name of the column in the database */
public String getColumnName() 
{
String value = (String)get_Value(COLUMNNAME_ColumnName);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getColumnName());
}

@XendraTrl(Identifier="d808c38c-493d-74f1-9a78-6ab5040b4d7c")
public static String es_PE_FIELD_Element_DBColumnName_Name="Nombre de Columna en BD";

@XendraTrl(Identifier="d808c38c-493d-74f1-9a78-6ab5040b4d7c")
public static String es_PE_FIELD_Element_DBColumnName_Description="Nombre de la columna en la base de datos";

@XendraTrl(Identifier="d808c38c-493d-74f1-9a78-6ab5040b4d7c")
public static String es_PE_FIELD_Element_DBColumnName_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d808c38c-493d-74f1-9a78-6ab5040b4d7c")
public static final String FIELDNAME_Element_DBColumnName="d808c38c-493d-74f1-9a78-6ab5040b4d7c";

@XendraTrl(Identifier="ef309ccc-6354-8e8b-319f-ab876ad27943")
public static String es_PE_COLUMN_ColumnName_Name="Nombre de Columna en BD";

@XendraColumn(AD_Element_ID="fadc32aa-cd31-3fee-f9b7-0daa53df76a7",ColumnName="ColumnName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef309ccc-6354-8e8b-319f-ab876ad27943",
Synchronized="2019-08-30 22:20:18.0")
/** Column name ColumnName */
public static final String COLUMNNAME_ColumnName = "ColumnName";
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

@XendraTrl(Identifier="b507239d-4fdb-02d3-74fd-4286e48450d2")
public static String es_PE_FIELD_Element_Description_Name="Observación";

@XendraTrl(Identifier="b507239d-4fdb-02d3-74fd-4286e48450d2")
public static String es_PE_FIELD_Element_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b507239d-4fdb-02d3-74fd-4286e48450d2")
public static String es_PE_FIELD_Element_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b507239d-4fdb-02d3-74fd-4286e48450d2")
public static final String FIELDNAME_Element_Description="b507239d-4fdb-02d3-74fd-4286e48450d2";

@XendraTrl(Identifier="db540e15-a181-5df2-0048-bb0a951e18dc")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db540e15-a181-5df2-0048-bb0a951e18dc",
Synchronized="2019-08-30 22:20:18.0")
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

@XendraTrl(Identifier="280fb5bb-d05b-f314-2d22-d48771adcbea")
public static String es_PE_FIELD_Element_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="280fb5bb-d05b-f314-2d22-d48771adcbea")
public static String es_PE_FIELD_Element_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="280fb5bb-d05b-f314-2d22-d48771adcbea")
public static String es_PE_FIELD_Element_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="280fb5bb-d05b-f314-2d22-d48771adcbea")
public static final String FIELDNAME_Element_EntityType="280fb5bb-d05b-f314-2d22-d48771adcbea";

@XendraTrl(Identifier="dc49e136-0a65-c3c6-606e-6e89708f3d53")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dc49e136-0a65-c3c6-606e-6e89708f3d53",Synchronized="2019-08-30 22:20:18.0")
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

@XendraTrl(Identifier="53260714-c3a8-6e29-28eb-7f18845d5115")
public static String es_PE_FIELD_Element_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="53260714-c3a8-6e29-28eb-7f18845d5115")
public static String es_PE_FIELD_Element_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="53260714-c3a8-6e29-28eb-7f18845d5115")
public static String es_PE_FIELD_Element_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53260714-c3a8-6e29-28eb-7f18845d5115")
public static final String FIELDNAME_Element_CommentHelp="53260714-c3a8-6e29-28eb-7f18845d5115";

@XendraTrl(Identifier="5ae2c57e-16cf-7ba5-97dc-0f4bdce2c2e6")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ae2c57e-16cf-7ba5-97dc-0f4bdce2c2e6",
Synchronized="2019-08-30 22:20:18.0")
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
@XendraTrl(Identifier="9cccf2df-e7fd-4b2f-89fa-63fb602adc12")
public static String es_PE_COLUMN_Identifier_Name="identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cccf2df-e7fd-4b2f-89fa-63fb602adc12",
Synchronized="2019-08-30 22:20:18.0")
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
@XendraTrl(Identifier="42fdd899-384d-0c05-b142-c6d9168c3a50")
public static String es_PE_FIELD_Element_Name_Name="Nombre";

@XendraTrl(Identifier="42fdd899-384d-0c05-b142-c6d9168c3a50")
public static String es_PE_FIELD_Element_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="42fdd899-384d-0c05-b142-c6d9168c3a50")
public static String es_PE_FIELD_Element_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42fdd899-384d-0c05-b142-c6d9168c3a50")
public static final String FIELDNAME_Element_Name="42fdd899-384d-0c05-b142-c6d9168c3a50";

@XendraTrl(Identifier="eb790b40-3062-95c0-ec3a-c3357ebe52ca")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb790b40-3062-95c0-ec3a-c3357ebe52ca",
Synchronized="2019-08-30 22:20:18.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set PO Description.
@param PO_Description Description in PO Screens */
public void setPO_Description (String PO_Description)
{
if (PO_Description != null && PO_Description.length() > 255)
{
log.warning("Length > 255 - truncated");
PO_Description = PO_Description.substring(0,254);
}
set_Value (COLUMNNAME_PO_Description, PO_Description);
}
/** Get PO Description.
@return Description in PO Screens */
public String getPO_Description() 
{
String value = (String)get_Value(COLUMNNAME_PO_Description);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2da114bb-c189-2350-39cf-80ec47d3fa99")
public static String es_PE_FIELD_Element_PODescription_Name="Descripción de la OC";

@XendraTrl(Identifier="2da114bb-c189-2350-39cf-80ec47d3fa99")
public static String es_PE_FIELD_Element_PODescription_Description="Descripción en pantallas de orden de compras";

@XendraField(AD_Column_ID="PO_Description",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2da114bb-c189-2350-39cf-80ec47d3fa99")
public static final String FIELDNAME_Element_PODescription="2da114bb-c189-2350-39cf-80ec47d3fa99";

@XendraTrl(Identifier="2dc0a350-4bfa-3342-9a34-2d736acb269a")
public static String es_PE_COLUMN_PO_Description_Name="Descripción de la OC";

@XendraColumn(AD_Element_ID="830dd00a-c4d5-17b3-c03a-0c3070256029",ColumnName="PO_Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dc0a350-4bfa-3342-9a34-2d736acb269a",
Synchronized="2019-08-30 22:20:18.0")
/** Column name PO_Description */
public static final String COLUMNNAME_PO_Description = "PO_Description";
/** Set PO Help.
@param PO_Help Help for PO Screens */
public void setPO_Help (String PO_Help)
{
set_Value (COLUMNNAME_PO_Help, PO_Help);
}
/** Get PO Help.
@return Help for PO Screens */
public String getPO_Help() 
{
String value = (String)get_Value(COLUMNNAME_PO_Help);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="488e2101-053b-8f9f-16ac-fa66e5e50b8e")
public static String es_PE_FIELD_Element_POHelp_Name="Ayuda OC";

@XendraTrl(Identifier="488e2101-053b-8f9f-16ac-fa66e5e50b8e")
public static String es_PE_FIELD_Element_POHelp_Description="Ayuda en pantallas de Orden de Compras";

@XendraField(AD_Column_ID="PO_Help",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="488e2101-053b-8f9f-16ac-fa66e5e50b8e")
public static final String FIELDNAME_Element_POHelp="488e2101-053b-8f9f-16ac-fa66e5e50b8e";

@XendraTrl(Identifier="299eca84-b86b-b1db-b6f1-3f39c7dbe432")
public static String es_PE_COLUMN_PO_Help_Name="Ayuda OC";

@XendraColumn(AD_Element_ID="230bb583-3095-562d-80b1-5a4c4084fa5a",ColumnName="PO_Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="299eca84-b86b-b1db-b6f1-3f39c7dbe432",
Synchronized="2019-08-30 22:20:18.0")
/** Column name PO_Help */
public static final String COLUMNNAME_PO_Help = "PO_Help";
/** Set PO Name.
@param PO_Name Name on PO Screens */
public void setPO_Name (String PO_Name)
{
if (PO_Name != null && PO_Name.length() > 60)
{
log.warning("Length > 60 - truncated");
PO_Name = PO_Name.substring(0,59);
}
set_Value (COLUMNNAME_PO_Name, PO_Name);
}
/** Get PO Name.
@return Name on PO Screens */
public String getPO_Name() 
{
String value = (String)get_Value(COLUMNNAME_PO_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="569742b9-9376-6cf3-3ad6-4750c7f86f93")
public static String es_PE_FIELD_Element_POName_Name="Nombre OC";

@XendraTrl(Identifier="569742b9-9376-6cf3-3ad6-4750c7f86f93")
public static String es_PE_FIELD_Element_POName_Description="Nombre en pantalla de orden de compras";

@XendraField(AD_Column_ID="PO_Name",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="569742b9-9376-6cf3-3ad6-4750c7f86f93")
public static final String FIELDNAME_Element_POName="569742b9-9376-6cf3-3ad6-4750c7f86f93";

@XendraTrl(Identifier="618bc370-d24d-2335-4319-c4cc4247679e")
public static String es_PE_COLUMN_PO_Name_Name="Nombre OC";

@XendraColumn(AD_Element_ID="e5cb1043-a0df-f49a-e39c-e2670fdf8f7c",ColumnName="PO_Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="618bc370-d24d-2335-4319-c4cc4247679e",
Synchronized="2019-08-30 22:20:18.0")
/** Column name PO_Name */
public static final String COLUMNNAME_PO_Name = "PO_Name";
/** Set PO Print NAME.
@param PO_PrintName Print NAME on PO Screens/Reports */
public void setPO_PrintName (String PO_PrintName)
{
if (PO_PrintName != null && PO_PrintName.length() > 60)
{
log.warning("Length > 60 - truncated");
PO_PrintName = PO_PrintName.substring(0,59);
}
set_Value (COLUMNNAME_PO_PrintName, PO_PrintName);
}
/** Get PO Print NAME.
@return Print NAME on PO Screens/Reports */
public String getPO_PrintName() 
{
String value = (String)get_Value(COLUMNNAME_PO_PrintName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="35f8ee05-b078-4949-1b7d-6e096121c01b")
public static String es_PE_FIELD_Element_POPrintNAME_Name="Nombre a Imprimir OC";

@XendraTrl(Identifier="35f8ee05-b078-4949-1b7d-6e096121c01b")
public static String es_PE_FIELD_Element_POPrintNAME_Description="Nombre a Imprimir en pantallas / Informes OC";

@XendraField(AD_Column_ID="PO_PrintName",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35f8ee05-b078-4949-1b7d-6e096121c01b")
public static final String FIELDNAME_Element_POPrintNAME="35f8ee05-b078-4949-1b7d-6e096121c01b";

@XendraTrl(Identifier="62ac4277-92ad-5c20-2d4b-a9884ac14198")
public static String es_PE_COLUMN_PO_PrintName_Name="Nombre a Imprimir OC";

@XendraColumn(AD_Element_ID="df02fed9-e62e-27f1-1dc0-6946c6212cc6",ColumnName="PO_PrintName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62ac4277-92ad-5c20-2d4b-a9884ac14198",
Synchronized="2019-08-30 22:20:18.0")
/** Column name PO_PrintName */
public static final String COLUMNNAME_PO_PrintName = "PO_PrintName";
/** Set Print Text.
@param PrintName The label text to be printed on a document or correspondence. */
public void setPrintName (String PrintName)
{
if (PrintName == null) throw new IllegalArgumentException ("PrintName is mandatory.");
if (PrintName.length() > 60)
{
log.warning("Length > 60 - truncated");
PrintName = PrintName.substring(0,59);
}
set_Value (COLUMNNAME_PrintName, PrintName);
}
/** Get Print Text.
@return The label text to be printed on a document or correspondence. */
public String getPrintName() 
{
String value = (String)get_Value(COLUMNNAME_PrintName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7e8e029a-d40b-47ae-d30a-d51f259b670a")
public static String es_PE_FIELD_Element_PrintText_Name="Nombre a ser Impreso";

@XendraTrl(Identifier="7e8e029a-d40b-47ae-d30a-d51f259b670a")
public static String es_PE_FIELD_Element_PrintText_Description="Indica el nombre a ser impreso en un documento ó correspondencia";

@XendraTrl(Identifier="7e8e029a-d40b-47ae-d30a-d51f259b670a")
public static String es_PE_FIELD_Element_PrintText_Help="El nombre a ser Impreso indica el nombre que será impreso en un documento ó correspondencia";

@XendraField(AD_Column_ID="PrintName",IsCentrallyMaintained=true,
AD_Tab_ID="ab12e2fb-f744-9a00-d43a-145d9a09e6bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e8e029a-d40b-47ae-d30a-d51f259b670a")
public static final String FIELDNAME_Element_PrintText="7e8e029a-d40b-47ae-d30a-d51f259b670a";

@XendraTrl(Identifier="6516a358-764d-5a14-1442-74e61e3e05c2")
public static String es_PE_COLUMN_PrintName_Name="Nombre a ser Impreso";

@XendraColumn(AD_Element_ID="83f7d1df-e4e7-adff-3bda-43555a334585",ColumnName="PrintName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6516a358-764d-5a14-1442-74e61e3e05c2",
Synchronized="2019-08-30 22:20:18.0")
/** Column name PrintName */
public static final String COLUMNNAME_PrintName = "PrintName";
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

@XendraTrl(Identifier="992164ae-196f-4ee7-9285-b91961efbee8")
public static String es_PE_COLUMN_Synchronized_Name="synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="992164ae-196f-4ee7-9285-b91961efbee8",
Synchronized="2019-08-30 22:20:18.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
