package org.xendra.printdocument;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.velocity.runtime.RuntimeInstance;
import org.apache.velocity.runtime.parser.node.ASTAddNode;
import org.apache.velocity.runtime.parser.node.ASTBlock;
import org.apache.velocity.runtime.parser.node.ASTDirective;
import org.apache.velocity.runtime.parser.node.ASTReference;
import org.apache.velocity.runtime.parser.node.ASTSetDirective;
import org.apache.velocity.runtime.parser.node.SimpleNode;
import org.apache.velocity.runtime.visitor.BaseVisitor;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.util.Util;

public class ParseFormat extends BaseVisitor {
	public static final String ALLTABLES = "AllTables";
	public static final String HEADER = "Header";
	public static final String LINES = "Lines";
	public static final String COMPILED = "Compiled";
	public static final String FIELDS = "Fields";
	public static final String RELATIONS = "Relations";
	public static final String FUNCTIONS = "Functions";
	public static final String QUERYS = "Querys";
	//
	public static final String FONT_CONDENSED = "font_condensed";
	public static final String FONT_NORMAL = "font_normal";
	public static final String FONT_BOLD = "font_bold";
	public static final String CASHDRAWEROPEN = "cashdraweropen";
	public static final String PAPERCUT = "papercut";
	public static final String PAGEFEED = "pagefeed";
	public static final String LINEFEED = "linefeed";	
	public static final String NUMBEROFLINES = "numberlines";
	public static final String NL = "nl";
	
	static ParseFormat instance = new ParseFormat(); 
	final List<String> variables = new ArrayList<String>();
	final List<String> internalvars = new ArrayList<String>();
	final List<String> tables = new ArrayList<String>();
	final HashMap<String, String> functions = new HashMap<String, String>();
	final HashMap<String, String> querys = new HashMap<String, String>();
	
	public ParseFormat() {
		internalvars.add(FONT_CONDENSED);
		internalvars.add(FONT_NORMAL);
		internalvars.add(FONT_BOLD);
		internalvars.add(CASHDRAWEROPEN);
		internalvars.add(PAPERCUT);
		internalvars.add(PAGEFEED);
		internalvars.add(LINEFEED);
		internalvars.add(NUMBEROFLINES);	
		internalvars.add(NL);
	}
	
	public List<String> getVars() {
		return variables;
	}
	public List<String> getTables() {
		return tables;
	}
	@Override
	public Object visit(final ASTReference node, final Object data) {	
			if (internalvars.contains(node.getFirstToken().toString()))
			{
				return null;
			}
			if (node.jjtGetParent() instanceof ASTBlock)
			{
				if (node.jjtGetNumChildren() == 0)
				{
					String var = node.getFirstToken().toString();
					var = var.replace(node.getDollarBang(), "");
					if (!internalvars.contains(var))
					{											
						variables.add(var);
					}					
				}
			}
			else if (node.jjtGetParent() instanceof ASTSetDirective)
			{
				// initialization of internal var, we add the reference.
				String token = node.getFirstToken().toString();
				token = token.replace(node.getDollarBang(), "");
				if (!internalvars.contains(token))
				{
					internalvars.add(token);
				}
			}
			else if (node.jjtGetParent() instanceof ASTDirective)
			{
				ASTDirective ss = (ASTDirective) node.jjtGetParent();
				String directive = ss.getDirectiveName();
				if ( ss.getFirstToken().toString().trim().equals("#macro") && ss.getLastToken().toString().trim().equals("#end") )
				{
					;
				}						
				else if (directive.equals("foreach"))
				{
					String varforeach = "";
					for (int i=0; i < ss.jjtGetNumChildren(); i ++)
					{
						//Node nodex = ;
						if (ss.jjtGetChild(i) instanceof ASTReference) 
						{
							ASTReference nodefor = (ASTReference) ss.jjtGetChild(i);
							if (varforeach.isEmpty())
							{
								varforeach = nodefor.getFirstToken().toString();							
								if (!internalvars.contains(varforeach))
								{
									internalvars.add(varforeach);
								}
							}
							else
							{
								String var = nodefor.getFirstToken().toString();
								var = var.replace(nodefor.getDollarBang(), "");
								if (!internalvars.contains(var))
								{
															
									variables.add(var);
								}
							}
						}
					}
				}
				else
				{
					String var = node.getFirstToken().toString();
					var = var.replace(node.getDollarBang(), "");
					if (!internalvars.contains(var))
					{						
						variables.add(var);
					}
				}
			}		
			else if (node.jjtGetParent() instanceof ASTAddNode)
			{
				;
			}					
			else
			{
				String var = node.getFirstToken().toString();
				var = var.replace(node.getDollarBang(), "");
				if (!internalvars.contains(var))
				{											
					variables.add(var);
				}
			}
		return null;
	}

