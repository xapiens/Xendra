package org.xendra.cost;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.ListModel;

import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_M_TransactionTransactionType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.ValueNamePair;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class MaterialPolicyCreator implements WizardModelListener {

	private DataModel data;	
	public MaterialPolicyCreator(DataModel data) {
		this.data = data;
	}

	@Override
	public void stepShown(WizardModelEvent e) {

	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void wizardFinished(WizardModelEvent e) {
		String tables = "";
		String dates = "";
		String dtonlyio = "";
		String dtiocost = "";
		String adjust = "";
		String sequence = "";
		ListModel l  = (ListModel) data.getData(X_AD_Table.COLUMNNAME_AD_Table_ID);
		for (int i=0; i < l.getSize(); i++) {
			KeyNamePair kp = (KeyNamePair) l.getElementAt(i);
			if (tables.length() > 0)
				tables = String.format("%s,", tables);
			tables = String.format("%s%s", tables, kp.getName());					
			String where = "ad_table_id = ? and ad_reference_id in (15, 16) and columnname not in ('Created','Updated','DateAcct','ShipDate','DateOrdered','DateReceived','DatePrinted','PickDate')";
			X_AD_Column c = new Query(Env.getCtx(), X_AD_Column.Table_Name, where, null)
			.setParameters(kp.getKey()).first();
			if (c != null) {
				//dates.add(c.getColumnName());
				if (dates.length() > 0)
					dates = String.format("%s,", dates);
				dates = String.format("%s%s", dates, c.getColumnName());				
			}
		}
		l = (ListModel) data.getData(REF_M_TransactionTransactionType.OnlyMovement);
		for (int i=0; i < l.getSize(); i++) {
			ValueNamePair kp = (ValueNamePair) l.getElementAt(i);		
			if (dtonlyio.length() > 0)
				dtonlyio = String.format("%s,", dtonlyio);
			dtonlyio = String.format("%s%s", dtonlyio, kp.getValue());
		}
		l = (ListModel) data.getData(REF_M_TransactionTransactionType.MovementAndCost);
		List<String> dtiocostlist = new ArrayList<String>();
		for (int i=0; i < l.getSize(); i++) {
			ValueNamePair kp = (ValueNamePair) l.getElementAt(i);
			if (!dtiocostlist.contains(kp.getValue())) {			
				if (dtiocost.length() > 0)
					dtiocost  = String.format("%s,", dtiocost);
				dtiocost = String.format("%s%s", dtiocost, kp.getValue());
				dtiocostlist.add(kp.getValue());
			}
		}
		l = (ListModel) data.getData(REF_M_TransactionTransactionType.Adjustment);
		List<String> adjustlist = new ArrayList<String>();
		for (int i=0; i < l.getSize(); i++) {
			ValueNamePair kp = (ValueNamePair) l.getElementAt(i);
			if (!adjustlist.contains(kp.getValue())) {
				if (adjust.length() > 0)
					adjust = String.format("%s,", adjust);
				adjust = String.format("%s%s",adjust, kp.getValue());
				adjustlist.add(kp.getValue());
			}
		}
		l = (ListModel) data.getData(X_M_Transaction.COLUMNNAME_SeqNo);		
		for (int i=0; i < l.getSize(); i++) {
			ValueNamePair kp = (ValueNamePair) l.getElementAt(i);
			
			if (sequence.length() > 0)
				sequence = String.format("%s,", sequence);
			sequence = String.format("%s%s", sequence, kp.getValue());
		}
		KeyNamePair kp = (KeyNamePair) data.getData(X_AD_Process.COLUMNNAME_AD_Process_ID);
		String name = (String) data.getData(X_M_MaterialPolicy.COLUMNNAME_Name);
		Timestamp date = (Timestamp) data.getData(X_M_MaterialPolicy.COLUMNNAME_StartDate);
		Integer M_CostElement_ID = (Integer) data.getData(X_M_MaterialPolicy.COLUMNNAME_M_CostElement_ID);

		String M_MaterialProcessor_ID = (String) data.getData(X_M_MaterialProcessor.COLUMNNAME_M_MaterialProcessor_ID);
		String M_MaterialPolicy_ID = (String) data.getData(X_M_MaterialPolicy.COLUMNNAME_M_MaterialPolicy_ID); 
		
		X_M_MaterialPolicy policy =  new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
				.setParameters(Integer.valueOf(M_MaterialPolicy_ID)).first();		
		if (policy == null) {
			policy = new X_M_MaterialPolicy(Env.getCtx(), 0, null);
		}
		policy.setM_MaterialProcessor_ID(Integer.valueOf(M_MaterialProcessor_ID));		
		policy.setName(name);
		policy.setStartDate(date);
		policy.setM_CostElement_ID(M_CostElement_ID);
		HashMap props = new HashMap();
		props.put("tables", tables);
		props.put("dtonlyio", dtonlyio);		
		props.put("seqno",sequence);
		props.put("dates", dates);
		props.put("dtiocost", dtiocost);
		props.put("adjust", adjust);
		props.put("process", kp.getKey());
		policy.setProperties(props);		
		policy.save();					
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}

}
