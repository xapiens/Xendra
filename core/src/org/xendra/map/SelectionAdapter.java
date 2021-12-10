package org.xendra.map;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import org.compiere.apps.ADialog;
import org.compiere.grid.ed.VLocationDialog;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.GeoPosition;

/**
 * Creates a selection rectangle based on mouse input
 * Also triggers repaint events in the viewer
 * @author Martin Steiger
 */
public class SelectionAdapter extends MouseAdapter 
{
	private boolean dragging;
	private JXMapViewer viewer;
	private VLocationDialog m_locationdialog;

	private Point2D startPos = new Point2D.Double();
	private Point2D endPos = new Point2D.Double();

	/**
	 * @param viewer the jxmapviewer
	 * @param m_location 
	 */
	public SelectionAdapter(JXMapViewer viewer, VLocationDialog dialog)
	{
		this.viewer = viewer;
		m_locationdialog = dialog;
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		if (e.getButton() != MouseEvent.BUTTON3)
			return;

		startPos.setLocation(e.getX(), e.getY());
		endPos.setLocation(e.getX(), e.getY());

		dragging = true;
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		if (!dragging)
			return;

		endPos.setLocation(e.getX(), e.getY());

		viewer.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		if (e.getButton() == MouseEvent.BUTTON3) {
			if (ADialog.ask(0, null, String.format("vincular a %s", m_locationdialog.getLocationName()))) {
				Rectangle bounds = viewer.getViewportBounds();
				int x = bounds.x + e.getX();
				int y = bounds.y + e.getY();
				Point pixelCoordinates = new Point(x, y);			
				GeoPosition geodefault = viewer.getTileFactory().pixelToGeo(pixelCoordinates, viewer.getZoom());
				m_locationdialog.setGeoPosition(geodefault);
			}
		}
		if (!dragging)
			return;

		if (e.getButton() != MouseEvent.BUTTON3)
			return;

		viewer.repaint();

		dragging = false;
	}

	/**
	 * @return the selection rectangle
	 */
	public Rectangle getRectangle()
	{
		if (dragging)
		{
			int x1 = (int) Math.min(startPos.getX(), endPos.getX());
			int y1 = (int) Math.min(startPos.getY(), endPos.getY());
			int x2 = (int) Math.max(startPos.getX(), endPos.getX());
			int y2 = (int) Math.max(startPos.getY(), endPos.getY());

			return new Rectangle(x1, y1, x2-x1, y2-y1);
		}

		return null;
	}
}