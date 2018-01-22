package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0312book 
{
 
@XendraTable(Name="GL_0312Book",Description="",Help="",TableName="GL_0312Book",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="73ad5a5b-c395-4b54-bcd1-91be19f3f5ae",Synchronized="2017-08-16 12:37:22.0")
/** TableName=GL_0312Book */
public static final String Table_Name="GL_0312Book";

@XendraTrl(Identifier="20b11d9f-ec73-446c-be65-1ebf7b741fc1")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20b11d9f-ec73-446c-be65-1ebf7b741fc1",
Synchronized="2017-08-16 12:37:22.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="41f37df3-130f-48fa-bf19-7aacb22a423f")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41f37df3-130f-48fa-bf19-7aacb22a423f",
Synchronized="2017-08-16 12:37:22.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="fefaa641-171b-40e7-9d17-70604d68b7b5")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fefaa641-171b-40e7-9d17-70604d68b7b5",
Synchronized="2017-08-16 12:37:22.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="7bb8412a-d4d5-42aa-a895-838c92539b20")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bb8412a-d4d5-42aa-a895-838c92539b20",
Synchronized="2017-08-16 12:37:22.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

@XendraTrl(Identifier="0e3d6804-8569-4f25-b760-15314ac6d5cd")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e3d6804-8569-4f25-b760-15314ac6d5cd",
Synchronized="2017-08-16 12:37:22.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="6c9c6dc5-e1d6-46f1-a293-9d807a8e706c")
public static String es_PE_COLUMN_InvoiceDocumentNo_Name="Invoice Document No";

@XendraColumn(AD_Element_ID="8fe4a47f-1637-81de-48d3-f43e7643d57d",ColumnName="InvoiceDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c9c6dc5-e1d6-46f1-a293-9d807a8e706c",
Synchronized="2017-08-16 12:37:22.0")
/** Column name InvoiceDocumentNo */
public static final String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";

@XendraTrl(Identifier="67b91f13-ddca-4065-9b94-c5526de3e579")
public static String es_PE_COLUMN_nameacct_Name="nameacct";

@XendraColumn(AD_Element_ID="685af745-82ee-4361-b373-91e48892eecb",ColumnName="nameacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67b91f13-ddca-4065-9b94-c5526de3e579",
Synchronized="2017-08-16 12:37:22.0")
/** Column name nameacct */
public static final String COLUMNNAME_nameacct = "nameacct";

@XendraTrl(Identifier="e16135fa-3024-4cc9-a6b7-986f9a29b09c")
public static String es_PE_COLUMN_namebp_Name="namebp";

@XendraColumn(AD_Element_ID="11302dae-f3f0-4609-9093-038db8f22359",ColumnName="namebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e16135fa-3024-4cc9-a6b7-986f9a29b09c",
Synchronized="2017-08-16 12:37:22.0")
/** Column name namebp */
public static final String COLUMNNAME_namebp = "namebp";

@XendraTrl(Identifier="75ce776e-b9c1-425f-8eed-7e2f31fd056f")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75ce776e-b9c1-425f-8eed-7e2f31fd056f",
Synchronized="2017-08-16 12:37:22.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";

@XendraTrl(Identifier="493908b7-ab0a-47fc-80c9-394368f5b101")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="493908b7-ab0a-47fc-80c9-394368f5b101",
Synchronized="2017-08-16 12:37:22.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="769f6998-ebe6-4f31-9a90-54dd45eb610b")
public static String es_PE_COLUMN_taxtype_Name="taxtype";

@XendraColumn(AD_Element_ID="876557cf-0410-4f35-b552-92969207c8ce",ColumnName="taxtype",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="769f6998-ebe6-4f31-9a90-54dd45eb610b",
Synchronized="2017-08-16 12:37:22.0")
/** Column name taxtype */
public static final String COLUMNNAME_taxtype = "taxtype";

@XendraTrl(Identifier="e303ccde-54b9-49a9-906a-93c71d52c2af")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e303ccde-54b9-49a9-906a-93c71d52c2af",
Synchronized="2017-08-16 12:37:22.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";
	@XendraView(Identifier="afeb586d-ccf5-4171-9bd1-8e2c411900f1",
Synchronized="2016-10-08 14:04:04.0",
Name="gl_0312book",
Owner="xendra",
Extension="")
	public static final String Identifier = "afeb586d-ccf5-4171-9bd1-8e2c411900f1";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:04.0");
	sb.appendln("@Identifier=afeb586d-ccf5-4171-9bd1-8e2c411900f1");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT CASE WHEN ((COALESCE(bdt.taxid, 'ninguno'::character varying))::text = 'ninguno'::text) THEN '-'::character varying ELSE bdt.taxid END AS taxtype, bp.taxid, bp.name AS namebp, f.serial, f.invoicedocumentno, f.fact_id, f.datetrx, ev.value AS valueacct, ev.name AS nameacct, f.amtacctcr, f.amtacctdr, f.dateacct, f.ad_client_id, f.ad_org_id FROM (((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) LEFT JOIN c_bpartner bp ON ((f.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_bp_doctype bdt ON ((bp.c_bp_doctype_id = bdt.c_bp_doctype_id))) WHERE (((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text) AND ((\"left\"((ev.value)::text, 2) = '42'::text) OR (\"left\"((ev.value)::text, 2) = '43'::text)));");
	return sb.toString();
}
}
