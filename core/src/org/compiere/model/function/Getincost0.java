package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getincost0 
{
 
@XendraFunction(Name="getincost",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="2a67c800-a096-bf8d-34b2-e0ad533efde0",
Arguments="client_id numeric, org_id numeric, costelement_id numeric, product_id numeric, date_mov timestamp without time zone, returnlast boolean",
Extension="",Synchronized="2015-07-07 17:30:28.0")
	public static final String Identifier = "2a67c800-a096-bf8d-34b2-e0ad533efde0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Cost NUMERIC := 0;");
	sb.appendln("lastcost timestamp;");
	sb.appendln("BEGIN");
	sb.appendln("select max(movementdate) into lastcost from m_costCalc");
	sb.appendln("where iscostedok = 'Y'");
	sb.appendln("and m_product_id = product_id");
	sb.appendln("and ad_client_id = client_id");
	sb.appendln("--and ad_org_id = 0");
	sb.appendln("and m_costelement_id = costelement_id");
	sb.appendln("and movementdate <=  date_mov;");
	sb.appendln("if lastcost IS NULL THEN");
	sb.appendln("    select max(movementdate) into lastcost from m_costCalc");
	sb.appendln("    where iscostedok = 'Y'");
	sb.appendln("    and m_product_id = product_id");
	sb.appendln("    and ad_client_id = client_id");
	sb.appendln("    --and ad_org_id = 0");
	sb.appendln("    and m_costelement_id = costelement_id");
	sb.appendln("    and date_trunc('day',movementdate) <=  date_mov;");
	sb.appendln("end if;");
	sb.appendln("select incost from m_costcalc where movementdate = lastcost");
	sb.appendln("and m_product_id = product_id");
	sb.appendln("and ad_client_id = client_id");
	sb.appendln("--and ad_org_id = 0");
	sb.appendln("and m_costelement_id = costelement_id");
	sb.appendln("into v_Cost;");
	sb.appendln("return coalesce(v_Cost,0);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-07-07 17:30:28.0");
	sb.appendln("@Identifier=2a67c800-a096-bf8d-34b2-e0ad533efde0");
	return sb.toString();
}
}
