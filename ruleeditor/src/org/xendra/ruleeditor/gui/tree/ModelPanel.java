package org.xendra.ruleeditor.gui.tree;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JFrame;

import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.GridPanel;
import org.compiere.apps.ProcessModalDialog;
import org.compiere.apps.form.FormFrame;
import org.compiere.grid.GridController;
import org.compiere.grid.ed.VButton;
import org.compiere.grid.ed.VDocAction;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.GridWindow;
import org.compiere.model.GridWindowVO;
import org.compiere.model.MProcess;
import org.compiere.model.MQuery;
import org.compiere.model.MTab;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.swing.CButton;
import org.compiere.util.ASyncProcess;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.frapuccino.swing.ActiveWindowTracker;

public class ModelPanel extends GridPanel implements ActionListener, ASyncProcess {
	private int m_curWindowNo;
	private GridTab m_curTab;
	private GridController m_curGC;
	private Properties  m_ctx;
	private boolean access = true;
	private ModelForm m_form;
	private static CLogger log = CLogger.getCLogger(ModelForm.class);	
	public ModelPanel(MQuery query) {
		m_ctx = Env.getCtx();
		MTable t = new Query(Env.getCtx(), MTable.Table_Name, "tablename = ? ", null)
		.setParameters(query.getTableName()).first();
		List<MTab> mTabs = new Query(Env.getCtx(), MTab.Table_Name, "AD_Table_ID = ?", null)		
		.setParameters(t.getAD_Table_ID()).list();		
		Window w = ActiveWindowTracker.findActiveWindow();
		JFrame f = Env.getFrame(w);														
		m_curWindowNo = Env.getWindowNo(f);																						
		GridWindowVO wVO = AEnv.getMWindowVO (m_curWindowNo, mTabs.get(0).getAD_Window_ID(), 0);
		if (wVO == null)
		{
			access = false;
			ADialog.error(m_curWindowNo, this, "AccessCannotReport");
			return;
		}
		GridWindow m_mWindow = new GridWindow (wVO);
		m_curTab = m_mWindow.getTab(0);
		m_mWindow.initTab(0);
		//
		m_curGC = new GridController();
		m_curGC.initGrid(m_curTab, false, m_curWindowNo, this, null);
		add(m_curGC, BorderLayout.CENTER);
		m_curTab.setQuery(query);
		m_curTab.query(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof VButton)
		{
			actionButton((VButton)e.getSource());
			//setBusy(false, true);
			return;
		} else if (e.getSource() instanceof CButton) {
			CButton b = (CButton) e.getSource();
			String command = b.getActionCommand();
			if (command.equals("Refresh")) {
				m_curTab.dataRefresh();
			} else if (command.equals("Zoom")) {

			} else if (command.equals("Ok")) {					
				m_form.dispose();
			} else if (command.equals("Cancel")) {
				m_form.dispose();
			}
		}		
	}

