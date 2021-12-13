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
/** Generated Model for C_InterOrg_Acct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InterOrg_Acct extends PO
{
/** Standard Constructor
@param ctx context
@param C_InterOrg_Acct_ID id
@param trxName transaction
*/
public X_C_InterOrg_Acct (Properties ctx, int C_InterOrg_Acct_ID, String trxName)
{
super (ctx, C_InterOrg_Acct_ID, trxName);
/** if (C_InterOrg_Acct_ID == 0)
{
setAD_OrgTo_ID (0);
setC_AcctSchema_ID (0);
setIntercompanyDueFrom_Acct (0);
setIntercompanyDueTo_Acct (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_InterOrg_Acct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=397 */
public static int Table_ID=MTable.getTable_ID("C_InterOrg_Acct");

@XendraTrl(Identifier="677f00fe-69c1-a933-da4a-e5a9362714c7")
public static String es_PE_TAB_Accounting_Description="Contabilidad de la Organización";

@XendraTrl(Identifier="677f00fe-69c1-a933-da4a-e5a9362714c7")
public static String es_PE_TAB_Accounting_Help="La pestaña Contabilidad de Organización define los parámetros contables predeterminados que son usados por esta organización.";

@XendraTrl(Identifier="677f00fe-69c1-a933-da4a-e5a9362714c7")
public static String es_PE_TAB_Accounting_Name="Contabilidad";
@XendraTab(Name="Accounting",
Description="Organization Accounting",
Help="The Organization Accounting Tab defines the default accounting parameters to be used by this Organization.",
AD_Window_ID="b18505b0-64f9-9322-2e8a-0daf80e326cb",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="677f00fe-69c1-a933-da4a-e5a9362714c7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Accounting="677f00fe-69c1-a933-da4a-e5a9362714c7";

@XendraTrl(Identifier="de79d41f-161c-fc90-e03e-6cc2645faf33")
public static String es_PE_TABLE_C_InterOrg_Acct_Name="C_InterOrg_Acct";

@XendraTable(Name="C_InterOrg_Acct",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_InterOrg_Acct",AccessLevel="3",AD_Window_ID="b18505b0-64f9-9322-2e8a-0daf80e326cb",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="de79d41f-161c-fc90-e03e-6cc2645faf33",Synchronized="2020-03-03 21:36:55.0")
/** TableName=C_InterOrg_Acct */
public static final String Table_Name="C_InterOrg_Acct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InterOrg_Acct");

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
    Table_ID = MTable.getTable_ID("C_InterOrg_Acct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InterOrg_Acct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Inter-Organization.
@param AD_OrgTo_ID Organization valid for intercompany documents */
public void setAD_OrgTo_ID (int AD_OrgTo_ID)
{
if (AD_OrgTo_ID < 1) throw new IllegalArgumentException ("AD_OrgTo_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_OrgTo_ID, Integer.valueOf(AD_OrgTo_ID));
}
/** Get Inter-Organization.
@return Organization valid for intercompany documents */
public int getAD_OrgTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="890a1fb0-a976-0226-b85d-b55e272e6f22")
public static String es_PE_FIELD_Accounting_Inter_Organization_Name="Inter-Organización";

@XendraTrl(Identifier="890a1fb0-a976-0226-b85d-b55e272e6f22")
public static String es_PE_FIELD_Accounting_Inter_Organization_Description="Organización válida para documentos intercompañía";

@XendraTrl(Identifier="890a1fb0-a976-0226-b85d-b55e272e6f22")
public static String es_PE_FIELD_Accounting_Inter_Organization_Help="El campo Inter organización identifica una organización que puede ser usada por esta organización para documentos intercompañía.";

@XendraField(AD_Column_ID="AD_OrgTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="677f00fe-69c1-a933-da4a-e5a9362714c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="890a1fb0-a976-0226-b85d-b55e272e6f22")
public static final String FIELDNAME_Accounting_Inter_Organization="890a1fb0-a976-0226-b85d-b55e272e6f22";

@XendraTrl(Identifier="a2c107a2-06bc-dcf0-417b-8ab17fb85474")
public static String es_PE_COLUMN_AD_OrgTo_ID_Name="Inter-Organización";

@XendraColumn(AD_Element_ID="4a34ffae-d1a2-6c91-b7e9-2b62018f7512",ColumnName="AD_OrgTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",
AD_Val_Rule_ID="51198f6e-2576-ef9d-72fc-b53f32c8612d",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2c107a2-06bc-dcf0-417b-8ab17fb85474",
Synchronized="2019-08-30 22:21:35.0")
/** Column name AD_OrgTo_ID */
public static final String COLUMNNAME_AD_OrgTo_ID = "AD_OrgTo_ID";
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

@XendraTrl(Identifier="1ff5524b-f3dd-81cc-512b-6a0a92838958")
public static String es_PE_FIELD_Accounting_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="1ff5524b-f3dd-81cc-512b-6a0a92838958")
public static String es_PE_FIELD_Accounting_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="1ff5524b-f3dd-81cc-512b-6a0a92838958")
public static String es_PE_FIELD_Accounting_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="677f00fe-69c1-a933-da4a-e5a9362714c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ff5524b-f3dd-81cc-512b-6a0a92838958")
public static final String FIELDNAME_Accounting_AccountingSchema="1ff5524b-f3dd-81cc-512b-6a0a92838958";

