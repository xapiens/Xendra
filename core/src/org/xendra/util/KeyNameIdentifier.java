package org.xendra.util;

import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;

public class KeyNameIdentifier extends NamePair {
	public static final KeyNamePair EMPTY = new KeyNamePair(-1, "");
	public KeyNameIdentifier(int key, String name, String Identifier)
	{
		super(name);
		m_key = key;
		m_identifier = Identifier;
	}   //  KeyNamePair
	/** The Key         */
	private int    m_key = 0;
	private String m_identifier = "";
	/**
	 *	Get Key
	 *  @return key
	 */
	public int getKey() {
		return m_key;
	}	//	getKey
	/**
	 *  get Identifier
	 *  @return Identifier
	 */
	public String getIdentifier() {
		return m_identifier;
	}
	/**
	 *	Get ID (key as String)
	 *
	 *  @return String value of key or null if -1
	 */
	public String getID() {
		if (m_key == -1)
			return null;
		return String.valueOf(m_key);
	}	//	getID
	/**
	 *	Equals
	 *  @param obj object
	 *  @return true if equal
	 */
	public boolean equals(Object obj) {
		if (obj instanceof KeyNamePair)
		{
			KeyNamePair pp = (KeyNamePair)obj;
			if (pp.getKey() == m_key
					&& pp.getName() != null
					&& pp.getName().equals(getName()))
				return true;
			return false;
		}
		return false;
	}	//	equals
	/**
	 *  Return Hashcode of key
	 *  @return hascode
	 */
	public int hashCode() {
		return m_key;
	}   //  hashCode

}
