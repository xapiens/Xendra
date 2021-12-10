package org.xendra.newclient.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.tree.TreePath;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.columba.core.gui.util.ProgressCircle;
import org.compiere.apps.SwingWorker;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Ini;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.core.resourceloader.ResourceLoader;
import org.xendra.model.AbstractFolder;
import org.xendra.security.SSLContextFactory;
import org.xendra.security.api.XendraKeyStore;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;
import net.miginfocom.swing.MigLayout;
import javax.swing.Timer;

public class DownloadStep extends AbstractStep implements StepModelCustomizer, ActionListener {
	private DataModel data;	
	private String m_directory;
	private JLabel downloadname = new JLabel();
	private HashMap<String, ProgressCircle> progress = new HashMap<String, ProgressCircle>();
	private Timer start;
	private Timer check;
	private int downloads;
	private JComponent panel;

	public DownloadStep(DataModel data) {
		super(ResourceLoader.getString("certificate", "keystore"),
				ResourceLoader.getString("certificate",   "keystore_description"));
		this.data = data;		
		this.setCanGoNext(false);		
	}
	
	public void prepareRendering() {

	}

	public void update(String name, int percent)
	{
		progress.get(name).setProgress(percent);
	}

	@Override
	protected JComponent createComponent() {
		start = new Timer(1000, this);		
		start.start();
		check = new Timer(1000, this);
		panel = new JPanel(new MigLayout());
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource().equals(start)) {
			start.stop();			
			TreePath[] paths = (TreePath[]) data.getData(X_AD_Rule.COLUMNNAME_Lockout);
			for (TreePath path:paths) {
				AbstractFolder node = (AbstractFolder) path.getLastPathComponent();			
				String m_type = node.getNode().getName();
				if (m_type.equals("plugin")) {
					Element e = node.getNode();
					String source = e.getAttributeValue("source");
					String downloadurl = e.getAttributeValue("downloadurl");
					String filename = e.getAttributeValue("filename");
					String filesize = e.getAttributeValue("filesize");
					String surl = String.format("%s%s",source, downloadurl);
					String keystore = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
					//File file = new File(keystore);
					char[] passw = (char[]) data.getData("StorePassword");					
					HashMap map = new HashMap();
					map.put("source", source);
					map.put("downloadurl", surl);
					map.put("filename", filename);
					map.put("filesize", filesize);
					map.put("keystore", keystore);
					map.put("password", String.valueOf(passw));
					downloadplugin(map);
					downloads++;
				}
			}			
			check.start();
		} else if (evt.getSource().equals(check)) {
			panel.invalidate();
		}
	}

	private void downloadplugin(HashMap properties) {
		SwingWorker nw = new SwingWorker() {						
			public Object construct() {
				try {
					HashMap m_Properties = getProperties();
					String surl = (String) m_Properties.get("downloadurl");
					String filename = (String) m_Properties.get("filename");
					String filesize = (String) m_Properties.get("filesize");
					//String keystore = (String) m_Properties.get("keystore");
					//String password = (String) m_Properties.get("password");
					String keystore = (String) data.getData("KeyStorePath");
					char[] passw  = (char[]) data.getData("StorePassword");
					URL url = new URL(surl);
					File file = new File(keystore);
					//char[] passw = password.toCharArray();
					SSLContext sslContext = SSLContextFactory.getInstance().makeContext(file, passw);
					SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
					OkHttpClient client = new OkHttpClient.Builder()
					.sslSocketFactory(sslSocketFactory)
					.build();
					Request request = new Request.Builder()
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
					.url(url).build();				
					InputStream is = null;
					OutputStream output = null;						
					Response response = client.newCall(request).execute();
					is = response.body().byteStream();							 
					BufferedInputStream input = new BufferedInputStream(is);				
					//m_directory = Ini.getXendraFolder(Constants.DOWNLOAD, true);
					HashMap directories = (HashMap) data.getData("directories");
					JLabel download = (JLabel) directories.get(Constants.DOWNLOAD);
					m_directory = download.getText();
					if (!m_directory.endsWith(File.separator)) {
						m_directory += File.separator;
					}
					//String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),filename);
					String filedst = String.format("%s%s", m_directory, filename);
					System.out.println(filedst);				
					output = new FileOutputStream(new File(filedst));
					int read = 0;
					//boolean ralenti = true;
					byte[] bytes = new byte[1024];							 					        
					float totalsize = Float.valueOf(filesize);
					ProgressCircle pc = new ProgressCircle(100, 100);
					pc.setTitle(filename);
					progress.put(filename, pc);
					//panel.add(pc);
					panel.add(progress.get(filename));
					panel.invalidate();
					float currentsize = 0;
					int percent = 0;
					while ((read = input.read(bytes)) != -1) {								 
						output.write(bytes, 0, read);
						currentsize += read;
						percent = (int) (( currentsize / totalsize ) * 100);
						if (progress.get(filename).getProgress() != percent)
							update(filename, percent);
					}									
					if (is != null) 
						is.close();
					if (output != null) 
						output.close();
					File tmpfile = new File(filedst);		
					panel.remove(progress.get(filename));
					progress.remove(filename);
					downloads--;
					if (downloads == 0) {
						setCanGoNext(true);
					}
					panel.invalidate();					
				} catch (Exception e) {
					e.printStackTrace();
				}
				return Boolean.TRUE;
			}
		};
		nw.setProperties(properties);
		nw.start();					
	}
	
	public Step[] getPendingSteps() {
		List<Step> steps = new ArrayList<Step>();
		TreePath[] paths = (TreePath[]) data.getData(X_AD_Rule.COLUMNNAME_Lockout);
		if (paths.length > 0) {
			for (TreePath path:paths) {
				AbstractFolder node = (AbstractFolder) path.getLastPathComponent();			
				String m_type = node.getNode().getName();
				if (m_type.equals("plugin")) {
					Element e = node.getNode();
					String filename = e.getAttributeValue("filename");
					if (filename.equals("xendrian.zip")) {
						steps.add(new NewServerStep(data));			
					}
				}
			}
		} 		
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}	
}
