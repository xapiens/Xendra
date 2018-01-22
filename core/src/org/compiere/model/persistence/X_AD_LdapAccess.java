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
/** Generated Model for AD_LdapAccess
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_LdapAccess extends PO
{
/** Standard Constructor
@param ctx context
@param AD_LdapAccess_ID id
@param trxName transaction
*/
public X_AD_LdapAccess (Properties ctx, int AD_LdapAccess_ID, String trxName)
{
super (ctx, AD_LdapAccess_ID, trxName);
/** if (AD_LdapAccess_ID == 0)
{
setAD_LdapAccess_ID (0);
setAD_LdapProcessor_ID (0);
setIsError (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_LdapAccess (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=904 */
public static int Table_ID=MTable.getTable_ID("AD_LdapAccess");

@XendraTrl(Identifier="fd77baa8-95c0-40ec-ad5c-06297ddb0451")
public static String es_PE_TAB_LDAPAccess_Description="User Access via LDAP";

@XendraTrl(Identifier="fd77baa8-95c0-40ec-ad5c-06297ddb0451")
public static String es_PE_TAB_LDAPAccess_Name="LDAP Access";
@XendraTab(Name="LDAP Access",
Description="User Access via LDAP",Help="",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",
SeqNo=80,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="77de0ec8-13aa-970d-e97c-b8781d529f50",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="fd77baa8-95c0-40ec-ad5c-06297ddb0451",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_LDAPAccess="fd77baa8-95c0-40ec-ad5c-06297ddb0451";

@XendraTrl(Identifier="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7")
public static String es_PE_TAB_LDAPAccess2_Description="User Access via LDAP";

@XendraTrl(Identifier="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7")
public static String es_PE_TAB_LDAPAccess2_Name="LDAP Access";
@XendraTab(Name="LDAP Access",
Description="User Access via LDAP",Help="",AD_Window_ID="cbadf0d4-f118-0bd1-a224-303786a4e4a8",
SeqNo=30,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="a13bdd48-01cc-93a1-0bc8-1630366bca3f",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_LDAPAccess2="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7";

@XendraTrl(Identifier="82fb2737-780e-cb4e-56a6-caf88f334eee")
public static String es_PE_TABLE_AD_LdapAccess_Name="Ldap Access";

@XendraTable(Name="Ldap Access",Description="Ldap Access Log",Help="",TableName="AD_LdapAccess",
AccessLevel="7",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="82fb2737-780e-cb4e-56a6-caf88f334eee",Synchronized="2017-08-16 11:40:26.0")
/** TableName=AD_LdapAccess */
public static final String Table_Name="AD_LdapAccess";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_LdapAccess");

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
    Table_ID = MTable.getTable_ID("AD_LdapAccess");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_LdapAccess[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Ldap Access.
@param AD_LdapAccess_ID Ldap Access Log */
public void setAD_LdapAccess_ID (int AD_LdapAccess_ID)
{
if (AD_LdapAccess_ID < 1) throw new IllegalArgumentException ("AD_LdapAccess_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LdapAccess_ID, Integer.valueOf(AD_LdapAccess_ID));
}
/** Get Ldap Access.
@return Ldap Access Log */
public int getAD_LdapAccess_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LdapAccess_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e04f3da-b810-358a-4393-4c3beea95376")
public static String es_PE_FIELD_LDAPAccess_LdapAccess_Description="Ldap Access Log";

@XendraTrl(Identifier="2e04f3da-b810-358a-4393-4c3beea95376")
public static String es_PE_FIELD_LDAPAccess_LdapAccess_Help="Access via LDAP";

@XendraTrl(Identifier="2e04f3da-b810-358a-4393-4c3beea95376")
public static String es_PE_FIELD_LDAPAccess_LdapAccess_Name="Ldap Access";

@XendraField(AD_Column_ID="AD_LdapAccess_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fd77baa8-95c0-40ec-ad5c-06297ddb0451",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e04f3da-b810-358a-4393-4c3beea95376")
public static final String FIELDNAME_LDAPAccess_LdapAccess="2e04f3da-b810-358a-4393-4c3beea95376";

@XendraTrl(Identifier="0c7392e6-b49c-a407-f559-b075f6a10a91")
public static String es_PE_FIELD_LDAPAccess_LdapAccess2_Description="Ldap Access Log";

@XendraTrl(Identifier="0c7392e6-b49c-a407-f559-b075f6a10a91")
public static String es_PE_FIELD_LDAPAccess_LdapAccess2_Help="Access via LDAP";

@XendraTrl(Identifier="0c7392e6-b49c-a407-f559-b075f6a10a91")
public static String es_PE_FIELD_LDAPAccess_LdapAccess2_Name="Ldap Access";

@XendraField(AD_Column_ID="AD_LdapAccess_ID",IsCentrallyMaintained=true,
AD_Tab_ID="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c7392e6-b49c-a407-f559-b075f6a10a91")
public static final String FIELDNAME_LDAPAccess_LdapAccess2="0c7392e6-b49c-a407-f559-b075f6a10a91";
/** Column name AD_LdapAccess_ID */
public static final String COLUMNNAME_AD_LdapAccess_ID = "AD_LdapAccess_ID";
/** Set Ldap Processor.
@param AD_LdapProcessor_ID LDAP Server to authenticate and authorize external systems based on Adempiere */
public void setAD_LdapProcessor_ID (int AD_LdapProcessor_ID)
{
if (AD_LdapProcessor_ID < 1) throw new IllegalArgumentException ("AD_LdapProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_LdapProcessor_ID, Integer.valueOf(AD_LdapProcessor_ID));
}
/** Get Ldap Processor.
@return LDAP Server to authenticate and authorize external systems based on Adempiere */
public int getAD_LdapProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LdapProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="070a029c-f6af-9a85-bef3-476acf177a18")
public static String es_PE_FIELD_LDAPAccess_LdapProcessor_Description="LDAP Server to authenticate and authorize external systems based on Adempiere";

@XendraTrl(Identifier="070a029c-f6af-9a85-bef3-476acf177a18")
public static String es_PE_FIELD_LDAPAccess_LdapProcessor_Help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them.  There is only one server per Adempiere system.  The \"o\" is the Client key and the optional \"ou\" is the Interest Area key.";

@XendraTrl(Identifier="070a029c-f6af-9a85-bef3-476acf177a18")
public static String es_PE_FIELD_LDAPAccess_LdapProcessor_Name="Ldap Processor";

@XendraField(AD_Column_ID="AD_LdapProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fd77baa8-95c0-40ec-ad5c-06297ddb0451",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="070a029c-f6af-9a85-bef3-476acf177a18")
public static final String FIELDNAME_LDAPAccess_LdapProcessor="070a029c-f6af-9a85-bef3-476acf177a18";

@XendraTrl(Identifier="ec091ac1-f23e-5626-a924-0f71134c0861")
public static String es_PE_FIELD_LDAPAccess_LdapProcessor2_Description="LDAP Server to authenticate and authorize external systems based on Adempiere";

@XendraTrl(Identifier="ec091ac1-f23e-5626-a924-0f71134c0861")
public static String es_PE_FIELD_LDAPAccess_LdapProcessor2_Help="The LDAP Server allows third party software (e.g. Apache) to use the users defined in the system to authentificate and authorize them.  There is only one server per Adempiere system.  The \"o\" is the Client key and the optional \"ou\" is the Interest Area key.";

@XendraTrl(Identifier="ec091ac1-f23e-5626-a924-0f71134c0861")
public static String es_PE_FIELD_LDAPAccess_LdapProcessor2_Name="Ldap Processor";

@XendraField(AD_Column_ID="AD_LdapProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec091ac1-f23e-5626-a924-0f71134c0861")
public static final String FIELDNAME_LDAPAccess_LdapProcessor2="ec091ac1-f23e-5626-a924-0f71134c0861";

@XendraTrl(Identifier="53dc5189-2310-1c99-4c33-637af21ddf7c")
public static String es_PE_COLUMN_AD_LdapProcessor_ID_Name="Ldap Processor";

@XendraColumn(AD_Element_ID="4bf30b73-bd3a-0b2d-0cae-9bd0ac299eb8",
ColumnName="AD_LdapProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="53dc5189-2310-1c99-4c33-637af21ddf7c",Synchronized="2017-08-05 16:52:36.0")
/** Column name AD_LdapProcessor_ID */
public static final String COLUMNNAME_AD_LdapProcessor_ID = "AD_LdapProcessor_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
 else 
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_User_ID()));
}

@XendraTrl(Identifier="94a1859a-a127-15df-e05a-07a5037ff1bf")
public static String es_PE_FIELD_LDAPAccess_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="94a1859a-a127-15df-e05a-07a5037ff1bf")
public static String es_PE_FIELD_LDAPAccess_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="94a1859a-a127-15df-e05a-07a5037ff1bf")
public static String es_PE_FIELD_LDAPAccess_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fd77baa8-95c0-40ec-ad5c-06297ddb0451",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94a1859a-a127-15df-e05a-07a5037ff1bf")
public static final String FIELDNAME_LDAPAccess_UserContact="94a1859a-a127-15df-e05a-07a5037ff1bf";

@XendraTrl(Identifier="27ebdf7e-22f6-8fa5-caeb-1d75f5d6bf4a")
public static String es_PE_FIELD_LDAPAccess_UserContact2_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="27ebdf7e-22f6-8fa5-caeb-1d75f5d6bf4a")
public static String es_PE_FIELD_LDAPAccess_UserContact2_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="27ebdf7e-22f6-8fa5-caeb-1d75f5d6bf4a")
public static String es_PE_FIELD_LDAPAccess_UserContact2_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27ebdf7e-22f6-8fa5-caeb-1d75f5d6bf4a")
public static final String FIELDNAME_LDAPAccess_UserContact2="27ebdf7e-22f6-8fa5-caeb-1d75f5d6bf4a";

