package org.xendra.ruleeditor.gui.frame;

import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.xendra.ruleeditor.gui.tree.TreeController;


public interface RuleEditorFrameMediator extends IFrameMediator {
    TreeController getTree();
    /**
 * Add selection listener for tree.
 * 
 * @param listener                selection listener
 */    
    void addTreeSelectionListener(TreeSelectionListener listener);    
}
