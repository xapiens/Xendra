package org.columba.core.gui.tagging;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.ListCellRenderer;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

import org.columba.core.tagging.TagManager;
import org.columba.core.tagging.api.ITag;
import org.columba.core.tagging.api.ITagEvent;
import org.columba.core.tagging.api.ITagListener;
import org.jdesktop.swingx.JXList;
import org.jdesktop.swingx.decorator.Highlighter;
//import org.jdesktop.swingx.decorator.HighlighterPipeline;
//import org.jdesktop.swingx.decorator.RolloverHighlighter;

public class TagList extends JXList {

	private DefaultListModel listModel;

	private JPopupMenu popup;
	
	public TagList() {
		super();

		// fill list model with tags
		listModel = new DefaultListModel();
		Iterator<ITag> it = TagManager.getInstance().getAllTags();
		while (it.hasNext()) {
			ITag tag = it.next();
			listModel.addElement(tag);
		}
		setModel(listModel);

		// replace with "MyListCellRenderer" for simple one-line renderer
		// replace with "MyComplexListCellRenderer" for an additional description line
		setCellRenderer(new MyListCellRenderer());

		setBorder(null);
	//	setHighlighters(new HighlighterPipeline(
	//			new Highlighter[] { new RolloverHighlighter(new Color(248, 248,
	//					248), Color.white) }));
		setRolloverEnabled(true);
		
		// popup menu 
		addMouseListener(new MyMouseListener());
		
		// update tag list if mode changes
		TagManager.getInstance().addTagListener(new MyTagListener());
	}

	public void setPopupMenu(JPopupMenu popup) {
		this.popup = popup;
	}
	
