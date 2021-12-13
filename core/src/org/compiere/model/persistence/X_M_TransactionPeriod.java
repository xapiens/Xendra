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
/** Generated Model for M_TransactionPeriod
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_TransactionPeriod extends PO
{
/** Standard Constructor
@param ctx context
@param M_TransactionPeriod_ID id
@param trxName transaction
*/
public X_M_TransactionPeriod (Properties ctx, int M_TransactionPeriod_ID, String trxName)
{
super (ctx, M_TransactionPeriod_ID, trxName);
/** if (M_TransactionPeriod_ID == 0)
{
setC_Period_ID (0);
setM_TransactionPeriod_ID (0);
setPercentage (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_TransactionPeriod (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000347 */
public static int Table_ID=MTable.getTable_ID("M_TransactionPeriod");

@XendraTrl(Identifier="49e69137-80c7-4b8f-94e5-7f49d9a5b6db")
public static String es_PE_TABLE_M_TransactionPeriod_Name="Transaction Period Control";


@XendraTable(Name="Transaction Period Control",
AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_TransactionPeriod",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="49e69137-80c7-4b8f-94e5-7f49d9a5b6db",Synchronized="2020-03-03 21:38:59.0")
/** TableName=M_TransactionPeriod */
public static final String Table_Name="M_TransactionPeriod";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_TransactionPeriod");

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
    Table_ID = MTable.getTable_ID("M_TransactionPeriod");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_TransactionPeriod[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="0431ddfc-22c0-472c-80cc-a57550812bd4")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0431ddfc-22c0-472c-80cc-a57550812bd4",
Synchronized="2019-08-30 22:23:34.0")
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

@XendraTrl(Identifier="828704f1-9730-4d8b-a269-4a32ef2401b6")
public static String es_PE_COLUMN_DateLastRun_Name="Date last run";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="828704f1-9730-4d8b-a269-4a32ef2401b6",
Synchronized="2019-08-30 22:23:34.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
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
@XendraTrl(Identifier="25518785-2a3a-4443-8375-9188f826d18d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25518785-2a3a-4443-8375-9188f826d18d",
Synchronized="2019-08-30 22:23:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="ea555b06-282e-4492-9564-65c03fbbe420")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea555b06-282e-4492-9564-65c03fbbe420",
Synchronized="2019-08-30 22:23:35.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Transaction Period Control.
@param M_TransactionPeriod_ID Transaction Period Control */
public void setM_TransactionPeriod_ID (int M_TransactionPeriod_ID)
{
if (M_TransactionPeriod_ID < 1) throw new IllegalArgumentException ("M_TransactionPeriod_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_TransactionPeriod_ID, Integer.valueOf(M_TransactionPeriod_ID));
}
/** Get Transaction Period Control.
@return Transaction Period Control */
public int getM_TransactionPeriod_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_TransactionPeriod_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_TransactionPeriod_ID */
public static final String COLUMNNAME_M_TransactionPeriod_ID = "M_TransactionPeriod_ID";
/** Set Percentage.
@param Percentage Percent of the entire amount */
public void setPercentage (BigDecimal Percentage)
{
if (Percentage == null) throw new IllegalArgumentException ("Percentage is mandatory.");
set_Value (COLUMNNAME_Percentage, Percentage);
}
/** Get Percentage.
@return Percent of the entire amount */
public BigDecimal getPercentage() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percentage);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a0459772-1d21-4404-a0d7-482a18ffadcc")
public static String es_PE_COLUMN_Percentage_Name="Percentage";

@XendraColumn(AD_Element_ID="83c6b07c-0e8e-a56f-24aa-d4262980060d",ColumnName="Percentage",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0459772-1d21-4404-a0d7-482a18ffadcc",
Synchronized="2019-08-30 22:23:35.0")
/** Column name Percentage */
public static final String COLUMNNAME_Percentage = "Percentage";
/** Set Signature.
@param Signature Signature */
public void setSignature (String Signature)
{
if (Signature != null && Signature.length() > 32)
{
log.warning("Length > 32 - truncated");
Signature = Signature.substring(0,31);
}
set_Value (COLUMNNAME_Signature, Signature);
}
/** Get Signature.
@return Signature */
public String getSignature() 
{
String value = (String)get_Value(COLUMNNAME_Signature);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f5544917-23e6-481e-a114-6dfdd3b86760")
public static String es_PE_COLUMN_Signature_Name="Signature";

@XendraColumn(AD_Element_ID="980443ea-14d3-4695-91bb-4aef0ce02ba8",ColumnName="Signature",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=32,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5544917-23e6-481e-a114-6dfdd3b86760",
Synchronized="2019-08-30 22:23:35.0")
/** Column name Signature */
public static final String COLUMNNAME_Signature = "Signature";
/** Set TotalTransactions.
@param TotalTransactions TotalTransactions */
public void setTotalTransactions (int TotalTransactions)
{
set_Value (COLUMNNAME_TotalTransactions, Integer.valueOf(TotalTransactions));
}
/** Get TotalTransactions.
@return TotalTransactions */
public int getTotalTransactions() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_TotalTransactions);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="80c317de-db72-48eb-b333-5741823aa900")
public static String es_PE_COLUMN_TotalTransactions_Name="TotalTransactions";

@XendraColumn(AD_Element_ID="e3434bf0-3eaa-4d3d-801c-0de7cb925b78",ColumnName="TotalTransactions",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80c317de-db72-48eb-b333-5741823aa900",
Synchronized="2019-08-30 22:23:35.0")
/** Column name TotalTransactions */
public static final String COLUMNNAME_TotalTransactions = "TotalTransactions";
}
