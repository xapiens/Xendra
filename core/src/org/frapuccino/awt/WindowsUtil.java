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

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;


/**
 * Utility class for the Windows class in the <code>java.awt</code> package.
 * @author redsolo
 */
public final class WindowsUtil {

    /**
     * Private accessor for utility class.
     */
    private WindowsUtil() {
    }

    /**
     * Centers the window in screen.
     * The code is copied from the javaalmanac.com website, item e599.
     * @param window the window to center.
     */
    public static void centerInScreen(Window window) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = window.getSize().width;
        int h = window.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        window.setLocation(x, y);
    }
}
