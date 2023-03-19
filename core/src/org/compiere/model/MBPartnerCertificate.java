package org.compiere.model;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import org.compiere.model.persistence.X_C_BPartner_Certificate;

public class MBPartnerCertificate extends X_C_BPartner_Certificate {

	public MBPartnerCertificate(Properties ctx, int C_BPartner_Certificate_ID, String trxName) {
		super(ctx, C_BPartner_Certificate_ID, trxName);
	}
	
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MBPartnerCertificate(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MBPartnerCertificate

	public String get(String propertyname) {
		HashMap<String, String> p = this.getProperties();
		String value = (String) p.get(propertyname);
		return value;
	}
	public int getInt(String propertyname) {
		int ret = 0;
		String value = get(propertyname);
		if (value != null) {
			ret = Integer.valueOf(value);
		}	
		return ret;
	}
	public Boolean getBoolean(String propertyname) {
		Boolean ret = false;
		String value = get(propertyname);
		if (value != null) {
			ret = value.equals("true");
		}
		return ret;
	}
}