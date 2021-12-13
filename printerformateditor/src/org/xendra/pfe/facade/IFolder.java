package org.xendra.pfe.facade;

import javax.swing.ImageIcon;
import javax.swing.tree.TreeNode;

public interface IFolder extends TreeNode {
	ImageIcon getIcon();
	String getId();
	String getName();
}
