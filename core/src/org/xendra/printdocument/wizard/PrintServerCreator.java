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

package org.xendra.printdocument.wizard;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.printdocument.PrintConstants;

class PrintServerCreator implements WizardModelListener {
	protected DataModel data;

	public PrintServerCreator(DataModel data) {
		this.data = data;
	}

	public void wizardFinished(WizardModelEvent e) {
		PO m_model = (PO) data.getData(Constants.Model);
		PrintServer printserver = (PrintServer) data.getData(PrintConstants.PrintServer);
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(printserver.getA_Machine_ID()).first();
		m_model.set_ValueOfColumn(X_A_Machine.COLUMNNAME_A_Machine_ID, machine.getA_Machine_ID());
		m_model.save();
	}

	public void stepShown(WizardModelEvent e) {
	}

	public void wizardCanceled(WizardModelEvent e) {
	}

	public void wizardModelChanged(WizardModelEvent e) {
	}
}
