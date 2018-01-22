package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.persistence.X_C_Contact;


public class MContact  extends X_C_Contact {

	public MContact(Properties ctx, int C_Contact_ID, String trxName) {
		super(ctx, C_Contact_ID, trxName);		
	}
	public MContact(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);		
	}
	public String getfn() 
	{
		String fn = super.getfn();
		if (fn.length() == 0)
		{
			fn = String.format("%s %s %s", getFirstName(), getFirstSurName(), getSecondSurName()).trim();
			if (fn.length() > 0) {
				setfn(fn);
				save();
			}
		}		
		if (fn.length() == 0)
		{
			fn = getName().trim();
			if (fn.length() > 0) {
				setfn(fn);
				save();
			}
		}
		if (fn.length() == 0)
		{
			System.out.println("X");
		}
		return fn;
	}
}
