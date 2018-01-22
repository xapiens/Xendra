package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencyconvert2 
{
 
@XendraFunction(Name="currencyconvert",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="d3d8e561-af1f-0ccd-357f-d9d5d90d56a9",
Arguments="p_amount numeric, p_curfrom_id numeric, p_curto_id numeric, p_convdate timestamp with time zone, p_conversiontype_id numeric, p_client_id numeric, p_org_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "d3d8e561-af1f-0ccd-357f-d9d5d90d56a9";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/*************************************************************************");
	sb.appendln(" * The contents of this file are subject to the Compiere License.  You may");
	sb.appendln(" * obtain a copy of the License at    http://www.compiere.org/license.html ");
	sb.appendln(" * Software is on an  \"AS IS\" basis,  WITHOUT WARRANTY OF ANY KIND, either ");
	sb.appendln(" * express or implied. See the License for details. Code: Compiere ERP+CRM");
	sb.appendln(" * Copyright (C) 1999-2001 Jorg Janke, ComPiere, Inc. All Rights Reserved.");
	sb.appendln(" *");
	sb.appendln(" * converted to postgreSQL by Karsten Thiemann (Schaeffer AG), ");
	sb.appendln(" * kthiemann@xendra.org");
	sb.appendln(" *************************************************************************");
	sb.appendln(" ***");
	sb.appendln(" * Title: Convert Amount (using IDs)");
	sb.appendln(" * Description:");
	sb.appendln(" * from CurrencyFrom_ID to CurrencyTo_ID");
	sb.appendln(" * Returns NULL, if conversion not found");
	sb.appendln(" * Standard Rounding");
	sb.appendln(" * Test:");
	sb.appendln(" * SELECT currencyConvert(100,116,100,null,null,null,null) FROM AD_System;  => 64.72");
	sb.appendln(" ************************************************************************/");
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
	sb.appendln("RETURN currencyRound(p_Amount * v_Rate, p_CurTo_ID, null);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=d3d8e561-af1f-0ccd-357f-d9d5d90d56a9");
	return sb.toString();
}
}
