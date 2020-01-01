package org.xendra.modeleditor.gui.list;

import org.compiere.model.persistence.X_AD_Field;


public class HeaderItemDNDManager {
	private static HeaderItemDNDManager m_instance;
	public static HeaderItemDNDManager getInstance() {
		if (m_instance == null) {
			m_instance = new HeaderItemDNDManager();
		}
		return m_instance;
	}
	private X_AD_Field[] array;

	public X_AD_Field[] getHeaderItemList() {
		return this.array;
	}
	public void setHeaderItemList(X_AD_Field[] array) {
		this.array = array;		
	}
}
