package org.xendra.apps.form.kanban;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class FCDialog extends JDialog {
	// Variables declaration
	private JPanel contentPane;
	// -----
	private JButton btnSave;
	private JPanel controlsPanel;
	// -----
	private JLabel lblID;
	private JLabel lblText;
	private JLabel lblBacklog;
	private JTextField textID;
	private JComboBox backlogNames;
	private JTextArea textDesc;
	private JScrollPane scrollText;
	private JPanel panel;
	// -----
	// End of variables declaration
	private JButton btnDelete;
	private JButton btnCancel;
	private int result = 0; 
	private String id;
	private String desc;
	private int backlogIndex;

	public static final int SAVE = 1;
	public static final int DELETE = 2;
	public static final int CANCEL = 0;
	
	public FCDialog(Frame w, List<String> backLogNames) {
		super(w);
		initializeComponent(backLogNames);
		initDialog(w);
	}

	public FCDialog(Frame w, String fc_id, String description, int backlogIndex,
			List<String> names) {
		super(w);
		initializeComponent(fc_id, description, backlogIndex, names);
		initDialog(w);
	}

	public int getResult() {
		return result;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public int getBacklogIndex() {
		return backlogIndex;
	}

	private void initializeComponent(String fc_id, String description,
			int backlogIndex, List<String> names) {
		initializeComponent(names);
		textID.setText(fc_id);
		textID.setEditable(false);
		textDesc.setText(description);
		backlogNames.setSelectedIndex(backlogIndex);
		backlogNames.setEnabled(false);
	}

	private void initializeComponent(List<String> names) {
		contentPane = (JPanel) this.getContentPane();
		// -----
		btnSave = new JButton();
		btnDelete = new JButton();
		btnCancel = new JButton();
		controlsPanel = new JPanel();
		// -----
		lblID = new JLabel();
		lblText = new JLabel();
		lblBacklog = new JLabel();
		textID = new JTextField();
		backlogNames = new JComboBox();
		textDesc = new JTextArea();
		scrollText = new JScrollPane();
		panel = new JPanel();
		// -----

		//
		// contentPane
		//
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(controlsPanel, BorderLayout.SOUTH);
		contentPane.add(panel, BorderLayout.CENTER);
		//
		// btnSave
		//
		btnSave.setIcon(new ImageIcon(getClass().getResource("save_button.png")));
		btnSave.setText("Save");
		btnSave.setBackground(Color.WHITE);
		btnSave.setOpaque(true);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textID.getText().trim().isEmpty() ||
						textDesc.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(FCDialog.this, "Please enter valid ID and Description.", "Save FC", JOptionPane.WARNING_MESSAGE);
					return;
				}
				result = SAVE;
				id = textID.getText().trim();
				desc = textDesc.getText().trim();
				backlogIndex = backlogNames.getSelectedIndex();
				setVisible(false);
				dispose();
			}
		});

		btnDelete.setIcon(new ImageIcon(
				getClass().getResource("delete_button.png")));
		btnDelete.setText("Delete");
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setOpaque(true);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(FCDialog.this, "Do you want to delete?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
				if (option != JOptionPane.YES_OPTION) {
					return;
				}
				result = DELETE;
				setVisible(false);
				dispose();
			}
		});

		btnCancel.setIcon(new ImageIcon(
				getClass().getResource("cancel_button.png")));
		btnCancel.setText("Cancel");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setOpaque(true);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = CANCEL;
				setVisible(false);
				dispose();
			}
		});

		controlsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		controlsPanel.add(btnSave, 0);
		controlsPanel.add(btnDelete, 1);
		controlsPanel.add(btnCancel, 2);
		controlsPanel.setBackground(new Color(255, 255, 255));

		lblID.setText("FC ID");
		lblText.setText("Description");
		lblBacklog.setText("Backlog Name");
		scrollText.setViewportView(textDesc);
		textDesc.setLineWrap(true);

		panel.setLayout(null);
		panel.setBackground(new Color(255, 255, 255));
		
		addComponent(panel, lblID, 11, 7, 96, 15);
		addComponent(panel, lblText, 9, 47, 102, 18);
		addComponent(panel, lblBacklog, 9, 121, 109, 18);
		addComponent(panel, textID, 117, 5, 205, 21);
		addComponent(panel, backlogNames, 117, 122, 205, 22);
		addComponent(panel, scrollText, 117, 49, 205, 57);
		
		for (String name: names) {
			backlogNames.addItem(name);
		}
		backlogNames.setSelectedIndex(0);

		this.setTitle("Feature Component");
		this.setLocation(new Point(10, 10));
		this.setSize(new Dimension(360, 260));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setModal(true);
	}

	private void initDialog(Frame w) {
		this.setResizable(false);
		this.setModal(true);
		this.setLocationRelativeTo(w);
		this.setVisible(true);
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container, Component c, int x, int y,
			int width, int height) {
		c.setBounds(x, y, width, height);
		container.add(c);
	}
}
