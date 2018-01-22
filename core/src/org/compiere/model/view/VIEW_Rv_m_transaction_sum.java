package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_m_transaction_sum 
{
 	@XendraView(Identifier="67671189-0de2-2c35-2695-2fc587b4b563",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_m_transaction_sum",
Owner="xendra",
Extension="")
	public static final String Identifier = "67671189-0de2-2c35-2695-2fc587b4b563";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=67671189-0de2-2c35-2695-2fc587b4b563");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t.ad_client_id, t.ad_org_id, t.movementtype, l.m_warehouse_id, t.m_locator_id, t.m_product_id, t.movementdate, sum(t.movementqty) AS movementqty FROM m_transaction t, m_locator l WHERE (t.m_locator_id = l.m_locator_id) GROUP BY t.ad_client_id, t.ad_org_id, t.movementtype, l.m_warehouse_id, t.m_locator_id, t.m_product_id, t.movementdate;");
	return sb.toString();
}
}
