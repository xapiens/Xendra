package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getcostdate1 
{
 
@XendraFunction(Name="getcostdate",Output="timestamp without time zone",Owner="xendra",
Language="plpgsql",Identifier="a5b3d438-ea50-74de-d8b2-c6e6086905f0",
Arguments="p_inout_id numeric, p_orderline_id numeric, p_movementtype text",Extension="",
Synchronized="2017-01-31 03:44:28.0")
	public static final String Identifier = "a5b3d438-ea50-74de-d8b2-c6e6086905f0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("MOVEMENT RECORD;");
	sb.appendln("v_InOut_ID NUMERIC := 0;");
	sb.appendln("v_CostDate timestamp without time zone;");
	sb.appendln("BEGIN");
	sb.appendln("	if (\"substring\"(p_movementtype::text, 2) = '-'::text) ");
	sb.appendln("	then ");
	sb.appendln("		v_CostDate = p_movementdate;");
	sb.appendln("	else");
	sb.appendln("		FOR MOVEMENT IN ");
	sb.appendln("		SELECT dt.isreturn, o.ref_invoice_id");
	sb.appendln("			FROM m_inout io");
	sb.appendln("			JOIN c_doctype dt on io.c_doctype_id = dt.c_doctype_id,c_order o 			");
	sb.appendln("			JOIN c_orderline ol on o.c_order_id = ol.c_order_id");
	sb.appendln("			WHERE io.m_inout_id = p_inout_id AND ol.c_orderline_id = p_orderline_id");
	sb.appendln("		LOOP				");
	sb.appendln("		if (MOVEMENT.isreturn = 'Y'::character) then			");
	sb.appendln("		 if (MOVEMENT.ref_invoice_id is not null and MOVEMENT.ref_invoice_id != 0) then");
	sb.appendln("			select into v_InOut_ID");
	sb.appendln("			(select m_inout_id from m_inout where m_inout_id = ");
	sb.appendln("			(select m_inout_id from xendra.m_inoutline ol where ol.m_inoutline_id = il.m_inoutline_id))");
	sb.appendln("			from xendra.c_invoiceline il where c_invoice_id = MOVEMENT.ref_invoice_id limit 1;");
	sb.appendln("			if (coalesce(v_InOut_ID,0) > 0)");
	sb.appendln("			then");
	sb.appendln("				RAISE NOTICE 'Se usa la fecha de la guia de id %',v_InOut_ID;");
	sb.appendln("				select into v_CostDate movementdate from m_inout io");
	sb.appendln("					where io.m_inout_id = v_InOut_ID ;");
	sb.appendln("				RAISE NOTICE 'Se encontro en la guia de id % y fecha %',v_InOut_ID,v_CostDate;");
	sb.appendln("			else");
	sb.appendln("				select into v_CostDate dateinvoiced from xendra.c_invoice where c_invoice_id = MOVEMENT.ref_invoice_id;");
	sb.appendln("				RAISE NOTICE 'Se Usa la fecha de la factura %',v_CostDate;");
	sb.appendln("			end if;		 ");
	sb.appendln("		 end if;");
	sb.appendln("		end if;");
	sb.appendln("		END LOOP;");
	sb.appendln("	end if;	");
	sb.appendln("	--");
	sb.appendln("	return v_CostDate;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-01-31 03:44:28.0");
	sb.appendln("@Identifier=a5b3d438-ea50-74de-d8b2-c6e6086905f0");
	return sb.toString();
}
}
