package org.columba.core.gui.processmanager.folder;

import java.util.HashMap;

import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.util.TableProperties;

public class MachineServerNode extends ProcessNode {
	int A_MachineServer_ID;	
	private String ServerType;
	public MachineServerNode(X_A_MachineServer machineserver) {
		TableProperties props = new TableProperties(machineserver.getProperties());
		Integer A_Machine_ID = props.getInteger(X_A_Machine.COLUMNNAME_A_Machine_ID);
		if (A_Machine_ID != null) {
			setA_Machine_ID(A_Machine_ID);		
			setA_MachineServer_ID(machineserver.getA_MachineServer_ID());
			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(A_Machine_ID).first();
			setName(machine.getName());
		}
		setServerType(machineserver.getServerType());
		setTableName(machineserver.get_TableName());
		setRecord_ID(machineserver.get_ID());	
		setActive(machineserver.isActive());
		setA_MachineServer_ID(machineserver.getA_MachineServer_ID());
	}
	public String toString () {
		X_AD_Reference ref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier = ?", null)
		.setParameters(REF_ServerType.Identifier).first();
		X_AD_Ref_List item = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ? AND Value = ?", null)
		.setParameters(ref.getAD_Reference_ID(), getServerType()).first();
		if (item != null)
		{
			return item.getName();
		}
		return "";
	}

	public int getA_MachineServer_ID() {
		return A_MachineServer_ID;
	}
	public void setA_MachineServer_ID(int a_MachineServer_ID) {
		A_MachineServer_ID = a_MachineServer_ID;
	}

	public void setServerType(String value) {
		ServerType = value;
	}
	public String getServerType() {
		return ServerType;
	}	
}
