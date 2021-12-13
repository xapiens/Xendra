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
/** Generated Model for C_ContactIM
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ContactIM extends PO
{
/** Standard Constructor
@param ctx context
@param C_ContactIM_ID id
@param trxName transaction
*/
public X_C_ContactIM (Properties ctx, int C_ContactIM_ID, String trxName)
{
super (ctx, C_ContactIM_ID, trxName);
/** if (C_ContactIM_ID == 0)
{
setC_ContactIM_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ContactIM (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000311 */
public static int Table_ID=MTable.getTable_ID("C_ContactIM");

@XendraTrl(Identifier="6147b9c9-0961-45be-b02a-276db06f2da5")
public static String es_PE_TABLE_C_ContactIM_Name="Contact Instant Messaging";

@XendraTable(Name="Contact Instant Messaging",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_ContactIM",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="6147b9c9-0961-45be-b02a-276db06f2da5",
Synchronized="2020-03-03 21:36:46.0")
/** TableName=C_ContactIM */
public static final String Table_Name="C_ContactIM";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ContactIM");

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
    Table_ID = MTable.getTable_ID("C_ContactIM");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ContactIM[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="8c6735ec-51a0-43dd-b019-0804a14b73a7")
public static String es_PE_COLUMN_C_Contact_ID_Name="C_Contact";

@XendraColumn(AD_Element_ID="bb15e679-fe21-467e-83f5-3dbf31590903",ColumnName="C_Contact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c6735ec-51a0-43dd-b019-0804a14b73a7",
Synchronized="2019-08-30 22:21:25.0")
/** Column name C_Contact_ID */
public static final String COLUMNNAME_C_Contact_ID = "C_Contact_ID";
/** Set Contact Instant Messaging.
@param C_ContactIM_ID Contact Instant Messaging */
public void setC_ContactIM_ID (int C_ContactIM_ID)
{
if (C_ContactIM_ID < 1) throw new IllegalArgumentException ("C_ContactIM_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ContactIM_ID, Integer.valueOf(C_ContactIM_ID));
}
/** Get Contact Instant Messaging.
@return Contact Instant Messaging */
public int getC_ContactIM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ContactIM_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_ContactIM_ID */
public static final String COLUMNNAME_C_ContactIM_ID = "C_ContactIM_ID";
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
@XendraTrl(Identifier="f93de47a-7dc2-4432-bc62-3e994d92366f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f93de47a-7dc2-4432-bc62-3e994d92366f",
Synchronized="2019-08-30 22:21:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IMType.
@param IMType IMType */
public void setIMType (String IMType)
{
if (IMType != null && IMType.length() > 1)
{
log.warning("Length > 1 - truncated");
IMType = IMType.substring(0,0);
}
set_Value (COLUMNNAME_IMType, IMType);
}
/** Get IMType.
@return IMType */
public String getIMType() 
{
return (String)get_Value(COLUMNNAME_IMType);
}

@XendraTrl(Identifier="243840b1-0298-4b64-8748-f16b78eaaf07")
public static String es_PE_COLUMN_IMType_Name="imtype";

@XendraColumn(AD_Element_ID="cfd8b98f-f9a8-4893-b829-abcd63ac5196",ColumnName="IMType",
AD_Reference_ID=17,AD_Reference_Value_ID="3459f1ff-f65a-459e-8205-eec5017a1804",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="243840b1-0298-4b64-8748-f16b78eaaf07",Synchronized="2019-08-30 22:21:25.0")
/** Column name IMType */
public static final String COLUMNNAME_IMType = "IMType";
/** Set User ID.
@param UserID User ID or account number */
public void setUserID (String UserID)
{
if (UserID != null && UserID.length() > 60)
{
log.warning("Length > 60 - truncated");
UserID = UserID.substring(0,59);
}
set_Value (COLUMNNAME_UserID, UserID);
}
/** Get User ID.
@return User ID or account number */
public String getUserID() 
{
String value = (String)get_Value(COLUMNNAME_UserID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5fd19a16-5952-4219-b631-a5726c20f0de")
public static String es_PE_COLUMN_UserID_Name="User ID";

@XendraColumn(AD_Element_ID="9ebe66cf-07df-8a41-14fc-726fbde3a347",ColumnName="UserID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fd19a16-5952-4219-b631-a5726c20f0de",
Synchronized="2019-08-30 22:21:25.0")
/** Column name UserID */
public static final String COLUMNNAME_UserID = "UserID";
}
