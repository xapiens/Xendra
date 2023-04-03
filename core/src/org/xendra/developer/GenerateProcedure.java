package org.xendra.developer;

import java.io.File;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.logging.Level;

import org.compiere.model.MFunction;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Element;
public class GenerateProcedure {

	private String path;
	private static CLogger	log	= CLogger.getCLogger (GenerateProcedure.class);
	public GenerateProcedure(String filepath) {
		path = filepath;
	}
	public static void main(Object[] args) {
		String path = (String) args[0];
		Element e = (Element) args[1];
		CLogMgt.setLevel(Level.WARNING);		
		log.warning("Generate Procedure   $Revision: 0.1 $");
		log.warning("----------------------------------");
		log.warning("Directory: " + path);		
		MFunction func = new MFunction(Env.getCtx(), 0, null);
		func.setFunctionName(e.getAttributeValue(X_AD_Function.COLUMNNAME_Name));
		func.setComments(e.getAttributeValue(X_AD_Function.COLUMNNAME_Comments));
		func.setOutput(e.getAttributeValue(X_AD_Function.COLUMNNAME_Output));
		func.setOwner(e.getAttributeValue(X_AD_Function.COLUMNNAME_Owner));
		func.setLanguage(e.getAttributeValue(X_AD_Function.COLUMNNAME_Language));
		func.setArguments(e.getAttributeValue(X_AD_Function.COLUMNNAME_Arguments));
		func.setCode(e.getAttributeValue(X_AD_Function.COLUMNNAME_Code));
		func.setComments(e.getAttributeValue(X_AD_Function.COLUMNNAME_Comments));
		func.setIdentifier(e.getAttributeValue(X_AD_Function.COLUMNNAME_Identifier));
		String sync = e.getAttributeValue(X_AD_Function.COLUMNNAME_Synchronized);
		Timestamp tsync = Timestamp.valueOf(sync);
		func.setSynchronized(tsync);
		GenerateProcedure gp = new GenerateProcedure(path);
		int count = gp.createFunction(func);
		log.warning("Generated = " + count);
		
	}
	private int createFunction(MFunction function) {
		String funcname = Util.getStringclean(function.getFunctionName());
		StringBuffer start = new StringBuffer();
		start.append("\n@XendraFunction(");								
		Util.append(start, String.format("%s=\"%s\",",X_AD_Function.COLUMNNAME_Name, function.getFunctionName()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Function.COLUMNNAME_Output, function.getOutput()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Function.COLUMNNAME_Owner, function.getOwner()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Function.COLUMNNAME_Language, function.getLanguage()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Function.COLUMNNAME_Identifier, function.getIdentifier()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Function.COLUMNNAME_Arguments, function.getArguments()));
		Util.append(start, String.format("%s=\"%s\",",X_AD_Function.COLUMNNAME_Extension, function.getExtension()));
		Calendar cal = Calendar.getInstance();
		cal.setTime(function.getSynchronized());
		cal.set(Calendar.MILLISECOND, 0);
		long time = cal.getTimeInMillis();
		Util.append(start, String.format("%s=\"%s\")\n",X_AD_Function.COLUMNNAME_Synchronized,new Timestamp(time)));
		start = start.append("\tpublic static final String ").append(function.COLUMNNAME_Identifier)
				.append(" = \"").append(function.getIdentifier()).append("\";").append("\n");
		//
		start = start.append("\tpublic static final String getCode() { ");
		start = start.append("\tStrBuilder sb = new StrBuilder(); ");
		String[] tokens = function.getCode().split("\n");
		for (String token:tokens)
		{
			if (token.trim().length() == 0)
				continue;
			token = token.replaceAll(";", ";;");
			token = token.replaceAll("\"", "\\\\\"");
			start = start.append("\tsb.appendln(\"").append(token).append("\");");
		}
		start.append("\treturn sb.toString();}");
		//
		start = start.append("\tpublic static final String getComments() { ");
		start = start.append("\tStrBuilder sb = new StrBuilder(); ");				
		tokens = function.getComments().split("\n");
		for (String token:tokens)
		{
			token = token.replaceAll(";", ";;");
			start = start.append("\tsb.appendln(\"").append(token).append("\");");
		}
		start.append("\treturn sb.toString();}");				
		//sbcontainer = sbcontainer.append("\tpublic static final String ").append(funcname).append(String.format("=\"%s\"",function.getIdentifier())).append(";");
		//createFunction(funcname, start);				
		StringBuffer header = new StringBuffer("package org.compiere.model.function;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		header = header.append("import org.apache.commons.lang.text.StrBuilder;");

		header = header.append("public class ").append(funcname).append(" { ");
		header = header.append(start);
		header = header.append("}");
		String filename = path+funcname+".java";
		Util.writeToFile(header, filename);		
		File f = new File(filename);
		int count = 0;
		if (f.exists()) {
			count = 1;
		}
		return count;
	}

}
