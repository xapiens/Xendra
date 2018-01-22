package org.columba.core.gui.tagging;

import javax.swing.JPopupMenu;

import org.columba.api.gui.frame.IFrameMediator;

public class TagPopupMenu extends JPopupMenu{
	
	private TagList tagList;
	
	public TagPopupMenu(IFrameMediator controller, TagList tagList) {
		this.tagList = tagList;
		
		add(new AddTagAction(controller));
		add(new EditTagAction(controller, tagList));
		add(new RemoveTagAction(controller, tagList));
	}

	
}
