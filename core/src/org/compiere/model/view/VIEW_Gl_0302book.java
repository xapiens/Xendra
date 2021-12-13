package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0302book 
{
 
@XendraTable(Name="GL_0302Book",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="GL_0302Book",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.accounting",Identifier="d6c6fc86-1c87-4eb9-9d78-25ccdb7555e1",
Synchronized="2020-03-03 21:37:51.0")
/** TableName=GL_0302Book */
public static final String Table_Name="GL_0302Book";

@XendraTrl(Identifier="5a3a0d55-b313-4d90-8847-2ff3635e4355")
public static String es_PE_COLUMN_AccountNo_Name="Account No";

@XendraColumn(AD_Element_ID="f476cad1-331f-9d18-a8b7-c03b172f9997",ColumnName="AccountNo",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5a3a0d55-b313-4d90-8847-2ff3635e4355",
Synchronized="2020-03-03 21:37:51.0")
/** Column name AccountNo */
public static final String COLUMNNAME_AccountNo = "AccountNo";

@XendraTrl(Identifier="0f00d8ae-0517-4457-a975-53b6762682d0")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f00d8ae-0517-4457-a975-53b6762682d0",
Synchronized="2020-03-03 21:37:51.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="8ced780e-be49-48cd-9542-c2bb394f22d4")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ced780e-be49-48cd-9542-c2bb394f22d4",
Synchronized="2020-03-03 21:37:51.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="c27a91c7-2228-486e-871e-6a94a93c7b7e")
public static String es_PE_COLUMN_banktax_Name="banktax";

@XendraColumn(AD_Element_ID="e03be634-04fc-4f4b-a4c3-dbec07858727",ColumnName="banktax",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c27a91c7-2228-486e-871e-6a94a93c7b7e",
Synchronized="2020-03-03 21:37:51.0")
/** Column name banktax */
public static final String COLUMNNAME_banktax = "banktax";

@XendraTrl(Identifier="e60a5dca-eb47-4e75-97b3-e37768ce102a")
public static String es_PE_COLUMN_currencytax_Name="currencytax";

@XendraColumn(AD_Element_ID="5ea90938-d642-4ff7-8d88-7ce7acdaa02d",ColumnName="currencytax",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e60a5dca-eb47-4e75-97b3-e37768ce102a",
Synchronized="2020-03-03 21:37:51.0")
/** Column name currencytax */
public static final String COLUMNNAME_currencytax = "currencytax";

@XendraTrl(Identifier="947ea6a0-44a0-4820-87b2-7fd0ce19c47b")
public static String es_PE_COLUMN_CurSymbol_Name="Symbol";

@XendraColumn(AD_Element_ID="a6544ce7-4bd1-7f2a-84da-823b8e61f86e",ColumnName="CurSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="947ea6a0-44a0-4820-87b2-7fd0ce19c47b",
Synchronized="2020-03-03 21:37:51.0")
/** Column name CurSymbol */
public static final String COLUMNNAME_CurSymbol = "CurSymbol";

@XendraTrl(Identifier="faedd03c-2348-4abb-9a8e-da494d4cbf10")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="faedd03c-2348-4abb-9a8e-da494d4cbf10",
Synchronized="2020-03-03 21:37:51.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="f46cd7a8-8ac5-4554-a3d5-d5bba2e66a0e")
public static String es_PE_COLUMN_namebank_Name="namebank";

@XendraColumn(AD_Element_ID="174fd2c0-8ed0-43cc-b6e4-ab09983dc5db",ColumnName="namebank",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f46cd7a8-8ac5-4554-a3d5-d5bba2e66a0e",
Synchronized="2020-03-03 21:37:51.0")
/** Column name namebank */
public static final String COLUMNNAME_namebank = "namebank";

@XendraTrl(Identifier="ebe1e6ab-6f51-4e68-8b12-62399f4f1911")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ebe1e6ab-6f51-4e68-8b12-62399f4f1911",
Synchronized="2020-03-03 21:37:51.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";
	@XendraView(Identifier="ca35c383-c4b0-4e32-9e10-c65830a4c283",
Synchronized="2016-10-08 14:04:02.0",
Name="gl_0302book",
Owner="xendra",
Extension="")
	public static final String Identifier = "ca35c383-c4b0-4e32-9e10-c65830a4c283";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:02.0");
	sb.appendln("@Identifier=ca35c383-c4b0-4e32-9e10-c65830a4c283");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT z.ad_client_id, z.ad_org_id, z.dateacct, z.valueacct, CASE WHEN ((COALESCE(z.banktax, ''::character varying))::text = ''::text) THEN '99'::character varying ELSE z.banktax END AS banktax, z.namebank, CASE WHEN (((z.banktax)::text = '99'::text) OR ((COALESCE(z.accountno, ''::character varying))::text = ''::text)) THEN '-'::character varying ELSE z.accountno END AS accountno, z.currencytax, z.cursymbol, z.amtacctdr, z.amtacctcr FROM (SELECT f.ad_client_id, f.dateacct, f.ad_org_id, ev.value AS valueacct, ev.name AS nameacct, bk.routingno AS banktax, bk.name AS namebank, ba.accountno, cy.iso_code AS currencytax, cy.cursymbol, f.amtacctdr, f.amtacctcr FROM ((((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) LEFT JOIN c_bankaccount ba ON ((ev.c_bankaccount_id = ba.c_bankaccount_id))) LEFT JOIN c_bank bk ON ((ba.c_bank_id = bk.c_bank_id))) JOIN c_currency cy ON ((ba.c_currency_id = cy.c_currency_id))) WHERE ((\"left\"((ev.value)::text, 2) = '10'::text) AND ((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text)) UNION ALL SELECT f.ad_client_id, f.dateacct, f.ad_org_id, ev.value AS valueacct, ev.name AS nameacct, ''::character varying AS banktax, ''::character varying AS namebank, ''::character varying AS accountno, cy.iso_code AS currencytax, cy.cursymbol, f.amtacctdr, f.amtacctcr FROM ((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) JOIN c_currency cy ON ((f.c_currency_id = cy.c_currency_id))) WHERE (((\"left\"((ev.value)::text, 2) = '10'::text) AND (COALESCE(ev.c_bankaccount_id, (0)::numeric) = (0)::numeric)) AND ((COALESCE(f.isclosedocument, 'N'::character varying))::text = 'N'::text))) z;");
	return sb.toString();
}
}
