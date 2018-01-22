package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inout_header_v 
{
 	@XendraView(Identifier="b2e132e4-82b8-b5df-754b-1b76b726d015",
Synchronized="2013-07-09 19:02:34.0",
Name="m_inout_header_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "b2e132e4-82b8-b5df-754b-1b76b726d015";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=b2e132e4-82b8-b5df-754b-1b76b726d015");
	sb.appendln("@comment=Shipment Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT io.ad_client_id, io.ad_org_id, io.isactive, io.created, io.createdby, io.updated, io.updatedby, 'en_US'::character varying AS ad_language, io.m_inout_id, io.issotrx, io.documentno, io.docstatus, io.c_doctype_id, io.shipdate, io.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, oi.c_location_id AS org_location_id, oi.taxid, io.m_warehouse_id, wh.c_location_id AS warehouse_location_id, dt.printname AS documenttype, dt.documentnote AS documenttypenote, io.c_order_id, io.movementdate, io.movementtype, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpcg.greeting AS bpcontactgreeting, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname, bpl.c_location_id, ((l.postal)::text || (l.postal_add)::text) AS postal, bp.referenceno, io.description, io.poreference, io.dateordered, io.volume, io.weight, io.m_shipper_id, io.deliveryrule, io.deliveryviarule, io.priorityrule, sh.name AS drvname, sh.license, sp.value AS drvvalue, io.vehicle, i.serial AS invoiceserial, i.documentno AS invoicedocumentno, (SELECT dti.name FROM c_doctype dti WHERE (dti.c_doctype_id = i.c_doctype_id)) AS idoctype FROM ((((((((((((m_inout io JOIN c_doctype dt ON ((io.c_doctype_id = dt.c_doctype_id))) JOIN c_bpartner bp ON ((io.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_greeting bpg ON ((bp.c_greeting_id = bpg.c_greeting_id))) JOIN c_bpartner_location bpl ON ((io.c_bpartner_location_id = bpl.c_bpartner_location_id))) JOIN c_location l ON ((bpl.c_location_id = l.c_location_id))) LEFT JOIN ad_user bpc ON ((io.ad_user_id = bpc.ad_user_id))) LEFT JOIN c_greeting bpcg ON ((bpc.c_greeting_id = bpcg.c_greeting_id))) JOIN ad_orginfo oi ON ((io.ad_org_id = oi.ad_org_id))) JOIN m_warehouse wh ON ((io.m_warehouse_id = wh.m_warehouse_id))) LEFT JOIN m_shipper sh ON ((io.m_shipper_id = sh.m_shipper_id))) LEFT JOIN c_bpartner sp ON ((sh.c_bpartner_id = sp.c_bpartner_id))) LEFT JOIN c_invoice i ON ((io.c_invoice_id = i.c_invoice_id)));");
	return sb.toString();
}
}
