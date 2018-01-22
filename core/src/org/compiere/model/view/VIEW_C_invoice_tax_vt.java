package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_tax_vt 
{
 	@XendraView(Identifier="ff64bcf0-8b6b-9e82-5388-0f59c6824300",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoice_tax_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "ff64bcf0-8b6b-9e82-5388-0f59c6824300";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=ff64bcf0-8b6b-9e82-5388-0f59c6824300");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT it.ad_client_id, it.ad_org_id, it.isactive, it.created, it.createdby, it.updated, it.updatedby, t.ad_language, it.c_invoice_id, NULL::unknown AS c_invoiceline_id, it.c_tax_id, NULL::unknown AS taxamt, NULL::unknown AS linetotalamt, t.taxindicator, 9999 AS line, NULL::unknown AS m_product_id, NULL::unknown AS qtyinvoiced, NULL::unknown AS qtyentered, NULL::unknown AS uomsymbol, t.name, NULL::unknown AS description, NULL::unknown AS documentnote, NULL::unknown AS upc, NULL::unknown AS sku, NULL::unknown AS productvalue, NULL::unknown AS resourcedescription, NULL::unknown AS pricelist, NULL::unknown AS priceenteredlist, NULL::unknown AS discount, CASE WHEN (it.istaxincluded = 'Y'::bpchar) THEN it.taxamt ELSE it.taxbaseamt END AS priceactual, CASE WHEN (it.istaxincluded = 'Y'::bpchar) THEN it.taxamt ELSE it.taxbaseamt END AS priceentered, CASE WHEN (it.istaxincluded = 'Y'::bpchar) THEN NULL::numeric ELSE it.taxamt END AS linenetamt, NULL::unknown AS m_attributesetinstance_id, NULL::unknown AS m_attributeset_id, NULL::unknown AS serno, NULL::unknown AS lot, NULL::unknown AS m_lot_id, NULL::unknown AS guaranteedate, NULL::unknown AS productdescription, NULL::unknown AS imageurl, NULL::unknown AS c_campaign_id, NULL::unknown AS c_project_id, NULL::unknown AS c_activity_id, NULL::unknown AS c_projectphase_id, NULL::unknown AS c_projecttask_id FROM (c_invoicetax it JOIN c_tax_trl t ON ((it.c_tax_id = t.c_tax_id)));");
	return sb.toString();
}
}
