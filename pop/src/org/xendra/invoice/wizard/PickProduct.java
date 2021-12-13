package org.xendra.invoice.wizard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_M_Product;
import org.xendra.pop.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
//labs/src/org/xendra/labs/ChartTester.java
public class PickProduct extends AbstractStep implements ActionListener {
	protected DataModel data;
	protected ImportTable table;
	private ImportTableModel tm;
	public PickProduct(DataModel data) {
		super(ResourceLoader.getString("dialog", "pop", "pickproduct"),
				ResourceLoader.getString("dialog", "pop",   "pickproduct_description"));		
		this.data = data;
		this.setCanGoNext(false);			
	}
	@Override
	protected JComponent createComponent() {		
		tm = new ImportTableModel();
		//
		//InvoiceParser pi = (InvoiceParser) data.getData(X_C_Invoice.COLUMNNAME_C_Invoice_ID);		
		List<InvoiceLine> lines = InvoiceParser.getInstance().getLines();
		for (InvoiceLine line:lines) {
			tm.addInvoiceLine(line);
		}
		int WindowNo = 0;
		table = new ImportTable(tm);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				//int row = table.getSelectedRow();
				validate();
			}
		});
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "querywizard", "identify_text")));
		component.add(Box.createVerticalStrut(40));
		JButton process = new JButton("process");
		process.setActionCommand("REFRESH");
		process.addActionListener(this);
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		JScrollPane scrollPane = new JScrollPane(table);		
		scrollPane.setPreferredSize(new Dimension(550, 300));
		scrollPane.getViewport().setBackground(Color.white);
		centerPanel.add(scrollPane, BorderLayout.NORTH);
		component.add(centerPanel);		
		component.add(process);
		try {
			Method method = table.getClass().getMethod("getModel", null);
			data.registerDataLookup(X_M_Product.COLUMNNAME_M_Product_ID, new DefaultDataLookup(table, method, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return component;				
	}
	
	private void validate() {
		int rowprocessed = 0;
		int rows = table.getRowCount();
		for (int row=0; row < rows; row++) {
			Integer M_Product_ID = (Integer) table.getModel().getValueAt(row, 0);
			BigDecimal Qty = (BigDecimal) table.getModel().getValueAt(row, 1);
			Integer C_UOM_ID = (Integer) table.getModel().getValueAt(row, 2);					
			if (M_Product_ID == 0 || C_UOM_ID == 0) {
				setCanGoNext(false);						
				break;
			}					
			rowprocessed ++;
		}
		if (rowprocessed == rows) {
			setCanGoNext(true);
		}				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("REFRESH")) {
			InvoiceParser.getInstance().resetInvoiceLineCounter();
			int row = table.getRowCount();
			for (int i=0; i < row; i++) {
				if ((int)table.getValueAt(i, 0) == 0) {// product
					String description = (String) table.getValueAt(i, 3); // description
					InvoiceParser.getInstance().parseLine();
				}
			}
			validate();
			table.repaint();
		} 
	}
	public void prepareRendering() {
	}
}
