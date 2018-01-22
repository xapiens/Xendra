package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Invalidateaveragecostforproduct0 
{
 
@XendraFunction(Name="invalidateaveragecostforproduct",Output="numeric",Owner="postgres",
Language="plpgsql",Identifier="60006772-9f13-7e3a-4137-7a275020e6d7",
Arguments="client_id numeric, product_id numeric, date_mov timestamp without time zone, costelement_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "60006772-9f13-7e3a-4137-7a275020e6d7";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_CostCalc_Id NUMERIC := 0;");
	sb.appendln("v_minDate TIMESTAMP without time zone := null;");
	sb.appendln("v_maxDate TIMESTAMP without time zone := null;");
	sb.appendln("BEGIN");
	sb.appendln("-- Search the minimun and maximun date  cost processed. For the cost processor");
	sb.appendln("-- when no movemnts are found between inputs the year is 1969.");
	sb.appendln("select  into v_minDate,v_maxDate");
	sb.appendln("   min(least(movementdate,omovementdate)),max(greatest(movementdate,omovementdate))");
	sb.appendln("   from m_costcalc");
	sb.appendln("   where m_product_id = product_id");
	sb.appendln("              and ad_client_id = client_id and ad_org_id=0");
	sb.appendln("              and m_costelement_id = costelement_id");
	sb.appendln("              and ismanual = 'N'");
	sb.appendln("              and date_part('year',movementdate) > 1969");
	sb.appendln("              and date_part('year',omovementdate) > 1969;");
	sb.appendln("-- If the dates are invalid means no records , no calculated costs for the");
	sb.appendln("-- product.");
	sb.appendln("if coalesce(v_minDate,'1900-01-01 00:00:00') = '1900-01-01 00:00:00' and coalesce(v_maxDate,'1900-01-01 00:00:00') = '1900-01-01 00:00:00'");
	sb.appendln("then");
	sb.appendln("   return 0;");
	sb.appendln("end if;");
	sb.appendln("-- If the required date is minor than the min calculated date");
	sb.appendln("-- we need the first costcalc_id to be invalidated.");
	sb.appendln("if date_mov <= v_minDate");
	sb.appendln("then");
	sb.appendln("      select min(m_costcalc_id) from m_costcalc");
	sb.appendln("              where m_product_id = product_id");
	sb.appendln("                      and ad_client_id = client_id and ad_org_id=0");
	sb.appendln("                      and m_costelement_id = costelement_id");
	sb.appendln("                      and ismanual = 'N'");
	sb.appendln("      into v_CostCalc_Id;");
	sb.appendln("else");
	sb.appendln("   -- if the required date is minor than the max date we search");
	sb.appendln("   -- the calculated record to invalidate.");
	sb.appendln("   -- Otherwise nothing to invalidate");
	sb.appendln("   if date_mov <= v_maxDate");
	sb.appendln("   then");
	sb.appendln("          select max(m_costcalc_id) from m_costcalc");
	sb.appendln("              where m_product_id = product_id");
	sb.appendln("                  and ad_client_id = client_id and ad_org_id=0");
	sb.appendln("                  and m_costelement_id = costelement_id");
	sb.appendln("                  and ismanual = 'N'");
	sb.appendln("                  and date_mov >= movementdate");
	sb.appendln("          into v_CostCalc_Id;");
	sb.appendln("   end if;");
	sb.appendln("end if;");
	sb.appendln("-- if after that cost calc id is null means not records");
	sb.appendln("-- for the product , otherwise invalidate the found cost calc");
	sb.appendln("-- entry.");
	sb.appendln("if coalesce(v_CostCalc_Id,0) != 0");
	sb.appendln("then");
	sb.appendln("      update m_costcalc set iscostedok = 'N'");
	sb.appendln("              where m_costcalc_id = v_CostCalc_ID");
	sb.appendln("                      and ad_client_id = client_id");
	sb.appendln("                      and ad_org_id=0");
	sb.appendln("                      and ismanual = 'N'");
	sb.appendln("                      and m_costelement_id = v_costelement_id;");
	sb.appendln("end if;");
	sb.appendln("-- If its 0 nothing to do otherwise returns the cost calc");
	sb.appendln("--  id invalidated.");
	sb.appendln("return coalesce(v_CostCalc_Id,0);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=60006772-9f13-7e3a-4137-7a275020e6d7");
	return sb.toString();
}
}
