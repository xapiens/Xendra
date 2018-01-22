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
package org.xendra.apps.form.BillExchange;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.util.DisplayType;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.text.DateFormat;
import java.text.DecimalFormat;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class BillExchangeRenderer extends JPanel implements ListCellRenderer {
	private JLabel lblDocumentno;	
	private JLabel iconLabel = new JLabel();
	private JLabel lblDateInvoiced;
	private JLabel lblAmount;
	private DateFormat formatdate = DisplayType.getDateFormat(DisplayType.Date);
	private DecimalFormat  formatAmount = DisplayType.getNumberFormat(DisplayType.Amount);	
	
	public BillExchangeRenderer() {
		setLayout(new MigLayout("", "[1px][254px][70px][81px]", "[15px]"));
		add(iconLabel, "cell 0 0,alignx center,aligny center");
				
		lblAmount = new JLabel("New label");
		lblAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblAmount, "cell 1 0,grow");
		
		lblDateInvoiced = new JLabel("New label");
		add(lblDateInvoiced, "cell 2 0,alignx center,aligny center");
		
		lblDocumentno = new JLabel("DocumentNo");
		//lblEstado.add(lblDocumentno);
		lblDocumentno.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(lblDocumentno, "cell 3 0,alignx center,aligny center");		
	}	
	
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean hasFocus) {		
		BillExchangeItem inv = (BillExchangeItem) value;
		//ajua.setText(String.format("%d dias",inv.getdaysbetween()));		
		lblDocumentno.setText(inv.getDocumentNo());
		//Color color = null;
				
		if (isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}	
		iconLabel.setIcon(ImageLoader.getSmallIcon(IconKeys.BANK));
		lblDateInvoiced.setText(formatdate.format(inv.getDueDate()));		
		lblAmount.setText(formatAmount.format(inv.getTotal()));		
		return this;
	}
}