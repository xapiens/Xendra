package org.frapuccino.htmleditor.action;

import java.awt.event.ActionEvent;

import org.frapuccino.htmleditor.HtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public class RightJustifyAction extends AbstractSelectableEditorAction {

	public RightJustifyAction(HtmlEditorController controller) {
		super(controller, controller.getResourceBundle().getString(
				"menu_format_right_justify"));

		putValue(SHORT_DESCRIPTION, controller.getResourceBundle().getString(
				"menu_format_right_justify_tooltip"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getController().setRightJustify();
	}

	@Override
	public void formatChanged(FormatChangedEvent event) {
		setSelected(event.getInfo().isAlignRight());
	}

}
