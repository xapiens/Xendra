package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getcostmsg0 
{
 
@XendraFunction(Name="getcostmsg",Output="character",Owner="xendra",Language="plpgsql",
Identifier="1b7d17f6-855b-2375-5cf7-533963a1a792",
Arguments="client_id numeric, costelement_id numeric, product_id numeric, date_mov timestamp without time zone, returnlast boolean",
Extension="",Synchronized="2017-03-19 06:27:26.0")
	public static final String Identifier = "1b7d17f6-855b-2375-5cf7-533963a1a792";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" msg character varying;");
	sb.appendln("_found NUMERIC := 0;");
	sb.appendln("lastcost timestamp;");
	sb.appendln("BEGIN");
	sb.appendln("select max(movementdate) into lastcost from m_costCalc ");
	sb.appendln("where iscostedok = 'Y' ");
	sb.appendln("and m_product_id = product_id");
	sb.appendln("and ad_client_id = client_id");
	sb.appendln("and m_costelement_id = costelement_id");
	sb.appendln("and movementdate <=  date_mov;");
	sb.appendln("if lastcost IS NULL THEN");
	sb.appendln("	select max(movementdate) into lastcost from m_costCalc ");
	sb.appendln("	where iscostedok = 'Y' ");
	sb.appendln("	and m_product_id = product_id");
	sb.appendln("	and ad_client_id = client_id");
	sb.appendln("	and m_costelement_id = costelement_id");
	sb.appendln("	and date_trunc('day',movementdate) <=  date_mov;");
	sb.appendln("end if;");
	sb.appendln("select errormsg from m_costcalc where movementdate = lastcost");
	sb.appendln("and m_product_id = product_id");
	sb.appendln("and ad_client_id = client_id");
	sb.appendln("and m_costelement_id = costelement_id");
	sb.appendln("into msg;");
	sb.appendln("GET DIAGNOSTICS _found = ROW_COUNT;");
	sb.appendln("if _found = 1 THEN");
	sb.appendln("	return coalesce(msg,'');");
	sb.appendln("ELSE");
	sb.appendln("	return '';");
	sb.appendln("END IF;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-03-19 06:27:26.0");
	sb.appendln("@Identifier=1b7d17f6-855b-2375-5cf7-533963a1a792");
	return sb.toString();
}
}
