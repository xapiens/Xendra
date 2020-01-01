package org.xendra.ruleeditor.gui.box;

import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

import org.xendra.ruleeditor.folder.IFolder;
import org.xendra.ruleeditor.folder.IRuleFolder;
import org.xendra.ruleeditor.gui.tree.RuleEditorTreeModel;

public class FolderListMenu extends JPopupMenu {

	private ButtonGroup group = new ButtonGroup();

	public FolderListMenu(ActionListener l) {

		RuleEditorTreeModel model = RuleEditorTreeModel.getInstance();
		Vector<IFolder> v = new Vector<IFolder>();
		Object parent = model.getRoot();
		getChildren(model, parent, v);

		Iterator<IFolder> it = v.listIterator();
		while (it.hasNext()) {
			IFolder folder = it.next();
			if (folder instanceof IRuleFolder) {
				JRadioButtonMenuItem item = createMenuItem(folder);
				item.addActionListener(l);
				group.add(item);
				add(item);
			}
		}
		
		// select first item
		JRadioButtonMenuItem item = (JRadioButtonMenuItem) getComponent(0);
		item.setSelected(true);
	}

	private JRadioButtonMenuItem createMenuItem(IFolder folder) {
		JRadioButtonMenuItem item = new JRadioButtonMenuItem();
		item.setActionCommand(folder.getId());
		item.setText(folder.getName());
		item.setIcon(folder.getIcon());
		return item;
	}

	private void getChildren(RuleEditorTreeModel model, Object parent,
			Vector<IFolder> v) {
		int childCount = model.getChildCount(parent);
		for (int i = 0; i < childCount; i++) {
			Object child = model.getChild(parent, i);
			v.add((IFolder) child);

			getChildren(model, child, v);
		}
	}

}
