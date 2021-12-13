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
/** Generated Model for AD_Window
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Window extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Window_ID id
@param trxName transaction
*/
public X_AD_Window (Properties ctx, int AD_Window_ID, String trxName)
{
super (ctx, AD_Window_ID, trxName);
/** if (AD_Window_ID == 0)
{
setAD_Window_ID (0);
setEntityType (null);	
// U
setIsBetaFunctionality (false);	
// N
setIsDefault (false);	
// N
setIsSOTrx (true);	
// Y
setName (null);
setWindowType (null);	
// M
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Window (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=105 */
public static int Table_ID=MTable.getTable_ID("AD_Window");

@XendraTrl(Identifier="dc7d6795-788d-3cb1-3b65-9efee778875b")
public static String es_PE_TAB_Window_Description="Definiciones de encabezamiento de ventana";

@XendraTrl(Identifier="dc7d6795-788d-3cb1-3b65-9efee778875b")
public static String es_PE_TAB_Window_Help="La pestaña de ventanas define cada ventana en el sistema";

@XendraTrl(Identifier="dc7d6795-788d-3cb1-3b65-9efee778875b")
public static String es_PE_TAB_Window_Name="Ventana";
@XendraTab(Name="Window",
Description="Window header definitions",
Help="The Window Tab defines each window in the system. The default flag indicates that this window should be used as the default Zoom windows for the tables in this window.",
AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dc7d6795-788d-3cb1-3b65-9efee778875b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Window="dc7d6795-788d-3cb1-3b65-9efee778875b";

@XendraTrl(Identifier="b0f1504c-0811-8c82-a1f0-5bc605cbae7f")
public static String es_PE_TABLE_AD_Window_Name="Ventana";

@XendraTable(Name="Window",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Data entry or display window",
Help="",TableName="AD_Window",AccessLevel="4",AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=50,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="b0f1504c-0811-8c82-a1f0-5bc605cbae7f",Synchronized="2020-03-03 21:36:11.0")
/** TableName=AD_Window */
public static final String Table_Name="AD_Window";


@XendraIndex(Name="ad_window_name",Identifier="6456909d-7247-2f1b-9fdb-730466b10d5a",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="6456909d-7247-2f1b-9fdb-730466b10d5a",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_window_name = "6456909d-7247-2f1b-9fdb-730466b10d5a";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Window");

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
    Table_ID = MTable.getTable_ID("AD_Window");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Window[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Color.
@param AD_Color_ID Color for backgrounds or indicators */
public void setAD_Color_ID (int AD_Color_ID)
{
if (AD_Color_ID <= 0) set_Value (COLUMNNAME_AD_Color_ID, null);
 else 
set_Value (COLUMNNAME_AD_Color_ID, Integer.valueOf(AD_Color_ID));
}
/** Get System Color.
@return Color for backgrounds or indicators */
public int getAD_Color_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Color_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3de764ea-f35e-e897-9f6f-8ecdf7673f01")
public static String es_PE_FIELD_Window_SystemColor_Name="Color";

@XendraTrl(Identifier="3de764ea-f35e-e897-9f6f-8ecdf7673f01")
public static String es_PE_FIELD_Window_SystemColor_Description="Color para el fondo ó indicadores";

@XendraField(AD_Column_ID="AD_Color_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3de764ea-f35e-e897-9f6f-8ecdf7673f01")
public static final String FIELDNAME_Window_SystemColor="3de764ea-f35e-e897-9f6f-8ecdf7673f01";

@XendraTrl(Identifier="06c478b8-435d-4611-18dc-8ae0c7600223")
public static String es_PE_COLUMN_AD_Color_ID_Name="Color";

@XendraColumn(AD_Element_ID="e2547f9b-260e-de2e-bcfa-1188b5ee4d22",ColumnName="AD_Color_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06c478b8-435d-4611-18dc-8ae0c7600223",
Synchronized="2019-08-30 22:20:53.0")
/** Column name AD_Color_ID */
public static final String COLUMNNAME_AD_Color_ID = "AD_Color_ID";
/** Set Image.
@param AD_Image_ID Image or Icon */
public void setAD_Image_ID (int AD_Image_ID)
{
if (AD_Image_ID <= 0) set_Value (COLUMNNAME_AD_Image_ID, null);
 else 
set_Value (COLUMNNAME_AD_Image_ID, Integer.valueOf(AD_Image_ID));
}
/** Get Image.
@return Image or Icon */
public int getAD_Image_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Image_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="62fed4cd-5b9a-6ede-f388-7e11a6042e5c")
public static String es_PE_FIELD_Window_Image_Name="Imagen";

@XendraTrl(Identifier="62fed4cd-5b9a-6ede-f388-7e11a6042e5c")
public static String es_PE_FIELD_Window_Image_Description="Imagen del sistema";

@XendraField(AD_Column_ID="AD_Image_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62fed4cd-5b9a-6ede-f388-7e11a6042e5c")
public static final String FIELDNAME_Window_Image="62fed4cd-5b9a-6ede-f388-7e11a6042e5c";

@XendraTrl(Identifier="3565dd6d-ddc3-809a-d443-e6b05c8e7f30")
public static String es_PE_COLUMN_AD_Image_ID_Name="Imagen";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3565dd6d-ddc3-809a-d443-e6b05c8e7f30",
Synchronized="2019-08-30 22:20:53.0")
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
/** Set Package Name.
@param AD_Package_ID Package Name */
public void setAD_Package_ID (int AD_Package_ID)
{
if (AD_Package_ID <= 0) set_Value (COLUMNNAME_AD_Package_ID, null);
 else 
set_Value (COLUMNNAME_AD_Package_ID, Integer.valueOf(AD_Package_ID));
}
/** Get Package Name.
@return Package Name */
public int getAD_Package_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Package_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5d321763-3ebc-4e93-8400-00b3573c332b")
public static String es_PE_COLUMN_AD_Package_ID_Name="Package Name";

@XendraColumn(AD_Element_ID="8abc8a9d-2c12-4d3a-a067-87f6010b95f1",ColumnName="AD_Package_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d321763-3ebc-4e93-8400-00b3573c332b",
Synchronized="2019-08-30 22:20:53.0")
/** Column name AD_Package_ID */
public static final String COLUMNNAME_AD_Package_ID = "AD_Package_ID";
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID <= 0) set_Value (COLUMNNAME_AD_Plugin_ID, null);
 else 
set_Value (COLUMNNAME_AD_Plugin_ID, Integer.valueOf(AD_Plugin_ID));
}
/** Get Plugin.
@return Plugin */
public int getAD_Plugin_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Plugin_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="caf9ac8a-d1c1-4172-8d9a-6161806993f5")
public static String es_PE_COLUMN_AD_Plugin_ID_Name="Plugin";

