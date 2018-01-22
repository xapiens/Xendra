package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_registrovertical 
{
 
@XendraTable(Name="RV_RegistroVertical",Description="",Help="",TableName="RV_RegistroVertical",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.standard",Identifier="b1ff315f-0e5c-08cc-3e8d-c348a92c2f11",
Synchronized="2017-08-16 12:38:46.0")
/** TableName=RV_RegistroVertical */
public static final String Table_Name="RV_RegistroVertical";

@XendraTrl(Identifier="0a51363c-559b-e907-475f-bbe4ba19f00f")
public static String es_PE_COLUMN_Account_ID_Name="Account";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a51363c-559b-e907-475f-bbe4ba19f00f",
Synchronized="2017-08-16 12:38:46.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";

@XendraTrl(Identifier="b4d54d24-e16e-2934-521a-c2a2981d7e83")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4d54d24-e16e-2934-521a-c2a2981d7e83",
Synchronized="2017-08-16 12:38:46.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

@XendraTrl(Identifier="d670330d-ab76-e431-bf2b-6b9153b8cf32")
public static String es_PE_COLUMN_AmtAcct_Name="Accounted Amount";

@XendraColumn(AD_Element_ID="84de945c-e259-22ed-582d-6c58679cb926",ColumnName="AmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d670330d-ab76-e431-bf2b-6b9153b8cf32",
Synchronized="2017-08-16 12:38:46.0")
/** Column name AmtAcct */
public static final String COLUMNNAME_AmtAcct = "AmtAcct";

@XendraTrl(Identifier="998a8621-7693-1bf0-4ba4-f2f1bfd10470")
public static String es_PE_COLUMN_AmtSource_Name="Source Amount";

@XendraColumn(AD_Element_ID="e7cce4e6-c4ec-a2bc-40ff-4341fcc47ec1",ColumnName="AmtSource",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="998a8621-7693-1bf0-4ba4-f2f1bfd10470",
Synchronized="2017-08-16 12:38:46.0")
/** Column name AmtSource */
public static final String COLUMNNAME_AmtSource = "AmtSource";

@XendraTrl(Identifier="7f2cc369-debd-3f02-4eb7-117b649a957e")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Accounting Schema";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f2cc369-debd-3f02-4eb7-117b649a957e",
Synchronized="2017-08-16 12:38:46.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

@XendraTrl(Identifier="b12d7564-a079-c03f-77b5-8a470698d37f")
public static String es_PE_COLUMN_C_Tax_ID_Name="Tax";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b12d7564-a079-c03f-77b5-8a470698d37f",
Synchronized="2017-08-16 12:38:46.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

@XendraTrl(Identifier="4e597d57-e6f1-9e1b-44aa-c3912c75b52c")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e597d57-e6f1-9e1b-44aa-c3912c75b52c",
Synchronized="2017-08-16 12:38:46.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
	@XendraView(Identifier="b1ff315f-0e5c-08cc-3e8d-c348a92c2f11",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_registrovertical",
Owner="xendra",
Extension="")
	public static final String Identifier = "b1ff315f-0e5c-08cc-3e8d-c348a92c2f11";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=b1ff315f-0e5c-08cc-3e8d-c348a92c2f11");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT f.c_acctschema_id, f.ad_client_id, f.ad_table_id, f.record_id, f.account_id, f.c_tax_id, sum(CASE WHEN (d.issotrx = 'N'::bpchar) THEN f.amtsourcedr ELSE (((-1))::numeric * f.amtsourcecr) END) AS amtsource, sum(CASE WHEN (d.issotrx = 'N'::bpchar) THEN f.amtacctdr ELSE (((-1))::numeric * f.amtacctcr) END) AS amtacct FROM fact_acct f, (c_invoice i JOIN c_doctype d ON ((d.c_doctype_id = i.c_doctype_id))) WHERE ((((f.ad_table_id = (318)::numeric) AND (i.c_invoice_id = f.record_id)) AND (i.c_doctype_id IN (SELECT l.c_doctype_id FROM c_docgroupline l WHERE (l.c_docgroup_id = (1000025)::numeric)))) AND (f.c_acctschema_id = (1000014)::numeric)) GROUP BY f.ad_client_id, f.ad_table_id, f.record_id, f.account_id, f.c_acctschema_id, f.c_tax_id ORDER BY f.ad_client_id, f.ad_table_id, f.record_id, f.account_id;");
	return sb.toString();
}
}
