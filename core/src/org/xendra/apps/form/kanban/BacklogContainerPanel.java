package org.xendra.apps.form.kanban;

import java.awt.Component;
import java.awt.dnd.DropTarget;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class BacklogContainerPanel extends JPanel {
	private int id;

	public BacklogContainerPanel(int id) {
		super();
		this.id = id;
		this.setTransferHandler(new FCPanelTransferHandler());
		this.setDropTarget(new DropTarget(BacklogContainerPanel.this,
				new FCPanelDropTargetListener(BacklogContainerPanel.this)));

		initComponents();
	}

	public int getId() {
		return id;
	}

	private void initComponents() {
		setLayout(null);
		setOpaque(false);
	}

	public void addFC(FCPanel panel) {
		this.add(panel);
	}


	public void removeFC(FCPanel panel) {
		this.remove(panel);
	}

	public List<FCData> getFCData() {
		List<FCData> fcList = new ArrayList<FCData>();
		Component[] components = getComponents();
		if(components.length == 0) {
			return fcList;
		}
		fcList = new ArrayList<FCData>();
		for (int indx = 0; indx < components.length; indx++) {
			if (components[indx] instanceof FCPanel) {
				FCPanel fcPanel = (FCPanel) components[indx];
				FCData fcData = new FCData(fcPanel.getFc(), fcPanel.getX(), fcPanel.getY());
				fcList.add(fcData);
			}
		}
		return fcList;
	}
}
