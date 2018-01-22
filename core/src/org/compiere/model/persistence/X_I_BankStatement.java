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
import org.compiere.model.reference.REF_C_PaymentTrxType;
/** Generated Model for I_BankStatement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_BankStatement extends PO
{
/** Standard Constructor
@param ctx context
@param I_BankStatement_ID id
@param trxName transaction
*/
public X_I_BankStatement (Properties ctx, int I_BankStatement_ID, String trxName)
{
super (ctx, I_BankStatement_ID, trxName);
/** if (I_BankStatement_ID == 0)
{
setI_BankStatement_ID (0);
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
public X_I_BankStatement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=600 */
public static int Table_ID=MTable.getTable_ID("I_BankStatement");

@XendraTrl(Identifier="b3741935-d841-28c8-a36c-0319b03c69a5")
public static String es_PE_TAB_BankStatement_Description="Importación del estado de cuenta";

@XendraTrl(Identifier="b3741935-d841-28c8-a36c-0319b03c69a5")
public static String es_PE_TAB_BankStatement_Name="Estado de Cuenta";

@XendraTab(Name="Bank Statement",Description="Import Bank Statement",Help="",
AD_Window_ID="d4e2a770-d8ee-cb74-4184-7a78896ca99b",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b3741935-d841-28c8-a36c-0319b03c69a5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BankStatement="b3741935-d841-28c8-a36c-0319b03c69a5";

@XendraTrl(Identifier="f35f14b7-e91b-db75-0b6a-cd3fa0129402")
public static String es_PE_TABLE_I_BankStatement_Name="Importar Extractos de Cuenta";

@XendraTable(Name="Import Bank Statement",Description="Import of the Bank Statement",Help="",
TableName="I_BankStatement",AccessLevel="2",AD_Window_ID="d4e2a770-d8ee-cb74-4184-7a78896ca99b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="f35f14b7-e91b-db75-0b6a-cd3fa0129402",Synchronized="2017-08-16 11:42:51.0")
/** TableName=I_BankStatement */
public static final String Table_Name="I_BankStatement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_BankStatement");

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
    Table_ID = MTable.getTable_ID("I_BankStatement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_BankStatement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bank Account No.
@param BankAccountNo Bank Account Number */
public void setBankAccountNo (String BankAccountNo)
{
if (BankAccountNo != null && BankAccountNo.length() > 20)
{
log.warning("Length > 20 - truncated");
BankAccountNo = BankAccountNo.substring(0,19);
}
set_Value (COLUMNNAME_BankAccountNo, BankAccountNo);
}
/** Get Bank Account No.
@return Bank Account Number */
public String getBankAccountNo() 
{
String value = (String)get_Value(COLUMNNAME_BankAccountNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9218e356-472d-e7d9-0fbf-f3b603273398")
public static String es_PE_FIELD_BankStatement_BankAccountNo_Description="No. de Cuenta Bancaria";

@XendraTrl(Identifier="9218e356-472d-e7d9-0fbf-f3b603273398")
public static String es_PE_FIELD_BankStatement_BankAccountNo_Name="No. de Cuenta Bancaria";

@XendraField(AD_Column_ID="BankAccountNo",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9218e356-472d-e7d9-0fbf-f3b603273398")
public static final String FIELDNAME_BankStatement_BankAccountNo="9218e356-472d-e7d9-0fbf-f3b603273398";

@XendraTrl(Identifier="7d859127-102e-2bea-0608-52a44ce10516")
public static String es_PE_COLUMN_BankAccountNo_Name="No. de Cuenta Bancaria";

@XendraColumn(AD_Element_ID="ec47c905-09fa-8d51-ed8a-2c042d48e359",ColumnName="BankAccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d859127-102e-2bea-0608-52a44ce10516",
Synchronized="2017-08-05 16:54:48.0")
/** Column name BankAccountNo */
public static final String COLUMNNAME_BankAccountNo = "BankAccountNo";
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
@XendraTrl(Identifier="6c4c3406-17cf-8f5c-c1d5-74e4fa32edfa")
public static String es_PE_FIELD_BankStatement_BusinessPartnerKey_Description="Clave para el S.N.";

@XendraTrl(Identifier="6c4c3406-17cf-8f5c-c1d5-74e4fa32edfa")
public static String es_PE_FIELD_BankStatement_BusinessPartnerKey_Name="Clave de S.N.";

@XendraField(AD_Column_ID="BPartnerValue",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=310,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6c4c3406-17cf-8f5c-c1d5-74e4fa32edfa")
public static final String FIELDNAME_BankStatement_BusinessPartnerKey="6c4c3406-17cf-8f5c-c1d5-74e4fa32edfa";

@XendraTrl(Identifier="0341f686-7629-adf6-b4a2-09c35a74cc7c")
public static String es_PE_COLUMN_BPartnerValue_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="8128a796-0c52-a502-d53b-7f4fe35f5f78",ColumnName="BPartnerValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0341f686-7629-adf6-b4a2-09c35a74cc7c",
Synchronized="2017-08-05 16:54:48.0")
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

@XendraTrl(Identifier="90df2142-66fe-70cb-643d-faa05b590c55")
public static String es_PE_FIELD_BankStatement_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="90df2142-66fe-70cb-643d-faa05b590c55")
public static String es_PE_FIELD_BankStatement_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="90df2142-66fe-70cb-643d-faa05b590c55")
public static String es_PE_FIELD_BankStatement_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90df2142-66fe-70cb-643d-faa05b590c55")
public static final String FIELDNAME_BankStatement_BankAccount="90df2142-66fe-70cb-643d-faa05b590c55";

@XendraTrl(Identifier="0dbeace7-bb01-fd6c-055e-098ac7a2a781")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dbeace7-bb01-fd6c-055e-098ac7a2a781",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Bank Statement.
@param C_BankStatement_ID Bank Statement of account */
public void setC_BankStatement_ID (int C_BankStatement_ID)
{
if (C_BankStatement_ID <= 0) set_Value (COLUMNNAME_C_BankStatement_ID, null);
 else 
set_Value (COLUMNNAME_C_BankStatement_ID, Integer.valueOf(C_BankStatement_ID));
}
/** Get Bank Statement.
@return Bank Statement of account */
public int getC_BankStatement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="431d9040-9eab-7af3-ff87-89861142ce78")
public static String es_PE_FIELD_BankStatement_BankStatement_Description="Balance bancario de la cuenta";

@XendraTrl(Identifier="431d9040-9eab-7af3-ff87-89861142ce78")
public static String es_PE_FIELD_BankStatement_BankStatement_Help="El balance bancario identifica un balance único para un período de tiempo definido. El balance lista todas las transacciones que han ocurrido";

@XendraTrl(Identifier="431d9040-9eab-7af3-ff87-89861142ce78")
public static String es_PE_FIELD_BankStatement_BankStatement_Name="Balance Bancario";

@XendraField(AD_Column_ID="C_BankStatement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="431d9040-9eab-7af3-ff87-89861142ce78")
public static final String FIELDNAME_BankStatement_BankStatement="431d9040-9eab-7af3-ff87-89861142ce78";

@XendraTrl(Identifier="70755302-cda5-a94a-76be-112871fd8ae6")
public static String es_PE_COLUMN_C_BankStatement_ID_Name="Balance Bancario";

@XendraColumn(AD_Element_ID="8105d871-aa63-d678-57d6-1450c5b5d3d4",ColumnName="C_BankStatement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70755302-cda5-a94a-76be-112871fd8ae6",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_BankStatement_ID */
public static final String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
/** Set Bank statement line.
@param C_BankStatementLine_ID Line on a statement from this Bank */
public void setC_BankStatementLine_ID (int C_BankStatementLine_ID)
{
if (C_BankStatementLine_ID <= 0) set_Value (COLUMNNAME_C_BankStatementLine_ID, null);
 else 
set_Value (COLUMNNAME_C_BankStatementLine_ID, Integer.valueOf(C_BankStatementLine_ID));
}
/** Get Bank statement line.
@return Line on a statement from this Bank */
public int getC_BankStatementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b4b115a7-dddc-d9ac-609d-1dbdd3191a81")
public static String es_PE_FIELD_BankStatement_BankStatementLine_Description="Item del estado de cuenta de este banco";

@XendraTrl(Identifier="b4b115a7-dddc-d9ac-609d-1dbdd3191a81")
public static String es_PE_FIELD_BankStatement_BankStatementLine_Help="Identifica una transacción única (Pagos; retiros; cargos) para el período de tiempo definido en este banco.";

@XendraTrl(Identifier="b4b115a7-dddc-d9ac-609d-1dbdd3191a81")
public static String es_PE_FIELD_BankStatement_BankStatementLine_Name="Item de Estado de Cuenta";

@XendraField(AD_Column_ID="C_BankStatementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4b115a7-dddc-d9ac-609d-1dbdd3191a81")
public static final String FIELDNAME_BankStatement_BankStatementLine="b4b115a7-dddc-d9ac-609d-1dbdd3191a81";

@XendraTrl(Identifier="eef2d0a7-acc1-ba28-a4bb-9ff71de1086b")
public static String es_PE_COLUMN_C_BankStatementLine_ID_Name="Línea de Estado de Cuenta";

@XendraColumn(AD_Element_ID="82832f67-d64e-763b-f9f5-f848316e66d5",
ColumnName="C_BankStatementLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="eef2d0a7-acc1-ba28-a4bb-9ff71de1086b",Synchronized="2017-08-05 16:54:48.0")
/** Column name C_BankStatementLine_ID */
public static final String COLUMNNAME_C_BankStatementLine_ID = "C_BankStatementLine_ID";
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

@XendraTrl(Identifier="e994d464-b9a1-bcd0-9cd1-01065a7e448e")
public static String es_PE_FIELD_BankStatement_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="e994d464-b9a1-bcd0-9cd1-01065a7e448e")
public static String es_PE_FIELD_BankStatement_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="e994d464-b9a1-bcd0-9cd1-01065a7e448e")
public static String es_PE_FIELD_BankStatement_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e994d464-b9a1-bcd0-9cd1-01065a7e448e")
public static final String FIELDNAME_BankStatement_BusinessPartner="e994d464-b9a1-bcd0-9cd1-01065a7e448e";

@XendraTrl(Identifier="a663d20b-91e4-52cd-d5e7-2832997c66fc")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a663d20b-91e4-52cd-d5e7-2832997c66fc",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="29e55a1c-f7de-f3df-d324-a886eaed97d7")
public static String es_PE_FIELD_BankStatement_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="29e55a1c-f7de-f3df-d324-a886eaed97d7")
public static String es_PE_FIELD_BankStatement_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="29e55a1c-f7de-f3df-d324-a886eaed97d7")
public static String es_PE_FIELD_BankStatement_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29e55a1c-f7de-f3df-d324-a886eaed97d7")
public static final String FIELDNAME_BankStatement_Charge="29e55a1c-f7de-f3df-d324-a886eaed97d7";

@XendraTrl(Identifier="20a88d5a-7bd8-840c-b748-ae0cdadec08c")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20a88d5a-7bd8-840c-b748-ae0cdadec08c",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="9cdb6057-8224-f4a4-75b3-d04a3eb03f20")
public static String es_PE_FIELD_BankStatement_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9cdb6057-8224-f4a4-75b3-d04a3eb03f20")
public static String es_PE_FIELD_BankStatement_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="9cdb6057-8224-f4a4-75b3-d04a3eb03f20")
public static String es_PE_FIELD_BankStatement_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cdb6057-8224-f4a4-75b3-d04a3eb03f20")
public static final String FIELDNAME_BankStatement_Currency="9cdb6057-8224-f4a4-75b3-d04a3eb03f20";

@XendraTrl(Identifier="69020599-28b8-d95f-a2d5-5db0ff8cd243")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69020599-28b8-d95f-a2d5-5db0ff8cd243",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
}
/** Get Charge amount.
@return Charge Amount */
public BigDecimal getChargeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="29456024-3ea4-3f6e-4b78-7eed21c0137e")
public static String es_PE_FIELD_BankStatement_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="29456024-3ea4-3f6e-4b78-7eed21c0137e")
public static String es_PE_FIELD_BankStatement_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="29456024-3ea4-3f6e-4b78-7eed21c0137e")
public static String es_PE_FIELD_BankStatement_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29456024-3ea4-3f6e-4b78-7eed21c0137e")
public static final String FIELDNAME_BankStatement_ChargeAmount="29456024-3ea4-3f6e-4b78-7eed21c0137e";

