package org.xendra.pfe.gui.tree;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.core.gui.base.DoubleClickListener;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FieldFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.folder.PluginFolder;
import org.xendra.pfe.gui.formateditor.NewEditor;
import org.xendra.pfe.gui.frame.PFEFrameController;
import org.xendra.pfe.wizard.export.ExportWizardLauncher;
import org.xendra.pfe.wizard.imp.ImportWizardLauncher;
import org.xendra.pfe.wizard.newField.NewFieldWizardLauncher;

public class TreeController extends DoubleClickListener implements ActionListener {
	//private static final String SYNCRO = "SINCRO";
	private static final String COMPILE = "COMPILE";
	private static final String ADDFIELD = "ADDFIELD";
	private static final String EXPORT = "EXPORT";
	private static final String COPY = "COPY";
	private static final String PASTE = "PASTE";
	private static final String DEL = "DEL";
	private static final String REFRESH = "REFRESH";
	private static final String IMPORT = "IMPORT";
	TreeView view;
	PFEFrameController frameController;	
	private JPopupMenu menu;
	private String m_source = null;
	public TreeController(PFEFrameController frameController) {
		super();
		this.frameController = frameController;
		view = new TreeView(frameController);
		view.addMouseListener(this);
	}
	public TreeView getView() {
		return view;
	}
	public PFEFrameController getFrameController() {
		return frameController;
	}
	public AbstractFolder getSelectedFolder() {
		return (AbstractFolder) getView().getLastSelectedPathComponent();
	}	
	public void setSelectedFolder(AbstractFolder folder) {
		getView().clearSelection();
		TreePath path = new TreePath(folder.getPath());
		getView().setSelectionPath(path);
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
			ImageIcon refresh = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "refresh.png"))));
			ImageIcon process = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "process.png"))));
			ImageIcon field = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "field.png"))));
			ImageIcon export = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "export.png"))));
			ImageIcon copy = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "copy.png"))));
			ImageIcon paste = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "paste.png"))));
			if (f instanceof FormatFolder) {
				JMenuItem sync = new JMenuItem("Refresh", refresh);
				sync.setActionCommand(REFRESH);
				sync.addActionListener(this);
				menu.add(sync);
				//
				JMenuItem compile = new JMenuItem("Compile", process);
				compile.setActionCommand(COMPILE);
				compile.addActionListener(this);
				menu.add(compile);

				JMenuItem addfield = new JMenuItem("Add Field", field);
				addfield.setActionCommand(ADDFIELD);
				addfield.addActionListener(this);
				menu.add(addfield);

				JMenuItem ef = new JMenuItem("Export", export);
				ef.setActionCommand(EXPORT);
				ef.addActionListener(this);
				menu.add(ef);

				JMenuItem cp = new JMenuItem("Copy", copy);
				cp.setActionCommand(COPY);
				cp.addActionListener(this);
				menu.add(cp);

				JMenuItem pt = new JMenuItem("Paste", paste);
				pt.setActionCommand(PASTE);
				pt.addActionListener(this);
				if (m_source != null) {
					pt.setEnabled(true);
				} else {
					pt.setEnabled(false);
				}
				menu.add(pt);

			} else if (f instanceof FieldFolder) {
				JMenuItem del = new JMenuItem("delete");
				del.setActionCommand(DEL);
				del.addActionListener(this);
				menu.add(del);
			} else if (f instanceof PluginFolder) {
				JMenuItem ref = new  JMenuItem("refresh");
				ref.setActionCommand(REFRESH);
				ref.addActionListener(this);
				menu.add(ref);

				JMenuItem imp = new JMenuItem("import");
				imp.setActionCommand(IMPORT);
				imp.addActionListener(this);
				menu.add(imp);
			}
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
	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractFolder f = getSelectedFolder();
		Element item = (Element) f.getNode();
		boolean delete = false;
		//if (e.getActionCommand().equals(SYNCRO)) {
		//	NewEditor m_editor = ((PFEFrameController) frameController).GetEditor();
		//	MPrinterDocumentFormat pdf = m_editor.getPrinterDocumentFormat();
		//	HashMap error = pdf.compile();
		if (e.getActionCommand().equals(REFRESH)) {
			f.loadChildren();
		}
		else if (e.getActionCommand().equals(COMPILE)) {
			NewEditor m_editor = ((PFEFrameController) frameController).GetEditor();
			m_editor.getEditor().buildDocumentMVEL((FormatFolder) f);
			f.loadChildren();
		} else if (e.getActionCommand().equals(DEL)) {
			//NewEditor m_editor = ((PFEFrameController) frameController).GetEditor();
			//HashMap Properties = m_editor.getPrinterDocumentFormat().getProperties();
			//HashMap Properties = m_editor.getEditor().getPrinterDocumentFormat().getProperties();
			if (f instanceof FieldFolder) {
				AbstractFolder ff = f;
				while (!(ff instanceof FormatFolder)) {
					ff = (AbstractFolder) ff.getParent();
				}
				if (ff instanceof FormatFolder) {
					HashMap p = ((FormatFolder) ff).getPrinterDocumentFormat().getProperties();
					p.remove(item.getAttributeValue("name"));
					((FormatFolder) ff).getPrinterDocumentFormat().setProperties(p);
				}
			}
			//while (!(f instanceof FormatFolder)) {
			//	f = (AbstractFolder) f.getParent();
			//}
			//if (f instanceof FormatFolder) {			
			//	FormatFolder ff = (FormatFolder) f;
			//	HashMap Properties = ff.getPrinterDocumentFormat().getProperties();
			//	Properties.remove(f.getName());
			//	ff.getPrinterDocumentFormat().setProperties(Properties);
			//}
			//m_editor.getFormatFolder().getPrinterDocumentFormat().setProperties(Properties);
			//m_editor.getPrinterDocumentFormat().setProperties(Properties);
			//m_editor.getPrinterDocumentFormat().save();
			//
			AbstractFolder parent = (AbstractFolder) f.getParent();
			parent.getNode().removeContent(f.getNode());			
			f.removeFromParent();			
			delete = true;
			((DefaultTreeModel) getView().getModel()).reload(parent);			
		} else if (e.getActionCommand().equals(ADDFIELD)) {
			NewFieldWizardLauncher wz = new NewFieldWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(EXPORT)) {
			ExportWizardLauncher wz = new ExportWizardLauncher(f);
			wz.launchWizard();
		} else if (e.getActionCommand().equals(COPY)) {
			m_source  = item.getAttributeValue("uid");
		} else if (e.getActionCommand().equals(PASTE)) {
			if (m_source != null) {
				paste(m_source);
				m_source = null;
			}
		} else if (e.getActionCommand().equals(IMPORT)) {
			ImportWizardLauncher wz = new ImportWizardLauncher(f);
			wz.launchWizard();
		}
		//f.loadChildren();
		if (!delete)
			((DefaultTreeModel) getView().getModel()).reload(f);

	}

	private void paste(String id) {
		X_C_PrinterDocumentFormat source = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
		.setParameters(Integer.valueOf(id)).first();
		X_C_PrinterDocumentFormat newpdf = new X_C_PrinterDocumentFormat(Env.getCtx(), 0, null);
		PO.copyValues(source, newpdf);
		newpdf.setName(String.format("Copy %s", newpdf.getName()));
		newpdf.save();		
	}	
}
