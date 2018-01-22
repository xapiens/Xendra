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
package org.xendra.printdocument.devicewizard;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.JavaHelpSupport;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.printdocument.ResourceLoader;
import org.frapuccino.swing.ActiveWindowTracker;

public class PrinterWizardLauncher {
	private DataModel data;

	public PrinterWizardLauncher() {
	}

	public void launchWizard() {
		data = new DataModel();
		Step[] steps;

		steps = new Step[] { new DeviceStep(data), new PrinterDriverStep(data), new QueueStep(data), new FinishStep() };					

		WizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(new DeviceQueueCreator(data));

		Window w = ActiveWindowTracker.findActiveWindow();
		Wizard wizard = null;
		try {
		wizard = new Wizard((Frame) null, model, ResourceLoader
					.getString("dialog", "devicewizard", "title"), ImageLoader
					.getIcon(IconKeys.PREFERENCES));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		wizard.setStepListRenderer(null);
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
	}
	public DataModel getDataModel()
	{
		return data;
	}
}