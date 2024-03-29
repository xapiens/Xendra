// The contents of this file are subject to the Mozilla Public License Version
// 1.1
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
//The Initial Developers of the Original Code are Frederik Dietz and Timo
// Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
// 02111-1307, USA.
package org.columba.core.gui.themes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.core.base.OSInfo;
import org.columba.core.config.Config;
import org.columba.core.config.Theme;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.gui.themes.plugin.AbstractThemePlugin;
import org.columba.core.plugin.PluginManager;
import org.compiere.util.CLogMgt;
import org.compiere.util.Ini;

/**
 * Switch between Look and Feels.
 * <p>
 * L&F and feels are loaded as plugins.
 * <p>
 *
 * @see org.columba.core.gui.themes.plugin.AbstractThemePlugin
 *
 * @author fdietz
 *
 */
public class ThemeSwitcher {

	private static final String QUAQUA_LF = "Quaqua";
	private static final String DEFAULT_LF = "Plastic";

	public static void setTheme() {
		// get configuration
		Theme themeConfig = Config.getInstance().getOptions().getGui().getTheme();
		//XmlElement themeConfig = Config.getInstance().get("options")
		//		.getElement("/options/gui/theme");

		//if (themeConfig == null) {
		//	XmlElement themeParent = Config.getInstance().get("options")
		//			.getElement("/options/gui");
		//	themeConfig = new XmlElement("theme");
		//	themeParent.addElement(themeConfig);
		//}

		String pluginName = null;
		try {
			// get plugin-handler
			IExtensionHandler handler =  PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_THEME);

			//pluginName = themeConfig.getAttribute("name");
			pluginName = themeConfig.getName();

			// if no theme available -> set "Plastic" as default
			if (pluginName == null) {
				pluginName = ThemeSwitcher.getPlatformDefaultTheme();
				String look = Ini.getProperty(Ini.P_UI_LOOK);
				String lookTheme = Ini.getProperty(Ini.P_UI_THEME);			
				//themeConfig.addAttribute("name", DEFAULT_LF);
				//themeConfig.addAttribute("theme", "Experience Blue");
				//themeConfig.addAttribute("name", look);
				themeConfig.setName(look);
				//themeConfig.addAttribute("theme", lookTheme);
				themeConfig.setTheme(lookTheme);
			}

			AbstractThemePlugin theme = null;

			IExtension extension = handler.getExtension(pluginName);

			// instanciate theme
			theme = (AbstractThemePlugin) extension.instanciateExtension(null);

			// apply theme
			theme.setLookAndFeel();
		} catch (Exception ex) {

			if (CLogMgt.DEBUG)
				ex.printStackTrace();

			JOptionPane.showMessageDialog(FrameManager.getInstance()
					.getActiveFrame(), "Error while trying to load "
					+ pluginName
					+ " Look and Feel.\nSwitching back to default.");

			try {
				// fall-back
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} /*
		 * Gets the platform specific default theme. This is in all cases but
		 * MacOS X the Plastic theme. On MacOs X we use the System L&F.
		 *
		 */

	public static String getPlatformDefaultTheme() {
		if (OSInfo.isMac()) {
			return QUAQUA_LF;
		} else {
			return DEFAULT_LF;
		}
	}

	public static void updateFrame(JFrame frame) {
		final JFrame f = frame;

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				SwingUtilities.updateComponentTreeUI(f);
			}
		});
	}
}