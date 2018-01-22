package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0308book 
{
 
@XendraTable(Name="GL_0308Book",Description="",Help="",TableName="GL_0308Book",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="0609f171-faf3-4a79-ae0c-348e6a26c42a",Synchronized="2017-08-16 12:37:21.0")
/** TableName=GL_0308Book */
public static final String Table_Name="GL_0308Book";

@XendraTrl(Identifier="c79459d9-b6f5-4ba9-9dee-a7eee4602768")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c79459d9-b6f5-4ba9-9dee-a7eee4602768",
Synchronized="2017-08-16 12:37:21.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="a362505b-60ad-4830-9afc-02e471571d1a")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a362505b-60ad-4830-9afc-02e471571d1a",
Synchronized="2017-08-16 12:37:21.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="2f289210-e7d9-448f-84a4-cad7c1abac80")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f289210-e7d9-448f-84a4-cad7c1abac80",
Synchronized="2017-08-16 12:37:21.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="d04cb251-0138-480c-a6aa-fd6dc7ff42d9")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d04cb251-0138-480c-a6aa-fd6dc7ff42d9",
Synchronized="2017-08-16 12:37:21.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="c3139936-a5d9-4eee-864f-56c091548a75")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3139936-a5d9-4eee-864f-56c091548a75",
Synchronized="2017-08-16 12:37:21.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="f67eb31c-f5e7-48aa-bc43-8c2bc84dc9bd")
public static String es_PE_COLUMN_nameacct_Name="nameacct";

@XendraColumn(AD_Element_ID="685af745-82ee-4361-b373-91e48892eecb",ColumnName="nameacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f67eb31c-f5e7-48aa-bc43-8c2bc84dc9bd",
Synchronized="2017-08-16 12:37:21.0")
/** Column name nameacct */
public static final String COLUMNNAME_nameacct = "nameacct";

@XendraTrl(Identifier="b3662311-de58-496a-8df7-8bcc4bc1df7b")
public static String es_PE_COLUMN_namebp_Name="namebp";

@XendraColumn(AD_Element_ID="11302dae-f3f0-4609-9093-038db8f22359",ColumnName="namebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3662311-de58-496a-8df7-8bcc4bc1df7b",
Synchronized="2017-08-16 12:37:21.0")
/** Column name namebp */
public static final String COLUMNNAME_namebp = "namebp";

@XendraTrl(Identifier="a0176325-d45a-4369-8fe8-6529c35d745c")
public static String es_PE_COLUMN_taxtype_Name="taxtype";

@XendraColumn(AD_Element_ID="876557cf-0410-4f35-b552-92969207c8ce",ColumnName="taxtype",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="a0176325-d45a-4369-8fe8-6529c35d745c",
Synchronized="2017-08-16 12:37:21.0")
/** Column name taxtype */
public static final String COLUMNNAME_taxtype = "taxtype";

@XendraTrl(Identifier="3a82fdd6-8e74-4f7f-a411-1dcb537ff664")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a82fdd6-8e74-4f7f-a411-1dcb537ff664",
Synchronized="2017-08-16 12:37:21.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";

@XendraTrl(Identifier="c2fdaf52-9eac-4128-b936-57dc47008bb4")
public static String es_PE_COLUMN_valuebp_Name="valuebp";

@XendraColumn(AD_Element_ID="4d95d0da-cbcd-448e-a8ad-74d983117beb",ColumnName="valuebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2fdaf52-9eac-4128-b936-57dc47008bb4",
Synchronized="2017-08-16 12:37:21.0")
/** Column name valuebp */
public static final String COLUMNNAME_valuebp = "valuebp";
	@XendraView(Identifier="bde9de96-54b4-458a-b320-29f561a29cab",
Synchronized="2016-10-08 14:04:03.0",
Name="gl_0308book",
Owner="xendra",
Extension="")
	public static final String Identifier = "bde9de96-54b4-458a-b320-29f561a29cab";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:03.0");
	sb.appendln("@Identifier=bde9de96-54b4-458a-b320-29f561a29cab");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT CASE WHEN ((COALESCE(bdt.taxid, 'ninguno'::character varying))::text = 'ninguno'::text) THEN '-'::character varying ELSE bdt.taxid END AS taxtype, bp.taxid AS valuebp, bp.name AS namebp, f.description, ev.value AS valueacct, ev.name AS nameacct, f.amtacctdr, f.amtacctcr, f.fact_id, f.dateacct, f.ad_client_id, f.ad_org_id FROM (((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) LEFT JOIN c_bpartner bp ON ((f.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_bp_doctype bdt ON ((bp.c_bp_doctype_id = bdt.c_bp_doctype_id))) WHERE (((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text) AND ((\"left\"((ev.value)::text, 2) = '30'::text) OR (\"left\"((ev.value)::text, 2) = '31'::text)));");
	return sb.toString();
}
}
