package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0311book 
{
 
@XendraTable(Name="GL_0311Book",Description="",Help="",TableName="GL_0311Book",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="6d1f9faf-e2b9-4733-b919-b49c199fc059",Synchronized="2017-08-16 12:37:22.0")
/** TableName=GL_0311Book */
public static final String Table_Name="GL_0311Book";

@XendraTrl(Identifier="6e6520f1-1d77-415f-a48e-bac348a8567a")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e6520f1-1d77-415f-a48e-bac348a8567a",
Synchronized="2017-08-16 12:37:21.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="04163adb-89e0-4c7d-8319-b46a743e7467")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04163adb-89e0-4c7d-8319-b46a743e7467",
Synchronized="2017-08-16 12:37:21.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="f823b415-f414-4fa2-87cd-2c6b0bcf9f53")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f823b415-f414-4fa2-87cd-2c6b0bcf9f53",
Synchronized="2017-08-16 12:37:22.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="7954cf73-13c3-4572-9769-e94a01a022d6")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7954cf73-13c3-4572-9769-e94a01a022d6",
Synchronized="2017-08-16 12:37:22.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="d02771cf-7043-45eb-963e-1d4cab5e48a3")
public static String es_PE_COLUMN_nameacct_Name="nameacct";

@XendraColumn(AD_Element_ID="685af745-82ee-4361-b373-91e48892eecb",ColumnName="nameacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d02771cf-7043-45eb-963e-1d4cab5e48a3",
Synchronized="2017-08-16 12:37:22.0")
/** Column name nameacct */
public static final String COLUMNNAME_nameacct = "nameacct";

@XendraTrl(Identifier="d3fa66d1-cb03-4675-9010-5948dc506618")
public static String es_PE_COLUMN_namebp_Name="namebp";

@XendraColumn(AD_Element_ID="11302dae-f3f0-4609-9093-038db8f22359",ColumnName="namebp",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3fa66d1-cb03-4675-9010-5948dc506618",
Synchronized="2017-08-16 12:37:22.0")
/** Column name namebp */
public static final String COLUMNNAME_namebp = "namebp";

@XendraTrl(Identifier="18728b81-21c5-4c51-8439-7123a1b8c9fe")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18728b81-21c5-4c51-8439-7123a1b8c9fe",
Synchronized="2017-08-16 12:37:22.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="4837a68f-28c7-4f5f-bb1f-6a03e8d48aa7")
public static String es_PE_COLUMN_taxtype_Name="taxtype";

@XendraColumn(AD_Element_ID="876557cf-0410-4f35-b552-92969207c8ce",ColumnName="taxtype",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="4837a68f-28c7-4f5f-bb1f-6a03e8d48aa7",
Synchronized="2017-08-16 12:37:22.0")
/** Column name taxtype */
public static final String COLUMNNAME_taxtype = "taxtype";

@XendraTrl(Identifier="3cf34e3c-e232-4bfa-8006-85eb25e2bd9f")
public static String es_PE_COLUMN_user_Name="user";

@XendraColumn(AD_Element_ID="a2491a52-5000-4e65-a990-c86bc9afbd32",ColumnName="user",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cf34e3c-e232-4bfa-8006-85eb25e2bd9f",
Synchronized="2017-08-16 12:37:22.0")
/** Column name user */
public static final String COLUMNNAME_user = "user";

@XendraTrl(Identifier="5618bc4a-9a21-4c65-b2ab-ceaaba2003aa")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5618bc4a-9a21-4c65-b2ab-ceaaba2003aa",
Synchronized="2017-08-16 12:37:22.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";
	@XendraView(Identifier="ef1ca81f-1efb-4c45-aa63-f7716e15b804",
Synchronized="2016-10-08 14:04:02.0",
Name="gl_0311book",
Owner="xendra",
Extension="")
	public static final String Identifier = "ef1ca81f-1efb-4c45-aa63-f7716e15b804";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:02.0");
	sb.appendln("@Identifier=ef1ca81f-1efb-4c45-aa63-f7716e15b804");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT bp.taxid, bp.name AS namebp, CASE WHEN ((COALESCE(bdt.taxid, 'ninguno'::character varying))::text = 'ninguno'::text) THEN '-'::character varying ELSE bdt.taxid END AS taxtype, ev.value AS valueacct, ev.name AS nameacct, u.name AS \"user\", f.fact_id, f.amtacctcr, f.amtacctdr, f.dateacct, f.ad_client_id, f.ad_org_id FROM ((((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) LEFT JOIN c_bpartner bp ON ((f.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN ad_user u ON ((bp.c_bpartner_id = u.c_bpartner_id))) LEFT JOIN c_bp_doctype bdt ON ((bdt.c_bp_doctype_id = bp.c_bp_doctype_id))) WHERE (((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text) AND (\"left\"((ev.value)::text, 2) = '41'::text));");
	return sb.toString();
}
}
