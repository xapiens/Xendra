package org.xendra.pos.wizard;

import java.util.ArrayList;
import java.util.List;

import org.compiere.model.MachinePrinter;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.util.Env;

public class Util {

	public static List<MachinePrinter> getPrinters()
	{
		List<X_A_MachinePrinter> allprinters = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "IsActive = 'Y' " , null).list();
		List<MachinePrinter> printers = new ArrayList<MachinePrinter>();
		for (X_A_MachinePrinter printer:allprinters)
		{			
			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(printer.getA_Machine_ID()).first();
			if (machine != null)
			{
				MachinePrinter maprinter = new MachinePrinter(Env.getCtx(), printer.getA_MachinePrinter_ID(), null);
				if (maprinter != null)
				{
					printers.add(maprinter);
				}
			}			
		}      
		return printers;
	}
}
