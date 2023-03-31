package org.columba.core.gui.plugin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.api.plugin.PluginLoadingFailedException;
import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.InfoViewerDialog;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.help.HelpManager;
import org.columba.core.plugin.PluginManager;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.apps.ADialog;
import org.compiere.apps.AGlassPane;
import org.compiere.apps.SwingWorker;
import org.compiere.model.MClient;
import org.compiere.model.MOrg;
import org.compiere.model.MRole;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Extension;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_PInstance;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Plugin_Access;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Access;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Role;
import org.compiere.model.persistence.X_AD_ServletList;
import org.compiere.model.persistence.X_AD_TreeNodeMM;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.xendra.api.XendrianServer;

public class PluginManagerDialog extends JDialog implements ActionListener, ListSelectionListener {
	/** The GlassPane           	*/
	private AGlassPane  m_glassPane = new AGlassPane();
	private static PluginManagerDialog instance;
	protected JButton ServerButton;
	protected JButton installButton;
	protected JButton removeButton;
	protected JButton optionsButton;
	protected JButton statusButton;
	protected JButton infoButton;	
	protected JButton keyButton;
	protected JButton repositoryButton;
	protected PluginTree table;
	protected PluginPreview preview = new PluginPreview();
	protected PluginNode selectedNode;
	protected IExtensionHandler configHandler;
	private URL downloadurl;
	private static final String RESOURCE_PATH = "org.columba.core.i18n.dialog";
	private String m_SupervisorPassword;
	private int m_WindowNo;

