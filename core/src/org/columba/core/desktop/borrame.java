package org.columba.core.desktop;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class borrame extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2787979503845147804L;
	private final JPanel contentPanel = new JPanel();
	private JEditorPane signatureEditor;
	private JButton okButton;
	private boolean m_UpdateSignature = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			borrame dialog = new borrame();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public borrame() {
		setBounds(100, 100, 335, 226);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 10, 300, 140);
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			contentPanel.add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblSignature = new JLabel("Signature");
				panel.add(lblSignature, BorderLayout.NORTH);
			}
			{
				signatureEditor = new JEditorPane();
				panel.add(signatureEditor);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(this);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public void setSignature(String signature) {
		signatureEditor.setText(signature);
	}
	
	public String getSignature()
	{
		return signatureEditor.getText();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(okButton))
		{
			m_UpdateSignature  = true;
			setVisible(false);
		}
	}
	
	public boolean IsUpdateSignature()
	{
		return m_UpdateSignature ;
	}
}
