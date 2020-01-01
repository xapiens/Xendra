package org.xendra.modeleditor.gui.box;

import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.gui.tree.ModelEditorTreeModel;

public class FolderListMenu extends JPopupMenu {

	private ButtonGroup group = new ButtonGroup();

	public FolderListMenu(ActionListener l) {

		ModelEditorTreeModel model = ModelEditorTreeModel.getInstance();
		Vector<AbstractFolder> v = new Vector<AbstractFolder>();
		Object parent = model.getRoot();
		getChildren(model, parent, v);

		Iterator<AbstractFolder> it = v.listIterator();
		while (it.hasNext()) {
			AbstractFolder folder = it.next();
			if (folder instanceof AbstractFolder) {
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

	private JRadioButtonMenuItem createMenuItem(AbstractFolder folder) {
		JRadioButtonMenuItem item = new JRadioButtonMenuItem();
		//item.setActionCommand(folder.getId());
		item.setActionCommand(folder.getElement().getAttributeValue("uid"));
		item.setText(folder.getName());
		item.setIcon(folder.getIcon());
		return item;
	}

	private void getChildren(ModelEditorTreeModel model, Object parent,
			Vector<AbstractFolder> v) {
		int childCount = model.getChildCount(parent);
		for (int i = 0; i < childCount; i++) {
			Object child = model.getChild(parent, i);
			v.add((AbstractFolder) child);

			getChildren(model, child, v);
		}
	}

}
