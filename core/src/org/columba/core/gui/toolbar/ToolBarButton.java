//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2006.
//
//All Rights Reserved.

package org.columba.core.gui.toolbar;

import java.awt.Insets;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 * ToolBar button.
 * 
 * @author Frederik Dietz
 */
@SuppressWarnings("serial")
public class ToolBarButton extends JButton {

	public ToolBarButton(String text, Icon icon) {
		super(text, icon);
		
		initButton();
	}
	
	public ToolBarButton() {
		super();
		initButton();
	}

	
	public ToolBarButton(Action action) {
		super(action);

		initButton();
	}

	private void initButton() {
		setRolloverEnabled(true);
		setRequestFocusEnabled(false);
		setMargin(new Insets(1, 1, 1, 1));
		putClientProperty("JToolBar.isRollover", Boolean.TRUE);
	}

	public boolean isFocusTraversable() {
		return isRequestFocusEnabled();
	}

	/**
	 * @see javax.swing.JButton#updateUI()
	 */
	public void updateUI() {
		super.updateUI();

		setRolloverEnabled(true);
		putClientProperty("JToolBar.isRollover", Boolean.TRUE);
	}
}
