package org.xendra.console;

import java.sql.Timestamp;

public class BIQuery {
	String name;
	String description;
	String downloadurl;
	Timestamp Synchronized;
	Timestamp installed;	
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
	public String getDownloadurl() {
		return downloadurl;
	}
	public void setDownloadurl(String downloadurl) {
		this.downloadurl = downloadurl;
	}
	public Timestamp getSynchronized() {
		return Synchronized;
	}
	public void setSynchronized(Timestamp synchronized1) {
		Synchronized = synchronized1;
	}
	public Timestamp getInstalled() {
		return installed;
	}
	public void setInstalled(Timestamp installed) {
		this.installed = installed;
	}
}
