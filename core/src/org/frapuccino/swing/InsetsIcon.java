package org.frapuccino.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.Icon;

public class InsetsIcon implements Icon {
	private static final Insets DEFAULT_INSETS = new Insets(2, 2, 0, 0);

	Icon icon;

	Insets insets;

	public InsetsIcon(Icon icon) {
		this(icon, null);
	}

	public InsetsIcon(Icon icon, Insets insets) {
		this.icon = icon;
		this.insets = insets == null ? DEFAULT_INSETS : insets;
	}

	public int getIconHeight() {
		return icon.getIconHeight() + insets.top + insets.bottom;
	}

	public int getIconWidth() {
		return icon.getIconWidth() + insets.left + insets.right;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		icon.paintIcon(c, g, x + insets.left, y + insets.top);
	}
}
