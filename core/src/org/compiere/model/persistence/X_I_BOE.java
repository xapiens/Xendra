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
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
/** Generated Model for I_BOE
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_BOE extends PO
{
/** Standard Constructor
@param ctx context
@param I_BOE_ID id
@param trxName transaction
*/
public X_I_BOE (Properties ctx, int I_BOE_ID, String trxName)
{
super (ctx, I_BOE_ID, trxName);
/** if (I_BOE_ID == 0)
{
setGrandTotal (Env.ZERO);
setI_BOE_ID (0);
setI_IsImported (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_BOE (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000075 */
public static int Table_ID=MTable.getTable_ID("I_BOE");

@XendraTrl(Identifier="c734c119-1eab-f1df-c315-c797a5811fdf")
public static String es_PE_TAB_BillOfExchange_Name="Bill of Exchange";

@XendraTab(Name="Bill of Exchange",Description="",Help="",
AD_Window_ID="a2499125-068f-9029-0633-e7b01caa0968",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c734c119-1eab-f1df-c315-c797a5811fdf",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchange="c734c119-1eab-f1df-c315-c797a5811fdf";

@XendraTrl(Identifier="a6461f91-5c6d-049f-7b02-5b955512f3d5")
public static String es_PE_TABLE_I_BOE_Name="Importar Letra de Cambio";

@XendraTable(Name="Import Bill Of Exchange",Description="Import Bill Of Exchange",
Help="Import Bill Of Exchange",TableName="I_BOE",AccessLevel="2",AD_Window_ID="",AD_Val_Rule_ID="",
IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="a6461f91-5c6d-049f-7b02-5b955512f3d5",Synchronized="2017-08-16 11:42:52.0")
/** TableName=I_BOE */
public static final String Table_Name="I_BOE";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_BOE");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("I_BOE");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_BOE[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Address 1.
@param Address1 Address line 1 for this location */
public void setAddress1 (String Address1)
{
if (Address1 != null && Address1.length() > 60)
{
log.warning("Length > 60 - truncated");
Address1 = Address1.substring(0,59);
}
set_Value (COLUMNNAME_Address1, Address1);
}
/** Get Address 1.
@return Address line 1 for this location */
public String getAddress1() 
{
String value = (String)get_Value(COLUMNNAME_Address1);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6c97a7da-c9f5-903d-c5b2-de3f1b315bf1")
public static String es_PE_FIELD_BillOfExchange_Address_Description="Dirección para esta ubicación";

@XendraTrl(Identifier="6c97a7da-c9f5-903d-c5b2-de3f1b315bf1")
public static String es_PE_FIELD_BillOfExchange_Address_Help="La Dirección 1 identifica la dirección para una entidad";

@XendraTrl(Identifier="6c97a7da-c9f5-903d-c5b2-de3f1b315bf1")
public static String es_PE_FIELD_BillOfExchange_Address_Name="Calle";

@XendraField(AD_Column_ID="Address1",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c97a7da-c9f5-903d-c5b2-de3f1b315bf1")
public static final String FIELDNAME_BillOfExchange_Address="6c97a7da-c9f5-903d-c5b2-de3f1b315bf1";

@XendraTrl(Identifier="98228857-cd39-a4d8-cd0d-e930bd34043d")
public static String es_PE_COLUMN_Address1_Name="Calle";

@XendraColumn(AD_Element_ID="25535414-be76-de81-69b4-106e2150a04a",ColumnName="Address1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98228857-cd39-a4d8-cd0d-e930bd34043d",
Synchronized="2017-08-05 16:54:49.0")
/** Column name Address1 */
public static final String COLUMNNAME_Address1 = "Address1";
/** Set Address 2.
@param Address2 Address line 2 for this location */
public void setAddress2 (String Address2)
{
if (Address2 != null && Address2.length() > 60)
{
log.warning("Length > 60 - truncated");
Address2 = Address2.substring(0,59);
}
set_Value (COLUMNNAME_Address2, Address2);
}
/** Get Address 2.
@return Address line 2 for this location */
public String getAddress2() 
{
String value = (String)get_Value(COLUMNNAME_Address2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ce01d338-9dc2-aa7f-4cfe-aa9e5842bf61")
public static String es_PE_FIELD_BillOfExchange_Address22_Description="Dirección 2 para esta ubicación";

@XendraTrl(Identifier="ce01d338-9dc2-aa7f-4cfe-aa9e5842bf61")
public static String es_PE_FIELD_BillOfExchange_Address22_Help="La Dirección 2 provee información de la dirección adicional para una entidad. Puede ser usada para integrar la ubicación; número de apartamento; ó información similar";

@XendraTrl(Identifier="ce01d338-9dc2-aa7f-4cfe-aa9e5842bf61")
public static String es_PE_FIELD_BillOfExchange_Address22_Name="Colonía";

@XendraField(AD_Column_ID="Address2",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce01d338-9dc2-aa7f-4cfe-aa9e5842bf61")
public static final String FIELDNAME_BillOfExchange_Address22="ce01d338-9dc2-aa7f-4cfe-aa9e5842bf61";

@XendraTrl(Identifier="414e627e-7c59-91cf-6061-a8879ce6d127")
public static String es_PE_COLUMN_Address2_Name="Colonía";

@XendraColumn(AD_Element_ID="a3cd6592-3282-7ed0-953e-16e24d22cc17",ColumnName="Address2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="414e627e-7c59-91cf-6061-a8879ce6d127",
Synchronized="2017-08-05 16:54:49.0")
/** Column name Address2 */
public static final String COLUMNNAME_Address2 = "Address2";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b2956a44-63aa-a419-c8cf-e1968bf7efec")
public static String es_PE_FIELD_BillOfExchange_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="b2956a44-63aa-a419-c8cf-e1968bf7efec")
public static String es_PE_FIELD_BillOfExchange_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="b2956a44-63aa-a419-c8cf-e1968bf7efec")
public static String es_PE_FIELD_BillOfExchange_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2956a44-63aa-a419-c8cf-e1968bf7efec")
public static final String FIELDNAME_BillOfExchange_UserContact="b2956a44-63aa-a419-c8cf-e1968bf7efec";

@XendraTrl(Identifier="57a3e30e-6c39-e3df-6c25-aed03dd28db8")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57a3e30e-6c39-e3df-6c25-aed03dd28db8",
Synchronized="2017-08-05 16:54:49.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="0add5b4c-e48e-6558-199c-928c52eaa187")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank_Description="Numero de Letra de cambio asignado por el Banco aceptante";

@XendraTrl(Identifier="0add5b4c-e48e-6558-199c-928c52eaa187")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank_Help="Este es el número que el banco asigna a nuestra letra, en el momento que nos la acepta";

@XendraTrl(Identifier="0add5b4c-e48e-6558-199c-928c52eaa187")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeNoOfBank_Name="No de Letra Bco";

@XendraField(AD_Column_ID="BOENo",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0add5b4c-e48e-6558-199c-928c52eaa187")
public static final String FIELDNAME_BillOfExchange_BillOfExchangeNoOfBank="0add5b4c-e48e-6558-199c-928c52eaa187";

@XendraTrl(Identifier="6c264c07-df0c-3c1a-3ce2-ceefd6f8c67b")
public static String es_PE_COLUMN_BOENo_Name="No de Letra Bco";

@XendraColumn(AD_Element_ID="091eac4c-3fde-7aa3-8516-77e9681245bb",ColumnName="BOENo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c264c07-df0c-3c1a-3ce2-ceefd6f8c67b",
Synchronized="2017-08-05 16:54:49.0")
/** Column name BOENo */
public static final String COLUMNNAME_BOENo = "BOENo";
/** Set Business Partner Key.
@param BPartnerValue Key of the Business Partner */
public void setBPartnerValue (String BPartnerValue)
{
if (BPartnerValue != null && BPartnerValue.length() > 40)
{
log.warning("Length > 40 - truncated");
BPartnerValue = BPartnerValue.substring(0,39);
}
set_Value (COLUMNNAME_BPartnerValue, BPartnerValue);
}
/** Get Business Partner Key.
@return Key of the Business Partner */
public String getBPartnerValue() 
{
String value = (String)get_Value(COLUMNNAME_BPartnerValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ce106315-b277-93dd-37b9-551f4551c8d9")
public static String es_PE_FIELD_BillOfExchange_BusinessPartnerKey_Description="Clave para el S.N.";

@XendraTrl(Identifier="ce106315-b277-93dd-37b9-551f4551c8d9")
public static String es_PE_FIELD_BillOfExchange_BusinessPartnerKey_Name="Clave de S.N.";

@XendraField(AD_Column_ID="BPartnerValue",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce106315-b277-93dd-37b9-551f4551c8d9")
public static final String FIELDNAME_BillOfExchange_BusinessPartnerKey="ce106315-b277-93dd-37b9-551f4551c8d9";

@XendraTrl(Identifier="7141c827-5fa0-b46c-10f9-f81a53420a0a")
public static String es_PE_COLUMN_BPartnerValue_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="8128a796-0c52-a502-d53b-7f4fe35f5f78",ColumnName="BPartnerValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7141c827-5fa0-b46c-10f9-f81a53420a0a",
Synchronized="2017-08-05 16:54:49.0")
/** Column name BPartnerValue */
public static final String COLUMNNAME_BPartnerValue = "BPartnerValue";
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

@XendraTrl(Identifier="1448fab9-a735-19ce-08b3-6db63a9e361e")
public static String es_PE_FIELD_BillOfExchange_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="1448fab9-a735-19ce-08b3-6db63a9e361e")
public static String es_PE_FIELD_BillOfExchange_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="1448fab9-a735-19ce-08b3-6db63a9e361e")
public static String es_PE_FIELD_BillOfExchange_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="Bank",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1448fab9-a735-19ce-08b3-6db63a9e361e")
public static final String FIELDNAME_BillOfExchange_BankAccount="1448fab9-a735-19ce-08b3-6db63a9e361e";

@XendraTrl(Identifier="7fa921d4-7981-18d0-a709-7a76e43f4cd8")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fa921d4-7981-18d0-a709-7a76e43f4cd8",
Synchronized="2017-08-05 16:54:49.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
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

@XendraTrl(Identifier="9f3d70c0-50ff-2a25-3ec4-42fa4812caf7")
public static String es_PE_COLUMN_C_BOEGroup_ID_Name="C_BOEGroup";

@XendraColumn(AD_Element_ID="98c77de4-f7aa-4c1b-a5ce-a1b48433fb79",ColumnName="C_BOEGroup_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f3d70c0-50ff-2a25-3ec4-42fa4812caf7",
Synchronized="2017-08-05 16:54:49.0")
/** Column name C_BOEGroup_ID */
public static final String COLUMNNAME_C_BOEGroup_ID = "C_BOEGroup_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID <= 0) set_Value (COLUMNNAME_C_BOE_ID, null);
 else 
set_Value (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7c39fc60-a8d7-d9cb-0e1b-7e7f18e1d130")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="7c39fc60-a8d7-d9cb-0e1b-7e7f18e1d130")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="7c39fc60-a8d7-d9cb-0e1b-7e7f18e1d130")
public static String es_PE_FIELD_BillOfExchange_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c39fc60-a8d7-d9cb-0e1b-7e7f18e1d130")
public static final String FIELDNAME_BillOfExchange_BillOfExchange="7c39fc60-a8d7-d9cb-0e1b-7e7f18e1d130";

@XendraTrl(Identifier="292f1b2b-3bc7-681d-b0c4-844bc5103d4b")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="292f1b2b-3bc7-681d-b0c4-844bc5103d4b",
Synchronized="2017-08-05 16:54:49.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
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

@XendraTrl(Identifier="f4bbbed8-4cf0-fa9c-8b4d-9bcb40cc50d4")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f4bbbed8-4cf0-fa9c-8b4d-9bcb40cc50d4")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="f4bbbed8-4cf0-fa9c-8b4d-9bcb40cc50d4")
public static String es_PE_FIELD_BillOfExchange_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f4bbbed8-4cf0-fa9c-8b4d-9bcb40cc50d4")
public static final String FIELDNAME_BillOfExchange_BusinessPartner="f4bbbed8-4cf0-fa9c-8b4d-9bcb40cc50d4";

@XendraTrl(Identifier="afd30e0c-923c-17f7-f431-6e0081a9a77d")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="afd30e0c-923c-17f7-f431-6e0081a9a77d",
Synchronized="2017-08-05 16:54:49.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID <= 0) set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
 else 
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

@XendraTrl(Identifier="e2d084a6-40e9-9f8b-87a3-3c943449958f")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="e2d084a6-40e9-9f8b-87a3-3c943449958f")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="e2d084a6-40e9-9f8b-87a3-3c943449958f")
public static String es_PE_FIELD_BillOfExchange_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2d084a6-40e9-9f8b-87a3-3c943449958f")
public static final String FIELDNAME_BillOfExchange_PartnerLocation="e2d084a6-40e9-9f8b-87a3-3c943449958f";

@XendraTrl(Identifier="4f058d53-48fe-d775-c070-62446fff8945")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4f058d53-48fe-d775-c070-62446fff8945",Synchronized="2017-08-05 16:54:49.0")
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

@XendraTrl(Identifier="17e19d88-ff5e-a46f-cad2-099bc1670c9a")
public static String es_PE_FIELD_BillOfExchange_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="17e19d88-ff5e-a46f-cad2-099bc1670c9a")
public static String es_PE_FIELD_BillOfExchange_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="17e19d88-ff5e-a46f-cad2-099bc1670c9a")
public static String es_PE_FIELD_BillOfExchange_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17e19d88-ff5e-a46f-cad2-099bc1670c9a")
public static final String FIELDNAME_BillOfExchange_CurrencyType="17e19d88-ff5e-a46f-cad2-099bc1670c9a";

@XendraTrl(Identifier="038b6aa8-e69f-ac83-bfbb-3e945033bb58")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Currency Type";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="038b6aa8-e69f-ac83-bfbb-3e945033bb58",Synchronized="2017-08-05 16:54:49.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID <= 0) set_Value (COLUMNNAME_C_Country_ID, null);
 else 
set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
}
/** Get Country_ID.
@return Country  */
public int getC_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d587497c-dd56-a669-d30e-4cb84f377da8")
public static String es_PE_FIELD_BillOfExchange_Country_ID_Description="País";

@XendraTrl(Identifier="d587497c-dd56-a669-d30e-4cb84f377da8")
public static String es_PE_FIELD_BillOfExchange_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraTrl(Identifier="d587497c-dd56-a669-d30e-4cb84f377da8")
public static String es_PE_FIELD_BillOfExchange_Country_ID_Name="País_codigo";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d587497c-dd56-a669-d30e-4cb84f377da8")
public static final String FIELDNAME_BillOfExchange_Country_ID="d587497c-dd56-a669-d30e-4cb84f377da8";

@XendraTrl(Identifier="42fd3c92-01bb-630b-c749-e754fd7feb71")
public static String es_PE_COLUMN_C_Country_ID_Name="País_codigo";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42fd3c92-01bb-630b-c749-e754fd7feb71",
Synchronized="2017-08-05 16:54:50.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="f14cfd7a-a1c9-1a99-d31a-8ab44ef97174")
public static String es_PE_FIELD_BillOfExchange_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="f14cfd7a-a1c9-1a99-d31a-8ab44ef97174")
public static String es_PE_FIELD_BillOfExchange_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="f14cfd7a-a1c9-1a99-d31a-8ab44ef97174")
public static String es_PE_FIELD_BillOfExchange_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f14cfd7a-a1c9-1a99-d31a-8ab44ef97174")
public static final String FIELDNAME_BillOfExchange_Currency="f14cfd7a-a1c9-1a99-d31a-8ab44ef97174";

