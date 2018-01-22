package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Paymenttermdiscount1 
{
 
@XendraFunction(Name="paymenttermdiscount",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="8fd7cb41-becc-3e43-35fa-2135fd33748c",
Arguments="p_amount numeric, p_c_currency_id integer, p_c_paymentterm_id integer, timestamp without time zone, timestamp without time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "8fd7cb41-becc-3e43-35fa-2135fd33748c";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    discount      NUMERIC;");
	sb.appendln("    discount1     NUMERIC;");
	sb.appendln("    discount2     NUMERIC;");
	sb.appendln("    discount1date DATE;");
	sb.appendln("    discount2date DATE;");
	sb.appendln("    add1date      NUMERIC;");
	sb.appendln("    add2date      NUMERIC;");
	sb.appendln("    isnextbd      BOOLEAN;");
	sb.appendln("    payDate       DATE;");
	sb.appendln("  BEGIN");
	sb.appendln("    IF p_Amount IS NULL OR p_C_Currency_ID IS NULL OR $4 IS NULL THEN");
	sb.appendln("      RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln("    IF $5 IS NULL THEN ");
	sb.appendln("      payDate := current_date;");
	sb.appendln("    ELSE");
	sb.appendln("      payDate := CAST($5 AS DATE);");
	sb.appendln("    END IF;");
	sb.appendln("    discount1date := CAST($4 AS Date);");
	sb.appendln("    discount2date := discount1date;");
	sb.appendln("    SELECT ");
	sb.appendln("        (discount1date + t.discountdays + t.gracedays),");
	sb.appendln("        (discount2date + t.discountdays2 + t.gracedays),");
	sb.appendln("        t.discount,");
	sb.appendln("        t.discount2,");
	sb.appendln("        (t.isnextbusinessday = 'Y')");
	sb.appendln("      INTO ");
	sb.appendln("        discount1date, ");
	sb.appendln("        discount2date,");
	sb.appendln("        discount1,");
	sb.appendln("        discount2,");
	sb.appendln("        isnextbd");
	sb.appendln("      FROM c_paymentterm AS t");
	sb.appendln("      WHERE c_paymentterm_id=p_C_PaymentTerm_ID;");
	sb.appendln("    --this checks only weekdays should check holidays too");
	sb.appendln("    IF isnextbd THEN");
	sb.appendln("      SELECT ");
	sb.appendln("        CASE EXTRACT(DOW FROM discount1date) ");
	sb.appendln("          WHEN 0 THEN (discount1date + 1) --sunday => monday");
	sb.appendln("          WHEN 6 THEN (discount1date + 2) --saturday => monday");
	sb.appendln("          ELSE discount1date");
	sb.appendln("        END");
	sb.appendln("      INTO discount1date;");
	sb.appendln("      SELECT ");
	sb.appendln("        CASE extract(DOW FROM discount2date) ");
	sb.appendln("          WHEN 0 THEN (discount2date + 1)");
	sb.appendln("          WHEN 6 THEN (discount2date + 2)");
	sb.appendln("          ELSE discount2date");
	sb.appendln("        END");
	sb.appendln("      INTO discount2date;");
	sb.appendln("    END IF;");
	sb.appendln("    IF payDate < discount1date THEN --Would <= be better than = ?");
	sb.appendln("      RETURN currencyround(((p_amount * discount1) / 100), p_C_Currency_ID, FALSE);");
	sb.appendln("    ELSIF payDate < discount2date THEN");
	sb.appendln("      RETURN currencyround(((p_amount * discount2) / 100), p_C_Currency_ID, FALSE);");
	sb.appendln("    ELSE");
	sb.appendln("      RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln(" END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=8fd7cb41-becc-3e43-35fa-2135fd33748c");
	return sb.toString();
}
}
