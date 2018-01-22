package org.columba.core.gui.themes.plugin;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SystemLookAndFeelPlugin extends AbstractThemePlugin {

	@Override
	public void setLookAndFeel() throws Exception {
		try {
		    UIManager.setLookAndFeel(
		        UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException ex) {
		  System.out.println("Unable to load native look and feel");
		}
	}

}
