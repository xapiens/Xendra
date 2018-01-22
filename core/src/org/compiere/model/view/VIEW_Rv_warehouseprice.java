package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_warehouseprice 
{
 	@XendraView(Identifier="5f27982c-cfb5-401d-8c25-cdd85bbfa524",
Synchronized="2017-08-26 19:41:55.0",
Name="rv_warehouseprice",
Owner="postgres",
Extension="")
	public static final String Identifier = "5f27982c-cfb5-401d-8c25-cdd85bbfa524";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-08-26 19:41:55.367");
	sb.appendln("@Identifier=5f27982c-cfb5-401d-8c25-cdd85bbfa524");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT w.ad_client_id, w.ad_org_id, CASE WHEN (p.discontinued = 'N'::bpchar) THEN 'Y'::text ELSE 'N'::text END AS isactive, pr.created, pr.createdby, pr.updated, pr.updatedby, p.m_product_id, pr.m_pricelist_version_id, w.m_warehouse_id, p.value, p.name, p.upc, p.sku, uom.c_uom_id, uom.uomsymbol, bompricelist(p.m_product_id, pr.m_pricelist_version_id) AS pricelist, bompricestd(p.m_product_id, pr.m_pricelist_version_id) AS pricestd, (bompricestd(p.m_product_id, pr.m_pricelist_version_id) - bompricelimit(p.m_product_id, pr.m_pricelist_version_id)) AS margin, bompricelimit(p.m_product_id, pr.m_pricelist_version_id) AS pricelimit, w.name AS warehousename, bomqtyavailable(p.m_product_id, w.m_warehouse_id, (0)::numeric) AS qtyavailable, bomqtyonhand(p.m_product_id, w.m_warehouse_id, (0)::numeric) AS qtyonhand, bomqtyreserved(p.m_product_id, w.m_warehouse_id, (0)::numeric) AS qtyreserved, bomqtyordered(p.m_product_id, w.m_warehouse_id, (0)::numeric) AS qtyordered, COALESCE(pa.isinstanceattribute, 'N'::bpchar) AS isinstanceattribute FROM ((((m_product p JOIN m_productprice pr ON ((p.m_product_id = pr.m_product_id))) JOIN c_uom uom ON ((p.c_uom_id = uom.c_uom_id))) LEFT JOIN m_attributeset pa ON ((p.m_attributeset_id = pa.m_attributeset_id))) JOIN m_warehouse w ON ((p.ad_client_id = w.ad_client_id))) WHERE ((((p.issummary = 'N'::bpchar) AND (p.isactive = 'Y'::bpchar)) AND (pr.isactive = 'Y'::bpchar)) AND (w.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