@XendraTrl(Identifier="77de0ec8-13aa-970d-e97c-b8781d529f50")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77de0ec8-13aa-970d-e97c-b8781d529f50",
Synchronized="2017-08-05 16:52:36.0")
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

@XendraTrl(Identifier="dcf08e2c-86b0-5d75-a118-7e94b0b0ee1e")
public static String es_PE_FIELD_LDAPAccess_Description_Description="Observación";

@XendraTrl(Identifier="dcf08e2c-86b0-5d75-a118-7e94b0b0ee1e")
public static String es_PE_FIELD_LDAPAccess_Description_Help="Observación";

@XendraTrl(Identifier="dcf08e2c-86b0-5d75-a118-7e94b0b0ee1e")
public static String es_PE_FIELD_LDAPAccess_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="fd77baa8-95c0-40ec-ad5c-06297ddb0451",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcf08e2c-86b0-5d75-a118-7e94b0b0ee1e")
public static final String FIELDNAME_LDAPAccess_Description="dcf08e2c-86b0-5d75-a118-7e94b0b0ee1e";

@XendraTrl(Identifier="1e4ef342-902f-d200-3341-e7b20cdf005d")
public static String es_PE_FIELD_LDAPAccess_Description2_Description="Observación";

@XendraTrl(Identifier="1e4ef342-902f-d200-3341-e7b20cdf005d")
public static String es_PE_FIELD_LDAPAccess_Description2_Help="Observación";

