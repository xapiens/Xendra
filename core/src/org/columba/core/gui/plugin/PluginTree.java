package org.columba.core.gui.plugin;

import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.columba.api.plugin.ExtensionMetadata;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.PluginMetadata;
import org.columba.core.gui.plugin.wizard.NewCertificateLauncher;
import org.columba.core.gui.plugin.wizard.NewKeyStoreLauncher;
import org.columba.core.gui.plugin.wizard.NewRepositoryLauncher;
import org.columba.core.plugin.Extension;
import org.columba.core.plugin.PluginManager;
import org.columba.core.xml.XmlIO;
import org.compiere.Xendra;
import org.compiere.apps.ADialog;
import org.compiere.db.CConnection;
import org.compiere.model.MRole;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Extension;
import org.compiere.model.persistence.X_AD_ExtensionList;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.frapuccino.treetable.Tree;
import org.frapuccino.treetable.TreeTable;
import org.jdom.Document;
import org.jdom.Element;
import org.kse.crypto.Password;
import org.kse.gui.password.DGetPassword;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;

/**
 * TreeTable component responsible for displaying plugins in a categorized way.
 * 
 * Additionally shows plugin version information, the plugin description as
 * tooltip.
 * 
 * The third column is a checkbox to enable/disable the plugin.
 * 
 * @author fdietz
 */
public class PluginTree extends TreeTable {

	List<PluginMetadata> plugins = new ArrayList<PluginMetadata>();

	//final static String[] columns = { "Description", "Version", "Update", "Enabled", "Installed" };
	//final static String[] columns = { "Description", "Actual", "Update", "Enabled", "Installed" };
	final static String[] columns = { "Description", "Update", "Enabled", "Installed" };
	protected static ResourceBundle res = ResourceBundle.getBundle("org/kse/gui/actions/resources");
	protected Map categories;
	protected PluginTreeTableModel model;
	private PluginNode root;
	private String m_webservername = "";
	private int m_webserverport = 0;
	private static CLogger 		log = CLogger.getCLogger(PluginTree.class);

	/**
	 * 
	 */
	public PluginTree() {
		super();
		categories = new HashMap();

		model = new PluginTreeTableModel(columns);
		model.setTree((Tree) getTree());
		setModel(model);

		getTree().setCellRenderer(new DescriptionTreeRenderer());

		//		// make "version" column fixed size
		//		TableColumn tc = getColumn(columns[1]);
		//		tc.setCellRenderer(new VersionRenderer());
		//		tc.setMaxWidth(80);
		//		tc.setMinWidth(80);

		// make "version" column fixed size
		//tc = getColumn(columns[2]);
		TableColumn tc = getColumn(columns[1]);
		tc.setCellRenderer(new UpdateRenderer());
		tc.setMaxWidth(80);
		tc.setMinWidth(80);

		// make "enabled" column fixed size
		tc = getColumn(columns[2]);
		tc.setCellRenderer(new EnabledRenderer());
		tc.setCellEditor(new EnabledEditor());

		tc.setMaxWidth(80);
		tc.setMinWidth(80);

		// make "installed" column fixed size
		//tc = getColumn(columns[4]);
		tc = getColumn(columns[3]);
		tc.setCellRenderer(new InstalledRenderer());
		tc.setCellEditor(new InstalledEditor());

		tc.setMaxWidth(80);
		tc.setMinWidth(80);						
	}

	public void addPlugin(PluginMetadata metadata) {
		// plugin wasn't correctly loaded
		if (metadata == null) {
			return;
		}

		String category = metadata.getCategory();

		if (category == null) {
			// this plugin doesn't define a category to which it belongs
			category = "Uncategorized";
		}

		PluginNode childNode = new PluginNode();
		childNode.setCategory(false);
		//childNode.setUpdateable(false);
		childNode.setId(metadata.getId());
		childNode.setTooltip(metadata.getDescription());
		childNode.setProperties(metadata.getProperties());
		//childNode.setVersion(metadata.getVersion());
		HashMap properties = metadata.getProperties();
		if (properties != null) {
			Timestamp sync = (Timestamp) metadata.getSynchronized();
			if (sync == null) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(new Date(0));
				cal.set(Calendar.MILLISECOND, 0);
				sync = new Timestamp(cal.getTimeInMillis());
			}
		}
		childNode.setActual(metadata.getActual());
		childNode.setUpdate(metadata.getUpdate());
		childNode.setEnabled(metadata.isEnabled());		
		childNode.setInstalled(metadata.isInstalled());

		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ?", null)
		.setParameters(metadata.getId()).first();
		if (plugin != null) {
			childNode.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
			List<X_AD_Process> processes = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Plugin_ID = ?", null)
			.setParameters(plugin.getAD_Plugin_ID()).list();
			for (X_AD_Process process:processes) {
				PluginProcess pn = new PluginProcess();
				pn.setName(process.getName());
				pn.setDescription(process.getDescription());
				childNode.add(pn);
			}
			X_AD_ExtensionList extensionlist = new Query(Env.getCtx(), X_AD_ExtensionList.Table_Name, "id = ?", null)
			.setParameters(IExtensionHandlerKeys.ORG_COLUMBA_CORE_CONFIG).first();
			if (extensionlist != null) {
				X_AD_Extension extension = new Query(Env.getCtx(), X_AD_Extension.Table_Name, "AD_Plugin_ID = ? AND AD_ExtensionList_ID = ?", null)
				.setParameters(plugin.getAD_Plugin_ID(), extensionlist.getAD_ExtensionList_ID()).first();
				if (extension != null) {
					try {
						childNode.setConfigID(extension.getID());
					} catch (Exception e) {
						e.printStackTrace();
					}					
				}
			}
		}
		PluginNode node = (PluginNode) categories.get(category);

