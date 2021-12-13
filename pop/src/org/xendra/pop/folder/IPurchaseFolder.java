package org.xendra.pop.folder;

import java.util.List;

import org.compiere.model.persistence.X_AD_Rule;

public interface IPurchaseFolder {
	
	X_AD_Rule get(Integer id);
	
	void modify(int X_AD_Rule_ID);
	
	List<X_AD_Rule> getHeaderItemList(); 	

}
