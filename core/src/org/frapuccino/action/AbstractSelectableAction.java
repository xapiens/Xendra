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
package org.frapuccino.action;

/**
 * This class subclasses AbstractColumbaAction to encapsulate a selection state.
 * State changes are propagated to registered PropertyChangeListener instances.
 *
 * @author fdietz
 */
public abstract class AbstractSelectableAction extends AbstractFAction {
	protected boolean selectionState = false;

	/**
	 * Creates a new action instance with a default selection state of false.
	 */
	public AbstractSelectableAction(String name) {
		super(name);
	}

	/**
	 * Returns the action's selection state.
	 */
	public boolean getSelected() {
		return selectionState;
	}

	/**
	 * Sets the action's selection state and notifies registered listeners.
	 */
	public void setSelected(boolean state) {
		if (this.selectionState != state) {
			Boolean oldValue = this.selectionState ? Boolean.TRUE : Boolean.FALSE;
			this.selectionState = state;
			firePropertyChange("selected", oldValue, state ? Boolean.TRUE
					: Boolean.FALSE);
		}
	}
}
