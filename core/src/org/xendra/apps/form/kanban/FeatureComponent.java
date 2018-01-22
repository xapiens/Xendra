package org.xendra.apps.form.kanban;

import java.io.Serializable;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class FeatureComponent implements Serializable {
	private static final long serialVersionUID = -297304421750646894L;
	
	private String id;
	private int backLogID;
	private String description;
	
	public FeatureComponent(String id, int backLogID, String description) {
		this.id = id;
		this.backLogID = backLogID;
		this.description = description; 
	}

	public String getId() {
		return id;
	}

	public int getBackLogID() {
		return backLogID;
	}

	public String getDescription() {
		return description;
	}
	
	public void setBackLogID(int backLogID) {
		this.backLogID = backLogID;
	}

	public void setDescription(String description) {
		this.description= description ;
	}
	

}