	class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			handleEvent(e);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			handlePopupEvent(e);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			handlePopupEvent(e);
		}

		/**
		 * @param e
		 */
		private void handlePopupEvent(MouseEvent e) {
			Point p = e.getPoint();
			if (e.isPopupTrigger()) {
				// check if a single entry is selected
				if (getSelectedIndices().length <= 1) {
					// select new item
					int index = locationToIndex(p);
					setSelectedIndex(index);
				}
				// show context menu
				popup.show(e.getComponent(), p.x, p.y);
			}
		}

		/**
		 * @param e
		 */
		private void handleEvent(MouseEvent e) {
		}
	}
	
	
	public ITag getSelectedTag() {
		return (ITag) getSelectedValue();
	}

	public Iterator<ITag> getSelectedTags() {
		Object[] values = getSelectedValues();
		Vector<ITag> v = new Vector<ITag>();

		for (Object o : values) {
			v.add((ITag) o);
		}

		return v.iterator();
	}

	class MyListCellRenderer extends JPanel implements ListCellRenderer {

		private Border lineBorder = new HeaderSeparatorBorder(new Color(230,
				230, 230));

		private JLabel nameLabel = new JLabel();

		MyListCellRenderer() {
			setLayout(new BorderLayout());

			add(nameLabel, BorderLayout.WEST);

			setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

			setOpaque(true);

		}

		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {

			if (isSelected) {
				setBackground(list.getSelectionBackground());
				setForeground(list.getSelectionForeground());
			} else {
				setBackground(list.getBackground());
				setForeground(list.getForeground());
			}

			ITag result = (ITag) value;

			nameLabel.setText(result.getName());
			if (result.getColor() != null)
				nameLabel.setIcon(createIcon(result.getColor()));
			else
				nameLabel.setIcon(createIcon(list.getBackground()));

			setToolTipText(result.getDescription());
			return this;
		}

	}

	class MyComplexListCellRenderer extends JPanel implements ListCellRenderer {

		private Border lineBorder = new HeaderSeparatorBorder(new Color(230,
				230, 230));

		private JLabel nameLabel = new JLabel();

		private JLabel descriptionLabel = new JLabel();

		private JLabel iconLabel = new JLabel();

		private JPanel centerPanel;

		MyComplexListCellRenderer() {

			descriptionLabel.setForeground(new Color(100, 100, 100));
			// descriptionLabel.setFont(descriptionLabel.getFont().deriveFont(Font.ITALIC));

			setLayout(new BorderLayout());

			centerPanel = new JPanel();
			centerPanel.setLayout(new BorderLayout());

			centerPanel.add(nameLabel, BorderLayout.NORTH);
			centerPanel.add(descriptionLabel, BorderLayout.CENTER);
			add(iconLabel, BorderLayout.WEST);
			add(centerPanel, BorderLayout.CENTER);

			setBorder(BorderFactory.createCompoundBorder(lineBorder,
					BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			iconLabel.setBorder(BorderFactory.createEmptyBorder(2, 4, 2, 8));

			centerPanel.setOpaque(false);
			setOpaque(true);

		}

		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {

			if (isSelected) {
				setBackground(list.getSelectionBackground());
				setForeground(list.getSelectionForeground());
			} else {
				setBackground(list.getBackground());
				setForeground(list.getForeground());
			}

			ITag result = (ITag) value;

			nameLabel.setText(result.getName());

			if (result.getColor() != null)
				iconLabel.setIcon(createIcon(result.getColor()));
			else
				iconLabel.setIcon(createIcon(list.getBackground()));

			if ( result.getDescription() != null)
				descriptionLabel.setText(result.getDescription());
			else
				descriptionLabel.setText("");
			
			setToolTipText(result.getDescription());
			return this;
		}

	}

	class HeaderSeparatorBorder extends AbstractBorder {

		protected Color color;

		public HeaderSeparatorBorder(Color color) {
			super();

			this.color = color;
		}

		/**
		 * Paints the border for the specified component with the specified
		 * position and size.
		 * 
		 * @param c
		 *            the component for which this border is being painted
		 * @param g
		 *            the paint graphics
		 * @param x
		 *            the x position of the painted border
		 * @param y
		 *            the y position of the painted border
		 * @param width
		 *            the width of the painted border
		 * @param height
		 *            the height of the painted border
		 */
		public void paintBorder(Component c, Graphics g, int x, int y,
				int width, int height) {
			Color oldColor = g.getColor();
			g.setColor(color);
			g.drawLine(x, y + height - 1, x + width - 1, y + height - 1);

			g.setColor(oldColor);
		}

		/**
		 * Returns the insets of the border.
		 * 
		 * @param c
		 *            the component for which this border insets value applies
		 */
		public Insets getBorderInsets(Component c) {
			return new Insets(0, 0, 1, 0);
		}

		/**
		 * Reinitialize the insets parameter with this Border's current Insets.
		 * 
		 * @param c
		 *            the component for which this border insets value applies
		 * @param insets
		 *            the object to be reinitialized
		 */
		public Insets getBorderInsets(Component c, Insets insets) {
			insets.left = insets.top = insets.right = insets.bottom = 1;
			return insets;
		}

	}

	class MyTagListener implements ITagListener {
		MyTagListener() {
		}

		public void tagChanged(ITagEvent event) {
			String tagId = event.getId();
			updateList();
		}

		public void tagAdded(ITagEvent event) {
			String tagId = event.getId();
			updateList();
		}

		public void tagDeleted(ITagEvent event) {
			String tagId = event.getId();
			updateList();
		}

		// real stupid recreation of whole list model
		// -> replace with id-based listmodel update
		private void updateList() {
			listModel = new DefaultListModel();
			Iterator<ITag> it = TagManager.getInstance().getAllTags();
			while (it.hasNext()) {
				ITag tag = it.next();
				listModel.addElement(tag);
			}
			int index = getSelectedIndex();
			clearSelection();
			setModel(listModel);
			if (index != -1)
				setSelectedIndex(index);
		}
	}

	private Icon createIcon(Color color) {
		int width = 16;
		int height = 16;
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);

		Graphics2D graphics = (Graphics2D) image.getGraphics();
		graphics.setColor(darker(color));
		graphics.drawRect(1, 1, width - 3, height - 3);
		graphics.setColor(color);
		graphics.fillRect(2, 2, width - 4, height - 4);
		graphics.dispose();

		return new ImageIcon(image);
	}

	private final static double FACTOR = 0.90;

	private Color darker(Color c) {
		return new Color(Math.max((int) (c.getRed() * FACTOR), 0), Math.max(
				(int) (c.getGreen() * FACTOR), 0), Math.max(
				(int) (c.getBlue() * FACTOR), 0));
	}

}
