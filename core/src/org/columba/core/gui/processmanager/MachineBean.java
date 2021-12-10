package org.columba.core.gui.processmanager;

public class MachineBean {
	String trash;
	String plugins;
	String reports;
	String xendrian;
	String installed;
	String replication;
	String Mac_Address;
	String Name;
	String xendrastore;
	Boolean Lockout;
	public String getTrash() {
		return trash;
	}
	public void setTrash(String trash) {
		this.trash = trash;
	}
	public String getPlugins() {
		return plugins;
	}
	public void setPlugins(String plugins) {
		this.plugins = plugins;
	}
	public String getReports() {
		return reports;
	}
	public void setReports(String reports) {
		this.reports = reports;
	}
	public String getXendrian() {
		return xendrian;
	}
	public void setXendrian(String xendrian) {
		this.xendrian = xendrian;
	}
	public String getInstalled() {
		return installed;
	}
	public void setInstalled(String installed) {
		this.installed = installed;
	}
	public String getReplication() {
		return replication;
	}
	public void setReplication(String replication) {
		this.replication = replication;
	}	
	public String getXendrastore() {
		return xendrastore;
	}
	public void setXendrastore(String xendrastore) {
		this.xendrastore = xendrastore;
	}
	//	public String getStore() {
//		return store;
//	}
//	public void setStore(String store) {
//		this.store = store;
//	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Boolean getLockout() {
		return Lockout;
	}
	public void setLockout(Boolean lockout) {
		Lockout = lockout;
	}
	public String getMac_Address() {
		return Mac_Address;
	}
}
