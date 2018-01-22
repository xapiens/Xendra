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
import org.compiere.model.reference.REF__PostingType;
/** Generated Model for I_GLJournal
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_GLJournal extends PO
{
/** Standard Constructor
@param ctx context
@param I_GLJournal_ID id
@param trxName transaction
*/
public X_I_GLJournal (Properties ctx, int I_GLJournal_ID, String trxName)
{
super (ctx, I_GLJournal_ID, trxName);
/** if (I_GLJournal_ID == 0)
{
setI_GLJournal_ID (0);
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
public X_I_GLJournal (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=599 */
public static int Table_ID=MTable.getTable_ID("I_GLJournal");

@XendraTrl(Identifier="886193cf-db29-ddf7-a7f8-2b5df663ac10")
public static String es_PE_TAB_GeneralLedger_Description="Importar Diario de CG";

@XendraTrl(Identifier="886193cf-db29-ddf7-a7f8-2b5df663ac10")
public static String es_PE_TAB_GeneralLedger_Name="Importar Diario de CG";

@XendraTrl(Identifier="886193cf-db29-ddf7-a7f8-2b5df663ac10")
public static String es_PE_TAB_GeneralLedger_Help="Una nueva jornada de diario es creado, si el documento de la jornada no es diferente. Una nueva jornada es creada, si el No. de documento,esquema de la contabilidad, moneda, tipo de documento, Categoria GL, Fijando el tipo ó el tipo de contabilidad es diferente.<p >Observe por favor que hay tres campos de la organización: La organización del documento es el dueño del documento y del sistema directamente ó por default del parámetro . La organización es parte de la llave de la contabilidad y solamente se especifica la identificación requerida ninguna combinación de cuenta válida; Si no esta definido se deriva de la organización del documento. La organización de la transacción es parte de la combinación de la cuenta.";

@XendraTab(Name="General Ledger",Description="Import General Ledger",
Help="A new Journal Batch is created, if the Batch Document No or accounting schema are different. A new Journal is created, if the Document No, Currency, Document Type, GL Category, Posting Type or Accounting type is different. You can also force the creation of a new Batch or Jornal by selecting the creat new flag.<p> Please note that there are three Organization Fields: The Document Organization is the owner of the document and set directly or per parameter default. The Organization is part of the accounting key and only required id no Valid Account Comination is specified: If not defined it is derived from the Document Organization. The Transaction Organization is part of the account combination.<br> The optional balance check applies to the entire import, not for individual batches or journals. <br>The document numbers will be overwritten if the document type is not set to manual sequences.",
AD_Window_ID="29e6bffe-5f27-ecaa-73a3-531972f1576b",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="886193cf-db29-ddf7-a7f8-2b5df663ac10",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_GeneralLedger="886193cf-db29-ddf7-a7f8-2b5df663ac10";

@XendraTrl(Identifier="a2768d88-ef31-c803-cd05-b9d36fa31d5b")
public static String es_PE_TABLE_I_GLJournal_Name="Importar Diario de CG";

@XendraTable(Name="Import GL Journal",Description="Import General Ledger Journal",Help="",
TableName="I_GLJournal",AccessLevel="2",AD_Window_ID="29e6bffe-5f27-ecaa-73a3-531972f1576b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="a2768d88-ef31-c803-cd05-b9d36fa31d5b",Synchronized="2017-08-16 11:42:58.0")
/** TableName=I_GLJournal */
public static final String Table_Name="I_GLJournal";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_GLJournal");

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
    Table_ID = MTable.getTable_ID("I_GLJournal");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_GLJournal[").append(get_ID()).append("]");
return sb.toString();
}

/** Account_ID AD_Reference=fca59846-3472-6195-37e9-9b8f95376f02 */
public static final int ACCOUNT_ID_AD_Reference_ID=132;
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID <= 0) set_Value (COLUMNNAME_Account_ID, null);
 else 
set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="38a89e0a-dbf0-63e4-1cb9-69fcf31fc3bf")
public static String es_PE_FIELD_GeneralLedger_Account_Description="Cuenta usada";

@XendraTrl(Identifier="38a89e0a-dbf0-63e4-1cb9-69fcf31fc3bf")
public static String es_PE_FIELD_GeneralLedger_Account_Help="La cuenta (natural) usada";

@XendraTrl(Identifier="38a89e0a-dbf0-63e4-1cb9-69fcf31fc3bf")
public static String es_PE_FIELD_GeneralLedger_Account_Name="Cuenta";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38a89e0a-dbf0-63e4-1cb9-69fcf31fc3bf")
public static final String FIELDNAME_GeneralLedger_Account="38a89e0a-dbf0-63e4-1cb9-69fcf31fc3bf";

@XendraTrl(Identifier="845899eb-93ce-ba1a-5518-b7c1ba134806")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="fca59846-3472-6195-37e9-9b8f95376f02",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="845899eb-93ce-ba1a-5518-b7c1ba134806",Synchronized="2017-08-05 16:54:52.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";
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
@XendraTrl(Identifier="a25566b6-45d3-f301-bd15-4d8c9c8279cd")
public static String es_PE_FIELD_GeneralLedger_AccountKey_Description="Clave del elemento cuenta";

@XendraTrl(Identifier="a25566b6-45d3-f301-bd15-4d8c9c8279cd")
public static String es_PE_FIELD_GeneralLedger_AccountKey_Name="Clave de Cuenta";

@XendraField(AD_Column_ID="AccountValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a25566b6-45d3-f301-bd15-4d8c9c8279cd")
public static final String FIELDNAME_GeneralLedger_AccountKey="a25566b6-45d3-f301-bd15-4d8c9c8279cd";

@XendraTrl(Identifier="8e20073c-a1b1-91e4-e159-db8a9a30c6e7")
public static String es_PE_COLUMN_AccountValue_Name="Clave de Cuenta";

