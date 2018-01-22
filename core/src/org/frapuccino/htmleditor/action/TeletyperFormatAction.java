package org.frapuccino.htmleditor.action;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import org.frapuccino.htmleditor.HtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public class TeletyperFormatAction extends AbstractSelectableEditorAction {

	public TeletyperFormatAction(HtmlEditorController controller) {
		super(controller, controller.getResourceBundle().getString(
				"menu_format_teletyper"));

		putValue(SHORT_DESCRIPTION, controller.getResourceBundle().getString(
				"menu_format_teletyper_tooltip"));

		// shortcut key
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_T, Toolkit
				.getDefaultToolkit().getMenuShortcutKeyMask()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getController().toggleTeleTyper();
	}

	@Override
	public void formatChanged(FormatChangedEvent event) {
		setSelected(event.getInfo().isTeleTyper());
	}

}
