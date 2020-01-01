package org.xendra.modeleditor.main;

import org.apache.commons.cli.CommandLine;
import org.columba.core.component.api.IComponentPlugin;
import org.columba.core.facade.ServiceFacadeRegistry;
import org.xendra.modeleditor.facade.ModelEditorFacade;

public class ModelEditorMain implements IComponentPlugin {

	private static final String RESOURCE_PATH = "org.xendra.modeleditor.i18n.global";
	@Override
	public void init() {
		ServiceFacadeRegistry.getInstance().register(org.xendra.modeleditor.facade.IRuleEditoFacade.class, 
				new ModelEditorFacade());
	}

	@Override
	public void postStartup() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void registerCommandLineArguments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCommandLineParameters(CommandLine commandLine) {
		// TODO Auto-generated method stub
		
	}
	
}