package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymenttermduedate0 
{
 
@XendraFunction(Name="paymenttermduedate",Output="timestamp without time zone",Owner="xendra",
Language="plpgsql",Identifier="aebb659f-a879-71c4-f81d-7f6c3d669903",
Arguments="integer, timestamp without time zone",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "aebb659f-a879-71c4-f81d-7f6c3d669903";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    due_date      TIMESTAMP WITHOUT TIME ZONE;");
	sb.appendln("    fixed         BOOLEAN;");
	sb.appendln("    monthOffset   INTEGER;");
	sb.appendln("    monthCutOff    INTEGER;");
	sb.appendln("    netDays       INTEGER;");
	sb.appendln("    monthDay      INTEGER;");
	sb.appendln("  BEGIN");
	sb.appendln("    IF $1 IS NULL OR $2 IS NULL THEN");
	sb.appendln("      RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln("    SELECT (t.isDueFixed = 'Y'), t.fixMonthOffset, t.fixMonthCutoff,");
	sb.appendln("        t.netdays, t.FixMonthDay");
	sb.appendln("      INTO fixed, monthOffset, monthCutOff, netDays, monthDay");
	sb.appendln("      FROM C_PaymentTerm AS t WHERE t.C_PaymentTerm_ID = $1;");
	sb.appendln("    IF fixed THEN");
	sb.appendln("      --we check if montCutOff is bigger than number of days in month.");
	sb.appendln("      IF monthCutOff > 28 THEN -- if smaller than days in february no need for further checks.");
	sb.appendln("        -- montCutOff should not be greater than number of days in month.");
	sb.appendln("        monthCutOff := LEAST(");
	sb.appendln("          EXTRACT(DAY FROM (date_trunc('month', $2) + INTERVAL '1 month' - INTERVAL '1 day'))");
	sb.appendln("          ,monthCutOff);");
	sb.appendln("      END IF;");
	sb.appendln("      IF monthCutOff < EXTRACT(DAY FROM $2) THEN");
	sb.appendln("        monthOffset := COALESCE(monthOffset,0) + 1;");
	sb.appendln("      END IF;");
	sb.appendln("      due_date := date_trunc('month', $2) + (INTERVAL '1 month' * monthOffset);");
	sb.appendln("      IF monthDay > 28 THEN");
	sb.appendln("        --monthDay should not be greater than number of days in month.");
	sb.appendln("        monthDay := LEAST(");
	sb.appendln("          EXTRACT(DAY FROM (due_date + INTERVAL '1 month' - INTERVAL '1 days'))");
	sb.appendln("          ,monthDay);");
	sb.appendln("      END IF;");
	sb.appendln("      due_date := due_date + INTERVAL '1 day' * (monthDay -1);");
	sb.appendln("    ELSE");
	sb.appendln("      due_date := $2 + (INTERVAL '1 day' * netDays);");
	sb.appendln("    END IF;");
	sb.appendln("    RETURN due_date;");
	sb.appendln("  END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=aebb659f-a879-71c4-f81d-7f6c3d669903");
	return sb.toString();
}
}
