package org.xendra.modeleditor.folder.virtual;

import org.compiere.model.persistence.X_AD_Table;

public class VirtualItem {
	private X_AD_Table table;	
	public VirtualItem(X_AD_Table Rule_ID) {
		this.table = Rule_ID;
	}
	public X_AD_Table getAD_Rule() {
		return table;
	}
}
