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
/** Generated Model for T_AcctOrg
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_AcctOrg extends PO
{
/** Standard Constructor
@param ctx context
@param T_AcctOrg_ID id
@param trxName transaction
*/
public X_T_AcctOrg (Properties ctx, int T_AcctOrg_ID, String trxName)
{
super (ctx, T_AcctOrg_ID, trxName);
/** if (T_AcctOrg_ID == 0)
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
public X_T_AcctOrg (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000019 */
public static int Table_ID=MTable.getTable_ID("T_AcctOrg");

@XendraTrl(Identifier="c1acb66f-2a5d-bd35-75b1-678b481b13a6")
public static String es_PE_TABLE_T_AcctOrg_Name="T_AcctOrg";

@XendraTable(Name="T_AcctOrg",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="T_AcctOrg",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.standard",Identifier="c1acb66f-2a5d-bd35-75b1-678b481b13a6",
Synchronized="2020-03-03 21:40:17.0")
/** TableName=T_AcctOrg */
public static final String Table_Name="T_AcctOrg";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_AcctOrg");

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
    Table_ID = MTable.getTable_ID("T_AcctOrg");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_AcctOrg[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ca2e9fcb-5018-ecfb-31e5-fc34a13445b8")
public static String es_PE_COLUMN_accountlevel_Name="accountlevel";

@XendraColumn(AD_Element_ID="9a1d8306-84ba-bc0c-c619-9932843bae56",ColumnName="accountlevel",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca2e9fcb-5018-ecfb-31e5-fc34a13445b8",
Synchronized="2019-08-30 22:24:19.0")
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

@XendraTrl(Identifier="5f8474a5-6a05-0b38-93ea-a910a7cc1da1")
public static String es_PE_COLUMN_account_level_Name="account_level";

@XendraColumn(AD_Element_ID="1cc07b61-927d-3d53-4a43-8af5ae2a4070",ColumnName="account_level",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f8474a5-6a05-0b38-93ea-a910a7cc1da1",
Synchronized="2019-08-30 22:24:19.0")
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

@XendraTrl(Identifier="0e5e8bb0-c9bd-6424-4f0d-ebbc5f63db1a")
public static String es_PE_COLUMN_AccountParent_Name="accountparent";

@XendraColumn(AD_Element_ID="345020f4-0cb5-e294-5e83-7a4c398d132a",ColumnName="AccountParent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e5e8bb0-c9bd-6424-4f0d-ebbc5f63db1a",
Synchronized="2019-08-30 22:24:19.0")
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
set_Value (COLUMNNAME_AccountValue, AccountValue);
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
@XendraTrl(Identifier="f087524a-109b-cf7e-5214-5f69f07a3f67")
public static String es_PE_COLUMN_AccountValue_Name="Clave de Cuenta";

@XendraColumn(AD_Element_ID="8aef172c-9686-33af-fb2b-dfa839316024",ColumnName="AccountValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f087524a-109b-cf7e-5214-5f69f07a3f67",
Synchronized="2019-08-30 22:24:19.0")
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

@XendraTrl(Identifier="f2a98548-584c-11e9-62cb-665cbd253f4e")
public static String es_PE_COLUMN_AcountLevel_Name="accountlevel";

@XendraColumn(AD_Element_ID="00022f59-1777-0ac3-f4f8-31c45c0303b2",ColumnName="AcountLevel",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2a98548-584c-11e9-62cb-665cbd253f4e",
Synchronized="2019-08-30 22:24:19.0")
/** Column name AcountLevel */
public static final String COLUMNNAME_AcountLevel = "AcountLevel";
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID <= 0) set_Value (COLUMNNAME_AD_PInstance_ID, null);
 else 
set_Value (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6be55a5-067f-6a7c-6c0c-f3417298a8c6")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6be55a5-067f-6a7c-6c0c-f3417298a8c6",
Synchronized="2019-08-30 22:24:19.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Accounted Amount.
@param AmtAcct Amount Balance in Currency of Accounting Schema */
public void setAmtAcct (BigDecimal AmtAcct)
{
set_Value (COLUMNNAME_AmtAcct, AmtAcct);
}
/** Get Accounted Amount.
@return Amount Balance in Currency of Accounting Schema */
public BigDecimal getAmtAcct() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcct);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="867bd6a1-26c2-6f9e-d089-918e832a53d6")
public static String es_PE_COLUMN_AmtAcct_Name="Importe Contable";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="867bd6a1-26c2-6f9e-d089-918e832a53d6",
Synchronized="2019-08-30 22:24:19.0")
/** Column name AmtAcct */
public static final String COLUMNNAME_AmtAcct = "AmtAcct";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID <= 0) set_Value (COLUMNNAME_C_AcctSchema_ID, null);
 else 
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="45bfbc70-cafc-4fdc-6f27-2bcf248cffa4")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45bfbc70-cafc-4fdc-6f27-2bcf248cffa4",
Synchronized="2019-08-30 22:24:19.0")
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

@XendraTrl(Identifier="908f475e-13e2-5ae6-a160-dc3b07551a82")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="908f475e-13e2-5ae6-a160-dc3b07551a82",
Synchronized="2019-08-30 22:24:19.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="6409235f-016a-eb91-cdd0-6fc7abee64f7")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6409235f-016a-eb91-cdd0-6fc7abee64f7",
Synchronized="2019-08-30 22:24:19.0")
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

@XendraTrl(Identifier="ebeebfea-caa4-5641-2881-f9bdca407571")
public static String es_PE_COLUMN_IsOnlyMovementAccount_Name="Is Only movement account";

@XendraColumn(AD_Element_ID="1c5874ee-1754-a310-012d-a2fb189988c4",
ColumnName="IsOnlyMovementAccount",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ebeebfea-caa4-5641-2881-f9bdca407571",Synchronized="2019-08-30 22:24:19.0")
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

@XendraTrl(Identifier="6d0c5efd-8494-3136-2910-b1fd8452fec0")
public static String es_PE_COLUMN_IsSubTotal_Name="issubtotal";

@XendraColumn(AD_Element_ID="d6829b53-7fed-bde8-bf2c-61b5d1d2abc9",ColumnName="IsSubTotal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d0c5efd-8494-3136-2910-b1fd8452fec0",
Synchronized="2019-08-30 22:24:19.0")
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

@XendraTrl(Identifier="819fbf0c-f133-d223-991a-eb408492e0c2")
public static String es_PE_COLUMN_IsVisible_Name="isvisible";

@XendraColumn(AD_Element_ID="d5755b76-7c48-2932-e64a-ac8e7bfa27c9",ColumnName="IsVisible",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="819fbf0c-f133-d223-991a-eb408492e0c2",
Synchronized="2019-08-30 22:24:19.0")
/** Column name IsVisible */
public static final String COLUMNNAME_IsVisible = "IsVisible";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="c5c72d6b-f57c-d75d-7b0d-0a126ed12df9")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c5c72d6b-f57c-d75d-7b0d-0a126ed12df9",Synchronized="2019-08-30 22:24:19.0")
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
set_Value (COLUMNNAME_Value2, Value2);
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
@XendraTrl(Identifier="1e0f3391-2944-4fe2-2b82-66fe65388aab")
public static String es_PE_COLUMN_Value2_Name="Valor 2";

@XendraColumn(AD_Element_ID="c379d4ac-5a2f-a060-da28-03c993b2743e",ColumnName="Value2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e0f3391-2944-4fe2-2b82-66fe65388aab",
Synchronized="2019-08-30 22:24:19.0")
/** Column name Value2 */
public static final String COLUMNNAME_Value2 = "Value2";
}
