package org.xendra.efact.wizard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.ListModel;

import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BP_DocType;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.model.persistence.X_C_BPartner_Location;
import org.compiere.model.persistence.X_C_BankAccount;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_SPOT;
import org.compiere.model.reference.REF_C_BankAccountType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.efact.wizard.documenttax.DocTypeDocumentTax;
import org.xendra.util.UpdatePO;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class EFactConfigurationCreator implements WizardModelListener {
	protected DataModel data;
	
	public EFactConfigurationCreator(DataModel data) {
		this.data = data;
	}

	@Override
	public void wizardFinished(WizardModelEvent arg0) {		
		Integer C_BPartner_ID = (Integer) data.getData(X_C_Invoice.COLUMNNAME_C_BPartner_ID);
		Integer Location_ID = (Integer) data.getData(X_C_Location.COLUMNNAME_Address1);
		Integer C_BP_DocType_ID = (Integer) data.getData(X_C_BPartner.COLUMNNAME_C_BP_DocType_ID);
		Integer C_BankAccount_ID = (Integer) data.getData(X_C_Payment.COLUMNNAME_C_BankAccount_ID);
		Integer RetentionRate = (Integer) data.getData(X_C_SPOT.COLUMNNAME_C_RetentionRate);
		Integer RetentionAmt = (Integer) data.getData(X_C_SPOT.COLUMNNAME_C_RetentionMinAmt);
		boolean detraction = (boolean) data.getData(X_C_Invoice.COLUMNNAME_IsDetraction);
		X_C_BPartner_Certificate bpc= new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(C_BPartner_ID).first();
		if (bpc == null) {
			bpc = new X_C_BPartner_Certificate(Env.getCtx(), 0 , null);
			bpc.setC_BPartner_ID(C_BPartner_ID);
			bpc.save();
		}		
		HashMap p = bpc.getProperties();
		MBPartner bp = MBPartner.get(Env.getCtx(), C_BPartner_ID);
		X_C_BPartner_Location pl = new Query(Env.getCtx(), X_C_BPartner_Location.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(C_BPartner_ID).first();
		if (pl == null) {
			pl = new X_C_BPartner_Location(Env.getCtx(), 0, null);
			pl.setC_BPartner_ID(C_BPartner_ID);
			pl.save();
		}
		pl.setC_Location_ID(Location_ID);		
		pl.save();
		X_C_BP_DocType bpdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null).setParameters(C_BP_DocType_ID).first();
		if (bpdt != null) {
			bp.setC_BP_DocType_ID(bpdt.getC_BP_DocType_ID());
			bp.save();
		} 
		
		UpdatePO up = new UpdatePO();
		up.setTablename(X_C_DocType.Table_Name);
		up.setField(X_C_DocType.COLUMNNAME_IsElectronic, "N");
		up.setClient(Env.getAD_Client_ID(Env.getCtx()));
		up.update(null, null);
		ListModel pdtmodel = (ListModel) data.getData(X_C_DocType.COLUMNNAME_C_DocType_ID);
		for (int i=0; i < pdtmodel.getSize(); i++)
		{
			KeyNamePair kp = (KeyNamePair) pdtmodel.getElementAt(i);
			X_C_DocType pdt = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", null)
			.setParameters(kp.getKey()).first();
			pdt.setIsElectronic(true);
			pdt.save();
		}		
		List<DocTypeDocumentTax>  ddts =  (List) data.getData(X_C_DocType.COLUMNNAME_C_DocumentTax_ID);
		for (DocTypeDocumentTax ddt:ddts) {
			X_C_DocType dt = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", null)
			.setParameters(ddt.getC_DocType_ID()).first();
			if (dt != null) {
				dt.setC_DocumentTax_ID(ddt.getC_DocumentTax_ID());
				dt.save();
			}			
		}		
		if (detraction) {
			X_C_SPOT spot = new Query(Env.getCtx(), X_C_SPOT.Table_Name, "AD_Client_ID = ?", null)
						.setParameters(Env.getAD_Client_ID(Env.getCtx())).first();
			if (spot == null) {
				spot = new X_C_SPOT(Env.getCtx(), 0, null);
			}
			spot.setC_RetentionRate(new BigDecimal(RetentionRate));
			spot.setC_RetentionMinAmt(new BigDecimal(RetentionAmt));
			spot.save();
			X_C_BankAccount bankaccount = new Query(Env.getCtx(), X_C_BankAccount.Table_Name, "C_BankAccount_ID = ?", null)
						.setParameters(C_BankAccount_ID).first();
			if (bankaccount == null) {
				bankaccount = new X_C_BankAccount(Env.getCtx(), 0, null);						
			}
			bankaccount.setBankAccountType(REF_C_BankAccountType.Detraccion);
			bankaccount.save();
		}
	}


	@Override
	public void stepShown(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardCanceled(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}

}
