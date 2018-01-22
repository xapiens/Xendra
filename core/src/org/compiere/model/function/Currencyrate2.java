package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencyrate2 
{
 
@XendraFunction(Name="currencyrate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="a1956af7-3cd4-45bc-af12-694776e84af3",
Arguments="p_doctype_id numeric, p_curfrom_id numeric, p_curto_id numeric, p_dateorigin timestamp with time zone, p_datepay timestamp with time zone, p_conversiontype_id numeric, p_client_id numeric, p_org_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "a1956af7-3cd4-45bc-af12-694776e84af3";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_CurrencyFrom NUMERIC;");
	sb.appendln("v_CurrencyTo NUMERIC;");
	sb.appendln("v_dateOrigin timestamp with time zone := now();");
	sb.appendln("v_datePay timestamp with time zone := now();");
	sb.appendln("v_ConversionType_ID NUMERIC := 0;");
	sb.appendln("v_Rate NUMERIC;");
	sb.appendln("c RECORD;");
	sb.appendln("-- periodo de cierre");
	sb.appendln("v_dateacctclose timestamp without time zone;");
	sb.appendln("v_conversiontypeclose_ID NUMERIC;");
	sb.appendln("--");
	sb.appendln("BEGIN");
	sb.appendln("-- No Conversion");
	sb.appendln("IF (p_CurFrom_ID = p_CurTo_ID) THEN");
	sb.appendln("RETURN 1;");
	sb.appendln("END IF;");
	sb.appendln("-- Default Date Parameter");
	sb.appendln("IF (p_dateorigin IS NOT NULL) THEN");
	sb.appendln("	v_dateOrigin := p_dateorigin;   --  SysDate");
	sb.appendln("	v_dateOrigin := date_trunc( 'day', v_dateOrigin );");
	sb.appendln("ELSE");
	sb.appendln("	RETURN NULL;");
	sb.appendln("END IF;");
	sb.appendln("IF (p_datepay IS NOT NULL) THEN");
	sb.appendln("	v_datePay := p_datepay; ");
	sb.appendln("	v_datePay := date_trunc('day', v_datePay );");
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
	sb.appendln("RAISE NOTICE 'v_dateorigin %',EXTRACT(YEAR from  v_dateorigin);");
	sb.appendln("RAISE NOTICE 'v_datepay    %',EXTRACT(YEAR from  v_datepay);");
	sb.appendln("--BEGIN");
	sb.appendln("IF p_doctype_id > 0 THEN");
	sb.appendln("	IF EXTRACT(YEAR from  v_dateorigin) != EXTRACT(YEAR FROM v_datepay) THEN");
	sb.appendln("	   SELECT date_trunc('day', dateacctclose ) INTO v_dateacctclose FROM c_year ");
	sb.appendln("		WHERE fiscalyear::int = extract(year from p_datepay)-1 AND isclosed = 'Y';   ");
	sb.appendln("	   IF NOT (v_dateacctclose is null) THEN ");
	sb.appendln("		SELECT c_conversiontypeclose_ID INTO v_conversiontypeclose_ID FROM c_doctype ");
	sb.appendln("			WHERE c_doctype_id = p_doctype_id;");
	sb.appendln("		IF NOT (v_conversiontypeclose_ID is null) THEN");
	sb.appendln("			v_ConversionType_ID = v_conversiontypeclose_ID;");
	sb.appendln("			v_dateOrigin = v_dateacctclose;	");
	sb.appendln("		END IF;");
	sb.appendln("	   END IF;");
	sb.appendln("	END IF;");
	sb.appendln("END IF;");
	sb.appendln("RAISE NOTICE 'Currency From %',v_CurrencyFrom;");
	sb.appendln("RAISE NOTICE 'Currency To   %',v_CurrencyTo;");
	sb.appendln("RAISE NOTICE 'Conversion Type %',v_ConversionType_ID;");
	sb.appendln("RAISE NOTICE 'Conv Date %',v_dateOrigin;");
	sb.appendln("RAISE NOTICE 'Client %',p_Client_ID;");
	sb.appendln("RAISE NOTICE 'Org %',p_Org_ID;");
	sb.appendln("FOR c IN SELECT MultiplyRate FROM C_Conversion_Rate");
	sb.appendln("WHERE C_Currency_ID=v_CurrencyFrom AND C_Currency_ID_To=v_CurrencyTo");
	sb.appendln(" AND C_ConversionType_ID=v_ConversionType_ID");
	sb.appendln(" AND v_dateOrigin BETWEEN ValidFrom AND ValidTo");
	sb.appendln(" AND AD_Client_ID IN (0,p_Client_ID) AND AD_Org_ID IN (0,p_Org_ID)");
	sb.appendln("ORDER BY AD_Client_ID DESC, AD_Org_ID DESC, ValidFrom DESC");
	sb.appendln("LOOP");
	sb.appendln("v_Rate := c.MultiplyRate;");
	sb.appendln("EXIT; -- only first");
	sb.appendln("END LOOP;");
	sb.appendln("--END;");
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
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=a1956af7-3cd4-45bc-af12-694776e84af3");
	return sb.toString();
}
}
