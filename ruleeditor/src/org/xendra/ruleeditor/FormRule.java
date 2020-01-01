package org.xendra.ruleeditor;



import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import org.columba.core.component.ComponentManager;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.main.Main;
import org.columba.core.main.MainClassLoader;
import org.columba.core.plugin.PluginManager;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.swing.CPanel;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Splash;

/**
 * xapiens
 */

public class FormRule {
  
  public static void main(String[]args){
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
					
					List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y' ", null).list();
					for (X_A_Machine machine:machines)
					{
						
					}
					PluginManager.getInstance().addExtensionHandlers("org/columba/core/plugin/extensionhandler.xml");
					PluginManager.getInstance().addExtensionHandlers("org/xendra/ruleeditor/plugin/extensionhandler.xml");

					String path = "org/columba/core/plugin/plugin.xml";
					PluginManager.getInstance().addPlugin(path);

					path = "org/xendra/ruleeditor/plugin/plugin.xml";
					PluginManager.getInstance().addPlugin(path);
					//Main.mainClassLoader = new MainClassLoader(Main.class.getClassLoader());
					ComponentManager.getInstance().init();
					FrameManager.getInstance().openView("RuleEditor");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
  }
  /** Defcon. */
  private FormRule() {
    // nop
  }
}
      