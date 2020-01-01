package org.xendra.ruleeditor.folder;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.ruleeditor.plugin.IExtensionHandlerKeys;

public class PluginFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected Integer id;
	public PluginFolder(Element item) {
		super(item);
		setID(item.getAttributeValue("uid"));
		setName(item.getAttributeValue("name"));
		loadChildren();
	}

	private void setID(String id) {
		this.id = Integer.valueOf(id);
	}
	private Integer getID() {
		return this.id;
	}

	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "plugin.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}	

	public void loadChildren() {
		removeAllChildren();		
		String wheregroups = "properties->'type' = 'group' AND  IsActive = 'Y' AND AD_Plugin_ID = ?";
		HashMap mapgroups = new HashMap();
		List<X_AD_Rule> groups = new Query(Env.getCtx(), X_AD_Rule.Table_Name, wheregroups, null)
		.setParameters(getID())
		.setOrderBy("id").list();
		for (X_AD_Rule grp:groups) {
			String type = "group";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(grp.getAD_Rule_ID()));
			item.setAttribute("AD_Plugin_ID", String.valueOf(grp.getAD_Plugin_ID()));
			//xmlgroup.addAttribute("type", "group");
			item.setAttribute("name", grp.getName());					
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
				e.printStackTrace();
			}						
		}
		//  
		String where = "properties->'type' = 'kiebase' AND  IsActive = 'Y' AND AD_Plugin_ID = ? AND coalesce(length(properties->'group'),0)=0";
		List<X_AD_Rule> kiebases = new Query(Env.getCtx(), X_AD_Rule.Table_Name, where, null)
		.setParameters(getID())
		.setOrderBy("id").list();		
		for (X_AD_Rule kiebase:kiebases)
		{			
			String type = "kiebase";			
			Element item = new Element(type);			
			item.setAttribute("uid", String.valueOf(kiebase.getAD_Rule_ID()));
			item.setAttribute("AD_Plugin_ID", String.valueOf(kiebase.getAD_Plugin_ID()));
			if (kiebase.getProperties().containsKey("group")) {
				String group = (String) kiebase.getProperties().get("group");			
				item.setAttribute("group", group);
			}
			//idcontainer.addAttribute("type", type);
			item.setAttribute("name", kiebase.getName());			
			//
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
				e.printStackTrace();
			}			
		}
		String whereform = "AD_Plugin_ID = ?";
		List<X_AD_Form> forms = new Query(Env.getCtx(), X_AD_Form.Table_Name, whereform, null)
		.setParameters(getID())
		.setOrderBy("id").list();		
		for (X_AD_Form form:forms) {
			String type = "form";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(form.getAD_Form_ID()));
			item.setAttribute("AD_Plugin_ID", String.valueOf(form.getAD_Plugin_ID()));
			item.setAttribute("name", form.getName());			
			Object[] args = {item};
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_RULEEDITOR_FOLDER);
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
	public List<AbstractFolder> getChildrens() {
		List<AbstractFolder> childs = new ArrayList<AbstractFolder>();
		int childrens = getChildCount();
		for (int i=0; i < childrens; i++) {
			childs.add((AbstractFolder) getChildAt(i));
		}
		return childs;
	}
}