package org.xendra.modeleditor.gui.list;

import java.awt.Component;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import org.compiere.model.persistence.X_AD_Field;
import org.compiere.util.Env;

public class FieldListRenderer extends JLabel implements ListCellRenderer {
	ImageIcon localIcon  = null;
	public FieldListRenderer() {
		setOpaque(true);
		setHorizontalAlignment(LEFT);
		setVerticalAlignment(CENTER);
		try {
		localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.modeleditor", "field.png"))));
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
		X_AD_Field item = (X_AD_Field) value;
		if (localIcon != null)
		setIcon(localIcon);
		setText(item.getName());		
		return this;		
	}	
}
