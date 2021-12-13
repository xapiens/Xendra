//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.columba.core.plugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.compiere.apps.ADialog;
import org.compiere.util.CLogger;
import org.compiere.util.Env;


/**
 * Find all plugins in the users config-directory and Columba's
 * program folder.
 *
 * @author fdietz
 */
public final class PluginFinder {

    private static final CLogger LOG = CLogger.getCLogger("org.columba.core.plugin");

    /**
     * Constructor for PluginFinder.
     */
    private PluginFinder() {
        super();
    }

    /**
     * Get list of all possible plugin folders.
     *
     * @return        array of plugin folders
     */
    public static File[] searchPlugins() {
        File[] programList = null;
        File programFolder = Env.getMachine().getPluginsFolder();
        if (programFolder.exists()) {
            programList = programFolder.listFiles();
        } else {
        	String error = String.format("no se puede acceder a %s modifique la ruta o elimine el registro del equipo",
        			programFolder.getAbsolutePath());
        	if (Env.isHeadless()) {
        		
        	} else {
        		ADialog.error(0, null, error);
        	}
        	System.exit(2);
        }

        if ((programList != null)) {
        	File[] result = new File[programList.length];
            System.arraycopy(programList, 0, result, 0, programList.length);
            return filterDirectories(result);
        } 
        return null;
    }

    /**
     * Filter out directories which are valid. Remove all
     * other files.
     *
     * @param files		array of plugin directories
     * @return			array of valid plugin directories
     */
    public static File[] filterDirectories(File[] files) {
        List list = new ArrayList();
        for (int i = 0; i < files.length; i++) {
            if (checkDirectory(files[i])) {
                list.add(files[i]);
            }
        }
        return (File[]) list.toArray(new File[0]);
    }


    /**
     * Check if directory is valid plugin directory.
     * <p>
     * A directory is valid if it contains a plugin.xml file
     * containing the plugin's meta information.
     *
     * @param file		plugin directory to check
     * @return			true, if directory contains plugin. False, otherwise.
     */
    public static boolean checkDirectory(File file) {
        if (file.isDirectory()) {
            File plugin = new File(file, "plugin.xml");
            return plugin.exists();
        }
        return false;
    }
}
