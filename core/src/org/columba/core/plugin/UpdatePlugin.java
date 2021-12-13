package org.columba.core.plugin;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;
import org.columba.api.plugin.PluginMetadata;
import org.columba.core.gui.base.RoundedBorder;
import org.columba.core.gui.util.ProgressCircle;
import org.columba.core.io.ZipFileIO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;
import com.google.common.io.Files;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import okhttp3.Response;

public class UpdatePlugin extends JDialog {
	private List childs;
	private static UpdatePlugin plugin; 
	private ProgressCircle progress;
	private ProgressCircle progressAll;
	private List<PluginMetadata> pluginmetadata;
	private BufferedImage img;
	private int m_components;
	private float m_factor;
	private float percentall;
	private boolean updated = false;
	private static CLogger 	log = CLogger.getCLogger(UpdatePlugin.class);	
	public static void main(String[] args) {		
		UpdatePlugin.getInstance().Test();
	}
	public void Test() {
		updateTitle("Test");
		setComponents(4);
		for (int i = 0; i < 4; i ++)
		{			
			reset();
			if (i == 2)
			{
				percentall += m_factor * 100;
				continue;
			}
			for (int j = 0; j < 100; j ++)
			{
				update(j);
				try {
					Thread.sleep(100);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}			
	}
	private void setComponents(int i) {
		m_components = i;
		m_factor = 1 / (float) i;
	}
	public static UpdatePlugin getInstance() {
		if (plugin == null)
			plugin = new UpdatePlugin();
		return plugin;
	}	
	public UpdatePlugin() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setResizable(false);
		setAlwaysOnTop(true);
		//toFront();
		setLocationRelativeTo(null);
	}	   
	@Override 
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		if (img != null)
			g2.drawImage(img,0 + 6,this.getHeight() - img.getHeight() - 6, null);
	}	
	public void setPlugin(List<PluginMetadata> toUpdate) {
		MySwingWorker wks = new MySwingWorker();
		wks.toUpdate(toUpdate);
		wks.start();				
	}	

	private void updateTitle(String title)
	{
		if (progress == null)
		{
			start();
		}
		progress.setTitle(title);		
	}	
	private void start() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));		
		progress = new ProgressCircle(200,200);
		progressAll = new ProgressCircle(200,200);
		progressAll.setTitle("General");
		JPanel panel = new JPanel();
		Border b = BorderFactory.createCompoundBorder(new RoundedBorder(new Color(40, 157, 78)), BorderFactory.createEmptyBorder(4, 4, 4, 4));
		Border b2 = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4), b);
		panel.setBorder(b2);
		panel.add(progressAll);
		panel.add(progress);
		getContentPane().add(panel);
		progress.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		img = Env.getBufferedImage("XE32.gif");
		pack();	
		setLocationRelativeTo(null);
		setVisible(true);		
	}	
	public void reset()
	{
		progress.setProgress(0);
	}
	public void update(int percent)
	{
		percentall = percentall +  m_factor ;
		progressAll.setProgress((int) percentall);
		progress.setProgress(percent);		
	}

	void installplugin(File file) {
		File pluginDirectory = null;
		try {
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "filename = ?", null)
			.setParameters(file.getName()).first();	

			if (plugin == null)
				return;

			ZipFileIO.extract(file, Env.getMachine().getPluginsFolder());
			pluginDirectory = ZipFileIO.getFirstFile(file);
			if (pluginDirectory != null) {
				pluginDirectory = new File(Env.getMachine().getPluginsFolder(), pluginDirectory.getName());
				if (pluginDirectory.exists())
				{
					File xmlFile = new File(pluginDirectory, Constants.FILENAME_PLUGIN_XML);
					if (xmlFile != null && xmlFile.exists()) {
						BufferedInputStream buf = new BufferedInputStream(new FileInputStream(xmlFile));
						Document doc = ExtensionXMLParser.retrieveDocument(buf);
						Element pluginElement = doc.getRootElement();
						PluginMetadata pluginMetadata = new ExtensionXMLParser().parsePluginMetadata(pluginElement);
						if (plugin.getSynchronized().compareTo(pluginMetadata.getSynchronized()) != 0)
						{
							plugin.setSynchronized(pluginMetadata.getSynchronized());
							plugin.save();
						}
						BigDecimal version = new BigDecimal(pluginMetadata.getVersion());
						if (plugin.getVersion().compareTo(version) != 0) {
							plugin.setVersion(version);
							plugin.save();
						}
					}
				}
			}
			else
			{
				log.log(Level.SEVERE, String.format("%s no available to download", plugin.getName()));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}		
	}		
	class MySwingWorker extends org.compiere.apps.SwingWorker {
		private List<PluginMetadata> toUpdate;		
		public MySwingWorker() {
		}

		public void toUpdate(List<PluginMetadata> toUpdate) {	
			this.toUpdate = toUpdate;			
		}

		public Object construct() {			
			setComponents(toUpdate.size());
			int current = 0;		
			for (PluginMetadata plugin:toUpdate)
			{
				try {
					current ++;
					Document doc = new XendrianServer().setServlet("plugin").setType("pluginsize").setPluginID(plugin.getId()).getDocument();
					String filesize = doc.getRootElement().getText();
					Response response = new XendrianServer().setServlet("plugin").setType("plugin").setPluginID(plugin.getId()).getResponse();
					InputStream is = response.body().byteStream();					
					OutputStream output = null;						
					BufferedInputStream input = new BufferedInputStream(is);
					updateTitle(String.format("%s/%s %s %s",current,toUpdate.size(),Msg.translate(Env.getCtx(), "Loading"),plugin.getFilename()));
					String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),plugin.getFilename());
					System.out.println(filedst);				
					reset();	
					File tmp = new File(filedst);
					output = new FileOutputStream(tmp);
					int read = 0;
					boolean ralenti = true;
					byte[] bytes = new byte[1024];	
					float totalsize = Float.valueOf(filesize);
					if (totalsize > 1000000)
					{
						ralenti = false;
					}
					float currentsize = 0;
					int percent = 0;
					while ((read = input.read(bytes)) != -1) {								 
						output.write(bytes, 0, read);
						currentsize += read;
						percent = (int) (( currentsize / totalsize ) * 100);
						if (progress.getProgress() != percent)
							update(percent);
					}									
					if (is != null) 
						is.close();
					if (output != null) 
						output.close();
					response.close();
					File tmpfile = new File(filedst);				
					String fileinst = String.format("%s%s%s", Env.getMachine().getInstalledFolder().getAbsolutePath(),File.separator, plugin.getFilename());
					File insfile = new File(fileinst);
					if (insfile.exists())
						insfile.delete();
					try {
						Files.move(tmpfile, new File(fileinst));
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					installplugin(insfile);
					updated = true;
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				finally {
				}
			}
			if (updated) {
				System.exit(2);
			}			
			return Boolean.TRUE;
		}
	}	
}
