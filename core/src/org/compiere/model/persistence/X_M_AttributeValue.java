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
/** Generated Model for M_AttributeValue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_AttributeValue extends PO
{
/** Standard Constructor
@param ctx context
@param M_AttributeValue_ID id
@param trxName transaction
*/
public X_M_AttributeValue (Properties ctx, int M_AttributeValue_ID, String trxName)
{
super (ctx, M_AttributeValue_ID, trxName);
/** if (M_AttributeValue_ID == 0)
{
setM_Attribute_ID (0);
setM_AttributeValue_ID (0);
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
public X_M_AttributeValue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=558 */
public static int Table_ID=MTable.getTable_ID("M_AttributeValue");

@XendraTrl(Identifier="c0f66d64-075b-a4fb-e6c6-076961b020c7")
public static String es_PE_TAB_AttributeValue_Description="Valor de Atributo del Producto";

@XendraTrl(Identifier="c0f66d64-075b-a4fb-e6c6-076961b020c7")
public static String es_PE_TAB_AttributeValue_Name="Valor de Atributo";

@XendraTrl(Identifier="c0f66d64-075b-a4fb-e6c6-076961b020c7")
public static String es_PE_TAB_AttributeValue_Help="Valor individual de un atributo del producto (ej. verde, grande)";

@XendraTab(Name="Attribute Value",Description="Product Attribute Value",
Help="Individual value of a product attribute (e.g. green, large, ..)",
AD_Window_ID="1b6bcb89-ad62-5249-c6bc-bf851e4e624f",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c0f66d64-075b-a4fb-e6c6-076961b020c7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AttributeValue="c0f66d64-075b-a4fb-e6c6-076961b020c7";

@XendraTrl(Identifier="dfba3e51-78c0-5300-a3e8-871ab4ebbce5")
public static String es_PE_TABLE_M_AttributeValue_Name="Valor de Atributo";

@XendraTable(Name="Attribute Value",Description="Product Attribute Value",Help="",
TableName="M_AttributeValue",AccessLevel="3",AD_Window_ID="1b6bcb89-ad62-5249-c6bc-bf851e4e624f",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="dfba3e51-78c0-5300-a3e8-871ab4ebbce5",Synchronized="2017-08-16 11:43:06.0")
/** TableName=M_AttributeValue */
public static final String Table_Name="M_AttributeValue";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_AttributeValue");

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
    Table_ID = MTable.getTable_ID("M_AttributeValue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_AttributeValue[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="988219b4-4984-de83-5241-b04040a6b6bf")
public static String es_PE_FIELD_AttributeValue_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="988219b4-4984-de83-5241-b04040a6b6bf")
public static String es_PE_FIELD_AttributeValue_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="988219b4-4984-de83-5241-b04040a6b6bf")
public static String es_PE_FIELD_AttributeValue_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c0f66d64-075b-a4fb-e6c6-076961b020c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AttributeValueType@=L",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="988219b4-4984-de83-5241-b04040a6b6bf")
public static final String FIELDNAME_AttributeValue_Description="988219b4-4984-de83-5241-b04040a6b6bf";

@XendraTrl(Identifier="887e4c50-d53d-8dd6-be76-9f0e4bd2877f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="887e4c50-d53d-8dd6-be76-9f0e4bd2877f",
Synchronized="2017-08-05 16:55:00.0")
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
@XendraTrl(Identifier="fa7c0cb5-b4ea-4ada-b122-9d3258091489")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa7c0cb5-b4ea-4ada-b122-9d3258091489",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Attribute.
@param M_Attribute_ID Product Attribute */
public void setM_Attribute_ID (int M_Attribute_ID)
{
if (M_Attribute_ID < 1) throw new IllegalArgumentException ("M_Attribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, Integer.valueOf(M_Attribute_ID));
}
/** Get Attribute.
@return Product Attribute */
public int getM_Attribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Attribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4db12fca-de7e-aa96-92ed-9ecdd331a08b")
public static String es_PE_FIELD_AttributeValue_Attribute_Description="Atributo del Producto";

@XendraTrl(Identifier="4db12fca-de7e-aa96-92ed-9ecdd331a08b")
public static String es_PE_FIELD_AttributeValue_Attribute_Help="Cualidad del producto como el color y tamaño";

@XendraTrl(Identifier="4db12fca-de7e-aa96-92ed-9ecdd331a08b")
public static String es_PE_FIELD_AttributeValue_Attribute_Name="Atributo";

@XendraField(AD_Column_ID="M_Attribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c0f66d64-075b-a4fb-e6c6-076961b020c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AttributeValueType@=L",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4db12fca-de7e-aa96-92ed-9ecdd331a08b")
public static final String FIELDNAME_AttributeValue_Attribute="4db12fca-de7e-aa96-92ed-9ecdd331a08b";

@XendraTrl(Identifier="f1c0576b-2ad3-cc27-ca11-bba4c11866b2")
public static String es_PE_COLUMN_M_Attribute_ID_Name="Atributo";

@XendraColumn(AD_Element_ID="452994bf-a9df-fbe8-06a5-b6ca6baff95b",ColumnName="M_Attribute_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1c0576b-2ad3-cc27-ca11-bba4c11866b2",
Synchronized="2017-08-05 16:55:00.0")
/** Column name M_Attribute_ID */
public static final String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
/** Set Attribute Value.
@param M_AttributeValue_ID Product Attribute Value */
public void setM_AttributeValue_ID (int M_AttributeValue_ID)
{
if (M_AttributeValue_ID < 1) throw new IllegalArgumentException ("M_AttributeValue_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeValue_ID, Integer.valueOf(M_AttributeValue_ID));
}
/** Get Attribute Value.
@return Product Attribute Value */
public int getM_AttributeValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dff828cf-f007-639d-1d08-65a0cd6c2ced")
public static String es_PE_FIELD_AttributeValue_AttributeValue_Description="Valor de los atributos del producto";

@XendraTrl(Identifier="dff828cf-f007-639d-1d08-65a0cd6c2ced")
public static String es_PE_FIELD_AttributeValue_AttributeValue_Help="Valor individual de un atributo de producto (ej. verde, grande). ";

@XendraTrl(Identifier="dff828cf-f007-639d-1d08-65a0cd6c2ced")
public static String es_PE_FIELD_AttributeValue_AttributeValue_Name="Valor de Atributo";

@XendraField(AD_Column_ID="M_AttributeValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c0f66d64-075b-a4fb-e6c6-076961b020c7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dff828cf-f007-639d-1d08-65a0cd6c2ced")
public static final String FIELDNAME_AttributeValue_AttributeValue="dff828cf-f007-639d-1d08-65a0cd6c2ced";
/** Column name M_AttributeValue_ID */
public static final String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";
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

@XendraTrl(Identifier="3cc237e1-83e9-bfbc-25d3-0aa6ebe265f0")
public static String es_PE_FIELD_AttributeValue_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3cc237e1-83e9-bfbc-25d3-0aa6ebe265f0")
public static String es_PE_FIELD_AttributeValue_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="3cc237e1-83e9-bfbc-25d3-0aa6ebe265f0")
public static String es_PE_FIELD_AttributeValue_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c0f66d64-075b-a4fb-e6c6-076961b020c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AttributeValueType@=L",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3cc237e1-83e9-bfbc-25d3-0aa6ebe265f0")
public static final String FIELDNAME_AttributeValue_Name="3cc237e1-83e9-bfbc-25d3-0aa6ebe265f0";

@XendraTrl(Identifier="fa6c6e14-0c56-5366-d544-2bf87f486f21")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa6c6e14-0c56-5366-d544-2bf87f486f21",
Synchronized="2017-08-05 16:55:00.0")
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
@XendraTrl(Identifier="4f869e67-2193-d88f-e41d-efecef65bead")
public static String es_PE_FIELD_AttributeValue_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="4f869e67-2193-d88f-e41d-efecef65bead")
public static String es_PE_FIELD_AttributeValue_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="4f869e67-2193-d88f-e41d-efecef65bead")
public static String es_PE_FIELD_AttributeValue_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="c0f66d64-075b-a4fb-e6c6-076961b020c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AttributeValueType@=L",DisplayLength=40,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4f869e67-2193-d88f-e41d-efecef65bead")
public static final String FIELDNAME_AttributeValue_SearchKey="4f869e67-2193-d88f-e41d-efecef65bead";

@XendraTrl(Identifier="bb29de00-f72b-6e64-5d3a-374b86d61534")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb29de00-f72b-6e64-5d3a-374b86d61534",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
