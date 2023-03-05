package org.xendra.console;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.compiere.model.MStore;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.SecureEngine;
import org.xendra.Constants;
import org.xendra.newclient.wizard.StoreXMLParser;
import org.xendra.newclient.wizard.PickCertificateProviderStep.SavingTrustManager;
import org.xendra.security.SSLContextFactory;
import org.xendra.utils.Cert;
import org.xendra.utils.ToolDev;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.ComboBox;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.DirectoryDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.FileDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.screen.Screen;

public class ServerKeyStore {
	private static ServerKeyStore instance;
	private File keystore;
	private boolean keystoreloaded = false;
	private boolean goahead = true;

	public static ServerKeyStore getInstance() {
		if (instance == null)
			instance = new ServerKeyStore();
		return instance;
	}

	public boolean keystore(final Screen screen) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();		
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		if (DBmonitor.get().isRoot(gui)) {
			Panel panel = new Panel();
			Panel panelstore = new Panel();
			panelstore.setLayoutManager(new GridLayout(1));
			File keystorefile = null;
			final Label keystorename = new Label("");
			if (ToolDev.isvalidkeystore()) {
				keystorefile = ToolDev.getkeystorefile();
				keystorename.setText(keystorefile.getAbsolutePath());
			}				
			panelstore.addComponent(keystorename);
			Panel panelaccess = new Panel();
			panelaccess.setLayoutManager(new GridLayout(2));

			final TextBox pwd1 = new TextBox(new TerminalSize(30, 1));
			final TextBox pwd2 = new TextBox(new TerminalSize(30, 1));
			panelaccess.addComponent(pwd1);
			panelaccess.addComponent(pwd2);
			pwd1.setMask('*');
			pwd2.setMask('*');
			Button path = new Button("Change path", new Runnable() {
				@Override
				public void run() {
					defineKeyStore(gui, pwd1.getText());
				}
			});
			Button accept = new Button("Connect", new Runnable() {			
				@Override
				public void run() {
					String pwd = pwd1.getText();
					String pwdconf = pwd2.getText();
					keystoreloaded = loadstore(screen, pwd, pwdconf);
					window.close();
				}
			});		
			Button cancel = new Button("Cancel", new Runnable() {
				@Override
				public void run() {
					window.close();
				}
			});
			Panel panelabc = new Panel();
			panelabc.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));		
			panelabc.addComponent(accept);
			panelabc.addComponent(path);
			panelabc.addComponent(cancel);
			panel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
			panel.addComponent(panelstore);
			panel.addComponent(panelaccess);
			panel.addComponent(panelabc);		
			window.setComponent(panel.withBorder(Borders.singleLine("Keystore")));
			gui.addWindowAndWait(window);
		}		
		return keystoreloaded;
	}

	public void loadplugin(Screen screen) {				
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		try {
			File file = new FileDialogBuilder()
					.setTitle("Open File")
					.setDescription("Choose a file")
					.setActionLabel("Open")
					.build()
					.showDialog(gui);
			if (file != null && file.exists()) {				
				MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Confirm")
						.setText(String.format("esta seguro de instalar %s", file.getAbsolutePath()))
						.addButton(MessageDialogButton.Yes)				
						.addButton(MessageDialogButton.No)
						.build()
						.showDialog(gui);								
				if (answer.equals(MessageDialogButton.Yes)) {
					String alive = common.PingToServer();
					if (alive == null) {
						answer = new MessageDialogBuilder()
								.setTitle("Error")
								.setText("error to connect to Server")
								.addButton(MessageDialogButton.OK)			
								.build()
								.showDialog(gui);																	
					} 
					if (alive.length() > 0) {
						answer = new MessageDialogBuilder()
								.setTitle("Conexion")
								.setText(alive)
								.addButton(MessageDialogButton.OK)				
								.build()
								.showDialog(gui);				
					} else {				
						KeyNamePair kp = new KeyNamePair(0,"");
						final List<X_AD_Client> clients = new Query(Env.getCtx(), X_AD_Client.Table_Name, "", null)
								.list();
						final ComboBox<String> comboBox = new ComboBox<String>();											
						for (X_AD_Client client:clients) {
							comboBox.addItem(client.getName());
						}
						final BasicWindow window = new BasicWindow();						
						window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
						Panel panel = new Panel();
						panel.addComponent(comboBox);						
						Button accept = new Button("Ok", new Runnable() {			
							@Override
							public void run() {
								setahead(true);
								window.close();								
							}
						});
						Button cancel = new Button("Cancel", new Runnable() {			
							@Override
							public void run() {													
								window.close();
								setahead(false);								
							}
						});																						
						panel.addComponent(accept);
						panel.addComponent(cancel);
						window.setComponent(panel.withBorder(Borders.singleLine("Options")));
						gui.addWindowAndWait(window);
						if (getahead()) {
							int i = comboBox.getSelectedIndex();
							if (i != -1) {
								if (clients.get(i).getAD_Client_ID() > 0) {
									kp = new KeyNamePair(clients.get(i).getAD_Client_ID(),clients.get(i).getName());
								}
							}
							//
							Boolean force = false;
							//Panel panel = new Panel();
							panel = new Panel();
							//final BasicWindow window = new BasicWindow();
							final ComboBox<String> comboBox2 = new ComboBox<String>();
							comboBox2.addItem("update");
							comboBox2.addItem("force update all");
							panel.addComponent(comboBox2);
							panel.addComponent(accept);
							panel.addComponent(cancel);
							window.setComponent(panel);
							gui.addWindowAndWait(window);
							if (getahead()) {
								i = comboBox.getSelectedIndex();
								if (i == 1) {
									force = true;
								}						
								ServerPlugins.getInstance().loadplugin(screen, file, kp, force);
							}
						}
					}
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}


	protected boolean getahead() {	
		return goahead;
	}

	protected void setahead(boolean b) {
		goahead = b;		
	}

	public void loadplugins(Screen screen) {
		try {
			ServerPlugins.getInstance().loadplugins(screen);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean loadstore(Screen screen, String pwd, String pwdconf) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		boolean loaded = false;
		if (!pwd.equals(pwdconf) &&  pwd.length() > 0) {
			MessageDialogButton answer = new MessageDialogBuilder()
					.setTitle("Error")
					.setText("password no coincide")
					.addButton(MessageDialogButton.OK)				
					.build()
					.showDialog(gui);								
		}
		else 
		{			
			if (!ToolDev.isvalidkeystore()) {
				MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Error")
						.setText("not valid key store")
						.addButton(MessageDialogButton.OK)				
						.build()
						.showDialog(gui);												
				defineKeyStore(gui, pwd);
			}
			List<String> urls = new ArrayList<String>();
			if (!isvalidrepositories()) {
				try {								
					InputStream in = getClass().getResourceAsStream("/org/xendra/resource/store.xml");;		
					urls = new StoreXMLParser().parseFormat(in);
					in.close();
					String repos = "";
					for (String url:urls) {
						repos += String.format("%s\n", url);
					}
					if (MStore.getInstance().getRepository().length() == 0) {
						MStore.getInstance().setRepository(repos);
						MStore.getInstance().save();
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				MStore store = MStore.getInstance();
				String repository = store.getRepository();			
				StringTokenizer stringTokenizer = new StringTokenizer(repository, "\n");								
				while (stringTokenizer.hasMoreTokens()) {
					urls.add(stringTokenizer.nextToken().trim());					
				}				
			}			
			keystore = ToolDev.getkeystorefile();
			String keystorepwd = String.valueOf(ToolDev.getkeystorepassword());
			if (!keystorepwd.equals(pwd)) {
				MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Error")
						.setText("password tienda invalido")
						.addButton(MessageDialogButton.OK)				
						.build()
						.showDialog(gui);					
			} else {
				for (String url:urls) {
					String result = validate(url);
					if (result.length() > 0) {
						MessageDialogButton answer = new MessageDialogBuilder()
								.setTitle(String.format("Error in validate %s", url))
								.setText(result)
								.addButton(MessageDialogButton.OK)						
								.build()
								.showDialog(gui);
					} else {
						loaded = true;
					}
				}					
			}
		}
		return loaded;
	}

	private void defineKeyStore(MultiWindowTextGUI gui, String pwd) {
		File keystoredir = new DirectoryDialogBuilder()
				.setTitle("Open Key Store")
				.setDescription("Choose a folder")		
				.setActionLabel("Open")			
				.build()
				.showDialog(gui);
		if (keystoredir != null) {
			MessageDialogButton answer = new MessageDialogBuilder()
					.setTitle("Confirm")
					.setText(String.format("esta seguro de crear la tienda en %s", keystoredir.getAbsolutePath()))
					.addButton(MessageDialogButton.Yes)				
					.addButton(MessageDialogButton.No)
					.build()
					.showDialog(gui);								
			if (answer.equals(MessageDialogButton.Yes)) {
				keystore = new File(keystoredir, Constants.KEYSTORE_NAME);
				try {
					KeyStore ks = KeyStore.getInstance("JKS");
					long size = keystore.length();
					if (size == 0) {								
						ks.load(null, pwd.toCharArray());
						FileOutputStream fos = new FileOutputStream(keystore.getAbsolutePath());
						ks.store(fos, pwd.toCharArray());
						fos.close();
					}
					String pwdsecure = SecureEngine.encrypt(pwd);
					InputStream readStream = new FileInputStream(keystore);			
					ks.load(readStream, pwd.toCharArray());
					KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
					kmf.init(ks, pwd.toCharArray());
					HashMap properties = MStore.getInstance().getProperties();						
					properties.put(Constants.KEYSTORE, SecureEngine.encrypt(keystore.getAbsolutePath()));					
					properties.put("ServerPassword", pwdsecure);
					MStore.getInstance().setProperties(properties);
					MStore.getInstance().save();
					MStore.getInstance().reload();						
				} catch (Exception e) {
					answer = new MessageDialogBuilder()
							.setTitle("Error")
							.setText(e.getMessage())
							.addButton(MessageDialogButton.OK)									
							.build()
							.showDialog(gui);								
				}					
			}
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

	private String validate(String url) {
		String result = "";
		try {
			SSLContext sslContext = SSLContextFactory.getInstance().makeContext(ToolDev.getkeystorefile(), ToolDev.getkeystorepassword());
			if (sslContext != null) {
				SSLSocketFactory sslSocketFactory;				
				sslSocketFactory = sslContext.getSocketFactory();								
				OkHttpClient client = new OkHttpClient.Builder()						
						.sslSocketFactory(sslSocketFactory)
						.build();
				Request request = new Request.Builder()
						.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
						.url(url).build();    			
				Response response = client.newCall(request).execute();
				response.close();				
			} else {
				result = SSLContextFactory.getInstance().getError();
				if (result.equals("nocertificates")) {					
					List<Cert> certs = new ArrayList<Cert>();
					try {						
						List<Cert> tcerts = addcertificate(url);
						for (Cert tcert:tcerts) {
							certs.add(tcert);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}					
				}
			}
		} catch (Exception e) {
			result = e.getMessage();
		}
		return result;
	}

	private List<Cert> addcertificate(String stringurl) {		
		List<Cert> certs = new ArrayList<Cert>();		
		int port = 443;
		SavingTrustManager tm = null;
		try {
			InputStream in = new FileInputStream(keystore);
			KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
			String pwdcrypt = (String) MStore.getInstance().getProperties().get("ServerPassword");
			String password = SecureEngine.decrypt(pwdcrypt);
			char[] passphrase  = password.toCharArray();
			ks.load(in, passphrase);
			SSLContext context = SSLContext.getInstance("TLSv1.2");
			TrustManagerFactory tmf =
					TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(ks);
			X509TrustManager defaultTrustManager = (X509TrustManager) tmf.getTrustManagers()[0];
			tm = new SavingTrustManager(defaultTrustManager);
			context.init(null, new TrustManager[]{tm}, null);
			SSLSocketFactory factory = context.getSocketFactory();
			SSLSocket socket = (SSLSocket) factory.createSocket(stringurl, port);
			socket.setSoTimeout(10000);
			System.out.println("Starting SSL handshake...");
			socket.startHandshake();
			socket.close();
			System.out.println();
			System.out.println("No errors, certificate is already trusted");
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace(System.out);
		}
		X509Certificate[] chain = tm.chain;
		if (chain == null) {
			System.out.println("Could not obtain server certificate chain");
			return certs;
		}
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA1");
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			for (int i = 0; i < chain.length; i++) {
				X509Certificate cert = chain[i];
				Cert c = new Cert(cert);
				c.setHost(stringurl);
				certs.add(c);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return certs;
		//
	}
}