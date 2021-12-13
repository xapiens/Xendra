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
/** Generated Model for M_ProductDownload
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ProductDownload extends PO
{
/** Standard Constructor
@param ctx context
@param M_ProductDownload_ID id
@param trxName transaction
*/
public X_M_ProductDownload (Properties ctx, int M_ProductDownload_ID, String trxName)
{
super (ctx, M_ProductDownload_ID, trxName);
/** if (M_ProductDownload_ID == 0)
{
setDownloadURL (null);
setM_ProductDownload_ID (0);
setM_Product_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_ProductDownload (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=777 */
public static int Table_ID=MTable.getTable_ID("M_ProductDownload");

@XendraTrl(Identifier="5cb3f263-0a86-6bdf-aa46-335d23f411b7")
public static String es_PE_TAB_Download_Description="Mantener transferencias directas del producto";

@XendraTrl(Identifier="5cb3f263-0a86-6bdf-aa46-335d23f411b7")
public static String es_PE_TAB_Download_Help="Define transferencias directas para un producto. Si el producto es un activo, el usuario puede descargar los datos.";

@XendraTrl(Identifier="5cb3f263-0a86-6bdf-aa46-335d23f411b7")
public static String es_PE_TAB_Download_Name="Descarga";
@XendraTab(Name="Download",
Description="Maintain Product Downloads",
Help="Define downloads for a product.  If the product is an asset, the user can download the data.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=95,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5cb3f263-0a86-6bdf-aa46-335d23f411b7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Download="5cb3f263-0a86-6bdf-aa46-335d23f411b7";

@XendraTrl(Identifier="1fa5fd4f-527a-abf1-fe65-c4e295fd136c")
public static String es_PE_TABLE_M_ProductDownload_Name="Productos Descargados";

@XendraTable(Name="Product Download",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Product downloads",Help="",
TableName="M_ProductDownload",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="1fa5fd4f-527a-abf1-fe65-c4e295fd136c",Synchronized="2020-03-03 21:38:51.0")
/** TableName=M_ProductDownload */
public static final String Table_Name="M_ProductDownload";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ProductDownload");

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
    Table_ID = MTable.getTable_ID("M_ProductDownload");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ProductDownload[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Download URL.
@param DownloadURL URL of the Download files */
public void setDownloadURL (String DownloadURL)
{
if (DownloadURL == null) throw new IllegalArgumentException ("DownloadURL is mandatory.");
if (DownloadURL.length() > 120)
{
log.warning("Length > 120 - truncated");
DownloadURL = DownloadURL.substring(0,119);
}
set_Value (COLUMNNAME_DownloadURL, DownloadURL);
}
/** Get Download URL.
@return URL of the Download files */
public String getDownloadURL() 
{
String value = (String)get_Value(COLUMNNAME_DownloadURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9314c94d-c0e0-ddad-f6aa-d81aa0c05d5a")
public static String es_PE_FIELD_Download_DownloadURL_Name="Descargas URL ";

@XendraTrl(Identifier="9314c94d-c0e0-ddad-f6aa-d81aa0c05d5a")
public static String es_PE_FIELD_Download_DownloadURL_Description="URL de los archivos de la transferencia directa";

@XendraTrl(Identifier="9314c94d-c0e0-ddad-f6aa-d81aa0c05d5a")
public static String es_PE_FIELD_Download_DownloadURL_Help="El punto y coma son separadores de la lista de URL que se descargará ó distribuirá";

@XendraField(AD_Column_ID="DownloadURL",IsCentrallyMaintained=true,
AD_Tab_ID="5cb3f263-0a86-6bdf-aa46-335d23f411b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9314c94d-c0e0-ddad-f6aa-d81aa0c05d5a")
public static final String FIELDNAME_Download_DownloadURL="9314c94d-c0e0-ddad-f6aa-d81aa0c05d5a";

@XendraTrl(Identifier="e89386bb-be06-59d1-e68e-3820c7edca87")
public static String es_PE_COLUMN_DownloadURL_Name="Descargas URL ";

@XendraColumn(AD_Element_ID="ba4ae79f-d90f-078f-8410-6b8078b6a653",ColumnName="DownloadURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e89386bb-be06-59d1-e68e-3820c7edca87",
Synchronized="2019-08-30 22:23:27.0")
/** Column name DownloadURL */
public static final String COLUMNNAME_DownloadURL = "DownloadURL";
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
@XendraTrl(Identifier="5895d2a9-f659-414e-a189-2b5ad239b0c8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5895d2a9-f659-414e-a189-2b5ad239b0c8",
Synchronized="2019-08-30 22:23:27.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Download.
@param M_ProductDownload_ID Product downloads */
public void setM_ProductDownload_ID (int M_ProductDownload_ID)
{
if (M_ProductDownload_ID < 1) throw new IllegalArgumentException ("M_ProductDownload_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ProductDownload_ID, Integer.valueOf(M_ProductDownload_ID));
}
/** Get Product Download.
@return Product downloads */
public int getM_ProductDownload_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductDownload_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2103111b-63a3-f90d-25f7-8dc5fc15aacb")
public static String es_PE_FIELD_Download_ProductDownload_Name="Productos Descargados";

@XendraTrl(Identifier="2103111b-63a3-f90d-25f7-8dc5fc15aacb")
public static String es_PE_FIELD_Download_ProductDownload_Description="Productos Descargados";

@XendraTrl(Identifier="2103111b-63a3-f90d-25f7-8dc5fc15aacb")
public static String es_PE_FIELD_Download_ProductDownload_Help="Defina la transferencia directa para un producto. Si el producto es un activo, el usuario puede descargar los datos.";

@XendraField(AD_Column_ID="M_ProductDownload_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5cb3f263-0a86-6bdf-aa46-335d23f411b7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2103111b-63a3-f90d-25f7-8dc5fc15aacb")
public static final String FIELDNAME_Download_ProductDownload="2103111b-63a3-f90d-25f7-8dc5fc15aacb";
/** Column name M_ProductDownload_ID */
public static final String COLUMNNAME_M_ProductDownload_ID = "M_ProductDownload_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00133fc3-ba36-2684-d50e-0caeac31ef66")
public static String es_PE_FIELD_Download_Product_Name="Producto";

@XendraTrl(Identifier="00133fc3-ba36-2684-d50e-0caeac31ef66")
public static String es_PE_FIELD_Download_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="00133fc3-ba36-2684-d50e-0caeac31ef66")
public static String es_PE_FIELD_Download_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5cb3f263-0a86-6bdf-aa46-335d23f411b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00133fc3-ba36-2684-d50e-0caeac31ef66")
public static final String FIELDNAME_Download_Product="00133fc3-ba36-2684-d50e-0caeac31ef66";

@XendraTrl(Identifier="c278015c-55d4-8c64-31ff-1ec6e9ae3c0a")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c278015c-55d4-8c64-31ff-1ec6e9ae3c0a",Synchronized="2019-08-30 22:23:27.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="7ccb2566-ffd0-012c-d629-597dd0dd1350")
public static String es_PE_FIELD_Download_Name_Name="Nombre";

@XendraTrl(Identifier="7ccb2566-ffd0-012c-d629-597dd0dd1350")
public static String es_PE_FIELD_Download_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="7ccb2566-ffd0-012c-d629-597dd0dd1350")
public static String es_PE_FIELD_Download_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="5cb3f263-0a86-6bdf-aa46-335d23f411b7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ccb2566-ffd0-012c-d629-597dd0dd1350")
public static final String FIELDNAME_Download_Name="7ccb2566-ffd0-012c-d629-597dd0dd1350";

@XendraTrl(Identifier="682f605f-dc40-90d0-f986-1134af72b3da")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="682f605f-dc40-90d0-f986-1134af72b3da",
Synchronized="2019-08-30 22:23:27.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
