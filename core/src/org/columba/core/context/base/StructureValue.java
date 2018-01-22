package org.columba.core.context.base;

import java.io.InputStream;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.columba.core.context.base.api.IAttributeType;
import org.columba.core.context.base.api.IName;
import org.columba.core.context.base.api.IStructureType;
import org.columba.core.context.base.api.IStructureValue;
import org.columba.core.context.base.api.MULTIPLICITY;
import org.columba.core.context.base.api.IAttributeType.BASETYPE;

// TODO: multiplicity checks
public class StructureValue implements IStructureValue {

	private String name;

	private String namespace;

	private IStructureType type;

	private final List<Object> attributeList = new Vector<Object>();

	private final Hashtable<IName, Object> attributeMap = new Hashtable<IName, Object>();

	private final Hashtable<IName, List<IStructureValue>> valueMap = new Hashtable<IName, List<IStructureValue>>();

	private IStructureValue parent;

	/**
	 * @param theName
	 * @param theNamespace
	 * @param theType
	 */
	public StructureValue(final String theName, final String theNamespace,
			final IStructureType theType) {
		this.type = theType;
		this.name = theName;
		this.namespace = theNamespace;
	}

	/**
	 * @param theName
	 * @param theNamespace
	 * @param theType
	 * @param theParent
	 */
	public StructureValue(final String theName, final String theNamespace,
			final IStructureType theType, final IStructureValue theParent) {
		this(theName, theNamespace, theType);
		this.parent = theParent;

	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#getType()
	 */
	public IStructureType getType() {
		return type;
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#getNamespace()
	 */
	public String getNamespace() {
		return namespace;
	}

	public Object getObject(final String theName, final String theNamespace) {
		final Object obj = attributeMap.get(new Name(theName, theNamespace));
		if (obj == null) {
			// check if default value exists
			final IAttributeType t = getType().getAttribute(theName,
					theNamespace);
			return t.getDefaultValue();
		}

		return obj;
	}

	public void setObject(final String theName, final String theNamespace,
			final Object value) {
		if (theName == null) {
			throw new IllegalArgumentException("name == null");
		}
		if (theNamespace == null) {
			throw new IllegalArgumentException("namespace");
		}
		if (value == null) {
			throw new IllegalArgumentException("value == null");
		}

		final IAttributeType attrType = getType().getAttribute(theName,
				theNamespace);
		if (attrType == null) {
			throw new IllegalArgumentException("attribute type <" + theName
					+ "," + theNamespace + "> does not exist");
		}

		// remove old
		final Object obj = getObject(theName, theNamespace);
		if (obj != null) {
			attributeMap.remove(obj);
			attributeList.remove(obj);
		}

		attributeMap.put(new Name(theName, theNamespace), value);
		attributeList.add(value);
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#getParent()
	 */
	public IStructureValue getParent() {
		return parent;
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#addChild(java.lang.String,
	 *      java.lang.String)
	 */
	public IStructureValue addChild(final String theName,
			final String theNamespace) {
		final IStructureType childType = getType().getChild(theName,
				theNamespace);
		if (childType == null) {
			throw new IllegalArgumentException("child structure type for <"
					+ theName + "," + theNamespace + "> does not exist");
		}

		final IStructureValue value = new StructureValue(theName, theNamespace,
				childType, this);
		final List<IStructureValue> list = getChildStructureList(theName,
				theNamespace);

		if ((childType.getCardinality().equals(MULTIPLICITY.ONE_TO_ONE) || getType()
				.getCardinality().equals(MULTIPLICITY.ZERO_TO_ONE))
				&& (list.size() == 1)) {
			// contains already a single element
			throw new IllegalArgumentException(
					"multiplicity of ONE_TO_ONE or ZERO_TO_ONE doesn't allow adding more children to this structure");
		}

		list.add(value);

		return value;
	}

	/**
	 * @param theName
	 * @param theNamespace
	 * @return
	 */
	private int getChildStructureCount(final String theName,
			final String theNamespace) {
		if (valueMap.containsKey(new Name(theName, theNamespace))) {
			final List<IStructureValue> list = valueMap.get(new Name(theName,
					theNamespace));
			return list.size();
		}
		return 0;
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#removeChild(java.lang.String,
	 *      java.lang.String, int)
	 */
	public IStructureValue removeChild(final String theName,
			final String theNamespace, final int index) {
		final List<IStructureValue> list = valueMap.get(new Name(theName,
				theNamespace));
		if (list == null) {
			throw new IllegalArgumentException("list <" + theName + ","
					+ theNamespace + "> is empty");
		}

		final IStructureValue value = list.get(index);
		if (value == null) {
			throw new IllegalArgumentException("no element at index " + index);
		}

		list.remove(index);

		return value;
	}

	/**
	 * @param theName
	 * @param theNamespace
	 * @return
	 */
	private List<IStructureValue> getChildStructureList(final String theName,
			final String theNamespace) {
		final int count = getChildStructureCount(theName, theNamespace);

		if (count == 0) {
			// create empty list
			final List<IStructureValue> list = new Vector<IStructureValue>();
			valueMap.put(new Name(theName, theNamespace), list);
			return list;
		}
		final List<IStructureValue> list = valueMap.get(new Name(theName,
				theNamespace));
		return list;
	}

	@Override
	public String toString() {
		final StringBuilder buf = new StringBuilder();
		buf.append("StructureValue["); //$NON-NLS-1$
		buf.append("name=" + getName()); //$NON-NLS-1$
		buf.append(", namespace" + getNamespace()); //$NON-NLS-1$
		buf.append(']');
		return buf.toString();
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#isValid()
	 */
	public boolean isValid() {
		// TODO implement validation
		return true;
	}

	public Iterator<IName> getAllAttributeNames() {
		return attributeMap.keySet().iterator();
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#getAttributeIterator()
	 */
	public Iterator<Object> getAttributeIterator() {
		return attributeList.listIterator();
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#getChildIterator(java.lang.String,
	 *      java.lang.String)
	 */
	public Iterator<IStructureValue> getChildIterator(final String theName,
			final String theNamespace) {
		List<IStructureValue> list = valueMap.get(new Name(theName, theNamespace));
		if (list == null) {
			// create empty structure value
			list = new Vector<IStructureValue>();
		}

		return list.listIterator();

	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#removeAllChildren(java.lang.String,
	 *      java.lang.String)
	 */
	public void removeAllChildren(final String theName, final String theNamespace) {
		valueMap.remove(new Name(theName, theNamespace));
	}

	/**
	 * @see org.columba.core.context.base.api.IStructureValue#getString(java.lang.String,
	 *      java.lang.String)
	 */
	public String getString(final String theName, final String theNamespace) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.STRING)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type String");
		}

		return (String) getObject(theName, theNamespace);
	}

	public void setString(final String theName, final String theNamespace,
			final String value) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.STRING)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type String");
		}

