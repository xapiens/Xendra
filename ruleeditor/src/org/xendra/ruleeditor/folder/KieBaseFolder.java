package org.xendra.ruleeditor.folder;

import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.command.IWorkerStatusController;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.ruleeditor.plugin.IExtensionHandlerKeys;

public class KieBaseFolder extends AbstractFolder implements IRuleFolder {
	protected static ImageIcon localIcon = null;
	protected String id;
	public KieBaseFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
		loadChildren();
	}

	@Override
	public void createChildren(IWorkerStatusController worker) {
		System.out.println("X");
	}    

	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "kiebase.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}

	public void loadChildren() {
		removeAllChildren();
		String id = getNode().getAttributeValue("uid");		
		String whererule = "Parent_ID = ?";
		List<X_AD_Rule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name,whererule,null)
		.setParameters(Integer.valueOf(id)).setOrderBy("AD_Rule_ID").list();
		for (X_AD_Rule rule:rules)
		{
			String type = (String) rule.getProperties().get("type");
			if (type == null) {
				System.out.println("X");
			}
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(rule.getAD_Rule_ID()));
			item.setAttribute("type", type);
			item.setAttribute("AD_Plugin_ID", String.valueOf(rule.getAD_Plugin_ID()));
			item.setAttribute("name", rule.getName());			
			Object[] args = { item };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_RULEEDITOR_FOLDER);
			} catch (PluginHandlerNotFoundException ex) {
				ErrorDialog.createDialog(ex.getMessage(),  ex);
			}
			AbstractFolder folder = null;			
			try {
				IExtension extension = handler.getExtension(type);
				folder = (AbstractFolder) extension.instanciateExtension(args);
				this.add(folder);
			} catch (Exception e) {
				System.out.println(type);
				e.printStackTrace();
			}			
		}								
	}
}
