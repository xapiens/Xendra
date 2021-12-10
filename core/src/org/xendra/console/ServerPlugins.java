package org.xendra.console;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.Proxy;
import java.net.URLConnection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.columba.api.plugin.ExtensionMetadata;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.PluginMetadata;
import org.columba.core.plugin.Extension;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.MRole;
import org.compiere.model.MStore;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Extension;
import org.compiere.model.persistence.X_AD_ExtensionList;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.SecureEngine;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.api.XendrianConstants;
import org.xendra.api.XendrianServer;
import org.xendra.security.SSLContextFactory;
import org.xendra.utils.ToolDev;
import org.xendra.xendrian.Plugin;
import org.xendra.xendrian.SyncModel;
import com.google.common.io.Files;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.ComboBox;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.ProgressBar;
//import com.googlecode.lanterna.gui2.ProgressBar;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class ServerPlugins {
	public static ServerPlugins instance = null;
	private List<PluginMetadata> plugins = new ArrayList<PluginMetadata>();
	private SSLSocketFactory sslSocketFactory;
	public static ServerPlugins getInstance() {
		if (instance == null)
			instance = new ServerPlugins();
		return instance;
	}

	public void loadplugins(final Screen screen) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		try {
			final BasicWindow window = new BasicWindow();		
			window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));			
			Panel panel = new Panel();
			window.setComponent(panel.withBorder(Borders.singleLine("plugins")));
			String alive = common.PingToServer();
			if (alive == null) {
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Error")
				.setText("error to connect to Server")
				.addButton(MessageDialogButton.OK)			
				.build()
				.showDialog(gui);																	
			} 
			if (alive.length() > 0) {
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Conexion")
				.setText(alive)
				.addButton(MessageDialogButton.OK)				
				.build()
				.showDialog(gui);				
			} else {				
				final Table<String> table = new Table<String>("name","filename","installed");
				table.getTableModel().clear();
				MStore store = MStore.getInstance();
				String repository = store.getRepository();			
				StringTokenizer stringTokenizer = new StringTokenizer(repository, "\n");
				List<String> urls = new ArrayList<String>();
				while (stringTokenizer.hasMoreTokens()) {
					urls.add(stringTokenizer.nextToken().trim());					
				}						
				for (String url:urls) {
					String x = navigate(url);
					SAXBuilder builder = new SAXBuilder();
					InputStream stream = new ByteArrayInputStream(x.getBytes("UTF-8"));				
					Document doc = builder.build(stream);
					List childs = doc.getRootElement().getChildren();

					for (Iterator it = childs.iterator(); it.hasNext();) {
						Element child = (Element) it.next();				
						String id = child.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
						String name = child.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
						String description = child.getAttributeValue(Constants.XML_ATTRIBUTE_DESCRIPTION);
						String categoryname = child.getAttributeValue(Constants.XML_ATTRIBUTE_CATEGORY);
						String synchro = child.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
						HashMap Properties = new HashMap();
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
											if (!value.startsWith("http"))
												value = String.format("%s%s",url, value);											
										}										
										Properties.put(key, value);
									}
								}
							}
						}					
						String filename = (String) Properties.get("filename");
						String filesize = (String) Properties.get("filesize");
						String version =  (String) Properties.get(Constants.XML_ATTRIBUTE_VERSION);
						PluginMetadata pm = new PluginMetadata(id, 
								name, 
								description,
								version,
								categoryname,
								synchro,
								true, false);				
						pm.setFilename(filename);
						//pm.setFilesize(filesize);
						pm.setProperties(Properties);
						Timestamp update = Timestamp.valueOf(synchro);
						pm.setUpdate(update);
						plugins.add(pm);

					}	
					// llamando los plugins locales luego de parsear el xml
					callplugins();
					for (PluginMetadata plugin:plugins) {
						String status = "";
						Timestamp update = plugin.getUpdate();
						if (update != null) {
							if (plugin.getActual() == null) {
								status = "not installed";
							} else {
								long different = update.getTime() - plugin.getActual().getTime();						
								long secondsInMilli = 1000;
								long minutesInMilli = secondsInMilli * 60;
								long hoursInMilli = minutesInMilli * 60;
								long daysInMilli = hoursInMilli * 24;						
								long elapsedDays = different / daysInMilli;
								different = different % daysInMilli;
								long elapsedHours = different / hoursInMilli;
								different = different % hoursInMilli;
								long elapsedMinutes = different / minutesInMilli;
								different = different % minutesInMilli;
								long elapsedSeconds = different / secondsInMilli;
								String timepass = "";
								if (elapsedDays > 0)
									timepass = String.format("%d days, %d hours",elapsedDays,elapsedHours);
								else if (elapsedHours > 0)
									timepass = String.format("%d hours",elapsedHours);
								else if (elapsedMinutes > 0)
									timepass = String.format("%d minutes",elapsedMinutes);
								else if (elapsedSeconds > 0)
									timepass = String.format("%d seconds%n",elapsedSeconds);
								status = timepass;
							}
						}
						table.getTableModel().addRow(plugin.getName(), plugin.getFilename(), status);
					}				
				}
				panel.addComponent(table);
				Button update = new Button("Install/Update", new Runnable() {			
					@Override
					public void run() { 
						try {										
							List<String> data = table.getTableModel().getRow(table.getSelectedRow());					
							String name = data.get(0);
							String filename = data.get(1);
							String aged = data.get(2);
							MessageDialogButton answer = new MessageDialogBuilder()
							.setTitle("Actualizacion")
							.setText(String.format("actualizar %s %s (%s)", name, filename, aged))
							.addButton(MessageDialogButton.Yes)
							.addButton(MessageDialogButton.No)
							.build()
							.showDialog(gui);
							if (answer.ordinal() == MessageDialogButton.Yes.ordinal()) {						
								installplugin(screen, name,filename,gui);
								window.close();
								loadplugins(screen);					
							}

						} catch (Exception e) {
							MessageDialogButton answer = new MessageDialogBuilder()
							.setTitle("Error")
							.setText(e.getMessage())
							.addButton(MessageDialogButton.OK)
							.build()
							.showDialog(gui);														
						}
					}
				});
				Button accept = new Button("Ok", new Runnable() {
					@Override
					public void run() {
						window.close();
					}
				});
				Panel panelaccount = new Panel();
				panelaccount.addComponent(table);
				panel.addComponent(panelaccount.withBorder(Borders.singleLine("Plugins")));
				panelaccount.addComponent(update);
				panel.addComponent(accept);
				window.setComponent(panel.withBorder(Borders.singleLine("plugins")));		
				gui.addWindowAndWait(window);
			}
		} catch (Exception e) {
			MessageDialogButton answer = new MessageDialogBuilder()
			.setTitle("Error")
			.setText(e.getMessage())
			.addButton(MessageDialogButton.OK)
			.build()
			.showDialog(gui);
		}
		//
	}

	private void installplugin(Screen screen, String name, String filename, MultiWindowTextGUI gui) {		
		for (PluginMetadata plugin:plugins) {
			if (plugin.getName().equals(name) && plugin.getFilename().equals(filename)) {				
				if (plugin.getProperties() != null) {
					String surl = (String) plugin.getProperties().get("downloadurl");
					if (surl != null) {
						try {
							URL url = new URL(surl);
							if (url != null) {
								try {
									MRole role = MRole.getDefault();
									if (role != null && role.isSuperUser()) {
										KeyNamePair kp = new KeyNamePair(0,"");
										int selection = -1;
										String askclient = (String) plugin.getProperties().get("askclient");
										if (askclient == null) {
											askclient = "N";
										}
										if (askclient.equals("Y")) {
											final List<X_AD_Client> clients = new Query(Env.getCtx(), X_AD_Client.Table_Name, "", null)
											.list();
											final ComboBox<String> comboBox = new ComboBox<String>();											
											for (X_AD_Client client:clients) {
												comboBox.addItem(client.getName());
											}
											final BasicWindow window = new BasicWindow();
											Panel panel = new Panel();
											panel.addComponent(comboBox);
											//Button accept = new Button("Ok");
											//intermediate in = new intermediate(comboBox);
											Button accept = new Button("Ok", new Runnable() {			
												@Override
												public void run() {
													window.close();
												}
											});
											Button cancel = new Button("Cancel", new Runnable() {			
												@Override
												public void run() {													
													window.close();			
												}
											});																						
											panel.addComponent(accept);
											panel.addComponent(cancel);
											window.setComponent(panel);
											gui.addWindowAndWait(window);		

											int i = comboBox.getSelectedIndex();
											if (i != -1) {
												if (clients.get(i).getAD_Client_ID() > 0) {
													kp = new KeyNamePair(clients.get(i).getAD_Client_ID(),clients.get(i).getName());
												}
											}
										}
										Boolean force = false;
										Panel panel = new Panel();
										final BasicWindow window = new BasicWindow();
										final ComboBox<String> comboBox = new ComboBox<String>();
										comboBox.addItem("update");
										comboBox.addItem("force update all");
										panel.addComponent(comboBox);
										Button accept = new Button("Ok", new Runnable() {			
											@Override
											public void run() {
												window.close();
											}
										});
										panel.addComponent(accept);
										window.setComponent(panel);
										gui.addWindowAndWait(window);
										int i = comboBox.getSelectedIndex();
										if (i == 1) {
											force = true;
										}
										if (kp.getKey() == 0 && askclient.equals("Y")) {
											MessageDialogButton answer = new MessageDialogBuilder()
											.setTitle("error")
											.setText("el plugin requiere seleccionar un cliente")
											.addButton(MessageDialogButton.OK)											
											.build()
											.showDialog(gui);
										} else {																						
											PluginResult result = installplugin(screen, surl, plugin, kp, force);
											if (result.getError().length() > 0) {
												MessageDialogButton answer = new MessageDialogBuilder()
												.setTitle("Error")
												.setText(result.getError())
												.addButton(MessageDialogButton.OK)										
												.build()
												.showDialog(gui);											
											} else {
												//String query = String.format("properties->'filename'='%s' AND LastModified = ?", filename);
												String message = new XendrianServer().setServlet("store").getMessage();
												if (message != null) {
													MessageDialogButton answer = new MessageDialogBuilder()
													.setTitle("Installation")
													//.setText(pi.getMessage())
													.setText(message)
													.addButton(MessageDialogButton.OK)										
													.build()
													.showDialog(gui);
													break;
												}
											} 																																				
										}  										
									} else if (!role.isSuperUser()) {
										MessageDialogButton answer = new MessageDialogBuilder()
										.setTitle("Actualizacion")
										.setText("no es super usuario")
										.addButton(MessageDialogButton.OK)										
										.build()
										.showDialog(gui);
									}							
								} catch (Exception ioe) {
									ioe.printStackTrace();
								}
							}					
						} catch (MalformedURLException ex) {
						} // does not occur
					}
				}															
			}
		}
	}

	protected String navigate(String url) throws Exception {
		String result = "";
		if (!ToolDev.isvalidpassword()) {								
			throw new Exception("nopassword");
		} 
		if (!ToolDev.isvalidkeystore()) {				
			throw new Exception("nokeystore");				
		}		
		SSLContext sslContext = SSLContextFactory.getInstance().makeContext(ToolDev.getkeystorefile(), ToolDev.getkeystorepassword());
		if (sslContext == null) {
			result = SSLContextFactory.getInstance().getError();				
			throw new Exception(result);
		}
		SSLSocketFactory sslSocketFactory;				
		sslSocketFactory = sslContext.getSocketFactory();
		//Proxy proxy = null;
		Proxy proxy = null;
		if (MStore.getInstance().getProperties().containsKey("proxyserver") 
				&& MStore.getInstance().getProperties().containsKey("proxyport")) {
			String hostname = (String) MStore.getInstance().getProperties().get("proxyserver");
			if (hostname == null) {
				hostname = "";
			}
			String port = (String) MStore.getInstance().getProperties().get("proxyport");
			if (port == null) {
				port = "";
			}
			try {
				if (hostname.length() > 0 && port.length() > 0) {
					proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(hostname, Integer.valueOf(port)));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		OkHttpClient client = null;
		if (proxy == null) {
			client = new OkHttpClient.Builder()						
			.sslSocketFactory(sslSocketFactory)
			.cache(null)
			.build();
		} else {
			client = new OkHttpClient.Builder()						
			.sslSocketFactory(sslSocketFactory)
			.cache(null)
			.proxy(proxy)
			.build();				
		}
		Request request = new Request.Builder()
		.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")			
		//.cacheControl(new CacheControl.Builder().noCache().build())
		.url(url).build();    			
		Response response = client.newCall(request).execute();
		if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
		result = response.body().string();
		return result;
	}

	public void loadplugin(Screen screen, File downloadedfile, KeyNamePair kp, Boolean force) {
		String error = "";
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		try {			
			new XendrianServer().setServlet("store").addProperty("client", kp.getKey());
			new XendrianServer().setServlet("store").addProperty("force", force ? "Y" : "N");
			new XendrianServer().setServlet("store").addProperty("role", MRole.getDefault().getAD_Role_ID());
			new XendrianServer().setServlet("store").addProperty("processing", "Y");
			new XendrianServer().setServlet("store").setType("upload").upload(downloadedfile);
			PluginResult pr = new PluginResult();
			ProgressBar pbar = new ProgressBar(0,100,100);
			String processing = new XendrianServer().setServlet("store").getProperty("processing");
			String msg = "";
			int currentpos = 0;
			final BasicWindow window = new BasicWindow();
			window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));			
			window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
			Panel panel = new Panel();
			panel.setLayoutManager(new GridLayout(1));			
			panel.addComponent(pbar);
			panel.addComponent(new Label(String.format("upload %s", downloadedfile.getName())));
			window.setComponent(panel.withBorder(Borders.singleLine("Installing...")));
			gui.addWindow(window);			
			while (processing.equals("Y")) {
				msg =  new XendrianServer().setServlet("store").getMessage();
				String percent = new XendrianServer().setServlet("store").getProperty(XendrianConstants.percent);
				if (percent.length() == 0)
					percent = "0";
				currentpos = Integer.valueOf(percent);
				pbar.setValue(currentpos);
				try {
					gui.updateScreen();
				} catch (IOException e2) {
					e2.printStackTrace();
				}											
				processing = new XendrianServer().setServlet("store").getProperty("processing");
			}		
			pr.setError(new XendrianServer().setServlet("store").getError());			
			error = Plugin.getInstance().deployplugins();			
			String message = new XendrianServer().setServlet("store").getMessage();
			gui.updateScreen();
			if (error.length() > 0) 
				throw new Exception(error);
			if (message != null) {				
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Installation")
				.setText(message)
				.addButton(MessageDialogButton.OK)										
				.build()
				.showDialog(gui);						
			}
		} catch (Exception e) {					
			error = e.getMessage();
			MessageDialogButton answer = new MessageDialogBuilder()
			.setTitle("Error")
			.setText(error)
			.addButton(MessageDialogButton.OK)										
			.build()
			.showDialog(gui);														
		}
	}
	private PluginResult installplugin(Screen screen, String url, PluginMetadata plugin, KeyNamePair kp, boolean force) {
		PluginResult pr = new PluginResult();
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();		
		ProgressBar pbar = new ProgressBar(0,100,100);		
		pbar.setValue(0);		
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(1));
		panel.addComponent(pbar);
		panel.addComponent(new Label(String.format("download %s", url)));
		window.setComponent(panel.withBorder(Borders.singleLine("Installing...")));
		gui.addWindow(window);
		try {
			gui.updateScreen();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (!ToolDev.isvalidpassword()) {				
		} 
		if (!ToolDev.isvalidkeystore()) {			
		}
		String filename = (String) plugin.getProperties().get("filename");
		new XendrianServer().setServlet("store").newsession();
		new XendrianServer().setServlet("store").addProperty("filename", filename);
		new XendrianServer().setServlet("store").addProperty("url", url);
		new XendrianServer().setServlet("store").addProperty("role", MRole.getDefault().getAD_Role_ID());
		new XendrianServer().setServlet("store").addProperty("client", kp.getKey());
		new XendrianServer().setServlet("store").addProperty("force", force ? "Y" : "N");
		new XendrianServer().setServlet("store").addProperty("processing", "Y");
		new XendrianServer().setServlet("store").setType("install").start();
		String processing = new XendrianServer().setServlet("store").getProperty("processing");
		String msg = "";
		int currentpos = 0;
		while (processing.equals("Y")) {
			msg =  new XendrianServer().setServlet("store").getMessage();
			String percent = new XendrianServer().setServlet("store").getProperty(XendrianConstants.percent);
			if (percent.length() == 0)
				percent = "0";
			currentpos = Integer.valueOf(percent);
			pbar.setValue(currentpos);
			try {
				gui.updateScreen();
			} catch (IOException e2) {
				e2.printStackTrace();
			}											
			processing = new XendrianServer().setServlet("store").getProperty("processing");
		}		
		pr.setError(new XendrianServer().setServlet("store").getError());
		return pr;
	}

	private PluginResult oldinstallplugin(Screen screen, String url, PluginMetadata plugin, KeyNamePair kp, boolean force) {		
		PluginResult pr = new PluginResult();
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();		
		ProgressBar pbar = new ProgressBar(0,100,100);		
		pbar.setValue(0);		
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(1));
		panel.addComponent(pbar);
		panel.addComponent(new Label(String.format("download %s", url)));
		window.setComponent(panel.withBorder(Borders.singleLine("Installing...")));
		gui.addWindow(window);
		try {
			gui.updateScreen();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		String filename = (String) plugin.getProperties().get("filename");
		File downloadedfile = null;
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
			.build();
			Request request = new Request.Builder()
			.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
			.url(url).build();				
			InputStream is = null;
			OutputStream output = null;						
			Response response = client.newCall(request).execute();
			try {
				final String contentType = response.header("Content-Type");
				String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),filename);
				if (contentType.equals("text/html; charset=utf-8")) {
					URL u = new URL(url);
					URLConnection connection = u.openConnection();
					int totalsize = connection.getContentLength();
					is = connection.getInputStream();
					File f = new File(filedst);
					if (!f.exists()) {
						f.createNewFile();
					}					
					// redirect try the another option
					FileOutputStream fileOut =new FileOutputStream(filedst);					
					DataInputStream dis = new DataInputStream(new BufferedInputStream(is));					
					byte[] buffer = new byte[1024];
					int len1 = 0;
					int currentpos = 0;
					Double currentsize = 0d;
					while ( (len1 = is.read(buffer)) > 0 ) {
						fileOut.write(buffer, 0, len1);
						currentsize += len1;
						Double advance = (currentsize / totalsize) * 100;
						if (advance.intValue() > currentpos) {
							currentpos = advance.intValue();
							pbar.setValue(currentpos);
						}
						try {
							gui.updateScreen();
						} catch (IOException e2) {
							e2.printStackTrace();
						}											
					}
					fileOut.flush();
					fileOut.close();
					downloadedfile = new File(filedst);
					new XendrianServer().setServlet("store").addProperty("client",kp.getKey());
					new XendrianServer().setServlet("store").addProperty("force", force ? "Y":"N");
					new XendrianServer().setServlet("store").addProperty("filename", downloadedfile.getName());
				}
				else if (contentType.equals("application/octet-stream") || contentType.equals("application/zip")) {
					final String contentlength = response.header("Content-Length");			    
					is = response.body().byteStream();							 
					BufferedInputStream input = new BufferedInputStream(is);												
					System.out.println(filedst);				
					output = new FileOutputStream(new File(filedst));
					int read = 0;			
					byte[] bytes = new byte[1024];							 					        
					Double currentsize = 0d;
					Double totalsize = Double.valueOf(contentlength);
					int currentpos = 0;
					while ((read = input.read(bytes)) != -1) {								 
						output.write(bytes, 0, read);					
						currentsize += read;
						Double advance = (currentsize / totalsize) * 100;
						if (advance.intValue() > currentpos) {
							currentpos = advance.intValue();
							pbar.setValue(currentpos);
							try {
								gui.updateScreen();
							} catch (IOException e2) {
								e2.printStackTrace();
							}											
						}
					}							
					if (is != null) 
						is.close();
					if (output != null) 
						output.close();				
					downloadedfile = new File(filedst);
					new XendrianServer().setServlet("store").addProperty("client",kp.getKey());
					new XendrianServer().setServlet("store").addProperty("force", force ? "Y":"N");
					new XendrianServer().setServlet("store").addProperty("filename", downloadedfile.getName());
				} else {
					pr.setError(String.format("el content Type es %s ", contentType));					
				}				
			} catch (Exception e) {
				e.printStackTrace();				
			} finally {
				response.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (downloadedfile != null) {
			try {
				String fileinst = String.format("%s%s%s", Env.getMachine().getInstalledFolder().getAbsolutePath(),File.separator, filename);
				System.out.println(String.format("fileinst %s", fileinst));
				String filestore = String.format("%s%s%s", Env.getMachine().getStoreFolder(),File.separator,filename);
				File insfile = new File(fileinst);
				if (insfile.exists()) {
					if (insfile.delete()) {
					} else {
					}
				}
				Files.move(downloadedfile, insfile);
				File storefile = new File(filestore);
				if (storefile.exists()) {
					storefile.delete();
				}
				Files.move(insfile, new File(filestore));
				try {
					pr.setError(Plugin.getInstance().deployplugins());					
					if (pr.getError().length() == 0) {
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
		return pr;
	}

	private void callplugins() {
		List<X_AD_Plugin> dbplugins = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "IsActive = 'Y'", null).list();
		for (X_AD_Plugin plugin:dbplugins) {
			Timestamp tsync = plugin.getSynchronized();
			String sync = null; 
			if (tsync != null) {
				sync = tsync.toString();				
			} 
			PluginMetadata dbpm = new PluginMetadata(plugin.getID(), 
					plugin.getName(), 
					plugin.getDescription(),
					plugin.getVersion().toString(),
					plugin.getCategoryName(),						
					sync,
					plugin.isActive(),
					plugin.isInstalled());
			dbpm.setFilename(plugin.getFileName());
			//dbpm.setFilesize(String.valueOf(plugin.getFileSize()));
			//dbpm.setVersion(plugin.getVersion().toString());
			dbpm.setProperties(plugin.getProperties());
			dbpm.setSynchronized(plugin.getSynchronized());
			dbpm.setActual(plugin.getSynchronized());
			boolean found = false;
			for (Iterator it = plugins.iterator(); it.hasNext();) {
				PluginMetadata pm = (PluginMetadata) it.next();
				if (pm.getId().equals(dbpm.getId())) {
					pm.setInstalled(true);
					pm.setActual(dbpm.getActual());
					pm.setVersion(dbpm.getVersion());					
					found = true;
				}
			}
			if (!found) {
				plugins.add(dbpm);
				X_AD_ExtensionList extensionlist = new Query(Env.getCtx(), X_AD_ExtensionList.Table_Name, "id = ?", null)
				.setParameters(IExtensionHandlerKeys.ORG_COLUMBA_CORE_CONFIG).first();
				if (extensionlist != null) {
					X_AD_Extension extension = new Query(Env.getCtx(), X_AD_Extension.Table_Name, "AD_Plugin_ID = ? AND AD_ExtensionList_ID = ?", null)
					.setParameters(plugin.getAD_Plugin_ID(), extensionlist.getAD_ExtensionList_ID()).first();
					if (extension != null) {
						try {
							IExtensionHandler handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_CONFIG);
							ExtensionMetadata metadata = new ExtensionMetadata(extension.getID(), extension.getClassname(), extension.getProperties());
							if (!handler.exists(extension.getID())) {
								Extension pluginExtension = new Extension(dbpm, metadata);
								handler.addExtension(extension.getID(), pluginExtension);
							}						
						} catch (Exception e) {
							e.printStackTrace();
						}					
					}
				}
			}
		}						
	}

}
