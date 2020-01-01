package org.xendra.ruleeditor.folder;

import java.util.List;
import javax.swing.ImageIcon;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.ruleeditor.model.GroupModel;
import org.xendra.ruleeditor.model.IGroupModel;
import org.xendra.ruleeditor.plugin.IExtensionHandlerKeys;

public class GroupFolder extends AbstractFolder {
	private IGroupModel group;
	private static final ImageIcon groupImageIcon = ImageLoader.getSmallIcon(IconKeys.USER);
	protected String id;
	public GroupFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
		String AD_Rule_ID = getNode().getAttributeValue("uid");
		group = new GroupModel(AD_Rule_ID);
		group.setName(item.getAttributeValue("name"));
		group.setDescription(item.getAttributeValue("description"));
		loadChildren();
	}
	
	private void setID(String id) {
		this.id = id;
	}
	private String getID() {
		return this.id;
	}
	
	public IGroupModel getGroup() {
		return group;
	}
	
    public ImageIcon getIcon() {
        return groupImageIcon;
    }
	public void modelChanged() {
		// TODO Auto-generated method stub
		
	}
	public void loadChildren() {
		removeAllChildren();
		//String id = getID();		
		String where = "properties->'type' = 'kiebase' AND  IsActive = 'Y' AND properties->'group' = ?";
		//String whererule = "Parent_ID = ?";
		//String id = "";
		List<X_AD_Rule> kiebases = new Query(Env.getCtx(), X_AD_Rule.Table_Name, where, null)
			.setParameters(group.getUid())
			.setOrderBy("id").list();		
		for (X_AD_Rule kiebase:kiebases)
		{			
			String type = "kiebase";			
			Element  item = new Element(type);			
			item.setAttribute("uid", String.valueOf(kiebase.getAD_Rule_ID()));
			item.setAttribute("AD_Plugin_ID", String.valueOf(kiebase.getAD_Plugin_ID()));
			item.setAttribute("type", type);
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
	}
}
