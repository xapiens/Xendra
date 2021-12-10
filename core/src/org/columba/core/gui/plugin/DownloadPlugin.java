package org.columba.core.gui.plugin;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.columba.core.gui.util.ProgressCircle;
import org.columba.core.gui.base.RoundedBorder;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.xendra.Constants;
import org.xendra.security.SSLContextFactory;
import org.xendra.security.api.XendraKeyStore;


public class DownloadPlugin extends JDialog {
	private static DownloadPlugin download;
	private ProgressCircle progress;	
	private BufferedImage img;
	private HashMap m_Properties;
	private SSLSocketFactory sslSocketFactory;
	public DownloadPlugin() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		//setModal(true);
		setResizable(false);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
	}	   

	public static DownloadPlugin getInstance() {
		if (download == null)
			download = new DownloadPlugin();
		if (!download.isVisible()) {			
			download.setVisible(true);			
		}		
		return download;
	}	

	public static void main(String[] args) {
		DownloadPlugin.getInstance().Test();
	}

	private void Test() {
		updateTitle("Test");
		//setComponents(4);
		for (int i = 0; i < 4; i ++)
		{			
			reset();
			if (i == 2)
			{
				//percentall += m_factor * 100;
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
		JPanel panel = new JPanel();		
		Border b = BorderFactory.createCompoundBorder(new RoundedBorder(new Color(40, 157, 78)), 
				BorderFactory.createEmptyBorder(20, 20, 20, 20));
		Border b2 = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4), b);
		panel.setBorder(b2);		
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
		progress.setProgress(percent);
	}

	public File update(HashMap properties) {
		try {			
			setModal(true);
			start();
			m_Properties = properties;
			String surl = (String) m_Properties.get("downloadurl");
			String filename = (String) m_Properties.get("filename");
			String filesize = (String) m_Properties.get("filesize");
			String keystore = (String) m_Properties.get("keystore");
			String password = (String) m_Properties.get("password");
			updateTitle(filename);
			URL url = new URL(surl);			
			if (sslSocketFactory == null) {
				//String keystore = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
				File file = new File(keystore);
				//char[] passw = (char[]) data.getData("StorePassword");
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
			is = response.body().byteStream();							 
			BufferedInputStream input = new BufferedInputStream(is);					
			//String filedst = String.format("%s%s", installedfolder,plugin.getFilename());
			//updateTitle(String.format("%s/%s %s %s",current,toUpdate.size(),Msg.translate(Env.getCtx(), "Loading"),plugin.getFilename()));
			String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),filename);
			System.out.println(filedst);				
			///reset();											
			output = new FileOutputStream(new File(filedst));
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
			//String installedfolder = (String) Env.getMachine().getProperties().get(Constants.INSTALLED);
			//String fileinst = String.format("%s%s", installedfolder,filename);
			//File insfile = new File(fileinst);
			//if (insfile.exists())
			//	insfile.delete();
			//Files.move(tmpfile, new File(fileinst));			
			return tmpfile;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		setModal(false);
		return null;									
	}	

	@Override public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		if (img != null)
			g2.drawImage(img,0 + 6,this.getHeight() - img.getHeight() - 6, null);
	}


}
