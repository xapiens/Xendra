package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getxmldocument0 
{
 
@XendraFunction(Name="getxmldocument",Output="xml",Owner="xendra",Language="sql",
Identifier="64b09e68-33b1-9b71-f8a6-8ec8aea2e7ba",Arguments="p_filename character varying",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "64b09e68-33b1-9b71-f8a6-8ec8aea2e7ba";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("---we set the end read to some big number");
	sb.appendln("-- because we are too lazy to grab the length");
	sb.appendln("-- and it will cut of at the EOF anyway");
	sb.appendln("SELECT CAST(pg_read_file(E'activedictionary/' || $1 ,0, 100000000) As xml);");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=64b09e68-33b1-9b71-f8a6-8ec8aea2e7ba");
	return sb.toString();
}
}
