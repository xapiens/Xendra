package org.columba.core.gui.tagging;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.columba.api.exception.StoreException;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.columba.core.tagging.TagManager;
import org.columba.core.tagging.api.ITag;
import org.compiere.util.CLogMgt;

public class EditTagAction extends AbstractColumbaAction {

	final static String EDIT_TAG = "Edit Tag...";

	private TagList list;

	public EditTagAction(IFrameMediator frameMediator, TagList list) {
		super(frameMediator, EDIT_TAG);
		this.list = list;
	}

	public void actionPerformed(ActionEvent arg0) {

		JFrame frame = getFrameMediator().getContainer().getFrame();

		ITag tag = list.getSelectedTag();

		EditTagDialog editTagDialog = new EditTagDialog(frame, tag.getName(),
				tag.getColor(), tag.getDescription());
		if (editTagDialog.getSuccess()) {

			String name = editTagDialog.getName();
			Color color = editTagDialog.getColor();
			String descr = editTagDialog.getDescription();

			if (name != null && name.length() > 0)
				tag.setName(name);
			if (color != null)
				tag.setColor(color);
			if ( descr != null)
				tag.setDescription(descr);

			try {
				TagManager.getInstance().replaceTag(tag);
			} catch (StoreException e) {
				if (CLogMgt.DEBUG)
					e.printStackTrace();
				JOptionPane.showMessageDialog(frame, GlobalResourceLoader.getString(
								"org.columba.core.i18n.dialog", "tagging", "EditTagAction.error_edit"));
			}

		}
	}

}
