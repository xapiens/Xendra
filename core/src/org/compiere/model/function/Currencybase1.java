package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencybase1 
{
 
@XendraFunction(Name="currencybase",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="633888a9-ee9f-7646-d09c-570d01870c7e",
Arguments="p_amount numeric, p_curfrom_id numeric, p_convdate timestamp with time zone, p_client_id numeric, p_org_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "633888a9-ee9f-7646-d09c-570d01870c7e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/*************************************************************************");
	sb.appendln("* The contents of this file are subject to the Compiere License.  You may");
	sb.appendln("* obtain a copy of the License at    http://www.compiere.org/license.html");
	sb.appendln("* Software is on an  \"AS IS\" basis,  WITHOUT WARRANTY OF ANY KIND, either");
	sb.appendln("* express or implied. See the License for details. Code: Compiere ERP+CRM");
	sb.appendln("* Copyright (C) 1999-2001 Jorg Janke, ComPiere, Inc. All Rights Reserved.");
	sb.appendln("*");
	sb.appendln("* converted to postgreSQL by Karsten Thiemann (Schaeffer AG),");
	sb.appendln("* kthiemann@xendra.org");
	sb.appendln("*************************************************************************");
	sb.appendln("*");
	sb.appendln("***");
	sb.appendln("* Title: Convert Amount to Base Currency of Client");
	sb.appendln("* Description:");
	sb.appendln("* Get CurrencyTo from Client");
	sb.appendln("* Returns NULL, if conversion not found");
	sb.appendln("* Standard Rounding");
	sb.appendln("* Test:");
	sb.appendln("* SELECT currencyBase(100,116,null,11,null) FROM AD_System; => 64.72");
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
	sb.appendln("RETURN currencyConvert (p_Amount, p_CurFrom_ID, v_CurTo_ID, p_ConvDate, null, p_Client_ID, p_Org_ID);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=633888a9-ee9f-7646-d09c-570d01870c7e");
	return sb.toString();
}
}