@XendraColumn(AD_Element_ID="895f0c3e-fa52-48b7-8fce-f9b2dc637774",ColumnName="AD_Plugin_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="caf9ac8a-d1c1-4172-8d9a-6161806993f5",
Synchronized="2019-08-30 22:20:53.0")
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID < 1) throw new IllegalArgumentException ("AD_Window_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="39061169-7d96-2f25-860a-665eb79c4a17")
public static String es_PE_FIELD_Window_Window_Name="Ventana";

@XendraTrl(Identifier="39061169-7d96-2f25-860a-665eb79c4a17")
public static String es_PE_FIELD_Window_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="39061169-7d96-2f25-860a-665eb79c4a17")
public static String es_PE_FIELD_Window_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39061169-7d96-2f25-860a-665eb79c4a17")
public static final String FIELDNAME_Window_Window="39061169-7d96-2f25-860a-665eb79c4a17";
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
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

@XendraTrl(Identifier="1621773a-b90d-9dc1-2628-ebdf31b9cca6")
public static String es_PE_FIELD_Window_Description_Name="Observación";

@XendraTrl(Identifier="1621773a-b90d-9dc1-2628-ebdf31b9cca6")
public static String es_PE_FIELD_Window_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="1621773a-b90d-9dc1-2628-ebdf31b9cca6")
public static String es_PE_FIELD_Window_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1621773a-b90d-9dc1-2628-ebdf31b9cca6")
public static final String FIELDNAME_Window_Description="1621773a-b90d-9dc1-2628-ebdf31b9cca6";

@XendraTrl(Identifier="f5862572-a584-ddbb-427e-3bf84590dbea")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5862572-a584-ddbb-427e-3bf84590dbea",
Synchronized="2019-08-30 22:20:53.0")
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

@XendraTrl(Identifier="2ea152ba-10d5-0610-1ccb-8cbdf1b6f64a")
public static String es_PE_FIELD_Window_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="2ea152ba-10d5-0610-1ccb-8cbdf1b6f64a")
public static String es_PE_FIELD_Window_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="2ea152ba-10d5-0610-1ccb-8cbdf1b6f64a")
public static String es_PE_FIELD_Window_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ea152ba-10d5-0610-1ccb-8cbdf1b6f64a")
public static final String FIELDNAME_Window_EntityType="2ea152ba-10d5-0610-1ccb-8cbdf1b6f64a";

