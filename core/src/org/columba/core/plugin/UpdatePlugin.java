package org.columba.core.plugin;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;

import org.columba.api.plugin.PluginMetadata;
import org.columba.core.gui.base.RoundedBorder;
import org.columba.core.gui.util.ProgressCircle;
import org.columba.core.io.ZipFileIO;
import org.columba.core.xml.XmlElement;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;

import com.google.common.io.Files;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class UpdatePlugin extends JDialog {
	private List childs;
	private static UpdatePlugin plugin; 
	private ProgressCircle progress;
	private ProgressCircle progressAll;
	private List<PluginMetadata> pluginmetadata;
	private XendrianPlugin xendrianplugin;
	private BufferedImage img;
	private int m_components;
	private float m_factor;
	private float percentall;
	
	public static void main(String[] args) {
		UpdatePlugin.getInstance().Test();
	}
	private void Test() {
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
		setLocationRelativeTo(null);
	}	   
    @Override public void paint(Graphics g) {
    	super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        if (img != null)
        	g2.drawImage(img,0 + 6,this.getHeight() - img.getHeight() - 6, null);
    }	
	public boolean setPlugin(List<PluginMetadata> toUpdate) {
		boolean updated = false;
		setComponents(toUpdate.size());
		OkHttpClient client = new OkHttpClient();
		int current = 0;
		int port = Env.getServerWebPort();
		for (PluginMetadata plugin:toUpdate)
		{
			try {
				current ++;
				String installedfolder = (String) Env.getMachine().getProperties().get(Constants.INSTALLED);
				String url = String.format("http://%s:%s/plugin?type=plugin&id=%s",Env.getServerWeb().getName(), port, plugin.getId());
				Request request = new Request.Builder().url(url).build();				
				InputStream is = null;
				OutputStream output = null;						
				Response response = client.newCall(request).execute();
				is = response.body().byteStream();							 
				BufferedInputStream input = new BufferedInputStream(is);
				
				//String filedst = String.format("%s%s", installedfolder,plugin.getFilename());
				String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),plugin.getFilename());
				System.out.println(filedst);
				updateTitle(String.format("%s/%s %s %s",current,toUpdate.size(),Msg.translate(Env.getCtx(), "Loading"),plugin.getFilename()));
				reset();											
				output = new FileOutputStream(new File(filedst));
				int read = 0;
				boolean ralenti = true;
				byte[] bytes = new byte[1024];							 					        
				float totalsize = Float.valueOf(plugin.getFilesize());
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
						//progress.setProgress(percent);
						update(percent);
					if (ralenti)
						Thread.sleep(10);
				}									
				if (is != null) 
					is.close();
				if (output != null) 
					output.close();
				File tmpfile = new File(filedst);				
				String fileinst = String.format("%s%s", installedfolder,plugin.getFilename());
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
//				if (tmpfile.renameTo(new File(fileinst)))
//				{
//					System.out.println("renombrando");					
//				}
//				else
//				{
//					System.out.println(String.format("algo fallo %s", fileinst));
//				}
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
		return updated;
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
		progress = new ProgressCircle(300,200);
		progressAll = new ProgressCircle(300,200);
		progressAll.setTitle("General");
		JPanel panel = new JPanel();
		Border b = BorderFactory.createCompoundBorder(new RoundedBorder(new Color(40, 157, 78)), BorderFactory.createEmptyBorder(4, 4, 4, 4));
		Border b2 = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4), b);
		panel.setBorder(b2);
		panel.add(progressAll);
		panel.add(progress);
		//getContentPane().add(progress);
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
		String pluginfolder = (String) Env.getMachine().getProperties().get(Constants.PLUGINS);
		File dirplugins = new File(pluginfolder);
		File pluginDirectory = null;
		try {
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "filename = ?", null)
			.setParameters(file.getName()).first();	
			
			if (plugin == null)
				return;
			
			ZipFileIO.extract(file, dirplugins);
			pluginDirectory = ZipFileIO.getFirstFile(file);
			if (pluginDirectory != null) {
				pluginDirectory = new File(dirplugins, pluginDirectory.getName());
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
					}
				}
			}	
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}		
	}		
}