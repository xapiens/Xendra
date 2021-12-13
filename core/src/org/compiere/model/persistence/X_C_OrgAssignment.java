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
/** Generated Model for C_OrgAssignment
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_OrgAssignment extends PO
{
/** Standard Constructor
@param ctx context
@param C_OrgAssignment_ID id
@param trxName transaction
*/
public X_C_OrgAssignment (Properties ctx, int C_OrgAssignment_ID, String trxName)
{
super (ctx, C_OrgAssignment_ID, trxName);
/** if (C_OrgAssignment_ID == 0)
{
setAD_User_ID (0);
setC_OrgAssignment_ID (0);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_OrgAssignment (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=585 */
public static int Table_ID=MTable.getTable_ID("C_OrgAssignment");

@XendraTrl(Identifier="f956a9d9-9d8b-efce-ae48-f56cb208ce5a")
public static String es_PE_TAB_OrgAssignment_Description="Usuario asignado para la organización";

@XendraTrl(Identifier="f956a9d9-9d8b-efce-ae48-f56cb208ce5a")
public static String es_PE_TAB_OrgAssignment_Help="Asignación de usuario para la organización";

@XendraTrl(Identifier="f956a9d9-9d8b-efce-ae48-f56cb208ce5a")
public static String es_PE_TAB_OrgAssignment_Name="Asignación Org";

@XendraTab(Name="Org Assignment",Description="User Assigment to Organization",
Help="Assign Users to Organizations",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",SeqNo=40,
TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="81b5e228-a8e9-3929-15ee-72ba16e1c73d",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f956a9d9-9d8b-efce-ae48-f56cb208ce5a",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrgAssignment="f956a9d9-9d8b-efce-ae48-f56cb208ce5a";

@XendraTrl(Identifier="8f423a8f-2c63-89cd-2310-1a61fc47dd3e")
public static String es_PE_TAB_OrgAssignment2_Description="Usuario asignado para la organización";

@XendraTrl(Identifier="8f423a8f-2c63-89cd-2310-1a61fc47dd3e")
public static String es_PE_TAB_OrgAssignment2_Help="Usuario asignado para la organización";

@XendraTrl(Identifier="8f423a8f-2c63-89cd-2310-1a61fc47dd3e")
public static String es_PE_TAB_OrgAssignment2_Name="Asignación Org";

@XendraTab(Name="Org Assignment",Description="User Assigment to Organization",
Help="Assign Users to Organizations",AD_Window_ID="b18505b0-64f9-9322-2e8a-0daf80e326cb",SeqNo=40,
TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="fa6f945f-2bd4-888c-3bba-4e17411351df",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="8f423a8f-2c63-89cd-2310-1a61fc47dd3e",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrgAssignment2="8f423a8f-2c63-89cd-2310-1a61fc47dd3e";

@XendraTrl(Identifier="8e4fd8b4-93d9-47b2-fb2c-2a516c47c29b")
public static String es_PE_TABLE_C_OrgAssignment_Name="Organización Asignado ";

@XendraTable(Name="Org Assignment",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Assigment to (transaction) Organization",Help="",TableName="C_OrgAssignment",
AccessLevel="2",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="8e4fd8b4-93d9-47b2-fb2c-2a516c47c29b",Synchronized="2020-03-03 21:37:16.0")
/** TableName=C_OrgAssignment */
public static final String Table_Name="C_OrgAssignment";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_OrgAssignment");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_OrgAssignment");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_OrgAssignment[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
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

@XendraTrl(Identifier="a73a124b-065a-aa98-7cca-6770cd3bcd5b")
public static String es_PE_FIELD_OrgAssignment_UserContact_Name="Usuario";

@XendraTrl(Identifier="a73a124b-065a-aa98-7cca-6770cd3bcd5b")
public static String es_PE_FIELD_OrgAssignment_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="a73a124b-065a-aa98-7cca-6770cd3bcd5b")
public static String es_PE_FIELD_OrgAssignment_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f956a9d9-9d8b-efce-ae48-f56cb208ce5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a73a124b-065a-aa98-7cca-6770cd3bcd5b")
public static final String FIELDNAME_OrgAssignment_UserContact="a73a124b-065a-aa98-7cca-6770cd3bcd5b";

@XendraTrl(Identifier="7bacaaa5-448d-7951-fb74-104c9da7979b")
public static String es_PE_FIELD_OrgAssignment_UserContact2_Name="Usuario";

@XendraTrl(Identifier="7bacaaa5-448d-7951-fb74-104c9da7979b")
public static String es_PE_FIELD_OrgAssignment_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="7bacaaa5-448d-7951-fb74-104c9da7979b")
public static String es_PE_FIELD_OrgAssignment_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8f423a8f-2c63-89cd-2310-1a61fc47dd3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7bacaaa5-448d-7951-fb74-104c9da7979b")
public static final String FIELDNAME_OrgAssignment_UserContact2="7bacaaa5-448d-7951-fb74-104c9da7979b";

@XendraTrl(Identifier="81b5e228-a8e9-3929-15ee-72ba16e1c73d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="a1ea6cc6-fa00-1e16-1059-b4df151aaf4b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="81b5e228-a8e9-3929-15ee-72ba16e1c73d",Synchronized="2019-08-30 22:21:54.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Org Assignment.
@param C_OrgAssignment_ID Assigment to (transaction) Organization */
public void setC_OrgAssignment_ID (int C_OrgAssignment_ID)
{
if (C_OrgAssignment_ID < 1) throw new IllegalArgumentException ("C_OrgAssignment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_OrgAssignment_ID, Integer.valueOf(C_OrgAssignment_ID));
}
/** Get Org Assignment.
@return Assigment to (transaction) Organization */
public int getC_OrgAssignment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrgAssignment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9c4a50cb-10e3-1293-6dc6-2ea69ba7fd82")
public static String es_PE_FIELD_OrgAssignment_OrgAssignment_Name="Organización Asignado ";

@XendraTrl(Identifier="9c4a50cb-10e3-1293-6dc6-2ea69ba7fd82")
public static String es_PE_FIELD_OrgAssignment_OrgAssignment_Description="Asignado a (transición) la organización.";

@XendraTrl(Identifier="9c4a50cb-10e3-1293-6dc6-2ea69ba7fd82")
public static String es_PE_FIELD_OrgAssignment_OrgAssignment_Help="Asignado para la transición de organización (centro de costo).";

@XendraField(AD_Column_ID="C_OrgAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f956a9d9-9d8b-efce-ae48-f56cb208ce5a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c4a50cb-10e3-1293-6dc6-2ea69ba7fd82")
public static final String FIELDNAME_OrgAssignment_OrgAssignment="9c4a50cb-10e3-1293-6dc6-2ea69ba7fd82";

@XendraTrl(Identifier="0f51b3ff-55e8-b69a-638c-f1ffad2ff8c3")
public static String es_PE_FIELD_OrgAssignment_OrgAssignment2_Name="Organización Asignado ";

@XendraTrl(Identifier="0f51b3ff-55e8-b69a-638c-f1ffad2ff8c3")
public static String es_PE_FIELD_OrgAssignment_OrgAssignment2_Description="Asignado a (transición) la organización.";

@XendraTrl(Identifier="0f51b3ff-55e8-b69a-638c-f1ffad2ff8c3")
public static String es_PE_FIELD_OrgAssignment_OrgAssignment2_Help="Asignado para la transición de organización (centro de costo).";

@XendraField(AD_Column_ID="C_OrgAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8f423a8f-2c63-89cd-2310-1a61fc47dd3e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f51b3ff-55e8-b69a-638c-f1ffad2ff8c3")
public static final String FIELDNAME_OrgAssignment_OrgAssignment2="0f51b3ff-55e8-b69a-638c-f1ffad2ff8c3";
/** Column name C_OrgAssignment_ID */
public static final String COLUMNNAME_C_OrgAssignment_ID = "C_OrgAssignment_ID";
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

@XendraTrl(Identifier="5bda26db-ad6f-eabe-eb22-38b5cd556eec")
public static String es_PE_FIELD_OrgAssignment_Description_Name="Observación";

@XendraTrl(Identifier="5bda26db-ad6f-eabe-eb22-38b5cd556eec")
public static String es_PE_FIELD_OrgAssignment_Description_Description="Observación";

@XendraTrl(Identifier="5bda26db-ad6f-eabe-eb22-38b5cd556eec")
public static String es_PE_FIELD_OrgAssignment_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f956a9d9-9d8b-efce-ae48-f56cb208ce5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5bda26db-ad6f-eabe-eb22-38b5cd556eec")
public static final String FIELDNAME_OrgAssignment_Description="5bda26db-ad6f-eabe-eb22-38b5cd556eec";

@XendraTrl(Identifier="08c3b3a9-8357-716b-c008-4224abe7e053")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08c3b3a9-8357-716b-c008-4224abe7e053",
Synchronized="2019-08-30 22:21:54.0")
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
@XendraTrl(Identifier="a4300371-c659-4c8d-a172-32f032efc76e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4300371-c659-4c8d-a172-32f032efc76e",
Synchronized="2019-08-30 22:21:54.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="9f879f34-f509-de36-a630-654c9179647a")
public static String es_PE_FIELD_OrgAssignment_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="9f879f34-f509-de36-a630-654c9179647a")
public static String es_PE_FIELD_OrgAssignment_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="9f879f34-f509-de36-a630-654c9179647a")
public static String es_PE_FIELD_OrgAssignment_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="f956a9d9-9d8b-efce-ae48-f56cb208ce5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f879f34-f509-de36-a630-654c9179647a")
public static final String FIELDNAME_OrgAssignment_ValidFrom="9f879f34-f509-de36-a630-654c9179647a";

