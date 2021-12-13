package org.columba.core.gui.plugin;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;
import org.compiere.util.CLogger;


/**
 * @author frd
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class PluginNode extends DefaultMutableTreeNode {

	private static final CLogger LOG = CLogger.getCLogger("org.columba.core.gui.plugin"); //$NON-NLS-1$
	int AD_Plugin_ID;
	String id;
	//String version;
	String tooltip;
	Timestamp actual;
	Timestamp update;
	boolean category;
	boolean enabled;
	boolean installed;
	//boolean updateable;
	HashMap Properties;
	String ConfigID = "";
	//	
	/** Lazily created Boolean stating if the plugin has info or not, can be null. */
	Boolean hasInfo = false;

	public PluginNode() {
		category = false;
	}

	/**
	 * @param arg0
	 */
	public PluginNode(Object arg0) {
		super(arg0);

		category = false;
	}

	/**
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param string
	 */
	public void setId(String string) {
		id = string;
	}

	/**
	 * @param b
	 */
	public void setEnabled(boolean b) {
		enabled = b;
	}

	/**
	 * @return
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * @param string
	 */
	public void setTooltip(String string) {
		tooltip = string;
	}

	public String getConfigID() {
		return ConfigID;
	}

	public void setConfigID(String configID) {
		ConfigID = configID;
	}



	//	/**
	//	 * @return
	//	 */
	//	public String getVersion() {
	//		return version;
	//	}
	//
	//	/**
	//	 * @param string
	//	 */
	//	public void setVersion(String string) {
	//		version = string;
	//	}

	public Timestamp getActual() {
		return actual;
	}

	public void setActual(Timestamp actual) {
		this.actual = actual;
	}

	public Timestamp getUpdate() {
		return update;
	}

	public void setUpdate(Timestamp update) {
		this.update = update;
	}

	/**
	 * @return
	 */
	public boolean isCategory() {
		return category;
	}
	/**
	 * @param b
	 */
	public void setCategory(boolean b) {
		category = b;
	}    

	public boolean isInstalled() {
		return installed;
	}

	public void setInstalled(boolean installed) {
		this.installed = installed;
	}

	public boolean isUpdateable() {
		boolean isupdate = false;
		if (this.actual != null && update != null) {
			if (this.actual.compareTo(update) != 0) {
				isupdate = true;
			}  
		}
		return isupdate;
	}
	//
	//	public void setUpdateable(boolean updateable) {
	//		this.updateable = updateable;
	//	}

	public HashMap getProperties() {
		return Properties;
	}

	public void setProperties(HashMap properties) {
		Properties = properties;
	}

	public int getAD_Plugin_ID() {
		return AD_Plugin_ID;
	}

	public void setAD_Plugin_ID(int aD_Plugin_ID) {
		AD_Plugin_ID = aD_Plugin_ID;
	}

	/**
	 * Returns true if the plugin has information about the plugin.
	 * This attribute is created lazily, and may take a while since it
	 * has to check for files on the file system. (Using the <code>PluginManager</code>.)
	 * @return true if the plugin has info files; false if it doesnt have an info file.
	 */
	public boolean hasInfo() {        
		hasInfo = false;
		if (getProperties() != null) {
			String surl = (String) getProperties().get("infourl");		
			if (surl != null) {
				try {
					URL url = new URL(surl);
					//return url != null;
					hasInfo = Boolean.valueOf(url != null);
					// try all possible version of readme files...
					//			File infoFile = new File(pluginDirectory, "readme.html");
					//			if (!infoFile.exists()) {
					//				infoFile = new File(pluginDirectory, "readme.txt");
					//			}
					//			if (!infoFile.exists()) {
					//				infoFile = new File(pluginDirectory, "Readme.html");
					//			}
					//			if (!infoFile.exists()) {
					//				infoFile = new File(pluginDirectory, "Readme.txt");
					//			}
					//			if (infoFile.exists()) {
					//				LOG.fine("infofile-URL=" + infoFile.toURL());
					//				return infoFile.toURL();
					//			}
				} catch (MalformedURLException ex) {
				} // does not occur
			}
		}        	
		//hasInfo = Boolean.valueOf(PluginManager.getInstance().getInfoURL(id) != null);
		return hasInfo;
	}

	public void debug() {
		LOG.info("id=" + id); //$NON-NLS-1$
		//LOG.info("version=" + version); //$NON-NLS-1$
		LOG.info("enabled=" + enabled); //$NON-NLS-1$
		LOG.info("isCategory=" + category); //$NON-NLS-1$
		LOG.info("description=" + tooltip); //$NON-NLS-1$
		LOG.info("hasInfo=" + hasInfo()); //$NON-NLS-1$
	}
}
