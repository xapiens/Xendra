//The contents of this file are subject to the Mozilla Public License Version 1.1
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
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.

package org.columba.core.gui.statusbar;

import java.awt.Component;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.columba.api.command.IWorkerStatusController;
import org.columba.api.statusbar.IStatusBar;
import org.columba.api.statusbar.IStatusBarExtension;
import org.columba.core.command.TaskManager;
import org.columba.core.command.TaskManagerEvent;
import org.columba.core.command.TaskManagerListener;
import org.columba.core.command.Worker;
import org.columba.core.connectionstate.ConnectionStateImpl;
import org.columba.core.gui.base.JStatusBar;
import org.columba.core.gui.plugin.PluginManagerDialog;
import org.columba.core.gui.processmanager.ProcessManagerDialog;
import org.columba.core.plugin.PluginManager;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.MRole;
import org.xendra.chat.Client;
import org.xendra.chat.Server;
import org.xendra.printdocument.PrintDocumentManager;
import com.dravios.openvpn.VpnClient;

/**
 * A status bar intended to be displayed at the bottom of each window.
 * <p>
 * Implementation notes:
 * <p>
 * An update timer is used to only update the statusbar, every xx seconds. As a
 * nice side-effect, all swing method calls happen in the awt-event dispatcher
 * thread automatically. If we don't do this, we have to wrap every swing method
 * in a Runnable interface and execute it using SwingUtilities.invokeLater().
 * <p>
 * Note, that without an update timer, the statusbar text and most importantly
 * the progressbar are updated very frequently, using very small updates. But,
 * because these are called using invokeLater(), all have to be placed in the
 * awt-event dispatcher queue. This makes things very slow. We discovered, when
 * moving around 1000 messages and updating the progressbar for every message,
 * it will take more time to update the statusbar than actually moving the
 * messages.
 * <p>
 * There's another Timer, addWorkerTimer which makes sure that only Workers who
 * are alive for at most 2000 ms will appear in the statusbar. This prevents the
 * statusbar from flicker, caused by many smaller tasks which usually tend to
 * hide the parent task. For example when downloaded POP3 messages and using
 * filters which move message to different folders. Without the addWorkerTimer
 * you would see all those little move tasks. Instead now, you only see the POP3
 * tasks which is much more comfortable for the user.
 * <p>
 * There's yet another Timer ;-), clearTextTimer which automatically clears the
 * statusbar after a delay of 2000 ms.
 */
