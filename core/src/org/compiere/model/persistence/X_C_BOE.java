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
/** Generated Model for C_BOE
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BOE extends PO
{
/** Standard Constructor
@param ctx context
@param C_BOE_ID id
@param trxName transaction
*/
public X_C_BOE (Properties ctx, int C_BOE_ID, String trxName)
{
super (ctx, C_BOE_ID, trxName);
/** if (C_BOE_ID == 0)
{
setC_BOE_ID (0);
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_Currency_ID (0);	
// @C_Currency_ID@
setC_DocType_ID (0);	
// 0
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setDueDate (new Timestamp(System.currentTimeMillis()));
setGrandTotal (Env.ZERO);	
// 0
setIsPaid (false);	
// 'N'
setIsSOTrx (true);	
// 'Y'
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BOE (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000068 */
public static int Table_ID=MTable.getTable_ID("C_BOE");

@XendraTrl(Identifier="08fa5cb7-1686-fd97-02a3-40a95c0a9f71")
public static String es_PE_TAB_BillOfExchange_Name="Letra de Cambio";

@XendraTab(Name="Bill of Exchange",Description="",Help="",
AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="IsSOTrx='Y'",OrderByClause="",CommitWarning="",
AD_Process_ID="19e33000-49e9-4f96-eaa0-6ba07009cb8a",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchange="08fa5cb7-1686-fd97-02a3-40a95c0a9f71";

@XendraTrl(Identifier="95518bce-3f58-2ff6-f429-a42c368af61f")
public static String es_PE_TAB_BillOfExchangeRenovation_Name="Renovación";

@XendraTab(Name="Bill of Exchange Renovation",Description="",Help="",
AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",SeqNo=40,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="C_BOE.Ref_BOE_ID = @C_BOE_ID@",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="95518bce-3f58-2ff6-f429-a42c368af61f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchangeRenovation="95518bce-3f58-2ff6-f429-a42c368af61f";

@XendraTrl(Identifier="7e533a05-b5fd-2f7f-dd16-c8714f147b90")
public static String es_PE_TAB_BillOfExchange2_Name="Letra de Cambio";

@XendraTab(Name="Bill of Exchange",Description="",Help="",
AD_Window_ID="8f6df5bf-4121-5ea0-797c-32487bcbbea9",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="IsSOTrx='N'",OrderByClause="",CommitWarning="",
AD_Process_ID="19e33000-49e9-4f96-eaa0-6ba07009cb8a",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7e533a05-b5fd-2f7f-dd16-c8714f147b90",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchange2="7e533a05-b5fd-2f7f-dd16-c8714f147b90";

@XendraTrl(Identifier="4e4addcb-330a-72a0-01ef-ad4002f26e77")
public static String es_PE_TABLE_C_BOE_Name="Letra de Cambio";

@XendraTable(Name="Bill Of Exchange",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Bill Of Exchange",Help="",
TableName="C_BOE",AccessLevel="3",AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="8f6df5bf-4121-5ea0-797c-32487bcbbea9",
ID="org.xendra.commercial",Identifier="4e4addcb-330a-72a0-01ef-ad4002f26e77",
Synchronized="2020-03-03 21:36:29.0")
/** TableName=C_BOE */
public static final String Table_Name="C_BOE";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BOE");

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
    Table_ID = MTable.getTable_ID("C_BOE");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BOE[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bill Of Exchange No of bank.
@param BOENo Number of the Bill Of Exchange */
public void setBOENo (String BOENo)
{
if (BOENo != null && BOENo.length() > 30)
{
log.warning("Length > 30 - truncated");
BOENo = BOENo.substring(0,29);
}
set_Value (COLUMNNAME_BOENo, BOENo);
}
/** Get Bill Of Exchange No of bank.
@return Number of the Bill Of Exchange */
public String getBOENo() 
{
String value = (String)get_Value(COLUMNNAME_BOENo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b5d50a97-5598-195d-3d1f-a457b8c75e0a")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank_Name="No de Letra Banco";

@XendraTrl(Identifier="b5d50a97-5598-195d-3d1f-a457b8c75e0a")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank_Description="Numero de Letra de cambio asignado por el Banco aceptante";

@XendraTrl(Identifier="b5d50a97-5598-195d-3d1f-a457b8c75e0a")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank_Help="Este es el número que el banco asigna a nuestra letra, en el momento que nos la acepta";

@XendraField(AD_Column_ID="BOENo",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="@DocStatus@='DS' | @DocStatus@='RV' | @DocStatus@='WR'",DisplayLength=20,
IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5d50a97-5598-195d-3d1f-a457b8c75e0a")
public static final String FIELDNAME_BillOfExchange_BillOfExchangeNoOfBank="b5d50a97-5598-195d-3d1f-a457b8c75e0a";

@XendraTrl(Identifier="da89dbc3-05ca-2944-0daa-6f7c98898b7d")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank2_Name="No de Letra Bco";

@XendraTrl(Identifier="da89dbc3-05ca-2944-0daa-6f7c98898b7d")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank2_Description="Numero de Letra de cambio asignado por el Banco aceptante";

@XendraTrl(Identifier="da89dbc3-05ca-2944-0daa-6f7c98898b7d")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank2_Help="Este es el número que el banco asigna a nuestra letra, en el momento que nos la acepta";

@XendraField(AD_Column_ID="BOENo",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="@DocStatus@='DS' | @DocStatus@='RV' | @DocStatus@='WR'",DisplayLength=30,
IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da89dbc3-05ca-2944-0daa-6f7c98898b7d")
public static final String FIELDNAME_BillOfExchange_BillOfExchangeNoOfBank2="da89dbc3-05ca-2944-0daa-6f7c98898b7d";

@XendraTrl(Identifier="c4dadb2f-5631-ad95-8f0b-7e473e1c5e88")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchangeNoOfBank_Name="No de Letra Bco";

@XendraTrl(Identifier="c4dadb2f-5631-ad95-8f0b-7e473e1c5e88")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchangeNoOfBank_Description="Numero de Letra de cambio asignado por el Banco aceptante";

@XendraTrl(Identifier="c4dadb2f-5631-ad95-8f0b-7e473e1c5e88")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchangeNoOfBank_Help="Este es el número que el banco asigna a nuestra letra, en el momento que nos la acepta";

@XendraField(AD_Column_ID="BOENo",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4dadb2f-5631-ad95-8f0b-7e473e1c5e88")
public static final String FIELDNAME_BillOfExchangeRenovation_BillOfExchangeNoOfBank="c4dadb2f-5631-ad95-8f0b-7e473e1c5e88";

@XendraTrl(Identifier="5f88355c-613c-a3f8-ac49-2eb3ce492441")
public static String es_PE_COLUMN_BOENo_Name="No de Letra Bco";

@XendraColumn(AD_Element_ID="091eac4c-3fde-7aa3-8516-77e9681245bb",ColumnName="BOENo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f88355c-613c-a3f8-ac49-2eb3ce492441",
Synchronized="2019-08-30 22:21:05.0")
/** Column name BOENo */
public static final String COLUMNNAME_BOENo = "BOENo";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID <= 0) set_Value (COLUMNNAME_C_BankAccount_ID, null);
 else 
set_Value (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
}
/** Get Bank Account.
@return Account at the Bank */
public int getC_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="87e2ee7f-2987-c2f6-9527-d3ff941367ca")
public static String es_PE_FIELD_BillOfExchange_BankAccount_Name="Cuenta Bancaria";

@XendraTrl(Identifier="87e2ee7f-2987-c2f6-9527-d3ff941367ca")
public static String es_PE_FIELD_BillOfExchange_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="87e2ee7f-2987-c2f6-9527-d3ff941367ca")
public static String es_PE_FIELD_BillOfExchange_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="@DocStatus@='DS' | @DocStatus@='RV' | @DocStatus@='WR'",DisplayLength=20,
IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87e2ee7f-2987-c2f6-9527-d3ff941367ca")
public static final String FIELDNAME_BillOfExchange_BankAccount="87e2ee7f-2987-c2f6-9527-d3ff941367ca";

@XendraTrl(Identifier="10eaa2d9-613e-aadd-8324-9f7dbdb8e815")
public static String es_PE_FIELD_BillOfExchange_BankAccount2_Name="Cuenta Bancaria";

@XendraTrl(Identifier="10eaa2d9-613e-aadd-8324-9f7dbdb8e815")
public static String es_PE_FIELD_BillOfExchange_BankAccount2_Description="Cuenta bancaria";

@XendraTrl(Identifier="10eaa2d9-613e-aadd-8324-9f7dbdb8e815")
public static String es_PE_FIELD_BillOfExchange_BankAccount2_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="@DocStatus@='DS' | @DocStatus@='RV' | @DocStatus@='WR'",DisplayLength=22,
IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,
Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10eaa2d9-613e-aadd-8324-9f7dbdb8e815")
public static final String FIELDNAME_BillOfExchange_BankAccount2="10eaa2d9-613e-aadd-8324-9f7dbdb8e815";

@XendraTrl(Identifier="8dc58d3b-a7c0-5a42-e283-b636c9465f6c")
public static String es_PE_FIELD_BillOfExchangeRenovation_BankAccount_Name="Cuenta Bancaria";

@XendraTrl(Identifier="8dc58d3b-a7c0-5a42-e283-b636c9465f6c")
public static String es_PE_FIELD_BillOfExchangeRenovation_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="8dc58d3b-a7c0-5a42-e283-b636c9465f6c")
public static String es_PE_FIELD_BillOfExchangeRenovation_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dc58d3b-a7c0-5a42-e283-b636c9465f6c")
public static final String FIELDNAME_BillOfExchangeRenovation_BankAccount="8dc58d3b-a7c0-5a42-e283-b636c9465f6c";

@XendraTrl(Identifier="f137688b-3301-b2e7-ffc3-e231d8dcb3cc")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f137688b-3301-b2e7-ffc3-e231d8dcb3cc",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set C_BOEConfirm_ID.
@param C_BOEConfirm_ID C_BOEConfirm_ID */
public void setC_BOEConfirm_ID (int C_BOEConfirm_ID)
{
if (C_BOEConfirm_ID <= 0) set_Value (COLUMNNAME_C_BOEConfirm_ID, null);
 else 
set_Value (COLUMNNAME_C_BOEConfirm_ID, Integer.valueOf(C_BOEConfirm_ID));
}
/** Get C_BOEConfirm_ID.
@return C_BOEConfirm_ID */
public int getC_BOEConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="251db308-b656-b036-01eb-c2e8a8049086")
public static String es_PE_FIELD_BillOfExchange_C_BOEConfirm_ID_Name="c_boeconfirm_id";

@XendraField(AD_Column_ID="C_BOEConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="251db308-b656-b036-01eb-c2e8a8049086")
public static final String FIELDNAME_BillOfExchange_C_BOEConfirm_ID="251db308-b656-b036-01eb-c2e8a8049086";

@XendraTrl(Identifier="360aebf6-4ad6-1512-cb16-0f07ca3611f0")
public static String es_PE_FIELD_BillOfExchange_C_BOEConfirm_ID2_Name="c_boeconfirm_id";

@XendraField(AD_Column_ID="C_BOEConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="360aebf6-4ad6-1512-cb16-0f07ca3611f0")
public static final String FIELDNAME_BillOfExchange_C_BOEConfirm_ID2="360aebf6-4ad6-1512-cb16-0f07ca3611f0";

@XendraTrl(Identifier="0b941e69-00dd-5bfe-4aa4-aeb7f14a0e49")
public static String es_PE_FIELD_BillOfExchangeRenovation_C_BOEConfirm_ID_Name="c_boeconfirm_id";

@XendraField(AD_Column_ID="C_BOEConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b941e69-00dd-5bfe-4aa4-aeb7f14a0e49")
public static final String FIELDNAME_BillOfExchangeRenovation_C_BOEConfirm_ID="0b941e69-00dd-5bfe-4aa4-aeb7f14a0e49";

@XendraTrl(Identifier="851c2cb7-f7b7-8c64-3bd3-28c7c34953e5")
public static String es_PE_COLUMN_C_BOEConfirm_ID_Name="c_boeconfirm_id";

@XendraColumn(AD_Element_ID="1c623ee3-39bb-c6fc-297b-f7c03061acb4",ColumnName="C_BOEConfirm_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="851c2cb7-f7b7-8c64-3bd3-28c7c34953e5",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_BOEConfirm_ID */
public static final String COLUMNNAME_C_BOEConfirm_ID = "C_BOEConfirm_ID";
/** Set C_BOEGroup.
@param C_BOEGroup_ID C_BOEGroup */
public void setC_BOEGroup_ID (int C_BOEGroup_ID)
{
if (C_BOEGroup_ID <= 0) set_Value (COLUMNNAME_C_BOEGroup_ID, null);
 else 
set_Value (COLUMNNAME_C_BOEGroup_ID, Integer.valueOf(C_BOEGroup_ID));
}
/** Get C_BOEGroup.
@return C_BOEGroup */
public int getC_BOEGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0113cd32-ca31-b755-84a7-772a1f291961")
public static String es_PE_FIELD_BillOfExchange_C_BOEGroup_Name="Grupo Letra de Cambio";

@XendraField(AD_Column_ID="C_BOEGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0113cd32-ca31-b755-84a7-772a1f291961")
public static final String FIELDNAME_BillOfExchange_C_BOEGroup="0113cd32-ca31-b755-84a7-772a1f291961";

@XendraTrl(Identifier="43cd8b1d-5dea-8275-aacc-c6566dfaa6b9")
public static String es_PE_FIELD_BillOfExchange_C_BOEGroup2_Name="Grupo Letra";

@XendraField(AD_Column_ID="C_BOEGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43cd8b1d-5dea-8275-aacc-c6566dfaa6b9")
public static final String FIELDNAME_BillOfExchange_C_BOEGroup2="43cd8b1d-5dea-8275-aacc-c6566dfaa6b9";

@XendraTrl(Identifier="2e2cc68c-aa61-e033-95c5-51eb43335b7e")
public static String es_PE_FIELD_BillOfExchangeRenovation_C_BOEGroup_Name="C_BOEGroup";

@XendraField(AD_Column_ID="C_BOEGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e2cc68c-aa61-e033-95c5-51eb43335b7e")
public static final String FIELDNAME_BillOfExchangeRenovation_C_BOEGroup="2e2cc68c-aa61-e033-95c5-51eb43335b7e";

@XendraTrl(Identifier="50dbdc8a-7476-7b03-26be-7a520adf29a3")
public static String es_PE_COLUMN_C_BOEGroup_ID_Name="C_BOEGroup";

@XendraColumn(AD_Element_ID="98c77de4-f7aa-4c1b-a5ce-a1b48433fb79",ColumnName="C_BOEGroup_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50dbdc8a-7476-7b03-26be-7a520adf29a3",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_BOEGroup_ID */
public static final String COLUMNNAME_C_BOEGroup_ID = "C_BOEGroup_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID < 1) throw new IllegalArgumentException ("C_BOE_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f5f739b-f8fe-9a9a-a847-c7654a88b279")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange_Name="Letra de Cambio";

@XendraTrl(Identifier="3f5f739b-f8fe-9a9a-a847-c7654a88b279")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="3f5f739b-f8fe-9a9a-a847-c7654a88b279")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f5f739b-f8fe-9a9a-a847-c7654a88b279")
public static final String FIELDNAME_BillOfExchange_BillOfExchange="3f5f739b-f8fe-9a9a-a847-c7654a88b279";

@XendraTrl(Identifier="72e7eebc-80ff-f4f6-e6f7-14ea4a18238a")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange2_Name="Letra de Cambio";

@XendraTrl(Identifier="72e7eebc-80ff-f4f6-e6f7-14ea4a18238a")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange2_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="72e7eebc-80ff-f4f6-e6f7-14ea4a18238a")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange2_Help="El docuemnto Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72e7eebc-80ff-f4f6-e6f7-14ea4a18238a")
public static final String FIELDNAME_BillOfExchange_BillOfExchange2="72e7eebc-80ff-f4f6-e6f7-14ea4a18238a";

@XendraTrl(Identifier="e54ab9a8-bced-2662-f1dc-733c02d22317")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchange_Name="Letra de Cambio";

@XendraTrl(Identifier="e54ab9a8-bced-2662-f1dc-733c02d22317")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="e54ab9a8-bced-2662-f1dc-733c02d22317")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e54ab9a8-bced-2662-f1dc-733c02d22317")
public static final String FIELDNAME_BillOfExchangeRenovation_BillOfExchange="e54ab9a8-bced-2662-f1dc-733c02d22317";
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
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

@XendraTrl(Identifier="a9e34bef-0412-1728-dffa-e834534ab2c0")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="a9e34bef-0412-1728-dffa-e834534ab2c0")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="a9e34bef-0412-1728-dffa-e834534ab2c0")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Acceptor",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9e34bef-0412-1728-dffa-e834534ab2c0")
public static final String FIELDNAME_BillOfExchange_BusinessPartner="a9e34bef-0412-1728-dffa-e834534ab2c0";

@XendraTrl(Identifier="fcf93ecb-ffcb-f9a8-bc8b-33ce503748f4")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="fcf93ecb-ffcb-f9a8-bc8b-33ce503748f4")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="fcf93ecb-ffcb-f9a8-bc8b-33ce503748f4")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcf93ecb-ffcb-f9a8-bc8b-33ce503748f4")
public static final String FIELDNAME_BillOfExchange_BusinessPartner2="fcf93ecb-ffcb-f9a8-bc8b-33ce503748f4";

