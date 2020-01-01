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
package org.xendra.ruleeditor.gui.propertysheet;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.util.ValueNamePair;

import java.awt.Font;


import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class DocBaseTypeRenderer extends JPanel implements ListCellRenderer {
	private JLabel lblDocSubType;	
	private JLabel iconLabel = new JLabel();
	private JLabel lblDocBaseType;
	
	public DocBaseTypeRenderer() {
		setLayout(new MigLayout("", "[1px][206.00px]", "[15px][15.00]"));
		add(iconLabel, "cell 0 0,alignx center,aligny center");				
		lblDocBaseType = new JLabel("New label");
		lblDocBaseType.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblDocBaseType, "cell 1 0,grow");		
		lblDocSubType = new JLabel("");
		lblDocSubType.setHorizontalAlignment(SwingConstants.LEFT);
		lblDocSubType.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(lblDocSubType, "cell 1 1");		
	}	
	
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean hasFocus) {		
		DocBase doc = (DocBase) value;
		ValueNamePair vp = (ValueNamePair) doc.getType();
		lblDocBaseType.setText(vp.getName());
		ValueNamePair st = (ValueNamePair) doc.getSubtype();
		if (st != null)
			lblDocSubType.setText(st.getName());
		else
			lblDocSubType.setText("");
		if (isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}	
		iconLabel.setIcon(ImageLoader.getSmallIcon(IconKeys.BANK));
		return this;
	}
}