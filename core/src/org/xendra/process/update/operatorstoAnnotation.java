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
package org.xendra.process.update;

import org.compiere.model.Query;

import org.compiere.model.persistence.X_AD_Operator;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.model.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.*;

public class operatorstoAnnotation extends SvrProcess {
	private String mFileName;
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

	public static String getSQLAlloperators()
	{
		StringBuffer sql = new StringBuffer("SELECT op.oprname,op.oprcode as operproc,")
		.append("lt.typname as lefttype,") 
		.append("rt.typname as righttype,")
		.append("co.oprname as compop,  ")
		.append("pg_get_userbyid(op.oprowner) as owner,")
		.append("obj_description(op.oid) as description")	
		.append(" FROM pg_operator op ")
		.append("LEFT OUTER JOIN pg_type lt ON lt.oid=op.oprleft ")
		.append("LEFT OUTER JOIN pg_type rt ON rt.oid=op.oprright ")
		.append("LEFT OUTER JOIN pg_operator co ON co.oid=op.oprcom ")
		.append("WHERE pg_get_userbyid(op.oprowner) = 'xendra' ")
		.append(" ORDER BY op.oprname  ");
		return sql.toString();
	}


	protected String doIt () throws Exception 
	{		
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.GETOPERATORS, get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			StringBuffer sbcontainer = new StringBuffer();
			while (rs.next ())
			{				
				X_AD_Operator adoperator = new Query(Env.getCtx(), X_AD_Operator.Table_Name,"OprProc = ? AND  lefttype = ?", null)
				.setParameters(rs.getString("OperProc"),rs.getString("lefttype"))
				.first();

				if (adoperator == null)
				{
					adoperator = new X_AD_Operator (Env.getCtx(), 0, null);
					adoperator.setOprName(rs.getString("oprname"));
					adoperator.setOprProc(rs.getString("operproc"));					
				}
				adoperator.setLeftType(rs.getString("lefttype"));
				adoperator.setRightType(rs.getString("righttype"));
				adoperator.setCompOp(rs.getString("compop"));
				adoperator.setOwner(rs.getString("owner"));
				String description = rs.getString("description");
				adoperator.setIsActive(true);
				if (adoperator.getIdentifier().length() == 0)
					adoperator.setIdentifier(Util.getUUID());
				if (adoperator.getSynchronized() == null)				
					adoperator.setSynchronized(new Timestamp(System.currentTimeMillis()));
				Hashtable props = Util.getProperties(description);				
				Iterator keys = props.keySet().iterator();
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					if (adoperator.get_ColumnIndex(key) >= 0)
					{
						adoperator.set_ValueOfColumn(key, value);
					}
				}
				props.put(X_AD_Operator.COLUMNNAME_Identifier, adoperator.get_Value(X_AD_Operator.COLUMNNAME_Identifier));
				props.put(X_AD_Operator.COLUMNNAME_Synchronized, adoperator.get_Value(X_AD_Operator.COLUMNNAME_Synchronized));
				keys = props.keySet().iterator();
				description = "";
				while (keys.hasNext())
				{
					String key = (String)keys.next();
					Object value = props.get(key);
					description += String.format("@%s=%s\n", key, value);
				}
				adoperator.setDescription(description);
				adoperator.save();					
			}
			pstmt.close();
			rs.close();
			//
			List<X_AD_Operator> operators = new Query(Env.getCtx(), X_AD_Operator.Table_Name,"IsActive = 'Y'", null).list();
			for (X_AD_Operator operator:operators)
			{
				String opername = "";
				int funcstart = operator.getOprProc().indexOf(".");
				if (funcstart > 0)
					opername = operator.getOprProc().substring(funcstart+1);
				else
					opername = operator.getOprProc();
				String funcname = Util.getStringclean(String.format("%s_%s", opername,operator.getLeftType()));
				StringBuffer start = new StringBuffer();
				start.append("\n@XendraOperator(");				
				Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_OprName, operator.getOprName()));				
				Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_OprProc, operator.getOprProc()));				
				Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_LeftType,operator.getLeftType()));
				Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_RightType,operator.getRightType()));
				Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_CompOp, operator.getCompOp()));
				Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_Owner, operator.getOwner()));
				//Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_Description, operator.getDescription()));
				Util.append(start, String.format("%s=\"%s\",",X_AD_Operator.COLUMNNAME_Identifier, operator.getIdentifier()));				
				Calendar cal = Calendar.getInstance();
				cal.setTime(operator.getSynchronized());
				cal.set(Calendar.MILLISECOND, 0);
				long time = cal.getTimeInMillis();
				Util.append(start, String.format("%s=\"%s\")\n",X_AD_Operator.COLUMNNAME_Synchronized,new Timestamp(time)));
				start = start.append("\tpublic static final String ").append(operator.COLUMNNAME_Identifier)
						.append(" = \"").append(operator.getIdentifier()).append("\";").append("\n");
				start = start.append("\tpublic static final String getComments() { ");
				start = start.append("\tStrBuilder sb = new StrBuilder(); ");
				String[] tokens = operator.getDescription().split("\n");
				for (String token:tokens)
				{
					start = start.append("\tsb.appendln(\"").append(token).append("\");");
				}
				start.append("\treturn sb.toString();}");				
				sbcontainer = sbcontainer.append("\tpublic static final String ").append(funcname).append(String.format("=\"%s\"",operator.getIdentifier())).append(";");
				createFunction(funcname, start);
			}
			pstmt.close();
			rs.close();
			createFunctionContainer(sbcontainer);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private void createFunctionContainer(StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.operator;\n\n");
		header = header.append("public class X_AD_OperatorList { \n");
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, path+"X_AD_OperatorList.java");
	}
	private void createFunction(String funcname, StringBuffer sb) {
		StringBuffer header = new StringBuffer("package org.compiere.model.operator;\n\n");
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
		operatorstoAnnotation sp = new operatorstoAnnotation();		
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}