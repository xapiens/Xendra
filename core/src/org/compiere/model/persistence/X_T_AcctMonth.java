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
import org.compiere.model.reference.REF__PostingType;
/** Generated Model for T_AcctMonth
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_AcctMonth extends PO
{
/** Standard Constructor
@param ctx context
@param T_AcctMonth_ID id
@param trxName transaction
*/
public X_T_AcctMonth (Properties ctx, int T_AcctMonth_ID, String trxName)
{
super (ctx, T_AcctMonth_ID, trxName);
/** if (T_AcctMonth_ID == 0)
{
setIsSubTotal (false);	
// N
setIsVisible (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_AcctMonth (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000014 */
public static int Table_ID=MTable.getTable_ID("T_AcctMonth");

@XendraTrl(Identifier="2131373d-fe1e-c459-6a9d-3f5839ae4768")
public static String es_PE_TABLE_T_AcctMonth_Name="T_AcctMonth";

@XendraTable(Name="T_AcctMonth",Description="",Help="",TableName="T_AcctMonth",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="2131373d-fe1e-c459-6a9d-3f5839ae4768",Synchronized="2017-08-16 11:44:17.0")
/** TableName=T_AcctMonth */
public static final String Table_Name="T_AcctMonth";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_AcctMonth");

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
    Table_ID = MTable.getTable_ID("T_AcctMonth");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_AcctMonth[").append(get_ID()).append("]");
return sb.toString();
}
/** Set accountlevel.
@param accountlevel accountlevel */
public void setaccountlevel (BigDecimal accountlevel)
{
set_Value (COLUMNNAME_accountlevel, accountlevel);
}
/** Get accountlevel.
@return accountlevel */
public BigDecimal getaccountlevel() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_accountlevel);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1f9f8832-8c6b-e7de-4c91-360cec3f6a00")
public static String es_PE_COLUMN_accountlevel_Name="accountlevel";

@XendraColumn(AD_Element_ID="9a1d8306-84ba-bc0c-c619-9932843bae56",ColumnName="accountlevel",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f9f8832-8c6b-e7de-4c91-360cec3f6a00",
Synchronized="2017-08-05 16:56:22.0")
/** Column name accountlevel */
public static final String COLUMNNAME_accountlevel = "accountlevel";
/** Set account_level.
@param account_level account_level */
public void setaccount_level (BigDecimal account_level)
{
set_Value (COLUMNNAME_account_level, account_level);
}
/** Get account_level.
@return account_level */
public BigDecimal getaccount_level() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_account_level);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ab1baa40-fc15-aef8-ef2f-a140b95463c0")
public static String es_PE_COLUMN_account_level_Name="account_level";

@XendraColumn(AD_Element_ID="1cc07b61-927d-3d53-4a43-8af5ae2a4070",ColumnName="account_level",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab1baa40-fc15-aef8-ef2f-a140b95463c0",
Synchronized="2017-08-05 16:56:22.0")
/** Column name account_level */
public static final String COLUMNNAME_account_level = "account_level";
/** Set AccountParent.
@param AccountParent AccountParent */
public void setAccountParent (int AccountParent)
{
set_Value (COLUMNNAME_AccountParent, Integer.valueOf(AccountParent));
}
/** Get AccountParent.
@return AccountParent */
public int getAccountParent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AccountParent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4f75a2d5-04a3-4fa9-9619-1cbccf50b0f8")
public static String es_PE_COLUMN_AccountParent_Name="accountparent";

