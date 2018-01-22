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
/** Generated Model for AD_Preference
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Preference extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Preference_ID id
@param trxName transaction
*/
public X_AD_Preference (Properties ctx, int AD_Preference_ID, String trxName)
{
super (ctx, AD_Preference_ID, trxName);
/** if (AD_Preference_ID == 0)
{
setAD_Preference_ID (0);
setAttribute (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Preference (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=195 */
public static int Table_ID=MTable.getTable_ID("AD_Preference");

@XendraTrl(Identifier="400b26f0-9775-9a27-7000-fcf28038bce7")
public static String es_PE_TAB_Preference_Description="Mantener preferencias de Sistema; Cliente; Organización y Usuario";

@XendraTrl(Identifier="400b26f0-9775-9a27-7000-fcf28038bce7")
public static String es_PE_TAB_Preference_Name="Preferencia";
@XendraTab(Name="Preference",
Description="Maintain System Client Org and User Preferences",Help="",
AD_Window_ID="ea086987-4506-8038-3a10-770d149910b0",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="400b26f0-9775-9a27-7000-fcf28038bce7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Preference="400b26f0-9775-9a27-7000-fcf28038bce7";

@XendraTrl(Identifier="a1c440a2-0d09-593a-709b-8ac114d72f1e")
public static String es_PE_TABLE_AD_Preference_Name="Preferencia";

@XendraTable(Name="Preference",Description="Personal Preference",Help="",TableName="AD_Preference",
AccessLevel="7",AD_Window_ID="ea086987-4506-8038-3a10-770d149910b0",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="a1c440a2-0d09-593a-709b-8ac114d72f1e",Synchronized="2017-08-16 11:40:38.0")
/** TableName=AD_Preference */
public static final String Table_Name="AD_Preference";


@XendraIndex(Name="ad_preference_attribute",Identifier="5de29168-a8e3-be09-5028-3b78c092b6ae",
Column_Names="ad_client_id, ad_org_id, ad_window_id, ad_user_id, attribute",IsUnique="true",
TableIdentifier="5de29168-a8e3-be09-5028-3b78c092b6ae",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_preference_attribute = "5de29168-a8e3-be09-5028-3b78c092b6ae";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Preference");

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
    Table_ID = MTable.getTable_ID("AD_Preference");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Preference[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Preference.
@param AD_Preference_ID Personal Value Preference */
public void setAD_Preference_ID (int AD_Preference_ID)
{
if (AD_Preference_ID < 1) throw new IllegalArgumentException ("AD_Preference_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Preference_ID, Integer.valueOf(AD_Preference_ID));
}
/** Get Preference.
@return Personal Value Preference */
public int getAD_Preference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Preference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0bf35f13-f797-d657-ceb4-efb83f38035e")
public static String es_PE_FIELD_Preference_Preference_Description="Preferencia personal";

@XendraTrl(Identifier="0bf35f13-f797-d657-ceb4-efb83f38035e")
public static String es_PE_FIELD_Preference_Preference_Name="Preferencia";

@XendraField(AD_Column_ID="AD_Preference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="400b26f0-9775-9a27-7000-fcf28038bce7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0bf35f13-f797-d657-ceb4-efb83f38035e")
public static final String FIELDNAME_Preference_Preference="0bf35f13-f797-d657-ceb4-efb83f38035e";
/** Column name AD_Preference_ID */
public static final String COLUMNNAME_AD_Preference_ID = "AD_Preference_ID";
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

@XendraTrl(Identifier="19d38e09-0977-f875-db99-fb5c1730cbc3")
public static String es_PE_FIELD_Preference_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="19d38e09-0977-f875-db99-fb5c1730cbc3")
public static String es_PE_FIELD_Preference_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="19d38e09-0977-f875-db99-fb5c1730cbc3")
public static String es_PE_FIELD_Preference_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="400b26f0-9775-9a27-7000-fcf28038bce7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19d38e09-0977-f875-db99-fb5c1730cbc3")
public static final String FIELDNAME_Preference_UserContact="19d38e09-0977-f875-db99-fb5c1730cbc3";

@XendraTrl(Identifier="f0bfc316-0146-76e0-dffb-ea6d503604a3")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0bfc316-0146-76e0-dffb-ea6d503604a3",
Synchronized="2017-08-05 16:52:40.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID <= 0) set_Value (COLUMNNAME_AD_Window_ID, null);
 else 
set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="068dd581-7e32-2915-0e3b-19f021611c70")
public static String es_PE_FIELD_Preference_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="068dd581-7e32-2915-0e3b-19f021611c70")
public static String es_PE_FIELD_Preference_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraTrl(Identifier="068dd581-7e32-2915-0e3b-19f021611c70")
public static String es_PE_FIELD_Preference_Window_Name="Ventana";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="400b26f0-9775-9a27-7000-fcf28038bce7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="068dd581-7e32-2915-0e3b-19f021611c70")
public static final String FIELDNAME_Preference_Window="068dd581-7e32-2915-0e3b-19f021611c70";

@XendraTrl(Identifier="b8796aef-dc5e-b0c5-a456-3abf27e222d0")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8796aef-dc5e-b0c5-a456-3abf27e222d0",
Synchronized="2017-08-05 16:52:40.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Attribute.
@param Attribute Attribute */
public void setAttribute (String Attribute)
{
if (Attribute == null) throw new IllegalArgumentException ("Attribute is mandatory.");
if (Attribute.length() > 60)
{
log.warning("Length > 60 - truncated");
Attribute = Attribute.substring(0,59);
}
set_Value (COLUMNNAME_Attribute, Attribute);
}
/** Get Attribute.
@return Attribute */
public String getAttribute() 
{
String value = (String)get_Value(COLUMNNAME_Attribute);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getAttribute());
}

