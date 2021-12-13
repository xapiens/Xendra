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
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.columba.api.plugin.ExtensionHandlerMetadata;
import org.columba.api.plugin.ExtensionMetadata;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.IPluginManager;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.api.plugin.PluginMetadata;
import org.columba.core.config.Config;
import org.columba.core.config.View;
import org.columba.core.config.ViewList;
import org.columba.core.io.DiskIO;
import org.columba.core.xml.XmlElement;
import org.columba.core.xml.XmlIO;
import org.compiere.apps.ADialog;
import org.compiere.model.MRole;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Plugin_Access;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;

/**
 * Plugin manager is a singleton registry for all plugins and all extension handlers.
 * @author fdietz
 */
public class PluginManager implements IPluginManager {
	private static final CLogger LOG = CLogger.getCLogger("org.columba.core.plugin");
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
		HashMap properties = new HashMap();
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
		HashMap map = extension.parsePlugin(xmlFile.getName(), buf);
		PluginMetadata pluginMetadata = (PluginMetadata) map.get("metadata");		
		hashtable = (Hashtable) map.get(Constants.XML_ELEMENT_EXTENSIONLIST);
		properties = (HashMap) map.get(Constants.XML_ELEMENT_PROPERTIES);
		if (properties == null) {
			properties = new HashMap();
		}
		properties.put("directory", xmlFile.getParentFile().toString());
		Enumeration<ExtensionHandlerMetadata> e = extension.getExtensionHandler();
		while (e.hasMoreElements()) {
			ExtensionHandlerMetadata metadata = e.nextElement();
			IExtensionHandler handler = new ExtensionHandler(metadata.getId(), metadata.getParent());
			addExtensionHandler(metadata.getId(), handler);
		}
		pluginMetadata.setProperties(properties);
		String id = pluginMetadata.getId();
		System.out.println("pluginManager::addplugin->"+id);
		pluginMap.put(id, pluginMetadata);
		parseExtensions(hashtable, pluginMetadata, false);
		return id;		
	}

	/**
	 * @param extensionhandler
	 *            hashtable with String id and Vector of
	 *            <code>ExtensionMetadata</code>
	 * @param plugin
	 */
	private void parseExtensions(Hashtable extensionhandler, PluginMetadata plugin, boolean internal) {
		// loop through all extensions this plugin uses
		// -> search the corresponding extension handler
		// -> register the extension at the extension handler
		if (extensionhandler == null)
			return;
		Enumeration e = extensionhandler.keys();
		while (e.hasMoreElements()) {
			String extensionhandlerId = (String) e.nextElement();
			Vector extensions = (Vector) extensionhandler.get(extensionhandlerId);
			IExtensionHandler handler = null;
			// we have a plugin-handler for this kind of extension
			try {
				handler = getExtensionHandler(extensionhandlerId);
				Enumeration extensionlist = extensions.elements();
				while (extensionlist.hasMoreElements()) {
					ExtensionMetadata extension = (ExtensionMetadata) extensionlist.nextElement();
					Extension pluginExtension = new Extension(plugin, extension);
					pluginExtension.setInternal(internal);
					String extensionId = pluginExtension.getMetadata().getId();
					// if extension wasn't already registered
					if (!handler.exists(extensionId))
						handler.addExtension(extensionId, pluginExtension);
				}
			} catch (PluginHandlerNotFoundException e2) {
				LOG.severe("No suitable extension handler with name " + extensionhandlerId + " found");
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
		List<X_AD_Plugin> plugins = new ArrayList<X_AD_Plugin>();
		List<X_AD_Plugin_Access> pluginaccess = new Query(Env.getCtx(), X_AD_Plugin_Access.Table_Name, "AD_Role_ID = ?", null)
		.setParameters(Integer.valueOf(Env.getAD_Role_ID(Env.getCtx()))).list();
		for (X_AD_Plugin_Access access:pluginaccess)
		{
			X_AD_Plugin plugin = new X_AD_Plugin(Env.getCtx(), access.getAD_Plugin_ID(), null);
			if (plugin != null)
				plugins.add(plugin);
		}							
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
					HashMap properties = (HashMap) plugin.getProperties();
					if (properties == null) {
						properties = new HashMap();
					}
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
		File directory = null;
		String directorypath = (String) metadata.getProperties().get("directory");
		if (directorypath != null) {
			directory = new File(directorypath);
		}				
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
		HashMap map = new ExtensionXMLParser().parsePlugin(resourcePath, new BufferedInputStream(is));
		PluginMetadata pluginMetadata = (PluginMetadata) map.get("metadata");
		pluginMetadata.setInstalled(true);
		hashtable = (Hashtable) map.get(Constants.XML_ELEMENT_EXTENSIONLIST);		
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
		try {
			String result = new XendrianServer().setServlet("plugin").setType("core").start();
			XmlIO io = new XmlIO();
			io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));						
			List childs = io.getRoot().getElement(0).getElements();
			for (Iterator it = childs.iterator(); it.hasNext();) {			
				XmlElement child = (XmlElement) it.next();
				String id = child.getAttribute(Constants.XML_ATTRIBUTE_ID);
				String name = child.getAttribute(Constants.XML_ATTRIBUTE_NAME);
				String description = child.getAttribute(Constants.XML_ATTRIBUTE_DESCRIPTION);
				String categoryname = child.getAttribute(Constants.XML_ATTRIBUTE_CATEGORY);
				String version = child.getAttribute(Constants.XML_ATTRIBUTE_VERSION);
				String enabled = child.getAttribute(Constants.XML_ATTRIBUTE_ENABLED);
				String installed = child.getAttribute(Constants.XML_ATTRIBUTE_INSTALLED);
				String filename = child.getAttribute("filename");
				String filesize = child.getAttribute("filesize");
				String synchro = child.getAttribute(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
				Timestamp sync = null;
				if (synchro != null)
					sync = Timestamp.valueOf(synchro);
				else
					sync = new Timestamp(System.currentTimeMillis());
				//
				PluginMetadata pm = new PluginMetadata(id, 
						name, 
						description,
						version,
						categoryname,
						synchro,
						enabled.equals("Y"),
						installed.equals("Y"));								
				//				
				pm.setFilename(filename);
				plugins.add(pm);
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		try {
			String result = new XendrianServer().setServlet("plugin").setType("list").setRole(MRole.getDefault().getIdentifier()).start(); 
			XmlIO io = new XmlIO();
			io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));						
			List childs = io.getRoot().getElement(0).getElements();
			for (Iterator it = childs.iterator(); it.hasNext();) {			
				XmlElement child = (XmlElement) it.next();
				String id = child.getAttribute(Constants.XML_ATTRIBUTE_ID);
				String name = child.getAttribute(Constants.XML_ATTRIBUTE_NAME);
				String description = child.getAttribute(Constants.XML_ATTRIBUTE_DESCRIPTION);
				String categoryname = child.getAttribute(Constants.XML_ATTRIBUTE_CATEGORY);
				String enabled = child.getAttribute(Constants.XML_ATTRIBUTE_ENABLED);
				String installed = child.getAttribute(Constants.XML_ATTRIBUTE_INSTALLED);
				String version = child.getAttribute(Constants.XML_ATTRIBUTE_VERSION);
				String filename = child.getAttribute(Constants.XML_ATTRIBUTE_FILENAME);
				String synchro = child.getAttribute(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
				PluginMetadata pm = new PluginMetadata(id, 
						name, 
						description,
						version,
						categoryname,
						synchro,
						enabled.equals("true"),
						installed.equals("true"));												
				pm.setFilename(filename);
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
			System.out.println(String.format("pluginfolder=>%s", folder.getAbsolutePath()));
			File xmlFile = new File(folder, Constants.FILENAME_PLUGIN_XML);
			if (xmlFile == null || !xmlFile.exists()) {
				// skip if it doesn't exist
				if (xmlFile != null) {
					System.out.println(String.format("%s don't exist", xmlFile.getAbsoluteFile()));
				}
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
					String localversion = localplugin.getVersion();
					String version = plugin.getVersion();
					Timestamp localsync = localplugin.getSynchronized();
					Timestamp sync = plugin.getSynchronized();
					if (localversion == null)
						localversion = "";					
					if (version == null)
						version ="";
					if (localsync == null) 
						localsync = new Timestamp(System.currentTimeMillis());
					if (sync == null)
						sync = new Timestamp(System.currentTimeMillis());
					if (!localversion.equals(version) || !localsync.equals(sync))
					{
						System.out.println(String.format("localversion=%s, version=%s", localversion, version));
						System.out.println(String.format("localsync=%s, sync=%s", localsync, sync));
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
			String message = String.format("Desea actualizar desde %s", XendrianServer.getWebServerName());
			if (ADialog.ask(0, null, message)) 
				UpdatePlugin.getInstance().setPlugin(toUpdate);							
		}
		return updated;
	}
}