package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getavgcostforproduct0 
{
 
@XendraFunction(Name="getavgcostforproduct",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="b157e53d-585a-b3d4-95f2-f500c4185b42",
Arguments="client_id numeric, org_id numeric, product_id numeric, date_mov timestamp without time zone, returnlast character, isinput character",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "b157e53d-585a-b3d4-95f2-f500c4185b42";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Cost NUMERIC := 0;");
	sb.appendln("BEGIN");
	sb.appendln("	if (isInput = 'Y')");
	sb.appendln("	then");
	sb.appendln("		select xendra.getavgCostForProductInput(client_id,org_id,product_id,date_mov)");
	sb.appendln("			into v_Cost;");
	sb.appendln("	else");
	sb.appendln("		select xendra.getavgValidatedAverageCostForProduct(client_id,org_id,product_id,date_mov,returnlast)");
	sb.appendln("			into v_Cost;");
	sb.appendln("	end if;");
	sb.appendln("return v_Cost;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=b157e53d-585a-b3d4-95f2-f500c4185b42");
	return sb.toString();
}
}
