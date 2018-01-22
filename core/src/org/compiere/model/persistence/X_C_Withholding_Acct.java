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
/** Generated Model for C_Withholding_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Withholding_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_Withholding_Acct_ID id
@param trxName transaction
*/
public X_C_Withholding_Acct (Properties ctx, int C_Withholding_Acct_ID, String trxName)
{
super (ctx, C_Withholding_Acct_ID, trxName);
/** if (C_Withholding_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_Withholding_ID (0);
setWithholding_Acct (0);
setWithholdingApply_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Withholding_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=400 */
public static int Table_ID=MTable.getTable_ID("C_Withholding_Acct");

@XendraTrl(Identifier="b9580b1e-520d-38bc-dfcf-133d7332c11c")
public static String es_PE_TAB_Accounting_Description="Contabilidad de Retenciones";

@XendraTrl(Identifier="b9580b1e-520d-38bc-dfcf-133d7332c11c")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="b9580b1e-520d-38bc-dfcf-133d7332c11c")
public static String es_PE_TAB_Accounting_Help="La pestaña de Contabilidad de Retención define los parámetros contables para retenciones.";

@XendraTab(Name="Accounting",Description="Withholding Accounting",
Help="The Withholding Accounting Tab defines the accounting parameters for Withholding.",
AD_Window_ID="1506817d-7a38-4734-8175-af48f9288444",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b9580b1e-520d-38bc-dfcf-133d7332c11c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="b9580b1e-520d-38bc-dfcf-133d7332c11c";

@XendraTrl(Identifier="1f47b380-cc34-69df-c7be-2749fc6dd0f5")
public static String es_PE_TABLE_C_Withholding_Acct_Name="C_Withholding_Acct";

@XendraTable(Name="C_Withholding_Acct",Description="",Help="",TableName="C_Withholding_Acct",
AccessLevel="3",AD_Window_ID="1506817d-7a38-4734-8175-af48f9288444",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="1f47b380-cc34-69df-c7be-2749fc6dd0f5",Synchronized="2017-08-16 11:42:33.0")
/** TableName=C_Withholding_Acct */
public static final String Table_Name="C_Withholding_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Withholding_Acct");

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
    Table_ID = MTable.getTable_ID("C_Withholding_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Withholding_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="9db94f8d-6efb-272f-6fee-13d2e27dcbbd")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="9db94f8d-6efb-272f-6fee-13d2e27dcbbd")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="9db94f8d-6efb-272f-6fee-13d2e27dcbbd")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b9580b1e-520d-38bc-dfcf-133d7332c11c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9db94f8d-6efb-272f-6fee-13d2e27dcbbd")
public static final String FIELDNAME_Accounting_AccountingSchema="9db94f8d-6efb-272f-6fee-13d2e27dcbbd";

@XendraTrl(Identifier="10a5a51c-eff2-13d2-859c-38738328ca3b")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10a5a51c-eff2-13d2-859c-38738328ca3b",
Synchronized="2017-08-05 16:54:31.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Withholding.
@param C_Withholding_ID Withholding type defined */
public void setC_Withholding_ID (int C_Withholding_ID)
{
if (C_Withholding_ID < 1) throw new IllegalArgumentException ("C_Withholding_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Withholding_ID, Integer.valueOf(C_Withholding_ID));
}
/** Get Withholding.
@return Withholding type defined */
public int getC_Withholding_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Withholding_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c7a201b-cbae-a969-98e8-9fe107329cf9")
public static String es_PE_FIELD_Accounting_Withholding_Description="Tipo de retención definida";

@XendraTrl(Identifier="2c7a201b-cbae-a969-98e8-9fe107329cf9")
public static String es_PE_FIELD_Accounting_Withholding_Help="La Retención indica el tipo de retención a ser calculada";

@XendraTrl(Identifier="2c7a201b-cbae-a969-98e8-9fe107329cf9")
public static String es_PE_FIELD_Accounting_Withholding_Name="Retención";

@XendraField(AD_Column_ID="C_Withholding_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b9580b1e-520d-38bc-dfcf-133d7332c11c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c7a201b-cbae-a969-98e8-9fe107329cf9")
public static final String FIELDNAME_Accounting_Withholding="2c7a201b-cbae-a969-98e8-9fe107329cf9";

@XendraTrl(Identifier="f4a34dfa-bd84-b3f6-a7d9-e6967adf9ef3")
public static String es_PE_COLUMN_C_Withholding_ID_Name="Retención";

@XendraColumn(AD_Element_ID="518d5ae2-65ee-2bb8-8c37-13beaceecf15",ColumnName="C_Withholding_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4a34dfa-bd84-b3f6-a7d9-e6967adf9ef3",
Synchronized="2017-08-05 16:54:31.0")
/** Column name C_Withholding_ID */
public static final String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
/** Set Exchange_Acct.
@param Exchange_Acct Exchange_Acct */
public void setExchange_Acct (int Exchange_Acct)
{
set_Value (COLUMNNAME_Exchange_Acct, Integer.valueOf(Exchange_Acct));
}
/** Get Exchange_Acct.
@return Exchange_Acct */
public int getExchange_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Exchange_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b621765c-6ae2-4609-bf6a-dcd9782b7bc5")
public static String es_PE_COLUMN_Exchange_Acct_Name="exchange_acct";

@XendraColumn(AD_Element_ID="32c30e0c-3792-4ceb-a314-91bb8bde0a93",ColumnName="Exchange_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b621765c-6ae2-4609-bf6a-dcd9782b7bc5",
Synchronized="2017-08-05 16:54:31.0")
/** Column name Exchange_Acct */
public static final String COLUMNNAME_Exchange_Acct = "Exchange_Acct";
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
@XendraTrl(Identifier="b1fabbca-f733-4409-bd24-0cdd170afc98")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1fabbca-f733-4409-bd24-0cdd170afc98",
Synchronized="2017-08-05 16:54:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Vendor_Acct.
@param Vendor_Acct Vendor_Acct */
public void setVendor_Acct (int Vendor_Acct)
{
set_Value (COLUMNNAME_Vendor_Acct, Integer.valueOf(Vendor_Acct));
}
/** Get Vendor_Acct.
@return Vendor_Acct */
public int getVendor_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Vendor_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e2c78244-c1f6-41f3-a5c5-f76f299334e4")
public static String es_PE_COLUMN_Vendor_Acct_Name="vendor_acct";

@XendraColumn(AD_Element_ID="e404b4bb-5484-4744-a11e-0ae889fe7fe0",ColumnName="Vendor_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2c78244-c1f6-41f3-a5c5-f76f299334e4",
Synchronized="2017-08-05 16:54:31.0")
/** Column name Vendor_Acct */
public static final String COLUMNNAME_Vendor_Acct = "Vendor_Acct";
/** Set VendorExchange_Acct.
@param VendorExchange_Acct VendorExchange_Acct */
public void setVendorExchange_Acct (int VendorExchange_Acct)
{
set_Value (COLUMNNAME_VendorExchange_Acct, Integer.valueOf(VendorExchange_Acct));
}
/** Get VendorExchange_Acct.
@return VendorExchange_Acct */
public int getVendorExchange_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_VendorExchange_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="50b09762-2836-4151-81dd-7d52d789cdc1")
public static String es_PE_COLUMN_VendorExchange_Acct_Name="vendorexchange_acct";

