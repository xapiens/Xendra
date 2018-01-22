package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0303book 
{
 
@XendraTable(Name="GL_0303Book",Description="",Help="",TableName="GL_0303Book",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="c4150ac2-44d2-4fbe-86f9-747300e569f3",Synchronized="2017-08-16 12:37:21.0")
/** TableName=GL_0303Book */
public static final String Table_Name="GL_0303Book";

@XendraTrl(Identifier="4eb1c785-f0ca-4f5f-942e-4bd8f687f896")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4eb1c785-f0ca-4f5f-942e-4bd8f687f896",
Synchronized="2017-08-26 19:41:52.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="22bc2b48-bda8-4ae0-9904-4a9beac6f035")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22bc2b48-bda8-4ae0-9904-4a9beac6f035",
Synchronized="2017-08-26 19:41:52.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="f0b43d95-8683-4aa0-884d-e827a28e24bf")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0b43d95-8683-4aa0-884d-e827a28e24bf",
Synchronized="2017-08-26 19:41:52.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="f67d5679-3df1-4a1e-92ca-4b4fd1ce9147")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f67d5679-3df1-4a1e-92ca-4b4fd1ce9147",
Synchronized="2017-08-26 19:41:52.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="f86a38da-f432-46df-a194-51df546fc89f")
public static String es_PE_COLUMN_InvoiceDocumentNo_Name="Invoice Document No";

@XendraColumn(AD_Element_ID="8fe4a47f-1637-81de-48d3-f43e7643d57d",ColumnName="InvoiceDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f86a38da-f432-46df-a194-51df546fc89f",
Synchronized="2017-08-26 19:41:52.0")
/** Column name InvoiceDocumentNo */
public static final String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";

@XendraTrl(Identifier="aabc46a2-999b-4aaf-97e0-932004e9c1bb")
public static String es_PE_COLUMN_nameacct_Name="nameacct";

@XendraColumn(AD_Element_ID="685af745-82ee-4361-b373-91e48892eecb",ColumnName="nameacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aabc46a2-999b-4aaf-97e0-932004e9c1bb",
Synchronized="2017-08-26 19:41:52.0")
/** Column name nameacct */
public static final String COLUMNNAME_nameacct = "nameacct";

@XendraTrl(Identifier="71cc93c7-472b-4564-9c8c-8962a4dd8e9b")
public static String es_PE_COLUMN_namebp_Name="namebp";

@XendraColumn(AD_Element_ID="11302dae-f3f0-4609-9093-038db8f22359",ColumnName="namebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71cc93c7-472b-4564-9c8c-8962a4dd8e9b",
Synchronized="2017-08-26 19:41:52.0")
/** Column name namebp */
public static final String COLUMNNAME_namebp = "namebp";

@XendraTrl(Identifier="5078ddd1-95c7-4b86-a019-3c97782d4945")
public static String es_PE_COLUMN_serie_Name="serie";

@XendraColumn(AD_Element_ID="7cd56408-06e9-44d8-91de-331f9d818502",ColumnName="serie",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5078ddd1-95c7-4b86-a019-3c97782d4945",
Synchronized="2017-08-26 19:41:52.0")
/** Column name serie */
public static final String COLUMNNAME_serie = "serie";

@XendraTrl(Identifier="ab9d63c2-396a-4b59-9207-4d0d8471b8d0")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab9d63c2-396a-4b59-9207-4d0d8471b8d0",
Synchronized="2017-08-26 19:41:52.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="9a288021-7dfc-46b0-864b-1d169ba2c986")
public static String es_PE_COLUMN_taxtype_Name="taxtype";

@XendraColumn(AD_Element_ID="876557cf-0410-4f35-b552-92969207c8ce",ColumnName="taxtype",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a288021-7dfc-46b0-864b-1d169ba2c986",
Synchronized="2017-08-26 19:41:52.0")
/** Column name taxtype */
public static final String COLUMNNAME_taxtype = "taxtype";

@XendraTrl(Identifier="79caf3a6-fc77-4a9a-b2ec-ed212aa5e514")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79caf3a6-fc77-4a9a-b2ec-ed212aa5e514",
Synchronized="2017-08-26 19:41:52.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";
	@XendraView(Identifier="db205610-4d8a-44c5-9115-fbf774fa4a45",
Synchronized="2016-10-08 14:04:03.0",
Name="gl_0303book",
Owner="xendra",
Extension="")
	public static final String Identifier = "db205610-4d8a-44c5-9115-fbf774fa4a45";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:03.0");
	sb.appendln("@Identifier=db205610-4d8a-44c5-9115-fbf774fa4a45");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT ev.value AS valueacct, ev.name AS nameacct, CASE WHEN ((COALESCE(bdt.taxid, 'ninguno'::character varying))::text = 'ninguno'::text) THEN '-'::character varying ELSE bdt.taxid END AS taxtype, bp.taxid, bp.name AS namebp, f.serial AS serie, f.invoicedocumentno, f.fact_id, f.dateacct, f.amtacctdr, f.amtacctcr, f.ad_client_id, f.ad_org_id FROM (((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) LEFT JOIN c_bpartner bp ON ((f.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_bp_doctype bdt ON ((bp.c_bp_doctype_id = bdt.c_bp_doctype_id))) WHERE (((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text) AND ((\"left\"((ev.value)::text, 2) = '12'::text) OR (\"left\"((ev.value)::text, 2) = '13'::text)));");
	return sb.toString();
}
}
