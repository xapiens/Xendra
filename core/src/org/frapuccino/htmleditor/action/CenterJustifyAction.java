package org.frapuccino.htmleditor.action;

import java.awt.event.ActionEvent;

import org.frapuccino.htmleditor.HtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public class CenterJustifyAction extends AbstractSelectableEditorAction {

	public CenterJustifyAction(HtmlEditorController controller) {
		super(controller, controller.getResourceBundle().getString(
				"menu_format_center_justify"));

		putValue(SHORT_DESCRIPTION, controller.getResourceBundle().getString(
				"menu_format_center_justify_tooltip"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getController().setCenterJustify();
	}

	@Override
	public void formatChanged(FormatChangedEvent event) {
		setSelected(event.getInfo().isAlignCenter());
	}

}
