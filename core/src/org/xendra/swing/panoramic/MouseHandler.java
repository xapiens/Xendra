package org.xendra.swing.panoramic;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {

	private PanelDraw m_drawpanel;

	public MouseHandler(PanelDraw p) {
		m_drawpanel = p;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Rectangle r = m_drawpanel.getBounds();		
		Point p = toFramePoint( e.getX(), e.getY() );
		m_drawpanel.setPoint(p);
		System.out.println(p);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	protected Point toFramePoint(int x, int y) {
		final int grid = m_drawpanel.getGrid();
		x = x / grid;
		y = y / grid;
		return new Point(x, y);
	}

}
