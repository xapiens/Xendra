package org.columba.core.gui.statusbar;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.util.DB;
import org.compiere.util.Ini;

public class DatabaseStatusDialog extends JDialog implements ActionListener {
	private static DatabaseStatusDialog instance;
	JLabel lbldatabase;
	private JLabel lbldatabasename;
	private JLabel lblConnections;
	private JSpinner spnconnections;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private JLabel lblDriver;
	private JLabel lbldrivername;
	Integer poolclient = Integer.valueOf(Ini.getProperty(Ini.P_POOLCLIENT));
	
	public static DatabaseStatusDialog createInstance() {
		if (instance == null) {
			instance = new DatabaseStatusDialog();
			instance.pack();
			instance.setLocationRelativeTo(null);
		}
		if (!instance.isVisible()) {
			instance.update();
			instance.setVisible(true);
		}
		instance.toFront();
		return instance;
	}
	
	private void update() {		
		lbldatabasename.setText(DB.getDatabase().getCatalog());
		lbldrivername.setText(DB.getDatabaseInfo());		
		spnconnections.setValue(poolclient);
		pack();
	}

	public DatabaseStatusDialog() {
		
		super((JFrame) null, "Database Info", false);				
		//pm = printManager;
		//m_size = pm.getSize();
		initComponents();
		//pack();
						
	}

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		lbldatabase= new JLabel("Database");
		panel.add(lbldatabase, "4, 4");
		
		lbldatabasename = new JLabel("New label");
		panel.add(lbldatabasename, "8, 4");
		
		lblDriver = new JLabel("driver");
		panel.add(lblDriver, "4, 6");
		
		lbldrivername = new JLabel("");
		panel.add(lbldrivername, "8, 6");
		
		lblConnections = new JLabel("Conexiones");
		panel.add(lblConnections, "4, 8");
		
		spnconnections = new JSpinner();
		spnconnections.setEnabled(false);
		panel.add(spnconnections, "8, 8");
		getContentPane().add(panel, BorderLayout.CENTER);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("PickDirectory")) {
			
		} else if (command.equals("CANCEL")) { 			
			setVisible(false);
		} else if (command.equals("OK")) {
			setVisible(false);
		}		
	}

}
