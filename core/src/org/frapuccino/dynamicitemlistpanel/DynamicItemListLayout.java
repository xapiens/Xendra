/**
 * 
 */
package org.frapuccino.dynamicitemlistpanel;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.util.Vector;

import javax.swing.JComponent;

/**
 * @author Frederik
 * 
 */
public class DynamicItemListLayout implements LayoutManager {

	/**
	 * This value indicates that each row of components should be
	 * left-justified.
	 */
	public static final int LEFT = 0;

	/**
	 * This value indicates that each row of components should be centered.
	 */
	public static final int CENTER = 1;

	/**
	 * This value indicates that each row of components should be
	 * right-justified.
	 */
	public static final int RIGHT = 2;

	/**
	 * This value indicates that each row of components should be justified to
	 * the leading edge of the container's orientation, for example, to the left
	 * in left-to-right orientations.
	 * 
	 */
	public static final int LEADING = 3;

	/**
	 * This value indicates that each row of components should be justified to
	 * the trailing edge of the container's orientation, for example, to the
	 * right in left-to-right orientations.
	 */
	public static final int TRAILING = 4;

	int align;

	/**
	 * The flow layout manager allows a seperation of components with gaps. The
	 * horizontal gap will specify the space between components and between the
	 * components and the borders of the <code>Container</code>.
	 */
	int hgap;

	/**
	 * The flow layout manager allows a seperation of components with gaps. The
	 * vertical gap will specify the space between rows and between the the rows
	 * and the borders of the <code>Container</code>.
	 */
	int vgap;

	/**
	 * number of rows used by layout
	 */
	int rows;

	int maxRows;

	int prefWidth;

	int prefHeight;

	Vector vector = new Vector();

	JComponent label;

	/**
	 * 
	 */
	public DynamicItemListLayout(int hgap, int vgap, int maxRows,
			JComponent label) {
		this.align = LEADING;
		this.hgap = hgap;
		this.vgap = vgap;

		this.maxRows = maxRows;
		this.label = label;

	}

	public DynamicItemListLayout(int maxRows, JComponent label) {
		this(5, 5, maxRows, label);
	}

	public void addItem(Component c) {
		vector.add(c);
	}

	public Component getLastItem() {
		if (vector.size() == 0)
			return null;
		
		
		return (Component) vector.get(vector.size() - 1);
	}
	
	public Component getSecondLastItem() {
		if ( vector.size() == 0 ) return null;
		
		if ( vector.size() <2) return null;
		
		return (Component) vector.get(vector.size() -2);
	}

	public int getRowCount() {
		return rows;
	}

    /**
     * Returns the flow layout manager allows a seperation of components with gaps. The
     * horizontal gap will specify the space between components and between the
     * components and the borders of the <code>Container</code>.
     *
     * @return the flow layout manager allows a seperation of components with gaps. The
     */
    public int getHgap() {
        return hgap;
	}

    /**
     * Returns the flow layout manager allows a seperation of components with gaps. The
     * vertical gap will specify the space between rows and between the the rows
     * and the borders of the <code>Container</code>.
     *
     * @return the flow layout manager allows a seperation of components with gaps. The
     */
    public int getVgap() {
        return vgap;
	}

	/**
	 * @see java.awt.LayoutManager#addLayoutComponent(java.lang.String,
	 *      java.awt.Component)
	 */
	public void addLayoutComponent(String name, Component comp) {

	}

	/**
	 * @see java.awt.LayoutManager#removeLayoutComponent(java.awt.Component)
	 */
	public void removeLayoutComponent(Component comp) {

	}

	/**
	 * @see java.awt.LayoutManager#preferredLayoutSize(java.awt.Container)
	 */
	public Dimension preferredLayoutSize(Container parent) {
		synchronized (parent.getTreeLock()) {
			Dimension dim = new Dimension(0, 0);
			int nmembers = parent.getComponentCount();
			boolean firstVisibleComponent = true;

			for (int i = 0; i < nmembers; i++) {
				Component m = parent.getComponent(i);
				if (m.isVisible()) {
					Dimension d = m.getPreferredSize();
					dim.height = Math.max(dim.height, d.height);
					if (firstVisibleComponent) {
						firstVisibleComponent = false;
					} else {
						dim.width += hgap;
					}
					dim.width += d.width;
				}
			}
			Insets insets = parent.getInsets();
			dim.width += insets.left + insets.right + hgap * 2;
			// dim.height += insets.top + insets.bottom + vgap * 2;
			dim.height += insets.top + insets.bottom;

			return dim;
		}

	}

