//package org.mindgame.swing.components.ui;
package org.xendra.swing;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.metal.MetalComboBoxUI;
/**
 * This is an abstract class which provides customised pop up menus for combo boxes
 * Implementations of this class are supposed to provide components that they want to 
 * display as a popup for the combo box.  
 * @author Mayuresh Halshikar
 *
 */
public abstract class AbstractComboBoxUI extends MetalComboBoxUI {
	/** Popup that is going to be displayed */
	private JPopupMenu popUp;
	
	public AbstractComboBoxUI() {
		popUp = new JPopupMenu();
		popUp.add(getPopUpComponent());
	}
	
	/**
	 * This abstract method is supposed to be implemented by the extensions for this class.
	 * This method returns a component that will be displayed as a popup   
	 * @return
	 */
	protected abstract JComponent getPopUpComponent();
	
	
	@SuppressWarnings("serial")
	@Override
	protected ComboPopup createPopup() {
		return new BasicComboPopup(comboBox){
			public void show() {
				popUp.show(comboBox, 0, (0 + comboBox.getHeight()));
			};
			@Override
			public void hide() {
				popUp.setVisible(false);
			}
		};
	}
}
