package org.columba.core.plugin;

import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.columba.api.plugin.ExtensionForm;
import org.columba.api.plugin.ExtensionFormTrl;
import org.columba.api.plugin.ExtensionHandlerMetadata;
import org.columba.api.plugin.ExtensionMenuItem;
import org.columba.api.plugin.ExtensionMenuItemTrl;
import org.columba.api.plugin.ExtensionMetadata;
import org.columba.api.plugin.PluginMetadata;
import org.columba.api.plugin.ServletMetadata;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_TreeNodeMM;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_AD_MenuAction;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;

/**
 * Convenience methods for parsing the various xml-file resources.
 * 
 * @author Frederik Dietzs
 */
public class ExtensionXMLParser extends XMLCoreParser {
	private static final CLogger LOG = CLogger.getCLogger("org.columba.core.plugin");
	private Enumeration<ExtensionHandlerMetadata> e = null;
	private HashMap plugin;
	private String filename;	

	/**
	 * Parse IExtension enumeration metadata from xml file.
	 * 
	 * @param is
	 *            inputstream of xml extension file
	 * @param pluginMetadata
	 *            can be <code>null</code>, in case of internal plugin
	 * @param internal
	 *            true, if internal, False, otherwise.
	 * @return enumeration of <code>Extension</code>
	 */
	public Enumeration loadExtensionsFromStream(InputStream is,	PluginMetadata pluginMetadata, boolean internal) {
		Vector<Extension> vector = new Vector<Extension>();

		Document doc = retrieveDocument(is);

		Element parent = doc.getRootElement();

		if (parent == null || !parent.getName().equals(Constants.XML_ELEMENT_EXTENSIONLIST)) {
			LOG.severe("missing <extensionlist> element");
			return null;
		}

		Iterator iterator = parent.getChildren().listIterator();
		Element extensionXmlElement;

		while (iterator.hasNext()) {
			extensionXmlElement = (Element) iterator.next();

			ExtensionMetadata metadata = parseExtensionMetadata(extensionXmlElement);

			if (internal == true)
				vector.add(new Extension(metadata, internal));
			else
				vector.add(new Extension(pluginMetadata, metadata));

		}

		return vector.elements();
	}

