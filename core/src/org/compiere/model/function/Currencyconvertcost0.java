package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencyconvertcost0 
{
 
@XendraFunction(Name="currencyconvertcost",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="b3885240-0e6d-f957-7874-71ab23d61071",
Arguments="p_amount numeric, p_curfrom_id numeric, p_curto_id numeric, p_convdate timestamp with time zone, p_conversiontype_id numeric, p_client_id numeric, p_org_id numeric",
Extension="",Synchronized="2015-08-25 11:38:28.0")
	public static final String Identifier = "b3885240-0e6d-f957-7874-71ab23d61071";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Rate NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("-- Return Amount");
	sb.appendln("IF (p_Amount = 0 OR p_CurFrom_ID = p_CurTo_ID) THEN");
	sb.appendln("RETURN p_Amount;");
	sb.appendln("END IF;");
	sb.appendln("-- Return NULL");
	sb.appendln("IF (p_Amount IS NULL OR p_CurFrom_ID IS NULL OR p_CurTo_ID IS NULL) THEN");
	sb.appendln("RETURN NULL;");
	sb.appendln("END IF;");
	sb.appendln("-- Get Rate");
	sb.appendln("v_Rate := currencyRate (p_CurFrom_ID, p_CurTo_ID, p_ConvDate, p_ConversionType_ID, p_Client_ID, p_Org_ID);");
	sb.appendln("IF (v_Rate IS NULL) THEN");
	sb.appendln("RETURN NULL;");
	sb.appendln("END IF;");
	sb.appendln("-- Standard Precision");
	sb.appendln("RETURN currencyRound(p_Amount * v_Rate, p_CurTo_ID, 'Y');");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-08-25 11:38:28.0");
	sb.appendln("@Identifier=b3885240-0e6d-f957-7874-71ab23d61071");
	return sb.toString();
}
}
