package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Last_day0 
{
 
@XendraFunction(Name="last_day",Output="date",Owner="postgres",Language="sql",
Identifier="b234eee1-b0cc-5de0-4404-923a5cc205b5",Arguments="date",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "b234eee1-b0cc-5de0-4404-923a5cc205b5";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  SELECT (date_trunc('MONTH',$1) + INTERVAL  '1 MONTH - 1 day')::date;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=b234eee1-b0cc-5de0-4404-923a5cc205b5");
	return sb.toString();
}
}
