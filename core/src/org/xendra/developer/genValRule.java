package org.xendra.developer;

import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;

public class genValRule {
	private static CLogger log = CLogger.getCLogger(genValRule.class);
	public static void main(String[] args) {
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		log.info("ValRule   $Revision: 1.0 $");
		log.info("----------------------------------");
		//	first parameter
		String directory = System.getProperty("user.home").concat("/model/");
		if (args.length > 0)
			directory = args[0];
		if (directory == null || directory.length() == 0)
		{
			System.err.println("No Directory");
			System.exit(1);
		}
		log.info("Directory: " + directory);
		String tableLike = "'%'";	//	All tables
		if (args.length > 1)
			tableLike = args[1];
		log.info("Table Like: " + tableLike);
		
		StringBuffer sbcontainer = new StringBuffer();
		
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
			.setParameters(tableLike).first();
		List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(t.getAD_Table_ID()).list();
		String info = "";
		for (X_AD_Column column:columns) {
			if (column.getAD_Val_Rule_ID() > 0) {
				X_AD_Val_Rule valrule = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "AD_Val_Rule_ID = ?", null)
					.setParameters(column.getAD_Val_Rule_ID()).first();
				String funcname = valrule.getName();
				if (funcname.length() == 0)
					funcname = "VAL_"+valrule.getAD_Val_Rule_ID();
				else
					funcname = "VAL_"+Util.getStringclean(funcname);
				StringBuffer sb = new StringBuffer();
				if (valrule.getIdentifier() == null)
				{
					valrule.setIdentifier(Util.getUUID());
					valrule.save();
				}
				if (valrule.getSynchronized() == null)
				{
					valrule.setSynchronized(new Timestamp(System.currentTimeMillis()));
					valrule.save();
				}
				sb.append("\t@XendraValRule(")
				.append(String.format("%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Name,valrule.getName()))
				.append(String.format("\t\t%s=%s,\n",X_AD_Val_Rule.COLUMNNAME_AD_Val_Rule_ID,valrule.getAD_Val_Rule_ID()))
				.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Description,valrule.getDescription()))								
				.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Type,valrule.getType()))				
				.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_EntityType,valrule.getEntityType()))
				.append(String.format("\t\t%s=\"%s\",\n",X_AD_Val_Rule.COLUMNNAME_Identifier,valrule.getIdentifier()))
				.append(String.format("\t\t%s=\"%s\")\n",X_AD_Val_Rule.COLUMNNAME_Synchronized,valrule.getSynchronized()));			
				sb = sb.append("\tpublic static final String ").append(valrule.COLUMNNAME_Identifier)
							.append(" = \"").append(valrule.getIdentifier()).append("\";").append("\n");
				sb = sb.append("\tpublic static final String getCode() { ");
				sb = sb.append("\tStringBuilder sb = new StringBuilder(); ");
				String[] tokens = valrule.getCode().split("\n");
				for (String token:tokens)
				{
					sb = sb.append("\tsb.append(\"").append(token).append("\");");
				}
				sb.append("\treturn sb.toString();}");	
				sbcontainer = sbcontainer.append("\tpublic static final String ").append(funcname).append(String.format("=\"%s\"",valrule.getIdentifier())).append(";");
				genValRule vr = new genValRule();
				vr.createFunctionList(directory, funcname, sb);				
			}
		}		
	}
	private void createFunctionList(String directory, String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.valrule;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		header = header.append("import org.compiere.model.ValRule;\n");
		header = header.append("public class ").append(funcname).append(" implements ValRule { ");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, directory+funcname+".java");
	}
}