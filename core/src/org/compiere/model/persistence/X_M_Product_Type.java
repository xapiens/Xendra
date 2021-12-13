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
/** Generated Model for M_Product_Type
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Type extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Type_ID id
@param trxName transaction
*/
public X_M_Product_Type (Properties ctx, int M_Product_Type_ID, String trxName)
{
super (ctx, M_Product_Type_ID, trxName);
/** if (M_Product_Type_ID == 0)
{
setM_Product_Type_ID (0);
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
public X_M_Product_Type (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000070 */
public static int Table_ID=MTable.getTable_ID("M_Product_Type");

@XendraTrl(Identifier="154913db-788f-2253-4219-a5d2d2020332")
public static String es_PE_TAB_ProductType_Description="Define el Tipo de Producto";

@XendraTrl(Identifier="154913db-788f-2253-4219-a5d2d2020332")
public static String es_PE_TAB_ProductType_Help="El tipo de exisntencia le permite definir los códigos Sunat";

@XendraTrl(Identifier="154913db-788f-2253-4219-a5d2d2020332")
public static String es_PE_TAB_ProductType_Name="Tipo de Producto";
@XendraTab(Name="Product Type",
Description="Define Product Type",Help="The Product Type defines unique groupings of products.",
AD_Window_ID="29eccc1f-17f4-2288-6856-612a4efdc4c5",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="154913db-788f-2253-4219-a5d2d2020332",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductType="154913db-788f-2253-4219-a5d2d2020332";

@XendraTrl(Identifier="d13a62f3-468d-b215-bf41-84beb2545aec")
public static String es_PE_TABLE_M_Product_Type_Name="Tipo de Producto";

@XendraTable(Name="Product Type",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Type of a Product",Help="",
TableName="M_Product_Type",AccessLevel="3",AD_Window_ID="29eccc1f-17f4-2288-6856-612a4efdc4c5",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="d13a62f3-468d-b215-bf41-84beb2545aec",Synchronized="2020-03-03 21:38:54.0")
/** TableName=M_Product_Type */
public static final String Table_Name="M_Product_Type";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Type");

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
    Table_ID = MTable.getTable_ID("M_Product_Type");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Type[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="df3e5e8d-1d93-cc9d-eaa9-219ee1ccc2c7")
public static String es_PE_FIELD_ProductType_Description_Name="Descripción";

@XendraTrl(Identifier="df3e5e8d-1d93-cc9d-eaa9-219ee1ccc2c7")
public static String es_PE_FIELD_ProductType_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="df3e5e8d-1d93-cc9d-eaa9-219ee1ccc2c7")
public static String es_PE_FIELD_ProductType_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="154913db-788f-2253-4219-a5d2d2020332",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df3e5e8d-1d93-cc9d-eaa9-219ee1ccc2c7")
public static final String FIELDNAME_ProductType_Description="df3e5e8d-1d93-cc9d-eaa9-219ee1ccc2c7";

@XendraTrl(Identifier="0ba2af38-7aa2-d354-b3d5-40ab7f4a6b48")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ba2af38-7aa2-d354-b3d5-40ab7f4a6b48",
Synchronized="2019-08-30 22:23:29.0")
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

@XendraTrl(Identifier="9ca15885-fec0-cb33-ce04-88fadbc75810")
public static String es_PE_FIELD_ProductType_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="9ca15885-fec0-cb33-ce04-88fadbc75810")
public static String es_PE_FIELD_ProductType_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="9ca15885-fec0-cb33-ce04-88fadbc75810")
public static String es_PE_FIELD_ProductType_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="154913db-788f-2253-4219-a5d2d2020332",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ca15885-fec0-cb33-ce04-88fadbc75810")
public static final String FIELDNAME_ProductType_CommentHelp="9ca15885-fec0-cb33-ce04-88fadbc75810";

@XendraTrl(Identifier="a6dc822a-3085-2c69-8c53-45647eb7723c")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6dc822a-3085-2c69-8c53-45647eb7723c",
Synchronized="2019-08-30 22:23:29.0")
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
@XendraTrl(Identifier="3d4f4265-5660-42ea-b024-227635f7c649")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d4f4265-5660-42ea-b024-227635f7c649",
Synchronized="2019-08-30 22:23:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Type.
@param M_Product_Type_ID Type of a Product */
public void setM_Product_Type_ID (int M_Product_Type_ID)
{
if (M_Product_Type_ID < 1) throw new IllegalArgumentException ("M_Product_Type_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_Type_ID, Integer.valueOf(M_Product_Type_ID));
}
/** Get Product Type.
@return Type of a Product */
public int getM_Product_Type_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Type_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8bdafe43-e41a-f5dc-f7f3-5ca1d6f107fb")
public static String es_PE_FIELD_ProductType_ProductType_Name="Product Type";

@XendraField(AD_Column_ID="M_Product_Type_ID",IsCentrallyMaintained=true,
AD_Tab_ID="154913db-788f-2253-4219-a5d2d2020332",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bdafe43-e41a-f5dc-f7f3-5ca1d6f107fb")
public static final String FIELDNAME_ProductType_ProductType="8bdafe43-e41a-f5dc-f7f3-5ca1d6f107fb";
/** Column name M_Product_Type_ID */
public static final String COLUMNNAME_M_Product_Type_ID = "M_Product_Type_ID";
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

@XendraTrl(Identifier="76ca332a-6969-0a39-6fa5-6940d190542c")
public static String es_PE_FIELD_ProductType_Name_Name="Nombre";

@XendraTrl(Identifier="76ca332a-6969-0a39-6fa5-6940d190542c")
public static String es_PE_FIELD_ProductType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="76ca332a-6969-0a39-6fa5-6940d190542c")
public static String es_PE_FIELD_ProductType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="154913db-788f-2253-4219-a5d2d2020332",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="76ca332a-6969-0a39-6fa5-6940d190542c")
public static final String FIELDNAME_ProductType_Name="76ca332a-6969-0a39-6fa5-6940d190542c";

@XendraTrl(Identifier="fa54683a-c7b3-8db8-1065-a25a0fb6a57f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa54683a-c7b3-8db8-1065-a25a0fb6a57f",
Synchronized="2019-08-30 22:23:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
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
@XendraTrl(Identifier="8c869b54-acf5-be43-fecd-9428c603c830")
public static String es_PE_FIELD_ProductType_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="8c869b54-acf5-be43-fecd-9428c603c830")
public static String es_PE_FIELD_ProductType_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="8c869b54-acf5-be43-fecd-9428c603c830")
public static String es_PE_FIELD_ProductType_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="154913db-788f-2253-4219-a5d2d2020332",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c869b54-acf5-be43-fecd-9428c603c830")
public static final String FIELDNAME_ProductType_SearchKey="8c869b54-acf5-be43-fecd-9428c603c830";

@XendraTrl(Identifier="d7c0089a-55e4-d845-7165-9763b4a1a970")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7c0089a-55e4-d845-7165-9763b4a1a970",
Synchronized="2019-08-30 22:23:29.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
