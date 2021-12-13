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
/** Generated Model for M_Product_Brand
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Brand extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Brand_ID id
@param trxName transaction
*/
public X_M_Product_Brand (Properties ctx, int M_Product_Brand_ID, String trxName)
{
super (ctx, M_Product_Brand_ID, trxName);
/** if (M_Product_Brand_ID == 0)
{
setM_Product_Brand_ID (0);
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
public X_M_Product_Brand (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000074 */
public static int Table_ID=MTable.getTable_ID("M_Product_Brand");

@XendraTrl(Identifier="efc957f8-7114-c72a-c701-fe8cbe2a39a2")
public static String es_PE_TAB_ProductBrand_Description="Define las Linea de los Productos";

@XendraTrl(Identifier="efc957f8-7114-c72a-c701-fe8cbe2a39a2")
public static String es_PE_TAB_ProductBrand_Help="Permite definir diferentes marcas de productos. ";

@XendraTrl(Identifier="efc957f8-7114-c72a-c701-fe8cbe2a39a2")
public static String es_PE_TAB_ProductBrand_Name="Linea de Productos";

@XendraTab(Name="Product Brand",Description="Define Product Brand",
Help="The Product Brands allows you to define different Brands of products.",
AD_Window_ID="46595292-f730-f74c-78c5-5b93cc7c716b",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="efc957f8-7114-c72a-c701-fe8cbe2a39a2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductBrand="efc957f8-7114-c72a-c701-fe8cbe2a39a2";

@XendraTrl(Identifier="902cfe98-d7be-613f-0a97-28cfafd3566e")
public static String es_PE_TABLE_M_Product_Brand_Name="Marca de Producto";

@XendraTable(Name="Product Brand",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Brand of a Product",
Help="The Product Brands allows you to define different Brands of Products.",
TableName="M_Product_Brand",AccessLevel="3",AD_Window_ID="46595292-f730-f74c-78c5-5b93cc7c716b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=true,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="902cfe98-d7be-613f-0a97-28cfafd3566e",Synchronized="2020-03-03 21:38:49.0")
/** TableName=M_Product_Brand */
public static final String Table_Name="M_Product_Brand";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Brand");

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
    Table_ID = MTable.getTable_ID("M_Product_Brand");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Brand[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="51c9ca51-bdfa-4d07-a07f-c7d13ba89ac0")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51c9ca51-bdfa-4d07-a07f-c7d13ba89ac0",
Synchronized="2019-08-30 22:23:25.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="3ffa73c5-d156-3dde-d063-5917a658a952")
public static String es_PE_FIELD_ProductBrand_Description_Name="Descripción";

@XendraTrl(Identifier="3ffa73c5-d156-3dde-d063-5917a658a952")
public static String es_PE_FIELD_ProductBrand_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="3ffa73c5-d156-3dde-d063-5917a658a952")
public static String es_PE_FIELD_ProductBrand_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="efc957f8-7114-c72a-c701-fe8cbe2a39a2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ffa73c5-d156-3dde-d063-5917a658a952")
public static final String FIELDNAME_ProductBrand_Description="3ffa73c5-d156-3dde-d063-5917a658a952";

@XendraTrl(Identifier="7df5b641-a95b-1433-a620-2c815a138d93")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7df5b641-a95b-1433-a620-2c815a138d93",
Synchronized="2019-08-30 22:23:25.0")
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

@XendraTrl(Identifier="969059a6-a565-b2be-f3e9-efb50050f260")
public static String es_PE_FIELD_ProductBrand_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="969059a6-a565-b2be-f3e9-efb50050f260")
public static String es_PE_FIELD_ProductBrand_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="969059a6-a565-b2be-f3e9-efb50050f260")
public static String es_PE_FIELD_ProductBrand_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="efc957f8-7114-c72a-c701-fe8cbe2a39a2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="969059a6-a565-b2be-f3e9-efb50050f260")
public static final String FIELDNAME_ProductBrand_CommentHelp="969059a6-a565-b2be-f3e9-efb50050f260";

@XendraTrl(Identifier="0def4f31-ae24-3c91-75e1-e2279f7dbf9d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0def4f31-ae24-3c91-75e1-e2279f7dbf9d",
Synchronized="2019-08-30 22:23:25.0")
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
@XendraTrl(Identifier="303aa215-b2e2-4efd-a63f-3a47280e6449")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="303aa215-b2e2-4efd-a63f-3a47280e6449",
Synchronized="2019-08-30 22:23:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Brand.
@param M_Product_Brand_ID Brand of a Product */
public void setM_Product_Brand_ID (int M_Product_Brand_ID)
{
if (M_Product_Brand_ID < 1) throw new IllegalArgumentException ("M_Product_Brand_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_Brand_ID, Integer.valueOf(M_Product_Brand_ID));
}
/** Get Product Brand.
@return Brand of a Product */
public int getM_Product_Brand_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Brand_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b5e9cc91-b0b8-8739-c9f7-b0571970310c")
public static String es_PE_FIELD_ProductBrand_ProductBrand_Name="Product Brand";

@XendraField(AD_Column_ID="M_Product_Brand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="efc957f8-7114-c72a-c701-fe8cbe2a39a2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5e9cc91-b0b8-8739-c9f7-b0571970310c")
public static final String FIELDNAME_ProductBrand_ProductBrand="b5e9cc91-b0b8-8739-c9f7-b0571970310c";
/** Column name M_Product_Brand_ID */
public static final String COLUMNNAME_M_Product_Brand_ID = "M_Product_Brand_ID";
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

@XendraTrl(Identifier="ba0576e7-d3f9-1041-a8d2-fb722cb029ee")
public static String es_PE_FIELD_ProductBrand_Name_Name="Nombre";

@XendraTrl(Identifier="ba0576e7-d3f9-1041-a8d2-fb722cb029ee")
public static String es_PE_FIELD_ProductBrand_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ba0576e7-d3f9-1041-a8d2-fb722cb029ee")
public static String es_PE_FIELD_ProductBrand_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="efc957f8-7114-c72a-c701-fe8cbe2a39a2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba0576e7-d3f9-1041-a8d2-fb722cb029ee")
public static final String FIELDNAME_ProductBrand_Name="ba0576e7-d3f9-1041-a8d2-fb722cb029ee";

@XendraTrl(Identifier="9bf0e455-52a2-f42e-bd4f-54d470ad710a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9bf0e455-52a2-f42e-bd4f-54d470ad710a",
Synchronized="2019-08-30 22:23:25.0")
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
@XendraTrl(Identifier="c186ee42-2a76-f7f6-28b4-1c705398cccb")
public static String es_PE_FIELD_ProductBrand_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="c186ee42-2a76-f7f6-28b4-1c705398cccb")
public static String es_PE_FIELD_ProductBrand_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="c186ee42-2a76-f7f6-28b4-1c705398cccb")
public static String es_PE_FIELD_ProductBrand_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="efc957f8-7114-c72a-c701-fe8cbe2a39a2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c186ee42-2a76-f7f6-28b4-1c705398cccb")
public static final String FIELDNAME_ProductBrand_SearchKey="c186ee42-2a76-f7f6-28b4-1c705398cccb";

@XendraTrl(Identifier="40db11db-a5c3-90fc-1fdb-ee53a565a48d")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40db11db-a5c3-90fc-1fdb-ee53a565a48d",
Synchronized="2019-08-30 22:23:25.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
