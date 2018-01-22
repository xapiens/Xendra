package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getcardinginoutdata0 
{
 
@XendraFunction(Name="getcardinginoutdata",Output="record",Owner="xendra",Language="plpgsql",
Identifier="6b180697-f200-59a4-81b7-8e4b0951b7a7",
Arguments="p_client_id numeric, p_org_id numeric, p_orderline_id numeric, p_movementdate timestamp without time zone, p_movementtype text, OUT priceactual numeric, OUT costdate timestamp without time zone, OUT mov_isreturn character, OUT p_currency_id numeric",
Extension="",Synchronized="2014-02-27 10:18:28.0")
	public static final String Identifier = "6b180697-f200-59a4-81b7-8e4b0951b7a7";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_InOut_ID NUMERIC := 0;");
	sb.appendln("v_defCurrencyId NUMERIC := 0;");
	sb.appendln("v_isreturn character(1);");
	sb.appendln("v_orderLineData RECORD;");
	sb.appendln("v_orderData RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	if (\"substring\"(p_movementtype::text, 2) = '-'::text) ");
	sb.appendln("	then ");
	sb.appendln("		costdate = p_movementdate;");
	sb.appendln("		mov_isreturn = 'N';");
	sb.appendln("		priceactual = 0;");
	sb.appendln("		p_currency_id = 0;");
	sb.appendln("	else");
	sb.appendln("		--Obtengo el producto y el id de la orden.");
	sb.appendln("		select into v_orderLineData m_product_id,c_order_id,l.priceactual,c_currency_id from xendra.c_orderline l");
	sb.appendln("			where l.c_orderline_id = p_orderline_id;");
	sb.appendln("			-- Obtengo datos de la orden");
	sb.appendln("		select into v_orderData dateordered,c_conversiontype_id,c_doctype_id,ref_invoice_id from xendra.c_order o");
	sb.appendln("			where o.c_order_id = v_orderLineData.c_order_id;");
	sb.appendln("		select c_currency_id from xendra.c_acctschema where  c_acctschema.c_acctschema_id = ");
	sb.appendln("			(select c_acctschema_id from  xendra.c_acctschema_default sd  where sd.ad_client_id = p_client_id) ");
	sb.appendln("			into v_defCurrencyId;");
	sb.appendln("		select isreturn from xendra.c_doctype where c_doctype_id=v_orderData.c_doctype_id");
	sb.appendln("			and ad_client_id = p_Client_ID into v_isreturn;");
	sb.appendln("		-- Primero el costo , si es una devolucion ponemos -1 ya que dicho ");
	sb.appendln("		-- costo debera ser calculado posteriormente.");
	sb.appendln("		costDate = p_movementDate;	");
	sb.appendln("		mov_isreturn = v_isreturn;");
	sb.appendln("		p_currency_id = 0;");
	sb.appendln("		RAISE NOTICE 'DOCTYPE % y ISRETURN =  %',v_orderData.c_doctype_id,v_isreturn;");
	sb.appendln("		if (v_isreturn = 'Y'::character)");
	sb.appendln("		then		");
	sb.appendln("		--RAISE NOTICE 'DOCTYPE % y ISRETURN =  %',v_orderData.c_doctype_id,v_isreturn;");
	sb.appendln("			priceactual = -1;");
	sb.appendln("		else");
	sb.appendln("			--RAISE NOTICE 'Fecha %',v_orderData.dateordered;");
	sb.appendln("			p_currency_id = v_orderLineData.c_currency_id;");
	sb.appendln("			priceactual = xendra.currencyconvert(v_orderLineData.priceactual::numeric, 0::numeric, v_orderLineData.c_currency_id::numeric, v_defCurrencyId::numeric, ");
	sb.appendln("							v_orderData.dateordered::timestamp with time zone, v_orderData.c_conversiontype_id::numeric, p_Client_ID::numeric, p_Org_ID::numeric);");
	sb.appendln("			if priceactual is null");
	sb.appendln("			then RAISE NOTICE 'Fecha % y currency % y conversion %',v_orderData.dateordered,v_orderLineData.c_currency_id,v_orderData.c_conversiontype_id;");
	sb.appendln("			end if;");
	sb.appendln("		end if;");
	sb.appendln("		-- Determinamos la fecha que se usara para el calculo , en el caso");
	sb.appendln("		-- que no sea devoluciones sera el mismo movementdate pero si es devoulcion");
	sb.appendln("		-- sera la fecha de la guia que originalmente le dio salida al producto");
	sb.appendln("		-- para esto se buscara en la factura de referencia la guia y se extrera la fecha.	");
	sb.appendln("		if (v_isreturn = 'Y'::character)");
	sb.appendln("		then");
	sb.appendln("			-- Si hay factura referenciada se busca la guia de origen");
	sb.appendln("			-- de lo contrario usara la default de la orden de compra");
	sb.appendln("			RAISE NOTICE 'Factura Referencia %',v_orderData.ref_invoice_id;");
	sb.appendln("			if (v_orderData.ref_invoice_id is not null and v_orderData.ref_invoice_id != 0)");
	sb.appendln("			then");
	sb.appendln("				RAISE NOTICE '------------------- Buscando LA guia para %',v_orderData.ref_invoice_id;");
	sb.appendln("				-- busco la guia para la factura de referencia");
	sb.appendln("				select into v_InOut_ID");
	sb.appendln("				(select m_inout_id from m_inout where m_inout_id = (select m_inout_id from xendra.m_inoutline ol where ol.m_inoutline_id = il.m_inoutline_id))");
	sb.appendln("				from xendra.c_invoiceline il where c_invoice_id = v_orderData.ref_invoice_id limit 1;");
	sb.appendln("				-- Si existe guia , indico esa fecha como fecha de costeo.");
	sb.appendln("				-- de lo contrario se usa la de la factura que es la mas aproximada.");
	sb.appendln("				if (coalesce(v_InOut_ID,0) > 0)");
	sb.appendln("				then");
	sb.appendln("					RAISE NOTICE 'Se usa la fecha de la guia de id %',v_InOut_ID;");
	sb.appendln("					select into costDate movementdate from m_inout io");
	sb.appendln("						where io.m_inout_id = v_InOut_ID ;");
	sb.appendln("					RAISE NOTICE 'Se encontro en la guia de id % y fecha %',v_InOut_ID,costDate;");
	sb.appendln("				else");
	sb.appendln("					select into costDate dateinvoiced from xendra.c_invoice where c_invoice_id = v_orderData.ref_invoice_id;");
	sb.appendln("					RAISE NOTICE 'Se Usa la fecha de la factura %',costDate;");
	sb.appendln("				end if;");
	sb.appendln("			end if;	");
	sb.appendln("		end if;");
	sb.appendln("	end if;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2014-02-27 10:18:28.0");
	sb.appendln("@Identifier=6b180697-f200-59a4-81b7-8e4b0951b7a7");
	return sb.toString();
}
}
