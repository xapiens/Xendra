package org.xendra.pos;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import org.compiere.util.DisplayType;

import net.miginfocom.swing.MigLayout;

public class CouponRenderer extends JPanel implements ListCellRenderer {

	private JLabel DocumentNo = new JLabel("");
	private JLabel BPartner   = new JLabel("");
	private JLabel Amt		  = new JLabel("");
	private JLabel Currency   = new JLabel("");
	public CouponRenderer() {	
		setLayout(new MigLayout());
		add(BPartner,"wrap");
		JPanel panel = new JPanel();
		panel.add(DocumentNo);
		panel.add(Amt);		
		panel.add(Currency);
		add(panel);		
	}
	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		CouponItem inv = (CouponItem) value;
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		DocumentNo.setText(inv.getDocumentNo());
		BPartner.setText(inv.getBPartner());		
		Amt.setText(format.format(inv.getAmount()));
		Currency.setText(inv.getCurrency());
		setEnabled(true);
		return this;
	}
}