@XendraColumn(AD_Element_ID="8aef172c-9686-33af-fb2b-dfa839316024",ColumnName="AccountValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e20073c-a1b1-91e4-e159-db8a9a30c6e7",
Synchronized="2017-08-05 16:54:52.0")
/** Column name AccountValue */
public static final String COLUMNNAME_AccountValue = "AccountValue";
/** Set Account Schema Name.
@param AcctSchemaName Name of the Accounting Schema */
public void setAcctSchemaName (String AcctSchemaName)
{
if (AcctSchemaName != null && AcctSchemaName.length() > 60)
{
log.warning("Length > 60 - truncated");
AcctSchemaName = AcctSchemaName.substring(0,59);
}
set_Value (COLUMNNAME_AcctSchemaName, AcctSchemaName);
}
/** Get Account Schema Name.
@return Name of the Accounting Schema */
public String getAcctSchemaName() 
{
String value = (String)get_Value(COLUMNNAME_AcctSchemaName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f46f4b6c-057e-86dd-9d29-83780a7c7a14")
public static String es_PE_FIELD_GeneralLedger_AccountSchemaName_Description="Nombre de el esquema de cuentas";

@XendraTrl(Identifier="f46f4b6c-057e-86dd-9d29-83780a7c7a14")
public static String es_PE_FIELD_GeneralLedger_AccountSchemaName_Name="Nombre de el Esquema de Cuentas";

@XendraField(AD_Column_ID="AcctSchemaName",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f46f4b6c-057e-86dd-9d29-83780a7c7a14")
public static final String FIELDNAME_GeneralLedger_AccountSchemaName="f46f4b6c-057e-86dd-9d29-83780a7c7a14";

@XendraTrl(Identifier="dd42a11a-a246-058a-903e-f66741898e5e")
public static String es_PE_COLUMN_AcctSchemaName_Name="Nombre de el Esquema de Cuentas";

@XendraColumn(AD_Element_ID="b57cffc7-a794-35b2-a8a9-96a9b3388cad",ColumnName="AcctSchemaName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd42a11a-a246-058a-903e-f66741898e5e",
Synchronized="2017-08-05 16:54:52.0")
/** Column name AcctSchemaName */
public static final String COLUMNNAME_AcctSchemaName = "AcctSchemaName";

/** AD_OrgDoc_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int AD_ORGDOC_ID_AD_Reference_ID=130;
/** Set Document Org.
@param AD_OrgDoc_ID Document Organization (independent from account organization) */
public void setAD_OrgDoc_ID (int AD_OrgDoc_ID)
{
if (AD_OrgDoc_ID <= 0) set_Value (COLUMNNAME_AD_OrgDoc_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgDoc_ID, Integer.valueOf(AD_OrgDoc_ID));
}
/** Get Document Org.
@return Document Organization (independent from account organization) */
public int getAD_OrgDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9292b5aa-3075-6e73-87a3-240baad9b055")
public static String es_PE_FIELD_GeneralLedger_DocumentOrg_Description="Organización de documentos (independientes de las cuentas de organización)";

@XendraTrl(Identifier="9292b5aa-3075-6e73-87a3-240baad9b055")
public static String es_PE_FIELD_GeneralLedger_DocumentOrg_Name="Organización de Documentos";

@XendraField(AD_Column_ID="AD_OrgDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9292b5aa-3075-6e73-87a3-240baad9b055")
public static final String FIELDNAME_GeneralLedger_DocumentOrg="9292b5aa-3075-6e73-87a3-240baad9b055";

@XendraTrl(Identifier="188c1da0-9c0d-9545-4aaf-c3da0c45f989")
public static String es_PE_COLUMN_AD_OrgDoc_ID_Name="Organización de Documentos";

@XendraColumn(AD_Element_ID="99bb4f9b-8b78-820b-0e7c-2c734643a42d",ColumnName="AD_OrgDoc_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="188c1da0-9c0d-9545-4aaf-c3da0c45f989",Synchronized="2017-08-05 16:54:52.0")
/** Column name AD_OrgDoc_ID */
public static final String COLUMNNAME_AD_OrgDoc_ID = "AD_OrgDoc_ID";

/** AD_OrgTrx_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int AD_ORGTRX_ID_AD_Reference_ID=130;
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="25774690-0c7c-64e8-a86f-bba1e964a9c7")
public static String es_PE_FIELD_GeneralLedger_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="25774690-0c7c-64e8-a86f-bba1e964a9c7")
public static String es_PE_FIELD_GeneralLedger_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="25774690-0c7c-64e8-a86f-bba1e964a9c7")
public static String es_PE_FIELD_GeneralLedger_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=550,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25774690-0c7c-64e8-a86f-bba1e964a9c7")
public static final String FIELDNAME_GeneralLedger_TrxOrganization="25774690-0c7c-64e8-a86f-bba1e964a9c7";

@XendraTrl(Identifier="6e5d9f09-2954-8097-138d-755fc67eb216")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6e5d9f09-2954-8097-138d-755fc67eb216",Synchronized="2017-08-05 16:54:52.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
set_Value (COLUMNNAME_AmtAcctCr, AmtAcctCr);
}
/** Get Accounted Credit.
@return Accounted Credit Amount */
public BigDecimal getAmtAcctCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d74aa90b-6667-6871-185f-598e5a637377")
public static String es_PE_FIELD_GeneralLedger_AccountedCredit_Description="Total del crédito contabilizado";

@XendraTrl(Identifier="d74aa90b-6667-6871-185f-598e5a637377")
public static String es_PE_FIELD_GeneralLedger_AccountedCredit_Help="El total del crédito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraTrl(Identifier="d74aa90b-6667-6871-185f-598e5a637377")
public static String es_PE_FIELD_GeneralLedger_AccountedCredit_Name="Crédito Contabilizado";

@XendraField(AD_Column_ID="AmtAcctCr",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d74aa90b-6667-6871-185f-598e5a637377")
public static final String FIELDNAME_GeneralLedger_AccountedCredit="d74aa90b-6667-6871-185f-598e5a637377";

@XendraTrl(Identifier="c2a06f4a-4942-1a95-945c-baa9f375bd17")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2a06f4a-4942-1a95-945c-baa9f375bd17",
Synchronized="2017-08-05 16:54:52.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
set_Value (COLUMNNAME_AmtAcctDr, AmtAcctDr);
}
/** Get Accounted Debit.
@return Accounted Debit Amount */
public BigDecimal getAmtAcctDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="01927279-dac1-7aff-77a2-fbeb529f846b")
public static String es_PE_FIELD_GeneralLedger_AccountedDebit_Description="Débito";

@XendraTrl(Identifier="01927279-dac1-7aff-77a2-fbeb529f846b")
public static String es_PE_FIELD_GeneralLedger_AccountedDebit_Help="El total del debito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraTrl(Identifier="01927279-dac1-7aff-77a2-fbeb529f846b")
public static String es_PE_FIELD_GeneralLedger_AccountedDebit_Name="Débito Contabilizado";

@XendraField(AD_Column_ID="AmtAcctDr",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01927279-dac1-7aff-77a2-fbeb529f846b")
public static final String FIELDNAME_GeneralLedger_AccountedDebit="01927279-dac1-7aff-77a2-fbeb529f846b";

@XendraTrl(Identifier="1f8761e6-d239-aaed-5f54-68a73a5de79e")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f8761e6-d239-aaed-5f54-68a73a5de79e",
Synchronized="2017-08-05 16:54:52.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Source Credit.
@param AmtSourceCr Source Credit Amount */
public void setAmtSourceCr (BigDecimal AmtSourceCr)
{
set_Value (COLUMNNAME_AmtSourceCr, AmtSourceCr);
}
/** Get Source Credit.
@return Source Credit Amount */
public BigDecimal getAmtSourceCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="eb5e8834-3c55-6506-5c76-fbd30b8c6823")
public static String es_PE_FIELD_GeneralLedger_SourceCredit_Description="Total del Crédito en moneda fuente.";

@XendraTrl(Identifier="eb5e8834-3c55-6506-5c76-fbd30b8c6823")
public static String es_PE_FIELD_GeneralLedger_SourceCredit_Help="El Total crédito fuente indica el Total crédito para esta línea en la moneda fuente.";

@XendraTrl(Identifier="eb5e8834-3c55-6506-5c76-fbd30b8c6823")
public static String es_PE_FIELD_GeneralLedger_SourceCredit_Name="Abono";

@XendraField(AD_Column_ID="AmtSourceCr",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb5e8834-3c55-6506-5c76-fbd30b8c6823")
public static final String FIELDNAME_GeneralLedger_SourceCredit="eb5e8834-3c55-6506-5c76-fbd30b8c6823";

@XendraTrl(Identifier="134a9e92-5ee3-ca95-3a81-88e7299757a7")
public static String es_PE_COLUMN_AmtSourceCr_Name="Abono";

@XendraColumn(AD_Element_ID="37fc9554-00eb-5046-f770-46b9f63a1166",ColumnName="AmtSourceCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="134a9e92-5ee3-ca95-3a81-88e7299757a7",
Synchronized="2017-08-05 16:54:52.0")
/** Column name AmtSourceCr */
public static final String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
/** Set Source Debit.
@param AmtSourceDr Source Debit Amount */
public void setAmtSourceDr (BigDecimal AmtSourceDr)
{
set_Value (COLUMNNAME_AmtSourceDr, AmtSourceDr);
}
/** Get Source Debit.
@return Source Debit Amount */
public BigDecimal getAmtSourceDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e0939f50-dd3c-609f-6a47-7525e331d1e4")
public static String es_PE_FIELD_GeneralLedger_SourceDebit_Description="Total del débito en moneda fuente";

@XendraTrl(Identifier="e0939f50-dd3c-609f-6a47-7525e331d1e4")
public static String es_PE_FIELD_GeneralLedger_SourceDebit_Help="El total débito fuente indica el total debito para esta línea en la moneda fuente";

@XendraTrl(Identifier="e0939f50-dd3c-609f-6a47-7525e331d1e4")
public static String es_PE_FIELD_GeneralLedger_SourceDebit_Name="Cargo";

@XendraField(AD_Column_ID="AmtSourceDr",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0939f50-dd3c-609f-6a47-7525e331d1e4")
public static final String FIELDNAME_GeneralLedger_SourceDebit="e0939f50-dd3c-609f-6a47-7525e331d1e4";

@XendraTrl(Identifier="542f6602-711e-e766-419c-b6588f0f920d")
public static String es_PE_COLUMN_AmtSourceDr_Name="Cargo";

@XendraColumn(AD_Element_ID="83234cfc-e73c-2419-af3c-afb9356f1f68",ColumnName="AmtSourceDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="542f6602-711e-e766-419c-b6588f0f920d",
Synchronized="2017-08-05 16:54:52.0")
/** Column name AmtSourceDr */
public static final String COLUMNNAME_AmtSourceDr = "AmtSourceDr";
/** Set Batch Description.
@param BatchDescription Description of the Batch */
public void setBatchDescription (String BatchDescription)
{
if (BatchDescription != null && BatchDescription.length() > 255)
{
log.warning("Length > 255 - truncated");
BatchDescription = BatchDescription.substring(0,254);
}
set_Value (COLUMNNAME_BatchDescription, BatchDescription);
}
/** Get Batch Description.
@return Description of the Batch */
public String getBatchDescription() 
{
String value = (String)get_Value(COLUMNNAME_BatchDescription);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5047320d-5716-a848-0525-06c1aad2e9a7")
public static String es_PE_FIELD_GeneralLedger_BatchDescription_Description="Descripción de Lote";

@XendraTrl(Identifier="5047320d-5716-a848-0525-06c1aad2e9a7")
public static String es_PE_FIELD_GeneralLedger_BatchDescription_Name="Descripción de Lote";

@XendraField(AD_Column_ID="BatchDescription",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5047320d-5716-a848-0525-06c1aad2e9a7")
public static final String FIELDNAME_GeneralLedger_BatchDescription="5047320d-5716-a848-0525-06c1aad2e9a7";

@XendraTrl(Identifier="80a0ec83-3e89-b761-758f-47c01fcdfc49")
public static String es_PE_COLUMN_BatchDescription_Name="Descripción de Lote";

@XendraColumn(AD_Element_ID="bf037c94-dc15-3c06-11b2-2f0d7e1fe3c2",ColumnName="BatchDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80a0ec83-3e89-b761-758f-47c01fcdfc49",
Synchronized="2017-08-05 16:54:52.0")
/** Column name BatchDescription */
public static final String COLUMNNAME_BatchDescription = "BatchDescription";
/** Set Batch Document No.
@param BatchDocumentNo Document Number of the Batch */
public void setBatchDocumentNo (String BatchDocumentNo)
{
if (BatchDocumentNo != null && BatchDocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
BatchDocumentNo = BatchDocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_BatchDocumentNo, BatchDocumentNo);
}
/** Get Batch Document No.
@return Document Number of the Batch */
public String getBatchDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_BatchDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8f357ee8-71a2-e9e0-97ec-e88c86ce3fd1")
public static String es_PE_FIELD_GeneralLedger_BatchDocumentNo_Description="Número de documento de lote.";

@XendraTrl(Identifier="8f357ee8-71a2-e9e0-97ec-e88c86ce3fd1")
public static String es_PE_FIELD_GeneralLedger_BatchDocumentNo_Name="No. Documento de Lote";

@XendraField(AD_Column_ID="BatchDocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f357ee8-71a2-e9e0-97ec-e88c86ce3fd1")
public static final String FIELDNAME_GeneralLedger_BatchDocumentNo="8f357ee8-71a2-e9e0-97ec-e88c86ce3fd1";

@XendraTrl(Identifier="2dffb7e9-8bb7-146d-8847-843d4122eb6a")
public static String es_PE_COLUMN_BatchDocumentNo_Name="No. Documento de Lote";

@XendraColumn(AD_Element_ID="4bee4177-e60a-2c7e-59e3-b16a5d01a9d9",ColumnName="BatchDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dffb7e9-8bb7-146d-8847-843d4122eb6a",
Synchronized="2017-08-05 16:54:52.0")
/** Column name BatchDocumentNo */
public static final String COLUMNNAME_BatchDocumentNo = "BatchDocumentNo";
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
@XendraTrl(Identifier="6a14dff5-621d-f996-246d-c3dfae1e9518")
public static String es_PE_FIELD_GeneralLedger_BusinessPartnerKey_Description="Clave para el S.N.";

@XendraTrl(Identifier="6a14dff5-621d-f996-246d-c3dfae1e9518")
public static String es_PE_FIELD_GeneralLedger_BusinessPartnerKey_Name="Clave de S.N.";

@XendraField(AD_Column_ID="BPartnerValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a14dff5-621d-f996-246d-c3dfae1e9518")
public static final String FIELDNAME_GeneralLedger_BusinessPartnerKey="6a14dff5-621d-f996-246d-c3dfae1e9518";

@XendraTrl(Identifier="9eb0235b-527f-06fe-762b-6e67f80da528")
public static String es_PE_COLUMN_BPartnerValue_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="8128a796-0c52-a502-d53b-7f4fe35f5f78",ColumnName="BPartnerValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9eb0235b-527f-06fe-762b-6e67f80da528",
Synchronized="2017-08-05 16:54:52.0")
/** Column name BPartnerValue */
public static final String COLUMNNAME_BPartnerValue = "BPartnerValue";
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

@XendraTrl(Identifier="1d134481-98d8-7c00-91bb-80dc13bdf331")
public static String es_PE_FIELD_GeneralLedger_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="1d134481-98d8-7c00-91bb-80dc13bdf331")
public static String es_PE_FIELD_GeneralLedger_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="1d134481-98d8-7c00-91bb-80dc13bdf331")
public static String es_PE_FIELD_GeneralLedger_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d134481-98d8-7c00-91bb-80dc13bdf331")
public static final String FIELDNAME_GeneralLedger_AccountingSchema="1d134481-98d8-7c00-91bb-80dc13bdf331";

@XendraTrl(Identifier="1175b5ee-2273-0fef-b8fb-035b7edcd53f")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1175b5ee-2273-0fef-b8fb-035b7edcd53f",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="03230fd2-cc88-1bc6-c2cb-1dfc91706523")
public static String es_PE_FIELD_GeneralLedger_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="03230fd2-cc88-1bc6-c2cb-1dfc91706523")
public static String es_PE_FIELD_GeneralLedger_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="03230fd2-cc88-1bc6-c2cb-1dfc91706523")
public static String es_PE_FIELD_GeneralLedger_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03230fd2-cc88-1bc6-c2cb-1dfc91706523")
public static final String FIELDNAME_GeneralLedger_Activity="03230fd2-cc88-1bc6-c2cb-1dfc91706523";

@XendraTrl(Identifier="6aaa288c-e986-c1a0-45a8-256588958d9e")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6aaa288c-e986-c1a0-45a8-256588958d9e",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Category Name.
@param CategoryName Name of the Category */
public void setCategoryName (String CategoryName)
{
if (CategoryName != null && CategoryName.length() > 60)
{
log.warning("Length > 60 - truncated");
CategoryName = CategoryName.substring(0,59);
}
set_Value (COLUMNNAME_CategoryName, CategoryName);
}
/** Get Category Name.
@return Name of the Category */
public String getCategoryName() 
{
String value = (String)get_Value(COLUMNNAME_CategoryName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a825eef2-a06b-d3fb-9ed3-d61764ae6c40")
public static String es_PE_FIELD_GeneralLedger_CategoryName_Description="Nombre de la Categoría";

@XendraTrl(Identifier="a825eef2-a06b-d3fb-9ed3-d61764ae6c40")
public static String es_PE_FIELD_GeneralLedger_CategoryName_Name="Nombre de la Categoría";

@XendraField(AD_Column_ID="CategoryName",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a825eef2-a06b-d3fb-9ed3-d61764ae6c40")
public static final String FIELDNAME_GeneralLedger_CategoryName="a825eef2-a06b-d3fb-9ed3-d61764ae6c40";

@XendraTrl(Identifier="48c24e96-981b-f231-b690-81779a5e82b4")
public static String es_PE_COLUMN_CategoryName_Name="Nombre de la Categoría";

@XendraColumn(AD_Element_ID="6f30a805-6fdd-446d-efc8-cf35be4e2c2d",ColumnName="CategoryName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48c24e96-981b-f231-b690-81779a5e82b4",
Synchronized="2017-08-05 16:54:52.0")
/** Column name CategoryName */
public static final String COLUMNNAME_CategoryName = "CategoryName";
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

@XendraTrl(Identifier="cdf37283-bfd2-0ecc-2bfa-f64eede2f66d")
public static String es_PE_FIELD_GeneralLedger_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="cdf37283-bfd2-0ecc-2bfa-f64eede2f66d")
public static String es_PE_FIELD_GeneralLedger_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="cdf37283-bfd2-0ecc-2bfa-f64eede2f66d")
public static String es_PE_FIELD_GeneralLedger_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdf37283-bfd2-0ecc-2bfa-f64eede2f66d")
public static final String FIELDNAME_GeneralLedger_BusinessPartner="cdf37283-bfd2-0ecc-2bfa-f64eede2f66d";

@XendraTrl(Identifier="90416e3c-0007-924d-4e14-ca10393fc598")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90416e3c-0007-924d-4e14-ca10393fc598",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fb73aa20-ea13-7371-9f1e-2eed85cae25d")
public static String es_PE_FIELD_GeneralLedger_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="fb73aa20-ea13-7371-9f1e-2eed85cae25d")
public static String es_PE_FIELD_GeneralLedger_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="fb73aa20-ea13-7371-9f1e-2eed85cae25d")
public static String es_PE_FIELD_GeneralLedger_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb73aa20-ea13-7371-9f1e-2eed85cae25d")
public static final String FIELDNAME_GeneralLedger_Campaign="fb73aa20-ea13-7371-9f1e-2eed85cae25d";

