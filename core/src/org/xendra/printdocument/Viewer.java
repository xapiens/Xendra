package org.xendra.printdocument;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JButton;

import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ConfirmPanel;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.util.Env;
import org.xendra.printdocument.wizard.PrintServer;

public class Viewer extends JDialog implements ItemListener, ActionListener {
	private JComboBox cbPrintServer = new JComboBox();
	private JComboBox queuename = new JComboBox();
	ConfirmPanel confirmPanel = new ConfirmPanel(false, false, false, true, false, false, false);
	private PrintWorker m_pw;
	public Viewer(PrintWorker pw) {
		m_pw = pw;
		jbinit();
		configure();
		getContentPane().setLayout(new MigLayout("", "[grow][grow]", "[][][88.00,grow]"));
		
		JLabel lblNewLabel = new JLabel("Equipo");
		getContentPane().add(lblNewLabel, "cell 0 0,alignx trailing");
				
		getContentPane().add(cbPrintServer, "cell 1 0,growx");
		
		JLabel lblBandeja = new JLabel("Bandeja");
		getContentPane().add(lblBandeja, "cell 0 1,alignx trailing");
				
		getContentPane().add(queuename, "cell 1 1,growx");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "cell 0 2 2 1,grow");
		
		confirmPanel.addActionListener(this);
		
		JButton print = ConfirmPanel.createPrintButton(true);
		print.addActionListener(this);
		confirmPanel.addButton(print);
		
		panel.add(confirmPanel);
		AEnv.showCenterScreen(this);
	}
	private void jbinit() {
		cbPrintServer.addItemListener(this);
	}
	
    private void configure() {
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
		for (X_A_Machine machine:machines)
		{
			String status = IsAlive(machine);
			PrintServer psitem = new PrintServer();
			psitem.setA_Machine_ID(machine.getA_Machine_ID());
			psitem.setName(machine.getName());
			psitem.setMac_Address(machine.getMac_Address());
			psitem.setMessage(status);
			boolean IsSameEquipment = machine.getMac_Address().equals(Env.getMachine().getMac_Address());     				
			psitem.setSameEquipment(IsSameEquipment);
			cbPrintServer.addItem(psitem);        			    					
		}		
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
	/**1
	 * 	Test
	 * 	@param args args
	 */
	static public void main (String[] args)
	{
		
	}	//	main
	@Override
	public void itemStateChanged(ItemEvent event) {
        if (event.getStateChange() == ItemEvent.SELECTED) {
        	PrintServer psitem = (PrintServer) cbPrintServer.getSelectedItem();
        	queuename.removeAllItems();
    		List<X_A_MachinePrinter> printers = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_Machine_ID = ?", null)
    		.setParameters(psitem.getA_Machine_ID())
    		.list();
    		for (X_A_MachinePrinter printer:printers)
    		{
    			queuename.addItem(printer.getQueueName());
    		}    		        	
        }		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals(ConfirmPanel.A_OK))
		{
			dispose();
		}
		else if (cmd.equals(ConfirmPanel.A_PRINT))
		{
			PrintServer psitem = (PrintServer) cbPrintServer.getSelectedItem();
			X_A_Machine machine = new X_A_Machine(Env.getCtx(), psitem.getA_Machine_ID(), null);
			m_pw.setPrintServer(machine);
			m_pw.setQueueName((String) queuename.getModel().getSelectedItem());
			String error = m_pw.Print(PrintWorker.ReceiveJob);
			if (error.length() == 0)
			{
				dispose();
			}
			else
			{
				ADialog.error(0, this, "PrintError", error);
			}
		}		
	}

}
