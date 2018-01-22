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
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2006. 
//
//All Rights Reserved.

package org.columba.core.command;

import java.util.List;
import java.util.Vector;

import org.columba.api.command.ICommand;
import org.columba.api.command.IWorkerStatusController;

/**
 * Special type of {@link Command}which is used for a set of different
 * commands.
 * 
 * @author tstich, fdietz
 */
public class CompoundCommand extends Command {
	protected List<ICommand> commandList;

	/**
	 * Constructor for CompoundCommand. Caution : Never use this command with
	 * Virtual Folders!
	 */
	public CompoundCommand() {
		super(null);
		commandList = new Vector<ICommand>();

		priority = Command.NORMAL_PRIORITY;
		commandType = Command.NORMAL_OPERATION;
	}

	public void add(ICommand c) {
		commandList.add(c);
	}

	/**
	 * @see org.columba.api.command.Command#execute(Worker)
	 * @param worker
	 * @throws Exception 
	 */
	@Override
	public void execute(IWorkerStatusController worker) throws Exception {
		for (ICommand _command : commandList) {
			_command.execute(worker);
		}
	}

	/**
	 * @see org.columba.api.command.Command#canBeProcessed()
	 * @return result
	 */
	@Override
	public boolean canBeProcessed() {
		boolean result = true;
		for (ICommand _command : commandList) {
			result &= _command.canBeProcessed();
		}

		if (!result) {
			releaseAllFolderLocks();
		}
		return result;
	}

	/**
	 * @see org.columba.api.command.Command#releaseAllFolderLocks()
	 */
	@Override
	public void releaseAllFolderLocks() {
		for (ICommand _command : commandList) {
			_command.releaseAllFolderLocks();
		}
	}

	/**
	 * 
	 * @throws Exception 
	 * @see org.columba.api.command.Command#updateGUI()
	 */
	@Override
	public void updateGUI() throws Exception {
		for (ICommand _command : commandList) {
			_command.updateGUI();
		}
	}
}