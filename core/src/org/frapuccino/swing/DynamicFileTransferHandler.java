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

import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

import org.compiere.util.CLogger;


/**
 * A TransferHandler that creates dynamic file lists during a drag and drop action.
 * Due to the design of the current DnD support in Swing, if the DataFlavor is
 * a @link java.awt.datatransfer.DataFlavor#javaFileListFlavor then the files must
 * exist locally before the DnD can start. This makes it hard to create the files
 * dynamically after the DnD has completed. This class tries to counter the
 * fact that the files must exist locally. This TransferHandler creates only the
 * files if the DnD action has started and/or is dragged on other components that
 * support the java file list data flavor.
 * <p>
 * This class uses the @link org.frappucino.swing.DynamicFileFactory to create
 * the actual files from the source component. The files are later removed when
 * the DnD action has been completed.
 * <p>
 * There are two different ways of creating the files through this TransferHandler
 * <ul>
 * <li> EARLY_GENERATION - The file is created when the DnD action is started, ie when the createTransferable()
 * method is called. This will create the file during the whole DnD action, so when the
 * mouse moves over a Component that supports the DataFlavor, the files are already
 * created, thus saving time.
 * <li> LATE_GENERATION - The file is created when the DnD action moves over a component
 * that supports the DataFlavor, ie most of the time the native file storage. The file is
 * created in the getTransferData() method in the DynamicFileTransferable class. This is
 * the last occasion that the file must exists. This will try to minimize the chance
 * that the files are created.
 * </ul>
 * @author redsolo
 * @see org.frapuccino.swing.DynamicFileFactory
 * @see org.frapuccino.swing.DynamicFileTransferable
 * @see javax.swing.TransferHandler
 */
public class DynamicFileTransferHandler extends TransferHandler {
    private static final CLogger LOG = CLogger.getCLogger("org.frappucino.swing;");

    /** The files are generated early in the DnD action. */
    public static final int EARLY_GENERATION = 1;
    /** The files are generated late in the DnD action. */
    public static final int LATE_GENERATION = EARLY_GENERATION + 1;

    /** Internal List of files that has been created, these are to be removed later on. */
    private List localDndFiles = new LinkedList();
    /** The factory class that creates the files. */
    private DynamicFileFactory localFileFactory;

    /** If the files should be created early or late in the DnD process. */
    private int fileGenerationMode;
    /** Thread that creates the file if they are to be created early on in the DnD process. */
    private Thread earlyGenerationThread;
    /** If the factory has problem creating the files, the IOException is stored in this variable
     * so it can be used in to fake the exception in the createDnDFiles() method. */
    private IOException thrownIOExceptionInThread;

    /**
     * Creates the transfer handler with the specified factory.
     * @param factory the factory that creates the files during the DnD.
     * @param generationMode if the files are generated early or late.
     */
    public DynamicFileTransferHandler(DynamicFileFactory factory, int generationMode) {
        localFileFactory = factory;
        fileGenerationMode = generationMode;
    }

    /**
     * Holds the current thread until the dynamic files has been created.
     * @param source the source component that issued the DnD action.
     * @throws InterruptedException thrown if the current thread was interrupted before all files were
     * created.
     * @throws IOException if the factory had problems creating the files.
     */
    void waitForDynamicFiles(JComponent source) throws InterruptedException, IOException {

        if (thrownIOExceptionInThread != null) {
            IOException temp = thrownIOExceptionInThread;
            thrownIOExceptionInThread = null;
            throw temp;
        }

        if (fileGenerationMode == EARLY_GENERATION) {
            // wait for thread
            earlyGenerationThread.join();
            earlyGenerationThread = null;
        } else {
            createDnDFiles(source);
        }
    }

    /**
     * Create the DnD files.
     * Creates the file through the factory and stores a reference for them
     * so they can be removed later on in the exportDone() method.
     * @param source the source component that issued the DnD action.
     * @throws IOException if the factory had problems creating the files.
     */
    private void createDnDFiles(JComponent source) throws IOException {
        File[] files = localFileFactory.createFiles(source);
        for (int i = 0; i < files.length; i++) {
            localDndFiles.add(files[i]);
        }
    }

    /**
     * Returns a List of Files that are to be dragged and dropped.
     * @return a List of Files; an empty List if the files hasnt been created locally yet.
     */
    public List getDynamicFileList() {
        return Collections.unmodifiableList(localDndFiles);
    }


    /** {@inheritDoc} */
    protected Transferable createTransferable(JComponent c) {

        thrownIOExceptionInThread = null;
        earlyGenerationThread = null;
        //sourceComponent = c;
        if (fileGenerationMode == EARLY_GENERATION) {
            // start thread
            earlyGenerationThread = new Thread(new FileGenerator(c));
            earlyGenerationThread.start();
        }

        return new DynamicFileTransferable(this, c);
    }


    /** {@inheritDoc} */
    protected void exportDone(JComponent source, Transferable data, int action) {

        for (Iterator iterator = localDndFiles.iterator(); iterator.hasNext();) {
            File file = (File) iterator.next();
            LOG.fine("Deleting locally created file: " + file);
            if (!file.delete()) {
                LOG.warning("Could not delete the local file. It will be removed at exit anyway.");
            }
        }
        localDndFiles.clear();
        thrownIOExceptionInThread = null;

        super.exportDone(source, data, action);
    }

    /**
     * Runnable that calls the method createDndFiles().
     * @author redsolo
     */
    private class FileGenerator implements Runnable {

        private JComponent sourceComp;
        /**
         * Creates the file generator.
         * @param source the source component, is used by the createDnDFiles() method.
         */
        FileGenerator(JComponent source) {
            sourceComp = source;
        }

        /** {@inheritDoc} */
        public void run() {
            try {
                createDnDFiles(sourceComp);
                thrownIOExceptionInThread = null;
            } catch (IOException e) {
                thrownIOExceptionInThread = e;
            }
        }
    }
}
