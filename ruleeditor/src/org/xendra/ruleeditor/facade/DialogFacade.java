package org.xendra.ruleeditor.facade;

import java.net.URI;
import java.util.Iterator;

import javax.swing.JOptionPane;


import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.gui.frame.FrameManager;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.CLogMgt;
import org.xendra.ruleeditor.folder.IRuleFolder;
import org.xendra.ruleeditor.gui.tree.RuleEditorTreeModel;

public class DialogFacade {

	public void openEventEditorDialog(URI location) {
		String s = location.toString();
		// TODO: @author fdietz replace with regular expression
		int activityIndex = s.lastIndexOf('/');
		String activityId = s.substring(activityIndex + 1, s.length());
		int folderIndex = s.lastIndexOf('/', activityIndex - 1);
		String folderId = s.substring(folderIndex + 1, activityIndex);
		int componentIndex = s.lastIndexOf('/', folderIndex - 1);
		String componentId = s.substring(componentIndex + 1,
				folderIndex);

		IContainer[] container = FrameManager.getInstance().getOpenFrames();
		if (container == null || container.length == 0)
			throw new RuntimeException("No frames available");

		IFrameMediator frameMediator = container[0].getFrameMediator();
		IRuleFolder folder = (IRuleFolder) RuleEditorTreeModel.getInstance().getFolder(folderId);
		X_AD_Rule card = null;
		try {
			card = (X_AD_Rule) folder.get(Integer.valueOf(componentId));
		} catch (Exception e) {
			if (CLogMgt.DEBUG)
				e.printStackTrace();
			ErrorDialog.createDialog(e.getMessage(), e);
		}

		// 
//		ContactEditorDialog dialog = new ContactEditorDialog(frameMediator.getView().getFrame(), card);
//
//		if (dialog.getResult()) {
//
//			try {
//				// modify card properties in folder
//				folder.modify(contactId, dialog.getDestModel());
//			} catch (Exception e1) {
//				if (Logging.DEBUG)
//					e1.printStackTrace();
//
//				ErrorDialog.createDialog(e1.getMessage(), e1);
//			}
//
//		}		
		
	}
}
