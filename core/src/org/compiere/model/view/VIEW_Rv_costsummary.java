package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_costsummary 
{
 	@XendraView(Identifier="a2e0ba85-fa8c-63c4-96e0-455eef1d6334",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_costsummary",
Owner="xendra",
Extension="")
	public static final String Identifier = "a2e0ba85-fa8c-63c4-96e0-455eef1d6334";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=a2e0ba85-fa8c-63c4-96e0-455eef1d6334");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT c.ad_client_id, c.ad_org_id, c.isactive, 0 AS createdby, getdate() AS created, 0 AS updatedby, getdate() AS updated, p.m_product_id, p.value, p.name, p.upc, p.isbom, p.producttype, p.m_product_category_id, c.m_costtype_id, acct.c_acctschema_id, acct.c_currency_id, sum(c.currentcostprice) AS currentcostprice, sum(c.futurecostprice) AS futurecostprice FROM ((m_cost c JOIN m_product p ON ((c.m_product_id = p.m_product_id))) JOIN c_acctschema acct ON ((c.c_acctschema_id = acct.c_acctschema_id))) WHERE (acct.m_costtype_id = c.m_costtype_id) GROUP BY c.ad_client_id, c.ad_org_id, c.isactive, p.m_product_id, p.value, p.name, p.upc, p.isbom, p.producttype, p.m_product_category_id, c.m_costtype_id, acct.c_acctschema_id, acct.c_currency_id;");
	return sb.toString();
}
}
