package org.xendra.pfe.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.util.Env;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.formateditor.NewEditor;
import org.xendra.pfe.gui.frame.PFEFrameController;
import org.xendra.pfe.util.ResourceLoader;

public class SaveAction extends AbstractColumbaAction implements TreeSelectionListener {
	private NewEditor m_editor;
	private AbstractFolder node;
	public SaveAction(IFrameMediator frameMediator) throws IOException {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_save"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_save_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_save_toolbar"));
		putValue(SMALL_ICON, new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "save.png")))));
		putValue(LARGE_ICON, new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "save.png")))));		
		if (frameMediator instanceof PFEFrameController) {
			((PFEFrameController) frameMediator).addTreeSelectionListener(this);
			m_editor = ((PFEFrameController) frameMediator).GetEditor();			
			setEnabled(true);
		}
		else
			setEnabled(false);						
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		if (m_editor != null) {			
			AbstractFolder f = node;
			while (!(f instanceof FormatFolder)) {
				f = (AbstractFolder) f.getParent();
			}
			if (f instanceof FormatFolder) {
				String format = m_editor.getEditor().getEditor().getText();
				FormatFolder ff = (FormatFolder) f;
				ff.getPrinterDocumentFormat().setFormat(format);				
				ff.save();		
			}
		}
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (e.getNewLeadSelectionPath() == null)
			return;
		node = (AbstractFolder) e.getNewLeadSelectionPath().getLastPathComponent();
	}	
}
