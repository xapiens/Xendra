package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_subtotal_vt 
{
 	@XendraView(Identifier="c69a49d9-5f32-bb26-ed20-f9459609eec7",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoice_subtotal_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "c69a49d9-5f32-bb26-ed20-f9459609eec7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=c69a49d9-5f32-bb26-ed20-f9459609eec7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT c_invoice_line_vt.ad_client_id, c_invoice_line_vt.ad_org_id, c_invoice_line_vt.isactive, max(c_invoice_line_vt.created) AS created, max(c_invoice_line_vt.createdby) AS createdby, max(c_invoice_line_vt.updated) AS updated, max(c_invoice_line_vt.updatedby) AS updatedby, c_invoice_line_vt.ad_language, c_invoice_line_vt.c_invoice_id, NULL::unknown AS c_invoiceline_id, NULL::unknown AS c_tax_id, NULL::unknown AS taxamt, NULL::unknown AS linetotalamt, NULL::unknown AS taxindicator, NULL::unknown AS line, NULL::unknown AS m_product_id, NULL::unknown AS qtyinvoiced, NULL::unknown AS qtyentered, NULL::unknown AS uomsymbol, NULL::unknown AS name, 'Sub Total' AS description, NULL::unknown AS documentnote, NULL::unknown AS upc, NULL::unknown AS sku, NULL::unknown AS productvalue, NULL::unknown AS resourcedescription, NULL::unknown AS pricelist, NULL::unknown AS priceenteredlist, NULL::unknown AS discount, NULL::unknown AS priceactual, NULL::unknown AS priceentered, sum(c_invoice_line_vt.linenetamt) AS linenetamt, NULL::unknown AS m_attributesetinstance_id, NULL::unknown AS m_attributeset_id, NULL::unknown AS serno, NULL::unknown AS lot, NULL::unknown AS m_lot_id, NULL::unknown AS guaranteedate, NULL::unknown AS productdescription, NULL::unknown AS imageurl, NULL::unknown AS c_campaign_id, NULL::unknown AS c_project_id, NULL::unknown AS c_activity_id, NULL::unknown AS c_projectphase_id, NULL::unknown AS c_projecttask_id, NULL::unknown AS unknown FROM c_invoice_line_vt GROUP BY c_invoice_line_vt.c_invoice_id, c_invoice_line_vt.ad_client_id, c_invoice_line_vt.ad_org_id, c_invoice_line_vt.isactive, c_invoice_line_vt.ad_language;");
	return sb.toString();
}
}