@XendraTrl(Identifier="d3c9a59f-342b-2359-fa71-9b3509113b48")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d3c9a59f-342b-2359-fa71-9b3509113b48",Synchronized="2019-08-30 22:20:53.0")
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

@XendraTrl(Identifier="a44f44bb-1e96-ff01-ac91-b2b5b4bf6858")
public static String es_PE_FIELD_Window_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="a44f44bb-1e96-ff01-ac91-b2b5b4bf6858")
public static String es_PE_FIELD_Window_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="a44f44bb-1e96-ff01-ac91-b2b5b4bf6858")
public static String es_PE_FIELD_Window_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a44f44bb-1e96-ff01-ac91-b2b5b4bf6858")
public static final String FIELDNAME_Window_CommentHelp="a44f44bb-1e96-ff01-ac91-b2b5b4bf6858";

@XendraTrl(Identifier="44d0177a-5a91-ad6d-25c9-c400fbc03166")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44d0177a-5a91-ad6d-25c9-c400fbc03166",
Synchronized="2019-08-30 22:20:53.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="425f1229-876f-4009-8702-8d713adaa415")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="425f1229-876f-4009-8702-8d713adaa415",
Synchronized="2019-08-30 22:20:53.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
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
@XendraTrl(Identifier="af9caacc-c5d1-db10-ac88-830be4981528")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af9caacc-c5d1-db10-ac88-830be4981528",
Synchronized="2019-08-30 22:20:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Beta Functionality.
@param IsBetaFunctionality This functionality is considered Beta */
public void setIsBetaFunctionality (boolean IsBetaFunctionality)
{
set_Value (COLUMNNAME_IsBetaFunctionality, Boolean.valueOf(IsBetaFunctionality));
}
/** Get Beta Functionality.
@return This functionality is considered Beta */
public boolean isBetaFunctionality() 
{
Object oo = get_Value(COLUMNNAME_IsBetaFunctionality);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fdb186e8-5003-c696-25bc-4146d2d63bf7")
public static String es_PE_FIELD_Window_BetaFunctionality_Name="Funcionalidad Beta";

@XendraTrl(Identifier="fdb186e8-5003-c696-25bc-4146d2d63bf7")
public static String es_PE_FIELD_Window_BetaFunctionality_Description="Esta funcionalidad se considera como Beta";

@XendraTrl(Identifier="fdb186e8-5003-c696-25bc-4146d2d63bf7")
public static String es_PE_FIELD_Window_BetaFunctionality_Help="La funcionalidad beta no esta probada ni completada.";

@XendraField(AD_Column_ID="IsBetaFunctionality",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdb186e8-5003-c696-25bc-4146d2d63bf7")
public static final String FIELDNAME_Window_BetaFunctionality="fdb186e8-5003-c696-25bc-4146d2d63bf7";

@XendraTrl(Identifier="da080c62-b913-159b-a101-70a510ecca9c")
public static String es_PE_COLUMN_IsBetaFunctionality_Name="Funcionalidad Beta";

@XendraColumn(AD_Element_ID="6537bbc5-66e0-d1d1-5adc-cef787e2f4b6",
ColumnName="IsBetaFunctionality",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="da080c62-b913-159b-a101-70a510ecca9c",Synchronized="2019-08-30 22:20:53.0")
/** Column name IsBetaFunctionality */
public static final String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c856246b-4d75-2b07-33d3-30fb772c8ed7")
public static String es_PE_FIELD_Window_Default_Name="Predeterminado";

@XendraTrl(Identifier="c856246b-4d75-2b07-33d3-30fb772c8ed7")
public static String es_PE_FIELD_Window_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="c856246b-4d75-2b07-33d3-30fb772c8ed7")
public static String es_PE_FIELD_Window_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c856246b-4d75-2b07-33d3-30fb772c8ed7")
public static final String FIELDNAME_Window_Default="c856246b-4d75-2b07-33d3-30fb772c8ed7";

@XendraTrl(Identifier="4ad1efdb-69de-56bb-553c-abc25f88dd9a")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ad1efdb-69de-56bb-553c-abc25f88dd9a",
Synchronized="2019-08-30 22:20:53.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="722c5f96-330e-40d5-a305-37409d85c9a7")
public static String es_PE_FIELD_Window_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="722c5f96-330e-40d5-a305-37409d85c9a7")
public static String es_PE_FIELD_Window_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="722c5f96-330e-40d5-a305-37409d85c9a7")
public static String es_PE_FIELD_Window_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="722c5f96-330e-40d5-a305-37409d85c9a7")
public static final String FIELDNAME_Window_SalesTransaction="722c5f96-330e-40d5-a305-37409d85c9a7";

