package org.xendra.pfe.folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.plugin.IExtensionHandlerKeys;

public class TableFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public TableFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
		//loadChildren();
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
		FormatFolder ff = (FormatFolder) getParent();
		HashMap p = ff.getPrinterDocumentFormat().getParameters();
		if (p.containsKey(this.getName())) {
			getNode().setAttribute("value", (String) p.get(getName()));
		}				
		//String id = (String) getNode().getAttributeValue("uid");
		String tablename = (String) getNode().getAttributeValue("name");
		//X_C_PrinterDocumentFormat format = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
		//.setParameters(Integer.valueOf(id)).first();
		HashMap Properties = ff.getPrinterDocumentFormat().getProperties();
		Iterator it = Properties.keySet().iterator();
		String type = "field";
		List<AbstractFolder> folderfields = new ArrayList<AbstractFolder>();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) Properties.get(key);			
			if (tablename.equals(value)) {
				Element item = new Element(type);		
				//item.setAttribute("uid", String.valueOf(format.getC_PrinterDocumentFormat_ID()));
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
		}		
	}

	public void addField(String fieldname) {
		// TODO Auto-generated method stub
		
	}
}
