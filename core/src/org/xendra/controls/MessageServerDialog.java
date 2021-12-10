package org.xendra.controls;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.columba.core.base.SwingWorker;
import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.apps.AEnv;
import org.compiere.apps.AGlassPane;
import org.compiere.apps.search.Find;
import org.compiere.grid.ed.VHeaderRenderer;
import org.compiere.minigrid.CheckRenderer;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.GridWindow;
import org.compiere.model.GridWindowVO;
import org.compiere.model.MQuery;
import org.compiere.model.MTab;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.swing.CCheckBox;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;
import org.xendra.swing.LED;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ListSelectionModel;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;

public class MessageServerDialog extends JDialog implements ActionListener, ListSelectionListener {

	private static final String SOURCEQMACHINE = "SOURCEMACHINE"; 
	private static final String SYNCMACHINE = "SYNCMACHINE";	
	private static final String TARGETQMACHINE = "TQM";
	private static final String TARGETRMACHINE = "TRM";
	private Object[][] data;
	private String[] colNames = new String[] { "name", "md5", "count", "count delta", "depth", "depth delta", "last updated", "active"};
	private String[] rcolNames = new String[] { "id","TableName", "filter","last updated","active"};
	private Object[][] rdata;
	private X_A_Machine m_machine;
	private LED led = new LED();		
	private KeyNamePair m_vp;
	private Integer webport = 0;
	private Integer m_port;
	private JLabel lblTable = new JLabel("source");
	private JButton btnsourceQueue;
	private JButton btnTargetQueue;
	private JButton btnSynchronize;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private JTable queuelist;
	private JScrollPane scrollPane;

	private JTabbedPane tabbedPane;
	private JLabel lblMessage;
	private JPanel replicationPanel;
	private JScrollPane scrollPane_1;
	private JTable replicationlist;
	private JButton btnTargetReplication;
	private AGlassPane m_glassPane;
	private JFrame waitpanel;
	private JLabel rmessage;
	private JPanel panel_1;
	private JButton btnreplication;
	private X_A_Machine machinesync = Env.getMachine();
	private X_A_Machine machinesreplicationtarget = null;
	private X_A_Machine machinequeuetarget = null;
	private ImageIcon pcIcon;
	private JLabel lblDestination;