@XendraTrl(Identifier="52341945-fdb0-d89a-ffd7-6de3c8817373")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52341945-fdb0-d89a-ffd7-6de3c8817373",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="df4af2d7-7857-fad9-385f-98f4236d7211")
public static String es_PE_FIELD_GeneralLedger_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="df4af2d7-7857-fad9-385f-98f4236d7211")
public static String es_PE_FIELD_GeneralLedger_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="df4af2d7-7857-fad9-385f-98f4236d7211")
public static String es_PE_FIELD_GeneralLedger_CurrencyType_Name="Tipo de Moneda";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df4af2d7-7857-fad9-385f-98f4236d7211")
public static final String FIELDNAME_GeneralLedger_CurrencyType="df4af2d7-7857-fad9-385f-98f4236d7211";

@XendraTrl(Identifier="cd3057fc-febd-01db-af2d-c962d6de2328")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cd3057fc-febd-01db-af2d-c962d6de2328",Synchronized="2017-08-05 16:54:52.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
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

@XendraTrl(Identifier="87ca394c-108f-9465-269a-e4b955b701e0")
public static String es_PE_FIELD_GeneralLedger_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="87ca394c-108f-9465-269a-e4b955b701e0")
public static String es_PE_FIELD_GeneralLedger_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="87ca394c-108f-9465-269a-e4b955b701e0")
public static String es_PE_FIELD_GeneralLedger_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87ca394c-108f-9465-269a-e4b955b701e0")
public static final String FIELDNAME_GeneralLedger_Currency="87ca394c-108f-9465-269a-e4b955b701e0";

@XendraTrl(Identifier="9551aec4-f7e7-467f-a922-87a399c24b74")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9551aec4-f7e7-467f-a922-87a399c24b74",
Synchronized="2017-08-05 16:54:52.0")
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

@XendraTrl(Identifier="7a70e502-6dd5-39c2-110a-e57c664890b5")
public static String es_PE_FIELD_GeneralLedger_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="7a70e502-6dd5-39c2-110a-e57c664890b5")
public static String es_PE_FIELD_GeneralLedger_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="7a70e502-6dd5-39c2-110a-e57c664890b5")
public static String es_PE_FIELD_GeneralLedger_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a70e502-6dd5-39c2-110a-e57c664890b5")
public static final String FIELDNAME_GeneralLedger_DocumentType="7a70e502-6dd5-39c2-110a-e57c664890b5";

@XendraTrl(Identifier="82c11334-5ef6-0404-ba85-144c8d8c0bb4")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82c11334-5ef6-0404-ba85-144c8d8c0bb4",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Client Key.
@param ClientValue Key of the Client */
public void setClientValue (String ClientValue)
{
if (ClientValue != null && ClientValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ClientValue = ClientValue.substring(0,39);
}
set_Value (COLUMNNAME_ClientValue, ClientValue);
}
/** Get Client Key.
@return Key of the Client */
public String getClientValue() 
{
String value = (String)get_Value(COLUMNNAME_ClientValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="384e3c5a-50d6-fa65-9acc-c9843390abf4")
public static String es_PE_FIELD_GeneralLedger_ClientKey_Description="Clave de el cliente";

@XendraTrl(Identifier="384e3c5a-50d6-fa65-9acc-c9843390abf4")
public static String es_PE_FIELD_GeneralLedger_ClientKey_Name="Clave del Cliente";

@XendraField(AD_Column_ID="ClientValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="384e3c5a-50d6-fa65-9acc-c9843390abf4")
public static final String FIELDNAME_GeneralLedger_ClientKey="384e3c5a-50d6-fa65-9acc-c9843390abf4";

@XendraTrl(Identifier="82a4362a-7a1e-0f04-1cc4-ca63093009e5")
public static String es_PE_COLUMN_ClientValue_Name="Clave del Cliente";

@XendraColumn(AD_Element_ID="8bd3b536-4b38-0769-8755-7b3abb97cb2e",ColumnName="ClientValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82a4362a-7a1e-0f04-1cc4-ca63093009e5",
Synchronized="2017-08-05 16:54:52.0")
/** Column name ClientValue */
public static final String COLUMNNAME_ClientValue = "ClientValue";

/** C_LocFrom_ID AD_Reference=69189951-7109-d2c7-f034-b4660d43b572 */
public static final int C_LOCFROM_ID_AD_Reference_ID=133;
/** Set Location From.
@param C_LocFrom_ID Location that inventory was moved from */
public void setC_LocFrom_ID (int C_LocFrom_ID)
{
if (C_LocFrom_ID <= 0) set_Value (COLUMNNAME_C_LocFrom_ID, null);
 else 
set_Value (COLUMNNAME_C_LocFrom_ID, Integer.valueOf(C_LocFrom_ID));
}
/** Get Location From.
@return Location that inventory was moved from */
public int getC_LocFrom_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocFrom_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="03439ff6-f661-03d5-450a-915fa02adbae")
public static String es_PE_FIELD_GeneralLedger_LocationFrom_Description="Ubicación desde la que el inventario fue movido";

@XendraTrl(Identifier="03439ff6-f661-03d5-450a-915fa02adbae")
public static String es_PE_FIELD_GeneralLedger_LocationFrom_Help="La ubicación desde indica la ubicación desde la que un producto fue movido";

@XendraTrl(Identifier="03439ff6-f661-03d5-450a-915fa02adbae")
public static String es_PE_FIELD_GeneralLedger_LocationFrom_Name="Desde Localización";

@XendraField(AD_Column_ID="C_LocFrom_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=560,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03439ff6-f661-03d5-450a-915fa02adbae")
public static final String FIELDNAME_GeneralLedger_LocationFrom="03439ff6-f661-03d5-450a-915fa02adbae";

@XendraTrl(Identifier="ca73e601-4c3f-817d-eee5-7cfec181fee9")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ca73e601-4c3f-817d-eee5-7cfec181fee9",Synchronized="2017-08-05 16:54:52.0")
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";

/** C_LocTo_ID AD_Reference=69189951-7109-d2c7-f034-b4660d43b572 */
public static final int C_LOCTO_ID_AD_Reference_ID=133;
/** Set Location To.
@param C_LocTo_ID Location that inventory was moved to */
public void setC_LocTo_ID (int C_LocTo_ID)
{
if (C_LocTo_ID <= 0) set_Value (COLUMNNAME_C_LocTo_ID, null);
 else 
set_Value (COLUMNNAME_C_LocTo_ID, Integer.valueOf(C_LocTo_ID));
}
/** Get Location To.
@return Location that inventory was moved to */
public int getC_LocTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="433438de-1955-2069-3d79-cdbd3583b3fd")
public static String es_PE_FIELD_GeneralLedger_LocationTo_Description="Ubicación a la que el inventario fue movido.";

