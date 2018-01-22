package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_m_transaction 
{
 	@XendraView(Identifier="cb598728-ec50-b61c-b95a-0a96bc6cb5e9",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_m_transaction",
Owner="xendra",
Extension="")
	public static final String Identifier = "cb598728-ec50-b61c-b95a-0a96bc6cb5e9";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=cb598728-ec50-b61c-b95a-0a96bc6cb5e9");
	sb.appendln("@comment=With Product_PO info");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t.ad_client_id, t.ad_org_id, t.movementdate, t.movementqty, t.m_product_id, t.m_locator_id, t.m_attributesetinstance_id, p.m_product_category_id, p.value, po.c_bpartner_id, po.pricepo, po.pricelastpo, po.pricelist FROM ((m_transaction t JOIN m_product p ON ((t.m_product_id = p.m_product_id))) JOIN m_product_po po ON ((t.m_product_id = po.m_product_id))) WHERE (po.iscurrentvendor = 'Y'::bpchar);");
	return sb.toString();
}
}