@XendraColumn(AD_Element_ID="4339a2f3-9472-4b5b-929a-e31a0eef2ef3",
ColumnName="VendorExchange_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="50b09762-2836-4151-81dd-7d52d789cdc1",Synchronized="2017-08-05 16:54:31.0")
/** Column name VendorExchange_Acct */
public static final String COLUMNNAME_VendorExchange_Acct = "VendorExchange_Acct";
/** Set Withholding.
@param Withholding_Acct Account for Withholdings */
public void setWithholding_Acct (int Withholding_Acct)
{
set_Value (COLUMNNAME_Withholding_Acct, Integer.valueOf(Withholding_Acct));
}
/** Get Withholding.
@return Account for Withholdings */
public int getWithholding_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Withholding_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1d3bd55b-7d38-7662-f590-44e55dc7f579")
public static String es_PE_FIELD_Accounting_Withholding2_Description="Cuenta de Retenciones";

@XendraTrl(Identifier="1d3bd55b-7d38-7662-f590-44e55dc7f579")
public static String es_PE_FIELD_Accounting_Withholding2_Help="La cuenta de Retenciones indica la cuenta para registrar retenciones";

@XendraTrl(Identifier="1d3bd55b-7d38-7662-f590-44e55dc7f579")
public static String es_PE_FIELD_Accounting_Withholding2_Name="Retención";

@XendraField(AD_Column_ID="Withholding_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="b9580b1e-520d-38bc-dfcf-133d7332c11c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d3bd55b-7d38-7662-f590-44e55dc7f579")
public static final String FIELDNAME_Accounting_Withholding2="1d3bd55b-7d38-7662-f590-44e55dc7f579";

@XendraTrl(Identifier="b93fb1d5-39c8-d802-321e-990b4a855162")
public static String es_PE_COLUMN_Withholding_Acct_Name="Retención";

@XendraColumn(AD_Element_ID="0bfcae8b-77ff-accf-048a-406950de843b",ColumnName="Withholding_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b93fb1d5-39c8-d802-321e-990b4a855162",
Synchronized="2017-08-05 16:54:31.0")
/** Column name Withholding_Acct */
public static final String COLUMNNAME_Withholding_Acct = "Withholding_Acct";
/** Set WithholdingApply_Acct.
@param WithholdingApply_Acct WithholdingApply_Acct */
public void setWithholdingApply_Acct (int WithholdingApply_Acct)
{
set_Value (COLUMNNAME_WithholdingApply_Acct, Integer.valueOf(WithholdingApply_Acct));
}
/** Get WithholdingApply_Acct.
@return WithholdingApply_Acct */
public int getWithholdingApply_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_WithholdingApply_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="22758871-b97b-41a7-9092-bce023f93e8c")
public static String es_PE_FIELD_Accounting_WithholdingApply_Acct_Name="withholdingapply_acct";

@XendraField(AD_Column_ID="WithholdingApply_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="b9580b1e-520d-38bc-dfcf-133d7332c11c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-04-03 19:00:44.0",
Identifier="22758871-b97b-41a7-9092-bce023f93e8c")
public static final String FIELDNAME_Accounting_WithholdingApply_Acct="22758871-b97b-41a7-9092-bce023f93e8c";

@XendraTrl(Identifier="d4dbf196-2b30-4b26-bd9d-bcd6d04b8f71")
public static String es_PE_COLUMN_WithholdingApply_Acct_Name="withholdingapply_acct";

@XendraColumn(AD_Element_ID="da8ffbbe-c0a8-4fd5-805b-177f86451703",
ColumnName="WithholdingApply_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1.000000000000",IsSelectionColumn=false,
AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d4dbf196-2b30-4b26-bd9d-bcd6d04b8f71",Synchronized="2017-08-05 16:54:31.0")
/** Column name WithholdingApply_Acct */
public static final String COLUMNNAME_WithholdingApply_Acct = "WithholdingApply_Acct";
}
