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
/** Generated Model for AD_User_Substitute
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_User_Substitute extends PO
{
/** Standard Constructor
@param ctx context
@param AD_User_Substitute_ID id
@param trxName transaction
*/
public X_AD_User_Substitute (Properties ctx, int AD_User_Substitute_ID, String trxName)
{
super (ctx, AD_User_Substitute_ID, trxName);
/** if (AD_User_Substitute_ID == 0)
{
setAD_User_ID (0);
setAD_User_Substitute_ID (0);
setName (null);
setSubstitute_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_User_Substitute (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=642 */
public static int Table_ID=MTable.getTable_ID("AD_User_Substitute");

@XendraTrl(Identifier="3b05910f-9623-7018-bbcd-c1db3740f5cf")
public static String es_PE_TAB_UserSubstitute_Description="Sustituye al Usuario";

@XendraTrl(Identifier="3b05910f-9623-7018-bbcd-c1db3740f5cf")
public static String es_PE_TAB_UserSubstitute_Help="Un usuario que puede actuar como este usuario. ";

@XendraTrl(Identifier="3b05910f-9623-7018-bbcd-c1db3740f5cf")
public static String es_PE_TAB_UserSubstitute_Name="Usuario Sustituto";

@XendraTab(Name="User Substitute",Description="Substitute of the user",
Help="A user who can act for this user.",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",
SeqNo=30,TabLevel=1,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="aa523d2c-87af-30ed-8df7-5a7405407834",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="3b05910f-9623-7018-bbcd-c1db3740f5cf",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_UserSubstitute="3b05910f-9623-7018-bbcd-c1db3740f5cf";

@XendraTrl(Identifier="3e59501a-d07a-a102-dfd1-2833e2c9c7f9")
public static String es_PE_TABLE_AD_User_Substitute_Name="Usuario Sustituto";

@XendraTable(Name="User Substitute",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Substitute of the user",Help="",
TableName="AD_User_Substitute",AccessLevel="6",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="3e59501a-d07a-a102-dfd1-2833e2c9c7f9",Synchronized="2020-03-03 21:36:06.0")
/** TableName=AD_User_Substitute */
public static final String Table_Name="AD_User_Substitute";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_User_Substitute");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_User_Substitute");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_User_Substitute[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ed1f7680-b7d8-7d9b-00bd-b261d0d7641d")
public static String es_PE_FIELD_UserSubstitute_UserContact_Name="Usuario";

@XendraTrl(Identifier="ed1f7680-b7d8-7d9b-00bd-b261d0d7641d")
public static String es_PE_FIELD_UserSubstitute_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="ed1f7680-b7d8-7d9b-00bd-b261d0d7641d")
public static String es_PE_FIELD_UserSubstitute_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b05910f-9623-7018-bbcd-c1db3740f5cf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed1f7680-b7d8-7d9b-00bd-b261d0d7641d")
public static final String FIELDNAME_UserSubstitute_UserContact="ed1f7680-b7d8-7d9b-00bd-b261d0d7641d";

@XendraTrl(Identifier="aa523d2c-87af-30ed-8df7-5a7405407834")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa523d2c-87af-30ed-8df7-5a7405407834",
Synchronized="2019-08-30 22:20:49.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set User Substitute.
@param AD_User_Substitute_ID Substitute of the user */
public void setAD_User_Substitute_ID (int AD_User_Substitute_ID)
{
if (AD_User_Substitute_ID < 1) throw new IllegalArgumentException ("AD_User_Substitute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_Substitute_ID, Integer.valueOf(AD_User_Substitute_ID));
}
/** Get User Substitute.
@return Substitute of the user */
public int getAD_User_Substitute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_Substitute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9e54da4a-1bd3-58af-ca0e-4bfad50483fd")
public static String es_PE_FIELD_UserSubstitute_UserSubstitute_Name="Usuario Sustituto";

@XendraTrl(Identifier="9e54da4a-1bd3-58af-ca0e-4bfad50483fd")
public static String es_PE_FIELD_UserSubstitute_UserSubstitute_Description="Usuario Sustituto";

@XendraTrl(Identifier="9e54da4a-1bd3-58af-ca0e-4bfad50483fd")
public static String es_PE_FIELD_UserSubstitute_UserSubstitute_Help="Un usuario que puede actuar por otro usuario.";

@XendraField(AD_Column_ID="AD_User_Substitute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b05910f-9623-7018-bbcd-c1db3740f5cf",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e54da4a-1bd3-58af-ca0e-4bfad50483fd")
public static final String FIELDNAME_UserSubstitute_UserSubstitute="9e54da4a-1bd3-58af-ca0e-4bfad50483fd";
/** Column name AD_User_Substitute_ID */
public static final String COLUMNNAME_AD_User_Substitute_ID = "AD_User_Substitute_ID";
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

@XendraTrl(Identifier="b260668a-3eb7-028e-0d7b-1d3c5fa67b6e")
public static String es_PE_FIELD_UserSubstitute_Description_Name="Observación";

@XendraTrl(Identifier="b260668a-3eb7-028e-0d7b-1d3c5fa67b6e")
public static String es_PE_FIELD_UserSubstitute_Description_Description="Observación";

@XendraTrl(Identifier="b260668a-3eb7-028e-0d7b-1d3c5fa67b6e")
public static String es_PE_FIELD_UserSubstitute_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="3b05910f-9623-7018-bbcd-c1db3740f5cf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b260668a-3eb7-028e-0d7b-1d3c5fa67b6e")
public static final String FIELDNAME_UserSubstitute_Description="b260668a-3eb7-028e-0d7b-1d3c5fa67b6e";

@XendraTrl(Identifier="2468cdf7-37d4-405f-99af-ad9117759f79")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2468cdf7-37d4-405f-99af-ad9117759f79",
Synchronized="2019-08-30 22:20:49.0")
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
@XendraTrl(Identifier="71b9dd7e-3738-4ed1-ac18-dc7bc2590246")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71b9dd7e-3738-4ed1-ac18-dc7bc2590246",
Synchronized="2019-08-30 22:20:49.0")
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

