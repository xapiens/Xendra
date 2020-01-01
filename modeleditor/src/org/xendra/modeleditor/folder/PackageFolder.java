package org.xendra.modeleditor.folder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.modeleditor.plugin.IExtensionHandlerKeys;

public class PackageFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected String id;
	List<AbstractFolder> childs = new ArrayList<AbstractFolder>();
	public PackageFolder(Element item) {
		super(item);		
		setName(item.getAttributeValue("name"));
	}
	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "package.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}	
	public void add(AbstractFolder children) {
		super.add(children);
		children.addGroupFolder(this);
		childs.add(children);		
	}

	public void loadChildren() {
		removeAllChildren();
		String uid = getElement().getAttributeValue("uid");
		List<X_AD_Table> tables = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Package_ID = ?", null)
		.setParameters(Integer.valueOf(uid)).setOrderBy("TableName").list();
		for (X_AD_Table table:tables) {
			String type = "table";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(table.getAD_Table_ID()));
			item.setAttribute("name", table.getTableName());						
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
		List<X_AD_Window> windows = new Query(Env.getCtx(), X_AD_Window.Table_Name, "AD_Package_ID = ?", null)
		.setParameters(Integer.valueOf(uid)).setOrderBy("Name").list();		
		for (X_AD_Window window:windows) {
			String type = "window";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(window.getAD_Window_ID()));
			item.setAttribute("name", window.getName());
			Object[] args = { item };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR_FOLDER);
			} catch (PluginHandlerNotFoundException ex) {
				ErrorDialog.createDialog(ex.getMessage(), ex);
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
