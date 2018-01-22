package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencybase2 
{
 
@XendraFunction(Name="currencybase",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="70fd22e4-623e-484e-6933-8376852623bc",
Arguments="p_amount numeric, p_curfrom_id numeric, p_convdate timestamp with time zone, p_conversiontype_id numeric, p_client_id numeric, p_org_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "70fd22e4-623e-484e-6933-8376852623bc";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/***");
	sb.appendln("* Title: Convert Amount to Base Currency of Client passsing conversiontype");
	sb.appendln("* Description:");
	sb.appendln("* Get CurrencyTo from Client");
	sb.appendln("* Returns NULL, if conversion not found");
	sb.appendln("* Standard Rounding");
	sb.appendln("* Test:");
	sb.appendln("* SELECT currencyBase(100,116,null,100000,11,null) FROM AD_System; => 64.72");
	sb.appendln("************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("v_CurTo_ID NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("-- Get Currency");
	sb.appendln("SELECT MAX(ac.C_Currency_ID)");
	sb.appendln("  INTO v_CurTo_ID");
	sb.appendln("FROM AD_ClientInfo ci, C_AcctSchema ac");
	sb.appendln("WHERE ci.C_AcctSchema1_ID=ac.C_AcctSchema_ID");
	sb.appendln("  AND ci.AD_Client_ID=p_Client_ID;");
	sb.appendln("-- Same as Currency_Conversion - if currency/rate not found - return 0");
	sb.appendln("IF (v_CurTo_ID IS NULL) THEN");
	sb.appendln("RETURN NULL;");
	sb.appendln("END IF;");
	sb.appendln("-- Same currency");
	sb.appendln("IF (p_CurFrom_ID = v_CurTo_ID) THEN");
	sb.appendln("RETURN p_Amount;");
	sb.appendln("END IF;");
	sb.appendln("RETURN currencyConvert (p_Amount, p_CurFrom_ID, v_CurTo_ID, p_ConvDate, p_ConversionType_ID, p_Client_ID, p_Org_ID);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=70fd22e4-623e-484e-6933-8376852623bc");
	return sb.toString();
}
}
