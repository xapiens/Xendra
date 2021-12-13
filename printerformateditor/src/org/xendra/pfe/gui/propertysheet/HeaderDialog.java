package org.xendra.pfe.gui.propertysheet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.SwingConstants;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import org.compiere.grid.ed.VLookup;
import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import javax.swing.JButton;

public class HeaderDialog extends JDialog implements ActionListener {
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;

	public HeaderDialog(String m_Header) {
		Components();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);						
	}

	private void Components() {
		getContentPane().setLayout(new BorderLayout(0, 0));		
		JPanel mainpanel = new JPanel();
		getContentPane().add(mainpanel, BorderLayout.CENTER);
		mainpanel.setLayout(new FormLayout(new ColumnSpec[] {
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
		
		JLabel lblAdtableid = new JLabel("AD_Table_ID");
		mainpanel.add(lblAdtableid, "4, 4");
		
		VLookup lookup = new VLookup();
		mainpanel.add(lookup, "6, 4");
		
		JButton btnPreview = new JButton("preview");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mainpanel.add(btnPreview, "6, 8");
		
		JPanel bottompanel = new JPanel();
		bottompanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
		bottompanel.setLayout(new BorderLayout(0, 0));
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
		bottompanel.add(buttonPanel, BorderLayout.EAST);		
		getContentPane().add(bottompanel, BorderLayout.SOUTH);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
