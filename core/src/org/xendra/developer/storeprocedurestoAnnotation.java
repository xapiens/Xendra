/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2012 Francisco Morosini, Inc. All Rights Reserve             *
 * This program is free software;											  *
 you can redistribute it and/or modify it    								  *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.xendra.developer;

import org.compiere.model.MFunction;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.*;

public class storeprocedurestoAnnotation extends SvrProcess {	
	private String path = System.getProperty("user.home").concat("/model/");
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	public static String getSQLAllStoreProcedures(String filtername, String arguments)
	{
		StringBuffer sql = new StringBuffer(" SELECT p.proname as functionname,") 
		.append(" CASE WHEN p.proretset THEN 'setof ' ELSE '' END || ")
		.append("  pg_catalog.format_type(p.prorettype, NULL) as output,")
		.append("  CASE WHEN proallargtypes IS NOT NULL THEN")
		.append("    pg_catalog.array_to_string(ARRAY(")
		.append("      SELECT")
		.append("        CASE")
		.append("          WHEN p.proargmodes[s.i] = 'i' THEN ''")
		.append("          WHEN p.proargmodes[s.i] = 'o' THEN 'OUT '")
		.append("          WHEN p.proargmodes[s.i] = 'b' THEN 'INOUT '")
		.append("        END ||")
		.append("        CASE")
		.append("         WHEN COALESCE(p.proargnames[s.i], '') = '' THEN ''")
		.append("          ELSE p.proargnames[s.i] || ' ' ")
		.append("        END ||")
		.append("        pg_catalog.format_type(p.proallargtypes[s.i], NULL)")
		.append("      FROM")
		.append("        pg_catalog.generate_series(1,")
		.append(" pg_catalog.array_upper(p.proallargtypes, 1)) AS s(i)")
		.append("    ), ', ')")
		.append("  ELSE")
		.append("    pg_catalog.array_to_string(ARRAY(")
		.append("      SELECT")
		.append("        CASE")
		.append("          WHEN COALESCE(p.proargnames[s.i+1], '') = '' THEN ''")
		.append("          ELSE p.proargnames[s.i+1] || ' '")
		.append("          END ||")
		.append("        pg_catalog.format_type(p.proargtypes[s.i], NULL)")
		.append("      FROM")
		.append("        pg_catalog.generate_series(0,")
		.append("pg_catalog.array_upper(p.proargtypes, 1)) AS s(i)")
		.append("    ), ', ')")
		.append("  END AS arguments,")
		.append("  r.rolname as owner,")
		.append("  l.lanname as language,")
		.append("  prosrc as sourcecode,")
		.append("  pg_catalog.obj_description(p.oid, 'pg_proc') as comments")
		.append("  FROM pg_catalog.pg_proc p")
		.append("     LEFT JOIN pg_catalog.pg_namespace n ON n.oid = p.pronamespace")
		.append("     LEFT JOIN pg_catalog.pg_language l ON l.oid = p.prolang")
		.append("     JOIN pg_catalog.pg_roles r ON r.oid = p.proowner")
		.append("  WHERE p.prorettype <> 'pg_catalog.cstring'::pg_catalog.regtype")
		.append("      AND (p.proargtypes[0] IS NULL")
		.append("      OR   p.proargtypes[0] <> 'pg_catalog.cstring'::pg_catalog.regtype)")
		.append("      AND NOT p.proisagg");
		if (filtername.length() > 0)
			sql.append(" AND  p.proname = '"+filtername+"'");
		if (arguments.length() > 0)
		{
			sql.append(" AND CASE WHEN proallargtypes IS NOT NULL THEN")
			.append("    pg_catalog.array_to_string(ARRAY(")
			.append("      SELECT")
			.append("        CASE")
			.append("          WHEN p.proargmodes[s.i] = 'i' THEN ''")
			.append("          WHEN p.proargmodes[s.i] = 'o' THEN 'OUT '")
			.append("          WHEN p.proargmodes[s.i] = 'b' THEN 'INOUT '")
			.append("        END ||")
			.append("        CASE")
			.append("         WHEN COALESCE(p.proargnames[s.i], '') = '' THEN ''")
			.append("          ELSE p.proargnames[s.i] || ' ' ")
			.append("        END ||")
			.append("        pg_catalog.format_type(p.proallargtypes[s.i], NULL)")
			.append("      FROM")
			.append("        pg_catalog.generate_series(1,")
			.append(" pg_catalog.array_upper(p.proallargtypes, 1)) AS s(i)")
			.append("    ), ', ')")
			.append("  ELSE")
			.append("    pg_catalog.array_to_string(ARRAY(")
			.append("      SELECT")
			.append("        CASE")
			.append("          WHEN COALESCE(p.proargnames[s.i+1], '') = '' THEN ''")
			.append("          ELSE p.proargnames[s.i+1] || ' '")
			.append("          END ||")
			.append("        pg_catalog.format_type(p.proargtypes[s.i], NULL)")
			.append("      FROM")
			.append("        pg_catalog.generate_series(0,")
			.append("pg_catalog.array_upper(p.proargtypes, 1)) AS s(i)")
			.append("    ), ', ')")
			.append("  END = '"+arguments+"'");
			//.append(" AND arguments = '"+arguments+"'");
		}
		sql.append(" AND nspname = 'xendra' and l.lanname != 'c' ");
		sql.append(" ORDER BY 1, 2, 3, 4 ;		");	
		return sql.toString();
	}

