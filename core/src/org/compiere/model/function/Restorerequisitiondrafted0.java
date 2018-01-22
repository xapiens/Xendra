package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Restorerequisitiondrafted0 
{
 
@XendraFunction(Name="restorerequisitiondrafted",Output="void",Owner="xendra",Language="plpgsql",
Identifier="ea168baa-49b0-82b7-689c-7be6a9f745a6",Arguments="p_pinstance_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "ea168baa-49b0-82b7-689c-7be6a9f745a6";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	p_AD_Org_ID		NUMERIC(10);");
	sb.appendln("	p_M_Requisition_ID	NUMERIC(10);");
	sb.appendln("	Message			VARCHAR(2000);");
	sb.appendln("	p			RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	p_AD_Org_ID:=0;");
	sb.appendln("	p_M_Requisition_ID:=0;");
	sb.appendln("	Message:='';");
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
	sb.appendln("		ELSIF (p.ParameterName = 'M_Requisition_ID') THEN");
	sb.appendln("			p_M_Requisition_ID := p.P_Number;");
	sb.appendln("		END IF;");
	sb.appendln("	END LOOP;	--	Get Parameter");
	sb.appendln("	UPDATE");
	sb.appendln("		M_Requisition");
	sb.appendln("	SET");
	sb.appendln("		DocStatus='DR',");
	sb.appendln("		DocAction='CO',");
	sb.appendln("		Processing='N',");
	sb.appendln("		Processed='N',");
	sb.appendln("		Posted='N',");
	sb.appendln("		IsApproved='N'");
	sb.appendln("	WHERE");
	sb.appendln("		M_Requisition_ID=p_M_Requisition_ID");
	sb.appendln("	;");
	sb.appendln("	Message:='Requisition '||p_M_Requisition_ID||' successfully drafted.';");
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
	sb.appendln("		    AD_Table_ID=table_name2id('M_Requisition')");
	sb.appendln("		AND Record_ID=p_M_Requisition_ID");
	sb.appendln("	;");
	sb.appendln("	--delete account ");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=ea168baa-49b0-82b7-689c-7be6a9f745a6");
	return sb.toString();
}
}
