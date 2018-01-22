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
package org.xendra.core.command;

import org.columba.core.command.DefaultCommandReference;

public class XendraCommandReference extends DefaultCommandReference {

	private boolean m_isMenu = false;
	private int m_ID = 0;
	private String m_name;

	public XendraCommandReference(int ID, boolean isMenu, String name) {
		m_ID  = ID;
		m_isMenu = isMenu;
		m_name = name;
	}

	public boolean isMenu() {
		return m_isMenu;
	}

	public int getID() {
		return m_ID;
	}
	
	public String getName() {
		return m_name;
	}

}
