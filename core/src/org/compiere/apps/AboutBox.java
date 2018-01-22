/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.apps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.compiere.*;
import org.compiere.db.CConnection;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 *	About Dialog
 *
 *  @author 	Jorg Janke
 *  @version 	$Id: AboutBox.java 5236 2014-03-03 04:17:37Z xapiens $
 */
public final class AboutBox extends CDialog implements ActionListener
{
	/**
	 *	Constructor for modal about dialog
	 *  @param parent parent
	 */
	public AboutBox(JFrame parent)
	{
		super (parent, true);
		try
		{
			jbInit();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//
		labelVersion.setText(Xendra.MAIN_VERSION + " @ " + Xendra.DATE_VERSION);
		labelCopyright.setText(Xendra.COPYRIGHT);
		infoArea.setText(CLogMgt.getInfo(null).toString());
		people.setText(getpeople().toString());
		
		team.setIcon(new ImageIcon(AboutBox.class.getResource("/org/xendra/images/xendrateam.jpg")));
		people.setColumnHeaderView(team);
		//  create 5 pt border
		Dimension d = imageControl.getPreferredSize();
		imageControl.setPreferredSize(new Dimension(d.width+10, d.height+10));
		//
		AEnv.positionCenterWindow(parent, this);
	}	//	AWindow_AboutBox

	private StringBuffer getUpdate() {
		StringBuffer sb = new StringBuffer();
		sb.append("http://www.xendra.org/updatead").append(NL);
		return sb;
	}
	private StringBuffer getpeople() {
		StringBuffer sb = new StringBuffer();
		sb.append("Equipo:").append(NL).append(NL);
		sb.append("Daniela Arauco Lozada").append(NL);
		sb.append("Francisco J. Morosini Eguren").append(NL);		
		sb.append("Juan Damian Bernabe").append(NL);		
		sb.append("Gabriela Mendez Espinoza").append(NL).append(NL);
		sb.append("Colaboradores:").append(NL).append(NL);
		sb.append("Yolanda Eguren Heredia").append(NL);
		sb.append("Jean Pierre Chauny").append(NL);
		sb.append("Miler Suero").append(NL);
		sb.append("Carlos Arana").append(NL);
		sb.append("Roger Ulloa").append(NL);
		sb.append("Cesar Bernaola").append(NL);
		sb.append("Juan Cangahuala").append(NL);
		sb.append("Luis Enrique Alvarado").append(NL);
		sb.append("Erick Amaya Ordinola").append(NL);
		sb.append("Felix Gonzales Polar Zuzunaga").append(NL);
		sb.append("Luis Perez Treviño").append(NL);
		sb.append("Christian Palacios").append(NL);
		sb.append("Santiago Gonzales").append(NL);
		sb.append("Antonio Ognio").append(NL);
		sb.append("Cesar Luis Molina").append(NL);
		sb.append("Rudy Godoy").append(NL);
		sb.append("Otto Neustadl").append(NL);
		sb.append("Silvia Mendez").append(NL);
		sb.append("Universidad Garcilaso de la Vega").append(NL);
		sb.append("Universidad Catolica del Peru").append(NL);
		sb.append("Universidad los Angeles de Chimbote").append(NL);
		sb.append("Universidad Continental").append(NL);
		sb.append("Universidad Nacional del Callao").append(NL);
		sb.append("Universidad Tecnológica de los Andes").append(NL);
		sb.append("TUXPUC (Usuarios Linux de la PUCP)").append(NL);
		sb.append("COSOLIG (Comunidad de software libre garcilasina)").append(NL);
		sb.append("AQPGLUG (Arequipa Linux User Group)").append(NL);
		sb.append("PLUG (Peruvian Linux User Group)").append(NL);
		sb.append("Proyecto Adempiere").append(NL);
		sb.append("Proyecto Compiere").append(NL);
		sb.append("Proyecto lpdspooler").append(NL);
		return sb;
	}
	
	private static final String NL = System.getProperty("line.separator");
	private CPanel panel = new CPanel();
	private CPanel mainPanel = new CPanel();
	private JLabel imageControl = new JLabel();
	private JLabel labelHeading = new JLabel();
	private JLabel labelVersion = new JLabel();
	private JLabel labelCopyright = new JLabel();
	private JLabel labelDescription = new JLabel();
	private BorderLayout panelLayout = new BorderLayout();
	private BorderLayout mainLayout = new BorderLayout();
	private BorderLayout peopleLayout = new BorderLayout();
	private CPanel northPanel = new CPanel();
	private CPanel headerPanel = new CPanel();
	private GridLayout headerLayout = new GridLayout();
	private CTextArea infoArea = new CTextArea();
	private BorderLayout northLayout = new BorderLayout();
	private ConfirmPanel confirmPanel = new ConfirmPanel(false);
	private CTabbedPane tabbedPane = new CTabbedPane();
	private CPanel communityPanel = new CPanel();
	private CTextArea people = new CTextArea();
	JLabel team = new JLabel();
	/**
	 *	Init
	 *  @throws Exception
	 */
	private void jbInit() throws Exception
	{
		this.setTitle(Msg.translate(Env.getCtx(), "About"));
		//
		setResizable(false);
		labelHeading.setFont(new java.awt.Font("Dialog", 1, 14));
		labelHeading.setHorizontalAlignment(SwingConstants.CENTER);
		labelHeading.setHorizontalTextPosition(SwingConstants.CENTER);
		labelHeading.setText(" Smart ERP & CRM Business Solution ");
		labelVersion.setHorizontalAlignment(SwingConstants.CENTER);
		labelVersion.setHorizontalTextPosition(SwingConstants.CENTER);
		labelVersion.setText(".");
		labelCopyright.setHorizontalAlignment(SwingConstants.CENTER);
		labelCopyright.setHorizontalTextPosition(SwingConstants.CENTER);
		labelCopyright.setText(".");
		labelDescription.setForeground(Color.blue);
		labelDescription.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescription.setHorizontalTextPosition(SwingConstants.CENTER);
		labelDescription.setText(Xendra.getURL());
		//
		imageControl.setFont(new java.awt.Font("Serif", 2, 10));
		imageControl.setForeground(Color.blue);
		imageControl.setAlignmentX((float) 0.5);
		imageControl.setHorizontalAlignment(SwingConstants.CENTER);
		imageControl.setHorizontalTextPosition(SwingConstants.CENTER);
		/** Removing/modifying the Xendra copyright notice is a violation of the license	*/
		imageControl.setIcon(Xendra.getImageIconLogo());
		imageControl.setText(Xendra.getSubtitle());
		imageControl.setVerticalTextPosition(SwingConstants.BOTTOM);
		//
		mainPanel.setLayout(mainLayout);
		mainLayout.setHgap(10);
		mainLayout.setVgap(10);
		northPanel.setLayout(northLayout);
		northLayout.setHgap(10);
		northLayout.setVgap(10);
		panel.setLayout(panelLayout);
		panelLayout.setHgap(10);
		panelLayout.setVgap(10);
		headerPanel.setLayout(headerLayout);
		headerLayout.setColumns(1);
		headerLayout.setRows(4);
		//
		infoArea.setReadWrite(false);

		this.getContentPane().add(tabbedPane, null);
		tabbedPane.add(panel, Msg.getMsg(Env.getCtx(), "About"));
		panel.add(northPanel, BorderLayout.NORTH);
		northPanel.add(imageControl, BorderLayout.WEST);
		northPanel.add(headerPanel, BorderLayout.CENTER);
		headerPanel.add(labelHeading, null);
		headerPanel.add(labelCopyright, null);
		headerPanel.add(labelVersion, null);
		headerPanel.add(labelDescription, null);
		panel.add(mainPanel, BorderLayout.CENTER);
		mainPanel.add(infoArea, BorderLayout.CENTER);
		mainPanel.add(confirmPanel, BorderLayout.SOUTH);
		confirmPanel.addActionListener(this);
		tabbedPane.add(communityPanel , Msg.getMsg(Env.getCtx(), "Agradecimientos"));
		people.setReadWrite(false);
		communityPanel.setLayout(peopleLayout);
		peopleLayout.setHgap(10);
		peopleLayout.setVgap(10);
		communityPanel.add(people, BorderLayout.CENTER);
	}   //  jbInit

	
	/**
	 *	ActionListener
	 *  @param e event
	 */
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals(ConfirmPanel.A_OK))
			dispose();
	}   //  actionPerformed
}	//	AboutBox
