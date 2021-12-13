package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_V_cashcount 
{
 	@XendraView(Identifier="0e6f48c3-d0b4-404c-b758-a9878653271b",
Synchronized="2020-01-15 23:02:23.0",
Name="v_cashcount",
Owner="xendra",
Extension="")
	public static final String Identifier = "0e6f48c3-d0b4-404c-b758-a9878653271b";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2020-01-15 23:02:23.0");
	sb.appendln("@Identifier=0e6f48c3-d0b4-404c-b758-a9878653271b");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" SELECT cashcount.type,");
	sb.appendln("    cashcount.sequence,");
	sb.appendln("    cashcount.c_pos_id,");
	sb.appendln("    cashcount.dateinvoiced,");
	sb.appendln("    cashcount.cardname,");
	sb.appendln("    cashcount.creditcardtype,");
	sb.appendln("    cashcount.creditcardnumber,");
	sb.appendln("    cashcount.payamt,");
	sb.appendln("    cashcount.c_bpartner_id,");
	sb.appendln("    cashcount.creditamt,");
	sb.appendln("    cashcount.cashamt,");
	sb.appendln("    cashcount.totalamt");
	sb.appendln("   FROM ( SELECT 'P'::text AS type,");
	sb.appendln("            1 AS sequence,");
	sb.appendln("            i.c_pos_id,");
	sb.appendln("            i.dateinvoiced,");
	sb.appendln("            rl.name AS cardname,");
	sb.appendln("            pay.creditcardtype,");
	sb.appendln("            pay.creditcardnumber,");
	sb.appendln("            pay.payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            0 AS cashamt,");
	sb.appendln("            0 AS totalamt");
	sb.appendln("           FROM (c_payment pay");
	sb.appendln("             JOIN c_invoice i ON ((i.c_payment_id = pay.c_payment_id))),");
	sb.appendln("            (ad_ref_list rl");
	sb.appendln("             JOIN ad_reference r ON (((rl.ad_reference_id = r.ad_reference_id) AND ((r.identifier)::text = '5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9'::text))))");
	sb.appendln("          WHERE (((rl.value)::bpchar = pay.creditcardtype) AND (i.docstatus = 'CO'::bpchar))");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'P'::text AS type,");
	sb.appendln("            1 AS sequence,");
	sb.appendln("            i.c_pos_id,");
	sb.appendln("            i.dateinvoiced,");
	sb.appendln("            ((rl.name)::text || ' Total '::text) AS cardname,");
	sb.appendln("            ''::text AS creditcardtype,");
	sb.appendln("            ''::character varying AS creditcardnumber,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            0 AS cashamt,");
	sb.appendln("            sum(pay.payamt) AS totalamt");
	sb.appendln("           FROM (c_payment pay");
	sb.appendln("             JOIN c_invoice i ON ((i.c_payment_id = pay.c_payment_id))),");
	sb.appendln("            (ad_ref_list rl");
	sb.appendln("             JOIN ad_reference r ON (((rl.ad_reference_id = r.ad_reference_id) AND ((r.identifier)::text = '5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9'::text))))");
	sb.appendln("          WHERE (((rl.value)::bpchar = pay.creditcardtype) AND (i.docstatus = 'CO'::bpchar))");
	sb.appendln("          GROUP BY i.c_pos_id, i.dateinvoiced, rl.name");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'P'::text AS type,");
	sb.appendln("            3 AS sequence,");
	sb.appendln("            i.c_pos_id,");
	sb.appendln("            i.dateinvoiced,");
	sb.appendln("            'Total'::text AS cardname,");
	sb.appendln("            ''::bpchar AS creditcardtype,");
	sb.appendln("            ''::character varying AS creditcardnumber,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            0 AS cashamt,");
	sb.appendln("            sum(pay.payamt) AS totalamt");
	sb.appendln("           FROM (c_payment pay");
	sb.appendln("             JOIN c_invoice i ON ((i.c_payment_id = pay.c_payment_id))),");
	sb.appendln("            (ad_ref_list rl");
	sb.appendln("             JOIN ad_reference r ON (((rl.ad_reference_id = r.ad_reference_id) AND ((r.identifier)::text = '5ca77e7f-ae8f-2faa-c3ab-3c8ffded32d9'::text))))");
	sb.appendln("          WHERE (((rl.value)::bpchar = pay.creditcardtype) AND (i.docstatus = 'CO'::bpchar))");
	sb.appendln("          GROUP BY i.c_pos_id, i.dateinvoiced");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'B'::text AS type,");
	sb.appendln("            1 AS sequence,");
	sb.appendln("            i.c_pos_id,");
	sb.appendln("            i.dateinvoiced,");
	sb.appendln("            ''::character varying AS cardname,");
	sb.appendln("            ''::bpchar AS creditcardtype,");
	sb.appendln("            ''::character varying AS creditcardnumber,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            bp.name AS c_bpartner_id,");
	sb.appendln("            pl.creditamt,");
	sb.appendln("            0 AS cashamt,");
	sb.appendln("            0 AS totalamt");
	sb.appendln("           FROM ((c_collection pl");
	sb.appendln("             JOIN c_invoice i ON ((pl.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("             JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'CO'::bpchar) AND (pl.creditamt > (0)::numeric))");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'B'::text AS type,");
	sb.appendln("            2 AS sequence,");
	sb.appendln("            i.c_pos_id,");
	sb.appendln("            i.dateinvoiced,");
	sb.appendln("            ''::character varying AS cardname,");
	sb.appendln("            ''::bpchar AS creditcardtype,");
	sb.appendln("            ''::character varying AS creditcardnumber,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            0 AS cashamt,");
	sb.appendln("            sum(pl.creditamt) AS totalamt");
	sb.appendln("           FROM ((c_collection pl");
	sb.appendln("             JOIN c_invoice i ON ((pl.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("             JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'CO'::bpchar) AND (pl.creditamt > (0)::numeric))");
	sb.appendln("          GROUP BY i.c_pos_id, i.dateinvoiced");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'C'::text AS type,");
	sb.appendln("            1 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx AS dateinvoiced,");
	sb.appendln("            ''::character varying AS cardname,");
	sb.appendln("            ''::bpchar AS creditcardtype,");
	sb.appendln("            ''::character varying AS creditcardnumber,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            bp.name AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            ccl.amount AS cashamt,");
	sb.appendln("            0 AS totalamt");
	sb.appendln("           FROM ((c_collection c");
	sb.appendln("             JOIN c_cashline ccl ON ((c.c_cashline_id = ccl.c_cashline_id)))");
	sb.appendln("             JOIN c_bpartner bp ON ((ccl.c_bpartner_id = bp.c_bpartner_id)))");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'C'::text AS type,");
	sb.appendln("            2 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx AS dateinvoiced,");
	sb.appendln("            ''::character varying AS cardname,");
	sb.appendln("            ''::bpchar AS creditcardtype,");
	sb.appendln("            ''::character varying AS creditcardnumber,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            0 AS cashamt,");
	sb.appendln("            sum(ccl.amount) AS totalamt");
	sb.appendln("           FROM ((c_collection c");
	sb.appendln("             JOIN c_cashline ccl ON ((c.c_cashline_id = ccl.c_cashline_id)))");
	sb.appendln("             JOIN c_bpartner bp ON ((ccl.c_bpartner_id = bp.c_bpartner_id)))");
	sb.appendln("          GROUP BY c.c_pos_id, c.datetrx) cashcount");
	sb.appendln("  ORDER BY cashcount.type, cashcount.sequence, cashcount.cardname, cashcount.c_bpartner_id;");
	return sb.toString();
}
}