@XendraTrl(Identifier="62e6b88d-dcd9-9f68-2b67-3d090cbcd776")
public static String es_PE_FIELD_BillOfExchangeRenovation_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="62e6b88d-dcd9-9f68-2b67-3d090cbcd776")
public static String es_PE_FIELD_BillOfExchangeRenovation_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="62e6b88d-dcd9-9f68-2b67-3d090cbcd776")
public static String es_PE_FIELD_BillOfExchangeRenovation_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62e6b88d-dcd9-9f68-2b67-3d090cbcd776")
public static final String FIELDNAME_BillOfExchangeRenovation_BusinessPartner="62e6b88d-dcd9-9f68-2b67-3d090cbcd776";

@XendraTrl(Identifier="bc6b89fb-8c24-0c39-cc2d-9dc1dfb38601")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc6b89fb-8c24-0c39-cc2d-9dc1dfb38601",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="02ba3553-61b2-cf63-f52c-42d4bd32f364")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="02ba3553-61b2-cf63-f52c-42d4bd32f364")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="02ba3553-61b2-cf63-f52c-42d4bd32f364")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Acceptor",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02ba3553-61b2-cf63-f52c-42d4bd32f364")
public static final String FIELDNAME_BillOfExchange_PartnerLocation="02ba3553-61b2-cf63-f52c-42d4bd32f364";

@XendraTrl(Identifier="2076728f-2568-4b74-cc3a-a03a0d383728")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation2_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="2076728f-2568-4b74-cc3a-a03a0d383728")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation2_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="2076728f-2568-4b74-cc3a-a03a0d383728")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation2_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2076728f-2568-4b74-cc3a-a03a0d383728")
public static final String FIELDNAME_BillOfExchange_PartnerLocation2="2076728f-2568-4b74-cc3a-a03a0d383728";

@XendraTrl(Identifier="ac09dae7-b4ab-2fff-d625-f46c09c5fac6")
public static String es_PE_FIELD_BillOfExchangeRenovation_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="ac09dae7-b4ab-2fff-d625-f46c09c5fac6")
public static String es_PE_FIELD_BillOfExchangeRenovation_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="ac09dae7-b4ab-2fff-d625-f46c09c5fac6")
public static String es_PE_FIELD_BillOfExchangeRenovation_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac09dae7-b4ab-2fff-d625-f46c09c5fac6")
public static final String FIELDNAME_BillOfExchangeRenovation_PartnerLocation="ac09dae7-b4ab-2fff-d625-f46c09c5fac6";

@XendraTrl(Identifier="f8e25275-e89a-53bc-1c95-110ea45efbba")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="3b3664f5-7792-d41b-d8c1-1ed3b015f0c1",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8e25275-e89a-53bc-1c95-110ea45efbba",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_Value (COLUMNNAME_C_ConversionType_ID, null);
 else 
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8ffc6305-0e76-0d75-e3fe-9038c81a139c")
public static String es_PE_FIELD_BillOfExchange_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="8ffc6305-0e76-0d75-e3fe-9038c81a139c")
public static String es_PE_FIELD_BillOfExchange_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="8ffc6305-0e76-0d75-e3fe-9038c81a139c")
public static String es_PE_FIELD_BillOfExchange_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=10,IsReadOnly=true,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8ffc6305-0e76-0d75-e3fe-9038c81a139c")
public static final String FIELDNAME_BillOfExchange_CurrencyType="8ffc6305-0e76-0d75-e3fe-9038c81a139c";

@XendraTrl(Identifier="2d79b5eb-fbbd-5d05-69e5-3897d80277e6")
public static String es_PE_FIELD_BillOfExchange_CurrencyType2_Name="Tipo de Moneda";

@XendraTrl(Identifier="2d79b5eb-fbbd-5d05-69e5-3897d80277e6")
public static String es_PE_FIELD_BillOfExchange_CurrencyType2_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="2d79b5eb-fbbd-5d05-69e5-3897d80277e6")
public static String es_PE_FIELD_BillOfExchange_CurrencyType2_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=10,IsReadOnly=true,SeqNo=100,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2d79b5eb-fbbd-5d05-69e5-3897d80277e6")
public static final String FIELDNAME_BillOfExchange_CurrencyType2="2d79b5eb-fbbd-5d05-69e5-3897d80277e6";

@XendraTrl(Identifier="b701d32f-d46b-947b-e0ff-2bc82973d254")
public static String es_PE_FIELD_BillOfExchangeRenovation_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="b701d32f-d46b-947b-e0ff-2bc82973d254")
public static String es_PE_FIELD_BillOfExchangeRenovation_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="b701d32f-d46b-947b-e0ff-2bc82973d254")
public static String es_PE_FIELD_BillOfExchangeRenovation_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b701d32f-d46b-947b-e0ff-2bc82973d254")
public static final String FIELDNAME_BillOfExchangeRenovation_CurrencyType="b701d32f-d46b-947b-e0ff-2bc82973d254";

@XendraTrl(Identifier="c2c6d2b9-0941-d0c7-ab35-f35f75fe5e1c")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c2c6d2b9-0941-d0c7-ab35-f35f75fe5e1c",Synchronized="2019-08-30 22:21:05.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="65aba127-b891-256c-08e1-2e55a0851da1")
public static String es_PE_FIELD_BillOfExchange_Currency_Name="Moneda";

@XendraTrl(Identifier="65aba127-b891-256c-08e1-2e55a0851da1")
public static String es_PE_FIELD_BillOfExchange_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="65aba127-b891-256c-08e1-2e55a0851da1")
public static String es_PE_FIELD_BillOfExchange_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65aba127-b891-256c-08e1-2e55a0851da1")
public static final String FIELDNAME_BillOfExchange_Currency="65aba127-b891-256c-08e1-2e55a0851da1";

@XendraTrl(Identifier="84ca91d4-e16e-e825-7dc6-b2fab527c3a1")
public static String es_PE_FIELD_BillOfExchange_Currency2_Name="Moneda";

@XendraTrl(Identifier="84ca91d4-e16e-e825-7dc6-b2fab527c3a1")
public static String es_PE_FIELD_BillOfExchange_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="84ca91d4-e16e-e825-7dc6-b2fab527c3a1")
public static String es_PE_FIELD_BillOfExchange_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84ca91d4-e16e-e825-7dc6-b2fab527c3a1")
public static final String FIELDNAME_BillOfExchange_Currency2="84ca91d4-e16e-e825-7dc6-b2fab527c3a1";

@XendraTrl(Identifier="35d4e5e4-886a-5d49-2565-cfe939ecfc87")
public static String es_PE_FIELD_BillOfExchangeRenovation_Currency_Name="Moneda";

@XendraTrl(Identifier="35d4e5e4-886a-5d49-2565-cfe939ecfc87")
public static String es_PE_FIELD_BillOfExchangeRenovation_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="35d4e5e4-886a-5d49-2565-cfe939ecfc87")
public static String es_PE_FIELD_BillOfExchangeRenovation_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35d4e5e4-886a-5d49-2565-cfe939ecfc87")
public static final String FIELDNAME_BillOfExchangeRenovation_Currency="35d4e5e4-886a-5d49-2565-cfe939ecfc87";

@XendraTrl(Identifier="533ff3d5-a55d-39fd-6378-0efeb3370e49")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="533ff3d5-a55d-39fd-6378-0efeb3370e49",Synchronized="2019-08-30 22:21:05.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f21a5606-9e44-1b49-89fb-66335f0f402b")
public static String es_PE_FIELD_BillOfExchange_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="f21a5606-9e44-1b49-89fb-66335f0f402b")
public static String es_PE_FIELD_BillOfExchange_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="f21a5606-9e44-1b49-89fb-66335f0f402b")
public static String es_PE_FIELD_BillOfExchange_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f21a5606-9e44-1b49-89fb-66335f0f402b")
public static final String FIELDNAME_BillOfExchange_DocumentType="f21a5606-9e44-1b49-89fb-66335f0f402b";

@XendraTrl(Identifier="1ef60b98-636c-d6f5-5b3a-d26ea9b8db55")
public static String es_PE_FIELD_BillOfExchange_DocumentType2_Name="Tipo de Documento";

@XendraTrl(Identifier="1ef60b98-636c-d6f5-5b3a-d26ea9b8db55")
public static String es_PE_FIELD_BillOfExchange_DocumentType2_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="1ef60b98-636c-d6f5-5b3a-d26ea9b8db55")
public static String es_PE_FIELD_BillOfExchange_DocumentType2_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ef60b98-636c-d6f5-5b3a-d26ea9b8db55")
public static final String FIELDNAME_BillOfExchange_DocumentType2="1ef60b98-636c-d6f5-5b3a-d26ea9b8db55";

@XendraTrl(Identifier="0aa07121-5e82-d883-d555-3aba00e6621e")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="0aa07121-5e82-d883-d555-3aba00e6621e")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="0aa07121-5e82-d883-d555-3aba00e6621e")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0aa07121-5e82-d883-d555-3aba00e6621e")
public static final String FIELDNAME_BillOfExchangeRenovation_DocumentType="0aa07121-5e82-d883-d555-3aba00e6621e";

@XendraTrl(Identifier="ff19f60d-26e9-f594-8a4e-3e07e8b5bc12")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="3618c2e5-5c32-687f-83f6-d13e5296d9e4",
FieldLength=10,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ff19f60d-26e9-f594-8a4e-3e07e8b5bc12",Synchronized="2019-08-30 22:21:05.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Target Document Type.
@param C_DocTypeTarget_ID Target document type for conversing documents */
public void setC_DocTypeTarget_ID (int C_DocTypeTarget_ID)
{
if (C_DocTypeTarget_ID <= 0) set_Value (COLUMNNAME_C_DocTypeTarget_ID, null);
 else 
set_Value (COLUMNNAME_C_DocTypeTarget_ID, Integer.valueOf(C_DocTypeTarget_ID));
}
/** Get Target Document Type.
@return Target document type for conversing documents */
public int getC_DocTypeTarget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeTarget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9933ba39-32f7-e63e-78d5-61c417646827")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType_Name="Tipo Documento Destino";