@XendraTrl(Identifier="fe3b615e-7feb-ded7-5747-05734e7164c2")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe3b615e-7feb-ded7-5747-05734e7164c2",
Synchronized="2017-08-05 16:54:48.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
/** Set Charge Name.
@param ChargeName Name of the Charge */
public void setChargeName (String ChargeName)
{
if (ChargeName != null && ChargeName.length() > 60)
{
log.warning("Length > 60 - truncated");
ChargeName = ChargeName.substring(0,59);
}
set_Value (COLUMNNAME_ChargeName, ChargeName);
}
/** Get Charge Name.
@return Name of the Charge */
public String getChargeName() 
{
String value = (String)get_Value(COLUMNNAME_ChargeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1b787f1f-81fc-d2b9-ce95-c7df11eb9617")
public static String es_PE_FIELD_BankStatement_ChargeName_Description="Nombre de la carga";

@XendraTrl(Identifier="1b787f1f-81fc-d2b9-ce95-c7df11eb9617")
public static String es_PE_FIELD_BankStatement_ChargeName_Name="Nombre de la Carga";

@XendraField(AD_Column_ID="ChargeName",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b787f1f-81fc-d2b9-ce95-c7df11eb9617")
public static final String FIELDNAME_BankStatement_ChargeName="1b787f1f-81fc-d2b9-ce95-c7df11eb9617";

@XendraTrl(Identifier="fad74369-772c-c61b-e084-8e6444b4846c")
public static String es_PE_COLUMN_ChargeName_Name="Nombre de la Carga";

@XendraColumn(AD_Element_ID="0276aef2-48b9-ac17-3634-7d9311741db0",ColumnName="ChargeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fad74369-772c-c61b-e084-8e6444b4846c",
Synchronized="2017-08-05 16:54:49.0")
/** Column name ChargeName */
public static final String COLUMNNAME_ChargeName = "ChargeName";
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

@XendraTrl(Identifier="df9b7295-20ff-6fe8-e80f-dac66ad8a09f")
public static String es_PE_FIELD_BankStatement_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="df9b7295-20ff-6fe8-e80f-dac66ad8a09f")
public static String es_PE_FIELD_BankStatement_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="df9b7295-20ff-6fe8-e80f-dac66ad8a09f")
public static String es_PE_FIELD_BankStatement_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df9b7295-20ff-6fe8-e80f-dac66ad8a09f")
public static final String FIELDNAME_BankStatement_Invoice="df9b7295-20ff-6fe8-e80f-dac66ad8a09f";

@XendraTrl(Identifier="77e4985e-e46a-a1d5-e66d-51bacc9c9e27")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77e4985e-e46a-a1d5-e66d-51bacc9c9e27",
Synchronized="2017-08-05 16:54:49.0")
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

@XendraTrl(Identifier="848549ae-e08a-86fa-289b-bbc570afa071")
public static String es_PE_FIELD_BankStatement_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="848549ae-e08a-86fa-289b-bbc570afa071")
public static String es_PE_FIELD_BankStatement_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="848549ae-e08a-86fa-289b-bbc570afa071")
public static String es_PE_FIELD_BankStatement_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="848549ae-e08a-86fa-289b-bbc570afa071")
public static final String FIELDNAME_BankStatement_Payment="848549ae-e08a-86fa-289b-bbc570afa071";

@XendraTrl(Identifier="19067d5f-7faa-2321-c2d3-a76edf36d007")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19067d5f-7faa-2321-c2d3-a76edf36d007",
Synchronized="2017-08-05 16:54:49.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Create Payment.
@param CreatePayment Create Payment */
public void setCreatePayment (String CreatePayment)
{
if (CreatePayment != null && CreatePayment.length() > 1)
{
log.warning("Length > 1 - truncated");
CreatePayment = CreatePayment.substring(0,0);
}
set_Value (COLUMNNAME_CreatePayment, CreatePayment);
}
/** Get Create Payment.
@return Create Payment */
public String getCreatePayment() 
{
return (String)get_Value(COLUMNNAME_CreatePayment);
}

@XendraTrl(Identifier="beb05243-eb0f-9e82-dab1-e16c24342a2e")
public static String es_PE_FIELD_BankStatement_CreatePayment_Description="Cree el pago del estado de la información del estado de cuenta";

@XendraTrl(Identifier="beb05243-eb0f-9e82-dab1-e16c24342a2e")
public static String es_PE_FIELD_BankStatement_CreatePayment_Name="Crea Pago";

@XendraField(AD_Column_ID="CreatePayment",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="beb05243-eb0f-9e82-dab1-e16c24342a2e")
public static final String FIELDNAME_BankStatement_CreatePayment="beb05243-eb0f-9e82-dab1-e16c24342a2e";

@XendraTrl(Identifier="efa95e58-55b7-5c3e-e41f-dc8b44d4de8a")
public static String es_PE_COLUMN_CreatePayment_Name="Crear Pagos";

@XendraColumn(AD_Element_ID="fabb4f55-394e-1364-2da9-92ae62998ea8",ColumnName="CreatePayment",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="8dfd9a54-2f4a-eb68-153d-8830b5ede723",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="efa95e58-55b7-5c3e-e41f-dc8b44d4de8a",Synchronized="2017-08-05 16:54:49.0")
/** Column name CreatePayment */
public static final String COLUMNNAME_CreatePayment = "CreatePayment";
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

@XendraTrl(Identifier="d3695642-82da-8b86-8c85-7018d8383295")
public static String es_PE_FIELD_BankStatement_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="d3695642-82da-8b86-8c85-7018d8383295")
public static String es_PE_FIELD_BankStatement_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="d3695642-82da-8b86-8c85-7018d8383295")
public static String es_PE_FIELD_BankStatement_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3695642-82da-8b86-8c85-7018d8383295")
public static final String FIELDNAME_BankStatement_AccountDate="d3695642-82da-8b86-8c85-7018d8383295";

@XendraTrl(Identifier="65ca3f00-17f2-1d58-1527-3063c0d9d863")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65ca3f00-17f2-1d58-1527-3063c0d9d863",
Synchronized="2017-08-05 16:54:49.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="65d5af49-ae8d-e32d-e6d4-07fdc7083d5f")
public static String es_PE_FIELD_BankStatement_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="65d5af49-ae8d-e32d-e6d4-07fdc7083d5f")
public static String es_PE_FIELD_BankStatement_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="65d5af49-ae8d-e32d-e6d4-07fdc7083d5f")
public static String es_PE_FIELD_BankStatement_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65d5af49-ae8d-e32d-e6d4-07fdc7083d5f")
public static final String FIELDNAME_BankStatement_Description="65d5af49-ae8d-e32d-e6d4-07fdc7083d5f";

@XendraTrl(Identifier="af3dfa99-73ae-2093-5822-06a8f79293cf")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af3dfa99-73ae-2093-5822-06a8f79293cf",
Synchronized="2017-08-05 16:54:49.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EFT Amount.
@param EftAmt Electronic Funds Transfer Amount */
public void setEftAmt (BigDecimal EftAmt)
{
set_Value (COLUMNNAME_EftAmt, EftAmt);
}
/** Get EFT Amount.
@return Electronic Funds Transfer Amount */
public BigDecimal getEftAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EftAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="769014f0-37e4-aaa6-f9ff-11dffaf6764b")
public static String es_PE_FIELD_BankStatement_EFTAmount_Description="Cantidad de Transferencia Eectronica de Fondos.";

