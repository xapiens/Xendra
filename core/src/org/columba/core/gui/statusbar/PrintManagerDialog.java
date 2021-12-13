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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import org.columba.api.command.IWorkerStatusChangeListener;
import org.columba.api.command.WorkerStatusChangedEvent;
import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.help.HelpManager;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.swing.CTabbedPane;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.Constants;
import org.xendra.printdocument.DataFile;
import org.xendra.printdocument.PrintConstants;
import org.xendra.printdocument.PrintDocumentManager;
import org.xendra.printdocument.PrintJob;
import org.xendra.printdocument.PrintWorker;
import org.xendra.printdocument.devicewizard.PrinterWizardLauncher;

import javax.swing.JTable;
import javax.swing.JTabbedPane;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.ListSelectionModel;

/**
 * Dialog showing all running Print tasks.
 * <p>
 * Lets the user cancel or print tasks.
 * 
 * @author xapiens
 */
public class PrintManagerDialog extends JDialog implements ActionListener, IWorkerStatusChangeListener
{

	private static PrintManagerDialog instance;
	private ButtonWithMnemonic printButton;
	private ButtonWithMnemonic infoButton;
	private PrintJob m_elementToPrint;
	private PrintJob m_elementInfo;
	private List<String> queues = new ArrayList<String>();
	private CTabbedPane maintab;
	private PrintDocumentManager pm = PrintDocumentManager.getInstance(); 
	public PrintManagerDialog() {
		super((JFrame) null, "Print Manager", false);		
		initComponents();
		pack();
		setLocationRelativeTo(null);		
	}

	public static PrintManagerDialog createInstance() {
		if (instance == null) {
			instance = new PrintManagerDialog();
		}
		if (!instance.isVisible()) {
			instance.update();
			instance.setVisible(true);
		}
		instance.toFront();

		return instance;
	}

