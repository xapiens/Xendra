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
/** Generated Model for C_ValidCombination
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ValidCombination extends PO
{
/** Standard Constructor
@param ctx context
@param C_ValidCombination_ID id
@param trxName transaction
*/
public X_C_ValidCombination (Properties ctx, int C_ValidCombination_ID, String trxName)
{
super (ctx, C_ValidCombination_ID, trxName);
/** if (C_ValidCombination_ID == 0)
{
setAccount_ID (0);
setC_AcctSchema_ID (0);
setC_ValidCombination_ID (0);
setIsFullyQualified (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ValidCombination (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=176 */
public static int Table_ID=MTable.getTable_ID("C_ValidCombination");

@XendraTrl(Identifier="afebccdb-065c-3201-e85e-344cf0d03647")
public static String es_PE_TAB_Combination_Description="Combinaciones de Cuenta Válidas";

@XendraTrl(Identifier="afebccdb-065c-3201-e85e-344cf0d03647")
public static String es_PE_TAB_Combination_Name="Combinación";

@XendraTrl(Identifier="afebccdb-065c-3201-e85e-344cf0d03647")
public static String es_PE_TAB_Combination_Help="La pestaña de Combinación Contable define y despliega combinaciones de cuentas válidas. Un alias puede ser definido para facilitar la entrada de documentos.";

@XendraTab(Name="Combination",Description="Valid Account Combinations",
Help="The Account Combination Tab defines and displays valid account combination.  An Alias can be defined to facilitate document entry.",
AD_Window_ID="ae676d3f-e042-d1ca-0efe-8c1b318a8f9a",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="afebccdb-065c-3201-e85e-344cf0d03647",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Combination="afebccdb-065c-3201-e85e-344cf0d03647";

@XendraTrl(Identifier="6418dec6-4d10-b8a4-2c7e-b45b4e63aeca")
public static String es_PE_TABLE_C_ValidCombination_Name="Combinación";

@XendraTable(Name="Combination",Description="Valid Account Combination",Help="",
TableName="C_ValidCombination",AccessLevel="2",AD_Window_ID="ae676d3f-e042-d1ca-0efe-8c1b318a8f9a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6418dec6-4d10-b8a4-2c7e-b45b4e63aeca",Synchronized="2017-08-16 11:42:33.0")
/** TableName=C_ValidCombination */
public static final String Table_Name="C_ValidCombination";


@XendraIndex(Name="c_validcombination_alias",Identifier="7b8b63ef-62e3-4c41-99a0-adccab1a6e55",
Column_Names="ad_client_id, alias",IsUnique="false",
TableIdentifier="7b8b63ef-62e3-4c41-99a0-adccab1a6e55",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_validcombination_alias = "7b8b63ef-62e3-4c41-99a0-adccab1a6e55";


@XendraIndex(Name="c_validcombination_alt",Identifier="b51897a0-0959-5c51-8261-5b32c9881bad",
Column_Names="c_acctschema_id, ad_org_id, account_id, c_subacct_id, m_product_id, c_bpartner_id, ad_orgtrx_id, c_locfrom_id, c_locto_id, c_salesregion_id, c_project_id, c_campaign_id, c_activity_id, user1_id, user2_id, userelement1_id, userelement2_id",
IsUnique="true",TableIdentifier="b51897a0-0959-5c51-8261-5b32c9881bad",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_validcombination_alt = "b51897a0-0959-5c51-8261-5b32c9881bad";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ValidCombination");

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
    Table_ID = MTable.getTable_ID("C_ValidCombination");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ValidCombination[").append(get_ID()).append("]");
return sb.toString();
}

/** Account_ID AD_Reference=2c49a6bb-f3ab-0f31-6447-eadfef443fd5 */
public static final int ACCOUNT_ID_AD_Reference_ID=362;
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID < 1) throw new IllegalArgumentException ("Account_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac417b00-efe1-dc3b-6acb-05947b4c1f8a")
public static String es_PE_FIELD_Combination_Account_Description="Cuenta usada";

@XendraTrl(Identifier="ac417b00-efe1-dc3b-6acb-05947b4c1f8a")
public static String es_PE_FIELD_Combination_Account_Help="La cuenta (natural) usada";

@XendraTrl(Identifier="ac417b00-efe1-dc3b-6acb-05947b4c1f8a")
public static String es_PE_FIELD_Combination_Account_Name="Cuenta";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac417b00-efe1-dc3b-6acb-05947b4c1f8a")
public static final String FIELDNAME_Combination_Account="ac417b00-efe1-dc3b-6acb-05947b4c1f8a";

@XendraTrl(Identifier="4483133c-d1a8-0bdc-f78b-f11a7d9ac6a8")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="2c49a6bb-f3ab-0f31-6447-eadfef443fd5",
AD_Val_Rule_ID="2f455adf-339e-7ef0-6b19-0a540bcca416",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4483133c-d1a8-0bdc-f78b-f11a7d9ac6a8",
Synchronized="2017-08-05 16:54:30.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";

/** AD_OrgTrx_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int AD_ORGTRX_ID_AD_Reference_ID=130;
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="29847a0b-d625-d2ec-70f9-1d564fde580d")
public static String es_PE_FIELD_Combination_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="29847a0b-d625-d2ec-70f9-1d564fde580d")
public static String es_PE_FIELD_Combination_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="29847a0b-d625-d2ec-70f9-1d564fde580d")
public static String es_PE_FIELD_Combination_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29847a0b-d625-d2ec-70f9-1d564fde580d")
public static final String FIELDNAME_Combination_TrxOrganization="29847a0b-d625-d2ec-70f9-1d564fde580d";

@XendraTrl(Identifier="9a969cdd-591f-6d4d-8cba-5ca5a6c10f53")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9a969cdd-591f-6d4d-8cba-5ca5a6c10f53",Synchronized="2017-08-05 16:54:30.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Alias.
@param Alias Defines an alternate method of indicating an account combination. */
public void setAlias (String Alias)
{
if (Alias != null && Alias.length() > 40)
{
log.warning("Length > 40 - truncated");
Alias = Alias.substring(0,39);
}
set_Value (COLUMNNAME_Alias, Alias);
}
/** Get Alias.
@return Defines an alternate method of indicating an account combination. */
public String getAlias() 
{
String value = (String)get_Value(COLUMNNAME_Alias);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="df3493d9-31b0-1efe-bb71-783d9c9f7bdd")
public static String es_PE_FIELD_Combination_Alias_Description="Define un método alterno de identificar una combinación de cuenta";

@XendraTrl(Identifier="df3493d9-31b0-1efe-bb71-783d9c9f7bdd")
public static String es_PE_FIELD_Combination_Alias_Help="El campo Alias le permite identificar un método alterno para referirse a una combinación completa de cuenta. Por Ej.; La cuenta por cobrar para Garden World puede tener el alias de  GW_AR.";

@XendraTrl(Identifier="df3493d9-31b0-1efe-bb71-783d9c9f7bdd")
public static String es_PE_FIELD_Combination_Alias_Name="Alias";
@XendraField(AD_Column_ID="Alias",
IsCentrallyMaintained=true,AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@$HasAlias@=Y",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="df3493d9-31b0-1efe-bb71-783d9c9f7bdd")
public static final String FIELDNAME_Combination_Alias="df3493d9-31b0-1efe-bb71-783d9c9f7bdd";

@XendraTrl(Identifier="9ac11a93-5267-29bc-c4c2-2389e4c8b1b5")
public static String es_PE_COLUMN_Alias_Name="Alias";

@XendraColumn(AD_Element_ID="eb2b55b1-1094-cce9-62c7-fbcb31313519",ColumnName="Alias",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ac11a93-5267-29bc-c4c2-2389e4c8b1b5",
Synchronized="2017-08-05 16:54:30.0")
/** Column name Alias */
public static final String COLUMNNAME_Alias = "Alias";
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

@XendraTrl(Identifier="090554f9-8fb3-72e7-e856-a413e366d526")
public static String es_PE_FIELD_Combination_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="090554f9-8fb3-72e7-e856-a413e366d526")
public static String es_PE_FIELD_Combination_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="090554f9-8fb3-72e7-e856-a413e366d526")
public static String es_PE_FIELD_Combination_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="090554f9-8fb3-72e7-e856-a413e366d526")
public static final String FIELDNAME_Combination_AccountingSchema="090554f9-8fb3-72e7-e856-a413e366d526";