		setObject(theName, theNamespace, value);
	}

	public int getInteger(final String theName, final String theNamespace) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.INTEGER)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Integer");
		}

		return (Integer) getObject(theName, theNamespace);
	}

	public void setInteger(final String theName, final String theNamespace,
			final int value) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.INTEGER)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Integer");
		}

		setObject(theName, theNamespace, value);
	}

	public Date getDate(final String theName, final String theNamespace) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.DATE)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Date");
		}

		return (Date) getObject(theName, theNamespace);
	}

	public void setDate(final String theName, final String theNamespace,
			final Date value) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.DATE)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Date");
		}

		setObject(theName, theNamespace, value);
	}

	public float getFloat(final String theName, final String theNamespace) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.FLOAT)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Float");
		}

		return (Float) getObject(theName, theNamespace);
	}

	public void setFloat(final String theName, final String theNamespace,
			final float value) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.FLOAT)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Float");
		}
		setObject(theName, theNamespace, value);
	}

	public double getDouble(final String theName, final String theNamespace) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.DOUBLE)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Double");
		}

		return (Double) getObject(theName, theNamespace);
	}

	public void setDouble(final String theName, final String theNamespace,
			final double value) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.DOUBLE)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type Double");
		}
		setObject(theName, theNamespace, value);
	}

	public byte[] getByteArray(final String theName, final String theNamespace) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.BINARY)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type binary");
		}

		return (byte[]) getObject(theName, theNamespace);
	}

	public void setByteArray(final String theName, final String theNamespace,
			final byte[] value) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.BINARY)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type binary");
		}
		setObject(theName, theNamespace, value);
	}

	public InputStream getInputStream(final String theName, final String theNamespace) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.INPUTSTREAM)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type blob (binary inputstream)");
		}

		return (InputStream) getObject(theName, theNamespace);
	}

	public void setInputStream(final String theName, final String theNamespace,
			final InputStream value) {
		final IAttributeType t = getType().getAttribute(theName, theNamespace);
		if (!t.getBaseType().equals(BASETYPE.INPUTSTREAM)) {
			throw new IllegalArgumentException("attribute <" + theName + ","
					+ theNamespace + "> is not of type blob (binary inputstream)");
		}
		setObject(theName, theNamespace, value);
	}

	public Iterator<IName> getAllChildNames() {
		return valueMap.keySet().iterator();
	}

}
