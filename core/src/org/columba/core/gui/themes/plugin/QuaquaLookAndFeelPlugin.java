package org.columba.core.gui.themes.plugin;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class QuaquaLookAndFeelPlugin extends AbstractThemePlugin {

	@Override
	public void setLookAndFeel() throws Exception {
		
		// set the Quaqua Look and Feel in the UIManager
		try {
			UIManager
					.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
			// set UI manager properties here that affect Quaqua

		} catch (Exception e) {
			System.err.println("error while setting Quaqua L&F");
			e.printStackTrace();
		}
	}

}