@XendraTrl(Identifier="569cb755-ce2f-3717-f84d-0664f4cb6aed")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="569cb755-ce2f-3717-f84d-0664f4cb6aed",
Synchronized="2017-08-05 16:54:30.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

/** C_Activity_ID AD_Reference=ff86bdb6-d331-b535-29d7-9e8692e394b4 */
public static final int C_ACTIVITY_ID_AD_Reference_ID=142;
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Activity_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3fdc7634-29ec-4f69-a06c-ddfbe848a5ec")
public static String es_PE_FIELD_Combination_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="3fdc7634-29ec-4f69-a06c-ddfbe848a5ec")
public static String es_PE_FIELD_Combination_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="3fdc7634-29ec-4f69-a06c-ddfbe848a5ec")
public static String es_PE_FIELD_Combination_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3fdc7634-29ec-4f69-a06c-ddfbe848a5ec")
public static final String FIELDNAME_Combination_Activity="3fdc7634-29ec-4f69-a06c-ddfbe848a5ec";

@XendraTrl(Identifier="b71965e5-dd6f-71a1-702f-d6ff114cc1e8")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="ff86bdb6-d331-b535-29d7-9e8692e394b4",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b71965e5-dd6f-71a1-702f-d6ff114cc1e8",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

/** C_BPartner_ID AD_Reference=ed87c3fe-720d-c26d-0166-b5178b65db41 */
public static final int C_BPARTNER_ID_AD_Reference_ID=138;
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
 else 
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

