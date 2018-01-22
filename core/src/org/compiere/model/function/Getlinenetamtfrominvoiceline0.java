package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getlinenetamtfrominvoiceline0 
{
 
@XendraFunction(Name="getlinenetamtfrominvoiceline",Output="numeric",Owner="xendra",
Language="plpgsql",Identifier="83e9a130-f50a-85ef-aac6-4ee327cfb2f2",
Arguments="ad_client_id numeric, ad_org_id numeric, _invoiceline_id numeric, ass_c_currency_id numeric, _movementdate timestamp without time zone",
Extension="",Synchronized="2015-10-17 16:40:00.0")
	public static final String Identifier = "83e9a130-f50a-85ef-aac6-4ee327cfb2f2";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("   _linenetamt		numeric := 0;");
	sb.appendln("   _c_currency_id	numeric := 0;");
	sb.appendln("   _c_conversiontype_id numeric := 0;");
	sb.appendln("   _istaxincluded	BOOLEAN := false;");
	sb.appendln("   _c_tax_id		NUMERIC	:= 0;");
	sb.appendln("   _rate		numeric := 0;");
	sb.appendln("   _found   		numeric := 0;");
	sb.appendln("  BEGIN");
	sb.appendln("	SELECT il.linenetamt,");
	sb.appendln("	  i.c_currency_id,");
	sb.appendln("	  i.c_conversiontype_id,");
	sb.appendln("	  i.istaxincluded='Y',");
	sb.appendln("	  il.c_tax_id ");
	sb.appendln("	  into _linenetamt,_c_currency_id, _c_conversiontype_id,_istaxincluded,_c_tax_id");
	sb.appendln("	  FROM ");
	sb.appendln("	  c_invoiceline il ");
	sb.appendln("	  join c_invoice i on il.c_invoice_id = i.c_invoice_id");
	sb.appendln("	  WHERE il.c_invoiceline_id = _InvoiceLine_ID;	");
	sb.appendln("	  raise notice '_linenetamt %',_linenetamt;	         ");
	sb.appendln("	IF _istaxincluded AND _rate > 0 AND _linenetamt > 0 then");
	sb.appendln("	  SELECT rate into _rate FROM c_tax ");
	sb.appendln("	    WHERE c_tax_id = _c_tax_id;");
	sb.appendln("	  GET DIAGNOSTICS _found = ROW_COUNT;	 																												");
	sb.appendln("	  IF _found = 1 THEN							   ");
	sb.appendln("	    _rate = _rate / 100;");
	sb.appendln("	    _rate = 1 + _rate;");
	sb.appendln("	    _linenetamt := round(_linenetamt / _rate,2);");
	sb.appendln("	  END IF;");
	sb.appendln("	END IF;			   ");
	sb.appendln("	_linenetamt = currencyconvertcost(_linenetamt::numeric,_c_currency_id, ass_c_currency_id,");
	sb.appendln("	_movementdate,_c_conversiontype_id::numeric, AD_Client_ID, AD_ORG_ID);");
	sb.appendln("	_linenetamt = COALESCE(_linenetamt,0);");
	sb.appendln("	return _linenetamt;");
	sb.appendln("  END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-10-17 16:40:00.0");
	sb.appendln("@Identifier=83e9a130-f50a-85ef-aac6-4ee327cfb2f2");
	return sb.toString();
}
}
