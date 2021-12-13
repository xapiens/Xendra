package org.xendra.pos.cash;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.compiere.minigrid.MiniTable;
import org.compiere.model.Lookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPayment;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;

public class CashCount {

	private static final String Donation = "Donation";
	private static final String WriteOffAmt = "Ajuste";
	private List<CashCountItem> m_lines = new ArrayList<CashCountItem>();
	private BigDecimal m_TotalHuman = Env.ZERO;
	private BigDecimal m_TotalComputer = Env.ZERO;
	private BigDecimal m_TotalDiff = Env.ZERO;
	ArrayList<Object> m_status = null;
	public CashCount() {
		Integer AD_Column_ID = Util.getColumnID(MPayment.Table_ID,"CreditCardType");	//	C_Order.C_PaymentTerm_ID
		Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.List);
		m_status = lookup.getData (true, true, true, false);					
	}
	
	public BigDecimal getTotalHuman()
	{
		return m_TotalHuman;
	}

	public BigDecimal getTotalComputer()
	{
		return m_TotalComputer;
	}

	public BigDecimal getTotalDiff()
	{
		return m_TotalDiff;
	}

	public List<CashCountItem> getLines()
	{
		return m_lines;
	}

	public void refresh(MiniTable mtClosedCash) {
		int row = 0;				
		m_TotalHuman = Env.ZERO;
		m_TotalComputer = Env.ZERO;
		m_TotalDiff = Env.ZERO;		
		for (CashCountItem cci : m_lines)
		{			
			cci.setAmount((BigDecimal) mtClosedCash.getValueAt( row, 1));			
			mtClosedCash.setValueAt(cci.getAmountInSystem(), 	row, 2);
			mtClosedCash.setValueAt(cci.getDiff(),			 	row, 3);
			m_TotalHuman = m_TotalHuman.add(cci.getAmount());
			m_TotalComputer = m_TotalComputer.add(cci.getAmountInSystem());
			m_TotalDiff = m_TotalDiff.add(cci.getDiff());
			row++;
		}		    	
	}
	
	public void calculate(int C_POS_ID, Timestamp cashdate, int C_CashBook_ID, Integer HR_Workshift_ID) {
		StringBuilder sql = new StringBuilder("SELECT * FROM V_COLLECTION WHERE c_pos_id = ? AND date_trunc('day',datetrx) = date_trunc('day',?::date) AND HR_WorkShift_ID = ?");		
		try {			
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_POS_ID);
			pstmt.setTimestamp(2, (Timestamp) cashdate);
			pstmt.setInt(3, HR_Workshift_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String description ="";
				String type = rs.getString("type");
				if (type.equals("CASH")) {
					description = Msg.translate(Env.getCtx(), "Cash");
				} else if (type.equals("CUPN")) {
					description = Constants.A_COUPON;
				} else if (type.equals("CRED")) {
					description = Constants.A_CREDIT;
				} else if (type.equals("DONA")) {
					description = Donation;
				} else if (type.equals("WOFF")) {
					description = WriteOffAmt;
				} else if (type.equals("COLL")) {
					description = Constants.A_COLLECTION;
				} else {
					for (int x=0; x < m_status.size(); x++)
					{
						ValueNamePair pp = (ValueNamePair) m_status.get(x);
						if (type.equals(pp.getID())) {
							description = pp.getName();
							break;
						}
					}		    					
				}				
				BigDecimal System = rs.getBigDecimal("amountinsystem");
				CashCountItem item = null;
				for (CashCountItem lineitem:m_lines) {
					if (lineitem.getID().equals(type)) {
						item = lineitem;
						item.setAmountInSystem(System);
						break;
					}
				}
				if (item == null) {
					item = new CashCountItem(type,  description, BigDecimal.ZERO, System );
					m_lines.add(item);
				}				
			}						
		} catch (SQLException e1) {
			e1.printStackTrace();
		}					
	}

	public void initialize(MiniTable mtClosedCash) {
		m_lines.clear();
		m_lines.add(new CashCountItem("CASH",  Msg.translate(Env.getCtx(), "Cash"), BigDecimal.ZERO, BigDecimal.ZERO ));
		m_lines.add(new CashCountItem("CUPN",  Constants.A_COUPON, BigDecimal.ZERO, BigDecimal.ZERO ));
		m_lines.add(new CashCountItem("CRED",  Constants.A_CREDIT, BigDecimal.ZERO, BigDecimal.ZERO ));
		m_lines.add(new CashCountItem("DONA",  Donation, BigDecimal.ZERO, BigDecimal.ZERO ));
		m_lines.add(new CashCountItem("WOFF",  WriteOffAmt, BigDecimal.ZERO, BigDecimal.ZERO ));
		m_lines.add(new CashCountItem("COLL",  Constants.A_COLLECTION, BigDecimal.ZERO, BigDecimal.ZERO ));
		int row = 0;		
		mtClosedCash.setRowCount(m_lines.size());						  
		for (CashCountItem cci : m_lines)
		{
			mtClosedCash.setRowCount(row+1);
			mtClosedCash.setValueAt(cci.getDescription(), 		row, 0);
			mtClosedCash.setValueAt(cci.getAmount(), 				row, 1);
			mtClosedCash.setValueAt(cci.getAmountInSystem() , 	row, 2);
			mtClosedCash.setValueAt(cci.getDiff()		, 			row, 3);
			row++;
		}		    	
		mtClosedCash.autoSize();	
		
	}
}
