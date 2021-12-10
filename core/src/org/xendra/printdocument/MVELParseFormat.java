package org.xendra.printdocument;

import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.Vector;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.persistence.X_A_PrinterDriver;
import org.compiere.model.reference.REF_C_PrinterFormatType;
import org.compiere.util.Util;
import org.mvel2.MVEL;
import org.mvel2.ParserContext;
import org.mvel2.ast.ASTNode;
import org.mvel2.compiler.CompiledExpression;
import org.mvel2.compiler.ExecutableAccessor;
import org.mvel2.compiler.ExecutableLiteral;
import org.mvel2.templates.CompiledTemplate;
import org.mvel2.templates.TemplateCompiler;
import org.mvel2.templates.res.CompiledCodeNode;
import org.mvel2.templates.res.CompiledExpressionNode;
import org.mvel2.templates.res.CompiledForEachNode;
import org.mvel2.templates.res.EndNode;
import org.mvel2.templates.res.Node;
import org.mvel2.templates.res.TextNode;

public class MVELParseFormat extends ParseFormat {
	private CompiledTemplate compiled;
	//private List<String> internalvars = new ArrayList<String>();
	//private List<String> variables = new ArrayList<String>();
	//private List<Vector> images = new ArrayList<Vector>();
	//private List<String> eachs = new ArrayList<String>();
	//private List<String> tables = new ArrayList<String>();
	private HashMap<String, String> functions = new HashMap<String, String>();
	private HashMap<String, String> querys = new HashMap<String, String>();
	//
	static MVELParseFormat instance = new MVELParseFormat();
	//
	public MVELParseFormat() {
	}
	public static MVELParseFormat getInstance() {
		if (instance == null)
			instance = new MVELParseFormat();
		return instance;
	}
	public PrintDocument parse(MPrinterDocumentFormat m_printformat) {
		return parse(m_printformat, null);
	}
	public PrintDocument parse(MPrinterDocumentFormat m_printformat, X_A_PrinterDriver printerdriver) {
		PrintDocument pd = new PrintDocument();
		//pd.setProperties(m_printformat.getProperties());
		pd.setParameters(m_printformat.getParameters());
		HashMap error = new HashMap();
		List<String> varsnotfound = new ArrayList<String>();
		List<String> varsnotdefin = new ArrayList<String>();
		List<String> errors = new ArrayList<String>();
		ParserContext pc = null;
		try {	
			Map<String, Class<? extends Node>> newmap = new HashMap<String, Class<? extends Node>>();
			newmap.put("pic", NodeESCImage.class);				
			newmap.put("codeqr", NodeCodeQR.class);
			newmap.put("command", NodePrintCommand.class);
			compiled = TemplateCompiler.compileTemplate(m_printformat.getFormat(), newmap);			
			Node n = compiled.getRoot();			
			while (n.getNext() != null) {
				n = n.next;					
				if (n.getClass().equals(CompiledExpressionNode.class)) {
					ParserContext mvelContext = new ParserContext();
					Object e = MVEL.compileExpression(compiled.getTemplate(), n.getCStart(), n.getCEnd() - n.getCStart(), mvelContext);
					ASTNode a = null;
					if (e instanceof ExecutableAccessor) {
						ExecutableAccessor ce = (ExecutableAccessor) e;
						a = (ASTNode) ce.getNode();
					} else if (e instanceof CompiledExpression) {
						CompiledExpression ce = (CompiledExpression) e;
						a = (ASTNode) ce.getFirstNode();
					}
					Iterator it = mvelContext.getInputs().entrySet().iterator();
					while (it.hasNext()) {
						Map.Entry entry = (Entry) it.next();
					}
					String var = a.getAbsoluteName();
					pd.addvar(var);
				} else  if (n.getClass().equals(CompiledForEachNode.class)) {					
					CompiledForEachNode ce = (CompiledForEachNode) n;
					String maintoken = String.valueOf(ce.getContents()).substring(ce.getCStart(), ce.getCEnd());
					String eachname = "";
					StringTokenizer st = new StringTokenizer(maintoken, ":");
					Boolean firsttoken = true;
					while (st.hasMoreTokens()) {												
						String aja = st.nextToken();
						if (!firsttoken)
							eachname = aja.trim();
						if (firsttoken)
							firsttoken = false;
					}
					//
					Node each = ce.getNestedNode();
					while (each != null) {
						if (each.getClass().equals(TextNode.class)) { 							
						} else	if (each.getClass().equals(CompiledExpressionNode.class)) {
							CompiledExpressionNode sdsd = (CompiledExpressionNode) each;								
							ParserContext mvelContext2 = new ParserContext();
							ASTNode a = null;
							Object e = MVEL.compileExpression(compiled.getTemplate(), each.getCStart(), each.getCEnd() - each.getCStart(), mvelContext2);
							if (e instanceof ExecutableAccessor) {
								ExecutableAccessor ce2 = (ExecutableAccessor) e;
								a = (ASTNode) ce2.getNode();
							} else if (e instanceof CompiledExpression) {
								CompiledExpression ce2 = (CompiledExpression) e;
								a = (ASTNode) ce2.getFirstNode();
							}														
							Iterator it = mvelContext2.getInputs().entrySet().iterator();
							while (it.hasNext()) {
								Map.Entry entry = (Entry) it.next();
								pd.addeachvar(eachname, entry.getKey().toString());
							}
						} else if (each.getClass().equals(CompiledCodeNode.class)){
							
						}
						each = each.next;
					}
					// capture the each identifier to List<String> eachs
					CompiledExpression ea = (CompiledExpression) MVEL.compileExpression(compiled.getTemplate(), n.getCStart(), n.getCEnd() - n.getCStart(), new ParserContext());
					Boolean firstnode = true;
					ASTNode a = (ASTNode) ea.getFirstNode();					
					while (a != null) {
						if (a.isLiteral() && !a.isThisVal()) {
							ExecutableLiteral xx = new ExecutableLiteral(a.getLiteralValue());
						} 
						if (!firstnode) {
							String var = a.getName(); // the first node is the internal name of the for
							if (var.length() > 0) {
								pd.addeach(var);
							}
						}
						if (firstnode) {
							firstnode = false;
						}						
						a = a.nextASTNode;
					}
				} else if (n.getClass().equals(CompiledCodeNode.class)){
					
				} else if (n.getClass().equals(org.mvel2.templates.res.TerminalNode.class)) {
					
				} else if (n.getClass().equals(TextNode.class)) {
					
				} else if (n.getClass().equals(EndNode.class)) {
					
				} else if (n.getClass().equals(org.mvel2.templates.res.CompiledIfNode.class)) {
				} else if (n.getClass().equals(org.xendra.printdocument.NodePrintCommand.class)) {
					String appender = String.valueOf(compiled.getTemplate()).substring(0,n.getCStart());
					String[] lines = appender.toString().split("\r\n|\r|\n");
					int row = lines.length;
					if (row > 0)
						row --;
					int col = 0;
					String code = String.valueOf(n.getContents());
					Point p = new Point(row, col);
					Vector vec = new Vector();
					vec.add(code);
					vec.add(p);
					pd.getCommands().add(vec);
				} else if (n.getClass().equals(org.xendra.printdocument.NodeCodeQR.class)) {														
					String appender = String.valueOf(compiled.getTemplate()).substring(0,n.getCStart());
					String[] lines = appender.toString().split("\r\n|\r|\n");
					int row = lines.length;
					if (row > 0)
						row --;
					int col = 0;
					String code = String.valueOf(n.getContents());
					Point p = new Point(row, col);
					Vector vec = new Vector();						
					vec.add(code);
					vec.add(p);
					pd.getQRCodes().add(vec);					
				} else if (n.getClass().equals(org.xendra.printdocument.NodeESCImage.class)) {
					String appender = String.valueOf(compiled.getTemplate()).substring(0, n.getCStart());
					String[] lines = appender.toString().split("\r\n|\r|\n");					
					int row = lines.length;
					if (row > 0)
						row --;
					int col = 0;
					String filename = String.valueOf(n.getContents());
					File file = new File(filename);
					if (file.exists()) {
						Point p = new Point(row, col);
						Vector vec = new Vector();						
						vec.add(file.getAbsolutePath());
						vec.add(p);
						pd.getImages().add(vec);						
					}					
				} else {
					
				}					 
			}
			if (pd.getEachs().size() > 0) {
				pd.getParameters().put("eachs", Util.ListtoString(pd.getEachs()));				
			}
			if (pd.getVariables().size() > 0)
			{				
				List<String> varused = new ArrayList<String>();
				Iterator it = pd.getVariables().keySet().iterator();
				while (it.hasNext()) {
					String variable = (String) it.next();
					if (!pd.getProperties().containsKey(variable)) {
						varsnotfound.add(variable);
						varused.add(variable);
					} else {
						varused.add(variable);												
					}									
				}
				it = pd.getProperties().keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					String value = (String) pd.getProperties().get(key);
					//if (!tables.contains(value)) {
					if (value.startsWith("@SQL=")) {
							value = value.substring("@SQL=".length());
							querys.put(key, value);						
					} else if (value.startsWith("@FUNCTION=")) {
							value = value.substring("@FUNCTION=".length());
							functions.put(key, value);
					
					}
				}				
				boolean containerrors = false;
				if (varsnotfound.size() > 0) {
					error.put(VARSNOTFOUND, varsnotfound);
					containerrors = true;
					HashMap p = m_printformat.getProperties();
					for (String var:varsnotfound) {
						p.put(var, "");
					}
					m_printformat.setProperties(p);					
				}
				if (varsnotdefin.size() > 0) {
					error.put(VARSNOTDEFINED, varsnotdefin);
					containerrors = true;
				}
				if (m_printformat.getC_PrinterFormatType() != null &&
						m_printformat.getC_PrinterFormatType().equals(REF_C_PrinterFormatType.HeaderLines)) {
					Boolean definedHeader = false;
					Boolean definedLines = false;
				}			
				List<String> tablefields = new ArrayList<String>();
				it = m_printformat.getProperties().entrySet().iterator();
				List<String> fields = new ArrayList<String>();
				while (it.hasNext())
				{
					Map.Entry map = (Entry) it.next();
					fields.add((String)map.getKey());
				}						
				pd.getParameters().put(FIELDS, Util.ListtoString(fields));
				if (errors.size() > 0)
					error.put(ERRORS, errors);
				if (!containerrors) {
					if (functions.size() > 0)
						pd.getParameters().put(FUNCTIONS, functions.toString());
					if (querys.size() > 0) {
						String q = "";
						Iterator it2 = querys.keySet().iterator();
						while (it2.hasNext()) {
							String key = (String) it2.next();
							if (q.length() > 0)
								q = q + ",";
							q = q + String.format("%s=%s",key, querys.get(key));
						}
						pd.getParameters().put(QUERYS, q);
					}
				}
			}
		}		
		catch (Exception e)
		{
			e.printStackTrace();
			List<String> err = new ArrayList<String>();
			if (error.containsKey(ERRORS)) {
				err = (List<String>) error.get(ERRORS);
			}
			err.add(e.getMessage());
			error.put(ERRORS, err);
		}
		pd.setCompiled(compiled);
		pd.addErrors(error);
		return pd;				
	}
}