package org.columba.core.config;

import org.compiere.model.MConfig;
import org.xendra.Constants;

import java.io.StringReader;
import java.util.Hashtable;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Config {
	protected Map<String, Map<String, jaxbobject>> pluginList = new Hashtable<String, Map<String, jaxbobject>>();
	private static Config instance;
	protected Options options = null;
	protected DefaultXmlConfig tools = null;
	protected viewsXmlConfig views = null;
	public Config() {
		MConfig coptions = MConfig.getbyIdentifier(Constants.CORE, "options");
		MConfig ctools = MConfig.getbyIdentifier(Constants.CORE,"external_tools");
		MConfig cviews = MConfig.getbyIdentifier(Constants.CORE, "views");
		options = new Options(coptions);
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(Options.class);
			Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
			options = (Options) jaxUnmarshaller.unmarshal(new StringReader((options.getConfig().getContent())));			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		registerPlugin(Constants.CORE, coptions, options);
		tools = new DefaultXmlConfig(ctools);
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(DefaultXmlConfig.class);
			Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
			tools = (DefaultXmlConfig) jaxUnmarshaller.unmarshal(new StringReader((tools.getConfig().getContent())));
		} catch (Exception e) {
			e.printStackTrace();
		}				
		registerPlugin(Constants.CORE, ctools, tools);		
		views = new viewsXmlConfig(cviews);		
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(viewsXmlConfig.class);
			Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
			views = (viewsXmlConfig) jaxUnmarshaller.unmarshal(new StringReader((views.getConfig().getContent())));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		registerPlugin(Constants.CORE, cviews, views);
		instance = this;
	}

	public Options getOptions() {
		return options;
	}
	public DefaultXmlConfig getTools() {
		return tools;
	}
	public viewsXmlConfig getViews() {
		return views;
	}

	public static Config getInstance()
	{
		if (instance == null)
			new Config();
		return instance;
	}

	public void registerPlugin(final String moduleName, final MConfig id, jaxbobject configPlugin) {
		if (!pluginList.containsKey(moduleName)) {
			final Map<String, jaxbobject> map = new Hashtable<String, jaxbobject>();
			pluginList.put(moduleName, map);
		}
		addPlugin(moduleName, id, configPlugin);
	}
	
	/**
	 * Method getPlugin.
	 *
	 * @param moduleName
	 * @param id
	 * @return DefaultXmlConfig
	 */
	public jaxbobject getPlugin(final String moduleName, final String id) {
		if (pluginList.containsKey(moduleName)) {
			final Map<String, jaxbobject> map = pluginList.get(moduleName);
			if (map.containsKey(id)) {
				final jaxbobject plugin = map.get(id);
				return plugin;
			}
		}
		return null;
	}	

	/**
	 * Method addPlugin.
	 *
	 * @param moduleName
	 * @param id
	 * @param configPlugin
	 */
	public void addPlugin(final String moduleName, final MConfig id, final jaxbobject configPlugin) {
		final Map<String, jaxbobject> map = pluginList.get(moduleName);
		if (map != null) {
			map.put(id.getIdentifier(), configPlugin);
		}
	}

	public void save() {
		// TODO Auto-generated method stub
	}
}
