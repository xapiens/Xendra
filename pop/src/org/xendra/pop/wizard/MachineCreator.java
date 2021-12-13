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

package org.xendra.pop.wizard;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.swing.ListModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

import org.compiere.model.MColumn;
import org.compiere.model.MPOP;
import org.compiere.model.MRule;
import org.compiere.model.MWarehouse;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Config;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_C_ConversionType;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_C_POPDocType;
import org.compiere.model.persistence.X_C_POPLine;
import org.compiere.model.persistence.X_C_StorePOPLine;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.model.reference.REF_TypePOPLine;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xendra.Constants;

public class MachineCreator implements WizardModelListener {
	public static final String ismodifysopricelist 	= "ismodifysopricelist";
	public static final String overwritepricelimit  = "overwritepricelimit";
	public static final String overwritepricelist  	= "overwritepricelist";
	public static final String iscandelete		  	= "iscandelete";
	public static final String iscanvoid			= "iscanvoid" ;
	public static final String nrocolumnspanel		= "nrocolumnspanel";	
	protected DataModel data;	

	public MachineCreator(DataModel data) {
		this.data = data;
	}

	public void wizardFinished(WizardModelEvent e) {	
		Boolean newprofile = (Boolean) data.getData(X_AD_Config.COLUMNNAME_AD_Config_ID);
		MPOP popmodel = null;
		if (newprofile)
		{
			popmodel = new MPOP(Env.getCtx(), 0, null);
			String name = (String) data.getData(X_C_POP.COLUMNNAME_Name);
			String description = (String) data.getData(X_C_POP.COLUMNNAME_Description);
			Integer AD_User_ID = (Integer) data.getData(X_AD_User.COLUMNNAME_AD_User_ID);
			Integer C_Currency_ID = (Integer) data.getData(X_C_Currency.COLUMNNAME_C_Currency_ID);
			Integer M_PriceSalesList_ID = (Integer) data.getData(X_C_POP.COLUMNNAME_M_PriceSalesList_ID);
			Integer C_ConversionType_ID = (Integer) data.getData(X_C_ConversionType.COLUMNNAME_C_ConversionType_ID);
			Integer M_PriceList_ID = (Integer) data.getData(X_M_PriceList.COLUMNNAME_M_PriceList_ID);
			popmodel.setName(name);
			popmodel.setDescription(description);
			popmodel.setAD_User_ID(AD_User_ID);
			popmodel.setC_Currency_ID(C_Currency_ID);
			popmodel.setM_PriceSalesList_ID(M_PriceSalesList_ID);
			popmodel.setC_ConversionType_ID(C_ConversionType_ID);
			popmodel.setM_PriceList_ID(M_PriceList_ID);
			popmodel.save();
		}
		else
		{
			popmodel = (MPOP) data.getData(Constants.Model);
		}
		HashMap props = Env.getMachine().getProperties();
		Integer money = (Integer) data.getData(X_C_Currency.COLUMNNAME_C_Currency_ID);
		props.put(ismodifysopricelist, data.getData(ismodifysopricelist));	
		props.put(nrocolumnspanel, data.getData(nrocolumnspanel));
		KeyNamePair kpmsg = (KeyNamePair) data.getData(REF_ServerType.MessageServer);			
		props.put(REF_ServerType.MessageServer, String.valueOf(kpmsg.getKey()));
		props.put(X_C_POP.COLUMNNAME_C_POP_ID, String.valueOf(popmodel.getC_POP_ID()));
		Env.getMachine().setProperties(props);		
		Env.getMachine().save();
		MRule rule = (MRule) data.getData(Constants.Rule);		
		popmodel.setAD_Rule_ID(rule.getAD_Rule_ID());
		MWarehouse wh = (MWarehouse) data.getData(X_M_Warehouse.COLUMNNAME_M_Warehouse_ID);
		popmodel.setM_Warehouse_ID(wh.getM_Warehouse_ID());		
		List<X_C_POPDocType> popdoctypes = new Query(Env.getCtx(), X_C_POPDocType.Table_Name, "C_POP_ID = ?", null)
		.setParameters(popmodel.getC_POP_ID()).list();
		ListModel pdtmodel = (ListModel) data.getData(X_C_DocType.COLUMNNAME_C_DocType_ID);
		for (int i=0; i < pdtmodel.getSize(); i++)
		{
			KeyNamePair kp = (KeyNamePair) pdtmodel.getElementAt(i);
			X_C_POPDocType pdt = new Query(Env.getCtx(), X_C_POPDocType.Table_Name, "C_DocType_ID = ? AND C_POP_ID = ?", null)
			.setParameters(kp.getKey(), popmodel.getC_POP_ID()).first();
			if (pdt == null)
			{
				pdt = new X_C_POPDocType(Env.getCtx(), 0, null);
				pdt.setC_DocType_ID(kp.getKey());
				pdt.setC_POP_ID(popmodel.getC_POP_ID());
				pdt.save();
			}
			else
			{
				popdoctypes.remove(pdt);
			}
			//
		}
		for (X_C_POPDocType pdt:popdoctypes)
		{
			pdt.delete(true);
		}
		CreateUpdateView(popmodel,REF_TypePOPLine.PointOfPurchase);
		CreateUpdateView(popmodel,REF_TypePOPLine.UpdatePrice);
		//
		popmodel.save();				
	}