@XendraTrl(Identifier="4b21563f-1e6b-c31d-dd55-5e44af0bbb14")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b21563f-1e6b-c31d-dd55-5e44af0bbb14",
Synchronized="2019-08-30 22:20:53.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Lockout.
@param Lockout Lockout */
public void setLockout (boolean Lockout)
{
set_Value (COLUMNNAME_Lockout, Boolean.valueOf(Lockout));
}
/** Get Lockout.
@return Lockout */
public boolean isLockout() 
{
Object oo = get_Value(COLUMNNAME_Lockout);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="414f2739-4db3-49fb-b9b9-56d12003fc9c")
public static String es_PE_COLUMN_Lockout_Name="Lockout";

@XendraColumn(AD_Element_ID="63f75f32-a2eb-4522-a988-6c753105407e",ColumnName="Lockout",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="414f2739-4db3-49fb-b9b9-56d12003fc9c",
Synchronized="2019-08-30 22:20:53.0")
/** Column name Lockout */
public static final String COLUMNNAME_Lockout = "Lockout";
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

@XendraTrl(Identifier="dbc5ebc7-e6c6-5acb-8e74-91496863d0cd")
public static String es_PE_FIELD_Window_Name_Name="Nombre";

@XendraTrl(Identifier="dbc5ebc7-e6c6-5acb-8e74-91496863d0cd")
public static String es_PE_FIELD_Window_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="dbc5ebc7-e6c6-5acb-8e74-91496863d0cd")
public static String es_PE_FIELD_Window_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbc5ebc7-e6c6-5acb-8e74-91496863d0cd")
public static final String FIELDNAME_Window_Name="dbc5ebc7-e6c6-5acb-8e74-91496863d0cd";

