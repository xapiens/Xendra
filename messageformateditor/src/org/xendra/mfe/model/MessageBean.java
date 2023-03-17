package org.xendra.mfe.model;

public class MessageBean {
	String name;
	String QueueName;	
	boolean lockout;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getQueueName() {
		return QueueName;
	}
	public void setQueueName(String queueName) {
		QueueName = queueName;
	}
	public boolean isLockout() {
		return lockout;
	}
	public void setLockout(boolean lockout) {
		this.lockout = lockout;
	}
}
