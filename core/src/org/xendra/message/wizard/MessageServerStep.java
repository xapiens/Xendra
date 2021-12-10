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
package org.xendra.message.wizard;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.message.util.ResourceLoader;
import org.xendra.printdocument.PrintConstants;
import org.xendra.printdocument.wizard.PrintServer;
import org.compiere.util.Env;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;

public class MessageServerStep extends AbstractStep {
    protected DataModel data;
    protected JTextField nameTextField;
    protected JTextField addressTextField;
    protected JTextField accountNameTextField;    
    protected JComboBox cbPrintServer;
    private PO m_model;	
    
    public MessageServerStep(DataModel data) {
        super(ResourceLoader.getString("dialog", "messagewizard", "messageserver"),
        	  ResourceLoader.getString("dialog", "messagewizard",   "messageserver_description"));
        this.data = data;
        setCanGoNext(true);
    }

    protected JComponent createComponent() {    	
    	boolean IsSameEquipment = false;
    	JComponent component = new JPanel();
    	component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
    	component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "messagewizard", "messageserver_text")));
    	component.add(Box.createVerticalStrut(40));

    	WizardTextField middlePanel = new WizardTextField();

    	Method method = null;

    	LabelWithMnemonic psLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "messagewizard", "messageserver"));
    	cbPrintServer = new JComboBox();
    	psLabel.setLabelFor(cbPrintServer);               
		List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y'", null).list();
		for (X_A_Machine machine:machines)
		{
			//String status = IsAlive(machine);
			PrintServer psitem = new PrintServer();
			psitem.setA_Machine_ID(machine.getA_Machine_ID());
			psitem.setName(machine.getName());
			psitem.setMac_Address(machine.getMac_Address());
			//psitem.setMessage(status);
			IsSameEquipment = machine.getMac_Address().equals(Env.getMachine().getMac_Address());     				
			psitem.setSameEquipment(IsSameEquipment);
			cbPrintServer.addItem(psitem);        			    					
		}
		try {
			method = cbPrintServer.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {
		}			
		data.registerDataLookup(PrintConstants.PrintServer,new DefaultDataLookup(cbPrintServer, method, null));                    
		middlePanel.addTextField(cbPrintServer);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);    	    	
    	return component;
    }

//    private String IsAlive(X_A_Machine machine) {
//    	String status = "en linea";
//		try  
//		{
//			Socket socket = new Socket();
//			socket.connect(new InetSocketAddress(machine.getName(), 1099), 1000);
//			socket.close();
//			//Queue queue = (Queue) CConnection.get().lookup(machine.getName(),queuename);
//			QueueConnectionFactory cf = null;
//			cf = (QueueConnectionFactory) CConnection.get().lookup(machine.getName(), Constants.QConnectionFactory);
//			QueueConnection connection = cf.createQueueConnection();
//			connection.start();
//			QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
//			ClientSession coreSession = ((HornetQSession)session).getCoreSession();
//			//coreSession.setSendAcknowledgementHandler(this);
//			connection.close();			
//		}
//		catch (Exception e)
//		{				
//			status = e.getMessage();
//		}
//		return status;
//	}

	public void prepareRendering() {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	cbPrintServer.requestFocus();
                }
            });
    }
}