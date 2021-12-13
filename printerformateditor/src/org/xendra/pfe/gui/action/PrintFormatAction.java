package org.xendra.pfe.gui.action;

import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.search.Info;
import org.compiere.apps.search.InfoInOut;
import org.compiere.apps.search.InfoInvoice;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MQuery;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.util.Env;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.formateditor.NewEditor;
import org.xendra.pfe.gui.frame.PFEFrameController;
import org.xendra.pfe.util.ResourceLoader;
import org.xendra.printdocument.ParseFormat;
import org.xendra.printdocument.PrintWorker;
import org.xendra.printdocument.PrinterDocumentCtrl;

public class PrintFormatAction extends AbstractColumbaAction implements TreeSelectionListener {
	private NewEditor m_editor;
	private FormatFolder f;
	public PrintFormatAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_printformat"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_printformat_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_printformat_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.pfe", "print.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.pfe", "print.png"));		
		if (frameMediator instanceof PFEFrameController) {
			((PFEFrameController) frameMediator).addTreeSelectionListener(this);
			m_editor = ((PFEFrameController) frameMediator).GetEditor();			
			setEnabled(false);
		}
		else
			setEnabled(false);				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (m_editor != null) {
			m_editor.getEditor().print(f);
		}
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (e.getNewLeadSelectionPath() == null)
			return;
		AbstractFolder node = (AbstractFolder) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node != null) {
			if (node instanceof FormatFolder) {
				f = (FormatFolder) node;
				setEnabled(true);
			}
			else
				setEnabled(false);						
		}
	}
}
