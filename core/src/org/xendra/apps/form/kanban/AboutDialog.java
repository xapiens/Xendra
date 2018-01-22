package org.xendra.apps.form.kanban;

import java.awt.*;

import javax.swing.*;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class AboutDialog extends JDialog
{
	// Variables declaration
	private JLabel jLabel1;
	private JPanel contentPane;
	//-----
	private JLabel lblName;
	private JLabel lblID;
	private JLabel lblAddress;
	private JPanel panel;
	//-----
	// End of variables declaration


	public AboutDialog(Frame w)
	{
		super(w);
		initializeComponent();
		this.setLocationRelativeTo(w);
		this.setVisible(true);
	}

	private void initializeComponent()
	{
		jLabel1 = new JLabel();
		contentPane = (JPanel)this.getContentPane();
		//-----
		lblName = new JLabel();
		lblID = new JLabel();
		lblAddress = new JLabel();
		panel = new JPanel();
		//-----

		jLabel1.setIcon(new ImageIcon(getClass().getResource("Help.png")));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(jLabel1, BorderLayout.WEST);
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.setBackground(new Color(255, 255, 255));
		
		lblName.setText("B.F. Kanban. Board");
		lblName.setFont(new Font("Serif", Font.BOLD, 14));
		lblID.setText("Ratheesh.Ravindran@gmail.com");
		lblID.setFont(new Font("Serif", Font.BOLD, 12));
		
		lblAddress.setText("crashingnhanging.blogspot.com");
		lblAddress.setFont(new Font("Serif", Font.BOLD, 12));

		panel.setLayout(null);
		panel.setBackground(new Color(255, 255, 255));
		
		addComponent(panel, lblName, 25,16,166,29);
		addComponent(panel, lblID, 25,59,225,23);
		addComponent(panel, lblAddress, 25,103,218,18);

		this.setTitle("About");
		this.setLocation(new Point(10, 10));
		this.setSize(new Dimension(394, 193));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setModal(true);
		this.setResizable(false);
	}

	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}
}
