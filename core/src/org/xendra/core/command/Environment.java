package org.xendra.core.command;

import org.compiere.apps.WindowManager;

public class Environment {
	private final static WindowManager m_WindowManager = new WindowManager();

	public static WindowManager getWindowManager() {
		return m_WindowManager;
	}

}
