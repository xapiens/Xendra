package org.xendra.efact.folder;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.command.IWorkerStatusController;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.efact.model.Provider;
import org.xendra.efact.plugin.IExtensionHandlerKeys;

public class PartnerFolder extends EFactTreeNode  {
	protected static ImageIcon localIcon = null;
	protected Integer id;		
	public PartnerFolder(Element item) {
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
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.efact", "form.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }
	@Override
	public String getTreePath() {
		// TODO Auto-generated method stub
		return null;
	}    
	public void loadChildren() {
		removeAllChildren();
//		List<X_C_BPartner_Certificate> certificates = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
//					.setParameters(m_bpartner.getC_BPartner_ID()).list();
//		for (X_C_BPartner_Certificate certificate:certificates) {
//			String type = "Certificate";
//			Element item = new Element("Certificate");
//			HashMap properties = certificate.getProperties();
//			String filename = (String) properties.get(Constants.FILENAME);
//			item.setAttribute("uid", String.valueOf(certificate.getC_Bpartner_Certificate_ID()));			
//			item.setAttribute("name", filename);							
//			Object[] args = { item };
//			IExtensionHandler handler = null;
//			try {
//				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_EFACT_FOLDER);
//			} catch (PluginHandlerNotFoundException ex) {
//				ErrorDialog.createDialog(ex.getMessage(),  ex);
//			}			
//			EFactTreeNode folder = null;			
//			try {
//				IExtension extension = handler.getExtension(type);
//				folder = (EFactTreeNode) extension.instanciateExtension(args);
//				this.add(folder);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}																		
//		}
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
	public void createChildren(IWorkerStatusController worker) {
		// TODO Auto-generated method stub
		
	}
}