@XendraTrl(Identifier="5c7b75f5-56fa-7d41-5e07-414d03a4a9e6")
public static String es_PE_FIELD_Combination_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="5c7b75f5-56fa-7d41-5e07-414d03a4a9e6")
public static String es_PE_FIELD_Combination_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="5c7b75f5-56fa-7d41-5e07-414d03a4a9e6")
public static String es_PE_FIELD_Combination_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_BP@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5c7b75f5-56fa-7d41-5e07-414d03a4a9e6")
public static final String FIELDNAME_Combination_BusinessPartner="5c7b75f5-56fa-7d41-5e07-414d03a4a9e6";

@XendraTrl(Identifier="3b3a650c-1921-b11a-7303-ed47e4503c81")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b3a650c-1921-b11a-7303-ed47e4503c81",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

/** C_Campaign_ID AD_Reference=4d82ca8a-79c8-7bf0-4f78-54151e1257f6 */
public static final int C_CAMPAIGN_ID_AD_Reference_ID=143;
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Campaign_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b081989a-0fcc-32c6-0816-fa962848422e")
public static String es_PE_FIELD_Combination_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="b081989a-0fcc-32c6-0816-fa962848422e")
public static String es_PE_FIELD_Combination_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="b081989a-0fcc-32c6-0816-fa962848422e")
public static String es_PE_FIELD_Combination_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b081989a-0fcc-32c6-0816-fa962848422e")
public static final String FIELDNAME_Combination_Campaign="b081989a-0fcc-32c6-0816-fa962848422e";

@XendraTrl(Identifier="d73ad51b-9eb3-bad1-f1b9-6e52de4adf16")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="4d82ca8a-79c8-7bf0-4f78-54151e1257f6",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d73ad51b-9eb3-bad1-f1b9-6e52de4adf16",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

/** C_LocFrom_ID AD_Reference=69189951-7109-d2c7-f034-b4660d43b572 */
public static final int C_LOCFROM_ID_AD_Reference_ID=133;
/** Set Location From.
@param C_LocFrom_ID Location that inventory was moved from */
public void setC_LocFrom_ID (int C_LocFrom_ID)
{
if (C_LocFrom_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_LocFrom_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_LocFrom_ID, Integer.valueOf(C_LocFrom_ID));
}
/** Get Location From.
@return Location that inventory was moved from */
public int getC_LocFrom_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocFrom_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="498fa140-d964-cc61-5352-2bcde78f5d0e")
public static String es_PE_FIELD_Combination_LocationFrom_Description="Ubicación desde la que el inventario fue movido";

