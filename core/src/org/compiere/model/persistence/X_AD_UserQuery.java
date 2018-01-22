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
/** Generated Model for AD_UserQuery
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_UserQuery extends PO
{
/** Standard Constructor
@param ctx context
@param AD_UserQuery_ID id
@param trxName transaction
*/
public X_AD_UserQuery (Properties ctx, int AD_UserQuery_ID, String trxName)
{
super (ctx, AD_UserQuery_ID, trxName);
/** if (AD_UserQuery_ID == 0)
{
setAD_Table_ID (0);
setAD_UserQuery_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_UserQuery (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=814 */
public static int Table_ID=MTable.getTable_ID("AD_UserQuery");

@XendraTrl(Identifier="db9feaa6-3ac9-166c-3126-c252c85c050a")
public static String es_PE_TAB_Queries_Description="Ver y Mantener consultas guardadas";

@XendraTrl(Identifier="db9feaa6-3ac9-166c-3126-c252c85c050a")
public static String es_PE_TAB_Queries_Name="Consultas";
@XendraTab(Name="Queries",
Description="View and maintain saved queries",Help="",
AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",SeqNo=70,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="cbc51eeb-c22f-5b2a-e98f-ffa899e16de4",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="db9feaa6-3ac9-166c-3126-c252c85c050a",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Queries="db9feaa6-3ac9-166c-3126-c252c85c050a";

@XendraTrl(Identifier="655bd57f-d325-c3db-45fa-f7cb503d26a5")
public static String es_PE_TABLE_AD_UserQuery_Name="Consulta Usuario";

@XendraTable(Name="User Query",Description="Saved User Query",Help="",TableName="AD_UserQuery",
AccessLevel="7",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="655bd57f-d325-c3db-45fa-f7cb503d26a5",Synchronized="2017-08-16 11:41:07.0")
/** TableName=AD_UserQuery */
public static final String Table_Name="AD_UserQuery";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_UserQuery");

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
    Table_ID = MTable.getTable_ID("AD_UserQuery");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_UserQuery[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tab.
@param AD_Tab_ID Tab within a Window */
public void setAD_Tab_ID (int AD_Tab_ID)
{
if (AD_Tab_ID <= 0) set_Value (COLUMNNAME_AD_Tab_ID, null);
 else 
set_Value (COLUMNNAME_AD_Tab_ID, Integer.valueOf(AD_Tab_ID));
}
/** Get Tab.
@return Tab within a Window */
public int getAD_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="95c512f6-ec51-16db-4350-61f17199ac6f")
public static String es_PE_COLUMN_AD_Tab_ID_Name="Pestaña";

@XendraColumn(AD_Element_ID="1a7ad493-6088-5413-1098-1a8061a77e90",ColumnName="AD_Tab_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95c512f6-ec51-16db-4350-61f17199ac6f",
Synchronized="2017-08-05 16:52:58.0")
/** Column name AD_Tab_ID */
public static final String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8cd485f-fa09-40e8-0adb-bf5e50d8685b")
public static String es_PE_FIELD_Queries_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="f8cd485f-fa09-40e8-0adb-bf5e50d8685b")
public static String es_PE_FIELD_Queries_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="f8cd485f-fa09-40e8-0adb-bf5e50d8685b")
public static String es_PE_FIELD_Queries_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db9feaa6-3ac9-166c-3126-c252c85c050a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8cd485f-fa09-40e8-0adb-bf5e50d8685b")
public static final String FIELDNAME_Queries_Table="f8cd485f-fa09-40e8-0adb-bf5e50d8685b";

@XendraTrl(Identifier="d093995a-49ba-1987-a03e-9c41872b39e3")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d093995a-49ba-1987-a03e-9c41872b39e3",
Synchronized="2017-08-05 16:52:58.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4811b6f5-f762-4af2-35ab-70a4a2d7c192")
public static String es_PE_FIELD_Queries_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="4811b6f5-f762-4af2-35ab-70a4a2d7c192")
public static String es_PE_FIELD_Queries_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="4811b6f5-f762-4af2-35ab-70a4a2d7c192")
public static String es_PE_FIELD_Queries_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db9feaa6-3ac9-166c-3126-c252c85c050a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4811b6f5-f762-4af2-35ab-70a4a2d7c192")
public static final String FIELDNAME_Queries_UserContact="4811b6f5-f762-4af2-35ab-70a4a2d7c192";

