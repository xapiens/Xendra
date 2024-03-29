package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_carding 
{
 	@XendraView(Identifier="6d956e01-058a-741f-7113-0c8dd70ad718",
Synchronized="2023-04-20 10:35:34.0",
Name="m_carding",
Owner="xendra",
Extension="")
	public static final String Identifier = "6d956e01-058a-741f-7113-0c8dd70ad718";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2023-04-20 10:35:34.0 @Identifier=6d956e01-058a-741f-7113-0c8dd70ad718");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" SELECT ( SELECT c_period.c_period_id");
	sb.appendln("           FROM c_period");
	sb.appendln("          WHERE (((io.movementdate)::date >= c_period.startdate) AND ((io.movementdate)::date <= c_period.enddate) AND (c_period.ad_client_id = io.ad_client_id))) AS c_period_id,");
	sb.appendln("    io.c_bpartner_id,");
	sb.appendln("    io.ad_client_id,");
	sb.appendln("    io.ad_org_id,");
	sb.appendln("    il.m_product_id,");
	sb.appendln("    il.m_attributesetinstance_id,");
	sb.appendln("    io.movementdate,");
	sb.appendln("    io.dateacct,");
	sb.appendln("    io.c_doctype_id,");
	sb.appendln("    io.documentno,");
	sb.appendln("    io.c_order_id,");
	sb.appendln("    ( SELECT max(invl.c_invoice_id) AS max");
	sb.appendln("           FROM c_invoiceline invl");
	sb.appendln("          WHERE (il.m_inoutline_id = invl.m_inoutline_id)) AS c_invoice_id,");
	sb.appendln("    il.m_locator_id,");
	sb.appendln("    io.m_warehouse_id,");
	sb.appendln("    ( SELECT l.c_currency_id");
	sb.appendln("           FROM c_orderline l");
	sb.appendln("          WHERE (l.c_orderline_id = il.c_orderline_id)) AS c_currency_id,");
	sb.appendln("    0 AS priceactual,");
	sb.appendln("    io.movementdate AS costdate,");
	sb.appendln("    'N'::bpchar AS mov_isreturn,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (\"substring\"((io.movementtype)::text, 2) = '+'::text) THEN il.movementqty");
	sb.appendln("            ELSE (il.movementqty * ('-1'::integer)::numeric)");
	sb.appendln("        END AS qtysource,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (\"substring\"((io.movementtype)::text, 2) = '+'::text) THEN il.movementqty");
	sb.appendln("            ELSE (0)::numeric");
	sb.appendln("        END AS qtyinput,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (\"substring\"((io.movementtype)::text, 2) = '+'::text) THEN (0)::numeric");
	sb.appendln("            ELSE il.movementqty");
	sb.appendln("        END AS qtyoutput,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_InOut'::text)) AS master_id,");
	sb.appendln("    io.m_inout_id AS parent_id,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_InOutLine'::text)) AS ad_table_id,");
	sb.appendln("    il.m_inoutline_id AS record_id,");
	sb.appendln("    ( SELECT max(invl.c_invoiceline_id) AS max");
	sb.appendln("           FROM c_invoiceline invl");
	sb.appendln("          WHERE (il.m_inoutline_id = invl.m_inoutline_id)) AS c_invoiceline_id,");
	sb.appendln("    0 AS m_productionline_id,");
	sb.appendln("    0 AS m_inventoryline_id,");
	sb.appendln("    il.c_orderline_id,");
	sb.appendln("    io.movementtype,");
	sb.appendln("    \"substring\"((io.movementtype)::text, 2) AS signe,");
	sb.appendln("    io.created,");
	sb.appendln("    io.createdby,");
	sb.appendln("    io.updated,");
	sb.appendln("    io.updatedby,");
	sb.appendln("    il.iscosted,");
	sb.appendln("    NULL::numeric AS m_productionplan_id,");
	sb.appendln("    il.seqno,");
	sb.appendln("    dt.transactiontype");
	sb.appendln("   FROM ((m_inout io");
	sb.appendln("     JOIN m_inoutline il ON (((il.m_inout_id = io.m_inout_id) AND (il.isactive = 'Y'::bpchar))))");
	sb.appendln("     JOIN c_doctype dt ON ((io.c_doctype_id = dt.c_doctype_id)))");
	sb.appendln("  WHERE ((io.isactive = 'Y'::bpchar) AND (io.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar, 'RE'::bpchar])) AND (io.movementdate >= ( SELECT c_acctschema.costedfrom");
	sb.appendln("           FROM c_acctschema");
	sb.appendln("          WHERE (c_acctschema.ad_client_id = io.ad_client_id))))");
	sb.appendln("UNION ALL");
	sb.appendln(" SELECT ( SELECT c_period.c_period_id");
	sb.appendln("           FROM c_period");
	sb.appendln("          WHERE (((mio.movementdate)::date >= c_period.startdate) AND ((mio.movementdate)::date <= c_period.enddate) AND (c_period.ad_client_id = mio.ad_client_id))) AS c_period_id,");
	sb.appendln("    NULL::integer AS c_bpartner_id,");
	sb.appendln("    w.ad_client_id,");
	sb.appendln("    w.ad_org_id,");
	sb.appendln("    ml.m_product_id,");
	sb.appendln("    ml.m_attributesetinstance_id,");
	sb.appendln("    mio.movementdate,");
	sb.appendln("    mio.dateacct,");
	sb.appendln("    mio.c_doctype_id,");
	sb.appendln("    mio.documentno,");
	sb.appendln("    NULL::numeric AS c_order_id,");
	sb.appendln("    NULL::numeric AS c_invoice_id,");
	sb.appendln("    ml.m_locatorto_id AS m_locator_id,");
	sb.appendln("    w.m_warehouse_id,");
	sb.appendln("    0 AS c_currency_id,");
	sb.appendln("    0 AS priceactual,");
	sb.appendln("    mio.movementdate AS costdate,");
	sb.appendln("    'N'::bpchar AS mov_isreturn,");
	sb.appendln("    ml.movementqty AS qtysource,");
	sb.appendln("    ml.movementqty AS qtyinput,");
	sb.appendln("    0 AS qtyoutput,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_Movement'::text)) AS master_id,");
	sb.appendln("    mio.m_movement_id AS parent_id,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_MovementLine'::text)) AS ad_table_id,");
	sb.appendln("    ml.m_movementline_id AS record_id,");
	sb.appendln("    0 AS c_invoiceline_id,");
	sb.appendln("    0 AS m_productionline_id,");
	sb.appendln("    0 AS m_inventoryline_id,");
	sb.appendln("    0 AS c_orderline_id,");
	sb.appendln("    'M+'::bpchar AS movementtype,");
	sb.appendln("    '+'::text AS signe,");
	sb.appendln("    mio.created,");
	sb.appendln("    mio.createdby,");
	sb.appendln("    mio.updated,");
	sb.appendln("    mio.updatedby,");
	sb.appendln("    ml.iscosted,");
	sb.appendln("    NULL::numeric AS m_productionplan_id,");
	sb.appendln("    ml.seqno,");
	sb.appendln("    dt.transactiontype");
	sb.appendln("   FROM (((m_movement mio");
	sb.appendln("     JOIN m_movementline ml ON (((ml.m_movement_id = mio.m_movement_id) AND (ml.isactive = 'Y'::bpchar))))");
	sb.appendln("     JOIN c_doctype dt ON ((mio.c_doctype_id = dt.c_doctype_id)))");
	sb.appendln("     JOIN m_warehouse w ON ((w.m_warehouse_id = ( SELECT loc.m_warehouse_id");
	sb.appendln("           FROM m_locator loc");
	sb.appendln("          WHERE (loc.m_locator_id = ml.m_locatorto_id)))))");
	sb.appendln("  WHERE ((mio.isactive = 'Y'::bpchar) AND (mio.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar, 'RE'::bpchar])) AND (mio.movementdate >= ( SELECT c_acctschema.costedfrom");
	sb.appendln("           FROM c_acctschema");
	sb.appendln("          WHERE (c_acctschema.ad_client_id = mio.ad_client_id))))");
	sb.appendln("UNION ALL");
	sb.appendln(" SELECT ( SELECT c_period.c_period_id");
	sb.appendln("           FROM c_period");
	sb.appendln("          WHERE (((mio.movementdate)::date >= c_period.startdate) AND ((mio.movementdate)::date <= c_period.enddate) AND (c_period.ad_client_id = mio.ad_client_id))) AS c_period_id,");
	sb.appendln("    NULL::integer AS c_bpartner_id,");
	sb.appendln("    w.ad_client_id,");
	sb.appendln("    w.ad_org_id,");
	sb.appendln("    ml.m_product_id,");
	sb.appendln("    ml.m_attributesetinstance_id,");
	sb.appendln("    mio.movementdate,");
	sb.appendln("    mio.dateacct,");
	sb.appendln("    mio.c_doctype_id,");
	sb.appendln("    mio.documentno,");
	sb.appendln("    NULL::numeric AS c_order_id,");
	sb.appendln("    NULL::numeric AS c_invoice_id,");
	sb.appendln("    ml.m_locator_id,");
	sb.appendln("    w.m_warehouse_id,");
	sb.appendln("    0 AS c_currency_id,");
	sb.appendln("    0 AS priceactual,");
	sb.appendln("    mio.movementdate AS costdate,");
	sb.appendln("    'N'::bpchar AS mov_isreturn,");
	sb.appendln("    (('-1'::integer)::numeric * ml.movementqty) AS qtysource,");
	sb.appendln("    0 AS qtyinput,");
	sb.appendln("    ml.movementqty AS qtyoutput,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_Movement'::text)) AS master_id,");
	sb.appendln("    mio.m_movement_id AS parent_id,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_MovementLine'::text)) AS ad_table_id,");
	sb.appendln("    ml.m_movementline_id AS record_id,");
	sb.appendln("    0 AS c_invoiceline_id,");
	sb.appendln("    0 AS m_productionline_id,");
	sb.appendln("    0 AS m_inventoryline_id,");
	sb.appendln("    0 AS c_orderline_id,");
	sb.appendln("    'M-'::bpchar AS movementtype,");
	sb.appendln("    '-'::text AS signe,");
	sb.appendln("    mio.created,");
	sb.appendln("    mio.createdby,");
	sb.appendln("    mio.updated,");
	sb.appendln("    mio.updatedby,");
	sb.appendln("    ml.iscosted,");
	sb.appendln("    NULL::numeric AS m_productionplan_id,");
	sb.appendln("    ml.seqno,");
	sb.appendln("    dt.transactiontype");
	sb.appendln("   FROM (((m_movement mio");
	sb.appendln("     JOIN m_movementline ml ON (((ml.m_movement_id = mio.m_movement_id) AND (ml.isactive = 'Y'::bpchar))))");
	sb.appendln("     JOIN c_doctype dt ON ((mio.c_doctype_id = dt.c_doctype_id)))");
	sb.appendln("     JOIN m_warehouse w ON ((w.m_warehouse_id = ( SELECT loc.m_warehouse_id");
	sb.appendln("           FROM m_locator loc");
	sb.appendln("          WHERE (loc.m_locator_id = ml.m_locator_id)))))");
	sb.appendln("  WHERE ((mio.isactive = 'Y'::bpchar) AND (mio.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar, 'RE'::bpchar])) AND (mio.movementdate >= ( SELECT c_acctschema.costedfrom");
	sb.appendln("           FROM c_acctschema");
	sb.appendln("          WHERE (c_acctschema.ad_client_id = mio.ad_client_id))))");
	sb.appendln("UNION ALL");
	sb.appendln(" SELECT ( SELECT c_period.c_period_id");
	sb.appendln("           FROM c_period");
	sb.appendln("          WHERE (((i.movementdate)::date >= c_period.startdate) AND ((i.movementdate)::date <= c_period.enddate) AND (c_period.ad_client_id = i.ad_client_id))) AS c_period_id,");
	sb.appendln("    NULL::integer AS c_bpartner_id,");
	sb.appendln("    i.ad_client_id,");
	sb.appendln("    i.ad_org_id,");
	sb.appendln("    il.m_product_id,");
	sb.appendln("    il.m_attributesetinstance_id,");
	sb.appendln("    i.movementdate,");
	sb.appendln("    i.dateacct,");
	sb.appendln("    i.c_doctype_id,");
	sb.appendln("    i.documentno,");
	sb.appendln("    NULL::numeric AS c_order_id,");
	sb.appendln("    NULL::numeric AS c_invoice_id,");
	sb.appendln("    il.m_locator_id,");
	sb.appendln("    i.m_warehouse_id,");
	sb.appendln("    0 AS c_currency_id,");
	sb.appendln("    0 AS priceactual,");
	sb.appendln("    i.movementdate AS costdate,");
	sb.appendln("    'N'::bpchar AS mov_isreturn,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN ((il.inventorytype = 'D'::bpchar) OR (il.inventorytype = 'I'::bpchar)) THEN (il.qtycount - il.qtybook)");
	sb.appendln("            ELSE il.qtyinternaluse");
	sb.appendln("        END AS qtysource,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN ((il.inventorytype = 'D'::bpchar) OR (il.inventorytype = 'I'::bpchar)) THEN");
	sb.appendln("            CASE");
	sb.appendln("                WHEN ((il.qtycount - il.qtybook) > (0)::numeric) THEN (il.qtycount - il.qtybook)");
	sb.appendln("                ELSE (0)::numeric");
	sb.appendln("            END");
	sb.appendln("            ELSE");
	sb.appendln("            CASE");
	sb.appendln("                WHEN (il.qtyinternaluse > (0)::numeric) THEN il.qtyinternaluse");
	sb.appendln("                ELSE (0)::numeric");
	sb.appendln("            END");
	sb.appendln("        END AS qtyinput,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN ((il.inventorytype = 'D'::bpchar) OR (il.inventorytype = 'I'::bpchar)) THEN");
	sb.appendln("            CASE");
	sb.appendln("                WHEN ((il.qtycount - il.qtybook) < (0)::numeric) THEN abs((il.qtycount - il.qtybook))");
	sb.appendln("                ELSE (0)::numeric");
	sb.appendln("            END");
	sb.appendln("            ELSE");
	sb.appendln("            CASE");
	sb.appendln("                WHEN (il.qtyinternaluse < (0)::numeric) THEN abs(il.qtyinternaluse)");
	sb.appendln("                ELSE (0)::numeric");
	sb.appendln("            END");
	sb.appendln("        END AS qtyoutput,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_Inventory'::text)) AS master_id,");
	sb.appendln("    i.m_inventory_id AS parent_id,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_InventoryLine'::text)) AS ad_table_id,");
	sb.appendln("    il.m_inventoryline_id AS record_id,");
	sb.appendln("    0 AS c_invoiceline_id,");
	sb.appendln("    0 AS m_productionline_id,");
	sb.appendln("    il.m_inventoryline_id,");
	sb.appendln("    0 AS c_orderline_id,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (");
	sb.appendln("            CASE");
	sb.appendln("                WHEN ((il.inventorytype = 'D'::bpchar) OR (il.inventorytype = 'I'::bpchar)) THEN (il.qtycount - il.qtybook)");
	sb.appendln("                ELSE il.qtyinternaluse");
	sb.appendln("            END >= (0)::numeric) THEN 'I+'::text");
	sb.appendln("            ELSE 'I-'::text");
	sb.appendln("        END AS movementtype,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (");
	sb.appendln("            CASE");
	sb.appendln("                WHEN ((il.inventorytype = 'D'::bpchar) OR (il.inventorytype = 'I'::bpchar)) THEN (il.qtycount - il.qtybook)");
	sb.appendln("                ELSE il.qtyinternaluse");
	sb.appendln("            END >= (0)::numeric) THEN '+'::text");
	sb.appendln("            ELSE '-'::text");
	sb.appendln("        END AS signe,");
	sb.appendln("    i.created,");
	sb.appendln("    i.createdby,");
	sb.appendln("    i.updated,");
	sb.appendln("    i.updatedby,");
	sb.appendln("    il.iscosted,");
	sb.appendln("    NULL::numeric AS m_productionplan_id,");
	sb.appendln("    il.seqno,");
	sb.appendln("    dt.transactiontype");
	sb.appendln("   FROM ((m_inventory i");
	sb.appendln("     JOIN m_inventoryline il ON (((il.m_inventory_id = i.m_inventory_id) AND (i.isactive = 'Y'::bpchar) AND (i.docstatus <> 'DR'::bpchar))))");
	sb.appendln("     JOIN c_doctype dt ON ((i.c_doctype_id = dt.c_doctype_id)))");
	sb.appendln("  WHERE ((i.isactive = 'Y'::bpchar) AND (i.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar, 'RE'::bpchar])) AND (i.movementdate >= ( SELECT c_acctschema.costedfrom");
	sb.appendln("           FROM c_acctschema");
	sb.appendln("          WHERE (c_acctschema.ad_client_id = i.ad_client_id))))");
	sb.appendln("UNION ALL");
	sb.appendln(" SELECT ( SELECT c_period.c_period_id");
	sb.appendln("           FROM c_period");
	sb.appendln("          WHERE (((p.movementdate)::date >= c_period.startdate) AND ((p.movementdate)::date <= c_period.enddate) AND (c_period.ad_client_id = p.ad_client_id))) AS c_period_id,");
	sb.appendln("    NULL::integer AS c_bpartner_id,");
	sb.appendln("    p.ad_client_id,");
	sb.appendln("    p.ad_org_id,");
	sb.appendln("    pl.m_product_id,");
	sb.appendln("    pl.m_attributesetinstance_id,");
	sb.appendln("    p.movementdate,");
	sb.appendln("    p.dateacct,");
	sb.appendln("    p.c_doctype_id,");
	sb.appendln("    p.documentno,");
	sb.appendln("    NULL::numeric AS c_order_id,");
	sb.appendln("    NULL::numeric AS c_invoice_id,");
	sb.appendln("    pl.m_locator_id,");
	sb.appendln("    w.m_warehouse_id,");
	sb.appendln("    0 AS c_currency_id,");
	sb.appendln("    0 AS priceactual,");
	sb.appendln("    p.movementdate AS costdate,");
	sb.appendln("    'N'::bpchar AS mov_isreturn,");
	sb.appendln("    pl.movementqty AS qtysource,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (pl.movementqty > (0)::numeric) THEN pl.movementqty");
	sb.appendln("            ELSE (0)::numeric");
	sb.appendln("        END AS qtyinput,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (pl.movementqty < (0)::numeric) THEN pl.movementqty");
	sb.appendln("            ELSE (0)::numeric");
	sb.appendln("        END AS qtyoutput,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_Production'::text)) AS master_id,");
	sb.appendln("    p.m_production_id AS parent_id,");
	sb.appendln("    ( SELECT ad_table.ad_table_id");
	sb.appendln("           FROM ad_table");
	sb.appendln("          WHERE ((ad_table.tablename)::text = 'M_ProductionLine'::text)) AS ad_table_id,");
	sb.appendln("    pl.m_productionline_id AS record_id,");
	sb.appendln("    0 AS c_invoiceline_id,");
	sb.appendln("    pl.m_productionline_id,");
	sb.appendln("    0 AS m_inventoryline_id,");
	sb.appendln("    0 AS c_orderline_id,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (pl.movementqty >= (0)::numeric) THEN 'P+'::text");
	sb.appendln("            ELSE 'P-'::text");
	sb.appendln("        END AS movementtype,");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (pl.movementqty >= (0)::numeric) THEN '+'::text");
	sb.appendln("            ELSE '-'::text");
	sb.appendln("        END AS signe,");
	sb.appendln("    pl.created,");
	sb.appendln("    pl.createdby,");
	sb.appendln("    pl.updated,");
	sb.appendln("    pl.updatedby,");
	sb.appendln("    pl.iscosted,");
	sb.appendln("    pla.m_productionplan_id,");
	sb.appendln("    pl.seqno,");
	sb.appendln("    dt.transactiontype");
	sb.appendln("   FROM ((((m_production p");
	sb.appendln("     JOIN m_productionplan pla ON ((pla.m_production_id = p.m_production_id)))");
	sb.appendln("     JOIN c_doctype dt ON ((p.c_doctype_id = dt.c_doctype_id)))");
	sb.appendln("     JOIN m_productionline pl ON (((pla.m_productionplan_id = pl.m_productionplan_id) AND (pl.isactive = 'Y'::bpchar))))");
	sb.appendln("     JOIN m_warehouse w ON (((w.m_warehouse_id = ( SELECT loc.m_warehouse_id");
	sb.appendln("           FROM m_locator loc");
	sb.appendln("          WHERE (loc.m_locator_id = pl.m_locator_id))) AND (p.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar, 'RE'::bpchar])) AND (p.movementdate >= ( SELECT c_acctschema.costedfrom");
	sb.appendln("           FROM c_acctschema");
	sb.appendln("          WHERE (c_acctschema.ad_client_id = p.ad_client_id))))))");
	sb.appendln("  ORDER BY 6, 25 DESC, 24 DESC;");
	return sb.toString();
}
}
