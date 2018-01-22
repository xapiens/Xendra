package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Loaddocumentinvoice0 
{
 
@XendraFunction(Name="loaddocumentinvoice",Output="void",Owner="xendra",Language="plpgsql",
Identifier="a1b9a645-d742-a4fb-8aee-a38d668a165e",Arguments="id numeric, p_period_id numeric",
Extension="",Synchronized="2017-10-11 11:12:28.0")
	public static final String Identifier = "a1b9a645-d742-a4fb-8aee-a38d668a165e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" ar record;");
	sb.appendln(" _iscostable boolean;");
	sb.appendln(" _count	INTEGER := 0;");
	sb.appendln(" _ad_table_id numeric;");
	sb.appendln(" CARDING xendra.m_transaction%ROWTYPE;");
	sb.appendln("BEGIN    ");
	sb.appendln("	for ar in select i.ad_client_id, i.ad_org_id,i.createdby, i.updatedby, i.isactive, ");
	sb.appendln("		i.c_bpartner_id,i.documentno,i.c_doctype_id,il.identifier, ");
	sb.appendln("		i.MovementType,  il.c_invoiceline_id, il.c_orderline_id,");
	sb.appendln("		il.m_attributesetinstance_id, i.ad_org_id, i.docstatus,iol.m_product_id,");
	sb.appendln("		il.m_locator_id, i.movementdate, il.line, dt.transactiontype");
	sb.appendln("		from c_invoiceline il join c_invoice i on i.c_invoice_id = il.c_invoice_id ");
	sb.appendln("		join c_doctype dt on i.c_doctype_id = dt.c_doctype_id");
	sb.appendln("		LEFT JOIN  m_transaction t on t.c_invoiceline_id = il.c_invoiceline_id		");
	sb.appendln("		WHERE i.c_invoice_id = id AND t.c_invoiceline_id ISNULL");
	sb.appendln("	LOOP");
	sb.appendln("		SELECT CASE WHEN iscostable='Y' THEN true else false END into _iscostable FROM m_product p ");
	sb.appendln("		WHERE p.m_product_id = ar.m_product_id;");
	sb.appendln("		if not _iscostable then");
	sb.appendln("			continue;");
	sb.appendln("		end if;					");
	sb.appendln("		carding.c_bpartner_id := ar.c_bpartner_id;");
	sb.appendln("		carding.DocumentNo := ar.documentno;");
	sb.appendln("		carding.c_doctype_id := ar.c_doctype_id;			");
	sb.appendln("		select transactiontype into carding.transactiontype from c_doctype dt where dt.c_doctype_id = ar.c_doctype_id;");
	sb.appendln("		carding.m_product_id := ar.m_product_id;");
	sb.appendln("		carding.line := ar.line;");
	sb.appendln("		carding.movementdate := ar.movementdate;		");
	sb.appendln("		carding.movementqty := 0;");
	sb.appendln("		carding.c_invoiceline_id := ar.c_invoiceline_id;			");
	sb.appendln("		carding.inventorytype := ar.inventorytype;");
	sb.appendln("		carding.m_attributesetinstance_id = 0;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		select ad_table_id into _ad_table_id from ad_table t where  t.tablename = 'M_Inventory';");
	sb.appendln("		carding.ad_table_id := _ad_table_id;			");
	sb.appendln("		carding.c_period_id := p_period_id;");
	sb.appendln("		carding.record_id := id;			");
	sb.appendln("		carding.docstatus := ar.docstatus;			");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		carding.c_orderline_id := ar.c_orderline_id;			");
	sb.appendln("		carding.m_transaction_id := nextval('m_transaction_seq');");
	sb.appendln("		carding.ad_client_id := ar.ad_client_id;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		carding.isactive := ar.isactive;");
	sb.appendln("		carding.created := now();");
	sb.appendln("		carding.createdby := ar.createdby;");
	sb.appendln("		carding.updated := now();");
	sb.appendln("		carding.updatedby := ar.updatedby;	");
	sb.appendln("		carding.transactiontype := ar.transactiontype;");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		insert into m_transaction select (x).* from (select carding as x) ss;		");
	sb.appendln("	end loop;");
	sb.appendln("	update c_invoice set iscosted = 'Y' where c_invoice_id = id;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-10-11 11:12:28.0");
	sb.appendln("@Identifier=a1b9a645-d742-a4fb-8aee-a38d668a165e");
	return sb.toString();
}
}
