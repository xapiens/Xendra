// The contents of this file are subject to the Mozilla Public License Version
// 1.1
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
//The Initial Developers of the Original Code are Frederik Dietz and Timo
// Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.columba.core.config;

import java.util.logging.Logger;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;

/**
 * @author fdietz
 *  
 */
public class SaveConfig implements Runnable {

	private static final CLogger LOG = CLogger.getCLogger("org.columba.core.shutdown"); //$NON-NLS-1$

	/**
	 *  
	 */
	public SaveConfig() {
		super();
	}

	/**
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			(Config.getInstance()).save();
		} catch (final Exception e) {
			LOG.severe(e.getMessage());

			if (CLogMgt.DEBUG) {
				e.printStackTrace();
			}
		}
	}

}