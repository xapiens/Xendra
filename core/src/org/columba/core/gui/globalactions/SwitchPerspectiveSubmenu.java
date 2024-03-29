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
//All Rights Reserved.
package org.columba.core.gui.globalactions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButtonMenuItem;

import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.api.plugin.PluginLoadingFailedException;
import org.columba.core.gui.frame.DefaultFrameController;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.gui.menu.IMenu;
import org.columba.core.plugin.PluginManager;

/**
 * @author fdietz
 * 
 */
public class SwitchPerspectiveSubmenu extends IMenu implements ActionListener {
	private ButtonGroup group;
	private IExtensionHandler handler;

	/**
	 * @param controller
	 * @param caption
	 */
	public SwitchPerspectiveSubmenu(IFrameMediator controller) {
		super(controller, "Window", ((DefaultFrameController) controller).getViewConfig().getId());

		String id = ((DefaultFrameController) getFrameMediator()).getViewConfig().getId();

		// check if this is a management frame instance
		// -> if so create submenu to switch perspectives
		// -> otherwise, don't create submenu
		boolean isManagedFrame = false;

		try {
			handler =  PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_FRAME);
		} catch (PluginHandlerNotFoundException e) {
			e.printStackTrace();
		}

		String[] managedFrames = null;
		if (id != null) {
			managedFrames = getManagedFrames(handler);
			for (int i = 0; i < managedFrames.length; i++) {
				if (id.equals(managedFrames[i]))
					isManagedFrame = true;
			}
		}

		if (!isManagedFrame) {
			setEnabled(false);
			return;
		}

		group = new ButtonGroup();

		for (int i = 0; i < managedFrames.length; i++) {
			JRadioButtonMenuItem menu = createMenu(managedFrames[i],
					managedFrames[i]);
			if (id.equals(managedFrames[i]))
				menu.setSelected(true);

			add(menu);
		}

	}

	public String[] getManagedFrames(IExtensionHandler handler) {

		Vector result = new Vector();
		Enumeration _enum = handler.getExtensionEnumeration();
		while (_enum.hasMoreElements()) {
			IExtension extension = (IExtension) _enum.nextElement();
			String managed = extension.getMetadata().getAttribute("managed");
			if (managed == null)
				managed = "false";

			if (managed.equals("true"))
				result.add(extension.getMetadata().getId());

		}

		return (String[]) result.toArray(new String[0]);

	}
	/**
	 * @return
	 */
	private JRadioButtonMenuItem createMenu(String name, String actionCommand) {
		JRadioButtonMenuItem menu = new JRadioButtonMenuItem(name);
		group.add(menu);
		menu.setActionCommand(actionCommand);
		menu.addActionListener(this);
		return menu;
	}

	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		final String action = arg0.getActionCommand();

		// awt-event-thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				IFrameMediator mediator = getFrameMediator();

				IContainer container = mediator.getContainer();

				try {
					FrameManager.getInstance().switchView(container, action);
				} catch (PluginLoadingFailedException e) {
					e.printStackTrace();
				}
			}
		});

	}

}