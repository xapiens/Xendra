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
import org.compiere.model.persistence.X_AD_Package;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.modeleditor.plugin.IExtensionHandlerKeys;

public class PluginFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	List<AbstractFolder> childs = new ArrayList<AbstractFolder>();
	public PluginFolder(Element item) {
		super(item);		
		setName(item.getAttributeValue("name"));
	}

	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "plugin.png"))));
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
		List<X_AD_Package> packages = new Query(Env.getCtx(), X_AD_Package.Table_Name, "AD_Plugin_ID = ?" , null)
			.setParameters(Integer.valueOf(uid)).list();
		String type = "package";
		for (X_AD_Package p:packages) {
			Element item = new Element(type);
			item.setAttribute("ID", p.getName());
			item.setAttribute("uid", String.valueOf(p.getAD_Package_ID()));
			item.setAttribute("name", p.getName());
			item.setAttribute("AD_Plugin_ID", uid);
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
