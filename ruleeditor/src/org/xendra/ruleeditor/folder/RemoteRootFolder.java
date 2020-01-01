package org.xendra.ruleeditor.folder;

import javax.swing.ImageIcon;
import org.columba.api.command.IWorkerStatusController;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.jdom.Element;

/**
 * Top-level folder for remote folders.
 * 
 * @author fdietz
 */
public class RemoteRootFolder extends RuleEditorTreeNode {
    final static ImageIcon remoteIcon = ImageLoader.getSmallIcon(IconKeys.SERVER);

    /**
 * Constructor for RemoteRootFolder.
 * @param item
 */
    public RemoteRootFolder(Element item) {
        super(item);
    }

    /**
 * @see org.columba.addressbook.folder.AddressbookTreeNode#createChildren(org.columba.api.command.IWorkerStatusController)
 */
    public void createChildren(IWorkerStatusController worker) {
    }

    public ImageIcon getIcon() {
        return remoteIcon;
    }
}
