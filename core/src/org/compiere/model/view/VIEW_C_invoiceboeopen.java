package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoiceboeopen 
{
 
@XendraTable(Name="c_invoiceboeopen",Description="",Help="",TableName="c_invoiceboeopen",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.standard",Identifier="119566fd-c813-40b9-8329-8dd1419c6342",
Synchronized="2017-08-16 12:36:36.0")
/** TableName=c_invoiceboeopen */
public static final String Table_Name="c_invoiceboeopen";

@XendraTrl(Identifier="851c4286-1e77-493c-98ea-5a7cc08a16df")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="851c4286-1e77-493c-98ea-5a7cc08a16df",
Synchronized="2017-08-26 19:41:28.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="634ee05c-6715-48ef-b4d5-b4916a281512")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="634ee05c-6715-48ef-b4d5-b4916a281512",
Synchronized="2017-08-26 19:41:28.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="ae83ecb9-16ab-4da8-8393-430ce18d105b")
public static String es_PE_COLUMN_Date1_Name="Date";

@XendraColumn(AD_Element_ID="bbe87c53-3cd6-1b96-3321-4d4a08dc298e",ColumnName="Date1",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae83ecb9-16ab-4da8-8393-430ce18d105b",
Synchronized="2017-08-26 19:41:29.0")
/** Column name Date1 */
public static final String COLUMNNAME_Date1 = "Date1";

@XendraTrl(Identifier="9b70c11b-fc08-42ae-b09d-90fe78e88bae")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b70c11b-fc08-42ae-b09d-90fe78e88bae",
Synchronized="2017-08-26 19:41:29.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="cdb73b0b-65e3-4d1b-a93e-3cce16c6bbc7")
public static String es_PE_COLUMN_DueDate_Name="Due Date";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cdb73b0b-65e3-4d1b-a93e-3cce16c6bbc7",
Synchronized="2017-08-26 19:41:29.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";

@XendraTrl(Identifier="056e4ad4-e9b8-4e45-bf1c-13bc51266ef7")
public static String es_PE_COLUMN_dueday_Name="dueday";

@XendraColumn(AD_Element_ID="230eecee-d580-447b-97f6-c4e0b26e412e",ColumnName="dueday",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="056e4ad4-e9b8-4e45-bf1c-13bc51266ef7",
Synchronized="2017-08-26 19:41:29.0")
/** Column name dueday */
public static final String COLUMNNAME_dueday = "dueday";

@XendraTrl(Identifier="f91c6d0b-0888-41f2-ac19-a5c5b42e9355")
public static String es_PE_COLUMN_GrandTotal_Name="Grand Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f91c6d0b-0888-41f2-ac19-a5c5b42e9355",
Synchronized="2017-08-26 19:41:29.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";

@XendraTrl(Identifier="2500ee1e-9f98-4d6f-b23f-ed674ed36895")
public static String es_PE_COLUMN_IsSOTrx_Name="Sales Transaction";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2500ee1e-9f98-4d6f-b23f-ed674ed36895",
Synchronized="2017-08-26 19:41:29.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

@XendraTrl(Identifier="73be2feb-c996-4423-b924-79367109301f")
public static String es_PE_COLUMN_open_Name="open";

@XendraColumn(AD_Element_ID="14e8b251-fee8-44f8-8e42-eb13e60085fe",ColumnName="open",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73be2feb-c996-4423-b924-79367109301f",
Synchronized="2017-08-26 19:41:29.0")
/** Column name open */
public static final String COLUMNNAME_open = "open";

@XendraTrl(Identifier="2a8aa620-ae4b-4e84-892e-b9d3a0789c15")
public static String es_PE_COLUMN_SalesRep_ID_Name="Sales Representative";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2a8aa620-ae4b-4e84-892e-b9d3a0789c15",Synchronized="2017-08-26 19:41:29.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

@XendraTrl(Identifier="8ba25d2d-3c0e-477d-ac1a-6392a91c61a6")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ba25d2d-3c0e-477d-ac1a-6392a91c61a6",
Synchronized="2017-08-26 19:41:29.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
	@XendraView(Identifier="e2245d9e-9c92-1ff2-6c74-ce5346054dbd",
Synchronized="2013-07-24 17:58:18.0",
Name="c_invoiceboeopen",
Owner="xendra",
Extension="")
	public static final String Identifier = "e2245d9e-9c92-1ff2-6c74-ce5346054dbd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-24 17:58:18.0");
	sb.appendln("@Identifier=e2245d9e-9c92-1ff2-6c74-ce5346054dbd");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.dateinvoiced AS date1, i.c_bpartner_id, bp.taxid, i.documentno, i.grandtotal, bp.salesrep_id, i.issotrx, invoiceopen(i.c_invoice_id, NULL::numeric) AS open, i.c_doctype_id, (i.dateinvoiced + t.netdays) AS duedate, date_diff(('now'::text)::date, (i.dateinvoiced + t.netdays)) AS dueday FROM ((c_invoice i JOIN c_bpartner bp ON ((bp.c_bpartner_id = i.c_bpartner_id))) JOIN c_paymentterm t ON ((t.c_paymentterm_id = i.c_paymentterm_id))) WHERE ((i.ispaid = 'N'::bpchar) AND (NOT (invoiceopen(i.c_invoice_id, NULL::numeric) = (0)::numeric))) UNION SELECT b.ad_client_id, b.ad_org_id, b.dateboe AS date1, b.c_bpartner_id, bp.taxid, b.documentno, b.grandtotal, bp.salesrep_id, b.issotrx, boeopen(b.c_boe_id) AS open, b.c_doctype_id, b.duedate, date_diff(('now'::text)::date, (b.duedate)::date) AS dueday FROM (c_boe b JOIN c_bpartner bp ON ((bp.c_bpartner_id = b.c_bpartner_id))) WHERE ((b.ispaid = 'N'::bpchar) AND (NOT (boeopen(b.c_boe_id) = (0)::numeric)));");
	return sb.toString();
}
}
