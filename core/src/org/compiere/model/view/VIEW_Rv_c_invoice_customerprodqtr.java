package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_c_invoice_customerprodqtr 
{
 	@XendraView(Identifier="4b084052-2c21-92e8-d07e-af26f5ff02f7",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_c_invoice_customerprodqtr",
Owner="xendra",
Extension="")
	public static final String Identifier = "4b084052-2c21-92e8-d07e-af26f5ff02f7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=4b084052-2c21-92e8-d07e-af26f5ff02f7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT il.ad_client_id, il.ad_org_id, il.c_bpartner_id, il.m_product_category_id, firstof(il.dateinvoiced, 'Q'::character varying) AS dateinvoiced, sum(il.linenetamt) AS linenetamt, sum(il.linelistamt) AS linelistamt, sum(il.linelimitamt) AS linelimitamt, sum(il.linediscountamt) AS linediscountamt, CASE WHEN (sum(il.linelistamt) = (0)::numeric) THEN (0)::numeric ELSE round((((sum(il.linelistamt) - sum(il.linenetamt)) / sum(il.linelistamt)) * (100)::numeric), 2) END AS linediscount, sum(il.lineoverlimitamt) AS lineoverlimitamt, CASE WHEN (sum(il.linenetamt) = (0)::numeric) THEN (0)::numeric ELSE ((100)::numeric - round((((sum(il.linenetamt) - sum(il.lineoverlimitamt)) / sum(il.linenetamt)) * (100)::numeric), 2)) END AS lineoverlimit, sum(il.qtyinvoiced) AS qtyinvoiced, il.issotrx FROM rv_c_invoiceline il GROUP BY il.ad_client_id, il.ad_org_id, il.c_bpartner_id, il.m_product_category_id, firstof(il.dateinvoiced, 'Q'::character varying), il.issotrx;");
	return sb.toString();
}
}