@XendraTrl(Identifier="498fa140-d964-cc61-5352-2bcde78f5d0e")
public static String es_PE_FIELD_Combination_LocationFrom_Help="La ubicación desde indica la ubicación desde la que un producto fue movido";

@XendraTrl(Identifier="498fa140-d964-cc61-5352-2bcde78f5d0e")
public static String es_PE_FIELD_Combination_LocationFrom_Name="Desde Localización";

@XendraField(AD_Column_ID="C_LocFrom_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_LF@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="498fa140-d964-cc61-5352-2bcde78f5d0e")
public static final String FIELDNAME_Combination_LocationFrom="498fa140-d964-cc61-5352-2bcde78f5d0e";

@XendraTrl(Identifier="44b06e43-93fd-341e-d557-0dc13c753322")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="44b06e43-93fd-341e-d557-0dc13c753322",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";

/** C_LocTo_ID AD_Reference=69189951-7109-d2c7-f034-b4660d43b572 */
public static final int C_LOCTO_ID_AD_Reference_ID=133;
/** Set Location To.
@param C_LocTo_ID Location that inventory was moved to */
public void setC_LocTo_ID (int C_LocTo_ID)
{
if (C_LocTo_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_LocTo_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_LocTo_ID, Integer.valueOf(C_LocTo_ID));
}
/** Get Location To.
@return Location that inventory was moved to */
public int getC_LocTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e5667d3f-907b-31df-bcbc-526c2d426e7a")
public static String es_PE_FIELD_Combination_LocationTo_Description="Ubicación a la que el inventario fue movido.";

@XendraTrl(Identifier="e5667d3f-907b-31df-bcbc-526c2d426e7a")
public static String es_PE_FIELD_Combination_LocationTo_Help="La Ubicación A indica la ubicación a la que un producto fue movido.";

@XendraTrl(Identifier="e5667d3f-907b-31df-bcbc-526c2d426e7a")
public static String es_PE_FIELD_Combination_LocationTo_Name="A Localización";

@XendraField(AD_Column_ID="C_LocTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_LT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e5667d3f-907b-31df-bcbc-526c2d426e7a")
public static final String FIELDNAME_Combination_LocationTo="e5667d3f-907b-31df-bcbc-526c2d426e7a";

@XendraTrl(Identifier="bb0344e9-83ff-0375-01f4-25a3b4cf9fef")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bb0344e9-83ff-0375-01f4-25a3b4cf9fef",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
/** Set Combination.
@param Combination Unique combination of account elements */
public void setCombination (String Combination)
{
if (Combination != null && Combination.length() > 60)
{
log.warning("Length > 60 - truncated");
Combination = Combination.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_Combination, Combination);
}
/** Get Combination.
@return Unique combination of account elements */
public String getCombination() 
{
String value = (String)get_Value(COLUMNNAME_Combination);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getCombination());
}

@XendraTrl(Identifier="16b007fc-9d53-85d4-d36d-8075b0c7adff")
public static String es_PE_FIELD_Combination_Combination_Description="Combinación única de elementos contables";

@XendraTrl(Identifier="16b007fc-9d53-85d4-d36d-8075b0c7adff")
public static String es_PE_FIELD_Combination_Combination_Help="El campo combinación define la combinación única de elementos que conforman esta cuenta";

@XendraTrl(Identifier="16b007fc-9d53-85d4-d36d-8075b0c7adff")
public static String es_PE_FIELD_Combination_Combination_Name="Combinación";