	public void initComponents() {
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));		
		maintab = new CTabbedPane(JTabbedPane.TOP);
		mainPanel.add(maintab, BorderLayout.NORTH);
		
		//buildqueues();
		update();

		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 6, 0));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		ButtonWithMnemonic addButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("", "global", "add"));
		addButton.setActionCommand(Constants.ADD);
		addButton.addActionListener(this);
		addButton.setEnabled(true);
		buttonPanel.add(addButton);
		
		infoButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("","global","info"));
		infoButton.setActionCommand(Constants.INFO);
		infoButton.addActionListener(this);
		infoButton.setEnabled(false);
		buttonPanel.add(infoButton);
		
		ButtonWithMnemonic closeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("", "global", "close"));
		closeButton.setActionCommand(Constants.CLOSE); //$NON-NLS-1$
		closeButton.addActionListener(this);
		buttonPanel.add(closeButton);

		ButtonWithMnemonic helpButton = new ButtonWithMnemonic(
				GlobalResourceLoader.getString("", "global", "help"));
		buttonPanel.add(helpButton);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		getRootPane().setDefaultButton(closeButton);
		getRootPane().registerKeyboardAction(this, "CLOSE",
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);

		// associate with JavaHelp
		HelpManager.getInstance().enableHelpOnButton(helpButton,"organising_and_managing_your_email_3");
		HelpManager.getInstance().enableHelpKey(getRootPane(),"organising_and_managing_your_email_3");
		
		getContentPane().add(mainPanel);
	}

	//private void AddQueue(int j) {		
	private void AddQueue(int mpid) {
		JPanel tab = new JPanel(new BorderLayout());				
		CTabbedPane tabbedPane = new CTabbedPane(JTabbedPane.BOTTOM);
		String titlepm = String.format("%s (%s)", pm.getrawQueue().get(mpid), pm.getMachinePrinter(mpid).getDeviceName());		
		maintab.addTab(titlepm, null, tabbedPane, null);
		tabbedPane.addTab("pendiente", null, tab, null);
		tab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 6));
		//
		// trabajos en cola
		JTable currentPrintJobs = new JTable();				
		currentPrintJobs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		currentPrintJobs.getSelectionModel().addListSelectionListener(new PrintListSelectionListener(mpid,"info"));
		currentPrintJobs.setModel(pm.getPrint().get(mpid));
		JScrollPane scrollPaneCurrent = new JScrollPane(currentPrintJobs);
		scrollPaneCurrent.setPreferredSize(new Dimension(500, 250));
		scrollPaneCurrent.getViewport().setBackground(Color.white);
		tab.add(scrollPaneCurrent);		
		//
		JPanel secondTab = new JPanel();
		tabbedPane.addTab(Msg.getMsg(Env.getCtx(), "impreso"), null, secondTab, null);
		secondTab.setLayout(new BorderLayout(0, 0));				
		// trabajos impresos
		JTable printedPrintJobs = new JTable();
		printedPrintJobs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		printedPrintJobs.getSelectionModel().addListSelectionListener(new PrintListSelectionListener(mpid, "print"));
		printedPrintJobs.setModel(pm.getPrinted().get(mpid));
		JScrollPane scrollPanePrinted = new JScrollPane(printedPrintJobs);
		secondTab.add(scrollPanePrinted);		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		secondTab.add(panel_1, BorderLayout.SOUTH);
		//				
		printButton = new ButtonWithMnemonic("&Print");		
		printButton.setActionCommand(Constants.PRINT);
		printButton.addActionListener(this);
		panel_1.add(printButton);
		printButton.setEnabled(false);
		queues.add(pm.getrawQueue().get(mpid));		
	}
	
	private void update() {
		//PrintDocumentManager pm = PrintDocumentManager.getInstance();
		pm.build();
		HashMap printers = pm.getPrinters();
		Iterator it = printers.keySet().iterator();
		while (it.hasNext()) {
			Integer printid = (Integer) it.next();
			String queue = (String) pm.getrawQueue().get(printid);
			if (!queues.contains(queue)) {
				AddQueue(printid);
			}
		}
		pack();
	}

	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals(Constants.CLOSE)) {
			setVisible(false);
		} else if (action.equals(Constants.CANCEL)) {

		} else if (action.equals("KILL")) {

		} else if (action.equals("REFRESH")) {
			//UpdatePendings();
		} else if (action.equals("PRINT")) {
			Print();
		} else if (action.equals("INFO")) {
			Info();
		} else if (action.equals(Constants.ADD)) {
			PrinterWizardLauncher nn = new PrinterWizardLauncher();
			nn.launchWizard();				
			update();
		}
			
	}

	private void Info() {
		if (m_elementInfo != null)
		{
			 int machineprinterid = m_elementInfo.getControlFile().getA_MachinePrinter_ID();
			 X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), machineprinterid, null);
			 String destination = mp.getDeviceName();			
		}
	}
	private void Print() {
		if (m_elementToPrint != null)
		{
			try {
				DataFile dataFile = m_elementToPrint.getDataFile();
				PrintWorker pw = dataFile.getContents();
				Socket socket = new Socket(pm.getLocalHost(),PrintConstants.port);														
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(pw);
				int x = in.read();
				if (x == 0)
				{
					//System.out.println("ACK");
				}
				in.close();
				oos.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}		
	}

	public void workerStatusChanged(WorkerStatusChangedEvent e) {
		final WorkerStatusChangedEvent event = e;

		switch (e.getType()) {

		case WorkerStatusChangedEvent.DISPLAY_TEXT_CHANGED:
			break;

		case WorkerStatusChangedEvent.DISPLAY_TEXT_CLEARED:
			break;

		case WorkerStatusChangedEvent.PROGRESSBAR_MAX_CHANGED:
			break;

		case WorkerStatusChangedEvent.PROGRESSBAR_VALUE_CHANGED:
			break;

		case WorkerStatusChangedEvent.FINISHED:
		}
	}
	
	class PrintListSelectionListener implements ListSelectionListener
	{
		private int m_mpid = 0;
		private String m_command = ""; 
		PrintListSelectionListener(int mpid, String command)
		{
			m_mpid = mpid;
			m_command = command;
		}
		public void valueChanged(ListSelectionEvent evt)
		{								
	        ListSelectionModel lsm = (ListSelectionModel)evt.getSource();
	        if (lsm.isSelectionEmpty()) {
	        	if (m_command.equals("info"))
	        		m_elementInfo = null;
	        	else if (m_command.equals("print"))
	        		m_elementToPrint = null;
	        }
	        else
	        {
	        	int maxIndex = lsm.getMaxSelectionIndex();
	        	if (m_command.equals("info"))
	        	{
	        		m_elementInfo = pm.getQueueList().get(m_mpid).getJob(maxIndex);
	        	}	
	        	else if (m_command.equals("print"))
	        	{	        		
	        		m_elementToPrint = pm.getQueueList().get(m_mpid).getPrintedJob(maxIndex);
	        	}
	        }														
        	infoButton.setEnabled(m_elementInfo != null);
        	printButton.setEnabled(m_elementToPrint != null);
		}		
	}	
}