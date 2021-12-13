//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.

package org.xendra.pos.wizard;

import java.awt.Window;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import javax.swing.ListModel;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

import org.compiere.apps.ADialog;
import org.compiere.model.MCashBook;
import org.compiere.model.MColumn;
import org.compiere.model.MPOS;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MRule;
import org.compiere.model.Machine;
import org.compiere.model.MachinePrinter;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_C_Campaign;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_POSDocType;
import org.compiere.model.persistence.X_C_POSLine;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.model.persistence.X_C_StorePOSLine;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.frapuccino.swing.ActiveWindowTracker;
import org.xendra.Constants;

public class MachineCreator implements WizardModelListener {
	public static final String Collection = "COL";
	public static final String CashCount = "CCF";
	public static final String CreditCardList = "CCL";
	public static final String VoidCanceledList = "LCL";
	public static final String POSCreditFormat = "PCF";
	public static final String POSOptionalFormat = "OPF";

	public static final String ismodifyprice 		= "ismodifyprice";
	public static final String iscashbased 			= "iscashbased";
	public static final String isModifyDate 		= "isModifyDate";
	public static final String overwritepricelimit 	= "overwritepricelimit" ;
	public static final String overwritepricelist  	= "overwritepricelist";
	public static final String iscandelete		  	= "iscandelete";
	public static final String ismodifydocnumber   	= "ismodifydocnumber";
	public static final String isshowDocument	  	= "isshowDocument";
	public static final String iscredit			  	= "iscredit";
	public static final String iscash			  	= "iscash";
	public static final String ispartial 			= "ispartial";
	public static final String iscoupon			  	= "iscoupon" ;
	public static final String ispayment			= "ispayment" ;
	public static final String iscanvoid			= "iscanvoid" ;
	public static final String isallowduplicated   	= "isallowduplicated";
	public static final String isBalance			= "isBalance";
	//public static final String isSearchAtBegin	  	= "isSearchAtBegin";
	public static final String isBonusPoints		= "isBonusPoints";
	public static final String isGlobalDiscount	  	= "isGlobalDiscount";
	public static final String isThirdSalesman	  	= "isThirdSalesman";
	public static final String isForceSalesman	  	= "isForceSalesman" ;
	public static final String startcodebalance  	= "startcodebalance";
	public static final String endcodebalance	  	= "endcodebalance";
	public static final String startweightbalance 	= "startweightbalance";
	public static final String endweightbalance		= "endweightbalance";
	public static final String isCloseWindow		= "isCloseWindow";
	public static final String ismodifyPriceList	= "ismodifyPriceList";
	public static final String nrocopiescollection  = "nrocopiescollection";
	public static final String nrocolumnspanel		= "nrocolumnspanel";	
	protected DataModel data;	
	private MPOS posmodel = null;
	public MachineCreator(DataModel data) {
		this.data = data;
	}

	public MPOS getModel()  {
		return posmodel;
	}