public class StatusBar extends JStatusBar implements TaskManagerListener,
ActionListener, ChangeListener, IStatusBar {

	/**
	 * update status every 10 ms
	 */
	private static final int UPDATE_TIMER_INTERVAL = 10;

	/**
	 * Constant definining the delay used when using
	 * clearDisplayTextWithDelay(). Defined to be 2000 millisec.
	 */
	private static final int CLEAR_TIMER_DELAY = 2000;

	/**
	 * time to wait until statusbar will show a tasks progress
	 */
	private static final int ADDWORKER_TIMER_INTERVAL = 2000;

	protected static Icon chatIcon 	    = ImageLoader.getSmallIcon("chat.png");
	protected static Icon onlineIcon	= ImageLoader.getSmallIcon(IconKeys.ONLINE);
	protected static Icon databaseIcon 	= ImageLoader.getSmallIcon("database.png");
	protected static Icon printerIcon	= ImageLoader.getSmallIcon("printer.png");
	protected static Icon openvpnIcon 	= ImageLoader.getSmallIcon("openvpn.png");
	protected static Icon processIcon 	= ImageLoader.getSmallIcon("brain.png");
	protected static Icon pluginIcon 	= ImageLoader.getSmallIcon("plugin.png");
	protected static Icon syncIcon 		= ImageLoader.getSmallIcon("view-refresh.png");
	protected static Icon offlineIcon	= ImageLoader.getSmallIcon(IconKeys.OFFLINE);
	protected static Icon workflowIcon  = ImageLoader.getSmallIcon("condition.png");
	/**
	 * showing status messages
	 */
	private JLabel label;

	/**
	 * showing progress info
	 */
	private JProgressBar progressBar;



	/**
	 * button opening task manager dialog
	 */
	private JButton chatButton;
	private JButton printerButton;
	private JButton pluginButton;
	private JButton processButton;
	private JButton openvpnButton;
	private JButton databaseButton;
	private JButton workflowButton;
	private JButton syncButton;
	/**
	 * Currently displayed worker
	 */
	private Worker displayedWorker;

	/**
	 * manager of all running tasks
	 */
	private TaskManager taskManager;

	private PrintDocumentManager printManager = PrintDocumentManager.getInstance();
	//private MessageManager messageManager = MessageManager.getInstance();
	/**
	 * connection state button
	 */
	private JButton onlineButton;

	/** Timer to use when clearing status bar text after a certain timeout */
	private Timer clearTextTimer;

	/**
	 * Timer makes sure that statusbar is only updated every xx ms, to make that
	 * its not getting flooded with too many update notifications
	 */
	private Timer updateTimer;

	private Timer addWorkerTimer;

	/**
	 * last displayed message
	 */
	private String lastMessage;

	private TaskManagerEvent currentEvent;

	public StatusBar(TaskManager tm) {
		super();

		taskManager = tm;
		tm.addTaskManagerListener(this);
		ConnectionStateImpl.getInstance().addChangeListener(this);
		initComponents();
		stateChanged(null);
		clearTextTimer = new Timer(CLEAR_TIMER_DELAY, this);
		// init update timer
		updateTimer = new Timer(UPDATE_TIMER_INTERVAL, this);
		addWorkerTimer = new Timer(ADDWORKER_TIMER_INTERVAL, this);

	}

	/**
	 * init components
	 */
	private void initComponents() {

		label = new JLabel("");
		label.setAlignmentX(Component.LEFT_ALIGNMENT);
		setMainLeftComponent(label);

		onlineButton = new JButton();
		onlineButton.setMargin(new Insets(0,0,0,0));
		onlineButton.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		onlineButton.setRolloverEnabled(true);
		onlineButton.setActionCommand("ONLINE");
		onlineButton.addActionListener(this);

		progressBar = new JProgressBar(0, 100);

		progressBar.setStringPainted(false);
		progressBar.setBorderPainted(false);
		progressBar.setValue(0);
		addRightComponent(progressBar, 100);
		MRole role = MRole.getDefault();
		if (role != null && role.isSuperUser()) {
			pluginButton = createButton(pluginIcon, "plugin", "PLUGINMANAGER");
			addRightComponent(pluginButton, 30);
		}
		if (role != null && role.isSuperUser()) {
			openvpnButton = createButton(openvpnIcon, "openvpn", "OPENVPNMANAGER");							
			addRightComponent(openvpnButton, 30);
		}

		printerButton = createButton(printerIcon, "Show list of running tasks", "PRINTMANAGER");
		addRightComponent(printerButton, 30);

		if (role != null && role.isSuperUser()) {
			processButton = createButton(processIcon, "show process network", "PROCESSMANAGER");
			addRightComponent(processButton, 30);
		}

		databaseButton = createButton(databaseIcon, "show database status", "DATABASESTATUS");
		addRightComponent(databaseButton, 30);

		workflowButton = createButton(workflowIcon, "show workflow status", "WORKFLOWMANAGER");
		addRightComponent(workflowButton, 30);

		syncButton = createButton(syncIcon, "Synchronize plugins", "SYNCPLUGINS");
		addRightComponent(syncButton, 30);
		
		chatButton = createButton(chatIcon, "Chat", "CHAT");
		addRightComponent(chatButton, 30);
		
		addRightComponent(onlineButton, 30);
	}

	private JButton createButton(Icon icon, String tooltip, String cmd) {
		JButton jbutton = new JButton();
		jbutton.setIcon(icon);
		jbutton.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		jbutton.setToolTipText(tooltip);
		jbutton.setRolloverEnabled(true);
		jbutton.setActionCommand(cmd);
		jbutton.addActionListener(this);
		return jbutton;
	}

	public void addComponent(IStatusBarExtension ext) {
		if (ext == null)
			throw new IllegalArgumentException("extension == null");

		addRightComponent(ext.getView());
	}

	/**
	 * @see org.columba.api.statusbar.IStatusBar#displayTooltipMessage(java.lang.String)
	 */
	public void displayTooltipMessage(String message) {
		label.setText(message);
	}

	public void workerAdded(TaskManagerEvent e) {

		if (getDisplayedWorker() == null) {

			currentEvent = e;

			if (taskManager.getWorkers().length == 1) {
				setDisplayedWorker(currentEvent.getWorker());

				// update text and progress bar
				updateTimer.restart();

				addWorkerTimer.stop();
			} else {

				addWorkerTimer.restart();
			}

		}
	}

	public void workerRemoved(TaskManagerEvent e) {

		if (e.getWorker() == displayedWorker) {

			// remember last message
			lastMessage = e.getWorker().getDisplayText();

			// immediately update text and progress bar
			// updateGui();

			Worker[] workers = taskManager.getWorkers();
			setDisplayedWorker(workers.length > 0 ? workers[0] : null);
		}

		// if only one task left
		if (taskManager.getWorkers().length == 0) {

			// stop update timer
			updateTimer.stop();

			// set text
			label.setText(lastMessage);

			// clear text with delay
			clearTextTimer.restart();
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == updateTimer) {
			// update timer event
			updateGui();
			return;
		}

		if (e.getSource() == clearTextTimer) {

			// clear label
			label.setText("");

			progressBar.setValue(0);

			// stop clear timer
			clearTextTimer.stop();

			return;
		}

		if (e.getSource() == addWorkerTimer) {

			if (taskManager.exists(currentEvent.getWorker())) {

				setDisplayedWorker(currentEvent.getWorker());

				// update text and progress bar
				updateTimer.restart();

				addWorkerTimer.stop();

				return;
			} else {

				addWorkerTimer.stop();
				return;
			}
		}

		String command = e.getActionCommand();

		if (command.equals("ONLINE")) {
			ConnectionStateImpl.getInstance().setOnline(!ConnectionStateImpl.getInstance().isOnline());
		} else if (command.equals("TASKMANAGER")) {
			TaskManagerDialog.createInstance();
		} else if (command.equals("PLUGINMANAGER")) {
			PluginManagerDialog.getInstance();
		} else if (command.equals("OPENVPNMANAGER")) {			
			//openvpnButton.add(VpnClient.getInstance().getMenu());			
			VpnClient.getInstance().getMenu().setLocation(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
			VpnClient.getInstance().getMenu().setInvoker(VpnClient.getInstance().getMenu());
			VpnClient.getInstance().getMenu().setVisible(true);			
		} else if (command.equals("PRINTMANAGER")) {
			PrintManagerDialog.createInstance();
		} else if (command.equals("CANCEL_ACTION")) {
			displayedWorker.cancel();
		} else if (command.equals("DATABASESTATUS")) {
			DatabaseStatusDialog.createInstance();
		} else if (command.equals("PROCESSMANAGER")) {
			ProcessManagerDialog.createInstance();
		} else if (command.equals("WORKFLOWMANAGER")) {
			WorkflowActivitiesDialog.createInstance();
		} else if (command.equals("SYNCPLUGINS")) {			
			PluginManager.getInstance().Sync();				
		} else if (command.equals("CHAT")) {
			Server.getInstance();
			Client.getInstance();
		}
	}

	/**
	 * Update statusbar with currently selected worker status.
	 * <p>
	 * Runs in awt-event dispatcher thread
	 */
	private void updateGui() {
		if (displayedWorker != null) {			
			label.setText(displayedWorker.getDisplayText());
			progressBar.setValue(displayedWorker.getProgressBarValue());			
			progressBar.setMaximum(displayedWorker.getProgessBarMaximum());			
		}

	}

	/**
	 * Sets the worker to be displayed.
	 */
	protected void setDisplayedWorker(Worker w) {
		displayedWorker = w;

	}

	/**
	 * Returns the worker currently displayed.
	 */
	public IWorkerStatusController getDisplayedWorker() {
		return displayedWorker;
	}

	/**
	 * Returns the task manager this status bar is attached to.
	 */
	public TaskManager getTaskManager() {
		return taskManager;
	}

	public void stateChanged(ChangeEvent e) {
		if (ConnectionStateImpl.getInstance().isOnline()) {
			onlineButton.setIcon(onlineIcon);
			// TODO (@author fdietz): i18n
			onlineButton.setToolTipText("You are in ONLINE state");
		} else {
			onlineButton.setIcon(offlineIcon);
			// TODO (@author fdietz): i18n
			onlineButton.setToolTipText("You are in OFFLINE state");
		}
	}
}