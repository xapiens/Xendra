package org.columba.core.gui.plugin;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;

public class PickForceDialog extends JDialog implements ActionListener {
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private JComboBox combo;
	private Boolean force = false;

	public PickForceDialog() {
		setModal(true);
		Components();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);				
	}
	
	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		combo = new JComboBox();
		combo.addItem("update");
		combo.addItem("force update all");
		mainPanel.setLayout(new MigLayout("fill"));
		mainPanel.add(combo, "grow");
		getContentPane().add(mainPanel, BorderLayout.NORTH);
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
		if (command.equals("CANCEL")) { //$NON-NLS-1$
			setVisible(false);
		} else if (command.equals("OK")) { //$NON-NLS-1$
			if (combo.getModel().getSelectedItem().equals("force update all"))
				force = true;
			setVisible(false);
		} 						
	}

	public boolean isForce() {
		return force;
	}

}
