package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencyround1 
{
 
@XendraFunction(Name="currencyround",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="5ec970d0-ca18-7ddc-ab19-28a7003d2963",
Arguments="p_amount numeric, p_curto_id numeric, p_costing character varying",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "5ec970d0-ca18-7ddc-ab19-28a7003d2963";

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
	sb.appendln("***");
	sb.appendln("* Title: Round amount for Traget Currency");
	sb.appendln("* Description:");
	sb.appendln("* Round Amount using Costing or Standard Precision");
	sb.appendln("* Returns unmodified amount if currency not found");
	sb.appendln("* Test:");
	sb.appendln("* SELECT currencyRound(currencyConvert(100,116,100,null,null),100,null) FROM AD_System => 64.72");
	sb.appendln("************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("v_StdPrecision NUMERIC;");
	sb.appendln("v_CostPrecision NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("-- Nothing to convert");
	sb.appendln("IF (p_Amount IS NULL OR p_CurTo_ID IS NULL) THEN");
	sb.appendln("RETURN p_Amount;");
	sb.appendln("END IF;");
	sb.appendln("-- Ger Precision");
	sb.appendln("SELECT MAX(StdPrecision), MAX(CostingPrecision)");
	sb.appendln("  INTO v_StdPrecision, v_CostPrecision");
	sb.appendln("FROM C_Currency");
	sb.appendln("  WHERE C_Currency_ID = p_CurTo_ID;");
	sb.appendln("-- Currency Not Found");
	sb.appendln("IF (v_StdPrecision IS NULL) THEN");
	sb.appendln("RETURN p_Amount;");
	sb.appendln("END IF;");
	sb.appendln("IF (p_Costing = 'Y') THEN");
	sb.appendln("RETURN ROUND (p_Amount, v_CostPrecision);");
	sb.appendln("END IF;");
	sb.appendln("RETURN ROUND (p_Amount, v_StdPrecision);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=5ec970d0-ca18-7ddc-ab19-28a7003d2963");
	return sb.toString();
}
}
