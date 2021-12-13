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
/** Generated Model for AD_Find
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Find extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Find_ID id
@param trxName transaction
*/
public X_AD_Find (Properties ctx, int AD_Find_ID, String trxName)
{
super (ctx, AD_Find_ID, trxName);
/** if (AD_Find_ID == 0)
{
setAD_Column_ID (0);
setAD_Find_ID (0);
setAndOr (null);	
// A
setFind_ID (Env.ZERO);
setOperation (null);	
// ==
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Find (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=404 */
public static int Table_ID=MTable.getTable_ID("AD_Find");

@XendraTrl(Identifier="e879e467-f15f-e030-fe1c-d511422d8fa3")
public static String es_PE_TAB_Find_Name="Encontrar";
@XendraTab(Name="Find",Description="",Help="",
AD_Window_ID="5b8b829e-70c1-023b-dbff-d743ca3b5f09",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e879e467-f15f-e030-fe1c-d511422d8fa3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Find="e879e467-f15f-e030-fe1c-d511422d8fa3";

@XendraTrl(Identifier="dfcd1db0-6c10-c80b-53de-dd11711f2be7")
public static String es_PE_TABLE_AD_Find_Name="ID de hallazgo";

@XendraTable(Name="Find",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Find",
AccessLevel="7",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="dfcd1db0-6c10-c80b-53de-dd11711f2be7",
Synchronized="2020-03-03 21:35:02.0")
/** TableName=AD_Find */
public static final String Table_Name="AD_Find";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Find");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_Find");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Find[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5f23d70b-830e-1101-4dde-527c304bbda8")
public static String es_PE_FIELD_Find_Column_Name="Columna";

@XendraTrl(Identifier="5f23d70b-830e-1101-4dde-527c304bbda8")
public static String es_PE_FIELD_Find_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="5f23d70b-830e-1101-4dde-527c304bbda8")
public static String es_PE_FIELD_Find_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e879e467-f15f-e030-fe1c-d511422d8fa3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f23d70b-830e-1101-4dde-527c304bbda8")
public static final String FIELDNAME_Find_Column="5f23d70b-830e-1101-4dde-527c304bbda8";

@XendraTrl(Identifier="48e88583-f9ec-ca67-354b-ba6228542943")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="06ce5e33-2936-71a4-56b8-5876a5a39218",
AD_Val_Rule_ID="dbd9af1f-cf2f-48d0-d7b5-d77c2703b407",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48e88583-f9ec-ca67-354b-ba6228542943",
Synchronized="2019-08-30 22:20:21.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Find.
@param AD_Find_ID Find */
public void setAD_Find_ID (int AD_Find_ID)
{
if (AD_Find_ID < 1) throw new IllegalArgumentException ("AD_Find_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Find_ID, Integer.valueOf(AD_Find_ID));
}
/** Get Find.
@return Find */
public int getAD_Find_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Find_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Find_ID()));
}

@XendraTrl(Identifier="172c1cd9-1c70-d59c-6524-a74ce08d7452")
public static String es_PE_FIELD_Find_Find_Name="ID de hallazgo";

@XendraField(AD_Column_ID="AD_Find_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e879e467-f15f-e030-fe1c-d511422d8fa3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="172c1cd9-1c70-d59c-6524-a74ce08d7452")
public static final String FIELDNAME_Find_Find="172c1cd9-1c70-d59c-6524-a74ce08d7452";
/** Column name AD_Find_ID */
public static final String COLUMNNAME_AD_Find_ID = "AD_Find_ID";
/** Set And/Or.
@param AndOr Logical operation: AND or OR */
public void setAndOr (String AndOr)
{
if (AndOr.length() > 1)
{
log.warning("Length > 1 - truncated");
AndOr = AndOr.substring(0,0);
}
set_Value (COLUMNNAME_AndOr, AndOr);
}
/** Get And/Or.
@return Logical operation: AND or OR */
public String getAndOr() 
{
return (String)get_Value(COLUMNNAME_AndOr);
}

@XendraTrl(Identifier="553cad8b-bd3a-1fb2-0941-7f14d3d19965")
public static String es_PE_FIELD_Find_AndOr_Name="Y/O";

@XendraTrl(Identifier="553cad8b-bd3a-1fb2-0941-7f14d3d19965")
public static String es_PE_FIELD_Find_AndOr_Description="Operador lógico; Y u O";

@XendraField(AD_Column_ID="AndOr",IsCentrallyMaintained=true,
AD_Tab_ID="e879e467-f15f-e030-fe1c-d511422d8fa3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="553cad8b-bd3a-1fb2-0941-7f14d3d19965")
public static final String FIELDNAME_Find_AndOr="553cad8b-bd3a-1fb2-0941-7f14d3d19965";

@XendraTrl(Identifier="c32c0b38-585d-7cdf-52e5-6e23331bd7ad")
public static String es_PE_COLUMN_AndOr_Name="Y/O";

@XendraColumn(AD_Element_ID="6e7241dc-23d7-c637-c3e8-8446f4c7bd97",ColumnName="AndOr",
AD_Reference_ID=17,AD_Reference_Value_ID="115d4f2d-61de-0b53-83b8-d9a24fa54f5b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c32c0b38-585d-7cdf-52e5-6e23331bd7ad",Synchronized="2019-08-30 22:20:21.0")
/** Column name AndOr */
public static final String COLUMNNAME_AndOr = "AndOr";
/** Set Find_ID.
@param Find_ID Find_ID */
public void setFind_ID (BigDecimal Find_ID)
{
if (Find_ID == null) throw new IllegalArgumentException ("Find_ID is mandatory.");
set_Value (COLUMNNAME_Find_ID, Find_ID);
}
/** Get Find_ID.
@return Find_ID */
public BigDecimal getFind_ID() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Find_ID);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="51ab25b3-0f55-1063-74fa-f6aa3dde3c49")
public static String es_PE_FIELD_Find_Find_ID_Name="ID Encontrado";

