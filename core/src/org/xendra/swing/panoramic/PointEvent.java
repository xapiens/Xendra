package org.xendra.swing.panoramic;

import java.awt.event.ActionEvent;


public class PointEvent extends ActionEvent {

	public PointEvent(Object source, int id, String command) {
		super(source, id, command);	
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
