package org.xendra.mfe.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.apps.ADialog;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.mfe.folder.PluginFolder;
import org.xendra.mfe.gui.frame.MFEFrameController;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

public class SaveMessageAction extends AbstractColumbaAction implements TreeSelectionListener {
	private AbstractFolder node;
	public SaveMessageAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_savemessage"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_savemessage_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_savemessage_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.mfe", "document-save.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.mfe", "document-save.png"));
		if (frameMediator instanceof MFEFrameController) {
			((MFEFrameController) frameMediator).addTreeSelectionListener(this);
		}
		setEnabled(true);								
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractFolder message = null;
		if (node.getNode().getName().equals("message")) {
			message = node;
		} else {
			message = (AbstractFolder) node.getParent();
			if (message == null) {  			
				ADialog.error(0, null, "Seleccione un elemento");
				return;
			}
			while (!message.getNode().getName().equals("message")) {
				message = ((AbstractFolder) message.getParent());
				if (message.getNode().getName().equals("message")) {
					break;
				}
			}			
		}
		if (message.getNode().getName().equals("message")) {
			Element element = message.getNode();
			String messageformatid = element.getAttributeValue("uid");
			String queuename = element.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_QueueName);
			Boolean lockout = element.getAttributeValue("lockout").equals("Y");
			X_AD_MessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
				.setParameters(Integer.valueOf(messageformatid)).first();
			format.setQueueName(queuename);
			format.setLockout(lockout);
			Document doc = new Document();
			doc = message.export(doc, null);
			XMLOutputter xmOut = new XMLOutputter(Format.getPrettyFormat()); 
			System.out.println("----" + xmOut.outputString(doc));
			format.setFormat(xmOut.outputString(doc));
			format.save();
		}		
	}	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getNewLeadSelectionPath();
		if (p == null)
			return;
		node = (AbstractFolder) p.getLastPathComponent();
		if (node != null) {
			if (node instanceof PluginFolder) {				
				setEnabled(false);
			}
			else
				setEnabled(true);						
		}		
	}	
}
