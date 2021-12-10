package org.columba.core.gui.plugin;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.BorderLayout;

public class PluginPreview extends JPanel implements ListSelectionListener {
	JTextPane txtpnSadfsfdsfsfs = new JTextPane();
	private PluginTree table;
	public PluginPreview() {
		setLayout(new BorderLayout(0, 0));		
		JLabel lblNewLabel = new JLabel("info");
		add(lblNewLabel, BorderLayout.NORTH);
		JScrollPane outputscroll = new JScrollPane(txtpnSadfsfdsfsfs);
		outputscroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		outputscroll.setAutoscrolls(true);		
		//.setText("sadfsfdsfsfs");
		add(outputscroll, BorderLayout.CENTER);
	}
	public void setText(String text) {
		txtpnSadfsfdsfsfs.setText(text);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int row = table.getSelectedRow();
		if (row < 0)
			return;
		Object object = table.getTree().getPathForRow(row).getLastPathComponent();		
		if (object instanceof PluginNode) {
			PluginNode n = (PluginNode) object;
			if (n == null)
				return;
			boolean isCategoryFolder = n.isCategory();
			if (!isCategoryFolder) {
				txtpnSadfsfdsfsfs.setText(n.tooltip);
			}
		} else if (object instanceof PluginProcess) {
			PluginProcess n = (PluginProcess) object;
			txtpnSadfsfdsfsfs.setText(n.getDescription());
		}
	}
	public void setTable(PluginTree table) {
		this.table = table;		
	}
}
