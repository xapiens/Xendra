package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0307book 
{
 
@XendraTable(Name="GL_0307Book",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="GL_0307Book",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.accounting",Identifier="77c4fb36-da4d-49c1-92e6-350874b71d55",
Synchronized="2020-03-03 21:37:52.0")
/** TableName=GL_0307Book */
public static final String Table_Name="GL_0307Book";

@XendraTrl(Identifier="f4ecda9f-5242-4f3f-9e4d-d8078c77e6e3")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4ecda9f-5242-4f3f-9e4d-d8078c77e6e3",
Synchronized="2020-03-03 21:37:52.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="f2e9fdce-d36f-463e-b82d-465778358189")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2e9fdce-d36f-463e-b82d-465778358189",
Synchronized="2020-03-03 21:37:52.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="5ceea7db-aebf-4a5c-9d7a-869a3892e8c0")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ceea7db-aebf-4a5c-9d7a-869a3892e8c0",
Synchronized="2020-03-03 21:37:52.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="18ed4e16-fb1f-4c19-bbea-ecbec4fe336a")
public static String es_PE_COLUMN_namep_Name="namep";

@XendraColumn(AD_Element_ID="e3c4a389-489d-4323-9760-9d6b2ff3ce4d",ColumnName="namep",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18ed4e16-fb1f-4c19-bbea-ecbec4fe336a",
Synchronized="2020-03-03 21:37:52.0")
/** Column name namep */
public static final String COLUMNNAME_namep = "namep";

@XendraTrl(Identifier="c3255050-4851-4204-b4f5-640ca4cc2ddd")
public static String es_PE_COLUMN_ProductTypeTax_Name="ProductTypeTax";

@XendraColumn(AD_Element_ID="dbf5fbd7-d810-ec01-47e7-164e98fcc42c",ColumnName="ProductTypeTax",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c3255050-4851-4204-b4f5-640ca4cc2ddd",
Synchronized="2020-03-03 21:37:52.0")
/** Column name ProductTypeTax */
public static final String COLUMNNAME_ProductTypeTax = "ProductTypeTax";

@XendraTrl(Identifier="8a730e61-6083-4bd4-94b3-f3897eb72036")
public static String es_PE_COLUMN_Qty_Name="Quantity";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a730e61-6083-4bd4-94b3-f3897eb72036",
Synchronized="2020-03-03 21:37:52.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";

@XendraTrl(Identifier="6d9bc862-3b16-4055-a3e9-45dcb3049e09")
public static String es_PE_COLUMN_um_Name="um";

@XendraColumn(AD_Element_ID="f0b199bb-73c4-4c8b-af01-83f95f63ca6a",ColumnName="um",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d9bc862-3b16-4055-a3e9-45dcb3049e09",
Synchronized="2020-03-03 21:37:52.0")
/** Column name um */
public static final String COLUMNNAME_um = "um";

@XendraTrl(Identifier="3f22fc67-d51b-4bfa-9e95-d8680ac202d5")
public static String es_PE_COLUMN_valuep_Name="valuep";

@XendraColumn(AD_Element_ID="22e6242c-0e9f-4786-a244-c8fd143e7032",ColumnName="valuep",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f22fc67-d51b-4bfa-9e95-d8680ac202d5",
Synchronized="2020-03-03 21:37:52.0")
/** Column name valuep */
public static final String COLUMNNAME_valuep = "valuep";
	@XendraView(Identifier="c5bee6d1-7c4e-44b9-a8eb-b555b44f55ed",
Synchronized="2016-10-08 14:04:03.0",
Name="gl_0307book",
Owner="xendra",
Extension="")
	public static final String Identifier = "c5bee6d1-7c4e-44b9-a8eb-b555b44f55ed";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:03.0");
	sb.appendln("@Identifier=c5bee6d1-7c4e-44b9-a8eb-b555b44f55ed");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT pr.value AS valuep, (SELECT \"left\"((reftrl.description)::text, 2) AS \"left\" FROM (ad_ref_list_trl reftrl JOIN ad_ref_list refl ON ((reftrl.ad_ref_list_id = refl.ad_ref_list_id))) WHERE ((refl.ad_reference_id = (1000024)::numeric) AND (pr.producttypetax = (refl.value)::bpchar))) AS producttypetax, pr.name AS namep, uom.x12de355 AS um, f.amtacctdr, f.amtacctcr, f.dateacct, f.ad_client_id, f.ad_org_id, f.qty FROM ((((((fact_acct f JOIN c_period p ON ((f.c_period_id = p.c_period_id))) JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) JOIN c_acctschema acc ON ((f.c_acctschema_id = acc.c_acctschema_id))) JOIN m_product pr ON ((f.m_product_id = pr.m_product_id))) JOIN c_uom uom ON ((pr.c_uom_id = uom.c_uom_id))) JOIN m_costelement ce ON ((ce.m_costelement_id = acc.m_costelement_id))) WHERE ((\"left\"((ev.value)::text, 2) = '20'::text) OR (\"left\"((ev.value)::text, 2) = '21'::text));");
	return sb.toString();
}
}
