package org.columba.core.context;

import java.util.EventObject;

import org.columba.core.context.api.IContextResultEvent;

@SuppressWarnings("serial")
public class ContextResultEvent extends EventObject implements
		IContextResultEvent {

	
	private String providerName;
	
	public ContextResultEvent(final Object theSource) {
		super(theSource);
	}
	
	public ContextResultEvent(final Object theSource, final String theProviderName) {
		super(theSource);
		
		this.providerName = theProviderName;
	}
	
	public String getProviderName() {
		return providerName;
	}

}
