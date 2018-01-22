package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_c_rfq_unanswered 
{
 	@XendraView(Identifier="b89555d5-e922-164f-83bf-5a1e60907728",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_c_rfq_unanswered",
Owner="xendra",
Extension="")
	public static final String Identifier = "b89555d5-e922-164f-83bf-5a1e60907728";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=b89555d5-e922-164f-83bf-5a1e60907728");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT q.ad_client_id, q.ad_org_id, q.c_rfq_id, q.name, q.description, q.help, q.salesrep_id, q.c_rfq_topic_id, q.quotetype, q.isquotetotalamt, q.isquoteallqty, q.c_currency_id, q.dateresponse, q.isrfqresponseaccepted, q.dateworkstart, q.deliverydays, q.dateworkcomplete, r.c_bpartner_id, r.c_bpartner_location_id, r.ad_user_id FROM (c_rfq q JOIN c_rfqresponse r ON ((q.c_rfq_id = r.c_rfq_id))) WHERE ((r.iscomplete = 'N'::bpchar) AND (q.processed = 'N'::bpchar));");
	return sb.toString();
}
}
