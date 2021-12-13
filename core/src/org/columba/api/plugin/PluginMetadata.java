// The contents of this file are subject to the Mozilla Public License Version
// 1.1
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
//The Initial Developers of the Original Code are Frederik Dietz and Timo
// Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.columba.api.plugin;

import java.io.File;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;

public class PluginMetadata {
	private String id;
	private String name;
	private String description;
	private String version;
	private String tags;
	private String category;
	private String filename;
	//private String filesize;
	private String url;
	private boolean enabled;
	private boolean installed;
	private Timestamp sync;
	private HashMap properties;
	private Timestamp actual;
	private Timestamp update;

	private Vector extensions = new Vector();

	
	//private File directory;

//	public PluginMetadata(String id, String name, boolean enabled) {
//		this.id = id;
//		this.name = name;
//		this.enabled = enabled;
//	}

	public PluginMetadata(String id, String name, String description,
			String version, String category, String syncro, boolean enabled, boolean installed) {
		//this(id, name, enabled);
		this.id = id;
		this.name = name;
		this.enabled = enabled;
		this.installed = installed;
		this.description = description;
		this.version = version;
		this.category = category;
		if (syncro != null)
		{
			try {				
				setSynchronized(Timestamp.valueOf(syncro));
			} catch (Exception e) {}			
		}
	}

	public void addExtension(ExtensionMetadata metadata) {
		extensions.add(metadata);
	}

	public Enumeration enumExtensions() {
		return extensions.elements();
	}	
	
	public Timestamp getSynchronized() {
		return sync;
	}

	public void setSynchronized(Timestamp sync) {
		this.sync = sync;
	}

	/**
	 * @return Returns the category.
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @return Returns the extensions.
	 */
	public Vector getExtensions() {
		return extensions;
	}

	/**
	 * @return Returns the id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getTags() {
		return tags;
	}

	public void setTags(String tag) {
		this.tags = tag;
	}

	/**
	 * @return Returns the version.
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param enabled
	 *            The enabled to set.
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return Returns the enabled.
	 */
	public boolean isEnabled() {
		return enabled;
	}

	
//	/**
//	 * @param directory
//	 *            The directory to set.
//	 */
//	public void setDirectory(File directory) {
//		this.directory = directory;
//	}
//	
//	/**
//	 * @return Returns the directory.
//	 */
//	public File getDirectory() {
//		return directory;
//	}

	public boolean isInstalled() {
		return installed;
	}

	public void setInstalled(boolean installed) {
		this.installed = installed;
	}

	public String getFilename() {
		return filename;
	}

	public HashMap getProperties() {
		return properties;
	}

	public void setProperties(HashMap properties) {
		this.properties = properties;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

//	public String getFilesize() {
//		return filesize;
//	}
//
//	public void setFilesize(String filesize) {
//		this.filesize = filesize;
//	}
	public void setSource(String url) {
		this.url = url;
	}
	public String getSource() {
		return url;
	}

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
}