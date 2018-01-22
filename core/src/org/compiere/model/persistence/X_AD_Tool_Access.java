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
/** Generated Model for AD_Tool_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Tool_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Tool_Access_ID id
@param trxName transaction
*/
public X_AD_Tool_Access (Properties ctx, int AD_Tool_Access_ID, String trxName)
{
super (ctx, AD_Tool_Access_ID, trxName);
/** if (AD_Tool_Access_ID == 0)
{
setAD_Tool_Access_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Tool_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000199 */
public static int Table_ID=MTable.getTable_ID("AD_Tool_Access");

@XendraTrl(Identifier="26a3b148-ff67-407a-1570-ad114abac413")
public static String es_PE_TABLE_AD_Tool_Access_Name="AD_Tool_Access";

@XendraTable(Name="AD_Tool_Access",Description="",Help="",TableName="AD_Tool_Access",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="26a3b148-ff67-407a-1570-ad114abac413",
Synchronized="2017-08-16 11:41:03.0")
/** TableName=AD_Tool_Access */
public static final String Table_Name="AD_Tool_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Tool_Access");

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
    Table_ID = MTable.getTable_ID("AD_Tool_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Tool_Access[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Tool_Access_ID.
@param AD_Tool_Access_ID AD_Tool_Access_ID */
public void setAD_Tool_Access_ID (int AD_Tool_Access_ID)
{
if (AD_Tool_Access_ID < 1) throw new IllegalArgumentException ("AD_Tool_Access_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Tool_Access_ID, Integer.valueOf(AD_Tool_Access_ID));
}
/** Get AD_Tool_Access_ID.
@return AD_Tool_Access_ID */
public int getAD_Tool_Access_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tool_Access_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Tool_Access_ID */
public static final String COLUMNNAME_AD_Tool_Access_ID = "AD_Tool_Access_ID";
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
@XendraTrl(Identifier="5b24d7c7-fb25-4aa4-9789-f37302aab3e8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b24d7c7-fb25-4aa4-9789-f37302aab3e8",
Synchronized="2017-08-05 16:52:54.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
