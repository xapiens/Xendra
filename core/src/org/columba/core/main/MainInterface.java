package org.columba.core.main;

import org.columba.core.context.base.ContextFactory;
import org.columba.core.context.base.api.IContextFactory;

/**
 * Main interface to all core services, factories and managers.
 * 
 * @author frd
 */
public class MainInterface {
	
	public static IContextFactory contextFactory = new ContextFactory();

}