@XendraTrl(Identifier="9933ba39-32f7-e63e-78d5-61c417646827")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="9933ba39-32f7-e63e-78d5-61c417646827")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9933ba39-32f7-e63e-78d5-61c417646827")
public static final String FIELDNAME_BillOfExchange_TargetDocumentType="9933ba39-32f7-e63e-78d5-61c417646827";

@XendraTrl(Identifier="a44063a2-cffe-dfa2-5a04-25e51793299a")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType2_Name="Tipo Documento Destino";

@XendraTrl(Identifier="a44063a2-cffe-dfa2-5a04-25e51793299a")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType2_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="a44063a2-cffe-dfa2-5a04-25e51793299a")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType2_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a44063a2-cffe-dfa2-5a04-25e51793299a")
public static final String FIELDNAME_BillOfExchange_TargetDocumentType2="a44063a2-cffe-dfa2-5a04-25e51793299a";

@XendraTrl(Identifier="282ea326-9c7c-0223-2934-42196d8cab73")
public static String es_PE_FIELD_BillOfExchangeRenovation_TargetDocumentType_Name="Tipo Documento Destino";

@XendraTrl(Identifier="282ea326-9c7c-0223-2934-42196d8cab73")
public static String es_PE_FIELD_BillOfExchangeRenovation_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="282ea326-9c7c-0223-2934-42196d8cab73")
public static String es_PE_FIELD_BillOfExchangeRenovation_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="282ea326-9c7c-0223-2934-42196d8cab73")
public static final String FIELDNAME_BillOfExchangeRenovation_TargetDocumentType="282ea326-9c7c-0223-2934-42196d8cab73";

@XendraTrl(Identifier="9caad383-2038-4382-77d8-017bf96f0a63")
public static String es_PE_COLUMN_C_DocTypeTarget_ID_Name="Tipo Documento Destino";

@XendraColumn(AD_Element_ID="6dee1e94-d5bf-ba0d-a64a-25cdb5fd9515",ColumnName="C_DocTypeTarget_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="3618c2e5-5c32-687f-83f6-d13e5296d9e4",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9caad383-2038-4382-77d8-017bf96f0a63",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_DocTypeTarget_ID */
public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
/** Set C_GroupDoc_ID.
@param C_GroupDoc_ID C_GroupDoc_ID */
public void setC_GroupDoc_ID (int C_GroupDoc_ID)
{
if (C_GroupDoc_ID <= 0) set_Value (COLUMNNAME_C_GroupDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_GroupDoc_ID, Integer.valueOf(C_GroupDoc_ID));
}
/** Get C_GroupDoc_ID.
@return C_GroupDoc_ID */
public int getC_GroupDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_GroupDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c968677-f263-fc9d-06f1-9868ff3bde04")
public static String es_PE_FIELD_BillOfExchange_C_GroupDoc_ID_Name="Grupo de Canje de Letra";

@XendraField(AD_Column_ID="C_GroupDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c968677-f263-fc9d-06f1-9868ff3bde04")
public static final String FIELDNAME_BillOfExchange_C_GroupDoc_ID="2c968677-f263-fc9d-06f1-9868ff3bde04";

@XendraTrl(Identifier="f5fc91f9-3540-3842-9bbf-4985c0f41b91")
public static String es_PE_FIELD_BillOfExchange_C_GroupDoc_ID2_Name="c_groupdoc_id";

@XendraField(AD_Column_ID="C_GroupDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5fc91f9-3540-3842-9bbf-4985c0f41b91")
public static final String FIELDNAME_BillOfExchange_C_GroupDoc_ID2="f5fc91f9-3540-3842-9bbf-4985c0f41b91";

@XendraTrl(Identifier="e1718e8d-c9d0-d094-03dd-0dfd935c0d05")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="c_groupdoc_id";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1718e8d-c9d0-d094-03dd-0dfd935c0d05",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c45dac4-4613-8291-6e1c-37c4aac4db68")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c45dac4-4613-8291-6e1c-37c4aac4db68",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="51a7e2f4-79c4-6419-6797-7b62dc8caec1")
public static String es_PE_FIELD_BillOfExchange_Payment_Name="Pago";

@XendraTrl(Identifier="51a7e2f4-79c4-6419-6797-7b62dc8caec1")
public static String es_PE_FIELD_BillOfExchange_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="51a7e2f4-79c4-6419-6797-7b62dc8caec1")
public static String es_PE_FIELD_BillOfExchange_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsPaid@=Y",DisplayLength=10,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51a7e2f4-79c4-6419-6797-7b62dc8caec1")
public static final String FIELDNAME_BillOfExchange_Payment="51a7e2f4-79c4-6419-6797-7b62dc8caec1";

@XendraTrl(Identifier="b5d87e44-9079-69dd-58a4-34f343e56ca2")
public static String es_PE_FIELD_BillOfExchange_Payment2_Name="Pago";

@XendraTrl(Identifier="b5d87e44-9079-69dd-58a4-34f343e56ca2")
public static String es_PE_FIELD_BillOfExchange_Payment2_Description="Identificador del pago";

@XendraTrl(Identifier="b5d87e44-9079-69dd-58a4-34f343e56ca2")
public static String es_PE_FIELD_BillOfExchange_Payment2_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsPaid@=Y",DisplayLength=10,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5d87e44-9079-69dd-58a4-34f343e56ca2")
public static final String FIELDNAME_BillOfExchange_Payment2="b5d87e44-9079-69dd-58a4-34f343e56ca2";

@XendraTrl(Identifier="46abda77-9fab-b6f5-f48a-83aa6de8c5f4")
public static String es_PE_FIELD_BillOfExchangeRenovation_Payment_Name="Pago";

@XendraTrl(Identifier="46abda77-9fab-b6f5-f48a-83aa6de8c5f4")
public static String es_PE_FIELD_BillOfExchangeRenovation_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="46abda77-9fab-b6f5-f48a-83aa6de8c5f4")
public static String es_PE_FIELD_BillOfExchangeRenovation_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46abda77-9fab-b6f5-f48a-83aa6de8c5f4")
public static final String FIELDNAME_BillOfExchangeRenovation_Payment="46abda77-9fab-b6f5-f48a-83aa6de8c5f4";

@XendraTrl(Identifier="a2a2b14d-efa9-6ea2-c850-91934c9285a3")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2a2b14d-efa9-6ea2-c850-91934c9285a3",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6c60fbb9-b5af-664a-7fbb-dbfbf7808968")
public static String es_PE_FIELD_BillOfExchange_Project_Name="Proyecto";

@XendraTrl(Identifier="6c60fbb9-b5af-664a-7fbb-dbfbf7808968")
public static String es_PE_FIELD_BillOfExchange_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="6c60fbb9-b5af-664a-7fbb-dbfbf7808968")
public static String es_PE_FIELD_BillOfExchange_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c60fbb9-b5af-664a-7fbb-dbfbf7808968")
public static final String FIELDNAME_BillOfExchange_Project="6c60fbb9-b5af-664a-7fbb-dbfbf7808968";

@XendraTrl(Identifier="4d4796db-1279-24fa-ca9f-ffd1cde7b64e")
public static String es_PE_FIELD_BillOfExchange_Project2_Name="Proyecto";

@XendraTrl(Identifier="4d4796db-1279-24fa-ca9f-ffd1cde7b64e")
public static String es_PE_FIELD_BillOfExchange_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="4d4796db-1279-24fa-ca9f-ffd1cde7b64e")
public static String es_PE_FIELD_BillOfExchange_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d4796db-1279-24fa-ca9f-ffd1cde7b64e")
public static final String FIELDNAME_BillOfExchange_Project2="4d4796db-1279-24fa-ca9f-ffd1cde7b64e";

@XendraTrl(Identifier="a8269424-97ca-8d71-4e54-05ba84473827")
public static String es_PE_FIELD_BillOfExchangeRenovation_Project_Name="Proyecto";

@XendraTrl(Identifier="a8269424-97ca-8d71-4e54-05ba84473827")
public static String es_PE_FIELD_BillOfExchangeRenovation_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="a8269424-97ca-8d71-4e54-05ba84473827")
public static String es_PE_FIELD_BillOfExchangeRenovation_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8269424-97ca-8d71-4e54-05ba84473827")
public static final String FIELDNAME_BillOfExchangeRenovation_Project="a8269424-97ca-8d71-4e54-05ba84473827";

@XendraTrl(Identifier="202ad7c9-d11a-2c01-d4e4-5871abf21937")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="202ad7c9-d11a-2c01-d4e4-5871abf21937",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Withholding.
@param C_Withholding_ID Withholding type defined */
public void setC_Withholding_ID (int C_Withholding_ID)
{
if (C_Withholding_ID <= 0) set_Value (COLUMNNAME_C_Withholding_ID, null);
 else 
set_Value (COLUMNNAME_C_Withholding_ID, Integer.valueOf(C_Withholding_ID));
}
/** Get Withholding.
@return Withholding type defined */
public int getC_Withholding_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Withholding_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8df796b0-06e2-4acb-ac48-09027eb3e697")
public static String es_PE_COLUMN_C_Withholding_ID_Name="Withholding";

@XendraColumn(AD_Element_ID="518d5ae2-65ee-2bb8-8c37-13beaceecf15",ColumnName="C_Withholding_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8df796b0-06e2-4acb-ac48-09027eb3e697",
Synchronized="2019-08-30 22:21:05.0")
/** Column name C_Withholding_ID */
public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
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

@XendraTrl(Identifier="ba1496b3-e34c-907e-b432-e3578d9b5482")
public static String es_PE_FIELD_BillOfExchange_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="ba1496b3-e34c-907e-b432-e3578d9b5482")
public static String es_PE_FIELD_BillOfExchange_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="ba1496b3-e34c-907e-b432-e3578d9b5482")
public static String es_PE_FIELD_BillOfExchange_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba1496b3-e34c-907e-b432-e3578d9b5482")
public static final String FIELDNAME_BillOfExchange_AccountDate="ba1496b3-e34c-907e-b432-e3578d9b5482";

@XendraTrl(Identifier="bf94402d-4ade-06a9-2d64-2a4ae2181964")
public static String es_PE_FIELD_BillOfExchange_AccountDate2_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="bf94402d-4ade-06a9-2d64-2a4ae2181964")
public static String es_PE_FIELD_BillOfExchange_AccountDate2_Description="Fecha contable";

@XendraTrl(Identifier="bf94402d-4ade-06a9-2d64-2a4ae2181964")
public static String es_PE_FIELD_BillOfExchange_AccountDate2_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf94402d-4ade-06a9-2d64-2a4ae2181964")
public static final String FIELDNAME_BillOfExchange_AccountDate2="bf94402d-4ade-06a9-2d64-2a4ae2181964";

@XendraTrl(Identifier="14a5d163-985f-2be3-9713-cb97aaf62672")
public static String es_PE_FIELD_BillOfExchangeRenovation_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="14a5d163-985f-2be3-9713-cb97aaf62672")
public static String es_PE_FIELD_BillOfExchangeRenovation_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="14a5d163-985f-2be3-9713-cb97aaf62672")
public static String es_PE_FIELD_BillOfExchangeRenovation_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14a5d163-985f-2be3-9713-cb97aaf62672")
public static final String FIELDNAME_BillOfExchangeRenovation_AccountDate="14a5d163-985f-2be3-9713-cb97aaf62672";

@XendraTrl(Identifier="0ab7e77f-ce5d-a72e-a5fd-d6c397ee222b")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0ab7e77f-ce5d-a72e-a5fd-d6c397ee222b",Synchronized="2019-08-30 22:21:05.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Bill Of Exchange Date.
@param DateBOE Bill Of Exchange Date */
public void setDateBOE (Timestamp DateBOE)
{
set_Value (COLUMNNAME_DateBOE, DateBOE);
}
/** Get Bill Of Exchange Date.
@return Bill Of Exchange Date */
public Timestamp getDateBOE() 
{
return (Timestamp)get_Value(COLUMNNAME_DateBOE);
}

@XendraTrl(Identifier="c6a47479-2a23-4302-1c49-cdf19644e4e9")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate_Name="Fecha Letra de Cambio";

@XendraTrl(Identifier="c6a47479-2a23-4302-1c49-cdf19644e4e9")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate_Description="Fecha Letra de Cambio";

@XendraTrl(Identifier="c6a47479-2a23-4302-1c49-cdf19644e4e9")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate_Help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.";

@XendraField(AD_Column_ID="DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6a47479-2a23-4302-1c49-cdf19644e4e9")
public static final String FIELDNAME_BillOfExchange_BillOfExchangeDate="c6a47479-2a23-4302-1c49-cdf19644e4e9";

@XendraTrl(Identifier="796a4578-1c3b-578c-422b-17642340772b")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate2_Name="Fecha de la Letra de Cambio";

@XendraTrl(Identifier="796a4578-1c3b-578c-422b-17642340772b")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate2_Description="Fecha de la Letra de Cambio";

@XendraTrl(Identifier="796a4578-1c3b-578c-422b-17642340772b")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate2_Help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.";

