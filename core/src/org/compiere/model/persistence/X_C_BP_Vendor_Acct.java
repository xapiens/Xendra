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
/** Generated Model for C_BP_Vendor_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_Vendor_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_Vendor_Acct_ID id
@param trxName transaction
*/
public X_C_BP_Vendor_Acct (Properties ctx, int C_BP_Vendor_Acct_ID, String trxName)
{
super (ctx, C_BP_Vendor_Acct_ID, trxName);
/** if (C_BP_Vendor_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_BPartner_ID (0);
setV_Liability_Acct (0);
setV_Prepayment_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_Vendor_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=185 */
public static int Table_ID=MTable.getTable_ID("C_BP_Vendor_Acct");

@XendraTrl(Identifier="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1")
public static String es_PE_TAB_VendorAccounting_Description="Definir Contabilidad del Proveedor";

@XendraTrl(Identifier="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1")
public static String es_PE_TAB_VendorAccounting_Name="Contabilidad del Proveedor";

@XendraTrl(Identifier="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1")
public static String es_PE_TAB_VendorAccounting_Help="La pestaña de Contabilidad del Proveedor define los valores predeterminados usados cuando este proveedor es seleccionado en una transacción de cuentas por pagar.";

@XendraTab(Name="Vendor Accounting",Description="Define Vendor Accounting",
Help="The Vendor Accounting Tab defines the default accounts to use when this business partner is referenced in an accounts payable transaction.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=50,TabLevel=2,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="8245284e-9838-af55-c061-18919fef0b6c",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_VendorAccounting="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1";

@XendraTrl(Identifier="53705259-baa5-5ee0-2530-ed9b327969b5")
public static String es_PE_TABLE_C_BP_Vendor_Acct_Name="C_BP_Vendor_Acct";

@XendraTable(Name="C_BP_Vendor_Acct",Description="",Help="",TableName="C_BP_Vendor_Acct",
AccessLevel="3",AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="53705259-baa5-5ee0-2530-ed9b327969b5",Synchronized="2017-08-16 11:41:34.0")
/** TableName=C_BP_Vendor_Acct */
public static final String Table_Name="C_BP_Vendor_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_Vendor_Acct");

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
    Table_ID = MTable.getTable_ID("C_BP_Vendor_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_Vendor_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="24233adb-3638-e621-62b8-aa1cf7d9fcf7")
public static String es_PE_FIELD_VendorAccounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="24233adb-3638-e621-62b8-aa1cf7d9fcf7")
public static String es_PE_FIELD_VendorAccounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="24233adb-3638-e621-62b8-aa1cf7d9fcf7")
public static String es_PE_FIELD_VendorAccounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24233adb-3638-e621-62b8-aa1cf7d9fcf7")
public static final String FIELDNAME_VendorAccounting_AccountingSchema="24233adb-3638-e621-62b8-aa1cf7d9fcf7";

@XendraTrl(Identifier="bdb2503e-5533-d28b-5fe1-d7a5d9e0c119")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bdb2503e-5533-d28b-5fe1-d7a5d9e0c119",
Synchronized="2017-08-05 16:53:26.0")
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

@XendraTrl(Identifier="48d5691f-5532-a600-474d-21c504628b95")
public static String es_PE_FIELD_VendorAccounting_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="48d5691f-5532-a600-474d-21c504628b95")
public static String es_PE_FIELD_VendorAccounting_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="48d5691f-5532-a600-474d-21c504628b95")
public static String es_PE_FIELD_VendorAccounting_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48d5691f-5532-a600-474d-21c504628b95")
public static final String FIELDNAME_VendorAccounting_BusinessPartner="48d5691f-5532-a600-474d-21c504628b95";

