/**
 * This is the main class of the application.
 */
package org.xendra.apps.form.kanban;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class KanbanBoard extends JFrame {
	private JPanel contentPane;
	private JPanel backlogPanelContainer;
	private List<BackLogPanel> backLogPanels;
	private List<String> backLogNames;

	private static DataFlavor dataFlavor = null;
	private DataStorage dataStorage;
	private static boolean unsavedChanges = false;

	public KanbanBoard() {
		super();
		dataStorage = new FileDataStorage();
		backLogNames = new ArrayList<String>();
		initializeBacklogNames();
		initializeComponent();
		createMenuBar();
		//
		// Enable the below line if tool bar is required.
		// createToolBar();
		this.setVisible(true);
		// Set the window as maximized
		this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		// Load data from the data source if available.
		loadSavedData();
	}

	public List<String> getBackLogNames() {
		return backLogNames;
	}

	
	public static boolean isUnsavedChanges() {
		return unsavedChanges;
	}

	public static void setUnsavedChanges(boolean changes) {
		unsavedChanges = changes;
	}
	
	/**
	 * Read the DnD flavor supported by this application.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static DataFlavor getDataFlavor() throws Exception {
		if (dataFlavor == null) {
			dataFlavor = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType
					+ ";class=com.nsn.ratheesh.tools.kb.gui.FCPanel");
		}
		return dataFlavor;
	}

	private void initializeBacklogNames() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"BacklogNames.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				if (!line.startsWith("//")) {
					backLogNames.add(line);
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		if (backLogNames.size() == 0) {
			// Initialize with default values.
			backLogNames.add("PO Backlog");
			backLogNames.add("Analysis Backlog");
			backLogNames.add("Scrum Team");
			backLogNames.add("PrV Backlog");
			backLogNames.add("NeVe Backlog");
		}
	}

	private void loadSavedData() {
		List<FCData> fcList = dataStorage.loadFCData();
		for (BackLogPanel backLogPanel : backLogPanels) {
			backLogPanel.loadData(fcList);
		}
		validate();
		repaint();
	}

	private void createToolBar() {
		JToolBar toolbar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
		JButton button = new JButton(new ImageIcon(getClass().getResource(
				"backlog_new.png")));
		toolbar.add(button);
		button = new JButton(new ImageIcon(getClass().getResource(
				"help_about.png")));
		toolbar.add(button);
		this.getContentPane().add(toolbar, BorderLayout.NORTH);
	}

	private void createMenuBar() {
		// Creates a menubar for a JFrame
		JMenuBar menuBar = new JMenuBar();
		// Add the menubar to the frame
		setJMenuBar(menuBar);
		// Define and add two drop down menu to the menubar
		JMenu backlogMenu = new JMenu("Backlog");
		menuBar.add(backlogMenu);
		// Create and add simple menu item to one of the drop down menu
		ImageIcon icon = new ImageIcon(getClass()
				.getResource("backlog_new.png"));
		JMenuItem newAction = new JMenuItem("New", icon);
		newAction.setBackground(Color.WHITE);
		backlogMenu.add(newAction);
		newAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addFCToBacklog();
			}
		});

		icon = new ImageIcon(getClass().getResource("backlog_save.png"));
		JMenuItem saveAction = new JMenuItem("Save", icon);
		backlogMenu.add(saveAction);
		saveAction.setBackground(Color.WHITE);
		saveAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveBacklogContent();
			}
		});

		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		icon = new ImageIcon(getClass().getResource("help_about.png"));
		JMenuItem about = new JMenuItem("About", icon);
		about.setBackground(Color.WHITE);
		helpMenu.add(about);
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AboutDialog(KanbanBoard.this);
			}
		});
	}

	private void addFCToBacklog() {
		try {
			FCDialog fcDlg = new FCDialog(null, backLogNames);
			if (fcDlg.getResult() != FCDialog.SAVE) {
				return;
			}
			FeatureComponent fc = new FeatureComponent(fcDlg.getId(), 1,
					fcDlg.getDesc());
			backLogPanels.get(fcDlg.getBacklogIndex()).addFC(fc);
			validate();
			repaint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void saveBacklogContent() {
		List<FCData> fcData = new ArrayList<FCData>();
		for (BackLogPanel backLogPanel : backLogPanels) {
			fcData.addAll(backLogPanel.getFCData());
		}
		dataStorage.saveFCData(fcData);
		KanbanBoard.setUnsavedChanges(false);
	}

	private void initializeComponent() {
		contentPane = (JPanel) this.getContentPane();
		backLogPanels = new ArrayList<BackLogPanel>();
		backlogPanelContainer = new JPanel();
		for (int indx = 0; indx < backLogNames.size(); indx++) {
			BackLogPanel panel = new BackLogPanel(backLogNames.get(indx), this,
					indx + 1);
			backLogPanels.add(panel);
		}
		// createPanel("  Backlog");
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		for (BackLogPanel panel : backLogPanels) {
			addComponent(contentPane, panel);
		}
		// addComponent(contentPane, panelOne);
		// addComponent(contentPane, panelTwo);
		// addComponent(contentPane, panelThree);
		// addComponent(contentPane, panelFour);
		// addComponent(contentPane, panelFive);

		// backlogPanelContainer.setLayout(new BoxLayout(backlogPanelContainer,
		// BoxLayout.X_AXIS));
		// addComponent(backlogPanelContainer, panelOne);
		// addComponent(backlogPanelContainer, panelTwo);
		// addComponent(backlogPanelContainer, panelThree);
		// addComponent(backlogPanelContainer, panelFour);
		// addComponent(backlogPanelContainer, panelFive);
		// contentPane.add(backlogPanelContainer,BorderLayout.CENTER);

		//
		// KanbanBoard
		//
		this.setTitle("B . F . K . B");
		ImageIcon icon = new ImageIcon(getClass().getResource("title.png"));
		this.setIconImage(icon.getImage());
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(1129, 815));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if(!isUnsavedChanges()) {
					System.exit(0);
				}
				int option = JOptionPane.showConfirmDialog(KanbanBoard.this, "There are unsaved changes. " +
						"Do you want to save the changes?", "Close Confirmation", JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					saveBacklogContent();
					System.exit(0);
				}
			}
		});

	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container, Component c) {
		// c.setBounds(x,y,width,height);
		container.add(c);
	}

	// ============================= Testing ================================//
	// = =//
	// = The following main method is just for testing this class you built.=//
	// = After testing,you may simply delete it. =//
	// ======================================================================//
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception ex) {
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new KanbanBoard();
	}
	// = End of Testing =

}