	private JPanel panel;
	private JLabel lblDestination_1;
	private ButtonColumn buttonColumn;
	private AbstractAction filter;
	int m_curWindowNo = Env.createWindowNo (this);	//  Timing: ca. 1.5 sec
	JFrame m_frame;
	public MessageServerDialog(KeyNamePair vp) {
		m_frame = Env.getFrame(this);
		setModal(true);
		Components();
		m_vp = vp;		
		Initialize();
		if (led.getState() == LED.OFF)
			CheckQueueSourceMachine();		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);										
	}
	private void loaddata() {
		Document doc = new XendrianServer().setMachineName(m_machine).setServlet("replication").setAction("list").getDocument();
		//String url = String.format("http:/%s:%s/replication?action=list", m_machine.getName(), webport);
		//OkHttpClient client = new OkHttpClient();
		//Request request = new Request.Builder().url(url).build();
		try {
			//Response response = client.newCall(request).execute();
			//String result = response.body().string();
			//InputStream s = new ByteArrayInputStream(result.getBytes(StandardCharsets.UTF_8));
			//Document doc = XMLCoreParser.retrieveDocument(s);
			try {
				Element root = doc.getRootElement();
				List<Element> items = new ArrayList<Element>();
				List list = root.getChildren();
				for (int i = 0; i < list.size(); i++) {
					Element item = (Element) list.get(i);
					items.add(item);
				}
				int i = 0;
				rdata = new Object[items.size()][5];
				for (Element item:items) {
					//rdata[i][0] = 
					rdata[i][0] = false;

					Integer uid = Integer.valueOf(item.getAttributeValue(X_AD_Table.COLUMNNAME_AD_Table_ID).toString());
					String name = item.getAttributeValue(X_AD_Table.COLUMNNAME_Name).toString();
					KeyNamePair kp = new KeyNamePair(uid, name);
					rdata[i][1] = kp;
					rdata[i][2] = "";
					rdata[i][3] = item.getAttributeValue(Constants.COLUMNNAME_Updated);
					rdata[i][4] = item.getAttributeValue(Constants.COLUMNNAME_IsActive);
					i++;
				}					
				replicationlist.setModel(createModelReplication());
				replicationlist.getTableHeader().setResizingAllowed(true);
				replicationlist.getTableHeader().setDefaultRenderer(new HeaderRenderer());
				replicationlist.getColumnModel().getColumn(0).setPreferredWidth(50);
				TableColumn tc = replicationlist.getColumnModel().getColumn(0);
				tc.setCellRenderer(new CheckRenderer());
				CCheckBox check = new CCheckBox();
				check.setMargin(new Insets(0,0,0,0));
				check.setHorizontalAlignment(SwingConstants.CENTER);
				tc.setCellEditor(new DefaultCellEditor(check));				
				tc.setHeaderRenderer(new VHeaderRenderer(DisplayType.YesNo));				
				replicationlist.getColumnModel().getColumn(1).setPreferredWidth(100);								
				filter = new AbstractAction() {
					public void actionPerformed(ActionEvent e) {
						int r = replicationlist.getSelectedRow();
						KeyNamePair kp = (KeyNamePair) replicationlist.getValueAt(r, 1);						
						X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
						.setParameters(kp.getName()).first();
						if (table != null) {
							List<MTab> mTabs = new Query(Env.getCtx(), MTab.Table_Name, "AD_Table_ID = ?", null)
							.setParameters(table.getAD_Table_ID()).list();
							MWindow window = new Query(Env.getCtx(), MWindow.Table_Name, "AD_Window_ID = ?", null)
							.setParameters(mTabs.get(0).getAD_Window_ID()).first();							
							if (window != null) {								
								int AD_Window_ID = window.getAD_Window_ID(); 
								GridWindowVO wVO = AEnv.getMWindowVO (m_curWindowNo, AD_Window_ID, 0);
								if (wVO != null)
								{
									GridTab m_mTab = null;
									GridWindow m_mWindow = new GridWindow (wVO);
									int count = m_mWindow.getTabCount();									
									for (int i=0; i < count; i ++) {
										if (m_mTab == null) {
											for (MTab mTab:mTabs) {
												if (mTab.getAD_Tab_ID() == m_mWindow.getTab(i).getAD_Tab_ID()) {
													m_mTab = m_mWindow.getTab(i);
													break;
												}
											}					
										}
									}									 
									String where = "";
									//GridField[] findFields = m_mTab.getFields();
									GridField[] findFields = GridField.createFields(Env.getCtx(), m_curWindowNo, 0, m_mTab.getAD_Tab_ID());									
									Find find = new Find (m_frame, m_curWindowNo, m_mTab.getName(),
											m_mTab.getAD_Tab_ID(), m_mTab.getAD_Table_ID(), table.getTableName(),
											where, findFields, 10);	//	no query below 10
									MQuery query = find.getQuery();
									String sqlquery = "";
									if (query != null)
										sqlquery = query.getWhereClause();
									find.dispose();
									find = null;												
									replicationlist.setValueAt(sqlquery, r, 2);
									//replicationlist.setValueAt(r, 1);									
								}
							}
						}
					}
				};				
				buttonColumn = new ButtonColumn(replicationlist, filter, 2);				
				replicationlist.getColumnModel().getColumn(3).setPreferredWidth(50);
				replicationlist.getColumnModel().getColumn(4).setPreferredWidth(50);

			} catch (Exception e) {
				e.printStackTrace();
			}	
		} catch (Exception ex) {
			ex.printStackTrace();
		}					
	}
	private void Components()  {
		m_glassPane = new AGlassPane();
		setGlassPane(m_glassPane);
		getContentPane().setLayout(new BorderLayout());
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(37dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
				new RowSpec[] {
				RowSpec.decode("22dlu"),}));		
		getContentPane().add(tabbedPane, BorderLayout.CENTER);		
		JPanel queuePanel = new JPanel();		
		tabbedPane.addTab("Queue", null, queuePanel, null);
		queuePanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(26dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(39dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(35dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(41dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(10dlu;default)"),},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(91dlu;min):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		try {
			pcIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "computer.png"))));
		} catch (Exception e) {};


		queuelist = new JTable();
		queuelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		queuelist.getSelectionModel().addListSelectionListener(this);

		lblDestination = new JLabel("destination");
		queuePanel.add(lblDestination, "4, 2");

		try {
			pcIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "computer.png"))));
		} catch (Exception e) {};

		panel.add(led, "2, 1");
		led.setState(LED.OFF);		
		panel.add(lblTable, "4, 1");

		btnsourceQueue = new JButton();
		panel.add(btnsourceQueue, "6, 1");
		btnsourceQueue.setIcon(pcIcon);
		btnsourceQueue.addActionListener(this);
		btnsourceQueue.setActionCommand(SOURCEQMACHINE);

		btnTargetQueue = new JButton();
		btnTargetQueue.setIcon(pcIcon);
		btnTargetQueue.setEnabled(false);
		btnTargetQueue.addActionListener(this);
		btnTargetQueue.setActionCommand(TARGETQMACHINE);
		queuePanel.add(btnTargetQueue, "6, 2");
		btnSynchronize = new JButton();
		queuePanel.add(btnSynchronize, "8, 2");
		ImageIcon queueIcon  = null;
		try {
			queueIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "queue.png"))));
		} catch (Exception e) {}		
		btnSynchronize.setHorizontalAlignment(SwingConstants.LEADING);
		btnSynchronize.setIcon(queueIcon);
		btnSynchronize.addActionListener(this);
		btnSynchronize.setActionCommand("sincro");
		btnSynchronize.setEnabled(false);
		scrollPane = new JScrollPane(queuelist);
		queuePanel.add(scrollPane, "4, 4, 8, 1, fill, fill");

		lblMessage = new JLabel("");
		queuePanel.add(lblMessage, "4, 6, 7, 1");
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(12, 12, 12, 12));		
		buttonPanel.setLayout(new GridLayout(1, 3, 6, 0));
		okButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "ok")); //$NON-NLS-1$ //$NON-NLS-2$
		okButton.setActionCommand("OK"); //$NON-NLS-1$
		okButton.addActionListener(this);		
		buttonPanel.add(okButton);
		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "cancel")); //$NON-NLS-1$ //$NON-NLS-2$
		cancelButton.setActionCommand("CANCEL"); //$NON-NLS-1$
		cancelButton.addActionListener(this);		
		buttonPanel.add(cancelButton);

		getRootPane().registerKeyboardAction(this, "CANCEL", //$NON-NLS-1$
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);		
		//
		bottomPanel.add(buttonPanel, BorderLayout.EAST);	
		//
		replicationPanel = new JPanel();
		tabbedPane.addTab("Replication", null, replicationPanel, null);

		replicationPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(45dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(104dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(10dlu;default)"),},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(91dlu;min):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		replicationlist = new JTable();
		replicationlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		replicationlist.getSelectionModel().addListSelectionListener(this);

		btnTargetReplication = new JButton();				
		btnTargetReplication.setActionCommand(TARGETRMACHINE);
		btnTargetReplication.setEnabled(false);
		btnTargetReplication.addActionListener(this);
		btnTargetReplication.setIcon(pcIcon);
		lblDestination_1 = new JLabel("origen");
		replicationPanel.add(lblDestination_1, "4, 2");
		replicationPanel.add(btnTargetReplication, "6, 2");
		btnreplication = new JButton("Replicar ");
		btnreplication.addActionListener(this);
		btnreplication.setActionCommand("replication");
		btnreplication.setIcon(queueIcon);
		replicationPanel.add(btnreplication, "8, 2");
		btnreplication.setEnabled(false);
		scrollPane_1 = new JScrollPane(replicationlist);
		replicationPanel.add(scrollPane_1, "4, 4, 7, 1, fill, top");		

		rmessage = new JLabel("");
		replicationPanel.add(rmessage, "4, 6, 7, 3");

		panel_1 = new JPanel();
		replicationPanel.add(panel_1, "4, 8, 7, 1, fill, fill");
		panel_1.setLayout(new MigLayout("", "[117px][]", "[25px]"));
	}

	public TableModel createModelReplication() {
		return new AbstractTableModel() {
			public int getColumnCount() {
				return rcolNames.length; 
			}
			public int getRowCount() {
				return rdata.length;
			}
			public String getColumnName(int col) {
				return rcolNames[col];
			}
			public Object getValueAt(int row, int col) {
				return rdata[row][col];
			}
			public Class<? extends Object> getColumnClass(int c) {
				Object value = getValueAt(0, c);
				return (value != null) ? value.getClass() : ImageIcon.class;				
			}
			/*
			 * Don't need to implement this method unless your table's
			 * editable.
			 */
			public boolean isCellEditable(int row, int col) {
				if (col == 0 || col  == 2)
					return true;
				return false;
			}
			/*
			 * Don't need to implement this method unless your table's data
			 * can change.
			 */
			public void setValueAt(Object value, int row, int col) {
				rdata[row][col] = value;
				fireTableCellUpdated(row, col);
			}			
		};
	}

	@SuppressWarnings("serial")
	public TableModel createModelQueue()
	{
		return new AbstractTableModel()
		{
			public int getColumnCount()	{
				return colNames.length;
			}
			public int getRowCount() {
				return data.length;
			}
			public String getColumnName(int col) {
				return colNames[col];
			}
			public Object getValueAt(int row, int col) {
				return data[row][col];
			}
			public Class<? extends Object> getColumnClass(int c) {
				Object value = getValueAt(0, c);
				return (value != null) ? value.getClass() : ImageIcon.class;
			}
			/*
			 * Don't need to implement this method unless your table's
			 * editable.
			 */
			public boolean isCellEditable(int row, int col) {
				return col == 0;
			}
			/*
			 * Don't need to implement this method unless your table's data
			 * can change.
			 */
			public void setValueAt(Object value, int row, int col) {
				data[row][col] = value;
				fireTableCellUpdated(row, col);
			}
		};

	}

	public void Initialize() {			
		m_machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(m_vp.getKey()).first();
		if (m_machine != null) {
			//btnRunNow.setText(String.format("get info from %s",m_machine.getName()));
			HashMap props = Env.getServerProperties(m_machine.getA_Machine_ID(), REF_ServerType.WebServer); 
			webport = 0;
			if (props.containsKey("port")) {
				webport = Integer.valueOf(props.get("port").toString());
			}
			props = Env.getServerProperties(m_machine.getA_Machine_ID(), REF_ServerType.MessageServer);
			m_port = 0;
			if (props.containsKey("port"))
				m_port = Integer.valueOf((String) props.get("port"));
		}													
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(SOURCEQMACHINE)) {
			CheckQueueSourceMachine();
		} else if (e.getActionCommand().equals(TARGETQMACHINE)) {
			CheckQueueTargetMachine();
		} else if (e.getActionCommand().equals("sincro")) {
			DoSyncro();
		} else if (e.getActionCommand().equals(TARGETRMACHINE)) {
			CheckReplicationTargetMachine();
		} else if (e.getActionCommand().equals("replication")) {
			replication();					
		} else if (e.getActionCommand().equals("CANCEL")) { //$NON-NLS-1$			
			setVisible(false);
		} else if (e.getActionCommand().equals("OK")) {
			setVisible(false);
		}
	}

	private void showWaitPanel() {
		if (waitpanel == null) {
			waitpanel = new JFrame();
			waitpanel.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			waitpanel.setUndecorated(true);
			waitpanel.setPreferredSize(new Dimension(200,200));
			waitpanel.setAlwaysOnTop(true);
			waitpanel.setSize(new Dimension(300,200));
			m_glassPane = new AGlassPane();
			waitpanel.setGlassPane(m_glassPane);
			waitpanel.setLocationRelativeTo(null);
			waitpanel.setVisible(true);					
		} else {
			waitpanel.setVisible(true);
		}		
		m_glassPane.setBusyTimer(10000000);
		System.out.println("show");
	}
	private void DoSyncro() {
		showWaitPanel();
		TaskDoSynchro tsk = new TaskDoSynchro();
		tsk.start();		
	}

	private void CheckQueueSourceMachine() {
		showWaitPanel();
		TaskCheckSourceMachine tsk = new TaskCheckSourceMachine();
		tsk.start();
	}
	private void CheckQueueTargetMachine() {
		PickMachineDialog dlg = new PickMachineDialog(machinequeuetarget);		
		machinequeuetarget = dlg.getMachine();
		if (machinequeuetarget != null) {
			showWaitPanel();
			TaskCheckQueueTarget tsk = new TaskCheckQueueTarget();
			tsk.start();
		}		
	}

	public void CheckReplicationTargetMachine() {
		PickMachineDialog dlg = new PickMachineDialog(machinesreplicationtarget);
		machinesreplicationtarget  = dlg.getMachine();
		if (machinesreplicationtarget != null) {			
			TaskCheckReplication tsk = new TaskCheckReplication(machinesreplicationtarget);
			tsk.start();
		}
	}

	//private void checkreplication(X_A_Machine m) {
	//	showWaitPanel();
	//	TaskCheckReplication tsk = new TaskCheckReplication(m);
	//	tsk.start();
	//}

	@Override
	public void valueChanged(ListSelectionEvent ev) {
		if (ev.getValueIsAdjusting())
			return;
		if (queuelist.getSelectedRow() != -1 && machinequeuetarget != null) {
			btnSynchronize.setEnabled(true);
		}
	}

	public void replication() {
		if (machinesreplicationtarget != null) {
			showWaitPanel();
			TaskReplication tsk = new TaskReplication();
			tsk.start();			
		}
	}
	class HeaderRenderer extends JLabel implements TableCellRenderer {
		public HeaderRenderer() {			
			setBorder(BorderFactory.createEtchedBorder());			
		}
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, 
				boolean isSelected, boolean hasFocus, int row, int column) {
			setText(value.toString());
			return this;
		}
	}
	class TaskReplication extends SwingWorker {		
		public TaskReplication() {
			// machinesreplicationtarget
		}
		public Object construct() {
			m_glassPane.setMessage(String.format("%s hacia %s", machinesreplicationtarget.getName(), m_machine.getName()));
			int port = 0;			
			HashMap props = Env.getServerProperties(machinesreplicationtarget.getA_Machine_ID(), REF_ServerType.WebServer); 			
			if (props.containsKey("port")) {
				port = Integer.valueOf(props.get("port").toString());
			}								
			int count = replicationlist.getModel().getRowCount();
			String msg = String.format("<replication destination=\"%s\">",m_machine.getName());
			HashMap<String, String> tables = new HashMap<String, String>();
			for (int i=0; i < count; i++) {				
				Boolean selected = (Boolean) replicationlist.getValueAt(i, 0);
				if (selected) {
					String where = (String) replicationlist.getValueAt(i, 2);
					KeyNamePair kp = (KeyNamePair) replicationlist.getValueAt(i, 1);
					X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(kp.getKey()).first();
					tables.put(table.getTableName(), where);					
				}
			}
			Iterator<String> it = tables.keySet().iterator();
			while (it.hasNext()) {
				String table = it.next();
				String query = tables.get(table);
				msg += String.format("<table name=\"%s\" query=\"%s\"/>",table, query);
			}
			msg += "</replication>";
			String url = String.format("http:/%s:%s/replication", machinesreplicationtarget.getName(), port);
			OkHttpClient client = new OkHttpClient();
			RequestBody formBody = new FormBody.Builder()
			.add("message", msg)
			.build();
			Request request = new Request.Builder()
			.url(url)
			.post(formBody)
			.build();
			msg = "";
			it = tables.keySet().iterator();
			while (it.hasNext()) {
				String table = it.next();
				if (msg.length() > 0)
					msg += ",";
				msg += String.format("%s",table);
			}			
			rmessage.setText(String.format("replica tables %s from %s to %s", msg, machinesreplicationtarget.getName(), m_machine.getName()));
			try {
				Response response = client.newCall(request).execute();
				// Do something with the response.
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		}
		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			m_glassPane.setBusyTimer(0);
			waitpanel.setVisible(false);
		}						
	}

	class TaskCheckQueueTarget extends SwingWorker {
		public TaskCheckQueueTarget() {}
		public Object construct() {
			btnTargetQueue.setText("");
			btnSynchronize.setEnabled(false);
			m_glassPane.setMessage(String.format("Checking %s", machinequeuetarget.getName()));
			int port = 0;
			HashMap props = Env.getServerProperties(machinequeuetarget.getA_Machine_ID(), REF_ServerType.WebServer); 			
			if (props.containsKey("port")) {
				port = Integer.valueOf(props.get("port").toString());
			}					
			//String url = String.format("http://%s:%s/monitor?JMS=status", machinequeuetarget.getName(), port);
			String url = String.format("http:/%s:%s/replication?action=status", machinequeuetarget.getName(), port);
			Document doc = getDocument(url);
			if (doc != null) {
				Element root = doc.getRootElement();
				String status = root.getText();
				if (status.equals("alive")) {
					btnTargetQueue.setText(machinequeuetarget.getName());
					if (queuelist.getSelectedRow() != -1) {
						btnSynchronize.setEnabled(true);
					}
				} else {
					machinequeuetarget = null;
				}				 
			} else {
				machinequeuetarget = null;
			}
			return "";
		}
		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			m_glassPane.setBusyTimer(0);
			waitpanel.setVisible(false);
		}				
	}

	//btnTargetReplication.setText(machinesreplicationtarget.getName());
	//checkreplication(machinesreplicationtarget);			
	class TaskCheckReplication extends SwingWorker {
		X_A_Machine machine;
		public TaskCheckReplication(X_A_Machine m) {
			machine = m;
		}

		public Object construct() {
			showWaitPanel();
			btnTargetReplication.setText("");	
			machinesreplicationtarget  = null;						
			int port = 0;
			HashMap props = Env.getServerProperties(machine.getA_Machine_ID(), REF_ServerType.WebServer); 			
			if (props.containsKey("port")) {
				port = Integer.valueOf(props.get("port").toString());
			}					
			m_glassPane.setMessage(String.format("Status %s:%s...", machine.getName(), port));
			btnreplication.setEnabled(false);			
			String url = String.format("http:/%s:%s/replication?action=status", machine.getName(), port);
			Document doc = getDocument(url);
			if (doc != null) {
				Element root = doc.getRootElement();
				String status = root.getText();
				if (status.equals("alive")) {					
					btnreplication.setEnabled(true);
					btnTargetReplication.setEnabled(true);
					btnTargetReplication.setText(machine.getName());
					machinesreplicationtarget = machine;
				}
			}
			return "";
		}
		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			m_glassPane.setBusyTimer(0);
			waitpanel.setVisible(false);
		}				
	}

	private Document getDocument(String url) {
		Document doc = null;
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(url).build();				
			Response response = client.newCall(request).execute();
			String result = response.body().string();
			SAXBuilder builder = new SAXBuilder();
			InputStream stream = new ByteArrayInputStream(result.getBytes("UTF-8"));
			doc = builder.build(stream);
		} catch (Exception e) {}
		return doc;
	}

	class TaskCheckSourceMachine extends SwingWorker {
		public TaskCheckSourceMachine() {}
		public Object construct() {
			led.setState(LED.RED);					
			btnsourceQueue.setText("");
			btnTargetQueue.setEnabled(false);
			btnTargetReplication.setEnabled(false);
			btnSynchronize.setEnabled(false);			
			m_glassPane.setMessage("Status...");			
			String url = String.format("http:/%s:%s/replication?action=status", m_machine.getName(), webport);
			Document doc = getDocument(url);
			if (doc != null) {				
				Element root = doc.getRootElement();
				String status = root.getText();
				if (status.equals("alive")) {
					loaddata();
					led.setState(LED.GREEN);					
					btnsourceQueue.setText(m_machine.getName());
					btnTargetQueue.setEnabled(true);
					btnTargetReplication.setEnabled(true);
					//url = String.format("http://%s:%s/monitor?JMS=snapshot",m_machine.getName(), webport);
					url = String.format("http:/%s:%s/replication?action=snapshot", m_machine.getName(), webport);
					doc = getDocument(url);
					try {
						root = doc.getRootElement();
						List<Element> items = new ArrayList<Element>();
						List list = root.getChildren();
						for (int i = 0; i < list.size(); i++) {
							Element item = (Element) list.get(i);
							items.add(item);
						}
						int i = 0;
						data = new Object[items.size()][8];
						for (Element item:items) {
							data[i][0] = item.getAttributeValue("name");
							data[i][1] = item.getAttributeValue("md5");
							data[i][2] = item.getAttributeValue("count");
							data[i][3] = item.getAttributeValue("countdelta");
							data[i][4] = item.getAttributeValue("depth");
							data[i][5] = item.getAttributeValue("depthdelta");
							data[i][6] = item.getAttributeValue("lastupdated");
							data[i][7] = item.getAttributeValue("active");
							i++;
						}				
						queuelist.setModel(createModelQueue());
						queuelist.getTableHeader().setResizingAllowed(true);
						queuelist.getTableHeader().setDefaultRenderer(new HeaderRenderer());
						queuelist.getColumnModel().getColumn(0).setPreferredWidth(50);
						queuelist.getColumnModel().getColumn(1).setPreferredWidth(50);
						queuelist.getColumnModel().getColumn(2).setPreferredWidth(15);
						queuelist.getColumnModel().getColumn(3).setPreferredWidth(15);
						queuelist.getColumnModel().getColumn(4).setPreferredWidth(15);
						queuelist.getColumnModel().getColumn(5).setPreferredWidth(15);
						queuelist.getColumnModel().getColumn(6).setPreferredWidth(15);				
						queuelist.getColumnModel().getColumn(7).setPreferredWidth(15);
					} catch (Exception e) {
						e.printStackTrace();
					}			
				} 
			} 
			return "";
		}
		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			m_glassPane.setBusyTimer(0);
			waitpanel.setVisible(false);
		}		
	}
	class TaskDoSynchro extends SwingWorker {

		public TaskDoSynchro() {
		}

		public Object construct() {
			m_glassPane.setMessage("Synchronized...");
			String queuename = (String) queuelist.getValueAt(queuelist.getSelectedRow(), 0);
			String md5 = "";
			int port = 0;
			HashMap props = Env.getServerProperties(machinequeuetarget.getA_Machine_ID(), REF_ServerType.WebServer); 			
			if (props.containsKey("port")) {
				port = Integer.valueOf(props.get("port").toString());
			}								
			String url = String.format("http://%s:%s/replication?action=checksum&type=queue&name=%s",machinequeuetarget.getName(), port, queuename);
			Document doc = getDocument(url);
			if (doc != null) {
				Element root = doc.getRootElement();
				md5 = root.getText();
			}
			url = String.format("http://%s:%s/replication?action=synchro&queuename=%s&md5=%s&machine=%s",m_machine.getName(), webport, queuename,md5,machinequeuetarget.getName());
			doc = getDocument(url);
			if (doc != null) {
				Element root = doc.getRootElement();
				Element e = root.getChild("queue");
				String remotequeuename = e.getAttributeValue("name");
				String remotemd5 = e.getAttributeValue("md5");
				String msg = e.getAttributeValue("status");
				//					
				if (remotequeuename.compareTo(queuename) != 0) {
					url = String.format("http://%s:%s/replication?action=createqueue&queuename=%s&md5=%s", machinequeuetarget.getName(), port, remotequeuename,remotemd5);
					doc = getDocument(url);
					if (doc != null) {
						root = doc.getRootElement();
						String status = root.getText();
						if (status.equals("created")) {
							url = String.format("http://%s:%s/replication?action=synchro&queuename=%s&md5=%s&machine=%s&queueremote=%s",m_machine.getName(), webport, queuename,remotemd5,machinequeuetarget.getName(), remotequeuename);
							doc = getDocument(url);
							if (doc != null) {
								root = doc.getRootElement();
								e = root.getChild("queue");
								msg = e.getAttributeValue("status");								
							}
						}
					}
				}
				lblMessage.setText(msg);
			}																	
			return "";		        
		}

		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void finished() {
			m_glassPane.setBusyTimer(0);
			waitpanel.setVisible(false);
		}
	}	
}
