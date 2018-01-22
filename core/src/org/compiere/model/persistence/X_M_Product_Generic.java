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
/** Generated Model for M_Product_Generic
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Generic extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Generic_ID id
@param trxName transaction
*/
public X_M_Product_Generic (Properties ctx, int M_Product_Generic_ID, String trxName)
{
super (ctx, M_Product_Generic_ID, trxName);
/** if (M_Product_Generic_ID == 0)
{
setM_Product_Generic_ID (0);
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
public X_M_Product_Generic (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000073 */
public static int Table_ID=MTable.getTable_ID("M_Product_Generic");

@XendraTrl(Identifier="fec36668-0510-314a-79a6-859ad4a95d4e")
public static String es_PE_TAB_ProductGeneric_Description="Define el nombre Genérico de un Producto";

@XendraTrl(Identifier="fec36668-0510-314a-79a6-859ad4a95d4e")
public static String es_PE_TAB_ProductGeneric_Name="Genérico de un Producto";

@XendraTrl(Identifier="fec36668-0510-314a-79a6-859ad4a95d4e")
public static String es_PE_TAB_ProductGeneric_Help="El Genérico de un Producto le permite definir diferentes nombres genericos para los productos.";

@XendraTab(Name="Product Generic",Description="Define Product Generic",
Help="The Product Generic allows you to define different generic names of products. ",
AD_Window_ID="7617b51b-f065-caad-a22e-0b0827f233ed",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="fec36668-0510-314a-79a6-859ad4a95d4e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductGeneric="fec36668-0510-314a-79a6-859ad4a95d4e";

@XendraTrl(Identifier="0a3b1d8b-6e80-4feb-4a95-d03c65d37eba")
public static String es_PE_TABLE_M_Product_Generic_Name="Generico de un Producto";

@XendraTable(Name="Product Generic",Description="Generic of a Product",
Help="The Product Generic allows you to define different generic names of products. These generics are associated products, for example Acetylsalicylic Acid ---> Aspirin",
TableName="M_Product_Generic",AccessLevel="3",AD_Window_ID="7617b51b-f065-caad-a22e-0b0827f233ed",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="0a3b1d8b-6e80-4feb-4a95-d03c65d37eba",Synchronized="2017-08-16 11:43:28.0")
/** TableName=M_Product_Generic */
public static final String Table_Name="M_Product_Generic";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Generic");

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
    Table_ID = MTable.getTable_ID("M_Product_Generic");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Generic[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="f4739358-5715-3025-dc8b-56d5399b22d2")
public static String es_PE_FIELD_ProductGeneric_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="f4739358-5715-3025-dc8b-56d5399b22d2")
public static String es_PE_FIELD_ProductGeneric_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="f4739358-5715-3025-dc8b-56d5399b22d2")
public static String es_PE_FIELD_ProductGeneric_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="fec36668-0510-314a-79a6-859ad4a95d4e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4739358-5715-3025-dc8b-56d5399b22d2")
public static final String FIELDNAME_ProductGeneric_Description="f4739358-5715-3025-dc8b-56d5399b22d2";

@XendraTrl(Identifier="8943bbb2-04cb-4916-5a39-0aab551ec2cc")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8943bbb2-04cb-4916-5a39-0aab551ec2cc",
Synchronized="2017-08-05 16:55:26.0")
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

@XendraTrl(Identifier="daeee2ea-a806-1aad-b563-cb544f06a0c9")
public static String es_PE_FIELD_ProductGeneric_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="daeee2ea-a806-1aad-b563-cb544f06a0c9")
public static String es_PE_FIELD_ProductGeneric_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="daeee2ea-a806-1aad-b563-cb544f06a0c9")
public static String es_PE_FIELD_ProductGeneric_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="fec36668-0510-314a-79a6-859ad4a95d4e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="daeee2ea-a806-1aad-b563-cb544f06a0c9")
public static final String FIELDNAME_ProductGeneric_CommentHelp="daeee2ea-a806-1aad-b563-cb544f06a0c9";

@XendraTrl(Identifier="a5fb452f-18d4-1fc7-7313-be74e6f9b5b4")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5fb452f-18d4-1fc7-7313-be74e6f9b5b4",
Synchronized="2017-08-05 16:55:26.0")
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
@XendraTrl(Identifier="62931491-3dc2-4ec1-8b00-d400d106cb22")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62931491-3dc2-4ec1-8b00-d400d106cb22",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Generic.
@param M_Product_Generic_ID Product Generic */
public void setM_Product_Generic_ID (int M_Product_Generic_ID)
{
if (M_Product_Generic_ID < 1) throw new IllegalArgumentException ("M_Product_Generic_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_Generic_ID, Integer.valueOf(M_Product_Generic_ID));
}
/** Get Product Generic.
@return Product Generic */
public int getM_Product_Generic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Generic_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2575744b-8121-f8ca-4394-c310435dafb8")
public static String es_PE_FIELD_ProductGeneric_ProductGeneric_Name="Product Generic";

@XendraField(AD_Column_ID="M_Product_Generic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fec36668-0510-314a-79a6-859ad4a95d4e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2575744b-8121-f8ca-4394-c310435dafb8")
public static final String FIELDNAME_ProductGeneric_ProductGeneric="2575744b-8121-f8ca-4394-c310435dafb8";
/** Column name M_Product_Generic_ID */
public static final String COLUMNNAME_M_Product_Generic_ID = "M_Product_Generic_ID";
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

@XendraTrl(Identifier="ffdcb836-1352-960f-73ee-bb7e5559e212")
public static String es_PE_FIELD_ProductGeneric_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ffdcb836-1352-960f-73ee-bb7e5559e212")
public static String es_PE_FIELD_ProductGeneric_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="ffdcb836-1352-960f-73ee-bb7e5559e212")
public static String es_PE_FIELD_ProductGeneric_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="fec36668-0510-314a-79a6-859ad4a95d4e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffdcb836-1352-960f-73ee-bb7e5559e212")
public static final String FIELDNAME_ProductGeneric_Name="ffdcb836-1352-960f-73ee-bb7e5559e212";

@XendraTrl(Identifier="27b5e8c8-84df-6f10-384f-15975ea284ca")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27b5e8c8-84df-6f10-384f-15975ea284ca",
Synchronized="2017-08-05 16:55:26.0")
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
@XendraTrl(Identifier="2d992ce3-bcdd-0403-7ba0-147ba985f542")
public static String es_PE_FIELD_ProductGeneric_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="2d992ce3-bcdd-0403-7ba0-147ba985f542")
public static String es_PE_FIELD_ProductGeneric_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="2d992ce3-bcdd-0403-7ba0-147ba985f542")
public static String es_PE_FIELD_ProductGeneric_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="fec36668-0510-314a-79a6-859ad4a95d4e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d992ce3-bcdd-0403-7ba0-147ba985f542")
public static final String FIELDNAME_ProductGeneric_SearchKey="2d992ce3-bcdd-0403-7ba0-147ba985f542";

@XendraTrl(Identifier="87b232d2-4900-25dc-8ae3-24bca2b27627")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87b232d2-4900-25dc-8ae3-24bca2b27627",
Synchronized="2017-08-05 16:55:26.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
