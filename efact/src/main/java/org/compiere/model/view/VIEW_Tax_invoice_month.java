package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Tax_invoice_month 
{
 	@XendraView(Identifier="a5247553-b5d9-bf2c-dc72-3c093dc260d3",
Synchronized="2022-06-04 08:01:34.0",
Name="tax_invoice_month",
Owner="xendra",
Extension="")
	public static final String Identifier = "a5247553-b5d9-bf2c-dc72-3c093dc260d3";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2022-06-04 08:01:34.0");
	sb.appendln("@Identifier=a5247553-b5d9-bf2c-dc72-3c093dc260d3");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" SELECT rv_c_invoiceline.ad_client_id,");
	sb.appendln("    rv_c_invoiceline.ad_org_id,");
	sb.appendln("    firstof(rv_c_invoiceline.dateinvoiced, 'MM'::character varying) AS dateinvoiced,");
	sb.appendln("    sum(rv_c_invoiceline.linenetamt) AS invoiced,");
	sb.appendln("    sum(");
	sb.appendln("        CASE");
	sb.appendln("            WHEN (COALESCE(dt.iselectronic, 'N'::bpchar) = 'Y'::bpchar) THEN rv_c_invoiceline.linenetamt");
	sb.appendln("            ELSE (0)::numeric");
	sb.appendln("        END) AS afected,");
	sb.appendln("    sum(COALESCE(dl.linetotalamt, (0)::numeric)) AS declared");
	sb.appendln("   FROM ((rv_c_invoiceline");
	sb.appendln("     JOIN c_doctype dt ON ((rv_c_invoiceline.c_doctype_id = dt.c_doctype_id)))");
	sb.appendln("     LEFT JOIN s_docline dl ON ((rv_c_invoiceline.c_invoiceline_id = dl.c_invoiceline_id)))");
	sb.appendln("  WHERE (rv_c_invoiceline.issotrx = 'Y'::bpchar)");
	sb.appendln("  GROUP BY rv_c_invoiceline.ad_client_id, rv_c_invoiceline.ad_org_id, (firstof(rv_c_invoiceline.dateinvoiced, 'MM'::character varying))");
	sb.appendln("  ORDER BY (firstof(rv_c_invoiceline.dateinvoiced, 'MM'::character varying));");
	return sb.toString();
}
}
