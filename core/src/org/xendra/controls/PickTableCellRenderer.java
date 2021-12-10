package org.xendra.controls;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.compiere.util.Env;
import org.xendra.model.AbstractFolder;

@SuppressWarnings("serial")
public class PickTableCellRenderer extends DefaultTreeCellRenderer {
	public static ImageIcon icon = null;
	public PickTableCellRenderer(boolean bool) {
		super();
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, 
			boolean isSelected, boolean expanded, boolean leaf, int row, 
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, isSelected, expanded, 
				leaf, row, hasFocus);
		AbstractFolder folder = (AbstractFolder) value;
		if (folder == null) {
			return this;
		}
		if (icon == null) {
			try {
				icon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "table.png"))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		setText(folder.getName());
		if (icon != null) {
			setIcon(icon);		
		}
		return this;
	}
}
