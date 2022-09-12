package org.xendra.efact.gui.tree;

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.api.gui.focus.FocusManager;
import org.columba.api.gui.focus.FocusOwner;
import org.columba.core.gui.menu.MenuXMLDecoder;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.apps.AEnv;
import org.compiere.apps.form.FormFrame;
import org.compiere.model.MQuery;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Msg;
import org.xendra.core.command.Environment;
import org.xendra.efact.folder.EFactTreeNode;
import org.xendra.efact.folder.ProviderFolder;
import org.xendra.efact.gui.frame.EFactFrameController;
import org.xendra.model.AbstractFolder;

public class TreeController implements FocusOwner, ActionListener {
	private static final String DELETE = "DEL";
	private static final String REFRESH = "REF";
	TreeView view;
	EFactFrameController frameController;
	private JPopupMenu menu;
	public TreeController(EFactFrameController frameController) {
		super();
		this.frameController = frameController;
		view = new TreeView(frameController);
		FocusManager.getInstance().registerComponent(this);
	}
	public TreeView getView() {
		return view;
	}
	public EFactFrameController getFrameController() {
		return frameController;
	}
	public EFactTreeNode getSelectedFolder() {
		return (EFactTreeNode) getView().getLastSelectedPathComponent();
	}
	public void setSelectedFolder(AbstractFolder folder) {
		getView().clearSelection();
		TreePath path = new TreePath(folder.getPath());
		getView().setSelectionPath(path);
	}
	@Override
	public boolean isCutActionEnabled() {		return false;	}
	public boolean isCopyActionEnabled() {		return false;	}
	public boolean isPasteActionEnabled() {		return false;	}
	public boolean isDeleteActionEnabled() {   return true;	}
	public boolean isSelectAllActionEnabled() {		return false; }
	public boolean isUndoActionEnabled() {		return false;}
	public boolean isRedoActionEnabled() {return false;	}
	public void cut() {}
	public void copy() {}
	public void paste() {}
	public void delete() {}
	public void undo() {}
	public void redo() {}
	public void selectAll() {}

	@Override
	public JComponent getComponent() {
		return getView();
	}

	public void createPopupMenu() {
		try {						
			File resource = new File(Env.getResource("org.xendra.efact", "tree_contextmenu.xml"));
			if (resource.exists()) {
				InputStream is = new FileInputStream(resource);
				menu = new MenuXMLDecoder(frameController).createPopupMenu(is);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public JPopupMenu getPopupMenu(Component component) {		
		EFactTreeNode f = getSelectedFolder();
		menu = new JPopupMenu("Edit");
		try {
			ImageIcon groupIcon = ImageLoader.getSmallIcon(IconKeys.USER);
			ImageIcon invoiceIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.efact", "drools.gif"))));
			ImageIcon deleteIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			ImageIcon refreshIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.efact", "refresh.png"))));
			JMenuItem del = new JMenuItem(Msg.translate(Env.getCtx(), "Delete"),deleteIcon);
			del.setActionCommand(DELETE);				
			del.addActionListener(this);						

			if (f instanceof ProviderFolder) {			
				//
			}

			menu.add(del);

			JMenuItem refresh = new JMenuItem(Msg.translate(Env.getCtx(), "Refresh"),refreshIcon);
			refresh.setActionCommand(REFRESH);				
			refresh.addActionListener(this);
			menu.add(refresh);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		EFactTreeNode f = getSelectedFolder();		
		int m_id = Integer.valueOf(f.getElement().getAttributeValue("uid"));
		/*if (e.getActionCommand().equals(ADDRULE)) {							
			
		} else */ 
		if (e.getActionCommand().equals(DELETE)) {
			/*
			 * 
			 * */
		}		
		f.loadChildren();
		((DefaultTreeModel) getView().getModel()).reload(f);			
	}
}
