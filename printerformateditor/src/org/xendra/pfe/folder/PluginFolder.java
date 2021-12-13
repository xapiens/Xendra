package org.xendra.pfe.folder;

import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.columba.core.xml.XmlElement;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.plugin.IExtensionHandlerKeys;

public class PluginFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected Integer id;
	public PluginFolder(Element item) {
		super(item);
		setID(item.getAttributeValue("uid"));
		setName(item.getAttributeValue("name"));
		loadChildren();
	}

	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "plugin.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}	

	private void setID(String id) {
		this.id = Integer.valueOf(id);
	}
	private Integer getID() {
		return this.id;
	}
	public void loadChildren() {
		removeAllChildren();
		List<X_C_PrinterDocumentFormat> formats = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "AD_Plugin_ID = ?", null)
		.setParameters(getID())
		.list();		
		for (X_C_PrinterDocumentFormat format:formats) {
			String type = "format";			
			Element item = new Element(type);			
			item.setAttribute("uid", String.valueOf(format.getC_PrinterDocumentFormat_ID()));
			item.setAttribute("AD_Plugin_ID", String.valueOf(format.getAD_Plugin_ID()));
			item.setAttribute("type", type);
			item.setAttribute("name", format.getName());			
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
				this.add(folder);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}		
	}
}
