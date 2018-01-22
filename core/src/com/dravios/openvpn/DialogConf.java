package com.dravios.openvpn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import net.miginfocom.swing.MigLayout;

public class DialogConf extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField fopenvpn;
	private JTextField fConfigFile;
	private JButton btnopenvpn;
	private JButton btnConfigFile;
	private config m_config;
	private JSpinner sAdminPort;
	private JButton btnSave;
	private JButton btnCancel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField fuser;
	private JTextField fpwd;
	private JLabel lblNewLabel_5;
	private JTextField fcmd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogConf frame = new DialogConf();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void dispose()
	{
		setVisible(false);
	}
	/**
	 * Create the frame.
	 */
	public DialogConf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[175px][203px][49px]", "[25px][25px][20px][19px][19px][19px][51px][25px]"));

		JLabel lblNewLabel_1 = new JLabel("OpenVPN");
		panel.add(lblNewLabel_1, "cell 0 0,alignx right,aligny center");

		fopenvpn = new JTextField();
		panel.add(fopenvpn, "cell 1 0,grow");
		fopenvpn.setColumns(10);

		btnopenvpn = new JButton("...");
		btnopenvpn.addActionListener(this);
		panel.add(btnopenvpn, "cell 2 0,alignx center,aligny center");

		JLabel lblNewLabel = new JLabel("Archivo de configuración");
		panel.add(lblNewLabel, "cell 0 1,alignx right,aligny center");

		fConfigFile = new JTextField();
		panel.add(fConfigFile, "cell 1 1,grow");
		fConfigFile.setColumns(10);

		btnConfigFile = new JButton("...");
		btnConfigFile.addActionListener(this);
		panel.add(btnConfigFile, "cell 2 1,alignx center,aligny center");

		JLabel lblNewLabel_2 = new JLabel("Puerto de adminstración");
		panel.add(lblNewLabel_2, "cell 0 2,alignx right,aligny center");
		
		sAdminPort = new JSpinner();
		sAdminPort.setModel(new SpinnerNumberModel(9000, 1, 65535, 1));
		panel.add(sAdminPort, "cell 1 2,grow");
		
		lblNewLabel_3 = new JLabel("Usuario");
		panel.add(lblNewLabel_3, "cell 0 3,alignx right,aligny center");
		
		fuser = new JTextField();
		panel.add(fuser, "cell 1 3,grow");
		fuser.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Password");
		panel.add(lblNewLabel_4, "cell 0 4,alignx right,aligny center");
		
		fpwd = new JTextField();
		panel.add(fpwd, "cell 1 4,grow");
		fpwd.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Comando");
		panel.add(lblNewLabel_5, "cell 0 5,alignx right,aligny center");
		
		fcmd = new JTextField();
		panel.add(fcmd, "cell 1 5,grow");
		fcmd.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 1 6,grow");

		btnSave = new JButton("Guardar");
		btnSave.addActionListener(this);
		panel.add(btnSave, "cell 0 7,alignx center,aligny center");

		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(this);
		panel.add(btnCancel, "cell 1 7,alignx center,aligny center");
	}

	/**
	 * Set Path in Field
	 * 
	 * @param field
	 *            field to set Path
	 */
	private void setPath(JTextField field) {
		JFileChooser fc = new JFileChooser(field.getText());
		fc.setDialogType(JFileChooser.OPEN_DIALOG);
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setMultiSelectionEnabled(false);
		fc.setDialogTitle(field.getToolTipText());
		if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
			field.setText(fc.getSelectedFile().getAbsolutePath());
	} // setPath

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnopenvpn))
				setPath(fopenvpn);
		else if (e.getSource().equals(btnConfigFile))
			setPath(fConfigFile);
		else if (e.getSource().equals(btnSave))
		{
			if (m_config != null)
			{
				m_config.setConfigFile(fConfigFile.getText());
				m_config.setOpenVPNDir(fopenvpn.getText());
				m_config.setManagementPort((Integer) sAdminPort.getValue());
				m_config.setUser(fuser.getText());
				m_config.setpwd(fpwd.getText());
				m_config.setcmd(fcmd.getText());
				m_config.save();
			}	
			setVisible(false);
		}
		else if (e.getSource().equals(btnCancel))
		{
			setVisible(false);
		}
	}

	public void setConfig(config Config) {
		m_config = Config;
		fConfigFile.setText(m_config.getConfigFile());
		fopenvpn.setText(m_config.getOpenVPNDir());
		sAdminPort.setValue(m_config.getManagementPort());
		fuser.setText(m_config.getUser());
		fpwd.setText(m_config.getpwd());
		fcmd.setText(m_config.getcmd());
	}
}
