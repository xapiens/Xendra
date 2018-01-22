package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencydefault0 
{
 
@XendraFunction(Name="currencydefault",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="4a4031e0-09f6-37fc-35fe-0d57366051d1",Arguments="integer",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "4a4031e0-09f6-37fc-35fe-0d57366051d1";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    currency_default   NUMERIC;");
	sb.appendln("  BEGIN");
	sb.appendln("    IF $1 IS NULL THEN");
	sb.appendln("      RETURN NULL;");
	sb.appendln("    END IF;");
	sb.appendln("    IF $1 = 0 THEN ");
	sb.appendln("      RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln("    /*Finds out org's default currency*/    ");
	sb.appendln("    SELECT ac.C_Currency_ID ");
	sb.appendln("      INTO currency_default ");
	sb.appendln("      FROM AD_ClientInfo AS ci");
	sb.appendln("      INNER JOIN C_AcctSchema AS ac ");
	sb.appendln("      ON (ci.C_AcctSchema1_ID = ac.C_AcctSchema_ID)");
	sb.appendln("      WHERE ci.AD_Client_ID = $1;");
	sb.appendln("    RETURN currency_default; ");
	sb.appendln("  END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=4a4031e0-09f6-37fc-35fe-0d57366051d1");
	return sb.toString();
}
}
