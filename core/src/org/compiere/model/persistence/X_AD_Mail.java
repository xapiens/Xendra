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
/** Generated Model for AD_Mail
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Mail extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Mail_ID id
@param trxName transaction
*/
public X_AD_Mail (Properties ctx, int AD_Mail_ID, String trxName)
{
super (ctx, AD_Mail_ID, trxName);
/** if (AD_Mail_ID == 0)
{
setAD_Mail_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Mail (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000291 */
public static int Table_ID=MTable.getTable_ID("AD_Mail");

@XendraTrl(Identifier="d084b532-fc87-4fe3-a827-e2b6c02a0c3b")
public static String es_PE_TABLE_AD_Mail_Name="AD_Mail";

@XendraTable(Name="AD_Mail",Description="",Help="",TableName="AD_Mail",AccessLevel="4",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="d084b532-fc87-4fe3-a827-e2b6c02a0c3b",Synchronized="2017-08-16 11:40:27.0")
/** TableName=AD_Mail */
public static final String Table_Name="AD_Mail";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Mail");

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
    Table_ID = MTable.getTable_ID("AD_Mail");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Mail[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Mail_ID.
@param AD_Mail_ID AD_Mail_ID */
public void setAD_Mail_ID (int AD_Mail_ID)
{
if (AD_Mail_ID < 1) throw new IllegalArgumentException ("AD_Mail_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Mail_ID, Integer.valueOf(AD_Mail_ID));
}
/** Get AD_Mail_ID.
@return AD_Mail_ID */
public int getAD_Mail_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Mail_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Mail_ID */
public static final String COLUMNNAME_AD_Mail_ID = "AD_Mail_ID";
}
