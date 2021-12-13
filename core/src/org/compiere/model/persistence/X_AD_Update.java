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
/** Generated Model for AD_Update
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Update extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Update_ID id
@param trxName transaction
*/
public X_AD_Update (Properties ctx, int AD_Update_ID, String trxName)
{
super (ctx, AD_Update_ID, trxName);
/** if (AD_Update_ID == 0)
{
setAD_Update_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Update (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000188 */
public static int Table_ID=MTable.getTable_ID("AD_Update");

@XendraTrl(Identifier="9bfcf877-f26d-3a9e-ca3c-bc7337e24aa3")
public static String es_PE_TABLE_AD_Update_Name="AD_Update";

@XendraTable(Name="AD_Update",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="AD_Update",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="9bfcf877-f26d-3a9e-ca3c-bc7337e24aa3",
Synchronized="2020-03-03 21:36:03.0")
/** TableName=AD_Update */
public static final String Table_Name="AD_Update";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Update");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_Update");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Update[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Update_ID.
@param AD_Update_ID AD_Update_ID */
public void setAD_Update_ID (int AD_Update_ID)
{
if (AD_Update_ID < 1) throw new IllegalArgumentException ("AD_Update_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Update_ID, Integer.valueOf(AD_Update_ID));
}
/** Get AD_Update_ID.
@return AD_Update_ID */
public int getAD_Update_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Update_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Update_ID */
public static final String COLUMNNAME_AD_Update_ID = "AD_Update_ID";
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
@XendraTrl(Identifier="71a027af-2725-41db-a7cd-30a952345b0e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71a027af-2725-41db-a7cd-30a952345b0e",
Synchronized="2019-08-30 22:20:46.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set UpdateHost.
@param UpdateHost UpdateHost */
public void setUpdateHost (String UpdateHost)
{
set_Value (COLUMNNAME_UpdateHost, UpdateHost);
}
/** Get UpdateHost.
@return UpdateHost */
public String getUpdateHost() 
{
String value = (String)get_Value(COLUMNNAME_UpdateHost);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0f132697-3908-6f38-337b-e0684a44064b")
public static String es_PE_COLUMN_UpdateHost_Name="UpdateHost";

@XendraColumn(AD_Element_ID="9cbfcb8a-e702-41b7-e0c3-7003d6269d8e",ColumnName="UpdateHost",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f132697-3908-6f38-337b-e0684a44064b",
Synchronized="2019-08-30 22:20:46.0")
/** Column name UpdateHost */
public static final String COLUMNNAME_UpdateHost = "UpdateHost";
}