@XendraField(AD_Column_ID="Combination",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16b007fc-9d53-85d4-d36d-8075b0c7adff")
public static final String FIELDNAME_Combination_Combination="16b007fc-9d53-85d4-d36d-8075b0c7adff";

@XendraTrl(Identifier="e6ba5cf5-c601-f42c-cf42-7fc32e833328")
public static String es_PE_COLUMN_Combination_Name="Combinación";

@XendraColumn(AD_Element_ID="2538c42d-ad81-9eea-171e-5bcb3bda404d",ColumnName="Combination",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6ba5cf5-c601-f42c-cf42-7fc32e833328",
Synchronized="2017-08-05 16:54:30.0")
/** Column name Combination */
public static final String COLUMNNAME_Combination = "Combination";

/** C_Project_ID AD_Reference=f0d2b7ce-fddd-d171-9e31-adfff06b668b */
public static final int C_PROJECT_ID_AD_Reference_ID=141;
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Project_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="24813fa1-550e-9be1-9596-469323128d80")
public static String es_PE_FIELD_Combination_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="24813fa1-550e-9be1-9596-469323128d80")
public static String es_PE_FIELD_Combination_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="24813fa1-550e-9be1-9596-469323128d80")
public static String es_PE_FIELD_Combination_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="24813fa1-550e-9be1-9596-469323128d80")
public static final String FIELDNAME_Combination_Project="24813fa1-550e-9be1-9596-469323128d80";

@XendraTrl(Identifier="dbbf7d37-834c-decd-c810-0e5637acf3d0")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f0d2b7ce-fddd-d171-9e31-adfff06b668b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dbbf7d37-834c-decd-c810-0e5637acf3d0",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

/** C_SalesRegion_ID AD_Reference=171f6f27-f3e5-c82c-1cb3-0a78b201c0bc */
public static final int C_SALESREGION_ID_AD_Reference_ID=144;
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6a171d7d-e040-ed73-e34e-4f73634ab174")
public static String es_PE_FIELD_Combination_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="6a171d7d-e040-ed73-e34e-4f73634ab174")
public static String es_PE_FIELD_Combination_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="6a171d7d-e040-ed73-e34e-4f73634ab174")
public static String es_PE_FIELD_Combination_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_SR@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6a171d7d-e040-ed73-e34e-4f73634ab174")
public static final String FIELDNAME_Combination_SalesRegion="6a171d7d-e040-ed73-e34e-4f73634ab174";

@XendraTrl(Identifier="313eb58a-fa8f-a811-e13a-24df902e3e87")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="171f6f27-f3e5-c82c-1cb3-0a78b201c0bc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="313eb58a-fa8f-a811-e13a-24df902e3e87",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
/** Set Sub Account.
@param C_SubAcct_ID Sub account for Element Value */
public void setC_SubAcct_ID (int C_SubAcct_ID)
{
if (C_SubAcct_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_SubAcct_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_SubAcct_ID, Integer.valueOf(C_SubAcct_ID));
}
/** Get Sub Account.
@return Sub account for Element Value */
public int getC_SubAcct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SubAcct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ed783bb1-62b2-3a17-b973-d28a311b0bf2")
public static String es_PE_FIELD_Combination_SubAccount_Description="Sub Cuenta para Valor del Elemento";

@XendraTrl(Identifier="ed783bb1-62b2-3a17-b973-d28a311b0bf2")
public static String es_PE_FIELD_Combination_SubAccount_Help="El Valor del Elemento (ej. Cuenta) opcionalmente puede tener subcuentas para detalles adicionales. La subcuenta es dependientedel valor de la cuenta, así también las especificaciónes. Si las cuentas son mas o menos lo mismo, considere el empleo de otra dimensión contable.";

@XendraTrl(Identifier="ed783bb1-62b2-3a17-b973-d28a311b0bf2")
public static String es_PE_FIELD_Combination_SubAccount_Name="Sub Cuenta";

@XendraField(AD_Column_ID="C_SubAcct_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_SA@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ed783bb1-62b2-3a17-b973-d28a311b0bf2")
public static final String FIELDNAME_Combination_SubAccount="ed783bb1-62b2-3a17-b973-d28a311b0bf2";

@XendraTrl(Identifier="41e5a910-41f5-f272-2080-e794d388e488")
public static String es_PE_COLUMN_C_SubAcct_ID_Name="Sub Cuenta";

