package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_transaction_diff_v 
{
 	@XendraView(Identifier="2640c0e2-c62a-2f84-6dc7-91002c91871b",
Synchronized="2016-12-01 19:17:34.0",
Name="m_transaction_diff_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "2640c0e2-c62a-2f84-6dc7-91002c91871b";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-12-01 19:17:34.0");
	sb.appendln("@Identifier=2640c0e2-c62a-2f84-6dc7-91002c91871b");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT zz.m_product_id, zz.qtystorage, zz.qtytrx, (zz.qtystorage - zz.qtytrx) AS saldo FROM ((SELECT z.m_product_id, sum(z.totaltrx) AS qtytrx, sum(z.totalstorage) AS qtystorage FROM (SELECT t.m_product_id, sum(t.movementqty) AS totaltrx, 0 AS totalstorage FROM (m_transaction t JOIN m_materialpolicy mp ON ((t.ad_client_id = mp.ad_client_id))) WHERE ((t.movementdate >= mp.startdate) AND (t.docstatus = ANY (ARRAY['CO'::bpchar, 'CL'::bpchar]))) GROUP BY t.m_product_id UNION ALL SELECT m_storage.m_product_id, (0)::numeric AS totaltrx, sum(m_storage.qtyonhand) AS totalstorage FROM m_storage GROUP BY m_storage.m_product_id) z GROUP BY z.m_product_id) zz JOIN m_product p ON ((zz.m_product_id = p.m_product_id))) WHERE ((zz.qtytrx - zz.qtystorage) <> (0)::numeric);");
	return sb.toString();
}
}
