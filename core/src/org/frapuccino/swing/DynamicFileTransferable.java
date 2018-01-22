//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.frapuccino.swing;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JComponent;


/**
 * A Transferable object that only supports the DataFlavor.javaFileListFlavor.
 * @author redsolo
 */
public class DynamicFileTransferable implements Transferable {

    private static final DataFlavor FILE_LIST_FLAVOR = DataFlavor.javaFileListFlavor;
    private static final DataFlavor[] SUPPORTED_FLAVORS = new DataFlavor[] {FILE_LIST_FLAVOR};

    /** If the files has been created or not. */
    private boolean localFilesCreated = false;

    /** The parent transfer handler. */
    private DynamicFileTransferHandler transferHandler;

    /** The JCOmponent that started the DnD. */
    private JComponent sourceComponent;

    /**
     * Creates the Transferable for the TransferHandler.
     * @param handler the transfer handler.
     * @param source the source component.
     */
    public DynamicFileTransferable(DynamicFileTransferHandler handler, JComponent source) {
        transferHandler = handler;
        sourceComponent = source;
    }

    /** {@inheritDoc} */
    public DataFlavor[] getTransferDataFlavors() {
        return SUPPORTED_FLAVORS;
    }

    /** {@inheritDoc} */
    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return FILE_LIST_FLAVOR.equals(flavor);
    }

    /** {@inheritDoc} */
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {

        if (!isDataFlavorSupported(flavor)) {
            throw new UnsupportedFlavorException(flavor);
        }
        if (!localFilesCreated) {
            localFilesCreated = true;
            try {
                transferHandler.waitForDynamicFiles(sourceComponent);
            } catch (InterruptedException ie) {
                throw new RuntimeException("Thread was interrupted while waiting for files to be created.", ie);
            }
        }

        return transferHandler.getDynamicFileList();
    }
}