@XendraTrl(Identifier="ffdb393c-6079-6201-303f-77d2cadea143")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffdb393c-6079-6201-303f-77d2cadea143",
Synchronized="2017-08-05 16:54:50.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="268ba289-da23-7622-4beb-560d07144be8")
public static String es_PE_FIELD_BillOfExchange_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="268ba289-da23-7622-4beb-560d07144be8")
public static String es_PE_FIELD_BillOfExchange_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="268ba289-da23-7622-4beb-560d07144be8")
public static String es_PE_FIELD_BillOfExchange_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="268ba289-da23-7622-4beb-560d07144be8")
public static final String FIELDNAME_BillOfExchange_DocumentType="268ba289-da23-7622-4beb-560d07144be8";

@XendraTrl(Identifier="9b66e941-e2da-fa3e-e9ad-83c489f40404")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b66e941-e2da-fa3e-e9ad-83c489f40404",
Synchronized="2017-08-05 16:54:50.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

/** C_DocTypeTarget_ID AD_Reference=f06eaf85-a231-e1cf-ebf8-59d002c13ab4 */
public static final int C_DOCTYPETARGET_ID_AD_Reference_ID=170;
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

@XendraTrl(Identifier="dd70f3ae-8a81-b104-39c2-899bc9796691")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType_Description="Tipo de documento destino para convertir documentos";

