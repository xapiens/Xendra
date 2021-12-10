package org.xendra.controls;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.util.logging.Level;

import javax.swing.*;
import javax.swing.plaf.LayerUI;

import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.plaf.XendraPLAF;

public class WaitLayerUI extends LayerUI<JPanel> implements ActionListener {
	private boolean mIsRunning;
	private Timer mTimer;
	/** The Image               */
	public static Image         s_image = Env.getImage("XE10030.gif");
	/** The Message Font        */
	public static Font          s_font = new Font("Dialog", 3, 14);
	/** The Message Color       */
	public static Color         s_color = XendraPLAF.getTextColor_OK();
	private static final int    GAP = 4;
	private static final int RADIUS = 30;
	private static final int NUMBER_OF_CIRCLES = 10;	 
	private int darkCircle = 0;	
	private int value = 0;
	private String message = Msg.getMsg(Env.getCtx(), "Processing");

	@Override
	public void paint (Graphics g, JComponent c) {
		super.paint(g, c);
		if (!mIsRunning) {
			return;
		}		
		Graphics2D g2d = (Graphics2D) g;	

		Dimension panelSize = c.getSize();
		g2d.setColor(new Color(1f,1f,1f, 0.4f));      //  .5 is a bit too light
		g2d.fillRect(0,0, panelSize.width, panelSize.height);
		//
		g2d.setFont(s_font);
		g2d.setColor(s_color);
		FontMetrics fm = g.getFontMetrics();
		Dimension messageSize = new Dimension (fm.stringWidth(message), fm.getAscent() + fm.getDescent());
		Dimension imageSize = new Dimension (s_image.getWidth(c), s_image.getHeight(c));		
		Dimension progressSize = new Dimension(10, 30);

		//  Horizontal layout
		int height = imageSize.height + GAP + messageSize.height + GAP + progressSize.height;
		if (height > panelSize.height)
		{
			return;
		}
		int yImage = (panelSize.height/2) - (height/2);
		int yMessage = yImage + imageSize.height + GAP + fm.getAscent();		
		int yProgress = yMessage + progressSize.height + GAP;

		//  Vertical layout
		if (imageSize.width > panelSize.width || messageSize.width > panelSize.width)
		{
			return;
		}
		int xImage = (panelSize.width/2) - (imageSize.width/2);
		int xMessage = (panelSize.width/2) - (messageSize.width/2);
		int xProgress = (panelSize.width/2) - (progressSize.width/2);

		g2d.drawImage(s_image, xImage, yImage, c);
		g2d.drawString(message, xMessage, yMessage);
		int circularX, circularY;
		for (int i = 0; i < NUMBER_OF_CIRCLES; i++) {
			circularX = xProgress + (int) (RADIUS * Math.sin((360 / NUMBER_OF_CIRCLES) * i * 3.14 / 180));
			circularY = yProgress + (int) (RADIUS * Math.cos((360 / NUMBER_OF_CIRCLES) * i * 3.14 / 180));
			if(darkCircle == i) {
				g2d.setColor(Color.BLACK);
				g2d.fillOval(circularX, circularY, 10, 10);
				g2d.setColor(Color.WHITE);
				g2d.drawOval(circularX, circularY, 10, 10);
			} else {		    	
				g2d.setColor(Color.GRAY);
				g2d.fillOval(circularX, circularY, 10, 10);
				g2d.setColor(Color.WHITE);
				g2d.drawOval(circularX, circularY, 10, 10);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (mIsRunning) {			
			value++;
			darkCircle = NUMBER_OF_CIRCLES - 1 - (value % NUMBER_OF_CIRCLES);			
		}
		else {
			mTimer.stop();
		}	          
		firePropertyChange("tick", 0, 1);          				
	}

	public void start() {
		if (mIsRunning) {
			return;
		}

		// Run a thread for animation.
		mIsRunning = true;
		int tick = 1000;
		mTimer = new Timer(tick, this);
		mTimer.start();
	}

	public void stop() {
		mIsRunning = false;
	}

	@Override
	public void applyPropertyChange(PropertyChangeEvent pce, JLayer l) {
		if ("tick".equals(pce.getPropertyName())) {
			l.repaint();
		}
	}

	public void setMessage(String message) {
		this.message = message; 		
	}
}