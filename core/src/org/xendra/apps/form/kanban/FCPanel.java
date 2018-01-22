package org.xendra.apps.form.kanban;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.TransferHandler;


/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class FCPanel extends JPanel implements Transferable {
	private BackLogPanel parent;
	private Image image;
	private JLabel lblFC;
	private JTextArea textArea;
	private FeatureComponent fc;
	private JButton edit;

	public FCPanel(BackLogPanel backLogPanel, FeatureComponent fc) {
		super();
		this.parent = backLogPanel;
		lblFC = new JLabel();
		edit = new JButton();
		this.fc = fc;

		initComponents();

		this.addMouseListener(new MouseListener());
		this.setTransferHandler(new FCPanelTransferHandler());
		try {
			image = javax.imageio.ImageIO.read(new java.net.URL(getClass()
					.getResource("fcBackground.jpg"), "fcBackground.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public BackLogPanel getBacklogPanel() {
		return parent;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public FeatureComponent getFc() {
		return fc;
	}

	private void onEditClicked() {
		FCDialog fcDlg = null;
		try {
			fcDlg = new FCDialog(parent.getKanbanBoard(), fc.getId(), fc.getDescription(),
					fc.getBackLogID() - 1, parent.getKanbanBoard()
							.getBackLogNames());
			if (fcDlg.getResult() == FCDialog.CANCEL) {
				return;
			}
			if (fcDlg.getResult() == FCDialog.SAVE) {
				fc.setDescription(fcDlg.getDesc());
				textArea.setText(fcDlg.getDesc());
			}
			if (fcDlg.getResult() == FCDialog.DELETE) {
				parent.removeFC(this);
				parent.getKanbanBoard().validate();
				parent.getKanbanBoard().repaint();
			}
			parent.getKanbanBoard().saveBacklogContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initComponents() {
		lblFC.setText(fc.getId());
		lblFC.setFont(new Font("Serif", Font.BOLD, 10));

		textArea = new JTextArea(fc.getDescription());
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setVisible(true);
		textArea.setOpaque(false);
		
		edit.setText("Open");
		edit.setForeground(Color.BLUE);
		edit.setBorderPainted(false);
		edit.setContentAreaFilled(false);
		edit.setHorizontalAlignment(SwingConstants.LEFT);
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onEditClicked();
			}
		});
		this.setLayout(new BorderLayout(0, 0));
		this.add(lblFC, BorderLayout.NORTH);
		this.add(textArea, BorderLayout.CENTER);
		this.add(edit, BorderLayout.SOUTH);

		setBounds(5, 5, (int) (parent.getWidth()*.60), parent.getWidth() / 4);
		setBackground(Color.ORANGE);
		setOpaque(true);
	}

	public Object getTransferData(DataFlavor flavor) {

		DataFlavor dataFlavor = null;
		try {
			dataFlavor = KanbanBoard.getDataFlavor();
			if (dataFlavor != null && flavor.equals(dataFlavor)) {
				return FCPanel.this;
			}
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
		return null;
	}

	public DataFlavor[] getTransferDataFlavors() {

		DataFlavor[] dataFlavors = { null };
		try {
			dataFlavors[0] = KanbanBoard.getDataFlavor();
			return dataFlavors;
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
		return null;
	}

	public boolean isDataFlavorSupported(DataFlavor flavor) {

		DataFlavor[] flavors = { null };
		try {
			flavors[0] = KanbanBoard.getDataFlavor();
			for (DataFlavor f : flavors) {
				if (f.equals(flavor)) {
					return true;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
		return false;
	}
}

class MouseListener extends MouseAdapter {

	@Override()
	public void mousePressed(MouseEvent e) {
		JComponent c = (JComponent) e.getSource();
		TransferHandler handler = c.getTransferHandler();
		handler.exportAsDrag(c, e, TransferHandler.COPY);
	}
}
