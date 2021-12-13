package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Loaddocumentinout0 
{
 
@XendraFunction(Name="loaddocumentinout",Output="void",Owner="xendra",Language="plpgsql",
Identifier="339bb447-1903-eb56-63b8-08705f274a10",Arguments="id numeric, p_period_id numeric",
Extension="",Synchronized="2019-04-15 11:27:28.0")
	public static final String Identifier = "339bb447-1903-eb56-63b8-08705f274a10";

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
	sb.appendln("	select ad_table_id into _ad_table_id from ad_table t where  t.tablename = 'M_InOut';");
	sb.appendln("	for ar in select io.ad_client_id, io.ad_org_id,io.createdby, io.updatedby, io.isactive, ");
	sb.appendln("		io.c_bpartner_id,io.documentno,io.c_doctype_id,io.m_warehouse_id,iol.identifier, ");
	sb.appendln("		io.MovementType, iol.movementqty, iol.m_inoutline_id, iol.c_orderline_id,");
	sb.appendln("		iol.m_attributesetinstance_id, io.ad_org_id, io.docstatus,iol.m_product_id,");
	sb.appendln("		iol.m_locator_id, io.movementdate, dt.transactiontype, iol.line");
	sb.appendln("		from m_inoutline iol join m_inout io on io.m_inout_id = iol.m_inout_id ");
	sb.appendln("		join c_doctype dt on io.c_doctype_id = dt.c_doctype_id");
	sb.appendln("		LEFT JOIN  m_transaction t on t.m_inoutline_id = iol.m_inoutline_id");
	sb.appendln("		WHERE io.m_inout_id = id  AND t.m_inoutline_id ISNULL");
	sb.appendln("	LOOP");
	sb.appendln("		SELECT CASE WHEN iscostable='Y' THEN true else false END into _iscostable FROM m_product p ");
	sb.appendln("		WHERE p.m_product_id = ar.m_product_id;");
	sb.appendln("		if not _iscostable then");
	sb.appendln("			continue;");
	sb.appendln("		end if;");
	sb.appendln("		carding.c_bpartner_id := ar.c_bpartner_id;");
	sb.appendln("		carding.DocumentNo := ar.documentno;");
	sb.appendln("		carding.c_doctype_id := ar.c_doctype_id;");
	sb.appendln("		carding.m_warehouse_id := ar.m_warehouse_id;");
	sb.appendln("		carding.m_locator_id := ar.m_locator_id;");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		if right(ar.MovementType,1) = '+' then");
	sb.appendln("			carding.movementqty := ar.movementqty;");
	sb.appendln("			carding.qtyinput := ar.movementqty;");
	sb.appendln("		else");
	sb.appendln("			carding.movementqty := ar.movementqty * -1;");
	sb.appendln("			carding.qtyoutput := ar.movementqty;");
	sb.appendln("		end if;");
	sb.appendln("		carding.movementtype := ar.movementtype;");
	sb.appendln("		carding.m_inoutline_id := ar.m_inoutline_id;");
	sb.appendln("		carding.c_orderline_id := ar.c_orderline_id;");
	sb.appendln("		if (ar.m_attributesetinstance_id > 0) then");
	sb.appendln("			select count(*) into _count from m_attributesetinstance ");
	sb.appendln("				where m_attributesetinstance_id=ar.m_attributesetinstance_id;");
	sb.appendln("			if _count > 0 then");
	sb.appendln("				carding.m_attributesetinstance_id = ar.m_attributesetinstance_id;");
	sb.appendln("			else");
	sb.appendln("				carding.m_attributesetinstance_id = 0;");
	sb.appendln("				carding.errormsg := 'AttributeSetInstance bad reference';");
	sb.appendln("			end if;				");
	sb.appendln("		else");
	sb.appendln("			carding.m_attributesetinstance_id = 0;");
	sb.appendln("		end if;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;			");
	sb.appendln("		carding.ad_table_id := _ad_table_id;");
	sb.appendln("		carding.record_id := id;");
	sb.appendln("		carding.docstatus := ar.docstatus;");
	sb.appendln("		carding.c_period_id := p_period_id;");
	sb.appendln("		carding.m_transaction_id := nextval('m_transaction_seq');");
	sb.appendln("		carding.ad_client_id := ar.ad_client_id;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		carding.isactive := ar.isactive;");
	sb.appendln("		carding.created := now();");
	sb.appendln("		carding.createdby := ar.createdby;");
	sb.appendln("		carding.updated := now();");
	sb.appendln("		carding.updatedby := ar.updatedby;	");
	sb.appendln("		carding.m_product_id := ar.m_product_id;");
	sb.appendln("		carding.movementdate := ar.movementdate;");
	sb.appendln("		carding.transactiontype := ar.transactiontype;");
	sb.appendln("		carding.seqno := ar.line;");
	sb.appendln("		carding.identifier = ar.identifier;");
	sb.appendln("		carding.processed = 'N';");
	sb.appendln("		insert into m_transaction select (x).* from (select carding as x) ss;");
	sb.appendln("	end loop;");
	sb.appendln("	update m_inout set iscosted = 'Y' where m_inout_id = id;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2019-04-15 11:27:28.0");
	sb.appendln("@Identifier=339bb447-1903-eb56-63b8-08705f274a10");
	return sb.toString();
}
}
