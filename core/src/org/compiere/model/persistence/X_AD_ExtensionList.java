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
/** Generated Model for AD_ExtensionList
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_ExtensionList extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ExtensionList_ID id
@param trxName transaction
*/
public X_AD_ExtensionList (Properties ctx, int AD_ExtensionList_ID, String trxName)
{
super (ctx, AD_ExtensionList_ID, trxName);
/** if (AD_ExtensionList_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ExtensionList (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000332 */
public static int Table_ID=MTable.getTable_ID("AD_ExtensionList");

@XendraTrl(Identifier="2cd3c527-fa85-48f6-b7cf-20ed48a65c85")
public static String es_PE_TABLE_AD_ExtensionList_Name="Plugin Extension List";

@XendraTable(Name="Plugin Extension List",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_ExtensionList",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="2cd3c527-fa85-48f6-b7cf-20ed48a65c85",
Synchronized="2020-03-03 21:35:00.0")
/** TableName=AD_ExtensionList */
public static final String Table_Name="AD_ExtensionList";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_ExtensionList");

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
    Table_ID = MTable.getTable_ID("AD_ExtensionList");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_ExtensionList[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Plugin Extension List.
@param AD_ExtensionList_ID Plugin Extension List */
public void setAD_ExtensionList_ID (int AD_ExtensionList_ID)
{
if (AD_ExtensionList_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_ExtensionList_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_ExtensionList_ID, Integer.valueOf(AD_ExtensionList_ID));
}
/** Get Plugin Extension List.
@return Plugin Extension List */
public int getAD_ExtensionList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ExtensionList_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_ExtensionList_ID */
public static final String COLUMNNAME_AD_ExtensionList_ID = "AD_ExtensionList_ID";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
if (ID != null && ID.length() > 100)
{
log.warning("Length > 100 - truncated");
ID = ID.substring(0,99);
}
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0e330bec-5511-47a2-ac3c-ab7c046377d1")
public static String es_PE_COLUMN_ID_Name="id";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e330bec-5511-47a2-ac3c-ab7c046377d1",
Synchronized="2019-08-30 22:20:19.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
}
