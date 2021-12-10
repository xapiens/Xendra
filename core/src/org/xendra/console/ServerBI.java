package org.xendra.console;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.compiere.model.MStore;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_PA_Query;
import org.compiere.util.Env;
import org.compiere.util.SecureEngine;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.security.SSLContextFactory;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.ProgressBar;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class ServerBI {
	private static ServerBI instance;
	//List<BIQuery> querys = new ArrayList<BIQuery>();
	HashMap<String, BIQuery> querys = new HashMap<String, BIQuery>();
	HashMap<Integer, String> querysid = new HashMap<Integer, String>();
	private SSLSocketFactory sslSocketFactory;
	private final Table<String> table = new Table<String>("id","name","description","installed");
	
	public void loadQuerys(final Screen screen) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		try {
			final BasicWindow window = new BasicWindow();
			window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
			Panel panel = new Panel();
			window.setComponent(panel.withBorder(Borders.singleLine("querys")));
			String alive = common.PingToServer(); 
			if (alive.length() > 0) {
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Conexion")
				.setText(alive)
				.addButton(MessageDialogButton.OK)				
				.build()
				.showDialog(gui);				
			} else {
				
				table.getTableModel().clear();
				MStore store = MStore.getInstance();
				String repository = store.getRepository();			
				StringTokenizer stringTokenizer = new StringTokenizer(repository, "\n");
				List<String> urls = new ArrayList<String>();
				while (stringTokenizer.hasMoreTokens()) {
					urls.add(stringTokenizer.nextToken().trim());					
				}						
				for (String url:urls) {
					url = String.format("%squery.xml", url);
					String x = common.navigate(url);
					SAXBuilder builder = new SAXBuilder();
					InputStream stream = new ByteArrayInputStream(x.getBytes("UTF-8"));
					Document doc = builder.build(stream);
					List childs = doc.getRootElement().getChildren();
					for (Iterator it = childs.iterator(); it.hasNext();) {
						Element child = (Element) it.next();
						String name = child.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
						String description = child.getAttributeValue(Constants.XML_ATTRIBUTE_DESCRIPTION);
						String downloadurl = child.getAttributeValue("downloadurl");
						String identifier = child.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
						String syncho = child.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
						Timestamp tsynchro = Timestamp.valueOf(syncho);
						BIQuery q = new BIQuery();
						q.setName(name);
						q.setDescription(description);
						q.setDownloadurl(downloadurl);
						q.setSynchronized(tsynchro);
						querys.put(identifier, q);
					}
					callquerys();
					Iterator it = querys.keySet().iterator();
					int seqno = 0;
					while (it.hasNext()) {
						String key = (String) it.next();
						BIQuery q = querys.get(key);
						seqno = seqno + 1;
						querysid.put(seqno, key);
						table.getTableModel().addRow(String.valueOf(seqno), q.getName(), q.getDescription(), common.DateTimeDiff(q.getInstalled(), q.getSynchronized()));						
					}
					table.setSelectAction(new Runnable() {
						@Override
						public void run() {
							List<String> data = table.getTableModel().getRow(table.getSelectedRow());
							int seqno = Integer.valueOf(data.get(0));
							String key = querysid.get(seqno);
							BIQuery q = querys.get(key);
							MessageDialogButton answer = new MessageDialogBuilder()
							.setTitle("Actualizacion")
							.setText(String.format("actualizar %s", q.getName()))
							.addButton(MessageDialogButton.Yes)
							.addButton(MessageDialogButton.No)
							.build()
							.showDialog(gui);
							if (answer.ordinal() == MessageDialogButton.Yes.ordinal()) {
								installquery(key, q, screen);
							}
						}
					});
					panel.addComponent(table);
					Button accept = new Button("Ok", new Runnable() {
						@Override
						public void run() {
							window.close();
						}
					});
					panel.addComponent(accept);
					window.setComponent(panel.withBorder(Borders.singleLine("querys")));		
					gui.addWindowAndWait(window);					
				}
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
	private void installquery(String key, BIQuery q, Screen screen) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		try {
			final BasicWindow window = new BasicWindow();		
			window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));			
			//Panel panel = new Panel();			
			String alive = common.PingToServer();
			if (alive.length() == 0) {
				ProgressBar pbar = new ProgressBar(0,100,100);
				pbar.setValue(0);		
				Panel panel = new Panel();
				panel.setLayoutManager(new GridLayout(1));
				panel.addComponent(pbar);
				panel.addComponent(new Label(String.format("download %s", q.getDownloadurl())));
				window.setComponent(panel.withBorder(Borders.singleLine("Installing...")));		
				gui.addWindow(window);
				try {
					gui.updateScreen();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
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
					int cacheSize = 10 * 1024 * 1024;
					File t = new File(System.getProperty("java.io.tmpdir"));
					Cache cache = new Cache(t, cacheSize);								
					OkHttpClient client = new OkHttpClient.Builder()
					.sslSocketFactory(sslSocketFactory)
					.cache(cache)
					.build();
					Request request = new Request.Builder()
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
					.url(q.getDownloadurl()).build();
					InputStream is = null;
					OutputStream output = null;						
					Response response = client.newCall(request).execute();
					String result = response.body().string();
					X_PA_Query qq = new Query(Env.getCtx(), X_PA_Query.Table_Name, "Identifier = ?", null)
						.setParameters(key).first();
					if (qq == null) {
						qq = new X_PA_Query(Env.getCtx(), 0, null);						
						qq.setIdentifier(key);
					}
					qq.setSynchronized(q.getSynchronized());
					qq.setContent(result);
					if (qq.save()) {					
						table.getTableModel().setCell(3, table.getSelectedRow(), common.DateTimeDiff(q.getSynchronized(),q.getSynchronized()));					
					}
					final String contentType = response.header("Content-Type");
					final String contentlength = response.header("Content-Length");
				} catch (Exception exx) {
					exx.printStackTrace();
				}
			}
			} catch (Exception e) {
				
			}
	}	
	private void callquerys() {
		List<X_PA_Query> dbquerys = new Query(Env.getCtx(), X_PA_Query.Table_Name, "IsActive = 'Y'", null).list();
		for (X_PA_Query dbquery:dbquerys) {
			Timestamp tsync = dbquery.getSynchronized();
			if (querys.containsKey(dbquery.getIdentifier())) {				
				BIQuery q = querys.get(dbquery.getIdentifier());
				q.setInstalled(dbquery.getSynchronized());
			}
		}
	}
	public static ServerBI getInstance() {
		if (instance == null)
			instance = new ServerBI();
		return instance;
	}
}
