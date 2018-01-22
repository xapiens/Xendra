package org.columba.core.gui.base;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.UIManager;
import javax.swing.border.Border;

public class ShadowBorder implements Border {
	private Insets insets;

	public ShadowBorder() {
		insets = new Insets(2, 2, 4, 4);
	}

	public Insets getBorderInsets(Component c) {
		return insets;
	}

	public boolean isBorderOpaque() {
		return true;
	}

	public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
		Color bg = c.getBackground();
		if (c.getParent() != null)
			bg = c.getParent().getBackground();
		Color mid = bg.darker();
		Color rect = UIManager.getColor("control").darker();
		Color edge = average(mid, bg);

		// g.setColor(bg);
		// g.fillRect(0, h - 3, 3, 3);
		// g.fillRect(w - 3, 0, 3, 3);
		// g.fillRect(w - 3, h - 3, 3, 3);

		w-=3;
		h-=3;
		g.setColor(rect);
		// g.drawRect(0, 0, w - 3, h - 3);
		int ovalHeight = 3;
		int ovalWidth = 3;
		// left
		g.drawLine(x, y + ovalHeight, x, y +h);
		g.drawArc(x, y, 2 * ovalWidth, 2 * ovalHeight, 180, -90);
		// top
		g.drawLine(x + ovalWidth, y, x + w - ovalWidth, y);
		g.drawArc(x + w - 2 * ovalWidth, y, 2 * ovalWidth, 2 * ovalHeight, 90,
				-90);
		// right
		g.drawLine(x + w, y + ovalHeight, x + w, y + h);
		// bottom
		g.drawLine(x, y + h, x + w, y + h);

		w+=1;
		h+=1;
		//
		 g.setColor(edge);
		 // bottom
		 g.drawLine(x+1, h, x+w, h );
		 // right
		 g.drawLine(x+w, y+ovalHeight+1, x+w , y+h);
//
//		 w+=1;
//			h+=1;
//		 g.setColor(edge);
//		 // bottom
//		 g.drawLine(x+2, h, x+w, h );
//		 // right
//		 g.drawLine(x+w, y+ovalHeight+2, x+w , y+h);

	}

	private static Color average(Color c1, Color c2) {
		int red = c1.getRed() + (c2.getRed() - c1.getRed()) / 2;
		int green = c1.getGreen() + (c2.getGreen() - c1.getGreen()) / 2;
		int blue = c1.getBlue() + (c2.getBlue() - c1.getBlue()) / 2;
		return new Color(red, green, blue);
	}
}