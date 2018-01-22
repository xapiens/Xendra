package org.columba.core.context.base.api;

public interface IContextFactory {

	public IStructureType createStructure(String name, String namespace);
	
	public IStructureValue createValue(String name, String namespace, IStructureType type);
	
//	public String marshall(IStructureType type);
//	public IStructureType unmarshall(String xmlString);
}
