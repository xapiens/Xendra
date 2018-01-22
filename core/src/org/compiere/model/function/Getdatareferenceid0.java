package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getdatareferenceid0 
{
 
@XendraFunction(Name="getdatareferenceid",Output="character",Owner="xendra",Language="plpgsql",
Identifier="33d74678-38c4-6fd1-5113-265c0ac769db",Arguments="namedatareference character",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "33d74678-38c4-6fd1-5113-265c0ac769db";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" DECLARE");
	sb.appendln("    refid numeric;");
	sb.appendln(" BEGIN");
	sb.appendln("    SELECT ad_reference_id into refid FROM ad_reference where name = namedatareference;");
	sb.appendln("    return refid;");
	sb.appendln(" END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=33d74678-38c4-6fd1-5113-265c0ac769db");
	return sb.toString();
}
}
