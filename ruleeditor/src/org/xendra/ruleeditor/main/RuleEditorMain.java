package org.xendra.ruleeditor.main;

import org.apache.commons.cli.CommandLine;
import org.columba.core.component.api.IComponentPlugin;
import org.columba.core.facade.ServiceFacadeRegistry;
import org.xendra.ruleeditor.facade.RuleEditorFacade;

public class RuleEditorMain implements IComponentPlugin {

	private static final String RESOURCE_PATH = "org.xendra.ruleeditor.i18n.global";
	@Override
	public void init() {
		ServiceFacadeRegistry.getInstance().register(org.xendra.ruleeditor.facade.IRuleEditoFacade.class, new RuleEditorFacade());
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