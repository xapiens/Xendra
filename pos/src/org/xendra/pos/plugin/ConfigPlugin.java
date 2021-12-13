package org.xendra.pos.plugin;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.columba.core.gui.plugin.AbstractConfigPlugin;

public class ConfigPlugin extends AbstractConfigPlugin {

	public ConfigPlugin() {
		super();
	}
	@Override
	public void updateComponents(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel createPanel() {
		JLabel label = new JLabel("test");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JScrollPane pane = new JScrollPane(label);
        panel.add(pane, BorderLayout.NORTH);

        return panel;
	}

}
