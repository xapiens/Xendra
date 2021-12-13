package org.xendra.pfe.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.apps.ADialog;
import org.compiere.model.reference.REF_C_PrinterFormatType;
import org.compiere.util.Env;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.dialog.ProcessDialog;
import org.xendra.pfe.gui.frame.PFEFrameController;
import org.xendra.pfe.util.ResourceLoader;

public class StorageAction extends AbstractColumbaAction implements TreeSelectionListener {
	//private NewEditor m_editor;
	private AbstractFolder node;
	public StorageAction(IFrameMediator frameMediator) throws IOException {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "storage"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","storage_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","storage_toolbar"));
		putValue(SMALL_ICON, new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "db.png")))));
		putValue(LARGE_ICON, new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "db.png")))));		
		if (frameMediator instanceof PFEFrameController) {
			((PFEFrameController) frameMediator).addTreeSelectionListener(this);					
			setEnabled(true);
		}
		else
			setEnabled(false);								
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractFolder f = node;
		while (!(f instanceof FormatFolder)) {
			f = (AbstractFolder) f.getParent();
		}
		if (f instanceof FormatFolder) {				
			FormatFolder ff = (FormatFolder) f;
			String type = ff.getPrinterDocumentFormat().getC_PrinterFormatType();
			if (type == null) {
				ADialog.error(0, null, "The Type of PrinterFormat not defined");
			}
			else if (type != null && type.equals(REF_C_PrinterFormatType.Process)) {
				ProcessDialog dlg = new ProcessDialog(ff);
				dlg.setModal(true);
				dlg.setFormatFolder(ff);
				dlg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dlg.setVisible(true);				
			}			
			//				
		}
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (e.getNewLeadSelectionPath() == null)
			return;
		node = (AbstractFolder) e.getNewLeadSelectionPath().getLastPathComponent();
	}

}
