package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Restorecashdrafted0 
{
 
@XendraFunction(Name="restorecashdrafted",Output="void",Owner="xendra",Language="plpgsql",
Identifier="fcab7c62-c198-1497-acc0-c2d2180e8203",Arguments="p_pinstance_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "fcab7c62-c198-1497-acc0-c2d2180e8203";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	p_AD_Org_ID	NUMERIC(10);");
	sb.appendln("	p_C_Cash_ID	NUMERIC(10);");
	sb.appendln("	Message		VARCHAR(2000);");
	sb.appendln("	p_IsPaid	VARCHAR(1);");
	sb.appendln("	p		RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	p_AD_Org_ID:=0;");
	sb.appendln("	p_C_Cash_ID:=0;");
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
	sb.appendln("		ELSIF (p.ParameterName = 'C_Cash_ID') THEN");
	sb.appendln("			p_C_Cash_ID := p.P_Number;");
	sb.appendln("		END IF;");
	sb.appendln("	END LOOP;	--	Get Parameter");
	sb.appendln("	--workflow");
	sb.appendln("	SELECT");
	sb.appendln("		CASE WHEN");
	sb.appendln("			count(*)>0 THEN 'Y' ELSE 'N'");
	sb.appendln("		END");
	sb.appendln("		INTO p_IsPaid");
	sb.appendln("	FROM");
	sb.appendln("		C_AllocationLine");
	sb.appendln("	WHERE");
	sb.appendln("		C_CashLine_ID IN (");
	sb.appendln("			SELECT");
	sb.appendln("				C_CashLine_ID");
	sb.appendln("			FROM");
	sb.appendln("				C_CashLine");
	sb.appendln("			WHERE");
	sb.appendln("				C_Cash_ID=p_C_Cash_ID");
	sb.appendln("			)");
	sb.appendln("	;");
	sb.appendln("	IF p_IsPaid='Y' THEN");
	sb.appendln("		Message:='Cash '||p_C_Cash_ID||' is paid. Cannot draft.';");
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
	sb.appendln("		C_Cash");
	sb.appendln("	SET");
	sb.appendln("		DocStatus='DR',");
	sb.appendln("		DocAction='CO',");
	sb.appendln("		Processing='N',");
	sb.appendln("		Processed='N',");
	sb.appendln("		Posted='N',");
	sb.appendln("		IsApproved='N'");
	sb.appendln("	WHERE");
	sb.appendln("		C_Cash_ID=p_C_Cash_ID");
	sb.appendln("	;");
	sb.appendln("	UPDATE");
	sb.appendln("		C_CashLine");
	sb.appendln("	SET");
	sb.appendln("		Processed='N'");
	sb.appendln("	WHERE");
	sb.appendln("		C_Cash_ID=p_C_Cash_ID");
	sb.appendln("	;");
	sb.appendln("	Message:='Cash '||p_C_Cash_ID||' successfully drafted.';");
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
	sb.appendln("	--delete account");
	sb.appendln("	DELETE FROM");
	sb.appendln("		fact_acct");
	sb.appendln("	WHERE");
	sb.appendln("		    AD_Table_ID=table_name2id('C_Cash')");
	sb.appendln("		AND Record_ID=p_C_Cash_ID");
	sb.appendln("	;    ");
	sb.appendln("	--delete account");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=fcab7c62-c198-1497-acc0-c2d2180e8203");
	return sb.toString();
}
}
