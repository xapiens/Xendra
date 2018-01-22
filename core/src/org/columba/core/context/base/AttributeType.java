package org.columba.core.context.base;

import org.columba.core.context.base.api.IAttributeType;

public class AttributeType implements IAttributeType {

	private String name;

	private String namespace;

	private BASETYPE baseType;

	private Object defaultValue;

	private boolean optional;

	public AttributeType(final String theName, final String theNamespace) {
		this.name = theName;
		this.namespace = theNamespace;

		this.baseType = BASETYPE.STRING;
		optional = true;
	}

	public BASETYPE getBaseType() {
		return baseType;
	}

	public Object getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(final Object theDefaultValue) {
		this.defaultValue = theDefaultValue;
	}

	public void setBaseType(final BASETYPE type) {
		this.baseType = type;
	}

	public String getName() {
		return name;
	}

	public String getNamespace() {
		return namespace;
	}

	@Override
	public boolean equals(final Object obj) {
		final AttributeType t = (AttributeType) obj;

		if (!t.getBaseType().equals(getBaseType())) {
			return false;
		}

		if ((t.getDefaultValue() != null) && (getDefaultValue() != null)) {
			if (!t.getDefaultValue().equals(getDefaultValue())) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		final StringBuilder buf = new StringBuilder();
		buf.append("AttributeType["); //$NON-NLS-1$
		buf.append("name=" + getName()); //$NON-NLS-1$
		buf.append("namespace=" + getNamespace()); //$NON-NLS-1$
		buf.append("basetype=" + getBaseType()); //$NON-NLS-1$
		buf.append(']');
		return buf.toString();
	}

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(final boolean isOptional) {
		this.optional = isOptional;
	}

}
