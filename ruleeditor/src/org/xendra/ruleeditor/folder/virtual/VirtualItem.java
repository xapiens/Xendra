package org.xendra.ruleeditor.folder.virtual;

import org.compiere.model.persistence.X_AD_Rule;

public class VirtualItem {
	private X_AD_Rule AD_Rule;	
	public VirtualItem(X_AD_Rule Rule_ID) {
		this.AD_Rule = Rule_ID;
	}
	public X_AD_Rule getAD_Rule() {
		return AD_Rule;
	}
}