@XendraField(AD_Column_ID="DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="796a4578-1c3b-578c-422b-17642340772b")
public static final String FIELDNAME_BillOfExchange_BillOfExchangeDate2="796a4578-1c3b-578c-422b-17642340772b";

@XendraTrl(Identifier="b59c2a64-ae26-b53f-8bda-466baf306a94")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchangeDate_Name="Fecha de la Letra de Cambio";

@XendraTrl(Identifier="b59c2a64-ae26-b53f-8bda-466baf306a94")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchangeDate_Description="Fecha de la Letra de Cambio";

@XendraTrl(Identifier="b59c2a64-ae26-b53f-8bda-466baf306a94")
public static String es_PE_FIELD_BillOfExchangeRenovation_BillOfExchangeDate_Help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.";

@XendraField(AD_Column_ID="DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b59c2a64-ae26-b53f-8bda-466baf306a94")
public static final String FIELDNAME_BillOfExchangeRenovation_BillOfExchangeDate="b59c2a64-ae26-b53f-8bda-466baf306a94";

@XendraTrl(Identifier="58079a9f-0de2-14c3-610a-efadbe2d072c")
public static String es_PE_COLUMN_DateBOE_Name="Fecha de la Letra de Cambio";

@XendraColumn(AD_Element_ID="ca3fdb3d-2d28-4b77-a7fa-22bc925a41e1",ColumnName="DateBOE",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="58079a9f-0de2-14c3-610a-efadbe2d072c",Synchronized="2019-08-30 22:21:05.0")
/** Column name DateBOE */
public static final String COLUMNNAME_DateBOE = "DateBOE";
/** Set Date printed.
@param DatePrinted Date the document was printed. */
public void setDatePrinted (Timestamp DatePrinted)
{
set_Value (COLUMNNAME_DatePrinted, DatePrinted);
}
/** Get Date printed.
@return Date the document was printed. */
public Timestamp getDatePrinted() 
{
return (Timestamp)get_Value(COLUMNNAME_DatePrinted);
}

@XendraTrl(Identifier="b345a065-d02d-a5d3-7a8c-887d2f38e1a3")
public static String es_PE_FIELD_BillOfExchange_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="b345a065-d02d-a5d3-7a8c-887d2f38e1a3")
public static String es_PE_FIELD_BillOfExchange_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="b345a065-d02d-a5d3-7a8c-887d2f38e1a3")
public static String es_PE_FIELD_BillOfExchange_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b345a065-d02d-a5d3-7a8c-887d2f38e1a3")
public static final String FIELDNAME_BillOfExchange_DatePrinted="b345a065-d02d-a5d3-7a8c-887d2f38e1a3";

@XendraTrl(Identifier="07a6668a-991f-bcd1-b330-5ec55f8c12e8")
public static String es_PE_FIELD_BillOfExchange_DatePrinted2_Name="Fecha de Impresión";

@XendraTrl(Identifier="07a6668a-991f-bcd1-b330-5ec55f8c12e8")
public static String es_PE_FIELD_BillOfExchange_DatePrinted2_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="07a6668a-991f-bcd1-b330-5ec55f8c12e8")
public static String es_PE_FIELD_BillOfExchange_DatePrinted2_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07a6668a-991f-bcd1-b330-5ec55f8c12e8")
public static final String FIELDNAME_BillOfExchange_DatePrinted2="07a6668a-991f-bcd1-b330-5ec55f8c12e8";

@XendraTrl(Identifier="e74d11be-32d7-8c11-7b04-b6b2e726ec01")
public static String es_PE_FIELD_BillOfExchangeRenovation_DatePrinted_Name="Fecha de Impresión";

@XendraTrl(Identifier="e74d11be-32d7-8c11-7b04-b6b2e726ec01")
public static String es_PE_FIELD_BillOfExchangeRenovation_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="e74d11be-32d7-8c11-7b04-b6b2e726ec01")
public static String es_PE_FIELD_BillOfExchangeRenovation_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e74d11be-32d7-8c11-7b04-b6b2e726ec01")
public static final String FIELDNAME_BillOfExchangeRenovation_DatePrinted="e74d11be-32d7-8c11-7b04-b6b2e726ec01";

@XendraTrl(Identifier="d93c211e-8437-d346-af7f-c96b0029d8ec")
public static String es_PE_COLUMN_DatePrinted_Name="Fecha de Impresión";

@XendraColumn(AD_Element_ID="0b68d937-f4a8-8b9d-aeeb-b029c126580d",ColumnName="DatePrinted",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d93c211e-8437-d346-af7f-c96b0029d8ec",
Synchronized="2019-08-30 22:21:06.0")
/** Column name DatePrinted */
public static final String COLUMNNAME_DatePrinted = "DatePrinted";
/** Set DateStatusBOE.
@param DateStatusBOE DateStatusBOE */
public void setDateStatusBOE (Timestamp DateStatusBOE)
{
set_Value (COLUMNNAME_DateStatusBOE, DateStatusBOE);
}
/** Get DateStatusBOE.
@return DateStatusBOE */
public Timestamp getDateStatusBOE() 
{
return (Timestamp)get_Value(COLUMNNAME_DateStatusBOE);
}

@XendraTrl(Identifier="d315071a-8965-4c14-8fc8-6039130ef6e3")
public static String es_PE_COLUMN_DateStatusBOE_Name="DateStatusBOE";

@XendraColumn(AD_Element_ID="79aaa829-9ecf-78d3-22fa-4bb8761d8889",ColumnName="DateStatusBOE",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d315071a-8965-4c14-8fc8-6039130ef6e3",
Synchronized="2019-08-30 22:21:06.0")
/** Column name DateStatusBOE */
public static final String COLUMNNAME_DateStatusBOE = "DateStatusBOE";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="34bc292b-4a41-a512-0e28-b97620847248")
public static String es_PE_FIELD_BillOfExchange_Description_Name="Descripción";

@XendraTrl(Identifier="34bc292b-4a41-a512-0e28-b97620847248")
public static String es_PE_FIELD_BillOfExchange_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="34bc292b-4a41-a512-0e28-b97620847248")
public static String es_PE_FIELD_BillOfExchange_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34bc292b-4a41-a512-0e28-b97620847248")
public static final String FIELDNAME_BillOfExchange_Description="34bc292b-4a41-a512-0e28-b97620847248";

@XendraTrl(Identifier="c38d3009-df44-3116-71a4-54297f457fb9")
public static String es_PE_FIELD_BillOfExchange_Description2_Name="Descripción";

@XendraTrl(Identifier="c38d3009-df44-3116-71a4-54297f457fb9")
public static String es_PE_FIELD_BillOfExchange_Description2_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="c38d3009-df44-3116-71a4-54297f457fb9")
public static String es_PE_FIELD_BillOfExchange_Description2_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c38d3009-df44-3116-71a4-54297f457fb9")
public static final String FIELDNAME_BillOfExchange_Description2="c38d3009-df44-3116-71a4-54297f457fb9";

@XendraTrl(Identifier="a410cfef-86b6-ab46-34e4-5f97e59bc471")
public static String es_PE_FIELD_BillOfExchangeRenovation_Description_Name="Descripción";

@XendraTrl(Identifier="a410cfef-86b6-ab46-34e4-5f97e59bc471")
public static String es_PE_FIELD_BillOfExchangeRenovation_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="a410cfef-86b6-ab46-34e4-5f97e59bc471")
public static String es_PE_FIELD_BillOfExchangeRenovation_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a410cfef-86b6-ab46-34e4-5f97e59bc471")
public static final String FIELDNAME_BillOfExchangeRenovation_Description="a410cfef-86b6-ab46-34e4-5f97e59bc471";

@XendraTrl(Identifier="579082a5-06e9-b375-4337-7352a2df147b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="579082a5-06e9-b375-4337-7352a2df147b",
Synchronized="2019-08-30 22:21:06.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="c86cabad-a0e5-9a7d-615e-d4688836681d")
public static String es_PE_FIELD_BillOfExchange_DocumentAction_Name="Acción en el Documento";

@XendraTrl(Identifier="c86cabad-a0e5-9a7d-615e-d4688836681d")
public static String es_PE_FIELD_BillOfExchange_DocumentAction_Description="El estado destino del documento";

@XendraTrl(Identifier="c86cabad-a0e5-9a7d-615e-d4688836681d")
public static String es_PE_FIELD_BillOfExchange_DocumentAction_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@IsPaid@='N'",DisplayLength=2,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c86cabad-a0e5-9a7d-615e-d4688836681d")
public static final String FIELDNAME_BillOfExchange_DocumentAction="c86cabad-a0e5-9a7d-615e-d4688836681d";

@XendraTrl(Identifier="07627ed7-3319-8889-3178-fbe90072ed2d")
public static String es_PE_FIELD_BillOfExchange_DocumentAction2_Name="Acción en el Documento";

@XendraTrl(Identifier="07627ed7-3319-8889-3178-fbe90072ed2d")
public static String es_PE_FIELD_BillOfExchange_DocumentAction2_Description="El estado destino del documento";

@XendraTrl(Identifier="07627ed7-3319-8889-3178-fbe90072ed2d")
public static String es_PE_FIELD_BillOfExchange_DocumentAction2_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07627ed7-3319-8889-3178-fbe90072ed2d")
public static final String FIELDNAME_BillOfExchange_DocumentAction2="07627ed7-3319-8889-3178-fbe90072ed2d";

@XendraTrl(Identifier="c406d8ac-05f9-a39d-7174-e81511c2528c")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentAction_Name="Acción en el Documento";

@XendraTrl(Identifier="c406d8ac-05f9-a39d-7174-e81511c2528c")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentAction_Description="El estado destino del documento";

@XendraTrl(Identifier="c406d8ac-05f9-a39d-7174-e81511c2528c")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentAction_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c406d8ac-05f9-a39d-7174-e81511c2528c")
public static final String FIELDNAME_BillOfExchangeRenovation_DocumentAction="c406d8ac-05f9-a39d-7174-e81511c2528c";

@XendraTrl(Identifier="7e6a706e-57dd-b8bd-0176-279e16dd366c")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,
AD_Process_ID="ad80301d-2044-4b67-bdd4-2e3da5ae14dc",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e6a706e-57dd-b8bd-0176-279e16dd366c",
Synchronized="2019-08-30 22:21:06.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
DocStatus = DocStatus.substring(0,1);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
return (String)get_Value(COLUMNNAME_DocStatus);
}

@XendraTrl(Identifier="53ebac93-66ed-665f-9e41-e264c2a8464a")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="53ebac93-66ed-665f-9e41-e264c2a8464a")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="53ebac93-66ed-665f-9e41-e264c2a8464a")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53ebac93-66ed-665f-9e41-e264c2a8464a")
public static final String FIELDNAME_BillOfExchange_DocumentStatus="53ebac93-66ed-665f-9e41-e264c2a8464a";

@XendraTrl(Identifier="a893e1be-0144-fec2-61a7-607ebd77b1cc")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus2_Name="Estado del Documento";

@XendraTrl(Identifier="a893e1be-0144-fec2-61a7-607ebd77b1cc")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus2_Description="El estado actual del documento";

@XendraTrl(Identifier="a893e1be-0144-fec2-61a7-607ebd77b1cc")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus2_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a893e1be-0144-fec2-61a7-607ebd77b1cc")
public static final String FIELDNAME_BillOfExchange_DocumentStatus2="a893e1be-0144-fec2-61a7-607ebd77b1cc";

@XendraTrl(Identifier="9ae7605b-52f1-e47e-da1f-72c7f2765a64")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="9ae7605b-52f1-e47e-da1f-72c7f2765a64")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="9ae7605b-52f1-e47e-da1f-72c7f2765a64")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ae7605b-52f1-e47e-da1f-72c7f2765a64")
public static final String FIELDNAME_BillOfExchangeRenovation_DocumentStatus="9ae7605b-52f1-e47e-da1f-72c7f2765a64";

@XendraTrl(Identifier="c1cde7d0-c0a7-57b8-b52c-6d1e1d4f0251")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c1cde7d0-c0a7-57b8-b52c-6d1e1d4f0251",Synchronized="2019-08-30 22:21:06.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="57d788b2-c2d8-e569-3cf7-9fde2e6350ab")
public static String es_PE_FIELD_BillOfExchange_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="57d788b2-c2d8-e569-3cf7-9fde2e6350ab")
public static String es_PE_FIELD_BillOfExchange_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="57d788b2-c2d8-e569-3cf7-9fde2e6350ab")
public static String es_PE_FIELD_BillOfExchange_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57d788b2-c2d8-e569-3cf7-9fde2e6350ab")
public static final String FIELDNAME_BillOfExchange_DocumentNo="57d788b2-c2d8-e569-3cf7-9fde2e6350ab";

@XendraTrl(Identifier="243537f0-24b3-c5af-8184-efed11fdee4e")
public static String es_PE_FIELD_BillOfExchange_DocumentNo2_Name="No. del Documento";

@XendraTrl(Identifier="243537f0-24b3-c5af-8184-efed11fdee4e")
public static String es_PE_FIELD_BillOfExchange_DocumentNo2_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="243537f0-24b3-c5af-8184-efed11fdee4e")
public static String es_PE_FIELD_BillOfExchange_DocumentNo2_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="243537f0-24b3-c5af-8184-efed11fdee4e")
public static final String FIELDNAME_BillOfExchange_DocumentNo2="243537f0-24b3-c5af-8184-efed11fdee4e";

@XendraTrl(Identifier="ef604f3f-8b62-f541-d037-fa240d67727d")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="ef604f3f-8b62-f541-d037-fa240d67727d")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="ef604f3f-8b62-f541-d037-fa240d67727d")
public static String es_PE_FIELD_BillOfExchangeRenovation_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef604f3f-8b62-f541-d037-fa240d67727d")
public static final String FIELDNAME_BillOfExchangeRenovation_DocumentNo="ef604f3f-8b62-f541-d037-fa240d67727d";

