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
/** Generated Model for C_Currency_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Currency_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_Currency_Acct_ID id
@param trxName transaction
*/
public X_C_Currency_Acct (Properties ctx, int C_Currency_Acct_ID, String trxName)
{
super (ctx, C_Currency_Acct_ID, trxName);
/** if (C_Currency_Acct_ID == 0)
{
setC_AcctSchema_ID (0);
setC_Currency_ID (0);
setRealizedGain_Acct (0);
setRealizedLoss_Acct (0);
setUnrealizedGain_Acct (0);
setUnrealizedLoss_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Currency_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=638 */
public static int Table_ID=MTable.getTable_ID("C_Currency_Acct");

@XendraTrl(Identifier="475573f8-1e15-5af4-fc8f-85408cb856dc")
public static String es_PE_TAB_Accounting_Description="Moneda de la Contabilidad";

@XendraTrl(Identifier="475573f8-1e15-5af4-fc8f-85408cb856dc")
public static String es_PE_TAB_Accounting_Name="Contabilidad";

@XendraTrl(Identifier="475573f8-1e15-5af4-fc8f-85408cb856dc")
public static String es_PE_TAB_Accounting_Help="La tabla de la contabilidad define los parámetros de la contabilidad usados para las transacciones incluyendo una moneda. ¡Por favor se utiliza el node que si no definió, las cuentas de defecto del esquema de la contabilidad!";

@XendraTab(Name="Accounting",Description="Currency Accounting",
Help="The Accounting Tab defines the accounting parameters used for transactions including a currency. Please nore that if not defined, the default accounts of the Accounting Schema are used!",
AD_Window_ID="69518fbe-add4-e240-8d5a-c664ddd2ccd1",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="bb8474d8-2105-54c9-13dd-cb4806852dd2",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="475573f8-1e15-5af4-fc8f-85408cb856dc",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="475573f8-1e15-5af4-fc8f-85408cb856dc";

@XendraTrl(Identifier="bd6c23a6-5335-12a4-94f4-2921bab14581")
public static String es_PE_TABLE_C_Currency_Acct_Name="C_Currency_Acct";

@XendraTable(Name="C_Currency_Acct",Description="",Help="",TableName="C_Currency_Acct",
AccessLevel="3",AD_Window_ID="69518fbe-add4-e240-8d5a-c664ddd2ccd1",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="bd6c23a6-5335-12a4-94f4-2921bab14581",Synchronized="2017-08-16 11:41:42.0")
/** TableName=C_Currency_Acct */
public static final String Table_Name="C_Currency_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Currency_Acct");

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
    Table_ID = MTable.getTable_ID("C_Currency_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Currency_Acct[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="b3662358-5a8c-689e-7ef0-d7621ace23ae")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="b3662358-5a8c-689e-7ef0-d7621ace23ae")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="b3662358-5a8c-689e-7ef0-d7621ace23ae")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="475573f8-1e15-5af4-fc8f-85408cb856dc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3662358-5a8c-689e-7ef0-d7621ace23ae")
public static final String FIELDNAME_Accounting_AccountingSchema="b3662358-5a8c-689e-7ef0-d7621ace23ae";

@XendraTrl(Identifier="0fe68d0e-ccd4-89e5-5831-eb87e5110d10")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fe68d0e-ccd4-89e5-5831-eb87e5110d10",
Synchronized="2017-08-05 16:53:34.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="450a315c-107b-0f33-4fa2-3ad760e7fe6a")
public static String es_PE_FIELD_Accounting_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="450a315c-107b-0f33-4fa2-3ad760e7fe6a")
public static String es_PE_FIELD_Accounting_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="450a315c-107b-0f33-4fa2-3ad760e7fe6a")
public static String es_PE_FIELD_Accounting_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="475573f8-1e15-5af4-fc8f-85408cb856dc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="450a315c-107b-0f33-4fa2-3ad760e7fe6a")
public static final String FIELDNAME_Accounting_Currency="450a315c-107b-0f33-4fa2-3ad760e7fe6a";

