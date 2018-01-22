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
package org.columba.core.plugin;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Logger;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.columba.api.plugin.ExtensionHandlerMetadata;
import org.columba.api.plugin.ExtensionMetadata;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IPluginManager;
import org.columba.api.plugin.PluginException;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.api.plugin.PluginLoadingFailedException;
import org.columba.api.plugin.PluginMetadata;
import org.columba.core.component.api.IComponentPlugin;
import org.columba.core.config.Config;
import org.columba.core.config.View;
import org.columba.core.config.ViewList;
//import org.columba.core.config.ViewItem;
import org.columba.core.io.DiskIO;
import org.columba.core.io.ZipFileIO;
import org.columba.core.logging.Logging;
import org.columba.core.xml.XmlElement;
import org.columba.core.xml.XmlIO;
import org.compiere.apps.ADialog;
import org.compiere.model.MConfig;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Extension;
import org.compiere.model.persistence.X_AD_ExtensionList;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Plugin_Access;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;

/**
 * Plugin manager is a singleton registry for all plugins and all extension handlers.
 * @author fdietz
 */
public class PluginManager implements IPluginManager {
	private static final Logger LOG = Logger.getLogger("org.columba.core.plugin");
	private Hashtable<String, IExtensionHandler> handlerMap = new Hashtable<String, IExtensionHandler>();
	private Hashtable<String, PluginMetadata> pluginMap = new Hashtable<String, PluginMetadata>();
	private static PluginManager instance = new PluginManager();
	private File[] pluginFolders;

