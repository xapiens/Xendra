package org.xendra.chat;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import org.compiere.swing.CTabbedPane;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Poller;
import org.zeromq.ZMQ.Socket;

public class Client extends JDialog  {
	private static Client instance;
	private CTabbedPane maintab;
	private JEditorPane editor;	
	public Client() {
		super((JFrame) null, "chat", false);
		initSockets();
		initComponents();
		pack();
		setLocationRelativeTo(null);
	}

	private void initSockets() {	
	}

	private void initComponents() {
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));		
		maintab = new CTabbedPane(JTabbedPane.TOP);
		mainPanel.add(maintab, BorderLayout.NORTH);		
		getContentPane().add(mainPanel);
		editor = new JEditorPane();
		editor.setText("");
		JScrollPane editorscroll = new JScrollPane(editor);
		maintab.addTab("pendiente", null, editorscroll, null);		
	}
	public static Client getInstance() {
		if (instance == null) {
			instance = new Client();
		}
		if (!instance.isVisible()) {
			instance.setVisible(true);
		}
		instance.toFront();
		return instance;		
	}
}
