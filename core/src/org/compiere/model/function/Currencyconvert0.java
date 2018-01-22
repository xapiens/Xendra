package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencyconvert0 
{
 
@XendraFunction(Name="currencyconvert",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="b5ddbb3c-9a6f-a004-0253-2e6bc93769d0",
Arguments="numeric, integer, integer, timestamp without time zone, integer, integer, integer",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "b5ddbb3c-9a6f-a004-0253-2e6bc93769d0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    rate  NUMERIC;");
	sb.appendln("  BEGIN");
	sb.appendln("    IF $1 IS NULL OR $2 IS NULL OR $3 IS NULL THEN");
	sb.appendln("      RETURN NULL;");
	sb.appendln("    END IF;");
	sb.appendln("    IF $1 = 0 OR $2 = $3 THEN");
	sb.appendln("      RETURN $1;");
	sb.appendln("    END IF;");
	sb.appendln("    rate := currencyrate($2,$3,$4,$5,$6,$7);");
	sb.appendln("    IF rate IS NULL THEN");
	sb.appendln("      RETURN NULL;");
	sb.appendln("    END IF;");
	sb.appendln("    RETURN currencyround((rate * $1), $3, FALSE);");
	sb.appendln("  END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=b5ddbb3c-9a6f-a004-0253-2e6bc93769d0");
	return sb.toString();
}
}