@XendraTrl(Identifier="dd70f3ae-8a81-b104-39c2-899bc9796691")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType_Help="Usted puede convertir tipos de documento (Ej. Desde ofertas hasta órdenes ó facturas). La conversión es entonces reflejada en el tipo actual. Este proceso es iniciado a través de seleccionar la acción apropiada del documento.";

@XendraTrl(Identifier="dd70f3ae-8a81-b104-39c2-899bc9796691")
public static String es_PE_FIELD_BillOfExchange_TargetDocumentType_Name="Tipo Documento Destino";

@XendraField(AD_Column_ID="C_DocTypeTarget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd70f3ae-8a81-b104-39c2-899bc9796691")
public static final String FIELDNAME_BillOfExchange_TargetDocumentType="dd70f3ae-8a81-b104-39c2-899bc9796691";

@XendraTrl(Identifier="c52fc0bd-4eb9-7e79-9708-836691a8c474")
public static String es_PE_COLUMN_C_DocTypeTarget_ID_Name="Tipo Documento Destino";

@XendraColumn(AD_Element_ID="6dee1e94-d5bf-ba0d-a64a-25cdb5fd9515",ColumnName="C_DocTypeTarget_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="3618c2e5-5c32-687f-83f6-d13e5296d9e4",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c52fc0bd-4eb9-7e79-9708-836691a8c474",
Synchronized="2017-08-05 16:54:50.0")
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

@XendraTrl(Identifier="30e61452-9ded-d15a-a029-ef24eec54ca6")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="C_GroupDoc_ID";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30e61452-9ded-d15a-a029-ef24eec54ca6",
Synchronized="2017-08-05 16:54:50.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
/** Set City.
@param City Identifies a City */
public void setCity (String City)
{
if (City != null && City.length() > 60)
{
log.warning("Length > 60 - truncated");
City = City.substring(0,59);
}
set_Value (COLUMNNAME_City, City);
}
/** Get City.
@return Identifies a City */
public String getCity() 
{
String value = (String)get_Value(COLUMNNAME_City);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="df858f85-000b-cbb9-156d-da33599e0665")
public static String es_PE_FIELD_BillOfExchange_City_Description="Identifica una Ciudad";

@XendraTrl(Identifier="df858f85-000b-cbb9-156d-da33599e0665")
public static String es_PE_FIELD_BillOfExchange_City_Help="La Ciudad identifica una ciudad única para este País ó Región";

@XendraTrl(Identifier="df858f85-000b-cbb9-156d-da33599e0665")
public static String es_PE_FIELD_BillOfExchange_City_Name="Ciudad";

