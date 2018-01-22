package org.columba.core.component;

import java.util.Enumeration;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.IPluginManager;
import org.columba.api.plugin.PluginException;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.component.api.IComponentPlugin;
import org.columba.core.logging.Logging;
import org.columba.core.plugin.PluginManager;

public class ComponentManager implements IComponentPlugin {

	private static final Logger LOG = Logger.getLogger("org.columba.core.main"); //$NON-NLS-1$

	private static final ComponentManager instance = new ComponentManager();

	private IExtensionHandler extensionHandler;

	private ComponentManager() {
		// nothing to do
	}

	public static ComponentManager getInstance() {
		return instance;
	}

	private IExtensionHandler getExtensionHandler() {
		if (extensionHandler == null) {
			try {
				// retrieve plugin manager instance
				final IPluginManager pm = PluginManager.getInstance();				
				extensionHandler = pm.getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_COMPONENT);
			} catch (final PluginHandlerNotFoundException e) {
				LOG.severe(e.getMessage());
				if (Logging.DEBUG) {
					e.printStackTrace();
				}
			}
		}
		return extensionHandler;
	}

	public IComponentPlugin getPlugin(final String id) {
		IComponentPlugin component = null;

		final IExtension extension = getExtensionHandler().getExtension(id);

		try {
			component = (IComponentPlugin) extension.instanciateExtension(null);
		} catch (final PluginException e) {
			LOG.severe(e.getMessage());

			if (Logging.DEBUG) {
				e.printStackTrace();
			}
		}

		return component;
	}

	/**
	 * @see org.columba.core.component.api.IComponentPlugin#init()
	 */
	public void init() {
		final Enumeration<IExtension> extensionEnumeration = getExtensionHandler().getExtensionEnumeration();

		while (extensionEnumeration.hasMoreElements()) {
			final IExtension ext = extensionEnumeration.nextElement();
			IComponentPlugin p;

			try {
				p = (IComponentPlugin) ext.instanciateExtension(null);
				p.init();
			} catch (final PluginException e) {
				LOG.severe(e.getMessage());

				if (Logging.DEBUG) {
					e.printStackTrace();
				}
				
			}

		}
	}

	/**
	 * @see org.columba.core.component.api.IComponentPlugin#postStartup()
	 */
	public void postStartup() {
		final Enumeration<IExtension> extensionEnumeration = getExtensionHandler().getExtensionEnumeration();

		while (extensionEnumeration.hasMoreElements()) {
			final IExtension ext = extensionEnumeration.nextElement();
			IComponentPlugin p;
			try {
				p = (IComponentPlugin) ext.instanciateExtension(null);
				p.postStartup();
			} catch (final PluginException e) {
				LOG.severe(e.getMessage());

				if (Logging.DEBUG) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @see org.columba.core.component.api.IComponentPlugin#registerCommandLineArguments()
	 */
	public void registerCommandLineArguments() {

		final Enumeration<IExtension> extensionEnumeration = getExtensionHandler()
				.getExtensionEnumeration();

		while (extensionEnumeration.hasMoreElements()) {
			final IExtension ext = extensionEnumeration.nextElement();
			IComponentPlugin p;
			try {
				p = (IComponentPlugin) ext.instanciateExtension(null);
				p.registerCommandLineArguments();
			} catch (final PluginException e) {
				LOG.severe(e.getMessage());

				if (Logging.DEBUG) {
					e.printStackTrace();
				}
			}

		}
	}

	/**
	 * @see org.columba.core.component.api.IComponentPlugin#handleCommandLineParameters(org.apache.commons.cli.CommandLine)
	 */
	public void handleCommandLineParameters(final CommandLine commandLine) {
		final Enumeration<IExtension> extensionEnumeration = getExtensionHandler().getExtensionEnumeration();

		while (extensionEnumeration.hasMoreElements()) {
			final IExtension ext = extensionEnumeration.nextElement();
			IComponentPlugin p;
			try {
				p = (IComponentPlugin) ext.instanciateExtension(null);
				p.handleCommandLineParameters(commandLine);
			} catch (final PluginException e) {
				LOG.severe(e.getMessage());

				if (Logging.DEBUG) {
					e.printStackTrace();
				}
			}

		}
	}

}
