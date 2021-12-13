package org.xendra.pop.util;

import org.columba.core.resourceloader.GlobalResourceLoader;

public class ResourceLoader extends GlobalResourceLoader {
	protected static final String POP_RESOURCE_PATH = "org.xendra.pop.i18n";
	private ResourceLoader() {}
	public static String getString(String sPath, String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(
				POP_RESOURCE_PATH, sPath), sName, sID);
	}
	public static String getString(String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(
				POP_RESOURCE_PATH, sName), sName, sID);
	}
}
