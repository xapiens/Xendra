package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Date_diff0 
{
 
@XendraFunction(Name="date_diff",Output="integer",Owner="xendra",Language="sql",
Identifier="c87367f3-56fc-c16f-5e4a-30f2de9e9006",Arguments="date, date",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "c87367f3-56fc-c16f-5e4a-30f2de9e9006";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("select $1-$2; ");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=c87367f3-56fc-c16f-5e4a-30f2de9e9006");
	return sb.toString();
}
}