	public void wizardFinished(WizardModelEvent e) {	
		Machine machine = Env.getMachine();
		Integer wh = (Integer) data.getData(X_M_Warehouse.COLUMNNAME_M_Warehouse_ID);
		Integer cb = (Integer) data.getData(MCashBook.COLUMNNAME_C_CashBook_ID);
		Integer pl = (Integer) data.getData(X_M_PriceList.COLUMNNAME_M_PriceList_ID);
		String writeofftype = (String) data.getData(X_C_POS.COLUMNNAME_WriteOffType);
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			posmodel = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
			.setParameters(C_POS_ID).first();
		}
		if (posmodel == null) {
			String where = "M_Warehouse_ID = ? AND C_CashBook_ID = ? AND M_PriceList_ID = ? ";
			posmodel = new Query(Env.getCtx(), MPOS.Table_Name, where, null)
			.setParameters(wh,cb,pl).first();
		}		
		if (posmodel == null) {
			posmodel = new MPOS(Env.getCtx(), 0, null);
		}
		Method method = null;
		try {
			method = this.getClass().getMethod("getModel", null);			
		} catch (NoSuchMethodException nsme) {
		}
		data.registerDataLookup(Constants.Model,new DefaultDataLookup(this, method, null));
		String dr = (String) data.getData(X_C_Order.COLUMNNAME_DeliveryRule);
		Integer creditterm = (Integer) data.getData(X_C_POS.COLUMNNAME_Credit_C_PaymentTerm_ID);
		Integer cashterm = (Integer) data.getData(X_C_POS.COLUMNNAME_Cash_C_PaymentTerm_ID);
		Integer orgid = (Integer) data.getData(Constants.COLUMNNAME_AD_Org_ID);
		posmodel.setAD_Org_ID(orgid);
		posmodel.setDeliveryRule(dr);
		posmodel.setWriteOffType(writeofftype);
		posmodel.setCash_C_PaymentTerm_ID(cashterm);
		posmodel.setCredit_C_PaymentTerm_ID(creditterm);
		MRule rule = (MRule) data.getData(Constants.Rule);	
		posmodel.setAD_Rule_ID(rule.getAD_Rule_ID());
		Integer plv = (Integer) data.getData(MPriceListVersion.COLUMNNAME_M_PriceList_Version_ID);
		Integer cdt = (Integer) data.getData(X_C_POS.COLUMNNAME_Cash_C_DocType_ID);
		Integer pty = (Integer) data.getData(X_C_POS.COLUMNNAME_Payment_C_DocType_ID);
		Integer userid = (Integer) data.getData(X_C_POS.COLUMNNAME_SalesRep_ID);
		posmodel.setM_Warehouse_ID(wh);
		posmodel.setC_CashBook_ID(cb);
		String name = (String) data.getData(X_C_POS.COLUMNNAME_Name);
		posmodel.setName(name);
		posmodel.setM_PriceList_ID(pl);
		posmodel.setM_PriceList_Version_ID(plv);
		posmodel.setCash_C_DocType_ID(cdt);
		posmodel.setPayment_C_DocType_ID(pty);
		posmodel.setSalesRep_ID(userid);
		if (posmodel.save())  {				
			HashMap props = Env.getMachine().getProperties();
			props.put(ismodifyprice, data.getData(ismodifyprice));
			props.put(X_C_Campaign.COLUMNNAME_C_Campaign_ID, data.getData(X_C_Campaign.COLUMNNAME_C_Campaign_ID));
			props.put(iscashbased, data.getData(iscashbased));
			props.put(isModifyDate, data.getData(isModifyDate));
			props.put(overwritepricelimit,data.getData(overwritepricelimit));
			props.put(overwritepricelist,data.getData(overwritepricelist));
			props.put(iscandelete,data.getData(iscandelete));
			props.put(ismodifydocnumber,data.getData(ismodifydocnumber));
			props.put(isshowDocument,data.getData(isshowDocument));
			props.put(iscredit,data.getData(iscredit));
			props.put(iscash,data.getData(iscash));
			props.put(ispartial,  data.getData(ispartial));
			props.put(iscoupon,data.getData(iscoupon));
			props.put(ispayment,data.getData(ispayment));
			props.put(iscanvoid,data.getData(iscanvoid));
			props.put(isallowduplicated,data.getData(isallowduplicated));
			props.put(isBalance,data.getData(isBalance));
			//props.put(isSearchAtBegin,data.getData(isSearchAtBegin));
			props.put(isBonusPoints,data.getData(isBonusPoints));
			props.put(isGlobalDiscount,data.getData(isGlobalDiscount));
			props.put(isThirdSalesman,data.getData(isThirdSalesman));
			props.put(isForceSalesman,data.getData(isForceSalesman));
			props.put(isCloseWindow, data.getData(isCloseWindow));
			props.put(ismodifyPriceList, data.getData(ismodifyPriceList));
			props.put(startcodebalance, data.getData(startcodebalance));
			props.put(endcodebalance, data.getData(endcodebalance));
			props.put(startweightbalance, data.getData(startweightbalance));
			props.put(endweightbalance, data.getData(endweightbalance));
			props.put(nrocopiescollection, data.getData(nrocopiescollection));
			props.put(nrocolumnspanel, data.getData(nrocolumnspanel));
			props.put(X_C_POS.COLUMNNAME_C_POS_ID, String.valueOf(posmodel.getC_POS_ID()));
			KeyNamePair kpmsg = (KeyNamePair) data.getData(REF_ServerType.MessageServer);			
			props.put(REF_ServerType.MessageServer, String.valueOf(kpmsg.getKey()));
			Env.getMachine().setProperties(props);		
			Env.getMachine().save();			
			addformat(posmodel.getC_POS_ID(), 
					(X_C_PrinterDocumentFormat) data.getData(MachineCreator.Collection), 
					(MachinePrinter) data.getData(String.format("%s_Printer", MachineCreator.Collection)), MachineCreator.Collection);		
			addformat(posmodel.getC_POS_ID(), 
					(X_C_PrinterDocumentFormat) data.getData(MachineCreator.CashCount),
					(MachinePrinter) data.getData(String.format("%s_Printer", MachineCreator.CashCount)), MachineCreator.CashCount);		                		
			addformat(posmodel.getC_POS_ID(), 
					(X_C_PrinterDocumentFormat) data.getData(MachineCreator.CreditCardList),
					(MachinePrinter) data.getData(String.format("%s_Printer", MachineCreator.CreditCardList)), MachineCreator.CreditCardList);
			addformat(posmodel.getC_POS_ID(), 
					(X_C_PrinterDocumentFormat) data.getData(MachineCreator.VoidCanceledList),
					(MachinePrinter) data.getData(String.format("%s_Printer", MachineCreator.VoidCanceledList)), MachineCreator.VoidCanceledList);
			addformat(posmodel.getC_POS_ID(), 
					(X_C_PrinterDocumentFormat) data.getData(MachineCreator.POSCreditFormat),			
					(MachinePrinter) data.getData(String.format("%s_Printer", MachineCreator.POSCreditFormat)), MachineCreator.POSCreditFormat);
			addformat(posmodel.getC_POS_ID(), 
					(X_C_PrinterDocumentFormat) data.getData(MachineCreator.POSOptionalFormat),			
					(MachinePrinter) data.getData(String.format("%s_Printer", MachineCreator.POSOptionalFormat)), MachineCreator.POSOptionalFormat);
			List<X_C_POSDocType> posdoctypes = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_POS_ID = ?", null)
			.setParameters(posmodel.getC_POS_ID()).list();
			// obteniendo los posdoctype seleccionados
			ListModel pdtmodel = (ListModel) data.getData(X_C_DocType.COLUMNNAME_C_DocType_ID);
			for (int i=0; i < pdtmodel.getSize(); i++)
			{
				KeyNamePair kp = (KeyNamePair) pdtmodel.getElementAt(i);
				X_C_POSDocType pdt = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_DocType_ID = ? AND C_POS_ID = ?", null)
				.setParameters(kp.getKey(), posmodel.getC_POS_ID()).first();
				// si el posdoctype no existe lo agrega a la tabla
				if (pdt == null)
				{
					pdt = new X_C_POSDocType(Env.getCtx(), 0, null);
					pdt.setC_DocType_ID(kp.getKey());
					pdt.setC_POS_ID(posmodel.getC_POS_ID());
					pdt.save();
				}
				else
				{
					// si existe lo quita de la lista postdoctypes ...
					posdoctypes.remove(pdt);
				}
			}				
			// ... porque sera borrado de la tabla
			for (X_C_POSDocType pdt:posdoctypes)
			{
				pdt.delete(true);
			}	
			//
			List<DocTypePrintFormat> doctypesprintformats = (List<DocTypePrintFormat>) data.getData("DocTypePrintFormat");
			for (DocTypePrintFormat dtp:doctypesprintformats) {
				X_C_DocType dt = new Query(Env.getCtx(), X_C_DocType.Table_Name , "C_DocType_ID =?", null)
				.setParameters(dtp.getC_DocType_ID()).first();
				if (dt != null) {
					dt.setAD_MessageFormat_ID(dtp.getAD_MessageFormat_ID());
					dt.save();
				}
				X_C_POSDocType pdt = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_DocType_ID = ? AND C_POS_ID = ?", null)
				.setParameters(dtp.getC_DocType_ID(), posmodel.getC_POS_ID()).first();
				if (pdt == null) {
					pdt = new X_C_POSDocType(Env.getCtx(), 0, null);
					pdt.setC_POS_ID(posmodel.getC_POS_ID());
					pdt.setC_DocType_ID(dtp.getC_DocType_ID());
				}
				pdt.setC_PrinterDocumentFormat_ID(dtp.getPOSPrinterDocumentFormat_ID());
				pdt.setA_MachinePrinter_ID(dtp.getPOSMachinePrinter_ID());
				pdt.setSource(dtp.getSource());
				pdt.save();
			}
			// obtenemos los poslines actuales 
			List<X_C_POSLine> lines = new Query(Env.getCtx(), X_C_POSLine.Table_Name, "C_POS_ID = ?", null)
			.setParameters(posmodel.getC_POS_ID()).list();
			// obtenemos los poslines seleccionados
			ListModel linemodel = (ListModel) data.getData(X_C_POSLine.COLUMNNAME_C_POSLine_ID);
			int Line = 10; 
			for (int i=0; i < linemodel.getSize(); i++)
			{
				KeyNamePair kp = (KeyNamePair) linemodel.getElementAt(i);			
				X_C_StorePOSLine spl = new X_C_StorePOSLine(Env.getCtx(), kp.getKey(), null); // instanciamos la linea seleccionada		
				// existe en nuestro actual modelo? 
				X_C_POSLine pdt = new Query(Env.getCtx(), X_C_POSLine.Table_Name, "C_StorePOSLine_ID = ? AND C_POS_ID = ?", null)
				.setParameters(spl.getC_StorePOSLine_ID(), posmodel.getC_POS_ID()).first();

				if (pdt == null)
				{
					// igual, lo creo  a nivel tabla  ...
					pdt = new X_C_POSLine(Env.getCtx(), 0, null);
				}
				else
				{				
					// ... si existe lo remuevo de lines
					lines.remove(pdt);							
				}
				if (spl.getColumnID().length() > 0) {
					MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
					.setParameters(spl.getColumnID()).first();
					if (column != null) {
						pdt.setAD_Column_ID(column.getAD_Column_ID());
					}
				}
				//
				pdt.setName(spl.getName());
				pdt.setDescription(spl.getDescription());
				pdt.setClassname(spl.getClassname());								
				pdt.setC_POS_ID(posmodel.getC_POS_ID());
				pdt.setIsVisible(true);
				pdt.setIsReadWrite(spl.isReadWrite());
				pdt.setAD_Reference_Value_ID(spl.getAD_Reference_Value_ID());
				pdt.setIsDefault(spl.isDefault());
				pdt.setIsDescription(spl.isDescription());
				pdt.setIsNextLine(spl.isNextLine());
				pdt.setIsKey(spl.isKey());
				pdt.setSourceMethodName(spl.getSourceMethodName());
				pdt.setAD_Reference_Value_ID(spl.getAD_Reference_Value_ID());
				pdt.setAD_Reference_ID(spl.getAD_Reference_ID());
				pdt.setC_StorePOSLine_ID(spl.getC_StorePOSLine_ID());
				//
				pdt.setLine(Line);
				pdt.save();
				Line++;
			}	
			for (X_C_POSLine pdt:lines)
			{
				pdt.delete(true);
			}
		} else {
			Window w = ActiveWindowTracker.findActiveWindow();
			ADialog.error(Env.getWindowNo(w), null, "inconsistencia en los datos suministrados");			
		}
	}

	private void addformat(int C_POS_ID, X_C_PrinterDocumentFormat pdf, MachinePrinter mp, String value) {
		String query = "AD_Table_ID = ? AND Record_ID = ? AND Value = ? ";
		if (pdf != null) {			
			X_C_PrinterFormat format = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, query , null)
			.setParameters(X_C_POS.Table_ID, C_POS_ID, value).first();				
			if (format == null)
			{
				format = new X_C_PrinterFormat(Env.getCtx(), 0 , null);
				format.setAD_Table_ID(X_C_POS.Table_ID);
				format.setRecord_ID(C_POS_ID);
			}
			format.setC_PrinterDocumentFormat_ID(pdf.getC_PrinterDocumentFormat_ID());
			format.setValue(value);		
			format.setA_MachinePrinter_ID(mp.getA_MachinePrinter_ID());
			format.save();
		} else {
			X_C_PrinterFormat format = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, query , null)
			.setParameters(X_C_POS.Table_ID, C_POS_ID, value).first();				
			if (format != null) {
				format.delete(true);
			}
			
		}
	}	

	public void stepShown(WizardModelEvent e) {
	}

	public void wizardCanceled(WizardModelEvent e) {
	}

	public void wizardModelChanged(WizardModelEvent e) {
	}
}
