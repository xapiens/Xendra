package org.frapuccino.htmleditor.action;

import java.awt.event.ActionEvent;

import org.frapuccino.action.AbstractSelectableAction;
import org.frapuccino.htmleditor.api.IFormatChangedListener;
import org.frapuccino.htmleditor.api.IHtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public abstract class AbstractSelectableEditorAction extends
		AbstractSelectableAction implements IFormatChangedListener {

	private IHtmlEditorController controller;

	public AbstractSelectableEditorAction(IHtmlEditorController controller,
			String name) {
		super(name);

		this.controller = controller;
		this.controller.addFormatChangedListener(this);
	}

	public abstract void formatChanged(FormatChangedEvent event);

	public abstract void actionPerformed(ActionEvent event);

	public IHtmlEditorController getController() {
		return controller;
	}
}
