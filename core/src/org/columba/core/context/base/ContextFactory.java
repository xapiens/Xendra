package org.columba.core.context.base;

import org.columba.core.context.base.api.IContextFactory;
import org.columba.core.context.base.api.IStructureType;
import org.columba.core.context.base.api.IStructureValue;

public class ContextFactory implements IContextFactory {

	public ContextFactory() {
		super();
	}

	public IStructureType createStructure(final String name, final String namespace) {
		return new StructureType(name, namespace);
	}

	public IStructureValue createValue(final String name, final String namespace,
			final IStructureType type) {
		return new StructureValue(name, namespace, type);
	}

}
