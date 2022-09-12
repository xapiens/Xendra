package org.xendra.efact.folder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.command.IWorkerStatusController;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.MConfig;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.efact.model.Csv;
import org.xendra.efact.model.Provider;
import org.xendra.efact.model.Providers;
import org.xendra.efact.plugin.IExtensionHandlerKeys;

public class ProviderFolder extends EFactTreeNode {
	protected static ImageIcon localIcon = null;
	protected Integer id;
	protected Provider prov = null;
	public ProviderFolder(Element item, Provider prov) {
		super(item);
		this.prov = prov;
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
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.efact", "form.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }

	@Override
	public boolean tryToGetLock(Object locker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void releaseLock(Object locker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTreePath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createChildren(IWorkerStatusController worker) {
		// TODO Auto-generated method stub
		
	}	

	public void loadChildren() {
		removeAllChildren();
		List<Csv> csvs = this.prov.getListcsv();
		for (Csv csv:csvs) {
			String type = "csv";
			Element item = new Element("csv");
			item.setAttribute("uid", "0");
			item.setAttribute("name", "csv");					
			Object[] args = { item, csv };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_EFACT_FOLDER);
			} catch (PluginHandlerNotFoundException ex) {
				ErrorDialog.createDialog(ex.getMessage(),  ex);
			}			
			EFactTreeNode folder = null;			
			try {
				IExtension extension = handler.getExtension(type);
				folder = (EFactTreeNode) extension.instanciateExtension(args);
				this.add(folder);
			} catch (Exception e) {
				e.printStackTrace();
			}												
		}
	}	
}