	protected String doIt () throws Exception 
	{
		// obtenemos todos los store procedures de la DB.				
		PreparedStatement pstmt = null;
		try
		{
			int noupdates = DB.executeUpdate("UPDATE AD_Function set IsActive = 'N';", null);
			//StringBuffer sbcontainer = new StringBuffer();
			pstmt = DB.prepareStatement (getSQLAllStoreProcedures("",""), get_TrxName());
			ResultSet rs = pstmt.executeQuery ();
			String classname = "";
			String functionname = "";
			String previousfunctionname = "";
			String output = "";
			String arguments = "";
			String owner = "";
			String language = "";
			String sourcecode = "";
			String comments = "";			
			int sequence = 0;
			while (rs.next ())
			{				
				String extension = "";				
				functionname = Util.getvalue(rs, "functionname");
				classname = functionname;
				if (previousfunctionname.equals(functionname))
					sequence ++;
				else
				    sequence = 0;
				previousfunctionname = functionname;				
				classname += String.valueOf(sequence);
				output = Util.getvalue(rs, "output");
				arguments = Util.getvalue(rs, "arguments");
				owner = Util.getvalue(rs, "owner");
				language = Util.getvalue(rs, "language");
				sourcecode = Util.getvalue(rs, "sourcecode");				
				comments = Util.getvalue(rs, "comments");
				// parseamos
				Timestamp currentSynchro = null;
				String Identifier = null;
				String fsIdentifier = null;

				Hashtable props = Util.getProperties(comments);
				Iterator keys = props.keySet().iterator();
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (key.equals("updated"))
					{
						props.remove(key);
						key = MFunction.COLUMNNAME_Synchronized;
						props.put(key, value);
						keys = props.keySet().iterator();
						continue;
					}	
					else if (key.equals("uuid"))
					{
						props.remove(key);
						if (((String) value).length() > 36)
							value = ((String) value).substring(0, 36);
						key = MFunction.COLUMNNAME_Identifier;
						props.put(key, value);
						keys = props.keySet().iterator();
						continue;
					}
					else if (key.equals("extension"))
					{
						props.remove(key);
						key = MFunction.COLUMNNAME_Extension;
						props.put(key, value);
						keys = props.keySet().iterator();
						continue;						
					}
					else if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
					{						
						Calendar cal = Calendar.getInstance();
						if (value instanceof Timestamp)
							cal.setTime((Timestamp) value);
						else
							cal.setTime(Timestamp.valueOf((String) value));
						cal.set(Calendar.MILLISECOND, 0);
						long time = cal.getTimeInMillis();									
						props.put(key, new Timestamp(time));
					}
				}	
				if (props.size() == 0)
				{
					props.put(X_AD_Function.COLUMNNAME_Identifier, Util.getUUID());
					props.put(X_AD_Function.COLUMNNAME_Synchronized, new Timestamp(System.currentTimeMillis()));
					//Identifier = (String) props.get(X_AD_Function.COLUMNNAME_Identifier);
					comments = String.format("@%s=%s\n", X_AD_Function.COLUMNNAME_Identifier,  props.get(X_AD_Function.COLUMNNAME_Identifier));
					comments += String.format("@%s=%s\n",X_AD_Function.COLUMNNAME_Synchronized, props.get(X_AD_Function.COLUMNNAME_Synchronized));
					StringBuilder sql = new StringBuilder("COMMENT ON FUNCTION xendra.")
					.append(functionname).append("(").append(arguments).append(")")
					.append(" IS '").append(comments).append("'");
					int no = DB.executeUpdate(sql.toString(), null);
				}
				Identifier = (String) props.get(MFunction.COLUMNNAME_Identifier);
				if (Identifier == null || Identifier.length() == 0)
					Identifier = Util.getUUID();
				MFunction ofunction = MFunction.getbyIdentifier(Identifier);
				if (ofunction == null)
				{
					ofunction = new MFunction(Env.getCtx(), 0 , null);
					ofunction.setIdentifier(Identifier);
				}				
				ofunction.setName(classname);
				ofunction.setFunctionName(functionname);
				ofunction.setArguments(arguments);					
				ofunction.setCode(sourcecode);
				ofunction.setOutput(output);
				ofunction.setOwner(owner);
				ofunction.setLanguage(language);				
				keys = props.keySet().iterator();
				comments = "";
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (ofunction.get_ColumnIndex(key) >= 0)
					{
						if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
							ofunction.setSynchronized((Timestamp) value);
						else	
							ofunction.set_ValueOfColumn(key, value);
					}
					comments += String.format("@%s=%s\n", key, value);
				}
				ofunction.setComments(comments);				
				if (ofunction.getIdentifier() == null || ofunction.getIdentifier().length() == 0)
				{										
					ofunction.setIdentifier(Util.getUUID());
				}
				if (ofunction.getSynchronized() == null)
				{
					ofunction.setSynchronized(new Timestamp(System.currentTimeMillis()));
				}				
				ofunction.setIsActive(true);
				ofunction.save();
			}
			rs.close();
			List<MFunction> functions = new Query(Env.getCtx(), X_AD_Function.Table_Name, "IsActive = 'Y'", null).list();
			for (MFunction function:functions)
			{
				createFunction(function);
			}		
			//createFunctionList(sbcontainer);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private void createFunction(MFunction function) {
		String funcname = Util.getStringclean(function.getName());
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
		Util.writeToFile(header, path+funcname+".java");
	}

	
	private void createFunctionold(String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.function;\n\n");
		header = header.append("import org.xendra.annotations.*;");
		header = header.append("import org.apache.commons.lang.text.StrBuilder;");

		header = header.append("public class ").append(funcname).append(" { ");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+funcname+".java");
	}

	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		storeprocedurestoAnnotation sp = new storeprocedurestoAnnotation();		
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}