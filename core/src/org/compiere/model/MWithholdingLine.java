package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.persistence.X_C_WithholdingHdr;
import org.compiere.model.persistence.X_C_WithholdingLine;
import org.compiere.process.DocAction;
import org.compiere.util.Env;


public class MWithholdingLine extends X_C_WithholdingLine {

	private MWithholdingHdr m_WithholdingHdr;

	public MWithholdingLine(Properties ctx, int C_WithholdingLine_ID,	String trxName) {
		super(ctx, C_WithholdingLine_ID, trxName);
		if (C_WithholdingLine_ID == 0)
		{
			
		}
	}

	public MWithholdingLine(Properties ctx, ResultSet rs,	String trxName) {
		super(ctx, rs, trxName);
	}

	public void setHeader(MWithholdingHdr hdr) {
		setC_WithholdingHdr_ID(hdr.getC_WithholdingHdr_ID());	
	}

	public static MWithholdingLine get(Properties ctx, int AD_Table_ID, int Record_ID, String trxName) {
		String where = "AD_Table_ID = ? AND Record_ID = ?";
		MWithholdingLine line = new Query(ctx, X_C_WithholdingLine.Table_Name, where, trxName).setParameters(AD_Table_ID, Record_ID).firstOnly();
		return line;
	}

	public static MWithholdingLine get(Properties ctx, int AD_Table_ID, int Record_ID,int C_BOE_ID,  String trxName) {
		String where = "AD_Table_ID = ? AND Record_ID = ? AND C_BOE_ID = ?";
		MWithholdingLine line = new Query(ctx, X_C_WithholdingLine.Table_Name, where, trxName).setParameters(AD_Table_ID, Record_ID, C_BOE_ID).firstOnly();
		return line;
	}

	public MWithholdingHdr getParent() {
		if (m_WithholdingHdr == null)
			m_WithholdingHdr = MWithholdingHdr.get(Env.getCtx(), getC_WithholdingHdr_ID(), get_TrxName());
		return m_WithholdingHdr;
	}

	public static void delete(int AD_Table_ID, int Record_ID, String trxName) {
		MWithholdingLine line = get(Env.getCtx(), AD_Table_ID, Record_ID, trxName);
		if (line != null)
			line.delete(true);
	}
}
