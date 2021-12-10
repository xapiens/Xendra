package org.columba.core.gui.processmanager;

import java.awt.Component;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import org.columba.core.gui.processmanager.folder.MachineNode;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

public class MachineCellRenderer extends DefaultTreeCellRenderer {

	public MachineCellRenderer(boolean b) {
		super();
	}

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean isSelected, boolean expanded, boolean leaf, int row, 
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded, 
				leaf, row, hasFocus);
		if (value != null) {
			MachineNode m = (MachineNode) value;
			X_A_Machine machine = m.getMachine();
			if (machine != null) {
				setText(String.format("%s %s",machine.getName(), machine.getMac_Address()));
				ImageIcon localIcon;
				try {
					localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "computer.png"))));
					setIcon(localIcon);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return this;
	}
}
