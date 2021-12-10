package org.xendra.newclient.wizard;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.columba.api.plugin.PluginMetadata;
import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Rule;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.newclient.i18n.ResourceLoader;
import org.xendra.model.AbstractFolder;
import org.xendra.swing.JCheckBoxTree;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;
import net.miginfocom.swing.MigLayout;

public class PluginStep extends AbstractStep implements StepModelCustomizer {
	private DataModel data;
	protected JCheckBoxTree tree;
	protected Map categories = new HashMap();
	protected Map sources = new HashMap();
	private AbstractFolder root;
	private List<PluginMetadata> plugins = new ArrayList<PluginMetadata>();
	public PluginStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "exportsessionwizard", "pick"),
				ResourceLoader.getString("dialog", "exportsessionwizard",   "pick_description"));		
		this.data = data;
		this.setCanGoNext(true);
	}

	public void prepareRendering() {
		if (tree == null) {
			tree = new JCheckBoxTree();
			plugins.clear();		
			//			
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
				TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
				tmf.init(ks);
				X509TrustManager defaultTrustManager = (X509TrustManager) tmf.getTrustManagers()[0];
				sslContext.init(null, new TrustManager[]{defaultTrustManager}, null);
			} catch (Exception e) {
				
			}			
			SSLSocketFactory sslSocketFactory;				
			sslSocketFactory = sslContext.getSocketFactory();
			String source = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);
			//
			StringTokenizer stringTokenizer = new StringTokenizer( source, "\n" );			
			while( stringTokenizer.hasMoreTokens() ) {
				String url = stringTokenizer.nextToken().trim();          
				OkHttpClient client = new OkHttpClient.Builder()						
				.sslSocketFactory(sslSocketFactory)
				.build();
				Request request = new Request.Builder()
				.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
				.url(url).build();    
//				try (Response response = client.newCall(request).execute())  {
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
				try (Response response = client.newCall(request).execute())  {
					if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

					Headers responseHeaders = response.headers();
					for (int i = 0; i < responseHeaders.size(); i ++) {
						System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
					}
					String result = response.body().string();
					SAXBuilder builder = new SAXBuilder();
					InputStream stream = new ByteArrayInputStream(result.getBytes("UTF-8"));
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
						// properties
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
						pm.setSource(url);
						plugins.add(pm);									
					}
					root = new AbstractFolder("Repositories");
					for (PluginMetadata plugin:plugins) {
						addPlugin(plugin);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			DefaultTreeModel model = new DefaultTreeModel(root);
			tree.setModel(model);
			((DefaultTreeModel)tree.getModel()).reload();
		}
	}

	public void addPlugin(PluginMetadata metadata) {
		// plugin wasn't correctly loaded
		if (metadata == null) {
			return;
		}

		String source = metadata.getSource();
		if (source == null) {
			return;
		}		

		String category = metadata.getCategory();

		if (category == null) {
			// this plugin doesn't define a category to which it belongs
			category = "Uncategorized";
		}

		Element p = new Element("plugin");		
		p.setAttribute("id", metadata.getId());
		p.setAttribute("tooltip", metadata.getDescription());
		p.setAttribute("version", metadata.getVersion());
		p.setAttribute("source", source);
		HashMap props = metadata.getProperties();
		Iterator it = props.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) props.get(key);
			p.setAttribute(key, value);
		}
		AbstractFolder childNode = new AbstractFolder(p);
		childNode.setName(metadata.getName());

		AbstractFolder nodesource = (AbstractFolder) sources.get(source);
		if (nodesource == null) {
			Element e = new Element("source");
			nodesource = new AbstractFolder(e);
			nodesource.setName(source);
			nodesource.setAllowsChildren(true);
			root.add(nodesource);
			sources.put(source, nodesource);
		}
		
		AbstractFolder node = (AbstractFolder) categories.get(category);

		if (node == null) {
			Element e = new Element("category");			
			node = new AbstractFolder(e);
			node.setName(category);
			node.setAllowsChildren(true);
			nodesource.add(node);
			categories.put(category, node);					
		}
		// add node
		node.add(childNode);
	}

	@Override
	protected JComponent createComponent() {
		//
		String source = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);
		//
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "exportsessionwizard", "pick_text")));
		component.add(Box.createVerticalStrut(40));		
		JPanel mainPanel = new JPanel(new MigLayout("fill"));
		DefaultTreeModel model = new DefaultTreeModel(root);
		tree = new JCheckBoxTree();
		tree.setModel(model);
		((DefaultTreeModel)tree.getModel()).reload();
		mainPanel.add(new JScrollPane(tree), "grow");
		component.add(mainPanel);
		Method method = null;
		try {
			method = tree.getClass().getMethod("getCheckedPaths", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_AD_Rule.COLUMNNAME_Lockout,new DefaultDataLookup(tree, method, null));     		
		return component;
	}
	public Step[] getPendingSteps() {
		List<Step> steps = new ArrayList<Step>();
		TreePath[] paths = (TreePath[]) data.getData(X_AD_Rule.COLUMNNAME_Lockout);
		if (paths.length > 0)
			steps.add(new DownloadStep(data));
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}
}
