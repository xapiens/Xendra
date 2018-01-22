package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Restorejournaldrafted0 
{
 
@XendraFunction(Name="restorejournaldrafted",Output="void",Owner="xendra",Language="plpgsql",
Identifier="ab00a2d6-e8c7-d6ef-402f-8e1f678d610e",Arguments="p_pinstance_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "ab00a2d6-e8c7-d6ef-402f-8e1f678d610e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	p_AD_Org_ID		NUMERIC(10);");
	sb.appendln("	p_GL_JournalBatch_ID	NUMERIC(10);");
	sb.appendln("	Message			VARCHAR(2000);");
	sb.appendln("	p			RECORD;");
	sb.appendln("	t			RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	p_AD_Org_ID := 0;");
	sb.appendln("	p_GL_JournalBatch_ID := 0;");
	sb.appendln("	Message := '';");
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
	sb.appendln("		ELSIF (p.ParameterName = 'GL_JournalBatch_ID') THEN");
	sb.appendln("			p_GL_JournalBatch_ID := p.P_Number;");
	sb.appendln("		END IF;");
	sb.appendln("	END LOOP;	--	Get Parameter");
	sb.appendln("	--workflow");
	sb.appendln("	UPDATE");
	sb.appendln("		GL_JournalBatch");
	sb.appendln("	SET");
	sb.appendln("		IsApproved='N',");
	sb.appendln("		DocStatus='DR',");
	sb.appendln("		DocAction='CO',");
	sb.appendln("		Processed='N'");
	sb.appendln("	WHERE");
	sb.appendln("		GL_JournalBatch_ID=p_GL_JournalBatch_ID");
	sb.appendln("	;");
	sb.appendln("	FOR t IN");
	sb.appendln("		SELECT");
	sb.appendln("			GL_Journal_ID");
	sb.appendln("		FROM");
	sb.appendln("			GL_Journal");
	sb.appendln("		WHERE");
	sb.appendln("			GL_JournalBatch_ID=p_GL_JournalBatch_ID");
	sb.appendln("		ORDER BY");
	sb.appendln("			Created DESC");
	sb.appendln("	LOOP");
	sb.appendln("		UPDATE");
	sb.appendln("			GL_Journal");
	sb.appendln("		SET");
	sb.appendln("			IsApproved='N',");
	sb.appendln("			DocStatus='DR',");
	sb.appendln("			DocAction='CO',");
	sb.appendln("			Processed='N',");
	sb.appendln("			Posted='N'");
	sb.appendln("		WHERE");
	sb.appendln("			    GL_Journal_ID=t.GL_Journal_ID");
	sb.appendln("			AND AD_Org_ID=p_AD_Org_ID");
	sb.appendln("		;");
	sb.appendln("		UPDATE");
	sb.appendln("			GL_JournalLine");
	sb.appendln("		SET");
	sb.appendln("			Processed='N'");
	sb.appendln("		WHERE");
	sb.appendln("			GL_Journal_ID=t.GL_Journal_ID");
	sb.appendln("		;");
	sb.appendln("		DELETE FROM");
	sb.appendln("			fact_acct");
	sb.appendln("		WHERE");
	sb.appendln("			    AD_Table_ID=table_name2id('GL_Journal')");
	sb.appendln("			AND Record_ID=t.GL_Journal_ID");
	sb.appendln("		;");
	sb.appendln("	END LOOP;");
	sb.appendln("	Message:='Journal Batch '||p_GL_JournalBatch_ID||' successfully drafted.';  ");
	sb.appendln("	UPDATE");
	sb.appendln("		AD_PInstance");
	sb.appendln("	SET");
	sb.appendln("		Updated=now(),");
	sb.appendln("		IsProcessing='Y',");
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
	sb.appendln("@Identifier=ab00a2d6-e8c7-d6ef-402f-8e1f678d610e");
	return sb.toString();
}
}
