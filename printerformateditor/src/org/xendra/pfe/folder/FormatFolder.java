package org.xendra.pfe.folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.Env;
import org.jdom.Element;
import org.mvel2.templates.CompiledTemplate;
import org.mvel2.templates.TemplateRuntime;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.plugin.IExtensionHandlerKeys;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.ParseFormat;
import org.xendra.printdocument.PrintDocument;


public class FormatFolder extends AbstractFolder  {
	protected static ImageIcon localIcon = null;
	protected String id;
	private List<String> tables = new ArrayList<String>();
	private boolean loaded = false;	
	private MPrinterDocumentFormat format = null;
	private List<AbstractFolder> folderfields = new ArrayList<AbstractFolder>();
	public FormatFolder(Element item) {
		super(item);
		setID(item.getAttributeValue("uid"));
		this.setName(item.getAttributeValue("name"));
		loadChildren();
	}
	private void setID(String id) {
		this.id = id;
	}
	private String getID() {
		return this.id;
	}
	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "table.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}
	public void loadChildren() {
		removeAllChildren();
		folderfields.clear();
		String id = getID();
		if (!loaded ) {
			format = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
			.setParameters(Integer.valueOf(id)).first();
			loaded = true;
		}
		Iterator it = format.getProperties().keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			//if (key.equals("Querys"))
			//	continue;
			//else if (key.startsWith("AllTables")) 
			//	continue;
			//else if (key.startsWith("Fields"))
			//		continue;
			//else if (key.startsWith("Functions")) 
			//	continue;
			//else if (key.startsWith("Relations"))
			//	continue;
			if (key.startsWith("Compiled"))
				continue;			
			String value = (String) format.getProperties().get(key);
			if (value == null)
				value = "";
			if (!value.startsWith("@") && value.length() > 0) {
				if (!tables.contains(value))
					tables.add(value);
			}
		}		
		for (String table:tables) {
			Element item = new Element("table");		
			item.setAttribute("uid", String.valueOf(format.getC_PrinterDocumentFormat_ID()));
			item.setAttribute("name", table);
			//			
			Object[] args = { item };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_PFE_FOLDER);
			} catch (PluginHandlerNotFoundException ex) {
				ErrorDialog.createDialog(ex.getMessage(),  ex);
			}
			AbstractFolder folder = null;			
			try {
				IExtension extension = handler.getExtension("table");
				folder = (AbstractFolder) extension.instanciateExtension(args);
				folderfields.add(folder);
			} catch (Exception e) {
				e.printStackTrace();
			}						
		}		
		//
		it = format.getProperties().keySet().iterator();
		while (it.hasNext()) {			
			String type = "field";
			String key = (String) it.next();
			//if (key.startsWith("Querys")) {
			//	continue;
			//}
			if (key.startsWith("Util")) {
				continue;
			}
			//else if (key.startsWith("AllTables")) {
			//	continue;
			//}
			//else if (key.startsWith("Fields")) {
			//	continue;
			//}
			//else if (key.startsWith("Functions")) {
			//	continue;
			//}									
			//else if (key.startsWith("Relations")) {
			//	continue;
			//}
			String value = (String) format.getProperties().get(key);
			if (tables.contains(value)) {
				continue;
			}
			Element item = new Element(type);		
			item.setAttribute("uid", String.valueOf(format.getC_PrinterDocumentFormat_ID()));
			item.setAttribute("name", key);
			item.setAttribute("value", value);			
			//			
			Object[] args = { item };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_PFE_FOLDER);
			} catch (PluginHandlerNotFoundException ex) {
				ErrorDialog.createDialog(ex.getMessage(),  ex);
			}
			AbstractFolder folder = null;			
			try {
				IExtension extension = handler.getExtension(type);
				folder = (AbstractFolder) extension.instanciateExtension(args);
				folderfields.add(folder);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		Collections.sort(folderfields, new Comparator<AbstractFolder>() {
			public int compare(AbstractFolder o1, AbstractFolder o2) {
				return o1.getName().compareTo(o2.getName());								            
			}
		});	
		Iterator it2 = folderfields.iterator();
		while (it2.hasNext()) {
			AbstractFolder f = (AbstractFolder) it2.next();
			add(f);
			f.loadChildren();
		}
	}

	public void setParameter(String name, String value) {
		HashMap p = format.getParameters();
		p.put(name, value);
		format.setParameters(p);
	}

	public void setProperty(String name, String value) {
		HashMap p = format.getProperties(); 
		p.put(name, value);
		format.setProperties(p);
		if (tables.contains(value)) {

		}		
	}

	public void addField(String fieldname) {
		HashMap p = format.getProperties();
		p.put(fieldname, "");
		format.setProperties(p);
	}


	public void save() {
		format.save();		
	}

	public MPrinterDocumentFormat getPrinterDocumentFormat() {
		return format;
	}

	//private void sync(HashMap errors) {
	private void sync(PrintDocument pd) {
		HashMap errors = pd.getErrors();
		if (errors.containsKey(ParseFormat.VARSNOTFOUND)) {
			List<String> map = (List<String>) errors.get(ParseFormat.VARSNOTFOUND);
			for (String key:map) {
				String type = "field";
				Element item = new Element(type);		
				item.setAttribute("uid", String.valueOf(format.getC_PrinterDocumentFormat_ID()));
				item.setAttribute("name", key);
				Object[] args = { item };
				IExtensionHandler handler = null;
				try {
					handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_PFE_FOLDER);
				} catch (PluginHandlerNotFoundException ex) {
					ErrorDialog.createDialog(ex.getMessage(),  ex);
				}
				AbstractFolder folder = null;			
				try {
					IExtension extension = handler.getExtension(type);
					folder = (AbstractFolder) extension.instanciateExtension(args);
					folderfields.add(folder);
					add(folder);
				} catch (Exception e) {
					e.printStackTrace();
				}					
			}
		}
	}
	public PrintDocument compile() {
		PrintDocument pd = MVELParseFormat.getInstance().parse(format);
		return pd;
	}

//	public CompiledTemplate getCompiled() {
//	return MVELParseFormat.getInstance().getCompiled();
//} 
//	public HashMap compile() {
//		PrintDocument pd = MVELParseFormat.getInstance().parse(format); 
//		HashMap error = new HashMap(); 		
//		//error = MVELParseFormat.getInstance().parse(format);		
//		sync(pd);
//		if (error.size() == 0) 
//		{
//			HashMap p = format.getParameters();
//			p.put(VelocityParseFormat.COMPILED, "Y");
//			format.setParameters(p);
//		} 
//		else 
//		{
//			HashMap p = format.getParameters();
//			p.remove(VelocityParseFormat.COMPILED);
//			format.setParameters(p);
//		}
//		return error;
//	}

//	public PrintDocument getFormatDocument(Map vars) {
//		PrintDocument pd = new PrintDocument();
//		pd.setCompiled(getCompiled());
//		pd.setVariables(vars);
//		//pd.build();				
//		return pd;
//	}	
}
