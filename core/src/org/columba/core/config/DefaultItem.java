//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.
package org.columba.core.config;

import java.util.StringTokenizer;

import org.columa.core.config.IDefaultItem;
import org.columba.core.xml.XmlElement;

/**
 * Composition wrapper for <code>XmlElement</code>. Provides many convinience
 * methods for easy access.
 * 
 * @author fdietz
 */
public class DefaultItem implements Cloneable, IDefaultItem {

    XmlElement root;

    public DefaultItem(final XmlElement theRoot) {
        this.root = theRoot;
    }

    public XmlElement getRoot() {
        return root;
    }

    /** ********************** composition pattern ********************* */
    public XmlElement getElement(final String pathToElement) {

        /*
         * XmlElement child = getRoot().getElement(pathToElement);
         *
         * return child;
         */
        return getElement(pathToElement, true);
    }

    public XmlElement getElement(final String pathToElement,final boolean create) {
        XmlElement child = getRoot();

        final StringTokenizer tok = new StringTokenizer(pathToElement, "/"); //$NON-NLS-1$
        while (tok.hasMoreTokens()) {
            final String token = tok.nextToken();
            XmlElement e = child.getElement(token);
            if ((e == null) && create) {
                e = child.addSubElement(token);

            }
            child = e;

        }

        return child;
    }

    public XmlElement getChildElement(final int index) {
        return getRoot().getElement(index);
    }

    public int getChildCount() {
        return getRoot().count();
    }

    public XmlElement getChildElement(final String pathToElement,
            final int index) {
        return getRoot().getElement(pathToElement).getElement(index);
    }

    public boolean contains(final String key) {
        return getRoot().getAttributes().containsKey(key);
    }

    public String get(final String key) {
        return getRoot().getAttribute(key);
    }

    public String getString(final String pathToElement, final String key) {
        final XmlElement element = getElement(pathToElement);

        if (element != null) {
            if ((key == null) || (key.length() == 0)) {
                return element.getData();
            }
            return element.getAttribute(key);
        }
        return null;
    }

    public void setString(final String key, final String newValue) {
        getRoot().addAttribute(key, newValue);
    }

    public void setString(final String pathToElement, final String key,
            final String newValue) {
        XmlElement element = getElement(pathToElement);
        if (element == null) {
            element = root.addSubElement(pathToElement);
        }

        if (key == null) {
            element.setData(newValue);
        } else {
            element.addAttribute(key, newValue);
        }

    }

    /** ************************** helper classes ************************** */
	public int getInteger(final String key) {
        final String value = get(key);

            try{
                return Integer.parseInt(value);
            }catch(NumberFormatException nfe){
                return -1;
            }
        }

    public int getIntegerWithDefault(final String key, final int defaultValue) {
        String value = get(key);

        if (value == null) {
            value = new Integer(defaultValue).toString();
            setString(key, value);
        }

        try {
            return Integer.parseInt(value);
        } catch (final NumberFormatException e) {
            return defaultValue;
        }
    }

    public int getInteger(final String pathToElement, final String key) {
        final String value = getString(pathToElement, key);

        return Integer.parseInt(value);
    }

    public int getIntegerWithDefault(final String pathToElement,
            final String key, final int defaultValue) {
        String value = getString(pathToElement, key);

        if (value == null) {
            value = new Integer(defaultValue).toString();
            setString(pathToElement, key, value);
        }

        int result = -1;
        try {
            result = Integer.parseInt(value);
        } catch (final NumberFormatException e) {
            // this is no integer value
            return defaultValue;
        }

        return result;
    }

    public void setInteger(final String key, final int value) {
        setString(key, Integer.toString(value));
    }

    public void setInteger(final String pathToElement, final String key,
            final int value) {
        setString(pathToElement, key, Integer.toString(value));
    }

    public boolean getBooleanWithDefault(final String key,
            final boolean defaultValue) {
        String value = get(key);

        if (value == null) {
            value = Boolean.toString(defaultValue);
            setString(key, value);
        }

        return Boolean.valueOf(value).booleanValue();
    }

    public boolean getBoolean(final String key) {
        final String value = get(key);

        return Boolean.valueOf(value).booleanValue();
    }

    public boolean getBoolean(final String pathToElement, final String key) {
        final String value = getString(pathToElement, key);

        return Boolean.valueOf(value).booleanValue();
    }

    public boolean getBooleanWithDefault(final String pathToElement,
            final String key, final boolean defaultValue) {
        String value = getString(pathToElement, key);

        if (value == null) {
            value = Boolean.valueOf(defaultValue).toString();
            setString(pathToElement, key, value);
        }

        return Boolean.valueOf(value).booleanValue();
    }

    public void setBoolean(final String key, final boolean value) {
        setString(key, value ? Boolean.TRUE.toString() : Boolean.FALSE.toString());
    }

    public void setBoolean(final String pathToElement, final String key,
            final boolean value) {
        setString(pathToElement, key, value ? Boolean.TRUE.toString()
                : Boolean.FALSE.toString());
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(final Object obj) {
        boolean equal = false;

        if ((obj != null) && (obj instanceof IDefaultItem)) {
            final DefaultItem other = (DefaultItem) obj;

            if ((root == other.root) || ((root != null) && root.equals(other.root))) {
                equal = true;
            }
        }

        return equal;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        int hashCode = 43;

        if (root != null) {
            hashCode += (root.hashCode() * 97);
        }

        return hashCode;
    }

    /** {@inheritDoc} */
    @Override
    public Object clone() {
        try {
            final DefaultItem other = (DefaultItem) super.clone();
            other.root = (XmlElement) root.clone(); // make a deep copy

            return other;
        } catch (final CloneNotSupportedException cnse) {
            throw new InternalError("Could not clone DefaultItem: " + cnse); //$NON-NLS-1$
        }
    }

    /**
     * @param string
     * @param string2
     * @return
     */
    public String getStringWithDefault(final String key,
            final String defaultValue) {
        String result = getRoot().getAttribute(key);
        if (result == null) {
            result = defaultValue;
        }
        return result;
    }

    /**
     * @see org.columa.core.config.IDefaultItem#getStringWithDefault(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public String getStringWithDefault(final String pathToElement,
            final String key, final String defaultValue) {
        final String value = getString(pathToElement, key);

        if (value == null) {
            setString(pathToElement, key, value);
            return defaultValue;
        }

        return value;
    }

    public void notifyObservers(final String path) {
        final XmlElement e = getElement(path);
        e.notifyObservers();
    }
}