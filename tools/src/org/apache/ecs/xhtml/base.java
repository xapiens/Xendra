/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.apache.ecs.xhtml;

import org.apache.ecs.*;

/**
 * This class creates a &lt;base&gt; tag.
 * 
 * @version $Id: base.java,v 1.1 2007/06/14 23:42:06 sergioaguayo Exp $
 * @author <a href="mailto:snagy@servletapi.com">Stephan Nagy </a>
 * @author <a href="mailto:jon@clearink.com">Jon S. Stevens </a>
 * @author <a href="mailto:bojan@binarix.com">Bojan Smojver </a>
 */
public class base extends SinglePartElement
	implements Printable
{

	/**
	 * Private initialization routine.
	 */
	{
		setElementType ("base");
		setCase (LOWERCASE);
		setAttributeQuote (true);
		setBeginEndModifier ('/');
	}

	/**
	 * Basic constructor.
	 */
	public base ()
	{
	}

	/**
	 * Basic constructor.
	 * 
	 * @param href
	 *            the URI that goes between double quotes
	 */
	public base (String href)
	{
		setHref (href);
	}

	/**
	 * Basic constructor.
	 * 
	 * @param href
	 *            the URI that goes between double quotes
	 * @param target
	 *            the target that goes between double quotes
	 */
	public base (String href, String target)
	{
		setHref (target);
		setTarget (target);
	}

	/**
	 * Sets the href="" attribute
	 * 
	 * @param href
	 *            the URI that goes between double quotes
	 */
	public base setHref (String href)
	{
		addAttribute ("href", href);
		return this;
	}

	/**
	 * Sets the target="" attribute
	 * 
	 * @param target
	 *            the URI that goes between double quotes
	 */
	public base setTarget (String target)
	{
		addAttribute ("target", target);
		return this;
	}

	/**
	 * Sets the lang="" and xml:lang="" attributes
	 * 
	 * @param lang
	 *            the lang="" and xml:lang="" attributes
	 */
	public Element setLang (String lang)
	{
		addAttribute ("lang", lang);
		addAttribute ("xml:lang", lang);
		return this;
	}

	/**
	 * Adds an Element to the element.
	 * 
	 * @param hashcode
	 *            name of element for hash table
	 * @param element
	 *            Adds an Element to the element.
	 */
	public base addElement (String hashcode, Element element)
	{
		addElementToRegistry (hashcode, element);
		return (this);
	}

	/**
	 * Adds an Element to the element.
	 * 
	 * @param hashcode
	 *            name of element for hash table
	 * @param element
	 *            Adds an Element to the element.
	 */
	public base addElement (String hashcode, String element)
	{
		addElementToRegistry (hashcode, element);
		return (this);
	}

	/**
	 * Adds an Element to the element.
	 * 
	 * @param element
	 *            Adds an Element to the element.
	 */
	public base addElement (Element element)
	{
		addElementToRegistry (element);
		return (this);
	}

	/**
	 * Adds an Element to the element.
	 * 
	 * @param element
	 *            Adds an Element to the element.
	 */
	public base addElement (String element)
	{
		addElementToRegistry (element);
		return (this);
	}

	/**
	 * Removes an Element from the element.
	 * 
	 * @param hashcode
	 *            the name of the element to be removed.
	 */
	public base removeElement (String hashcode)
	{
		removeElementFromRegistry (hashcode);
		return (this);
	}
}