@XendraTrl(Identifier="433438de-1955-2069-3d79-cdbd3583b3fd")
public static String es_PE_FIELD_GeneralLedger_LocationTo_Help="La Ubicación A indica la ubicación a la que un producto fue movido.";

@XendraTrl(Identifier="433438de-1955-2069-3d79-cdbd3583b3fd")
public static String es_PE_FIELD_GeneralLedger_LocationTo_Name="A Localización";

@XendraField(AD_Column_ID="C_LocTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=570,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="433438de-1955-2069-3d79-cdbd3583b3fd")
public static final String FIELDNAME_GeneralLedger_LocationTo="433438de-1955-2069-3d79-cdbd3583b3fd";

@XendraTrl(Identifier="1d7abb7f-d29b-69de-4aa8-cab963df5abc")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1d7abb7f-d29b-69de-4aa8-cab963df5abc",Synchronized="2017-08-05 16:54:52.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
/** Set Currency Type Key.
@param ConVERSIONTypeValue Key value for the Currency ConVERSION Rate Type */
public void setConVERSIONTypeValue (String ConVERSIONTypeValue)
{
if (ConVERSIONTypeValue != null && ConVERSIONTypeValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ConVERSIONTypeValue = ConVERSIONTypeValue.substring(0,39);
}
set_Value (COLUMNNAME_ConVERSIONTypeValue, ConVERSIONTypeValue);
}
/** Get Currency Type Key.
@return Key value for the Currency ConVERSION Rate Type */
public String getConVERSIONTypeValue() 
{
String value = (String)get_Value(COLUMNNAME_ConVERSIONTypeValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f1022582-6f31-c057-7020-f9dc06d22115")
public static String es_PE_FIELD_GeneralLedger_CurrencyTypeKey_Description="Valor de la llave para el tipo del indice de conversión.";

@XendraTrl(Identifier="f1022582-6f31-c057-7020-f9dc06d22115")
public static String es_PE_FIELD_GeneralLedger_CurrencyTypeKey_Help="El valor de tipo de llave para la conversión de las transacciones de moneda extranjera.";

@XendraTrl(Identifier="f1022582-6f31-c057-7020-f9dc06d22115")
public static String es_PE_FIELD_GeneralLedger_CurrencyTypeKey_Name="Tipo de llave de Conversión";

@XendraField(AD_Column_ID="ConVERSIONTypeValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1022582-6f31-c057-7020-f9dc06d22115")
public static final String FIELDNAME_GeneralLedger_CurrencyTypeKey="f1022582-6f31-c057-7020-f9dc06d22115";

@XendraTrl(Identifier="6b4ab56f-412c-50cf-e295-25ecd3ca8425")
public static String es_PE_COLUMN_ConVERSIONTypeValue_Name="Tipo de llave de Conversión";

@XendraColumn(AD_Element_ID="db98d8a9-d136-fa56-ebbe-e540f17d6655",
ColumnName="ConversionTypeValue",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=40,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6b4ab56f-412c-50cf-e295-25ecd3ca8425",Synchronized="2017-08-05 16:54:52.0")
/** Column name ConVERSIONTypeValue */
public static final String COLUMNNAME_ConVERSIONTypeValue = "ConVERSIONTypeValue";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="991e698c-2d28-b175-4b6a-67c57998342a")
public static String es_PE_FIELD_GeneralLedger_Period_Description="Período de Calendario";

@XendraTrl(Identifier="991e698c-2d28-b175-4b6a-67c57998342a")
public static String es_PE_FIELD_GeneralLedger_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="991e698c-2d28-b175-4b6a-67c57998342a")
public static String es_PE_FIELD_GeneralLedger_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="991e698c-2d28-b175-4b6a-67c57998342a")
public static final String FIELDNAME_GeneralLedger_Period="991e698c-2d28-b175-4b6a-67c57998342a";

@XendraTrl(Identifier="854e670a-77bc-6eb5-0e3c-c422ef3ffc0e")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="854e670a-77bc-6eb5-0e3c-c422ef3ffc0e",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
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

@XendraTrl(Identifier="ee262abc-425d-a837-7f0f-f85786e58f03")
public static String es_PE_FIELD_GeneralLedger_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="ee262abc-425d-a837-7f0f-f85786e58f03")
public static String es_PE_FIELD_GeneralLedger_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="ee262abc-425d-a837-7f0f-f85786e58f03")
public static String es_PE_FIELD_GeneralLedger_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee262abc-425d-a837-7f0f-f85786e58f03")
public static final String FIELDNAME_GeneralLedger_Project="ee262abc-425d-a837-7f0f-f85786e58f03";

@XendraTrl(Identifier="42527b93-d555-52cc-8303-422477bafb2e")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42527b93-d555-52cc-8303-422477bafb2e",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_Value (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="45763cdc-ed00-f611-40c7-23f4b02bf5c4")
public static String es_PE_FIELD_GeneralLedger_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="45763cdc-ed00-f611-40c7-23f4b02bf5c4")
public static String es_PE_FIELD_GeneralLedger_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="45763cdc-ed00-f611-40c7-23f4b02bf5c4")
public static String es_PE_FIELD_GeneralLedger_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45763cdc-ed00-f611-40c7-23f4b02bf5c4")
public static final String FIELDNAME_GeneralLedger_SalesRegion="45763cdc-ed00-f611-40c7-23f4b02bf5c4";

@XendraTrl(Identifier="db12ea6b-0f74-ad59-3861-c0f22f9a6ece")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db12ea6b-0f74-ad59-3861-c0f22f9a6ece",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7d5b75fc-7953-9a72-f617-27eb99c8aed0")
public static String es_PE_FIELD_GeneralLedger_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="7d5b75fc-7953-9a72-f617-27eb99c8aed0")
public static String es_PE_FIELD_GeneralLedger_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="7d5b75fc-7953-9a72-f617-27eb99c8aed0")
public static String es_PE_FIELD_GeneralLedger_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=370,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7d5b75fc-7953-9a72-f617-27eb99c8aed0")
public static final String FIELDNAME_GeneralLedger_UOM="7d5b75fc-7953-9a72-f617-27eb99c8aed0";

@XendraTrl(Identifier="efd6f5dd-be64-592a-576d-5320215f573b")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efd6f5dd-be64-592a-576d-5320215f573b",
Synchronized="2017-08-05 16:54:52.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Rate.
@param CurrencyRate Currency Conversion Rate */
public void setCurrencyRate (BigDecimal CurrencyRate)
{
set_Value (COLUMNNAME_CurrencyRate, CurrencyRate);
}
/** Get Rate.
@return Currency Conversion Rate */
public BigDecimal getCurrencyRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrencyRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dcc1610e-f7fc-4e55-1412-563d462ec6f9")
public static String es_PE_FIELD_GeneralLedger_Rate_Description="Tasa de Conversión de moneda.";

@XendraTrl(Identifier="dcc1610e-f7fc-4e55-1412-563d462ec6f9")
public static String es_PE_FIELD_GeneralLedger_Rate_Help="La tasa de conversión de moneda indica la tasa a ser usada cuando se convierte la moneda fuente a la moneda contable.";

@XendraTrl(Identifier="dcc1610e-f7fc-4e55-1412-563d462ec6f9")
public static String es_PE_FIELD_GeneralLedger_Rate_Name="Tasa";

