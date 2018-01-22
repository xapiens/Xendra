package org.frapuccino.htmleditor.action;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import org.frapuccino.htmleditor.HtmlEditorController;
import org.frapuccino.htmleditor.event.FormatChangedEvent;

public class StrikeoutFormatAction extends AbstractSelectableEditorAction {

	public StrikeoutFormatAction(HtmlEditorController controller) {
		super(controller, controller.getResourceBundle().getString(
				"menu_format_strike"));

		putValue(SHORT_DESCRIPTION, controller.getResourceBundle().getString(
				"menu_format_strike_tooltip"));

		// shortcut key
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit
				.getDefaultToolkit().getMenuShortcutKeyMask()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getController().toggleStrikeout();
	}

	@Override
	public void formatChanged(FormatChangedEvent event) {
		setSelected(event.getInfo().isStrikeout());
	}

}
