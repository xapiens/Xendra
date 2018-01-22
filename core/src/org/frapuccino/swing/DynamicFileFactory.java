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

import java.io.File;
import java.io.IOException;

import javax.swing.JComponent;


/**
 * File factory that is used by the DynamicFileTransferHandler.
 * Developers that would like to use the @link org.frappucino.swing.DynamicFileTransferHandler
 * must implement this interface. The only method should create the real files
 * with content, that are to be dragged and dropped.
 * @author redsolo
 * @see org.frapuccino.swing.DynamicFileTransferHandler
 */
public interface DynamicFileFactory {

    /**
     * Returns an array of Files, that are to be dragged and dropped from the component.
     * @param component the source component.
     * @return an array of Files
     * @throws IOException thrown if there was any problem creating the files.
     */
    File[] createFiles(JComponent component) throws IOException;
}