@XendraColumn(AD_Element_ID="24ec01a7-d6fe-2833-9fa3-5bc5aa2648b5",ColumnName="C_SubAcct_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="0ee52933-6c04-66ed-6965-967b6623b014",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="41e5a910-41f5-f272-2080-e794d388e488",Synchronized="2017-08-05 16:54:30.0")
/** Column name C_SubAcct_ID */
public static final String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
/** Set Combination.
@param C_ValidCombination_ID Valid Account Combination */
public void setC_ValidCombination_ID (int C_ValidCombination_ID)
{
if (C_ValidCombination_ID < 1) throw new IllegalArgumentException ("C_ValidCombination_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ValidCombination_ID, Integer.valueOf(C_ValidCombination_ID));
}
/** Get Combination.
@return Valid Account Combination */
public int getC_ValidCombination_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ValidCombination_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3997b019-b009-5a2e-5e85-32a625be9158")
public static String es_PE_FIELD_Combination_Combination2_Description="Combinación de Cuenta Válido";

@XendraTrl(Identifier="3997b019-b009-5a2e-5e85-32a625be9158")
public static String es_PE_FIELD_Combination_Combination2_Help="La combinación identifica una combinación válida de elementos que representan una cuenta de Cg.";

@XendraTrl(Identifier="3997b019-b009-5a2e-5e85-32a625be9158")
public static String es_PE_FIELD_Combination_Combination2_Name="Combinación";

@XendraField(AD_Column_ID="C_ValidCombination_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3997b019-b009-5a2e-5e85-32a625be9158")
public static final String FIELDNAME_Combination_Combination2="3997b019-b009-5a2e-5e85-32a625be9158";
/** Column name C_ValidCombination_ID */
public static final String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_Description, Description);
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

@XendraTrl(Identifier="862b4e29-76e9-e261-28e6-9062ef925f22")
public static String es_PE_FIELD_Combination_Description_Description="Observación";

@XendraTrl(Identifier="862b4e29-76e9-e261-28e6-9062ef925f22")
public static String es_PE_FIELD_Combination_Description_Help="Observación";

@XendraTrl(Identifier="862b4e29-76e9-e261-28e6-9062ef925f22")
public static String es_PE_FIELD_Combination_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="862b4e29-76e9-e261-28e6-9062ef925f22")
public static final String FIELDNAME_Combination_Description="862b4e29-76e9-e261-28e6-9062ef925f22";

@XendraTrl(Identifier="671e5604-db53-8c55-a6d1-d3568544e6ce")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="671e5604-db53-8c55-a6d1-d3568544e6ce",
Synchronized="2017-08-05 16:54:30.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="cc1317cf-eb92-4a17-8882-78b81618d2dd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc1317cf-eb92-4a17-8882-78b81618d2dd",
Synchronized="2017-08-05 16:54:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Fully Qualified.
@param IsFullyQualified This account is fully qualified */
public void setIsFullyQualified (boolean IsFullyQualified)
{
set_ValueNoCheck (COLUMNNAME_IsFullyQualified, Boolean.valueOf(IsFullyQualified));
}
/** Get Fully Qualified.
@return This account is fully qualified */
public boolean isFullyQualified() 
{
Object oo = get_Value(COLUMNNAME_IsFullyQualified);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8e366242-02d2-fbb5-b207-a4cac1deb6ec")
public static String es_PE_FIELD_Combination_FullyQualified_Description="Esta cuenta es completamente calificada";

@XendraTrl(Identifier="8e366242-02d2-fbb5-b207-a4cac1deb6ec")
public static String es_PE_FIELD_Combination_FullyQualified_Help="El cuadro de verificación completamente calificado indica que todos los elementos requeridos para una combinación de cuenta están presentes";

@XendraTrl(Identifier="8e366242-02d2-fbb5-b207-a4cac1deb6ec")
public static String es_PE_FIELD_Combination_FullyQualified_Name="Completamente Calificada";

@XendraField(AD_Column_ID="IsFullyQualified",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e366242-02d2-fbb5-b207-a4cac1deb6ec")
public static final String FIELDNAME_Combination_FullyQualified="8e366242-02d2-fbb5-b207-a4cac1deb6ec";

@XendraTrl(Identifier="cee7fe65-6acb-b898-82fc-2480a6b4143b")
public static String es_PE_COLUMN_IsFullyQualified_Name="Completamente Calificada";

@XendraColumn(AD_Element_ID="6c826681-4b1b-de42-993b-d5393d7bae05",ColumnName="IsFullyQualified",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cee7fe65-6acb-b898-82fc-2480a6b4143b",
Synchronized="2017-08-05 16:54:30.0")
/** Column name IsFullyQualified */
public static final String COLUMNNAME_IsFullyQualified = "IsFullyQualified";

/** M_Product_ID AD_Reference=28b49c4d-0409-b2e0-b70e-d686f8d6503f */
public static final int M_PRODUCT_ID_AD_Reference_ID=162;
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8cef464e-5874-ccb8-e995-094cbefae854")
public static String es_PE_FIELD_Combination_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="8cef464e-5874-ccb8-e995-094cbefae854")
public static String es_PE_FIELD_Combination_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="8cef464e-5874-ccb8-e995-094cbefae854")
public static String es_PE_FIELD_Combination_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_PR@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8cef464e-5874-ccb8-e995-094cbefae854")
public static final String FIELDNAME_Combination_Product="8cef464e-5874-ccb8-e995-094cbefae854";

