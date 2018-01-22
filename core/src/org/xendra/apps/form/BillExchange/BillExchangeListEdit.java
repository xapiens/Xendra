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

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

import org.compiere.apps.ConfirmPanel;
import org.compiere.grid.ed.VCellRenderer;
import org.compiere.minigrid.MiniCellEditor;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VDate;

public class BillExchangeListEdit extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private ArrayList<BillExchangeItem> m_boes;
	private ConfirmPanel confirmPanel = new ConfirmPanel(false, false, false, false, false, false, false);
	/** OK pressed                  */
	private boolean			    m_ok = false;
	/** Cancel pressed - need to differentiate between OK - Cancel - Exit	*/
	private boolean			    m_cancel = false;
	private BigDecimal m_Total;
	private final JLabel lblNewLabel = new JLabel("New label");
	private JScrollPane scrollPane;
	private JSplitPane splitPane;
	private JPanel parameters;
	private JLabel lblCreated;
	private VDate pickCreated = new VDate();
	private JLabel lblCanje;
	private VDate pickExchange = new VDate();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BillExchangeItem item = new BillExchangeItem();		
			item.setBOEDate(new Timestamp(System.currentTimeMillis()));
			item.setDocumentNo("numero");
			item.setTotal(new BigDecimal("100.10"));
			ArrayList<BillExchangeItem> boes = new ArrayList<BillExchangeItem>();
			boes.add(item);
			BillExchangeListEdit dialog = new BillExchangeListEdit();
			dialog.setBillExchanges(boes);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setBillExchanges(ArrayList<BillExchangeItem> boes) {
		m_Total = Env.ZERO;
		m_boes = boes;		
		for (BillExchangeItem boe:m_boes)
		{
			m_Total = m_Total.add(boe.getTotal());
		}
	}

	/**
	 * Create the dialog.
	 */
	public BillExchangeListEdit() {
		setModal(true);
		setBounds(100, 100, 486, 481);
		getContentPane().setLayout(new BorderLayout());
		table = new JTable();
		table.setModel(new BillExchangeModel());			
		table.setDefaultRenderer(BigDecimal.class, new VCellRenderer(DisplayType.Amount));
		table.setDefaultRenderer(Timestamp.class, new VCellRenderer(DisplayType.Date));
		table.getColumnModel().getColumn(1).setCellEditor(new MiniCellEditor(BigDecimal.class));
		table.getColumnModel().getColumn(2).setCellEditor(new MiniCellEditor(Timestamp.class));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane = new JScrollPane(table);
		//getContentPane().add(scrollPane, BorderLayout.SOUTH);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.anchor = GridBagConstraints.NORTHWEST;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		confirmPanel.addActionListener(this);
		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPanel.add(splitPane);
				
		splitPane.setRightComponent(scrollPane);
		
		parameters = new JPanel();
		splitPane.setLeftComponent(parameters);
		
		lblCreated = new JLabel("creación");
		parameters.add(lblCreated);
		
		pickCreated.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		parameters.add(pickCreated);
		
		lblCanje = new JLabel("canje");
		parameters.add(lblCanje);
				
		pickExchange.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		parameters.add(pickExchange);
		getContentPane().add(confirmPanel, BorderLayout.SOUTH);
	}

	class BillExchangeModel extends AbstractTableModel {

		private String[] columnNames = {"Documento","Monto","Fecha"};

		public int getColumnCount() {
			return 3;
		}

		public int getRowCount() {
			if (m_boes != null)
				return m_boes.size();
			else
				return 0;
		}

		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			Object element = null;
			BillExchangeItem item = m_boes.get(row);
			if (col == 0)
			{
				element = item.getDocumentNo();
			}
			else if (col == 1)
			{
				element = item.getTotal();

			}
			else if (col == 2)
			{
				element = item.getDueDate();
			}
			else
			{
				System.out.println("X");
			}
			return element;
		}

		public boolean isCellEditable(int row, int col) {
			return true;
		}

		public void setValueAt(Object value, int row, int col) {
			//fireTableCellUpdated(row, col);
			BillExchangeItem item = m_boes.get(row);
			if (col == 0)
			{
				item.setDocumentNo((String) value);
			}
			else if (col == 1)
			{
				item.setTotal((BigDecimal) value);
				BigDecimal Total = Env.ZERO;
				for (BillExchangeItem boe:m_boes)
				{
					boe.setBOEDate((Timestamp) pickCreated.getValue());
					Total = Total.add(boe.getTotal());
				}
				if (Total.compareTo(m_Total) != 0)
				{
					if (confirmPanel.getOKButton().isEnabled())
						confirmPanel.getOKButton().setEnabled(false);
				}
				else
				{
					if (!confirmPanel.getOKButton().isEnabled())
						confirmPanel.getOKButton().setEnabled(true);
				}

			}
			else if (col == 2)
			{
				item.setDueDate((Timestamp) value);
			}			
		}
	}

	class CellRenderer extends DefaultTableCellRenderer {
		private String tipo = "text";
		private Font courier = new Font("Courier New", Font.PLAIN, 12);
		private Font normal = new Font("Arial", Font.PLAIN, 12);
		private Font bold = new Font("Arial", Font.BOLD, 12);
		private JLabel label = new JLabel();
		private ImageIcon salida = new ImageIcon(getClass().getResource("/com/bolivia/app/images/salida.png"));
		private ImageIcon entrada = new ImageIcon(getClass().getResource("/com/bolivia/app/images/entrada.png"));

		public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column)
		{		
			if (selected) {
				this.setBackground(new Color(50,153,254));
			}
			else
			{
				this.setBackground(Color.white);
			}
			if (tipo.equals("hour"))
			{
				this.setHorizontalAlignment(JLabel.CENTER);
				this.setText((String) value);
				this.setForeground((selected)?new Color(255,255,255):new Color(0,0,0));
				this.setFont(courier);
				return this;
			}
			if (tipo.equals("icon"))
			{
				if (String.valueOf(value).equals("IN"))
				{
					label.setIcon(entrada);
				}
				else if (String.valueOf(value).equals("OUT"))
				{
					label.setIcon(salida);
				}
				return label;
			}
			return this;
		}

		public CellRenderer(String tipo)
		{
			this.tipo = tipo;
		}     		
	}

	/**
	 *	Dispose and save Selection
	 *	@param ok OK pressed
	 */
	public void dispose(boolean ok)
	{		
		m_ok = ok;
		//saveSelection();
		removeAll();
		super.dispose();
	}	//	dispose

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals(ConfirmPanel.A_OK))
		{			
			dispose(true);
		}
		else if (cmd.equals(ConfirmPanel.A_CANCEL))
		{
			m_cancel = true;
			dispose(false);
		}

	}

	public void setMode(String mode) {
		if (mode.equals("Created"))
		{
			table.setEnabled(true);
			pickCreated.setEnabled(true);
			pickExchange.setEnabled(false);
		}		
		else if (mode.equals("Exchange"))
		{
			table.setEnabled(false);
			pickCreated.setEnabled(false);
			pickExchange.setEnabled(true);
		}
	}

	public boolean IsOK() {
		return m_ok;
	}

	public Timestamp getdateExchange() {
		return (Timestamp) this.pickExchange.getValue();		
	}
	public Timestamp getdateCreated() {
		return (Timestamp) this.pickCreated.getValue();		
	}
}
