package org.columba.core.config;

import org.compiere.model.MConfig;
import org.xendra.Constants;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
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
		//options = ;
		//tools 	= new DefaultXmlConfig(ctools);
		//views 	= new viewsXmlConfig(cviews);
		//registerPlugin(Constants.CORE, options, new OptionsXmlConfig(options));
		//registerPlugin(Constants.CORE, tools, new DefaultXmlConfig(tools));
		//registerPlugin(Constants.CORE, views, new viewsXmlConfig(views));
		options = new Options(coptions);
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(Options.class);
			Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
			options = (Options) jaxUnmarshaller.unmarshal(new StringReader((options.getConfig().getContent())));			
//			OptionsXmlConfig xx = new OptionsXmlConfig();
//			xx.setVersion("1.0");
//			Gui gui = new Gui();
//			xx.setGui(gui);			
//			Font fonts = new Font();
//			fonts.setOverwrite(true);
//			Text text = new Text();
//			text.setName("Default");
//			text.setSize(12);
//			fonts.setText(text);
//			Main main = new Main();
//			main.setName("Default");
//			main.setSize(12);
//			fonts.setMain(main);
//			gui.setFonts(fonts);
//			Toolbar toolbar = new Toolbar();
//			toolbar.setText_position(false);
//			toolbar.setEnable_icon(true);
//			toolbar.setEnable_text(true);
//			gui.setToolbar(toolbar);
//			Theme theme = new Theme();
//			theme.setName("Xendra");
//			theme.setTheme("Xendra Theme Green");
//			gui.setTheme(theme);
//			Locale locale = new Locale();
//			locale.setLanguage("en");
//			xx.setLocale(locale);
//			Marshaller dfdf = jaxbcontext.createMarshaller();
//			dfdf.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//			dfdf.marshal(xx, System.out);			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		registerPlugin(Constants.CORE, coptions, options);
		//tools = (DefaultXmlConfig) 
		tools = new DefaultXmlConfig(ctools);
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(DefaultXmlConfig.class);
			Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
			tools = (DefaultXmlConfig) jaxUnmarshaller.unmarshal(new StringReader((tools.getConfig().getContent())));
//			DefaultXmlConfig xx = new DefaultXmlConfig();
//			List<Tool> tools = new ArrayList<Tool>();
//			Tool tool = new Tool();
//			tool.setFirst_time(true);
//			tool.setName("aspell");
//			tools.add(tool);
//			Tool tool2 = new Tool();
//			tool2.setFirst_time(true);
//			tool2.setName("gpg");
//			tools.add(tool2);
//			xx.setTool(tools);
//			Marshaller dfdf = jaxbcontext.createMarshaller();
//			dfdf.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//			dfdf.marshal(xx, System.out);						
		} catch (Exception e) {
			e.printStackTrace();
		}				
		registerPlugin(Constants.CORE, ctools, tools);		
		views = new viewsXmlConfig(cviews);		
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(viewsXmlConfig.class);
			Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
			views = (viewsXmlConfig) jaxUnmarshaller.unmarshal(new StringReader((views.getConfig().getContent())));
//			viewsXmlConfig xx = new viewsXmlConfig();
//			View view = new View();
//			view.setId("XendraFrame");
//			Window window = new Window();
//			window.setMaximized(true);
//			window.setHeight(507);
//			window.setWidth(902);
//			window.setY(123);
//			window.setX(219);
//			view.setWindow(window);
//			Toolbars tb = new Toolbars();
//			tb.setMain(true);
//			view.setToolbars(tb);
//			ViewList viewlist = new ViewList();
//			viewlist.addView(view);
//			xx.setViewlist(viewlist);
//			DefaultViews dv = new DefaultViews();
//			dv.addView(view);
//			xx.setDefaultviewlist(dv);
//			Marshaller dfdf = jaxbcontext.createMarshaller();
//			dfdf.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//			dfdf.marshal(xx, System.out);
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

	//public void registerPlugin(final String moduleName, final MConfig id, final DefaultXmlConfig configPlugin) {
	public void registerPlugin(final String moduleName, final MConfig id, jaxbobject configPlugin) {
		//		if (id.getContent().length() == 0)
		//		{
		//			final String hstr = "org/columba/" + moduleName + "/config/" + id.getIdentifier() + ".xml"; //$NON-NLS-1$
		//			try {
		//				DiskIO.copyResource(hstr, id);
		//			} catch (final IOException e) {
		//			}
		//		}		
		if (!pluginList.containsKey(moduleName)) {
			final Map<String, jaxbobject> map = new Hashtable<String, jaxbobject>();
			pluginList.put(moduleName, map);
		}
		addPlugin(moduleName, id, configPlugin);
		//return configPlugin;
		//configPlugin.load();
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
	//public void addPlugin(final String moduleName, final MConfig id, final DefaultXmlConfig configPlugin) {
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
