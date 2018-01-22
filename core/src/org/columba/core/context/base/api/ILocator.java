package org.columba.core.context.base.api;

import java.util.Iterator;

/**
 * Locate a single element in a structure.
 * 
 * @author frd
 */
public interface ILocator {

	public void addName(IName name);
	public void removeName(IName name);
	public Iterator<IName> getAllNames();
	
}
