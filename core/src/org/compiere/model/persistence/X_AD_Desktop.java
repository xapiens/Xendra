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
/** Generated Model for AD_Desktop
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Desktop extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Desktop_ID id
@param trxName transaction
*/
public X_AD_Desktop (Properties ctx, int AD_Desktop_ID, String trxName)
{
super (ctx, AD_Desktop_ID, trxName);
/** if (AD_Desktop_ID == 0)
{
setAD_Desktop_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Desktop (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=458 */
public static int Table_ID=MTable.getTable_ID("AD_Desktop");

@XendraTrl(Identifier="b0f316d9-d346-9088-82c4-51246e514ac2")
public static String es_PE_TAB_Desktop_Description="Escritorio es una conjunto de bancos de trabajo";

@XendraTrl(Identifier="b0f316d9-d346-9088-82c4-51246e514ac2")
public static String es_PE_TAB_Desktop_Name="Escritorio";

@XendraTrl(Identifier="b0f316d9-d346-9088-82c4-51246e514ac2")
public static String es_PE_TAB_Desktop_Help="Escritorio es una colección de bancos de trabajo.";

@XendraTab(Name="Desktop",Description="Desktop is a collection of Workbenches",
Help="Desktop is a collection of Workbenches",AD_Window_ID="1e215aa5-19c2-dcfe-4977-953ef21540ec",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b0f316d9-d346-9088-82c4-51246e514ac2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Desktop="b0f316d9-d346-9088-82c4-51246e514ac2";

@XendraTrl(Identifier="dc498e62-8789-2c35-0b59-fd2017942d2a")
public static String es_PE_TABLE_AD_Desktop_Name="Escritorio";

@XendraTable(Name="Desktop",Description="Collection of Workbenches",Help="",TableName="AD_Desktop",
AccessLevel="4",AD_Window_ID="1e215aa5-19c2-dcfe-4977-953ef21540ec",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="dc498e62-8789-2c35-0b59-fd2017942d2a",Synchronized="2017-08-16 11:40:09.0")
/** TableName=AD_Desktop */
public static final String Table_Name="AD_Desktop";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Desktop");

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
    Table_ID = MTable.getTable_ID("AD_Desktop");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Desktop[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Color.
@param AD_Color_ID Color for backgrounds or indicators */
public void setAD_Color_ID (Object AD_Color_ID)
{
set_Value (COLUMNNAME_AD_Color_ID, AD_Color_ID);
}
/** Get System Color.
@return Color for backgrounds or indicators */
public Object getAD_Color_ID() 
{
return get_Value(COLUMNNAME_AD_Color_ID);
}

@XendraTrl(Identifier="b9f28141-f741-7d01-8bbc-dd5495fa6543")
public static String es_PE_FIELD_Desktop_SystemColor_Description="Color para el fondo ó indicadores";

@XendraTrl(Identifier="b9f28141-f741-7d01-8bbc-dd5495fa6543")
public static String es_PE_FIELD_Desktop_SystemColor_Name="Color";

@XendraField(AD_Column_ID="AD_Color_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b0f316d9-d346-9088-82c4-51246e514ac2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9f28141-f741-7d01-8bbc-dd5495fa6543")
public static final String FIELDNAME_Desktop_SystemColor="b9f28141-f741-7d01-8bbc-dd5495fa6543";

@XendraTrl(Identifier="e6db65e2-fc58-29f6-1014-f3c17504501d")
public static String es_PE_COLUMN_AD_Color_ID_Name="Color";

@XendraColumn(AD_Element_ID="e2547f9b-260e-de2e-bcfa-1188b5ee4d22",ColumnName="AD_Color_ID",
AD_Reference_ID=27,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6db65e2-fc58-29f6-1014-f3c17504501d",
Synchronized="2017-08-05 16:52:28.0")
/** Column name AD_Color_ID */
public static final String COLUMNNAME_AD_Color_ID = "AD_Color_ID";
/** Set Desktop.
@param AD_Desktop_ID Collection of Workbenches */
public void setAD_Desktop_ID (int AD_Desktop_ID)
{
if (AD_Desktop_ID < 1) throw new IllegalArgumentException ("AD_Desktop_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Desktop_ID, Integer.valueOf(AD_Desktop_ID));
}
/** Get Desktop.
@return Collection of Workbenches */
public int getAD_Desktop_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Desktop_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="281a9ac3-70a8-e37e-e68e-0341505723f8")
public static String es_PE_FIELD_Desktop_Desktop_Description="Colección de bancos de trabajo";

@XendraTrl(Identifier="281a9ac3-70a8-e37e-e68e-0341505723f8")
public static String es_PE_FIELD_Desktop_Desktop_Name="Escritorio";

@XendraField(AD_Column_ID="AD_Desktop_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b0f316d9-d346-9088-82c4-51246e514ac2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="281a9ac3-70a8-e37e-e68e-0341505723f8")
public static final String FIELDNAME_Desktop_Desktop="281a9ac3-70a8-e37e-e68e-0341505723f8";
/** Column name AD_Desktop_ID */
public static final String COLUMNNAME_AD_Desktop_ID = "AD_Desktop_ID";
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

@XendraTrl(Identifier="655e2440-2a10-eb4e-0237-b98ee2ff046b")
public static String es_PE_FIELD_Desktop_Image_Description="Imagen del sistema";

@XendraTrl(Identifier="655e2440-2a10-eb4e-0237-b98ee2ff046b")
public static String es_PE_FIELD_Desktop_Image_Name="Imagen";

@XendraField(AD_Column_ID="AD_Image_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b0f316d9-d346-9088-82c4-51246e514ac2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="655e2440-2a10-eb4e-0237-b98ee2ff046b")
public static final String FIELDNAME_Desktop_Image="655e2440-2a10-eb4e-0237-b98ee2ff046b";

@XendraTrl(Identifier="3ad7dacc-d361-4056-8e10-69abb4b411f7")
public static String es_PE_COLUMN_AD_Image_ID_Name="Imagen";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=32,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ad7dacc-d361-4056-8e10-69abb4b411f7",
Synchronized="2017-08-05 16:52:28.0")
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

@XendraTrl(Identifier="fda97dd0-1305-c744-1d31-d4ecb1604d40")
public static String es_PE_FIELD_Desktop_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="fda97dd0-1305-c744-1d31-d4ecb1604d40")
public static String es_PE_FIELD_Desktop_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="fda97dd0-1305-c744-1d31-d4ecb1604d40")
public static String es_PE_FIELD_Desktop_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b0f316d9-d346-9088-82c4-51246e514ac2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fda97dd0-1305-c744-1d31-d4ecb1604d40")
public static final String FIELDNAME_Desktop_Description="fda97dd0-1305-c744-1d31-d4ecb1604d40";

@XendraTrl(Identifier="1af863e0-bef3-5144-ae1e-d3edd0e091f3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1af863e0-bef3-5144-ae1e-d3edd0e091f3",
Synchronized="2017-08-05 16:52:29.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="77893cbd-d105-acf0-d9ce-0c8b837b40dc")
public static String es_PE_FIELD_Desktop_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="77893cbd-d105-acf0-d9ce-0c8b837b40dc")
public static String es_PE_FIELD_Desktop_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="77893cbd-d105-acf0-d9ce-0c8b837b40dc")
public static String es_PE_FIELD_Desktop_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="b0f316d9-d346-9088-82c4-51246e514ac2",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="77893cbd-d105-acf0-d9ce-0c8b837b40dc")
public static final String FIELDNAME_Desktop_CommentHelp="77893cbd-d105-acf0-d9ce-0c8b837b40dc";

