package org.xendra.pfe.util;

import org.columba.core.resourceloader.GlobalResourceLoader;

public class ResourceLoader extends GlobalResourceLoader {
	protected static final String PFE_RESOURCE_PATH = "org.xendra.pfe.i18n";
	private ResourceLoader() {}
	public static String getString(String sPath, String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(PFE_RESOURCE_PATH, sPath), sName, sID);
	}
	public static String getString(String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(PFE_RESOURCE_PATH, sName), sName, sID);
	}
}
