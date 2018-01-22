package org.columba.core.context.api;

import java.util.Collection;



public interface IContextSearchManager {
	
	public void search();

	public IContextProvider getProvider(String technicalName);
	public void register(IContextProvider provider);
	public void unregister(IContextProvider provider);
	
	public Collection<IContextProvider> getAllProviders();
	
	public void addResultListener(IContextResultListener listener);
	public void removeResultListener(IContextResultListener listener);
}
