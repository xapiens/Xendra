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
/** Generated Model for AD_TaskInstance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_TaskInstance extends PO
{
/** Standard Constructor
@param ctx context
@param AD_TaskInstance_ID id
@param trxName transaction
*/
public X_AD_TaskInstance (Properties ctx, int AD_TaskInstance_ID, String trxName)
{
super (ctx, AD_TaskInstance_ID, trxName);
/** if (AD_TaskInstance_ID == 0)
{
setAD_Task_ID (0);
setAD_TaskInstance_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_TaskInstance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=125 */
public static int Table_ID=MTable.getTable_ID("AD_TaskInstance");

@XendraTrl(Identifier="4da5e027-7491-2a70-305d-acd7445b6d81")
public static String es_PE_TABLE_AD_TaskInstance_Name="Instancia de la Tarea";

@XendraTable(Name="Task Instance",Description="",Help="",TableName="AD_TaskInstance",
AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="4da5e027-7491-2a70-305d-acd7445b6d81",
Synchronized="2017-08-16 11:41:03.0")
/** TableName=AD_TaskInstance */
public static final String Table_Name="AD_TaskInstance";


@XendraIndex(Name="ad_taskinstance_task",Identifier="0133e6a3-5063-8329-766f-a93fcf716c94",
Column_Names="ad_task_id",IsUnique="false",TableIdentifier="0133e6a3-5063-8329-766f-a93fcf716c94",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_taskinstance_task = "0133e6a3-5063-8329-766f-a93fcf716c94";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_TaskInstance");

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
    Table_ID = MTable.getTable_ID("AD_TaskInstance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_TaskInstance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set OS Task.
@param AD_Task_ID Operation System Task */
public void setAD_Task_ID (int AD_Task_ID)
{
if (AD_Task_ID < 1) throw new IllegalArgumentException ("AD_Task_ID is mandatory.");
set_Value (COLUMNNAME_AD_Task_ID, Integer.valueOf(AD_Task_ID));
}
/** Get OS Task.
@return Operation System Task */
public int getAD_Task_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Task_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="688df262-f686-0597-d69a-4cb580b09737")
public static String es_PE_COLUMN_AD_Task_ID_Name="Tarea";

@XendraColumn(AD_Element_ID="b760b68d-e9b1-5100-eab2-b34b6c0a1e20",ColumnName="AD_Task_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="688df262-f686-0597-d69a-4cb580b09737",
Synchronized="2017-08-05 16:52:54.0")
/** Column name AD_Task_ID */
public static final String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
/** Set Task Instance.
@param AD_TaskInstance_ID Task Instance */
public void setAD_TaskInstance_ID (int AD_TaskInstance_ID)
{
if (AD_TaskInstance_ID < 1) throw new IllegalArgumentException ("AD_TaskInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_TaskInstance_ID, Integer.valueOf(AD_TaskInstance_ID));
}
/** Get Task Instance.
@return Task Instance */
public int getAD_TaskInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_TaskInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_TaskInstance_ID()));
}
/** Column name AD_TaskInstance_ID */
public static final String COLUMNNAME_AD_TaskInstance_ID = "AD_TaskInstance_ID";
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
@XendraTrl(Identifier="4615251f-8cb7-48c1-a0c9-6232e64f9a77")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4615251f-8cb7-48c1-a0c9-6232e64f9a77",
Synchronized="2017-08-05 16:52:54.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
