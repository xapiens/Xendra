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
package org.frapuccino.awt;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JComponent;

/**
 * An Object array transferable.
 *
 * Most often objects are moved between components in the same local JVM, this
 * class is a default implementation of such a transferable. This can be used
 * when the source and target components of the drag and drop action is of the
 * same type.
 *
 * @author redsolo
 */
public class ObjectArrayTransferable implements Transferable {

    /** The only <code>DataFlavor</code> that this transfer allows. */
    public static final DataFlavor FLAVOR = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType, "JVMLocalObject");

    /** Buffered flavor array. */
    private static final DataFlavor[] FLAVOR_ARRAY = new DataFlavor[] {FLAVOR};

    /** The JComponent that created this Transferable */
    private JComponent source;

    /** The data that is being transfered */
    private Object[] objectArray;

    /**
     * Creates an object array transfer from the specified source.
     *
     * @param comp source component.
     * @param arr the object array.
     */
    public ObjectArrayTransferable(JComponent comp, Object[] arr) {
        source = comp;
        objectArray = arr;
    }

    /**
     * Returns the object array.
     * @param flavor the flavor
     * @throws UnsupportedFlavorException defined by the interface, impossible within this transferable.
     * @throws IOException defined by the interface, impossible within this transferable.
     * @return this object (ObjectArrayTransfer)
     */
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if (!isDataFlavorSupported(flavor)) {
            throw new UnsupportedFlavorException(flavor);
        }

        return getData();
    }

    /** {@inheritDoc} */
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return FLAVOR.equals(dataFlavor);
    }

    /** {@inheritDoc} */
    public DataFlavor[] getTransferDataFlavors() {
        return (DataFlavor[]) FLAVOR_ARRAY.clone();
    }

    /**
     * Returns the source of this transfer.
     *
     * @return the source of this transfer.
     */
    public JComponent getSource() {
        return source;
    }

    /**
     * Returns the object array.
     *
     * @return the object array.
     */
    public Object[] getData() {
        return objectArray;
    }
}
