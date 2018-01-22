package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_c_invoice_month 
{
 	@XendraView(Identifier="1aed87d6-6fed-e567-15ec-c12ee467d402",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_c_invoice_month",
Owner="xendra",
Extension="")
	public static final String Identifier = "1aed87d6-6fed-e567-15ec-c12ee467d402";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=1aed87d6-6fed-e567-15ec-c12ee467d402");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT rv_c_invoiceline.ad_client_id, rv_c_invoiceline.ad_org_id, rv_c_invoiceline.salesrep_id, firstof(rv_c_invoiceline.dateinvoiced, 'MM'::character varying) AS dateinvoiced, sum(rv_c_invoiceline.linenetamt) AS linenetamt, sum(rv_c_invoiceline.linelistamt) AS linelistamt, sum(rv_c_invoiceline.linelimitamt) AS linelimitamt, sum(rv_c_invoiceline.linediscountamt) AS linediscountamt, CASE WHEN (sum(rv_c_invoiceline.linelistamt) = (0)::numeric) THEN (0)::numeric ELSE round((((sum(rv_c_invoiceline.linelistamt) - sum(rv_c_invoiceline.linenetamt)) / sum(rv_c_invoiceline.linelistamt)) * (100)::numeric), 2) END AS linediscount, sum(rv_c_invoiceline.lineoverlimitamt) AS lineoverlimitamt, CASE WHEN (sum(rv_c_invoiceline.linenetamt) = (0)::numeric) THEN (0)::numeric ELSE ((100)::numeric - round((((sum(rv_c_invoiceline.linenetamt) - sum(rv_c_invoiceline.lineoverlimitamt)) / sum(rv_c_invoiceline.linenetamt)) * (100)::numeric), 2)) END AS lineoverlimit, rv_c_invoiceline.issotrx FROM rv_c_invoiceline GROUP BY rv_c_invoiceline.ad_client_id, rv_c_invoiceline.ad_org_id, rv_c_invoiceline.salesrep_id, firstof(rv_c_invoiceline.dateinvoiced, 'MM'::character varying), rv_c_invoiceline.issotrx;");
	return sb.toString();
}
}