@XendraTrl(Identifier="d3f59ba3-40fc-cb9d-edb9-b6fff0877705")
public static String es_PE_FIELD_Preference_Attribute_Description="Atributo";

@XendraTrl(Identifier="d3f59ba3-40fc-cb9d-edb9-b6fff0877705")
public static String es_PE_FIELD_Preference_Attribute_Name="Atributo";

@XendraField(AD_Column_ID="Attribute",IsCentrallyMaintained=true,
AD_Tab_ID="400b26f0-9775-9a27-7000-fcf28038bce7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3f59ba3-40fc-cb9d-edb9-b6fff0877705")
public static final String FIELDNAME_Preference_Attribute="d3f59ba3-40fc-cb9d-edb9-b6fff0877705";

@XendraTrl(Identifier="f84c8938-4029-39ce-1940-09a79d04d9ed")
public static String es_PE_COLUMN_Attribute_Name="Atributo";

@XendraColumn(AD_Element_ID="035cdc03-fcb7-d243-8f34-623518f060dc",ColumnName="Attribute",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f84c8938-4029-39ce-1940-09a79d04d9ed",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Attribute */
public static final String COLUMNNAME_Attribute = "Attribute";
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
@XendraTrl(Identifier="66107c9e-8896-4b19-8d7f-1fa25ba32ec0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66107c9e-8896-4b19-8d7f-1fa25ba32ec0",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 60)
{
log.warning("Length > 60 - truncated");
Value = Value.substring(0,59);
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
@XendraTrl(Identifier="f70d22be-87bf-a37e-da62-2c93f62cdad2")
public static String es_PE_FIELD_Preference_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="f70d22be-87bf-a37e-da62-2c93f62cdad2")
public static String es_PE_FIELD_Preference_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="f70d22be-87bf-a37e-da62-2c93f62cdad2")
public static String es_PE_FIELD_Preference_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="400b26f0-9775-9a27-7000-fcf28038bce7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f70d22be-87bf-a37e-da62-2c93f62cdad2")
public static final String FIELDNAME_Preference_SearchKey="f70d22be-87bf-a37e-da62-2c93f62cdad2";

@XendraTrl(Identifier="0445d25e-cc7c-b759-7f7c-964589d2c164")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0445d25e-cc7c-b759-7f7c-964589d2c164",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
