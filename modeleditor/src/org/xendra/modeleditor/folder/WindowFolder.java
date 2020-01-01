package org.xendra.modeleditor.folder;

import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.modeleditor.plugin.IExtensionHandlerKeys;

public class WindowFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected String id;
	public WindowFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	}	
	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.modeleditor", "window.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}
	public void loadChildren() {
		removeAllChildren();
		List<X_AD_Tab> tabs = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "AD_Window_ID = ?", null)
		.setParameters(Integer.valueOf(getElement().getAttributeValue("uid"))).setOrderBy("seqno").list();
		for (X_AD_Tab tab:tabs) {
			String type = "tab";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(tab.getAD_Tab_ID()));
			item.setAttribute("name", tab.getName());						
			Object[] args = { item };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR_FOLDER);
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
