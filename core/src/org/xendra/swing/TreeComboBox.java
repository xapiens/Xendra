//package org.mindgame.swing.components;
package org.xendra.swing;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;


//import org.mindgame.swing.components.ui.AbstractComboBoxUI;

@SuppressWarnings("serial")
public class TreeComboBox extends JComboBox {
	
	private JTree tree;

	public TreeComboBox(final JTree tree) {
		this.tree = tree;
		this.tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		this.setModel(new TreeComboBoxModel());
		this.tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(!e.isPopupTrigger()) {
					TreePath path = tree.getPathForLocation(e.getX(), e.getY());
					if(path != null) {
						if(!tree.getSelectionModel().isPathSelected(path)) {
							tree.getSelectionModel().setSelectionPath(path);
						}
						TreeComboBox.this.setSelectedItem(path.getLastPathComponent());
						TreeComboBox.this.getUI().setPopupVisible(TreeComboBox.this, false);
					}
				} else {
					tree.getSelectionModel().clearSelection();
				}
			}
		});
		setUI(null);
	}

	@Override
	public void setUI(ComboBoxUI ui) {
		super.setUI(new AbstractComboBoxUI() {
			@Override
			protected JComponent getPopUpComponent() {
				final JScrollPane jsp = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				if(tree != null) {					
					tree.setSize(TreeComboBox.this.getWidth(), tree.getHeight());
					jsp.getViewport().setLayout(new BorderLayout());
					jsp.getViewport().add(tree, BorderLayout.CENTER);
					tree.addTreeExpansionListener(new TreeExpansionListener() {
						@Override
						public void treeExpanded(TreeExpansionEvent event) {
							popup.hide();
							popup.show();
						}
						@Override
						public void treeCollapsed(TreeExpansionEvent event) {
							popup.hide();
							popup.show();
						}
					});
				} 
				return jsp;
			}
		});
	}
	
	private class TreeComboBoxModel extends DefaultComboBoxModel {
		@Override
		public int getSize() {
			return tree.getRowCount();
		}
		
		@Override
		public Object getElementAt(int index) {
			return tree.getPathForRow(index).getLastPathComponent();
		}
	}
}