@XendraTrl(Identifier="bb8474d8-2105-54c9-13dd-cb4806852dd2")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb8474d8-2105-54c9-13dd-cb4806852dd2",
Synchronized="2017-08-05 16:53:34.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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
@XendraTrl(Identifier="877f1ccd-6b11-4796-9069-b5a525129611")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="877f1ccd-6b11-4796-9069-b5a525129611",
Synchronized="2017-08-05 16:53:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Realized Gain Acct.
@param RealizedGain_Acct Realized Gain Account */
public void setRealizedGain_Acct (int RealizedGain_Acct)
{
set_Value (COLUMNNAME_RealizedGain_Acct, Integer.valueOf(RealizedGain_Acct));
}
/** Get Realized Gain Acct.
@return Realized Gain Account */
public int getRealizedGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RealizedGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="227f83db-4e96-de41-5e59-ec47baa0b373")
public static String es_PE_FIELD_Accounting_RealizedGainAcct_Description="Cuenta de ganancia realizada";

@XendraTrl(Identifier="227f83db-4e96-de41-5e59-ec47baa0b373")
public static String es_PE_FIELD_Accounting_RealizedGainAcct_Help="La cuenta de ganancia realizada indica la cuenta a ser usada cuando se registran ganancias realizadas por reevaluación de moneda";

@XendraTrl(Identifier="227f83db-4e96-de41-5e59-ec47baa0b373")
public static String es_PE_FIELD_Accounting_RealizedGainAcct_Name="Cta. Ganancia Realizada";

@XendraField(AD_Column_ID="RealizedGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="475573f8-1e15-5af4-fc8f-85408cb856dc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="227f83db-4e96-de41-5e59-ec47baa0b373")
public static final String FIELDNAME_Accounting_RealizedGainAcct="227f83db-4e96-de41-5e59-ec47baa0b373";

@XendraTrl(Identifier="7545cc22-b390-2ec9-9a4e-715b4242c83d")
public static String es_PE_COLUMN_RealizedGain_Acct_Name="Cta. Ganancia Realizada";

@XendraColumn(AD_Element_ID="b1a37766-a6ee-af2d-cb8e-aa7bd5cdcbb2",ColumnName="RealizedGain_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7545cc22-b390-2ec9-9a4e-715b4242c83d",
Synchronized="2017-08-05 16:53:34.0")
/** Column name RealizedGain_Acct */
public static final String COLUMNNAME_RealizedGain_Acct = "RealizedGain_Acct";
/** Set Realized Loss Acct.
@param RealizedLoss_Acct Realized Loss Account */
public void setRealizedLoss_Acct (int RealizedLoss_Acct)
{
set_Value (COLUMNNAME_RealizedLoss_Acct, Integer.valueOf(RealizedLoss_Acct));
}
/** Get Realized Loss Acct.
@return Realized Loss Account */
public int getRealizedLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RealizedLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6cf2e21d-4a37-6fcf-38c3-b54e95caba39")
public static String es_PE_FIELD_Accounting_RealizedLossAcct_Description="Cuenta de pérdida realizada";

@XendraTrl(Identifier="6cf2e21d-4a37-6fcf-38c3-b54e95caba39")
public static String es_PE_FIELD_Accounting_RealizedLossAcct_Help="La cuenta de pérdida realizada indica la cuenta a ser usada cuando se registran pérdidas realizadas por reevaluación de moneda";

@XendraTrl(Identifier="6cf2e21d-4a37-6fcf-38c3-b54e95caba39")
public static String es_PE_FIELD_Accounting_RealizedLossAcct_Name="Cta. Pérdida Realizada";

