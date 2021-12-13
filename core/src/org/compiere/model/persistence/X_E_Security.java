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
/** Generated Model for E_Security
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_Security extends PO
{
/** Standard Constructor
@param ctx context
@param E_Security_ID id
@param trxName transaction
*/
public X_E_Security (Properties ctx, int E_Security_ID, String trxName)
{
super (ctx, E_Security_ID, trxName);
/** if (E_Security_ID == 0)
{
setE_Security_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_Security (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000295 */
public static int Table_ID=MTable.getTable_ID("E_Security");

@XendraTrl(Identifier="048f05cd-ebb5-4ed9-afe1-0e2f1803818f")
public static String es_PE_TABLE_E_Security_Name="E_Security";

@XendraTable(Name="E_Security",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="E_Security",
AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.communication",Identifier="048f05cd-ebb5-4ed9-afe1-0e2f1803818f",
Synchronized="2020-03-03 21:37:49.0")
/** TableName=E_Security */
public static final String Table_Name="E_Security";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_Security");

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
    Table_ID = MTable.getTable_ID("E_Security");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_Security[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="a7acec2a-025e-4fc4-9024-cc81c48b2b54")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7acec2a-025e-4fc4-9024-cc81c48b2b54",
Synchronized="2019-08-30 22:22:27.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set E_Security_ID.
@param E_Security_ID E_Security_ID */
public void setE_Security_ID (int E_Security_ID)
{
if (E_Security_ID < 1) throw new IllegalArgumentException ("E_Security_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_Security_ID, Integer.valueOf(E_Security_ID));
}
/** Get E_Security_ID.
@return E_Security_ID */
public int getE_Security_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_Security_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_Security_ID */
public static final String COLUMNNAME_E_Security_ID = "E_Security_ID";
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
@XendraTrl(Identifier="6b9ce0fb-5437-49a4-bf14-549d66767d7d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b9ce0fb-5437-49a4-bf14-549d66767d7d",
Synchronized="2019-08-30 22:22:27.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsAlwaysEncript.
@param IsAlwaysEncript IsAlwaysEncript */
public void setIsAlwaysEncript (boolean IsAlwaysEncript)
{
set_Value (COLUMNNAME_IsAlwaysEncript, Boolean.valueOf(IsAlwaysEncript));
}
/** Get IsAlwaysEncript.
@return IsAlwaysEncript */
public boolean isAlwaysEncript() 
{
Object oo = get_Value(COLUMNNAME_IsAlwaysEncript);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="112bd668-c2a7-44fd-a160-51defd1c8b01")
public static String es_PE_COLUMN_IsAlwaysEncript_Name="IsAlwaysEncript";

@XendraColumn(AD_Element_ID="553d71d8-5f74-46f4-8c6e-13ccf837e16c",ColumnName="IsAlwaysEncript",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="112bd668-c2a7-44fd-a160-51defd1c8b01",
Synchronized="2019-08-30 22:22:27.0")
/** Column name IsAlwaysEncript */
public static final String COLUMNNAME_IsAlwaysEncript = "IsAlwaysEncript";
/** Set IsAlwaysSign.
@param IsAlwaysSign IsAlwaysSign */
public void setIsAlwaysSign (boolean IsAlwaysSign)
{
set_Value (COLUMNNAME_IsAlwaysSign, Boolean.valueOf(IsAlwaysSign));
}
/** Get IsAlwaysSign.
@return IsAlwaysSign */
public boolean isAlwaysSign() 
{
Object oo = get_Value(COLUMNNAME_IsAlwaysSign);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="602d6e2b-0838-4c91-8886-1b527f3dd581")
public static String es_PE_COLUMN_IsAlwaysSign_Name="IsAlwaysSign";

@XendraColumn(AD_Element_ID="604fbcb6-20ea-47da-8463-5d1eaab28f56",ColumnName="IsAlwaysSign",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="602d6e2b-0838-4c91-8886-1b527f3dd581",
Synchronized="2019-08-30 22:22:27.0")
/** Column name IsAlwaysSign */
public static final String COLUMNNAME_IsAlwaysSign = "IsAlwaysSign";
/** Set Path.
@param Path Path */
public void setPath (String Path)
{
if (Path != null && Path.length() > 100)
{
log.warning("Length > 100 - truncated");
Path = Path.substring(0,99);
}
set_Value (COLUMNNAME_Path, Path);
}
/** Get Path.
@return Path */
public String getPath() 
{
String value = (String)get_Value(COLUMNNAME_Path);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f9c3255d-4f86-45dd-b664-1e2ad86a2f5b")
public static String es_PE_COLUMN_Path_Name="Path";

@XendraColumn(AD_Element_ID="7a7a2b0f-0ded-423b-bfae-1323aeb5c88d",ColumnName="Path",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9c3255d-4f86-45dd-b664-1e2ad86a2f5b",
Synchronized="2019-08-30 22:22:27.0")
/** Column name Path */
public static final String COLUMNNAME_Path = "Path";
/** Set Type.
@param Type Type of Validation (SQL, Java Script, Java Language) */
public void setType (BigDecimal Type)
{
set_Value (COLUMNNAME_Type, Type);
}
/** Get Type.
@return Type of Validation (SQL, Java Script, Java Language) */
public BigDecimal getType() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Type);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7c0f8ff7-5f8a-4300-a84f-b212e1b138a1")
public static String es_PE_COLUMN_Type_Name="Type";

@XendraColumn(AD_Element_ID="25f95bd2-be42-03fc-c8d2-a7103835133c",ColumnName="Type",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c0f8ff7-5f8a-4300-a84f-b212e1b138a1",
Synchronized="2019-08-30 22:22:27.0")
/** Column name Type */
public static final String COLUMNNAME_Type = "Type";
}
