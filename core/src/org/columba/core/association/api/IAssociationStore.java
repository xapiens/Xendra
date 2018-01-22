package org.columba.core.association.api;

import java.util.Collection;

import org.compiere.model.persistence.X_A_Association;

public interface IAssociationStore {
	
//	/**
//	 * initialize the store
//	 */
	void init();
//	
//	/**
//	 * shutdown the store
//	 */
//	void shutdown();
	
	/**
	 * retrieve list of item ids for a given association
	 * 
	 * @param serviceId metadata service
	 * @param metaDataId metadata entry for the given service
	 * @return list of item ids
	 */
	Collection<String> getAssociatedItems(String serviceId, String metaDataId);
	
	/**
	 * remove an association for a given item, service and metadata
	 * 
	 * @param serviceId metadata service
	 * @param metaDataId metadata entry in the given service
	 * @param itemId item id
	 */
	void removeAssociation(String serviceId, String metaDataId, String itemId);
	
	/**
	 * add an association from an item to a metadata entry (from the metadata service "service") 
	 * 
	 * @param serviceId metadata service
	 * @param metaDataId metadata entry in the given service
	 * @param itemId item id 
	 */
	void addAssociation(String serviceId, String metaDataId, String itemId);
	
	/**
	 * retrieve list of all associations for an item
	 * 
	 * @param itemId item id to get the associations for 
	 * @return a colloection of all associations
	 */
	Collection<X_A_Association> getAllAssociations(String itemId);
	
	/**
	 * upper layers call this if their item is deleted
	 * 
	 * @param itemId corresponding item id
	 */
	void removeItem(String itemId);
}
