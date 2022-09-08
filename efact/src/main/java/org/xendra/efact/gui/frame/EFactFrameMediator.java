package org.xendra.efact.gui.frame;

import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.xendra.efact.gui.tree.TreeController;


public interface EFactFrameMediator extends IFrameMediator {
    TreeController getTree();
    /**
 * Add selection listener for tree.
 * 
 * @param listener                selection listener
 */    
    void addTreeSelectionListener(TreeSelectionListener listener);    
}
