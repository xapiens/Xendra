package org.xendra.controls;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.columba.core.xml.XmlIO;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.api.XendrianServer;
import org.xendra.swing.LED;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class XendraServerDialog extends JDialog implements ActionListener {

	private X_A_Machine m_machine;
	private LED led = new LED();		
	private JButton RunNow;
	private KeyNamePair m_vp;
	private Integer m_port;
	private String m_identifier;
	private JLabel lblTable = new JLabel("");
	private JLabel status = new JLabel("");
	private JButton btnStatus;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private String m_tablename = "";
	public XendraServerDialog() {
		Components();
	}

	public XendraServerDialog(KeyNamePair vp) {
		Components();
		RunNow.setEnabled(false);
		led.setState(LED.OFF);
		m_vp = vp;
		//
		Initialize();
		if (led.getState() == LED.OFF)
			status();
		//
		pack();
		setLocationRelativeTo(null);
		setVisible(true);										
	}

	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(96dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(26dlu;default)"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(104dlu;default):grow"),}));

		btnStatus = new JButton("status");
		btnStatus.addActionListener(this);
		btnStatus.setActionCommand("Status");

		RunNow = new JButton("Run now");
		RunNow.addActionListener(this);
		RunNow.setActionCommand("RunNow");
		mainPanel.add(led, "2, 2, left, default");		
		mainPanel.add(btnStatus, "4, 2");		
		mainPanel.add(lblTable, "6, 2");		
		mainPanel.add(RunNow, "4, 4");				
		mainPanel.add(status, "6, 4");
		//
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
	}

	public void Initialize() {
		m_tablename = m_vp.getName();
		lblTable.setText(m_tablename);
		PO po = new Query(Env.getCtx(), m_tablename, String.format("%s_ID = ?", m_tablename), null)
		.setParameters(m_vp.getKey()).first();
		int machineuid = po.get_ValueAsInt(X_A_Machine.COLUMNNAME_A_Machine_ID);
		if (machineuid > 0) {
			m_machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(machineuid).first();
			X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "properties->'A_Machine_ID'  = ? AND servertype = ?", null)
			.setParameters(String.valueOf(m_machine.getA_Machine_ID()), REF_ServerType.WebServer).first();
			if (ms != null) {
				HashMap msprops = ms.getProperties();
				Integer port = 8080;
				if (msprops.size() > 0) {
					if (msprops.containsKey("port"))
						port = Integer.valueOf((String) msprops.get("port"));
				}
				String identifier = String.format("%s%s",m_vp.getName(),m_vp.getKey());
				m_port = port;
				m_identifier = identifier;
			}
		}													
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("RunNow")) {
			runnow();
		} else if (e.getActionCommand().equals("Status")) {
			status();
		} else if (e.getActionCommand().equals("CANCEL")) { //$NON-NLS-1$			
			setVisible(false);
		} else if (e.getActionCommand().equals("OK")) {
			setVisible(false);
		}

	}

	private void status() {
		String action = String.format("status_%s", m_identifier);
		String result = new XendrianServer().setServlet("monitor").setAction(action).start();
		//String url = String.format("http://%s:%s/monitor?Action=status_%s",m_machine.getName(), m_port, m_identifier);
		//OkHttpClient client = new OkHttpClient();
		//Request request = new Request.Builder().url(url).build();
		try {
			//Response response = client.newCall(request).execute();
			//String result = response.body().string();
			XmlIO io = new XmlIO();
			io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));
			String msg = io.getRoot().getElement("status").getData();
			if (msg.equals("alive")) {
				led.setState(LED.GREEN);
				lblTable.setText(m_vp.getName());
				RunNow.setEnabled(true);
			} else {
				led.setState(LED.RED);
				RunNow.setEnabled(false);
			}
			status.setText("");
		} catch (Exception ex) {
			ex.printStackTrace();
		}														
	}

	private void runnow() {
		String result = new XendrianServer().setServlet("monitor").setType("runnow").setRunNow(m_identifier).start();
		//String url = String.format("http://%s:%s/monitor?RunNow=%s",m_machine.getName(), m_port, m_identifier);
		//OkHttpClient client = new OkHttpClient();
		//Request request = new Request.Builder().url(url).build();
		try {
			//Response response = client.newCall(request).execute();
			//String result = response.body().string();
			XmlIO io = new XmlIO();
			io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));
			String msg = io.getRoot().getElement("status").getData();
			status.setText(msg);
		} catch (Exception ex) {
			ex.printStackTrace();
		}					
	}
}
