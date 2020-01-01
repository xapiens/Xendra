package org.xendra.ruleeditor.gui.list;

import org.compiere.model.persistence.X_AD_Rule;

public class HeaderItemDNDManager {

	private static HeaderItemDNDManager m_instance;

	public static HeaderItemDNDManager getInstance() {
		if (m_instance == null) {
			m_instance = new HeaderItemDNDManager();
		}
		return m_instance;
	}

	private X_AD_Rule[] array;

	public X_AD_Rule[] getHeaderItemList() {
		return this.array;
	}

	public void setHeaderItemList(X_AD_Rule[] array) {
		this.array = array;		
	}

}
