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
package org.xendra.pos.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.pos.util.ResourceLoader;

public class POSWizardLauncher {
	private DataModel data;
	
	public POSWizardLauncher() {
	}

	public void launchWizard() {
		data = new DataModel();
		Step[] steps;
		steps = new Step[] { 
							 new IdentityStep(data),
							 new OrgStep(data),
							 new AddressStep(data),
							 new PriceListStep(data),
							 new CashBookStep(data),
							 new PaymentStep(data),
							 new WarehouseStep(data),
							 new ConditionStep(data),
							 new WriteOffTypeStep(data),
							 new SalesRepStep(data),							 
							 new RuleStep(data), 							 							
							 new OptionsStep(data),
							 new MessageServerStep(data),
							 new PrintFormatCollectionStep(data),
							 new PrintFormatCashCountStep(data),
							 new PrintFormatCreditCardListStep(data),
							 new PrintFormatVoidCanceledListStep(data),
							 new PrintFormatCreditStep(data),			
							 new PrintFormatOptional(data),
							 new DocTypeStep(data),
							 new DocTypePrintFormatStep(data),
							 new ColumnsStep(data),	
							 new FinishStep() };					

		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new MachineCreator(data));

		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model, ResourceLoader
					.getString("dialog", "accountwizard", "title"), ImageLoader
					.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
	}
	
	public DataModel getDataModel()
	{
		return data;
	}
}