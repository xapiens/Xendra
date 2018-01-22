package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Allocatedamtatdate0 
{
 
@XendraFunction(Name="allocatedamtatdate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="41b88441-fb43-802c-9382-1e71b1fa1e11",
Arguments="p_c_invoice_id numeric, p_c_currency_id numeric, c_conversiontype_id numeric, p_multiplierap numeric, p_statementdate timestamp without time zone",
Extension="",Synchronized="2014-01-28 01:27:28.0")
	public static final String Identifier = "41b88441-fb43-802c-9382-1e71b1fa1e11";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("  DECLARE");
	sb.appendln("    v_StatementDate timestamp with time zone := now();");
	sb.appendln("    v_PaymentAmt 	NUMERIC := 0;");
	sb.appendln("    v_MultiplierAP 	NUMERIC := 1;");
	sb.appendln("    V_Precision		NUMERIC := 2;");
	sb.appendln("    ar RECORD;");
	sb.appendln("  BEGIN");
	sb.appendln("  IF (p_StatementDate IS NOT NULL) THEN");
	sb.appendln("	v_StatementDate := p_StatementDate;   ");
	sb.appendln("  END IF;");
	sb.appendln("  IF (p_MultiplierAP IS NOT NULL) THEN");
	sb.appendln("	v_MultiplierAP := p_MultiplierAP;");
	sb.appendln("  END IF;");
	sb.appendln("SELECT StdPrecision");
	sb.appendln("    INTO v_Precision");
	sb.appendln("    FROM C_Currency");
	sb.appendln("    WHERE C_Currency_ID = p_c_currency_id;");
	sb.appendln("-- Calculate Allocated Amount");
	sb.appendln("  FOR ar IN ");
	sb.appendln("	SELECT a.AD_Client_ID, a.AD_Org_ID, ");
	sb.appendln("al.Amount, al.WithholdingAmt, al.DiscountAmt, al.WriteOffAmt, ");
	sb.appendln("a.C_Currency_ID, a.DateTrx");
	sb.appendln("FROM C_AllocationLine al");
	sb.appendln("INNER JOIN C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("WHERE al.C_Invoice_ID = p_C_Invoice_ID");
	sb.appendln("AND   a.DateTrx <= p_StatementDate");
	sb.appendln("AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("v_PaymentAmt := v_PaymentAmt");
	sb.appendln("+ currencyConvert(ar.Amount + ar.DisCountAmt + ar.WithholdingAmt + ar.WriteOffAmt,");
	sb.appendln("ar.C_Currency_ID, p_C_Currency_ID, ar.DateTrx, null, ar.AD_Client_ID, ar.AD_Org_ID);");
	sb.appendln("END LOOP;");
	sb.appendln("--");
	sb.appendln("RETURN ROUND(COALESCE(v_PaymentAmt,0), v_Precision) * v_MultiplierAP;");
	sb.appendln("  END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2014-01-28 01:27:28.0");
	sb.appendln("@Identifier=41b88441-fb43-802c-9382-1e71b1fa1e11");
	return sb.toString();
}
}
