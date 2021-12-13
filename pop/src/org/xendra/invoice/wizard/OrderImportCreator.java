package org.xendra.invoice.wizard;

import java.util.List;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.model.persistence.X_M_PriceList_Version;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class OrderImportCreator implements WizardModelListener {
	protected DataModel data;
	public OrderImportCreator(DataModel data) {
		this.data = data;
	}

	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardFinished(WizardModelEvent evt) {		
		try {
			
			Integer M_PriceList_ID = (Integer) data.getData(X_M_PriceList.COLUMNNAME_M_PriceList_ID);
			Integer M_PriceListVersion_ID = (Integer) data.getData(X_M_PriceList_Version.COLUMNNAME_M_PriceList_Version_ID);			

			MOrder order = new MOrder(Env.getCtx(), 0, null);
			order.setIsSOTrx(false);		
			order.setAD_User_ID(Env.getAD_User_ID(Env.getCtx()));
			order.setBill_User_ID(Env.getAD_User_ID(Env.getCtx()));
			order.setSalesRep_ID(Env.getAD_User_ID(Env.getCtx()));			
			order.setDocumentNo(InvoiceParser.getInstance().getDocumentNo());
			order.setM_PriceList_ID(M_PriceList_ID);
			order.setM_PriceList_Version_ID(M_PriceListVersion_ID);
			order.setC_Currency_ID(InvoiceParser.getInstance().getC_Currency_ID());
			order.setDateOrdered(InvoiceParser.getInstance().getDateOrdered());
			order.setDatePromised(InvoiceParser.getInstance().getDatePromised());
			order.setC_BPartner_ID(InvoiceParser.getInstance().getC_BPartner_ID());
			order.setC_BPartner_Location_ID(InvoiceParser.getInstance().getC_BPartner_Location_ID());
			order.setC_DocTypeTarget_ID(REF_C_DocTypeSubType.PurchaseStandardOrder);			
			if (order.save()) {
				List<InvoiceLine> lines = InvoiceParser.getInstance().getLines();
				for (InvoiceLine invline:lines) {
					MOrderLine line = new MOrderLine(order);
					line.setC_UOM_ID(invline.getC_UOM_ID());
					line.setDescription(invline.getDescription());
					line.setM_Product_ID(invline.getM_Product_ID());
					line.setPriceEntered(invline.getPriceEntered());
					// ?
					line.setPriceList(invline.getPriceEntered());
					line.setPriceActual(invline.getPriceEntered());					
					//
					line.setQty(invline.getQty());
					line.setQtyEntered(invline.getQty());
					line.setQtyOrdered(invline.getQty());
					if (!line.save()) {
						System.out.println("X");
					}
				}
				order.calculateTaxTotal();
				order.save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

}
