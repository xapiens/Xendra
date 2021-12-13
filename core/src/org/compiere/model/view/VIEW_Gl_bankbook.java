package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_bankbook 
{
 
@XendraTable(Name="GL_BankBook",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="GL_BankBook",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.accounting",Identifier="12236eab-4d01-4aa4-9707-fee9ada1747c",
Synchronized="2020-03-03 21:37:54.0")
/** TableName=GL_BankBook */
public static final String Table_Name="GL_BankBook";

@XendraTrl(Identifier="e94249c6-fedf-45c7-919b-57dc29c73c5b")
public static String es_PE_COLUMN_AccountNo_Name="Account No";

@XendraColumn(AD_Element_ID="f476cad1-331f-9d18-a8b7-c03b172f9997",ColumnName="AccountNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e94249c6-fedf-45c7-919b-57dc29c73c5b",
Synchronized="2020-03-03 21:37:53.0")
/** Column name AccountNo */
public static final String COLUMNNAME_AccountNo = "AccountNo";

@XendraTrl(Identifier="c907229e-ecd9-40ca-b7a2-697f0d2a1c77")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c907229e-ecd9-40ca-b7a2-697f0d2a1c77",
Synchronized="2020-03-03 21:37:54.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="abea5d31-39fe-46f2-ad19-6e835c9eddf3")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abea5d31-39fe-46f2-ad19-6e835c9eddf3",
Synchronized="2020-03-03 21:37:54.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="9ce82d0b-7513-4aab-90c5-0ce9ba3f6a1c")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ce82d0b-7513-4aab-90c5-0ce9ba3f6a1c",
Synchronized="2020-03-03 21:37:54.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

@XendraTrl(Identifier="4cb530fa-fbd0-456a-8e77-77de171afed9")
public static String es_PE_COLUMN_currencytax_Name="currencytax";

@XendraColumn(AD_Element_ID="5ea90938-d642-4ff7-8d88-7ce7acdaa02d",ColumnName="currencytax",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4cb530fa-fbd0-456a-8e77-77de171afed9",
Synchronized="2020-03-03 21:37:54.0")
/** Column name currencytax */
public static final String COLUMNNAME_currencytax = "currencytax";

@XendraTrl(Identifier="754982d3-207c-4d4e-ad1e-0d4f2c394c75")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="754982d3-207c-4d4e-ad1e-0d4f2c394c75",
Synchronized="2020-03-03 21:37:54.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="61e436c8-6f38-4d38-899d-821732bdabb7")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61e436c8-6f38-4d38-899d-821732bdabb7",
Synchronized="2020-03-03 21:37:54.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

@XendraTrl(Identifier="ed8e3ac8-24e8-4e22-b847-f0cfd0bdac91")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed8e3ac8-24e8-4e22-b847-f0cfd0bdac91",
Synchronized="2020-03-03 21:37:54.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="0b5533cd-0e4e-40fb-8296-72823cc4a669")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b5533cd-0e4e-40fb-8296-72823cc4a669",
Synchronized="2020-03-03 21:37:54.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="db2244dd-b350-4537-bc34-9f54f93cad3a")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="db2244dd-b350-4537-bc34-9f54f93cad3a",
Synchronized="2020-03-03 21:37:54.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="41957b11-b03c-4cab-9e8d-ba5abb5388e4")
public static String es_PE_COLUMN_fact_id_seq_Name="fact_id_seq";

@XendraColumn(AD_Element_ID="d709f73f-ae74-4e2b-a7a3-5b2b75e536ae",ColumnName="fact_id_seq",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="41957b11-b03c-4cab-9e8d-ba5abb5388e4",
Synchronized="2020-03-03 21:37:54.0")
/** Column name fact_id_seq */
public static final String COLUMNNAME_fact_id_seq = "fact_id_seq";

@XendraTrl(Identifier="4caf3ee0-d72b-4100-9b3f-9bbf5c48524c")
public static String es_PE_COLUMN_namebp_Name="namebp";

@XendraColumn(AD_Element_ID="11302dae-f3f0-4609-9093-038db8f22359",ColumnName="namebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4caf3ee0-d72b-4100-9b3f-9bbf5c48524c",
Synchronized="2020-03-03 21:37:54.0")
/** Column name namebp */
public static final String COLUMNNAME_namebp = "namebp";

@XendraTrl(Identifier="06c57ffc-3110-4847-8469-3eff16d69c28")
public static String es_PE_COLUMN_payment_method_Name="payment_method";

@XendraColumn(AD_Element_ID="88ce25f6-8430-440e-b513-df8bc4a8b128",ColumnName="payment_method",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06c57ffc-3110-4847-8469-3eff16d69c28",
Synchronized="2020-03-03 21:37:54.0")
/** Column name payment_method */
public static final String COLUMNNAME_payment_method = "payment_method";

@XendraTrl(Identifier="82f5bfcb-d51c-4b1c-8db1-28fe31b391ac")
public static String es_PE_COLUMN_RoutingNo_Name="Routing No";

@XendraColumn(AD_Element_ID="6fe1dae1-ff7f-9b06-686b-31ba56524158",ColumnName="RoutingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82f5bfcb-d51c-4b1c-8db1-28fe31b391ac",
Synchronized="2020-03-03 21:37:54.0")
/** Column name RoutingNo */
public static final String COLUMNNAME_RoutingNo = "RoutingNo";

@XendraTrl(Identifier="211e9ca2-db3d-4785-af74-2746b0cf9ad5")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="211e9ca2-db3d-4785-af74-2746b0cf9ad5",
Synchronized="2020-03-03 21:37:54.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="06f8ec4f-5e90-43df-9181-ee558ed9cda6")
public static String es_PE_COLUMN_valuebp_Name="valuebp";

@XendraColumn(AD_Element_ID="4d95d0da-cbcd-448e-a8ad-74d983117beb",ColumnName="valuebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06f8ec4f-5e90-43df-9181-ee558ed9cda6",
Synchronized="2020-03-03 21:37:54.0")
/** Column name valuebp */
public static final String COLUMNNAME_valuebp = "valuebp";
	@XendraView(Identifier="f1c79c05-ea8f-4b5a-9583-d82e7c19a4e0",
Synchronized="2016-10-08 14:04:05.0",
Name="gl_bankbook",
Owner="xendra",
Extension="")
	public static final String Identifier = "f1c79c05-ea8f-4b5a-9583-d82e7c19a4e0";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:05.0");
	sb.appendln("@Identifier=f1c79c05-ea8f-4b5a-9583-d82e7c19a4e0");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT x.c_period_id, x.ad_client_id, x.ad_org_id, CASE WHEN ((rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC))::integer >= 10) THEN (((x.fact_id)::text || '-'::text) || rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC)) ELSE (((x.fact_id)::text || '-0'::text) || rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC)) END AS fact_id, (CASE WHEN ((x.isopendocument)::text = 'Y'::text) THEN 'A'::text ELSE CASE WHEN ((x.isclosedocument)::text = 'Y'::text) THEN 'C'::text ELSE 'M'::text END END || \"right\"(CASE WHEN ((rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC))::integer >= 10) THEN (((x.fact_id)::text || '-'::text) || rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC)) ELSE (((x.fact_id)::text || '-0'::text) || rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC)) END, 9)) AS fact_id_seq, x.datetrx, x.dateacct, x.routingno, x.accountno, x.payment_method, x.namebp, x.valuebp, x.taxid, x.currencytax, x.documentno, x.description, x.amtacctcr, x.amtacctdr FROM (SELECT f.c_period_id, f.ad_client_id, f.ad_org_id, f.fact_id, f.dateacct, f.datetrx, bk.routingno, bac.accountno, (SELECT reftrl.description FROM (ad_ref_list_trl reftrl JOIN ad_ref_list refl ON ((reftrl.ad_ref_list_id = refl.ad_ref_list_id))) WHERE ((refl.ad_reference_id = (214)::numeric) AND (py.tendertype = (refl.value)::bpchar))) AS payment_method, bp.name AS namebp, bp.value AS valuebp, CASE WHEN ((COALESCE(bdt.taxid, 'ninguno'::character varying))::text = 'ninguno'::text) THEN '-'::character varying ELSE bdt.taxid END AS taxid, cy.iso_code AS currencytax, py.documentno, f.description, f.amtacctcr, f.amtacctdr, f.fact_acct_id, f.isclosedocument, f.isopendocument FROM (((((((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) JOIN c_currency cy ON ((f.c_currency_id = cy.c_currency_id))) JOIN c_bpartner bp ON ((f.c_bpartner_id = bp.c_bpartner_id))) JOIN c_bp_doctype bdt ON ((bp.c_bp_doctype_id = bdt.c_bp_doctype_id))) JOIN c_payment py ON ((f.record_id = py.c_payment_id))) JOIN c_bankaccount bac ON ((py.c_bankaccount_id = bac.c_bankaccount_id))) JOIN c_bank bk ON ((bac.c_bank_id = bk.c_bank_id))) WHERE (((((NOT (f.account_id IN (SELECT gl.account_id FROM gl_distributionline gl))) AND ((COALESCE(f.isopendocument, 'N'::character varying))::bpchar = 'N'::bpchar)) AND ((COALESCE(f.isclosedocument, 'N'::character varying))::bpchar = 'N'::bpchar)) AND (f.ad_table_id = (335)::numeric)) AND (ev.isbankaccount = 'Y'::bpchar)) UNION ALL SELECT f.c_period_id, f.ad_client_id, f.ad_org_id, f.fact_id, f.dateacct, f.datetrx, bk.routingno, bac.accountno, (SELECT reftrl.description FROM (ad_ref_list_trl reftrl JOIN ad_ref_list refl ON ((reftrl.ad_ref_list_id = refl.ad_ref_list_id))) WHERE ((refl.ad_reference_id = (214)::numeric) AND (po.tendertype = (refl.value)::bpchar))) AS payment_method, bp.name AS namebp, bp.value AS valuebp, CASE WHEN ((COALESCE(bdt.taxid, 'ninguno'::character varying))::text = 'ninguno'::text) THEN '-'::character varying ELSE bdt.taxid END AS taxid, cy.iso_code AS currencytax, po.documentno, f.description, f.amtacctcr, f.amtacctdr, f.fact_acct_id, f.isclosedocument, f.isopendocument FROM (((((((SELECT f.c_period_id, f.ad_client_id, f.ad_org_id, f.fact_id, CASE WHEN (f.line_id > (0)::numeric) THEN (SELECT c_allocationline.c_payment_id FROM c_allocationline WHERE (c_allocationline.c_allocationline_id = f.line_id)) ELSE NULL::numeric END AS c_payment_id, f.dateacct, f.datetrx, f.description, f.c_bpartner_id, f.c_currency_id, f.amtacctcr, f.amtacctdr, f.record_id, f.fact_acct_id, f.isclosedocument, f.isopendocument FROM (fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) WHERE ((((ev.isbankaccount = 'Y'::bpchar) AND (NOT (f.account_id IN (SELECT gl.account_id FROM gl_distributionline gl)))) AND (f.ad_table_id = (735)::numeric)) AND ((COALESCE(f.isopendocument, 'N'::character varying))::bpchar = 'N'::bpchar))) f JOIN c_currency cy ON ((f.c_currency_id = cy.c_currency_id))) JOIN c_bpartner bp ON ((f.c_bpartner_id = bp.c_bpartner_id))) JOIN c_bp_doctype bdt ON ((bp.c_bp_doctype_id = bdt.c_bp_doctype_id))) LEFT JOIN c_payment po ON ((f.c_payment_id = po.c_payment_id))) LEFT JOIN c_bankaccount bac ON ((po.c_bankaccount_id = bac.c_bankaccount_id))) LEFT JOIN c_bank bk ON ((bac.c_bank_id = bk.c_bank_id)))) x ORDER BY x.datetrx, CASE WHEN ((rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC))::integer >= 10) THEN (((x.fact_id)::text || '-'::text) || rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC)) ELSE (((x.fact_id)::text || '-0'::text) || rank() OVER (PARTITION BY x.fact_id ORDER BY x.fact_acct_id DESC)) END;");
	return sb.toString();
}
}