	public static ParseFormat getInstance() {
		if (instance == null)
			instance = new ParseFormat();
		return instance;
	}
	
	public String parse(MPrinterDocumentFormat m_printformat) {
		String error = "";
		RuntimeInstance ri = new RuntimeInstance();
		try {
			SimpleNode node = ri.parse( m_printformat.getFormat(), m_printformat.getName() );
			visit(node, null);		
			String notfound = "";
			String notdefined = "";
			if (variables.size() > 0)
			{
				HashMap properties = m_printformat.getProperties();
				for (String variable:variables)
				{
					if (!properties.containsKey(variable))
					{
						properties.put(variable, "");						
						if (notfound.length() > 0)
							notfound += "\n";
						notfound += variable;
					}
					else
					{
						String value = (String) properties.get(variable);
						if (value == null)
							value = "";
						if (value.length() == 0)
						{							
							if (notdefined.length() > 0)
								notdefined += "\n";
							notdefined += variable;
						}
						else
						{
							if (!tables.contains(value))
							{
								if (value.startsWith("@SQL="))
								{
									value = value.substring("@SQL=".length());
									querys.put(variable, value);
								}
								else if (value.startsWith("@FUNCTION="))
								{
									value = value.substring("@FUNCTION=".length());
									functions.put(variable, value);									
								}
								else
									tables.add(value);
							}
						}
					}					
				}
				if (notfound.length() > 0)
					error = error + String.format("variable(s) not found(s)\n%s", notfound);
				if (notdefined.length() > 0)
					error = error + String.format("variable(s) not defined\n%s",notdefined);
				String headertable = (String) properties.get(ParseFormat.HEADER);
				if (headertable == null)
					headertable = "";
				if (headertable.length() == 0)
					error = error + "no se definio la propiedad Header";
				if (error.length() > 0)
				{
					m_printformat.setProperties(properties);
					m_printformat.save();
				}
				else
				{
					//
					
					String listtables = Util.ListtoString(tables);
					if (listtables.length() > 0)
					{
						properties.put(ALLTABLES, listtables);
					}
					//String listfunctions = Util.ListtoString(functions);
					if (functions.size() > 0)
						properties.put(FUNCTIONS, functions.toString());
					if (querys.size() > 0)
						properties.put(QUERYS, querys.toString());
					//					
					// creating the result
					//List<String> AllTables = this.getAllTables();
					HashMap<String, List<String>> tablefields = new HashMap<String, List<String>>();
					HashMap<String, List<String>> relations = new HashMap<String, List<String>>();
					// start point
					Iterator it = m_printformat.getProperties().entrySet().iterator();
					while (it.hasNext())
					{
						Map.Entry map = (Entry) it.next();
						if (map.getKey().equals(LINES) ||
							map.getKey().equals(HEADER))
							continue;
						if (tables.contains(map.getValue()))
						{
							if (tables.contains(map.getKey()))
							{
								List<String> relationship = relations.get(map.getValue());
								if (relationship == null)
								{
									relationship = new ArrayList<String>();
								}
								relationship.add((String)map.getKey());
								relations.put((String) map.getValue(), relationship);					
							}
							else
							{
								List<String> fields = tablefields.get(map.getValue());
								if (fields == null)
								{
									fields = new ArrayList<String>();
								}
								fields.add((String)map.getKey());
								tablefields.put((String) map.getValue(), fields);
							}
						}
					}		
					properties.put(FIELDS, tablefields.toString());
					properties.put(RELATIONS, relations.toString());	
					m_printformat.setProperties(properties);
					m_printformat.save();					
				}
			}			
		}
		catch (Exception e)
		{
			error = e.getMessage();
		}
		return error;
	}
	
}
