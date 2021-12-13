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
/** Generated Model for B_Buyer
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_Buyer extends PO
{
/** Standard Constructor
@param ctx context
@param B_Buyer_ID id
@param trxName transaction
*/
public X_B_Buyer (Properties ctx, int B_Buyer_ID, String trxName)
{
super (ctx, B_Buyer_ID, trxName);
/** if (B_Buyer_ID == 0)
{
setAD_User_ID (0);
setName (null);
setValidTo (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_Buyer (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=684 */
public static int Table_ID=MTable.getTable_ID("B_Buyer");

@XendraTrl(Identifier="db7e3106-079a-f38c-42b2-aff460447c70")
public static String es_PE_TAB_Buyer_Description="Información del Comprador";

@XendraTrl(Identifier="db7e3106-079a-f38c-42b2-aff460447c70")
public static String es_PE_TAB_Buyer_Help="Información sobre un participante en una subasta como comprador";

@XendraTrl(Identifier="db7e3106-079a-f38c-42b2-aff460447c70")
public static String es_PE_TAB_Buyer_Name="Comprador";
@XendraTab(Name="Buyer",
Description="Aution Buyer Information",
Help="Information about a participant in an Auction as a Buyer",
AD_Window_ID="e626cef7-46c4-d631-a4c7-d98c05c67a58",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="db7e3106-079a-f38c-42b2-aff460447c70",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Buyer="db7e3106-079a-f38c-42b2-aff460447c70";

@XendraTrl(Identifier="50add202-3205-1d4b-2dfc-4a05226ab521")
public static String es_PE_TABLE_B_Buyer_Name="B_Buyer";

@XendraTable(Name="B_Buyer",AD_Package_ID="a0ba5f31-73ac-fb58-5a46-04ff03d1a8c1",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="B_Buyer",
AccessLevel="3",AD_Window_ID="e626cef7-46c4-d631-a4c7-d98c05c67a58",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.bids",
Identifier="50add202-3205-1d4b-2dfc-4a05226ab521",Synchronized="2020-03-03 21:36:17.0")
/** TableName=B_Buyer */
public static final String Table_Name="B_Buyer";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_Buyer");

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
    Table_ID = MTable.getTable_ID("B_Buyer");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_Buyer[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="f1990bd3-3b4c-462a-e02c-d30086da7456")
public static String es_PE_FIELD_Buyer_UserContact_Name="Usuario";

@XendraTrl(Identifier="f1990bd3-3b4c-462a-e02c-d30086da7456")
public static String es_PE_FIELD_Buyer_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="f1990bd3-3b4c-462a-e02c-d30086da7456")
public static String es_PE_FIELD_Buyer_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db7e3106-079a-f38c-42b2-aff460447c70",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1990bd3-3b4c-462a-e02c-d30086da7456")
public static final String FIELDNAME_Buyer_UserContact="f1990bd3-3b4c-462a-e02c-d30086da7456";

@XendraTrl(Identifier="33b4f2d5-6993-c678-09ba-49606da6137d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33b4f2d5-6993-c678-09ba-49606da6137d",
Synchronized="2019-08-30 22:20:57.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="c29384a8-b312-05e3-09d0-443751b9726c")
public static String es_PE_FIELD_Buyer_Description_Name="Observación";

@XendraTrl(Identifier="c29384a8-b312-05e3-09d0-443751b9726c")
public static String es_PE_FIELD_Buyer_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c29384a8-b312-05e3-09d0-443751b9726c")
public static String es_PE_FIELD_Buyer_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="db7e3106-079a-f38c-42b2-aff460447c70",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c29384a8-b312-05e3-09d0-443751b9726c")
public static final String FIELDNAME_Buyer_Description="c29384a8-b312-05e3-09d0-443751b9726c";

@XendraTrl(Identifier="6b011f6f-792e-7655-4a9b-3e7711b67d67")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b011f6f-792e-7655-4a9b-3e7711b67d67",
Synchronized="2019-08-30 22:20:57.0")
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
@XendraTrl(Identifier="fe5e3d1c-a137-49cd-a526-8242affffd99")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe5e3d1c-a137-49cd-a526-8242affffd99",
Synchronized="2019-08-30 22:20:57.0")
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

@XendraTrl(Identifier="92cc633c-f1ea-21ff-cd7f-38bcd4545184")
public static String es_PE_FIELD_Buyer_Name_Name="Nombre";

@XendraTrl(Identifier="92cc633c-f1ea-21ff-cd7f-38bcd4545184")
public static String es_PE_FIELD_Buyer_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="92cc633c-f1ea-21ff-cd7f-38bcd4545184")
public static String es_PE_FIELD_Buyer_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="db7e3106-079a-f38c-42b2-aff460447c70",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92cc633c-f1ea-21ff-cd7f-38bcd4545184")
public static final String FIELDNAME_Buyer_Name="92cc633c-f1ea-21ff-cd7f-38bcd4545184";

@XendraTrl(Identifier="1b34d737-d1c9-45b8-0586-58ea0c3cedf0")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b34d737-d1c9-45b8-0586-58ea0c3cedf0",
Synchronized="2019-08-30 22:20:57.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
if (ValidTo == null) throw new IllegalArgumentException ("ValidTo is mandatory.");
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="23f65d35-99ed-5605-3cc5-ae04b9bfe2b7")
public static String es_PE_FIELD_Buyer_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="23f65d35-99ed-5605-3cc5-ae04b9bfe2b7")
public static String es_PE_FIELD_Buyer_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="23f65d35-99ed-5605-3cc5-ae04b9bfe2b7")
public static String es_PE_FIELD_Buyer_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="db7e3106-079a-f38c-42b2-aff460447c70",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23f65d35-99ed-5605-3cc5-ae04b9bfe2b7")
public static final String FIELDNAME_Buyer_ValidTo="23f65d35-99ed-5605-3cc5-ae04b9bfe2b7";

@XendraTrl(Identifier="fd5074fa-dbdf-76b1-0b4d-80c1994ac423")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd5074fa-dbdf-76b1-0b4d-80c1994ac423",
Synchronized="2019-08-30 22:20:57.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