	/**
	 * @see java.awt.LayoutManager#minimumLayoutSize(java.awt.Container)
	 */
	public Dimension minimumLayoutSize(Container parent) {
		synchronized (parent.getTreeLock()) {
			Dimension dim = new Dimension(0, 0);
			int nmembers = parent.getComponentCount();

			for (int i = 0; i < nmembers; i++) {
				Component m = parent.getComponent(i);
				if (m.isVisible()) {
					Dimension d = m.getMinimumSize();
					dim.height = Math.max(dim.height, d.height);
					if (i > 0) {
						dim.width += hgap;
					}
					dim.width += d.width;
				}
			}
			Insets insets = parent.getInsets();
			dim.width += insets.left + insets.right + hgap * 2;
			// dim.height += insets.top + insets.bottom + vgap * 2;
			dim.height += insets.top + insets.bottom;
			return dim;
		}

	}

	/**
	 * @see java.awt.LayoutManager#layoutContainer(java.awt.Container)
	 */
	public void layoutContainer(Container parent) {
		synchronized (parent.getTreeLock()) {
			Insets insets = parent.getInsets();
			int maxwidth = parent.getWidth()
					- (insets.left + insets.right + hgap * 2);

			parent.removeAll();

			prefWidth = parent.getWidth();
			prefHeight = 0;

			int nmembers = 0;
			// int x = 0, y = insets.top + vgap;
			int x = 0, y = insets.top;
			int rowh = 0, start = 0;

			boolean ltr = parent.getComponentOrientation().isLeftToRight();

			rows = 1;
			for (int i = 0; i < vector.size(); i++) {
				Component m = (Component) vector.get(i);

				if (m.isVisible()) {
					Dimension d = m.getPreferredSize();
					m.setSize(d.width, d.height);

					if ((x == 0) || ((x + d.width) <= maxwidth)) {
						// there's still space left
						if (x > 0) {
							x += hgap;
						}
						x += d.width;
						rowh = Math.max(rowh, d.height);

						parent.add(m);
						nmembers++;
					} else {
						// start new row

						if (rows == maxRows) {
							d = label.getPreferredSize();
							while ((x + d.width) > maxwidth) {
								int count = parent.getComponentCount();
								if (count == 0)
									break;
								Component c = parent.getComponent(count - 1);
								x -= c.getWidth();
								parent.remove(count - 1);
								nmembers--;
							}

							parent.add(label);
							nmembers++;

							label.setSize(d.width, d.height);
							x += d.getWidth();
							rowh = Math.max(rowh, d.height);

							break;
						} else {
							parent.add(m);
							nmembers++;

							moveComponents(parent, insets.left + hgap, y,
									maxwidth - x, rowh, start, i, ltr);
							x = d.width;
							y += vgap + rowh;
							rowh = d.height;
							start = i;
							rows++;
						}
					}
				}
			}

			prefHeight = y + rowh + vgap + insets.bottom;

			moveComponents(parent, insets.left + hgap, y, maxwidth - x, rowh,
					start, nmembers, ltr);
		}

	}

	/**
	 * Centers the elements in the specified row, if there is any slack.
	 * 
	 * @param target
	 *            the component which needs to be moved
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the y coordinate
	 * @param width
	 *            the width dimensions
	 * @param height
	 *            the height dimensions
	 * @param rowStart
	 *            the beginning of the row
	 * @param rowEnd
	 *            the the ending of the row
	 */
	private void moveComponents(Container target, int x, int y, int width,
			int height, int rowStart, int rowEnd, boolean ltr) {
		synchronized (target.getTreeLock()) {
			switch (align) {
			case LEFT:
				x += ltr ? 0 : width;
				break;
			case CENTER:
				x += width / 2;
				break;
			case RIGHT:
				x += ltr ? width : 0;
				break;
			case LEADING:
				break;
			case TRAILING:
				x += width;
				break;
			}
			for (int i = rowStart; i < rowEnd; i++) {
				Component m = target.getComponent(i);
				if (m.isVisible()) {
					if (ltr) {
						m.setLocation(x, y + (height - m.getHeight()) / 2);
					} else {
						m.setLocation(target.getWidth() - x - m.getWidth(), y
								+ (height - m.getHeight()) / 2);
					}
					x += m.getWidth() + hgap;
				}
			}
		}
	}

	public int getPrefHeight() {
		return prefHeight;
	}

	public int getPrefWidth() {
		return prefWidth;
	}

}
