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
package org.xendra.core.ui.frame;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.InputStream;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IDock;
import org.columba.api.gui.frame.IDockable;
import org.columba.core.command.Command;
import org.columba.core.command.CommandProcessor;
import org.columba.core.config.View;
//import org.columba.core.config.ViewItem;
import org.columba.core.gui.frame.DockFrameController;
import org.compiere.apps.graph.PAPanel;
import org.compiere.grid.tree.VTreePanel;
import org.compiere.model.MTreeNode;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.core.command.XendraCommand;
import org.xendra.core.command.XendraCommandReference;
import org.xendra.core.resourceloader.ResourceLoader;

/**
 * @author xapiens
 * 
 */
public class XendraFrameMediator extends DockFrameController implements	PropertyChangeListener {
	
	private IDockable menuPanel;
	private VTreePanel treePanel;
	private boolean	m_startingItem = false;	

	private static CLogger log = CLogger.getCLogger(XendraFrameMediator.class);

	/**
	 * @param viewItem
	 */
	//public XendraFrameMediator(ViewItem viewItem) {
	public XendraFrameMediator(View viewItem) {
		super(viewItem);
		int xx = this.getContentPane().getWidth();
		treePanel = new VTreePanel (/*m_WindowNo*/ 0, true, false);	//	!editable & hasBar
		treePanel.addPropertyChangeListener(VTreePanel.NODE_SELECTION, this);		
		registerDockables();
		initContextMenu();
	}

	private void initContextMenu() {
	}

	private void registerDockables() {

		JPopupMenu popup = null;
		// calendar list
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		//JScrollPane tableScrollPane = new JScrollPane(calendarController.getView());
		JLabel xx = new JLabel("ajua");
		xx.setVisible(true);
		//treePanel = new VTreePanel (0, true, false);	//	!editable & hasBar
		int AD_Role_ID = Env.getAD_Role_ID(Env.getCtx());
		int AD_Tree_ID = DB.getSQLValue(null,
			"SELECT COALESCE(r.AD_Tree_Menu_ID, ci.AD_Tree_Menu_ID)" 
			+ "FROM AD_ClientInfo ci" 
			+ " INNER JOIN AD_Role r ON (ci.AD_Client_ID=r.AD_Client_ID) "
			+ "WHERE AD_Role_ID=?", AD_Role_ID);
		if (AD_Tree_ID <= 0)
			AD_Tree_ID = 10;	//	Menu
		treePanel.initTree(AD_Tree_ID);		
		//JScrollPane tableScrollPane = new JScrollPane(xx);
//		JScrollPane tableScrollPane = new JScrollPane(treePanel);
//		tableScrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		//m_WindowNo = Env.createWindowNo(this);		
		//p.add(tableScrollPane, BorderLayout.CENTER);
//		p.add(tableScrollPane, BorderLayout.CENTER);
		//p.add(treePanel, BorderLayout.NORTH);
		popup = null;
		// namecito
		menuPanel = registerDockable("menu", ResourceLoader.getString("global", "dockable_navigation"), treePanel, null);
//		if (papanel != null)
//		{
//			padock = registerDockable("menu2",ResourceLoader.getString("global", "dockable_navigation"), papanel, null);
//		}
	}

	/**
	 * @see org.columba.core.gui.frame.DockFrameController#loadDefaultPosition()
	 */
	public void loadDefaultPosition() {
		//super.dock(listPanel, calendarPanel, IDock.REGION.WEST, 0.2f);		
		super.dock(menuPanel, IDock.REGION.CENTER);
//		if (padock != null)
//		super.dock(padock, IDock.REGION.WEST);
//		super.dock(listPanel, calendarPanel, IDock.REGION.WEST, 0.2f);
		//super.dock(navigationPanel, listPanel, IDock.REGION.SOUTH, 0.2f);
		//super.setSplitProportion(listPanel, 0.2f);
// 		super.setSplitProportion(calendarPanelx, 0.2f);
	}

