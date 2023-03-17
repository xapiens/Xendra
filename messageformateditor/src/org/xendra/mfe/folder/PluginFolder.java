package org.xendra.mfe.folder;

import java.io.File;
import java.sql.Timestamp;
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
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

public class PluginFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected Integer id;
	public PluginFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
		setID(item.getAttributeValue("uid"));
		loadChildren();
	}
	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "plugin.png"))));
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
		List<X_AD_MessageFormat> formats = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_Plugin_ID = ?", null)
		.setParameters(getID())
		.list();
		XmlElement idcontainer = null;
		for (X_AD_MessageFormat format:formats) {						
			String type = "message";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(format.getAD_MessageFormat_ID()));
			item.setAttribute("AD_Plugin_ID", String.valueOf(format.getAD_Plugin_ID()));
			item.setAttribute("type", type);
			item.setAttribute("name", format.getName());
			item.setAttribute(X_AD_MessageFormat.COLUMNNAME_QueueName, format.getQueueName());
			item.setAttribute("lockout", format.isLockout() ? "Y" : "N");
			if (format.getSynchronized() == null) {
				Timestamp ct = new Timestamp(System.currentTimeMillis());
				format.setSynchronized(ct);
				format.save();
			}
			item.setAttribute(Constants.XML_ATTRIBUTE_SYNCHRONIZED, format.getSynchronized().toString());
			item.setAttribute(Constants.XML_ATTRIBUTE_IDENTIFIER, format.getIdentifier());
			item.setAttribute("lockout", format.isLockout() ? "Y":"N");
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
