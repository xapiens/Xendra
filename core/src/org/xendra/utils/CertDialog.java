package org.xendra.utils;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;

public class CertDialog implements ActionListener, ListSelectionListener {
	private static CertDialog instance;
	private JList list;
	JFrame d;
	private ButtonWithMnemonic okButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "ok")); //$NON-NLS-1$ //$NON-NLS-2$;
	private ButtonWithMnemonic cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "cancel")); //$NON-NLS-1$ //$NON-NLS-2$
	private Cert pickcert = null; 
	public static CertDialog getInstance() {
		if (instance == null) {
			instance = new CertDialog();
		}
		return instance;
	}

	public void setCertificates(List<Cert> certs) {
        list = new JList();        
        list.setCellRenderer(new certrenderer());
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        DefaultListModel m = new DefaultListModel();
        for (Cert cert:certs) {
        	m.addElement(cert);	
        }                 
        list.setModel(m);
        list.addListSelectionListener(this);
        JPanel p = new JPanel(new MigLayout());
        p.add(new JScrollPane(list));                
        d = new JFrame();        
        d.setLayout(new BorderLayout());
        d.add(p);
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
		d.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(12, 12, 12, 12));		
		buttonPanel.setLayout(new GridLayout(1, 3, 6, 0));		
		okButton.setActionCommand("OK"); //$NON-NLS-1$
		okButton.addActionListener(this);
		okButton.setEnabled(false);
		buttonPanel.add(okButton);
		cancelButton.setActionCommand("CANCEL"); //$NON-NLS-1$
		cancelButton.addActionListener(this);		
		buttonPanel.add(cancelButton);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);				       
        d.pack();
        d.setVisible(true);		        
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
        if (list.getSelectedIndex() >= 0) {
        	list.setSelectedIndex(list.getSelectedIndex());
        	okButton.setEnabled(true);
        }		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(okButton)) {
			pickcert = (Cert) list.getModel().getElementAt(list.getSelectedIndex());
			d.setVisible(false);
		}
	}
	public Cert getpickCert() {
		return pickcert;
	}
}
