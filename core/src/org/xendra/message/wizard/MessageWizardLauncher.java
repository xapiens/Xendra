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
package org.xendra.message.wizard;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultWizardModel;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.Wizard;
import net.javaprog.ui.wizard.WizardModel;
import net.javaprog.ui.wizard.WizardModelListener;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.message.util.ResourceLoader;

public class MessageWizardLauncher {
	//private DataModel data;
	//private DefaultWizardModel model;
	MessageCreator mc = null;
	public MessageWizardLauncher() {
	}
	public void launchWizard() {
		//data = new DataModel();
		DataModel data = new DataModel();
		mc = new MessageCreator(data);
		Step[] steps;

		steps = new Step[] { new MessageServerStep(data), 
							 new FinishStep() };					

		DefaultWizardModel model = new DefaultWizardModel(steps);
		model.addWizardModelListener(mc);

		Window w = ActiveWindowTracker.findActiveWindow();

		Wizard wizard = new Wizard((Frame) null, model, 
				ResourceLoader.getString("dialog", "accountwizard", "title"), 
				ImageLoader.getIcon(IconKeys.PREFERENCES));

		wizard.setStepListRenderer(null);
		wizard.setPreferredSize(new Dimension(750,500));
		wizard.pack();
		wizard.setLocationRelativeTo(null);
		wizard.setVisible(true);
	}
	public DataModel getDataModel()
	{
		return mc.getData();		
	}	
	public boolean isOk()
	{
		return mc.isOk();
	}
}