package org.columba.core.gui.tagging;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.columba.api.exception.StoreException;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.logging.Logging;
import org.columba.core.tagging.TagManager;
import org.columba.core.tagging.api.ITag;

public class AddTagAction extends AbstractColumbaAction {

	final static String ADD_TAG = "Add Tag...";

	public AddTagAction(IFrameMediator frameMediator) {
		super(frameMediator, ADD_TAG);
	}

	public void actionPerformed(ActionEvent arg0) {
		JFrame frame = getFrameMediator().getContainer().getFrame();
		EditTagDialog dialog = new EditTagDialog(frame);

		if (dialog.getSuccess()) {
			String tagName = dialog.getName();
			Color color = dialog.getColor();

			if (tagName != null && tagName.length() > 0) {
				Color c = dialog.getColor();
				String descr = dialog.getDescription();
				try {
					ITag tag = TagManager.getInstance().addTag(tagName);
					if ( color != null) tag.setColor(color);
					if ( descr != null ) tag.setDescription(descr);

					if (tag == null)
						JOptionPane.showMessageDialog(frame, "Error adding Tag");

				} catch (StoreException e) {
					if (Logging.DEBUG)
						e.printStackTrace();
					JOptionPane.showMessageDialog(frame, "Error adding Tag");
				}
			}

		}

	}

}
