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
/** Generated Model for T_Acquisitions
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_Acquisitions extends PO
{
/** Standard Constructor
@param ctx context
@param T_Acquisitions_ID id
@param trxName transaction
*/
public X_T_Acquisitions (Properties ctx, int T_Acquisitions_ID, String trxName)
{
super (ctx, T_Acquisitions_ID, trxName);
/** if (T_Acquisitions_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Acquisitions (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000003 */
public static int Table_ID=MTable.getTable_ID("T_Acquisitions");

@XendraTrl(Identifier="e5e6e1ee-3a0c-70f0-17e7-caa63fb63bb2")
public static String es_PE_TABLE_T_Acquisitions_Name="Registro de Compras";

@XendraTable(Name="Acquisitions Report",Description="",Help="",TableName="T_Acquisitions",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.standard",Identifier="e5e6e1ee-3a0c-70f0-17e7-caa63fb63bb2",
Synchronized="2017-08-16 11:44:17.0")
/** TableName=T_Acquisitions */
public static final String Table_Name="T_Acquisitions";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Acquisitions");

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
    Table_ID = MTable.getTable_ID("T_Acquisitions");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Acquisitions[").append(get_ID()).append("]");
return sb.toString();
}
}
