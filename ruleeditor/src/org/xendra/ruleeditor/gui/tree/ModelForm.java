package org.xendra.ruleeditor.gui.tree;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import org.compiere.apps.ConfirmPanel;
import org.compiere.apps.StatusBar;
import org.compiere.model.MQuery;
import org.compiere.swing.CPanel;

public class ModelForm extends JDialog implements ActionListener {
	private MQuery query;
	private ConfirmPanel confirmPanel = new ConfirmPanel(true, true, false, false, false, true, true);
	private StatusBar statusBar = new StatusBar();
	private ModelPanel mainPanel;
	private boolean access;

	private void Components() {
		getContentPane().setLayout(new BorderLayout());		
		CPanel southPanel = new CPanel();
		//
		mainPanel = new ModelPanel(query);
		access = mainPanel.hasAccess();
		if (access) {
			mainPanel.setDialog(this);
			confirmPanel.addActionListener(mainPanel);
			getContentPane().add(mainPanel, BorderLayout.CENTER);
			southPanel.setLayout(new BorderLayout());
			southPanel.add(confirmPanel, BorderLayout.NORTH);
			southPanel.add(statusBar, BorderLayout.SOUTH);
			getContentPane().add(southPanel, BorderLayout.SOUTH);
		}
	}
	
	private void initialize() {
		Components();
	}

	private boolean hasAccess() {
		return access;
	}

	private void setQuery(MQuery query) {
		this.query = query;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public static ModelForm get(MQuery query) {
		ModelForm m = new ModelForm();
		m.setQuery(query);
		m.initialize();
		if (m.hasAccess()) {
			m.start();
			return m;	
		} else 
			return null;
	}

	private void start() {
		pack();
		setLocationRelativeTo(null);
		setVisible(true);										
	}

}
