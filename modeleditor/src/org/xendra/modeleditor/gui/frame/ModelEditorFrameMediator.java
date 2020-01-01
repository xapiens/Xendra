package org.xendra.modeleditor.gui.frame;

import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.xendra.modeleditor.gui.tree.TreeController;


public interface ModelEditorFrameMediator extends IFrameMediator {
    TreeController getTree();
    /**
 * Add selection listener for tree.
 * 
 * @param listener                selection listener
 */    
    void addTreeSelectionListener(TreeSelectionListener listener);    
}