@XendraField(AD_Column_ID="City",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df858f85-000b-cbb9-156d-da33599e0665")
public static final String FIELDNAME_BillOfExchange_City="df858f85-000b-cbb9-156d-da33599e0665";

@XendraTrl(Identifier="1221deb4-f558-62c8-fab0-c7887a80f092")
public static String es_PE_COLUMN_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="968cd06b-d53d-9f3f-cbd5-d393f09a0264",ColumnName="City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1221deb4-f558-62c8-fab0-c7887a80f092",
Synchronized="2017-08-05 16:54:50.0")
/** Column name City */
public static final String COLUMNNAME_City = "City";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID <= 0) set_Value (COLUMNNAME_C_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b8a41be3-39d1-e976-db9b-3939fda5960f")
public static String es_PE_FIELD_BillOfExchange_Address3_Description="Ubicación ó dirección";

@XendraTrl(Identifier="b8a41be3-39d1-e976-db9b-3939fda5960f")
public static String es_PE_FIELD_BillOfExchange_Address3_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="b8a41be3-39d1-e976-db9b-3939fda5960f")
public static String es_PE_FIELD_BillOfExchange_Address3_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8a41be3-39d1-e976-db9b-3939fda5960f")
public static final String FIELDNAME_BillOfExchange_Address3="b8a41be3-39d1-e976-db9b-3939fda5960f";

@XendraTrl(Identifier="34c8e8e2-248a-b19e-5508-25d2ffc928cd")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34c8e8e2-248a-b19e-5508-25d2ffc928cd",
Synchronized="2017-08-05 16:54:50.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Set Contact Name.
@param ContactName Business Partner Contact Name */
public void setContactName (String ContactName)
{
if (ContactName != null && ContactName.length() > 60)
{
log.warning("Length > 60 - truncated");
ContactName = ContactName.substring(0,59);
}
set_Value (COLUMNNAME_ContactName, ContactName);
}
/** Get Contact Name.
@return Business Partner Contact Name */
public String getContactName() 
{
String value = (String)get_Value(COLUMNNAME_ContactName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="162b09c4-71a1-7508-dc5d-be371171f73c")
public static String es_PE_FIELD_BillOfExchange_ContactName_Description="Nombre del contacto del socio";

@XendraTrl(Identifier="162b09c4-71a1-7508-dc5d-be371171f73c")
public static String es_PE_FIELD_BillOfExchange_ContactName_Name="Nombre del Contacto";

@XendraField(AD_Column_ID="ContactName",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="162b09c4-71a1-7508-dc5d-be371171f73c")
public static final String FIELDNAME_BillOfExchange_ContactName="162b09c4-71a1-7508-dc5d-be371171f73c";

@XendraTrl(Identifier="266662c1-fb50-3b09-4dda-caba51dc5aad")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="266662c1-fb50-3b09-4dda-caba51dc5aad",
Synchronized="2017-08-05 16:54:50.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";
/** Set ConversionValue.
@param ConversionValue ConversionValue */
public void setConversionValue (String ConversionValue)
{
if (ConversionValue != null && ConversionValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ConversionValue = ConversionValue.substring(0,39);
}
set_Value (COLUMNNAME_ConversionValue, ConversionValue);
}
/** Get ConversionValue.
@return ConversionValue */
public String getConversionValue() 
{
String value = (String)get_Value(COLUMNNAME_ConversionValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c23aeeab-b8be-9d00-605a-1dff69e190a2")
public static String es_PE_FIELD_BillOfExchange_ConversionValue_Name="ConversionValue";

@XendraField(AD_Column_ID="ConversionValue",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c23aeeab-b8be-9d00-605a-1dff69e190a2")
public static final String FIELDNAME_BillOfExchange_ConversionValue="c23aeeab-b8be-9d00-605a-1dff69e190a2";

@XendraTrl(Identifier="ac8af332-0aee-0c31-a2aa-5ad1f5f58860")
public static String es_PE_COLUMN_ConversionValue_Name="ConversionValue";

@XendraColumn(AD_Element_ID="a2651378-daff-4ce6-1247-dff12f26e1b0",ColumnName="ConversionValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac8af332-0aee-0c31-a2aa-5ad1f5f58860",
Synchronized="2017-08-05 16:54:50.0")
/** Column name ConversionValue */
public static final String COLUMNNAME_ConversionValue = "ConversionValue";
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID <= 0) set_Value (COLUMNNAME_C_Region_ID, null);
 else 
set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
}
/** Get Region.
@return Identifies a geographical Region */
public int getC_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9edb4d84-264f-193d-55e7-7c4a89224123")
public static String es_PE_FIELD_BillOfExchange_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="9edb4d84-264f-193d-55e7-7c4a89224123")
public static String es_PE_FIELD_BillOfExchange_Region_Help="La región indica una región única para este país";

@XendraTrl(Identifier="9edb4d84-264f-193d-55e7-7c4a89224123")
public static String es_PE_FIELD_BillOfExchange_Region_Name="Región";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9edb4d84-264f-193d-55e7-7c4a89224123")
public static final String FIELDNAME_BillOfExchange_Region="9edb4d84-264f-193d-55e7-7c4a89224123";

@XendraTrl(Identifier="da4e2569-bb27-33a2-d4bc-e070532a2c93")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da4e2569-bb27-33a2-d4bc-e070532a2c93",
Synchronized="2017-08-05 16:54:50.0")
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
/** Set Symbol.
@param CurSymbol Symbol of the currency (opt used for printing only) */
public void setCurSymbol (String CurSymbol)
{
if (CurSymbol != null && CurSymbol.length() > 3)
{
log.warning("Length > 3 - truncated");
CurSymbol = CurSymbol.substring(0,2);
}
set_Value (COLUMNNAME_CurSymbol, CurSymbol);
}
/** Get Symbol.
@return Symbol of the currency (opt used for printing only) */
public String getCurSymbol() 
{
String value = (String)get_Value(COLUMNNAME_CurSymbol);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0fc49a3d-73b9-e8c9-a124-4b636b22c75c")
public static String es_PE_FIELD_BillOfExchange_Symbol_Description="Símbolo de la moneda (opción usada sólo para impresión)";

@XendraTrl(Identifier="0fc49a3d-73b9-e8c9-a124-4b636b22c75c")
public static String es_PE_FIELD_BillOfExchange_Symbol_Help="El símbolo de moneda define el símbolo que se imprimirá cuando esta moneda se use.";

@XendraTrl(Identifier="0fc49a3d-73b9-e8c9-a124-4b636b22c75c")
public static String es_PE_FIELD_BillOfExchange_Symbol_Name="Símbolo";

@XendraField(AD_Column_ID="CurSymbol",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=3,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fc49a3d-73b9-e8c9-a124-4b636b22c75c")
public static final String FIELDNAME_BillOfExchange_Symbol="0fc49a3d-73b9-e8c9-a124-4b636b22c75c";

@XendraTrl(Identifier="b9629eba-2edb-f366-4ad5-2205f5ed6648")
public static String es_PE_COLUMN_CurSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="a6544ce7-4bd1-7f2a-84da-823b8e61f86e",ColumnName="CurSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9629eba-2edb-f366-4ad5-2205f5ed6648",
Synchronized="2017-08-05 16:54:50.0")
/** Column name CurSymbol */
public static final String COLUMNNAME_CurSymbol = "CurSymbol";
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

@XendraTrl(Identifier="4d2c4a7f-5051-3d3a-71a9-3be638e03382")
public static String es_PE_FIELD_BillOfExchange_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="4d2c4a7f-5051-3d3a-71a9-3be638e03382")
public static String es_PE_FIELD_BillOfExchange_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="4d2c4a7f-5051-3d3a-71a9-3be638e03382")
public static String es_PE_FIELD_BillOfExchange_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d2c4a7f-5051-3d3a-71a9-3be638e03382")
public static final String FIELDNAME_BillOfExchange_AccountDate="4d2c4a7f-5051-3d3a-71a9-3be638e03382";

