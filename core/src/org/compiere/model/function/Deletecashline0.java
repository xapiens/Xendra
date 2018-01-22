package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Deletecashline0 
{
 
@XendraFunction(Name="deletecashline",Output="void",Owner="xendra",Language="plpgsql",
Identifier="09a4e0d2-8a85-2b70-1a26-3521372af8d0",Arguments="p_pinstance_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "09a4e0d2-8a85-2b70-1a26-3521372af8d0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	p_AD_Org_ID	NUMERIC(10);");
	sb.appendln("	p_C_CashLine_ID	NUMERIC(10);");
	sb.appendln("	CashLineAMT	NUMERIC;");
	sb.appendln("	Message		VARCHAR(2000);");
	sb.appendln("	p_IsPaid	VARCHAR(1);");
	sb.appendln("	p		RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	p_AD_Org_ID:=0;");
	sb.appendln("	p_C_CashLine_ID:=0;");
	sb.appendln("	CashLineAMT:=0;");
	sb.appendln("	Message:='';");
	sb.appendln("	p_IsPaid:='';");
	sb.appendln("	--	Get Parameters");
	sb.appendln("	FOR p IN");
	sb.appendln("		SELECT");
	sb.appendln("			i.Record_ID,");
	sb.appendln("			i.AD_User_ID,");
	sb.appendln("			par.ParameterName,");
	sb.appendln("			par.P_String,");
	sb.appendln("			par.P_Number,");
	sb.appendln("			par.P_Date");
	sb.appendln("		FROM");
	sb.appendln("			AD_PInstance i,");
	sb.appendln("			AD_PInstance_Para par");
	sb.appendln("		WHERE");
	sb.appendln("			    i.AD_Pinstance_ID=p_PInstance_ID");
	sb.appendln("			AND i.AD_PInstance_ID=par.AD_PInstance_ID");
	sb.appendln("		ORDER BY");
	sb.appendln("			par.SeqNo");
	sb.appendln("	LOOP");
	sb.appendln("		IF (p.ParameterName = 'AD_Org_ID') THEN");
	sb.appendln("			p_AD_Org_ID := p.P_Number;");
	sb.appendln("		ELSIF (p.ParameterName = 'C_CashLine_ID') THEN");
	sb.appendln("			p_C_CashLine_ID := p.P_Number;");
	sb.appendln("		END IF;");
	sb.appendln("	END LOOP;	--	Get Parameter");
	sb.appendln("	SELECT");
	sb.appendln("		CASE WHEN");
	sb.appendln("			count(*)>0 THEN 'Y' ELSE 'N'");
	sb.appendln("		END");
	sb.appendln("		INTO p_IsPaid");
	sb.appendln("	FROM");
	sb.appendln("		C_AllocationLine");
	sb.appendln("	WHERE");
	sb.appendln("		C_CashLine_ID=p_C_CashLine_ID");
	sb.appendln("	;");
	sb.appendln("	IF p_IsPaid='Y' THEN");
	sb.appendln("		Message:='Cash Line '||p_C_CashLine_ID||' is paid. Cannot delete.';");
	sb.appendln("		UPDATE");
	sb.appendln("			AD_PInstance");
	sb.appendln("		SET");
	sb.appendln("			Updated=now(),");
	sb.appendln("			IsProcessing='N',");
	sb.appendln("			Result=0,");
	sb.appendln("			ErrorMsg=Message");
	sb.appendln("		WHERE");
	sb.appendln("			AD_PInstance_ID=p_PInstance_ID");
	sb.appendln("		;");
	sb.appendln("		RETURN;");
	sb.appendln("	END IF;");
	sb.appendln("	UPDATE");
	sb.appendln("		C_Order");
	sb.appendln("	SET");
	sb.appendln("		C_CashLine_ID=NULL");
	sb.appendln("	WHERE");
	sb.appendln("		    C_CashLine_ID=p_C_CashLine_ID");
	sb.appendln("		AND AD_Org_ID=p_AD_Org_ID");
	sb.appendln("	;");
	sb.appendln("	UPDATE");
	sb.appendln("		C_Invoice");
	sb.appendln("	SET");
	sb.appendln("		C_CashLine_ID=NULL");
	sb.appendln("	WHERE");
	sb.appendln("		    C_CashLine_ID=p_C_CashLine_ID");
	sb.appendln("		AND AD_Org_ID=p_AD_Org_ID");
	sb.appendln("	;");
	sb.appendln("	DELETE FROM");
	sb.appendln("		fact_acct");
	sb.appendln("	WHERE");
	sb.appendln("		    AD_Table_ID=table_name2id('C_Cash')");
	sb.appendln("		AND Record_ID=(");
	sb.appendln("			SELECT");
	sb.appendln("				C_Cash_ID");
	sb.appendln("			FROM");
	sb.appendln("				C_CashLine");
	sb.appendln("			WHERE");
	sb.appendln("				C_CashLine_ID=p_C_CashLine_ID");
	sb.appendln("			)");
	sb.appendln("		AND AD_Org_ID=p_AD_Org_ID");
	sb.appendln("	;");
	sb.appendln("	SELECT");
	sb.appendln("		Amount INTO CashLineAMT");
	sb.appendln("	FROM");
	sb.appendln("		C_CashLine");
	sb.appendln("	WHERE");
	sb.appendln("		    C_CashLine_ID=p_C_CashLine_ID");
	sb.appendln("		AND AD_Org_ID=p_AD_Org_ID");
	sb.appendln("	;");
	sb.appendln("	UPDATE");
	sb.appendln("		C_Cash");
	sb.appendln("	SET");
	sb.appendln("		StatementDifference=StatementDifference-CashLineAMT,");
	sb.appendln("		EndingBalance=EndingBalance-CashLineAMT");
	sb.appendln("	WHERE");
	sb.appendln("		C_Cash_ID=(");
	sb.appendln("			SELECT");
	sb.appendln("				C_Cash_ID");
	sb.appendln("			FROM");
	sb.appendln("				C_CashLine");
	sb.appendln("			WHERE");
	sb.appendln("				C_CashLine_ID=p_C_CashLine_ID");
	sb.appendln("			)");
	sb.appendln("	;");
	sb.appendln("	DELETE FROM");
	sb.appendln("		C_CashLine");
	sb.appendln("	WHERE");
	sb.appendln("		    C_CashLine_ID=p_C_CashLine_ID");
	sb.appendln("		AND AD_Org_ID=p_AD_Org_ID");
	sb.appendln("	;");
	sb.appendln("	Message:='Cash Line '||p_C_CashLine_ID||' deleted successfully';");
	sb.appendln("	UPDATE");
	sb.appendln("		AD_PInstance");
	sb.appendln("	SET");
	sb.appendln("		Updated=now(),");
	sb.appendln("		IsProcessing='N',");
	sb.appendln("		Result=1,");
	sb.appendln("		ErrorMsg=Message");
	sb.appendln("	WHERE");
	sb.appendln("		AD_PInstance_ID=p_PInstance_ID");
	sb.appendln("	;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=09a4e0d2-8a85-2b70-1a26-3521372af8d0");
	return sb.toString();
}
}