@XendraTrl(Identifier="3ff3ca35-46f3-7972-497a-6873246fc686")
public static String es_PE_FIELD_OrgAssignment_ValidFrom2_Name="Válido Desde";

@XendraTrl(Identifier="3ff3ca35-46f3-7972-497a-6873246fc686")
public static String es_PE_FIELD_OrgAssignment_ValidFrom2_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="3ff3ca35-46f3-7972-497a-6873246fc686")
public static String es_PE_FIELD_OrgAssignment_ValidFrom2_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="8f423a8f-2c63-89cd-2310-1a61fc47dd3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ff3ca35-46f3-7972-497a-6873246fc686")
public static final String FIELDNAME_OrgAssignment_ValidFrom2="3ff3ca35-46f3-7972-497a-6873246fc686";

@XendraTrl(Identifier="f81f25e0-b612-b9e1-64cf-05d898099767")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f81f25e0-b612-b9e1-64cf-05d898099767",
Synchronized="2019-08-30 22:21:54.0")
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

@XendraTrl(Identifier="50c2d81e-93f7-804e-1b60-eb3ed7b44185")
public static String es_PE_FIELD_OrgAssignment_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="50c2d81e-93f7-804e-1b60-eb3ed7b44185")
public static String es_PE_FIELD_OrgAssignment_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="50c2d81e-93f7-804e-1b60-eb3ed7b44185")
public static String es_PE_FIELD_OrgAssignment_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="f956a9d9-9d8b-efce-ae48-f56cb208ce5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50c2d81e-93f7-804e-1b60-eb3ed7b44185")
public static final String FIELDNAME_OrgAssignment_ValidTo="50c2d81e-93f7-804e-1b60-eb3ed7b44185";

@XendraTrl(Identifier="97fece8f-2e6a-6b6d-ceb2-45b57640fbbf")
public static String es_PE_FIELD_OrgAssignment_ValidTo2_Name="Válido Hasta";

@XendraTrl(Identifier="97fece8f-2e6a-6b6d-ceb2-45b57640fbbf")
public static String es_PE_FIELD_OrgAssignment_ValidTo2_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="97fece8f-2e6a-6b6d-ceb2-45b57640fbbf")
public static String es_PE_FIELD_OrgAssignment_ValidTo2_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="8f423a8f-2c63-89cd-2310-1a61fc47dd3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97fece8f-2e6a-6b6d-ceb2-45b57640fbbf")
public static final String FIELDNAME_OrgAssignment_ValidTo2="97fece8f-2e6a-6b6d-ceb2-45b57640fbbf";

@XendraTrl(Identifier="29bf6620-78a3-62a4-67b8-c29ac839a9e6")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29bf6620-78a3-62a4-67b8-c29ac839a9e6",
Synchronized="2019-08-30 22:21:54.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
