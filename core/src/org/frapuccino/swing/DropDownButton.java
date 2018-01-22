package org.frapuccino.swing;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class DropDownButton extends JButton implements ChangeListener,
		PopupMenuListener, ActionListener, PropertyChangeListener {

	private final JButton mainButton = this;

	private final JButton arrowButton = new JButton("a");

	private boolean popupVisible = false;

	private JPopupMenu popupMenu;

	public DropDownButton(JPopupMenu popupMenu) {
		this.popupMenu = popupMenu;

		mainButton.getModel().addChangeListener(this);
		arrowButton.getModel().addChangeListener(this);
		arrowButton.addActionListener(this);
		mainButton.addPropertyChangeListener("enabled", this); // NOI18N
	}

	public void propertyChange(PropertyChangeEvent evt) {
		arrowButton.setEnabled(mainButton.isEnabled());
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == mainButton.getModel()) {
			if (popupVisible && !mainButton.getModel().isRollover()) {
				mainButton.getModel().setRollover(true);
				return;
			}
			arrowButton.getModel().setRollover(
					mainButton.getModel().isRollover());
			arrowButton.setSelected(mainButton.getModel().isArmed()
					&& mainButton.getModel().isPressed());
		} else {
			if (popupVisible && !arrowButton.getModel().isSelected()) {
				arrowButton.getModel().setSelected(true);
				return;
			}
			mainButton.getModel().setRollover(
					arrowButton.getModel().isRollover());
		}
	}

	public void actionPerformed(ActionEvent ae) {
		JPopupMenu popup = getPopupMenu();
		popup.addPopupMenuListener(this);
		popup.show(mainButton, 0, mainButton.getHeight());
	}

	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
		popupVisible = true;
		mainButton.getModel().setRollover(true);
		arrowButton.getModel().setSelected(true);
	}

	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
		popupVisible = false;

		mainButton.getModel().setRollover(false);
		arrowButton.getModel().setSelected(false);
		((JPopupMenu) e.getSource()).removePopupMenuListener(this);
	}

	public void popupMenuCanceled(PopupMenuEvent e) {
		popupVisible = false;
	}

	private JPopupMenu getPopupMenu() {
		return popupMenu;
	}

	public JComponent getToolBarComponent() {
		JPanel tempBar = new JPanel();
		//tempBar.setAlignmentX(0.5f);
		tempBar.add(mainButton);
		tempBar.add(arrowButton);

		return tempBar;
	}
}