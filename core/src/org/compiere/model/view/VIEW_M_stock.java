package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_stock 
{
 	@XendraView(Identifier="872a3dcd-91fc-4cda-8ed7-0e5203abf8ab",
Synchronized="2013-07-09 19:02:34.0",
Name="m_stock",
Owner="xendra",
Extension="")
	public static final String Identifier = "872a3dcd-91fc-4cda-8ed7-0e5203abf8ab";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=872a3dcd-91fc-4cda-8ed7-0e5203abf8ab");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("(((SELECT il.m_product_id, il.m_attributesetinstance_id, il.m_locator_id, io.m_warehouse_id, CASE WHEN (\"substring\"((io.movementtype)::text, 2) = '+'::text) THEN il.movementqty ELSE (il.movementqty * ((-1))::numeric) END AS qtysource, io.movementdate, io.dateacct FROM (m_inout io JOIN m_inoutline il ON (((il.m_inout_id = io.m_inout_id) AND (il.isactive = 'Y'::bpchar)))) WHERE (((io.isactive = 'Y'::bpchar) AND (io.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) AND (io.movementdate >= (SELECT c_acctschema.costedfrom FROM c_acctschema WHERE (c_acctschema.ad_client_id = io.ad_client_id)))) UNION ALL SELECT ml.m_product_id, ml.m_attributesetinstance_id, ml.m_locatorto_id AS m_locator_id, loc.m_warehouse_id, ml.movementqty AS qtysource, mio.movementdate, mio.dateacct FROM ((m_movement mio JOIN m_movementline ml ON (((ml.m_movement_id = mio.m_movement_id) AND (ml.isactive = 'Y'::bpchar)))) JOIN m_locator loc ON ((ml.m_locatorto_id = loc.m_locator_id))) WHERE (((mio.isactive = 'Y'::bpchar) AND (mio.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) AND (mio.movementdate >= (SELECT c_acctschema.costedfrom FROM c_acctschema WHERE (c_acctschema.ad_client_id = mio.ad_client_id))))) UNION ALL SELECT ml.m_product_id, ml.m_attributesetinstance_id, ml.m_locator_id, loc.m_warehouse_id, (((-1))::numeric * ml.movementqty) AS qtysource, mio.movementdate, mio.dateacct FROM ((m_movement mio JOIN m_movementline ml ON (((ml.m_movement_id = mio.m_movement_id) AND (ml.isactive = 'Y'::bpchar)))) JOIN m_locator loc ON ((ml.m_locator_id = loc.m_locator_id))) WHERE (((mio.isactive = 'Y'::bpchar) AND (mio.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) AND (mio.movementdate >= (SELECT c_acctschema.costedfrom FROM c_acctschema WHERE (c_acctschema.ad_client_id = mio.ad_client_id))))) UNION ALL SELECT il.m_product_id, il.m_attributesetinstance_id, il.m_locator_id, i.m_warehouse_id, CASE WHEN (il.inventorytype = 'D'::bpchar) THEN (il.qtycount - il.qtybook) ELSE il.qtyinternaluse END AS qtysource, i.movementdate, i.dateacct FROM (m_inventory i JOIN m_inventoryline il ON ((((il.m_inventory_id = i.m_inventory_id) AND (i.isactive = 'Y'::bpchar)) AND (i.docstatus <> 'DR'::bpchar)))) WHERE (((i.isactive = 'Y'::bpchar) AND (i.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) AND (i.movementdate >= (SELECT c_acctschema.costedfrom FROM c_acctschema WHERE (c_acctschema.ad_client_id = i.ad_client_id))))) UNION ALL SELECT pl.m_product_id, pl.m_attributesetinstance_id, pl.m_locator_id, loc.m_warehouse_id, pl.movementqty AS qtysource, p.movementdate, p.dateacct FROM (((m_production p JOIN m_productionplan pla ON ((pla.m_production_id = p.m_production_id))) JOIN m_productionline pl ON (((pla.m_productionplan_id = pl.m_productionplan_id) AND (pl.isactive = 'Y'::bpchar)))) JOIN m_locator loc ON ((pl.m_locator_id = loc.m_locator_id))) WHERE ((p.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar])) AND (p.movementdate >= (SELECT c_acctschema.costedfrom FROM c_acctschema WHERE (c_acctschema.ad_client_id = p.ad_client_id))));");
	return sb.toString();
}
}