@XendraColumn(AD_Element_ID="345020f4-0cb5-e294-5e83-7a4c398d132a",ColumnName="AccountParent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f75a2d5-04a3-4fa9-9619-1cbccf50b0f8",
Synchronized="2017-08-05 16:56:22.0")
/** Column name AccountParent */
public static final String COLUMNNAME_AccountParent = "AccountParent";
/** Set Account Key.
@param AccountValue Key of Account Element */
public void setAccountValue (String AccountValue)
{
if (AccountValue != null && AccountValue.length() > 40)
{
log.warning("Length > 40 - truncated");
AccountValue = AccountValue.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_AccountValue, AccountValue);
}
/** Get Account Key.
@return Key of Account Element */
public String getAccountValue() 
{
String value = (String)get_Value(COLUMNNAME_AccountValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b9bb9f8c-980c-9a60-5759-75a0cd40e80c")
public static String es_PE_COLUMN_AccountValue_Name="Clave de Cuenta";

@XendraColumn(AD_Element_ID="8aef172c-9686-33af-fb2b-dfa839316024",ColumnName="AccountValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9bb9f8c-980c-9a60-5759-75a0cd40e80c",
Synchronized="2017-08-05 16:56:22.0")
/** Column name AccountValue */
public static final String COLUMNNAME_AccountValue = "AccountValue";
/** Set AcountLevel.
@param AcountLevel AcountLevel */
public void setAcountLevel (BigDecimal AcountLevel)
{
set_Value (COLUMNNAME_AcountLevel, AcountLevel);
}
/** Get AcountLevel.
@return AcountLevel */
public BigDecimal getAcountLevel() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AcountLevel);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7188fe9f-7411-3ac3-0fb0-105244adf980")
public static String es_PE_COLUMN_AcountLevel_Name="accountlevel";

@XendraColumn(AD_Element_ID="00022f59-1777-0ac3-f4f8-31c45c0303b2",ColumnName="AcountLevel",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7188fe9f-7411-3ac3-0fb0-105244adf980",
Synchronized="2017-08-05 16:56:22.0")
/** Column name AcountLevel */
public static final String COLUMNNAME_AcountLevel = "AcountLevel";
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ca502d16-aa01-64de-fd3d-5db3680d7f7c")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca502d16-aa01-64de-fd3d-5db3680d7f7c",
Synchronized="2017-08-05 16:56:22.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Amt_April.
@param Amt_April Amount */
public void setAmt_April (BigDecimal Amt_April)
{
set_ValueNoCheck (COLUMNNAME_Amt_April, Amt_April);
}
/** Get Amt_April.
@return Amount */
public BigDecimal getAmt_April() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_April);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0228d7ea-5b73-8195-1332-667d7c4052a3")
public static String es_PE_COLUMN_Amt_April_Name="Total";

@XendraColumn(AD_Element_ID="0b93560f-f94f-cbc1-d7c8-a6139ccb63f0",ColumnName="Amt_April",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0228d7ea-5b73-8195-1332-667d7c4052a3",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_April */
public static final String COLUMNNAME_Amt_April = "Amt_April";
/** Set Amt_August.
@param Amt_August Amount */
public void setAmt_August (BigDecimal Amt_August)
{
set_ValueNoCheck (COLUMNNAME_Amt_August, Amt_August);
}
/** Get Amt_August.
@return Amount */
public BigDecimal getAmt_August() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_August);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5b0612df-1da6-9662-59d2-b351460aa4ee")
public static String es_PE_COLUMN_Amt_August_Name="Total";

@XendraColumn(AD_Element_ID="7a06e4a4-c1d6-45b9-bcd9-812f4016b7ea",ColumnName="Amt_August",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b0612df-1da6-9662-59d2-b351460aa4ee",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_August */
public static final String COLUMNNAME_Amt_August = "Amt_August";
/** Set Amt_December.
@param Amt_December Amount */
public void setAmt_December (BigDecimal Amt_December)
{
set_ValueNoCheck (COLUMNNAME_Amt_December, Amt_December);
}
/** Get Amt_December.
@return Amount */
public BigDecimal getAmt_December() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_December);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4e981a8e-ca13-119a-0922-6c447496a4ad")
public static String es_PE_COLUMN_Amt_December_Name="Total";

@XendraColumn(AD_Element_ID="00055fe8-c96f-fbc4-4adb-26058f7cdff6",ColumnName="Amt_December",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e981a8e-ca13-119a-0922-6c447496a4ad",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_December */
public static final String COLUMNNAME_Amt_December = "Amt_December";
/** Set Amt_February.
@param Amt_February Amount */
public void setAmt_February (BigDecimal Amt_February)
{
set_ValueNoCheck (COLUMNNAME_Amt_February, Amt_February);
}
/** Get Amt_February.
@return Amount */
public BigDecimal getAmt_February() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_February);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7554593a-09a8-6aee-5cfb-e32368c916ee")
public static String es_PE_COLUMN_Amt_February_Name="Total";

