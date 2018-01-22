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
/** Generated Model for C_BP_Customer_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_Customer_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_Customer_Acct_ID id
@param trxName transaction
*/
public X_C_BP_Customer_Acct (Properties ctx, int C_BP_Customer_Acct_ID, String trxName)
{
super (ctx, C_BP_Customer_Acct_ID, trxName);
/** if (C_BP_Customer_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_BPartner_ID (0);
setC_Prepayment_Acct (0);
setC_Receivable_Acct (0);
setC_Receivable_Services_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_Customer_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=183 */
public static int Table_ID=MTable.getTable_ID("C_BP_Customer_Acct");

@XendraTrl(Identifier="120cca52-7b58-5ccd-a155-f2ed356b61a3")
public static String es_PE_TAB_CustomerAccounting_Description="Definir Contabilidad del Cliente";

@XendraTrl(Identifier="120cca52-7b58-5ccd-a155-f2ed356b61a3")
public static String es_PE_TAB_CustomerAccounting_Name="Contabilidad del Cliente";

@XendraTrl(Identifier="120cca52-7b58-5ccd-a155-f2ed356b61a3")
public static String es_PE_TAB_CustomerAccounting_Help="La pestaña Contabilidad del Cliente define los valores predeterminados usados cuando este socio de negocio es seleccionado en una transacción de cuentas por recibir.";

@XendraTab(Name="Customer Accounting",Description="Define Customer Accounting",
Help="The Customer Accounting Tab defines the default accounts to use when this business partner is referenced on an accounts receivable transaction.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=30,TabLevel=2,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="fd50a4df-5a54-348f-2614-b94b2eef1867",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="120cca52-7b58-5ccd-a155-f2ed356b61a3",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CustomerAccounting="120cca52-7b58-5ccd-a155-f2ed356b61a3";

@XendraTrl(Identifier="40047b7f-f64a-de82-5f42-397d3427f66a")
public static String es_PE_TABLE_C_BP_Customer_Acct_Name="C_BP_Customer_Acct";

@XendraTable(Name="C_BP_Customer_Acct",Description="",Help="",TableName="C_BP_Customer_Acct",
AccessLevel="3",AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="40047b7f-f64a-de82-5f42-397d3427f66a",Synchronized="2017-08-16 11:41:32.0")
/** TableName=C_BP_Customer_Acct */
public static final String Table_Name="C_BP_Customer_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_Customer_Acct");

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
    Table_ID = MTable.getTable_ID("C_BP_Customer_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_Customer_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
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

@XendraTrl(Identifier="dbbd3427-5abb-6b26-2489-27981a17abf2")
public static String es_PE_FIELD_CustomerAccounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="dbbd3427-5abb-6b26-2489-27981a17abf2")
public static String es_PE_FIELD_CustomerAccounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="dbbd3427-5abb-6b26-2489-27981a17abf2")
public static String es_PE_FIELD_CustomerAccounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="120cca52-7b58-5ccd-a155-f2ed356b61a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbbd3427-5abb-6b26-2489-27981a17abf2")
public static final String FIELDNAME_CustomerAccounting_AccountingSchema="dbbd3427-5abb-6b26-2489-27981a17abf2";

@XendraTrl(Identifier="07b028d3-2908-6526-181e-9ead4177e0f8")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07b028d3-2908-6526-181e-9ead4177e0f8",
Synchronized="2017-08-05 16:53:24.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97cf80c0-d74d-f2bc-c09d-0c5190552f34")
public static String es_PE_FIELD_CustomerAccounting_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="97cf80c0-d74d-f2bc-c09d-0c5190552f34")
public static String es_PE_FIELD_CustomerAccounting_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="97cf80c0-d74d-f2bc-c09d-0c5190552f34")
public static String es_PE_FIELD_CustomerAccounting_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="120cca52-7b58-5ccd-a155-f2ed356b61a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97cf80c0-d74d-f2bc-c09d-0c5190552f34")
public static final String FIELDNAME_CustomerAccounting_BusinessPartner="97cf80c0-d74d-f2bc-c09d-0c5190552f34";

@XendraTrl(Identifier="fd50a4df-5a54-348f-2614-b94b2eef1867")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd50a4df-5a54-348f-2614-b94b2eef1867",
Synchronized="2017-08-05 16:53:24.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Customer Prepayment.
@param C_Prepayment_Acct Account for customer prepayments */
public void setC_Prepayment_Acct (int C_Prepayment_Acct)
{
set_Value (COLUMNNAME_C_Prepayment_Acct, Integer.valueOf(C_Prepayment_Acct));
}
/** Get Customer Prepayment.
@return Account for customer prepayments */
public int getC_Prepayment_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Prepayment_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e6e4b4c7-48a8-83ab-9049-29faeeb8bf49")
public static String es_PE_FIELD_CustomerAccounting_CustomerPrepayment_Description="Cuenta para pagos anticipados de clientes.";

@XendraTrl(Identifier="e6e4b4c7-48a8-83ab-9049-29faeeb8bf49")
public static String es_PE_FIELD_CustomerAccounting_CustomerPrepayment_Help="La cuenta para pagos anticipados de clientes indica la cuenta a ser usada para registrar pagos anticipados de clientes.";

@XendraTrl(Identifier="e6e4b4c7-48a8-83ab-9049-29faeeb8bf49")
public static String es_PE_FIELD_CustomerAccounting_CustomerPrepayment_Name="Pago Anticipado de Clientes";

