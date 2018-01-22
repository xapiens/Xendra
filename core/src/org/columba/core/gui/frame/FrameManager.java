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

package org.columba.core.gui.frame;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.swing.JFrame;

import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IFrameManager;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.PluginException;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.api.plugin.PluginLoadingFailedException;
import org.columba.core.config.Config;
import org.columba.core.config.Custom;
import org.columba.core.config.View;
//import org.columba.core.config.ViewItem;
import org.columba.core.config.ViewList;
import org.columba.core.logging.Logging;
import org.columba.core.plugin.PluginManager;
import org.columba.core.shutdown.ShutdownManager;
import org.columba.core.xml.XmlElement;

/**
 * FrameManager manages all frames. It keeps a list of every controller. Its
 * also the place to create a new frame, or save and close all frames at once.
 * 
 * Frame controllers are plugins.
 * 
 * @see FrameExtensionHandler
 * 
 * @author fdietz
 */
public class FrameManager implements IFrameManager {

	private static final Logger LOG = Logger.getLogger("org.columba.core.gui.frame");

	/** list of frame controllers */
	protected List activeFrameCtrls = new LinkedList();

	/** viewlist xml treenode */
	//protected XmlElement viewList = Config.getInstance().get("views").getElement("/views/viewlist");
	//protected ViewList viewList = Config.getInstance().getViews().getViewlist();

	/** Default view specifications to be used when opening a new view */
	//protected XmlElement defaultViews = Config.getInstance().get("views").getElement("/views/defaultviews");

	protected IExtensionHandler handler;

	private static FrameManager instance = new FrameManager();

	/**
	 * we cache instances for later re-use
	 */
	protected Map frameMediatorCache;

