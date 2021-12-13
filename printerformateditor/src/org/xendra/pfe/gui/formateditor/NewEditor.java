package org.xendra.pfe.gui.formateditor;

import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import net.miginfocom.swing.MigLayout;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.frame.PFEFrameController;
import org.xendra.pfe.gui.tree.PFETreeModel;
import org.xendra.pfe.gui.tree.TreeView;

public class NewEditor extends JPanel implements TreeSelectionListener, ChangeListener {
	private JTabbedPane panes = new JTabbedPane(JTabbedPane.BOTTOM);
	private HashMap<Integer, FormatEditor> editors = new HashMap<Integer, FormatEditor>();
	private PFEFrameController controller;
	private Integer id;
	private boolean m_panelock;
	public NewEditor(PFEFrameController controller) {
		super(new MigLayout("fill"));
		this.controller = controller;
		panes.addChangeListener(this);
		add(panes);
	}
	
	public FormatEditor getEditor()
	{		
		FormatEditor linepane = (FormatEditor) editors.get(id);
		return linepane;
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			AbstractFolder node = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();
			AbstractFolder f = null;
			if (node instanceof FormatFolder) {
				f = node;
			} else {
				f = (AbstractFolder) node.getParent();
				while (!(f instanceof FormatFolder)) {
					if (f == null)
						break;
					if (f.getParent() == null) 
						break;					
					f = (AbstractFolder) f.getParent();
				}							
			}
			if (f instanceof FormatFolder) {
				//FormatFolder ff = (FormatFolder) node;
				FormatFolder ff = (FormatFolder) f;
				//Element item = node.getNode();
				Element item = ff.getNode();
				String uid = item.getAttributeValue("uid");
				id = Integer.valueOf(uid);
				if (!editors.containsKey(id)) {
					FormatEditor m_editor = new FormatEditor();
					m_editor.loadformat(ff);
					m_editor.setUid(id);
					add(m_editor, "push, grow");					
					editors.put(id, m_editor);
					panes.addTab(ff.getName(), m_editor);
				}
				for (int i = 0; i < panes.getTabCount(); i++) {
					FormatEditor linepane2 = (FormatEditor) panes.getComponentAt(i);
					if (linepane2.getUid().equals(id)) {
						setpanelock(true);
						panes.getModel().setSelectedIndex(i);
						setpanelock(false);
						break;
					}					
				}
			}
		}		
	}
	
	private void setpanelock(boolean b) {
		m_panelock = b;
	}

	private boolean ispanelock() {
		return m_panelock;
	}
	@Override
	public void stateChanged(ChangeEvent event) {
		if (ispanelock()) {
			return;
		}
		int index = panes.getSelectedIndex();
		FormatEditor linepane2 = (FormatEditor) panes.getComponentAt(index);
		if (linepane2 != null) {					
			PFETreeModel rem = (PFETreeModel) controller.getTree().getView().getModel();
			if (rem != null) {
				AbstractFolder retn = rem.getFolder(String.valueOf(linepane2.getUid()));
				if (retn != null) {
					TreePath path = new TreePath(retn.getPath());
					controller.getTree().getView().setSelectionPath(path);
				}
			}
		}		
	}
}
