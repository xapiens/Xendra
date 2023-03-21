package org.xendra.printdocument;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.compiere.model.MMessageFormat;
import org.compiere.model.MQuery;
import org.compiere.model.persistence.X_A_PrinterDriver;
import org.compiere.util.Util;
import org.mvel2.templates.CompiledTemplate;
import org.mvel2.templates.TemplateRuntime;
import org.xendra.printdocument.driver.PrinterDriver;

public class PrintDocument implements Serializable {
	private CompiledTemplate m_compiled;
	private Map variables = new HashMap();
	private Map<String, List<String>> eachvariables = new HashMap<String, List<String>>();
	private List<String> eachs = new ArrayList<String>();
	private HashMap Properties = new HashMap();
	private HashMap Parameters = new HashMap();
	private Boolean noprinterdriver = true;
	private List<Vector> images = new ArrayList<Vector>();
	private List<Vector> commands = new ArrayList<Vector>();
	private List<Vector> qrcodes = new ArrayList<Vector>();
	private String output;
	private HashMap errors;
	private List<String> internalvars = new ArrayList<String>();
	private String m_source;
	
	public PrintDocument() {		
		addvar("Util", Util.class);
		internalvars.add(PrinterDriver.NL);				
		internalvars.add(PrinterDriver.beeper);
		internalvars.add(PrinterDriver.line_space_24);
		internalvars.add(PrinterDriver.line_space_30);
		internalvars.add(PrinterDriver.image_mode);
		internalvars.add(PrinterDriver.hw_init);
		internalvars.add(PrinterDriver.cd_kick_2);
		internalvars.add(PrinterDriver.cd_kick_5);
		internalvars.add(PrinterDriver.paper_full_cut);
		internalvars.add(PrinterDriver.paper_part_cut);
		internalvars.add(PrinterDriver.txt_normal);
		internalvars.add(PrinterDriver.txt_2height);
		internalvars.add(PrinterDriver.txt_2width);
		internalvars.add(PrinterDriver.txt_4square);
		internalvars.add(PrinterDriver.txt_underl_off);
		internalvars.add(PrinterDriver.txt_underl_on);
		internalvars.add(PrinterDriver.txt_underl2_on);
		internalvars.add(PrinterDriver.txt_bold_off);
		internalvars.add(PrinterDriver.txt_bold_on);
		internalvars.add(PrinterDriver.txt_font_a);
		internalvars.add(PrinterDriver.txt_font_b);
		internalvars.add(PrinterDriver.txt_align_lt);
		internalvars.add(PrinterDriver.txt_align_ct);
		internalvars.add(PrinterDriver.txt_align_rt);
		internalvars.add(PrinterDriver.charcode_pc437);
		internalvars.add(PrinterDriver.charcode_jis);
		internalvars.add(PrinterDriver.charcode_pc850);
		internalvars.add(PrinterDriver.charcode_pc860);
		internalvars.add(PrinterDriver.charcode_pc863);
		internalvars.add(PrinterDriver.charcode_weu);
		internalvars.add(PrinterDriver.charcode_greek);
		internalvars.add(PrinterDriver.charcode_hebrew);
		internalvars.add(PrinterDriver.charcode_pc1252);
		internalvars.add(PrinterDriver.charcode_pc866);
		internalvars.add(PrinterDriver.charcode_pc852);
		internalvars.add(PrinterDriver.charcode_pc858);
		internalvars.add(PrinterDriver.charcode_thai42);
		internalvars.add(PrinterDriver.charcode_thai11);
		internalvars.add(PrinterDriver.charcode_thai13);
		internalvars.add(PrinterDriver.charcode_thai14);
		internalvars.add(PrinterDriver.charcode_thai16);
		internalvars.add(PrinterDriver.charcode_thai17);
		internalvars.add(PrinterDriver.charcode_thai18);
		internalvars.add(PrinterDriver.barcode_txt_off);
		internalvars.add(PrinterDriver.barcode_txt_abv); 
		internalvars.add(PrinterDriver.barcode_txt_blw); 
		internalvars.add(PrinterDriver.barcode_txt_bth); 
		internalvars.add(PrinterDriver.barcode_font_a); 
		internalvars.add(PrinterDriver.barcode_font_b); 
		internalvars.add(PrinterDriver.barcode_height); 
		internalvars.add(PrinterDriver.barcode_width); 
		internalvars.add(PrinterDriver.barcode_upc_a); 
		internalvars.add(PrinterDriver.barcode_upc_e); 
		internalvars.add(PrinterDriver.barcode_ean13); 
		internalvars.add(PrinterDriver.barcode_ean8); 
		internalvars.add(PrinterDriver.barcode_code39); 
		internalvars.add(PrinterDriver.barcode_itf); 
		internalvars.add(PrinterDriver.barcode_nw7); 
		internalvars.add(PrinterDriver.pd_n50); 
		internalvars.add(PrinterDriver.pd_n37); 
		internalvars.add(PrinterDriver.pd_n25); 
		internalvars.add(PrinterDriver.pd_n12); 
		internalvars.add(PrinterDriver.pd_n0); 
		internalvars.add(PrinterDriver.pd_p50); 
		internalvars.add(PrinterDriver.pd_p37); 
		internalvars.add(PrinterDriver.pd_p25); 
		internalvars.add(PrinterDriver.pd_p12); 				
	}
	private void addvar(String key, Object value) {
		variables.put(key, value);		
	}
	public void setCompiled(CompiledTemplate compiled) {
		m_compiled = compiled;	
	}	
	public HashMap getProperties() {
		return Properties;
	}
	public void setProperties(HashMap properties) {
		Properties = properties;
	}	
	public HashMap getParameters() {
		return Parameters;
	}
	public void setParameters(HashMap parameters) {
		Parameters = parameters;
	}
	public void setProperty(String name, Object value) {
		addvar(name, value);
		//variables.put(name, value);
	}
	public void setPropertyEach(String name, Object value) {
		List<Object> list = new ArrayList<Object>();
		if (variables.containsKey(name)) {
			list = (List<Object>) variables.get(name);	
		}		
		list.add(value);
		addvar(name, list);
		//variables.put(name, list);
	}
	//public void setVarnames(List<String> varnames) {
	//	this.varnames = varnames;
	//}
	public Map getVariables() {
		return variables;
	}
	//public void setVariables(Map vars) {
	//	variables = vars;
	//}
	public void build() {
		if (noprinterdriver) {		
			Iterator it = getParameters().keySet().iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				try {
					String tt = (String) getParameters().get(key);
				} catch (Exception exx) {
					exx.printStackTrace();
				}
				String ref = (String) getParameters().get(key);
				if (ref.length() > 0) {
					System.out.println(String.format("key %s => value %s", key, ref));
				}
				//variables.put(key, "test");
				addvar(key, "test");
			}
			if (getParameters().containsKey("Fields")) {
				String stringfields = (String) getParameters().get("Fields");
				List<String> fields = Util.StringtoList(stringfields);
				Iterator it2 = fields.iterator();
				while (it2.hasNext()) {
					String fname = (String) it2.next();
					//variables.put(fname, "test");
					addvar(fname, "test");
				}
			}
			if (getParameters().containsKey("eachs")) {
				//List<String> eachs = (List<String>) getParameters().get("eachs");
				String stringeachs = (String) getParameters().get("eachs");
				List<String> eachs = Util.StringtoList(stringeachs);
				Iterator it2 = eachs.iterator();			
				while (it2.hasNext()) {
					String boName = (String) it2.next();
					List<String> groupline = new ArrayList<String>();
					groupline.add("test");
					addvar(boName, groupline);
					String counterdef = "";
					List<String> ajua = this.geteachvar(boName);					
					for (String as:ajua) {
						if (counterdef.length() == 0) {
							counterdef = as;
						}
						if (counterdef.equals(as))
							continue;
						List<String> lines = new ArrayList<String>();
						lines.add("test");
						//variables.put(as, lines);
						addvar(as, lines);
					}
				}
			}
		}
		addvar("Pretty", Pretty.class);
		addvar("Print", Print.class );
		output = TemplateRuntime.execute(m_compiled, null, variables).toString();
	}
	public String getOutput() {
		return output;
	}
	public void setImages(List<Vector> images) {
		this.images = images;
	}
	public List<Vector> getImages() {
		return this.images;
	}
	public List<Vector> getCommands() {
		return this.commands;
	}
	public List<Vector> getQRCodes() {
		return this.qrcodes;
	}
	public HashMap getErrors() {
		return errors;
	}
	public void addErrors(HashMap error) {
		errors = error;
	}
	public void driverattribute(X_A_PrinterDriver pd, String key) {
		if (pd == null) {
			//variables.put(key, "");
			addvar(key, "");
		}
		else {
			if (pd.getProperties().containsKey(key)) {
				//variables.put(key, pd.getProperties().get(key));
				addvar(key, pd.getProperties().get(key));
			}
		}
	}
	public void initializeDriver(X_A_PrinterDriver pd) {
		if (pd != null) {
			noprinterdriver = false;
		}
		driverattribute(pd,PrinterDriver.NL);				
		driverattribute(pd,PrinterDriver.beeper);
		driverattribute(pd,PrinterDriver.line_space_24);
		driverattribute(pd,PrinterDriver.line_space_30);
		driverattribute(pd,PrinterDriver.image_mode);
		driverattribute(pd,PrinterDriver.hw_init);
		driverattribute(pd,PrinterDriver.cd_kick_2);
		driverattribute(pd,PrinterDriver.cd_kick_5);
		driverattribute(pd,PrinterDriver.paper_full_cut);
		driverattribute(pd,PrinterDriver.paper_part_cut);
		driverattribute(pd,PrinterDriver.txt_normal);
		driverattribute(pd,PrinterDriver.txt_2height);
		driverattribute(pd,PrinterDriver.txt_2width);
		driverattribute(pd,PrinterDriver.txt_4square);
		driverattribute(pd,PrinterDriver.txt_underl_off);
		driverattribute(pd,PrinterDriver.txt_underl_on);
		driverattribute(pd,PrinterDriver.txt_underl2_on);
		driverattribute(pd,PrinterDriver.txt_bold_off);
		driverattribute(pd,PrinterDriver.txt_bold_on);
		driverattribute(pd,PrinterDriver.txt_font_a);
		driverattribute(pd,PrinterDriver.txt_font_b);
		driverattribute(pd,PrinterDriver.txt_align_lt);
		driverattribute(pd,PrinterDriver.txt_align_ct);
		driverattribute(pd,PrinterDriver.txt_align_rt);
		driverattribute(pd,PrinterDriver.charcode_pc437);
		driverattribute(pd,PrinterDriver.charcode_jis);
		driverattribute(pd,PrinterDriver.charcode_pc850);
		driverattribute(pd,PrinterDriver.charcode_pc860);
		driverattribute(pd,PrinterDriver.charcode_pc863);
		driverattribute(pd,PrinterDriver.charcode_weu);
		driverattribute(pd,PrinterDriver.charcode_greek);
		driverattribute(pd,PrinterDriver.charcode_hebrew);
		driverattribute(pd,PrinterDriver.charcode_pc1252);
		driverattribute(pd,PrinterDriver.charcode_pc866);
		driverattribute(pd,PrinterDriver.charcode_pc852);
		driverattribute(pd,PrinterDriver.charcode_pc858);
		driverattribute(pd,PrinterDriver.charcode_thai42);
		driverattribute(pd,PrinterDriver.charcode_thai11);
		driverattribute(pd,PrinterDriver.charcode_thai13);
		driverattribute(pd,PrinterDriver.charcode_thai14);
		driverattribute(pd,PrinterDriver.charcode_thai16);
		driverattribute(pd,PrinterDriver.charcode_thai17);
		driverattribute(pd,PrinterDriver.charcode_thai18);
		driverattribute(pd,PrinterDriver.barcode_txt_off);
		driverattribute(pd,PrinterDriver.barcode_txt_abv); 
		driverattribute(pd,PrinterDriver.barcode_txt_blw); 
		driverattribute(pd,PrinterDriver.barcode_txt_bth); 
		driverattribute(pd,PrinterDriver.barcode_font_a); 
		driverattribute(pd,PrinterDriver.barcode_font_b); 
		driverattribute(pd,PrinterDriver.barcode_height); 
		driverattribute(pd,PrinterDriver.barcode_width); 
		driverattribute(pd,PrinterDriver.barcode_upc_a); 
		driverattribute(pd,PrinterDriver.barcode_upc_e); 
		driverattribute(pd,PrinterDriver.barcode_ean13); 
		driverattribute(pd,PrinterDriver.barcode_ean8); 
		driverattribute(pd,PrinterDriver.barcode_code39); 
		driverattribute(pd,PrinterDriver.barcode_itf); 
		driverattribute(pd,PrinterDriver.barcode_nw7); 
		driverattribute(pd,PrinterDriver.pd_n50); 
		driverattribute(pd,PrinterDriver.pd_n37); 
		driverattribute(pd,PrinterDriver.pd_n25); 
		driverattribute(pd,PrinterDriver.pd_n12); 
		driverattribute(pd,PrinterDriver.pd_n0); 
		driverattribute(pd,PrinterDriver.pd_p50); 
		driverattribute(pd,PrinterDriver.pd_p37); 
		driverattribute(pd,PrinterDriver.pd_p25); 
		driverattribute(pd,PrinterDriver.pd_p12);
		// fill with test when no driver
		//variables = vars;									
	}
	public void addeachvar(String key, String var) {
		List<String> varlist = new ArrayList<String>();
		if (eachvariables.containsKey(key))
			varlist = (List<String>) eachvariables.get(key);
		if (!varlist.contains(var))
			varlist.add(var);
		//variables.put(key, varlist);
		eachvariables.put(key, varlist);
		//addvar(key, varlist);
	}
	public List<String> geteachvar(String key) {		
		List<String> varlist = new ArrayList<String>();
		//if (variables.containsKey(key))
		if (eachvariables.containsKey(key))
			//varlist = (List<String>) variables.get(key);
			varlist = (List<String>) eachvariables.get(key);
		return varlist;
	}
	public void addvar(String var) {
		if (!internalvars.contains(var))
		{	
			if (!variables.containsKey(var))
				//variables.put(var, "");
				addvar(var, "");
		}																						
	}
	public String getvar(String varname) {
		String val = "";
		if (variables.containsKey(varname)) {
			val = (String) variables.get(varname);
		}
		return val;
	}
	public void addeach(String var) {
		eachs.add(var);
	}	
	public List<String> getEachs() {
		return eachs;
	}
	public PrintWorker getPrintWorker(MQuery m_query) {
		PrintWorker pw = new PrintWorker();
		pw.setPrintDocument(this);
		//String errmsg = "";		
		//errmsg = pw.AssignPrinterDocumentFormat(getC_PrinterDocumentFormat_ID());
		return pw;
	}
	public String getError() {
		return "";
	}
	
	public void setData(DataSource ds) {
		Iterator it = getParameters().keySet().iterator();
		List<String> varexceptions = new ArrayList<String>();
		if (getParameters().containsKey("eachs")) {
			String stringeachs = (String) getParameters().get("eachs");
			List<String> eachs = Util.StringtoList(stringeachs);
			Iterator it2 = eachs.iterator();			
			while (it2.hasNext()) {
				String eachvar = (String) it2.next();
				List<String> xx = ds.searchvalueline(eachvar);
				if (xx.size() > 0) {
					varexceptions.add(eachvar);
					addvar(eachvar, xx);
				}
				List<String> eachvarlist = this.geteachvar(eachvar);
				for (String var:eachvarlist) {
					List<String> lines = ds.searchvalueline(var);
					if (lines.size() > 0) {
						varexceptions.add(var);
						addvar(var, lines);
					}
				}
			}
		}
		if (getParameters().containsKey("Fields")) {
			String stringfields = (String) getParameters().get("Fields");
			List<String> fields = Util.StringtoList(stringfields);
			Iterator it2 = fields.iterator();
			while (it2.hasNext()) {
				String fname = (String) it2.next();
				if (!varexceptions.contains(fname)) {
					String value = ds.searchvalue(fname);
					addvar(fname, value);
				}
			}
		}				
	}
	
	public void oldsetMessage(MMessageFormat message) {		
		message.initialize();
		Iterator it = getParameters().keySet().iterator();
		List<String> varexceptions = new ArrayList<String>();
		if (getParameters().containsKey("eachs")) {
			String stringeachs = (String) getParameters().get("eachs");
			List<String> eachs = Util.StringtoList(stringeachs);
			Iterator it2 = eachs.iterator();			
			while (it2.hasNext()) {
				String eachvar = (String) it2.next();			
				List<String> eachvarlist = this.geteachvar(eachvar);
				for (String var:eachvarlist) {
					List<String> lines = message.searchvalueline(var);
					if (lines.size() > 0) {
						varexceptions.add(var);
						addvar(var, lines);
					}
				}
			}
		}
		if (getParameters().containsKey("Fields")) {
			String stringfields = (String) getParameters().get("Fields");
			List<String> fields = Util.StringtoList(stringfields);
			Iterator it2 = fields.iterator();
			while (it2.hasNext()) {
				String fname = (String) it2.next();
				if (!varexceptions.contains(fname)) {
					String value = message.searchvalue(fname);
					addvar(fname, value);
				}
			}
		}		
	}
	public boolean containCommand(int line) {
		Boolean containCommand = false;
		if (getCommands().size() > 0) {
			Iterator it = getCommands().iterator();
			while (it.hasNext()) {
				Vector v = (Vector) it.next();
				Point p = (Point) v.lastElement();
				if (p.getX() == line) {
					containCommand = true;
					break;
				}
			}
		}
		return containCommand;
	}
	public boolean containQRCode(int line) {
		Boolean containQRCode = false;
		if (getQRCodes().size() > 0) {
			Iterator it = getQRCodes().iterator();
			while (it.hasNext()) {
				Vector v = (Vector) it.next();
				Point p = (Point) v.lastElement();
				if (p.getX() == line) {
					containQRCode = true;
					break;
				}
			}			
		}
		return containQRCode;
	}
	public String getCommand(int line) {
		String command = "";
		Iterator it = getCommands().iterator();
		while (it.hasNext()) {
			Vector v = (Vector) it.next();
			Point p = (Point) v.lastElement();
			if (p.getX() == line) {
				command = (String) v.firstElement();
				break;
			}
		}
		return command;
	}
	public String getQRCode(int line) {
		String code = "";
		Iterator it = getQRCodes().iterator();
		while (it.hasNext()) {
			Vector v = (Vector) it.next();
			Point p = (Point) v.lastElement();
			if (p.getX() == line) {
				code = (String) v.firstElement();						
				break;
			}
		}					
		return code;
	} 
	public boolean containsGraphic(int line) {
		Boolean containgraphic = false;
		if (getImages().size() > 0) {
			Iterator it = getImages().iterator();
			while (it.hasNext()) {
				Vector v = (Vector) it.next();
				Point p = (Point) v.lastElement();
				if (p.getX() == line) {
					containgraphic = true;	
					break;
				}
			}
		}			
		return containgraphic;
	}
	public String getGraphic(int line) {
		String graphic = "";
		Iterator it = getImages().iterator();
		while (it.hasNext()) {
			Vector v = (Vector) it.next();
			Point p = (Point) v.lastElement();
			if (p.getX() == line) {
				graphic = (String) v.firstElement();
				break;
			}
		}
		return graphic;
	}
	public void setSource(String source) {
		m_source = source;
	}
	public String getSource() {
		return m_source;
	}
}
