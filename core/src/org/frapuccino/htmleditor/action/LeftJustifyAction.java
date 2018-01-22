package org.frapuccino.htmleditor.action;

import java.awt.event.ActionEvent;

import org.frapuccino.htmleditor.HtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public class LeftJustifyAction extends AbstractSelectableEditorAction {

	public LeftJustifyAction(HtmlEditorController controller) {
		super(controller, controller.getResourceBundle().getString(
				"menu_format_left_justify"));

		putValue(SHORT_DESCRIPTION, controller.getResourceBundle().getString(
				"menu_format_left_justify_tooltip"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getController().setLeftJustify();
	}

	@Override
	public void formatChanged(FormatChangedEvent event) {
		setSelected(event.getInfo().isAlignLeft());
	}

}
