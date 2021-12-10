package org.xendra.newclient.wizard;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.MStore;
import org.compiere.model.persistence.X_AD_Plugin;
import org.xendra.newclient.i18n.ResourceLoader;
import org.xendra.security.SSLContextFactory;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;

public class PluginReposStep extends AbstractStep implements StepModelCustomizer, ActionListener, DocumentListener {
	private DataModel data;
	private JTextPane textPane;
	private MStore store;
	public PluginReposStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "superuser"),
				ResourceLoader.getString("dialog", "newclient", "superuser"));
		this.data = data;		
		this.setCanGoNext(true);		
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}	

	protected void addStylesToDocument(StyledDocument doc) {
		Style def = StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
		Style regular = doc.addStyle("regular", def);
		StyleConstants.setFontFamily(def, "SansSerif");

		Style s = doc.addStyle("italic", regular);
		StyleConstants.setItalic(s,  true);

		s = doc.addStyle("bold", regular);
		StyleConstants.setBold(s, true);

		s = doc.addStyle("small", regular);
		StyleConstants.setFontSize(s, 10);

		s = doc.addStyle("large", regular);
		StyleConstants.setFontSize(s, 16);

	}

	@Override
	protected JComponent createComponent() {		
		JComponent component = new JPanel();
		try {
			InputStream in = getClass().getResourceAsStream("store.xml");
			//store = new MStore(Env.getCtx(), 0, null);
			//store.setAD_Client_ID(Env.getAD_Client_ID(Env.getCtx()));
			//store.set_ValueOfColumn(Constants.COLUMNNAME_AD_Client_ID, Env.getAD_Client_ID(Env.getCtx()));
			in = getClass().getResourceAsStream("store.xml");			
			//store
			List<String> urls = new StoreXMLParser().parseFormat(in);			
			component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
			component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "superuser_text")));
			component.add(Box.createVerticalStrut(40));
			textPane = new JTextPane();
			StyledDocument doc = textPane.getStyledDocument();
			addStylesToDocument(doc);
			for (String url:urls) {
				try {
					doc.insertString(doc.getLength(), url, doc.getStyle("regular"));
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			}
			//store.setRepository(textPane.getText());
			//store.save();
			JScrollPane scroll = new JScrollPane(textPane);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setPreferredSize(new Dimension(250, 155));
			scroll.setMinimumSize(new Dimension(10, 100));
			component.add(scroll);
			Method method = null;
			try {
				method = textPane.getClass().getMethod("getText", null);
			} catch (NoSuchMethodException nsme) {}		
			data.registerDataLookup(X_AD_Plugin.COLUMNNAME_Source,new DefaultDataLookup(textPane, method, null));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return component;
	}
	@Override
	public void changedUpdate(DocumentEvent e) {
		store.setRepository(textPane.getText());
		store.save();		
	}
	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub

	}

	public Step[] getPendingSteps()  {
		//String keystore = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
		String keystore = (String) data.getData("KeyStorePath");
		File file = new File(keystore);
		SSLContext sslContext = null;
		//
		try {
			System.out.println("Loading KeyStore " + file + "...");
			InputStream in = new FileInputStream(file);
			KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());        
			//passphrase = "changeit".toCharArray();
			char[] passphrase  = (char[]) data.getData("StorePassword");
			ks.load(in, passphrase);
			in.close();
			//SSLContext context = SSLContext.getInstance("TLS");
			//SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
			sslContext = SSLContext.getInstance("TLSv1.2");
			//sslContext.init(null, null,null);
			TrustManagerFactory tmf =
					TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(ks);
			X509TrustManager defaultTrustManager = (X509TrustManager) tmf.getTrustManagers()[0];
			sslContext.init(null, new TrustManager[]{defaultTrustManager}, null);
			//
			//String keystore = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
			//File file = new File(keystore);
			//String source = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);
			//char[] passw = (char[]) data.getData("StorePassword");
			SSLContext sslContextweb = SSLContextFactory.getInstance().makeContext(file, passphrase);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Step> steps = new ArrayList<Step>();
		if (sslContext != null) {
			String source = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);
			char[] passw = (char[]) data.getData("StorePassword");
			//SSLContext sslContext = SSLContextFactory.getInstance().makeContext(file, passw);		
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
					steps.add(new PickCertificateProviderStep(data));
					break;
				}
			}		
			steps.add(new PluginStep(data));
		}
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}	
}
