package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Loaddocumentproduction0 
{
 
@XendraFunction(Name="loaddocumentproduction",Output="void",Owner="xendra",Language="plpgsql",
Identifier="b8dbe70a-6f90-d161-1dad-64d1c85ca766",Arguments="id numeric, p_period_id numeric",
Extension="",Synchronized="2017-10-11 11:13:28.0")
	public static final String Identifier = "b8dbe70a-6f90-d161-1dad-64d1c85ca766";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" pplan record;");
	sb.appendln(" ar record;");
	sb.appendln(" _iscostable boolean;");
	sb.appendln(" _count	INTEGER := 0;");
	sb.appendln(" _ad_table_id numeric;");
	sb.appendln(" CARDING xendra.m_transaction%ROWTYPE;");
	sb.appendln("BEGIN    ");
	sb.appendln("  select ad_table_id into _ad_table_id from ad_table t where  t.tablename = 'M_Production';");
	sb.appendln("  FOR pplan in select pp.m_productionplan_id, dt.transactiontype, p.documentno, p.c_doctype_id, ");
	sb.appendln("  p.docstatus, p.movementdate");
	sb.appendln("	FROM m_productionplan pp ");
	sb.appendln("	join m_production p on p.m_production_id = pp.m_production_id ");
	sb.appendln("	join c_doctype dt on dt.c_doctype_id = p.c_doctype_id");
	sb.appendln("	where p.m_production_id = id");
	sb.appendln("  LOOP  ");
	sb.appendln("	for ar in select pp.ad_client_id, pp.ad_org_id,pp.createdby, pp.updatedby, pp.isactive, ");
	sb.appendln("		pplan.documentno,pplan.c_doctype_id,pl.identifier, ");
	sb.appendln("		pl.movementqty, pl.m_productionline_id ,");
	sb.appendln("		pl.m_attributesetinstance_id, pp.ad_org_id,  pl.m_product_id,");
	sb.appendln("		pl.m_locator_id, pl.m_productionplan_id, pl.m_productionline_id,");
	sb.appendln("		pl.line,");
	sb.appendln("		l.m_warehouse_id, CASE WHEN pl.movementqty >= 0::numeric THEN 'P+'::text ELSE 'P-'::text  END AS movementtype");
	sb.appendln("		FROM m_productionline pl join m_productionplan pp on pp.m_productionplan_id = pl.m_productionplan_id ");
	sb.appendln("		JOIN m_locator l ON l.m_locator_id = pl.m_locator_id");
	sb.appendln("		LEFT JOIN m_transaction t on t.m_productionline_id = pl.m_productionline_id");
	sb.appendln("		WHERE pp.m_productionplan_id = pplan.m_productionplan_id AND t.m_productionline_id ISNULL");
	sb.appendln("	LOOP");
	sb.appendln("		SELECT CASE WHEN iscostable='Y' THEN true else false END into _iscostable FROM m_product p ");
	sb.appendln("		WHERE p.m_product_id = ar.m_product_id;");
	sb.appendln("		if not _iscostable then");
	sb.appendln("			continue;");
	sb.appendln("		end if;		");
	sb.appendln("		carding.DocumentNo := pplan.documentno;");
	sb.appendln("		carding.c_doctype_id := pplan.c_doctype_id;");
	sb.appendln("		carding.m_warehouse_id := ar.m_warehouse_id;");
	sb.appendln("		carding.m_locator_id := ar.m_locator_id;");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		carding.movementtype := ar.movementtype;");
	sb.appendln("		if ar.movementqty > 0 then");
	sb.appendln("			carding.qtyinput := ar.movementqty;");
	sb.appendln("		else");
	sb.appendln("			carding.qtyoutput := ar.movementqty;");
	sb.appendln("		end if;			");
	sb.appendln("		carding.transactiontype := pplan.transactiontype;");
	sb.appendln("		carding.m_product_id := ar.m_product_id;	");
	sb.appendln("		carding.line := ar.line;");
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
	sb.appendln("		carding.movementdate := pplan.movementdate;		");
	sb.appendln("		carding.movementqty := ar.movementqty;");
	sb.appendln("		carding.m_productionplan_id := ar.m_productionplan_id;");
	sb.appendln("		carding.m_productionline_id := ar.m_productionline_id;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		carding.ad_table_id := _ad_table_id;");
	sb.appendln("		carding.record_id := id;						");
	sb.appendln("		carding.docstatus := pplan.docstatus;");
	sb.appendln("		carding.c_period_id := p_period_id;");
	sb.appendln("		carding.m_transaction_id := nextval('m_transaction_seq');");
	sb.appendln("		carding.ad_client_id := ar.ad_client_id;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		carding.isactive := ar.isactive;");
	sb.appendln("		carding.created := now();");
	sb.appendln("		carding.createdby := ar.createdby;");
	sb.appendln("		carding.updated := now();");
	sb.appendln("		carding.updatedby := ar.updatedby;");
	sb.appendln("		carding.transactiontype := pplan.transactiontype;	");
	sb.appendln("		carding.identifier := ar.identifier;						");
	sb.appendln("		insert into m_transaction select (x).* from (select carding as x) ss;		");
	sb.appendln("	END LOOP;");
	sb.appendln("  END LOOP;");
	sb.appendln("  update m_production set iscosted = 'Y' where m_production_id = id;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-10-11 11:13:28.0");
	sb.appendln("@Identifier=b8dbe70a-6f90-d161-1dad-64d1c85ca766");
	return sb.toString();
}
}
