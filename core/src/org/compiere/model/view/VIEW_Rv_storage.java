package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_storage 
{
 	@XendraView(Identifier="894524fd-1517-1e46-4d69-6ce97c1d48d7",
Synchronized="2015-09-05 10:36:34.0",
Name="rv_storage",
Owner="xendra",
Extension="")
	public static final String Identifier = "894524fd-1517-1e46-4d69-6ce97c1d48d7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-09-05 10:36:34.0");
	sb.appendln("@Identifier=894524fd-1517-1e46-4d69-6ce97c1d48d7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("WITH storage AS (SELECT m_carding.ad_client_id, m_carding.ad_org_id, m_carding.m_product_id, m_carding.m_locator_id, sum(m_carding.qtysource) AS qtyonhand, (0)::numeric AS qtyreserved, (0)::numeric AS qtyordered, NULL::numeric(10,0) AS m_attributesetinstance_id, NULL::timestamp without time zone AS datelastinventory FROM m_carding GROUP BY m_carding.ad_client_id, m_carding.ad_org_id, m_carding.m_product_id, m_carding.m_locator_id) SELECT s.ad_client_id, s.ad_org_id, p.m_product_id, p.value, p.name, p.description, p.upc, p.sku, p.c_uom_id, p.m_product_category_id, p.classification, p.weight, p.volume, p.versionno, p.guaranteedays, p.guaranteedaysmin, s.m_locator_id, (SELECT m_locator.m_warehouse_id FROM m_locator WHERE (m_locator.m_locator_id = s.m_locator_id)) AS m_warehouse_id, NULL::character varying(60) AS x, NULL::character varying(60) AS y, NULL::character varying(60) AS z, s.qtyonhand, s.qtyreserved, (s.qtyonhand - s.qtyreserved) AS qtyavailable, s.qtyordered, s.datelastinventory, s.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, daysbetween(asi.guaranteedate, (getdate())::timestamp with time zone) AS shelflifedays, ((daysbetween(asi.guaranteedate, (getdate())::timestamp with time zone))::numeric - p.guaranteedaysmin) AS goodfordays, round((((daysbetween(asi.guaranteedate, (getdate())::timestamp with time zone))::numeric / p.guaranteedays) * (100)::numeric), 0) AS shelfliferemainingpct FROM ((m_product p JOIN storage s ON ((p.m_product_id = s.m_product_id))) LEFT JOIN m_attributesetinstance asi ON ((s.m_attributesetinstance_id = asi.m_attributesetinstance_id))) WHERE (p.isactive = 'Y'::bpchar) UNION SELECT p.ad_client_id, p.ad_org_id, p.m_product_id, p.value, p.name, p.description, p.upc, p.sku, p.c_uom_id, p.m_product_category_id, p.classification, p.weight, p.volume, p.versionno, p.guaranteedays, p.guaranteedaysmin, p.m_locator_id, (SELECT m_locator.m_warehouse_id FROM m_locator WHERE (m_locator.m_locator_id = p.m_locator_id)) AS m_warehouse_id, NULL::character varying(60) AS x, NULL::character varying(60) AS y, NULL::character varying(60) AS z, (0)::numeric AS qtyonhand, (0)::numeric AS qtyreserved, (0)::numeric AS qtyavailable, (0)::numeric AS qtyordered, NULL::timestamp without time zone AS datelastinventory, (0)::numeric(10,0) AS m_attributesetinstance_id, (0)::numeric(10,0) AS m_attributeset_id, NULL::character varying(40) AS serno, NULL::character varying(40) AS lot, (0)::numeric(10,0) AS m_lot_id, NULL::timestamp without time zone AS guaranteedate, NULL::integer AS shelflifedays, NULL::numeric AS goodfordays, NULL::numeric AS shelfliferemainingpct FROM m_product p WHERE ((NOT (EXISTS (SELECT s.m_product_id FROM storage s WHERE (s.m_product_id = p.m_product_id)))) AND (p.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
