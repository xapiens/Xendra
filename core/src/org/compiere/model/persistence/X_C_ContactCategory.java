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
/** Generated Model for C_ContactCategory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ContactCategory extends PO
{
/** Standard Constructor
@param ctx context
@param C_ContactCategory_ID id
@param trxName transaction
*/
public X_C_ContactCategory (Properties ctx, int C_ContactCategory_ID, String trxName)
{
super (ctx, C_ContactCategory_ID, trxName);
/** if (C_ContactCategory_ID == 0)
{
setC_ContactCategory_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ContactCategory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000387 */
public static int Table_ID=MTable.getTable_ID("C_ContactCategory");

@XendraTrl(Identifier="af93a7ba-4675-4a08-92d5-a303863891d5")
public static String es_PE_TABLE_C_ContactCategory_Name="Contact Category";

@XendraTable(Name="Contact Category",Description="",Help="",TableName="C_ContactCategory",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="af93a7ba-4675-4a08-92d5-a303863891d5",
Synchronized="2017-08-16 11:41:40.0")
/** TableName=C_ContactCategory */
public static final String Table_Name="C_ContactCategory";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ContactCategory");

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
    Table_ID = MTable.getTable_ID("C_ContactCategory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ContactCategory[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_ContactCategory_ID.
@param C_ContactCategory_ID C_ContactCategory_ID */
public void setC_ContactCategory_ID (int C_ContactCategory_ID)
{
if (C_ContactCategory_ID < 1) throw new IllegalArgumentException ("C_ContactCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ContactCategory_ID, Integer.valueOf(C_ContactCategory_ID));
}
/** Get C_ContactCategory_ID.
@return C_ContactCategory_ID */
public int getC_ContactCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ContactCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_ContactCategory_ID */
public static final String COLUMNNAME_C_ContactCategory_ID = "C_ContactCategory_ID";
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
@XendraTrl(Identifier="273465e0-8cae-4325-8b67-5cfbe702566d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="273465e0-8cae-4325-8b67-5cfbe702566d",
Synchronized="2017-08-05 16:53:32.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 50)
{
log.warning("Length > 50 - truncated");
Name = Name.substring(0,49);
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

@XendraTrl(Identifier="44a96c6a-b3fc-426d-bb46-241c5a700969")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44a96c6a-b3fc-426d-bb46-241c5a700969",
Synchronized="2017-08-05 16:53:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
