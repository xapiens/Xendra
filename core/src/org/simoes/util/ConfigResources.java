package org.simoes.util;

import java.io.*;
import java.util.*;

import org.compiere.util.CLogger;

/**
 * 
 * Provides user with access to the properties file.
 * 
 * @author Chris Simoes
 */
public class ConfigResources {
	static CLogger log = CLogger.getCLogger(ConfigResources.class);
	
	private static PropertyResourceBundle resourceBundle;
	
	public static final String FILE_NAME = "lpd.properties";
	
	static {
		init();
	}
	
	private static void init() {
		final String METHOD_NAME = "init(): ";
		if(null == resourceBundle) {
			File configFile = new File(FILE_NAME);
			InputStream is = null;
			try {
				is = new BufferedInputStream(new FileInputStream(configFile));
				resourceBundle = new PropertyResourceBundle(is);
			} catch(IOException e) {
				System.err.println("LPD is not configured properly.");
				log.severe(METHOD_NAME + "Could not find properties file:" + FILE_NAME);
				log.severe(METHOD_NAME + e.getMessage());
			}
		}
	}
	
	public static String getProperty(String key) {
		return resourceBundle.getString(key);
	}
}