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
package org.xendra.core.command;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.swing.Timer;

import org.columba.api.command.IWorkerStatusController;
import org.columba.core.command.Command;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ATask;
import org.compiere.apps.AWindow;
import org.compiere.apps.ProcessDialog;
import org.compiere.apps.form.FormFrame;
import org.compiere.model.MTask;
import org.compiere.model.reference.REF_WF_Action;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Msg;
import org.xendra.apps.WorkflowDialog;
import org.xendra.swing.ToastMessage;

public class XendraCommand extends Command implements ActionListener  {

	private static CLogger log = CLogger.getCLogger(XendraCommand.class);

	private static final int UPDATE_TIMER_INTERVAL = 100;

	private Timer updateTimer = new Timer(UPDATE_TIMER_INTERVAL, this);

	private IWorkerStatusController m_worker;

	private Integer m_progress = 0;

	public XendraCommand(XendraCommandReference ref) {
		super(ref);		
	}

	public void execute(IWorkerStatusController worker) throws Exception {
		XendraCommandReference r = (XendraCommandReference) getReference();
		try
		{
			m_worker = worker;
			m_worker.setProgressBarMaximum(100);			
			updateTimer.start();
			StringBuilder sql = new StringBuilder(); // "SELECT * FROM AD_Menu WHERE AD_Menu_ID=?";
			//
			boolean base = Env.isBaseLanguage(Env.getCtx(), "AD_Menu");
			if (base)
				sql.append("SELECT m.AD_Menu_ID, m.Name,m.Description,m.IsSummary,m.Action, "
						+ "m.AD_Window_ID, m.AD_Process_ID, m.AD_Form_ID, m.AD_Workflow_ID, m.AD_Task_ID, m.AD_Workbench_ID, m.ISSOTrx "
						+ "FROM AD_Menu m");
			else
				sql.append("SELECT m.AD_Menu_ID,  t.Name,t.Description,m.IsSummary,m.Action, "
						+ "m.AD_Window_ID, m.AD_Process_ID, m.AD_Form_ID, m.AD_Workflow_ID, m.AD_Task_ID, m.AD_Workbench_ID, m.ISSOTrx "
						+ "FROM AD_Menu m, AD_Menu_Trl t");
			if (!base)
				sql.append(" WHERE m.AD_Menu_ID=t.AD_Menu_ID AND t.AD_Language='")
				.append(Env.getAD_Language(Env.getCtx())).append("'")
				.append(" AND m.AD_Menu_ID=?");
			else
				sql.append(" WHERE m.AD_Menu_ID=?");
			//
			if (!r.isMenu())
				sql = new StringBuilder("SELECT * FROM AD_WF_Node WHERE AD_WF_Node_ID=?");

			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, r.getID());
			ResultSet rs = pstmt.executeQuery();

			if (rs.next())	//	should only be one
			{
				ToastMessage toastMessage = new ToastMessage(rs.getString("name"),3000);
				toastMessage.setVisible(true);
				m_worker.setDisplayText(rs.getString("name"));
				String Action = rs.getString("Action");
				String IsSOTrx = "Y";
				if (r.isMenu())
					IsSOTrx = rs.getString("IsSOTrx");
				int cmd;
				if (Action.equals(REF_WF_Action.UserWindow))				//	Window
				{
					cmd = rs.getInt("AD_Window_ID");
					startWindow(0, cmd);
				}
				else if (Action.equals(REF_WF_Action.AppsProcess) || Action.equals(REF_WF_Action.AppsReport))	//	Process & Report
				{
					cmd = rs.getInt("AD_Process_ID");
					startProcess(cmd, IsSOTrx);
				}
				else if (Action.equals(REF_WF_Action.UserWorkbench))		//	Workbench
				{
					cmd = rs.getInt("AD_Workbench_ID");
					startWindow (cmd, 0);
				}				
				else if (Action.equals(REF_WF_Action.SubWorkflow))		//	WorkFlow
				{
					if (r.isMenu())
						cmd = rs.getInt("AD_Workflow_ID");
					else
						cmd = rs.getInt("Workflow_ID");
					//if (m_menu != null)
					//	m_menu.startWorkFlow(cmd);
					WorkflowDialog.createInstance().startWorkflow(cmd);
				}
				else if (Action.equals(REF_WF_Action.AppsTask))		//	Task
				{
					cmd = rs.getInt("AD_Task_ID");
					startTask(cmd, r.getName());
				}
				else if (Action.equals(REF_WF_Action.UserForm))		//	Form
				{
					cmd = rs.getInt("AD_Form_ID");
					startForm(cmd);
				}
				else
					log.log(Level.SEVERE, "No valid Action in ID=" + r.getID());
			}	//	for all records

			rs.close();
			pstmt.close();			
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "ID=" + r.getID(), e);
			ADialog.error(0, null, "Error", Msg.parseTranslation(Env.getCtx(), e.getMessage()));
		}
		finally {
			updateTimer.stop();
		}
		try	{Thread.sleep(1000);}	//	1 sec
		catch (InterruptedException ie) {}

	}

	private void startWindow(int AD_Workbench_ID, int AD_Window_ID)
	{
		AWindow frame = (AWindow)Env.showWindow(AD_Window_ID); 
		if (frame != null) {
			Environment.getWindowManager().add(frame);
			return;
		}

		if (Ini.isPropertyBool(Ini.P_SINGLE_INSTANCE_PER_WINDOW)) {
			frame = Environment.getWindowManager().find(AD_Window_ID);
			if ( frame != null ) {
				frame.toFront();
				return;
			}
		}

		frame = new AWindow();
		boolean OK = false;
		if (AD_Workbench_ID != 0)
			OK = frame.initWorkbench(AD_Workbench_ID);
		else
			OK = frame.initWindow(AD_Window_ID, null);	//	No Query Value
		if (!OK)
			return;


		if (Ini.isPropertyBool(Ini.P_OPEN_WINDOW_MAXIMIZED) ) 
		{
			frame.pack();
			frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		}

		//	Center the window
		if (Ini.isPropertyBool(Ini.P_OPEN_WINDOW_MAXIMIZED) ) 
		{
			frame.setVisible(true);
			frame.toFront();
		} 
		else
		{
			frame.validate();
			AEnv.showCenterScreen(frame);
		}

		//m_menu.getWindowManager().add(frame);
		Environment.getWindowManager().add(frame);

		//			if (wfPanel.isVisible())
		//				m_WF_Window = frame;            //  maintain one reference
		frame = null;
	}	//	startWindow

	/**
	 *	Start Process.
	 *  Start/show Process Dialog which calls ProcessCtl
	 *  @param AD_Process_ID	process
	 *  @param IsSOTrx	is SO trx
	 */
	private void startProcess (int AD_Process_ID, String IsSOTrx)
	{			
		boolean isSO = false;
		if (IsSOTrx != null && IsSOTrx.equals("Y"))
			isSO = true;
		ProcessDialog pd = new ProcessDialog (AD_Process_ID, isSO);
		if (!pd.init())
			return;
		Environment.getWindowManager().add(pd);

		pd.getContentPane().invalidate();
		pd.getContentPane().validate();
		pd.pack();
		//	Center the window
		AEnv.showCenterScreen(pd);
	}	//	startProcess

	/**
	 *	Start OS Task
	 *  @param AD_Task_ID task
	 */
	private void startTask (int AD_Task_ID, String name)
	{
		//	Get Command
		MTask task = null;
		String sql = "SELECT * FROM AD_Task WHERE AD_Task_ID=?";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, AD_Task_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				task = new MTask (Env.getCtx(), rs, null);
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		if (task == null)
			return;

		Environment.getWindowManager().add(new ATask(name, task));
		//	ATask.start(m_name, task);
	}	//	startTask

	/**
	 *	Start Form
	 *  @param AD_Form_ID form
	 */
	private void startForm (int AD_Form_ID)
	{
		FormFrame ff = null;
		if (Ini.isPropertyBool(Ini.P_SINGLE_INSTANCE_PER_WINDOW)) {
			ff = Environment.getWindowManager().findForm(AD_Form_ID);
			if ( ff != null ) {
				ff.toFront();
				return;
			}
		}
		ff = new FormFrame();
		Environment.getWindowManager().add(ff);		
		if (!ff.openForm(AD_Form_ID)) return;		

		//	Center the window		
		if (Ini.isPropertyBool(Ini.P_OPEN_WINDOW_MAXIMIZED) ) {
			ff.pack();
			ff.setExtendedState(Frame.MAXIMIZED_BOTH);
			ff.setVisible(true);
			ff.toFront();
		} else
			AEnv.showCenterScreen(ff);
	}

	public void actionPerformed(ActionEvent e) {		
		if (e.getSource() == updateTimer) {			
			m_progress++;
			if (m_progress == m_worker.getProgessBarMaximum())
				m_progress = 0;			
			m_worker.setProgressBarValue(m_progress);

		}
	}	//	startForm
}