@XendraTrl(Identifier="37c76e8a-873a-1bbc-74bf-7a2fa6bda55d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37c76e8a-873a-1bbc-74bf-7a2fa6bda55d",
Synchronized="2019-08-30 22:20:53.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="16eb4e31-a10c-74f8-ed26-e8ad7dc0aaac")
public static String es_PE_FIELD_Window_ProcessNow_Name="Copiar Pestañas";

@XendraTrl(Identifier="16eb4e31-a10c-74f8-ed26-e8ad7dc0aaac")
public static String es_PE_FIELD_Window_ProcessNow_Help="Copiar todas las pestañas y campos de la ventana";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16eb4e31-a10c-74f8-ed26-e8ad7dc0aaac")
public static final String FIELDNAME_Window_ProcessNow="16eb4e31-a10c-74f8-ed26-e8ad7dc0aaac";

@XendraTrl(Identifier="b283eae5-1888-55ab-9100-d2f0faedc384")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="f07ce68e-494c-474c-0268-db3dcffca872",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b283eae5-1888-55ab-9100-d2f0faedc384",Synchronized="2019-08-30 22:20:53.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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

@XendraTrl(Identifier="0f333e0a-e9cf-3a06-6453-62da87436379")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f333e0a-e9cf-3a06-6453-62da87436379",
Synchronized="2019-08-30 22:20:53.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set WindowType.
@param WindowType Type or classification of a Window */
public void setWindowType (String WindowType)
{
if (WindowType.length() > 1)
{
log.warning("Length > 1 - truncated");
WindowType = WindowType.substring(0,0);
}
set_Value (COLUMNNAME_WindowType, WindowType);
}
/** Get WindowType.
@return Type or classification of a Window */
public String getWindowType() 
{
return (String)get_Value(COLUMNNAME_WindowType);
}

@XendraTrl(Identifier="ded85753-a485-7faa-f70a-20c78eb40cc8")
public static String es_PE_FIELD_Window_WindowType_Name="Ventana Tipo";

@XendraTrl(Identifier="ded85753-a485-7faa-f70a-20c78eb40cc8")
public static String es_PE_FIELD_Window_WindowType_Description="Tipo de clasificación de una ventana";

@XendraTrl(Identifier="ded85753-a485-7faa-f70a-20c78eb40cc8")
public static String es_PE_FIELD_Window_WindowType_Help="La ventana tipo indica el tipo de ventana que se está definiendo (mantener; transacción ó consulta)";

@XendraField(AD_Column_ID="WindowType",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ded85753-a485-7faa-f70a-20c78eb40cc8")
public static final String FIELDNAME_Window_WindowType="ded85753-a485-7faa-f70a-20c78eb40cc8";

@XendraTrl(Identifier="29caf4ef-c074-0ec2-5a77-969e86126088")
public static String es_PE_COLUMN_WindowType_Name="Ventana Tipo";

@XendraColumn(AD_Element_ID="833912ff-4779-1307-88c6-9cbc8d047c8a",ColumnName="WindowType",
AD_Reference_ID=17,AD_Reference_Value_ID="245b3e9d-a18e-93e1-9137-e5d618fc7994",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="M",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="29caf4ef-c074-0ec2-5a77-969e86126088",Synchronized="2019-08-30 22:20:53.0")
/** Column name WindowType */
public static final String COLUMNNAME_WindowType = "WindowType";
/** Set Window Height.
@param WinHeight Window Height */
public void setWinHeight (int WinHeight)
{
set_Value (COLUMNNAME_WinHeight, Integer.valueOf(WinHeight));
}
/** Get Window Height.
@return Window Height */
public int getWinHeight() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WinHeight);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7885aaa9-069d-57bb-062e-8fa97eb1596c")
public static String es_PE_FIELD_Window_WindowHeight_Name="Altura de la Ventana";

@XendraTrl(Identifier="7885aaa9-069d-57bb-062e-8fa97eb1596c")
public static String es_PE_FIELD_Window_WindowHeight_Description="Altura de la Ventana";

@XendraTrl(Identifier="7885aaa9-069d-57bb-062e-8fa97eb1596c")
public static String es_PE_FIELD_Window_WindowHeight_Help="Tamaño fisico de la Ventana.";

@XendraField(AD_Column_ID="WinHeight",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7885aaa9-069d-57bb-062e-8fa97eb1596c")
public static final String FIELDNAME_Window_WindowHeight="7885aaa9-069d-57bb-062e-8fa97eb1596c";

@XendraTrl(Identifier="004da3f1-d0d7-6955-9ed4-96d530ab212d")
public static String es_PE_COLUMN_WinHeight_Name="Altura de la Ventana";

@XendraColumn(AD_Element_ID="8ee82b27-b9fe-0780-0b45-1784399a06a2",ColumnName="WinHeight",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="004da3f1-d0d7-6955-9ed4-96d530ab212d",
Synchronized="2019-08-30 22:20:53.0")
/** Column name WinHeight */
public static final String COLUMNNAME_WinHeight = "WinHeight";
/** Set Window Width.
@param WinWidth Window Width */
public void setWinWidth (int WinWidth)
{
set_Value (COLUMNNAME_WinWidth, Integer.valueOf(WinWidth));
}
/** Get Window Width.
@return Window Width */
public int getWinWidth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WinWidth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9a67ebd2-6cd0-0d9d-2df7-fa15a904aa96")
public static String es_PE_FIELD_Window_WindowWidth_Name="Ancho de la Ventana";

@XendraTrl(Identifier="9a67ebd2-6cd0-0d9d-2df7-fa15a904aa96")
public static String es_PE_FIELD_Window_WindowWidth_Description="Ancho de la Ventana";

@XendraTrl(Identifier="9a67ebd2-6cd0-0d9d-2df7-fa15a904aa96")
public static String es_PE_FIELD_Window_WindowWidth_Help="El ancho de la ventana indica la dimensión del ancho requerido en la ventana.";

@XendraField(AD_Column_ID="WinWidth",IsCentrallyMaintained=true,
AD_Tab_ID="dc7d6795-788d-3cb1-3b65-9efee778875b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a67ebd2-6cd0-0d9d-2df7-fa15a904aa96")
public static final String FIELDNAME_Window_WindowWidth="9a67ebd2-6cd0-0d9d-2df7-fa15a904aa96";

@XendraTrl(Identifier="5457ef2f-9b4a-05b4-8b40-a286cdddc546")
public static String es_PE_COLUMN_WinWidth_Name="Ancho de la Ventana";

@XendraColumn(AD_Element_ID="f47faa9d-946a-bb5b-dce2-b215f06d0ea8",ColumnName="WinWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5457ef2f-9b4a-05b4-8b40-a286cdddc546",
Synchronized="2019-08-30 22:20:53.0")
/** Column name WinWidth */
public static final String COLUMNNAME_WinWidth = "WinWidth";
}
