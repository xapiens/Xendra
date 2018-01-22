package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_cost 
{
 	@XendraView(Identifier="f1aa4b35-5c75-32a0-6ee7-f36b9bf067f9",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_cost",
Owner="xendra",
Extension="")
	public static final String Identifier = "f1aa4b35-5c75-32a0-6ee7-f36b9bf067f9";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=f1aa4b35-5c75-32a0-6ee7-f36b9bf067f9");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT c.ad_client_id, c.ad_org_id, c.isactive, c.created, c.createdby, c.updated, c.updatedby, p.m_product_id, p.value, p.name, p.upc, p.isbom, p.producttype, p.m_product_category_id, c.m_costtype_id, ce.m_costelement_id, ce.costelementtype, ce.costingmethod, ce.iscalculated, acct.c_acctschema_id, acct.c_currency_id, c.currentcostprice, c.futurecostprice, c.description FROM (((m_cost c JOIN m_product p ON ((c.m_product_id = p.m_product_id))) JOIN m_costelement ce ON ((c.m_costelement_id = ce.m_costelement_id))) JOIN c_acctschema acct ON ((c.c_acctschema_id = acct.c_acctschema_id)));");
	return sb.toString();
}
}
