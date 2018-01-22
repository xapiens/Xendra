package org.columba.core.gui.themes.plugin;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class XendraLookAndFeelPlugin extends AbstractThemePlugin {

	@Override
	public void setLookAndFeel() throws Exception {
		
		// set the Xendra Look and Feel in the UIManager
		try {
			UIManager
					.setLookAndFeel("org.xendra.plaf.XendraLookAndFeel");
			// set UI manager properties here that affect Xendra

		} catch (Exception e) {
			System.err.println("error while setting Xendra L&F");
			e.printStackTrace();
		}
	}

}
