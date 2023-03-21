package org.xendra.efact;

import java.awt.EventQueue;
import java.util.List;

import org.columba.core.component.ComponentManager;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.plugin.PluginManager;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.compiere.util.Splash;
import org.xendra.efact.gui.action.SendAction;

public class Efact {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin())		//	no automatic login
					{
						//	Center the window
						try
						{
							AEnv.showCenterScreen(login);	//	HTML load errors
						}
						catch (Exception ex)
						{
							//log.severe(ex.toString());
							ex.printStackTrace();
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}
					
					splash.dispose();
					splash = null;					
					
					int AD_Role_ID = Env.getAD_Role_ID(Env.getCtx());
					
					PluginManager.getInstance().addExtensionHandlers("org/columba/core/plugin/extensionhandler.xml");
					//PluginManager.getInstance().addExtensionHandlers("org/xendra/security/plugin/extensionhandler.xml");
					PluginManager.getInstance().addExtensionHandlers("org/xendra/efact/plugin/extensionhandler.xml");

					String path = "org/columba/core/plugin/plugin.xml";
					PluginManager.getInstance().addPlugin(path);

					
					
					path = "org/xendra/efact/plugin/plugin.xml";
					PluginManager.getInstance().addPlugin(path);
					ComponentManager.getInstance().init();
					SendAction sa = new SendAction(null);
					//sa.cert();
					//sa.test();
					//sa.testnostalgia();
					FrameManager.getInstance().openView("EFact");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 

	}

}
