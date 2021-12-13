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
/** Generated Model for AD_ClientShare
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ClientShare extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ClientShare_ID id
@param trxName transaction
*/
public X_AD_ClientShare (Properties ctx, int AD_ClientShare_ID, String trxName)
{
super (ctx, AD_ClientShare_ID, trxName);
/** if (AD_ClientShare_ID == 0)
{
setAD_ClientShare_ID (0);
setAD_Table_ID (0);
setName (null);
setShareType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ClientShare (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=827 */
public static int Table_ID=MTable.getTable_ID("AD_ClientShare");

@XendraTrl(Identifier="45e95358-8510-d4a9-affd-d25ba9ed71bb")
public static String es_PE_TAB_ClientShare_Description="Forzar o no el Compartir Entidades de  Compañía/Organización";

@XendraTrl(Identifier="45e95358-8510-d4a9-affd-d25ba9ed71bb")
public static String es_PE_TAB_ClientShare_Help="El Socio del Negocio también puede ser definido en Nivel de Compañía (compartido) o en  Nivel Organización (No Compartidos).Aqui usted puede definir los productos que siemore son compartidos (ej. siempre creados bajo  Organización \"*\") o si no son compartidos (ej. no podrán ser ingresados con Organización \"*\").La creación de los registros compartidos \"Compañía y Organización\" es predeterminada y es ignorada.";

@XendraTrl(Identifier="45e95358-8510-d4a9-affd-d25ba9ed71bb")
public static String es_PE_TAB_ClientShare_Name="Compartir Compañía ";

@XendraTab(Name="Client Share",Description="Force (not) sharing of client/org entities",
Help="Business Partner can be either defined on Client level (shared) or on Org level (not shared).  You can define here of Products are always shared (i.e. always created under Organization '*') or if they are not shared (i.e. you cannot enter them with Organization '*').<br> The creation of  'Client and Org' shared records is the default and is ignored.",
AD_Window_ID="e44db880-39fd-a94c-7bc3-d8740a7efd77",SeqNo=30,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="45e95358-8510-d4a9-affd-d25ba9ed71bb",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ClientShare="45e95358-8510-d4a9-affd-d25ba9ed71bb";

@XendraTrl(Identifier="7d76ad40-88dd-ee0c-31de-aeaceaa05b9f")
public static String es_PE_TABLE_AD_ClientShare_Name="Compartir Compañía";

@XendraTable(Name="Client Share",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_ClientShare",AccessLevel="2",AD_Window_ID="e44db880-39fd-a94c-7bc3-d8740a7efd77",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="7d76ad40-88dd-ee0c-31de-aeaceaa05b9f",Synchronized="2020-03-03 21:34:55.0")
/** TableName=AD_ClientShare */
public static final String Table_Name="AD_ClientShare";


@XendraIndex(Name="ad_clientshare_table",Identifier="12a17d71-ac7e-ed82-8075-8bf282f42779",
Column_Names="ad_client_id, ad_table_id",IsUnique="true",
TableIdentifier="12a17d71-ac7e-ed82-8075-8bf282f42779",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_clientshare_table = "12a17d71-ac7e-ed82-8075-8bf282f42779";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ClientShare");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("AD_ClientShare");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ClientShare[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Client Share.
@param AD_ClientShare_ID Force (not) sharing of client/org entities */
public void setAD_ClientShare_ID (int AD_ClientShare_ID)
{
if (AD_ClientShare_ID < 1) throw new IllegalArgumentException ("AD_ClientShare_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_ClientShare_ID, Integer.valueOf(AD_ClientShare_ID));
}
/** Get Client Share.
@return Force (not) sharing of client/org entities */
public int getAD_ClientShare_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ClientShare_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c148d12a-cfd4-c083-bad9-a9696ea2cdcb")
public static String es_PE_FIELD_ClientShare_ClientShare_Name="Compartir Compañía";

@XendraTrl(Identifier="c148d12a-cfd4-c083-bad9-a9696ea2cdcb")
public static String es_PE_FIELD_ClientShare_ClientShare_Description="Permite (o no) el compartir entidades como compañía/organización";

@XendraTrl(Identifier="c148d12a-cfd4-c083-bad9-a9696ea2cdcb")
public static String es_PE_FIELD_ClientShare_ClientShare_Help="Para  entidades con acceso a niveles de información Compañía+Organización tanbién permite el compartir o no las entradas. Ejemplo: Producto y Socio del Negocio también pueden ser definidos en Nivel Compañía (Compartidos) o en Nivel  de la Organización (no compartido).Aqui puede definir los Productos que siempre se compartirán  (ej. siempre creados  bajo  Organización \"*\") o si no son compartidos  (ej. usted no los puede ingresar con Organización \"*\")";

@XendraField(AD_Column_ID="AD_ClientShare_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45e95358-8510-d4a9-affd-d25ba9ed71bb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c148d12a-cfd4-c083-bad9-a9696ea2cdcb")
public static final String FIELDNAME_ClientShare_ClientShare="c148d12a-cfd4-c083-bad9-a9696ea2cdcb";
/** Column name AD_ClientShare_ID */
public static final String COLUMNNAME_AD_ClientShare_ID = "AD_ClientShare_ID";
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

@XendraTrl(Identifier="878b9136-2c48-7318-ea03-9d95c4a3aaff")
public static String es_PE_FIELD_ClientShare_Table_Name="Tabla";

@XendraTrl(Identifier="878b9136-2c48-7318-ea03-9d95c4a3aaff")
public static String es_PE_FIELD_ClientShare_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="878b9136-2c48-7318-ea03-9d95c4a3aaff")
public static String es_PE_FIELD_ClientShare_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45e95358-8510-d4a9-affd-d25ba9ed71bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="878b9136-2c48-7318-ea03-9d95c4a3aaff")
public static final String FIELDNAME_ClientShare_Table="878b9136-2c48-7318-ea03-9d95c4a3aaff";

@XendraTrl(Identifier="0490b01d-b1d0-ca02-9066-4d02f220f11b")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="90dd409b-5208-f193-5f70-3b4bb233ca8b",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0490b01d-b1d0-ca02-9066-4d02f220f11b",Synchronized="2020-03-03 21:34:28.0")
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

@XendraTrl(Identifier="42775bfb-7725-8bb3-30c8-4c34af0d5299")
public static String es_PE_FIELD_ClientShare_Description_Name="Observación";

@XendraTrl(Identifier="42775bfb-7725-8bb3-30c8-4c34af0d5299")
public static String es_PE_FIELD_ClientShare_Description_Description="Observación";

@XendraTrl(Identifier="42775bfb-7725-8bb3-30c8-4c34af0d5299")
public static String es_PE_FIELD_ClientShare_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="45e95358-8510-d4a9-affd-d25ba9ed71bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42775bfb-7725-8bb3-30c8-4c34af0d5299")
public static final String FIELDNAME_ClientShare_Description="42775bfb-7725-8bb3-30c8-4c34af0d5299";

@XendraTrl(Identifier="b79f5777-f096-c444-ba5e-6a9189aa1777")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b79f5777-f096-c444-ba5e-6a9189aa1777",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="2ecebdc5-439c-4c20-bae8-918a0ea301f8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ecebdc5-439c-4c20-bae8-918a0ea301f8",
Synchronized="2020-03-03 21:34:28.0")
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

@XendraTrl(Identifier="3360d7d4-7767-cc20-5e69-ef3a09794e0c")
public static String es_PE_FIELD_ClientShare_Name_Name="Nombre";

@XendraTrl(Identifier="3360d7d4-7767-cc20-5e69-ef3a09794e0c")
public static String es_PE_FIELD_ClientShare_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3360d7d4-7767-cc20-5e69-ef3a09794e0c")
public static String es_PE_FIELD_ClientShare_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="45e95358-8510-d4a9-affd-d25ba9ed71bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3360d7d4-7767-cc20-5e69-ef3a09794e0c")
public static final String FIELDNAME_ClientShare_Name="3360d7d4-7767-cc20-5e69-ef3a09794e0c";

