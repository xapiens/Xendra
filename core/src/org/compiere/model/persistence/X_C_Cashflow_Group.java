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
import org.compiere.model.reference.REF_C_CashFlow_Group_Sign;
/** Generated Model for C_Cashflow_Group
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Cashflow_Group extends PO
{
/** Standard Constructor
@param ctx context
@param C_Cashflow_Group_ID id
@param trxName transaction
*/
public X_C_Cashflow_Group (Properties ctx, int C_Cashflow_Group_ID, String trxName)
{
super (ctx, C_Cashflow_Group_ID, trxName);
/** if (C_Cashflow_Group_ID == 0)
{
setCashSign (null);	
// I
setC_Cashflow_Group_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Cashflow_Group (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000033 */
public static int Table_ID=MTable.getTable_ID("C_Cashflow_Group");

@XendraTrl(Identifier="5cf1b790-7766-d44e-6715-9ae06cd57127")
public static String es_PE_TAB_Category_Name="Categoría";
@XendraTab(Name="Category",Description="",
Help="",AD_Window_ID="33c43129-501b-12cd-f6df-19f7fef483ea",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5cf1b790-7766-d44e-6715-9ae06cd57127",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Category="5cf1b790-7766-d44e-6715-9ae06cd57127";

@XendraTrl(Identifier="82b43fdc-bc48-38e8-0920-fe84fed39996")
public static String es_PE_TABLE_C_Cashflow_Group_Name="Cash Flow Category";

@XendraTable(Name="Cash Flow Category",Description="",Help="",TableName="C_Cashflow_Group",
AccessLevel="3",AD_Window_ID="33c43129-501b-12cd-f6df-19f7fef483ea",AD_Val_Rule_ID="",IsKey=3,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="82b43fdc-bc48-38e8-0920-fe84fed39996",Synchronized="2017-08-16 11:41:36.0")
/** TableName=C_Cashflow_Group */
public static final String Table_Name="C_Cashflow_Group";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Cashflow_Group");

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
    Table_ID = MTable.getTable_ID("C_Cashflow_Group");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Cashflow_Group[").append(get_ID()).append("]");
return sb.toString();
}

/** CashSign AD_Reference=b2bdca74-40ef-ac86-9876-56171a31e4bc */
public static final int CASHSIGN_AD_Reference_ID=1000008;
/** Set Cash Sign.
@param CashSign Source of Cash */
public void setCashSign (String CashSign)
{
if (CashSign == null) throw new IllegalArgumentException ("CashSign is mandatory");
if (CashSign.equals(REF_C_CashFlow_Group_Sign.InFlow) || CashSign.equals(REF_C_CashFlow_Group_Sign.OutFlow));
 else throw new IllegalArgumentException ("CashSign Invalid value - " + CashSign + " - Reference_ID=1000008 - I - O");
if (CashSign.length() > 1)
{
log.warning("Length > 1 - truncated");
CashSign = CashSign.substring(0,0);
}
set_Value (COLUMNNAME_CashSign, CashSign);
}
/** Get Cash Sign.
@return Source of Cash */
public String getCashSign() 
{
return (String)get_Value(COLUMNNAME_CashSign);
}

@XendraTrl(Identifier="a7974983-ea20-138c-e26a-b1c356340cf1")
public static String es_PE_FIELD_Category_CashSign_Description="Tipo de Flujo";

@XendraTrl(Identifier="a7974983-ea20-138c-e26a-b1c356340cf1")
public static String es_PE_FIELD_Category_CashSign_Help="The Cash Type indicates the source for this Cash Flow.";

@XendraTrl(Identifier="a7974983-ea20-138c-e26a-b1c356340cf1")
public static String es_PE_FIELD_Category_CashSign_Name="Tipo de Flujo";

@XendraField(AD_Column_ID="CashSign",IsCentrallyMaintained=true,
AD_Tab_ID="5cf1b790-7766-d44e-6715-9ae06cd57127",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7974983-ea20-138c-e26a-b1c356340cf1")
public static final String FIELDNAME_Category_CashSign="a7974983-ea20-138c-e26a-b1c356340cf1";

@XendraTrl(Identifier="0cadedf0-48b8-809b-baf2-0df4a9d8c164")
public static String es_PE_COLUMN_CashSign_Name="Cash Sign";

@XendraColumn(AD_Element_ID="2617b768-ae7f-fb52-5089-7a4da32036ab",ColumnName="CashSign",
AD_Reference_ID=17,AD_Reference_Value_ID="b2bdca74-40ef-ac86-9876-56171a31e4bc",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0cadedf0-48b8-809b-baf2-0df4a9d8c164",Synchronized="2017-08-05 16:53:27.0")
/** Column name CashSign */
public static final String COLUMNNAME_CashSign = "CashSign";
/** Set Cash Flow Category.
@param C_Cashflow_Group_ID Cash Flow Category  */
public void setC_Cashflow_Group_ID (int C_Cashflow_Group_ID)
{
if (C_Cashflow_Group_ID < 1) throw new IllegalArgumentException ("C_Cashflow_Group_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Cashflow_Group_ID, Integer.valueOf(C_Cashflow_Group_ID));
}
/** Get Cash Flow Category.
@return Cash Flow Category  */
public int getC_Cashflow_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cashflow_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d08f2cac-9f40-e6ab-23ce-f563c203976d")
public static String es_PE_FIELD_Category_CashFlowCategory_Name="Cash Flow Category";

@XendraField(AD_Column_ID="C_Cashflow_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5cf1b790-7766-d44e-6715-9ae06cd57127",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d08f2cac-9f40-e6ab-23ce-f563c203976d")
public static final String FIELDNAME_Category_CashFlowCategory="d08f2cac-9f40-e6ab-23ce-f563c203976d";
/** Column name C_Cashflow_Group_ID */
public static final String COLUMNNAME_C_Cashflow_Group_ID = "C_Cashflow_Group_ID";
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

@XendraTrl(Identifier="f1d49e9d-e39c-4a82-3704-eeb00e45498b")
public static String es_PE_FIELD_Category_Description_Description="Observación";

@XendraTrl(Identifier="f1d49e9d-e39c-4a82-3704-eeb00e45498b")
public static String es_PE_FIELD_Category_Description_Help="Observación";

@XendraTrl(Identifier="f1d49e9d-e39c-4a82-3704-eeb00e45498b")
public static String es_PE_FIELD_Category_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5cf1b790-7766-d44e-6715-9ae06cd57127",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1d49e9d-e39c-4a82-3704-eeb00e45498b")
public static final String FIELDNAME_Category_Description="f1d49e9d-e39c-4a82-3704-eeb00e45498b";

@XendraTrl(Identifier="0ed70769-7200-d8a4-6dfd-e094b00583d8")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ed70769-7200-d8a4-6dfd-e094b00583d8",
Synchronized="2017-08-05 16:53:27.0")
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
@XendraTrl(Identifier="27464007-1fd3-4102-a6cf-007852ea2a8a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27464007-1fd3-4102-a6cf-007852ea2a8a",
Synchronized="2017-08-05 16:53:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_Name, Name);
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

@XendraTrl(Identifier="b5055247-1d10-4fea-f34b-5f9643f3fad7")
public static String es_PE_FIELD_Category_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b5055247-1d10-4fea-f34b-5f9643f3fad7")
public static String es_PE_FIELD_Category_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="b5055247-1d10-4fea-f34b-5f9643f3fad7")
public static String es_PE_FIELD_Category_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="5cf1b790-7766-d44e-6715-9ae06cd57127",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b5055247-1d10-4fea-f34b-5f9643f3fad7")
public static final String FIELDNAME_Category_Name="b5055247-1d10-4fea-f34b-5f9643f3fad7";
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 60)
{
log.warning("Length > 60 - truncated");
Value = Value.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_Value, Value);
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
@XendraTrl(Identifier="7ebb28a4-f2e8-68c4-4914-0375b680d0b1")
public static String es_PE_FIELD_Category_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="7ebb28a4-f2e8-68c4-4914-0375b680d0b1")
public static String es_PE_FIELD_Category_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="7ebb28a4-f2e8-68c4-4914-0375b680d0b1")
public static String es_PE_FIELD_Category_SearchKey_Name="Código";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="5cf1b790-7766-d44e-6715-9ae06cd57127",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ebb28a4-f2e8-68c4-4914-0375b680d0b1")
public static final String FIELDNAME_Category_SearchKey="7ebb28a4-f2e8-68c4-4914-0375b680d0b1";
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
