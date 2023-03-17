package org.xendra.mfe.gui.tree;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.core.gui.base.DoubleClickListener;
import org.columba.core.gui.menu.MenuXMLDecoder;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.jdom.Element;
import org.xendra.mfe.folder.MessageFolder;
import org.xendra.mfe.folder.PluginFolder;
import org.xendra.mfe.folder.SectionFolder;
import org.xendra.mfe.gui.frame.MFEFrameController;
import org.xendra.mfe.wizard.export.ExportWizardLauncher;
import org.xendra.mfe.wizard.newField.NewFieldWizardLauncher;
import org.xendra.mfe.wizard.newFields.NewFieldsWizardLauncher;
import org.xendra.mfe.wizard.newMessage.NewMessageWizardLauncher;
import org.xendra.mfe.wizard.newProcess.NewProcessWizardLauncher;
import org.xendra.mfe.wizard.newSection.NewSectionWizardLauncher;
import org.xendra.model.AbstractFolder;

public class TreeController extends DoubleClickListener implements ActionListener {
	private static final String ADDMESSAGE = "ADDM";
	private static final String ADDFIELDS = "ADDFS";
	private static final String ADDFIELD = "ADDF";
	private static final String ADDSECTION = "ADDS";
	private static final String ADDPROCESS = "ADDP";
	private static final String EXPORT = "EXP";
	private static final String DELETE = "DEL";
	TreeView view;
	MFEFrameController frameController;
	private JPopupMenu menu;
	public TreeController(MFEFrameController frameController) {
		super();
		this.frameController = frameController;
		view = new TreeView(frameController);
		view.addMouseListener(this);
	}
	public TreeView getView() {
		return view;
	}
	public MFEFrameController getFrameController() {
		return frameController;
	}
	public AbstractFolder getSelectedFolder() {
		return (AbstractFolder) getView().getLastSelectedPathComponent();
	}	
	public void setSelectedFolder(AbstractFolder folder) {
		getView().clearSelection();
		TreePath path = new TreePath(folder.getPath());
		getView().setSelectionPath(path);
		getView().scrollPathToVisible(path);
	}
	/**
	 * Creates a Popup menu.
	 */
	public void createPopupMenu() {
		try {
			File resource = new File(Env.getResource("org.xendra.mfe", "tree_contextmenu.xml"));
			if (resource.exists()) {
				InputStream is = new FileInputStream(resource);
				menu = new MenuXMLDecoder(frameController).createPopupMenu(is);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the pop up menu for the controller.
	 *
	 * @return the pop up menu.
	 */
	public JPopupMenu getPopupMenu(Component component) {
		AbstractFolder f = getSelectedFolder();
		menu = new JPopupMenu("Edit");
		try {
			ImageIcon message = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "message.png"))));
			ImageIcon field = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "field.png"))));
			ImageIcon process = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe","process.png"))));
			ImageIcon section = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "section.png"))));
			ImageIcon deleteIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			JMenuItem del = new JMenuItem(Msg.translate(Env.getCtx(), "Delete"),deleteIcon);
			del.setActionCommand(DELETE);
			del.addActionListener(this);
			if (f instanceof PluginFolder) {
				JMenuItem addmessage = new JMenuItem("Add Message", message);
				addmessage.setActionCommand(ADDMESSAGE);
				addmessage.addActionListener(this);
				menu.add(addmessage);
			}
			else if (f instanceof MessageFolder) {
				JMenuItem addsection = new JMenuItem("Add Section", section);
				addsection.setActionCommand(ADDSECTION);
				addsection.addActionListener(this);
				menu.add(addsection);
				//
				JMenuItem addprocess = new JMenuItem("Add Process", process);
				addprocess.setActionCommand(ADDPROCESS);
				addprocess.addActionListener(this);
				menu.add(addprocess);
				//
				JMenuItem export = new JMenuItem("Export", process);
				export.setActionCommand(EXPORT);
				export.addActionListener(this);
				menu.add(export);
			}
			else if (f instanceof SectionFolder) {
				JMenuItem addfields = new JMenuItem("Add Fields...", field);
				addfields.setActionCommand(ADDFIELDS);
				addfields.addActionListener(this);
				menu.add(addfields);
				
				JMenuItem addfield = new JMenuItem("Add Field", field);
				addfield.setActionCommand(ADDFIELD);
				addfield.addActionListener(this);
				menu.add(addfield);
				//
				JMenuItem addsection = new JMenuItem("Add Section", section);
				addsection.setActionCommand(ADDSECTION);
				addsection.addActionListener(this);
				menu.add(addsection);
			}
			menu.add(del);
		}  catch (Exception e) {
			e.printStackTrace();
		}		
		return menu;
	}	

	@Override
	public void doubleClick(MouseEvent e) {
		if (e.getButton()==MouseEvent.BUTTON1 && e.getClickCount() > 1) {
			AbstractFolder f = getSelectedFolder();
			return;			
		}

	}
	public void findNode(Element field) {
		AbstractFolder folder = getView().getRootFolder();
		AbstractFolder node = folder.findNode(field);
		if (node != null)
		{
			TreePath treePath = new TreePath(node.getPath());
			view.setSelectionPath(treePath);
			view.makeVisible(treePath);       	//	expand it
			view.scrollPathToVisible(treePath);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractFolder f = getSelectedFolder();
		Element item = (Element) f.getNode();
		boolean delete = false;
		if (e.getActionCommand().equals(ADDMESSAGE)) {
			NewMessageWizardLauncher wz = new NewMessageWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(ADDFIELD)) {
			NewFieldWizardLauncher wz = new NewFieldWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(ADDFIELDS)) {
			NewFieldsWizardLauncher wz = new NewFieldsWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(ADDSECTION)) {
			NewSectionWizardLauncher wz = new NewSectionWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(ADDPROCESS)) {
			NewProcessWizardLauncher wz = new NewProcessWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(EXPORT)) {
			ExportWizardLauncher wz = new ExportWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(DELETE)) {			
			AbstractFolder parent = (AbstractFolder) f.getParent();
			parent.getNode().removeContent(f.getNode());
			//f.delete();			
			f.removeFromParent();
			delete = true;
			((DefaultTreeModel) getView().getModel()).reload(parent);
		}		
		f.loadChildren();
		if (!delete)
			((DefaultTreeModel) getView().getModel()).reload(f);
	}				
}