@XendraTrl(Identifier="6d0a275d-b4e7-bf27-03ef-17348c13c00f")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d0a275d-b4e7-bf27-03ef-17348c13c00f",
Synchronized="2017-08-05 16:54:50.0")
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

@XendraTrl(Identifier="791ee7f6-f9c6-7be4-aebd-43779b2418fa")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate_Description="Fecha de la Letra de Cambio";

@XendraTrl(Identifier="791ee7f6-f9c6-7be4-aebd-43779b2418fa")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate_Help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.";

@XendraTrl(Identifier="791ee7f6-f9c6-7be4-aebd-43779b2418fa")
public static String es_PE_FIELD_BillOfExchange_BillOfExchangeDate_Name="Fecha de la Letra de Cambio";

@XendraField(AD_Column_ID="DateBOE",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="791ee7f6-f9c6-7be4-aebd-43779b2418fa")
public static final String FIELDNAME_BillOfExchange_BillOfExchangeDate="791ee7f6-f9c6-7be4-aebd-43779b2418fa";

@XendraTrl(Identifier="c51085bb-691a-b18f-d44e-2029272ffc26")
public static String es_PE_COLUMN_DateBOE_Name="Fecha de la Letra de Cambio";

@XendraColumn(AD_Element_ID="ca3fdb3d-2d28-4b77-a7fa-22bc925a41e1",ColumnName="DateBOE",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c51085bb-691a-b18f-d44e-2029272ffc26",
Synchronized="2017-08-05 16:54:50.0")
/** Column name DateBOE */
public static final String COLUMNNAME_DateBOE = "DateBOE";
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

@XendraTrl(Identifier="c181390b-9c6d-60c8-9879-58074a915436")
public static String es_PE_FIELD_BillOfExchange_DateStatusBOE_Name="Fecha del Estado de la letra de cambio";

@XendraField(AD_Column_ID="DateStatusBOE",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c181390b-9c6d-60c8-9879-58074a915436")
public static final String FIELDNAME_BillOfExchange_DateStatusBOE="c181390b-9c6d-60c8-9879-58074a915436";

@XendraTrl(Identifier="f4154b02-3110-9462-d610-02ecd0b56b09")
public static String es_PE_COLUMN_DateStatusBOE_Name="Fecha del Estado de la letra de cambio";

@XendraColumn(AD_Element_ID="79aaa829-9ecf-78d3-22fa-4bb8761d8889",ColumnName="DateStatusBOE",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4154b02-3110-9462-d610-02ecd0b56b09",
Synchronized="2017-08-05 16:54:50.0")
/** Column name DateStatusBOE */
public static final String COLUMNNAME_DateStatusBOE = "DateStatusBOE";
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

@XendraTrl(Identifier="750f0ce2-4505-f476-770b-cf3ca1ddb304")
public static String es_PE_FIELD_BillOfExchange_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="750f0ce2-4505-f476-770b-cf3ca1ddb304")
public static String es_PE_FIELD_BillOfExchange_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="750f0ce2-4505-f476-770b-cf3ca1ddb304")
public static String es_PE_FIELD_BillOfExchange_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="750f0ce2-4505-f476-770b-cf3ca1ddb304")
public static final String FIELDNAME_BillOfExchange_Description="750f0ce2-4505-f476-770b-cf3ca1ddb304";

@XendraTrl(Identifier="70dca11d-8ecf-a85a-e841-d51285d35699")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70dca11d-8ecf-a85a-e841-d51285d35699",
Synchronized="2017-08-05 16:54:50.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null || DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction != null && DocAction.length() > 2)
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

@XendraTrl(Identifier="e27f88d8-3df6-ce9e-a933-f8c6d87b0204")
public static String es_PE_FIELD_BillOfExchange_DocumentAction_Description="El estado destino del documento";

@XendraTrl(Identifier="e27f88d8-3df6-ce9e-a933-f8c6d87b0204")
public static String es_PE_FIELD_BillOfExchange_DocumentAction_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraTrl(Identifier="e27f88d8-3df6-ce9e-a933-f8c6d87b0204")
public static String es_PE_FIELD_BillOfExchange_DocumentAction_Name="Acción en el Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e27f88d8-3df6-ce9e-a933-f8c6d87b0204")
public static final String FIELDNAME_BillOfExchange_DocumentAction="e27f88d8-3df6-ce9e-a933-f8c6d87b0204";

@XendraTrl(Identifier="33f92e02-1c03-3324-58ef-3e9fd73e5079")
public static String es_PE_COLUMN_DocAction_Name="Document Action";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=17,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="33f92e02-1c03-3324-58ef-3e9fd73e5079",Synchronized="2017-08-05 16:54:50.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null || DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (DocStatus != null && DocStatus.length() > 2)
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

@XendraTrl(Identifier="04e0e726-d7f7-6c5b-171e-986ecff8ff58")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="04e0e726-d7f7-6c5b-171e-986ecff8ff58")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="04e0e726-d7f7-6c5b-171e-986ecff8ff58")
public static String es_PE_FIELD_BillOfExchange_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04e0e726-d7f7-6c5b-171e-986ecff8ff58")
public static final String FIELDNAME_BillOfExchange_DocumentStatus="04e0e726-d7f7-6c5b-171e-986ecff8ff58";

