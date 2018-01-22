package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_031601book 
{
 
@XendraTable(Name="GL_031601Book",Description="",Help="",TableName="GL_031601Book",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="7ed57e42-d595-4296-bcd1-3ee92dcc4330",Synchronized="2017-08-16 12:37:22.0")
/** TableName=GL_031601Book */
public static final String Table_Name="GL_031601Book";

@XendraTrl(Identifier="08d0e5cf-f1b3-4dc7-9731-c025b56118b0")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08d0e5cf-f1b3-4dc7-9731-c025b56118b0",
Synchronized="2017-08-16 12:37:22.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="27d81269-c7c2-41e7-95a5-33e6ff9f3e61")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27d81269-c7c2-41e7-95a5-33e6ff9f3e61",
Synchronized="2017-08-16 12:37:22.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="f7eb0e4a-5e61-452f-bced-31354621451d")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7eb0e4a-5e61-452f-bced-31354621451d",
Synchronized="2017-08-16 12:37:22.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="90ab9794-e1f1-44dc-9625-39d7b33a0e33")
public static String es_PE_COLUMN_nominal_value_Name="nominal_value";

@XendraColumn(AD_Element_ID="e64fb4d9-9356-463e-bb8d-7994b3fa00b2",ColumnName="nominal_value",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90ab9794-e1f1-44dc-9625-39d7b33a0e33",
Synchronized="2017-08-16 12:37:22.0")
/** Column name nominal_value */
public static final String COLUMNNAME_nominal_value = "nominal_value";

@XendraTrl(Identifier="a55153e0-8533-4032-a274-736fb5f2f236")
public static String es_PE_COLUMN_paid_up_shares_Name="paid_up_shares";

@XendraColumn(AD_Element_ID="3fbbdb2f-d9f4-45ce-a007-1296b40fb87e",ColumnName="paid_up_shares",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a55153e0-8533-4032-a274-736fb5f2f236",
Synchronized="2017-08-16 12:37:22.0")
/** Column name paid_up_shares */
public static final String COLUMNNAME_paid_up_shares = "paid_up_shares";

@XendraTrl(Identifier="0c042fb0-aada-4b5e-a7f1-c5d7785be3c3")
public static String es_PE_COLUMN_shares_Name="shares";

@XendraColumn(AD_Element_ID="6293fb23-729e-4191-8ba0-9cc949724021",ColumnName="shares",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c042fb0-aada-4b5e-a7f1-c5d7785be3c3",
Synchronized="2017-08-16 12:37:22.0")
/** Column name shares */
public static final String COLUMNNAME_shares = "shares";

@XendraTrl(Identifier="0837bd58-7ea3-4ac4-8640-5d46d3dd6c63")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0837bd58-7ea3-4ac4-8640-5d46d3dd6c63",
Synchronized="2017-08-16 12:37:22.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
	@XendraView(Identifier="776059a6-39f2-42de-a975-dcac4101bb94",
Synchronized="2016-10-08 14:04:05.0",
Name="gl_031601book",
Owner="xendra",
Extension="")
	public static final String Identifier = "776059a6-39f2-42de-a975-dcac4101bb94";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:05.0");
	sb.appendln("@Identifier=776059a6-39f2-42de-a975-dcac4101bb94");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("WITH sh AS (SELECT sum(ad_stakeholder.shares) AS shares, max(ad_stakeholder.nominal_value) AS nominal_value, sum(ad_stakeholder.paid_up_shares) AS paid_up_shares FROM ad_stakeholder) SELECT sh.shares, sh.nominal_value, sh.paid_up_shares, ev.value, f.amtacctcr, f.amtacctdr, f.dateacct, f.ad_client_id, f.ad_org_id FROM (fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))), sh WHERE (((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text) AND (\"left\"((ev.value)::text, 2) = '50'::text));");
	return sb.toString();
}
}