@XendraTrl(Identifier="66dd3ba2-6b42-cdc6-f518-b8d22b538417")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=10,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66dd3ba2-6b42-cdc6-f518-b8d22b538417",
Synchronized="2019-08-30 22:21:06.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Due Date.
@param DueDate Date when the payment is due */
public void setDueDate (Timestamp DueDate)
{
if (DueDate == null) throw new IllegalArgumentException ("DueDate is mandatory.");
set_Value (COLUMNNAME_DueDate, DueDate);
}
/** Get Due Date.
@return Date when the payment is due */
public Timestamp getDueDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DueDate);
}

@XendraTrl(Identifier="30963d63-a2d0-b317-e60d-cddb91f6571a")
public static String es_PE_FIELD_BillOfExchange_DueDate_Name="Fecha de Vencimiento";

@XendraTrl(Identifier="30963d63-a2d0-b317-e60d-cddb91f6571a")
public static String es_PE_FIELD_BillOfExchange_DueDate_Description="Fecha cuando el pago es vencido.";

@XendraTrl(Identifier="30963d63-a2d0-b317-e60d-cddb91f6571a")
public static String es_PE_FIELD_BillOfExchange_DueDate_Help="Fecha cuando el pago es vencido sin deducciones ó descuento";

@XendraField(AD_Column_ID="DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30963d63-a2d0-b317-e60d-cddb91f6571a")
public static final String FIELDNAME_BillOfExchange_DueDate="30963d63-a2d0-b317-e60d-cddb91f6571a";

@XendraTrl(Identifier="82b21dfc-71e4-bafd-4bc8-7937d69a444a")
public static String es_PE_FIELD_BillOfExchange_DueDate2_Name="Fecha de Vencimiento";

@XendraTrl(Identifier="82b21dfc-71e4-bafd-4bc8-7937d69a444a")
public static String es_PE_FIELD_BillOfExchange_DueDate2_Description="Fecha cuando el pago es vencido.";

@XendraTrl(Identifier="82b21dfc-71e4-bafd-4bc8-7937d69a444a")
public static String es_PE_FIELD_BillOfExchange_DueDate2_Help="Fecha cuando el pago es vencido sin deducciones ó descuento";

@XendraField(AD_Column_ID="DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82b21dfc-71e4-bafd-4bc8-7937d69a444a")
public static final String FIELDNAME_BillOfExchange_DueDate2="82b21dfc-71e4-bafd-4bc8-7937d69a444a";

@XendraTrl(Identifier="b4b901d3-f4ee-6a22-fe8b-e496e5652f34")
public static String es_PE_FIELD_BillOfExchangeRenovation_DueDate_Name="Fecha de Vencimiento";

@XendraTrl(Identifier="b4b901d3-f4ee-6a22-fe8b-e496e5652f34")
public static String es_PE_FIELD_BillOfExchangeRenovation_DueDate_Description="Fecha cuando el pago es vencido.";

@XendraTrl(Identifier="b4b901d3-f4ee-6a22-fe8b-e496e5652f34")
public static String es_PE_FIELD_BillOfExchangeRenovation_DueDate_Help="Fecha cuando el pago es vencido sin deducciones ó descuento";

@XendraField(AD_Column_ID="DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4b901d3-f4ee-6a22-fe8b-e496e5652f34")
public static final String FIELDNAME_BillOfExchangeRenovation_DueDate="b4b901d3-f4ee-6a22-fe8b-e496e5652f34";

@XendraTrl(Identifier="a579673d-1673-1cae-0d5d-234d3467b642")
public static String es_PE_COLUMN_DueDate_Name="Fecha de Vencimiento";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a579673d-1673-1cae-0d5d-234d3467b642",
Synchronized="2019-08-30 22:21:06.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
if (GrandTotal == null) throw new IllegalArgumentException ("GrandTotal is mandatory.");
set_Value (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="371b9ad0-3f4c-400f-afdd-1c6f18b9006f")
public static String es_PE_FIELD_BillOfExchange_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="371b9ad0-3f4c-400f-afdd-1c6f18b9006f")
public static String es_PE_FIELD_BillOfExchange_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="371b9ad0-3f4c-400f-afdd-1c6f18b9006f")
public static String es_PE_FIELD_BillOfExchange_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="371b9ad0-3f4c-400f-afdd-1c6f18b9006f")
public static final String FIELDNAME_BillOfExchange_GrandTotal="371b9ad0-3f4c-400f-afdd-1c6f18b9006f";

@XendraTrl(Identifier="26c0ca29-3225-bac4-71b5-64719ddabf7f")
public static String es_PE_FIELD_BillOfExchange_GrandTotal2_Name="Gran Total";

@XendraTrl(Identifier="26c0ca29-3225-bac4-71b5-64719ddabf7f")
public static String es_PE_FIELD_BillOfExchange_GrandTotal2_Description="Total del documento";

@XendraTrl(Identifier="26c0ca29-3225-bac4-71b5-64719ddabf7f")
public static String es_PE_FIELD_BillOfExchange_GrandTotal2_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26c0ca29-3225-bac4-71b5-64719ddabf7f")
public static final String FIELDNAME_BillOfExchange_GrandTotal2="26c0ca29-3225-bac4-71b5-64719ddabf7f";

@XendraTrl(Identifier="3b02fbec-f670-7bf2-1e3c-f29abb8e93b4")
public static String es_PE_FIELD_BillOfExchangeRenovation_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="3b02fbec-f670-7bf2-1e3c-f29abb8e93b4")
public static String es_PE_FIELD_BillOfExchangeRenovation_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="3b02fbec-f670-7bf2-1e3c-f29abb8e93b4")
public static String es_PE_FIELD_BillOfExchangeRenovation_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b02fbec-f670-7bf2-1e3c-f29abb8e93b4")
public static final String FIELDNAME_BillOfExchangeRenovation_GrandTotal="3b02fbec-f670-7bf2-1e3c-f29abb8e93b4";

@XendraTrl(Identifier="567b03dd-34a8-d941-b0d5-c46b4f21d54f")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=20,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="567b03dd-34a8-d941-b0d5-c46b4f21d54f",
Synchronized="2019-08-30 22:21:06.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
/** Set Guarantor_ID.
@param Guarantor_ID Guarantor_ID */
public void setGuarantor_ID (int Guarantor_ID)
{
if (Guarantor_ID <= 0) set_Value (COLUMNNAME_Guarantor_ID, null);
 else 
set_Value (COLUMNNAME_Guarantor_ID, Integer.valueOf(Guarantor_ID));
}
/** Get Guarantor_ID.
@return Guarantor_ID */
public int getGuarantor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Guarantor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="21f8c752-7763-712f-71ea-b1320eab6a90")
public static String es_PE_FIELD_BillOfExchange_Guarantor_ID_Name="Garante";