@XendraField(AD_Column_ID="RealizedLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="475573f8-1e15-5af4-fc8f-85408cb856dc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cf2e21d-4a37-6fcf-38c3-b54e95caba39")
public static final String FIELDNAME_Accounting_RealizedLossAcct="6cf2e21d-4a37-6fcf-38c3-b54e95caba39";

@XendraTrl(Identifier="3a7b38ed-0ee8-e38b-d984-2f619f4041a5")
public static String es_PE_COLUMN_RealizedLoss_Acct_Name="Cta. Pérdida Realizada";

@XendraColumn(AD_Element_ID="7e5a74b9-ab23-f88b-a100-923d97d74ee4",ColumnName="RealizedLoss_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a7b38ed-0ee8-e38b-d984-2f619f4041a5",
Synchronized="2017-08-05 16:53:34.0")
/** Column name RealizedLoss_Acct */
public static final String COLUMNNAME_RealizedLoss_Acct = "RealizedLoss_Acct";
/** Set Unrealized Gain Acct.
@param UnrealizedGain_Acct Unrealized Gain Account for currency revaluation */
public void setUnrealizedGain_Acct (int UnrealizedGain_Acct)
{
set_Value (COLUMNNAME_UnrealizedGain_Acct, Integer.valueOf(UnrealizedGain_Acct));
}
/** Get Unrealized Gain Acct.
@return Unrealized Gain Account for currency revaluation */
public int getUnrealizedGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UnrealizedGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e21d2936-b2c2-31d3-d7e8-733aa3965a33")
public static String es_PE_FIELD_Accounting_UnrealizedGainAcct_Description="Cuenta de ganancia no realizada para reevaluación monedas";

@XendraTrl(Identifier="e21d2936-b2c2-31d3-d7e8-733aa3965a33")
public static String es_PE_FIELD_Accounting_UnrealizedGainAcct_Help="La cuenta de ganancia no realizada indica la cuenta a ser usada cuando se registran las ganancias logradas; por la reevaluación de la moneda; que aún no han sido realizadas";

@XendraTrl(Identifier="e21d2936-b2c2-31d3-d7e8-733aa3965a33")
public static String es_PE_FIELD_Accounting_UnrealizedGainAcct_Name="Cta. Ganancia No Realizada";

@XendraField(AD_Column_ID="UnrealizedGain_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="475573f8-1e15-5af4-fc8f-85408cb856dc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e21d2936-b2c2-31d3-d7e8-733aa3965a33")
public static final String FIELDNAME_Accounting_UnrealizedGainAcct="e21d2936-b2c2-31d3-d7e8-733aa3965a33";

@XendraTrl(Identifier="30c10b8e-b001-2618-24ac-ea515bd4dba7")
public static String es_PE_COLUMN_UnrealizedGain_Acct_Name="Cta. Ganancia No Realizada";

@XendraColumn(AD_Element_ID="aa435787-ef35-3e4d-ae68-8b3ce73213c1",
ColumnName="UnrealizedGain_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="30c10b8e-b001-2618-24ac-ea515bd4dba7",Synchronized="2017-08-05 16:53:34.0")
/** Column name UnrealizedGain_Acct */
public static final String COLUMNNAME_UnrealizedGain_Acct = "UnrealizedGain_Acct";
/** Set Unrealized Loss Acct.
@param UnrealizedLoss_Acct Unrealized Loss Account for currency revaluation */
public void setUnrealizedLoss_Acct (int UnrealizedLoss_Acct)
{
set_Value (COLUMNNAME_UnrealizedLoss_Acct, Integer.valueOf(UnrealizedLoss_Acct));
}
/** Get Unrealized Loss Acct.
@return Unrealized Loss Account for currency revaluation */
public int getUnrealizedLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UnrealizedLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c1a461d3-86ab-dbe7-a36b-b0e409f34646")
public static String es_PE_FIELD_Accounting_UnrealizedLossAcct_Description="Cuenta de pérdida no realizada para reevaluación monedas";

@XendraTrl(Identifier="c1a461d3-86ab-dbe7-a36b-b0e409f34646")
public static String es_PE_FIELD_Accounting_UnrealizedLossAcct_Help="La cuenta de pérdida no realizada indica la cuenta a ser usada cuando se registran las pérdidas incurridas; por reevaluación de la moneda; que aún no han sido realizadas";

@XendraTrl(Identifier="c1a461d3-86ab-dbe7-a36b-b0e409f34646")
public static String es_PE_FIELD_Accounting_UnrealizedLossAcct_Name="Cta. Pérdida No Realizada";

@XendraField(AD_Column_ID="UnrealizedLoss_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="475573f8-1e15-5af4-fc8f-85408cb856dc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1a461d3-86ab-dbe7-a36b-b0e409f34646")
public static final String FIELDNAME_Accounting_UnrealizedLossAcct="c1a461d3-86ab-dbe7-a36b-b0e409f34646";

@XendraTrl(Identifier="7d126cc4-2264-af97-6d6f-61b20821a988")
public static String es_PE_COLUMN_UnrealizedLoss_Acct_Name="Cta. Pérdida No Realizada";

@XendraColumn(AD_Element_ID="5673552f-a36f-26ee-7aa3-d014efe269b1",
ColumnName="UnrealizedLoss_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7d126cc4-2264-af97-6d6f-61b20821a988",Synchronized="2017-08-05 16:53:34.0")
/** Column name UnrealizedLoss_Acct */
public static final String COLUMNNAME_UnrealizedLoss_Acct = "UnrealizedLoss_Acct";
}
