package org.xendra.persistence;

import java.util.Collection;

import org.compiere.model.MOrder;

public interface PersistenceService {
	// Get All
	public Collection<MOrder> getAllEquipment();
	// Load by ID
	public MOrder loadOrder(String id);
	// Stores
	public void storeOrder(MOrder order);
	
	public void clear();	
}
