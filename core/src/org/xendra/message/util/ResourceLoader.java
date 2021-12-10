package org.xendra.message.util;

import org.columba.core.resourceloader.GlobalResourceLoader;

public class ResourceLoader extends GlobalResourceLoader {
    protected static final String RESOURCE_PATH = "org.xendra.message.i18n";

    /**
 * No need for creating instances of this class.
 */
    private ResourceLoader() {
    }

    //This is used when package name and file name are different.
    //Example: getString("dialog", "composer", "statusbar_label");
    public static String getString(String sPath, String sName, String sID) {
        return GlobalResourceLoader.getString(generateBundlePath(
                RESOURCE_PATH, sPath), sName, sID);
    }

    //This one is used when the package name and the file name are the same.
    //Example: getString("action", "menu_folder_newfolder");
    public static String getString(String sName, String sID) {
        return GlobalResourceLoader.getString(generateBundlePath(
                RESOURCE_PATH, sName), sName, sID);
    }
}