@XendraTrl(Identifier="8245284e-9838-af55-c061-18919fef0b6c")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8245284e-9838-af55-c061-18919fef0b6c",
Synchronized="2017-08-05 16:53:26.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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
@XendraTrl(Identifier="a6a87a3d-3473-49f3-b4e4-67210b445dcd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6a87a3d-3473-49f3-b4e4-67210b445dcd",
Synchronized="2017-08-05 16:53:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Vendor Liability.
@param V_Liability_Acct Account for Vendor Liability */
public void setV_Liability_Acct (int V_Liability_Acct)
{
set_Value (COLUMNNAME_V_Liability_Acct, Integer.valueOf(V_Liability_Acct));
}
/** Get Vendor Liability.
@return Account for Vendor Liability */
public int getV_Liability_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_V_Liability_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08c9fb63-311a-f115-e27c-bea55baf5d36")
public static String es_PE_FIELD_VendorAccounting_VendorLiability_Description="Cuenta por pagar a proveedores";

@XendraTrl(Identifier="08c9fb63-311a-f115-e27c-bea55baf5d36")
public static String es_PE_FIELD_VendorAccounting_VendorLiability_Help="La cuenta por pagar a proveedores indica la cuenta usada para registrar transacciones para pasivos de proveedores";

@XendraTrl(Identifier="08c9fb63-311a-f115-e27c-bea55baf5d36")
public static String es_PE_FIELD_VendorAccounting_VendorLiability_Name="CxP del Proveedor";

@XendraField(AD_Column_ID="V_Liability_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08c9fb63-311a-f115-e27c-bea55baf5d36")
public static final String FIELDNAME_VendorAccounting_VendorLiability="08c9fb63-311a-f115-e27c-bea55baf5d36";

@XendraTrl(Identifier="7c20cea9-399b-e7b0-4f60-d00eb5420e97")
public static String es_PE_COLUMN_V_Liability_Acct_Name="CxP del Proveedor";

@XendraColumn(AD_Element_ID="e29c7545-3824-1bd2-2c19-97e5fec61099",ColumnName="V_Liability_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c20cea9-399b-e7b0-4f60-d00eb5420e97",
Synchronized="2017-08-05 16:53:26.0")
/** Column name V_Liability_Acct */
public static final String COLUMNNAME_V_Liability_Acct = "V_Liability_Acct";
/** Set Vendor Service Liability.
@param V_Liability_Services_Acct Account for Vender Service Liability */
public void setV_Liability_Services_Acct (int V_Liability_Services_Acct)
{
set_Value (COLUMNNAME_V_Liability_Services_Acct, Integer.valueOf(V_Liability_Services_Acct));
}
/** Get Vendor Service Liability.
@return Account for Vender Service Liability */
public int getV_Liability_Services_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_V_Liability_Services_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5eb9ed0e-e326-3740-1ede-a2944c60d5eb")
public static String es_PE_FIELD_VendorAccounting_VendorServiceLiability_Description="Cuenta por pagar a proveedores de servicios";

@XendraTrl(Identifier="5eb9ed0e-e326-3740-1ede-a2944c60d5eb")
public static String es_PE_FIELD_VendorAccounting_VendorServiceLiability_Help="La cuenta de pasivos por servicios a proveedores";

@XendraTrl(Identifier="5eb9ed0e-e326-3740-1ede-a2944c60d5eb")
public static String es_PE_FIELD_VendorAccounting_VendorServiceLiability_Name="CxP del Proveedor de Servicios";

@XendraField(AD_Column_ID="V_Liability_Services_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5eb9ed0e-e326-3740-1ede-a2944c60d5eb")
public static final String FIELDNAME_VendorAccounting_VendorServiceLiability="5eb9ed0e-e326-3740-1ede-a2944c60d5eb";

@XendraTrl(Identifier="c17596e3-2243-40d5-d07e-8f5f50147397")
public static String es_PE_COLUMN_V_Liability_Services_Acct_Name="CxP del Proveedor de Servicios";

@XendraColumn(AD_Element_ID="8e204c54-fe89-0381-543a-caba88fb2eb6",
ColumnName="V_Liability_Services_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c17596e3-2243-40d5-d07e-8f5f50147397",Synchronized="2017-08-05 16:53:26.0")
/** Column name V_Liability_Services_Acct */
public static final String COLUMNNAME_V_Liability_Services_Acct = "V_Liability_Services_Acct";
/** Set Vendor Prepayment.
@param V_Prepayment_Acct Account for Vendor Prepayments */
public void setV_Prepayment_Acct (int V_Prepayment_Acct)
{
set_Value (COLUMNNAME_V_Prepayment_Acct, Integer.valueOf(V_Prepayment_Acct));
}
/** Get Vendor Prepayment.
@return Account for Vendor Prepayments */
public int getV_Prepayment_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_V_Prepayment_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="237c5fb4-340c-a46b-c644-528641f075be")
public static String es_PE_FIELD_VendorAccounting_VendorPrepayment_Description="Cuenta para prepagos del proveedor";

@XendraTrl(Identifier="237c5fb4-340c-a46b-c644-528641f075be")
public static String es_PE_FIELD_VendorAccounting_VendorPrepayment_Help="La cuenta de prepagos del proveedor indica la cuenta usada para registrar pagos anticipados a un proveedor";

@XendraTrl(Identifier="237c5fb4-340c-a46b-c644-528641f075be")
public static String es_PE_FIELD_VendorAccounting_VendorPrepayment_Name="Prepago del proveedor";

@XendraField(AD_Column_ID="V_Prepayment_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="1dd6ba5c-4530-9ef4-97e7-a34d48a7e0f1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="237c5fb4-340c-a46b-c644-528641f075be")
public static final String FIELDNAME_VendorAccounting_VendorPrepayment="237c5fb4-340c-a46b-c644-528641f075be";

@XendraTrl(Identifier="7f8475e4-d6e6-79f3-606b-e860806e820c")
public static String es_PE_COLUMN_V_Prepayment_Acct_Name="Prepago del proveedor";

@XendraColumn(AD_Element_ID="cd6be1eb-3769-4db5-ea33-4b298a8725a5",ColumnName="V_Prepayment_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f8475e4-d6e6-79f3-606b-e860806e820c",
Synchronized="2017-08-05 16:53:26.0")
/** Column name V_Prepayment_Acct */
public static final String COLUMNNAME_V_Prepayment_Acct = "V_Prepayment_Acct";
}
