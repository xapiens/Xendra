package org.xendra.ruleeditor.gui.list;

import java.awt.Component;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;

public class RuleListRenderer extends JLabel implements ListCellRenderer {
	ImageIcon localIcon  = null; 
	public RuleListRenderer() {
		setOpaque(true);
		setHorizontalAlignment(LEFT);
		setVerticalAlignment(CENTER);
		try {
		localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "process.gif"))));
		} catch (Exception e) {}
	}
	
	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {	
		if (isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {			
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		X_AD_Rule item = (X_AD_Rule) value;
		if (localIcon != null)
		setIcon(localIcon);
		setText(item.getName());		
		return this;		
	}
}