@XendraTrl(Identifier="1e4ef342-902f-d200-3341-e7b20cdf005d")
public static String es_PE_FIELD_LDAPAccess_Description2_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e4ef342-902f-d200-3341-e7b20cdf005d")
public static final String FIELDNAME_LDAPAccess_Description2="1e4ef342-902f-d200-3341-e7b20cdf005d";

@XendraTrl(Identifier="8f88e313-d0d5-66be-34a7-d4aac9c8bf08")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f88e313-d0d5-66be-34a7-d4aac9c8bf08",
Synchronized="2017-08-05 16:52:36.0")
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
@XendraTrl(Identifier="ba6f4d01-f80d-46ac-86d4-3315d56e76d8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba6f4d01-f80d-46ac-86d4-3315d56e76d8",
Synchronized="2017-08-05 16:52:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Error.
@param IsError An Error occured in the execution */
public void setIsError (boolean IsError)
{
set_ValueNoCheck (COLUMNNAME_IsError, Boolean.valueOf(IsError));
}
/** Get Error.
@return An Error occured in the execution */
public boolean isError() 
{
Object oo = get_Value(COLUMNNAME_IsError);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fdacb973-b4a3-3a26-d349-e094d3d9f208")
public static String es_PE_FIELD_LDAPAccess_Error_Description="Un error ocurrío en la ejecución.";

@XendraTrl(Identifier="fdacb973-b4a3-3a26-d349-e094d3d9f208")
public static String es_PE_FIELD_LDAPAccess_Error_Name="Error";
@XendraField(AD_Column_ID="IsError",
IsCentrallyMaintained=true,AD_Tab_ID="fd77baa8-95c0-40ec-ad5c-06297ddb0451",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fdacb973-b4a3-3a26-d349-e094d3d9f208")
public static final String FIELDNAME_LDAPAccess_Error="fdacb973-b4a3-3a26-d349-e094d3d9f208";

@XendraTrl(Identifier="47831a07-86fc-5c01-f732-e9af405ed6af")
public static String es_PE_FIELD_LDAPAccess_Error2_Description="Un error ocurrío en la ejecución.";

@XendraTrl(Identifier="47831a07-86fc-5c01-f732-e9af405ed6af")
public static String es_PE_FIELD_LDAPAccess_Error2_Name="Error";

@XendraField(AD_Column_ID="IsError",IsCentrallyMaintained=true,
AD_Tab_ID="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47831a07-86fc-5c01-f732-e9af405ed6af")
public static final String FIELDNAME_LDAPAccess_Error2="47831a07-86fc-5c01-f732-e9af405ed6af";

@XendraTrl(Identifier="bb9c14d4-38e3-745d-81ca-da6dc3558a20")
public static String es_PE_COLUMN_IsError_Name="Error";

@XendraColumn(AD_Element_ID="7a82e2b2-c09d-83e6-f469-1f1d9bae65a7",ColumnName="IsError",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb9c14d4-38e3-745d-81ca-da6dc3558a20",
Synchronized="2017-08-05 16:52:36.0")
/** Column name IsError */
public static final String COLUMNNAME_IsError = "IsError";
/** Set Interest Area.
@param R_InterestArea_ID Interest Area or Topic */
public void setR_InterestArea_ID (int R_InterestArea_ID)
{
if (R_InterestArea_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_InterestArea_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_R_InterestArea_ID, Integer.valueOf(R_InterestArea_ID));
}
/** Get Interest Area.
@return Interest Area or Topic */
public int getR_InterestArea_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_InterestArea_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4f51206c-0be6-8d87-3e04-52e8467ea691")
public static String es_PE_FIELD_LDAPAccess_InterestArea_Description="Area de interés o tópico";

@XendraTrl(Identifier="4f51206c-0be6-8d87-3e04-52e8467ea691")
public static String es_PE_FIELD_LDAPAccess_InterestArea_Help="Areas de interés reflejan interés en un tópico por un contacto. Areas de interés pueden ser usadas para campañas de mercadeo";

@XendraTrl(Identifier="4f51206c-0be6-8d87-3e04-52e8467ea691")
public static String es_PE_FIELD_LDAPAccess_InterestArea_Name="Area de Interés";

@XendraField(AD_Column_ID="R_InterestArea_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fd77baa8-95c0-40ec-ad5c-06297ddb0451",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f51206c-0be6-8d87-3e04-52e8467ea691")
public static final String FIELDNAME_LDAPAccess_InterestArea="4f51206c-0be6-8d87-3e04-52e8467ea691";

@XendraTrl(Identifier="26d3ad79-e0b5-e55b-8f5d-e1e3730de352")
public static String es_PE_FIELD_LDAPAccess_InterestArea2_Description="Area de interés o tópico";

@XendraTrl(Identifier="26d3ad79-e0b5-e55b-8f5d-e1e3730de352")
public static String es_PE_FIELD_LDAPAccess_InterestArea2_Help="Areas de interés reflejan interés en un tópico por un contacto. Areas de interés pueden ser usadas para campañas de mercadeo";

@XendraTrl(Identifier="26d3ad79-e0b5-e55b-8f5d-e1e3730de352")
public static String es_PE_FIELD_LDAPAccess_InterestArea2_Name="Area de Interés";

@XendraField(AD_Column_ID="R_InterestArea_ID",IsCentrallyMaintained=true,
AD_Tab_ID="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26d3ad79-e0b5-e55b-8f5d-e1e3730de352")
public static final String FIELDNAME_LDAPAccess_InterestArea2="26d3ad79-e0b5-e55b-8f5d-e1e3730de352";

@XendraTrl(Identifier="a13bdd48-01cc-93a1-0bc8-1630366bca3f")
public static String es_PE_COLUMN_R_InterestArea_ID_Name="Area de Interés";

@XendraColumn(AD_Element_ID="dabdec86-c4bc-85ae-f4f8-23ecf76c23c1",ColumnName="R_InterestArea_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a13bdd48-01cc-93a1-0bc8-1630366bca3f",
Synchronized="2017-08-05 16:52:36.0")
/** Column name R_InterestArea_ID */
public static final String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
/** Set Summary.
@param Summary Textual summary of this request */
public void setSummary (String Summary)
{
set_ValueNoCheck (COLUMNNAME_Summary, Summary);
}
/** Get Summary.
@return Textual summary of this request */
public String getSummary() 
{
String value = (String)get_Value(COLUMNNAME_Summary);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f8376c67-9bc2-41d3-6106-b59bf13edc58")
public static String es_PE_FIELD_LDAPAccess_Summary_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="f8376c67-9bc2-41d3-6106-b59bf13edc58")
public static String es_PE_FIELD_LDAPAccess_Summary_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraTrl(Identifier="f8376c67-9bc2-41d3-6106-b59bf13edc58")
public static String es_PE_FIELD_LDAPAccess_Summary_Name="Resúmen";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="fd77baa8-95c0-40ec-ad5c-06297ddb0451",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8376c67-9bc2-41d3-6106-b59bf13edc58")
public static final String FIELDNAME_LDAPAccess_Summary="f8376c67-9bc2-41d3-6106-b59bf13edc58";

@XendraTrl(Identifier="d3fe88c8-346d-5749-a17b-d24d494db13e")
public static String es_PE_FIELD_LDAPAccess_Summary2_Description="Resúmen textual de esta solicitud";

@XendraTrl(Identifier="d3fe88c8-346d-5749-a17b-d24d494db13e")
public static String es_PE_FIELD_LDAPAccess_Summary2_Help="El resúmen permite texto en formato libre sobre esta solicitud.";

@XendraTrl(Identifier="d3fe88c8-346d-5749-a17b-d24d494db13e")
public static String es_PE_FIELD_LDAPAccess_Summary2_Name="Resúmen";

@XendraField(AD_Column_ID="Summary",IsCentrallyMaintained=true,
AD_Tab_ID="991d05a5-cffb-dc2f-4920-5b1e3c9ac3a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3fe88c8-346d-5749-a17b-d24d494db13e")
public static final String FIELDNAME_LDAPAccess_Summary2="d3fe88c8-346d-5749-a17b-d24d494db13e";

@XendraTrl(Identifier="a3cd8933-fe93-bfcf-2d2c-b36b6ff4241c")
public static String es_PE_COLUMN_Summary_Name="Resúmen";

@XendraColumn(AD_Element_ID="94fe105c-8853-7c06-a32a-9ad75a452917",ColumnName="Summary",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3cd8933-fe93-bfcf-2d2c-b36b6ff4241c",
Synchronized="2017-08-05 16:52:36.0")
/** Column name Summary */
public static final String COLUMNNAME_Summary = "Summary";
}