	/**************************************************************************
	 *	Start Button Process
	 *  @param vButton button
	 */
	private void actionButton (VButton vButton)
	{
		boolean startWOasking = false;
		////		boolean batch = false;
		String col = vButton.getColumnName();
		//
		//		//  Zoom
		//		if (col.equals("Record_ID"))
		//		{
		//			int AD_Table_ID = Env.getContextAsInt (m_ctx, m_curWindowNo, "AD_Table_ID");
		//			int Record_ID = Env.getContextAsInt (m_ctx, m_curWindowNo, "Record_ID");
		//			AEnv.zoom(AD_Table_ID, Record_ID);
		//			return;
		//		}   //  Zoom
		//
		//		//  save first	---------------
		if (m_curTab.needSave(true, false))
			if (!cmd_save(true))
				return;
		int table_ID = m_curTab.getAD_Table_ID();
		int record_ID = m_curTab.getRecord_ID();
		boolean isProcessMandatory = false;
		if (col.equals("DocAction"))
		{
			isProcessMandatory = true;
			VDocAction vda = new VDocAction(m_curWindowNo, m_curTab, vButton, record_ID);
			//	Something to select from?
			if (vda.getNumberOfOptions() == 0)
			{
				vda.dispose ();
				log.info("DocAction - No Options");
				return;
			}
			else
			{
				vda.setVisible(true);
				if (!vda.isStartProcess())
					return;
				//				batch = vda.isBatch();
				startWOasking = true;
				vda.dispose();
			}
		}	//	DocAction

		//  Pop up Create From

		/**
		 *  Start Process ----
		 *  or invoke user form
		 */

		log.config("Process_ID=" + vButton.getProcess_ID() + ", Record_ID=" + record_ID);
		if (vButton.getProcess_ID() == 0)
		{
			if (isProcessMandatory)
			{
				ADialog.error(m_curWindowNo, this, null, Msg.parseTranslation(m_ctx, "@NotFound@ @AD_Process_ID@"));
			}
			return;
		}
		// call form
		MProcess pr = new MProcess(m_ctx, vButton.getProcess_ID(), null);
		int form_ID = pr.getAD_Form_ID();
		if (form_ID != 0 )
		{

			//			if (m_curTab.needSave(true, false))
			//				if (!cmd_save(true))
			//					return;

			FormFrame ff = new FormFrame(getGraphicsConfiguration());
			String title = vButton.getDescription();
			if (title == null || title.length() == 0)
				title = vButton.getName();
			ProcessInfo pi = new ProcessInfo (title, vButton.getProcess_ID(), table_ID, record_ID);
			pi.setAD_User_ID (Env.getAD_User_ID(m_ctx));
			pi.setAD_Client_ID (Env.getAD_Client_ID(m_ctx));
			Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
			//
			ProcessInfoParameter pip;
			pip = new ProcessInfoParameter("m_curWindowNo", m_curWindowNo , null, null, null);
			tabParams.add(pip);
			pip = new ProcessInfoParameter("m_curTab", m_curTab , null, null, null);
			tabParams.add(pip);
			//			
			pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));			
			ff.setProcessInfo(pi);
			ff.openForm(form_ID);
			ff.pack();
			AEnv.showCenterScreen(ff);
			return;
		}
		else {
			ProcessModalDialog dialog = new ProcessModalDialog(m_ctx, Env.getWindow(m_curWindowNo), Env.getHeader(m_ctx, m_curWindowNo),
					this, m_curWindowNo, vButton.getProcess_ID(), table_ID,
					record_ID, startWOasking);
			if (dialog.isValidDialog())
			{
				dialog.validate();
				dialog.pack();
				AEnv.showCenterWindow(Env.getWindow(m_curWindowNo), dialog);
			}
			else if (dialog.getSummary() != null && dialog.getSummary().length() > 0)
			{				
				ADialog.error(m_curWindowNo, null, "(No Valid)", dialog.getSummary());
			}
		}
	}	//	actionButton

	/**
	 *  If required ask if you want to save and save it
	 *  @param manualCmd true if invoked manually (i.e. force)
	 *  @return true if saved
	 */
	public boolean cmd_save (boolean manualCmd)
	{
		//if (m_curAPanelTab != null)
		manualCmd = false;
		log.config("Manual=" + manualCmd);
		//m_errorDisplayed = false;
		m_curGC.stopEditor(true);
		m_curGC.acceptEditorChanges();

		//if (m_curAPanelTab != null)
		//{
		//	m_curAPanelTab.saveData();
		//	aSave.setEnabled(false);	//	set explicitly
		//}

		if (m_curTab.getCommitWarning().length() > 0 && m_curTab.needSave(true, false))
			if (!ADialog.ask(m_curWindowNo, this, "SaveChanges?", m_curTab.getCommitWarning()))
				return false;

		//  manually initiated
		boolean retValue = m_curTab.dataSave(manualCmd);
		//   if there is no previous error
		//		if (manualCmd && !retValue && !m_errorDisplayed)
		//		{
		//			showLastError();
		//		}
		if (retValue)
			m_curGC.rowChanged(true, m_curTab.getRecord_ID());
		if (manualCmd) {
			m_curGC.dynamicDisplay(0);
			//if (!isNested)
			//	m_window.setTitle(getTitle());
		}

		//BEGIN - [FR 1953734]
		if(m_curGC.isDetailGrid() && retValue){
			m_curGC.getGCParent().refreshMTab(m_curGC);
		}
		//END - [FR 1953734]

		return retValue;
	}   //  cmd_save

	/**************************************************************************
	 *  Process Callout(s).
	 *  <p>
	 *  The Callout is in the string of
	 *  "class.method;class.method;"
	 * If there is no class name, i.e. only a method name, the class is regarded
	 * as CalloutSystem.
	 * The class needs to comply with the Interface Callout.
	 *
	 * @param field field
	 * @return error message or ""
	 * @see org.compiere.model.Callout
	 */
	private String processButtonCallout (VButton button)
	{
		GridField field = m_curTab.getField(button.getColumnName());
		return m_curTab.processCallout(field);
	}	//	processButtonCallout
	@Override
	public void lockUI(ProcessInfo pi) {
		// TODO Auto-generated method stub

	}
	@Override
	public void unlockUI(ProcessInfo pi) {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean isUILocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void executeASync(ProcessInfo pi) {
		// TODO Auto-generated method stub

	}

	public boolean hasAccess() {
		return access ;
	}

	public void setDialog(ModelForm form) {
		m_form = form;		
	}	
}
