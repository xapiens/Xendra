package org.columba.core.plugin;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.columba.api.plugin.PluginMetadata;
import org.columba.core.io.ZipFileIO;
import org.columba.core.xml.XmlIO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.rules.RuleXMLParser;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class XendrianPlugin {
	private static XendrianPlugin instance = new XendrianPlugin();
	int AD_Role_ID = Env.getAD_Role_ID(Env.getCtx());
	X_A_Machine webmachine = Env.getServerWeb();	
	int port = 0;
	private List<PluginMetadata> pluginmetadata;
	private List childs;
	public XendrianPlugin()
	{
		if (webmachine != null)
			port = Env.getServerWebPort();
	}

	/**
	 * @return instance
	 */
	public static XendrianPlugin getInstance() {
		return instance;
	}

	public List<PluginMetadata> getListPluginMetadata() {
		return pluginmetadata;
	}
	public List getChilds() {
		return childs;
	} 
	public int getWebServerPort() {
		return port;
	}

}