	private void CreateUpdateView(MPOP popmodel, String viewtype) {
		String where = "C_POP_ID = ?";
		where = String.format("%s AND type = '%s'", where, viewtype);
		List<X_C_POPLine> lines = new Query(Env.getCtx(), X_C_POPLine.Table_Name, where, null)
		.setParameters(popmodel.getC_POP_ID()).list();
		ListModel linemodel = (ListModel) data.getData(viewtype);
		int Line = 10; 
		if (linemodel.getSize() != lines.size())
		{
			String fileName = Env.getResource("org.xendra.pop", "popview.properties");
			File file = new File(fileName);
			if (file.exists())
			{
				resetFile(fileName);
			}
		}
		for (int i=0; i < linemodel.getSize(); i++)
		{
			KeyNamePair kp = (KeyNamePair) linemodel.getElementAt(i);			
			X_C_StorePOPLine spl = new X_C_StorePOPLine(Env.getCtx(), kp.getKey(), null);
			String ColumnWhere = String.format("C_StorePOPLine_ID = ? AND %s", where);
			X_C_POPLine pdt = new Query(Env.getCtx(), X_C_POPLine.Table_Name, ColumnWhere, null)
			.setParameters(spl.getC_StorePOPLine_ID(), popmodel.getC_POP_ID()).first();
			if (pdt == null) {
				pdt = new X_C_POPLine(Env.getCtx(), 0, null);
			} else {
				lines.remove(pdt);
			}
			if (spl.getColumnID().length() > 0) {
				MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
				.setParameters(spl.getColumnID()).first();
				if (column != null) {
					pdt.setAD_Column_ID(column.getAD_Column_ID());
				}
			}			
			pdt.setName(spl.getName());
			pdt.setDescription(spl.getDescription());
			pdt.setClassname(spl.getClassname());				

			pdt.setC_POP_ID(popmodel.getC_POP_ID());
			pdt.setIsVisible(true);
			pdt.setAD_Reference_Value_ID(spl.getAD_Reference_Value_ID());
			pdt.setIsDefault(spl.isDefault());
			pdt.setIsDescription(spl.isDescription());
			pdt.setIsNextLine(spl.isNextLine());
			pdt.setIsKey(spl.isKey());
			pdt.setType(viewtype);				
			pdt.setSourceMethodName(spl.getSourceMethodName());
			pdt.setAD_Reference_Value_ID(spl.getAD_Reference_Value_ID());
			pdt.setAD_Reference_ID(spl.getAD_Reference_ID());
			pdt.setC_StorePOPLine_ID(spl.getC_StorePOPLine_ID());
			pdt.setIsReadWrite(spl.isReadWrite());				
			pdt.setLine(Line);
			pdt.setIsVisible(true);
			pdt.save();
			Line++;
		}	
		for (X_C_POPLine pdt:lines)
		{
			pdt.delete(true);
		}
	}

	private void resetFile(String filename) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.newDocument();
			Element xroot = doc.createElement("xml");
			doc.appendChild(xroot);
			Element broot = doc.createElement("body");
			xroot.appendChild(broot);
			broot.setAttribute("reset", "yes");
			writeXmlToFile(filename, doc);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private void writeXmlToFile(String pFilename, Document pDocument) {
		try {
			Source source = new DOMSource(pDocument);
			File file = new File(pFilename);
			Result result = new StreamResult(file);
			Transformer xformer = TransformerFactory.newInstance()
					.newTransformer();
			xformer.setOutputProperty(OutputKeys.INDENT, "yes"); // add newlines
			xformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace(); 
		}
	}	

	public void stepShown(WizardModelEvent e) {
	}

	public void wizardCanceled(WizardModelEvent e) {
	}

	public void wizardModelChanged(WizardModelEvent e) {
	}
}
