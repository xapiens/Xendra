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
/** Generated Model for R_IssueUser
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_IssueUser extends PO
{
/** Standard Constructor
@param ctx context
@param R_IssueUser_ID id
@param trxName transaction
*/
public X_R_IssueUser (Properties ctx, int R_IssueUser_ID, String trxName)
{
super (ctx, R_IssueUser_ID, trxName);
/** if (R_IssueUser_ID == 0)
{
setR_IssueUser_ID (0);
setUserName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_IssueUser (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=841 */
public static int Table_ID=MTable.getTable_ID("R_IssueUser");

@XendraTrl(Identifier="95d32cc6-5920-4032-25c7-9512fde6f1a4")
public static String es_PE_TAB_IssueUser_Description="Usuario que reoprtó surtimiento";

@XendraTrl(Identifier="95d32cc6-5920-4032-25c7-9512fde6f1a4")
public static String es_PE_TAB_IssueUser_Name="Usuario Surtimiento";
@XendraTab(Name="Issue User",
Description="User who reported Issues",Help="",AD_Window_ID="db95581f-20c0-e208-d671-c8de386d5878",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="95d32cc6-5920-4032-25c7-9512fde6f1a4",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IssueUser="95d32cc6-5920-4032-25c7-9512fde6f1a4";

@XendraTrl(Identifier="1cc0cf5e-37b5-b0a9-8f33-1e796565b58a")
public static String es_PE_TABLE_R_IssueUser_Name="Usuario Edición";

@XendraTable(Name="IssueUser",Description="User who reported issues",Help="",
TableName="R_IssueUser",AccessLevel="6",AD_Window_ID="db95581f-20c0-e208-d671-c8de386d5878",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="1cc0cf5e-37b5-b0a9-8f33-1e796565b58a",Synchronized="2017-08-16 11:43:49.0")
/** TableName=R_IssueUser */
public static final String Table_Name="R_IssueUser";


@XendraIndex(Name="r_issueuser_email",Identifier="e86cde80-ede1-6fac-98db-59c20c175811",
Column_Names="username, ad_client_id",IsUnique="true",
TableIdentifier="e86cde80-ede1-6fac-98db-59c20c175811",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_issueuser_email = "e86cde80-ede1-6fac-98db-59c20c175811";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_IssueUser");

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
    Table_ID = MTable.getTable_ID("R_IssueUser");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_IssueUser[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="85306d75-e74d-3768-d831-7351e37f4cc5")
public static String es_PE_FIELD_IssueUser_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="85306d75-e74d-3768-d831-7351e37f4cc5")
public static String es_PE_FIELD_IssueUser_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="85306d75-e74d-3768-d831-7351e37f4cc5")
public static String es_PE_FIELD_IssueUser_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95d32cc6-5920-4032-25c7-9512fde6f1a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85306d75-e74d-3768-d831-7351e37f4cc5")
public static final String FIELDNAME_IssueUser_UserContact="85306d75-e74d-3768-d831-7351e37f4cc5";

@XendraTrl(Identifier="02d7b416-6819-6f5b-99cd-7a8a6158588d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02d7b416-6819-6f5b-99cd-7a8a6158588d",
Synchronized="2017-08-05 16:55:50.0")
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

@XendraTrl(Identifier="570d64c6-f13d-3430-2204-b4e0f09966d7")
public static String es_PE_FIELD_IssueUser_Description_Description="Observación";

@XendraTrl(Identifier="570d64c6-f13d-3430-2204-b4e0f09966d7")
public static String es_PE_FIELD_IssueUser_Description_Help="Observación";

@XendraTrl(Identifier="570d64c6-f13d-3430-2204-b4e0f09966d7")
public static String es_PE_FIELD_IssueUser_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="95d32cc6-5920-4032-25c7-9512fde6f1a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="570d64c6-f13d-3430-2204-b4e0f09966d7")
public static final String FIELDNAME_IssueUser_Description="570d64c6-f13d-3430-2204-b4e0f09966d7";

@XendraTrl(Identifier="18ca3a0e-babe-196c-2e1c-95c43cb4927e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18ca3a0e-babe-196c-2e1c-95c43cb4927e",
Synchronized="2017-08-05 16:55:50.0")
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
@XendraTrl(Identifier="3d279773-8a15-4bf5-977c-afc58a3916d7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d279773-8a15-4bf5-977c-afc58a3916d7",
Synchronized="2017-08-05 16:55:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IssueUser.
@param R_IssueUser_ID User who reported issues */
public void setR_IssueUser_ID (int R_IssueUser_ID)
{
if (R_IssueUser_ID < 1) throw new IllegalArgumentException ("R_IssueUser_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_IssueUser_ID, Integer.valueOf(R_IssueUser_ID));
}
/** Get IssueUser.
@return User who reported issues */
public int getR_IssueUser_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueUser_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09a20801-9dfc-a139-5307-0b087a1337e7")
public static String es_PE_FIELD_IssueUser_IssueUser_Description="Usuario quién reportó la edición";

@XendraTrl(Identifier="09a20801-9dfc-a139-5307-0b087a1337e7")
public static String es_PE_FIELD_IssueUser_IssueUser_Name="Usuario Edición";

@XendraField(AD_Column_ID="R_IssueUser_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95d32cc6-5920-4032-25c7-9512fde6f1a4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09a20801-9dfc-a139-5307-0b087a1337e7")
public static final String FIELDNAME_IssueUser_IssueUser="09a20801-9dfc-a139-5307-0b087a1337e7";
/** Column name R_IssueUser_ID */
public static final String COLUMNNAME_R_IssueUser_ID = "R_IssueUser_ID";
/** Set Registered EMail.
@param UserName Email of the responsible for the System */
public void setUserName (String UserName)
{
if (UserName == null) throw new IllegalArgumentException ("UserName is mandatory.");
if (UserName.length() > 60)
{
log.warning("Length > 60 - truncated");
UserName = UserName.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_UserName, UserName);
}
/** Get Registered EMail.
@return Email of the responsible for the System */
public String getUserName() 
{
String value = (String)get_Value(COLUMNNAME_UserName);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getUserName());
}

@XendraTrl(Identifier="195156e9-3d85-a6e0-dd81-06fc51816357")
public static String es_PE_FIELD_IssueUser_RegisteredEMail_Description="Usuario responsable por el sistema";

@XendraTrl(Identifier="195156e9-3d85-a6e0-dd81-06fc51816357")
public static String es_PE_FIELD_IssueUser_RegisteredEMail_Help="Persona responsable por el sistema";

@XendraTrl(Identifier="195156e9-3d85-a6e0-dd81-06fc51816357")
public static String es_PE_FIELD_IssueUser_RegisteredEMail_Name="Usuario";

@XendraField(AD_Column_ID="UserName",IsCentrallyMaintained=true,
AD_Tab_ID="95d32cc6-5920-4032-25c7-9512fde6f1a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="195156e9-3d85-a6e0-dd81-06fc51816357")
public static final String FIELDNAME_IssueUser_RegisteredEMail="195156e9-3d85-a6e0-dd81-06fc51816357";

@XendraTrl(Identifier="03abf711-337c-1798-b02d-8b751d1d55bd")
public static String es_PE_COLUMN_UserName_Name="Usuario";

@XendraColumn(AD_Element_ID="f1f44b21-d257-0aaf-7454-cf73b867319a",ColumnName="UserName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03abf711-337c-1798-b02d-8b751d1d55bd",
Synchronized="2017-08-05 16:55:50.0")
/** Column name UserName */
public static final String COLUMNNAME_UserName = "UserName";
}
