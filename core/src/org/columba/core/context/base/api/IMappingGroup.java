package org.columba.core.context.base.api;

import java.util.Iterator;

/**
 * List of mappings for a single specific type.
 * 
 * @author frd
 */
public interface IMappingGroup {

	public IStructureType getSourceType();
	public IStructureType getDestinationType();
	
	public void addMapping(IMapping mapping);
	
	public void removeMapping(int index);
	public IMapping getMapping(int index);
	
	public Iterator<IMapping> getAllMappings();
}
