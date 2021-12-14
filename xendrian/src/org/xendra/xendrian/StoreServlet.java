package org.xendra.xendrian;

import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.form.FormData;
import io.undertow.server.handlers.form.FormDataParser;
import io.undertow.server.handlers.form.FormParserFactory;
import io.undertow.servlet.spec.HttpServletRequestImpl;
import io.undertow.util.MultipartParser;
import io.undertow.util.StatusCodes;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;

import org.columba.core.gui.plugin.wizard.SavingTrustManager;
import org.compiere.model.MRole;
import org.compiere.model.MStore;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.SecureEngine;
import org.compiere.util.Util;
import org.compiere.util.WebEnv;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.api.XendrianConstants;
import org.xendra.security.SSLContextFactory;
import org.xendra.utils.Cert;
import org.xendra.utils.ToolDev;
import org.xnio.IoUtils;

import com.google.common.io.Files;


public class StoreServlet extends HttpServlet {
	static String VERSION = "1.0";
	List<String> urls = new ArrayList<String>();
	List<String> messages = new ArrayList<String>();
	private SSLSocketFactory sslSocketFactory;
	private HashMap<String, String> ncerts = new HashMap<String, String>();
	private HashMap<String, X509Certificate> hcerts = new HashMap<String, X509Certificate>();
	public StoreServlet() {
		super();
	}
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		if (!WebEnv.initWeb(config))
			throw new ServletException("Store.init");
		System.out.println("store.init");		
	}
	protected String validate(String url) {
		String result = "";
		try {
			if (!ToolDev.isvalidpassword()) {				
				result = "nopassword";
				throw new Exception(result);
			} 
			if (!ToolDev.isvalidkeystore()) {
				result = "nokeystore";
				throw new Exception(result);				
			}
			SSLContext sslContext = SSLContextFactory.getInstance().makeContext(ToolDev.getkeystorefile(), ToolDev.getkeystorepassword());
			if (sslContext == null) {
				throw new Exception(SSLContextFactory.getInstance().getError());
			}
			SSLSocketFactory sslSocketFactory;				
			sslSocketFactory = sslContext.getSocketFactory();								
			OkHttpClient client = new OkHttpClient.Builder()						
			.sslSocketFactory(sslSocketFactory)
			.build();
			Request request = new Request.Builder()
			.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
			.url(url).build();    			
			Response response = client.newCall(request).execute();			
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			result = errors.toString();
		}
		return result;				
	}
	protected String navigate(String url) {
		String result = "";
		try {
			if (!ToolDev.isvalidpassword()) {				
				result = wraperror("nopassword");
				throw new Exception(result);
			} 
			if (!ToolDev.isvalidkeystore()) {
				result = wraperror("nokeystore");
				throw new Exception(result);				
			}		
			SSLContext sslContext = SSLContextFactory.getInstance().makeContext(ToolDev.getkeystorefile(), ToolDev.getkeystorepassword());
			if (sslContext == null) {
				result = SSLContextFactory.getInstance().getError();
				result = wraperror(result);
				throw new Exception(result);
			}
			SSLSocketFactory sslSocketFactory;				
			sslSocketFactory = sslContext.getSocketFactory();								
			OkHttpClient client = new OkHttpClient.Builder()						
			.sslSocketFactory(sslSocketFactory)
			.cache(null)
			.build();
			Request request = new Request.Builder()
			.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
			.cacheControl(new CacheControl.Builder().noCache().build())
			.url(url).build();    			
			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
			result = response.body().string();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		if (type == null)
		{
			result += "<error>404</error>";
		}
		else if (type.equals("download")) {
			System.out.println("X");
		}
		else if (type.equals("status")) {
			result  = checkstatus();
		}
		else if (type.equals("search")) {
			deployplugin();
			result += "<status>ack</status>";
		}
		else if (type.equals("install")) {
			ThreadInstallPlugin r = new ThreadInstallPlugin();
			new Thread(r).start();
			result += "<status>ack</status>";
		}
		else if (type.equals("addcerts")) {
			String id = request.getParameter("id");
			String roleid = request.getParameter("roleid");
			if (hcerts.containsKey(id)) {
				try {
					X509Certificate cert = hcerts.get(id);				
					File keystore = ToolDev.getkeystorefile();
					char[] passw = ToolDev.getkeystorepassword();
					System.out.println("Loading KeyStore " + keystore + "...");
					InputStream in = new FileInputStream(keystore);
					KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());        
					ks.load(in, passw);
					in.close();								
					String alias = ncerts.get(id);
					ks.setCertificateEntry(alias, cert);
					OutputStream out = new FileOutputStream(keystore);
					//ks.store(out, passphrase);
					ks.store(out, passw);
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			result += "<status>ack</status>";
		}
		else if (type.equals("refreshstore")) {
			MStore.getInstance().reload();
			result += "<status>ack</status>";
		}
		else if (type.equals("validate")) {
			String url = request.getParameter("url");
			validate(url);
		}
		else if (type.equals("createstore")) {
			try {
				String roleid = request.getParameter("role");
				String pwdsecure = request.getParameter("password");
				String pwd = SecureEngine.decrypt(pwdsecure);
				HashMap properties = MStore.getInstance().getProperties();
				String filename = SecureEngine.decrypt((String) properties.get(Constants.KEYSTORE));
				if (filename == null) {
					File keystoredir  = Env.getMachine().getKeyStoreFolder();
					filename = String.format("%s%s%s", keystoredir.getAbsolutePath(), File.separator, Constants.KEYSTORE_NAME);
					File fileToStore = new File(filename);
					if (!fileToStore.exists()) {
						KeyStore ks = KeyStore.getInstance("JKS");
						ks.load(null, pwd.toCharArray());
						FileOutputStream fos = new FileOutputStream(fileToStore.getAbsolutePath());
						ks.store(fos, pwd.toCharArray());
						fos.close();
					}
				} else {
					File fileToStore = new File(filename);
					if (!fileToStore.exists()) {
						System.out.println(String.format("don't exists and create ->%s<-", fileToStore.getAbsoluteFile()));
						String keystore = Env.getMachine().getKeyStoreFolder().getAbsolutePath();
						filename = String.format("%s%s%s", keystore, File.separator, Constants.KEYSTORE_NAME);
						fileToStore = new File(filename);
						if (!fileToStore.exists()) {
							System.out.println(String.format("creating KeyStore %s", fileToStore.getAbsoluteFile()));
							KeyStore ks = KeyStore.getInstance("JKS");
							ks.load(null, pwd.toCharArray());
							FileOutputStream fos = new FileOutputStream(fileToStore.getAbsolutePath());
							ks.store(fos, pwd.toCharArray());
							fos.close();
						}						
					}
				}
				File fileToStore = new File(filename);
				System.out.println(String.format("load %s", fileToStore.getAbsoluteFile()));
				long size = fileToStore.length();

				KeyStore ks = KeyStore.getInstance("JKS");
				if (size == 0) {
					ks.load(null, pwd.toCharArray());
					FileOutputStream fos = new FileOutputStream(fileToStore.getAbsolutePath());
					ks.store(fos, pwd.toCharArray());
					fos.close();
				}			
				InputStream readStream = new FileInputStream(fileToStore);			
				ks.load(readStream, pwd.toCharArray());
				KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
				kmf.init(ks, pwd.toCharArray());
				result += String.format("<keystore><error></error></keystore>");
				properties.put(Constants.KEYSTORE, SecureEngine.encrypt(filename));
				properties.put("ServerPassword", pwdsecure);
				MStore.getInstance().setProperties(properties);
				MStore.getInstance().save();
				MStore.getInstance().reload();
			} catch (Exception e) {
				e.printStackTrace();
				result += String.format("<keystore><error>%s</error></keystore>", e.getMessage());
			}
		}
		else if (type.equals("listcerts")) {
			result = listcerts();
		}
		else if (type.equals("list"))
		{
			try {
				// firstable check the keystore, because in case is empty conf, repository is empty too
				if (!ToolDev.isvalidkeystore()) {
					result = wraperror("nokeystore");
					throw new Exception(result);				
				}															
				if (!isvalidrepositories()) {
					result = wraperror("norepository");
					throw new Exception(result);						
				}
				String repository = MStore.getInstance().getRepository();
				StringTokenizer stringTokenizer = new StringTokenizer(repository, "\n");				
				while (stringTokenizer.hasMoreTokens()) {
					String token = stringTokenizer.nextToken().trim();
					if (!urls.contains(token))
						urls.add(token);					
				}	
				for (String url:urls) {
					result = validate(url);
					if (result.length() > 0) {
						result = wraperror(result);
						throw new Exception(result);
					}
				}
				for (String url:urls) {
					String x = navigate(url);
					SAXBuilder builder = new SAXBuilder();
					InputStream stream = new ByteArrayInputStream(x.getBytes("UTF-8"));				
					Document doc = builder.build(stream);
					result += "<plugins><error></error>";
					List childs = doc.getRootElement().getChildren();

					for (Iterator it = childs.iterator(); it.hasNext();) {
						Element child = (Element) it.next();
						String id = child.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
						String name = child.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
						String description = child.getAttributeValue(Constants.XML_ATTRIBUTE_DESCRIPTION);				
						String categoryname = child.getAttributeValue(Constants.XML_ATTRIBUTE_CATEGORY);
						String synchro = child.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
						StringBuilder pluginproperties = new StringBuilder("<Properties>");
						pluginproperties.append("<hashmap>");
						List properties = child.getChildren();
						for (Iterator itprop = properties.iterator(); itprop.hasNext();) {
							Element Property = (Element) itprop.next();
							if (Property.getName().equals("Properties")) {

								List hashmaplist = Property.getChildren();
								for (Iterator ithashmaplist = hashmaplist.iterator(); ithashmaplist.hasNext();) {
									Element hashmap = (Element) ithashmaplist.next();
									List maplist = hashmap.getChildren();
									for (Iterator itmaplist = maplist.iterator(); itmaplist.hasNext();) {
										Element mapitem = (Element) itmaplist.next();
										String key = mapitem.getAttribute("key").getValue();
										String value = mapitem.getAttributeValue("value");
										if (key.equals("downloadurl")) {
											value = String.format("%s%s",url, value);
										}										
										pluginproperties.append(String.format("<map key=\"%s\" value=\"%s\"/>", key, value));
									}
								}
							}
						}
						pluginproperties.append("</hashmap>");
						pluginproperties.append("</Properties>");
						String space = "' ";
						StringBuilder sb = new StringBuilder();
						sb.append(Constants.XML_ATTRIBUTE_ID).append("='").append(id).append(space)
						.append(Constants.XML_ATTRIBUTE_NAME).append("='").append(name).append(space)
						.append(Constants.XML_ATTRIBUTE_DESCRIPTION).append("='").append(description).append(space)
						.append(Constants.XML_ATTRIBUTE_CATEGORY).append("='").append(categoryname).append(space)
						.append(Constants.XML_ATTRIBUTE_SYNCHRONIZED).append("='").append(synchro).append(space)
						.append(Constants.XML_ATTRIBUTE_ENABLED).append("='").append(true).append(space)
						.append(Constants.XML_ATTRIBUTE_INSTALLED).append("='").append(false).append(space);
						result += String.format("<plugin %s>", sb.toString());
						result += pluginproperties.toString();
						result += "</plugin>";
					}
				}			
				result += "</plugins>";
			} catch (Exception e) {
				result = e.getMessage();
			}
		}	
		//
		PrintWriter out = response.getWriter();
		response.setHeader("Content-Type", "text/xml");
		out.write(result);
		out.close();		
	}

	private String checkstatus() {
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		result += "<status>";
		result += String.format("status version=%s\n", VERSION);
		result += String.format("keystore=%s\n", ToolDev.isvalidkeystore() ? "Valid" : "Invalid");
		result += String.format("password=%s\n", ToolDev.isvalidpassword() ? "Valid" : "Invalid");
		try {
			KeyStore ks = KeyStore.getInstance("JKS");
			InputStream readStream = new FileInputStream(ToolDev.getkeystorefile());			
			ks.load(readStream, ToolDev.getkeystorepassword());
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
			kmf.init(ks, ToolDev.getkeystorepassword());
			KeyManager[] keyManagers = kmf.getKeyManagers();
			result += String.format("key Managers=%s\n", keyManagers.length);
			for (KeyManager km:keyManagers) {
				result += String.format(" %s \n", km.toString());				
			}
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(ks);
			TrustManager[] trustManagers = tmf.getTrustManagers();			
			X509TrustManager trustManager =   (X509TrustManager) trustManagers[0];
			X509Certificate[] acceptedIssuers =    trustManager.getAcceptedIssuers();
			result += String.format("accepted issuers=%s\n", acceptedIssuers.length);
			for (X509Certificate cert:acceptedIssuers) {				
				result += String.format("%s\n",cert.getIssuerDN().getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		SSLContext sslContext = SSLContextFactory.getInstance().makeContext(ToolDev.getkeystorefile(), ToolDev.getkeystorepassword());
		result += String.format(String.format("sslcontext=%s\n", sslContext != null ? "Valid":"Invalid"));
		String contexterror = SSLContextFactory.getInstance().getError();		
		result += String.format("sslcontextinstance=%s\n", contexterror.length() == 0 ? "Valid" : contexterror);
		result += String.format("repositories=%s\n", isvalidrepositories() ? "Valid" : "Invalid");		
		if (sslContext != null && isvalidrepositories()) {			
			String repository = MStore.getInstance().getRepository();
			StringTokenizer stringTokenizer = new StringTokenizer(repository, "\n");				
			while (stringTokenizer.hasMoreTokens()) {
				String token = stringTokenizer.nextToken().trim();
				if (!urls.contains(token))
					urls.add(token);					
			}	
			for (String url:urls) {
				String validateurl = validate(url);
				if (validateurl.length() == 0)
					result += String.format("url \"%s\" =%s", url, "Valid");
				else 
					result += String.format("url \"%s\" =%s", url, validateurl);				
			}		
		}
		result += "</status>";
		return result;
	}
	public String listcerts() {
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		try {
			//
			List<String> urls = new ArrayList<String>();			
			MStore.getInstance().reload();
			StringTokenizer stringTokenizer = new StringTokenizer(MStore.getInstance().getRepository(), "\n" );        
			while( stringTokenizer.hasMoreTokens() ) {
				String url = stringTokenizer.nextToken().trim();
				if (url.contains("://")) {
					url = url.substring(url.indexOf("://")+3);
				}
				if (url.contains("/")) {
					url = url.substring(0, url.indexOf("/"));
				}
				urls.add(url);				
			}
			//
			List<Cert> certs = new ArrayList<Cert>();
			try {
				for (String url:urls) {
					List<Cert> tcerts = addcertificate(url);
					for (Cert tcert:tcerts) {
						certs.add(tcert);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			StringBuilder sb = new StringBuilder();
			sb.append("<certs>");			
			for (Cert cert:certs) {
				hcerts.put(cert.getHashed(), cert.getCert());
				ncerts.put(cert.getHashed(), cert.getHost());
				sb.append(String.format("<cert name=\"%s\" hash=\"%s\"/>", cert.getSubjectDN(), cert.getHashed()));
			}
			sb.append("</certs>");
			result += sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}

	private List<Cert> addcertificate(String url) throws Exception {
		Boolean addcertificates  = false;
		List<Cert> certs = new ArrayList<Cert>();
		MStore store = MStore.getInstance();
		String keystore = (String) store.getProperties().get(Constants.KEYSTORE);
		String keystorefile = SecureEngine.decrypt(keystore);
		File file = new File(keystorefile);
		//
		String pwdcrypt = (String) store.getProperties().get("ServerPassword");
		String password = SecureEngine.decrypt(pwdcrypt);
		char[] passw = password.toCharArray();
		System.out.println("Loading KeyStore " + file + "...");
		InputStream in = new FileInputStream(file);
		KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());        
		ks.load(in, passw);
		in.close();
		int port = 443;
		SSLContext context = SSLContext.getInstance("TLSv1.2");
		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		tmf.init(ks);
		X509TrustManager defaultTrustManager = (X509TrustManager) tmf.getTrustManagers()[0];
		SavingTrustManager tm = new SavingTrustManager(defaultTrustManager);
		context.init(null, new TrustManager[]{tm}, null);

		SSLSocketFactory factory = context.getSocketFactory();
		SSLSocket socket = (SSLSocket) factory.createSocket(url, port);
		socket.setSoTimeout(10000);
		try {
			System.out.println("Starting SSL handshake...");
			socket.startHandshake();
			socket.close();
			System.out.println();
			System.out.println("No errors, certificate is already trusted");
		} catch (SSLException e) {
			System.out.println();
			addcertificates = true;
			e.printStackTrace(System.out);
		}

		if (!addcertificates) {
			return certs;
		}

		X509Certificate[] chain = tm.chain;
		if (chain == null) {
			System.out.println("Could not obtain server certificate chain");
			return certs;
		}
		MessageDigest md5 = MessageDigest.getInstance("MD5");

		for (int i = 0; i < chain.length; i++) {
			X509Certificate cert = chain[i];
			MessageDigest sha1 = MessageDigest.getInstance("SHA1");
			sha1.update(cert.getEncoded());	        		
			Cert c = new Cert(cert);
			c.setHost(url);
			c.setHashed(Util.toHexString(sha1.digest()));
			certs.add(c);
		}		
		return certs;
	}
	private String wraperror(String error) {
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		result += String.format("<plugins><error>%s</error></plugins>", error);		
		return result;
	}
	public File getFile(String url, final String filename) {
		PluginInstance.put(XendrianConstants.percent, "0");
		new Thread(new ThreadPulse(0, 50)).start();
		File tmpfile = null;
		try {
			if (sslSocketFactory == null) {
				String keystore = (String) MStore.getInstance().getProperties().get(Constants.KEYSTORE);
				String pwdcrypt = (String) MStore.getInstance().getProperties().get("ServerPassword");
				String password = SecureEngine.decrypt(pwdcrypt);			
				File file = new File(SecureEngine.decrypt(keystore));
				char[] passw = password.toCharArray();
				SSLContext sslContext = SSLContextFactory.getInstance().makeContext(file, passw);
				sslSocketFactory = sslContext.getSocketFactory();		
			}			
			OkHttpClient client = new OkHttpClient.Builder()
			.sslSocketFactory(sslSocketFactory)
			.addInterceptor(new LoggingInterceptor())
			.build();
			Request request = new Request.Builder()
			.url(url).build();				
			Response response = client.newCall(request).execute();
			final CountDownLatch countDownLatch = new CountDownLatch(1);
			client.newCall(request).enqueue(new DownloadCallBack(countDownLatch, filename));
			countDownLatch.await();			
			response.close();
			if (!response.isSuccessful()) {
				request = new Request.Builder()
				.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
				.url(url).build();
				response = client.newCall(request).execute();
				CountDownLatch countDownLatch2 = new CountDownLatch(1);
				client.newCall(request).enqueue(new DownloadCallBack(countDownLatch2, filename));
				countDownLatch2.await();
				response.close();
			}			
			String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),filename);
			tmpfile = new File(filedst);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tmpfile;		
	}

	private void deployplugin() {
		String error = "";
		try {
			error = Plugin.getInstance().deployplugins();
			if (error.length() == 0) {
				SyncModel.getInstance().Replication();
				Plugin.getInstance().afterReplication();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}									
	}

	private boolean isvalidrepositories() {		
		Boolean isvalid = false;
		MStore store = MStore.getInstance();
		String repository = store.getRepository();
		if (repository.length() > 0) {
			isvalid = true;
		}
		return isvalid;
	}
	public class ThreadPulse implements Runnable {
		private int min, max;
		public ThreadPulse(int min, int max) {
			this.min = min;
			this.max = max;								
		}
		public void run() {
			for (int i = min ; i <= max; i ++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String percent = PluginInstance.get(XendrianConstants.percent);				
				if (Integer.valueOf(percent)<=  max) {
					PluginInstance.put(XendrianConstants.percent, String.valueOf(i));
				}
			}
		}
	}
	public class ThreadInstallPlugin implements Runnable {
		public ThreadInstallPlugin() {
		}
		public void run() {
			installplugin();
		}
		private String installplugin() {
			String error = "";
			resetMessage();
			String downloadurl = null, filename = null, roleid = null, clientid = null;		
			filename = getProperty("filename");
			downloadurl = getProperty("url");
			roleid = getProperty("role");
			clientid = getProperty("client");
			try {			

				MRole role = new Query(Env.getCtx(), MRole.Table_Name, "AD_Role_ID = ?", null)
				.setParameters(Integer.valueOf(roleid)).first();
				if (role != null && !role.isAllow_Store()) {				
					throw new Exception("role no access");				
				}
				if (role != null && !role.isSuperUser()) {
					throw new Exception("no superuser");
				}			
				File downloadedfile = getFile(downloadurl, filename);
				if (downloadedfile != null) {
					try {						
						new Thread(new ThreadPulse(50, 100)).start();						
						System.out.println(String.format("installed folder %s", Env.getMachine().getInstalledFolder().getAbsolutePath()));
						addMessage(String.format("installed folder %s\n", Env.getMachine().getInstalledFolder().getAbsolutePath()));
						String fileinst = String.format("%s%s%s", Env.getMachine().getInstalledFolder().getAbsolutePath(),File.separator,filename);
						System.out.println(String.format("fileinst %s", fileinst));
						addMessage(String.format("fileinst %s\n", fileinst));
						String filestore = String.format("%s%s%s", Env.getMachine().getStoreFolder(),File.separator,filename);
						File insfile = new File(fileinst);
						if (insfile.exists()) {
							addMessage(String.format("file %s exists\n", fileinst));
							addMessage(String.format("try to delete %s \n", fileinst));
							if (insfile.delete()) {
								addMessage(String.format("delete %s sucessfully\n", fileinst));
							} else {
								addMessage(String.format("delete %s failed (check access)\n", fileinst));
							}
						}
						addMessage(String.format("move %s to %s \n", downloadedfile, insfile));
						Files.move(downloadedfile, insfile);
						File storefile = new File(filestore);
						if (storefile.exists()) {
							storefile.delete();
						}
						Files.move(insfile, new File(filestore));					
						addMessage(String.format("instalado %s", filestore));
						try {
							error = Plugin.getInstance().deployplugins();
							if (error.length() == 0) {
								SyncModel.getInstance().Replication();
								Plugin.getInstance().afterReplication();
							}
						}
						catch (Exception e)
						{
							e.printStackTrace();
						}									
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				String result = ex.getMessage();
				addMessage(result);
			} finally {
				PluginInstance.put("processing", "N");			
			}
			return error;
		}	
	}
	static final int BUFFER_SIZE = 4096;
	HashMap<String, String> PluginInstance = new HashMap<String, String>();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type = "";
		String key = "";
		String value = ""; 
		HttpServletRequestImpl httpServletRequest = (HttpServletRequestImpl) req;
		HttpServerExchange exchange = httpServletRequest.getExchange();
		final FormDataParser parser =  FormParserFactory.builder().build().createParser(exchange);
		FormData data2 = parser.parseBlocking();                          
		Iterator it2 = data2.iterator();
		while (it2.hasNext()) {
			String xx = (String) it2.next();
			if (xx.equals("type")) {				
				type = data2.getFirst("type").getValue();
			} else if (xx.equals("fileName")) {
				type = "upload";
			}
		}
		if (type.equals("upload")) {
			String filename = null, roleid = null, clientid = null;
			roleid = getProperty("role");
			clientid = getProperty("client");
			try {
				FormData data = parser.parseBlocking();                          
				Iterator it = data.iterator();
				while (it.hasNext()) {
					String var = (String) it.next();
					if (var.equals("fileName")) {
						PluginInstance.put(XendrianConstants.percent, "0");
						FormData.FormValue file = data.getFirst("fileName");
						if (file.isFile()) {            			 												
							filename = data.getFirst("fileName").getFileName();
							System.out.println(String.format("installed folder %s", Env.getMachine().getInstalledFolder().getAbsolutePath()));
							addMessage(String.format("installed folder %s\n", Env.getMachine().getInstalledFolder().getAbsolutePath()));
							String fileinst = String.format("%s%s%s", Env.getMachine().getInstalledFolder().getAbsolutePath(),File.separator,filename);
							System.out.println(String.format("fileinst %s", fileinst));
							addMessage(String.format("fileinst %s\n", fileinst));
							String filestore = String.format("%s%s%s", Env.getMachine().getStoreFolder(),File.separator,filename);
							File insfile = new File(fileinst);
							if (insfile.exists()) {
								addMessage(String.format("file %s exists\n", fileinst));
								addMessage(String.format("try to delete %s \n", fileinst));
								if (insfile.delete()) {
									addMessage(String.format("delete %s sucessfully\n", fileinst));
								} else {
									addMessage(String.format("delete %s failed (check access)\n", fileinst));
								}
							}
							if (file.getFile().getPath() != null) {    
								InputStream inputStream = null;
								FileOutputStream outputStream = new FileOutputStream(insfile);
								inputStream = new FileInputStream(file.getFile());
								int content;
								byte[] buffer = new byte[BUFFER_SIZE];
								while ((content = inputStream.read(buffer)) != -1) {
									outputStream.write(buffer, 0, content);
								}
								outputStream.close();
								inputStream.close();
							}						
							File storefile = new File(filestore);
							if (storefile.exists()) {
								storefile.delete();
							}
							Files.move(insfile, new File(filestore));					
							addMessage(String.format("instalado %s", filestore));
							//try {
							new Thread(new ThreadPulse(0, 50)).start();
							String error = Plugin.getInstance().deployplugins();
							if (error.length() == 0) {
								SyncModel.getInstance().Replication();
								Plugin.getInstance().afterReplication();
							}
							new Thread(new ThreadPulse(51, 100)).start();
							addMessage(String.format("fileinst %s\n", fileinst));
						}
					}
				}
				exchange.endExchange();
			} catch (Throwable e) {
				e.printStackTrace();
				exchange.endExchange();
			} finally {
				IoUtils.safeClose(parser);
				PluginInstance.put("processing", "N");
			}		 			
		} else if (type.equals(XendrianConstants.addProperty)) {
			key = req.getParameter("key");
			value = req.getParameter("value");
			PluginInstance.put(key, value);
		} else if (type.equals(XendrianConstants.getProperty)) {
			value = "";
			key = req.getParameter("key");
			if (PluginInstance.containsKey(key)) {
				value = PluginInstance.get(key);
			}
			PrintWriter out = resp.getWriter();
			out.print(value);
			out.close();			
		} else if (type.equals(XendrianConstants.addMessage)) {
			String var = "";
			String message = req.getParameter("message");
			addMessage(message);
		} else if (type.equals(XendrianConstants.getMessage)) {
			String result = "";
			for (String message:messages) {
				result += message;
			}
			PrintWriter out = resp.getWriter();
			out.print(result);
			out.close();			
		} else if (type.equals(XendrianConstants.NewSession)) {
			resetMessage();
		} 
	}
	private void resetMessage() {
		messages.clear();
	}
	private void addMessage(String message) {
		messages.add(message);
	}
	private String getProperty(String key) {
		String var = "";
		if (PluginInstance.containsKey(key)) {
			var = PluginInstance.get(key);
		}
		return var;
	}
}
