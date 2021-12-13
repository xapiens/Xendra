package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_candidate_v 
{
 
@XendraTable(Name="C_Invoice_Candidate_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_Invoice_Candidate_v",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="a40bac19-d495-635d-46d4-dadf1b9d8a9f",Synchronized="2020-03-03 21:37:00.0")
/** TableName=C_Invoice_Candidate_v */
public static final String Table_Name="C_Invoice_Candidate_v";

@XendraTrl(Identifier="639997b5-7ba0-675d-f166-eb12bef6ef5b")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="639997b5-7ba0-675d-f166-eb12bef6ef5b",
Synchronized="2020-03-03 21:37:00.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="9874fb60-de9c-67b3-da30-25259c94b50c")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Partner Location";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9874fb60-de9c-67b3-da30-25259c94b50c",Synchronized="2020-03-03 21:37:00.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

@XendraTrl(Identifier="4e03111f-dbdb-7739-4054-e3888abc47b4")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e03111f-dbdb-7739-4054-e3888abc47b4",
Synchronized="2020-03-03 21:37:00.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="d73b92f6-d64b-a09d-b183-9bb473693e47")
public static String es_PE_COLUMN_C_Order_ID_Name="Order";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d73b92f6-d64b-a09d-b183-9bb473693e47",
Synchronized="2020-03-03 21:37:00.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

@XendraTrl(Identifier="208a1df8-b9b1-e715-84bd-253ec5083f7d")
public static String es_PE_COLUMN_DateOrdered_Name="Date Ordered";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="208a1df8-b9b1-e715-84bd-253ec5083f7d",
Synchronized="2020-03-03 21:37:00.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";

@XendraTrl(Identifier="3884473e-f854-9d20-5218-09628bb38017")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3884473e-f854-9d20-5218-09628bb38017",
Synchronized="2020-03-03 21:37:00.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="706d4618-5480-f18f-a973-6b6295b8e1c8")
public static String es_PE_COLUMN_TotalLines_Name="Total Lines";

@XendraColumn(AD_Element_ID="b1a5a695-e900-bbfd-4380-df29c5444a9a",ColumnName="TotalLines",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="706d4618-5480-f18f-a973-6b6295b8e1c8",
Synchronized="2020-03-03 21:37:00.0")
/** Column name TotalLines */
public static final String COLUMNNAME_TotalLines = "TotalLines";
	@XendraView(Identifier="a40bac19-d495-635d-46d4-dadf1b9d8a9f",
Synchronized="2017-10-29 00:02:34.0",
Name="c_invoice_candidate_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "a40bac19-d495-635d-46d4-dadf1b9d8a9f";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-10-29 00:02:34.0");
	sb.appendln("@Identifier=a40bac19-d495-635d-46d4-dadf1b9d8a9f");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT o.ad_client_id, o.ad_org_id, o.c_bpartner_id, o.c_order_id, o.documentno, o.dateordered, o.c_doctype_id, sum(((l.qtyordered - l.qtyinvoiced) * l.priceactual)) AS totallines, o.c_bpartner_location_id FROM (((c_order o JOIN c_orderline l ON ((o.c_order_id = l.c_order_id))) JOIN c_bpartner bp ON ((o.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_invoiceschedule si ON ((bp.c_invoiceschedule_id = si.c_invoiceschedule_id))) WHERE ((((o.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar, 'IP'::bpchar])) AND (o.c_doctype_id IN (SELECT c_doctype.c_doctype_id FROM c_doctype WHERE ((c_doctype.docbasetype = 'SOO'::bpchar) AND ((c_doctype.docsubtype)::bpchar <> ALL (ARRAY['ON'::bpchar, 'OB'::bpchar, 'WR'::bpchar])))))) AND (l.qtyordered <> l.qtyinvoiced)) AND (((((o.invoicerule = 'I'::bpchar) OR (o.invoicerule = 'O'::bpchar)) OR ((o.invoicerule = 'D'::bpchar) AND (l.qtyinvoiced <> l.qtydelivered))) OR ((o.invoicerule = 'S'::bpchar) AND (bp.c_invoiceschedule_id IS NULL))) OR (((o.invoicerule = 'S'::bpchar) AND (bp.c_invoiceschedule_id IS NOT NULL)) AND (((((si.invoicefrequency IS NULL) OR (si.invoicefrequency = 'D'::bpchar)) OR (si.invoicefrequency = 'W'::bpchar)) OR ((si.invoicefrequency = 'T'::bpchar) AND (((trunc(o.dateordered) <= ((firstof(getdate(), 'MM'::character varying) + si.invoicedaycutoff) - 1)) AND (trunc(getdate()) >= ((firstof(o.dateordered, 'MM'::character varying) + si.invoiceday) - 1))) OR ((trunc(o.dateordered) <= ((firstof(getdate(), 'MM'::character varying) + si.invoicedaycutoff) + 14)) AND (trunc(getdate()) >= ((firstof(o.dateordered, 'MM'::character varying) + si.invoiceday) + 14)))))) OR (((si.invoicefrequency = 'M'::bpchar) AND (trunc(o.dateordered) <= ((firstof(getdate(), 'MM'::character varying) + si.invoicedaycutoff) - 1))) AND (trunc(getdate()) >= ((firstof(o.dateordered, 'MM'::character varying) + si.invoiceday) - 1))))))) GROUP BY o.ad_client_id, o.ad_org_id, o.c_bpartner_id, o.c_order_id, o.documentno, o.dateordered, o.c_doctype_id, o.c_bpartner_location_id;");
	return sb.toString();
}
}
