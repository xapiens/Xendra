package org.xendra.efact.wizard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.ListModel;

import org.compiere.model.MBPartner;
import org.compiere.model.MClientInfo;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_ClientInfo;
import org.compiere.model.persistence.X_AD_Process_Machine;
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
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Product_Category;
import org.compiere.model.reference.REF_C_BankAccountType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.Constants;
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
		Integer C_BPartnerCashTrx_ID = (Integer) data.getData(X_AD_ClientInfo.COLUMNNAME_C_BPartnerCashTrx_ID);
		Integer C_BPartnerCashLocation_ID = (Integer) data.getData(X_C_Location.COLUMNNAME_Address2);
		Integer C_BPartnerCashTrx_DocType_ID = (Integer) data.getData(X_AD_ClientInfo.COLUMNNAME_AD_Tree_BPartner_ID);
		MBPartner cashpartner = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(C_BPartnerCashTrx_ID).first();
		if (cashpartner != null) {
			cashpartner.setC_BP_DocType_ID(C_BPartnerCashTrx_DocType_ID);
			cashpartner.save();
			MClientInfo ci = MClientInfo.get(Env.getCtx());
			ci.setC_BPartnerCashTrx_ID(cashpartner.getC_BPartner_ID());
			ci.save();
			X_C_BPartner_Location plothers = new Query(Env.getCtx(), X_C_BPartner_Location.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(cashpartner.getC_BPartner_ID()).first();
			if (plothers == null) {
				plothers = new X_C_BPartner_Location(Env.getCtx(), 0, null);
				plothers.setC_BPartner_ID(cashpartner.getC_BPartner_ID());				
			}
			plothers.setC_Location_ID(C_BPartnerCashLocation_ID);
			plothers.save();
		}
		MClientInfo ci = MClientInfo.get(Env.getCtx());		
		MBPartner partner = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ? ", null)
				.setParameters(ci.getC_BPartnerCashTrx_ID()).first();						
		
		
		
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
		bp.setC_BP_DocType_ID(C_BP_DocType_ID);
		bp.save();
		 
		
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
				dt.setInvoiceOperationTypeCode(ddt.getOperationTypeCode());
				dt.save();
			}			
		}		
		List<ProductPriceTypeCode> ptcs = (List) data.getData(X_M_Product.COLUMNNAME_M_Product_Category_ID);
		for (ProductPriceTypeCode ptc:ptcs) {
			X_M_Product_Category pc = new Query(Env.getCtx(), X_M_Product_Category.Table_Name, "M_Product_Category_ID = ?", null)
					.setParameters(ptc.getM_Product_Category_ID()).first();
			pc.setPriceTypeCode(ptc.getProductPriceTypeCode());
			if (pc.save()) {
				UpdatePO o = new UpdatePO();
				o.setTablename(X_M_Product.Table_Name);
				o.setField(X_M_Product.COLUMNNAME_PriceTypeCode, pc.getPriceTypeCode());
				o.setClient(Env.getAD_Client_ID(Env.getCtx()));
				int no = o.update(String.format("%s=%s", X_M_Product.COLUMNNAME_M_Product_Category_ID,pc.getM_Product_Category_ID()), null);		
				//o.update(null, null)
				//int no = o.delete(String.format("AD_Process_Machine_ID = %s", n.getAD_Process_Machine_ID()), null);
				//if (no > 0)
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
