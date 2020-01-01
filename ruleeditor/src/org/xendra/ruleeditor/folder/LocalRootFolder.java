package org.xendra.ruleeditor.folder;

import javax.swing.ImageIcon;
import org.columba.api.command.IWorkerStatusController;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.jdom.Element;

public class LocalRootFolder extends RuleEditorTreeNode {
    protected final static ImageIcon localIcon = ImageLoader.getSmallIcon(IconKeys.COMPUTER);

    public LocalRootFolder(Element item) {
        super(item);
    }

    public ImageIcon getIcon() {
        return localIcon;
    }

    /**
 * @see org.columba.addressbook.folder.AddressbookTreeNode#createChildren(org.columba.api.command.IWorkerStatusController)
 */
    public void createChildren(IWorkerStatusController worker) {
    }
}
