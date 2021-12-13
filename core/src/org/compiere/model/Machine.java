package org.compiere.model;

import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Util;
import org.xendra.Constants;

public class Machine extends X_A_Machine {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1640887122711952620L;

	public Machine(Properties ctx, int A_Machine_ID, String trxName) {
		super(ctx, A_Machine_ID, trxName);
	}

	public Machine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	
	public Integer getIntProperty(String PropertyName)
	{
		Integer intvalue = 0;
		String value = (String) getProperties().get(PropertyName);
		if (value != null)
			intvalue = Integer.valueOf(value);
		return intvalue;
	}
	public void setIntProperty(String PropertyName, Integer value) {
		String val = String.valueOf(value);
		HashMap prop = getProperties();
		prop.put(PropertyName, val);
		setProperties(prop);
		save();
	}
	public String toString()
	{		
		return getName();
	}
	public File getFolder(String key) {
		String location = "";
		if (getProperties().containsKey(key)) {
			location = (String) getProperties().get(key);
		} else {
			location = Ini.getXendraFolder(key);
			HashMap props = new HashMap();
			X_A_Machine current = new Query(Env.getCtx(), X_A_Machine.Table_Name, "Mac_Address = ? AND IsActive = 'Y'", null)
			.setParameters(Util.getLocalMacAddress()).first();
			if (current != null)
				props = Env.getMachine().getProperties();
			props.put(key, location);
			if (current != null) {
				Env.getMachine().setProperties(props);
				Env.getMachine().save();
			}
		}
		File f = new File(location);
		if (!f.exists()) {			
			if (f.mkdirs()) {
			}			
		}				
		return f;				
	}
	public File getWebFolder() {
		return getFolder(Constants.WEB);
	}
	public File getKeyStoreFolder() {		
		return getFolder(Constants.KEYSTORE);
	}
	public File getReportsFolder() {
		return getFolder(Constants.REPORTS);
	}
	public File getTrashFolder() {
		return getFolder(Constants.TRASH);
	}
	public File getPluginsFolder() {
		return getFolder(Constants.PLUGINS);
	}
	public File getReplicationFolder() {
		return getFolder(Constants.REPLICATION);
	}
	public File getDownloadFolder() {
		return getFolder(Constants.DOWNLOAD);
	}
	public File getInstalledFolder() {
		return getFolder(Constants.INSTALLED);
	}
	public File getStoreFolder() {
		return getFolder(Constants.STORE);
	}

	public void setFolder(String key, File file) {
		HashMap p = getProperties();
		p.put(key, file.getAbsolutePath());
		setProperties(p);
		save();		
	}				
}