@XendraColumn(AD_Element_ID="67df93b0-e1ff-b82b-bb70-a4e11d73cf44",ColumnName="Amt_February",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7554593a-09a8-6aee-5cfb-e32368c916ee",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_February */
public static final String COLUMNNAME_Amt_February = "Amt_February";
/** Set Amt_January.
@param Amt_January Amount */
public void setAmt_January (BigDecimal Amt_January)
{
set_ValueNoCheck (COLUMNNAME_Amt_January, Amt_January);
}
/** Get Amt_January.
@return Amount */
public BigDecimal getAmt_January() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_January);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="09ff57ac-eb57-7f5e-c83f-979ed3d72ee5")
public static String es_PE_COLUMN_Amt_January_Name="Total";

@XendraColumn(AD_Element_ID="63b9d881-c17e-2826-a7d3-76d22923559e",ColumnName="Amt_January",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09ff57ac-eb57-7f5e-c83f-979ed3d72ee5",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_January */
public static final String COLUMNNAME_Amt_January = "Amt_January";
/** Set Amt_July.
@param Amt_July Amount */
public void setAmt_July (BigDecimal Amt_July)
{
set_ValueNoCheck (COLUMNNAME_Amt_July, Amt_July);
}
/** Get Amt_July.
@return Amount */
public BigDecimal getAmt_July() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_July);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e807fa13-9c83-3800-e9a2-1224f54b2b94")
public static String es_PE_COLUMN_Amt_July_Name="Total";

@XendraColumn(AD_Element_ID="b7714b14-1fe3-9b6e-9ca2-4f61e13aa388",ColumnName="Amt_July",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e807fa13-9c83-3800-e9a2-1224f54b2b94",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_July */
public static final String COLUMNNAME_Amt_July = "Amt_July";
/** Set Amt_June.
@param Amt_June Amount */
public void setAmt_June (BigDecimal Amt_June)
{
set_ValueNoCheck (COLUMNNAME_Amt_June, Amt_June);
}
/** Get Amt_June.
@return Amount */
public BigDecimal getAmt_June() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_June);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dc38ca4c-897e-20d7-2ec0-449662d4dd87")
public static String es_PE_COLUMN_Amt_June_Name="Total";

@XendraColumn(AD_Element_ID="fddff548-fc6d-2d64-f2b2-6c26b1d20f5e",ColumnName="Amt_June",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc38ca4c-897e-20d7-2ec0-449662d4dd87",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_June */
public static final String COLUMNNAME_Amt_June = "Amt_June";
/** Set Amt_March.
@param Amt_March Amount */
public void setAmt_March (BigDecimal Amt_March)
{
set_ValueNoCheck (COLUMNNAME_Amt_March, Amt_March);
}
/** Get Amt_March.
@return Amount */
public BigDecimal getAmt_March() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_March);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="56cf4e66-d7ef-fd69-692e-364d26a00bd5")
public static String es_PE_COLUMN_Amt_March_Name="Total";

@XendraColumn(AD_Element_ID="5a087822-1090-1314-6bd0-39409855a94c",ColumnName="Amt_March",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56cf4e66-d7ef-fd69-692e-364d26a00bd5",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_March */
public static final String COLUMNNAME_Amt_March = "Amt_March";
/** Set Amt_May.
@param Amt_May Amount */
public void setAmt_May (BigDecimal Amt_May)
{
set_ValueNoCheck (COLUMNNAME_Amt_May, Amt_May);
}
/** Get Amt_May.
@return Amount */
public BigDecimal getAmt_May() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_May);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fa03b595-7036-df05-06d5-243bc1a9c3ec")
public static String es_PE_COLUMN_Amt_May_Name="Total";

