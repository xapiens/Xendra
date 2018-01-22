package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.persistence.X_C_Subject;
import org.compiere.model.reference.REF_AD_TreeTypeType;
import org.compiere.util.Env;

public class MSubject extends X_C_Subject {

	public MSubject(Properties ctx, int C_Subject_ID, String trxName) {
		super(ctx, C_Subject_ID, trxName);
	}

	public MSubject(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (newRecord)
			insert_Tree(REF_AD_TreeTypeType.AccountingSubject);

		return success;
	}	//	afterSave

}
