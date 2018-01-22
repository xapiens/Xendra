package org.xendra.printdocument.wizard;

public class PrintServer {
	private String name = "";
	private String Mac_Address = "";
	private String Message = "";
	private int A_Machine_ID = 0;
	private boolean SameEquipment = false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA_Machine_ID() {
		return A_Machine_ID;
	}
	public void setA_Machine_ID(int a_Machine_ID) {
		A_Machine_ID = a_Machine_ID;
	}	
	public String getMac_Address() {
		return Mac_Address;
	}
	public void setMac_Address(String mac_Address) {
		Mac_Address = mac_Address;
	}	
	public boolean isSameEquipment() {
		return SameEquipment;
	}
	public void setSameEquipment(boolean sameEquipment) {
		SameEquipment = sameEquipment;
	}	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		if (isSameEquipment())
			builder.append("local");
		else
			builder.append("remote");
		builder.append(" - ").append(getName()).append(" - ").append(getMac_Address()).append(" ");
		builder.append(getMessage());
		return builder.toString();
	}
}