@XendraTrl(Identifier="94079fe8-8ba4-8d1c-1362-3305e56c657e")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94079fe8-8ba4-8d1c-1362-3305e56c657e",
Synchronized="2017-08-05 16:52:29.0")
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
@XendraTrl(Identifier="60f95a62-3e28-47ec-96db-e5ebd6beed4a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60f95a62-3e28-47ec-96db-e5ebd6beed4a",
Synchronized="2017-08-05 16:52:29.0")
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

@XendraTrl(Identifier="981796b8-27fd-bfda-e634-f1df982784d5")
public static String es_PE_FIELD_Desktop_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="981796b8-27fd-bfda-e634-f1df982784d5")
public static String es_PE_FIELD_Desktop_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="981796b8-27fd-bfda-e634-f1df982784d5")
public static String es_PE_FIELD_Desktop_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="b0f316d9-d346-9088-82c4-51246e514ac2",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="981796b8-27fd-bfda-e634-f1df982784d5")
public static final String FIELDNAME_Desktop_Name="981796b8-27fd-bfda-e634-f1df982784d5";

@XendraTrl(Identifier="7b753d1c-7e40-804e-eb96-ae036a615dea")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b753d1c-7e40-804e-eb96-ae036a615dea",
Synchronized="2017-08-05 16:52:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
