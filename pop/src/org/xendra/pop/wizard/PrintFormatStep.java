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

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.Constants;
import org.xendra.pop.util.ResourceLoader;
import org.compiere.util.Env;
import org.compiere.model.MColumn;
import org.compiere.model.MPOP;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.model.reference.REF_C_PrinterFormatType;

class PrintFormatStep extends AbstractStep {
    protected DataModel data;
    protected JTextField nameTextField;
    protected JTextField addressTextField;
    protected JTextField accountNameTextField;        
    
    public PrintFormatStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "printformat"),
    			ResourceLoader.getString("dialog", "machinewizard",   "printformat_description"));
    	this.data = data;
    	setCanGoNext(true);
    }

    protected JComponent createComponent() {    	
    	JComponent component = new JPanel();        
    	// vemos si hay formatos
    	try {
    		//List<X_C_PrinterDocumentFormat> spdfs = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "C_PrinterFormatType = ?", null)
    		//.setParameters(REF_C_PrinterFormatType.Collection).list();
    		//if (spdfs.size() == 0)
    		//	throw new Exception(REF_C_PrinterFormatType.Collection);

    		//for (X_C_PrinterDocumentFormat spf:spdfs)
    		//{
    		//	X_C_PrinterDocumentFormat pf = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "Identifier = ?", null)
    		//	.setParameters(spf.getIdentifier()).first();
    		//	if (pf == null)
    		//	{
    		//		pf = new X_C_PrinterDocumentFormat(Env.getCtx(), 0, null);
    		//		pf.setName(spf.getName());
    		//		pf.setFormat(spf.getFormat());   
    		//		pf.setC_PrinterFormatType(REF_C_PrinterFormatType.Collection);
    		//		pf.save();					
    		//	}
    		//}    			
    	} 
    	catch (Exception e)        
    	{    		

    		setCanGoBack(false);
    		setCanGoNext(false);
    		setCanFinish(false);
    		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));			
    		MultiLineLabel label = new MultiLineLabel(ResourceLoader.getString(
    				"dialog", "machinewizard", "printformat_store_"+e.getMessage()));
    		component.add(label);
    		component.add(Box.createVerticalGlue());
    		return component;    		
    	}                        

    	component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
    	component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "printformat_text")));
    	component.add(Box.createVerticalStrut(40)); 

    	int AD_Column_ID = MColumn.getColumn_ID(X_C_PrinterDocumentFormat.Table_Name, X_C_PrinterDocumentFormat.COLUMNNAME_C_PrinterFormatType, null);        
    	MColumn column = new MColumn(Env.getCtx(), AD_Column_ID, null);

    	MPOP posmodel = (MPOP) data.getData(Constants.Model);        

    	//addFormat(component, posmodel.getC_POP_ID(), column.getAD_Reference_Value_ID(), REF_C_PrinterFormatType.Collection);
    	return component;
    }

	private void addFormat(JComponent panel, int C_POP_ID, int AD_Reference_ID, String PrinterFormatType) {
		X_AD_Ref_List ref = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ? AND Value = ? ", null)
		.setParameters(AD_Reference_ID, PrinterFormatType).first();

		WizardTextField textfield = new WizardTextField();
		
		textfield.addLabel(new LabelWithMnemonic(ref.getName()));		

		try {
			List<MPrinterDocumentFormat> CCF = new Query(Env.getCtx(), MPrinterDocumentFormat.Table_Name, "C_PrinterFormatType = ?", null)
			.setParameters(PrinterFormatType).list();

			X_C_PrinterFormat CCFsel = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND C_PrinterFormatType = ?", null)
			.setParameters(X_C_POP.Table_ID, C_POP_ID, PrinterFormatType).first();
			
			MPrinterDocumentFormat xx = null;
			
			if (CCFsel != null)
				xx = new MPrinterDocumentFormat(Env.getCtx(), CCFsel.getC_PrinterDocumentFormat_ID(), null);

			JComboBox cbPrintServer = new JComboBox();

			for (MPrinterDocumentFormat pdf:CCF)
			{
				cbPrintServer.addItem(pdf);
				if (xx != null)
				{
					if (xx.getName().equals(pdf.getName())) 
					{
						cbPrintServer.setSelectedItem(pdf);
					}
				}			
			}

			Method method = null;        
			try {
				method = cbPrintServer.getClass().getMethod("getSelectedItem", null);
			} catch (NoSuchMethodException nsme) {
			}			
			data.registerDataLookup(PrinterFormatType,new DefaultDataLookup(cbPrintServer, method, null));                    
			textfield.addTextField(cbPrintServer);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			panel.add(textfield);			
		}
	}

	public void prepareRendering() {
//        SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
//                	cbPrintServer.requestFocus();
//                }
//            });
    }
}