	/** *********************** container callbacks ************* */

	/**
	 * @see org.columba.api.gui.frame.IFrameMediator#extendMenu(org.columba.api.gui.frame.IContainer)
	 */
	public void extendMenu(IContainer container) {
		InputStream is = this.getClass().getResourceAsStream("/org/xendra/core/action/menu.xml");
		getContainer().extendMenu(this, is);
	}

	/**
	 * @see org.columba.api.gui.frame.IFrameMediator#extendToolBar(org.columba.api.gui.frame.IContainer)
	 */
	public void extendToolBar(IContainer container) {

		InputStream is2 = this.getClass().getResourceAsStream("/org/xendra/core/action/toolbar.xml");
		getContainer().extendToolbar(this, is2);
	}

	/**
	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#showDayView()
	 */
	public void showDayView() {

		//calendarController.setViewMode(ICalendarView.VIEW_MODE_DAY);

//		navigationController
//				.setSelectionMode(NavigationController.SELECTION_MODE_DAY);

	}

//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#showWeekView()
//	 */
//	public void showWeekView() {
//		calendarController.setViewMode(ICalendarView.VIEW_MODE_WEEK);
//
////		navigationController
////				.setSelectionMode(NavigationController.SELECTION_MODE_WEEK);
//
//	}
//
//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#showWorkWeekView()
//	 */
//	public void showWorkWeekView() {
//		calendarController.setViewMode(ICalendarView.VIEW_MODE_WORK_WEEK);
//
////		navigationController
////				.setSelectionMode(NavigationController.SELECTION_MODE_WORK_WEEK);
//
//	}
//
//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#showMonthView()
//	 */
//	public void showMonthView() {
//		calendarController.setViewMode(ICalendarView.VIEW_MODE_MONTH);
//
////		navigationController
////				.setSelectionMode(NavigationController.SELECTION_MODE_MONTH);
//
//	}
//
//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#getCalendarView()
//	 */
//	public ICalendarView getCalendarView() {
//		return calendarController;
//	}
//
////	/**
////	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#getListView()
////	 */
//	public ICalendarListView getListView() {
////		return listController;
//		return null; // evento obligatorio para ICalendarMediator		
//	}
//
//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#getNavigationView()
//	 */
//	public ICalendarNavigationView getNavigationView() {
//		//return navigationController;
//		return null;
//	}

	/**
	 * Double-click mouse listener for calendar list component.
	 */
	class ListMouseListener extends MouseAdapter {

		/**
		 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
		 */
		public void mousePressed(MouseEvent event) {
			if (event.isPopupTrigger()) {
				processPopup(event);
			}
		}

		/**
		 * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
		 */
		public void mouseReleased(MouseEvent event) {
			if (event.isPopupTrigger()) {
				processPopup(event);
			}
		}

		/**
		 * @see java.awt.event.MouseAdapter#mouseClicked(java.awt.event.MouseEvent)
		 */
		public void mouseClicked(MouseEvent event) {
			// if mouse button was pressed twice times
			if (event.getClickCount() == 2) {

			}
		}

