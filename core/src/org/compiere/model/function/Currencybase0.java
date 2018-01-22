package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencybase0 
{
 
@XendraFunction(Name="currencybase",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="b260cc7b-0a2c-e53d-3c46-e7e2f7a69d56",
Arguments="numeric, integer, timestamp without time zone, integer, integer",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "b260cc7b-0a2c-e53d-3c46-e7e2f7a69d56";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    currency_to   INTEGER;");
	sb.appendln("  BEGIN");
	sb.appendln("    IF $1 IS NULL OR $2 IS NULL THEN");
	sb.appendln("      RETURN NULL;");
	sb.appendln("    END IF;");
	sb.appendln("    IF $1 = 0 THEN ");
	sb.appendln("      RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln("    /*Finds out org's default currency*/    ");
	sb.appendln("    SELECT ac.C_Currency_ID ");
	sb.appendln("      INTO currency_to ");
	sb.appendln("      FROM AD_ClientInfo AS ci");
	sb.appendln("      INNER JOIN C_AcctSchema AS ac ");
	sb.appendln("      ON (ci.C_AcctSchema1_ID = ac.C_AcctSchema_ID)");
	sb.appendln("      WHERE ci.AD_Client_ID = $4;");
	sb.appendln("    IF currency_to IS NULL THEN");
	sb.appendln("      RETURN NULL;");
	sb.appendln("    END IF;");
	sb.appendln("    IF $2 = currency_to THEN");
	sb.appendln("      RETURN $1;");
	sb.appendln("    END IF;");
	sb.appendln("    RETURN currencyconvert($1, $2, currency_to, $3,0,$4,$5); ");
	sb.appendln("  END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=b260cc7b-0a2c-e53d-3c46-e7e2f7a69d56");
	return sb.toString();
}
}
