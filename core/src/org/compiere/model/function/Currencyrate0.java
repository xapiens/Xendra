package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencyrate0 
{
 
@XendraFunction(Name="currencyrate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="5c3d0ae1-8b25-e641-c7e0-ef59338e2567",
Arguments="p_curfrom_id numeric, p_curto_id numeric, p_convdate timestamp with time zone, p_conversiontype_id numeric, p_client_id numeric, p_org_id numeric",
Extension="",Synchronized="2020-02-12 22:27:28.0")
	public static final String Identifier = "5c3d0ae1-8b25-e641-c7e0-ef59338e2567";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_CurrencyFrom NUMERIC;");
	sb.appendln("v_CurrencyTo NUMERIC;");
	sb.appendln("v_ConvDate timestamp with time zone := now();");
	sb.appendln("v_ConversionType_ID NUMERIC := 0;");
	sb.appendln("v_Rate NUMERIC;");
	sb.appendln("c RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("-- No Conversion");
	sb.appendln("IF (p_CurFrom_ID = p_CurTo_ID) THEN");
	sb.appendln("RETURN 1;");
	sb.appendln("END IF;");
	sb.appendln("-- Default Date Parameter");
	sb.appendln("IF (p_ConvDate IS NOT NULL) THEN");
	sb.appendln("	v_ConvDate := p_ConvDate;   --  SysDate");
	sb.appendln("	v_ConvDate := date_trunc( 'day', v_ConvDate );");
	sb.appendln("ELSE");
	sb.appendln("	RETURN NULL;");
	sb.appendln("END IF;");
	sb.appendln("--  Default Conversion Type");
	sb.appendln("IF (p_ConversionType_ID IS NULL OR p_ConversionType_ID = 0) THEN");
	sb.appendln("	RETURN NULL;");
	sb.appendln("ELSE ");
	sb.appendln("	v_ConversionType_ID = p_ConversionType_ID;");
	sb.appendln("END IF;");
	sb.appendln("-- Flexible Rates");
	sb.appendln("v_CurrencyFrom := p_CurFrom_ID;");
	sb.appendln("v_CurrencyTo := p_CurTo_ID;");
	sb.appendln("-- Get Rate");
	sb.appendln("BEGIN");
	sb.appendln("FOR c IN SELECT MultiplyRate FROM C_Conversion_Rate");
	sb.appendln("WHERE C_Currency_ID=v_CurrencyFrom AND C_Currency_ID_To=v_CurrencyTo");
	sb.appendln(" AND C_ConversionType_ID=v_ConversionType_ID");
	sb.appendln(" AND v_ConvDate BETWEEN ValidFrom AND ValidTo");
	sb.appendln(" AND AD_Client_ID IN (0,p_Client_ID) ");
	sb.appendln("ORDER BY AD_Client_ID DESC, ValidFrom DESC");
	sb.appendln("LOOP");
	sb.appendln("v_Rate := c.MultiplyRate;");
	sb.appendln("EXIT; -- only first");
	sb.appendln("END LOOP;");
	sb.appendln("END;");
	sb.appendln("-- Not found");
	sb.appendln("IF (v_Rate IS NULL) THEN");
	sb.appendln("RAISE NOTICE 'Conversion Rate Not Found';");
	sb.appendln("RETURN NULL;");
	sb.appendln("END IF;");
	sb.appendln("RETURN v_Rate;");
	sb.appendln("EXCEPTION WHEN OTHERS THEN");
	sb.appendln("RAISE NOTICE '%', SQLERRM;");
	sb.appendln("RETURN NULL;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2020-02-12 22:27:28.0");
	sb.appendln("@Identifier=5c3d0ae1-8b25-e641-c7e0-ef59338e2567");
	return sb.toString();
}
}
