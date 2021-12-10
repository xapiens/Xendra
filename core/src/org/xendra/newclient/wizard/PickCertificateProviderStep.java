package org.xendra.newclient.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Ini;
import org.xendra.newclient.i18n.ResourceLoader;
import org.xendra.security.SSLContextFactory;
import org.xendra.security.api.XendraKeyStore;
import org.xendra.utils.Cert;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.miginfocom.swing.MigLayout;

public class PickCertificateProviderStep extends AbstractStep implements ListSelectionListener, ActionListener  {
	private DataModel data;
	private JList list;
	private JButton addcert;
	private KeyStore ks;
	private char[]  passphrase;
	private Cert pickcert;
	public PickCertificateProviderStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "certificate_provider"),
				ResourceLoader.getString("dialog", "newclient", "certificate_provider"));
		this.data = data;		
		this.setCanGoNext(true);		
	}
	@Override
	protected JComponent createComponent() {
		List<String> urls = getUrls();		
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
		JComponent component = new JPanel(new MigLayout());
		list = new JList();        
		//list.setCellRenderer(new certrenderer());
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		DefaultListModel m = new DefaultListModel();
		for (Cert cert:certs) {
			m.addElement(cert);	
		}                 
		list.setModel(m);
		list.addListSelectionListener(this);
		addcert = new JButton();
		addcert.addActionListener(this);
		component.add(new JScrollPane(list), "wrap");
		component.add(addcert);
		return component;
	}
	private List<Cert> addcertificate(String url) throws Exception {		
		List<Cert> certs = new ArrayList<Cert>();		
		int port = 443;
		//String keystore = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
		String keystore = (String) data.getData("KeyStorePath");
		File file = new File(keystore);
//		File file = new File("jssecacerts");
//		if (file.isFile() == false) {
//			char SEP = File.separatorChar;
//			File dir = new File(System.getProperty("java.home") + SEP  + "lib" + SEP + "security");
//			file = new File(dir, "jssecacerts");
//			if (file.isFile() == false) {
//				file = new File(dir, "cacerts");
//			}
//		}
		System.out.println("Loading KeyStore " + file + "...");
		InputStream in = new FileInputStream(file);
		ks = KeyStore.getInstance(KeyStore.getDefaultType());        
		//passphrase = "changeit".toCharArray();
		passphrase  = (char[]) data.getData("StorePassword");
		ks.load(in, passphrase);
		in.close();

		//SSLContext context = SSLContext.getInstance("TLS");
		SSLContext context = SSLContext.getInstance("TLSv1.2");
		TrustManagerFactory tmf =
				TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
			e.printStackTrace(System.out);
		}

		X509Certificate[] chain = tm.chain;
		if (chain == null) {
			System.out.println("Could not obtain server certificate chain");
			return certs;
		}

		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));

		//System.out.println();
		//System.out.println("Server sent " + chain.length + " certificate(s):");
		//System.out.println();
		MessageDigest sha1 = MessageDigest.getInstance("SHA1");
		MessageDigest md5 = MessageDigest.getInstance("MD5");

		for (int i = 0; i < chain.length; i++) {
			X509Certificate cert = chain[i];
			Cert c = new Cert(cert);
			c.setHost(url);
			certs.add(c);
			//System.out.println
			//        (" " + (i + 1) + " Subject " + cert.getSubjectDN());
			//System.out.println("   Issuer  " + cert.getIssuerDN());
			//sha1.update(cert.getEncoded());
			//System.out.println("   sha1    " + toHexString(sha1.digest()));
			//md5.update(cert.getEncoded());
			//System.out.println("   md5     " + toHexString(md5.digest()));
			//System.out.println();
		}		

		return certs;
		//
	}
	private List<String> getUrls() {
		List<String> urls = new ArrayList<String>();
		//				
		//String keystore = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
		String keystore = (String) data.getData("KeyStorePath");
		File file = new File(keystore);
		if (!file.exists()) {
			return null;
		}
		String source = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);
		char[] passw = (char[]) data.getData("StorePassword");
		SSLContext sslContext = SSLContextFactory.getInstance().makeContextWithoutCheckIssuers(file, passw);		
		SSLSocketFactory sslSocketFactory;		
		sslSocketFactory = sslContext.getSocketFactory();
		StringTokenizer stringTokenizer = new StringTokenizer( source, "\n" );        
		while( stringTokenizer.hasMoreTokens() ) {
			String url = stringTokenizer.nextToken().trim();          
			OkHttpClient client = new OkHttpClient.Builder()						
			.sslSocketFactory(sslSocketFactory)
			.build();
			Request request = new Request.Builder()
			.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
			.url(url).build();    
			try (Response response = client.newCall(request).execute())  {

			} catch (Exception e) {
				if (url.contains("://")) {
					url = url.substring(url.indexOf("://")+3);
				}
				if (url.contains("/")) {
					url = url.substring(0, url.indexOf("/"));
				}
				urls.add(url);
			}
		}
		return urls;
	}
	public static class SavingTrustManager implements X509TrustManager {

		private final X509TrustManager tm;
		public X509Certificate[] chain;

		public SavingTrustManager(X509TrustManager tm) {
			this.tm = tm;
		}

		public X509Certificate[] getAcceptedIssuers() {

			/** 
			 * This change has been done due to the following resolution advised for Java 1.7+
		http://infposs.blogspot.kr/2013/06/installcert-and-java-7.html
			 **/ 

			return new X509Certificate[0];	
			//throw new UnsupportedOperationException();
		}

		public void checkClientTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
			throw new UnsupportedOperationException();
		}

		public void checkServerTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
			this.chain = chain;
			tm.checkServerTrusted(chain, authType);
		}
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		pickcert = (Cert) list.getModel().getElementAt(list.getSelectedIndex());
		addcert.setText(String.format("add %s", pickcert));
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		X509Certificate cert = pickcert.getCert();
        String alias = pickcert.getHost() + "-" + (list.getSelectedIndex() + 1);
        try {
        ks.setCertificateEntry(alias, cert);
        String keystore = (String) data.getData("KeyStorePath");
		//String keystore = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
		File file = new File(keystore);
		OutputStream out = new FileOutputStream(file);
        ks.store(out, passphrase);
        out.close();

        System.out.println();
        System.out.println(cert);
        System.out.println();
        System.out.println
                ("Added certificate to keystore 'jssecacerts' using alias '"
                        + alias + "'");
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	public void prepareRendering() {
	}
}
