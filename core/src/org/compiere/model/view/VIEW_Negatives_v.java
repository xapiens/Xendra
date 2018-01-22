package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Negatives_v 
{
 	@XendraView(Identifier="7e3a7fa7-6b0f-8790-540f-56ba5f40e2a7",
Synchronized="2016-11-29 23:37:34.0",
Name="negatives_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "7e3a7fa7-6b0f-8790-540f-56ba5f40e2a7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-11-29 23:37:34.0");
	sb.appendln("@Identifier=7e3a7fa7-6b0f-8790-540f-56ba5f40e2a7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT (sum(negatives.negatives) / sum(negatives.stock)) AS indicator, 1 AS m_transaction_id, negatives.ad_client_id, negatives.ad_org_id FROM (SELECT transaction.ad_client_id, transaction.ad_org_id, count(DISTINCT transaction.m_product_id) AS negatives, 0 AS stock FROM (SELECT t.ad_client_id, t.ad_org_id, t.m_product_id, sum(t.movementqty) OVER (PARTITION BY t.m_product_id ORDER BY t.movementdate) AS negatives FROM (m_transaction t JOIN m_materialpolicy mp ON ((t.ad_client_id = mp.ad_client_id))) WHERE (t.movementdate >= mp.startdate)) transaction WHERE (transaction.negatives < (0)::numeric) GROUP BY transaction.ad_client_id, transaction.ad_org_id UNION ALL SELECT m_storage.ad_client_id, m_storage.ad_org_id, 0 AS negatives, count(DISTINCT m_storage.m_product_id) AS stock FROM m_storage GROUP BY m_storage.ad_client_id, m_storage.ad_org_id) negatives GROUP BY negatives.ad_client_id, negatives.ad_org_id;");
	return sb.toString();
}
}