	/**
	 * Obtains a reference to the frame plugin handler and registers a shutdown
	 * hook with the ShutdownManager.
	 */
	public FrameManager() {

		frameMediatorCache = new HashMap();

		// get plugin handler for handling frames
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_FRAME);
		} catch (PluginHandlerNotFoundException ex) {
			throw new RuntimeException(ex);
		}

		// this is executed on shutdown: store all open frames so that they
		// can be restored on the next start
		ShutdownManager.getInstance().register(new Runnable() {
			public void run() {
				storeViews();
			}
		});
	}

	public static FrameManager getInstance() {
		return instance;
	}

	
	/**
	 * Check if frame mediator with given id is a managed frame. 
	 * 
	 * @param frameMediatorId
	 * @return
	 */
	public boolean isManaged(String frameMediatorId) {
		Enumeration _enum = handler.getExtensionEnumeration();
		while (_enum.hasMoreElements()) {
			IExtension extension = (IExtension) _enum.nextElement();
			String managed = extension.getMetadata().getAttribute("managed");
			if (managed == null)
				managed = "false";

			if ( (extension.getMetadata().getId().equals(frameMediatorId)) && managed.equals("true") ) return true;
		}
		
		return false;
	}
	
	/**
	 * Close all frames and re-open them again.
	 * <p>
	 * This is necessary when updating translations, adding new plugins which
	 * extend the menu and probably also look and feel changes.
	 * 
	 */
	public void refresh() {
		storeViews();
		openStoredViews();
	}

	/**
	 * Store all open frames so that they can be restored on next startup.
	 * 
	 */
	public void storeViews() {
		// used to temporarily store the values while the original
		// viewList gets modified by the close method
		List newViewList = new LinkedList();

		//ViewItem v;
		View v;

		// we cannot use an iterator here because the close method
		// manipulates the list
		while (activeFrameCtrls.size() > 0) {
			DefaultContainer c = (DefaultContainer) activeFrameCtrls.get(0);
			v = c.getViewItem();

			// store every open frame in our temporary list
			//newViewList.add(v.getRoot());
			newViewList.add(v);

			// close every open frame
			c.close();
		}

		// if not we haven't actually closed a frame, leave viewList as is
		if (newViewList.size() > 0) {
			// the close method manipulates the viewList so we have to
			// remove the existing element and fill in our temporarily
			// stored ones
			Config.getInstance().getViews().getViewlist().setViews(null);
			//viewList.removeAllElements();

			for (Iterator it = newViewList.iterator(); it.hasNext();) {
				Config.getInstance().getViews().getViewlist().addView((View)it.next());
				//viewList.addElement((XmlElement) it.next());
			}
		}
	}

	/**
	 * Opens all views stored in the configuration.
	 */
	public void openStoredViews() {
		// load all frames from configuration file
		ViewList list = Config.getInstance().getViews().getViewlist();
		for (View view:list.getViews())
		{
			try {
			createFrameMediator(view);
			} catch (PluginLoadingFailedException plfe) {
				continue;
			}
		}
//		for (int i = 0; i < viewList.count(); i++) {
//			// get element from view list
//			XmlElement view = viewList.getElement(i);
//			try {
//				createFrameMediator(new ViewItem(view));
//			} catch (PluginLoadingFailedException plfe) {
//				// should not occur
//				continue;
//			}
//
//		}
	}

	/**
	 * Returns an array of all open frames.
	 */
	public IContainer[] getOpenFrames() {
		return (IContainer[]) activeFrameCtrls.toArray(new IContainer[0]);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.columba.core.gui.frame.IFrameManager#getActiveFrameMediator()
	 */
	public IContainer getActiveFrameMediator() {
		Iterator it = activeFrameCtrls.iterator();
		while (it.hasNext()) {
			IContainer m = (IContainer) it.next();
			JFrame frame = m.getFrame();
			if (frame.isActive())
				return m;
		}

		return null;
	}

	/**
	 * Get active/focused JFrame.
	 * 
	 * @return active frame
	 */
	public JFrame getActiveFrame() {
		IContainer m = getActiveFrameMediator();
		if (m != null)
			return m.getFrame();

		// fall-back
		return new JFrame();
	}

	/**
	 * @param viewItem
	 * @param id
	 * @return
	 * @throws PluginLoadingFailedException
	 */
	//private IFrameMediator instanciateFrameMediator(ViewItem viewItem)
	private IFrameMediator instanciateFrameMediator(View viewItem) throws PluginLoadingFailedException {
		//String id = viewItem.get("id");
		IFrameMediator frame = null;
		//if (frameMediatorCache.containsKey(id)) {
		if (frameMediatorCache.containsKey(viewItem.getId())) {
			//LOG.fine("use cached instance " + id);
			LOG.fine("use cached instance " + viewItem.getId());
			// found cached instance
			// -> re-use this instance and remove it from cache
			//frame = (IFrameMediator) frameMediatorCache.remove(id);
			frame = (IFrameMediator) frameMediatorCache.remove(viewItem.getId());
		} else {
			//LOG.fine("create new instance " + id);
			LOG.fine("create new instance " + viewItem.getId());
			Object[] args = { viewItem };
			// create new instance
			// -> get frame controller using the plugin handler found above
			try {
				//IExtension extension = handler.getExtension(id);
				IExtension extension = handler.getExtension(viewItem.getId());
				frame = (IFrameMediator) extension.instanciateExtension(args);
			} catch (PluginException e) {
				LOG.severe(e.getMessage());
				if (Logging.DEBUG)
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
		return frame;
	}

	//protected IFrameMediator createFrameMediator(ViewItem viewItem)
	protected IFrameMediator createFrameMediator(View viewItem)
			throws PluginLoadingFailedException {
		IFrameMediator frame = instanciateFrameMediator(viewItem);
		IContainer c = new DefaultContainer((DefaultFrameController) frame);
		activeFrameCtrls.add(c);
		return frame;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.columba.core.gui.frame.IFrameManager#openView(java.lang.String)
	 */
	public IFrameMediator openView(String id) throws PluginLoadingFailedException {
		// look for default view settings (if not found, null is returned)
		//ViewItem view = loadDefaultView(id);
		View view = loadDefaultView(id);
		//if (view == null)
		//	view = ViewItem.createDefault(id);
		// Create a frame controller for this view
		// view = null => defaults specified by frame controller is used
		IFrameMediator controller = createFrameMediator(view);
		return controller;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.columba.core.gui.frame.IFrameManager#switchView(org.columba.core.gui.frame.IContainer,
	 *      java.lang.String)
	 */
	public IFrameMediator switchView(IContainer c, String id)
			throws PluginLoadingFailedException {
		// look for default view settings (if not found, null is returned)
		//ViewItem view = loadDefaultView(id);
		View view = loadDefaultView(id);

		//if (view == null)
		//	view = ViewItem.createDefault(id);

		// cancel, if we show already correct frame mediator
		if ( c.getFrameMediator().getId().equals(id)) 
			return c.getFrameMediator();		
		// Create a frame controller for this view
		// save old framemediator in cache (use containers's old id)
		//frameMediatorCache.put(((DefaultContainer) c).getViewItem().get("id"), c.getFrameMediator());
		frameMediatorCache.put(((DefaultContainer) c).getViewItem().getId(), c.getFrameMediator());
		IFrameMediator frame = instanciateFrameMediator(view);
		c.switchFrameMediator(frame);
		return frame;
	}

	/**
	 * Gets default view settings for a given view type
	 * 
	 * @param id
	 *            id specifying view type
	 * @return View settings
	 */
	//protected ViewItem loadDefaultView(String id) {
	protected View loadDefaultView(String id) {
		// If defaultViews doesn't exist, create it (backward compatibility)
		//		if (defaultViews == null) {			
		//			XmlElement gui = Config.getInstance().get("views").getElement("/views");
		//			defaultViews = new XmlElement("defaultviews");
		//			gui.addElement(defaultViews);
		//		}
		// search through defaultViews to get settings for given id
		//		ViewItem view = null;
		View ret = Config.getInstance().getViews().getViewlist().getView(id);
		//		for (int i = 0; i < defaultViews.count(); i++) {
		//			XmlElement child = defaultViews.getElement(i);
		//			String childId = child.getAttribute("id");
		//
		//			if ((childId != null) && childId.equals(id)) {
		//				view = new ViewItem(child);
		//
		//				break;
		//			}
		//		}
		//return view;
		return ret;
	}

	/**
	 * Saves default view settings for given view type. These will be used as
	 * startup values next a view of this type is opened. Though, views opened
	 * at startup will use settings from viewlist instead.
	 * 
	 * Only one set of settings are stored for each view id.
	 * 
	 * @param view
	 *            view settings to be stored
	 */
	//protected void saveDefaultView(ViewItem view) {
	protected void saveDefaultView(View view) {
		if (view == null) {
			return; // nothing to save
		}

		//String id = view.get("id");

		// removed previous default values
		//ViewItem oldView = loadDefaultView(id);

		//if (oldView != null) {
		//	defaultViews.removeElement(oldView.getRoot());
		//}

		// store current view settings
		//defaultViews.addElement(view.getRoot());
		Config.getInstance().getViews().getViewlist().addView(view);
	}

	/**
	 * Called when a frame is closed. The reference is removed from the list of
	 * active (shown) frames. If it's the last open view, the view settings are
	 * stored in the view list.
	 * 
	 * @param c
	 *            Reference to frame controller for the view which is closed
	 */
	public void close(IContainer c) {

		// Check if the frame controller has been registered, else do nothing
		if (activeFrameCtrls.contains(c)) {
			//ViewItem v = ((DefaultContainer) c).getViewItem();
			View v = ((DefaultContainer) c).getViewItem();

			// save in cache
			//frameMediatorCache.put(v.get("id"), c.getFrameMediator());
			frameMediatorCache.put(v, c.getFrameMediator());

			saveDefaultView(v);
			activeFrameCtrls.remove(c);

			if (activeFrameCtrls.size() == 0) {
				// this is the last frame so store its data in the viewList
				Config.getInstance().getViews().getViewlist().setViews(null);
				//viewList.removeAllElements();
				//viewList.addElement(v.getRoot());
				Config.getInstance().getViews().getViewlist().addView(v);
			}
		}

		if (activeFrameCtrls.size() == 0) {
			// shutdown Columba if no frame exists anymore
			if (getOpenFrames().length == 0) {

				ShutdownManager.getInstance().shutdown(0);
			}
		}
	}

	//public ViewItem createCustomViewItem(String id) {
	public View createCustomViewItem(String id) {
		View ret = null;
		Custom custom = Config.getInstance().getViews().getViewlist().getCustom();
		//XmlElement parent = Config.getInstance().get("views").getElement("views");
		//XmlElement custom = parent.getElement("custom");
		//if (custom == null)
		//	custom = parent.addSubElement("custom");
		for (View view:custom.getViews()) {
			if (view.getId().equals(id))
			{
				ret = view;
				break;
			}
		}
//		for (int i = 0; i < custom.count(); i++) {
//			XmlElement child = custom.getElement(i);
//			String name = child.getAttribute("id");
//			if (name.equals(id))
//				return new ViewItem(child);
//		}
		if (ret != null)
			custom.addView(ret);
		//ViewItem viewItem = ViewItem.createDefault(id);
		//custom.addElement(viewItem.getRoot());
		//return viewItem;
		return ret;
	}
}