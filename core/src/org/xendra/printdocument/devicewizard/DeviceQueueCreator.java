package org.xendra.printdocument.devicewizard;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_A_PrinterDriver;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.printdocument.PrintConstants;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class DeviceQueueCreator implements WizardModelListener {

	private DataModel data;

	public DeviceQueueCreator(DataModel data) {
		this.data = data;
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
	public void wizardFinished(WizardModelEvent e) {
		String devicename = (String) data.getData("devicename");
		String queuename = (String) data.getData("queuename");
		X_A_PrinterDriver driver = (X_A_PrinterDriver) data.getData(PrintConstants.PrintDriver);
		//
//		String where = "mac_address = ?";		
//		X_A_Machine machine = null;
		X_A_MachinePrinter printer = null;
//		String macaddress = Util.getLocalMacAddress();
//		machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
//		.setParameters(macaddress).first();
//		if (machine == null)
//		{
//			machine = new X_A_Machine(Env.getCtx(), 0, null);
//			//machine.setC_POS_ID(posmodel.getC_POS_ID());
//			machine.setAD_Org_ID(0);
//			machine.set_ValueOfColumn(Constants.COLUMNNAME_AD_Client_ID, 0);
//			machine.setName(Util.getLocalHostName());
//			machine.setMac_Address(Util.getLocalMacAddress());
//			machine.save();			
//		}
		String where = "A_Machine_ID = ? AND DeviceName = ?";
		printer = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, where, null)
		.setParameters(Env.getMachine().getA_Machine_ID(), devicename).first();
		if (printer == null)
		{
			printer = new X_A_MachinePrinter(Env.getCtx(), 0, null);
			printer.setA_Machine_ID(Env.getMachine().getA_Machine_ID());
			printer.setDeviceName(devicename);
		}		
		printer.setA_PrinterDriver_ID(driver.getA_PrinterDriver_ID());
		printer.setQueueName(queuename);		
		printer.setIsActive(true);
		printer.save();
	}

	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}
}