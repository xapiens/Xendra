package org.xendra.pop.cardcomponent;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.AppsAction;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.swing.CButton;
import org.compiere.swing.CPanel;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.common.ICardPanel;
import org.xendra.pop.PopPanel;
import org.xendra.pop.Row;

public class DebugPanel extends CardComponentPanel implements ICardPanel, ActionListener {
	private static final String A_EXIT = "Cancelar";
	private AppsAction aExit;
	private CButton    bExit;
	private JTable table = null; 
	public DebugPanel(PopPanel pp) {
		poppanel = pp;
		jbInit();
	}

	private void jbInit() {
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		final JScrollPane scrollPane = new JScrollPane(table);
		setLayout(new BorderLayout());
		CPanel main = new CPanel(new BorderLayout());
		CPanel p = new CPanel(new BorderLayout());
		p.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), X_AD_Rule.COLUMNNAME_Properties)));
		p.add(scrollPane, BorderLayout.CENTER);	
		main.add(p, BorderLayout.CENTER);
		//add(scrollPane, BorderLayout.CENTER);
		//
		StringBuffer sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();
		CPanel coxPanel = new CPanel();
		coxPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));
		coxPanel.setLayout(new MigLayout());
		coxPanel.add(bExit);
		main.add(coxPanel, BorderLayout.SOUTH);
		add(main);					
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c == bExit)
			hideform();

	}

	public void update() {
		List<Row> rows = poppanel.getRows();
		ArrayList<ArrayList<BigDecimal>> array = new ArrayList<ArrayList<BigDecimal>>();			
		List<String> names = new ArrayList<String>();
		names.add(X_C_OrderLine.COLUMNNAME_PriceActual);
		names.add(X_C_OrderLine.COLUMNNAME_PriceList);
		names.add(X_C_OrderLine.COLUMNNAME_PriceLimit);
		names.add(X_C_OrderLine.COLUMNNAME_Margin);
		names.add(X_C_OrderLine.COLUMNNAME_PriceEntered);
		names.add(X_C_OrderLine.COLUMNNAME_QtyOrdered);
		names.add(X_C_OrderLine.COLUMNNAME_QtyEntered);
		names.add(X_C_OrderLine.COLUMNNAME_PriceBase);
		names.add(X_C_OrderLine.COLUMNNAME_Discount);
		names.add(X_C_OrderLine.COLUMNNAME_Discount1);
		names.add(X_C_OrderLine.COLUMNNAME_Discount2);
		names.add(X_C_OrderLine.COLUMNNAME_Discount3);
		names.add(X_C_OrderLine.COLUMNNAME_Discount4);
		names.add(X_C_OrderLine.COLUMNNAME_DiscountAcquire1);
		names.add(X_C_OrderLine.COLUMNNAME_PriceActual);
		names.add(X_C_OrderLine.COLUMNNAME_QtyBonus);
		String[] headers = new String[names.size()];
		names.toArray(headers);
		DefaultTableModel model = new DefaultTableModel(headers, 0);		
		for (Row row:rows) {
			ArrayList<BigDecimal> values = new ArrayList<BigDecimal>();
			values.add(row.getPriceActual());
			values.add(row.getPriceList());
			values.add(row.getPriceLimit());
			values.add(row.getMargin());
			values.add(row.getPriceEntered());
			values.add(row.getQtyOrdered());
			values.add(row.getQtyEntered());
			values.add(row.getPriceBase());
			values.add(row.getDiscount());					
			values.add(row.getDiscount1());
			values.add(row.getDiscount2());
			values.add(row.getDiscount3());
			values.add(row.getDiscount4());
			values.add(row.getDiscountAcquire1());
			values.add(row.getPriceActual());			
			values.add(row.getQtyBonus());
			model.addRow(values.toArray());
		}						
		table.setModel(model);
	}
	private void hideform() {
		getPOPPanel().enableEnvironment();
		setVisible(false);		
	}	
}
