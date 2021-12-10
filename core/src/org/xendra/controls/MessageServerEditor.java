package org.xendra.controls;

import java.awt.event.ActionEvent;

public class MessageServerEditor extends OptionFormEditor {
	public void actionPerformed(ActionEvent e) {
		MessageServerDialog dlg = new MessageServerDialog(vp);
	}	
}