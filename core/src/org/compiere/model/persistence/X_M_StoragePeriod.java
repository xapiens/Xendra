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
/** Generated Model for M_StoragePeriod
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_StoragePeriod extends PO
{
/** Standard Constructor
@param ctx context
@param M_StoragePeriod_ID id
@param trxName transaction
*/
public X_M_StoragePeriod (Properties ctx, int M_StoragePeriod_ID, String trxName)
{
super (ctx, M_StoragePeriod_ID, trxName);
/** if (M_StoragePeriod_ID == 0)
{
setC_Period_ID (0);
setM_StoragePeriod_ID (0);
setProcessed (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_StoragePeriod (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000344 */
public static int Table_ID=MTable.getTable_ID("M_StoragePeriod");

@XendraTrl(Identifier="f48f59cc-b6e4-4469-934a-4d8959a9b678")
public static String es_PE_TABLE_M_StoragePeriod_Name="Storage Period";

@XendraTable(Name="Storage Period",Description="",Help="",TableName="M_StoragePeriod",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.material",Identifier="f48f59cc-b6e4-4469-934a-4d8959a9b678",
Synchronized="2017-08-16 11:43:36.0")
/** TableName=M_StoragePeriod */
public static final String Table_Name="M_StoragePeriod";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_StoragePeriod");

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
    Table_ID = MTable.getTable_ID("M_StoragePeriod");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_StoragePeriod[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d60cd4a4-1a76-4dac-948c-69c232c966d1")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d60cd4a4-1a76-4dac-948c-69c232c966d1",
Synchronized="2017-08-05 16:55:35.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_Value (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="d34364c3-76e3-4675-97b5-372ca834d943")
public static String es_PE_COLUMN_DateLastRun_Name="Date last run";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d34364c3-76e3-4675-97b5-372ca834d943",
Synchronized="2017-08-05 16:55:35.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
/** Set LastCosted.
@param LastCosted LastCosted */
public void setLastCosted (Timestamp LastCosted)
{
set_Value (COLUMNNAME_LastCosted, LastCosted);
}
/** Get LastCosted.
@return LastCosted */
public Timestamp getLastCosted() 
{
return (Timestamp)get_Value(COLUMNNAME_LastCosted);
}

@XendraTrl(Identifier="b8a3480f-017a-4458-a358-6e5242699190")
public static String es_PE_COLUMN_LastCosted_Name="LastCosted";

@XendraColumn(AD_Element_ID="13460917-cbad-45c0-a98e-aa5d708aeb80",ColumnName="LastCosted",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8a3480f-017a-4458-a358-6e5242699190",
Synchronized="2017-08-05 16:55:35.0")
/** Column name LastCosted */
public static final String COLUMNNAME_LastCosted = "LastCosted";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6fc154f4-f749-4849-ae18-895456c01acf")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fc154f4-f749-4849-ae18-895456c01acf",
Synchronized="2017-08-05 16:55:35.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Storage Period.
@param M_StoragePeriod_ID Storage Period */
public void setM_StoragePeriod_ID (int M_StoragePeriod_ID)
{
if (M_StoragePeriod_ID < 1) throw new IllegalArgumentException ("M_StoragePeriod_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_StoragePeriod_ID, Integer.valueOf(M_StoragePeriod_ID));
}
/** Get Storage Period.
@return Storage Period */
public int getM_StoragePeriod_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_StoragePeriod_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_StoragePeriod_ID */
public static final String COLUMNNAME_M_StoragePeriod_ID = "M_StoragePeriod_ID";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d25309d6-0cb1-4285-863c-fe7dd5b1c535")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d25309d6-0cb1-4285-863c-fe7dd5b1c535",
Synchronized="2017-08-05 16:55:35.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
}
