package org.columba.core.gui.statusbar;

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
import org.compiere.apps.wf.WFActivity;
import org.compiere.swing.CScrollPane;
import org.xendra.Constants;


public class WorkflowActivitiesDialog extends JDialog implements ActionListener {
	private static WorkflowActivitiesDialog instance;
	private WFActivity	wfActivity = null;
	public WorkflowActivitiesDialog() {
		super((JFrame) null, "Workflow Activities", false);
		initComponents();
		pack();
		setLocationRelativeTo(null);
	}

	private void initComponents() {
		wfActivity = new WFActivity(this);		
		setLayout(new BorderLayout());		
		add(new CScrollPane(wfActivity));
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
	public void UpdateActivities() {
		wfActivity.loadActivities();
		wfActivity.display();
	}
	
	public static WorkflowActivitiesDialog createInstance() {
		if (instance == null) {
			instance = new WorkflowActivitiesDialog();
		}
		if (!instance.isVisible()) {
			instance.setVisible(true);
		}
		instance.toFront();
		instance.UpdateActivities();
		return instance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals(Constants.CLOSE)) {
			super.dispose();			
		}
	}
	

}
