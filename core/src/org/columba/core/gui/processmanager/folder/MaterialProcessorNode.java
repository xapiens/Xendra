package org.columba.core.gui.processmanager.folder;

import java.sql.Timestamp;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.persistence.X_M_MaterialProcessorLog;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;
import org.compiere.util.ValueNamePair;

public class MaterialProcessorNode extends ProcessNode {
	int A_Machine_ID;
	int M_MaterialProcessor_ID;
	Timestamp DateNextRun;
	Timestamp DateLastRun;
	String FrequencyType;
	Integer Frequency;
	private boolean active;
	NamePair Identifier;
	public MaterialProcessorNode(X_M_MaterialProcessor p) {
		setA_Machine_ID(p.getA_Machine_ID());
		setM_MaterialProcessor_ID(p.getM_MaterialProcessor_ID());
		setName(p.getName());
		setDateLastRun(p.getDateLastRun());
		setDateNextRun(p.getDateNextRun());
		String id = String.format("%s%s", X_M_MaterialProcessor.Table_Name, p.getM_MaterialProcessor_ID());
		Pattern patt = Pattern.compile("-?\\d+");
		Matcher m = patt.matcher(id);
		String uid = "";
		while (m.find()) {
			uid = m.group();
		}
		String tablename = id.substring(0, id.indexOf(uid));		
		KeyNamePair vp = new KeyNamePair(Integer.valueOf(uid), tablename);
		setIdentifier(vp);
		loadChildren();		
	}	
	public NamePair getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(NamePair identifier) {
		Identifier = identifier;
	}

	public int getM_MaterialProcessor_ID() {
		return M_MaterialProcessor_ID;
	}

	public void setM_MaterialProcessor_ID(int m_MaterialProcessor_ID) {
		M_MaterialProcessor_ID = m_MaterialProcessor_ID;
	}
	public int getA_Machine_ID() {
		return A_Machine_ID;
	}
	public void setA_Machine_ID(int a_Machine_ID) {
		A_Machine_ID = a_Machine_ID;
	}	
	public Timestamp getDateNextRun() {
		return DateNextRun;
	}
	public void setDateNextRun(Timestamp datenextrun) {
		this.DateNextRun = datenextrun;
	}
	public Timestamp getDateLastRun() {
		return DateLastRun;
	}
	public void setDateLastRun(Timestamp datelastrun) {
		this.DateLastRun = datelastrun;
	}
	public String getFrequencyType() {
		return FrequencyType;
	}
	public void setFrequencyType(String frequencyType) {
		FrequencyType = frequencyType;
	}
	public Integer getFrequency() {
		return Frequency;
	}
	public void setFrequency(Integer frequency) {
		Frequency = frequency;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}	
	public String toString () {
		return getName();
	}
	private void loadChildren() {
		try {
			X_M_MaterialPolicy policy = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialProcessor_ID = ?", null)
			.setParameters(getM_MaterialProcessor_ID()).first();
			if (policy != null)	{
				MaterialPolicyNode mpn = new MaterialPolicyNode(policy);
				add(mpn);
			}
			List<X_M_MaterialProcessorLog> materialprocessorlogs = new Query(Env.getCtx(), X_M_MaterialProcessorLog.Table_Name, "M_MaterialProcessor_ID = ?", null)
			.setParameters(getM_MaterialProcessor_ID()).list();
			for (X_M_MaterialProcessorLog materialprocessorlog:materialprocessorlogs) {
				MaterialProcessorLogNode mpln = new MaterialProcessorLogNode(materialprocessorlog);
				add(mpln);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
