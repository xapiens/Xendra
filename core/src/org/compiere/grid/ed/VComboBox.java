/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
package org.compiere.grid.ed;

import java.util.logging.Level;

import javax.swing.ComboBoxModel;

import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLocator;
import org.compiere.model.MLookupFactory;
import org.compiere.swing.CComboBox;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;

/**
 *  Combobox with KeyNamePair/ValueNamePair or Locator.
 *  <p>
 *  It has the same hight as a TextField
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: VComboBox.java 1574 2010-08-18 14:27:07Z xapiens $
 */
public class VComboBox extends CComboBox
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2024662772161020317L;

	/**
	 *  Constructor
	 */
	public VComboBox()
	{
		super();
//		common_init();
	}
	public VComboBox(Object[] items)
	{
		super(items);
//		common_init();
	}
	public VComboBox(ComboBoxModel model)
	{
		super(model);
//		common_init();
	}	//	VComboBox

	public VComboBox(String tablename, String columnname) {		
		int AD_Column_ID = MColumn.getColumn_ID(tablename, columnname, null);
		MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
		Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, column.getAD_Reference_ID());
		Object[] values = lookup.getData(false, false, true, false).toArray();
		for (Object value:values) {
			addItem(value);
		}
	}

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VComboBox.class);
	
	/**
	 *  Common Setup
	 *
	private void common_init()
	{
		LookAndFeel.installColorsAndFont(this, "TextField.background", "TextField.foreground", "TextField.font");
		setForeground(AdempierePLAF.getTextColor_Normal());
		setBackground(AdempierePLAF.getFieldBackground_Normal());
		setPreferredSize(s_text.getPreferredSize());
	//	this.setKeySelectionManager(new ComboSelectionManager());
	}   //  common_init

	/** Reference Field         *
	private static  JTextField  s_text = new JTextField(VTextField.DISPLAY_SIZE);

	/**
	 *	Set Selected Item to key.
	 *		Find key value in list
	 *  @param key
	 */
	public void setValue(Object key)
	{
		if (key == null)
		{
			this.setSelectedIndex(-1);
			return;
		}

		ComboBoxModel model = getModel();
		int size = model.getSize();
		for (int i = 0; i < size; i++)
		{
			Object element = model.getElementAt(i);
			String ID = null;
			if (element instanceof NamePair)
				ID = ((NamePair)element).getID();
			else if (element instanceof MLocator)
				ID = String.valueOf(((MLocator)element).getM_Locator_ID());
			else
				log.log(Level.SEVERE, "Element not NamePair - " + element.getClass().toString());

			if (key == null || ID == null)
			{
				if (key == null && ID == null)
				{
					setSelectedIndex(i);
					return;
				}
			}
			else if (ID.equals(key.toString()))
			{
				setSelectedIndex(i);
				return;
			}
		}
		setSelectedIndex(-1);
		setSelectedItem(null);
	}	//	setValue

	/**
	 *  Set Selected item to key if exists
	 *  @param key
	 */
	public void setValue (int key)
	{
		setValue(String.valueOf(key));
	}   //  setValue

	/**
	 *	Get Value
	 *  @return key as Integer or String value
	 */
	public Object getValue()
	{
		NamePair p = (NamePair)getSelectedItem();
		if (p == null)
			return null;
		//
		if (p instanceof KeyNamePair)
		{
			if (p.getID() == null)	//	-1 return null
				return null;
			return new Integer(((KeyNamePair)p).getID());
		}
		return p.getID();
	}	//	getValue

	/**
	 *  Get Display
	 *  @return displayed string
	 */
	public String getDisplay()
	{
		if (getSelectedIndex() == -1)
			return "";
		//
		NamePair p = (NamePair)getSelectedItem();
		if (p == null)
			return "";
		return p.getName();
	}   //  getDisplay
	
}	//	VComboBox
