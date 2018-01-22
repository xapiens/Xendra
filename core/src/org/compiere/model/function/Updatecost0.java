package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Updatecost0 
{
 
@XendraFunction(Name="updatecost",Output="boolean",Owner="xendra",Language="plpgsql",
Identifier="1b912262-ab2d-49da-bf21-4cf0e0f05161",
Arguments="client_id numeric, product_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "1b912262-ab2d-49da-bf21-4cf0e0f05161";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" DECLARE");
	sb.appendln(" costmethod RECORD; ");
	sb.appendln(" BEGIN");
	sb.appendln("	FOR costmethod IN SELECT * FROM M_COSTELEMENT ce WHERE ce.AD_CLIENT_ID = Client_ID");
	sb.appendln("	LOOP");
	sb.appendln("		if costmethod.costingmethod = 'A' then");
	sb.appendln("			PERFORM costaveragecalc(client_id, product_id , costmethod.m_costelement_id);");
	sb.appendln("		end if;");
	sb.appendln("	END LOOP;");
	sb.appendln("	return true;");
	sb.appendln(" END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=1b912262-ab2d-49da-bf21-4cf0e0f05161");
	return sb.toString();
}
}
