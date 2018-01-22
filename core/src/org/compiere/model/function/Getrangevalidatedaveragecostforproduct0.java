package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getrangevalidatedaveragecostforproduct0 
{
 
@XendraFunction(Name="getrangevalidatedaveragecostforproduct",Output="numeric",Owner="xendra",
Language="plpgsql",Identifier="c630903f-fd7e-396e-093d-b7ea7e96bfae",
Arguments="client_id numeric, org_id numeric, product_id numeric, datefrom timestamp without time zone, dateto timestamp without time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "c630903f-fd7e-396e-093d-b7ea7e96bfae";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("rangecost numeric := 0;");
	sb.appendln("v_Costeable character(1);");
	sb.appendln("BEGIN");
	sb.appendln("select iscostable from m_product where m_product_id = product_id");
	sb.appendln("	into v_Costeable;");
	sb.appendln("if (coalesce(v_Costeable,'N') = 'Y') then ");
	sb.appendln("	SELECT  avg(cost) into rangecost from m_costcalc where  m_product_id = product_id and movementdate between datefrom and dateto");
	sb.appendln("	AND CASE WHEN org_id = 0 then TRUE else ad_org_id = org_id END");
	sb.appendln("	AND iscostedok = 'Y';");
	sb.appendln("end if;");
	sb.appendln("return rangecost;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=c630903f-fd7e-396e-093d-b7ea7e96bfae");
	return sb.toString();
}
}
