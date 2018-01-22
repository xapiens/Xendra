package org.columba.api.gui.focus;

import javax.swing.JComponent;

public interface FocusOwner {
    // true if action is enabled, false otherwiese
    public boolean isCutActionEnabled();

    public boolean isCopyActionEnabled();

    public boolean isPasteActionEnabled();

    public boolean isDeleteActionEnabled();

    public boolean isSelectAllActionEnabled();

    public boolean isUndoActionEnabled();

    public boolean isRedoActionEnabled();

    // concrete implementation of actions
    public void cut();

    public void copy();

    public void paste();

    public void delete();

    public void undo();

    public void redo();

    public void selectAll();
    // 
    public JComponent getComponent();
}