@XendraTrl(Identifier="03b3d2d3-0622-eeed-6eb6-103bb234aff2")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="03b3d2d3-0622-eeed-6eb6-103bb234aff2",Synchronized="2017-08-05 16:54:30.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

/** User1_ID AD_Reference=5a2fe161-044f-67cb-3791-6d615980cabb */
public static final int USER1_ID_AD_Reference_ID=134;
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_ValueNoCheck (COLUMNNAME_User1_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="06e9c252-5e6b-103b-c3dd-e146c4d7bb9d")
public static String es_PE_FIELD_Combination_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="06e9c252-5e6b-103b-c3dd-e146c4d7bb9d")
public static String es_PE_FIELD_Combination_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="06e9c252-5e6b-103b-c3dd-e146c4d7bb9d")
public static String es_PE_FIELD_Combination_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="06e9c252-5e6b-103b-c3dd-e146c4d7bb9d")
public static final String FIELDNAME_Combination_UserList="06e9c252-5e6b-103b-c3dd-e146c4d7bb9d";

@XendraTrl(Identifier="97957879-1017-acbf-0c84-b42b26cd9779")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",
AD_Val_Rule_ID="997febad-70ed-4f83-f0d4-a1dbf24bdcfa",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97957879-1017-acbf-0c84-b42b26cd9779",
Synchronized="2017-08-05 16:54:30.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

/** User2_ID AD_Reference=6a357ab2-7bb6-fce4-ffee-8bdd855a77fc */
public static final int USER2_ID_AD_Reference_ID=137;
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_ValueNoCheck (COLUMNNAME_User2_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2bc5a0e3-0d84-5ddc-0899-94b5d975f9ec")
public static String es_PE_FIELD_Combination_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="2bc5a0e3-0d84-5ddc-0899-94b5d975f9ec")
public static String es_PE_FIELD_Combination_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="2bc5a0e3-0d84-5ddc-0899-94b5d975f9ec")
public static String es_PE_FIELD_Combination_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2bc5a0e3-0d84-5ddc-0899-94b5d975f9ec")
public static final String FIELDNAME_Combination_UserList22="2bc5a0e3-0d84-5ddc-0899-94b5d975f9ec";

@XendraTrl(Identifier="a1f9c0e0-56cd-d9fb-dea9-c1bf1cec7cab")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",
AD_Val_Rule_ID="4e086170-a6ca-53a8-ab04-5259dc6daa54",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1f9c0e0-56cd-d9fb-dea9-c1bf1cec7cab",
Synchronized="2017-08-05 16:54:30.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set User Element 1.
@param UserElement1_ID User defined accounting Element */
public void setUserElement1_ID (int UserElement1_ID)
{
if (UserElement1_ID <= 0) set_Value (COLUMNNAME_UserElement1_ID, null);
 else 
set_Value (COLUMNNAME_UserElement1_ID, Integer.valueOf(UserElement1_ID));
}
/** Get User Element 1.
@return User defined accounting Element */
public int getUserElement1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b6001ae9-c634-af7b-4ac8-d3d9d5831b31")
public static String es_PE_FIELD_Combination_UserElement_Description="Elemento Contable definido por Usuario";

