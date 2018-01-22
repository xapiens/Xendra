package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getnetamtbyorder0 
{
 
@XendraFunction(Name="getnetamtbyorder",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="cf80f09d-d48d-5014-eb81-7f7abdeb9e79",Arguments="pc_order_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "cf80f09d-d48d-5014-eb81-7f7abdeb9e79";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_linenetamt NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("-- Try to get price from PriceList directly");
	sb.appendln("SELECT COALESCE(SUM(ol.linenetamt),0)");
	sb.appendln("INTO v_linenetamt");
	sb.appendln("FROM xendra.c_orderline ol WHERE ol.c_order_id = pc_order_id;");
	sb.appendln("--");
	sb.appendln("RETURN v_linenetamt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=cf80f09d-d48d-5014-eb81-7f7abdeb9e79");
	return sb.toString();
}
}
