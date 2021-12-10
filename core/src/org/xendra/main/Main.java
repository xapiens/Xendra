package org.xendra.main;


import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;
import org.columba.core.component.api.IComponentPlugin;
import org.compiere.util.CLogger;

/**
 * Main entrypoint for Xendra component.
 *
 * @author xapiens
 */
public class Main implements IComponentPlugin {	
	private static final CLogger LOG = CLogger.getCLogger("org.xendra.main");

	public Main() {
		//EmbeddedMessageServer.getInstance();
	}

	/**
	 *
	 */
	public void init() {
	}

	public void registerCommandLineArguments() {
	}

	/**
	 * @see org.columba.core.component.api.IComponentPlugin#handleCommandLineParameters(java.lang.String[])
	 */
	public void handleCommandLineParameters(CommandLine commandLine) {

	}

	/**
	 *
	 */
	public void postStartup() {
		System.out.println("org.xendra.main.Main.postStartup");
	}
	
	private void checkDefaultClient() {
	}

}