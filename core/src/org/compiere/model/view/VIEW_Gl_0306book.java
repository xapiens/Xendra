package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0306book 
{
 
@XendraTable(Name="GL_0306Book",Description="",Help="",TableName="GL_0306Book",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="d6de27e3-bccb-4878-9812-49d4574e57eb",Synchronized="2017-08-16 12:37:21.0")
/** TableName=GL_0306Book */
public static final String Table_Name="GL_0306Book";

@XendraTrl(Identifier="ee6720a9-d39b-4875-8214-c2458ce05a2f")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee6720a9-d39b-4875-8214-c2458ce05a2f",
Synchronized="2017-08-16 12:37:21.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="7df30291-37c4-4ad4-bc12-41f32e4a2c8b")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7df30291-37c4-4ad4-bc12-41f32e4a2c8b",
Synchronized="2017-08-16 12:37:21.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="418eebc7-dbf9-4f4f-9fcb-27c6c2d82777")
public static String es_PE_COLUMN_CodSunat_Name="Sunat Document Code";

@XendraColumn(AD_Element_ID="84884f14-1f72-b5d2-c38f-d807ef550fd4",ColumnName="CodSunat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="418eebc7-dbf9-4f4f-9fcb-27c6c2d82777",
Synchronized="2017-08-16 12:37:21.0")
/** Column name CodSunat */
public static final String COLUMNNAME_CodSunat = "CodSunat";

@XendraTrl(Identifier="648c99d8-e313-4d4e-8803-978c41846a2f")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="648c99d8-e313-4d4e-8803-978c41846a2f",
Synchronized="2017-08-16 12:37:21.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="ec4b6d6c-2d48-4c5e-a9fa-0b91b5ad284c")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec4b6d6c-2d48-4c5e-a9fa-0b91b5ad284c",
Synchronized="2017-08-16 12:37:21.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

@XendraTrl(Identifier="960606b2-4ca4-4415-a50c-eaa0c509a380")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="960606b2-4ca4-4415-a50c-eaa0c509a380",
Synchronized="2017-08-16 12:37:21.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="0ab0760a-66e6-41d0-9284-ffe779906011")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ab0760a-66e6-41d0-9284-ffe779906011",
Synchronized="2017-08-16 12:37:21.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="638ce182-eccb-43ee-b46c-cd95ee384028")
public static String es_PE_COLUMN_InvoiceDocumentNo_Name="Invoice Document No";

@XendraColumn(AD_Element_ID="8fe4a47f-1637-81de-48d3-f43e7643d57d",ColumnName="InvoiceDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="638ce182-eccb-43ee-b46c-cd95ee384028",
Synchronized="2017-08-16 12:37:21.0")
/** Column name InvoiceDocumentNo */
public static final String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";

@XendraTrl(Identifier="daa11a70-4214-43a3-bc84-7330dfe8526c")
public static String es_PE_COLUMN_namebp_Name="namebp";

@XendraColumn(AD_Element_ID="11302dae-f3f0-4609-9093-038db8f22359",ColumnName="namebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="daa11a70-4214-43a3-bc84-7330dfe8526c",
Synchronized="2017-08-16 12:37:21.0")
/** Column name namebp */
public static final String COLUMNNAME_namebp = "namebp";

@XendraTrl(Identifier="8da0bcf0-35e3-4925-a7ad-79a7d1b16c8e")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8da0bcf0-35e3-4925-a7ad-79a7d1b16c8e",
Synchronized="2017-08-16 12:37:21.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";

@XendraTrl(Identifier="8fb36b2b-4479-41d4-927b-47140d4b1030")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fb36b2b-4479-41d4-927b-47140d4b1030",
Synchronized="2017-08-16 12:37:21.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="955949eb-2444-48e4-acf6-e4a3943cea16")
public static String es_PE_COLUMN_taxtype_Name="taxtype";

@XendraColumn(AD_Element_ID="876557cf-0410-4f35-b552-92969207c8ce",ColumnName="taxtype",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="955949eb-2444-48e4-acf6-e4a3943cea16",
Synchronized="2017-08-16 12:37:21.0")
/** Column name taxtype */
public static final String COLUMNNAME_taxtype = "taxtype";
	@XendraView(Identifier="9456b01b-33a8-43c6-9e3f-ff7de785fcc9",
Synchronized="2016-10-08 14:04:03.0",
Name="gl_0306book",
Owner="xendra",
Extension="")
	public static final String Identifier = "9456b01b-33a8-43c6-9e3f-ff7de785fcc9";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:03.0");
	sb.appendln("@Identifier=9456b01b-33a8-43c6-9e3f-ff7de785fcc9");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT CASE WHEN ((COALESCE(bdt.taxid, 'ninguno'::character varying))::text = 'ninguno'::text) THEN '-'::character varying ELSE bdt.taxid END AS taxtype, f.description, bp.taxid, bp.name AS namebp, f.serial, f.invoicedocumentno, f.fact_id, f.datetrx, f.dateacct, f.amtacctdr, f.amtacctcr, f.ad_client_id, f.ad_org_id, dt.codsunat FROM ((((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) LEFT JOIN c_bpartner bp ON ((f.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_doctype dt ON ((f.c_doctype_id = dt.c_doctype_id))) LEFT JOIN c_bp_doctype bdt ON ((bp.c_bp_doctype_id = bdt.c_bp_doctype_id))) WHERE (((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text) AND (\"left\"((ev.value)::text, 2) = '19'::text));");
	return sb.toString();
}
}
