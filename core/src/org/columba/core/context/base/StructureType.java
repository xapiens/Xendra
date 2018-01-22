package org.columba.core.context.base;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import org.columba.core.context.base.api.IAttributeType;
import org.columba.core.context.base.api.IName;
import org.columba.core.context.base.api.IStructureType;
import org.columba.core.context.base.api.MULTIPLICITY;

public class StructureType implements IStructureType {

	private String name;

	private String namespace;

	private MULTIPLICITY cardinality;

	private final List<IStructureType> typeList = new Vector<IStructureType>();

	private final List<IAttributeType> attributeList = new Vector<IAttributeType>();

	private final Hashtable<IName, IStructureType> typeMap = new Hashtable<IName, IStructureType>();

	private final Hashtable<IName, IAttributeType> attributeMap = new Hashtable<IName, IAttributeType>();

	public StructureType(final String theName, final String theNamespace) {
		this.name = theName;
		this.namespace = theNamespace;
		
		this.cardinality = MULTIPLICITY.ONE_TO_ONE;
	}


	public String getName() {
		return name;
	}

	public String getNamespace() {
		return namespace;
	}

	public MULTIPLICITY getCardinality() {
		return cardinality;
	}

	public IStructureType removeChild(final String theName, final String theNamespace) {
		final IStructureType type = typeMap.remove(new Name(theName, theNamespace));
		typeList.remove(type);
		return type;
	}

	public Collection<IStructureType> getChildren() {
		return typeMap.values();
	}

	public IAttributeType addAttribute(final String theName, final String theNamespace) {
		final IAttributeType attr = new AttributeType(theName, theNamespace);
		attributeMap.put(new Name(theName, theNamespace), attr);
		attributeList.add(attr);
		return attr;
	}

	public IAttributeType getAttribute(final String theName, final String theNamespace) {
		return attributeMap.get(new Name(theName, theNamespace));
	}

	public Collection<IAttributeType> getAttributes() {
		return attributeList;
	}

	public IStructureType addChild(final String theName, final String theNamespace) {
		final IStructureType type = new StructureType(theName, theNamespace);
		typeMap.put(new Name(theName, theNamespace), type);
		typeList.add(type);

		return type;
	}
	
	public IStructureType addChild(final IStructureType type) {
		typeMap.put(new Name(type.getName(), type.getNamespace()), type);
		typeList.add(type);
		return type;
	}

	public IStructureType getChild(final String theName, final String theNamespace) {
		return typeMap.get(new Name(theName, theNamespace));
	}

	public void setCardinality(final MULTIPLICITY theCardinality) {
		this.cardinality = theCardinality;
	}

	@Override
	public String toString() {
		final StringBuilder buf = new StringBuilder();
		buf.append("StructureType["); //$NON-NLS-1$
		buf.append("name="+getName()); //$NON-NLS-1$
		buf.append("namespace"+getNamespace()); //$NON-NLS-1$
		buf.append(']');
		return buf.toString();
	}

	

}