@XendraTrl(Identifier="57b378e5-1e2c-8312-85b0-075789234c0d")
public static String es_PE_FIELD_UserSubstitute_Name_Name="Nombre";

@XendraTrl(Identifier="57b378e5-1e2c-8312-85b0-075789234c0d")
public static String es_PE_FIELD_UserSubstitute_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="57b378e5-1e2c-8312-85b0-075789234c0d")
public static String es_PE_FIELD_UserSubstitute_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="3b05910f-9623-7018-bbcd-c1db3740f5cf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57b378e5-1e2c-8312-85b0-075789234c0d")
public static final String FIELDNAME_UserSubstitute_Name="57b378e5-1e2c-8312-85b0-075789234c0d";

@XendraTrl(Identifier="6aa728c8-a0fc-e393-5d7f-7bfe906d94ba")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6aa728c8-a0fc-e393-5d7f-7bfe906d94ba",
Synchronized="2019-08-30 22:20:49.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Substitute.
@param Substitute_ID Entity which can be used in place of this entity */
public void setSubstitute_ID (int Substitute_ID)
{
if (Substitute_ID < 1) throw new IllegalArgumentException ("Substitute_ID is mandatory.");
set_Value (COLUMNNAME_Substitute_ID, Integer.valueOf(Substitute_ID));
}
/** Get Substitute.
@return Entity which can be used in place of this entity */
public int getSubstitute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Substitute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00ea85ee-5416-b945-0201-7cadfe7dfc4a")
public static String es_PE_FIELD_UserSubstitute_Substitute_Name="Sustituto";

@XendraTrl(Identifier="00ea85ee-5416-b945-0201-7cadfe7dfc4a")
public static String es_PE_FIELD_UserSubstitute_Substitute_Description="Producto que puede ser usado en lugar de otro producto";

@XendraTrl(Identifier="00ea85ee-5416-b945-0201-7cadfe7dfc4a")
public static String es_PE_FIELD_UserSubstitute_Substitute_Help="El sustituto indica el producto a ser usado como sustituto de este producto";

@XendraField(AD_Column_ID="Substitute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b05910f-9623-7018-bbcd-c1db3740f5cf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00ea85ee-5416-b945-0201-7cadfe7dfc4a")
public static final String FIELDNAME_UserSubstitute_Substitute="00ea85ee-5416-b945-0201-7cadfe7dfc4a";

@XendraTrl(Identifier="0785dbc9-1230-1394-f31b-c34552e7746c")
public static String es_PE_COLUMN_Substitute_ID_Name="Sustituto";

@XendraColumn(AD_Element_ID="d6f3fe5e-b0b3-b883-b221-6ff26dfa1d39",ColumnName="Substitute_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0785dbc9-1230-1394-f31b-c34552e7746c",Synchronized="2019-08-30 22:20:49.0")
/** Column name Substitute_ID */
public static final String COLUMNNAME_Substitute_ID = "Substitute_ID";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="401b4f0c-d747-5097-67cc-245902ec0cac")
public static String es_PE_FIELD_UserSubstitute_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="401b4f0c-d747-5097-67cc-245902ec0cac")
public static String es_PE_FIELD_UserSubstitute_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="401b4f0c-d747-5097-67cc-245902ec0cac")
public static String es_PE_FIELD_UserSubstitute_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="3b05910f-9623-7018-bbcd-c1db3740f5cf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="401b4f0c-d747-5097-67cc-245902ec0cac")
public static final String FIELDNAME_UserSubstitute_ValidFrom="401b4f0c-d747-5097-67cc-245902ec0cac";

@XendraTrl(Identifier="54834de0-e06a-55fc-ea0e-796aa39993c2")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54834de0-e06a-55fc-ea0e-796aa39993c2",
Synchronized="2019-08-30 22:20:49.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="bf292925-8992-907e-c044-a75de966e7ea")
public static String es_PE_FIELD_UserSubstitute_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="bf292925-8992-907e-c044-a75de966e7ea")
public static String es_PE_FIELD_UserSubstitute_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="bf292925-8992-907e-c044-a75de966e7ea")
public static String es_PE_FIELD_UserSubstitute_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="3b05910f-9623-7018-bbcd-c1db3740f5cf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf292925-8992-907e-c044-a75de966e7ea")
public static final String FIELDNAME_UserSubstitute_ValidTo="bf292925-8992-907e-c044-a75de966e7ea";

@XendraTrl(Identifier="dc579fb8-14b1-97f1-ae24-ab9f4cb95e39")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc579fb8-14b1-97f1-ae24-ab9f4cb95e39",
Synchronized="2019-08-30 22:20:49.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
