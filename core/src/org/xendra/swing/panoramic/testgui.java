package org.xendra.swing.panoramic;

import java.awt.*;
import java.awt.font.GraphicAttribute;
import java.awt.font.ImageGraphicAttribute;
import java.awt.font.ShapeGraphicAttribute;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.text.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class testgui {
	public static void main(String[] args) {
		Frame f = new JFrame() {
			public void paint(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;				
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				Font serifFont = new Font("Serif", Font.PLAIN, 128);
				g2.setFont(serifFont);
				//g2.transform(AffineTransform.getRotateInstance(-Math.PI/2));
				int limit = 6;
				float ratio = (float) 3 / (float) 6;
				g2.transform(AffineTransform.getRotateInstance(Math.PI * (ratio - 1.0f)));
				//for (int i = -300; i < 500; i+=50)
				g2.drawString("2017", -300, 100);				
			}
		};
		f.setPreferredSize(new Dimension(600,600));
		f.pack();
		f.setVisible(true);
	}
}