package org.xendra.swing.panoramic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.compiere.model.MPeriod;
import org.compiere.util.Env;

import javax.swing.JPanel;

public class PanelDraw extends JPanel {
	private static final Color TRANS_COL = new Color(0, 0, 0, 0);
	private Integer C_Year_ID = 0;
	List<MPeriod> periods = new ArrayList<MPeriod>();
	PanoramicCtrl  panoramicCtrl;
	Clip clip;
	private int offsetyear = 0;	
	public PanelDraw(PanoramicCtrl panoramicCtrl) {
		this.panoramicCtrl = panoramicCtrl;
		addMouseListener(new MouseAdapter() {
			private Color defaultBackground;

			@Override
			public void mouseEntered(MouseEvent e) {
				defaultBackground = getBackground();
				//setBackground(Color.BLUE);
				Point x = e.getPoint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(defaultBackground);
			}
		});
	}
	public boolean showGrid() {
		return true; 
	}
	public final void paintClip(Graphics gr, final boolean drawTransparentColour) {
		Graphics2D g = (Graphics2D)gr;				
		Font font = new Font("Serif", Font.PLAIN, 12);
		g.setFont(font);
		int xx = 20;
		int yy = 50;		
		final int transCol = -1; // Tool.getPicture().getTransparent();
		final boolean showGrid = showGrid();
		final int w = clip.getWidth();
		final int h = clip.getHeight();
		final int grid = getGrid();
		int x = 0;
		int y = 50;
		
		for (int row = 0; row < h; row++) {
			//float as=-5;
			float as = 11;
			offsetyear = 0;
			for (int column = 0; column < w; column++) {
				MPeriod p = periods.get(column);
				if (C_Year_ID  > 0) {
					if (p.getC_Year_ID() < C_Year_ID) {
						offsetyear++;
						continue;
					}
				}
				// pixel
				int c = clip.getPixel(column, row);				
				if (c == transCol) {
					if (drawTransparentColour) {
						g.setColor(TRANS_COL);
						g.fillRect(x, y, grid, grid);
					}
				}
				else {
					if (c == 6) {
						g.setColor(Color.red);
					} else if( c == 7) {
						g.setColor(Color.green);
					} else if (c == 8) {
						g.setColor(new Color(100,0,0));
					} else if (c == 9) {
						g.setColor(new Color(0,100,0));
					} else {
						g.setColor(Color.white);	
					}					
					g.fillRect(x, y, grid, grid);
				}
				// grid
				if (showGrid) {
					g.setColor(Color.darkGray);					
					g.drawRect(x, y, grid, grid);
				}
				x = x + grid;
				
				if (column <= periods.size()) {
					AffineTransform oldTransform = g.getTransform();
					g.transform(AffineTransform.getRotateInstance(Math.PI*-18.5));					
					g.drawString(p.getName(), -40f, as);
					g.setTransform(oldTransform);
				}			
				as+=16f;

			}
			x = 0;
			y = y + grid;
		}	
	}

	int getGrid() {
		return 16;
	}
	public void setPreferredSize(Dimension dim) {
		super.setPreferredSize(dim);
		setBounds(0, 0, dim.width, dim.height);
		invalidate();
	}

	public final void paint(Graphics g) {
		super.paint(g);

		if (clip == null) {
			return;
		}
		paintClip(g, false);
	}
	public void setPeriods(MPeriod start, List<MPeriod> periods, int lines) {
		this.periods = periods;
		clip = new Clip(periods.size(), lines, 2);
		setPreferredSize(new Dimension(periods.size()*getGrid(), lines*getGrid()));
	}
	public void setPixel(int x, int y, int color) {
		clip.setPixel(x, y, color);		
	}
	public void setPoint(Point p) {
		Point newp = new Point(p.x + offsetyear, p.y);		
		//Point newp = new Point(p.x , p.y);
		//panoramicCtrl.setPoint(p);		
		panoramicCtrl.setPoint(newp);
	}
	public void setYear(Integer C_Year_ID) {
		this.C_Year_ID = C_Year_ID;		
	}
}
