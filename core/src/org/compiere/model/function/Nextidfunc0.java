package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Nextidfunc0 
{
 
@XendraFunction(Name="nextidfunc",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="c04faf17-7937-02fa-713c-ab3d1e6cdf9f",
Arguments="p_ad_sequence_id integer, p_system character varying",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "c04faf17-7937-02fa-713c-ab3d1e6cdf9f";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("          o_NextIDFunc INTEGER;");
	sb.appendln("  dummy INTEGER;");
	sb.appendln("BEGIN");
	sb.appendln("    o_NextIDFunc := nextid(p_AD_Sequence_ID, p_System);");
	sb.appendln("    RETURN o_NextIDFunc;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=c04faf17-7937-02fa-713c-ab3d1e6cdf9f");
	return sb.toString();
}
}