@XendraField(AD_Column_ID="CurrencyRate",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcc1610e-f7fc-4e55-1412-563d462ec6f9")
public static final String FIELDNAME_GeneralLedger_Rate="dcc1610e-f7fc-4e55-1412-563d462ec6f9";

@XendraTrl(Identifier="d147c2a3-29dd-6b53-0fb3-677015798040")
public static String es_PE_COLUMN_CurrencyRate_Name="Tasa";

@XendraColumn(AD_Element_ID="4289010b-fa36-c95f-6306-3182f48d2b0c",ColumnName="CurrencyRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d147c2a3-29dd-6b53-0fb3-677015798040",
Synchronized="2017-08-05 16:54:52.0")
/** Column name CurrencyRate */
public static final String COLUMNNAME_CurrencyRate = "CurrencyRate";
/** Set Combination.
@param C_ValidCombination_ID Valid Account Combination */
public void setC_ValidCombination_ID (int C_ValidCombination_ID)
{
if (C_ValidCombination_ID <= 0) set_Value (COLUMNNAME_C_ValidCombination_ID, null);
 else 
set_Value (COLUMNNAME_C_ValidCombination_ID, Integer.valueOf(C_ValidCombination_ID));
}
/** Get Combination.
@return Valid Account Combination */
public int getC_ValidCombination_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ValidCombination_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d74ccd45-63c3-360f-144b-7dc015db428f")
public static String es_PE_FIELD_GeneralLedger_Combination_Description="Combinación de Cuenta Válido";

@XendraTrl(Identifier="d74ccd45-63c3-360f-144b-7dc015db428f")
public static String es_PE_FIELD_GeneralLedger_Combination_Help="La combinación identifica una combinación válida de elementos que representan una cuenta de Cg.";

@XendraTrl(Identifier="d74ccd45-63c3-360f-144b-7dc015db428f")
public static String es_PE_FIELD_GeneralLedger_Combination_Name="Combinación";

@XendraField(AD_Column_ID="C_ValidCombination_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d74ccd45-63c3-360f-144b-7dc015db428f")
public static final String FIELDNAME_GeneralLedger_Combination="d74ccd45-63c3-360f-144b-7dc015db428f";

@XendraTrl(Identifier="84d85d2b-87ee-bf79-2d99-498b9b7c3fda")
public static String es_PE_COLUMN_C_ValidCombination_ID_Name="Combinación";

@XendraColumn(AD_Element_ID="7131fb8b-047a-8274-0958-0f2b91a7fd8a",
ColumnName="C_ValidCombination_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="84d85d2b-87ee-bf79-2d99-498b9b7c3fda",Synchronized="2017-08-05 16:54:52.0")
/** Column name C_ValidCombination_ID */
public static final String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
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

@XendraTrl(Identifier="3e538fa2-bbb2-db87-2993-d0159c39868e")
public static String es_PE_FIELD_GeneralLedger_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="3e538fa2-bbb2-db87-2993-d0159c39868e")
public static String es_PE_FIELD_GeneralLedger_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="3e538fa2-bbb2-db87-2993-d0159c39868e")
public static String es_PE_FIELD_GeneralLedger_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e538fa2-bbb2-db87-2993-d0159c39868e")
public static final String FIELDNAME_GeneralLedger_AccountDate="3e538fa2-bbb2-db87-2993-d0159c39868e";

@XendraTrl(Identifier="a117403e-a966-ea17-bf0c-02f4c8a6f4ff")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a117403e-a966-ea17-bf0c-02f4c8a6f4ff",
Synchronized="2017-08-05 16:54:52.0")
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

@XendraTrl(Identifier="8069c844-7c51-9c2c-c3e6-340ebb8d5dc0")
public static String es_PE_FIELD_GeneralLedger_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="8069c844-7c51-9c2c-c3e6-340ebb8d5dc0")
public static String es_PE_FIELD_GeneralLedger_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="8069c844-7c51-9c2c-c3e6-340ebb8d5dc0")
public static String es_PE_FIELD_GeneralLedger_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8069c844-7c51-9c2c-c3e6-340ebb8d5dc0")
public static final String FIELDNAME_GeneralLedger_Description="8069c844-7c51-9c2c-c3e6-340ebb8d5dc0";

@XendraTrl(Identifier="d2c3c8cd-7abf-3e01-9303-8298cef7c7e2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2c3c8cd-7abf-3e01-9303-8298cef7c7e2",
Synchronized="2017-08-05 16:54:52.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="204f3b45-8c8b-2d61-c969-6a6f3b7ca8c6")
public static String es_PE_FIELD_GeneralLedger_DocumentTypeName_Description="Nombre del tipo de documento";

@XendraTrl(Identifier="204f3b45-8c8b-2d61-c969-6a6f3b7ca8c6")
public static String es_PE_FIELD_GeneralLedger_DocumentTypeName_Name="Nombre del Tipo de Documento";

@XendraField(AD_Column_ID="DocTypeName",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="204f3b45-8c8b-2d61-c969-6a6f3b7ca8c6")
public static final String FIELDNAME_GeneralLedger_DocumentTypeName="204f3b45-8c8b-2d61-c969-6a6f3b7ca8c6";

@XendraTrl(Identifier="72ed6ebf-a507-bae6-ae60-76783c127a51")
public static String es_PE_COLUMN_DocTypeName_Name="Nombre del Tipo de Documento";

@XendraColumn(AD_Element_ID="af613457-d4ac-9b3e-87a0-02ba8501326b",ColumnName="DocTypeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72ed6ebf-a507-bae6-ae60-76783c127a51",
Synchronized="2017-08-05 16:54:52.0")
/** Column name DocTypeName */
public static final String COLUMNNAME_DocTypeName = "DocTypeName";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID <= 0) set_Value (COLUMNNAME_GL_Budget_ID, null);
 else 
set_Value (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ed353f1-e6bd-93e0-104d-07481385a4dd")
public static String es_PE_FIELD_GeneralLedger_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="2ed353f1-e6bd-93e0-104d-07481385a4dd")
public static String es_PE_FIELD_GeneralLedger_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraTrl(Identifier="2ed353f1-e6bd-93e0-104d-07481385a4dd")
public static String es_PE_FIELD_GeneralLedger_Budget_Name="Presupuesto";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ed353f1-e6bd-93e0-104d-07481385a4dd")
public static final String FIELDNAME_GeneralLedger_Budget="2ed353f1-e6bd-93e0-104d-07481385a4dd";

@XendraTrl(Identifier="0c6e7293-0784-7cc0-e4fa-488a957453fb")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c6e7293-0784-7cc0-e4fa-488a957453fb",
Synchronized="2017-08-05 16:54:52.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
/** Set GL Category.
@param GL_Category_ID General Ledger Category */
public void setGL_Category_ID (int GL_Category_ID)
{
if (GL_Category_ID <= 0) set_Value (COLUMNNAME_GL_Category_ID, null);
 else 
set_Value (COLUMNNAME_GL_Category_ID, Integer.valueOf(GL_Category_ID));
}
/** Get GL Category.
@return General Ledger Category */
public int getGL_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="549d1664-6097-daec-218a-f862833ad3d8")
public static String es_PE_FIELD_GeneralLedger_GLCategory_Description="Categoría de Contabilidad General";

@XendraTrl(Identifier="549d1664-6097-daec-218a-f862833ad3d8")
public static String es_PE_FIELD_GeneralLedger_GLCategory_Help="La Categoría de Contabilidad General es un método opcional; definido por el usuario; de agrupación de líneas de las pólizas";

@XendraTrl(Identifier="549d1664-6097-daec-218a-f862833ad3d8")
public static String es_PE_FIELD_GeneralLedger_GLCategory_Name="Categoría CG";

@XendraField(AD_Column_ID="GL_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="549d1664-6097-daec-218a-f862833ad3d8")
public static final String FIELDNAME_GeneralLedger_GLCategory="549d1664-6097-daec-218a-f862833ad3d8";

@XendraTrl(Identifier="7a9512e6-4f4b-92ee-2a70-a9b5dad3b096")
public static String es_PE_COLUMN_GL_Category_ID_Name="Categoría CG";

@XendraColumn(AD_Element_ID="b3063a1c-d28b-42fc-2d1b-27037b4d6514",ColumnName="GL_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a9512e6-4f4b-92ee-2a70-a9b5dad3b096",
Synchronized="2017-08-05 16:54:52.0")
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
/** Set Journal Batch.
@param GL_JournalBatch_ID General Ledger Journal Batch */
public void setGL_JournalBatch_ID (int GL_JournalBatch_ID)
{
if (GL_JournalBatch_ID <= 0) set_Value (COLUMNNAME_GL_JournalBatch_ID, null);
 else 
set_Value (COLUMNNAME_GL_JournalBatch_ID, Integer.valueOf(GL_JournalBatch_ID));
}
/** Get Journal Batch.
@return General Ledger Journal Batch */
public int getGL_JournalBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ccb25958-f26c-c322-6dbf-8f6db9b4464f")
public static String es_PE_FIELD_GeneralLedger_JournalBatch_Description="Lote de Diario CG";

@XendraTrl(Identifier="ccb25958-f26c-c322-6dbf-8f6db9b4464f")
public static String es_PE_FIELD_GeneralLedger_JournalBatch_Help="El lote de pólizas de la contabilidad general identifica un conjunto de pólizas a ser procesadas como un grupo.";

@XendraTrl(Identifier="ccb25958-f26c-c322-6dbf-8f6db9b4464f")
public static String es_PE_FIELD_GeneralLedger_JournalBatch_Name="Lote de Diario CG";

@XendraField(AD_Column_ID="GL_JournalBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ccb25958-f26c-c322-6dbf-8f6db9b4464f")
public static final String FIELDNAME_GeneralLedger_JournalBatch="ccb25958-f26c-c322-6dbf-8f6db9b4464f";

@XendraTrl(Identifier="ecf76369-6307-ec84-51d8-6306a3c563f5")
public static String es_PE_COLUMN_GL_JournalBatch_ID_Name="Lote de Diario CG";

@XendraColumn(AD_Element_ID="7fbd376a-5aca-74a1-5535-368c0ba04a7a",ColumnName="GL_JournalBatch_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecf76369-6307-ec84-51d8-6306a3c563f5",
Synchronized="2017-08-05 16:54:52.0")
/** Column name GL_JournalBatch_ID */
public static final String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
/** Set Journal.
@param GL_Journal_ID General Ledger Journal */
public void setGL_Journal_ID (int GL_Journal_ID)
{
if (GL_Journal_ID <= 0) set_Value (COLUMNNAME_GL_Journal_ID, null);
 else 
set_Value (COLUMNNAME_GL_Journal_ID, Integer.valueOf(GL_Journal_ID));
}
/** Get Journal.
@return General Ledger Journal */
public int getGL_Journal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Journal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="79b795fe-09e6-9999-da14-2a99a4e3a87e")
public static String es_PE_FIELD_GeneralLedger_Journal_Description="Póliza";

