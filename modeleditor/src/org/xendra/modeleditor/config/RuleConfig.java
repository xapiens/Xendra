package org.xendra.modeleditor.config;

import java.io.ByteArrayInputStream;
import java.util.Hashtable;
import java.util.Map;

import org.columba.core.config.DefaultXmlConfig;
import org.columba.core.xml.XmlElement;
import org.columba.core.xml.XmlIO;
import org.compiere.model.MConfig;
import org.xendra.modeleditor.config.RuleConfig;

public class RuleConfig {
	//public static final String MODULE_NAME = "modeleditor";
	public static final String PLUGIN_NAME = "org.xendra.modeleditor";
	private MConfig ruleeditOptions;
	private MConfig folder;
	private static RuleConfig instance = new RuleConfig();
	protected Map<String, MConfig> pluginList = new Hashtable<String, MConfig>();
	public RuleConfig() {
		//ruleeditOptions = MConfig.getbyIdentifier("xendra", MODULE_NAME, "options");
		ruleeditOptions = MConfig.getbyIdentifier(PLUGIN_NAME, "options");
		if (!pluginList.containsKey("options"))
			pluginList.put("options",ruleeditOptions);
        //folder = MConfig.getbyIdentifier("xendra", MODULE_NAME,"tree");
		folder = MConfig.getbyIdentifier(PLUGIN_NAME,"tree");
        if (!pluginList.containsKey("tree"))
        	pluginList.put("tree", folder);
	}
	
	public XmlElement get(String name) {
		XmlIO io = new XmlIO();
		if (pluginList.containsKey(name))
		{
			ByteArrayInputStream is = new ByteArrayInputStream(pluginList.get(name).getContent().getBytes());
			io.load(is);
			return io.getRoot();
		}
		return null;
	}
	public static RuleConfig getInstance() {
		return instance;
	}
}
