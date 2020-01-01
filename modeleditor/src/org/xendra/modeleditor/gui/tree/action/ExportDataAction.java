package org.xendra.modeleditor.gui.tree.action;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.compiere.apps.ADialog;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;
import org.xendra.modeleditor.folder.TableFolder;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameController;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameMediator;
import org.xendra.modeleditor.gui.tree.TreeView;

import com.l2fprod.common.swing.JDirectoryChooser;

public class ExportDataAction extends AbstractColumbaAction implements TreeSelectionListener {

	public ExportDataAction(IFrameMediator frameMediator) {
		super(frameMediator, "ExportDataAction");
		setEnabled(false);
		((ModelEditorFrameMediator) frameMediator).addTreeSelectionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ModelEditorFrameController frameController = (ModelEditorFrameController) getFrameMediator();
		TableFolder folder = (TableFolder) frameController.getTree().getSelectedFolder();
		TableFolder f = (TableFolder) folder;		
		//Integer uid = Integer.valueOf( (String) f.getId());
		Integer uid = Integer.valueOf(f.getElement().getAttributeValue("uid"));
		MTable table = new Query(Env.getCtx(), MTable.Table_Name, "AD_Table_ID = ?", null)
			.setParameters(uid).first();
		if (table != null) {
			JDirectoryChooser chooser;
			chooser = new JDirectoryChooser();
			JTextArea accessory = new JTextArea("seleccione el folder donde desea generar el modelo");
			accessory.setLineWrap(true);
			accessory.setWrapStyleWord(true);
			accessory.setEditable(false);
			accessory.setOpaque(false);
			accessory.setFont(UIManager.getFont("Tree.font"));
			chooser.setAccessory(accessory);
			int choice = chooser.showOpenDialog(null);
			if (choice == JDirectoryChooser.APPROVE_OPTION) {
				File[] selectedFiles = chooser.getSelectedFiles();
				for (int i = 0, c = selectedFiles.length; i < c; i++) {
					File ret = selectedFiles[i];
					String[] args = {ret.getAbsolutePath().concat("/"), 
					table.getTableName(),
					""};
					org.xendra.developer.encode.main(args);
				}
			}
		}
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			ModelEditorTreeNode node = (ModelEditorTreeNode) treeview.getSelectionPath().getLastPathComponent();			
			if (node instanceof  TableFolder) {
				setEnabled(true);			
			} else {
				setEnabled(false);
			}			
		}								
	}

}
