package org.xendra.mfe.folder;

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
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

public class TableFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected String id;	
	public TableFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	}

    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.modeleditor", "table.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }
    
	public void loadChildren() {
		removeAllChildren();			
		List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND (COALESCE(isinternal,'N') = 'N' OR iskey = 'Y')", null)
			.setParameters(Integer.valueOf(getNode().getAttributeValue("uid"))).setOrderBy("columnname").list();
		for (X_AD_Column column:columns) {
			String type = "column";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(column.getAD_Column_ID()));
			item.setAttribute("name", column.getColumnName());						
			Object[] args = { item };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MFE_FOLDER);
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

