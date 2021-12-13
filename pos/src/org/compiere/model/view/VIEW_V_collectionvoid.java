package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_V_collectionvoid 
{
 	@XendraView(Identifier="595cde0d-a0d9-463a-bf7f-643beae8784a",
Synchronized="2020-01-17 17:03:03.0",
Name="v_collectionvoid",
Owner="postgres",
Extension="")
	public static final String Identifier = "595cde0d-a0d9-463a-bf7f-643beae8784a";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2020-01-17 17:03:03.433");
	sb.appendln("@Identifier=595cde0d-a0d9-463a-bf7f-643beae8784a");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" SELECT collectionvoid.type,");
	sb.appendln("    collectionvoid.sequence,");
	sb.appendln("    collectionvoid.c_pos_id,");
	sb.appendln("    collectionvoid.datetrx,");
	sb.appendln("    collectionvoid.documentno,");
	sb.appendln("    collectionvoid.payamt,");
	sb.appendln("    collectionvoid.c_bpartner_id,");
	sb.appendln("    collectionvoid.creditamt,");
	sb.appendln("    collectionvoid.cashamt");
	sb.appendln("   FROM ( SELECT 'C'::text AS type,");
	sb.appendln("            1 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx,");
	sb.appendln("            i.documentno,");
	sb.appendln("            c.payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            0 AS cashamt");
	sb.appendln("           FROM (c_collection c");
	sb.appendln("             JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'VO'::bpchar) AND (c.payamt > (0)::numeric))");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'C'::text AS type,");
	sb.appendln("            2 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx,");
	sb.appendln("            ''::character varying AS documentno,");
	sb.appendln("            sum(c.payamt) AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            0 AS cashamt");
	sb.appendln("           FROM (c_collection c");
	sb.appendln("             JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'VO'::bpchar) AND (c.payamt > (0)::numeric))");
	sb.appendln("          GROUP BY c.c_pos_id, c.datetrx");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'D'::text AS type,");
	sb.appendln("            1 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx,");
	sb.appendln("            i.documentno,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            bp.name AS c_bpartner_id,");
	sb.appendln("            c.creditamt,");
	sb.appendln("            0 AS cashamt");
	sb.appendln("           FROM ((c_collection c");
	sb.appendln("             JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("             JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'VO'::bpchar) AND (c.creditamt > (0)::numeric))");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'D'::text AS type,");
	sb.appendln("            2 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx,");
	sb.appendln("            ''::character varying AS documentno,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            sum(c.creditamt) AS creditamt,");
	sb.appendln("            0 AS cashamt");
	sb.appendln("           FROM ((c_collection c");
	sb.appendln("             JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("             JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'VO'::bpchar) AND (c.creditamt > (0)::numeric))");
	sb.appendln("          GROUP BY c.c_pos_id, c.datetrx");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'E'::text AS type,");
	sb.appendln("            1 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx,");
	sb.appendln("            i.documentno,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            c.cashamt");
	sb.appendln("           FROM (c_collection c");
	sb.appendln("             JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'VO'::bpchar) AND (c.cashamt > (0)::numeric))");
	sb.appendln("        UNION ALL");
	sb.appendln("         SELECT 'E'::text AS type,");
	sb.appendln("            2 AS sequence,");
	sb.appendln("            c.c_pos_id,");
	sb.appendln("            c.datetrx,");
	sb.appendln("            ''::character varying AS documentno,");
	sb.appendln("            0 AS payamt,");
	sb.appendln("            ''::text AS c_bpartner_id,");
	sb.appendln("            0 AS creditamt,");
	sb.appendln("            sum(c.cashamt) AS cashamt");
	sb.appendln("           FROM (c_collection c");
	sb.appendln("             JOIN c_invoice i ON ((c.c_invoice_id = i.c_invoice_id)))");
	sb.appendln("          WHERE ((i.docstatus = 'VO'::bpchar) AND (c.cashamt > (0)::numeric))");
	sb.appendln("          GROUP BY c.c_pos_id, c.datetrx) collectionvoid");
	sb.appendln("  ORDER BY collectionvoid.type, collectionvoid.sequence;");
	return sb.toString();
}
}
