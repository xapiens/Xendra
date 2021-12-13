/******************************************************************************
 * Copyright (C) 2007-2010 Dravio SAC. All Rights Reserved.           		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.xendra.pos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ConfirmPanel;
import org.compiere.grid.ed.VNumber;
import org.compiere.swing.CDialog;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.objectview.ObjectViewModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;

/**
 *	Discount Dialog
 *
 *  @author 	xapiens
 *  @version 	$Id: DiscountDialog.java 3437 2011-08-21 21:11:44Z xapiens $
 */
public final class DiscountDialog extends CDialog {

	private final JPanel contentPanel = new JPanel();
	JPanel panel;
	JLabel lblDiscount;
	VNumber discount;
	PosPanel m_parent;
	private ObjectViewModel m_POSLines;
	private ConfirmPanel confirmPanel = new ConfirmPanel(false);
	private BigDecimal m_discount = Env.ZERO;
	JCheckBox chckbxPercentual;
	private int m_WindowNo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DiscountDialog dialog = new DiscountDialog(0,null, null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param m_WindowNo 
	 * @param adapter 
	 * @param posPanel 
	 */
	public DiscountDialog(int WindowNo, PosPanel parent, ObjectViewModel adapter) {
		setModal(true);
		m_WindowNo = WindowNo;
		m_parent = parent;
		m_POSLines = adapter;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPanel.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{152, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblDiscount = new JLabel("Discount");
		GridBagConstraints gbc_lblDiscount = new GridBagConstraints();
		gbc_lblDiscount.insets = new Insets(0, 0, 5, 0);
		gbc_lblDiscount.gridx = 0;
		gbc_lblDiscount.gridy = 0;
		panel.add(lblDiscount, gbc_lblDiscount);
		
		discount = new VNumber();
		GridBagConstraints gbc_discount = new GridBagConstraints();
		gbc_discount.insets = new Insets(0, 0, 5, 0);
		gbc_discount.gridx = 0;
		gbc_discount.gridy = 1;
		panel.add(discount, gbc_discount);
		
		chckbxPercentual = new JCheckBox("Percentual");
		GridBagConstraints gbc_chckbxPercentual = new GridBagConstraints();
		gbc_chckbxPercentual.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPercentual.gridx = 0;
		gbc_chckbxPercentual.gridy = 2;
		panel.add(chckbxPercentual, gbc_chckbxPercentual);
		confirmPanel.getOKButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplyDiscount();			
			}
		});
		contentPanel.add(confirmPanel, BorderLayout.SOUTH);
		AEnv.positionCenterWindow(m_parent, this);
	}

	protected void ApplyDiscount() {
		BigDecimal newdsct  = (BigDecimal) discount.getValue();
		if (m_discount.compareTo(newdsct) == 0 && 
			m_discount.compareTo(Env.ZERO) != 0 )			
		{
			dispose();
			return;
		}
		String lblProductFailed = "";
		m_discount  = newdsct;
		if (m_discount.compareTo(Env.ZERO) < 0)
		{
			ADialog.info(m_WindowNo, m_parent , " Descuento debe ser mayor a 0 ");
			dispose();
			return;
		}
		if (!chckbxPercentual.isSelected())
		{
			//BigDecimal Neto = m_parent.getTotalNet();
			BigDecimal Neto = getAmt(Constants.A_TOTALNET);
			m_discount = m_discount.divide(Neto, 12 , BigDecimal.ROUND_HALF_UP).multiply(Env.ONEHUNDRED); // .multiply(Env.ONEHUNDRED);	
		}
		for (int j = 0 ; j < m_POSLines.getRowCount(); j++)
		{							
			Row row = (Row) m_POSLines.getRowObject(j);
			if (row.getM_Product_ID() > 0)
			{
				if (!row.amt("Discount4", m_discount))
				{
					if (lblProductFailed.length() > 0)
						lblProductFailed += ",";
					lblProductFailed += row.getProduct().getName();
				}
			}
		}
		m_parent.calculateTotalLines();
		if (lblProductFailed.length() > 0)
		{
			ADialog.info(m_WindowNo, m_parent , lblProductFailed);
		}
		dispose();
	}
	protected BigDecimal getAmt(String key) {
		return m_parent.getAmt(key);
	}
	protected void setAmt(String key, BigDecimal amt) {
		m_parent.setAmt(key, amt);
	}		
}