	public ServletMetadata parseServletMetadata(Element extensionXmlElement) {
		String name = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
		if (name == null) {
			LOG.severe("missing attribute \"name\"");
			return null;
		}
		String clazz = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_CLASS);
		if (clazz == null) {
			LOG.severe("missing attribute \"class\"");
			return null;
		}
		String mapping = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_MAPPING);
		if (mapping == null) {
			LOG.severe("missing attribute \"mapping\"");
			return null;
		}		
		//
		ServletMetadata metadata = null;
		metadata = new ServletMetadata(name, clazz, mapping);
		return metadata;				
	}
	/**
	 * Parse extension metadata.
	 * 
	 * @param extensionXmlElement
	 * @return
	 */
	public ExtensionMetadata parseExtensionMetadata(Element extensionXmlElement) {
		String id = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
		if (id == null) {
			LOG.severe("missing attribute \"id\"");
			return null;
		}

		String clazz = extensionXmlElement.getAttributeValue("class");
		if (clazz == null) {
			LOG.severe("missing attribute \"class\"");
			return null;
		}

		String enabledString = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_ENABLED);
		String singletonString = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_SINGLETON);

		Element attributesElement = extensionXmlElement.getChild(Constants.XML_ELEMENT_PROPERTIES);
		Map<String, String> attributes = new Hashtable<String, String>();
		if (attributesElement != null) {
			List list = attributesElement.getAttributes();
			for (int i=0; i<list.size(); i++) {
				Attribute a = (Attribute) list.get(i);
				attributes.put(a.getName(), a.getValue());
			}
		}

		ExtensionMetadata metadata = null;
		if (attributes != null)
			metadata = new ExtensionMetadata(id, clazz, attributes);
		else
			metadata = new ExtensionMetadata(id, clazz);

		if (enabledString != null)
			metadata.setEnabled(new Boolean(enabledString).booleanValue());

		if (singletonString != null)
			metadata.setSingleton(new Boolean(singletonString).booleanValue());

		return metadata;
	}

	/**
	 * Parse plugin metadata.
	 * 
	 * @param pluginElement
	 * @return
	 */
	public PluginMetadata parsePluginMetadata(Element pluginElement) {

		String id = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
		String name = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);		
		String version = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_VERSION);
		String enabled = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_ENABLED);
		String category = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_CATEGORY);
		String tags = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_TAGS);
		if (tags == null)
			tags = "";
		String description = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_DESCRIPTION);
		String syncro = pluginElement.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);

		PluginMetadata pluginMetadata = new PluginMetadata(id, name,description, version, category, syncro, new Boolean(enabled).booleanValue(), false);
		pluginMetadata.setTags(tags);
		return pluginMetadata;
	}

	public Enumeration<ExtensionHandlerMetadata> parseExtensionHandlerList(Element pluginElement) {
		Vector<ExtensionHandlerMetadata> vector = new Vector<ExtensionHandlerMetadata>();
		Element list = pluginElement.getChild(Constants.XML_ELEMENT_HANDLERLIST);
		if (list == null)
			return vector.elements();

		Iterator it = list.getChildren().listIterator();
		while (it.hasNext()) {
			Element child = (Element) it.next();
			// skip non-matching elements
			if (child.getName().equals("handler") == false)
				continue;
			String id = child.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
			String parent = child.getAttributeValue(Constants.XML_ATTRIBUTE_PARENT);

			ExtensionHandlerMetadata metadata = new ExtensionHandlerMetadata(id, parent);

			vector.add(metadata);
		}

		return vector.elements();		
	}


	/**
	 * @param vector
	 * @param xmlFile
	 * @return
	 */
	public  Enumeration<ExtensionHandlerMetadata> parseExtensionHandlerList(InputStream is) {
		Vector<ExtensionHandlerMetadata> vector = new Vector<ExtensionHandlerMetadata>();
		Document doc = retrieveDocument(is);
		Element list = doc.getRootElement();
		if (list == null || !list.getName().equals(Constants.XML_ELEMENT_HANDLERLIST)) {
			LOG.severe("element <handlerlist> expected.");
			return vector.elements();
		}

		Iterator it = list.getChildren().listIterator();
		while (it.hasNext()) {
			Element child = (Element) it.next();
			// skip non-matching elements
			if (child.getName().equals("handler") == false)
				continue;
			String id = child.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
			String parent = child.getAttributeValue(Constants.XML_ATTRIBUTE_PARENT);

			ExtensionHandlerMetadata metadata = new ExtensionHandlerMetadata(id, parent);

			vector.add(metadata);
		}

		return vector.elements();
	}

	public Enumeration<ExtensionHandlerMetadata> getExtensionHandler() {
		return e;
	}
	/**
	 * "plugin.xml" file parse.
	 * 
	 * @param is	inputstream of "plugin.xml" file
	 * @param extensionlist
	 *            hashtable will be filled with Vector of all extensions
	 * @return plugin metadata
	 */
	public HashMap parsePlugin(String filename, InputStream is) {
		this.filename = filename;
		plugin = new HashMap();
		Hashtable extensionlist = new Hashtable();
		Hashtable servletlist = new Hashtable();
		Hashtable properties = new Hashtable();
		Hashtable forms = new Hashtable();	
		Hashtable server = new Hashtable();
		Document doc = retrieveDocument(is);

		if (doc == null)
			return null;

		Element pluginElement = doc.getRootElement();
		//
		//e = new ExtensionXMLParser().parseExtensionHandlerList(pluginElement);
		e = parseExtensionHandlerList(pluginElement);
		//		
		//PluginMetadata pluginMetadata = new ExtensionXMLParser().parsePluginMetadata(pluginElement);
		PluginMetadata pluginMetadata = parsePluginMetadata(pluginElement);
		plugin.put("metadata", pluginMetadata);
		// loop through all extensions this plugin uses
		Iterator it = pluginElement.getChildren().listIterator();
		while (it.hasNext() ) {
			Element extensionListXmlElement = (Element) it.next();
			if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_MENU))
			{
				Vector<ExtensionMenuItem> menu = new Vector<ExtensionMenuItem>();
				Vector<ExtensionMenuItemTrl> menutrl = new Vector<ExtensionMenuItemTrl>();
				Iterator it2 = extensionListXmlElement.getChildren().listIterator();
				while (it2.hasNext() ) {
					Element extensionXmlElement = (Element) it2.next();
					if (!extensionXmlElement.getName().equals("menuitem"))
						continue;
					//ExtensionMenuItem extensionmenuitem = new ExtensionXMLParser().parseMenuItem(extensionXmlElement);
					ExtensionMenuItem extensionmenuitem = parseMenuItem(extensionXmlElement);
					menu.add(extensionmenuitem);
					Iterator itrl = extensionXmlElement.getChildren().listIterator();
					while (itrl.hasNext()) {
						Element menuitemtrl = (Element) itrl.next();
						//ExtensionMenuItemTrl mntrl = new ExtensionXMLParser().parseMenuItemTrl(menuitemtrl);
						ExtensionMenuItemTrl mntrl = parseMenuItemTrl(menuitemtrl);
						mntrl.setIdentifier(extensionmenuitem.getIdentifier());
						menutrl.add(mntrl);
					}
				}				
				plugin.put("menu", menu);
				plugin.put("menutrl", menutrl);
			}
			else if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_MENUITEM)) 
			{
				XMLOutputter outp = new XMLOutputter();
				String s = outp.outputString(extensionListXmlElement);
				plugin.put(Constants.XML_ELEMENT_MENUITEM, s);				
			}			
			else if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_SERVLETLIST))
			{
				String extensionpointId = extensionListXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
				String containername = extensionListXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
				String containercontext = extensionListXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_CONTEXT);
				if (extensionpointId == null) {
					LOG.severe("missing extension point id attribute");
					continue;
				}
				Vector<ServletMetadata> vector = new Vector<ServletMetadata>();
				Iterator it2 = extensionListXmlElement.getChildren().listIterator();
				while (it2.hasNext() ) {
					Element extensionXmlElement = (Element) it2.next();
					//ServletMetadata servletMetadata = new ExtensionXMLParser().parseServletMetadata(extensionXmlElement);
					ServletMetadata servletMetadata = parseServletMetadata(extensionXmlElement);
					servletMetadata.setContainername(containername);
					servletMetadata.setContainercontext(containercontext);
					vector.add(servletMetadata);
				}
				servletlist.put(extensionpointId, vector);
				plugin.put("servletlist", servletlist);
			}
			else if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_PROPERTIES)) {
				Iterator props = extensionListXmlElement.getChildren().listIterator();
				HashMap propmap = new HashMap();
				while (props.hasNext()) {
					Element property = (Element) props.next();
					if (!property.getName().equals(Constants.Property))
						continue;
					propmap.put(property.getAttributeValue(Constants.XML_ATTRIBUTE_NAME), property.getAttributeValue(Constants.XML_ATTRIBUTE_VALUE));
				}

				plugin.put(Constants.XML_ELEMENT_PROPERTIES, propmap);
			}
			else if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_EXTENSIONLIST))
			{
				String extensionpointId = extensionListXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
				if (extensionpointId == null) {
					LOG.severe("missing extension point id attribute");
					continue;
				}				
				Vector<ExtensionMetadata> vector = new Vector<ExtensionMetadata>();
				Iterator it2 = extensionListXmlElement.getChildren().listIterator();
				while (it2.hasNext() ) {
					Element extensionXmlElement = (Element) it2.next();
					// skip if no <extension> element found
					if (!extensionXmlElement.getName().equals(Constants.XML_ELEMENT_EXTENSION))
						continue;

					ExtensionMetadata extensionMetadata = new ExtensionXMLParser().parseExtensionMetadata(extensionXmlElement);
					vector.add(extensionMetadata);
				}
				extensionlist.put(extensionpointId, vector);
				plugin.put(Constants.XML_ELEMENT_EXTENSIONLIST, extensionlist);
			}
			else if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_FORM))
			{				
				List<ExtensionFormTrl> formtrl = new ArrayList<ExtensionFormTrl>();
				ExtensionForm form = parseForm(extensionListXmlElement);
				if (form == null) {
					LOG.severe("incomplete form parameters");
				}
				Iterator itrl = extensionListXmlElement.getChildren().listIterator();
				while (itrl.hasNext() ) {
					Element ftrl = (Element) itrl.next();
					ExtensionFormTrl mntrl = parseFormTrl(ftrl);
					formtrl.add(mntrl);
				}
				form.addTrl(formtrl);
				forms.put(form.getIdentifier(), form);
				plugin.put("form", forms);
			} else if (extensionListXmlElement.getName().equals("server")) {				
				parseServer(extensionListXmlElement);			
			} else if (extensionListXmlElement.getName().equals(Constants.XML_ELEMENT_DIRECTORY)) {
				// the folder name
				String name = extensionListXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
				// the destination
				String location = extensionListXmlElement.getAttributeValue(Constants.XML_ELEMENT_LOCATION);
				HashMap directory = null;
				if (plugin.containsKey("directory")) {
					directory = (HashMap) plugin.get("directory");
				} else {
					directory = new HashMap();
				}				
				directory.put(name, location);
				plugin.put("directory", directory);
				//File webdir = new File(pluginDirectory, name);
				//ZipFileIO.extract(name, px);
				
				//String plugins = (String) Env.getMachine().getProperties().get(Constants.PLUGINS);				
				//File dirplugins = new File(plugins);
				
//				ZipFileIO.extract(webfile, Env.getMachine().getWebFolder());
				//name += pluginDirectory.getName();
				//PluginMetadata pluginMetadata = parsePluginMetadata(pluginElement);
				//plugin.put("metadata", pluginMetadata);



				//				File outdatedpluginDirectory = new File(dirplugins, location);
				//				if (outdatedpluginDirectory.exists())
				//				{
				//					Date curDate = new Date();
				//					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
				//					String name = sdf.format(curDate);
				//					name += pluginDirectory.getName();
				//					File destfile = new File(dirtrash, name);
				//					if (outdatedpluginDirectory.renameTo(destfile))
				//					{
				//
				//					}									
				//				}				
			}
		}			
		return plugin;
	}
	private void parseServer(Element item) {
		try {
			Hashtable server = new Hashtable();
			if (plugin.containsKey("server")) {
				server = (Hashtable) plugin.get("server");					
			}			
			String servertype = item.getAttributeValue("type");
			if (servertype.equals("material")) {				
				HashMap pr = new HashMap();
				Element epolicy = item.getChild("policy");
				String xtables = epolicy.getChild("tables").getValue();
				String xdtonlyio = epolicy.getChild("dtonlyio").getValue();				
				String xseqno = epolicy.getChild("seqno").getValue();
				String dates = epolicy.getChild("dates").getValue();
				String xdtiocost = epolicy.getChild("dtiocost").getValue();
				String adjust = epolicy.getChild("adjust").getValue();
				pr.put("tables", xtables);
				pr.put("dtonlyio", xdtonlyio);
				pr.put("seqno", xseqno);
				pr.put("dates", dates);
				pr.put("dtiocost", xdtiocost);
				pr.put("adjust", adjust);
				pr.put("filename", this.filename);
				server.put("material", pr);
				plugin.put("server", server);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private ExtensionFormTrl parseFormTrl(Element ftrl) {
		ExtensionFormTrl f = new ExtensionFormTrl();
		f.setLang(ftrl.getAttributeValue(X_AD_Function.COLUMNNAME_Language));
		f.setName(ftrl.getAttributeValue(X_AD_Form.COLUMNNAME_Name));
		f.setDescription(ftrl.getAttributeValue(X_AD_Form.COLUMNNAME_Description));
		f.setHelp(ftrl.getAttributeValue(X_AD_Form.COLUMNNAME_Help));
		return f;
	}

	//	ExtensionMenuItemTrl emt = new ExtensionMenuItemTrl();
	//	emt.setLang(xitm.getAttributeValue(X_AD_Function.COLUMNNAME_Language));
	//	emt.setColumnName(xitm.getAttributeValue(X_AD_Column.COLUMNNAME_ColumnName));
	//	emt.setTranslate(xitm.getAttributeValue(X_AD_Column.COLUMNNAME_IsTranslated));
	//	return emt;

	private ExtensionForm parseForm(Element item) {
		ExtensionForm form = new ExtensionForm();
		try {
			form.setName(item.getAttributeValue(Constants.XML_ATTRIBUTE_NAME));
			form.setDescription(item.getAttributeValue(Constants.XML_ATTRIBUTE_DESCRIPTION));		
			String accesslevel = item.getAttributeValue(Constants.XML_ATTRIBUTE_ACCESSLEVEL);		
			form.setAccesslevel(accesslevel);
			form.setIdentifier(item.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER));
			if (form.getIdentifier() == null) {
				throw new Exception("Identifier is null");
			}
			form.setClassname(item.getAttributeValue(X_AD_Form.COLUMNNAME_Classname));
			form.setEntityType(item.getAttributeValue(X_AD_Form.COLUMNNAME_EntityType));
			String sync = item.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
			if (sync == null)
				sync = "";
			if (sync.length() > 0)		
			{
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					Date parsedDate = dateFormat.parse(sync);
					Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
					form.setSynchro(timestamp);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			form = null;
		}
		return form;
	}
	private ExtensionMenuItemTrl parseMenuItemTrl(Element xitm) {
		ExtensionMenuItemTrl emt = new ExtensionMenuItemTrl();
		emt.setLang(xitm.getAttributeValue(X_AD_Function.COLUMNNAME_Language));
		emt.setColumnName(xitm.getAttributeValue(X_AD_Column.COLUMNNAME_ColumnName));
		emt.setTranslate(xitm.getAttributeValue(X_AD_Column.COLUMNNAME_IsTranslated));
		return emt;
	}

	private ExtensionMenuItem parseMenuItem(Element xitm) {
		ExtensionMenuItem emi = new ExtensionMenuItem();
		String MenuID = xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_AD_Menu_ID);
		emi.setAD_Menu_ID(Integer.valueOf(MenuID));		
		emi.setName(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_Name));
		emi.setDescription(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_Description));
		emi.setIsSummary(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSummary).equals("true"));
		emi.setIsSOTrx(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSOTrx).equals("true"));
		emi.setIsReadOnly(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_IsReadOnly).equals("true"));
		emi.setParent_ID(xitm.getAttributeValue(X_AD_TreeNodeMM.COLUMNNAME_Parent_ID));
		emi.setIdentifier(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_Identifier));		
		emi.setAction(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_Action));
		String action = xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_Action);
		if (action.equals(REF_AD_MenuAction.Process))
		{
			emi.setAD_Process_ID(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_AD_Process_ID));
		}
		else if  (action.equals(REF_AD_MenuAction.Form))
		{			
			emi.setAD_Form_ID(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_AD_Form_ID));
		}
		//emi.setLevel(Integer.valueOf(xitm.getAttributeValue("level")));		
		emi.setEntityType(xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_EntityType));
		String tstamp = xitm.getAttributeValue(X_AD_Menu.COLUMNNAME_Synchronized);
		Timestamp sync = Timestamp.valueOf(tstamp);
		emi.setSynchronized(sync);
		return emi;		
	}

	public static void addservertype(String ServerType, HashMap defaultprops) {
		int A_Machine_ID = Env.getMachine().getA_Machine_ID();
		X_A_MachineServer machineserver = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ? AND properties->'A_Machine_ID'  = ?", null)
		.setParameters(ServerType, String.valueOf(A_Machine_ID)).first();
		if (machineserver == null)
		{
			machineserver = new X_A_MachineServer(Env.getCtx(), 0, null);
			machineserver.setServerType(ServerType);
		}			
		HashMap props = machineserver.getProperties();
		props.put(X_A_Machine.COLUMNNAME_A_Machine_ID, A_Machine_ID);
		if (defaultprops != null) {
			Iterator it = defaultprops.keySet().iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				if (!props.containsKey(key))
					props.put(key, defaultprops.get(key));
			}
		}
		machineserver.setProperties(props);
		machineserver.setIsActive(true);
		machineserver.save();										
	}

}
