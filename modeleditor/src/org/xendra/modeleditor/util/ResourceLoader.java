package org.xendra.modeleditor.util;

import org.columba.core.resourceloader.GlobalResourceLoader;

public class ResourceLoader extends GlobalResourceLoader {
	protected static final String MODELEDITOR_RESOURCE_PATH = "org.xendra.modeleditor.i18n";
	private ResourceLoader() {}
	public static String getString(String sPath, String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(MODELEDITOR_RESOURCE_PATH, sPath), sName, sID);
	}
	public static String getString(String sName, String sID) {
		return GlobalResourceLoader.getString(generateBundlePath(MODELEDITOR_RESOURCE_PATH, sName), sName, sID);
	}
}
