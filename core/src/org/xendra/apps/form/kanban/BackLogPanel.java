package org.xendra.apps.form.kanban;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.dnd.DropTarget;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class BackLogPanel extends JPanel {
	private JLabel lblBacklog;
	private BacklogContainerPanel panelContainer;
	private String panelName;
	private Image image;
	private KanbanBoard parent;
	private int backLogID;
	
	public BackLogPanel(String panelName, KanbanBoard kanbanBoard, int id) {
		super();
		this.panelName = panelName;
		this.parent = kanbanBoard;
		backLogID = id;
		String imageFileName = "evil_" + (backLogID%5) + ".png";
		System.out.println(imageFileName);
		ImageIcon icon = new ImageIcon(getClass().getResource(imageFileName));
		lblBacklog = new JLabel(panelName, icon, JLabel.LEFT);
		panelContainer = new BacklogContainerPanel(id);
		try {
			image = javax.imageio.ImageIO.read(new java.net.URL(getClass()
					.getResource("panel_background_2.png"),
					"panel_background_2.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		initComponents();

	}

	public void addFC(FeatureComponent fc) {
		FCPanel panel = new FCPanel(this, fc);
		addFC(panel);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
			// g.drawImage(image, 0, 0, null);
		}
	}

	public KanbanBoard getKanbanBoard() {
		return parent;
	}

	private void initComponents() {
		lblBacklog.setText(panelName);
		lblBacklog.setFont(new Font("Serif", Font.BOLD, 12));
		lblBacklog.setForeground(Color.WHITE);
		this.setLayout(new BorderLayout(0, 0));
		this.add(lblBacklog, BorderLayout.NORTH);
		this.add(panelContainer, BorderLayout.CENTER);
	}

	public void addFC(FCPanel panel) {
		panelContainer.addFC(panel);
	}

	public void removeFC(FCPanel panel) {
		panelContainer.removeFC(panel);
	}

	public void loadData(List<FCData> fcList) {
		for(FCData fcData: fcList) {
			if (fcData.getFc().getBackLogID() != backLogID) {
				// Data for other backlog containers.
				continue;
			}
			FCPanel panel = new FCPanel(this, fcData.getFc());
			panel.setBounds(fcData.getX(), fcData.getY(), panel.getWidth(), panel.getHeight());
			addFC(panel);
		}
	}

	public Collection<? extends FCData> getFCData() {
		return panelContainer.getFCData();
	}
}
