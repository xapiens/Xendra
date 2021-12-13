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
/** Generated Model for C_ContactEmail
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ContactEmail extends PO
{
/** Standard Constructor
@param ctx context
@param C_ContactEmail_ID id
@param trxName transaction
*/
public X_C_ContactEmail (Properties ctx, int C_ContactEmail_ID, String trxName)
{
super (ctx, C_ContactEmail_ID, trxName);
/** if (C_ContactEmail_ID == 0)
{
setC_ContactEmail_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ContactEmail (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000309 */
public static int Table_ID=MTable.getTable_ID("C_ContactEmail");

@XendraTrl(Identifier="b6871540-075d-45bf-a3af-5daafd85a435")
public static String es_PE_TABLE_C_ContactEmail_Name="Contact Email";

@XendraTable(Name="Contact Email",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_ContactEmail",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="b6871540-075d-45bf-a3af-5daafd85a435",
Synchronized="2020-03-03 21:36:46.0")
/** TableName=C_ContactEmail */
public static final String Table_Name="C_ContactEmail";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ContactEmail");

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
    Table_ID = MTable.getTable_ID("C_ContactEmail");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ContactEmail[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Contact Email.
@param C_ContactEmail_ID Contact Email */
public void setC_ContactEmail_ID (int C_ContactEmail_ID)
{
if (C_ContactEmail_ID < 1) throw new IllegalArgumentException ("C_ContactEmail_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ContactEmail_ID, Integer.valueOf(C_ContactEmail_ID));
}
/** Get Contact Email.
@return Contact Email */
public int getC_ContactEmail_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ContactEmail_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_ContactEmail_ID */
public static final String COLUMNNAME_C_ContactEmail_ID = "C_ContactEmail_ID";
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

@XendraTrl(Identifier="71c5bc0e-a405-40fd-a003-645aa6cd9154")
public static String es_PE_COLUMN_C_Contact_ID_Name="C_Contact";

@XendraColumn(AD_Element_ID="bb15e679-fe21-467e-83f5-3dbf31590903",ColumnName="C_Contact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71c5bc0e-a405-40fd-a003-645aa6cd9154",
Synchronized="2019-08-30 22:21:25.0")
/** Column name C_Contact_ID */
public static final String COLUMNNAME_C_Contact_ID = "C_Contact_ID";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8607ff1b-bfd9-4297-a013-db61a71a0c3a")
public static String es_PE_COLUMN_EMail_Name="EMail Address";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8607ff1b-bfd9-4297-a013-db61a71a0c3a",
Synchronized="2019-08-30 22:21:25.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
/** Set EMailType.
@param EMailType EMailType */
public void setEMailType (String EMailType)
{
if (EMailType != null && EMailType.length() > 1)
{
log.warning("Length > 1 - truncated");
EMailType = EMailType.substring(0,0);
}
set_Value (COLUMNNAME_EMailType, EMailType);
}
/** Get EMailType.
@return EMailType */
public String getEMailType() 
{
return (String)get_Value(COLUMNNAME_EMailType);
}

@XendraTrl(Identifier="7bf3ea81-320c-473a-8b37-7c0558f1059b")
public static String es_PE_COLUMN_EMailType_Name="emailtype";

@XendraColumn(AD_Element_ID="1e3beddd-4b9a-400e-9667-930be1f90fe8",ColumnName="EMailType",
AD_Reference_ID=17,AD_Reference_Value_ID="aa9ed05b-ac7a-4d3d-916a-dcdb623a1082",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7bf3ea81-320c-473a-8b37-7c0558f1059b",Synchronized="2019-08-30 22:21:25.0")
/** Column name EMailType */
public static final String COLUMNNAME_EMailType = "EMailType";
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
@XendraTrl(Identifier="92615981-3944-483e-b8ad-951d1cceadcc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92615981-3944-483e-b8ad-951d1cceadcc",
Synchronized="2019-08-30 22:21:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
