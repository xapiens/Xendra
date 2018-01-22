package org.frapuccino.htmleditor.action;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import org.frapuccino.htmleditor.HtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public class BoldFormatAction extends AbstractSelectableEditorAction {

	public BoldFormatAction(HtmlEditorController controller) {
		super(controller, controller.getResourceBundle().getString(
				"menu_format_bold"));

		putValue(SHORT_DESCRIPTION, controller.getResourceBundle().getString(
				"menu_format_bold_tooltip"));

		// shortcut key
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_B, Toolkit
				.getDefaultToolkit().getMenuShortcutKeyMask()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getController().toggleBold();
	}

	@Override
	public void formatChanged(FormatChangedEvent event) {
		setSelected(event.getInfo().isBold());
	}

}