	/**
	 * 
	 */
	private PluginManager() {
		// find all possible plugin directories
		pluginFolders = PluginFinder.searchPlugins();				
	}
	/**
	 * @return instance
	 */
	public static IPluginManager getInstance() {
		return instance;
	}
	/**
	 * @see org.columba.api.plugin.IPluginManager#getExtensionHandler(java.lang.String)
	 */
	public IExtensionHandler getExtensionHandler(String id)	throws PluginHandlerNotFoundException {
		if (id == null)
			throw new IllegalArgumentException("id == null");
		if (handlerMap.containsKey(id))
			return (IExtensionHandler) handlerMap.get(id);
		else
			throw new PluginHandlerNotFoundException(id);
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#addPlugin(java.io.File)
	 */
	public String addPlugin(File xmlFile) {
		Hashtable hashtable = new Hashtable();
		// parse "/plugin.xml" file
		BufferedInputStream buf;
		try {
			buf = new BufferedInputStream(new FileInputStream(xmlFile));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			// cancel
			return null;
		}
		//addExtensionHandlers(buf);
		ExtensionXMLParser extension = new ExtensionXMLParser();
		HashMap map = extension.parsePlugin(buf);
		PluginMetadata pluginMetadata = (PluginMetadata) map.get("metadata");		
		hashtable = (Hashtable) map.get("extensionlist");
		
		Enumeration<ExtensionHandlerMetadata> e = extension.getExtensionHandler();
		while (e.hasMoreElements()) {
			ExtensionHandlerMetadata metadata = e.nextElement();
			IExtensionHandler handler = new ExtensionHandler(metadata.getId(), metadata.getParent());
			addExtensionHandler(metadata.getId(), handler);
		}
		pluginMetadata.setDirectory(xmlFile.getParentFile());		
		String id = pluginMetadata.getId();
		System.out.println("pluginManager::addplugin->"+id);
		pluginMap.put(id, pluginMetadata);
		// register all extensions
		parseExtensions(hashtable, pluginMetadata, false);
		return id;
	}

	/**
	 * @param hashtable
	 *            hashtable with String id and Vector of
	 *            <code>ExtensionMetadata</code>
	 * @param pluginMetadata
	 */
	private void parseExtensions(Hashtable hashtable, PluginMetadata pluginMetadata, boolean internal) {
		// loop through all extensions this plugin uses
		// -> search the corresponding extension handler
		// -> register the extension at the extension handler
		if (hashtable == null)
			return;
		Enumeration e = hashtable.keys();
		while (e.hasMoreElements()) {
			String extensionpointId = (String) e.nextElement();
			Vector extensionVector = (Vector) hashtable.get(extensionpointId);
			IExtensionHandler handler = null;
			// we have a plugin-handler for this kind of extension
			try {
				handler = getExtensionHandler(extensionpointId);
				Enumeration e2 = extensionVector.elements();
				while (e2.hasMoreElements()) {
					ExtensionMetadata extensionMetadata = (ExtensionMetadata) e2.nextElement();
					Extension pluginExtension = new Extension(pluginMetadata, extensionMetadata);
					pluginExtension.setInternal(internal);
					String extensionId = pluginExtension.getMetadata().getId();
					// if extension wasn't already registered
					if (handler.exists(extensionId) == false)
						handler.addExtension(extensionId, pluginExtension);
				}
			} catch (PluginHandlerNotFoundException e2) {
				LOG.severe("No suitable extension handler with name " + extensionpointId + " found");
			}
		}
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#initExternalPlugins()
	 */
	public void initExternalPlugins() {		
		// if no plugin directory exists -> return
		if (pluginFolders == null || pluginFolders.length == 0) {
			return;
		}
		Boolean resetFrame = true;
		String id = "";
		//XmlElement viewList = Config.getInstance().get("views").getElement("/views/viewlist");
		ViewList viewList = Config.getInstance().getViews().getViewlist();
		for (View view:viewList.getViews())
		{
			id = view.getId();
		}
//		for (int i = 0; i < viewList.count(); i++) {
//			XmlElement view = viewList.getElement(i);
//			ViewItem item = new ViewItem(view);
//			id = item.get("id");
//		}					
		List<X_AD_Plugin> plugins = new ArrayList<X_AD_Plugin>();
		List<X_AD_Plugin_Access> pluginaccess = new Query(Env.getCtx(), X_AD_Plugin_Access.Table_Name, "AD_Role_ID = ?", null)
		.setParameters(Integer.valueOf(Env.getAD_Role_ID(Env.getCtx()))).list();
		for (X_AD_Plugin_Access access:pluginaccess)
		{
			X_AD_Plugin plugin = new X_AD_Plugin(Env.getCtx(), access.getAD_Plugin_ID(), null);
			if (plugin != null)
				plugins.add(plugin);
		}							
//		for (X_AD_Plugin plugin:plugins)
//		{
//			String plugincontent = plugin.getplugin();
//			if (plugincontent.contains(String.format("extension id=\"%s\"", id)))
//			{
//				resetFrame = false;
//			}
//		}
//		if (resetFrame)
//		{			
//			MConfig.reset(Constants.CORE,"views");
//		}
		// try to load all plugins
		for (int i = 0; i < pluginFolders.length; i++) {
			File folder = pluginFolders[i];

			File xmlFile = new File(folder, Constants.FILENAME_PLUGIN_XML);
			if (xmlFile == null || !xmlFile.exists()) {
				// skip if it doesn't exist
				continue;
			}
			for (X_AD_Plugin plugin:plugins)
			{
				if (folder.getPath().contains(plugin.getFolder()))
				{
					LOG.fine("registering plugin: " + folder);
					System.out.println("PluginManager::initExternalPlugins registering plugin: " + folder.getAbsolutePath());
					addPlugin(xmlFile);					
				}
			}
		}
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#getPluginConfigFile(java.lang.String)
	 */
	public File getPluginConfigFile(String id) {
		PluginMetadata metadata = (PluginMetadata) pluginMap.get(id);
		File directory = metadata.getDirectory();
		File configFile = new File(directory, Constants.FILENAME_CONFIG_XML);
		return configFile;
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#getPluginMetadata(java.lang.String)
	 */
	public PluginMetadata getPluginMetadata(String id) {
		if (id == null)
			throw new IllegalArgumentException("id == null");
		PluginMetadata metadata = (PluginMetadata) pluginMap.get(id);
		return metadata;
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#getInfoURL(java.lang.String)
	 */
	public URL getInfoURL(String id) {
		PluginMetadata metadata = (PluginMetadata) pluginMap.get(id);
		File pluginDirectory = metadata.getDirectory();
		if (pluginDirectory == null) {
			return null;
		}
		try {
			// try all possible version of readme files...
			File infoFile = new File(pluginDirectory, "readme.html");
			if (!infoFile.exists()) {
				infoFile = new File(pluginDirectory, "readme.txt");
			}
			if (!infoFile.exists()) {
				infoFile = new File(pluginDirectory, "Readme.html");
			}
			if (!infoFile.exists()) {
				infoFile = new File(pluginDirectory, "Readme.txt");
			}
			if (infoFile.exists()) {
				LOG.fine("infofile-URL=" + infoFile.toURL());
				return infoFile.toURL();
			}
		} catch (MalformedURLException ex) {
		} // does not occur
		return null;
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#getPluginMetadataEnumeration()
	 */
	public Enumeration getPluginMetadataEnumeration() {
		return pluginMap.elements();
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#addPlugin(java.lang.String)
	 */
	public String addPlugin(String resourcePath) {
		if (resourcePath == null)
			throw new IllegalArgumentException("resourcePath == null");

//		if (!role.isTableAccess(vo.AD_Table_ID, true))
//		error error
		// retrieve inputstream from resource
		InputStream is;
		try {
			is = DiskIO.getResourceStream(resourcePath);
		} catch (IOException e) {
			e.printStackTrace();
			// cancel
			return null;
		}

		// parse plugin metadata
		Hashtable hashtable = new Hashtable();
		HashMap map = new ExtensionXMLParser().parsePlugin(new BufferedInputStream(is));
		PluginMetadata pluginMetadata = (PluginMetadata) map.get("metadata");		
		hashtable = (Hashtable) map.get("extensionlist");		
		String id = pluginMetadata.getId();
		// 
		// Note: We intentionally don't remember internal plugins, because
		// we don't want them to appear in the plugin manager currently.
		// 
		// TODO: improve plugin manager dialog to support internal plugins
		// which can't be removed, etc.

		// remember plugin metadata
		pluginMap.put(id, pluginMetadata);

		// register all extensions
		parseExtensions(hashtable, pluginMetadata, true);
		return id;
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#initExternalExtensionHandlers()
	 */
	public void initExternalExtensionHandlers() {
		// if no plugin directory exists -> return
		if (pluginFolders == null || pluginFolders.length == 0) {
			return;
		}

		// try to load extensin handlers of all plugins
		for (int i = 0; i < pluginFolders.length; i++) {
			File folder = pluginFolders[i];

			File xmlFile = new File(folder, Constants.FILENAME_EXTENSIONHANDLER_XML);

			if (xmlFile == null || !xmlFile.exists()) {
				// skip if it doesn't exist
				continue;
			}

			BufferedInputStream buf;
			try {
				buf = new BufferedInputStream(new FileInputStream(xmlFile));
				LOG.fine("registering extension handler: " + folder);
				addExtensionHandlers(buf);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
				// cancel
				continue;
			}
		}
	}

	/**
	 * @see org.columba.api.plugin.IPluginManager#addExtensionHandlers(java.io.InputStream)
	 */
	public void addExtensionHandlers(InputStream is) {
		Enumeration<ExtensionHandlerMetadata> e = new ExtensionXMLParser().parseExtensionHandlerList(is);
		while (e.hasMoreElements()) {
			ExtensionHandlerMetadata metadata = e.nextElement();
			IExtensionHandler handler = new ExtensionHandler(metadata.getId(), metadata.getParent());
			addExtensionHandler(metadata.getId(), handler);
		}
	}
	/**
	 * @see org.columba.api.plugin.IPluginManager#addExtensionHandler(java.lang.String,
	 *      org.columba.api.plugin.IExtensionHandler)
	 */
	public void addExtensionHandler(String id, IExtensionHandler handler) {
		if (id == null)
			throw new IllegalArgumentException("id == null");
		if (handler == null)
			throw new IllegalArgumentException("handler == null");
		LOG.fine("adding extension handler " + id);
		handlerMap.put(id, handler);
	}
	/**
	 * @see org.columba.api.plugin.IPluginManager#addExtensionHandlers(java.lang.String)
	 */
	public void addExtensionHandlers(String resourcePath) {
		// retrieve inputstream from resource
		System.out.println("PluginManager.addExtensionHandlers:resourcePath:" + resourcePath);
		InputStream is;
		try {
			is = DiskIO.getResourceStream(resourcePath);
		} catch (IOException e) {
			e.printStackTrace();
			// cancel
			return;
		}
		addExtensionHandlers(is);
	}	

	public boolean Sync() {
		if (pluginFolders == null) 
			return false;		
		List<PluginMetadata> plugins = new ArrayList<PluginMetadata>();
		List<PluginMetadata> localplugins = new ArrayList<PluginMetadata>();
		List<PluginMetadata> toUpdate = new ArrayList<PluginMetadata>();
		X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_Machine_ID = ? AND servertype = ?", null)
		.setParameters(Env.getServerWeb().getA_Machine_ID(), REF_ServerType.WebServer).first();
		if (ms == null)
			return false;
		int port = ms.getHostPort();
		// actualizamos el core
		String url = String.format("http://%s:%s/plugin?type=core", Env.getServerWeb().getName(),port);
		System.out.println(url);
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(url).build();
		try {
			Response response = client.newCall(request).execute();
			String result = response.body().string();
			System.out.println(result);
			XmlIO io = new XmlIO();
			io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));						
			List childs = io.getRoot().getElement(0).getElements();
			for (Iterator it = childs.iterator(); it.hasNext();) {			
				XmlElement child = (XmlElement) it.next();
				String id = child.getAttribute(Constants.XML_ATTRIBUTE_ID);
				String name = child.getAttribute(Constants.XML_ATTRIBUTE_NAME);
				String version = child.getAttribute(Constants.XML_ATTRIBUTE_VERSION);
				String filename = child.getAttribute("filename");
				String filesize = child.getAttribute("filesize");
				String synchro = child.getAttribute(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
				Timestamp sync = Timestamp.valueOf(synchro);
				//				
				PluginMetadata pm = new PluginMetadata(id, name, true);
				pm.setFilename(filename);
				pm.setFilesize(filesize);
				pm.setVersion(version);
				pm.setSynchronized(sync);
				plugins.add(pm);
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		// aca tenemos lo que deberiamos tener instalado 
		X_A_Machine mach = Env.getServerWeb();
		url = String.format("http://%s:%s/plugin?ad_role_id=%s&type=list", Env.getServerWeb().getName(),port, Env.getAD_Role_ID(Env.getCtx()));
		System.out.println(url);
		client = new OkHttpClient();
		request = new Request.Builder().url(url).build();
		try {
			Response response = client.newCall(request).execute();
			String result = response.body().string();
			XmlIO io = new XmlIO();
			io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));						
			List childs = io.getRoot().getElement(0).getElements();
			for (Iterator it = childs.iterator(); it.hasNext();) {			
				XmlElement child = (XmlElement) it.next();
				String id = child.getAttribute(Constants.XML_ATTRIBUTE_ID);
				String name = child.getAttribute(Constants.XML_ATTRIBUTE_NAME);
				String version = child.getAttribute(Constants.XML_ATTRIBUTE_VERSION);
				String filename = child.getAttribute("filename");
				String filesize = child.getAttribute("filesize");
				String synchro = child.getAttribute(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
				Timestamp sync = Timestamp.valueOf(synchro);
				//				
				PluginMetadata pm = new PluginMetadata(id, name, true);
				pm.setFilename(filename);
				pm.setFilesize(filesize);
				pm.setVersion(version);
				pm.setSynchronized(sync);
				plugins.add(pm);
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		// try to load all plugins
		for (int i = 0; i < pluginFolders.length; i++) {
			File folder = pluginFolders[i];
			File xmlFile = new File(folder, Constants.FILENAME_PLUGIN_XML);
			if (xmlFile == null || !xmlFile.exists()) {
				// skip if it doesn't exist
				continue;
			}			
			BufferedInputStream buf;
			try {
				buf = new BufferedInputStream(new FileInputStream(xmlFile));
				Document doc = ExtensionXMLParser.retrieveDocument(buf);
				Element pluginElement = doc.getRootElement();
				PluginMetadata pluginMetadata = new ExtensionXMLParser().parsePluginMetadata(pluginElement);
				//
				X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ? AND version = ?", null)
					.setParameters(pluginMetadata.getId(), new BigDecimal(pluginMetadata.getVersion())).first();
				
				if (plugin == null)
					continue;
				
				X_AD_Plugin_Access access = new Query(Env.getCtx(), X_AD_Plugin_Access.Table_Name, "AD_Role_ID = ? AND AD_Plugin_ID = ?", null)
					.setParameters(Env.getAD_Role_ID(Env.getCtx()), plugin.getAD_Plugin_ID()).first();
				if (access != null)
				{
					localplugins.add(pluginMetadata);
				}
				else if (plugin.getID().equals("org.columba.core"))
				{
					localplugins.add(pluginMetadata);
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}		
		for (PluginMetadata plugin:plugins)
		{
			boolean found = false;
			for (PluginMetadata localplugin:localplugins)
			{
				if (localplugin.getId().equals(plugin.getId()))
				{
					found = true;
					if (!localplugin.getVersion().equals(plugin.getVersion()) || !localplugin.getSynchronized().equals(plugin.getSynchronized()))
					{
						toUpdate.add(plugin);
					}							
				}
			}			
			if (!found)
			{
				toUpdate.add(plugin);
			}
		}
		boolean updated = false;
		if (toUpdate.size() > 0)
		{
			String message = String.format("Desea actualizar desde %s", Env.getServerWeb().getName());
			if (ADialog.ask(0, null, message))
				updated = UpdatePlugin.getInstance().setPlugin(toUpdate);
		}
		return updated;
	}
}