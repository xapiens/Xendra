package org.xendra.xendrian;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.columba.api.plugin.PluginMetadata;
import org.columba.core.io.DiskIO;
import org.columba.core.plugin.ExtensionXMLParser;
import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.compiere.model.MClient;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Plugin_Access;
import org.compiere.model.persistence.X_AD_Resource;
import org.compiere.model.persistence.X_AD_Role;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.compiere.util.WebEnv;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;

public class PluginServlet extends HttpServlet {

	public PluginServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		if (!WebEnv.initWeb(config))
			throw new ServletException("plugin.init");
		System.out.println("plugin.init");
	}   //  init

	//private void updateplugin() {
	private PluginMetadata getmetadata(int AD_Plugin_ID)
	{		
		PluginMetadata pluginMetadata = null; 
		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
		.setParameters(AD_Plugin_ID).first();
		if (plugin != null)
		{
			try {
				InputStream is = new ByteArrayInputStream(plugin.getplugin().getBytes());
				Document doc = ExtensionXMLParser.retrieveDocument(is);
				Element pluginElement = doc.getRootElement();
				pluginMetadata = new ExtensionXMLParser().parsePluginMetadata(pluginElement);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return pluginMetadata;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roleid = request.getParameter("ad_role_id");
		String type = request.getParameter("type");
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";		
		if (type == null)
		{
			result += "<error>404</error>";
		}
		else if (type.equals("core"))
		{
			result += "<plugins>";
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id=?", null).setParameters("org.columba.core").first();
			result += String.format("<plugin id='%s' name='%s' version='%s' filename='%s' filesize='%s' enabled='%s' installed='%s' synchronized='%s'/>", 
					plugin.getID(), plugin.getName(), plugin.getVersion(), plugin.getFileName(), plugin.getFileSize(), plugin.isActive(), plugin.isInstalled(),plugin.getSynchronized());
			result += "</plugins>";

		}
		else if (type.equals("hash"))
		{
			MClient client = MClient.get(Env.getCtx());
			result += String.format("<hash>%s<hash>", client.getIdentifier());
		}
		else if (type.equals("alive"))
		{
			CConnection m_cc = CConnection.get();			
			Boolean update = false;
			X_A_Machine machineupdate = XendrianServer.getWebServer();;
			if (machineupdate != null && Env.getMachine().get_ID() == machineupdate.get_ID()) {
				update = true;
			}
			result += String.format("<info><databasename>%s</databasename><databasehost>%s</databasehost><version>%s</version><update>%s</update></info>",m_cc.getDbName(),m_cc.getDbHost(), Xendra.DATE_VERSION, update ? "Y":"N");
		}
		else if (type.equals("metadata"))
		{
			X_AD_Plugin_Access access = null;
			String id = request.getParameter("id");
			X_AD_Plugin plug = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ?", null)
			.setParameters(id).first();
			if (plug != null)
			{
				X_AD_Role role = new Query(Env.getCtx(), X_AD_Role.Table_Name, "identifier = ?", null)
				.setParameters(roleid).first();
				access = new Query(Env.getCtx(), X_AD_Plugin_Access.Table_Name, "AD_Role_ID = ? AND AD_Plugin_ID = ?", null)
				.setParameters(Integer.valueOf(role.getAD_Role_ID()), plug.getAD_Plugin_ID()).first();
				if (access != null)
				{
					PluginMetadata plugin = getmetadata(access.getAD_Plugin_ID());
					X_AD_Plugin dbplugin = new X_AD_Plugin(Env.getCtx(), access.getAD_Plugin_ID(), null);
					if (dbplugin != null)
						result += String.format("<plugin id='%s' version='%s' synchronized='%s'/>", plugin.getId(), plugin.getVersion(), dbplugin.getSynchronized());
				}
			}
			if (plug == null || access == null)
			{
				result += "<error>404</error>";
			}
		}
		else if (type.equals("list"))
		{
			Boolean includedcore = false;
			String coreid = "67dff047-7c04-1001-e4d1-ad0b0ce9a44a";
			result += "<plugins>";
			X_AD_Role role = new Query(Env.getCtx(), X_AD_Role.Table_Name, "identifier = ?", null)
			.setParameters(roleid).first();
			if (role != null) {								
				List<X_AD_Plugin_Access> pluginaccess = new Query(Env.getCtx(), X_AD_Plugin_Access.Table_Name, "AD_Role_ID = ?", null)
				.setParameters(Integer.valueOf(role.getAD_Role_ID())).list();
				for (X_AD_Plugin_Access access:pluginaccess)
				{
					PluginMetadata plugin = getmetadata(access.getAD_Plugin_ID());
					X_AD_Plugin dbplugin = new X_AD_Plugin(Env.getCtx(), access.getAD_Plugin_ID(), null);
					if (dbplugin != null) {
						if (dbplugin.getIdentifier().equals(coreid)) {
							includedcore = true;
						}
						String space = "' ";
						StringBuilder sb = new StringBuilder();
						sb.append(Constants.XML_ATTRIBUTE_ID).append("='").append(plugin.getId()).append(space)
						.append(Constants.XML_ATTRIBUTE_NAME).append("='").append(plugin.getName()).append(space)
						.append(Constants.XML_ATTRIBUTE_DESCRIPTION).append("='").append(plugin.getDescription()).append(space)
						.append(Constants.XML_ATTRIBUTE_CATEGORY).append("='").append(plugin.getCategory()).append(space)
						.append(Constants.XML_ATTRIBUTE_ENABLED).append("='").append(plugin.isEnabled()).append(space)
						.append(Constants.XML_ATTRIBUTE_INSTALLED).append("='").append(plugin.isInstalled()).append(space)
						.append(Constants.XML_ATTRIBUTE_VERSION).append("='").append(plugin.getVersion()).append(space)
						.append(Constants.XML_ATTRIBUTE_FILENAME).append("='").append(dbplugin.getFileName()).append(space)
						.append(Constants.XML_ATTRIBUTE_SYNCHRONIZED).append("='").append(dbplugin.getSynchronized()).append(space);
						result += String.format("<plugin %s />", sb.toString()); 
					}
				}			
				if (!includedcore) {
					String space = "' ";
					X_AD_Plugin dbplugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "identifier = ?" , null)
					.setParameters(coreid).first();
					if (dbplugin != null) {								
						PluginMetadata plugin = getmetadata(dbplugin.getAD_Plugin_ID());
						StringBuilder sb = new StringBuilder();
						sb.append(Constants.XML_ATTRIBUTE_ID).append("='").append(plugin.getId()).append(space)
						.append(Constants.XML_ATTRIBUTE_NAME).append("='").append(plugin.getName()).append(space)
						.append(Constants.XML_ATTRIBUTE_DESCRIPTION).append("='").append(plugin.getDescription()).append(space)
						.append(Constants.XML_ATTRIBUTE_CATEGORY).append("='").append(plugin.getCategory()).append(space)
						.append(Constants.XML_ATTRIBUTE_ENABLED).append("='").append(plugin.isEnabled()).append(space)
						.append(Constants.XML_ATTRIBUTE_INSTALLED).append("='").append(plugin.isInstalled()).append(space)
						.append(Constants.XML_ATTRIBUTE_VERSION).append("='").append(plugin.getVersion()).append(space)
						.append(Constants.XML_ATTRIBUTE_FILENAME).append("='").append(dbplugin.getFileName()).append(space)
						.append(Constants.XML_ATTRIBUTE_SYNCHRONIZED).append("='").append(dbplugin.getSynchronized()).append(space);
						result += String.format("<plugin %s />", sb.toString());
					}
				}
			}
			result += "</plugins>";
		}
		else if (type.equals("pluginsize")) {
			String id = request.getParameter("id");
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ? ", null).setParameters(id).first();
			if (plugin != null)
			{
				File pluginfile = new File(Env.getMachine().getInstalledFolder(),plugin.getFileName());
				if (pluginfile.exists()) {
					result += "<size>";
					result += String.valueOf(pluginfile.length());
					result += "</size>";
				}				
			}		
		}
		else if (type.equals("plugin"))
		{
			String id = request.getParameter("id");
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ? ", null).setParameters(id).first();
			if (plugin != null)
			{
				System.out.println("searching plugin : "+ Env.getMachine().getInstalledFolder().getAbsolutePath() +  File.separator +plugin.getFileName());
				File pluginfile = new File(Env.getMachine().getInstalledFolder(),plugin.getFileName());
				if (pluginfile.exists())
				{
					OutputStream out = response.getOutputStream();
					FileInputStream in = new FileInputStream(pluginfile);
					byte[] buffer = new byte[4096];
					int length;
					while ((length = in.read(buffer)) > 0) {
						out.write(buffer, 0, length);
					}
					in.close();
					out.flush();	
					out.close();
					response.setHeader("Content-Type", "application/octet-stream");
					return;
				}
				else
				{
					result += String.format("<error>%s</error>",plugin.getFileName());
				}
			}
		}
		else if (type.equals("resource"))
		{
			String container = request.getParameter("container");
			String modulename = request.getParameter("modulename");
			String identifier = request.getParameter("identifier");
			String query = "container = ? AND modulename = ? AND name = ?";
			X_AD_Resource resource = new Query(Env.getCtx(), X_AD_Resource.Table_Name, query, null)
			.setParameters(container, modulename, identifier).first();			
			result  = resource.getContent();			
		}
		PrintWriter out = response.getWriter();
		response.setHeader("Content-Type", "text/xml");
		out.write(result);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String process_id = request.getParameter("process_id");
		String parameters = request.getParameter("parameters");
		PrintWriter out = response.getWriter();
		System.out.println("plugin.doPost");
	}

	protected void registerresource(String resource)
	{
		try {
			InputStream resourcestream = DiskIO.getResourceStream(resource);
			if (resourcestream != null)
			{
				String line;
				StringBuffer sb = new StringBuffer();					
				BufferedReader br = new BufferedReader(new InputStreamReader(resourcestream));
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
				//result = sb.toString();			
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}						
	}
}
