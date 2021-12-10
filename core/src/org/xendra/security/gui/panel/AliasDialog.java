package org.xendra.security.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;



public class AliasDialog extends JDialog implements ActionListener {
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;	
	private JTextField alias;
	private String result;
	public AliasDialog() {
		setModal(true);
		Components();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);				
	}
	public void Components() {
		//setLayout(null);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);		
		panel.setLayout(new MigLayout("", "[][][][][][][grow]", "[][][]"));

		JLabel label1 = new JLabel("Alias");
		panel.add(label1, "cell 3 2,alignx trailing");

		alias = new JTextField();
		panel.add(alias, "cell 5 2,growx");
		alias.setColumns(10);
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
		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog","global", "cancel")); //$NON-NLS-1$ //$NON-NLS-2$
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
		if (command.equals("OK")) {
			result = alias.getText();
			setVisible(false);
		} else if (command.equals("CANCEL")) { //$NON-NLS-1$
			result = "";
			setVisible(false);		
		}
	}
	public String getResult() {
		return result;
	}
}