@XendraTrl(Identifier="769014f0-37e4-aaa6-f9ff-11dffaf6764b")
public static String es_PE_FIELD_BankStatement_EFTAmount_Name="Importe TEF";

@XendraField(AD_Column_ID="EftAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=540,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="769014f0-37e4-aaa6-f9ff-11dffaf6764b")
public static final String FIELDNAME_BankStatement_EFTAmount="769014f0-37e4-aaa6-f9ff-11dffaf6764b";

@XendraTrl(Identifier="ef686f0f-a000-20f1-451c-c390c07bcc86")
public static String es_PE_COLUMN_EftAmt_Name="Importe TEF";

@XendraColumn(AD_Element_ID="ddb6c460-9173-c3b2-d198-b5dd5cd32186",ColumnName="EftAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef686f0f-a000-20f1-451c-c390c07bcc86",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftAmt */
public static final String COLUMNNAME_EftAmt = "EftAmt";
/** Set EFT Check No.
@param EftCheckNo Electronic Funds Transfer Check No */
public void setEftCheckNo (String EftCheckNo)
{
if (EftCheckNo != null && EftCheckNo.length() > 20)
{
log.warning("Length > 20 - truncated");
EftCheckNo = EftCheckNo.substring(0,19);
}
set_Value (COLUMNNAME_EftCheckNo, EftCheckNo);
}
/** Get EFT Check No.
@return Electronic Funds Transfer Check No */
public String getEftCheckNo() 
{
String value = (String)get_Value(COLUMNNAME_EftCheckNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fac68650-1b74-3290-2fa1-624cb3a65010")
public static String es_PE_FIELD_BankStatement_EFTCheckNo_Description="No. Transferencia Electrónica de Fondos Cheque.";

@XendraTrl(Identifier="fac68650-1b74-3290-2fa1-624cb3a65010")
public static String es_PE_FIELD_BankStatement_EFTCheckNo_Help="Información de medios TEF.";

@XendraTrl(Identifier="fac68650-1b74-3290-2fa1-624cb3a65010")
public static String es_PE_FIELD_BankStatement_EFTCheckNo_Name="No. TEF Cheque";

@XendraField(AD_Column_ID="EftCheckNo",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fac68650-1b74-3290-2fa1-624cb3a65010")
public static final String FIELDNAME_BankStatement_EFTCheckNo="fac68650-1b74-3290-2fa1-624cb3a65010";

@XendraTrl(Identifier="8d1ba7d8-d08d-dc07-12a4-4f99032a16b7")
public static String es_PE_COLUMN_EftCheckNo_Name="No. TEF Cheque";

@XendraColumn(AD_Element_ID="3cfdfc52-c84b-cd37-69fe-402cc4bd53d8",ColumnName="EftCheckNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d1ba7d8-d08d-dc07-12a4-4f99032a16b7",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftCheckNo */
public static final String COLUMNNAME_EftCheckNo = "EftCheckNo";
/** Set EFT Currency.
@param EftCurrency Electronic Funds Transfer Currency */
public void setEftCurrency (String EftCurrency)
{
if (EftCurrency != null && EftCurrency.length() > 20)
{
log.warning("Length > 20 - truncated");
EftCurrency = EftCurrency.substring(0,19);
}
set_Value (COLUMNNAME_EftCurrency, EftCurrency);
}
/** Get EFT Currency.
@return Electronic Funds Transfer Currency */
public String getEftCurrency() 
{
String value = (String)get_Value(COLUMNNAME_EftCurrency);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d49e69fd-5226-7d00-9e76-8ca448315f1d")
public static String es_PE_FIELD_BankStatement_EFTCurrency_Description="Moneda de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="d49e69fd-5226-7d00-9e76-8ca448315f1d")
public static String es_PE_FIELD_BankStatement_EFTCurrency_Help="Información de medios Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="d49e69fd-5226-7d00-9e76-8ca448315f1d")
public static String es_PE_FIELD_BankStatement_EFTCurrency_Name="Moneda de TEF";

@XendraField(AD_Column_ID="EftCurrency",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d49e69fd-5226-7d00-9e76-8ca448315f1d")
public static final String FIELDNAME_BankStatement_EFTCurrency="d49e69fd-5226-7d00-9e76-8ca448315f1d";

@XendraTrl(Identifier="af140534-76e3-0dfc-befc-e5fe422347d8")
public static String es_PE_COLUMN_EftCurrency_Name="Moneda de TEF";

@XendraColumn(AD_Element_ID="d3541164-d7dd-c1bd-824a-6f309e0eb1de",ColumnName="EftCurrency",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af140534-76e3-0dfc-befc-e5fe422347d8",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftCurrency */
public static final String COLUMNNAME_EftCurrency = "EftCurrency";
/** Set EFT Memo.
@param EftMemo Electronic Funds Transfer Memo */
public void setEftMemo (String EftMemo)
{
if (EftMemo != null && EftMemo.length() > 2000)
{
log.warning("Length > 2000 - truncated");
EftMemo = EftMemo.substring(0,1999);
}
set_Value (COLUMNNAME_EftMemo, EftMemo);
}
/** Get EFT Memo.
@return Electronic Funds Transfer Memo */
public String getEftMemo() 
{
String value = (String)get_Value(COLUMNNAME_EftMemo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fcb68343-8767-035b-5d7c-1c41b0555e07")
public static String es_PE_FIELD_BankStatement_EFTMemo_Description="Memo de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="fcb68343-8767-035b-5d7c-1c41b0555e07")
public static String es_PE_FIELD_BankStatement_EFTMemo_Help="Información de medios de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="fcb68343-8767-035b-5d7c-1c41b0555e07")
public static String es_PE_FIELD_BankStatement_EFTMemo_Name="Memo TEF";

@XendraField(AD_Column_ID="EftMemo",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=480,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcb68343-8767-035b-5d7c-1c41b0555e07")
public static final String FIELDNAME_BankStatement_EFTMemo="fcb68343-8767-035b-5d7c-1c41b0555e07";

@XendraTrl(Identifier="071a62ab-22b1-b6fb-0270-0d24b7f68452")
public static String es_PE_COLUMN_EftMemo_Name="Memo TEF";

@XendraColumn(AD_Element_ID="d22505b1-0145-20d2-e936-10713168180a",ColumnName="EftMemo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="071a62ab-22b1-b6fb-0270-0d24b7f68452",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftMemo */
public static final String COLUMNNAME_EftMemo = "EftMemo";
/** Set EFT Payee.
@param EftPayee Electronic Funds Transfer Payee information */
public void setEftPayee (String EftPayee)
{
if (EftPayee != null && EftPayee.length() > 255)
{
log.warning("Length > 255 - truncated");
EftPayee = EftPayee.substring(0,254);
}
set_Value (COLUMNNAME_EftPayee, EftPayee);
}
/** Get EFT Payee.
@return Electronic Funds Transfer Payee information */
public String getEftPayee() 
{
String value = (String)get_Value(COLUMNNAME_EftPayee);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="975e09ed-ee9e-5d7c-039a-27bbca9b76e1")
public static String es_PE_FIELD_BankStatement_EFTPayee_Description="Información del beneficiario para Transferencia Elecronica de Fondos.";

@XendraTrl(Identifier="975e09ed-ee9e-5d7c-039a-27bbca9b76e1")
public static String es_PE_FIELD_BankStatement_EFTPayee_Help="Información de pagos de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="975e09ed-ee9e-5d7c-039a-27bbca9b76e1")
public static String es_PE_FIELD_BankStatement_EFTPayee_Name="TFE Beneficiario";

@XendraField(AD_Column_ID="EftPayee",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="975e09ed-ee9e-5d7c-039a-27bbca9b76e1")
public static final String FIELDNAME_BankStatement_EFTPayee="975e09ed-ee9e-5d7c-039a-27bbca9b76e1";

@XendraTrl(Identifier="cee5912f-3220-0af5-bbf5-23efb72c0d85")
public static String es_PE_COLUMN_EftPayee_Name="TFE Beneficiario";

@XendraColumn(AD_Element_ID="6d8b943a-1a57-1392-d28f-13f72a90cf8a",ColumnName="EftPayee",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cee5912f-3220-0af5-bbf5-23efb72c0d85",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftPayee */
public static final String COLUMNNAME_EftPayee = "EftPayee";
/** Set EFT Payee Account.
@param EftPayeeAccount Electronic Funds Transfer Payyee Account Information */
public void setEftPayeeAccount (String EftPayeeAccount)
{
if (EftPayeeAccount != null && EftPayeeAccount.length() > 40)
{
log.warning("Length > 40 - truncated");
EftPayeeAccount = EftPayeeAccount.substring(0,39);
}
set_Value (COLUMNNAME_EftPayeeAccount, EftPayeeAccount);
}
/** Get EFT Payee Account.
@return Electronic Funds Transfer Payyee Account Information */
public String getEftPayeeAccount() 
{
String value = (String)get_Value(COLUMNNAME_EftPayeeAccount);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9e04a813-569d-e167-3ddd-6f6ac2a1553d")
public static String es_PE_FIELD_BankStatement_EFTPayeeAccount_Description="Información de la cuenta del beneficiario de la transferencia de fondos electrónica";

@XendraTrl(Identifier="9e04a813-569d-e167-3ddd-6f6ac2a1553d")
public static String es_PE_FIELD_BankStatement_EFTPayeeAccount_Help="Información de medios de TEF ";

@XendraTrl(Identifier="9e04a813-569d-e167-3ddd-6f6ac2a1553d")
public static String es_PE_FIELD_BankStatement_EFTPayeeAccount_Name="Cuenta del Beneficiario de TEF";

@XendraField(AD_Column_ID="EftPayeeAccount",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=500,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e04a813-569d-e167-3ddd-6f6ac2a1553d")
public static final String FIELDNAME_BankStatement_EFTPayeeAccount="9e04a813-569d-e167-3ddd-6f6ac2a1553d";

@XendraTrl(Identifier="42aeb789-b067-39b3-106f-71d9d18c02b6")
public static String es_PE_COLUMN_EftPayeeAccount_Name="Cuenta del Beneficiario de TEF";

@XendraColumn(AD_Element_ID="647fbd1c-d14c-2cd6-6303-6f881d810185",ColumnName="EftPayeeAccount",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42aeb789-b067-39b3-106f-71d9d18c02b6",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftPayeeAccount */
public static final String COLUMNNAME_EftPayeeAccount = "EftPayeeAccount";
/** Set EFT Reference.
@param EftReference Electronic Funds Transfer Reference */
public void setEftReference (String EftReference)
{
if (EftReference != null && EftReference.length() > 60)
{
log.warning("Length > 60 - truncated");
EftReference = EftReference.substring(0,59);
}
set_Value (COLUMNNAME_EftReference, EftReference);
}
/** Get EFT Reference.
@return Electronic Funds Transfer Reference */
public String getEftReference() 
{
String value = (String)get_Value(COLUMNNAME_EftReference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c467b67f-0a8a-81d1-d89c-bd79abbc3c98")
public static String es_PE_FIELD_BankStatement_EFTReference_Description="Referencia de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="c467b67f-0a8a-81d1-d89c-bd79abbc3c98")
public static String es_PE_FIELD_BankStatement_EFTReference_Help="Información de medios TEF";

@XendraTrl(Identifier="c467b67f-0a8a-81d1-d89c-bd79abbc3c98")
public static String es_PE_FIELD_BankStatement_EFTReference_Name="Referencia TEF";

@XendraField(AD_Column_ID="EftReference",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=470,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c467b67f-0a8a-81d1-d89c-bd79abbc3c98")
public static final String FIELDNAME_BankStatement_EFTReference="c467b67f-0a8a-81d1-d89c-bd79abbc3c98";

@XendraTrl(Identifier="185dcb59-fe92-77eb-139a-44711ff88e41")
public static String es_PE_COLUMN_EftReference_Name="Referencia TEF";

@XendraColumn(AD_Element_ID="950c0764-1512-b934-0bf5-2204e09dde51",ColumnName="EftReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="185dcb59-fe92-77eb-139a-44711ff88e41",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftReference */
public static final String COLUMNNAME_EftReference = "EftReference";
/** Set EFT Statement Date.
@param EftStatementDate Electronic Funds Transfer Statement Date */
public void setEftStatementDate (Timestamp EftStatementDate)
{
set_Value (COLUMNNAME_EftStatementDate, EftStatementDate);
}
/** Get EFT Statement Date.
@return Electronic Funds Transfer Statement Date */
public Timestamp getEftStatementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EftStatementDate);
}

@XendraTrl(Identifier="bf731bd6-a900-3e6d-4acf-b0626150266c")
public static String es_PE_FIELD_BankStatement_EFTStatementDate_Description="Fecha de declaración de la transferencia electrónica de fondos.";

@XendraTrl(Identifier="bf731bd6-a900-3e6d-4acf-b0626150266c")
public static String es_PE_FIELD_BankStatement_EFTStatementDate_Help="Información de medios de transferencia electronica de fondos.";

@XendraTrl(Identifier="bf731bd6-a900-3e6d-4acf-b0626150266c")
public static String es_PE_FIELD_BankStatement_EFTStatementDate_Name="Estado de la TEF a la Fecha";

@XendraField(AD_Column_ID="EftStatementDate",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf731bd6-a900-3e6d-4acf-b0626150266c")
public static final String FIELDNAME_BankStatement_EFTStatementDate="bf731bd6-a900-3e6d-4acf-b0626150266c";

@XendraTrl(Identifier="6c8e343c-0754-2044-19a2-e87bb16adf77")
public static String es_PE_COLUMN_EftStatementDate_Name="Estado de la TEF a la Fecha";

@XendraColumn(AD_Element_ID="a4b71dc9-2e83-d982-b586-06a6e5cee7cb",ColumnName="EftStatementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c8e343c-0754-2044-19a2-e87bb16adf77",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftStatementDate */
public static final String COLUMNNAME_EftStatementDate = "EftStatementDate";
/** Set EFT Statement Line Date.
@param EftStatementLineDate Electronic Funds Transfer Statement Line Date */
public void setEftStatementLineDate (Timestamp EftStatementLineDate)
{
set_Value (COLUMNNAME_EftStatementLineDate, EftStatementLineDate);
}
/** Get EFT Statement Line Date.
@return Electronic Funds Transfer Statement Line Date */
public Timestamp getEftStatementLineDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EftStatementLineDate);
}

@XendraTrl(Identifier="4de92261-e16d-0c84-2ecc-6e35e412837a")
public static String es_PE_FIELD_BankStatement_EFTStatementLineDate_Description="Fecha del Item de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="4de92261-e16d-0c84-2ecc-6e35e412837a")
public static String es_PE_FIELD_BankStatement_EFTStatementLineDate_Help="Información media de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="4de92261-e16d-0c84-2ecc-6e35e412837a")
public static String es_PE_FIELD_BankStatement_EFTStatementLineDate_Name="Item Estado de la TEF a la Fecha";

@XendraField(AD_Column_ID="EftStatementLineDate",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=510,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4de92261-e16d-0c84-2ecc-6e35e412837a")
public static final String FIELDNAME_BankStatement_EFTStatementLineDate="4de92261-e16d-0c84-2ecc-6e35e412837a";

@XendraTrl(Identifier="e992d0d7-87a0-066d-70bc-2ec36ab4c17c")
public static String es_PE_COLUMN_EftStatementLineDate_Name="Línea Estado de la TEF a la Fecha";

@XendraColumn(AD_Element_ID="691f726e-ad2e-8c81-6a74-6f9f3342a5c4",
ColumnName="EftStatementLineDate",AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=7,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e992d0d7-87a0-066d-70bc-2ec36ab4c17c",Synchronized="2017-08-05 16:54:49.0")
/** Column name EftStatementLineDate */
public static final String COLUMNNAME_EftStatementLineDate = "EftStatementLineDate";
/** Set EFT Statement Reference.
@param EftStatementReference Electronic Funds Transfer Statement Reference */
public void setEftStatementReference (String EftStatementReference)
{
if (EftStatementReference != null && EftStatementReference.length() > 60)
{
log.warning("Length > 60 - truncated");
EftStatementReference = EftStatementReference.substring(0,59);
}
set_Value (COLUMNNAME_EftStatementReference, EftStatementReference);
}
/** Get EFT Statement Reference.
@return Electronic Funds Transfer Statement Reference */
public String getEftStatementReference() 
{
String value = (String)get_Value(COLUMNNAME_EftStatementReference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c1fbe0da-5551-36ef-333d-0717f0ad07b7")
public static String es_PE_FIELD_BankStatement_EFTStatementReference_Description="Referencia del Estado de la Transferencia Electronica de Fondos";

@XendraTrl(Identifier="c1fbe0da-5551-36ef-333d-0717f0ad07b7")
public static String es_PE_FIELD_BankStatement_EFTStatementReference_Help="Información de medios de TEF.";

@XendraTrl(Identifier="c1fbe0da-5551-36ef-333d-0717f0ad07b7")
public static String es_PE_FIELD_BankStatement_EFTStatementReference_Name="Referencia Estado de la TEF";

@XendraField(AD_Column_ID="EftStatementReference",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1fbe0da-5551-36ef-333d-0717f0ad07b7")
public static final String FIELDNAME_BankStatement_EFTStatementReference="c1fbe0da-5551-36ef-333d-0717f0ad07b7";

@XendraTrl(Identifier="d36f8dc3-82b3-fb26-8ca5-3fc470631b46")
public static String es_PE_COLUMN_EftStatementReference_Name="Referencia Estado de la TEF";

@XendraColumn(AD_Element_ID="aaf88f06-39df-784d-a34c-bae2a723ee8f",
ColumnName="EftStatementReference",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=60,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d36f8dc3-82b3-fb26-8ca5-3fc470631b46",Synchronized="2017-08-05 16:54:49.0")
/** Column name EftStatementReference */
public static final String COLUMNNAME_EftStatementReference = "EftStatementReference";
/** Set EFT Trx ID.
@param EftTrxID Electronic Funds Transfer Transaction ID */
public void setEftTrxID (String EftTrxID)
{
if (EftTrxID != null && EftTrxID.length() > 40)
{
log.warning("Length > 40 - truncated");
EftTrxID = EftTrxID.substring(0,39);
}
set_Value (COLUMNNAME_EftTrxID, EftTrxID);
}
/** Get EFT Trx ID.
@return Electronic Funds Transfer Transaction ID */
public String getEftTrxID() 
{
String value = (String)get_Value(COLUMNNAME_EftTrxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d7327adc-90e1-9d9c-f888-520e6b7cdd1e")
public static String es_PE_FIELD_BankStatement_EFTTrxID_Description="ID transacción de Transferencia Electronica de fondos";

@XendraTrl(Identifier="d7327adc-90e1-9d9c-f888-520e6b7cdd1e")
public static String es_PE_FIELD_BankStatement_EFTTrxID_Help="Información de los medios de Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="d7327adc-90e1-9d9c-f888-520e6b7cdd1e")
public static String es_PE_FIELD_BankStatement_EFTTrxID_Name="ID Trans TEF";

@XendraField(AD_Column_ID="EftTrxID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7327adc-90e1-9d9c-f888-520e6b7cdd1e")
public static final String FIELDNAME_BankStatement_EFTTrxID="d7327adc-90e1-9d9c-f888-520e6b7cdd1e";

@XendraTrl(Identifier="2bb3a675-5f58-9bab-d8d5-b82356de8f4f")
public static String es_PE_COLUMN_EftTrxID_Name="ID Trans TEF";

@XendraColumn(AD_Element_ID="1a6f03a1-bcbc-d16b-11bf-f6b661a8bbe4",ColumnName="EftTrxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2bb3a675-5f58-9bab-d8d5-b82356de8f4f",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftTrxID */
public static final String COLUMNNAME_EftTrxID = "EftTrxID";
/** Set EFT Trx Type.
@param EftTrxType Electronic Funds Transfer Transaction Type */
public void setEftTrxType (String EftTrxType)
{
if (EftTrxType != null && EftTrxType.length() > 20)
{
log.warning("Length > 20 - truncated");
EftTrxType = EftTrxType.substring(0,19);
}
set_Value (COLUMNNAME_EftTrxType, EftTrxType);
}
/** Get EFT Trx Type.
@return Electronic Funds Transfer Transaction Type */
public String getEftTrxType() 
{
String value = (String)get_Value(COLUMNNAME_EftTrxType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14e170d9-fd48-f3a2-6647-2a175d55b128")
public static String es_PE_FIELD_BankStatement_EFTTrxType_Description="Tipo de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="14e170d9-fd48-f3a2-6647-2a175d55b128")
public static String es_PE_FIELD_BankStatement_EFTTrxType_Help="Información de medios de TEF";

@XendraTrl(Identifier="14e170d9-fd48-f3a2-6647-2a175d55b128")
public static String es_PE_FIELD_BankStatement_EFTTrxType_Name="Tipo Trans TEF";

@XendraField(AD_Column_ID="EftTrxType",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=450,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14e170d9-fd48-f3a2-6647-2a175d55b128")
public static final String FIELDNAME_BankStatement_EFTTrxType="14e170d9-fd48-f3a2-6647-2a175d55b128";

@XendraTrl(Identifier="6e596fce-0f42-90d4-38a5-2466dc724512")
public static String es_PE_COLUMN_EftTrxType_Name="Tipo Trans TEF";

@XendraColumn(AD_Element_ID="8c688b24-7173-822c-c328-4456a5b73d69",ColumnName="EftTrxType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e596fce-0f42-90d4-38a5-2466dc724512",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftTrxType */
public static final String COLUMNNAME_EftTrxType = "EftTrxType";
/** Set EFT Effective Date.
@param EftValutaDate Electronic Funds Transfer Valuta (effective) Date */
public void setEftValutaDate (Timestamp EftValutaDate)
{
set_Value (COLUMNNAME_EftValutaDate, EftValutaDate);
}
/** Get EFT Effective Date.
@return Electronic Funds Transfer Valuta (effective) Date */
public Timestamp getEftValutaDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EftValutaDate);
}

@XendraTrl(Identifier="5f4b6d5b-6e69-57f2-bdbd-ac922ab380df")
public static String es_PE_FIELD_BankStatement_EFTEffectiveDate_Description="Fecha efectiva para la Transferencia Electronica de Fondos.";

@XendraTrl(Identifier="5f4b6d5b-6e69-57f2-bdbd-ac922ab380df")
public static String es_PE_FIELD_BankStatement_EFTEffectiveDate_Help="Información de Transferencia Electronica de Fondos";

@XendraTrl(Identifier="5f4b6d5b-6e69-57f2-bdbd-ac922ab380df")
public static String es_PE_FIELD_BankStatement_EFTEffectiveDate_Name="Fecha Efectiva para TEF";

@XendraField(AD_Column_ID="EftValutaDate",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=520,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f4b6d5b-6e69-57f2-bdbd-ac922ab380df")
public static final String FIELDNAME_BankStatement_EFTEffectiveDate="5f4b6d5b-6e69-57f2-bdbd-ac922ab380df";

@XendraTrl(Identifier="1b4260d8-440d-c1ab-7b17-abe456010da1")
public static String es_PE_COLUMN_EftValutaDate_Name="Fecha Efectiva para TEF";

@XendraColumn(AD_Element_ID="56edc870-99c1-8bba-0e8d-14bf8824aafb",ColumnName="EftValutaDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b4260d8-440d-c1ab-7b17-abe456010da1",
Synchronized="2017-08-05 16:54:49.0")
/** Column name EftValutaDate */
public static final String COLUMNNAME_EftValutaDate = "EftValutaDate";
/** Set Import Bank Statement.
@param I_BankStatement_ID Import of the Bank Statement */
public void setI_BankStatement_ID (int I_BankStatement_ID)
{
if (I_BankStatement_ID < 1) throw new IllegalArgumentException ("I_BankStatement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_BankStatement_ID, Integer.valueOf(I_BankStatement_ID));
}
/** Get Import Bank Statement.
@return Import of the Bank Statement */
public int getI_BankStatement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_BankStatement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="230c3cc4-3185-7452-d8cc-3b007ace5465")
public static String es_PE_FIELD_BankStatement_ImportBankStatement_Description="Importar extractos de cuentas";

@XendraTrl(Identifier="230c3cc4-3185-7452-d8cc-3b007ace5465")
public static String es_PE_FIELD_BankStatement_ImportBankStatement_Name="Importar Extractos de Cuenta";

@XendraField(AD_Column_ID="I_BankStatement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="230c3cc4-3185-7452-d8cc-3b007ace5465")
public static final String FIELDNAME_BankStatement_ImportBankStatement="230c3cc4-3185-7452-d8cc-3b007ace5465";
/** Column name I_BankStatement_ID */
public static final String COLUMNNAME_I_BankStatement_ID = "I_BankStatement_ID";
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
@XendraTrl(Identifier="eebfe015-2791-462d-8761-4668aae24344")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eebfe015-2791-462d-8761-4668aae24344",
Synchronized="2017-08-05 16:54:49.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
if (I_ErrorMsg != null && I_ErrorMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
I_ErrorMsg = I_ErrorMsg.substring(0,1999);
}
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
@XendraTrl(Identifier="43b14ac4-18bb-f317-6051-f6ebd676619c")
public static String es_PE_FIELD_BankStatement_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="43b14ac4-18bb-f317-6051-f6ebd676619c")
public static String es_PE_FIELD_BankStatement_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraTrl(Identifier="43b14ac4-18bb-f317-6051-f6ebd676619c")
public static String es_PE_FIELD_BankStatement_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43b14ac4-18bb-f317-6051-f6ebd676619c")
public static final String FIELDNAME_BankStatement_ImportErrorMessage="43b14ac4-18bb-f317-6051-f6ebd676619c";

@XendraTrl(Identifier="54653923-d9c0-e445-3a19-f4121747739f")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54653923-d9c0-e445-3a19-f4121747739f",
Synchronized="2017-08-05 16:54:49.0")
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

@XendraTrl(Identifier="60e82fb1-6d86-5d19-4edd-0600f14229bc")
public static String es_PE_FIELD_BankStatement_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="60e82fb1-6d86-5d19-4edd-0600f14229bc")
public static String es_PE_FIELD_BankStatement_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraTrl(Identifier="60e82fb1-6d86-5d19-4edd-0600f14229bc")
public static String es_PE_FIELD_BankStatement_Imported_Name="Importar";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60e82fb1-6d86-5d19-4edd-0600f14229bc")
public static final String FIELDNAME_BankStatement_Imported="60e82fb1-6d86-5d19-4edd-0600f14229bc";

@XendraTrl(Identifier="16baee8e-eaf5-dbd8-d052-ad3b9b41a03e")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16baee8e-eaf5-dbd8-d052-ad3b9b41a03e",
Synchronized="2017-08-05 16:54:49.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Interest Amount.
@param InterestAmt Interest Amount */
public void setInterestAmt (BigDecimal InterestAmt)
{
set_Value (COLUMNNAME_InterestAmt, InterestAmt);
}
/** Get Interest Amount.
@return Interest Amount */
public BigDecimal getInterestAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InterestAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="332cc287-7041-00df-157b-d7a7932f25d6")
public static String es_PE_FIELD_BankStatement_InterestAmount_Description="Total del interés";

@XendraTrl(Identifier="332cc287-7041-00df-157b-d7a7932f25d6")
public static String es_PE_FIELD_BankStatement_InterestAmount_Help="El Total del Interés indica cualquier interés cargado ó recibido en un estado de cuenta bancario";

@XendraTrl(Identifier="332cc287-7041-00df-157b-d7a7932f25d6")
public static String es_PE_FIELD_BankStatement_InterestAmount_Name="Total del Interés";

@XendraField(AD_Column_ID="InterestAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="332cc287-7041-00df-157b-d7a7932f25d6")
public static final String FIELDNAME_BankStatement_InterestAmount="332cc287-7041-00df-157b-d7a7932f25d6";

@XendraTrl(Identifier="34f01562-d512-8f50-71af-9763d28a06d1")
public static String es_PE_COLUMN_InterestAmt_Name="Total del Interés";

@XendraColumn(AD_Element_ID="94999794-0276-6683-3826-7546d7f35a50",ColumnName="InterestAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34f01562-d512-8f50-71af-9763d28a06d1",
Synchronized="2017-08-05 16:54:49.0")
/** Column name InterestAmt */
public static final String COLUMNNAME_InterestAmt = "InterestAmt";
/** Set Invoice Document No.
@param InvoiceDocumentNo Document Number of the Invoice */
public void setInvoiceDocumentNo (String InvoiceDocumentNo)
{
if (InvoiceDocumentNo != null && InvoiceDocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
InvoiceDocumentNo = InvoiceDocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_InvoiceDocumentNo, InvoiceDocumentNo);
}
/** Get Invoice Document No.
@return Document Number of the Invoice */
public String getInvoiceDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_InvoiceDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4196154b-1872-27ce-eaa1-d64e665ac2e3")
public static String es_PE_FIELD_BankStatement_InvoiceDocumentNo_Description="Número de documento en la factura";

@XendraTrl(Identifier="4196154b-1872-27ce-eaa1-d64e665ac2e3")
public static String es_PE_FIELD_BankStatement_InvoiceDocumentNo_Name="No. de Documento Factura";

@XendraField(AD_Column_ID="InvoiceDocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4196154b-1872-27ce-eaa1-d64e665ac2e3")
public static final String FIELDNAME_BankStatement_InvoiceDocumentNo="4196154b-1872-27ce-eaa1-d64e665ac2e3";

@XendraTrl(Identifier="bafce1d6-529b-798f-6408-cccb64f1ad9c")
public static String es_PE_COLUMN_InvoiceDocumentNo_Name="No. de Documento Factura";

@XendraColumn(AD_Element_ID="8fe4a47f-1637-81de-48d3-f43e7643d57d",ColumnName="InvoiceDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bafce1d6-529b-798f-6408-cccb64f1ad9c",
Synchronized="2017-08-05 16:54:49.0")
/** Column name InvoiceDocumentNo */
public static final String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";
/** Set ISO Currency Code.
@param ISO_Code Three letter ISO 4217 Code of the Currency */
public void setISO_Code (String ISO_Code)
{
if (ISO_Code != null && ISO_Code.length() > 3)
{
log.warning("Length > 3 - truncated");
ISO_Code = ISO_Code.substring(0,2);
}
set_Value (COLUMNNAME_ISO_Code, ISO_Code);
}
/** Get ISO Currency Code.
@return Three letter ISO 4217 Code of the Currency */
public String getISO_Code() 
{
String value = (String)get_Value(COLUMNNAME_ISO_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dc896c52-030d-412e-ee60-60261685e6cb")
public static String es_PE_FIELD_BankStatement_ISOCurrencyCode_Description="Código ISO 4217 de la moneda";

@XendraTrl(Identifier="dc896c52-030d-412e-ee60-60261685e6cb")
public static String es_PE_FIELD_BankStatement_ISOCurrencyCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraTrl(Identifier="dc896c52-030d-412e-ee60-60261685e6cb")
public static String es_PE_FIELD_BankStatement_ISOCurrencyCode_Name="Código ISO";

@XendraField(AD_Column_ID="ISO_Code",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc896c52-030d-412e-ee60-60261685e6cb")
public static final String FIELDNAME_BankStatement_ISOCurrencyCode="dc896c52-030d-412e-ee60-60261685e6cb";

@XendraTrl(Identifier="98c4ab7a-6d66-e1bc-305b-95afba64a293")
public static String es_PE_COLUMN_ISO_Code_Name="Código ISO";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98c4ab7a-6d66-e1bc-305b-95afba64a293",
Synchronized="2017-08-05 16:54:49.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";
/** Set Reversal.
@param IsReversal This is a reversing transaction */
public void setIsReversal (boolean IsReversal)
{
set_Value (COLUMNNAME_IsReversal, Boolean.valueOf(IsReversal));
}
/** Get Reversal.
@return This is a reversing transaction */
public boolean isReversal() 
{
Object oo = get_Value(COLUMNNAME_IsReversal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="19d0ec71-7bd4-7184-fa7a-d1c6092c482f")
public static String es_PE_FIELD_BankStatement_Reversal_Description="Ésta es una transacción inversa";

@XendraTrl(Identifier="19d0ec71-7bd4-7184-fa7a-d1c6092c482f")
public static String es_PE_FIELD_BankStatement_Reversal_Help="El cuadro de verificación Inverso indica si esta es una transacción inversa de una transacción anterior.";

@XendraTrl(Identifier="19d0ec71-7bd4-7184-fa7a-d1c6092c482f")
public static String es_PE_FIELD_BankStatement_Reversal_Name="Inverso";

@XendraField(AD_Column_ID="IsReversal",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19d0ec71-7bd4-7184-fa7a-d1c6092c482f")
public static final String FIELDNAME_BankStatement_Reversal="19d0ec71-7bd4-7184-fa7a-d1c6092c482f";

@XendraTrl(Identifier="6ed534b6-3994-6b74-040a-5c8ba1ced479")
public static String es_PE_COLUMN_IsReversal_Name="Inverso";

@XendraColumn(AD_Element_ID="eecc12dc-531a-0341-6fe7-26ddd75bb608",ColumnName="IsReversal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ed534b6-3994-6b74-040a-5c8ba1ced479",
Synchronized="2017-08-05 16:54:49.0")
/** Column name IsReversal */
public static final String COLUMNNAME_IsReversal = "IsReversal";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="35a8594a-9c4a-46dd-3460-493537a1c314")
public static String es_PE_FIELD_BankStatement_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="35a8594a-9c4a-46dd-3460-493537a1c314")
public static String es_PE_FIELD_BankStatement_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="35a8594a-9c4a-46dd-3460-493537a1c314")
public static String es_PE_FIELD_BankStatement_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="Line",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35a8594a-9c4a-46dd-3460-493537a1c314")
public static final String FIELDNAME_BankStatement_LineNo="35a8594a-9c4a-46dd-3460-493537a1c314";

@XendraTrl(Identifier="f198d8d5-bf9f-3467-3ba8-300c790e4fb6")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f198d8d5-bf9f-3467-3ba8-300c790e4fb6",
Synchronized="2017-08-05 16:54:49.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Line Description.
@param LineDescription Description of the Line */
public void setLineDescription (String LineDescription)
{
if (LineDescription != null && LineDescription.length() > 255)
{
log.warning("Length > 255 - truncated");
LineDescription = LineDescription.substring(0,254);
}
set_Value (COLUMNNAME_LineDescription, LineDescription);
}
/** Get Line Description.
@return Description of the Line */
public String getLineDescription() 
{
String value = (String)get_Value(COLUMNNAME_LineDescription);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c1a5dab1-48a5-eb58-5fa6-8f61d2db5d6a")
public static String es_PE_FIELD_BankStatement_LineDescription_Description="Descripción de la Línea";

@XendraTrl(Identifier="c1a5dab1-48a5-eb58-5fa6-8f61d2db5d6a")
public static String es_PE_FIELD_BankStatement_LineDescription_Name="Descrición de la Línea";

@XendraField(AD_Column_ID="LineDescription",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1a5dab1-48a5-eb58-5fa6-8f61d2db5d6a")
public static final String FIELDNAME_BankStatement_LineDescription="c1a5dab1-48a5-eb58-5fa6-8f61d2db5d6a";

@XendraTrl(Identifier="9f12cd33-884c-043f-578a-4bc15b029cf6")
public static String es_PE_COLUMN_LineDescription_Name="Descrición de la Línea";

@XendraColumn(AD_Element_ID="733f7ba4-3f04-2155-01fd-78a2da4f49a3",ColumnName="LineDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f12cd33-884c-043f-578a-4bc15b029cf6",
Synchronized="2017-08-05 16:54:49.0")
/** Column name LineDescription */
public static final String COLUMNNAME_LineDescription = "LineDescription";
/** Set Match Statement.
@param MatchStatement Match Statement */
public void setMatchStatement (String MatchStatement)
{
if (MatchStatement != null && MatchStatement.length() > 1)
{
log.warning("Length > 1 - truncated");
MatchStatement = MatchStatement.substring(0,0);
}
set_Value (COLUMNNAME_MatchStatement, MatchStatement);
}
/** Get Match Statement.
@return Match Statement */
public String getMatchStatement() 
{
return (String)get_Value(COLUMNNAME_MatchStatement);
}

@XendraTrl(Identifier="5c818c47-8616-f5ca-9264-97baa8402612")
public static String es_PE_FIELD_BankStatement_MatchStatement_Description="Estado de la cuenta del banco, información a los socios de negocio, a las facturas y a los pagos.";

@XendraTrl(Identifier="5c818c47-8616-f5ca-9264-97baa8402612")
public static String es_PE_FIELD_BankStatement_MatchStatement_Name="Conciliación de Estado de Cuenta Bancario";

@XendraField(AD_Column_ID="MatchStatement",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c818c47-8616-f5ca-9264-97baa8402612")
public static final String FIELDNAME_BankStatement_MatchStatement="5c818c47-8616-f5ca-9264-97baa8402612";

@XendraTrl(Identifier="cc3b8057-8003-f027-e7fc-f13b935cb04f")
public static String es_PE_COLUMN_MatchStatement_Name="Conciliación";

@XendraColumn(AD_Element_ID="458ade5b-b2f5-9520-6391-55dfab59c30a",ColumnName="MatchStatement",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="b09397f4-1e05-ab78-94ea-b67a4c43a1f2",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cc3b8057-8003-f027-e7fc-f13b935cb04f",Synchronized="2017-08-05 16:54:49.0")
/** Column name MatchStatement */
public static final String COLUMNNAME_MatchStatement = "MatchStatement";
/** Set Memo.
@param Memo Memo Text */
public void setMemo (String Memo)
{
if (Memo != null && Memo.length() > 255)
{
log.warning("Length > 255 - truncated");
Memo = Memo.substring(0,254);
}
set_Value (COLUMNNAME_Memo, Memo);
}
/** Get Memo.
@return Memo Text */
public String getMemo() 
{
String value = (String)get_Value(COLUMNNAME_Memo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a3467c3b-5b70-1d60-0458-299e66e7d9eb")
public static String es_PE_FIELD_BankStatement_Memo_Description="Memo de texto";

@XendraTrl(Identifier="a3467c3b-5b70-1d60-0458-299e66e7d9eb")
public static String es_PE_FIELD_BankStatement_Memo_Name="Memo";
@XendraField(AD_Column_ID="Memo",
IsCentrallyMaintained=true,AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a3467c3b-5b70-1d60-0458-299e66e7d9eb")
public static final String FIELDNAME_BankStatement_Memo="a3467c3b-5b70-1d60-0458-299e66e7d9eb";

@XendraTrl(Identifier="0957be02-25c4-cc07-7d5f-def3e684dd81")
public static String es_PE_COLUMN_Memo_Name="Memo";

@XendraColumn(AD_Element_ID="2c278815-3821-9fa0-1746-7d846f4e7396",ColumnName="Memo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0957be02-25c4-cc07-7d5f-def3e684dd81",
Synchronized="2017-08-05 16:54:49.0")
/** Column name Memo */
public static final String COLUMNNAME_Memo = "Memo";
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
@XendraTrl(Identifier="9a3067fa-cc32-29fd-c265-edcd7fdd2612")
public static String es_PE_FIELD_BankStatement_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9a3067fa-cc32-29fd-c265-edcd7fdd2612")
public static String es_PE_FIELD_BankStatement_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="9a3067fa-cc32-29fd-c265-edcd7fdd2612")
public static String es_PE_FIELD_BankStatement_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9a3067fa-cc32-29fd-c265-edcd7fdd2612")
public static final String FIELDNAME_BankStatement_Name="9a3067fa-cc32-29fd-c265-edcd7fdd2612";

@XendraTrl(Identifier="a522f66f-43f5-3029-2361-c45c89dfff46")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a522f66f-43f5-3029-2361-c45c89dfff46",
Synchronized="2017-08-05 16:54:49.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Payment Document No.
@param PaymentDocumentNo Document number of the Payment */
public void setPaymentDocumentNo (String PaymentDocumentNo)
{
if (PaymentDocumentNo != null && PaymentDocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
PaymentDocumentNo = PaymentDocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_PaymentDocumentNo, PaymentDocumentNo);
}
/** Get Payment Document No.
@return Document number of the Payment */
public String getPaymentDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_PaymentDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5d74a6bb-76fe-c321-1790-26ea337dc95c")
public static String es_PE_FIELD_BankStatement_PaymentDocumentNo_Description="Número del documento de pago";

@XendraTrl(Identifier="5d74a6bb-76fe-c321-1790-26ea337dc95c")
public static String es_PE_FIELD_BankStatement_PaymentDocumentNo_Name="No. de Documento de Pago";

@XendraField(AD_Column_ID="PaymentDocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d74a6bb-76fe-c321-1790-26ea337dc95c")
public static final String FIELDNAME_BankStatement_PaymentDocumentNo="5d74a6bb-76fe-c321-1790-26ea337dc95c";

@XendraTrl(Identifier="e053dceb-09e0-08a4-de4e-167357d70329")
public static String es_PE_COLUMN_PaymentDocumentNo_Name="No. de Documento de Pago";

@XendraColumn(AD_Element_ID="2d00ed4b-ffe1-bb20-0b06-6921ba66bc23",ColumnName="PaymentDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e053dceb-09e0-08a4-de4e-167357d70329",
Synchronized="2017-08-05 16:54:49.0")
/** Column name PaymentDocumentNo */
public static final String COLUMNNAME_PaymentDocumentNo = "PaymentDocumentNo";
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

@XendraTrl(Identifier="8fa3b140-3d3e-3f9a-e97a-157b61f1966b")
public static String es_PE_FIELD_BankStatement_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8fa3b140-3d3e-3f9a-e97a-157b61f1966b")
public static String es_PE_FIELD_BankStatement_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="8fa3b140-3d3e-3f9a-e97a-157b61f1966b")
public static String es_PE_FIELD_BankStatement_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fa3b140-3d3e-3f9a-e97a-157b61f1966b")
public static final String FIELDNAME_BankStatement_Processed="8fa3b140-3d3e-3f9a-e97a-157b61f1966b";

@XendraTrl(Identifier="ef478562-372b-a61a-00ee-61958885193f")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef478562-372b-a61a-00ee-61958885193f",
Synchronized="2017-08-05 16:54:49.0")
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

@XendraTrl(Identifier="47855019-f929-c1a4-ef19-10a85994d56c")
public static String es_PE_FIELD_BankStatement_ProcessNow_Description="Importa Estado de Cuenta";

@XendraTrl(Identifier="47855019-f929-c1a4-ef19-10a85994d56c")
public static String es_PE_FIELD_BankStatement_ProcessNow_Help="Los parámetros son valores por defaul para los valores nulos del expediente de la importación, ellos no sobreescriben ningunos datos.";

@XendraTrl(Identifier="47855019-f929-c1a4-ef19-10a85994d56c")
public static String es_PE_FIELD_BankStatement_ProcessNow_Name="Importar Extractos de Cuentas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47855019-f929-c1a4-ef19-10a85994d56c")
public static final String FIELDNAME_BankStatement_ProcessNow="47855019-f929-c1a4-ef19-10a85994d56c";

@XendraTrl(Identifier="7e55117e-cc40-7fbd-dc87-14affde16bbf")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="18af8124-ca9e-bd93-12da-ba4ce85cd49d",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7e55117e-cc40-7fbd-dc87-14affde16bbf",Synchronized="2017-08-05 16:54:49.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Reference No.
@param ReferenceNo Your customer or vendor number at the Business Partner's site */
public void setReferenceNo (String ReferenceNo)
{
if (ReferenceNo != null && ReferenceNo.length() > 40)
{
log.warning("Length > 40 - truncated");
ReferenceNo = ReferenceNo.substring(0,39);
}
set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
}
/** Get Reference No.
@return Your customer or vendor number at the Business Partner's site */
public String getReferenceNo() 
{
String value = (String)get_Value(COLUMNNAME_ReferenceNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7271efdc-a326-1764-00da-ce63716829d3")
public static String es_PE_FIELD_BankStatement_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="7271efdc-a326-1764-00da-ce63716829d3")
public static String es_PE_FIELD_BankStatement_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraTrl(Identifier="7271efdc-a326-1764-00da-ce63716829d3")
public static String es_PE_FIELD_BankStatement_ReferenceNo_Name="No. de Referencia";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7271efdc-a326-1764-00da-ce63716829d3")
public static final String FIELDNAME_BankStatement_ReferenceNo="7271efdc-a326-1764-00da-ce63716829d3";

@XendraTrl(Identifier="ef14d270-b387-0fca-5b49-4c71bc818505")
public static String es_PE_COLUMN_ReferenceNo_Name="No. de Referencia";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef14d270-b387-0fca-5b49-4c71bc818505",
Synchronized="2017-08-05 16:54:49.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";
/** Set Routing No.
@param RoutingNo Bank Routing Number */
public void setRoutingNo (String RoutingNo)
{
if (RoutingNo != null && RoutingNo.length() > 20)
{
log.warning("Length > 20 - truncated");
RoutingNo = RoutingNo.substring(0,19);
}
set_Value (COLUMNNAME_RoutingNo, RoutingNo);
}
/** Get Routing No.
@return Bank Routing Number */
public String getRoutingNo() 
{
String value = (String)get_Value(COLUMNNAME_RoutingNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="75131887-fad3-8191-453e-d2b8df91ff8f")
public static String es_PE_FIELD_BankStatement_RoutingNo_Description="Número de sucursal bancaria";

@XendraTrl(Identifier="75131887-fad3-8191-453e-d2b8df91ff8f")
public static String es_PE_FIELD_BankStatement_RoutingNo_Help="El número de ruta del banco (Número ABA) identifica un banco legal. Se usa en ruteo de cheques y transacciones electrónicas.";

@XendraTrl(Identifier="75131887-fad3-8191-453e-d2b8df91ff8f")
public static String es_PE_FIELD_BankStatement_RoutingNo_Name="No. de Ruta";

@XendraField(AD_Column_ID="RoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75131887-fad3-8191-453e-d2b8df91ff8f")
public static final String FIELDNAME_BankStatement_RoutingNo="75131887-fad3-8191-453e-d2b8df91ff8f";

@XendraTrl(Identifier="0f7fa172-1c25-ffc4-f377-19311aa8863d")
public static String es_PE_COLUMN_RoutingNo_Name="No. de Ruta";

@XendraColumn(AD_Element_ID="6fe1dae1-ff7f-9b06-686b-31ba56524158",ColumnName="RoutingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f7fa172-1c25-ffc4-f377-19311aa8863d",
Synchronized="2017-08-05 16:54:49.0")
/** Column name RoutingNo */
public static final String COLUMNNAME_RoutingNo = "RoutingNo";
/** Set Statement date.
@param StatementDate Date of the statement */
public void setStatementDate (Timestamp StatementDate)
{
set_Value (COLUMNNAME_StatementDate, StatementDate);
}
/** Get Statement date.
@return Date of the statement */
public Timestamp getStatementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatementDate);
}

@XendraTrl(Identifier="bcdf927e-6b3c-d696-2647-36adf1a96acd")
public static String es_PE_FIELD_BankStatement_StatementDate_Description="Fecha de proceso de un estado de cuentas";

@XendraTrl(Identifier="bcdf927e-6b3c-d696-2647-36adf1a96acd")
public static String es_PE_FIELD_BankStatement_StatementDate_Help="El campo fecha del estado de cuenta define la fecha del estado de cuenta que está siendo procesado.";

@XendraTrl(Identifier="bcdf927e-6b3c-d696-2647-36adf1a96acd")
public static String es_PE_FIELD_BankStatement_StatementDate_Name="Fecha de Estado de Cuenta";

@XendraField(AD_Column_ID="StatementDate",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcdf927e-6b3c-d696-2647-36adf1a96acd")
public static final String FIELDNAME_BankStatement_StatementDate="bcdf927e-6b3c-d696-2647-36adf1a96acd";

@XendraTrl(Identifier="92a96b97-69e6-cafe-4c2b-7bf00603c4c3")
public static String es_PE_COLUMN_StatementDate_Name="Fecha de Estado de Cuenta";

@XendraColumn(AD_Element_ID="99499740-aa9e-199a-8ae3-28cd928e33d1",ColumnName="StatementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92a96b97-69e6-cafe-4c2b-7bf00603c4c3",
Synchronized="2017-08-05 16:54:49.0")
/** Column name StatementDate */
public static final String COLUMNNAME_StatementDate = "StatementDate";
/** Set Statement Line Date.
@param StatementLineDate Date of the Statement Line */
public void setStatementLineDate (Timestamp StatementLineDate)
{
set_Value (COLUMNNAME_StatementLineDate, StatementLineDate);
}
/** Get Statement Line Date.
@return Date of the Statement Line */
public Timestamp getStatementLineDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatementLineDate);
}

@XendraTrl(Identifier="d4518db4-f1fd-70a3-4044-06364d081dce")
public static String es_PE_FIELD_BankStatement_StatementLineDate_Description="Fecha de el estado de línea";

@XendraTrl(Identifier="d4518db4-f1fd-70a3-4044-06364d081dce")
public static String es_PE_FIELD_BankStatement_StatementLineDate_Name="Fecha de Estado de Línea";

@XendraField(AD_Column_ID="StatementLineDate",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4518db4-f1fd-70a3-4044-06364d081dce")
public static final String FIELDNAME_BankStatement_StatementLineDate="d4518db4-f1fd-70a3-4044-06364d081dce";

@XendraTrl(Identifier="c08a59de-0bb3-6aad-a864-f800fb3802d1")
public static String es_PE_COLUMN_StatementLineDate_Name="Fecha de Estado de Línea";

@XendraColumn(AD_Element_ID="9cc0a961-4b24-c1bf-e2a7-074698bb9445",ColumnName="StatementLineDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c08a59de-0bb3-6aad-a864-f800fb3802d1",
Synchronized="2017-08-05 16:54:49.0")
/** Column name StatementLineDate */
public static final String COLUMNNAME_StatementLineDate = "StatementLineDate";
/** Set Statement amount.
@param StmtAmt Statement Amount */
public void setStmtAmt (BigDecimal StmtAmt)
{
set_Value (COLUMNNAME_StmtAmt, StmtAmt);
}
/** Get Statement amount.
@return Statement Amount */
public BigDecimal getStmtAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StmtAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1c34b611-8d6c-7e3f-f7d4-18eb1a7626ed")
public static String es_PE_FIELD_BankStatement_StatementAmount_Description="Total del Estado de Cuenta";

@XendraTrl(Identifier="1c34b611-8d6c-7e3f-f7d4-18eb1a7626ed")
public static String es_PE_FIELD_BankStatement_StatementAmount_Help="El Total del estado de cuenta indica el total de una línea simple del estado de cuenta";

@XendraTrl(Identifier="1c34b611-8d6c-7e3f-f7d4-18eb1a7626ed")
public static String es_PE_FIELD_BankStatement_StatementAmount_Name="Total del Estado de Cuenta";

@XendraField(AD_Column_ID="StmtAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c34b611-8d6c-7e3f-f7d4-18eb1a7626ed")
public static final String FIELDNAME_BankStatement_StatementAmount="1c34b611-8d6c-7e3f-f7d4-18eb1a7626ed";

@XendraTrl(Identifier="c1810797-687c-2a56-60a5-076378111397")
public static String es_PE_COLUMN_StmtAmt_Name="Total del Estado de Cuenta";

@XendraColumn(AD_Element_ID="ddbb5bef-b53b-8b96-f1bc-014ae727d005",ColumnName="StmtAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1810797-687c-2a56-60a5-076378111397",
Synchronized="2017-08-05 16:54:49.0")
/** Column name StmtAmt */
public static final String COLUMNNAME_StmtAmt = "StmtAmt";
/** Set Transaction Amount.
@param TrxAmt Amount of a transaction */
public void setTrxAmt (BigDecimal TrxAmt)
{
set_Value (COLUMNNAME_TrxAmt, TrxAmt);
}
/** Get Transaction Amount.
@return Amount of a transaction */
public BigDecimal getTrxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TrxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="02ced215-8afc-6a0e-99fb-e3cf0fe1fa98")
public static String es_PE_FIELD_BankStatement_TransactionAmount_Description="Total de una transacción";

@XendraTrl(Identifier="02ced215-8afc-6a0e-99fb-e3cf0fe1fa98")
public static String es_PE_FIELD_BankStatement_TransactionAmount_Help="El Total de la transacción indica el total para una transacción simple";

@XendraTrl(Identifier="02ced215-8afc-6a0e-99fb-e3cf0fe1fa98")
public static String es_PE_FIELD_BankStatement_TransactionAmount_Name="Total de la Transacción";

@XendraField(AD_Column_ID="TrxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02ced215-8afc-6a0e-99fb-e3cf0fe1fa98")
public static final String FIELDNAME_BankStatement_TransactionAmount="02ced215-8afc-6a0e-99fb-e3cf0fe1fa98";

@XendraTrl(Identifier="22f19df2-4e65-10f2-5007-328a662c3490")
public static String es_PE_COLUMN_TrxAmt_Name="Total de la Transacción";

@XendraColumn(AD_Element_ID="b6dd2b3a-bec1-6ad8-c860-9c03c52b5a44",ColumnName="TrxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22f19df2-4e65-10f2-5007-328a662c3490",
Synchronized="2017-08-05 16:54:49.0")
/** Column name TrxAmt */
public static final String COLUMNNAME_TrxAmt = "TrxAmt";

/** TrxType AD_Reference=a083d7a1-2e00-66db-651c-da45d285eb24 */
public static final int TRXTYPE_AD_Reference_ID=215;
/** Set Transaction Type.
@param TrxType Type of credit card transaction */
public void setTrxType (String TrxType)
{
if (TrxType == null || TrxType.equals(REF_C_PaymentTrxType.Sales) || TrxType.equals(REF_C_PaymentTrxType.DelayedCapture) || TrxType.equals(REF_C_PaymentTrxType.CreditPayment) || TrxType.equals(REF_C_PaymentTrxType.VoiceAuthorization) || TrxType.equals(REF_C_PaymentTrxType.Authorization) || TrxType.equals(REF_C_PaymentTrxType.Void));
 else throw new IllegalArgumentException ("TrxType Invalid value - " + TrxType + " - Reference_ID=215 - S - D - C - F - A - V");
if (TrxType != null && TrxType.length() > 20)
{
log.warning("Length > 20 - truncated");
TrxType = TrxType.substring(0,19);
}
set_Value (COLUMNNAME_TrxType, TrxType);
}
/** Get Transaction Type.
@return Type of credit card transaction */
public String getTrxType() 
{
return (String)get_Value(COLUMNNAME_TrxType);
}

@XendraTrl(Identifier="5716715f-f18a-c3af-0240-d70ab0d3ec9e")
public static String es_PE_FIELD_BankStatement_TransactionType_Description="Tipo de transacción de la tarjeta de crédito";

@XendraTrl(Identifier="5716715f-f18a-c3af-0240-d70ab0d3ec9e")
public static String es_PE_FIELD_BankStatement_TransactionType_Help="El tipo de transacción indica el tipo de transacción a ser sometida a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="5716715f-f18a-c3af-0240-d70ab0d3ec9e")
public static String es_PE_FIELD_BankStatement_TransactionType_Name="Tipo de Transacción";

@XendraField(AD_Column_ID="TrxType",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5716715f-f18a-c3af-0240-d70ab0d3ec9e")
public static final String FIELDNAME_BankStatement_TransactionType="5716715f-f18a-c3af-0240-d70ab0d3ec9e";

@XendraTrl(Identifier="a35b9e83-7076-7809-9480-52fd5dff0522")
public static String es_PE_COLUMN_TrxType_Name="Tipo de Transacción";

@XendraColumn(AD_Element_ID="4d4a53c4-1cc3-27bd-5eb1-03412d96bc93",ColumnName="TrxType",
AD_Reference_ID=17,AD_Reference_Value_ID="a083d7a1-2e00-66db-651c-da45d285eb24",AD_Val_Rule_ID="",
FieldLength=20,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a35b9e83-7076-7809-9480-52fd5dff0522",Synchronized="2017-08-05 16:54:49.0")
/** Column name TrxType */
public static final String COLUMNNAME_TrxType = "TrxType";
/** Set Effective date.
@param ValutaDate Date when money is available */
public void setValutaDate (Timestamp ValutaDate)
{
set_Value (COLUMNNAME_ValutaDate, ValutaDate);
}
/** Get Effective date.
@return Date when money is available */
public Timestamp getValutaDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ValutaDate);
}

@XendraTrl(Identifier="eca5b40e-f878-4c28-fe2b-a00bf8c73a0e")
public static String es_PE_FIELD_BankStatement_EffectiveDate_Description="Fecha cuando el dinero está disponible";

@XendraTrl(Identifier="eca5b40e-f878-4c28-fe2b-a00bf8c73a0e")
public static String es_PE_FIELD_BankStatement_EffectiveDate_Help="La fecha efectiva indica la fecha en que el dinero esté disponible en el banco";

@XendraTrl(Identifier="eca5b40e-f878-4c28-fe2b-a00bf8c73a0e")
public static String es_PE_FIELD_BankStatement_EffectiveDate_Name="Fecha Efectiva";

@XendraField(AD_Column_ID="ValutaDate",IsCentrallyMaintained=true,
AD_Tab_ID="b3741935-d841-28c8-a36c-0319b03c69a5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eca5b40e-f878-4c28-fe2b-a00bf8c73a0e")
public static final String FIELDNAME_BankStatement_EffectiveDate="eca5b40e-f878-4c28-fe2b-a00bf8c73a0e";

@XendraTrl(Identifier="8bb65c85-6799-3c68-c8e6-5ee5e58356ab")
public static String es_PE_COLUMN_ValutaDate_Name="Fecha Efectiva";

@XendraColumn(AD_Element_ID="e4600c7f-a40d-9373-8986-c69cdf7049c9",ColumnName="ValutaDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8bb65c85-6799-3c68-c8e6-5ee5e58356ab",
Synchronized="2017-08-05 16:54:49.0")
/** Column name ValutaDate */
public static final String COLUMNNAME_ValutaDate = "ValutaDate";
}
