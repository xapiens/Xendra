package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getcostdate0 
{
 
@XendraFunction(Name="getcostdate",Output="timestamp without time zone",Owner="xendra",
Language="plpgsql",Identifier="54a9ea0c-c25c-f108-32a7-88a3f4effb69",
Arguments="p_client_id numeric, p_org_id numeric, p_orderline_id numeric, p_movementdate timestamp without time zone, p_movementtype text",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "54a9ea0c-c25c-f108-32a7-88a3f4effb69";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_CostDate timestamp without time zone;");
	sb.appendln("BEGIN");
	sb.appendln("	select into v_CostDate (getcardinginoutdata(p_client_id, p_org_id, p_orderline_id, p_movementdate, p_movementtype )).costdate;");
	sb.appendln("	return v_CostDate;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=54a9ea0c-c25c-f108-32a7-88a3f4effb69");
	return sb.toString();
}
}
