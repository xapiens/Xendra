package org.xendra.utils;

import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;

import org.compiere.model.MStore;
import org.compiere.util.CLogger;
import org.compiere.util.SecureEngine;
import org.xendra.Constants;

public class ToolDev {
	private static CLogger log = CLogger.getCLogger(ToolDev.class);

	public static void main(String[] args) {
		if (!org.compiere.Xendra.startup(false))
		{					
			log.log(Level.SEVERE, "can't connect to database");
			return;
		}		
	}
	public static boolean isvalidkeystore()  {
		Boolean isvalid = false;
		MStore store = MStore.getInstance();
		HashMap Properties = store.getProperties();		
		String keystore = (String) Properties.get(Constants.KEYSTORE);
		if (keystore == null) {
			keystore = "";
		}
		if (keystore.length() > 0) {
			String keystorefile = SecureEngine.decrypt(keystore);		
			File file = new File(keystorefile);
			isvalid = file.exists();
		} 			
		return isvalid;
	}
	public static File getkeystorefile() {
		MStore store = MStore.getInstance();
		HashMap Properties = store.getProperties();		
		String keystore = (String) Properties.get(Constants.KEYSTORE);
		String keystorefile = SecureEngine.decrypt(keystore);		
		File file = new File(keystorefile);
		return file;
	}
	public static char[] getkeystorepassword() {
		MStore store = MStore.getInstance();
		HashMap Properties = store.getProperties();
		String pwdcrypt = (String) Properties.get("ServerPassword");
		String passw = SecureEngine.decrypt(pwdcrypt);
		return passw.toCharArray();
	}	
	public static boolean isvalidpassword() {
		Boolean isvalid = false;
		MStore store = MStore.getInstance();
		HashMap Properties = store.getProperties();
		String pwdcrypt = (String) Properties.get("ServerPassword");
		if (pwdcrypt == null) {
			pwdcrypt = "";
		}
		if (pwdcrypt.length() > 0) {
			//String passw = SecureEngine.decrypt(pwdcrypt);
			isvalid = true;
		}
		return isvalid;
	}
}
