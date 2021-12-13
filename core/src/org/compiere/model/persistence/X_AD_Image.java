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
/** Generated Model for AD_Image
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Image extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Image_ID id
@param trxName transaction
*/
public X_AD_Image (Properties ctx, int AD_Image_ID, String trxName)
{
super (ctx, AD_Image_ID, trxName);
/** if (AD_Image_ID == 0)
{
setAD_Image_ID (0);
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
public X_AD_Image (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=461 */
public static int Table_ID=MTable.getTable_ID("AD_Image");

@XendraTrl(Identifier="fe51a73b-dfdb-6196-e45f-38beb6dd67e7")
public static String es_PE_TAB_Image_Description="Enlace a Imagen";

@XendraTrl(Identifier="fe51a73b-dfdb-6196-e45f-38beb6dd67e7")
public static String es_PE_TAB_Image_Name="Imagen";
@XendraTab(Name="Image",
Description="Image or Icon link",Help="",AD_Window_ID="95240b59-e9de-d0cd-0cdc-045634290f61",
SeqNo=10,TabLevel=0,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="fe51a73b-dfdb-6196-e45f-38beb6dd67e7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Image="fe51a73b-dfdb-6196-e45f-38beb6dd67e7";

@XendraTrl(Identifier="f2c70267-b3b3-bba7-3154-5ac1c009285b")
public static String es_PE_TABLE_AD_Image_Name="Imagen";

@XendraTable(Name="Image",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="System Image or Icon",Help="",
TableName="AD_Image",AccessLevel="4",AD_Window_ID="95240b59-e9de-d0cd-0cdc-045634290f61",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=40,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="f2c70267-b3b3-bba7-3154-5ac1c009285b",Synchronized="2020-03-03 21:35:03.0")
/** TableName=AD_Image */
public static final String Table_Name="AD_Image";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Image");

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
    Table_ID = MTable.getTable_ID("AD_Image");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Image[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Image.
@param AD_Image_ID Image or Icon */
public void setAD_Image_ID (int AD_Image_ID)
{
if (AD_Image_ID < 1) throw new IllegalArgumentException ("AD_Image_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Image_ID, Integer.valueOf(AD_Image_ID));
}
/** Get Image.
@return Image or Icon */
public int getAD_Image_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Image_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c6c0443-78c0-b9ff-6669-fc8e2130870f")
public static String es_PE_FIELD_Image_Image_Name="Imagen";

@XendraTrl(Identifier="3c6c0443-78c0-b9ff-6669-fc8e2130870f")
public static String es_PE_FIELD_Image_Image_Description="Imagen del sistema";

@XendraField(AD_Column_ID="AD_Image_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fe51a73b-dfdb-6196-e45f-38beb6dd67e7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c6c0443-78c0-b9ff-6669-fc8e2130870f")
public static final String FIELDNAME_Image_Image="3c6c0443-78c0-b9ff-6669-fc8e2130870f";
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
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

@XendraTrl(Identifier="1466781d-6b66-9e4c-d239-cbf2a200ee67")
public static String es_PE_FIELD_Image_Description_Name="Observación";

@XendraTrl(Identifier="1466781d-6b66-9e4c-d239-cbf2a200ee67")
public static String es_PE_FIELD_Image_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="1466781d-6b66-9e4c-d239-cbf2a200ee67")
public static String es_PE_FIELD_Image_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="fe51a73b-dfdb-6196-e45f-38beb6dd67e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1466781d-6b66-9e4c-d239-cbf2a200ee67")
public static final String FIELDNAME_Image_Description="1466781d-6b66-9e4c-d239-cbf2a200ee67";

@XendraTrl(Identifier="071786be-30a8-e3b3-50f7-53f6a293cc65")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="071786be-30a8-e3b3-50f7-53f6a293cc65",
Synchronized="2019-08-30 22:20:23.0")
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

@XendraTrl(Identifier="07cea12b-4379-4ddc-88bf-a7ae9b6cee13")
public static String es_PE_FIELD_Image_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="07cea12b-4379-4ddc-88bf-a7ae9b6cee13")
public static String es_PE_FIELD_Image_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="07cea12b-4379-4ddc-88bf-a7ae9b6cee13")
public static String es_PE_FIELD_Image_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="fe51a73b-dfdb-6196-e45f-38beb6dd67e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07cea12b-4379-4ddc-88bf-a7ae9b6cee13")
public static final String FIELDNAME_Image_EntityType="07cea12b-4379-4ddc-88bf-a7ae9b6cee13";

@XendraTrl(Identifier="e9c2b66b-6b09-a3b9-0160-3a02a83869c8")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e9c2b66b-6b09-a3b9-0160-3a02a83869c8",Synchronized="2019-08-30 22:20:23.0")
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
@XendraTrl(Identifier="1e79b778-bff9-427a-af6c-f740217e612b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e79b778-bff9-427a-af6c-f740217e612b",
Synchronized="2019-08-30 22:20:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Image URL.
@param ImageURL URL of  image */
public void setImageURL (String ImageURL)
{
if (ImageURL != null && ImageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
ImageURL = ImageURL.substring(0,119);
}
set_Value (COLUMNNAME_ImageURL, ImageURL);
}
/** Get Image URL.
@return URL of  image */
public String getImageURL() 
{
String value = (String)get_Value(COLUMNNAME_ImageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c4e168ed-398b-bf06-d22b-253c1fd68bd2")
public static String es_PE_FIELD_Image_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="c4e168ed-398b-bf06-d22b-253c1fd68bd2")
public static String es_PE_FIELD_Image_ImageURL_Description="URL de la estructura de la imagen";

@XendraTrl(Identifier="c4e168ed-398b-bf06-d22b-253c1fd68bd2")
public static String es_PE_FIELD_Image_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="fe51a73b-dfdb-6196-e45f-38beb6dd67e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4e168ed-398b-bf06-d22b-253c1fd68bd2")
public static final String FIELDNAME_Image_ImageURL="c4e168ed-398b-bf06-d22b-253c1fd68bd2";

@XendraTrl(Identifier="c1c90c88-0e3b-be07-1455-d658f328869d")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@BinaryData@!''",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c1c90c88-0e3b-be07-1455-d658f328869d",Synchronized="2019-08-30 22:20:23.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
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

@XendraTrl(Identifier="a3140ec3-8dd6-3aa3-3bd7-e3525d917fb5")
public static String es_PE_FIELD_Image_Name_Name="Nombre";

@XendraTrl(Identifier="a3140ec3-8dd6-3aa3-3bd7-e3525d917fb5")
public static String es_PE_FIELD_Image_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a3140ec3-8dd6-3aa3-3bd7-e3525d917fb5")
public static String es_PE_FIELD_Image_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="fe51a73b-dfdb-6196-e45f-38beb6dd67e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3140ec3-8dd6-3aa3-3bd7-e3525d917fb5")
public static final String FIELDNAME_Image_Name="a3140ec3-8dd6-3aa3-3bd7-e3525d917fb5";

@XendraTrl(Identifier="9dfdde26-add9-33c7-eba9-a7859a1e77ad")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9dfdde26-add9-33c7-eba9-a7859a1e77ad",
Synchronized="2019-08-30 22:20:23.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