@XendraTrl(Identifier="b6001ae9-c634-af7b-4ac8-d3d9d5831b31")
public static String es_PE_FIELD_Combination_UserElement_Help="el elemento contable definido por el usuario refiere a una tabla de Adempiere. Esto le permite emplear el contenido de cualquier tabla como una dimensión contable (ej  Actividad de Proyecto). Note que los Elementos de Usuario son opcionales y son llenados desde el contexto del Documento (ej. No Solicitado).";

@XendraTrl(Identifier="b6001ae9-c634-af7b-4ac8-d3d9d5831b31")
public static String es_PE_FIELD_Combination_UserElement_Name="Elemento 1 de Usuario";

@XendraField(AD_Column_ID="UserElement1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_X1@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b6001ae9-c634-af7b-4ac8-d3d9d5831b31")
public static final String FIELDNAME_Combination_UserElement="b6001ae9-c634-af7b-4ac8-d3d9d5831b31";

@XendraTrl(Identifier="55ab4783-d9e2-aa72-d2fd-96b23dab8457")
public static String es_PE_COLUMN_UserElement1_ID_Name="Elemento 1 de Usuario";

@XendraColumn(AD_Element_ID="ff0e32d9-4f26-c956-dcff-4c22340ac351",ColumnName="UserElement1_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55ab4783-d9e2-aa72-d2fd-96b23dab8457",
Synchronized="2017-08-05 16:54:30.0")
/** Column name UserElement1_ID */
public static final String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
/** Set User Element 2.
@param UserElement2_ID User defined accounting Element */
public void setUserElement2_ID (int UserElement2_ID)
{
if (UserElement2_ID <= 0) set_Value (COLUMNNAME_UserElement2_ID, null);
 else 
set_Value (COLUMNNAME_UserElement2_ID, Integer.valueOf(UserElement2_ID));
}
/** Get User Element 2.
@return User defined accounting Element */
public int getUserElement2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UserElement2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3dd46f02-dc45-8c82-5c63-288dd3e62120")
public static String es_PE_FIELD_Combination_UserElement22_Description="Elemento Contable definido por Usuario";

@XendraTrl(Identifier="3dd46f02-dc45-8c82-5c63-288dd3e62120")
public static String es_PE_FIELD_Combination_UserElement22_Help="Un Elemento Contable definido por el Usuario refiere a una Tabla de Adempiere. Esto le permite emplear el contenido de cualquier Tabla como una Dimensión Contable (Ej. Actividad de  Proyecto). Note que los Elementos de Usuario son opcionales y son llenados desde el contexto del Documento (ej. No Solicitado).";

@XendraTrl(Identifier="3dd46f02-dc45-8c82-5c63-288dd3e62120")
public static String es_PE_FIELD_Combination_UserElement22_Name="Elemento 2 de Usuario";

@XendraField(AD_Column_ID="UserElement2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="afebccdb-065c-3201-e85e-344cf0d03647",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_X2@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3dd46f02-dc45-8c82-5c63-288dd3e62120")
public static final String FIELDNAME_Combination_UserElement22="3dd46f02-dc45-8c82-5c63-288dd3e62120";

@XendraTrl(Identifier="b2921ce9-690c-80fd-aebe-b3b24986db22")
public static String es_PE_COLUMN_UserElement2_ID_Name="Elemento 2 de Usuario";

@XendraColumn(AD_Element_ID="e99c9066-c80c-ab02-0bfb-e485dfbadc2d",ColumnName="UserElement2_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2921ce9-690c-80fd-aebe-b3b24986db22",
Synchronized="2017-08-05 16:54:30.0")
/** Column name UserElement2_ID */
public static final String COLUMNNAME_UserElement2_ID = "UserElement2_ID";
}
