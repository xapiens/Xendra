package org.columba.core.context.base.api;

/**
 * Map a single structure item to another structure item.
 * 
 * @author frd
 */
public interface IMapping {

	public ILocator getSourceLocator();

	public ILocator getDestinationLocator();

	public void setSourceLocator(ILocator locator);

	public void setDestinationLocator(ILocator locator);
}
