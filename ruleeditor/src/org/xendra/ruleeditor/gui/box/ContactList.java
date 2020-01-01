package org.xendra.ruleeditor.gui.box;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
//import org.compiere.model.persistence.X_AD_Rule;
import org.jdesktop.swingx.JXHyperlink;
import org.jdesktop.swingx.JXList;
import org.jdesktop.swingx.decorator.Highlighter;
import org.jdesktop.swingx.decorator.HighlighterFactory;
import org.jdesktop.swingx.decorator.HighlighterPipeline;
import org.jdesktop.swingx.decorator.RolloverHighlighter;
import org.xendra.ruleeditor.folder.AbstractFolder;

class ContactList extends JXList {

	public ContactList() {
		super();
		setCellRenderer(new MyListCellRenderer());
		setBorder(null);
		setHighlighters(new HighlighterPipeline(
				new Highlighter[] { new RolloverHighlighter(new Color(248, 248,	248), Color.white) }));
		setRolloverEnabled(true);
	}

	public void addAll(List<AbstractFolder> list) {
		Iterator<AbstractFolder> it = list.iterator();
		while (it.hasNext()) {
			addElement(it.next());
		}
	}

	public void add(AbstractFolder result) {
		addElement(result);
	}

	/**
	 * ********************** filtering
	 * *********************************************
	 */

	/**
	 * Associates filtering document listener to text component.
	 */

	public void installJTextField(JTextField input) {
		if (input != null) {
			FilteringModel model = (FilteringModel) getModel();
			input.getDocument().addDocumentListener(model);
		}
	}

	/**
	 * Disassociates filtering document listener from text component.
	 */

	public void uninstallJTextField(JTextField input) {
		if (input != null) {
			FilteringModel model = (FilteringModel) getModel();
			input.getDocument().removeDocumentListener(model);
		}
	}

	/**
	 * Doesn't let model change to non-filtering variety
	 */

	public void setModel(ListModel model) {
		if (!(model instanceof FilteringModel)) {
			throw new IllegalArgumentException();
		} else {
			super.setModel(model);
		}
	}

	/**
	 * Adds item to model of list
	 */
	public void addElement(AbstractFolder element) {
		((FilteringModel) getModel()).addElement(element);
	}

	class MyListCellRenderer extends JPanel implements ListCellRenderer {

		private JLabel iconLabel = new JLabel();
		private JLabel titleLabel = new JLabel();
		private JXHyperlink descriptionLabel = new JXHyperlink();
		private JPanel centerPanel;
		private Border lineBorder = new HeaderSeparatorBorder(new Color(230, 230, 230));

		MyListCellRenderer() {
			setLayout(new BorderLayout());

			centerPanel = new JPanel();
			centerPanel.setLayout(new BorderLayout());

			centerPanel.add(titleLabel, BorderLayout.NORTH);
			centerPanel.add(descriptionLabel, BorderLayout.CENTER);
			add(iconLabel, BorderLayout.WEST);
			add(centerPanel, BorderLayout.CENTER);

			setBorder(BorderFactory.createCompoundBorder(lineBorder,
					BorderFactory.createEmptyBorder(2, 2, 2, 2)));
			iconLabel.setBorder(BorderFactory.createEmptyBorder(2, 4, 2, 4));

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

			AbstractFolder result = (AbstractFolder) value;

			titleLabel.setText(result.getName());
			iconLabel.setIcon(ImageLoader.getSmallIcon(IconKeys.USER));
			descriptionLabel.setText(result.getName());

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
}