@XendraField(AD_Column_ID="Guarantor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Guarantor",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21f8c752-7763-712f-71ea-b1320eab6a90")
public static final String FIELDNAME_BillOfExchange_Guarantor_ID="21f8c752-7763-712f-71ea-b1320eab6a90";

@XendraTrl(Identifier="d1933960-c833-cd6f-d1a1-d877db9f3ebd")
public static String es_PE_FIELD_BillOfExchange_Guarantor_ID2_Name="Garante";

@XendraField(AD_Column_ID="Guarantor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1933960-c833-cd6f-d1a1-d877db9f3ebd")
public static final String FIELDNAME_BillOfExchange_Guarantor_ID2="d1933960-c833-cd6f-d1a1-d877db9f3ebd";

@XendraTrl(Identifier="3ecc57cc-b8d1-096e-0472-6ff63f8e8b80")
public static String es_PE_FIELD_BillOfExchangeRenovation_Guarantor_ID_Name="Garante";

@XendraField(AD_Column_ID="Guarantor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ecc57cc-b8d1-096e-0472-6ff63f8e8b80")
public static final String FIELDNAME_BillOfExchangeRenovation_Guarantor_ID="3ecc57cc-b8d1-096e-0472-6ff63f8e8b80";

@XendraTrl(Identifier="1523e2a1-f0e1-9bdf-116e-efb797ff330a")
public static String es_PE_COLUMN_Guarantor_ID_Name="Garante";

@XendraColumn(AD_Element_ID="b66e5d12-c647-ca0a-6667-1fce3c535ef4",ColumnName="Guarantor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="3e4406f7-96ab-1533-375a-4f34b79f0576",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1523e2a1-f0e1-9bdf-116e-efb797ff330a",Synchronized="2019-08-30 22:21:06.0")
/** Column name Guarantor_ID */
public static final String COLUMNNAME_Guarantor_ID = "Guarantor_ID";
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
@XendraTrl(Identifier="d037fe61-fe34-41c4-81ef-b060fd8b73da")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d037fe61-fe34-41c4-81ef-b060fd8b73da",
Synchronized="2019-08-30 22:21:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Allocated.
@param IsAllocated Indicates if the payment has been allocated */
public void setIsAllocated (boolean IsAllocated)
{
set_Value (COLUMNNAME_IsAllocated, Boolean.valueOf(IsAllocated));
}
/** Get Allocated.
@return Indicates if the payment has been allocated */
public boolean isAllocated() 
{
Object oo = get_Value(COLUMNNAME_IsAllocated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f1389692-6afc-68cb-3340-b80a4d4e0f35")
public static String es_PE_FIELD_BillOfExchange_Allocated_Name="Asignado";

@XendraTrl(Identifier="f1389692-6afc-68cb-3340-b80a4d4e0f35")
public static String es_PE_FIELD_BillOfExchange_Allocated_Description="Indica si el pago ha sido asignado";

@XendraTrl(Identifier="f1389692-6afc-68cb-3340-b80a4d4e0f35")
public static String es_PE_FIELD_BillOfExchange_Allocated_Help="El cuadro de verificación Asignado indica si el pago ha sido asignado o asociado con una factura o facturas";

@XendraField(AD_Column_ID="IsAllocated",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1389692-6afc-68cb-3340-b80a4d4e0f35")
public static final String FIELDNAME_BillOfExchange_Allocated="f1389692-6afc-68cb-3340-b80a4d4e0f35";

@XendraTrl(Identifier="8a4b4d54-e269-3eae-1338-c08800583363")
public static String es_PE_FIELD_BillOfExchange_Allocated2_Name="Asignado";

@XendraTrl(Identifier="8a4b4d54-e269-3eae-1338-c08800583363")
public static String es_PE_FIELD_BillOfExchange_Allocated2_Description="Indica si el pago ha sido asignado";

@XendraTrl(Identifier="8a4b4d54-e269-3eae-1338-c08800583363")
public static String es_PE_FIELD_BillOfExchange_Allocated2_Help="El cuadro de verificación Asignado indica si el pago ha sido asignado o asociado con una factura o facturas";

@XendraField(AD_Column_ID="IsAllocated",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a4b4d54-e269-3eae-1338-c08800583363")
public static final String FIELDNAME_BillOfExchange_Allocated2="8a4b4d54-e269-3eae-1338-c08800583363";

@XendraTrl(Identifier="b3a26a72-7283-b4b7-b00a-2fa1d5c824aa")
public static String es_PE_FIELD_BillOfExchangeRenovation_Allocated_Name="Asignado";

@XendraTrl(Identifier="b3a26a72-7283-b4b7-b00a-2fa1d5c824aa")
public static String es_PE_FIELD_BillOfExchangeRenovation_Allocated_Description="Indica si el pago ha sido asignado";

@XendraTrl(Identifier="b3a26a72-7283-b4b7-b00a-2fa1d5c824aa")
public static String es_PE_FIELD_BillOfExchangeRenovation_Allocated_Help="El cuadro de verificación Asignado indica si el pago ha sido asignado o asociado con una factura o facturas";

@XendraField(AD_Column_ID="IsAllocated",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3a26a72-7283-b4b7-b00a-2fa1d5c824aa")
public static final String FIELDNAME_BillOfExchangeRenovation_Allocated="b3a26a72-7283-b4b7-b00a-2fa1d5c824aa";

@XendraTrl(Identifier="94a260fd-8342-2a1a-6ab8-26e9cc965187")
public static String es_PE_COLUMN_IsAllocated_Name="Asignado";

@XendraColumn(AD_Element_ID="9e224a32-8f75-7921-819b-e891efaf4226",ColumnName="IsAllocated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="'N'",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94a260fd-8342-2a1a-6ab8-26e9cc965187",
Synchronized="2019-08-30 22:21:06.0")
/** Column name IsAllocated */
public static final String COLUMNNAME_IsAllocated = "IsAllocated";
/** Set Paid.
@param IsPaid The document is paid */
public void setIsPaid (boolean IsPaid)
{
set_Value (COLUMNNAME_IsPaid, Boolean.valueOf(IsPaid));
}
/** Get Paid.
@return The document is paid */
public boolean isPaid() 
{
Object oo = get_Value(COLUMNNAME_IsPaid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="878f7371-7c7c-6251-9056-736a2a036f8f")
public static String es_PE_FIELD_BillOfExchange_Paid_Name="Pagado";

@XendraField(AD_Column_ID="IsPaid",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="878f7371-7c7c-6251-9056-736a2a036f8f")
public static final String FIELDNAME_BillOfExchange_Paid="878f7371-7c7c-6251-9056-736a2a036f8f";

@XendraTrl(Identifier="42d4364b-3e9a-d45c-45f7-5ef8498fab3e")
public static String es_PE_FIELD_BillOfExchange_Paid2_Name="Pagado";

@XendraField(AD_Column_ID="IsPaid",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42d4364b-3e9a-d45c-45f7-5ef8498fab3e")
public static final String FIELDNAME_BillOfExchange_Paid2="42d4364b-3e9a-d45c-45f7-5ef8498fab3e";

@XendraTrl(Identifier="634ff275-02b0-cc10-796c-2bd8ffd86f69")
public static String es_PE_FIELD_BillOfExchangeRenovation_Paid_Name="Pagado";

@XendraField(AD_Column_ID="IsPaid",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="634ff275-02b0-cc10-796c-2bd8ffd86f69")
public static final String FIELDNAME_BillOfExchangeRenovation_Paid="634ff275-02b0-cc10-796c-2bd8ffd86f69";

@XendraTrl(Identifier="ccac11d8-4c9f-a3c1-9f98-969fa94c9d52")
public static String es_PE_COLUMN_IsPaid_Name="Pagado";

@XendraColumn(AD_Element_ID="a4a2359a-ebb8-dca1-8077-df35f747271c",ColumnName="IsPaid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="'N'",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccac11d8-4c9f-a3c1-9f98-969fa94c9d52",
Synchronized="2019-08-30 22:21:06.0")
/** Column name IsPaid */
public static final String COLUMNNAME_IsPaid = "IsPaid";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="48617074-73cf-b529-0f89-addfa920ac11")
public static String es_PE_FIELD_BillOfExchange_Printed_Name="Impreso";

@XendraTrl(Identifier="48617074-73cf-b529-0f89-addfa920ac11")
public static String es_PE_FIELD_BillOfExchange_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="48617074-73cf-b529-0f89-addfa920ac11")
public static String es_PE_FIELD_BillOfExchange_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48617074-73cf-b529-0f89-addfa920ac11")
public static final String FIELDNAME_BillOfExchange_Printed="48617074-73cf-b529-0f89-addfa920ac11";

@XendraTrl(Identifier="dc0629a4-02e5-637d-2f78-145e08d11db4")
public static String es_PE_FIELD_BillOfExchange_Printed2_Name="Impreso";

@XendraTrl(Identifier="dc0629a4-02e5-637d-2f78-145e08d11db4")
public static String es_PE_FIELD_BillOfExchange_Printed2_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="dc0629a4-02e5-637d-2f78-145e08d11db4")
public static String es_PE_FIELD_BillOfExchange_Printed2_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc0629a4-02e5-637d-2f78-145e08d11db4")
public static final String FIELDNAME_BillOfExchange_Printed2="dc0629a4-02e5-637d-2f78-145e08d11db4";

@XendraTrl(Identifier="ae366877-e179-8afd-7737-c34ac32be190")
public static String es_PE_FIELD_BillOfExchangeRenovation_Printed_Name="Impreso";

@XendraTrl(Identifier="ae366877-e179-8afd-7737-c34ac32be190")
public static String es_PE_FIELD_BillOfExchangeRenovation_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="ae366877-e179-8afd-7737-c34ac32be190")
public static String es_PE_FIELD_BillOfExchangeRenovation_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae366877-e179-8afd-7737-c34ac32be190")
public static final String FIELDNAME_BillOfExchangeRenovation_Printed="ae366877-e179-8afd-7737-c34ac32be190";

@XendraTrl(Identifier="63d51d57-68a0-4bc0-d949-f3e04ab86da2")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63d51d57-68a0-4bc0-d949-f3e04ab86da2",
Synchronized="2019-08-30 22:21:06.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set IsRefinanced.
@param IsRefinanced IsRefinanced */
public void setIsRefinanced (boolean IsRefinanced)
{
set_Value (COLUMNNAME_IsRefinanced, Boolean.valueOf(IsRefinanced));
}
/** Get IsRefinanced.
@return IsRefinanced */
public boolean isRefinanced() 
{
Object oo = get_Value(COLUMNNAME_IsRefinanced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8f74609d-f21a-9955-c4a2-7b08c6dea8f8")
public static String es_PE_FIELD_BillOfExchange_IsRefinanced_Name="Refinanciado";

@XendraField(AD_Column_ID="IsRefinanced",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Bank",IsDisplayed=false,
DisplayLogic="@IsPaid@=N",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f74609d-f21a-9955-c4a2-7b08c6dea8f8")
public static final String FIELDNAME_BillOfExchange_IsRefinanced="8f74609d-f21a-9955-c4a2-7b08c6dea8f8";

@XendraTrl(Identifier="1bfad21c-f2d2-7f87-37db-22ccee047112")
public static String es_PE_FIELD_BillOfExchange_IsRefinanced2_Name="Refinanciado";

@XendraField(AD_Column_ID="IsRefinanced",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1bfad21c-f2d2-7f87-37db-22ccee047112")
public static final String FIELDNAME_BillOfExchange_IsRefinanced2="1bfad21c-f2d2-7f87-37db-22ccee047112";

@XendraTrl(Identifier="a64ad386-b809-5ada-66a2-08b24d1f90de")
public static String es_PE_FIELD_BillOfExchangeRenovation_IsRefinanced_Name="isrefinanced";

@XendraField(AD_Column_ID="IsRefinanced",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a64ad386-b809-5ada-66a2-08b24d1f90de")
public static final String FIELDNAME_BillOfExchangeRenovation_IsRefinanced="a64ad386-b809-5ada-66a2-08b24d1f90de";

@XendraTrl(Identifier="aeee2b59-b2d1-3f41-bb74-7221d5e8a9c9")
public static String es_PE_COLUMN_IsRefinanced_Name="isrefinanced";

@XendraColumn(AD_Element_ID="f3df7fcf-af1a-bf6c-479f-d9a445eac4cd",ColumnName="IsRefinanced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aeee2b59-b2d1-3f41-bb74-7221d5e8a9c9",
Synchronized="2019-08-30 22:21:06.0")
/** Column name IsRefinanced */
public static final String COLUMNNAME_IsRefinanced = "IsRefinanced";
/** Set IsRenewed.
@param IsRenewed IsRenewed */
public void setIsRenewed (boolean IsRenewed)
{
set_Value (COLUMNNAME_IsRenewed, Boolean.valueOf(IsRenewed));
}
/** Get IsRenewed.
@return IsRenewed */
public boolean isRenewed() 
{
Object oo = get_Value(COLUMNNAME_IsRenewed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f3c13576-126e-5fb1-3eb8-173a9bab8ee2")
public static String es_PE_FIELD_BillOfExchange_IsRenewed_Name="Renovada";

@XendraField(AD_Column_ID="IsRenewed",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3c13576-126e-5fb1-3eb8-173a9bab8ee2")
public static final String FIELDNAME_BillOfExchange_IsRenewed="f3c13576-126e-5fb1-3eb8-173a9bab8ee2";

@XendraTrl(Identifier="d2fe5bd1-a15a-9c85-f1e6-aa0c79624b14")
public static String es_PE_FIELD_BillOfExchange_IsRenewed2_Name="Renovado";

@XendraField(AD_Column_ID="IsRenewed",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPaid@=N",DisplayLength=1,IsReadOnly=true,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2fe5bd1-a15a-9c85-f1e6-aa0c79624b14")
public static final String FIELDNAME_BillOfExchange_IsRenewed2="d2fe5bd1-a15a-9c85-f1e6-aa0c79624b14";

@XendraTrl(Identifier="989c2991-ccef-b348-a09f-bb864dcfa6bf")
public static String es_PE_FIELD_BillOfExchangeRenovation_IsRenewed_Name="isrenewed";

@XendraField(AD_Column_ID="IsRenewed",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="989c2991-ccef-b348-a09f-bb864dcfa6bf")
public static final String FIELDNAME_BillOfExchangeRenovation_IsRenewed="989c2991-ccef-b348-a09f-bb864dcfa6bf";

@XendraTrl(Identifier="70d2696c-aaff-d004-71fb-65074649b20e")
public static String es_PE_COLUMN_IsRenewed_Name="isrenewed";

@XendraColumn(AD_Element_ID="8de60f34-047e-29a8-31ec-4c5ea1291a86",ColumnName="IsRenewed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70d2696c-aaff-d004-71fb-65074649b20e",
Synchronized="2019-08-30 22:21:06.0")
/** Column name IsRenewed */
public static final String COLUMNNAME_IsRenewed = "IsRenewed";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8d6fcdfb-5682-2f85-137e-7be803cc38f7")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="8d6fcdfb-5682-2f85-137e-7be803cc38f7")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="8d6fcdfb-5682-2f85-137e-7be803cc38f7")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="General",IsDisplayed=false,
DisplayLogic="'Y'",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d6fcdfb-5682-2f85-137e-7be803cc38f7")
public static final String FIELDNAME_BillOfExchange_SalesTransaction="8d6fcdfb-5682-2f85-137e-7be803cc38f7";

@XendraTrl(Identifier="773753cb-2fda-d19a-d215-e28582e3835f")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction2_Name="Transacción de Ventas";

@XendraTrl(Identifier="773753cb-2fda-d19a-d215-e28582e3835f")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction2_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="773753cb-2fda-d19a-d215-e28582e3835f")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction2_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="773753cb-2fda-d19a-d215-e28582e3835f")
public static final String FIELDNAME_BillOfExchange_SalesTransaction2="773753cb-2fda-d19a-d215-e28582e3835f";

@XendraTrl(Identifier="14ad3336-75a4-5557-c3f9-8c381f29fe7c")
public static String es_PE_FIELD_BillOfExchangeRenovation_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="14ad3336-75a4-5557-c3f9-8c381f29fe7c")
public static String es_PE_FIELD_BillOfExchangeRenovation_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="14ad3336-75a4-5557-c3f9-8c381f29fe7c")
public static String es_PE_FIELD_BillOfExchangeRenovation_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14ad3336-75a4-5557-c3f9-8c381f29fe7c")
public static final String FIELDNAME_BillOfExchangeRenovation_SalesTransaction="14ad3336-75a4-5557-c3f9-8c381f29fe7c";

@XendraTrl(Identifier="2703e791-4fac-00e8-be01-ddcdb80d8b0d")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="'Y'",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2703e791-4fac-00e8-be01-ddcdb80d8b0d",
Synchronized="2019-08-30 22:21:06.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
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

@XendraTrl(Identifier="4cdbfbf1-51dc-ce9b-42c0-b0e6fb62309b")
public static String es_PE_FIELD_BillOfExchange_Processed_Name="Procesado";

@XendraTrl(Identifier="4cdbfbf1-51dc-ce9b-42c0-b0e6fb62309b")
public static String es_PE_FIELD_BillOfExchange_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="4cdbfbf1-51dc-ce9b-42c0-b0e6fb62309b")
public static String es_PE_FIELD_BillOfExchange_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cdbfbf1-51dc-ce9b-42c0-b0e6fb62309b")
public static final String FIELDNAME_BillOfExchange_Processed="4cdbfbf1-51dc-ce9b-42c0-b0e6fb62309b";

@XendraTrl(Identifier="2551475d-7c7e-9563-2047-99e62dd2ce96")
public static String es_PE_FIELD_BillOfExchange_Processed2_Name="Procesado";

@XendraTrl(Identifier="2551475d-7c7e-9563-2047-99e62dd2ce96")
public static String es_PE_FIELD_BillOfExchange_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2551475d-7c7e-9563-2047-99e62dd2ce96")
public static String es_PE_FIELD_BillOfExchange_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2551475d-7c7e-9563-2047-99e62dd2ce96")
public static final String FIELDNAME_BillOfExchange_Processed2="2551475d-7c7e-9563-2047-99e62dd2ce96";

@XendraTrl(Identifier="da584d14-6b5e-832c-fd7b-0acfdb0460b1")
public static String es_PE_FIELD_BillOfExchangeRenovation_Processed_Name="Procesado";

@XendraTrl(Identifier="da584d14-6b5e-832c-fd7b-0acfdb0460b1")
public static String es_PE_FIELD_BillOfExchangeRenovation_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="da584d14-6b5e-832c-fd7b-0acfdb0460b1")
public static String es_PE_FIELD_BillOfExchangeRenovation_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da584d14-6b5e-832c-fd7b-0acfdb0460b1")
public static final String FIELDNAME_BillOfExchangeRenovation_Processed="da584d14-6b5e-832c-fd7b-0acfdb0460b1";

@XendraTrl(Identifier="49dbfb28-16b4-6846-c0c1-d35e5d754269")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49dbfb28-16b4-6846-c0c1-d35e5d754269",
Synchronized="2019-08-30 22:21:06.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b33e0ee2-6ce5-ffd4-b3e9-4f78db4df10b")
public static String es_PE_FIELD_BillOfExchange_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b33e0ee2-6ce5-ffd4-b3e9-4f78db4df10b")
public static final String FIELDNAME_BillOfExchange_ProcessNow="b33e0ee2-6ce5-ffd4-b3e9-4f78db4df10b";

@XendraTrl(Identifier="a5540eab-1542-7ddf-ced0-68516c06a086")
public static String es_PE_FIELD_BillOfExchange_ProcessNow2_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5540eab-1542-7ddf-ced0-68516c06a086")
public static final String FIELDNAME_BillOfExchange_ProcessNow2="a5540eab-1542-7ddf-ced0-68516c06a086";

@XendraTrl(Identifier="e5618fef-6142-a32e-5a35-334ade92590d")
public static String es_PE_FIELD_BillOfExchangeRenovation_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5618fef-6142-a32e-5a35-334ade92590d")
public static final String FIELDNAME_BillOfExchangeRenovation_ProcessNow="e5618fef-6142-a32e-5a35-334ade92590d";

@XendraTrl(Identifier="c6df3f75-4882-72cb-3f1d-2c2ea76ac37f")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6df3f75-4882-72cb-3f1d-2c2ea76ac37f",
Synchronized="2019-08-30 22:21:06.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set R_Amount.
@param R_Amount R_Amount */
public void setR_Amount (BigDecimal R_Amount)
{
set_Value (COLUMNNAME_R_Amount, R_Amount);
}
/** Get R_Amount.
@return R_Amount */
public BigDecimal getR_Amount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_R_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4abdc2bf-93b1-e8e2-36dc-cdb3baee9b9b")
public static String es_PE_FIELD_BillOfExchange_R_Amount_Name="Monto Renovación";

@XendraField(AD_Column_ID="R_Amount",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4abdc2bf-93b1-e8e2-36dc-cdb3baee9b9b")
public static final String FIELDNAME_BillOfExchange_R_Amount="4abdc2bf-93b1-e8e2-36dc-cdb3baee9b9b";

@XendraTrl(Identifier="36fa23c3-6c67-8bfe-1808-98a941c9889d")
public static String es_PE_FIELD_BillOfExchange_R_Amount2_Name="Monto Renovación";

@XendraField(AD_Column_ID="R_Amount",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36fa23c3-6c67-8bfe-1808-98a941c9889d")
public static final String FIELDNAME_BillOfExchange_R_Amount2="36fa23c3-6c67-8bfe-1808-98a941c9889d";

@XendraTrl(Identifier="3e463f1a-ad88-2c82-6347-c280a21c388c")
public static String es_PE_FIELD_BillOfExchangeRenovation_R_Amount_Name="r_amount";

@XendraField(AD_Column_ID="R_Amount",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e463f1a-ad88-2c82-6347-c280a21c388c")
public static final String FIELDNAME_BillOfExchangeRenovation_R_Amount="3e463f1a-ad88-2c82-6347-c280a21c388c";

@XendraTrl(Identifier="6142a0da-fca6-fa82-6836-8b169067a2e6")
public static String es_PE_COLUMN_R_Amount_Name="r_amount";

@XendraColumn(AD_Element_ID="f2f4326d-a98c-202c-3c1b-3a5f98af0af8",ColumnName="R_Amount",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6142a0da-fca6-fa82-6836-8b169067a2e6",
Synchronized="2019-08-30 22:21:06.0")
/** Column name R_Amount */
public static final String COLUMNNAME_R_Amount = "R_Amount";
/** Set R_DateBOE.
@param R_DateBOE R_DateBOE */
public void setR_DateBOE (Timestamp R_DateBOE)
{
set_Value (COLUMNNAME_R_DateBOE, R_DateBOE);
}
/** Get R_DateBOE.
@return R_DateBOE */
public Timestamp getR_DateBOE() 
{
return (Timestamp)get_Value(COLUMNNAME_R_DateBOE);
}

@XendraTrl(Identifier="2459226f-0fa4-eed3-8041-05825ce18503")
public static String es_PE_FIELD_BillOfExchange_R_DateBOE_Name="Fecha de Renovación";

@XendraField(AD_Column_ID="R_DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2459226f-0fa4-eed3-8041-05825ce18503")
public static final String FIELDNAME_BillOfExchange_R_DateBOE="2459226f-0fa4-eed3-8041-05825ce18503";

@XendraTrl(Identifier="b2ab1443-9043-c17d-f31e-c7aa4b44fc14")
public static String es_PE_FIELD_BillOfExchange_R_DateBOE2_Name="Fecha Renovación";

@XendraField(AD_Column_ID="R_DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="@IsPaid@=N",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2ab1443-9043-c17d-f31e-c7aa4b44fc14")
public static final String FIELDNAME_BillOfExchange_R_DateBOE2="b2ab1443-9043-c17d-f31e-c7aa4b44fc14";

@XendraTrl(Identifier="2e4b158c-a949-dd08-126f-ce68fd51a4e1")
public static String es_PE_FIELD_BillOfExchangeRenovation_R_DateBOE_Name="r_dateboe";

@XendraField(AD_Column_ID="R_DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e4b158c-a949-dd08-126f-ce68fd51a4e1")
public static final String FIELDNAME_BillOfExchangeRenovation_R_DateBOE="2e4b158c-a949-dd08-126f-ce68fd51a4e1";

@XendraTrl(Identifier="25315d4d-c152-a9d5-7a4b-0df7d7be34fc")
public static String es_PE_COLUMN_R_DateBOE_Name="r_dateboe";

@XendraColumn(AD_Element_ID="43214b0e-134f-3094-de33-560a7912aebf",ColumnName="R_DateBOE",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25315d4d-c152-a9d5-7a4b-0df7d7be34fc",
Synchronized="2019-08-30 22:21:06.0")
/** Column name R_DateBOE */
public static final String COLUMNNAME_R_DateBOE = "R_DateBOE";
/** Set R_DocumentNo.
@param R_DocumentNo R_DocumentNo */
public void setR_DocumentNo (String R_DocumentNo)
{
if (R_DocumentNo != null && R_DocumentNo.length() > 10)
{
log.warning("Length > 10 - truncated");
R_DocumentNo = R_DocumentNo.substring(0,9);
}
set_Value (COLUMNNAME_R_DocumentNo, R_DocumentNo);
}
/** Get R_DocumentNo.
@return R_DocumentNo */
public String getR_DocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_R_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1d4067d7-1b4e-8ce8-0035-1a41c3dcbdd1")
public static String es_PE_FIELD_BillOfExchange_R_DocumentNo_Name="Documento Renovado";

@XendraField(AD_Column_ID="R_DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d4067d7-1b4e-8ce8-0035-1a41c3dcbdd1")
public static final String FIELDNAME_BillOfExchange_R_DocumentNo="1d4067d7-1b4e-8ce8-0035-1a41c3dcbdd1";

@XendraTrl(Identifier="0eedd6b8-737e-b8e0-5a51-631cde0feb7a")
public static String es_PE_FIELD_BillOfExchange_R_DocumentNo2_Name="Doc Renovación";

@XendraField(AD_Column_ID="R_DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPaid@=N",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0eedd6b8-737e-b8e0-5a51-631cde0feb7a")
public static final String FIELDNAME_BillOfExchange_R_DocumentNo2="0eedd6b8-737e-b8e0-5a51-631cde0feb7a";

@XendraTrl(Identifier="7d0f8652-326e-2fe9-3ece-98cf9c6966b1")
public static String es_PE_FIELD_BillOfExchangeRenovation_R_DocumentNo_Name="r_documentno";

@XendraField(AD_Column_ID="R_DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d0f8652-326e-2fe9-3ece-98cf9c6966b1")
public static final String FIELDNAME_BillOfExchangeRenovation_R_DocumentNo="7d0f8652-326e-2fe9-3ece-98cf9c6966b1";

@XendraTrl(Identifier="98ba943d-fb91-16f5-5cd8-add0349ba194")
public static String es_PE_COLUMN_R_DocumentNo_Name="r_documentno";

@XendraColumn(AD_Element_ID="8b1dbb8c-1008-fdae-6f93-2368cc144ef7",ColumnName="R_DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98ba943d-fb91-16f5-5cd8-add0349ba194",
Synchronized="2019-08-30 22:21:06.0")
/** Column name R_DocumentNo */
public static final String COLUMNNAME_R_DocumentNo = "R_DocumentNo";
/** Set R_DueDate.
@param R_DueDate R_DueDate */
public void setR_DueDate (Timestamp R_DueDate)
{
set_Value (COLUMNNAME_R_DueDate, R_DueDate);
}
/** Get R_DueDate.
@return R_DueDate */
public Timestamp getR_DueDate() 
{
return (Timestamp)get_Value(COLUMNNAME_R_DueDate);
}

@XendraTrl(Identifier="1f8c0e9b-6e85-f5ca-9cf5-ae3240ffc0e9")
public static String es_PE_FIELD_BillOfExchange_R_DueDate_Name="Vencimiento Renovación";

@XendraField(AD_Column_ID="R_DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f8c0e9b-6e85-f5ca-9cf5-ae3240ffc0e9")
public static final String FIELDNAME_BillOfExchange_R_DueDate="1f8c0e9b-6e85-f5ca-9cf5-ae3240ffc0e9";

@XendraTrl(Identifier="41df8d78-7ab7-b8b0-b975-26c38581b6e1")
public static String es_PE_FIELD_BillOfExchange_R_DueDate2_Name="Vencimiento Renovación";

@XendraField(AD_Column_ID="R_DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41df8d78-7ab7-b8b0-b975-26c38581b6e1")
public static final String FIELDNAME_BillOfExchange_R_DueDate2="41df8d78-7ab7-b8b0-b975-26c38581b6e1";

@XendraTrl(Identifier="2117c0fd-5f35-81fa-86d4-2f5014dce59f")
public static String es_PE_FIELD_BillOfExchangeRenovation_R_DueDate_Name="r_duedate";

@XendraField(AD_Column_ID="R_DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2117c0fd-5f35-81fa-86d4-2f5014dce59f")
public static final String FIELDNAME_BillOfExchangeRenovation_R_DueDate="2117c0fd-5f35-81fa-86d4-2f5014dce59f";

@XendraTrl(Identifier="90615afe-5347-58c5-6513-ed2a32e4dc0f")
public static String es_PE_COLUMN_R_DueDate_Name="r_duedate";

@XendraColumn(AD_Element_ID="28dbce96-e45b-c88c-3c68-be09bebee102",ColumnName="R_DueDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90615afe-5347-58c5-6513-ed2a32e4dc0f",
Synchronized="2019-08-30 22:21:06.0")
/** Column name R_DueDate */
public static final String COLUMNNAME_R_DueDate = "R_DueDate";
/** Set Ref_BOE_ID.
@param Ref_BOE_ID Ref_BOE_ID */
public void setRef_BOE_ID (int Ref_BOE_ID)
{
if (Ref_BOE_ID <= 0) set_Value (COLUMNNAME_Ref_BOE_ID, null);
 else 
set_Value (COLUMNNAME_Ref_BOE_ID, Integer.valueOf(Ref_BOE_ID));
}
/** Get Ref_BOE_ID.
@return Ref_BOE_ID */
public int getRef_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="36b89b20-6e2a-5d4e-f886-470e31df6951")
public static String es_PE_FIELD_BillOfExchange_Ref_BOE_ID_Name="Referencia Letra";

@XendraField(AD_Column_ID="Ref_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Renovation",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36b89b20-6e2a-5d4e-f886-470e31df6951")
public static final String FIELDNAME_BillOfExchange_Ref_BOE_ID="36b89b20-6e2a-5d4e-f886-470e31df6951";

@XendraTrl(Identifier="ff0a2710-6068-ca3f-774d-dc042691efb3")
public static String es_PE_FIELD_BillOfExchange_Ref_BOE_ID2_Name="Referencia Letra";

@XendraField(AD_Column_ID="Ref_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff0a2710-6068-ca3f-774d-dc042691efb3")
public static final String FIELDNAME_BillOfExchange_Ref_BOE_ID2="ff0a2710-6068-ca3f-774d-dc042691efb3";

@XendraTrl(Identifier="ec073d10-03c8-f3a1-25e1-774c15dc981f")
public static String es_PE_FIELD_BillOfExchangeRenovation_Ref_BOE_ID_Name="ref_boe_id";

@XendraField(AD_Column_ID="Ref_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec073d10-03c8-f3a1-25e1-774c15dc981f")
public static final String FIELDNAME_BillOfExchangeRenovation_Ref_BOE_ID="ec073d10-03c8-f3a1-25e1-774c15dc981f";

@XendraTrl(Identifier="c308837d-2336-4b95-7aa1-94b3ef883000")
public static String es_PE_COLUMN_Ref_BOE_ID_Name="ref_boe_id";

@XendraColumn(AD_Element_ID="606339d4-3f3a-b290-a6b3-65710c5c5827",ColumnName="Ref_BOE_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15ad633b-67da-5ecc-9ec0-d9f415de8616",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c308837d-2336-4b95-7aa1-94b3ef883000",Synchronized="2019-08-30 22:21:06.0")
/** Column name Ref_BOE_ID */
public static final String COLUMNNAME_Ref_BOE_ID = "Ref_BOE_ID";
/** Set Refinance.
@param Refinance Refinance */
public void setRefinance (String Refinance)
{
if (Refinance != null && Refinance.length() > 1)
{
log.warning("Length > 1 - truncated");
Refinance = Refinance.substring(0,0);
}
set_Value (COLUMNNAME_Refinance, Refinance);
}
/** Get Refinance.
@return Refinance */
public String getRefinance() 
{
return (String)get_Value(COLUMNNAME_Refinance);
}

@XendraTrl(Identifier="8f3e2616-7687-4a23-b227-7407ae8e1dc3")
public static String es_PE_FIELD_BillOfExchange_Refinance_Name="Refinanciar";

@XendraField(AD_Column_ID="Refinance",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Bank",IsDisplayed=false,
DisplayLogic="@IsPaid@=N",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f3e2616-7687-4a23-b227-7407ae8e1dc3")
public static final String FIELDNAME_BillOfExchange_Refinance="8f3e2616-7687-4a23-b227-7407ae8e1dc3";

@XendraTrl(Identifier="03c9ef18-40cb-f3e8-9700-16a33f20fd8c")
public static String es_PE_FIELD_BillOfExchange_Refinance2_Name="refinance";

@XendraField(AD_Column_ID="Refinance",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03c9ef18-40cb-f3e8-9700-16a33f20fd8c")
public static final String FIELDNAME_BillOfExchange_Refinance2="03c9ef18-40cb-f3e8-9700-16a33f20fd8c";

@XendraTrl(Identifier="f8115570-e2e1-bbdc-bb29-f99ccf79d226")
public static String es_PE_FIELD_BillOfExchangeRenovation_Refinance_Name="refinance";

@XendraField(AD_Column_ID="Refinance",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8115570-e2e1-bbdc-bb29-f99ccf79d226")
public static final String FIELDNAME_BillOfExchangeRenovation_Refinance="f8115570-e2e1-bbdc-bb29-f99ccf79d226";

@XendraTrl(Identifier="f4eb69a1-1623-a8a5-49b9-2bffe9afd1ad")
public static String es_PE_COLUMN_Refinance_Name="refinance";

@XendraColumn(AD_Element_ID="3bf55bd8-a0bc-1104-28f7-3bf3b9c2f4df",ColumnName="Refinance",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="c7d0e445-7c2f-3653-1e66-3dfc9ec8f4da",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f4eb69a1-1623-a8a5-49b9-2bffe9afd1ad",Synchronized="2019-08-30 22:21:06.0")
/** Column name Refinance */
public static final String COLUMNNAME_Refinance = "Refinance";
/** Set RefinanceDays.
@param RefinanceDays RefinanceDays */
public void setRefinanceDays (int RefinanceDays)
{
set_Value (COLUMNNAME_RefinanceDays, Integer.valueOf(RefinanceDays));
}
/** Get RefinanceDays.
@return RefinanceDays */
public int getRefinanceDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RefinanceDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2beca36d-9b0b-da1d-7737-98eb1d9b85e6")
public static String es_PE_FIELD_BillOfExchange_RefinanceDays_Name="refinancedays";

@XendraField(AD_Column_ID="RefinanceDays",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2beca36d-9b0b-da1d-7737-98eb1d9b85e6")
public static final String FIELDNAME_BillOfExchange_RefinanceDays="2beca36d-9b0b-da1d-7737-98eb1d9b85e6";

@XendraTrl(Identifier="f4a0e3a6-766f-2905-3cc4-4affb983c7e5")
public static String es_PE_FIELD_BillOfExchange_RefinanceDays2_Name="refinancedays";

@XendraField(AD_Column_ID="RefinanceDays",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4a0e3a6-766f-2905-3cc4-4affb983c7e5")
public static final String FIELDNAME_BillOfExchange_RefinanceDays2="f4a0e3a6-766f-2905-3cc4-4affb983c7e5";

@XendraTrl(Identifier="fc7f7511-29a5-8cd3-b6f4-a76845c88090")
public static String es_PE_FIELD_BillOfExchangeRenovation_RefinanceDays_Name="refinancedays";

@XendraField(AD_Column_ID="RefinanceDays",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc7f7511-29a5-8cd3-b6f4-a76845c88090")
public static final String FIELDNAME_BillOfExchangeRenovation_RefinanceDays="fc7f7511-29a5-8cd3-b6f4-a76845c88090";

@XendraTrl(Identifier="5c1ae818-9b38-22fb-b271-0bde4b48de16")
public static String es_PE_COLUMN_RefinanceDays_Name="refinancedays";

@XendraColumn(AD_Element_ID="e2eee0d1-bad5-2cf5-9837-0e0b562b177b",ColumnName="RefinanceDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c1ae818-9b38-22fb-b271-0bde4b48de16",
Synchronized="2019-08-30 22:21:06.0")
/** Column name RefinanceDays */
public static final String COLUMNNAME_RefinanceDays = "RefinanceDays";
/** Set RefinanceDoc.
@param RefinanceDoc RefinanceDoc */
public void setRefinanceDoc (String RefinanceDoc)
{
if (RefinanceDoc != null && RefinanceDoc.length() > 30)
{
log.warning("Length > 30 - truncated");
RefinanceDoc = RefinanceDoc.substring(0,29);
}
set_Value (COLUMNNAME_RefinanceDoc, RefinanceDoc);
}
/** Get RefinanceDoc.
@return RefinanceDoc */
public String getRefinanceDoc() 
{
String value = (String)get_Value(COLUMNNAME_RefinanceDoc);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8e5f9dfa-d4f8-9395-cc9b-1e2ac284faec")
public static String es_PE_FIELD_BillOfExchange_RefinanceDoc_Name="Doc Refinanciamiento";

@XendraField(AD_Column_ID="RefinanceDoc",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Bank",IsDisplayed=false,
DisplayLogic="@IsPaid@=N",DisplayLength=30,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e5f9dfa-d4f8-9395-cc9b-1e2ac284faec")
public static final String FIELDNAME_BillOfExchange_RefinanceDoc="8e5f9dfa-d4f8-9395-cc9b-1e2ac284faec";

@XendraTrl(Identifier="377d43f9-a4cb-5f2e-3d9b-97ef2f406383")
public static String es_PE_FIELD_BillOfExchange_RefinanceDoc2_Name="refinancedoc";

@XendraField(AD_Column_ID="RefinanceDoc",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="377d43f9-a4cb-5f2e-3d9b-97ef2f406383")
public static final String FIELDNAME_BillOfExchange_RefinanceDoc2="377d43f9-a4cb-5f2e-3d9b-97ef2f406383";

@XendraTrl(Identifier="a441cd6a-b484-eb0d-cb5e-af92d7a2a41c")
public static String es_PE_FIELD_BillOfExchangeRenovation_RefinanceDoc_Name="refinancedoc";

@XendraField(AD_Column_ID="RefinanceDoc",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a441cd6a-b484-eb0d-cb5e-af92d7a2a41c")
public static final String FIELDNAME_BillOfExchangeRenovation_RefinanceDoc="a441cd6a-b484-eb0d-cb5e-af92d7a2a41c";

@XendraTrl(Identifier="7659e63b-e4e5-a8c9-e690-ebda293cd92c")
public static String es_PE_COLUMN_RefinanceDoc_Name="refinancedoc";

@XendraColumn(AD_Element_ID="5711f562-61b7-08be-6702-ab51489a6b46",ColumnName="RefinanceDoc",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7659e63b-e4e5-a8c9-e690-ebda293cd92c",
Synchronized="2019-08-30 22:21:06.0")
/** Column name RefinanceDoc */
public static final String COLUMNNAME_RefinanceDoc = "RefinanceDoc";
/** Set Renew.
@param Renew Renew */
public void setRenew (String Renew)
{
if (Renew != null && Renew.length() > 1)
{
log.warning("Length > 1 - truncated");
Renew = Renew.substring(0,0);
}
set_Value (COLUMNNAME_Renew, Renew);
}
/** Get Renew.
@return Renew */
public String getRenew() 
{
return (String)get_Value(COLUMNNAME_Renew);
}

@XendraTrl(Identifier="20f482b0-fa47-ad2e-64b3-54d3f90b79da")
public static String es_PE_FIELD_BillOfExchange_Renew_Name="Renovar";

@XendraField(AD_Column_ID="Renew",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Renovation",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20f482b0-fa47-ad2e-64b3-54d3f90b79da")
public static final String FIELDNAME_BillOfExchange_Renew="20f482b0-fa47-ad2e-64b3-54d3f90b79da";

@XendraTrl(Identifier="bba25f8d-95eb-2829-9aef-74e124485f53")
public static String es_PE_FIELD_BillOfExchange_Renew2_Name="Renovar";

@XendraField(AD_Column_ID="Renew",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsPaid@=N",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bba25f8d-95eb-2829-9aef-74e124485f53")
public static final String FIELDNAME_BillOfExchange_Renew2="bba25f8d-95eb-2829-9aef-74e124485f53";

@XendraTrl(Identifier="aaf82ee6-0757-0235-2d31-eac273e268b8")
public static String es_PE_FIELD_BillOfExchangeRenovation_Renew_Name="renew";

@XendraField(AD_Column_ID="Renew",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aaf82ee6-0757-0235-2d31-eac273e268b8")
public static final String FIELDNAME_BillOfExchangeRenovation_Renew="aaf82ee6-0757-0235-2d31-eac273e268b8";

@XendraTrl(Identifier="acf3e19b-78f1-aa8e-c75d-8273b02d2de5")
public static String es_PE_COLUMN_Renew_Name="renew";

@XendraColumn(AD_Element_ID="cbe2f2f7-606b-16ac-961b-adffa0e31c3e",ColumnName="Renew",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="c7d0e445-7c2f-3653-1e66-3dfc9ec8f4da",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="acf3e19b-78f1-aa8e-c75d-8273b02d2de5",Synchronized="2019-08-30 22:21:06.0")
/** Column name Renew */
public static final String COLUMNNAME_Renew = "Renew";
/** Set RetentionAmt.
@param RetentionAmt RetentionAmt */
public void setRetentionAmt (BigDecimal RetentionAmt)
{
set_Value (COLUMNNAME_RetentionAmt, RetentionAmt);
}
/** Get RetentionAmt.
@return RetentionAmt */
public BigDecimal getRetentionAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RetentionAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cff77939-7ae9-b322-ee89-52c1b8aac8dc")
public static String es_PE_FIELD_BillOfExchange_RetentionAmt_Name="Monto Retención";

@XendraField(AD_Column_ID="RetentionAmt",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cff77939-7ae9-b322-ee89-52c1b8aac8dc")
public static final String FIELDNAME_BillOfExchange_RetentionAmt="cff77939-7ae9-b322-ee89-52c1b8aac8dc";

@XendraTrl(Identifier="f3d192d4-fa49-0b7e-8c2f-995727bb9a58")
public static String es_PE_FIELD_BillOfExchange_RetentionAmt2_Name="retentionamt";

@XendraField(AD_Column_ID="RetentionAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3d192d4-fa49-0b7e-8c2f-995727bb9a58")
public static final String FIELDNAME_BillOfExchange_RetentionAmt2="f3d192d4-fa49-0b7e-8c2f-995727bb9a58";

@XendraTrl(Identifier="23264ad9-0151-39db-6018-8143dbfd80b4")
public static String es_PE_FIELD_BillOfExchangeRenovation_RetentionAmt_Name="retentionamt";

@XendraField(AD_Column_ID="RetentionAmt",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23264ad9-0151-39db-6018-8143dbfd80b4")
public static final String FIELDNAME_BillOfExchangeRenovation_RetentionAmt="23264ad9-0151-39db-6018-8143dbfd80b4";

@XendraTrl(Identifier="6b1d6d3e-e026-d774-985d-948628a09856")
public static String es_PE_COLUMN_RetentionAmt_Name="retentionamt";

@XendraColumn(AD_Element_ID="03fc1388-a28c-38a5-c629-d7254fef0614",ColumnName="RetentionAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b1d6d3e-e026-d774-985d-948628a09856",
Synchronized="2019-08-30 22:21:06.0")
/** Column name RetentionAmt */
public static final String COLUMNNAME_RetentionAmt = "RetentionAmt";
/** Set StatusDate.
@param StatusDate StatusDate */
public void setStatusDate (Timestamp StatusDate)
{
set_Value (COLUMNNAME_StatusDate, StatusDate);
}
/** Get StatusDate.
@return StatusDate */
public Timestamp getStatusDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatusDate);
}

@XendraTrl(Identifier="233b633d-c196-6e06-f8c5-301cd8200871")
public static String es_PE_FIELD_BillOfExchange_StatusDate_Name="Fecha de Estado";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="08fa5cb7-1686-fd97-02a3-40a95c0a9f71",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="233b633d-c196-6e06-f8c5-301cd8200871")
public static final String FIELDNAME_BillOfExchange_StatusDate="233b633d-c196-6e06-f8c5-301cd8200871";

@XendraTrl(Identifier="1c2ecf7c-eb0c-c0fc-048e-5dab516b3341")
public static String es_PE_FIELD_BillOfExchange_StatusDate2_Name="Fecha de Estado";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="7e533a05-b5fd-2f7f-dd16-c8714f147b90",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c2ecf7c-eb0c-c0fc-048e-5dab516b3341")
public static final String FIELDNAME_BillOfExchange_StatusDate2="1c2ecf7c-eb0c-c0fc-048e-5dab516b3341";

@XendraTrl(Identifier="978c9d2b-22ee-d63b-2a9c-03255754acb3")
public static String es_PE_FIELD_BillOfExchangeRenovation_StatusDate_Name="STATUSDATE";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="95518bce-3f58-2ff6-f429-a42c368af61f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="978c9d2b-22ee-d63b-2a9c-03255754acb3")
public static final String FIELDNAME_BillOfExchangeRenovation_StatusDate="978c9d2b-22ee-d63b-2a9c-03255754acb3";

@XendraTrl(Identifier="e0579cc4-5ab1-1c83-0754-acb4b25c79dd")
public static String es_PE_COLUMN_StatusDate_Name="STATUSDATE";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e0579cc4-5ab1-1c83-0754-acb4b25c79dd",Synchronized="2019-08-30 22:21:06.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";
/** Set WithholdingAmt.
@param WithholdingAmt WithholdingAmt */
public void setWithholdingAmt (BigDecimal WithholdingAmt)
{
set_Value (COLUMNNAME_WithholdingAmt, WithholdingAmt);
}
/** Get WithholdingAmt.
@return WithholdingAmt */
public BigDecimal getWithholdingAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithholdingAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b949a749-1393-47e4-af90-20940c8a2696")
public static String es_PE_COLUMN_WithholdingAmt_Name="WithholdingAmt";

@XendraColumn(AD_Element_ID="750228fc-a0da-46c7-b584-2e34797d13d0",ColumnName="WithholdingAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b949a749-1393-47e4-af90-20940c8a2696",
Synchronized="2019-08-30 22:21:06.0")
/** Column name WithholdingAmt */
public static final String COLUMNNAME_WithholdingAmt = "WithholdingAmt";
}