@XendraTrl(Identifier="79b795fe-09e6-9999-da14-2a99a4e3a87e")
public static String es_PE_FIELD_GeneralLedger_Journal_Help="La póliza de la contabilidad general identifica un grupo de líneas de póliza que representa una transacción lógica del negocio.";

@XendraTrl(Identifier="79b795fe-09e6-9999-da14-2a99a4e3a87e")
public static String es_PE_FIELD_GeneralLedger_Journal_Name="Póliza";

@XendraField(AD_Column_ID="GL_Journal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79b795fe-09e6-9999-da14-2a99a4e3a87e")
public static final String FIELDNAME_GeneralLedger_Journal="79b795fe-09e6-9999-da14-2a99a4e3a87e";

@XendraTrl(Identifier="19e2af46-0393-c229-06a3-fdccbff5c9c3")
public static String es_PE_COLUMN_GL_Journal_ID_Name="Póliza";

@XendraColumn(AD_Element_ID="32802681-b859-1049-1622-21ea8c9a2474",ColumnName="GL_Journal_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19e2af46-0393-c229-06a3-fdccbff5c9c3",
Synchronized="2017-08-05 16:54:52.0")
/** Column name GL_Journal_ID */
public static final String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
/** Set Journal Line.
@param GL_JournalLine_ID General Ledger Journal Line */
public void setGL_JournalLine_ID (int GL_JournalLine_ID)
{
if (GL_JournalLine_ID <= 0) set_Value (COLUMNNAME_GL_JournalLine_ID, null);
 else 
set_Value (COLUMNNAME_GL_JournalLine_ID, Integer.valueOf(GL_JournalLine_ID));
}
/** Get Journal Line.
@return General Ledger Journal Line */
public int getGL_JournalLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8ed3b517-c0a1-66f3-ec8f-cccb6341bb76")
public static String es_PE_FIELD_GeneralLedger_JournalLine_Description="Item de la póliza";

@XendraTrl(Identifier="8ed3b517-c0a1-66f3-ec8f-cccb6341bb76")
public static String es_PE_FIELD_GeneralLedger_JournalLine_Help="Identifica una transacción simple en una póliza.";

@XendraTrl(Identifier="8ed3b517-c0a1-66f3-ec8f-cccb6341bb76")
public static String es_PE_FIELD_GeneralLedger_JournalLine_Name="Item de Póliza";

@XendraField(AD_Column_ID="GL_JournalLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="Line",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ed3b517-c0a1-66f3-ec8f-cccb6341bb76")
public static final String FIELDNAME_GeneralLedger_JournalLine="8ed3b517-c0a1-66f3-ec8f-cccb6341bb76";

@XendraTrl(Identifier="baee2850-20dc-8db6-6762-6af741b36ce2")
public static String es_PE_COLUMN_GL_JournalLine_ID_Name="Línea de Póliza";

@XendraColumn(AD_Element_ID="c9aa03ab-1fd1-d7fb-3974-8468533ee479",ColumnName="GL_JournalLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="baee2850-20dc-8db6-6762-6af741b36ce2",
Synchronized="2017-08-05 16:54:52.0")
/** Column name GL_JournalLine_ID */
public static final String COLUMNNAME_GL_JournalLine_ID = "GL_JournalLine_ID";
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
@XendraTrl(Identifier="75fba669-566c-4d44-9f45-e1d843cd9056")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75fba669-566c-4d44-9f45-e1d843cd9056",
Synchronized="2017-08-05 16:54:52.0")
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
@XendraTrl(Identifier="37264884-2596-5b81-8a2c-0aa7c7a614e7")
public static String es_PE_FIELD_GeneralLedger_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="37264884-2596-5b81-8a2c-0aa7c7a614e7")
public static String es_PE_FIELD_GeneralLedger_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraTrl(Identifier="37264884-2596-5b81-8a2c-0aa7c7a614e7")
public static String es_PE_FIELD_GeneralLedger_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37264884-2596-5b81-8a2c-0aa7c7a614e7")
public static final String FIELDNAME_GeneralLedger_ImportErrorMessage="37264884-2596-5b81-8a2c-0aa7c7a614e7";

@XendraTrl(Identifier="ba148134-855b-7cf0-c9d4-e8f8ae55c086")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba148134-855b-7cf0-c9d4-e8f8ae55c086",
Synchronized="2017-08-05 16:54:52.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Import GL Journal.
@param I_GLJournal_ID Import General Ledger Journal */
public void setI_GLJournal_ID (int I_GLJournal_ID)
{
if (I_GLJournal_ID < 1) throw new IllegalArgumentException ("I_GLJournal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_GLJournal_ID, Integer.valueOf(I_GLJournal_ID));
}
/** Get Import GL Journal.
@return Import General Ledger Journal */
public int getI_GLJournal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_GLJournal_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getI_GLJournal_ID()));
}

@XendraTrl(Identifier="1fb3e66e-a783-d70a-12b9-ea78dbe05b27")
public static String es_PE_FIELD_GeneralLedger_ImportGLJournal_Description="Importar Diario de Contabilidad";

@XendraTrl(Identifier="1fb3e66e-a783-d70a-12b9-ea78dbe05b27")
public static String es_PE_FIELD_GeneralLedger_ImportGLJournal_Name="Importar Diario de CG";

@XendraField(AD_Column_ID="I_GLJournal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=10,IsReadOnly=true,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fb3e66e-a783-d70a-12b9-ea78dbe05b27")
public static final String FIELDNAME_GeneralLedger_ImportGLJournal="1fb3e66e-a783-d70a-12b9-ea78dbe05b27";
/** Column name I_GLJournal_ID */
public static final String COLUMNNAME_I_GLJournal_ID = "I_GLJournal_ID";
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

@XendraTrl(Identifier="30834a0f-f5a4-8d78-115c-5852cd55b559")
public static String es_PE_FIELD_GeneralLedger_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="30834a0f-f5a4-8d78-115c-5852cd55b559")
public static String es_PE_FIELD_GeneralLedger_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraTrl(Identifier="30834a0f-f5a4-8d78-115c-5852cd55b559")
public static String es_PE_FIELD_GeneralLedger_Imported_Name="Importar";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30834a0f-f5a4-8d78-115c-5852cd55b559")
public static final String FIELDNAME_GeneralLedger_Imported="30834a0f-f5a4-8d78-115c-5852cd55b559";

