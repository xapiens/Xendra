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
/** Generated Model for C_ControlActivity
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ControlActivity extends PO
{
/** Standard Constructor
@param ctx context
@param C_ControlActivity_ID id
@param trxName transaction
*/
public X_C_ControlActivity (Properties ctx, int C_ControlActivity_ID, String trxName)
{
super (ctx, C_ControlActivity_ID, trxName);
/** if (C_ControlActivity_ID == 0)
{
setC_ControlActivity_ID (0);
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
public X_C_ControlActivity (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000047 */
public static int Table_ID=MTable.getTable_ID("C_ControlActivity");

@XendraTrl(Identifier="baebe85a-cfb0-39df-8b1c-0382203509f0")
public static String es_PE_TAB_ControlActivity_Description="Control activities for works";

@XendraTrl(Identifier="baebe85a-cfb0-39df-8b1c-0382203509f0")
public static String es_PE_TAB_ControlActivity_Name="Actividad";
@XendraTab(Name="Control Activity",
Description="Control activities for works",Help="",
AD_Window_ID="cf5e03ef-396e-2ced-e1df-7c57ba2f4d71",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="baebe85a-cfb0-39df-8b1c-0382203509f0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ControlActivity="baebe85a-cfb0-39df-8b1c-0382203509f0";

@XendraTrl(Identifier="b2cb917d-a18e-3f9f-ea83-1295d9b72c1f")
public static String es_PE_TABLE_C_ControlActivity_Name="Actividad de Control";

@XendraTable(Name="ControlActivity",Description="Control Activity",Help="",
TableName="C_ControlActivity",AccessLevel="3",AD_Window_ID="cf5e03ef-396e-2ced-e1df-7c57ba2f4d71",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="b2cb917d-a18e-3f9f-ea83-1295d9b72c1f",Synchronized="2017-08-16 11:41:40.0")
/** TableName=C_ControlActivity */
public static final String Table_Name="C_ControlActivity";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ControlActivity");

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
    Table_ID = MTable.getTable_ID("C_ControlActivity");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ControlActivity[").append(get_ID()).append("]");
return sb.toString();
}
/** Set ControlActivity.
@param C_ControlActivity_ID Control Activity */
public void setC_ControlActivity_ID (int C_ControlActivity_ID)
{
if (C_ControlActivity_ID < 1) throw new IllegalArgumentException ("C_ControlActivity_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ControlActivity_ID, Integer.valueOf(C_ControlActivity_ID));
}
/** Get ControlActivity.
@return Control Activity */
public int getC_ControlActivity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ControlActivity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5d77ef3-1ad6-bdda-e594-2a725690e01c")
public static String es_PE_FIELD_ControlActivity_ControlActivity_Description="Actividad de Control";

@XendraTrl(Identifier="f5d77ef3-1ad6-bdda-e594-2a725690e01c")
public static String es_PE_FIELD_ControlActivity_ControlActivity_Name="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="baebe85a-cfb0-39df-8b1c-0382203509f0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5d77ef3-1ad6-bdda-e594-2a725690e01c")
public static final String FIELDNAME_ControlActivity_ControlActivity="f5d77ef3-1ad6-bdda-e594-2a725690e01c";
/** Column name C_ControlActivity_ID */
public static final String COLUMNNAME_C_ControlActivity_ID = "C_ControlActivity_ID";
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

@XendraTrl(Identifier="b6299b8e-8434-663d-67ef-d324c6f579a5")
public static String es_PE_FIELD_ControlActivity_Description_Description="Observación";

@XendraTrl(Identifier="b6299b8e-8434-663d-67ef-d324c6f579a5")
public static String es_PE_FIELD_ControlActivity_Description_Help="Observación";

@XendraTrl(Identifier="b6299b8e-8434-663d-67ef-d324c6f579a5")
public static String es_PE_FIELD_ControlActivity_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="baebe85a-cfb0-39df-8b1c-0382203509f0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6299b8e-8434-663d-67ef-d324c6f579a5")
public static final String FIELDNAME_ControlActivity_Description="b6299b8e-8434-663d-67ef-d324c6f579a5";

@XendraTrl(Identifier="c76acd8a-6260-13c8-ccbb-d58de6f8675c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c76acd8a-6260-13c8-ccbb-d58de6f8675c",
Synchronized="2017-08-05 16:53:32.0")
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
@XendraTrl(Identifier="5bcb8ffc-5087-497a-b0d9-7a1ec3c8d42e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bcb8ffc-5087-497a-b0d9-7a1ec3c8d42e",
Synchronized="2017-08-05 16:53:32.0")
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

@XendraTrl(Identifier="2ab2684f-668f-bc3a-bba5-cab8843f87d8")
public static String es_PE_FIELD_ControlActivity_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2ab2684f-668f-bc3a-bba5-cab8843f87d8")
public static String es_PE_FIELD_ControlActivity_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="2ab2684f-668f-bc3a-bba5-cab8843f87d8")
public static String es_PE_FIELD_ControlActivity_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="baebe85a-cfb0-39df-8b1c-0382203509f0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ab2684f-668f-bc3a-bba5-cab8843f87d8")
public static final String FIELDNAME_ControlActivity_Name="2ab2684f-668f-bc3a-bba5-cab8843f87d8";

@XendraTrl(Identifier="418f3fb6-80a3-bafa-c131-c719f910339e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="418f3fb6-80a3-bafa-c131-c719f910339e",
Synchronized="2017-08-05 16:53:32.0")
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
@XendraTrl(Identifier="864be602-832f-1d1a-538f-668873371716")
public static String es_PE_FIELD_ControlActivity_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="864be602-832f-1d1a-538f-668873371716")
public static String es_PE_FIELD_ControlActivity_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="864be602-832f-1d1a-538f-668873371716")
public static String es_PE_FIELD_ControlActivity_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="baebe85a-cfb0-39df-8b1c-0382203509f0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="864be602-832f-1d1a-538f-668873371716")
public static final String FIELDNAME_ControlActivity_SearchKey="864be602-832f-1d1a-538f-668873371716";

@XendraTrl(Identifier="ec301ab0-c781-490a-af9c-18bae7b6e8a4")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec301ab0-c781-490a-af9c-18bae7b6e8a4",
Synchronized="2017-08-05 16:53:32.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
