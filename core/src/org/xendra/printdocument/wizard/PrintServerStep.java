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
package org.xendra.printdocument.wizard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.Constants;
import org.xendra.printdocument.PrintConstants;
import org.xendra.printdocument.PrintWorker;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.compiere.model.Machine;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;

public class PrintServerStep extends AbstractStep {
    protected DataModel data;
    protected JTextField nameTextField;
    protected JTextField addressTextField;
    protected JTextField accountNameTextField;    
    protected JComboBox cbPrintServer;
    private PO m_model;	
    
    public PrintServerStep(DataModel data) {
        super(PrintResourceLoader.getString("dialog", "machinewizard", "printserver"),
        	  PrintResourceLoader.getString("dialog", "machinewizard",   "printserver_description"));
        this.data = data;       
        setCanGoNext(true);
    }

    protected JComponent createComponent() {    	
    	boolean IsSameEquipment = false;
    	JComponent component = new JPanel();
    	component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
    	component.add(new MultiLineLabel(PrintResourceLoader.getString("dialog", "machinewizard", "printserver_text")));
    	component.add(Box.createVerticalStrut(40));

    	WizardTextField middlePanel = new WizardTextField();

    	Method method = null;

    	LabelWithMnemonic psLabel = new LabelWithMnemonic(PrintResourceLoader.getString("dialog", "machinewizard", "printserver"));
    	cbPrintServer = new JComboBox();
    	psLabel.setLabelFor(cbPrintServer);               
    	//X_A_Machine machinemodel = null;
    	if (m_model == null)        
    		m_model = (PO) data.getData(Constants.Model);
    	if (m_model == null)
    	{
    		middlePanel.addTextField(new JLabel("debe seleccionar un equipo"));        			
    		middlePanel.addEmptyExample();
    		component.add(middlePanel);        	
    		setCanGoNext(false);
    	}
    	else
    	{    	
    		List<X_A_Machine> machines = new ArrayList<X_A_Machine>();
    		List<X_A_MachinePrinter> printers = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "IsActive = 'Y'", null).list();
    		for (X_A_MachinePrinter printer:printers)
    		{
    			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
    				.setParameters(printer.getA_Machine_ID()).first();
    			if (machine != null && !machines.contains(machine))
    			{
    				machines.add(machine);
    			}
    		}    		
    		int A_Machine_ID = m_model.get_ValueAsInt(X_A_Machine.COLUMNNAME_A_Machine_ID);
    		if (A_Machine_ID > 0)
    		{
	    		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
	    			.setParameters(A_Machine_ID).first();
    			if (machine != null && !machines.contains(machine))
    			{
    				machines.add(machine);
    			}	    		
    		}
    		for (X_A_Machine machine:machines)
    		{
    			String status = IsAlive(machine);
				PrintServer psitem = new PrintServer();
				psitem.setA_Machine_ID(machine.getA_Machine_ID());
				psitem.setName(machine.getName());
				psitem.setMac_Address(machine.getMac_Address());
				psitem.setMessage(status);
				IsSameEquipment = machine.getMac_Address().equals(Env.getMachine().getMac_Address());     				
				psitem.setSameEquipment(IsSameEquipment);
				cbPrintServer.addItem(psitem);        			    					
    		}
    	}
		try {
			method = cbPrintServer.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			
		data.registerDataLookup(PrintConstants.PrintServer,new DefaultDataLookup(cbPrintServer, method, null));                    
		middlePanel.addTextField(cbPrintServer);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);    	    	
    	return component;
    }

    private String IsAlive(X_A_Machine machine) {
    	String errorconnection = "en linea";
		try  
		{
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(machine.getName(), PrintConstants.port), 1000);
			PrintWorker obj = new PrintWorker();        				
			obj.setCommand(PrintWorker.IsAlive);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(obj);
			int x = in.read();
			in.close();
			oos.close();																		            	
		}
		catch (Exception e)
		{				
			errorconnection = e.getMessage();
		}
		return errorconnection;
	}

	public void prepareRendering() {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	cbPrintServer.requestFocus();
                }
            });
    }
}