@XendraColumn(AD_Element_ID="bfd40fca-616b-cab6-a5e2-b5b5a88b2b23",ColumnName="Amt_May",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa03b595-7036-df05-06d5-243bc1a9c3ec",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_May */
public static final String COLUMNNAME_Amt_May = "Amt_May";
/** Set Amt_November.
@param Amt_November Amount */
public void setAmt_November (BigDecimal Amt_November)
{
set_ValueNoCheck (COLUMNNAME_Amt_November, Amt_November);
}
/** Get Amt_November.
@return Amount */
public BigDecimal getAmt_November() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_November);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c8baa931-3f50-c3d5-f781-a0d00dee219c")
public static String es_PE_COLUMN_Amt_November_Name="Total";

@XendraColumn(AD_Element_ID="11e6d7d9-26ee-7536-a20b-83fd7beec22a",ColumnName="Amt_November",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8baa931-3f50-c3d5-f781-a0d00dee219c",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_November */
public static final String COLUMNNAME_Amt_November = "Amt_November";
/** Set Amt_October.
@param Amt_October Amount */
public void setAmt_October (BigDecimal Amt_October)
{
set_ValueNoCheck (COLUMNNAME_Amt_October, Amt_October);
}
/** Get Amt_October.
@return Amount */
public BigDecimal getAmt_October() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_October);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6d0f1bf3-427f-d1d3-1a56-8915a531477c")
public static String es_PE_COLUMN_Amt_October_Name="Total";

@XendraColumn(AD_Element_ID="507ee3bf-3a2c-dfcd-fc5a-7ce7d7d19b3e",ColumnName="Amt_October",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d0f1bf3-427f-d1d3-1a56-8915a531477c",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_October */
public static final String COLUMNNAME_Amt_October = "Amt_October";
/** Set Amt_September.
@param Amt_September Amount */
public void setAmt_September (BigDecimal Amt_September)
{
set_ValueNoCheck (COLUMNNAME_Amt_September, Amt_September);
}
/** Get Amt_September.
@return Amount */
public BigDecimal getAmt_September() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt_September);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8f987287-2a3d-9ab9-d2c3-6f3c7affead7")
public static String es_PE_COLUMN_Amt_September_Name="Total";

@XendraColumn(AD_Element_ID="567ff03e-73e5-d598-3d2c-5cfdc18b428e",ColumnName="Amt_September",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f987287-2a3d-9ab9-d2c3-6f3c7affead7",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Amt_September */
public static final String COLUMNNAME_Amt_September = "Amt_September";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="26fbf539-604b-d924-a99e-6fff1845077a")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26fbf539-604b-d924-a99e-6fff1845077a",
Synchronized="2017-08-05 16:56:22.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID <= 0) set_Value (COLUMNNAME_C_ElementValue_ID, null);
 else 