@XendraTrl(Identifier="cbc51eeb-c22f-5b2a-e98f-ffa899e16de4")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cbc51eeb-c22f-5b2a-e98f-ffa899e16de4",
Synchronized="2017-08-05 16:52:58.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set User Query.
@param AD_UserQuery_ID Saved User Query */
public void setAD_UserQuery_ID (int AD_UserQuery_ID)
{
if (AD_UserQuery_ID < 1) throw new IllegalArgumentException ("AD_UserQuery_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserQuery_ID, Integer.valueOf(AD_UserQuery_ID));
}
/** Get User Query.
@return Saved User Query */
public int getAD_UserQuery_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserQuery_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="61e4b6ac-33d7-c8ab-42e6-11f6ce9d4b6a")
public static String es_PE_FIELD_Queries_UserQuery_Description="Consulta Usuario Guardada";

@XendraTrl(Identifier="61e4b6ac-33d7-c8ab-42e6-11f6ce9d4b6a")
public static String es_PE_FIELD_Queries_UserQuery_Name="Consulta Usuario";

@XendraField(AD_Column_ID="AD_UserQuery_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db9feaa6-3ac9-166c-3126-c252c85c050a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61e4b6ac-33d7-c8ab-42e6-11f6ce9d4b6a")
public static final String FIELDNAME_Queries_UserQuery="61e4b6ac-33d7-c8ab-42e6-11f6ce9d4b6a";
/** Column name AD_UserQuery_ID */
public static final String COLUMNNAME_AD_UserQuery_ID = "AD_UserQuery_ID";
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
set_Value (COLUMNNAME_Code, Code);
}
/** Get Validation code.
@return Validation Code */
public String getCode() 
{
String value = (String)get_Value(COLUMNNAME_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="16853a0f-0595-8594-dea4-47709fe3991c")
public static String es_PE_FIELD_Queries_ValidationCode_Description="Código de Validación";

@XendraTrl(Identifier="16853a0f-0595-8594-dea4-47709fe3991c")
public static String es_PE_FIELD_Queries_ValidationCode_Help="El código validación despliega la fecha; hora y mensaje del error";

@XendraTrl(Identifier="16853a0f-0595-8594-dea4-47709fe3991c")
public static String es_PE_FIELD_Queries_ValidationCode_Name="Código de Validación";

@XendraField(AD_Column_ID="Code",IsCentrallyMaintained=true,
AD_Tab_ID="db9feaa6-3ac9-166c-3126-c252c85c050a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16853a0f-0595-8594-dea4-47709fe3991c")
public static final String FIELDNAME_Queries_ValidationCode="16853a0f-0595-8594-dea4-47709fe3991c";

@XendraTrl(Identifier="d5ad044a-34a5-f1aa-5cf9-df9cd1baf45a")
public static String es_PE_COLUMN_Code_Name="Código de Validación";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=36,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=0,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5ad044a-34a5-f1aa-5cf9-df9cd1baf45a",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
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

@XendraTrl(Identifier="bfc43ea5-62d1-2f15-d112-705dc44ddf46")
public static String es_PE_FIELD_Queries_Description_Description="Observación";

@XendraTrl(Identifier="bfc43ea5-62d1-2f15-d112-705dc44ddf46")
public static String es_PE_FIELD_Queries_Description_Help="Observación";

@XendraTrl(Identifier="bfc43ea5-62d1-2f15-d112-705dc44ddf46")
public static String es_PE_FIELD_Queries_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="db9feaa6-3ac9-166c-3126-c252c85c050a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfc43ea5-62d1-2f15-d112-705dc44ddf46")
public static final String FIELDNAME_Queries_Description="bfc43ea5-62d1-2f15-d112-705dc44ddf46";

@XendraTrl(Identifier="12af1750-57c7-e920-bc7d-8a19d9c14abc")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12af1750-57c7-e920-bc7d-8a19d9c14abc",
Synchronized="2017-08-05 16:52:58.0")
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
@XendraTrl(Identifier="485735bb-f2dd-4670-a5db-b3b0e6eeabdd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="485735bb-f2dd-4670-a5db-b3b0e6eeabdd",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="8b4bc4aa-3774-22bb-1de4-5a7f037aa205")
public static String es_PE_FIELD_Queries_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="8b4bc4aa-3774-22bb-1de4-5a7f037aa205")
public static String es_PE_FIELD_Queries_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="8b4bc4aa-3774-22bb-1de4-5a7f037aa205")
public static String es_PE_FIELD_Queries_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="db9feaa6-3ac9-166c-3126-c252c85c050a",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8b4bc4aa-3774-22bb-1de4-5a7f037aa205")
public static final String FIELDNAME_Queries_Name="8b4bc4aa-3774-22bb-1de4-5a7f037aa205";

@XendraTrl(Identifier="81be04b5-df19-ef65-f042-7cc0c3803521")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81be04b5-df19-ef65-f042-7cc0c3803521",
Synchronized="2017-08-05 16:52:58.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
