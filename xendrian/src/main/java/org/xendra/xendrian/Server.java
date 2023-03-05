package org.xendra.xendrian;

import java.io.File;
import java.security.KeyStore;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import static io.undertow.Handlers.resource;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Servlet;
import org.compiere.model.persistence.X_AD_ServletList;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.server.XendraServerMgr;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;
import org.xendra.material.MaterialServer;
import org.xendra.replication.ReplicationEngine;
import org.xendra.report.CreateReportsFromProcess;
import org.xendra.security.SSLContextFactory;
import org.xendra.utils.ToolDev;
import org.xnio.streams.ChannelInputStream;

import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.BlockingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.server.handlers.form.FormData;
import io.undertow.server.handlers.form.FormDataParser;
import io.undertow.server.handlers.form.FormParserFactory;
import io.undertow.server.handlers.resource.FileResourceManager;
import io.undertow.servlet.api.DeploymentInfo;
import io.undertow.servlet.api.DeploymentManager;
import static io.undertow.servlet.Servlets.defaultContainer;
import static io.undertow.servlet.Servlets.deployment;
import static io.undertow.servlet.Servlets.servlet;

public class Server extends Thread   {	
	private static CLogger 		log = CLogger.getCLogger(Server.class);
	public static final String 	monitor = "/monitor";
	private List<HashMap> servlets = new ArrayList<HashMap>();
	private PathHandler path;
	private File dirxendrian;
	/**	The Server			*/
	private XendraServerMgr	m_serverMgr = null;

	private static final char[] STORE_PASSWORD = "password".toCharArray();
	private static Server m_xendrian;

	public static void main(String args[]) {
		Thread wdThread = new Thread(Server.getInstance());
		wdThread.start();				
	}

	public static Server getInstance() {
		if (m_xendrian == null)
			m_xendrian = new Server();
		return m_xendrian;
	}