	public PluginManagerDialog() {
		super((JFrame) null, "Plugin Manager", false);
		m_WindowNo = Env.createWindowNo(this);
		initComponents();
		pack();
		setLocationRelativeTo(null);		
	}	
	private void initComponents() {
		setGlassPane(m_glassPane);
		try {
			configHandler =  PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_CONFIG);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
		getContentPane().add(mainPanel);

		ServerButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "pluginmanager", "Connect"));
		ServerButton.setActionCommand("CONNECT");
		ServerButton.addActionListener(this);

		installButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "pluginmanager", "install"));
		installButton.setActionCommand("INSTALL");
		installButton.setEnabled(false);
		installButton.addActionListener(this);

		removeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "pluginmanager", "remove"));
		removeButton.setActionCommand("REMOVE");
		removeButton.setEnabled(false);
		removeButton.addActionListener(this);

		optionsButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "pluginmanager", "options"));
		optionsButton.setActionCommand("OPTIONS");
		optionsButton.setEnabled(false);
		optionsButton.addActionListener(this);

		infoButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "pluginmanager", "info"));
		infoButton.setActionCommand("INFO");
		infoButton.setEnabled(false);
		infoButton.addActionListener(this);

		keyButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,  "pluginmanager", "keystore"));
		keyButton.setActionCommand("KEYSTORE");
		keyButton.setEnabled(true);
		keyButton.addActionListener(this);

		repositoryButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "pluginmanager", "repository"));
		repositoryButton.setActionCommand("REPOSITORY");
		repositoryButton.setEnabled(true);
		repositoryButton.addActionListener(this);

		statusButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "pluginmanager","status"));
		statusButton.setActionCommand("STATUS");
		statusButton.setEnabled(true);
		statusButton.addActionListener(this);

		// top panel
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		// topPanel.setLayout( );
		JPanel topBorderPanel = new JPanel();
		topBorderPanel.setLayout(new BorderLayout());

		// topBorderPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5,
		// 0));
		topBorderPanel.add(topPanel);

		// mainPanel.add( topBorderPanel, BorderLayout.NORTH );
		JLabel nameLabel = new JLabel("name");
		nameLabel.setEnabled(false);
		topPanel.add(nameLabel);

		topPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		topPanel.add(Box.createHorizontalGlue());

		Component glue = Box.createVerticalGlue();
		c.anchor = GridBagConstraints.EAST;
		c.gridwidth = GridBagConstraints.REMAINDER;

		// c.fill = GridBagConstraints.HORIZONTAL;
		gridBagLayout.setConstraints(glue, c);

		gridBagLayout = new GridBagLayout();
		c = new GridBagConstraints();

		JPanel eastPanel = new JPanel(gridBagLayout);
		mainPanel.add(eastPanel, BorderLayout.EAST);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1.0;
		c.gridwidth = GridBagConstraints.REMAINDER;

		gridBagLayout.setConstraints(ServerButton, c);
		eastPanel.add(ServerButton);

		Component strut0 = Box.createRigidArea(new Dimension(30, 5));
		gridBagLayout.setConstraints(strut0, c);
		eastPanel.add(strut0);
		gridBagLayout.setConstraints(installButton, c);
		eastPanel.add(installButton);

		Component strut1 = Box.createRigidArea(new Dimension(30, 5));
		gridBagLayout.setConstraints(strut1, c);
		eastPanel.add(strut1);

		gridBagLayout.setConstraints(removeButton, c);
		eastPanel.add(removeButton);

		Component strut = Box.createRigidArea(new Dimension(30, 5));
		gridBagLayout.setConstraints(strut, c);
		eastPanel.add(strut);

		gridBagLayout.setConstraints(optionsButton, c);
		eastPanel.add(optionsButton);

		Component strut3 = Box.createRigidArea(new Dimension(30, 5));
		gridBagLayout.setConstraints(strut3, c);
		eastPanel.add(strut3);

		gridBagLayout.setConstraints(infoButton, c);
		eastPanel.add(infoButton);

		Component struc5 = Box.createRigidArea(new Dimension(30, 5));
		gridBagLayout.setConstraints(struc5,  c);
		eastPanel.add(struc5);

		gridBagLayout.setConstraints(keyButton, c);
		eastPanel.add(keyButton);

		Component struc6 = Box.createRigidArea(new Dimension(30, 5));
		gridBagLayout.setConstraints(struc6, c);
		eastPanel.add(struc6);

		gridBagLayout.setConstraints(repositoryButton, c);
		eastPanel.add(repositoryButton);

		Component struc7 = Box.createRigidArea(new Dimension(30, 5));
		gridBagLayout.setConstraints(struc7, c);
		eastPanel.add(struc7);

		gridBagLayout.setConstraints(statusButton, c);
		eastPanel.add(statusButton);		

		strut = Box.createRigidArea(new Dimension(30, 20));
		gridBagLayout.setConstraints(strut, c);
		eastPanel.add(strut);

		glue = Box.createVerticalGlue();
		c.fill = GridBagConstraints.BOTH;
		c.weighty = 1.0;
		gridBagLayout.setConstraints(glue, c);
		eastPanel.add(glue);

		// centerpanel
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));

		table = new PluginTree();
		//table.getTree().addTreeSelectionListener(this);
		preview.setTable(table);
		table.getSelectionModel().addListSelectionListener(this);
		table.getSelectionModel().addListSelectionListener(preview);
		JScrollPane scrollPane = new JScrollPane(table);		
		scrollPane.setPreferredSize(new Dimension(550, 300));
		scrollPane.getViewport().setBackground(Color.white);
		centerPanel.add(scrollPane, BorderLayout.NORTH);		
		centerPanel.add(preview, BorderLayout.CENTER);

		mainPanel.add(centerPanel);

		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));

		JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 6, 0));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		JButton closeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("global", "global", "close"));
		closeButton.setActionCommand("CLOSE");
		closeButton.addActionListener(this);
		buttonPanel.add(closeButton);

		ButtonWithMnemonic helpButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("global", "global", "help"));
		buttonPanel.add(helpButton);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		getRootPane().setDefaultButton(closeButton);
		getRootPane().registerKeyboardAction(this, "CLOSE",
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);

		// associate with JavaHelp
		HelpManager.getInstance().enableHelpOnButton(helpButton, "extending_columba_1");
		HelpManager.getInstance().enableHelpKey(getRootPane(),
				"extending_columba_1");		
	}

	private void update() {
		SwingWorker nw = new SwingWorker() {					
			public Object construct() {
				setBusy(true);
				table.update();				
				setBusy(false);
				return Boolean.TRUE;
			}					
		};				
		nw.start();		
	}


	@Override
	public void actionPerformed(ActionEvent e) {		
		String action = e.getActionCommand();		
		if (action.equals("CONNECT")) {			
			SwingWorker nw = new SwingWorker() {			
				public Object construct() {
					setBusy(true);
					table.update();
					setBusy(false);
					return Boolean.TRUE;
				}					
			};							
			nw.start();			
		} else if (action.equals("CLOSE")) {
			setVisible(false);
		} else if (action.equals("INFO")) {
			String id = selectedNode.getId();
			if (selectedNode.isInstalled()) {
				try {
					StringBuilder sb = new StringBuilder();
					X_AD_Plugin p = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
					.setParameters(selectedNode.getAD_Plugin_ID()).first();
					sb.append(String.format("<b>Plugin %s</b><br>", p.getName()));
					sb.append(String.format("id %s<br>", selectedNode.getId()));
					sb.append("<table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"2\">");
					sb.append("<tr><td>").append(String.format("actual %s<br>", selectedNode.getActual())).append("</td>");
					sb.append("<td>").append(String.format("updated %s<br>", selectedNode.getUpdate())).append("</td></tr>");
					sb.append("</table>");					
					List<X_AD_Plugin_Access> pluginaccesses = new Query(Env.getCtx(), X_AD_Plugin_Access.Table_Name, "AD_Plugin_ID = ?", null).
							setParameters(p.getAD_Plugin_ID()).list();
					if (pluginaccesses.size() > 0) {
						sb.append("<br>");
						sb.append("<b>Plugin Access</b><br>");
						for (X_AD_Plugin_Access pluginaccess:pluginaccesses) {
							X_AD_Role rol = new Query(Env.getCtx(), X_AD_Role.Table_Name, "AD_Role_ID = ?", null)
							.setParameters(pluginaccess.getAD_Role_ID()).first();
							sb.append(String.format("<p>%s <br>", rol.getName()));							
						}											
					}
					List<X_AD_Process> procs = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Plugin_ID = ?", null)
					.setParameters(p.getAD_Plugin_ID()).setOrderBy("name").list();					
					for (X_AD_Process proc:procs) {
						MOrg o = new Query(Env.getCtx(), MOrg.Table_Name, "AD_Org_ID = ?", null)
						.setParameters(proc.getAD_Org_ID()).first();
						MClient c = MClient.get(Env.getCtx(), proc.getAD_Client_ID());													
						sb.append("<br>");
						sb.append("<b>Process</b><br>");
						sb.append(String.format("%s %s %s<br>", c.getName(), o.getName(), proc.getName()));
						List <X_AD_Process_Access> procaccesses = new Query(Env.getCtx(), X_AD_Process_Access.Table_Name, "AD_Process_ID = ?", null)
						.setParameters(proc.getAD_Process_ID()).list();
						if (procaccesses.size() > 0) {
							sb.append("<b>Process Access</b><br>");
							for (X_AD_Process_Access procaccess:procaccesses) {
								X_AD_Role rol = new Query(Env.getCtx(), X_AD_Role.Table_Name, "AD_Role_ID = ?", null)
								.setParameters(procaccess.getAD_Role_ID()).first();
								sb.append(String.format("<p>%s <br>", rol.getName()));
							}
						}
						X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Process_ID = ?", null)
						.setParameters(proc.getAD_Process_ID()).first();
						if (menu != null) {
							Integer level = 99;
							HashMap<Integer, X_AD_Menu> hashmenu = new HashMap<Integer, X_AD_Menu>();
							hashmenu.put(level, menu);
							level--;
							//sb.append("<b>menu</b><br>");							
							X_AD_TreeNodeMM treenode = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?", null)
							.setParameters(menu.getAD_Menu_ID()).first();
							if (treenode != null) {
								while (treenode.getParent_ID() > 0) {
									treenode = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?", null)
									.setParameters(treenode.getParent_ID()).first();
									X_AD_Menu innermenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
									.setParameters(treenode.getParent_ID()).first();
									if (innermenu != null) {
										hashmenu.put(level, innermenu);									
									}								
									if (treenode.getParent_ID() > 0) {
										level--;
									}
								}
								sb.append("<b>menu</b><br>");
								for (Integer i=level+1; i <= 99; i++) {
									X_AD_Menu m = (X_AD_Menu) hashmenu.get(i);
									sb.append(String.format(" %s<br>", m.getName()));														
								}								
							} else {
								sb.append("<b>NO menu created</b><br>");
							}
						}
						//List<X_AD_Menu> menus = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Process_ID = ?", null)
						//.setParameters(proc.getAD_Process_ID()).list();
						//						for (X_AD_Menu menu:menus) {									
						//							List<X_AD_TreeNodeMM> treenodes = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ? OR parent_id = ?", null)
						//							.setParameters(menu.getAD_Menu_ID(), menu.getAD_Menu_ID()).list();
						//							if (treenodes.size() > 0) {
						//								sb.append("menu<br>");
						//							}
						//							for (X_AD_TreeNodeMM treenode:treenodes) {
						//								if (treenode.getParent_ID() > 0) {
						//									X_AD_Menu m = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
						//									.setParameters(treenode.getParent_ID()).first();
						//									sb.append(String.format(" %s", m.getName()));
						//								}
						//								if (treenode.getNode_ID() > 0) {
						//									X_AD_Menu m = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
						//									.setParameters(treenode.getNode_ID()).first();
						//									sb.append(String.format(" %s", m.getName()));											
						//								}
						//								sb.append("<br>");
						//							}
						//						}						
					}
					new InfoViewerDialog(sb.toString());
				} catch (Exception ioe) {
					ioe.printStackTrace();
				}
			} else {
				if (selectedNode.getProperties() != null) {
					String surl = (String) selectedNode.getProperties().get("infourl");		
					if (surl != null) {
						try {
							URL url = new URL(surl);
							if (url != null) {
								try {
									new InfoViewerDialog(url);
								} catch (IOException ioe) {
								}
							}					
						} catch (MalformedURLException ex) {
						} // does not occur
					}
				}
			}
		} else if (action.equals("OPTIONS")) {
			String id = selectedNode.getId();
			try {
				ConfigurationDialog dialog = new ConfigurationDialog(selectedNode.getConfigID());
				dialog.setVisible(true);
			} catch (PluginHandlerNotFoundException phnfe) {
			} catch (PluginLoadingFailedException plfe) {
			}
		} else if (action.equals("REMOVE")) {
			int AD_User_ID = Env.getAD_User_ID(Env.getCtx());
			X_AD_User user = new Query(Env.getCtx(), X_AD_User.Table_Name, "AD_User_ID = ?", null)
			.setParameters(AD_User_ID)
			.first();			
			if (Util.requestAuthorization(user.getPassword())) {
				SwingWorker nw = new SwingWorker() {			
					public Object construct() {
						setBusy(true);				
						String id = selectedNode.getId();
						X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ?", null)
						.setParameters(id).first();
						if (plugin != null) {
							try {
								List<X_AD_Process> processes = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Plugin_ID = ?", null).
										setParameters(plugin.getAD_Plugin_ID()).list();
								for (X_AD_Process process:processes) {
									List<X_AD_Process_Access>  processaccess = new Query(Env.getCtx(), X_AD_Process_Access.Table_Name, "AD_Process_ID = ?", null)
									.setParameters(process.getAD_Process_ID()).list();
									for (X_AD_Process_Access procaccess:processaccess) {
										procaccess.delete(true);
									}
									List<X_AD_Menu> menus = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Process_ID = ?", null)
									.setParameters(process.getAD_Process_ID()).list();
									for (X_AD_Menu menu:menus) {									
										List<X_AD_TreeNodeMM> treenodes = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ? OR parent_id = ?", null)
										.setParameters(menu.getAD_Menu_ID(), menu.getAD_Menu_ID()).list();
										for (X_AD_TreeNodeMM treenode:treenodes) {
											int no = DB.executeUpdate(String.format("DELETE FROM AD_TreeNodeMM where node_id = %s",treenode.getNode_ID()), null);
											//treenode.delete(true);
										}
										menu.delete(true);									
									}
									List<X_AD_PInstance> instances = new Query(Env.getCtx(), X_AD_PInstance.Table_Name, "AD_Process_ID = ?", null)
									.setParameters(process.getAD_Process_ID()).list();
									for (X_AD_PInstance instance:instances) {
										instance.delete(true);
									}
									//org.postgresql.util.PSQLException: ERROR: update or delete on table "ad_process" violates foreign key constraint "adprocess_adpinstance" on table "ad_pinstance"
									List<X_AD_Process_Para> params = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_ID = ?", null)
									.setParameters(process.getAD_Process_ID()).list();
									for (X_AD_Process_Para para:params) {
										para.delete(true);
									}
									process.delete(true);
								}
								List<X_AD_Form> forms = new Query(Env.getCtx(), X_AD_Form.Table_Name, "AD_Plugin_ID = ?", null).
										setParameters(plugin.getAD_Plugin_ID()).list();
								for (X_AD_Form form:forms) {
									X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Form_ID = ?", null)
									.setParameters(form.getAD_Form_ID()).first();
									if (menu != null) {
										List<X_AD_TreeNodeMM> treenodes = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ? OR parent_id = ?", null)
										.setParameters(menu.getAD_Menu_ID(), menu.getAD_Menu_ID()).list();
										for (X_AD_TreeNodeMM treenode:treenodes) {
											int no = DB.executeUpdate(String.format("DELETE FROM AD_TreeNodeMM where node_id = %s",treenode.getNode_ID()), null);
											//treenode.delete(true);
										}									
										menu.delete(true);
									}								
									form.delete(true);
								}
								List<X_AD_Plugin_Access> pluginaccesses = new Query(Env.getCtx(), X_AD_Plugin_Access.Table_Name, "AD_Plugin_ID = ?", null).
										setParameters(plugin.getAD_Plugin_ID()).list();
								for (X_AD_Plugin_Access pluginaccess:pluginaccesses) {
									pluginaccess.delete(true);
								}
								List<X_AD_Extension> extensions = new Query(Env.getCtx(),X_AD_Extension.Table_Name, "AD_Plugin_ID = ?", null).
										setParameters(plugin.getAD_Plugin_ID()).list();
								for (X_AD_Extension extension:extensions) {
									extension.delete(true);
								}
								List<X_AD_ServletList> servletlists = new Query(Env.getCtx(), X_AD_ServletList.Table_Name, "AD_Plugin_ID = ?", null).
										setParameters(plugin.getAD_Plugin_ID()).list();
								for (X_AD_ServletList servlet:servletlists) {
									servlet.delete(true);
								}
								plugin.delete(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
							ADialog.info(0, null, String.format("%s deleted", plugin.getName()));

						}
						table.update();
						setBusy(false);						
						return Boolean.TRUE;
					}					
				};							
				nw.start();											
			} else {
				ADialog.error(m_WindowNo, this, "AccessCannotReport");
			}
		} else if (action.equals("KEYSTORE")) {
			//NewKeyStoreLauncher nn = new NewKeyStoreLauncher();
			//nn.launchWizard();			
		//} else if (action.equals("REPOSITORY")) {
		//	NewRepositoryLauncher nn = new NewRepositoryLauncher();							
		//	nn.launchWizard();										
		} else if (action.equals("INSTALL")) {
			// nos conectamos al servidor primero
			//HashMap properties = selectedNode.getProperties();
			if (selectedNode.getProperties() != null) {
				String surl = (String) selectedNode.getProperties().get("downloadurl");
				if (surl != null) {
					try {
						URL url = new URL(surl);
						if (url != null) {
							try {
								MRole role = MRole.getDefault();
								if (role != null && role.isSuperUser()) {
									String Force = "N"; 
									PickForceDialog dlgforce = new PickForceDialog();
									if (dlgforce.isForce()) {
										Force = "Y";
									}
									selectedNode.getProperties().put("force", Force);
									KeyNamePair kp = new KeyNamePair(0,"");
									String askclient = (String) selectedNode.getProperties().get("askclient");
									if (askclient == null) {
										askclient = "N";
									}
									if (askclient.equals("Y")) {										
										PickClientDialog dlg = new PickClientDialog(kp);
										if (dlg.getClient() != null) {
											kp = dlg.getClient();
										}										
									}	
									if (kp.getKey() == 0 && askclient.equals("Y")) {
										String status = "el plugin requiere seleccionar un cliente";
										ADialog.info(Env.getWindowNo(PluginManagerDialog.getInstance()), PluginManagerDialog.getInstance(), status);
										throw new Exception();
									}  
									selectedNode.getProperties().put("clientid", kp.getKey());
									installplugin();																	
								}								
							} catch (Exception ioe) {
								ioe.printStackTrace();
							}
						}					
					} catch (MalformedURLException ex) {
					} // does not occur
				}
			}						
		} else if (action.equals("STATUS")) {
			String status = "";
			//String result = Util.navigateWebServer(String.format("store?type=status"));
			String result = new XendrianServer().setServlet("store").setType("status").start(); 
			try {
				SAXBuilder builder = new SAXBuilder();
				InputStream stream = new ByteArrayInputStream(result.getBytes("UTF-8"));
				Document doc = builder.build(stream);
				status = doc.getRootElement().getText();			
			} catch (Exception ex) {
				ex.printStackTrace();
			}						
			ADialog.info(Env.getWindowNo(PluginManagerDialog.getInstance()), PluginManagerDialog.getInstance(), status);
		}

	}


	private void installplugin() {		
		MRole role = MRole.getDefault();
		if (role != null && role.isSuperUser()) {
			SwingWorker nw = new SwingWorker() {			
				public Object construct() {
					setBusy(true);					
					String url = (String) selectedNode.getProperties().get("downloadurl");
					String filename = (String) selectedNode.getProperties().get("filename");
					Integer clientid = (Integer) selectedNode.getProperties().get("clientid");
					String force = (String) selectedNode.getProperties().get("force");
					new XendrianServer().setServlet("store").newsession();
					new XendrianServer().setServlet("store").addProperty("filename", filename);
					new XendrianServer().setServlet("store").addProperty("url", url);
					new XendrianServer().setServlet("store").addProperty("role", MRole.getDefault().getAD_Role_ID());
					new XendrianServer().setServlet("store").addProperty("client", clientid);
					new XendrianServer().setServlet("store").addProperty("force", force);
					new XendrianServer().setServlet("store").addProperty("processing", "Y");
					new XendrianServer().setServlet("store").setType("install").start();
					String processing = new XendrianServer().setServlet("store").getProperty("processing");
					String msg = "";
					while (processing.equals("Y")) {
						msg =  new XendrianServer().setServlet("store").getMessage();
						preview.setText(msg);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}						
						processing = new XendrianServer().setServlet("store").getProperty("processing");
					}
					msg =  new XendrianServer().setServlet("store").getMessage();
					preview.setText(msg);
					setBusy(false);
					table.update();
					return Boolean.TRUE;
				}					
			};							
			nw.start();			
		} else {
			//role sin acceso para instalar
			ADialog.info(Env.getWindowNo(PluginManagerDialog.getInstance()), PluginManagerDialog.getInstance(), "role sin acceso para instalar");
		}		
	}

	public static PluginManagerDialog getInstance() {
		if (instance == null) {
			instance = new PluginManagerDialog();			
		}
		if (!instance.isVisible()) {			
			instance.setVisible(true);			
		}
		instance.update();
		instance.toFront();
		return instance;		
	}

	public void setBusy (boolean busy)
	{
		if (busy == m_glassPane.isVisible())
			return;
		m_glassPane.setMessage(null);
		if (busy)			
		{	
			m_glassPane.setBusyTimer(1000);
		}
		else
		{
			m_glassPane.setBusyTimer(0);
		}		
	}   //  setBusy

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		//Object object = arg0.getPath().getLastPathComponent();
		int row = table.getSelectedRow();
		if (row < 0)
			return;
		Object object = table.getTree().getPathForRow(row).getLastPathComponent();		
		if (object instanceof PluginNode) {
			selectedNode = (PluginNode) object;

			if (selectedNode == null) {
				return;
			}

			boolean isCategoryFolder = selectedNode.isCategory();

			if (isCategoryFolder) {
				// this is just a folder
				// ->disable all actions
				installButton.setEnabled(false);
				removeButton.setEnabled(false);
				infoButton.setEnabled(false);
				optionsButton.setEnabled(false);
			} else {
				removeButton.setEnabled(true);
				//infoButton.setEnabled(selectedNode.hasInfo());
				infoButton.setEnabled(true);
				if (selectedNode == null) {
					return;
				}
				// if plugin has config extension point
				String id = selectedNode.getConfigID();
				optionsButton.setEnabled(configHandler.exists(id));
				installButton.setEnabled(!selectedNode.isInstalled() || selectedNode.isUpdateable());
			}			
		} else  {
			installButton.setEnabled(false);
			removeButton.setEnabled(false);
			infoButton.setEnabled(false);
			optionsButton.setEnabled(false);			
		}
	}
	//	@Override
	//	public void valueChanged(ListSelectionEvent e) {
	//		// TODO Auto-generated method stub
	//		
	//	}

}
