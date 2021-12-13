package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inout_candidate_v 
{
 
@XendraTable(Name="M_InOut_Candidate_v",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_InOut_Candidate_v",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.material",
Identifier="cb5bf0d5-02f8-03db-0528-24931bd93831",Synchronized="2020-03-03 21:38:25.0")
/** TableName=M_InOut_Candidate_v */
public static final String Table_Name="M_InOut_Candidate_v";

@XendraTrl(Identifier="3fac5a98-51d6-a96c-288a-dbd1df34f0fb")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fac5a98-51d6-a96c-288a-dbd1df34f0fb",
Synchronized="2020-03-03 21:38:25.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="14a3d0c4-e289-ad5f-f67a-e229d70fe3a9")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Partner Location";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="14a3d0c4-e289-ad5f-f67a-e229d70fe3a9",Synchronized="2020-03-03 21:38:25.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

@XendraTrl(Identifier="1d33fead-2b0f-10ba-fef9-f0935771e6df")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d33fead-2b0f-10ba-fef9-f0935771e6df",
Synchronized="2020-03-03 21:38:25.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="4b57c4a4-23f7-564e-8f38-50c164282dee")
public static String es_PE_COLUMN_C_Order_ID_Name="Order";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b57c4a4-23f7-564e-8f38-50c164282dee",
Synchronized="2020-03-03 21:38:25.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

@XendraTrl(Identifier="6b0699ff-2b2c-51a2-54ac-3ebfc3597877")
public static String es_PE_COLUMN_DateOrdered_Name="Date Ordered";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b0699ff-2b2c-51a2-54ac-3ebfc3597877",
Synchronized="2020-03-03 21:38:25.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";

@XendraTrl(Identifier="a9f961f1-8e5b-1e3a-c5f7-d2cd67096887")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9f961f1-8e5b-1e3a-c5f7-d2cd67096887",
Synchronized="2020-03-03 21:38:25.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="cefd4249-6506-ef04-0d33-fbb5be5e8950")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cefd4249-6506-ef04-0d33-fbb5be5e8950",
Synchronized="2020-03-03 21:38:25.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="781743c0-4cd8-499d-08c6-50fbdb96db9b")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="781743c0-4cd8-499d-08c6-50fbdb96db9b",
Synchronized="2020-03-03 21:38:25.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

@XendraTrl(Identifier="451144a8-1777-e11e-9f56-1a8a48de3497")
public static String es_PE_COLUMN_POReference_Name="Order Reference";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="451144a8-1777-e11e-9f56-1a8a48de3497",
Synchronized="2020-03-03 21:38:25.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";

@XendraTrl(Identifier="5bd6aec8-4d56-c86c-75fd-55684e8d0ab8")
public static String es_PE_COLUMN_SalesRep_ID_Name="Sales Representative";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5bd6aec8-4d56-c86c-75fd-55684e8d0ab8",Synchronized="2020-03-03 21:38:25.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

@XendraTrl(Identifier="b9426034-8f4e-1b9d-796b-d2ef16efe095")
public static String es_PE_COLUMN_TotalLines_Name="Total Lines";

@XendraColumn(AD_Element_ID="b1a5a695-e900-bbfd-4380-df29c5444a9a",ColumnName="TotalLines",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9426034-8f4e-1b9d-796b-d2ef16efe095",
Synchronized="2020-03-03 21:38:25.0")
/** Column name TotalLines */
public static final String COLUMNNAME_TotalLines = "TotalLines";
	@XendraView(Identifier="cb5bf0d5-02f8-03db-0528-24931bd93831",
Synchronized="2017-10-29 00:00:34.0",
Name="m_inout_candidate_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "cb5bf0d5-02f8-03db-0528-24931bd93831";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-10-29 00:00:34.0");
	sb.appendln("@Identifier=cb5bf0d5-02f8-03db-0528-24931bd93831");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT o.ad_client_id, o.ad_org_id, o.c_bpartner_id, o.c_order_id, o.documentno, o.dateordered, o.c_doctype_id, o.poreference, o.description, o.salesrep_id, l.m_warehouse_id, sum(((l.qtyordered - l.qtydelivered) * l.priceactual)) AS totallines, o.c_bpartner_location_id FROM (c_order o JOIN c_orderline l ON ((o.c_order_id = l.c_order_id))) WHERE (((((((((o.docstatus = 'CO'::bpchar) AND (o.isdelivered = 'N'::bpchar)) AND (o.c_doctype_id IN (SELECT c_doctype.c_doctype_id FROM c_doctype WHERE ((c_doctype.docbasetype = 'SOO'::bpchar) AND ((c_doctype.docsubtype)::bpchar <> ALL (ARRAY['ON'::bpchar, 'OB'::bpchar, 'WR'::bpchar])))))) AND (o.deliveryrule <> 'M'::bpchar)) AND ((l.m_product_id IS NULL) OR (EXISTS (SELECT p.m_product_id, p.ad_client_id, p.ad_org_id, p.isactive, p.created, p.createdby, p.updated, p.updatedby, p.value, p.name, p.description, p.documentnote, p.help, p.upc, p.sku, p.c_uom_id, p.salesrep_id, p.issummary, p.isstocked, p.ispurchased, p.issold, p.isbom, p.isinvoiceprintdetails, p.ispicklistprintdetails, p.isverified, p.c_revenuerecognition_id, p.m_product_category_id, p.classification, p.volume, p.weight, p.shelfwidth, p.shelfheight, p.shelfdepth, p.unitsperpallet, p.c_taxcategory_id, p.s_resource_id, p.discontinued, p.discontinuedby, p.processing, p.s_expensetype_id, p.producttype, p.imageurl, p.descriptionurl, p.guaranteedays, p.r_mailtext_id, p.versionno, p.m_attributeset_id, p.m_attributesetinstance_id, p.downloadurl, p.m_freightcategory_id, p.m_locator_id, p.guaranteedaysmin, p.iswebstorefeatured, p.isselfservice, p.c_subscriptiontype_id, p.isdropship, p.isexcludeautodelivery FROM m_product p WHERE ((l.m_product_id = p.m_product_id) AND (p.isexcludeautodelivery = 'N'::bpchar)))))) AND (l.qtyordered <> l.qtydelivered)) AND (o.isdropship = 'N'::bpchar)) AND ((l.m_product_id IS NOT NULL) OR (l.c_charge_id IS NOT NULL))) AND (NOT (EXISTS (SELECT iol.m_inoutline_id, iol.ad_client_id, iol.ad_org_id, iol.isactive, iol.created, iol.createdby, iol.updated, iol.updatedby, iol.line, iol.description, iol.m_inout_id, iol.c_orderline_id, iol.m_locator_id, iol.m_product_id, iol.c_uom_id, iol.movementqty, iol.isinvoiced, iol.m_attributesetinstance_id, iol.isdescription, iol.confirmedqty, iol.pickedqty, iol.scrappedqty, iol.targetqty, iol.ref_inoutline_id, iol.processed, iol.qtyentered, iol.c_charge_id, iol.c_project_id, iol.c_projectphase_id, iol.c_projecttask_id, iol.c_campaign_id, iol.c_activity_id, iol.user1_id, iol.user2_id, iol.ad_orgtrx_id, io.m_inout_id, io.ad_client_id, io.ad_org_id, io.isactive, io.created, io.createdby, io.updated, io.updatedby, io.issotrx, io.documentno, io.docaction, io.docstatus, io.posted, io.processing, io.processed, io.c_doctype_id, io.description, io.c_order_id, io.dateordered, io.isprinted, io.movementtype, io.movementdate, io.dateacct, io.c_bpartner_id, io.c_bpartner_location_id, io.m_warehouse_id, io.poreference, io.deliveryrule, io.freightcostrule, io.freightamt, io.deliveryviarule, io.m_shipper_id, io.c_charge_id, io.chargeamt, io.priorityrule, io.dateprinted, io.c_invoice_id, io.createfrom, io.generateto, io.sendemail, io.ad_user_id, io.salesrep_id, io.nopackages, io.pickdate, io.shipdate, io.trackingno, io.ad_orgtrx_id, io.c_project_id, io.c_campaign_id, io.c_activity_id, io.user1_id, io.user2_id, io.datereceived, io.isintransit, io.ref_inout_id, io.createconfirm, io.createpackage, io.isapproved, io.isindispute, io.volume, io.weight, io.vehicle, io.fact_id FROM (m_inoutline iol JOIN m_inout io ON ((iol.m_inout_id = io.m_inout_id))) WHERE ((iol.c_orderline_id = l.c_orderline_id) AND (io.docstatus = ANY (ARRAY['IP'::bpchar, 'WC'::bpchar]))))))) GROUP BY o.ad_client_id, o.ad_org_id, o.c_bpartner_id, o.c_order_id, o.documentno, o.dateordered, o.c_doctype_id, o.poreference, o.description, o.salesrep_id, l.m_warehouse_id, o.c_bpartner_location_id;");
	return sb.toString();
}
}