@XendraTrl(Identifier="bbf3e93e-e095-889f-89be-7a2dcfc97cfc")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bbf3e93e-e095-889f-89be-7a2dcfc97cfc",
Synchronized="2017-08-05 16:54:52.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Create New Batch.
@param IsCreateNewBatch If selected a new batch is CREATED */
public void setIsCreateNewBatch (boolean IsCreateNewBatch)
{
set_Value (COLUMNNAME_IsCreateNewBatch, Boolean.valueOf(IsCreateNewBatch));
}
/** Get Create New Batch.
@return If selected a new batch is CREATED */
public boolean isCreateNewBatch() 
{
Object oo = get_Value(COLUMNNAME_IsCreateNewBatch);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c34e1264-02b1-933a-0301-f955c2184fce")
public static String es_PE_FIELD_GeneralLedger_CreateNewBatch_Description="Si seleccionó es creado un nuevo lote";

@XendraTrl(Identifier="c34e1264-02b1-933a-0301-f955c2184fce")
public static String es_PE_FIELD_GeneralLedger_CreateNewBatch_Help="Note que verificar balance no verifica que los lotes individuales estén balanceados";

@XendraTrl(Identifier="c34e1264-02b1-933a-0301-f955c2184fce")
public static String es_PE_FIELD_GeneralLedger_CreateNewBatch_Name="Crear Nuevo Lote ";

@XendraField(AD_Column_ID="IsCreateNewBatch",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c34e1264-02b1-933a-0301-f955c2184fce")
public static final String FIELDNAME_GeneralLedger_CreateNewBatch="c34e1264-02b1-933a-0301-f955c2184fce";

@XendraTrl(Identifier="e18a78ad-5d5a-f2e3-f8df-3148dd009427")
public static String es_PE_COLUMN_IsCreateNewBatch_Name="Crear Nuevo Lote ";

@XendraColumn(AD_Element_ID="5b8aebe3-3ec4-32ef-ca93-b3cf1aede133",ColumnName="IsCreateNewBatch",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e18a78ad-5d5a-f2e3-f8df-3148dd009427",
Synchronized="2017-08-05 16:54:52.0")
/** Column name IsCreateNewBatch */
public static final String COLUMNNAME_IsCreateNewBatch = "IsCreateNewBatch";
/** Set Create New Journal.
@param IsCreateNewJournal If selected a new journal within the batch is CREATED */
public void setIsCreateNewJournal (boolean IsCreateNewJournal)
{
set_Value (COLUMNNAME_IsCreateNewJournal, Boolean.valueOf(IsCreateNewJournal));
}
/** Get Create New Journal.
@return If selected a new journal within the batch is CREATED */
public boolean isCreateNewJournal() 
{
Object oo = get_Value(COLUMNNAME_IsCreateNewJournal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="370fdc17-9cf0-d6b3-9f73-54b9cc9e26d8")
public static String es_PE_FIELD_GeneralLedger_CreateNewJournal_Description="If selected a new journal within the batch is created";

@XendraTrl(Identifier="370fdc17-9cf0-d6b3-9f73-54b9cc9e26d8")
public static String es_PE_FIELD_GeneralLedger_CreateNewJournal_Help="Note que verificar balance no verifica que los diarios ndividuales estén balanceados.";

@XendraTrl(Identifier="370fdc17-9cf0-d6b3-9f73-54b9cc9e26d8")
public static String es_PE_FIELD_GeneralLedger_CreateNewJournal_Name="Crear Nuevo Diario";

@XendraField(AD_Column_ID="IsCreateNewJournal",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="370fdc17-9cf0-d6b3-9f73-54b9cc9e26d8")
public static final String FIELDNAME_GeneralLedger_CreateNewJournal="370fdc17-9cf0-d6b3-9f73-54b9cc9e26d8";

@XendraTrl(Identifier="e1fe19f7-9ad9-4730-1935-38c3cb87fb7a")
public static String es_PE_COLUMN_IsCreateNewJournal_Name="Crear Nuevo Diario";

@XendraColumn(AD_Element_ID="cacaf1fe-ccf6-8f49-0cea-cf210f30d568",ColumnName="IsCreateNewJournal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1fe19f7-9ad9-4730-1935-38c3cb87fb7a",
Synchronized="2017-08-05 16:54:52.0")
/** Column name IsCreateNewJournal */
public static final String COLUMNNAME_IsCreateNewJournal = "IsCreateNewJournal";
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
@XendraTrl(Identifier="f58f3848-16f2-9595-48b2-ae9ad575f943")
public static String es_PE_FIELD_GeneralLedger_ISOCurrencyCode_Description="Código ISO 4217 de la moneda";

@XendraTrl(Identifier="f58f3848-16f2-9595-48b2-ae9ad575f943")
public static String es_PE_FIELD_GeneralLedger_ISOCurrencyCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraTrl(Identifier="f58f3848-16f2-9595-48b2-ae9ad575f943")
public static String es_PE_FIELD_GeneralLedger_ISOCurrencyCode_Name="Código ISO";

@XendraField(AD_Column_ID="ISO_Code",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f58f3848-16f2-9595-48b2-ae9ad575f943")
public static final String FIELDNAME_GeneralLedger_ISOCurrencyCode="f58f3848-16f2-9595-48b2-ae9ad575f943";

@XendraTrl(Identifier="84b689e0-f4d4-0086-25aa-29217c203189")
public static String es_PE_COLUMN_ISO_Code_Name="Código ISO";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84b689e0-f4d4-0086-25aa-29217c203189",
Synchronized="2017-08-05 16:54:52.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";
/** Set Journal Document No.
@param JournalDocumentNo Document number of the Journal */
public void setJournalDocumentNo (String JournalDocumentNo)
{
if (JournalDocumentNo != null && JournalDocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
JournalDocumentNo = JournalDocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_JournalDocumentNo, JournalDocumentNo);
}
/** Get Journal Document No.
@return Document number of the Journal */
public String getJournalDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_JournalDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0f0fa9d9-0727-3796-fc96-1da58e933550")
public static String es_PE_FIELD_GeneralLedger_JournalDocumentNo_Description="Número de documento en el diario";

@XendraTrl(Identifier="0f0fa9d9-0727-3796-fc96-1da58e933550")
public static String es_PE_FIELD_GeneralLedger_JournalDocumentNo_Name="No. de Documento Diario";

@XendraField(AD_Column_ID="JournalDocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f0fa9d9-0727-3796-fc96-1da58e933550")
public static final String FIELDNAME_GeneralLedger_JournalDocumentNo="0f0fa9d9-0727-3796-fc96-1da58e933550";

@XendraTrl(Identifier="8704e987-17ba-30e0-fe4b-579bc7ede478")
public static String es_PE_COLUMN_JournalDocumentNo_Name="No. de Documento Diario";

@XendraColumn(AD_Element_ID="dfdb627e-348d-3cef-d207-373cf098373b",ColumnName="JournalDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8704e987-17ba-30e0-fe4b-579bc7ede478",
Synchronized="2017-08-05 16:54:53.0")
/** Column name JournalDocumentNo */
public static final String COLUMNNAME_JournalDocumentNo = "JournalDocumentNo";
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

@XendraTrl(Identifier="38d16aac-3e87-b935-80f3-55cb3f96bb9f")
public static String es_PE_FIELD_GeneralLedger_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="38d16aac-3e87-b935-80f3-55cb3f96bb9f")
public static String es_PE_FIELD_GeneralLedger_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="38d16aac-3e87-b935-80f3-55cb3f96bb9f")
public static String es_PE_FIELD_GeneralLedger_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38d16aac-3e87-b935-80f3-55cb3f96bb9f")
public static final String FIELDNAME_GeneralLedger_LineNo="38d16aac-3e87-b935-80f3-55cb3f96bb9f";

@XendraTrl(Identifier="d0a332b0-0347-1718-7dab-ff8ecf19f1dd")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0a332b0-0347-1718-7dab-ff8ecf19f1dd",
Synchronized="2017-08-05 16:54:53.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e4ff53a1-92b4-a050-2685-1d154b41ffca")
public static String es_PE_FIELD_GeneralLedger_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="e4ff53a1-92b4-a050-2685-1d154b41ffca")
public static String es_PE_FIELD_GeneralLedger_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="e4ff53a1-92b4-a050-2685-1d154b41ffca")
public static String es_PE_FIELD_GeneralLedger_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4ff53a1-92b4-a050-2685-1d154b41ffca")
public static final String FIELDNAME_GeneralLedger_Product="e4ff53a1-92b4-a050-2685-1d154b41ffca";

@XendraTrl(Identifier="68aea068-23b5-9d91-ac0b-e4679491511c")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68aea068-23b5-9d91-ac0b-e4679491511c",
Synchronized="2017-08-05 16:54:53.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Trx Org Key.
@param OrgTrxValue Key of the Transaction Organization */
public void setOrgTrxValue (String OrgTrxValue)
{
if (OrgTrxValue != null && OrgTrxValue.length() > 40)
{
log.warning("Length > 40 - truncated");
OrgTrxValue = OrgTrxValue.substring(0,39);
}
set_Value (COLUMNNAME_OrgTrxValue, OrgTrxValue);
}
/** Get Trx Org Key.
@return Key of the Transaction Organization */
public String getOrgTrxValue() 
{
String value = (String)get_Value(COLUMNNAME_OrgTrxValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e33931cb-9c1e-c2f6-21ce-598b9d893df6")
public static String es_PE_FIELD_GeneralLedger_TrxOrgKey_Description="Clave de la transacción de organización";

@XendraTrl(Identifier="e33931cb-9c1e-c2f6-21ce-598b9d893df6")
public static String es_PE_FIELD_GeneralLedger_TrxOrgKey_Name="Clave de Transacción de Organización";

@XendraField(AD_Column_ID="OrgTrxValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=540,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e33931cb-9c1e-c2f6-21ce-598b9d893df6")
public static final String FIELDNAME_GeneralLedger_TrxOrgKey="e33931cb-9c1e-c2f6-21ce-598b9d893df6";

@XendraTrl(Identifier="f40c7389-f837-6d2c-2b3b-f0443a2c4fbb")
public static String es_PE_COLUMN_OrgTrxValue_Name="Clave de Transacción de Organización";

@XendraColumn(AD_Element_ID="5b507a17-fbf5-9d2d-9edc-27d3cddcf3aa",ColumnName="OrgTrxValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f40c7389-f837-6d2c-2b3b-f0443a2c4fbb",
Synchronized="2017-08-05 16:54:53.0")
/** Column name OrgTrxValue */
public static final String COLUMNNAME_OrgTrxValue = "OrgTrxValue";
/** Set Org Key.
@param OrgValue Key of the Organization */
public void setOrgValue (String OrgValue)
{
if (OrgValue != null && OrgValue.length() > 40)
{
log.warning("Length > 40 - truncated");
OrgValue = OrgValue.substring(0,39);
}
set_Value (COLUMNNAME_OrgValue, OrgValue);
}
/** Get Org Key.
@return Key of the Organization */
public String getOrgValue() 
{
String value = (String)get_Value(COLUMNNAME_OrgValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a59bee38-87cf-9ba9-39f4-9b97f688616d")
public static String es_PE_FIELD_GeneralLedger_OrgKey_Description="Clave de la organización";

@XendraTrl(Identifier="a59bee38-87cf-9ba9-39f4-9b97f688616d")
public static String es_PE_FIELD_GeneralLedger_OrgKey_Name="Organización Clave";

@XendraField(AD_Column_ID="OrgValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a59bee38-87cf-9ba9-39f4-9b97f688616d")
public static final String FIELDNAME_GeneralLedger_OrgKey="a59bee38-87cf-9ba9-39f4-9b97f688616d";

@XendraTrl(Identifier="33658cf3-1659-60d4-9ba7-87957c826482")
public static String es_PE_COLUMN_OrgValue_Name="Organización Clave";

@XendraColumn(AD_Element_ID="c258e946-b176-f416-1f06-8fb9ea6e27c9",ColumnName="OrgValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33658cf3-1659-60d4-9ba7-87957c826482",
Synchronized="2017-08-05 16:54:53.0")
/** Column name OrgValue */
public static final String COLUMNNAME_OrgValue = "OrgValue";

/** PostingType AD_Reference=1ad48d23-2ec9-09d0-cb68-38688c5e6ce0 */
public static final int POSTINGTYPE_AD_Reference_ID=125;
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType == null || PostingType.equals(REF__PostingType.Actual) || PostingType.equals(REF__PostingType.Budget) || PostingType.equals(REF__PostingType.Commitment) || PostingType.equals(REF__PostingType.Statistical) || PostingType.equals(REF__PostingType.Reservation));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - S - R");
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

@XendraTrl(Identifier="a27797b9-ee75-1e14-597c-605ade0a3a01")
public static String es_PE_FIELD_GeneralLedger_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="a27797b9-ee75-1e14-597c-605ade0a3a01")
public static String es_PE_FIELD_GeneralLedger_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraTrl(Identifier="a27797b9-ee75-1e14-597c-605ade0a3a01")
public static String es_PE_FIELD_GeneralLedger_PostingType_Name="Tipo de Aplicación";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a27797b9-ee75-1e14-597c-605ade0a3a01")
public static final String FIELDNAME_GeneralLedger_PostingType="a27797b9-ee75-1e14-597c-605ade0a3a01";

@XendraTrl(Identifier="5ea1f4ed-fae5-42d0-bf65-e5bd29f2e605")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5ea1f4ed-fae5-42d0-bf65-e5bd29f2e605",Synchronized="2017-08-05 16:54:53.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
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

@XendraTrl(Identifier="43d61dfe-85f0-77c8-9bc3-0fc7293e8c28")
public static String es_PE_FIELD_GeneralLedger_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="43d61dfe-85f0-77c8-9bc3-0fc7293e8c28")
public static String es_PE_FIELD_GeneralLedger_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="43d61dfe-85f0-77c8-9bc3-0fc7293e8c28")
public static String es_PE_FIELD_GeneralLedger_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=610,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43d61dfe-85f0-77c8-9bc3-0fc7293e8c28")
public static final String FIELDNAME_GeneralLedger_Processed="43d61dfe-85f0-77c8-9bc3-0fc7293e8c28";

