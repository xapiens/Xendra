package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_product_costing 
{
 	@XendraView(Identifier="b81f3819-236e-fec4-cc32-3f3d0de74b68",
Synchronized="2016-04-13 19:02:34.0",
Name="rv_product_costing",
Owner="xendra",
Extension="")
	public static final String Identifier = "b81f3819-236e-fec4-cc32-3f3d0de74b68";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-04-13 19:02:34.0");
	sb.appendln("@Identifier=b81f3819-236e-fec4-cc32-3f3d0de74b68");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT pc.m_product_id, p.value, p.name, p.m_product_category_id, pc.ad_client_id, pc.ad_org_id, pc.isactive, pc.created, pc.createdby, pc.updated, pc.updatedby, pc.currentcostprice, pc.futurecostprice, pc.coststandard, pc.coststandardpoqty, pc.coststandardpoamt, CASE WHEN (pc.coststandardpoqty = (0)::numeric) THEN (0)::numeric ELSE (pc.coststandardpoamt / pc.coststandardpoqty) END AS coststandardpodiff, pc.coststandardcumqty, pc.coststandardcumamt, CASE WHEN (pc.coststandardcumqty = (0)::numeric) THEN (0)::numeric ELSE (pc.coststandardcumamt / pc.coststandardcumqty) END AS coststandardinvdiff, pc.costaverage, pc.costaveragecumqty, pc.costaveragecumamt, pc.totalinvqty, pc.totalinvamt, CASE WHEN (pc.totalinvqty = (0)::numeric) THEN (0)::numeric ELSE (pc.totalinvamt / pc.totalinvqty) END AS totalinvcost, pc.pricelastpo, pc.pricelastinv FROM (m_product_costing pc JOIN m_product p ON ((pc.m_product_id = p.m_product_id)));");
	return sb.toString();
}
}
