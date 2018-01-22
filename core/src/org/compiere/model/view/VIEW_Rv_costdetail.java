package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_costdetail 
{
 	@XendraView(Identifier="3adf86cb-8ef7-cd6c-f13a-1ef732dbdbda",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_costdetail",
Owner="xendra",
Extension="")
	public static final String Identifier = "3adf86cb-8ef7-cd6c-f13a-1ef732dbdbda";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=3adf86cb-8ef7-cd6c-f13a-1ef732dbdbda");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT c.ad_client_id, c.ad_org_id, c.isactive, c.created, c.createdby, c.updated, c.updatedby, p.m_product_id, p.value, p.name, p.upc, p.isbom, p.producttype, p.m_product_category_id, c.m_inoutline_id, c.c_invoiceline_id, asi.m_attributesetinstance_id, asi.m_attributeset_id, asi.lot, asi.serno, acct.c_acctschema_id, acct.c_currency_id, c.amt, c.qty, c.description, c.processed FROM (((m_costdetail c JOIN m_product p ON ((c.m_product_id = p.m_product_id))) JOIN c_acctschema acct ON ((c.c_acctschema_id = acct.c_acctschema_id))) JOIN m_attributesetinstance asi ON ((c.m_attributesetinstance_id = asi.m_attributesetinstance_id)));");
	return sb.toString();
}
}