@XendraTrl(Identifier="2c9c1528-2713-ec88-a55a-110d29d95933")
public static String es_PE_COLUMN_DocStatus_Name="Document Status";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2c9c1528-2713-ec88-a55a-110d29d95933",Synchronized="2017-08-05 16:54:50.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document Type Name.
@param DocTypeName Name of the Document Type */
public void setDocTypeName (String DocTypeName)
{
if (DocTypeName != null && DocTypeName.length() > 60)
{
log.warning("Length > 60 - truncated");
DocTypeName = DocTypeName.substring(0,59);
}
set_Value (COLUMNNAME_DocTypeName, DocTypeName);
}
/** Get Document Type Name.
@return Name of the Document Type */
public String getDocTypeName() 
{
String value = (String)get_Value(COLUMNNAME_DocTypeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="34181ca6-62cf-f126-0fb7-00ba1b569a57")
public static String es_PE_FIELD_BillOfExchange_DocumentTypeName_Description="Nombre del tipo de documento";

@XendraTrl(Identifier="34181ca6-62cf-f126-0fb7-00ba1b569a57")
public static String es_PE_FIELD_BillOfExchange_DocumentTypeName_Name="Nombre del Tipo de Documento";

@XendraField(AD_Column_ID="DocTypeName",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34181ca6-62cf-f126-0fb7-00ba1b569a57")
public static final String FIELDNAME_BillOfExchange_DocumentTypeName="34181ca6-62cf-f126-0fb7-00ba1b569a57";

@XendraTrl(Identifier="1ae17255-ab22-a0fd-5d81-0e91d88e690d")
public static String es_PE_COLUMN_DocTypeName_Name="Nombre del Tipo de Documento";

@XendraColumn(AD_Element_ID="af613457-d4ac-9b3e-87a0-02ba8501326b",ColumnName="DocTypeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ae17255-ab22-a0fd-5d81-0e91d88e690d",
Synchronized="2017-08-05 16:54:50.0")
/** Column name DocTypeName */
public static final String COLUMNNAME_DocTypeName = "DocTypeName";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
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
@XendraTrl(Identifier="82b89987-9df1-1c87-64d7-d5c328db5a98")
public static String es_PE_FIELD_BillOfExchange_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="82b89987-9df1-1c87-64d7-d5c328db5a98")
public static String es_PE_FIELD_BillOfExchange_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="82b89987-9df1-1c87-64d7-d5c328db5a98")
public static String es_PE_FIELD_BillOfExchange_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82b89987-9df1-1c87-64d7-d5c328db5a98")
public static final String FIELDNAME_BillOfExchange_DocumentNo="82b89987-9df1-1c87-64d7-d5c328db5a98";

@XendraTrl(Identifier="61ac750b-cb62-186c-4d07-62b7f284241e")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61ac750b-cb62-186c-4d07-62b7f284241e",
Synchronized="2017-08-05 16:54:50.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Due Date.
@param DueDate Date when the payment is due */
public void setDueDate (Timestamp DueDate)
{
set_Value (COLUMNNAME_DueDate, DueDate);
}
/** Get Due Date.
@return Date when the payment is due */
public Timestamp getDueDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DueDate);
}

@XendraTrl(Identifier="cb672080-2652-5bb5-41ae-9a88d9d32745")
public static String es_PE_FIELD_BillOfExchange_DueDate_Description="Fecha cuando el pago es vencido.";

@XendraTrl(Identifier="cb672080-2652-5bb5-41ae-9a88d9d32745")
public static String es_PE_FIELD_BillOfExchange_DueDate_Help="Fecha cuando el pago es vencido sin deducciones ó descuento";

@XendraTrl(Identifier="cb672080-2652-5bb5-41ae-9a88d9d32745")
public static String es_PE_FIELD_BillOfExchange_DueDate_Name="Fecha de Vencimiento";

@XendraField(AD_Column_ID="DueDate",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb672080-2652-5bb5-41ae-9a88d9d32745")
public static final String FIELDNAME_BillOfExchange_DueDate="cb672080-2652-5bb5-41ae-9a88d9d32745";

@XendraTrl(Identifier="57752ddd-277c-70e5-cb07-35bb66d0999e")
public static String es_PE_COLUMN_DueDate_Name="Fecha de Vencimiento";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57752ddd-277c-70e5-cb07-35bb66d0999e",
Synchronized="2017-08-05 16:54:50.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d4c8e915-9791-7907-5d45-d076ad420860")
public static String es_PE_FIELD_BillOfExchange_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="d4c8e915-9791-7907-5d45-d076ad420860")
public static String es_PE_FIELD_BillOfExchange_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraTrl(Identifier="d4c8e915-9791-7907-5d45-d076ad420860")
public static String es_PE_FIELD_BillOfExchange_EMailAddress_Name="Email";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4c8e915-9791-7907-5d45-d076ad420860")
public static final String FIELDNAME_BillOfExchange_EMailAddress="d4c8e915-9791-7907-5d45-d076ad420860";

@XendraTrl(Identifier="2a6d80a5-d58c-1ba1-26b1-16b513232bd1")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a6d80a5-d58c-1ba1-26b1-16b513232bd1",
Synchronized="2017-08-05 16:54:50.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
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

@XendraTrl(Identifier="3f3d14d4-b62f-2622-9863-75c81ffb575b")
public static String es_PE_FIELD_BillOfExchange_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="3f3d14d4-b62f-2622-9863-75c81ffb575b")
public static String es_PE_FIELD_BillOfExchange_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraTrl(Identifier="3f3d14d4-b62f-2622-9863-75c81ffb575b")
public static String es_PE_FIELD_BillOfExchange_GrandTotal_Name="Gran Total";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f3d14d4-b62f-2622-9863-75c81ffb575b")
public static final String FIELDNAME_BillOfExchange_GrandTotal="3f3d14d4-b62f-2622-9863-75c81ffb575b";

@XendraTrl(Identifier="90270c37-1c84-764a-a3cf-21f07d74f204")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90270c37-1c84-764a-a3cf-21f07d74f204",
Synchronized="2017-08-05 16:54:50.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";

/** Guarantor_ID AD_Reference=3e4406f7-96ab-1533-375a-4f34b79f0576 */
public static final int GUARANTOR_ID_AD_Reference_ID=173;
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

@XendraTrl(Identifier="a6c96a96-8c68-0255-b96c-1fbb00c1368c")
public static String es_PE_FIELD_BillOfExchange_Guarantor_ID_Name="Garante";

@XendraField(AD_Column_ID="Guarantor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="Guarantor",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6c96a96-8c68-0255-b96c-1fbb00c1368c")
public static final String FIELDNAME_BillOfExchange_Guarantor_ID="a6c96a96-8c68-0255-b96c-1fbb00c1368c";

@XendraTrl(Identifier="da547106-35b1-a246-6a16-566951579f82")
public static String es_PE_COLUMN_Guarantor_ID_Name="Garante";

