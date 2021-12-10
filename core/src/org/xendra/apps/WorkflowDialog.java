package org.xendra.apps;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.help.HelpManager;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.apps.wf.WFPanel;
import org.xendra.Constants;

public class WorkflowDialog extends JDialog implements ActionListener {
	private static WorkflowDialog instance;
	private WFPanel		wfPanel = null;
	public WorkflowDialog() {
		super((JFrame) null, "Workflow Manager", false);
		initComponents();		
		setLocationRelativeTo(null);
	}
	
	private void initComponents() {
		wfPanel = new WFPanel(this);
		setLayout(new BorderLayout());
		add(wfPanel);
		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));

		JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 6, 0));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		JButton closeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("global", "global", "close"));
		closeButton.setActionCommand(Constants.CLOSE);
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
	
	public static WorkflowDialog createInstance() {
		if (instance == null) {
			instance = new WorkflowDialog();
		}
		if (!instance.isVisible()) {
			instance.setVisible(true);
		}
		instance.toFront();
		return instance;
	}

	public void startWorkflow(int AD_Workflow_ID) {
		wfPanel.load(AD_Workflow_ID, false);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals(Constants.CLOSE)) {
			super.dispose();			
		}
	}
}
