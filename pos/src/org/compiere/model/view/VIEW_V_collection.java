package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_V_collection 
{
 	@XendraView(Identifier="2ccb3af9-5846-8dd6-5f31-41c62f521cbd",
Synchronized="2020-03-10 16:28:03.0",
Name="v_collection",
Owner="xendra",
Extension="")
	public static final String Identifier = "2ccb3af9-5846-8dd6-5f31-41c62f521cbd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2020-03-10 16:28:03.0");
	sb.appendln("@Identifier=2ccb3af9-5846-8dd6-5f31-41c62f521cbd");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("(((((SELECT i.c_pos_id, c.datetrx, c.hr_workshift_id, 'CASH'::text AS type, COALESCE(sum(c.cashamt), (0)::numeric) AS amountinsystem FROM (c_collection c JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id))) WHERE (i.docstatus = 'CO'::bpchar) GROUP BY i.c_pos_id, c.datetrx, c.hr_workshift_id UNION ALL SELECT i.c_pos_id, c.datetrx, c.hr_workshift_id, 'CUPN'::text AS type, COALESCE(sum(c.couponamt), (0)::numeric) AS amountinsystem FROM (c_collection c JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id))) WHERE (i.docstatus = 'CO'::bpchar) GROUP BY i.c_pos_id, c.datetrx, c.hr_workshift_id) UNION ALL SELECT i.c_pos_id, c.datetrx, c.hr_workshift_id, 'CRED'::text AS type, COALESCE(sum(c.creditamt), (0)::numeric) AS amountinsystem FROM (c_collection c JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id))) WHERE (i.docstatus = 'CO'::bpchar) GROUP BY i.c_pos_id, c.datetrx, c.hr_workshift_id) UNION ALL SELECT i.c_pos_id, c.datetrx, c.hr_workshift_id, 'DONA'::text AS type, COALESCE(sum(CASE WHEN (c.writeoffamt < (0)::numeric) THEN c.writeoffamt ELSE (0)::numeric END), (0)::numeric) AS amountinsystem FROM (c_collection c JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id))) WHERE (i.docstatus = 'CO'::bpchar) GROUP BY i.c_pos_id, c.datetrx, c.hr_workshift_id) UNION ALL SELECT i.c_pos_id, c.datetrx, c.hr_workshift_id, 'WOFF'::text AS type, COALESCE(sum(CASE WHEN (c.writeoffamt > (0)::numeric) THEN c.writeoffamt ELSE (0)::numeric END), (0)::numeric) AS amountinsystem FROM (c_collection c JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id))) WHERE (i.docstatus = 'CO'::bpchar) GROUP BY i.c_pos_id, c.datetrx, c.hr_workshift_id) UNION ALL SELECT col.c_pos_id, col.datetrx, col.hr_workshift_id, 'COLL'::text AS type, COALESCE(sum(cl.amount), (0)::numeric) AS amountinsystem FROM ((c_collection col JOIN c_cash c ON ((col.c_cash_id = c.c_cash_id))) JOIN c_cashline cl ON ((cl.c_cash_id = c.c_cash_id))) WHERE (cl.iscollection = 'Y'::bpchar) GROUP BY col.c_pos_id, col.datetrx, col.hr_workshift_id) UNION ALL SELECT col.c_pos_id, col.datetrx, col.hr_workshift_id, p.creditcardtype AS type, COALESCE(sum(p.payamt), (0)::numeric) AS amountinsystem FROM (c_payment p JOIN c_collection col ON ((p.c_payment_id = col.c_payment_id))) GROUP BY col.c_pos_id, col.datetrx, col.hr_workshift_id, p.creditcardtype;");
	return sb.toString();
}
}
