package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getaveragecost0 
{
 
@XendraFunction(Name="getaveragecost",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="a862542e-3d74-4601-99e6-9963f27579d4",
Arguments="client_id numeric, costelement_id numeric, product_id numeric, date_mov timestamp without time zone, returnlast boolean",
Extension="",Synchronized="2015-10-29 10:55:26.0")
	public static final String Identifier = "a862542e-3d74-4601-99e6-9963f27579d4";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Cost NUMERIC := 0;");
	sb.appendln("_found NUMERIC := 0;");
	sb.appendln("lastcost timestamp;");
	sb.appendln("BEGIN");
	sb.appendln("select max(movementdate) into lastcost from m_costCalc ");
	sb.appendln("where iscostedok = 'Y' ");
	sb.appendln("and m_product_id = product_id");
	sb.appendln("and ad_client_id = client_id");
	sb.appendln("--and ad_org_id = 0");
	sb.appendln("and m_costelement_id = costelement_id");
	sb.appendln("and movementdate <=  date_mov;");
	sb.appendln("if lastcost IS NULL THEN");
	sb.appendln("	select max(movementdate) into lastcost from m_costCalc ");
	sb.appendln("	where iscostedok = 'Y' ");
	sb.appendln("	and m_product_id = product_id");
	sb.appendln("	and ad_client_id = client_id");
	sb.appendln("	--and ad_org_id = 0");
	sb.appendln("	and m_costelement_id = costelement_id");
	sb.appendln("	and date_trunc('day',movementdate) <=  date_mov;");
	sb.appendln("end if;");
	sb.appendln("select cost from m_costcalc where movementdate = lastcost");
	sb.appendln("and m_product_id = product_id");
	sb.appendln("and ad_client_id = client_id");
	sb.appendln("--and ad_org_id = 0");
	sb.appendln("and m_costelement_id = costelement_id");
	sb.appendln("into v_Cost;");
	sb.appendln("GET DIAGNOSTICS _found = ROW_COUNT;");
	sb.appendln("if _found = 1 THEN");
	sb.appendln("	return coalesce(v_Cost,0);");
	sb.appendln("ELSE");
	sb.appendln("	return -1;");
	sb.appendln("END IF;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-10-29 10:55:26.0");
	sb.appendln("@Identifier=a862542e-3d74-4601-99e6-9963f27579d4");
	return sb.toString();
}
}
