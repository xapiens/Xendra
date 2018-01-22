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
/** Generated Model for AD_Certificate
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Certificate extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Certificate_ID id
@param trxName transaction
*/
public X_AD_Certificate (Properties ctx, int AD_Certificate_ID, String trxName)
{
super (ctx, AD_Certificate_ID, trxName);
/** if (AD_Certificate_ID == 0)
{
setAD_Certificate_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Certificate (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000395 */
public static int Table_ID=MTable.getTable_ID("AD_Certificate");

@XendraTrl(Identifier="125266c0-ac90-405b-b680-80cc9d535ed8")
public static String es_PE_TABLE_AD_Certificate_Name="Certificates";

@XendraTable(Name="Certificates",Description="Certificates",Help="",TableName="AD_Certificate",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="125266c0-ac90-405b-b680-80cc9d535ed8",
Synchronized="2017-09-25 06:54:07.0")
/** TableName=AD_Certificate */
public static final String Table_Name="AD_Certificate";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Certificate");

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
    Table_ID = MTable.getTable_ID("AD_Certificate");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Certificate[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Certificate_ID.
@param AD_Certificate_ID AD_Certificate_ID */
public void setAD_Certificate_ID (int AD_Certificate_ID)
{
if (AD_Certificate_ID < 1) throw new IllegalArgumentException ("AD_Certificate_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Certificate_ID, Integer.valueOf(AD_Certificate_ID));
}
/** Get AD_Certificate_ID.
@return AD_Certificate_ID */
public int getAD_Certificate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Certificate_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Certificate_ID */
public static final String COLUMNNAME_AD_Certificate_ID = "AD_Certificate_ID";
/** Set Alias.
@param Alias Alias */
public void setAlias (String Alias)
{
if (Alias != null && Alias.length() > 10)
{
log.warning("Length > 10 - truncated");
Alias = Alias.substring(0,9);
}
set_Value (COLUMNNAME_Alias, Alias);
}
/** Get Alias.
@return Alias */
public String getAlias() 
{
String value = (String)get_Value(COLUMNNAME_Alias);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2866ee72-2cad-4c75-8591-e54897e9462a")
public static String es_PE_COLUMN_Alias_Name="Alias";

@XendraColumn(AD_Element_ID="eb2b55b1-1094-cce9-62c7-fbcb31313519",ColumnName="Alias",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2866ee72-2cad-4c75-8591-e54897e9462a",
Synchronized="2017-09-25 06:53:30.0")
/** Column name Alias */
public static final String COLUMNNAME_Alias = "Alias";
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
@XendraTrl(Identifier="30b3d46e-35f3-411d-9399-897ac5f68ab1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30b3d46e-35f3-411d-9399-897ac5f68ab1",
Synchronized="2017-09-25 06:52:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