		if (node == null) {
			node = new PluginNode();
			node.setAllowsChildren(true);
			node.setId(category);
			node.setEnabled(true);
			node.setCategory(true);
			root.add(node);				
			categories.put(category, node);					
		}
		// add node
		node.add(childNode);

		// notify tree model
		((DefaultTreeModel) getTree().getModel()).nodeStructureChanged(node);

		// make new node visible
		getTree().expandPath(new TreePath(childNode));
	}

	public void initTree() {
		categories = new HashMap();
		root = new PluginNode();		
		root.setId("root");

		for (PluginMetadata plugin:plugins) {
			addPlugin(plugin);
		}
		model.set(root);
	}

	public void removePluginNode(PluginNode node) {
		TreeNode parent = node.getParent();

		// notify tree
		node.removeFromParent();

		// update tree model
		((DefaultTreeModel) getTree().getModel()).nodeStructureChanged(parent);

	}
	/*
	 * CallPlugins busca los plugins instalados y registrados en AD_Plugin
	 * aca se debera reescribir aquello que diferencie la version instalada de la version disponible en la web	 
	 * 
	 * */
	private void CallPlugins() {
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

	private void ConnectToServer() {
		try {					
			MRole role = MRole.getDefault();
			if (!role.isAllow_Store()) {
				ADialog.error(0, null, "No es superusuario, no podra instalar plugins en el servidor");
				return;
			}
			if (PingToServer()) {
				X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
				if (webserver == null) {
					ADialog.error(0, null, "No se encontro un servidor web");
					return;			
				}				
				HashMap props = Env.getServerProperties(webserver.getA_Machine_ID(), REF_ServerType.WebServer); 
				int port = 0;
				if (props.containsKey("port")) {
					port = Integer.valueOf(props.get("port").toString());
				}						
				plugins.clear();
				Document doc = new XendrianServer().setServlet("store").setType("list").getDocument();
				if (doc != null) {
					String error = doc.getRootElement().getChild("error").getText();
					if (error == null) {
						error = "";
					}
					if (error.length() > 0) {
						if (error.equals("nokeystore")) {
							NewKeyStoreLauncher nn = new NewKeyStoreLauncher();
							nn.launchWizard();
						} else if (error.equals("norepository")) {
							NewRepositoryLauncher nn = new NewRepositoryLauncher();							
							nn.launchWizard();							
						} else if (error.equals("nocertificates")) {
							NewCertificateLauncher nn = new NewCertificateLauncher();
							nn.launchWizard();
						}
					} else {
						List childs = doc.getRootElement().getChildren();
						for (Iterator it = childs.iterator(); it.hasNext();) {						
							Element child = (Element) it.next();
							if (child.getName().equals("error")) {
								continue;
							}
							String id = child.getAttributeValue(Constants.XML_ATTRIBUTE_ID);
							String name = child.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
							System.out.println(String.format("plugin name %s",name));
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
							pm.setProperties(Properties);
							Timestamp update = Timestamp.valueOf(synchro);
							pm.setUpdate(update);
							plugins.add(pm);			
						}
					}
				}
				CallPlugins();
			} else {
				X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
				ADialog.info(Env.getWindowNo(this), this, String.format("%s no active", webserver.getName()));
			}
		} catch (Exception e) {					
			ADialog.info(Env.getWindowNo(this), this, e.getMessage());
		}		
	}

	private Password showPasswordDialog() {
		DGetPassword dGetPassword = new DGetPassword(null, MessageFormat.format(res.getString("OpenAction.UnlockKeyStore.Title"), "Password"));
		dGetPassword.setLocationRelativeTo(null);
		dGetPassword.setVisible(true);
		return dGetPassword.getPassword();
	}

	private X509TrustManager trustManagerForCertificates(InputStream in) 
			throws GeneralSecurityException {
		CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
		Collection<? extends Certificate> certificates = certificateFactory.generateCertificates(in);
		if (certificates.isEmpty()) {
			throw new 	IllegalArgumentException("expected non-empty set of trusted certificates");			
		}
		// Put the certificates a key store
		char[] password = "".toCharArray(); //
		KeyStore keyStore = newEmptyKeyStore(password);
		int index = 0;
		for (Certificate certificate : certificates) {
			String certificateAlias = Integer.toString(index++);
			keyStore.setCertificateEntry(certificateAlias, certificate);
		}
		TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustManagerFactory.init(keyStore);
		TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
		if (trustManagers.length != 1  || !(trustManagers[0] instanceof X509TrustManager)) {
			throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
		}
		return (X509TrustManager) trustManagers[0];
	}

	private KeyStore newEmptyKeyStore(char[] password) throws GeneralSecurityException {
		try {
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
			InputStream in = null;  // by convention, 'null' creates an empty key store.
			keyStore.load(in, password);
			return keyStore;
		} catch (IOException e) {			
			throw new AssertionError(e);
		}		
	}	

	private boolean PingToServer() {
		Boolean ok = false;
		X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
		if (webserver == null) {
			ADialog.error(0, null, "No se encontro un servidor web donde subir los plugins");
			return false;			
		}		
		HashMap props = Env.getServerProperties(webserver.getA_Machine_ID(), REF_ServerType.WebServer); 
		int port = 0;
		if (props.containsKey("port")) {
			port = Integer.valueOf(props.get("port").toString());
		}		
		String result = new XendrianServer().setServlet("plugin").setType("alive").start();
		try {
			XmlIO io = new XmlIO();
			io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));
			String dbname = io.getRoot().getElement("info").getElement("databasename").getData();
			String dbhost = io.getRoot().getElement("info").getElement("databasehost").getData();
			String version = io.getRoot().getElement("info").getElement("version").getData();
			if (version.equals(Xendra.DATE_VERSION))
			{
				CConnection m_cc = CConnection.get();
				if ( m_cc.getDbHost().equals(dbhost) && m_cc.getDbName().equals(dbname))
				{
					ok = true;
					m_webservername = webserver.getName();
					m_webserverport = port;
				}
			}
		} catch (Exception e1) {e1.printStackTrace();}			
		return ok;
	}

	public String getWebServerName() {
		return m_webservername;
	}

	public int getWebServerPort() {
		return m_webserverport;
	}

	public void update() {
		ConnectToServer();
		initTree();
	}

	class DescriptionTreeRenderer extends DefaultTreeCellRenderer {
		/* (non-Javadoc)
		 * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
		 */
		public Component getTreeCellRendererComponent(JTree tree, Object value,
				boolean selected, boolean expanded, boolean leaf, int row,
				boolean hasFocus) {
			super.getTreeCellRendererComponent(tree, value, selected, expanded,
					leaf, row, hasFocus);


			if (value instanceof PluginNode) {
				PluginNode node = (PluginNode) value;
				String id = node.getId();            
				String name = null;     
				PluginMetadata metadata = null;
				Iterator it = plugins.iterator();
				while (it.hasNext()) {
					PluginMetadata md = (PluginMetadata) it.next();
					if (md.getId().equals(id)) {
						metadata = md;
					}
				}
				//PluginMetadata metadata = PluginManager.getInstance().getPluginMetadata(id);            
				if ( metadata != null)
					name = metadata.getName();
				else
					name = id;            
				setText(name);
				String tooltip = node.getTooltip();
				setToolTipText(tooltip);
			} else if (value instanceof PluginProcess) {
				PluginProcess node = (PluginProcess) value;
				String name = node.getName();
				setText(name);
				String tooltip = node.getDescription();
				setToolTipText(tooltip);
			}        

			return this;
		}

		public void paint(Graphics g) {
			Rectangle bounds = g.getClipBounds();
			Font font = getFont();
			FontMetrics fontMetrics = g.getFontMetrics(font);



			int iconOffset = 0;

			//int iconOffset = getHorizontalAlignment() + getIcon().getIconWidth() + 1;
			if ((bounds.x == 0) && (bounds.y == 0)) {
				bounds.width -= iconOffset;

				String labelStr = layout(this, fontMetrics, getText(), bounds);
				setText(labelStr);
			}

			super.paint(g);
		}

		private String layout(JLabel label, FontMetrics fontMetrics, String text,
				Rectangle viewR) {
			Rectangle iconR = new Rectangle();
			Rectangle textR = new Rectangle();

			return SwingUtilities.layoutCompoundLabel(fontMetrics, text, null,
					SwingConstants.RIGHT, SwingConstants.RIGHT, SwingConstants.RIGHT,
					SwingConstants.RIGHT, viewR, iconR, textR, 0);
		}
	}

}