@XendraTrl(Identifier="f3bc378a-9acf-4eff-b008-0c8369922b63")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3bc378a-9acf-4eff-b008-0c8369922b63",
Synchronized="2019-08-30 22:21:35.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
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
@XendraTrl(Identifier="5bf96a61-0c25-4f8b-83b2-cd50bd632c0c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bf96a61-0c25-4f8b-83b2-cd50bd632c0c",
Synchronized="2019-08-30 22:21:35.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Intercompany Due From Acct.
@param IntercompanyDueFrom_Acct Intercompany Due From / Receivables Account */
public void setIntercompanyDueFrom_Acct (int IntercompanyDueFrom_Acct)
{
set_Value (COLUMNNAME_IntercompanyDueFrom_Acct, Integer.valueOf(IntercompanyDueFrom_Acct));
}
/** Get Intercompany Due From Acct.
@return Intercompany Due From / Receivables Account */
public int getIntercompanyDueFrom_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_IntercompanyDueFrom_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c313f71b-601c-0030-ec5c-18c2529af352")
public static String es_PE_FIELD_Accounting_IntercompanyDueFromAcct_Name="Cuenta Inter-Compañía Debido Desde";

@XendraTrl(Identifier="c313f71b-601c-0030-ec5c-18c2529af352")
public static String es_PE_FIELD_Accounting_IntercompanyDueFromAcct_Description="Cta. Intercompañía que debe a esta compañía / Cuenta por Cobrar";

@XendraTrl(Identifier="c313f71b-601c-0030-ec5c-18c2529af352")
public static String es_PE_FIELD_Accounting_IntercompanyDueFromAcct_Help="La cuenta Inter-compañía debido desde indica la cuenta que representa dinero que se debe a esta organización desde otras organizaciones";

@XendraField(AD_Column_ID="IntercompanyDueFrom_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="677f00fe-69c1-a933-da4a-e5a9362714c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c313f71b-601c-0030-ec5c-18c2529af352")
public static final String FIELDNAME_Accounting_IntercompanyDueFromAcct="c313f71b-601c-0030-ec5c-18c2529af352";

@XendraTrl(Identifier="554d5e30-393a-da2d-bcfe-397d4fe8ef71")
public static String es_PE_COLUMN_IntercompanyDueFrom_Acct_Name="Cuenta Inter-Compañía Debido Desde";

@XendraColumn(AD_Element_ID="c2fdc95c-e1cc-eb8c-48f9-c55d51ed2d8c",
ColumnName="IntercompanyDueFrom_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="554d5e30-393a-da2d-bcfe-397d4fe8ef71",Synchronized="2019-08-30 22:21:35.0")
/** Column name IntercompanyDueFrom_Acct */
public static final String COLUMNNAME_IntercompanyDueFrom_Acct = "IntercompanyDueFrom_Acct";
/** Set Intercompany Due To Acct.
@param IntercompanyDueTo_Acct Intercompany Due To / Payable Account */
public void setIntercompanyDueTo_Acct (int IntercompanyDueTo_Acct)
{
set_Value (COLUMNNAME_IntercompanyDueTo_Acct, Integer.valueOf(IntercompanyDueTo_Acct));
}
/** Get Intercompany Due To Acct.
@return Intercompany Due To / Payable Account */
public int getIntercompanyDueTo_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_IntercompanyDueTo_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6a777da5-c30f-144c-7ad0-79883f3454e7")
public static String es_PE_FIELD_Accounting_IntercompanyDueToAcct_Name="Cuenta Inter-Compañía Debido A";

@XendraTrl(Identifier="6a777da5-c30f-144c-7ad0-79883f3454e7")
public static String es_PE_FIELD_Accounting_IntercompanyDueToAcct_Description="Cta. Inter-compañía que esta compañía debe / Cuenta por Pagar";

@XendraTrl(Identifier="6a777da5-c30f-144c-7ad0-79883f3454e7")
public static String es_PE_FIELD_Accounting_IntercompanyDueToAcct_Help="La cuenta Ínter-compañía debido A indica la cuenta que representa dinero que debe esta organización a otras organizaciones";

@XendraField(AD_Column_ID="IntercompanyDueTo_Acct",IsCentrallyMaintained=true,
AD_Tab_ID="677f00fe-69c1-a933-da4a-e5a9362714c7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a777da5-c30f-144c-7ad0-79883f3454e7")
public static final String FIELDNAME_Accounting_IntercompanyDueToAcct="6a777da5-c30f-144c-7ad0-79883f3454e7";

@XendraTrl(Identifier="613aef10-3171-c6b3-3556-70689b86ac8e")
public static String es_PE_COLUMN_IntercompanyDueTo_Acct_Name="Cuenta Inter-Compañía Debido A";

@XendraColumn(AD_Element_ID="87198123-4127-3ebd-e1e0-3a0b16922c8b",
ColumnName="IntercompanyDueTo_Acct",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="613aef10-3171-c6b3-3556-70689b86ac8e",Synchronized="2019-08-30 22:21:35.0")
/** Column name IntercompanyDueTo_Acct */
public static final String COLUMNNAME_IntercompanyDueTo_Acct = "IntercompanyDueTo_Acct";
}
