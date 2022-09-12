package org.xendra.efact.folder;

import java.util.List;
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
import org.xendra.efact.plugin.IExtensionHandlerKeys;

public class Root extends EFactTreeNode {
	public Root() {
		super(new Element("root"));
		loadChildren();
	}
	public Root(Element node) {
		super(node);
		loadChildren();
	}
	public Class getDefaultChild() {
		return null;
	}	
	public void createChildren(IWorkerStatusController c) {
	}
	public String getName() {
		return "Root";
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
	public void loadChildren() {
		removeAllChildren();
		List<X_C_BPartner_Certificate> pcs = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "IsActive = 'Y'", null)
					.list();
		for (X_C_BPartner_Certificate pc:pcs) {
			String type = "Partner";
			MBPartner p = MBPartner.get(Env.getCtx(), pc.getC_BPartner_ID());
			if (p == null)
				continue;
			Element item = new Element("Partner");
			item.setAttribute("uid", String.valueOf(pc.getC_Bpartner_Certificate_ID()));
			item.setAttribute("name", p.getName());
			Object[] args = { item };
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
//		List<MBPartner> partners = new Query(Env.getCtx(), 
//				MBPartner.Table_Name, 
//				"EXISTS (select 1 from C_BPartner_Certificate cbc where C_BPartner_ID = C_BPartner.C_BPartner_ID)", null)
//				.list();
//		for (MBPartner partner:partners) {
//			String type = "Partner";
//			Element item = new Element("Partner");			
//			X_C_BPartner_Certificate pc = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
//						.setParameters(partner.getC_BPartner_ID()).first();					
//			item.setAttribute("uid", String.valueOf(pc.getC_Bpartner_Certificate_ID());
//			item.setAttribute("name", partner.getName());					
//			Object[] args = { item, partner };
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
//		MConfig config = MConfig.getbyIdentifier("org.xendra.efact","providers");
//		InputStream is = new ByteArrayInputStream(config.getContent().getBytes());
//		Providers p = new Providers();
//		List<Provider>  listproviders = p.getProviders(is);
//		for (Provider prov:listproviders) {
//			String type = "provider";
//			Element item = new Element("provider");
//			item.setAttribute("uid", prov.getId());
//			item.setAttribute("name", prov.getName());					
//			Object[] args = { item, prov };
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
}
