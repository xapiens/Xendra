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
 * This class creates a &lt;area&gt; tag.
 * 
 * @version $Id: area.java,v 1.1 2007/06/14 23:42:08 sergioaguayo Exp $
 * @author <a href="mailto:snagy@servletapi.com">Stephan Nagy</a>
 * @author <a href="mailto:jon@clearink.com">Jon S. Stevens</a>
 * @author <a href="mailto:bojan@binarix.com">Bojan Smojver</a>
 */
public class area extends SinglePartElement
	implements Printable, FocusEvents, MouseEvents, KeyEvents
{

	public static final String DEFAULT = "default";

	public static final String rect	= "rect";

	public static final String circle  = "circle";

	public static final String poly	= "poly";
	/**
     * Private initialization routine.
     */
	{
		setElementType ("area");
		setCase (LOWERCASE);
		setAttributeQuote (true);
		setBeginEndModifier ('/');
		setNoHref (true);
	}

	/**
     * Basic constructor. Use the set* methods to set the values of the
     * attributes.
     */
	public area ()
	{
	}

	/**
     * Use the set* methods to set the values of the attributes.
     * 
     * @param shape
     *            the shape="" attribute
     */
	public area (String shape)
	{
		setShape (shape);
	}

	/**
     * Use the set* methods to set the values of the attributes.
     * 
     * @param shape
     *            the shape="" attribute
     * @param coords
     *            the coords="" attribute
     */
	public area (String shape, String coords)
	{
		setShape (shape);
		setCoords (coords);
	}

	/**
     * Use the set* methods to set the values of the attributes.
     * 
     * @param shape
     *            the shape="" attribute
     * @param coords
     *            the coords="" attribute
     */
	public area (String shape, int[] coords)
	{
		setShape (shape);
		setCoords (coords);
	}

	/**
     * Use the set* methods to set the values of the attributes.
     * 
     * @param shape
     *            the shape="" attribute
     * @param coords
     *            the coords="" attribute
     * @param href
     *            the href="" attribute
     */
	public area (String shape, String coords, String href)
	{
		setShape (shape);
		setCoords (coords);
		setHref (href);
	}

	/**
     * Use the set* methods to set the values of the attributes.
     * 
     * @param shape
     *            the shape="" attribute
     * @param coords
     *            the coords="" attribute
     * @param href
     *            the href="" attribute
     */
	public area (String shape, int[] coords, String href)
	{
		setShape (shape);
		setCoords (coords);
		setHref (href);
	}

	/**
     * Sets the shape="" attribute
     * 
     * @param shape
     *            the shape="" attribute
     */
	public area setShape (String shape)
	{
		addAttribute ("shape", shape);
		return this;
	}

	/**
     * Sets the coords="" attribute
     * 
     * @param coords
     *            the coords="" attribute
     */
	public area setCoords (String coords)
	{
		addAttribute ("coords", coords);
		return this;
	}

	/**
     * Sets the coords="" attribute
     * 
     * @param coords
     *            the coords="" attribute
     */
	public area setCoords (int[] coords)
	{
		addAttribute ("coords", coords[0] + "," + coords[1] + "," + coords[2]
			+ "," + coords[3]);
		return this;
	}

	/**
     * Sets the href="" attribute
     * 
     * @param href
     *            the href="" attribute
     */
	public area setHref (String href)
	{
		addAttribute ("href", href);
		setNoHref (false);
		return this;
	}

	/**
     * Sets the alt="" attribute
     * 
     * @param alt
     *            the alt="" attribute
     */
	public area setAlt (String alt)
	{
		addAttribute ("alt", alt);
		return this;
	}

	/**
     * Sets the tabindex="" attribute
     * 
     * @param index
     *            the tabindex="" attribute
     */
	public area setTabindex (String index)
	{
		addAttribute ("tabindex", index);
		return this;
	}

	/**
     * Sets the tabindex="" attribute
     * 
     * @param index
     *            the tabindex="" attribute
     */
	public area setTabindex (int index)
	{
		setTabindex (Integer.toString (index));
		return this;
	}

	/**
     * Sets the nohref
     * 
     * @param href
     *            true or false
     */
	public area setNoHref (boolean href)
	{
		if (href == true)
			addAttribute ("nohref", "nohref");
		else
			removeAttribute ("nohref");
		return (this);
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
	public area addElement (String hashcode, Element element)
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
	public area addElement (String hashcode, String element)
	{
		addElementToRegistry (hashcode, element);
		return (this);
	}

	/**
     * Add an element to the element
     * 
     * @param element
     *            a string representation of the element
     */
	public area addElement (String element)
	{
		addElementToRegistry (element);
		return (this);
	}

	/**
     * Add an element to the element
     * 
     * @param element
     *            an element to add
     */
	public area addElement (Element element)
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
	public area removeElement (String hashcode)
	{
		removeElementFromRegistry (hashcode);
		return (this);
	}

	/**
     * The onfocus event occurs when an element receives focus either by the
     * pointing device or by tabbing navigation. This attribute may be used with
     * the following elements: LABEL, INPUT, SELECT, TEXTAREA, and BUTTON.
     * 
     * @param script The script
     */
	public void setOnFocus (String script)
	{
		addAttribute ("onfocus", script);
	}

	/**
     * The onblur event occurs when an element loses focus either by the
     * pointing device or by tabbing navigation. It may be used with the same
     * elements as onfocus.
     * 
     * @param script The script
     */
	public void setOnBlur (String script)
	{
		addAttribute ("onblur", script);
	}

	/**
     * The onclick event occurs when the pointing device button is clicked over
     * an element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnClick (String script)
	{
		addAttribute ("onclick", script);
	}

	/**
     * The ondblclick event occurs when the pointing device button is double
     * clicked over an element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnDblClick (String script)
	{
		addAttribute ("ondblclick", script);
	}

	/**
     * The onmousedown event occurs when the pointing device button is pressed
     * over an element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnMouseDown (String script)
	{
		addAttribute ("onmousedown", script);
	}

	/**
     * The onmouseup event occurs when the pointing device button is released
     * over an element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnMouseUp (String script)
	{
		addAttribute ("onmouseup", script);
	}

	/**
     * The onmouseover event occurs when the pointing device is moved onto an
     * element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnMouseOver (String script)
	{
		addAttribute ("onmouseover", script);
	}

	/**
     * The onmousemove event occurs when the pointing device is moved while it
     * is over an element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnMouseMove (String script)
	{
		addAttribute ("onmousemove", script);
	}

	/**
     * The onmouseout event occurs when the pointing device is moved away from
     * an element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnMouseOut (String script)
	{
		addAttribute ("onmouseout", script);
	}

	/**
     * The onkeypress event occurs when a key is pressed and released over an
     * element. This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnKeyPress (String script)
	{
		addAttribute ("onkeypress", script);
	}

	/**
     * The onkeydown event occurs when a key is pressed down over an element.
     * This attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnKeyDown (String script)
	{
		addAttribute ("onkeydown", script);
	}

	/**
     * The onkeyup event occurs when a key is released over an element. This
     * attribute may be used with most elements.
     * 
     * @param script The script
     */
	public void setOnKeyUp (String script)
	{
		addAttribute ("onkeyup", script);
	}
}
