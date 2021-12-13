package org.columba.core.gui.tagging;

import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.columba.api.exception.StoreException;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.tagging.TagManager;
import org.columba.core.tagging.api.ITag;
import org.compiere.util.CLogMgt;

public class RemoveTagAction extends AbstractColumbaAction {

	final static String REMOVE_TAG = "Remove Tag";

	private TagList tagList;

	public RemoveTagAction(IFrameMediator frameMediator, TagList tagList) {
		super(frameMediator, REMOVE_TAG);
		this.tagList = tagList;
	}

	public void actionPerformed(ActionEvent arg0) {
		Iterator<ITag> it = tagList.getSelectedTags();

		while (it.hasNext() ) {
			ITag tag = it.next();

			try {
				TagManager.getInstance().removeTag(tag.getId());
			} catch (StoreException e) {
				if ( CLogMgt.DEBUG)
					e.printStackTrace();
				JOptionPane.showMessageDialog(FrameManager.getInstance()
						.getActiveFrame(), "Error deleting Tag");
			}
		}
	}

}
