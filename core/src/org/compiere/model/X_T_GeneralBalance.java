/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for T_GeneralBalance
 *  @author Adempiere (generated) 
 *  @version Release 1.20 - $Id: X_T_GeneralBalance.java 508 2007-11-24 23:06:53Z el_man $ */
public class X_T_GeneralBalance extends PO
{
/** Standard Constructor
@param ctx context
@param T_GeneralBalance_ID id
@param trxName transaction
*/
public X_T_GeneralBalance (Properties ctx, int T_GeneralBalance_ID, String trxName)
{
super (ctx, T_GeneralBalance_ID, trxName);
/** if (T_GeneralBalance_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_GeneralBalance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000026 */
public static final int Table_ID=MTable.getTable_ID("T_GeneralBalance");

/** TableName=T_GeneralBalance */
public static final String Table_Name="T_GeneralBalance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_GeneralBalance");

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
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_GeneralBalance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounted Amount.
@param AmtAcct Amount Balance in Currency of Accounting Schema */
public void setAmtAcct (BigDecimal AmtAcct)
{
set_Value ("AmtAcct", AmtAcct);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtAcct() 
{
BigDecimal bd = (BigDecimal)get_Value("AmtAcct");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name AmtAcct */
public static final String COLUMNNAME_AmtAcct = "AmtAcct";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sequence.
@param SeqNo Method of ordering records;
 lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value ("SeqNo", Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records;
 lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value("SeqNo");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value ("Value", Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
return (String)get_Value("Value");
}
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
