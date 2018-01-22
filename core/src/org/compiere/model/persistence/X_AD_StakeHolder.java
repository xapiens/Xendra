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
/** Generated Model for AD_StakeHolder
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_StakeHolder extends PO
{
/** Standard Constructor
@param ctx context
@param AD_StakeHolder_ID id
@param trxName transaction
*/
public X_AD_StakeHolder (Properties ctx, int AD_StakeHolder_ID, String trxName)
{
super (ctx, AD_StakeHolder_ID, trxName);
/** if (AD_StakeHolder_ID == 0)
{
setAD_StakeHolder_ID (0);
setC_BPartner_ID (0);
setnominal_value (Env.ZERO);
setpaid_up_shares (Env.ZERO);
setPercent (Env.ZERO);
setshares (Env.ZERO);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_StakeHolder (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000373 */
public static int Table_ID=MTable.getTable_ID("AD_StakeHolder");

@XendraTrl(Identifier="ac0cac61-5d91-4b49-9eab-487912108a54")
public static String es_PE_TABLE_AD_StakeHolder_Name="Stake Holder";

@XendraTable(Name="Stake Holder",Description="",Help="",TableName="AD_StakeHolder",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="ac0cac61-5d91-4b49-9eab-487912108a54",Synchronized="2017-08-16 11:41:00.0")
/** TableName=AD_StakeHolder */
public static final String Table_Name="AD_StakeHolder";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_StakeHolder");

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
    Table_ID = MTable.getTable_ID("AD_StakeHolder");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_StakeHolder[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Stake Holder.
@param AD_StakeHolder_ID Stake Holder */
public void setAD_StakeHolder_ID (int AD_StakeHolder_ID)
{
if (AD_StakeHolder_ID < 1) throw new IllegalArgumentException ("AD_StakeHolder_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_StakeHolder_ID, Integer.valueOf(AD_StakeHolder_ID));
}
/** Get Stake Holder.
@return Stake Holder */
public int getAD_StakeHolder_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_StakeHolder_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_StakeHolder_ID */
public static final String COLUMNNAME_AD_StakeHolder_ID = "AD_StakeHolder_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2f85735d-458c-4a67-a55f-740d52e5ed98")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f85735d-458c-4a67-a55f-740d52e5ed98",
Synchronized="2017-08-05 16:52:51.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="c79e46f3-46dd-44bc-8ce5-ec752cfe0c47")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c79e46f3-46dd-44bc-8ce5-ec752cfe0c47",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="35ca4e5f-8c25-4ab6-9cfe-e3970dbce7cc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35ca4e5f-8c25-4ab6-9cfe-e3970dbce7cc",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set nominal_value.
@param nominal_value nominal_value */
public void setnominal_value (BigDecimal nominal_value)
{
if (nominal_value == null) throw new IllegalArgumentException ("nominal_value is mandatory.");
set_Value (COLUMNNAME_nominal_value, nominal_value);
}
/** Get nominal_value.
@return nominal_value */
public BigDecimal getnominal_value() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_nominal_value);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="07a7bdd2-d11a-40a4-9425-51321734bafa")
public static String es_PE_COLUMN_nominal_value_Name="nominal_value";

@XendraColumn(AD_Element_ID="e64fb4d9-9356-463e-bb8d-7994b3fa00b2",ColumnName="nominal_value",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07a7bdd2-d11a-40a4-9425-51321734bafa",
Synchronized="2017-08-05 16:52:51.0")
/** Column name nominal_value */
public static final String COLUMNNAME_nominal_value = "nominal_value";
/** Set paid_up_shares.
@param paid_up_shares paid_up_shares */
public void setpaid_up_shares (BigDecimal paid_up_shares)
{
if (paid_up_shares == null) throw new IllegalArgumentException ("paid_up_shares is mandatory.");
set_Value (COLUMNNAME_paid_up_shares, paid_up_shares);
}
/** Get paid_up_shares.
@return paid_up_shares */
public BigDecimal getpaid_up_shares() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_paid_up_shares);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="727b149a-bb88-4c57-b485-56ad73cb9634")
public static String es_PE_COLUMN_paid_up_shares_Name="paid_up_shares";

@XendraColumn(AD_Element_ID="3fbbdb2f-d9f4-45ce-a007-1296b40fb87e",ColumnName="paid_up_shares",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="727b149a-bb88-4c57-b485-56ad73cb9634",
Synchronized="2017-08-05 16:52:51.0")
/** Column name paid_up_shares */
public static final String COLUMNNAME_paid_up_shares = "paid_up_shares";
/** Set Percent.
@param Percent Percentage */
public void setPercent (BigDecimal Percent)
{
if (Percent == null) throw new IllegalArgumentException ("Percent is mandatory.");
set_Value (COLUMNNAME_Percent, Percent);
}
/** Get Percent.
@return Percentage */
public BigDecimal getPercent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1c468783-ba0c-4fd4-9dc6-a3cd85c89b15")
public static String es_PE_COLUMN_Percent_Name="Percent";

@XendraColumn(AD_Element_ID="a70b0c31-700a-d879-f313-b31531c93f04",ColumnName="Percent",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c468783-ba0c-4fd4-9dc6-a3cd85c89b15",
Synchronized="2017-08-05 16:52:51.0")
/** Column name Percent */
public static final String COLUMNNAME_Percent = "Percent";
/** Set shares.
@param shares shares */
public void setshares (BigDecimal shares)
{
if (shares == null) throw new IllegalArgumentException ("shares is mandatory.");
set_Value (COLUMNNAME_shares, shares);
}
/** Get shares.
@return shares */
public BigDecimal getshares() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_shares);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1d2faa29-b4cc-4bbf-922c-5ced018dda4f")
public static String es_PE_COLUMN_shares_Name="shares";

@XendraColumn(AD_Element_ID="6293fb23-729e-4191-8ba0-9cc949724021",ColumnName="shares",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d2faa29-b4cc-4bbf-922c-5ced018dda4f",
Synchronized="2017-08-05 16:52:51.0")
/** Column name shares */
public static final String COLUMNNAME_shares = "shares";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 2)
{
log.warning("Length > 2 - truncated");
TaxID = TaxID.substring(0,1);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e90ca8f4-b6b6-427f-9f70-2991c9c9cbd5")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e90ca8f4-b6b6-427f-9f70-2991c9c9cbd5",
Synchronized="2017-08-05 16:52:51.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="55b2cc53-0747-4f08-b008-5140fb6ae5cb")
public static String es_PE_COLUMN_ValidFrom_Name="Valid from";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55b2cc53-0747-4f08-b008-5140fb6ae5cb",
Synchronized="2017-08-05 16:52:51.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="21bf848b-3aa2-47f1-bffc-bb403d0461c6")
public static String es_PE_COLUMN_ValidTo_Name="Valid to";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21bf848b-3aa2-47f1-bffc-bb403d0461c6",
Synchronized="2017-08-05 16:52:51.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
