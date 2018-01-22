package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Restoreorderdrafted0 
{
 
@XendraFunction(Name="restoreorderdrafted",Output="void",Owner="xendra",Language="plpgsql",
Identifier="472cc3ed-ee6e-fc2d-d03e-e3dc4d6e085b",Arguments="p_pinstance_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "472cc3ed-ee6e-fc2d-d03e-e3dc4d6e085b";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	p_AD_Org_ID	NUMERIC(10);");
	sb.appendln("	p_C_Order_ID	NUMERIC(10);");
	sb.appendln("	Message		VARCHAR(2000);");
	sb.appendln("	bHasInvoice	VARCHAR(1);");
	sb.appendln("	p		RECORD;");
	sb.appendln("	r		NUMERIC(10);");
	sb.appendln("BEGIN");
	sb.appendln("	p_AD_Org_ID := 0;");
	sb.appendln("	p_C_Order_ID := 0;");
	sb.appendln("	Message := '';");
	sb.appendln("	bHasInvoice := '';");
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
	sb.appendln("		ELSIF (p.ParameterName = 'C_Order_ID') THEN");
	sb.appendln("			p_C_Order_ID := p.P_Number;");
	sb.appendln("		END IF;");
	sb.appendln("	END LOOP;	--	Get Parameter");
	sb.appendln("	SELECT");
	sb.appendln("		C_Order_ID INTO r");
	sb.appendln("	FROM");
	sb.appendln("		C_Invoice");
	sb.appendln("	WHERE");
	sb.appendln("		C_Order_ID=p_C_Order_ID");
	sb.appendln("	;");
	sb.appendln("	IF FOUND THEN");
	sb.appendln("		bHasInvoice:='Y';");
	sb.appendln("	ELSE");
	sb.appendln("		bHasInvoice:='N';");
	sb.appendln("	END IF;");
	sb.appendln("	IF (bHasInvoice='Y') THEN");
	sb.appendln("		Message:='Order '||p_C_Order_ID||' has an Invoice. Please delete it first.';");
	sb.appendln("		UPDATE");
	sb.appendln("			AD_PInstance");
	sb.appendln("		SET");
	sb.appendln("			Updated = now(),");
	sb.appendln("			IsProcessing='N',");
	sb.appendln("			Result = 0,");
	sb.appendln("			ErrorMsg = Message");
	sb.appendln("		WHERE");
	sb.appendln("			AD_PInstance_ID=p_PInstance_ID");
	sb.appendln("		;");
	sb.appendln("		RETURN;");
	sb.appendln("	END IF;");
	sb.appendln("	UPDATE");
	sb.appendln("		C_Order");
	sb.appendln("	SET");
	sb.appendln("		DOCSTATUS='DR',");
	sb.appendln("		DOCACTION='CO',");
	sb.appendln("		PROCESSING='N',");
	sb.appendln("		PROCESSED='N',");
	sb.appendln("		POSTED='N',");
	sb.appendln("		ISAPPROVED='N'");
	sb.appendln("	WHERE");
	sb.appendln("		C_Order_ID=p_C_Order_ID");
	sb.appendln("	;");
	sb.appendln("	UPDATE");
	sb.appendln("		C_OrderLine");
	sb.appendln("	SET");
	sb.appendln("		PROCESSED='N'");
	sb.appendln("	WHERE");
	sb.appendln("		C_Order_ID=p_C_Order_ID");
	sb.appendln("	;");
	sb.appendln("	Message := 'Order '||p_C_Order_ID|| ' succesfully drafted';");
	sb.appendln("	UPDATE");
	sb.appendln("		AD_PInstance");
	sb.appendln("	SET");
	sb.appendln("		Updated=now(),");
	sb.appendln("		IsProcessing='Y',");
	sb.appendln("		Result = 1,");
	sb.appendln("		ErrorMsg = Message");
	sb.appendln("	WHERE");
	sb.appendln("		AD_PInstance_ID=p_PInstance_ID");
	sb.appendln("	;  ");
	sb.appendln("	--delete account");
	sb.appendln("	DELETE FROM");
	sb.appendln("		fact_acct");
	sb.appendln("	WHERE");
	sb.appendln("		    ad_table_id=table_name2id('C_Order')");
	sb.appendln("		AND Record_ID=p_C_Order_ID");
	sb.appendln("	;");
	sb.appendln("	--delete account");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=472cc3ed-ee6e-fc2d-d03e-e3dc4d6e085b");
	return sb.toString();
}
}