@XendraField(AD_Column_ID="Find_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e879e467-f15f-e030-fe1c-d511422d8fa3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51ab25b3-0f55-1063-74fa-f6aa3dde3c49")
public static final String FIELDNAME_Find_Find_ID="51ab25b3-0f55-1063-74fa-f6aa3dde3c49";

@XendraTrl(Identifier="666a1749-0f4b-68a4-591d-c99e837eb7fb")
public static String es_PE_COLUMN_Find_ID_Name="ID Encontrado";

@XendraColumn(AD_Element_ID="e17d8878-648a-7d36-142c-326f9bb4d4e2",ColumnName="Find_ID",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="666a1749-0f4b-68a4-591d-c99e837eb7fb",
Synchronized="2019-08-30 22:20:22.0")
/** Column name Find_ID */
public static final String COLUMNNAME_Find_ID = "Find_ID";
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
@XendraTrl(Identifier="4946b1b2-5482-492b-bca4-0716f744ff61")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4946b1b2-5482-492b-bca4-0716f744ff61",
Synchronized="2019-08-30 22:20:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Operation.
@param Operation Compare Operation */
public void setOperation (String Operation)
{
if (Operation.length() > 2)
{
log.warning("Length > 2 - truncated");
Operation = Operation.substring(0,1);
}
set_Value (COLUMNNAME_Operation, Operation);
}
/** Get Operation.
@return Compare Operation */
public String getOperation() 
{
return (String)get_Value(COLUMNNAME_Operation);
}

@XendraTrl(Identifier="fcd94377-5084-6259-5c33-8d1a4adb4eb5")
public static String es_PE_FIELD_Find_Operation_Name="Operación";

@XendraField(AD_Column_ID="Operation",IsCentrallyMaintained=true,
AD_Tab_ID="e879e467-f15f-e030-fe1c-d511422d8fa3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcd94377-5084-6259-5c33-8d1a4adb4eb5")
public static final String FIELDNAME_Find_Operation="fcd94377-5084-6259-5c33-8d1a4adb4eb5";

@XendraTrl(Identifier="16f25881-2e56-f6a1-0298-bec6004b2b1a")
public static String es_PE_COLUMN_Operation_Name="Operación";

@XendraColumn(AD_Element_ID="eccf7e9c-dbd0-9679-8ba1-9f36fc3afea7",ColumnName="Operation",
AD_Reference_ID=17,AD_Reference_Value_ID="68e96930-8512-7806-25cd-2cce2a5d79e9",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="==",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="16f25881-2e56-f6a1-0298-bec6004b2b1a",Synchronized="2019-08-30 22:20:22.0")
/** Column name Operation */
public static final String COLUMNNAME_Operation = "Operation";
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
@XendraTrl(Identifier="d7113009-c45e-028d-6c63-bc2445d45067")
public static String es_PE_FIELD_Find_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="d7113009-c45e-028d-6c63-bc2445d45067")
public static String es_PE_FIELD_Find_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="d7113009-c45e-028d-6c63-bc2445d45067")
public static String es_PE_FIELD_Find_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="e879e467-f15f-e030-fe1c-d511422d8fa3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7113009-c45e-028d-6c63-bc2445d45067")
public static final String FIELDNAME_Find_SearchKey="d7113009-c45e-028d-6c63-bc2445d45067";

@XendraTrl(Identifier="2fe78abe-c2a2-6d87-f470-b1fa4ee9a0dd")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fe78abe-c2a2-6d87-f470-b1fa4ee9a0dd",
Synchronized="2019-08-30 22:20:22.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Value To.
@param Value2 Value To */
public void setValue2 (String Value2)
{
if (Value2 != null && Value2.length() > 40)
{
log.warning("Length > 40 - truncated");
Value2 = Value2.substring(0,39);
}
set_Value (COLUMNNAME_Value2, Value2);
}
/** Get Value To.
@return Value To */
public String getValue2() 
{
String value = (String)get_Value(COLUMNNAME_Value2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="45895db4-d6f0-6d12-5db6-1a68af97c877")
public static String es_PE_FIELD_Find_ValueTo_Name="Valor 2";
@XendraField(AD_Column_ID="Value2",
IsCentrallyMaintained=true,AD_Tab_ID="e879e467-f15f-e030-fe1c-d511422d8fa3",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Operation@=AB",DisplayLength=20,IsReadOnly=false,SeqNo=100,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="45895db4-d6f0-6d12-5db6-1a68af97c877")
public static final String FIELDNAME_Find_ValueTo="45895db4-d6f0-6d12-5db6-1a68af97c877";

@XendraTrl(Identifier="e10a59ba-0246-8c1f-1c10-c25ffed8f863")
public static String es_PE_COLUMN_Value2_Name="Valor 2";

@XendraColumn(AD_Element_ID="c379d4ac-5a2f-a060-da28-03c993b2743e",ColumnName="Value2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e10a59ba-0246-8c1f-1c10-c25ffed8f863",
Synchronized="2019-08-30 22:20:22.0")
/** Column name Value2 */
public static final String COLUMNNAME_Value2 = "Value2";
}
