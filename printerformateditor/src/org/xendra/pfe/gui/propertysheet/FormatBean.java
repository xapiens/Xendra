package org.xendra.pfe.gui.propertysheet;

import org.compiere.util.NamePair;

public class FormatBean {
	String name;
	String description;
	NamePair C_PrinterFormatType;
	NamePair A_PrinterDriver_ID;
	NamePair EntityType;
	Boolean Lockout;
	String Lines;
	String Columns;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public NamePair getC_PrinterFormatType() {
		return C_PrinterFormatType;
	}
	public void setC_PrinterFormatType(NamePair c_PrinterFormatType) {
		C_PrinterFormatType = c_PrinterFormatType;
	}
	public Boolean getLockout() {
		return Lockout;
	}
	public void setLockout(Boolean lockout) {
		Lockout = lockout;
	}
	public String getLines() {
		return Lines;
	}
	public void setLines(String lines) {
		Lines = lines;
	}
	public NamePair getA_PrinterDriver_ID() {
		return A_PrinterDriver_ID;
	}
	public void setA_PrinterDriver_ID(NamePair a_PrinterDriver_ID) {
		A_PrinterDriver_ID = a_PrinterDriver_ID;
	}
	public String getColumns() {
		return Columns;
	}
	public void setColumns(String columns) {
		Columns = columns;
	}
	public NamePair getEntityType() {
		return EntityType;
	}
	public void setEntityType(NamePair entityType) {
		EntityType = entityType;
	}	
}
