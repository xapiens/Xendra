package org.columba.core.gui.tagging;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.menu.IMenu;
import org.columba.core.main.Bootstrap;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.columba.core.tagging.TagManager;
import org.columba.core.tagging.api.ITag;
import org.columba.core.tagging.api.ITagEvent;
import org.columba.core.tagging.api.ITagListener;

/**
 * Abstract base class for a tagging menu.
 * <p>
 * 
 * @author fdietz
 * 
 * @author frd
 */
public abstract class TaggingMenu extends IMenu {

	public TaggingMenu(IFrameMediator controller, String name, String id) {
		super(controller, name, id);

		createSubMenu();

		// update menu if tags are changed
		TagManager.getInstance().addTagListener(new MyTagListener());
	}

	protected void createSubMenu() {

		if (!Bootstrap.ENABLE_TAGS)
			return;

		// TODO (@author hubms): implement custom menuitem renderer
		JMenuItem item = new JMenuItem(GlobalResourceLoader.getString("org.columba.core.i18n.dialog",
				"tagging", "TaggingMenu.none"));
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// fire callback to remove all tags from selected items
				removeAllTags();
			}
		});
		add(item);
		addSeparator();

		// don't want to have two separators
		boolean tags = false;

		// add all existing tags to the menu
		for (Iterator<ITag> iter = TagManager.getInstance().getAllTags(); iter
				.hasNext();) {
			final ITag tag = iter.next();
			final JCheckBoxMenuItem menuItem = new JCheckBoxMenuItem(tag
					.getName());

			// mark tag, if the current selection is tagged with it
			final boolean tagged = isTagged(tag);

			if ( tag.getDescription() != null)
				menuItem.setToolTipText(tag.getDescription());
			
			if ( tag.getColor() != null )
				menuItem.setIcon(createIcon(tag.getColor()));
			
			menuItem.setSelected(tagged);

			menuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (menuItem.isSelected())
						assignTag(tag.getId());
					else
						removeTag(tag.getId());
				}
			});
			add(menuItem);

			tags = true;
		}

		if (tags)
			addSeparator();

		JMenuItem editTagItem = new JMenuItem(GlobalResourceLoader.getString(
				"org.columba.core.i18n.dialog", "tagging", "TaggingMenu.edit"));
		editTagItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// not implemented yet
			}
		});
		add(editTagItem);

	}

	// listener updates menu in case the tags where changed
	class MyTagListener implements ITagListener {
		MyTagListener() {
		}

		public void tagChanged(ITagEvent event) {
			String tagId = event.getId();
			updateMenu();
		}

		public void tagAdded(ITagEvent event) {
			String tagId = event.getId();
			updateMenu();
		}

		public void tagDeleted(ITagEvent event) {
			String tagId = event.getId();
			updateMenu();
		}

		// real stupid recreation of whole menu model
		private void updateMenu() {
			removeAll();
			createSubMenu();
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
	

	/** **************** overwrite callback methods ************************ */

	/**
	 * Check if the current selection has the specific tag assigned to it.
	 * 
	 * @param tag
	 * @return
	 */
	protected abstract boolean isTagged(ITag tag);

	/**
	 * Method is called if tag should be added to selected elements
	 * 
	 * @param tagId
	 */
	protected abstract void assignTag(String tagId);

	/**
	 * Method is called if tag should be removed from selected elements
	 * 
	 * @param tagId
	 */
	protected abstract void removeTag(String tagId);

	/**
	 * Methid is called if all tags should be removed from the selected elements
	 * 
	 */
	protected abstract void removeAllTags();

}