set_Value (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="239ada51-4a95-8b0e-ac0c-3e8ec4b6e45c")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="239ada51-4a95-8b0e-ac0c-3e8ec4b6e45c",
Synchronized="2017-08-05 16:56:22.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_ValueNoCheck (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="19e17884-7336-6071-a6e4-a8af4aa7b373")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19e17884-7336-6071-a6e4-a8af4aa7b373",
Synchronized="2017-08-05 16:56:22.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Is Only movement account.
@param IsOnlyMovementAccount Is Only movement account */
public void setIsOnlyMovementAccount (boolean IsOnlyMovementAccount)
{
set_Value (COLUMNNAME_IsOnlyMovementAccount, Boolean.valueOf(IsOnlyMovementAccount));
}
/** Get Is Only movement account.
@return Is Only movement account */
public boolean isOnlyMovementAccount() 
{
Object oo = get_Value(COLUMNNAME_IsOnlyMovementAccount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="657f7cd2-4042-d365-c450-bdae51c06ed1")
public static String es_PE_COLUMN_IsOnlyMovementAccount_Name="Is Only movement account";

@XendraColumn(AD_Element_ID="1c5874ee-1754-a310-012d-a2fb189988c4",
ColumnName="IsOnlyMovementAccount",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="657f7cd2-4042-d365-c450-bdae51c06ed1",Synchronized="2017-08-05 16:56:22.0")
/** Column name IsOnlyMovementAccount */
public static final String COLUMNNAME_IsOnlyMovementAccount = "IsOnlyMovementAccount";
/** Set IsSubTotal.
@param IsSubTotal IsSubTotal */
public void setIsSubTotal (boolean IsSubTotal)
{
set_Value (COLUMNNAME_IsSubTotal, Boolean.valueOf(IsSubTotal));
}
/** Get IsSubTotal.
@return IsSubTotal */
public boolean isSubTotal() 
{
Object oo = get_Value(COLUMNNAME_IsSubTotal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="dd0b05eb-f3bf-92e5-9c88-8c475e0eed99")
public static String es_PE_COLUMN_IsSubTotal_Name="issubtotal";

@XendraColumn(AD_Element_ID="d6829b53-7fed-bde8-bf2c-61b5d1d2abc9",ColumnName="IsSubTotal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd0b05eb-f3bf-92e5-9c88-8c475e0eed99",
Synchronized="2017-08-05 16:56:22.0")
/** Column name IsSubTotal */
public static final String COLUMNNAME_IsSubTotal = "IsSubTotal";
/** Set IsVisible.
@param IsVisible IsVisible */
public void setIsVisible (boolean IsVisible)
{
set_Value (COLUMNNAME_IsVisible, Boolean.valueOf(IsVisible));
}
/** Get IsVisible.
@return IsVisible */
public boolean isVisible() 
{
Object oo = get_Value(COLUMNNAME_IsVisible);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="81458b6b-1904-53b1-c838-4ca41d4275a2")
public static String es_PE_COLUMN_IsVisible_Name="isvisible";

@XendraColumn(AD_Element_ID="d5755b76-7c48-2932-e64a-ac8e7bfa27c9",ColumnName="IsVisible",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81458b6b-1904-53b1-c838-4ca41d4275a2",
Synchronized="2017-08-05 16:56:22.0")
/** Column name IsVisible */
public static final String COLUMNNAME_IsVisible = "IsVisible";

/** PostingType AD_Reference=1ad48d23-2ec9-09d0-cb68-38688c5e6ce0 */
public static final int POSTINGTYPE_AD_Reference_ID=125;
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType == null || PostingType.equals(REF__PostingType.Actual) || PostingType.equals(REF__PostingType.Budget) || PostingType.equals(REF__PostingType.Commitment) || PostingType.equals(REF__PostingType.Statistical) || PostingType.equals(REF__PostingType.Reservation));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - S - R");
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="d083de48-596a-4b92-3d53-565a62cd996e")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d083de48-596a-4b92-3d53-565a62cd996e",Synchronized="2017-08-05 16:56:22.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
/** Set Value To.
@param Value2 Value To */
public void setValue2 (String Value2)
{
if (Value2 != null && Value2.length() > 40)
{
log.warning("Length > 40 - truncated");
Value2 = Value2.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_Value2, Value2);
}
/** Get Value To.
@return Value To */
public String getValue2() 
{
String value = (String)get_Value(COLUMNNAME_Value2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a2ec4221-da09-09d6-f29a-14e1c26407d0")
public static String es_PE_COLUMN_Value2_Name="Valor 2";

@XendraColumn(AD_Element_ID="c379d4ac-5a2f-a060-da28-03c993b2743e",ColumnName="Value2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2ec4221-da09-09d6-f29a-14e1c26407d0",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Value2 */
public static final String COLUMNNAME_Value2 = "Value2";
/** Set Year.
@param Year Year */
public void setYear (BigDecimal Year)
{
set_Value (COLUMNNAME_Year, Year);
}
/** Get Year.
@return Year */
public BigDecimal getYear() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Year);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="16793cf6-e3d9-3ebd-92b6-97a95013fc17")
public static String es_PE_COLUMN_Year_Name="Year";

@XendraColumn(AD_Element_ID="0ce52c08-62db-d534-5010-e9f953ebb870",ColumnName="Year",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16793cf6-e3d9-3ebd-92b6-97a95013fc17",
Synchronized="2017-08-05 16:56:22.0")
/** Column name Year */
public static final String COLUMNNAME_Year = "Year";
}
