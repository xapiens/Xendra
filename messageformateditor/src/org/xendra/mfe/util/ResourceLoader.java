package org.xendra.mfe.util;

import org.columba.core.resourceloader.GlobalResourceLoader;

public class ResourceLoader extends GlobalResourceLoader {
	protected static final String MFE_RESOURCE_PATH = "org.xendra.mfe.i18n";
	private ResourceLoader() {}
	public static String getString(String sPath, String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(MFE_RESOURCE_PATH, sPath), sName, sID);
	}
	public static String getString(String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(MFE_RESOURCE_PATH, sName), sName, sID);
	}
}