@XendraColumn(AD_Element_ID="b66e5d12-c647-ca0a-6667-1fce3c535ef4",ColumnName="Guarantor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="3e4406f7-96ab-1533-375a-4f34b79f0576",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="da547106-35b1-a246-6a16-566951579f82",Synchronized="2017-08-05 16:54:50.0")
/** Column name Guarantor_ID */
public static final String COLUMNNAME_Guarantor_ID = "Guarantor_ID";
/** Set GuarantorValue.
@param GuarantorValue GuarantorValue */
public void setGuarantorValue (String GuarantorValue)
{
if (GuarantorValue != null && GuarantorValue.length() > 40)
{
log.warning("Length > 40 - truncated");
GuarantorValue = GuarantorValue.substring(0,39);
}
set_Value (COLUMNNAME_GuarantorValue, GuarantorValue);
}
/** Get GuarantorValue.
@return GuarantorValue */
public String getGuarantorValue() 
{
String value = (String)get_Value(COLUMNNAME_GuarantorValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="06b88a24-9f12-22ac-e41f-09e55ccc6cf8")
public static String es_PE_FIELD_BillOfExchange_GuarantorValue_Name="GuarantorValue";

@XendraField(AD_Column_ID="GuarantorValue",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06b88a24-9f12-22ac-e41f-09e55ccc6cf8")
public static final String FIELDNAME_BillOfExchange_GuarantorValue="06b88a24-9f12-22ac-e41f-09e55ccc6cf8";

@XendraTrl(Identifier="16d7cd79-dce9-0b36-6a99-66a5b0112368")
public static String es_PE_COLUMN_GuarantorValue_Name="GuarantorValue";

@XendraColumn(AD_Element_ID="ba95a3bf-1e06-9201-9bae-cb28e1038250",ColumnName="GuarantorValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16d7cd79-dce9-0b36-6a99-66a5b0112368",
Synchronized="2017-08-05 16:54:50.0")
/** Column name GuarantorValue */
public static final String COLUMNNAME_GuarantorValue = "GuarantorValue";
/** Set Import Bill Of Exchange.
@param I_BOE_ID Import Bill Of Exchange */
public void setI_BOE_ID (int I_BOE_ID)
{
if (I_BOE_ID < 1) throw new IllegalArgumentException ("I_BOE_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_BOE_ID, Integer.valueOf(I_BOE_ID));
}
/** Get Import Bill Of Exchange.
@return Import Bill Of Exchange */
public int getI_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="34ecf8f3-2c5e-aefc-f505-5f4e94eb1723")
public static String es_PE_FIELD_BillOfExchange_ImportBillOfExchange_Description="Importar Letra de Cambio";

@XendraTrl(Identifier="34ecf8f3-2c5e-aefc-f505-5f4e94eb1723")
public static String es_PE_FIELD_BillOfExchange_ImportBillOfExchange_Help="Importar Letra de Cambio";

@XendraTrl(Identifier="34ecf8f3-2c5e-aefc-f505-5f4e94eb1723")
public static String es_PE_FIELD_BillOfExchange_ImportBillOfExchange_Name="Importar Letra de Cambio";

@XendraField(AD_Column_ID="I_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34ecf8f3-2c5e-aefc-f505-5f4e94eb1723")
public static final String FIELDNAME_BillOfExchange_ImportBillOfExchange="34ecf8f3-2c5e-aefc-f505-5f4e94eb1723";
/** Column name I_BOE_ID */
public static final String COLUMNNAME_I_BOE_ID = "I_BOE_ID";
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
@XendraTrl(Identifier="c1a24b88-a385-4770-835c-d1f5e08e1328")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1a24b88-a385-4770-835c-d1f5e08e1328",
Synchronized="2017-08-05 16:54:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9a21d5a5-8c41-7c7d-8b3c-b49acacc6081")
public static String es_PE_FIELD_BillOfExchange_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="9a21d5a5-8c41-7c7d-8b3c-b49acacc6081")
public static String es_PE_FIELD_BillOfExchange_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraTrl(Identifier="9a21d5a5-8c41-7c7d-8b3c-b49acacc6081")
public static String es_PE_FIELD_BillOfExchange_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a21d5a5-8c41-7c7d-8b3c-b49acacc6081")
public static final String FIELDNAME_BillOfExchange_ImportErrorMessage="9a21d5a5-8c41-7c7d-8b3c-b49acacc6081";

@XendraTrl(Identifier="5c67543a-8e7d-09f7-33d9-c2c757da7375")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c67543a-8e7d-09f7-33d9-c2c757da7375",
Synchronized="2017-08-05 16:54:50.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cf32375c-c432-af4b-c5c0-117c42ffa571")
public static String es_PE_FIELD_BillOfExchange_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="cf32375c-c432-af4b-c5c0-117c42ffa571")
public static String es_PE_FIELD_BillOfExchange_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraTrl(Identifier="cf32375c-c432-af4b-c5c0-117c42ffa571")
public static String es_PE_FIELD_BillOfExchange_Imported_Name="Importar";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf32375c-c432-af4b-c5c0-117c42ffa571")
public static final String FIELDNAME_BillOfExchange_Imported="cf32375c-c432-af4b-c5c0-117c42ffa571";

@XendraTrl(Identifier="ece68d0b-e739-0714-db45-ddb3085acbad")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ece68d0b-e739-0714-db45-ddb3085acbad",
Synchronized="2017-08-05 16:54:50.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
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

@XendraTrl(Identifier="5fe14dc1-ea19-ea6c-4228-e283f181fe4e")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="5fe14dc1-ea19-ea6c-4228-e283f181fe4e")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="5fe14dc1-ea19-ea6c-4228-e283f181fe4e")
public static String es_PE_FIELD_BillOfExchange_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fe14dc1-ea19-ea6c-4228-e283f181fe4e")
public static final String FIELDNAME_BillOfExchange_SalesTransaction="5fe14dc1-ea19-ea6c-4228-e283f181fe4e";

@XendraTrl(Identifier="3bc117b8-a147-2eb7-e507-6f9e50046a79")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bc117b8-a147-2eb7-e507-6f9e50046a79",
Synchronized="2017-08-05 16:54:50.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="e017194f-38af-9f85-98f9-fa47aaa9ce5a")
public static String es_PE_FIELD_BillOfExchange_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e017194f-38af-9f85-98f9-fa47aaa9ce5a")
public static String es_PE_FIELD_BillOfExchange_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="e017194f-38af-9f85-98f9-fa47aaa9ce5a")
public static String es_PE_FIELD_BillOfExchange_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e017194f-38af-9f85-98f9-fa47aaa9ce5a")
public static final String FIELDNAME_BillOfExchange_Name="e017194f-38af-9f85-98f9-fa47aaa9ce5a";

@XendraTrl(Identifier="eeae133a-c24e-1b96-e175-4f107a365d4f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eeae133a-c24e-1b96-e175-4f107a365d4f",
Synchronized="2017-08-05 16:54:50.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Phone.
@param Phone Identifies a telephone number */
public void setPhone (String Phone)
{
if (Phone != null && Phone.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone = Phone.substring(0,39);
}
set_Value (COLUMNNAME_Phone, Phone);
}
/** Get Phone.
@return Identifies a telephone number */
public String getPhone() 
{
String value = (String)get_Value(COLUMNNAME_Phone);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="16906e4e-ff4c-c045-808a-1c1388b1ff59")
public static String es_PE_FIELD_BillOfExchange_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="16906e4e-ff4c-c045-808a-1c1388b1ff59")
public static String es_PE_FIELD_BillOfExchange_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraTrl(Identifier="16906e4e-ff4c-c045-808a-1c1388b1ff59")
public static String es_PE_FIELD_BillOfExchange_Phone_Name="Teléfono";