	public void run()
	{
		if (!org.compiere.Xendra.startup(false))
		{					
			log.log(Level.SEVERE, "can't connect to database");
			return;
		}
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		String langName = Ini.getProperty(Ini.P_LANGUAGE);
		Language language = Language.getLanguage(langName);
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());
		//
		try {
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id=?", null)
			.setParameters("org.columba.core").first();
			if (plugin == null)
			{
				File configuration = new File(Env.getResource("org.columba.core", "ad_plugin.xml", null));
				if (configuration.exists())
				{
					List<X_AD_Client> clients = new Query(Env.getCtx(), X_AD_Client.Table_Name, "IsActive='Y' AND AD_Client_ID > 0", null)
					.list();				
					for (X_AD_Client client:clients)
					{
						ReplicationEngine replication = new ReplicationEngine(client);
						String error = replication.encode(configuration);
						if (error.length() > 0)
						{

						}
					}
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
		X_A_Machine machine = null;
		try {
			machine = Env.getMachine();
			log.log(Level.WARNING, String.format("current Machine %s (%s)",machine.get_ID(), machine.getName()));			
			String machineid = String.valueOf(Env.getMachine().getA_Machine_ID());
			String where = "properties->'A_Machine_ID'  = ? AND servertype = ?";
			// Replication Server send the message to definitions in Queues
			X_A_MachineServer replicationserver = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
			.setParameters(machineid, REF_ServerType.ReplicationServer).first();
			if (replicationserver != null) {
				ReplicationServer r = new ReplicationServer();
				new Thread(r).start();
			}
			//
			X_A_Machine web = null;						
			X_A_MachineServer server = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
			.setParameters(machineid, REF_ServerType.WebServer).first();
			if (server != null) {
				web = Env.getMachine();									
			}			
			if (web != null && machine.get_ID() == web.get_ID())
			{
				//boolean updateserver = false;
				//X_A_Machine update = Env.getServerUpdate();
				//System.out.println(String.format("update=>%s machine=>%s", update, machine));
				//if (update != null && machine.get_ID() == update.get_ID()) {
				//	updateserver = true;
				//	System.out.println("updateserver=>true");
				//}										
				deploy();
				HashMap props = server.getProperties();
				String synchro = (String) props.get("Synchronized");
				if (synchro == null) {
					synchro = "false";
				}
				// suspended watchdir because is erratic
				// the process call be called for the installer
				//WatchDir wd = new WatchDir();
				//wd.setSyncronized(synchro.equals("true"));
				//Thread wdThread = new Thread(wd);
				//wdThread.start();
			} else if (web != null) {
				log.log(Level.WARNING, String.format("current web server %s (%s), current server %s (%s)", web.toString(), web.getName(), machine.toString(), machine.getName()));				
			}
			new XendrianServer().setServlet("store").newsession();
			ChatServer.getInstance();
			deployupdate();
			// Material Server instance
			X_A_Machine mm = Env.getServerMaterial();
			if (mm != null && machine.get_ID() == mm.get_ID())
			{
				log.log(Level.WARNING, String.format("start material server %s (%s)", mm.getName(), machine.get_ID()));
				MaterialServer.getInstance();
			}
			m_serverMgr = XendraServerMgr.get();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			UpdateXendra();			
		}
	}
	private void deployupdate() {
		try {
			try {
				Plugin.getInstance().deployplugins();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}						
		} catch (Exception e) {

		}
	}
	private void deploy() {
		try {			
			log.log(Level.WARNING, String.format("Starting Server Web Machine ID %d",Env.getMachine().get_ID()));
			HashMap msprops = Env.getServerProperties(Env.getMachine().getA_Machine_ID(), REF_ServerType.WebServer);
			Integer port = 0;
			Integer secureport = 0;
			if (msprops.size() > 0) {
				if (msprops.containsKey("port"))
					port = Integer.valueOf((String) msprops.get("port"));
				if (msprops.containsKey("secureport"))
					secureport = Integer.valueOf((String) msprops.get("secureport"));
			}
			log.log(Level.WARNING, String.format("http port : %s",port));
			log.log(Level.WARNING, String.format("https port : %s",secureport));
			File dirreports =  new CreateReportsFromProcess().getdir();
			if (dirreports == null || !dirreports.exists())
			{
				log.log(Level.WARNING, String.format("report dir => %s not exists", dirreports.getAbsolutePath()));
			}
			if (!dirreports.canWrite()) {
				log.log(Level.WARNING, String.format("report dir => %s can't write", dirreports.getAbsolutePath()));
			}			
			File webdir = Env.getMachine().getWebFolder();
			// 			
			//DeploymentInfo servletBuilder = deployment()
			DeploymentInfo servletBuilder = new DeploymentInfo()
			.setClassLoader(Server.class.getClassLoader())
			.setContextPath("/")					
			//.resource(new FileResourceManager(webdir, 1024)).setDirectoryListingEnabled(false).addWelcomeFiles("index.html")
			.setResourceManager(new FileResourceManager(webdir, 1024))
			.addWelcomePage("index.html")
			.setDeploymentName("root.war")										
			//.addWelcomePage("index.html")
			.addServlet(servlet("monitor", org.compiere.web.XendraMonitor.class).addMapping("/monitor"))
			.addServlet(servlet("query", org.xendra.xendrian.QueryServlet.class).addMapping("/query"))
			.addServlet(servlet("backup", org.xendra.xendrian.BackupServlet.class).addMapping("/backup"))
			.addServlet(servlet("replication", org.compiere.web.ReplicationManager.class).addMapping("/replication"))										
			.addServlet(servlet("login", org.xendra.xendrian.LoginServlet.class).addMapping("/login"));

			servletBuilder.addServlet(servlet("plugin", org.xendra.xendrian.PluginServlet.class).addMapping("/plugin"));				
			//HashMap props = Env.getMachine().getProperties();
			//File dirplugins = new File((String) props.get(Constants.PLUGINS));
			//log.log(Level.WARNING, String.format("%s=>%s",Constants.PLUGINS, dirplugins));
			log.log(Level.WARNING, String.format("%s=>%s",Constants.PLUGINS, Env.getMachine().getPluginsFolder()));
			servletBuilder.addServlet(servlet("store", org.xendra.xendrian.StoreServlet.class).addMapping("/store"));
			servletBuilder.addServlet(servlet("r", org.xendra.xendrian.Csvservlet.class).addMapping("/r"));
			DeploymentManager manager = defaultContainer().addDeployment(servletBuilder);			
			manager.deploy();		
			path = new PathHandler();
			path.addPrefixPath(servletBuilder.getContextPath(), manager.start());
			//path.addPath("/webhook", new BlockingHandler(new MyHandler()));
			path.addPrefixPath("/webhook", new BlockingHandler(new MyHandler()));
			if (dirreports.exists())
				path.addPrefixPath("/reports", resource(new FileResourceManager(dirreports, 1024)).setDirectoryListingEnabled(true).addWelcomeFiles("index.html"));

			//File rootdir = new File("/home/americas/workspace/Xendra/xendrian");
			//File rootdir = new File("/home/americas/workspace/Xendra/xendrian/web");
			//File rootdir = new File("/home/americas/projects/solid");
			//path.addPrefixPath("/", resource(new FileResourceManager(webdir, 1024)).setDirectoryListingEnabled(false).addWelcomeFiles("index.html"));

			Undertow2 server = null;			

			SSLContext sslContext = null;
			if (ToolDev.isvalidpassword() && ToolDev.isvalidkeystore()) {
				sslContext = SSLContextFactory.getInstance().makeContext(ToolDev.getkeystorefile(), ToolDev.getkeystorepassword());
				if (sslContext != null) {
					server = Undertow2.builder()							
							.addHttpListener(port, "0.0.0.0")							
							.addHttpsListener(secureport, Util.getLocalHostName(), sslContext)							
							.setHandler(path)		
							//.setHandler(Handlers.pathTemplate().add("/webhook",  new BlockingHandler(new MyHandler())))
							//.setHandler(new HttpHandler() {
							//	@Override
							//	public void handleRequest(HttpServerExchange exchange) throws Exception {
							//		FormDataParser parser = FormParserFactory.builder().build().createParser(exchange);
							//		MyHandler handler = new MyHandler();
							//		parser.parse(handler);
							//	}
							//})							
							.build();
				}				
			}			
			if (sslContext == null) 	{
				server = Undertow2.builder()
						.addHttpListener(port, "0.0.0.0")						
						.setHandler(path)
						//.setHandler(Handlers.pathTemplate().add("/webhook",  new BlockingHandler(new MyHandler())))
						.build();		
			}							
			server.start();			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private class MyHandler implements HttpHandler {
		@Override
		public void handleRequest(HttpServerExchange exchange) throws Exception {			
			final ChannelInputStream cis = new ChannelInputStream(exchange.getRequestChannel());
			FormData formData = exchange.getAttachment(FormDataParser.FORM_DATA);
			for (String data:formData) {
				for (FormData.FormValue formValue : formData.get(data)) {
					if (formValue.isFile()) {
						System.out.println("X");
						File uploadedFile = formValue.getFile();
					}
				}
			}
		}
	}

	public void UpdateXendra() {
		try {
			SyncModel.getInstance().SyncronizeFull("");			
			SyncModel.getInstance().Replication();
		}
		catch (Exception e)
		{			
			e.printStackTrace();
		}		
	}

	private void deployservlets() {
		try {
			List<X_AD_ServletList> dbservletlist = new Query(Env.getCtx(), X_AD_ServletList.Table_Name, "IsActive = 'Y'", null).list();
			for (X_AD_ServletList servletcontainer:dbservletlist)
			{
				DeploymentInfo servletlogin = deployment()
						.setClassLoader(Server.class.getClassLoader())
						.setContextPath(servletcontainer.getcontext())					
						.setDeploymentName(servletcontainer.getName());
				List<X_AD_Servlet> servletlist = new Query(Env.getCtx(), X_AD_Servlet.Table_Name, "AD_ServletList_ID = ?", null)
				.setParameters(servletcontainer.getAD_ServletList_ID()).list();
				for (X_AD_Servlet servlet:servletlist)
				{
					try {
						Class<? extends Servlet> servletClass = (Class<? extends Servlet>) Class.forName(servlet.getClassname());
						servletlogin.addServlet(servlet(servlet.getName(), servletClass).addMapping(servlet.getMapping()));						
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}				
				}
				DeploymentManager man2 = defaultContainer().addDeployment(servletlogin);
				man2.deploy();
				path.addPrefixPath(servletlogin.getContextPath(), man2.start());
			}
		} catch (ServletException e) {
			e.printStackTrace();
		}			
	}
	private static SSLContext createSSLContext(final KeyStore keyStore, final KeyStore trustStore) throws Exception {
		KeyManager[] keyManagers;
		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		keyManagerFactory.init(keyStore, password("key"));
		keyManagers = keyManagerFactory.getKeyManagers();

		TrustManager[] trustManagers;
		TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		trustManagerFactory.init(trustStore);
		trustManagers = trustManagerFactory.getTrustManagers();

		SSLContext sslContext;
		sslContext = SSLContext.getInstance("TLS");
		sslContext.init(keyManagers, trustManagers, null);

		return sslContext;
	}
	static char[] password(String name) {
		String pw = System.getProperty(name + ".password");
		return pw != null ? pw.toCharArray() : STORE_PASSWORD;
	}
}