@XendraTrl(Identifier="715ab287-673a-2f6a-243a-e2541e298a44")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="715ab287-673a-2f6a-243a-e2541e298a44",
Synchronized="2017-08-05 16:54:53.0")
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

@XendraTrl(Identifier="44112da9-7236-96e7-94ff-aa34b50910a9")
public static String es_PE_FIELD_GeneralLedger_ProcessNow_Description="Importa Contabilidad General Lote/Poliza/Linea";

@XendraTrl(Identifier="44112da9-7236-96e7-94ff-aa34b50910a9")
public static String es_PE_FIELD_GeneralLedger_ProcessNow_Help="Los parámetros son valores prefijados para los valores nulos del expediente de la importación, ellos no sobreescriben ningunos datos.";

@XendraTrl(Identifier="44112da9-7236-96e7-94ff-aa34b50910a9")
public static String es_PE_FIELD_GeneralLedger_ProcessNow_Name="Importa Polizas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=600,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44112da9-7236-96e7-94ff-aa34b50910a9")
public static final String FIELDNAME_GeneralLedger_ProcessNow="44112da9-7236-96e7-94ff-aa34b50910a9";

@XendraTrl(Identifier="1df841a2-f886-528b-e49d-0c24683b6c22")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="6e0612e5-ffe5-142b-0965-2579a7ac2a68",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1df841a2-f886-528b-e49d-0c24683b6c22",Synchronized="2017-08-05 16:54:53.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Product Key.
@param ProductValue Key of the Product */
public void setProductValue (String ProductValue)
{
if (ProductValue != null && ProductValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ProductValue = ProductValue.substring(0,39);
}
set_Value (COLUMNNAME_ProductValue, ProductValue);
}
/** Get Product Key.
@return Key of the Product */
public String getProductValue() 
{
String value = (String)get_Value(COLUMNNAME_ProductValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="13032d2e-f147-3fd0-1ed2-8c41118b647b")
public static String es_PE_FIELD_GeneralLedger_ProductKey_Description="Generar lista de conteo solamente para este valor del producto (Usted puede usar %)";

@XendraTrl(Identifier="13032d2e-f147-3fd0-1ed2-8c41118b647b")
public static String es_PE_FIELD_GeneralLedger_ProductKey_Name="Sólo Valor de Producto";

@XendraField(AD_Column_ID="ProductValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13032d2e-f147-3fd0-1ed2-8c41118b647b")
public static final String FIELDNAME_GeneralLedger_ProductKey="13032d2e-f147-3fd0-1ed2-8c41118b647b";

@XendraTrl(Identifier="7ed4d6ec-e2b2-4065-54bc-0e071debf302")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ed4d6ec-e2b2-4065-54bc-0e071debf302",
Synchronized="2017-08-05 16:54:53.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";
/** Set Project Key.
@param ProjectValue Key of the Project */
public void setProjectValue (String ProjectValue)
{
if (ProjectValue != null && ProjectValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ProjectValue = ProjectValue.substring(0,39);
}
set_Value (COLUMNNAME_ProjectValue, ProjectValue);
}
/** Get Project Key.
@return Key of the Project */
public String getProjectValue() 
{
String value = (String)get_Value(COLUMNNAME_ProjectValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="86b1c0ba-253c-210a-39a4-71714905bbb7")
public static String es_PE_FIELD_GeneralLedger_ProjectKey_Description="Clave del Proyecto";

@XendraTrl(Identifier="86b1c0ba-253c-210a-39a4-71714905bbb7")
public static String es_PE_FIELD_GeneralLedger_ProjectKey_Name="Clave del Proyecto";

@XendraField(AD_Column_ID="ProjectValue",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86b1c0ba-253c-210a-39a4-71714905bbb7")
public static final String FIELDNAME_GeneralLedger_ProjectKey="86b1c0ba-253c-210a-39a4-71714905bbb7";

@XendraTrl(Identifier="e2e7f328-63b6-f266-94f2-e67a9511fc70")
public static String es_PE_COLUMN_ProjectValue_Name="Clave del Proyecto";

@XendraColumn(AD_Element_ID="2e6e7fca-7557-ac49-fde9-ece487e3c90b",ColumnName="ProjectValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2e7f328-63b6-f266-94f2-e67a9511fc70",
Synchronized="2017-08-05 16:54:53.0")
/** Column name ProjectValue */
public static final String COLUMNNAME_ProjectValue = "ProjectValue";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="15462b68-675b-e4d9-8a3e-78249d791969")
public static String es_PE_FIELD_GeneralLedger_Quantity_Description="Cantidad";

@XendraTrl(Identifier="15462b68-675b-e4d9-8a3e-78249d791969")
public static String es_PE_FIELD_GeneralLedger_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="15462b68-675b-e4d9-8a3e-78249d791969")
public static String es_PE_FIELD_GeneralLedger_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15462b68-675b-e4d9-8a3e-78249d791969")
public static final String FIELDNAME_GeneralLedger_Quantity="15462b68-675b-e4d9-8a3e-78249d791969";

@XendraTrl(Identifier="de398feb-9461-e566-ead0-38ea30b21050")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de398feb-9461-e566-ead0-38ea30b21050",
Synchronized="2017-08-05 16:54:53.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set SKU.
@param SKU Stock Keeping Unit */
public void setSKU (String SKU)
{
if (SKU != null && SKU.length() > 30)
{
log.warning("Length > 30 - truncated");
SKU = SKU.substring(0,29);
}
set_Value (COLUMNNAME_SKU, SKU);
}
/** Get SKU.
@return Stock Keeping Unit */
public String getSKU() 
{
String value = (String)get_Value(COLUMNNAME_SKU);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7c0974a3-69dd-4d8a-e1f8-9994a045b726")
public static String es_PE_FIELD_GeneralLedger_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraTrl(Identifier="7c0974a3-69dd-4d8a-e1f8-9994a045b726")
public static String es_PE_FIELD_GeneralLedger_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraTrl(Identifier="7c0974a3-69dd-4d8a-e1f8-9994a045b726")
public static String es_PE_FIELD_GeneralLedger_SKU_Name="UM Almacenamiento";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c0974a3-69dd-4d8a-e1f8-9994a045b726")
public static final String FIELDNAME_GeneralLedger_SKU="7c0974a3-69dd-4d8a-e1f8-9994a045b726";

@XendraTrl(Identifier="9f0eff71-213f-9bd2-f5e3-f38a71112612")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f0eff71-213f-9bd2-f5e3-f38a71112612",
Synchronized="2017-08-05 16:54:53.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";
/** Set UPC/EAN.
@param UPC Bar Code (Universal Product Code or its superset European Article Number) */
public void setUPC (String UPC)
{
if (UPC != null && UPC.length() > 30)
{
log.warning("Length > 30 - truncated");
UPC = UPC.substring(0,29);
}
set_Value (COLUMNNAME_UPC, UPC);
}
/** Get UPC/EAN.
@return Bar Code (Universal Product Code or its superset European Article Number) */
public String getUPC() 
{
String value = (String)get_Value(COLUMNNAME_UPC);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dc372bfe-0f88-12ac-dfda-86742a316621")
public static String es_PE_FIELD_GeneralLedger_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="dc372bfe-0f88-12ac-dfda-86742a316621")
public static String es_PE_FIELD_GeneralLedger_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraTrl(Identifier="dc372bfe-0f88-12ac-dfda-86742a316621")
public static String es_PE_FIELD_GeneralLedger_UPCEAN_Name="UPC/EAN";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc372bfe-0f88-12ac-dfda-86742a316621")
public static final String FIELDNAME_GeneralLedger_UPCEAN="dc372bfe-0f88-12ac-dfda-86742a316621";

@XendraTrl(Identifier="f4980c8b-9da8-535a-a057-c9274e389c05")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4980c8b-9da8-535a-a057-c9274e389c05",
Synchronized="2017-08-05 16:54:53.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";

/** User1_ID AD_Reference=5a2fe161-044f-67cb-3791-6d615980cabb */
public static final int USER1_ID_AD_Reference_ID=134;
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1e86497e-37d8-98a5-8693-ede98d03721e")
public static String es_PE_FIELD_GeneralLedger_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="1e86497e-37d8-98a5-8693-ede98d03721e")
public static String es_PE_FIELD_GeneralLedger_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="1e86497e-37d8-98a5-8693-ede98d03721e")
public static String es_PE_FIELD_GeneralLedger_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=580,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e86497e-37d8-98a5-8693-ede98d03721e")
public static final String FIELDNAME_GeneralLedger_UserList="1e86497e-37d8-98a5-8693-ede98d03721e";

@XendraTrl(Identifier="dc08567d-81ff-b363-e769-04da81530e89")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dc08567d-81ff-b363-e769-04da81530e89",Synchronized="2017-08-05 16:54:53.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

/** User2_ID AD_Reference=6a357ab2-7bb6-fce4-ffee-8bdd855a77fc */
public static final int USER2_ID_AD_Reference_ID=137;
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce936443-3c88-724d-c33d-e38084d56bce")
public static String es_PE_FIELD_GeneralLedger_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="ce936443-3c88-724d-c33d-e38084d56bce")
public static String es_PE_FIELD_GeneralLedger_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="ce936443-3c88-724d-c33d-e38084d56bce")
public static String es_PE_FIELD_GeneralLedger_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="886193cf-db29-ddf7-a7f8-2b5df663ac10",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=590,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce936443-3c88-724d-c33d-e38084d56bce")
public static final String FIELDNAME_GeneralLedger_UserList22="ce936443-3c88-724d-c33d-e38084d56bce";

@XendraTrl(Identifier="61222db0-bd39-a829-adca-60011b852028")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="61222db0-bd39-a829-adca-60011b852028",Synchronized="2017-08-05 16:54:53.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