@XendraField(AD_Column_ID="Phone",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16906e4e-ff4c-c045-808a-1c1388b1ff59")
public static final String FIELDNAME_BillOfExchange_Phone="16906e4e-ff4c-c045-808a-1c1388b1ff59";

@XendraTrl(Identifier="254407a9-f3de-c1dc-5648-7ad75348ee5f")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="254407a9-f3de-c1dc-5648-7ad75348ee5f",
Synchronized="2017-08-05 16:54:50.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";
/** Set ZIP.
@param Postal Postal code */
public void setPostal (String Postal)
{
if (Postal != null && Postal.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal = Postal.substring(0,9);
}
set_Value (COLUMNNAME_Postal, Postal);
}
/** Get ZIP.
@return Postal code */
public String getPostal() 
{
String value = (String)get_Value(COLUMNNAME_Postal);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="20d31776-3f96-ee4d-8c4d-cccd52a8afaf")
public static String es_PE_FIELD_BillOfExchange_ZIP_Description="Código Postal";

@XendraTrl(Identifier="20d31776-3f96-ee4d-8c4d-cccd52a8afaf")
public static String es_PE_FIELD_BillOfExchange_ZIP_Help="El campo Código Postal identifica el código postal para esta entidad";

@XendraTrl(Identifier="20d31776-3f96-ee4d-8c4d-cccd52a8afaf")
public static String es_PE_FIELD_BillOfExchange_ZIP_Name="Código Postal";

@XendraField(AD_Column_ID="Postal",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20d31776-3f96-ee4d-8c4d-cccd52a8afaf")
public static final String FIELDNAME_BillOfExchange_ZIP="20d31776-3f96-ee4d-8c4d-cccd52a8afaf";

@XendraTrl(Identifier="7eb5fc04-46ce-fbf6-1085-dfc9d6ce2de4")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7eb5fc04-46ce-fbf6-1085-dfc9d6ce2de4",
Synchronized="2017-08-05 16:54:50.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";
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

@XendraTrl(Identifier="b7a09c2c-bc5b-de3e-6c0b-b9fd8ed4a616")
public static String es_PE_FIELD_BillOfExchange_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b7a09c2c-bc5b-de3e-6c0b-b9fd8ed4a616")
public static String es_PE_FIELD_BillOfExchange_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b7a09c2c-bc5b-de3e-6c0b-b9fd8ed4a616")
public static String es_PE_FIELD_BillOfExchange_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7a09c2c-bc5b-de3e-6c0b-b9fd8ed4a616")
public static final String FIELDNAME_BillOfExchange_Processed="b7a09c2c-bc5b-de3e-6c0b-b9fd8ed4a616";

@XendraTrl(Identifier="0b4632fe-ec33-b8b8-40a1-eb4af1b756cc")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b4632fe-ec33-b8b8-40a1-eb4af1b756cc",
Synchronized="2017-08-05 16:54:50.0")
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

@XendraTrl(Identifier="19f0f9c9-7927-56da-2c75-2910fda1a946")
public static String es_PE_FIELD_BillOfExchange_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19f0f9c9-7927-56da-2c75-2910fda1a946")
public static final String FIELDNAME_BillOfExchange_ProcessNow="19f0f9c9-7927-56da-2c75-2910fda1a946";

@XendraTrl(Identifier="64026b79-08b7-c366-e6cd-9a39bf61d79d")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="15793ed7-2ba8-c7b3-9083-6dc0ef815e80",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="64026b79-08b7-c366-e6cd-9a39bf61d79d",Synchronized="2017-08-05 16:54:50.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Document Status Bill Of Exchange.
@param StatusBOE The current status of the document Bill Of Exchange */
public void setStatusBOE (String StatusBOE)
{
if (StatusBOE != null && StatusBOE.length() > 2)
{
log.warning("Length > 2 - truncated");
StatusBOE = StatusBOE.substring(0,1);
}
set_Value (COLUMNNAME_StatusBOE, StatusBOE);
}
/** Get Document Status Bill Of Exchange.
@return The current status of the document Bill Of Exchange */
public String getStatusBOE() 
{
String value = (String)get_Value(COLUMNNAME_StatusBOE);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="878e2559-6d5c-b7cb-9cc5-dbd8db1c6642")
public static String es_PE_FIELD_BillOfExchange_DocumentStatusBillOfExchange_Description="The current status of the document Bill Of Exchange";

@XendraTrl(Identifier="878e2559-6d5c-b7cb-9cc5-dbd8db1c6642")
public static String es_PE_FIELD_BillOfExchange_DocumentStatusBillOfExchange_Help="The Document Status indicates the status of a document at this time.  If you want to change the document status, use the Document Action field";

@XendraTrl(Identifier="878e2559-6d5c-b7cb-9cc5-dbd8db1c6642")
public static String es_PE_FIELD_BillOfExchange_DocumentStatusBillOfExchange_Name="Documento del Estado de la Letra de Cambio";

@XendraField(AD_Column_ID="StatusBOE",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="878e2559-6d5c-b7cb-9cc5-dbd8db1c6642")
public static final String FIELDNAME_BillOfExchange_DocumentStatusBillOfExchange="878e2559-6d5c-b7cb-9cc5-dbd8db1c6642";

@XendraTrl(Identifier="5abe665f-3df8-cece-6e6e-e807099ed1f8")
public static String es_PE_COLUMN_StatusBOE_Name="Documento del Estado de la Letra de Cambio";

@XendraColumn(AD_Element_ID="dd096f30-2210-2518-eb4b-2186108aceed",ColumnName="StatusBOE",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5abe665f-3df8-cece-6e6e-e807099ed1f8",
Synchronized="2017-08-05 16:54:50.0")
/** Column name StatusBOE */
public static final String COLUMNNAME_StatusBOE = "StatusBOE";
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

@XendraTrl(Identifier="7104acc5-77f4-79f2-b7db-19e21563066a")
public static String es_PE_FIELD_BillOfExchange_StatusDate_Name="STATUSDATE";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="c734c119-1eab-f1df-c315-c797a5811fdf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7104acc5-77f4-79f2-b7db-19e21563066a")
public static final String FIELDNAME_BillOfExchange_StatusDate="7104acc5-77f4-79f2-b7db-19e21563066a";

@XendraTrl(Identifier="54b36d94-d788-e160-a9ad-633c3c2c9b80")
public static String es_PE_COLUMN_StatusDate_Name="StatusDate";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54b36d94-d788-e160-a9ad-633c3c2c9b80",
Synchronized="2017-08-05 16:54:50.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";
}
