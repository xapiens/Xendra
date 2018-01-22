package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Loaddocumentmovement0 
{
 
@XendraFunction(Name="loaddocumentmovement",Output="void",Owner="xendra",Language="plpgsql",
Identifier="3a86bce5-2a7c-cc3c-b74c-a507a100b619",Arguments="id numeric, p_period_id numeric",
Extension="",Synchronized="2017-10-11 11:12:28.0")
	public static final String Identifier = "3a86bce5-2a7c-cc3c-b74c-a507a100b619";

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
	sb.appendln("	select ad_table_id into _ad_table_id from ad_table t where  t.tablename = 'M_Movement';");
	sb.appendln("	for ar in select m.ad_client_id, m.ad_org_id,m.createdby, m.updatedby, m.isactive, ");
	sb.appendln("		m.documentno,m.c_doctype_id,l.m_warehouse_id,ml.identifier, ");
	sb.appendln("		ml.movementqty, ml.m_movementline_id, ");
	sb.appendln("		ml.m_attributesetinstance_id, m.ad_org_id, m.docstatus,ml.m_product_id,");
	sb.appendln("		ml.m_locator_id, m.movementdate,ml.line, dt.transactiontype");
	sb.appendln("		from m_movementline ml join m_movement m on m.m_movement_id = ml.m_movement_id ");
	sb.appendln("		JOIN c_doctype dt on m.c_doctype_id = dt.c_doctype_id");
	sb.appendln("		JOIN m_locator l ON l.m_locator_id = ml.m_locator_id		");
	sb.appendln("		LEFT JOIN  m_transaction t on t.m_movementline_id = ml.m_movementline_id		");
	sb.appendln("		WHERE m.m_movement_id = id AND t.m_movementline_id ISNULL");
	sb.appendln("	LOOP");
	sb.appendln("		SELECT CASE WHEN iscostable='Y' THEN true else false END into _iscostable FROM m_product p ");
	sb.appendln("		WHERE p.m_product_id = ar.m_product_id;");
	sb.appendln("		if not _iscostable then");
	sb.appendln("			continue;");
	sb.appendln("		end if;				");
	sb.appendln("		carding.movementtype := 'M+';");
	sb.appendln("		carding.DocumentNo := ar.documentno;");
	sb.appendln("		carding.c_doctype_id := ar.c_doctype_id;");
	sb.appendln("		carding.m_warehouse_id := ar.m_warehouse_id;");
	sb.appendln("		carding.m_locator_id := ar.m_locator_id;");
	sb.appendln("		carding.m_product_id := ar.m_product_id;");
	sb.appendln("		carding.line := ar.line;");
	sb.appendln("		carding.movementdate := ar.movementdate;		");
	sb.appendln("		carding.movementqty := ar.movementqty;");
	sb.appendln("		carding.qtyinput := 0;");
	sb.appendln("		carding.qtyoutput := ar.movementqty;");
	sb.appendln("		carding.m_movementline_id := ar.m_movementline_id;");
	sb.appendln("		if (ar.m_attributesetinstance_id > 0) then");
	sb.appendln("			select count(*) into _count from m_attributesetinstance ");
	sb.appendln("				where m_attributesetinstance_id=ar.m_attributesetinstance_id;				");
	sb.appendln("			carding.m_attributesetinstance_id = ar.m_attributesetinstance_id;");
	sb.appendln("			if _count = 0 then");
	sb.appendln("				carding.errormsg := 'AttributeSetInstance bad reference';");
	sb.appendln("			end if;				");
	sb.appendln("		else");
	sb.appendln("			carding.m_attributesetinstance_id = 0;");
	sb.appendln("		end if;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;			");
	sb.appendln("		carding.ad_table_id := _ad_table_id;");
	sb.appendln("		carding.record_id := id;");
	sb.appendln("		carding.c_period_id := p_period_id;");
	sb.appendln("		carding.docstatus := ar.docstatus;			");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		carding.m_transaction_id := nextval('m_transaction_seq');");
	sb.appendln("		carding.ad_client_id := ar.ad_client_id;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		carding.isactive := ar.isactive;");
	sb.appendln("		carding.created := now();");
	sb.appendln("		carding.createdby := ar.createdby;");
	sb.appendln("		carding.updated := now();");
	sb.appendln("		carding.updatedby := ar.updatedby;							");
	sb.appendln("		carding.transactiontype := ar.transactiontype;");
	sb.appendln("		insert into m_transaction select (x).* from (select carding as x) ss;			");
	sb.appendln("		carding.movementtype := 'M-';");
	sb.appendln("		carding.DocumentNo := ar.documentno;");
	sb.appendln("		carding.c_doctype_id := ar.c_doctype_id;");
	sb.appendln("		carding.m_warehouse_id := ar.m_warehouse_id;");
	sb.appendln("		carding.m_locator_id := ar.m_locator_id;");
	sb.appendln("		carding.m_product_id := ar.m_product_id;");
	sb.appendln("		carding.line := ar.line;");
	sb.appendln("		carding.movementdate := ar.movementdate;		");
	sb.appendln("		carding.movementqty := ar.movementqty * -1;");
	sb.appendln("		carding.qtyinput := ar.movementqty;");
	sb.appendln("		carding.qtyoutput := 0;");
	sb.appendln("		carding.m_movementline_id := ar.m_movementline_id;");
	sb.appendln("		if (ar.m_attributesetinstance_id > 0) then");
	sb.appendln("			select count(*) into _count from m_attributesetinstance ");
	sb.appendln("				where m_attributesetinstance_id=ar.m_attributesetinstance_id;				");
	sb.appendln("			carding.m_attributesetinstance_id = ar.m_attributesetinstance_id;");
	sb.appendln("			if _count = 0 then");
	sb.appendln("				carding.errormsg := 'AttributeSetInstance bad reference';");
	sb.appendln("			end if;				");
	sb.appendln("		else");
	sb.appendln("			carding.m_attributesetinstance_id = 0;");
	sb.appendln("		end if;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;			");
	sb.appendln("		carding.ad_table_id := _ad_table_id;");
	sb.appendln("		carding.record_id := id;");
	sb.appendln("		carding.c_period_id := p_period_id;");
	sb.appendln("		carding.docstatus := ar.docstatus;			");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		carding.m_transaction_id := nextval('m_transaction_seq');");
	sb.appendln("		carding.ad_client_id := ar.ad_client_id;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		carding.isactive := ar.isactive;");
	sb.appendln("		carding.created := now();");
	sb.appendln("		carding.createdby := ar.createdby;");
	sb.appendln("		carding.updated := now();");
	sb.appendln("		carding.updatedby := ar.updatedby;			");
	sb.appendln("		carding.identifier := ar.identifier;				");
	sb.appendln("		insert into m_transaction select (x).* from (select carding as x) ss;					");
	sb.appendln("	end loop;");
	sb.appendln("	update m_movement set iscosted = 'Y' where m_movement_id = id;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-10-11 11:12:28.0");
	sb.appendln("@Identifier=3a86bce5-2a7c-cc3c-b74c-a507a100b619");
	return sb.toString();
}
}
