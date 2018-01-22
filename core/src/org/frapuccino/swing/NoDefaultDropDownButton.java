package org.frapuccino.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPopupMenu;

public class NoDefaultDropDownButton extends JButton implements ActionListener {

	private final JButton mainButton = this;

	private boolean popupVisible = false;

	private JPopupMenu popupMenu;

	public NoDefaultDropDownButton(JPopupMenu popupMenu) {
		this.popupMenu = popupMenu;

		mainButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		JPopupMenu popup = getPopupMenu();
		popup.show(mainButton, 0, mainButton.getHeight());
	}

	private JPopupMenu getPopupMenu() {
		return popupMenu;
	}

}