@XendraTrl(Identifier="64ee3a70-ffde-0206-b993-3dd3424aad9f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64ee3a70-ffde-0206-b993-3dd3424aad9f",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Share Type.
@param ShareType Type of sharing */
public void setShareType (String ShareType)
{
if (ShareType.length() > 1)
{
log.warning("Length > 1 - truncated");
ShareType = ShareType.substring(0,0);
}
set_Value (COLUMNNAME_ShareType, ShareType);
}
/** Get Share Type.
@return Type of sharing */
public String getShareType() 
{
return (String)get_Value(COLUMNNAME_ShareType);
}

@XendraTrl(Identifier="f2f676a0-865b-ca7e-c7e7-634cddfe8ed2")
public static String es_PE_FIELD_ClientShare_ShareType_Name="Modo de Compartir";

@XendraTrl(Identifier="f2f676a0-865b-ca7e-c7e7-634cddfe8ed2")
public static String es_PE_FIELD_ClientShare_ShareType_Description="Modo de Compartir";

@XendraTrl(Identifier="f2f676a0-865b-ca7e-c7e7-634cddfe8ed2")
public static String es_PE_FIELD_ClientShare_ShareType_Help="Define si una tabla se comparte con un cliente o no.";

@XendraField(AD_Column_ID="ShareType",IsCentrallyMaintained=true,
AD_Tab_ID="45e95358-8510-d4a9-affd-d25ba9ed71bb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2f676a0-865b-ca7e-c7e7-634cddfe8ed2")
public static final String FIELDNAME_ClientShare_ShareType="f2f676a0-865b-ca7e-c7e7-634cddfe8ed2";

@XendraTrl(Identifier="9fb04094-6a94-396b-27b0-8d75504720d7")
public static String es_PE_COLUMN_ShareType_Name="Modo de Compartir";

@XendraColumn(AD_Element_ID="ec17e1d7-22bc-a67c-3bdd-4d75d4279034",ColumnName="ShareType",
AD_Reference_ID=17,AD_Reference_Value_ID="f965e06c-e1db-ec23-d09c-48c45b6df874",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9fb04094-6a94-396b-27b0-8d75504720d7",Synchronized="2020-03-03 21:34:28.0")
/** Column name ShareType */
public static final String COLUMNNAME_ShareType = "ShareType";
}