@XendraField(AD_Column_ID="C_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="120cca52-7b58-5ccd-a155-f2ed356b61a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6e4b4c7-48a8-83ab-9049-29faeeb8bf49")
public static final String FIELDNAME_CustomerAccounting_CustomerPrepayment="e6e4b4c7-48a8-83ab-9049-29faeeb8bf49";

@XendraTrl(Identifier="f64f26d2-c5b3-4a7d-183a-edf968e8bf2f")
public static String es_PE_COLUMN_C_Prepayment_Acct_Name="Pago Anticipado de Clientes";

@XendraColumn(AD_Element_ID="8fce2dea-0db2-e7fc-767e-344c87d2f65a",ColumnName="C_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f64f26d2-c5b3-4a7d-183a-edf968e8bf2f",
Synchronized="2017-08-05 16:53:24.0")
/** Column name C_Prepayment_Acct */
public static final String COLUMNNAME_C_Prepayment_Acct = "C_Prepayment_Acct";
/** Set Customer Receivables.
@param C_Receivable_Acct Account for Customer Receivables */
public void setC_Receivable_Acct (int C_Receivable_Acct)
{
set_Value (COLUMNNAME_C_Receivable_Acct, Integer.valueOf(C_Receivable_Acct));
}
/** Get Customer Receivables.
@return Account for Customer Receivables */
public int getC_Receivable_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Receivable_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2b4ed994-2c3e-333b-05f9-d84653c1a16c")
public static String es_PE_FIELD_CustomerAccounting_CustomerReceivables_Description="Cuenta por cobrar de clientes";

@XendraTrl(Identifier="2b4ed994-2c3e-333b-05f9-d84653c1a16c")
public static String es_PE_FIELD_CustomerAccounting_CustomerReceivables_Help="La cuenta por cobrar de clientes indica la cuenta a ser usada para registrar transacciones de cobros a clientes";

@XendraTrl(Identifier="2b4ed994-2c3e-333b-05f9-d84653c1a16c")
public static String es_PE_FIELD_CustomerAccounting_CustomerReceivables_Name="CxC de Clientes";

@XendraField(AD_Column_ID="C_Receivable_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="120cca52-7b58-5ccd-a155-f2ed356b61a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b4ed994-2c3e-333b-05f9-d84653c1a16c")
public static final String FIELDNAME_CustomerAccounting_CustomerReceivables="2b4ed994-2c3e-333b-05f9-d84653c1a16c";

@XendraTrl(Identifier="2007f658-24dd-fc85-7873-a0302c906bc2")
public static String es_PE_COLUMN_C_Receivable_Acct_Name="CxC de Clientes";

@XendraColumn(AD_Element_ID="40fe8c0a-9ee8-fe94-a8c9-b45c09c9a30d",ColumnName="C_Receivable_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2007f658-24dd-fc85-7873-a0302c906bc2",
Synchronized="2017-08-05 16:53:24.0")
/** Column name C_Receivable_Acct */
public static final String COLUMNNAME_C_Receivable_Acct = "C_Receivable_Acct";
/** Set Receivable Services.
@param C_Receivable_Services_Acct Customer Accounts Receivables Services Account */
public void setC_Receivable_Services_Acct (int C_Receivable_Services_Acct)
{
set_Value (COLUMNNAME_C_Receivable_Services_Acct, Integer.valueOf(C_Receivable_Services_Acct));
}
/** Get Receivable Services.
@return Customer Accounts Receivables Services Account */
public int getC_Receivable_Services_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Receivable_Services_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e912ab7b-b2d2-a4e8-199c-23dfa85a6aea")
public static String es_PE_FIELD_CustomerAccounting_ReceivableServices_Description="Cuenta Clientes CxC Servicios ";

@XendraTrl(Identifier="e912ab7b-b2d2-a4e8-199c-23dfa85a6aea")
public static String es_PE_FIELD_CustomerAccounting_ReceivableServices_Help="Cuenta para aplicar servicios relacionados CxC. Si desea diferenciar ingresos por Productos y Servicios. Esta cuenta solamente es empleada, si la aplicación para la cuenta servicios está habilitado en el esquema contable.";

@XendraTrl(Identifier="e912ab7b-b2d2-a4e8-199c-23dfa85a6aea")
public static String es_PE_FIELD_CustomerAccounting_ReceivableServices_Name="CxC Servicios";

@XendraField(AD_Column_ID="C_Receivable_Services_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="120cca52-7b58-5ccd-a155-f2ed356b61a3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e912ab7b-b2d2-a4e8-199c-23dfa85a6aea")
public static final String FIELDNAME_CustomerAccounting_ReceivableServices="e912ab7b-b2d2-a4e8-199c-23dfa85a6aea";

@XendraTrl(Identifier="4a3a7558-46b7-8fb0-1a71-072c65bc1676")
public static String es_PE_COLUMN_C_Receivable_Services_Acct_Name="CxC Servicios";

@XendraColumn(AD_Element_ID="9bd443ea-2c92-edbc-96ce-3eb12789faf4",
ColumnName="C_Receivable_Services_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4a3a7558-46b7-8fb0-1a71-072c65bc1676",Synchronized="2017-08-05 16:53:24.0")
/** Column name C_Receivable_Services_Acct */
public static final String COLUMNNAME_C_Receivable_Services_Acct = "C_Receivable_Services_Acct";
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
@XendraTrl(Identifier="744fea63-9a76-42fe-8376-0d0327f220e8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="744fea63-9a76-42fe-8376-0d0327f220e8",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
