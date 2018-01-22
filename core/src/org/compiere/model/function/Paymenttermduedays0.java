package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymenttermduedays0 
{
 
@XendraFunction(Name="paymenttermduedays",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="d8fa004b-57d9-e300-e5c6-1ab1708a2f3e",
Arguments="integer, timestamp without time zone, timestamp without time zone",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "d8fa004b-57d9-e300-e5c6-1ab1708a2f3e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    due_date      TIMESTAMP WITHOUT TIME ZONE;");
	sb.appendln("  BEGIN");
	sb.appendln("    due_date := paymenttermduedate($1,$2);");
	sb.appendln("    IF due_date IS NULL  THEN");
	sb.appendln("      RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln("    RETURN CAST(EXTRACT(DAY FROM (due_date - $3)) AS INTEGER);");
	sb.appendln("  END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=d8fa004b-57d9-e300-e5c6-1ab1708a2f3e");
	return sb.toString();
}
}
