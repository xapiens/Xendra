package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getiocostdate0 
{
 
@XendraFunction(Name="getiocostdate",Output="timestamp without time zone",Owner="xendra",
Language="plpgsql",Identifier="dfd91aad-d0ab-9a10-46f2-648bc1e62c3e",
Arguments="p_inoutline_id numeric, p_movementtype text",Extension="",
Synchronized="2020-02-12 03:44:28.0")
	public static final String Identifier = "dfd91aad-d0ab-9a10-46f2-648bc1e62c3e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("MOVEMENT RECORD;");
	sb.appendln("v_InOut_ID NUMERIC := 0;");
	sb.appendln("v_CostDate timestamp without time zone;");
	sb.appendln("BEGIN");
	sb.appendln("	FOR MOVEMENT IN ");
	sb.appendln("	SELECT dt.isreturn, o.ref_invoice_id");
	sb.appendln("		FROM m_inoutline iol ");
	sb.appendln("		JOIN m_inout io ON iol.m_inout_id = io.m_inout_id ");
	sb.appendln("		JOIN c_orderline ol ON iol.c_orderline_id = ol.c_orderline_id");
	sb.appendln("		JOIN c_order o ON ol.c_order_id = o.c_order_id");
	sb.appendln("		JOIN c_doctype dt on io.c_doctype_id = dt.c_doctype_id WHERE iol.m_inoutline_id = p_inoutline_id");
	sb.appendln("	LOOP				");
	sb.appendln("	if (MOVEMENT.isreturn = 'Y'::character) then			");
	sb.appendln("	 if (MOVEMENT.ref_invoice_id is not null and MOVEMENT.ref_invoice_id != 0) then");
	sb.appendln("		select into v_InOut_ID");
	sb.appendln("		(select m_inout_id from m_inout where m_inout_id = ");
	sb.appendln("		(select m_inout_id from xendra.m_inoutline ol where ol.m_inoutline_id = il.m_inoutline_id))");
	sb.appendln("		from xendra.c_invoiceline il where c_invoice_id = MOVEMENT.ref_invoice_id limit 1;");
	sb.appendln("		if (coalesce(v_InOut_ID,0) > 0)");
	sb.appendln("		then");
	sb.appendln("			RAISE NOTICE 'Se usa la fecha de la guia de id %',v_InOut_ID;");
	sb.appendln("			select into v_CostDate movementdate from m_inout io");
	sb.appendln("				where io.m_inout_id = v_InOut_ID ;");
	sb.appendln("			RAISE NOTICE 'Se encontro en la guia de id % y fecha %',v_InOut_ID,v_CostDate;");
	sb.appendln("		else");
	sb.appendln("			select into v_CostDate dateinvoiced from xendra.c_invoice where c_invoice_id = MOVEMENT.ref_invoice_id;");
	sb.appendln("			RAISE NOTICE 'Se Usa la fecha de la factura %',v_CostDate;");
	sb.appendln("		end if;		 ");
	sb.appendln("	 end if;");
	sb.appendln("	end if;");
	sb.appendln("	END LOOP;");
	sb.appendln("	--");
	sb.appendln("	return v_CostDate;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2020-02-12 03:44:28.0");
	sb.appendln("@Identifier=dfd91aad-d0ab-9a10-46f2-648bc1e62c3e");
	return sb.toString();
}
}
