package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.util.ValueNamePair;

public class DocBase {
	ValueNamePair m_type =  null;
	ValueNamePair m_subtype = null;
	public ValueNamePair getType() {
		return m_type;
	}
	public void setType(ValueNamePair type) {
		this.m_type = type;
	}
	public ValueNamePair getSubtype() {
		return m_subtype;
	}
	public void setSubtype(ValueNamePair subtype) {
		this.m_subtype = subtype;
	}	
	public String toString()
	{
		String name = "";
		if (m_type != null)
			name += m_type.getName();
		if (m_subtype != null)
			name += String.format("(%s)",m_subtype.getValue());
		return name;
	}
}
