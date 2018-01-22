package org.columba.core.context.base;

import org.columba.core.context.base.api.IName;

public class Name implements IName {

	private String name;

	private String namespace;

	public Name(final String theName, final String theNamespace) {
		this.name = theName;
		this.namespace = theNamespace;
	}

	public String getName() {
		return name;
	}

	public String getNamespace() {
		return namespace;
	}

	@Override
	public boolean equals(final Object obj) {
		final Name n = (Name) obj;

		if (!n.getName().equals(getName())) {
			return false;
		}
		if (!n.getNamespace().equals(getNamespace())) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		final StringBuilder buf = new StringBuilder();
		buf.append(name);
		if (namespace != null) {
			buf.append('.').append(namespace);
		}
		return buf.toString();
	}

	@Override
	public int hashCode() {
		int hash = 7;
		
		hash = 31 * hash + name.hashCode();
		hash = 31 * hash + namespace.hashCode();
		
		return hash;
	}

}
