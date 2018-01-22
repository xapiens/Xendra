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

import java.awt.Color;
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

import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class InvoiceRenderer extends JPanel implements ListCellRenderer {
	private JLabel lblDocumentno;
	//private Color softred = new Color(220,20,60);
	private Color softred = new Color(220,0,0);
	private Color backgroundcolor = new Color(255,255,255);
	private Color foregroundcolor = Color.white;
	private JLabel iconLabel = new JLabel();
	private JPanel lblEstado;
	private JLabel lbldays;
	private JLabel lblDateInvoiced;
	private JLabel lblAmount;
	private JLabel lblTaxID;
	private DateFormat formatdate = DisplayType.getDateFormat(DisplayType.Date);
	private DecimalFormat  formatAmount = DisplayType.getNumberFormat(DisplayType.Amount);
	private JLabel lblOpen;
	
	public InvoiceRenderer() {
		setLayout(new MigLayout("", "[1px][49px][60px][81px][74px][56px][70px]", "[15px]"));
		
		lblEstado = new JPanel();
		lblEstado.setBorder(new CompoundBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 0, 128)), null));
		add(lblEstado, "cell 1 0,grow");
		
		lbldays = new JLabel("");
		lbldays.setFont(new Font("Dialog", Font.BOLD, 10));
		lblEstado.add(lbldays);
		lblDocumentno = new JLabel("DocumentNo");
		//lblEstado.add(lblDocumentno);
		lblDocumentno.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(iconLabel, "cell 0 0,alignx center,aligny center");
		
		lblTaxID = new JLabel("New label");
		lblTaxID.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(lblTaxID, "cell 2 0,alignx center,aligny center");
		add(lblDocumentno, "cell 3 0,alignx center,aligny center");		
		
		lblOpen = new JLabel("New label");
		lblOpen.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblOpen, "cell 4 0,grow");
		
		lblAmount = new JLabel("New label");
		lblAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblAmount, "cell 5 0,grow");
		
		lblDateInvoiced = new JLabel("New label");
		add(lblDateInvoiced, "cell 6 0,alignx center,aligny center");
	}	
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean hasFocus) {		
		InvoiceItem inv = (InvoiceItem) value;
		//ajua.setText(String.format("%d dias",inv.getdaysbetween()));		
		lblDocumentno.setText(inv.getSerial()+inv.getDocumentNo());
		//Color color = null;
		backgroundcolor = Color.green;
		foregroundcolor = Color.black;
		if (inv.getdaysbetween() > 60)
		{
			int col = inv.getdaysbetween();
			if (col > 255)
				col = 255;
			backgroundcolor = new Color(col,20,60);
			foregroundcolor = Color.white;
		}		
		
		
		if (isSelected) {
			//setBackground(list.getSelectionBackground());
			setBackground(Color.YELLOW);
			//color = list.getSelectionBackground();
			setForeground(list.getSelectionForeground());
			//progressPanel.setBackground(list.getSelectionBackground());
			//progressPanel.setForeground(list.getSelectionForeground());
		} else {
			
			//progressPanel.setBackground(list.getBackground());
			//progressPanel.setForeground(list.getForeground());
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}	
		lbldays.setForeground(foregroundcolor);
		lblEstado.setBackground(backgroundcolor);
		lbldays.setText(String.format("%d",inv.getdaysbetween()));
		if (inv.IsInvoice())
			iconLabel.setIcon(ImageLoader.getSmallIcon(IconKeys.INVOICE));
		else
			iconLabel.setIcon(ImageLoader.getSmallIcon(IconKeys.BANK));
		lblDateInvoiced.setText(formatdate.format(inv.getDateInvoice()));
		lblOpen.setText(formatAmount.format(inv.getOpen()));
		lblAmount.setText(formatAmount.format(inv.getTotal()));
		lblTaxID.setText(inv.getTaxID());
		//lblEstado.setForeground(color);
		return this;
	}
}