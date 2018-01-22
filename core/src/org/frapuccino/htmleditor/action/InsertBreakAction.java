package org.frapuccino.htmleditor.action;

import java.awt.event.ActionEvent;

import org.frapuccino.htmleditor.HtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public class InsertBreakAction extends AbstractEditorAction {

	public InsertBreakAction(HtmlEditorController controller) {
		super(controller, controller.getResourceBundle()
				.getString("menu_break"));

		putValue(SHORT_DESCRIPTION, controller.getResourceBundle().getString(
				"menu_break_tooltip"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getController().insertBreak();
	}

	@Override
	public void formatChanged(FormatChangedEvent event) {
		// insert break is always enabled
	}

}
