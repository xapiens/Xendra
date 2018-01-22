package org.xendra.apps.form.kanban;

import java.io.Serializable;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class FCData implements Serializable {
	private FeatureComponent fc;
	private  int x;
	private int y;
	
	public FCData(FeatureComponent fc, int x, int y) {
		this.fc = fc;
		this.x = x;
		this.y = y;
	}

	public FeatureComponent getFc() {
		return fc;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
