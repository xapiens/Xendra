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
/** Generated Model for C_ContactPhone
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ContactPhone extends PO
{
/** Standard Constructor
@param ctx context
@param C_ContactPhone_ID id
@param trxName transaction
*/
public X_C_ContactPhone (Properties ctx, int C_ContactPhone_ID, String trxName)
{
super (ctx, C_ContactPhone_ID, trxName);
/** if (C_ContactPhone_ID == 0)
{
setC_ContactPhone_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ContactPhone (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000310 */
public static int Table_ID=MTable.getTable_ID("C_ContactPhone");

@XendraTrl(Identifier="f09eba4d-6058-49a2-9714-ae761d22002a")
public static String es_PE_TABLE_C_ContactPhone_Name="Contact Phone";

@XendraTable(Name="Contact Phone",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_ContactPhone",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="f09eba4d-6058-49a2-9714-ae761d22002a",
Synchronized="2020-03-03 21:36:46.0")
/** TableName=C_ContactPhone */
public static final String Table_Name="C_ContactPhone";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ContactPhone");

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
    Table_ID = MTable.getTable_ID("C_ContactPhone");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ContactPhone[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_Contact.
@param C_Contact_ID C_Contact */
public void setC_Contact_ID (int C_Contact_ID)
{
if (C_Contact_ID <= 0) set_Value (COLUMNNAME_C_Contact_ID, null);
 else 
set_Value (COLUMNNAME_C_Contact_ID, Integer.valueOf(C_Contact_ID));
}
/** Get C_Contact.
@return C_Contact */
public int getC_Contact_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Contact_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9b2dbc02-a8cf-407f-9fd5-a557df2bae6b")
public static String es_PE_COLUMN_C_Contact_ID_Name="C_Contact";

@XendraColumn(AD_Element_ID="bb15e679-fe21-467e-83f5-3dbf31590903",ColumnName="C_Contact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b2dbc02-a8cf-407f-9fd5-a557df2bae6b",
Synchronized="2019-08-30 22:21:26.0")
/** Column name C_Contact_ID */
public static final String COLUMNNAME_C_Contact_ID = "C_Contact_ID";
/** Set Contact Phone.
@param C_ContactPhone_ID Contact Phone */
public void setC_ContactPhone_ID (int C_ContactPhone_ID)
{
if (C_ContactPhone_ID < 1) throw new IllegalArgumentException ("C_ContactPhone_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ContactPhone_ID, Integer.valueOf(C_ContactPhone_ID));
}
/** Get Contact Phone.
@return Contact Phone */
public int getC_ContactPhone_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ContactPhone_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_ContactPhone_ID */
public static final String COLUMNNAME_C_ContactPhone_ID = "C_ContactPhone_ID";
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
@XendraTrl(Identifier="4cbae456-a871-40fb-bd3b-1fda134f355c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4cbae456-a871-40fb-bd3b-1fda134f355c",
Synchronized="2019-08-30 22:21:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Phone.
@param Phone Identifies a telephone number */
public void setPhone (String Phone)
{
if (Phone != null && Phone.length() > 60)
{
log.warning("Length > 60 - truncated");
Phone = Phone.substring(0,59);
}
set_Value (COLUMNNAME_Phone, Phone);
}
/** Get Phone.
@return Identifies a telephone number */
public String getPhone() 
{
String value = (String)get_Value(COLUMNNAME_Phone);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="99fc8f43-78d1-42a8-9ff7-a90e40a30488")
public static String es_PE_COLUMN_Phone_Name="Phone";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99fc8f43-78d1-42a8-9ff7-a90e40a30488",
Synchronized="2019-08-30 22:21:26.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";
/** Set PhoneType.
@param PhoneType PhoneType */
public void setPhoneType (String PhoneType)
{
if (PhoneType != null && PhoneType.length() > 1)
{
log.warning("Length > 1 - truncated");
PhoneType = PhoneType.substring(0,0);
}
set_Value (COLUMNNAME_PhoneType, PhoneType);
}
/** Get PhoneType.
@return PhoneType */
public String getPhoneType() 
{
return (String)get_Value(COLUMNNAME_PhoneType);
}

@XendraTrl(Identifier="d45bf54e-66cd-4baf-9b56-e589e855bb24")
public static String es_PE_COLUMN_PhoneType_Name="phonetype";

@XendraColumn(AD_Element_ID="5672e466-99a3-427b-b9a7-909e83d121c3",ColumnName="PhoneType",
AD_Reference_ID=17,AD_Reference_Value_ID="00eee77e-a2e4-475c-b217-bbae5e2be026",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d45bf54e-66cd-4baf-9b56-e589e855bb24",Synchronized="2019-08-30 22:21:26.0")
/** Column name PhoneType */
public static final String COLUMNNAME_PhoneType = "PhoneType";
}
