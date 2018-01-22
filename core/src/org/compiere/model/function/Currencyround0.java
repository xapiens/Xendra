package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencyround0 
{
 
@XendraFunction(Name="currencyround",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="a18e203a-c446-bff2-0a3d-effd3d1ea1a3",Arguments="numeric, integer, boolean",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "a18e203a-c446-bff2-0a3d-effd3d1ea1a3";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    precision INTEGER;");
	sb.appendln("  BEGIN");
	sb.appendln("    IF $1 IS NULL OR $2 IS NULL THEN");
	sb.appendln("      RETURN $1;");
	sb.appendln("    END IF;");
	sb.appendln("    IF COALESCE($3,FALSE) THEN");
	sb.appendln("      SELECT t.CostingPrecision");
	sb.appendln("        INTO precision");
	sb.appendln("        FROM C_Currency AS t");
	sb.appendln("        WHERE C_Currency_ID = $2;");
	sb.appendln("    ELSE");
	sb.appendln("      SELECT t.stdprecision");
	sb.appendln("        INTO precision");
	sb.appendln("        FROM C_Currency AS t");
	sb.appendln("        WHERE C_Currency_ID = $2;");
	sb.appendln("    END IF; ");
	sb.appendln("    RETURN ROUND($1, precision);");
	sb.appendln("  END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=a18e203a-c446-bff2-0a3d-effd3d1ea1a3");
	return sb.toString();
}
}
