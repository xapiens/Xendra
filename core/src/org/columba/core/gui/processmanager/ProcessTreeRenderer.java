package org.columba.core.gui.processmanager;

import java.awt.Component;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import org.columba.core.gui.processmanager.folder.HostNode;
import org.columba.core.gui.processmanager.folder.MachineServerNode;
import org.columba.core.gui.processmanager.folder.MaterialProcessorLogNode;
import org.columba.core.gui.processmanager.folder.MaterialProcessorNode;
import org.columba.core.gui.processmanager.folder.ProcessNode;
import org.columba.core.gui.processmanager.folder.SchedulerNode;
import org.columba.core.gui.processmanager.folder.ServerProcessNode;
import org.compiere.util.Env;
import org.frapuccino.treetable.TreeTable;

public class ProcessTreeRenderer extends DefaultTreeCellRenderer {

	private JTable table;
	public ProcessTreeRenderer(TreeTable table) {
		super();
		this.table = table;
		setOpaque(true);
		setBackground(null);
		setBackgroundNonSelectionColor(null);
	}

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean selected, boolean expanded, boolean leaf, int row, 
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, selected, expanded,
				leaf, row, hasFocus);
		ImageIcon localIcon = null;
		try {
			if (value instanceof HostNode) {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "computer.png"))));
			} else if (value instanceof SchedulerNode) {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "schedule.png"))));
			} else if (value instanceof MachineServerNode) {
			} else if (value instanceof MaterialProcessorNode) {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "warehouse.png"))));
			} else if (value instanceof MaterialProcessorLogNode) {
				localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "warning.png"))));
			} else if (value instanceof ServerProcessNode) {
				
			} else if (value instanceof ProcessNode) {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "applications-system.png"))));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		this.setIcon(localIcon);
		return this;
	}
}
