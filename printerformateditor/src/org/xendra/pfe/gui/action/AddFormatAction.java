package org.xendra.pfe.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.frame.PFEFrameController;
import org.xendra.pfe.util.ResourceLoader;


public class AddFormatAction extends AbstractColumbaAction implements TreeSelectionListener  {
	public AddFormatAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_addformat"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_addformat_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_addformat_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.pfe", "list-add.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.pfe", "list-add.png"));
		if (frameMediator instanceof PFEFrameController) {
			((PFEFrameController) frameMediator).addTreeSelectionListener(this);
			setEnabled(false);
		}
		else
			setEnabled(false);						
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (e.getNewLeadSelectionPath() == null)
			return;
		AbstractFolder node = (AbstractFolder ) e.getNewLeadSelectionPath().getLastPathComponent();
		if (node != null) {
			Element item = node.getNode();
			if (node instanceof FormatFolder) {				
				setEnabled(true);
			}
			else
				setEnabled(false);						
		}		
	}
}
