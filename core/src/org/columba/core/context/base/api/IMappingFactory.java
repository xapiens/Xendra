package org.columba.core.context.base.api;

public interface IMappingFactory {

	public ILocator createLocator(IName[] names);
	public ILocator createLocator();
	
	public IMapping createMapping(ILocator sourceLocator, ILocator destinationLocator);
	
	public IMappingGroup createMappingGroup(IStructureType sourceType, IStructureType destinationType);
	
	public void mapValues(IMappingGroup mappingGroup, IStructureValue source, IStructureValue destination);
	
	public String marshall(IMappingGroup mappingGroup);
	public IMappingGroup unmarshall(String xmlString);
}
