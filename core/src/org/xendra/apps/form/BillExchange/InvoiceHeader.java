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

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

import org.compiere.util.DisplayType;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class InvoiceHeader extends JPanel {

	private DecimalFormat  formatAmount = DisplayType.getNumberFormat(DisplayType.Amount);
	private JLabel lblTotal = new JLabel("total");
	public void setTotal(BigDecimal Total)
	{
		
		lblTotal.setText(formatAmount.format(Total));
	}
	/**
	 * Create the panel.
	 */
	public InvoiceHeader() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 30, 30, 80, 45, 0, 70, 0};
		gridBagLayout.rowHeights = new int[]{0, 15, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
				
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.gridwidth = 7;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotal.gridx = 0;
		gbc_lblTotal.gridy = 0;
		add(lblTotal, gbc_lblTotal);
		
		Component horizontalStrut = Box.createHorizontalStrut(30);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		add(horizontalStrut, gbc_horizontalStrut);
		
		JLabel lblColumna = new JLabel("dias");
		lblColumna.setHorizontalAlignment(SwingConstants.RIGHT);
		lblColumna.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblColumna = new GridBagConstraints();
		gbc_lblColumna.anchor = GridBagConstraints.WEST;
		gbc_lblColumna.insets = new Insets(0, 0, 0, 5);
		gbc_lblColumna.gridx = 1;
		gbc_lblColumna.gridy = 1;
		add(lblColumna, gbc_lblColumna);
		
		JLabel lblColumna_1 = new JLabel("Tipo");
		lblColumna_1.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblColumna_1 = new GridBagConstraints();
		gbc_lblColumna_1.anchor = GridBagConstraints.WEST;
		gbc_lblColumna_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblColumna_1.gridx = 2;
		gbc_lblColumna_1.gridy = 1;
		add(lblColumna_1, gbc_lblColumna_1);
		
		JLabel lblNewLabel = new JLabel("Documento");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Abierto");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblMonto = new JLabel("Monto");
		lblMonto.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblMonto = new GridBagConstraints();
		gbc_lblMonto.fill = GridBagConstraints.BOTH;
		gbc_lblMonto.anchor = GridBagConstraints.EAST;
		gbc_lblMonto.insets = new Insets(0, 0, 0, 5);
		gbc_lblMonto.gridx = 5;
		gbc_lblMonto.gridy = 1;
		add(lblMonto, gbc_lblMonto);
		
		JLabel lblFecha = new JLabel("Fecha");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.WEST;
		gbc_lblFecha.gridx = 6;
		gbc_lblFecha.gridy = 1;
		add(lblFecha, gbc_lblFecha);

	}

}