		protected void processPopup(final MouseEvent event) {

//			listController.getPopupMenu().show(event.getComponent(),
//					event.getX(), event.getY());

		}
	}

//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#fireFilterUpdated()
//	 */
//	public void fireFilterUpdated() {
//		calendarController.recreateFilterRows();
//
//	}
//
//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#fireActivityMoved(org.columba.calendar.base.api.IActivity)
//	 */
//	public void fireActivityMoved(IActivity activity) {
//		new ActivityMovedAction(this).actionPerformed(null);
//	}
//
//	/**
//	 * @see org.columba.calendar.ui.frame.api.ICalendarMediator#fireStartActivityEditing(org.columba.calendar.base.api.IActivity)
//	 */
//	public void fireStartActivityEditing(IActivity activity) {
//		new EditActivityAction(this).actionPerformed(null);
//	}
//
//	public void fireCreateActivity(IDateRange range) {
//		new NewAppointmentAction(this, range).actionPerformed(null);
//	}
//
//	/**
//	 * @see org.columba.core.gui.frame.DefaultFrameController#getString(java.lang.String,
//	 *      java.lang.String, java.lang.String)
//	 */
//	@Override
//	public String getString(String sPath, String sName, String sID) {
//		return ResourceLoader.getString(sPath, sID);
//	}
//
//	class MyActivitySelectionChangedListener implements
//			IActivitySelectionChangedListener {
//
//		MyActivitySelectionChangedListener() {
//		}
//
//		public void selectionChanged(ActivitySelectionChangedEvent object) {
//			IActivity[] selection = object.getSelection();
//			if (selection == null)
//				return;
//
//			if (selection.length == 1) {
//
//				ICalendarStore store = CalendarList.getInstance().get(selection[0].getCalendarId()).getStore();
//				if (store == null)
//					return;
//
//				IComponentInfo c = store.get(selection[0].getId());
//
//				if (c.getType().equals(IComponent.TYPE.EVENT)) {
//					IEventInfo event = (IEventInfo) c;
//
//					String summary = event.getEvent().getSummary();
//					String description = event.getEvent().getDescription();
//					String location = event.getEvent().getLocation();
//					Calendar dtStart = event.getEvent().getDtStart();
//					Calendar dtEnd = event.getEvent().getDtEnd();
//
//					// create empty value
//					IStructureValue value = getSemanticContext().createValue();
//
//					// create identity value
//					IStructureValue eventValue = value.addChild(
//							ISemanticContext.CONTEXT_NODE_EVENT,
//							ISemanticContext.CONTEXT_NAMESPACE_CORE);
//
//					// summary
//					eventValue.setString(ISemanticContext.CONTEXT_ATTR_SUMMARY,
//							ISemanticContext.CONTEXT_NAMESPACE_CORE, summary);
//					// description
//					eventValue.setString(
//							ISemanticContext.CONTEXT_ATTR_DESCRIPTION,
//							ISemanticContext.CONTEXT_NAMESPACE_CORE,
//							description);
//					// location
//					eventValue.setString(
//							ISemanticContext.CONTEXT_ATTR_LOCATION,
//							ISemanticContext.CONTEXT_NAMESPACE_CORE, location);
//
//					// date range
//					IStructureValue dateRangeValue = eventValue.addChild(
//							ISemanticContext.CONTEXT_NODE_DATERANGE,
//							ISemanticContext.CONTEXT_NAMESPACE_CORE);
//					dateRangeValue.setDate(
//							ISemanticContext.CONTEXT_ATTR_STARTDATE,
//							ISemanticContext.CONTEXT_NAMESPACE_CORE, dtStart.getTime());
//					dateRangeValue.setDate(
//							ISemanticContext.CONTEXT_ATTR_ENDDATE,
//							ISemanticContext.CONTEXT_NAMESPACE_CORE, dtEnd.getTime());
//				}
//			}
//		}
//
//	}

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		MTreeNode nd = (MTreeNode)e.getNewValue();
		log.info(nd.getNode_ID() + " - " + nd.toString());

		//	ignore summary items & when loading
		if (m_startingItem || nd.isSummary())
			return;

		String sta = nd.toString();
//		progressBar.setString(sta);
		int cmd = nd.getNode_ID();
		
//		(new AMenuStartItem(cmd, true, sta, AMENU)).start();		//	async load
//		(new AMenuStartItem(cmd, true, sta)).start();
	
		Command command = new XendraCommand(new XendraCommandReference(cmd, true, sta));
		//command.set(cmd, true, sta);
		CommandProcessor.getInstance().addOp(command);
//		(new AMenuStartItem(cmd, true, sta, (DockFrameController) this)).start();		//	async load
		//hengsin, updateInfo is call again in AMenuStartItem
		//updateInfo();
	}
}