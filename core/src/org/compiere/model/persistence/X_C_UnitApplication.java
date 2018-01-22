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
/** Generated Model for C_UnitApplication
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_UnitApplication extends PO
{
/** Standard Constructor
@param ctx context
@param C_UnitApplication_ID id
@param trxName transaction
*/
public X_C_UnitApplication (Properties ctx, int C_UnitApplication_ID, String trxName)
{
super (ctx, C_UnitApplication_ID, trxName);
/** if (C_UnitApplication_ID == 0)
{
setC_UnitApplication_ID (0);
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
public X_C_UnitApplication (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000050 */
public static int Table_ID=MTable.getTable_ID("C_UnitApplication");

@XendraTrl(Identifier="d8a3a3a6-513a-ea0c-a198-0ee5d8722101")
public static String es_PE_TAB_UnitApplication_Name="Tarea";
@XendraTab(Name="Unit Application",
Description="",Help="",AD_Window_ID="157328e2-1231-a3b1-479d-02d2d31a7ce3",SeqNo=10,TabLevel=0,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d8a3a3a6-513a-ea0c-a198-0ee5d8722101",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UnitApplication="d8a3a3a6-513a-ea0c-a198-0ee5d8722101";

@XendraTrl(Identifier="e8d4d8da-69da-eb11-1b8a-73da0050ac4e")
public static String es_PE_TABLE_C_UnitApplication_Name="Unidad de Aplicacion";

@XendraTable(Name="UnitApplication",Description="UnitApplication",Help="",
TableName="C_UnitApplication",AccessLevel="3",AD_Window_ID="157328e2-1231-a3b1-479d-02d2d31a7ce3",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="e8d4d8da-69da-eb11-1b8a-73da0050ac4e",Synchronized="2017-08-16 11:42:32.0")
/** TableName=C_UnitApplication */
public static final String Table_Name="C_UnitApplication";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_UnitApplication");

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
    Table_ID = MTable.getTable_ID("C_UnitApplication");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_UnitApplication[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_UnitApplication_ID.
@param C_UnitApplication_ID C_UnitApplication_ID */
public void setC_UnitApplication_ID (int C_UnitApplication_ID)
{
if (C_UnitApplication_ID < 1) throw new IllegalArgumentException ("C_UnitApplication_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_UnitApplication_ID, Integer.valueOf(C_UnitApplication_ID));
}
/** Get C_UnitApplication_ID.
@return C_UnitApplication_ID */
public int getC_UnitApplication_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UnitApplication_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="806f9b7f-84e2-899c-3198-e8986b1df92f")
public static String es_PE_FIELD_UnitApplication_UnitApplication_Name="UnitApplication";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d8a3a3a6-513a-ea0c-a198-0ee5d8722101",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="806f9b7f-84e2-899c-3198-e8986b1df92f")
public static final String FIELDNAME_UnitApplication_UnitApplication="806f9b7f-84e2-899c-3198-e8986b1df92f";
/** Column name C_UnitApplication_ID */
public static final String COLUMNNAME_C_UnitApplication_ID = "C_UnitApplication_ID";
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

@XendraTrl(Identifier="044929b3-8b34-6721-59e7-887e9aa77a80")
public static String es_PE_FIELD_UnitApplication_Description_Description="Observación";

@XendraTrl(Identifier="044929b3-8b34-6721-59e7-887e9aa77a80")
public static String es_PE_FIELD_UnitApplication_Description_Help="Observación";

@XendraTrl(Identifier="044929b3-8b34-6721-59e7-887e9aa77a80")
public static String es_PE_FIELD_UnitApplication_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d8a3a3a6-513a-ea0c-a198-0ee5d8722101",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="044929b3-8b34-6721-59e7-887e9aa77a80")
public static final String FIELDNAME_UnitApplication_Description="044929b3-8b34-6721-59e7-887e9aa77a80";

@XendraTrl(Identifier="9f9bb416-edd0-5481-3daa-434b09dcec97")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f9bb416-edd0-5481-3daa-434b09dcec97",
Synchronized="2017-08-05 16:54:29.0")
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
@XendraTrl(Identifier="bd5f4c12-f783-4753-9a89-e4b3d4c8962c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd5f4c12-f783-4753-9a89-e4b3d4c8962c",
Synchronized="2017-08-05 16:54:29.0")
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

@XendraTrl(Identifier="3ff51298-9a22-b9dc-bcb0-8a70e6f34beb")
public static String es_PE_FIELD_UnitApplication_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3ff51298-9a22-b9dc-bcb0-8a70e6f34beb")
public static String es_PE_FIELD_UnitApplication_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="3ff51298-9a22-b9dc-bcb0-8a70e6f34beb")
public static String es_PE_FIELD_UnitApplication_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="d8a3a3a6-513a-ea0c-a198-0ee5d8722101",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ff51298-9a22-b9dc-bcb0-8a70e6f34beb")
public static final String FIELDNAME_UnitApplication_Name="3ff51298-9a22-b9dc-bcb0-8a70e6f34beb";

@XendraTrl(Identifier="06547823-35af-d40a-0102-adf4e1269814")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06547823-35af-d40a-0102-adf4e1269814",
Synchronized="2017-08-05 16:54:29.0")
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
@XendraTrl(Identifier="5c650d0e-03b6-6d3c-9f94-a72ccdfdab4d")
public static String es_PE_FIELD_UnitApplication_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="5c650d0e-03b6-6d3c-9f94-a72ccdfdab4d")
public static String es_PE_FIELD_UnitApplication_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="5c650d0e-03b6-6d3c-9f94-a72ccdfdab4d")
public static String es_PE_FIELD_UnitApplication_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="d8a3a3a6-513a-ea0c-a198-0ee5d8722101",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c650d0e-03b6-6d3c-9f94-a72ccdfdab4d")
public static final String FIELDNAME_UnitApplication_SearchKey="5c650d0e-03b6-6d3c-9f94-a72ccdfdab4d";

@XendraTrl(Identifier="f32c7c04-6e27-a4d2-49e5-404f1a430cc4")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f32c7c04-6e27-a4d2-49e5-404f1a430cc4",
Synchronized="2017-08-05 16:54:29.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
