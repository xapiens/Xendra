package org.xendra.transfer;
/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2009 Dravio SAC. All Rights Reserved.                		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.swing.Timer;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.ADialog;
import org.compiere.apps.StatusBar;
import org.compiere.grid.ed.VLookup;

import org.compiere.model.MDocType;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MMovement;
import org.compiere.plaf.CompiereColor;
import org.compiere.swing.CButton;
import org.compiere.swing.CFrame;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
//import org.xendra.ticket.LinePrinterMovementFormatter;
import org.xendra.apps.form.VBoeGen;

/**
 *	Template
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
public class CTransferWarehousePrint extends CFrame implements FormPanel, ActionListener
{

	private int m_WindowNo;
	private FormFrame m_Frame;
	private CPanel mainPanel = new CPanel();
	private StatusBar statusBar = new StatusBar();
	private VLookup pickDocType;
	private Timer timer;
	private boolean m_Printing = false;
	private CButton bPrinting = new CButton("Iniciar impresion");	
	private static CLogger log = CLogger.getCLogger(VBoeGen.class);

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_Frame = frame;		
		try
		{
			dynInit();
			jbInit();
			frame.getContentPane().add(pickDocType, BorderLayout.NORTH);
			frame.getContentPane().add(bPrinting, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
	}

	private void jbInit() {
		CompiereColor.setBackground(this);
		mainPanel.setLayout(new BorderLayout());
		timer = new Timer(500, this);
		timer.setInitialDelay(1000);
		timer.stop(); 		
		bPrinting.addActionListener(this);
		
	}

	private void dynInit() {
		int AD_Column_ID = Util.getColumnID(MMovement.Table_ID, "C_DocType_ID");        //  M_Movement.C_DocType_ID
		MLookup lookupDT = MLookupFactory.get ( Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickDocType = new VLookup("C_DocType_ID", true, false, true, lookupDT);
		
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "Impresion"));
		statusBar.setStatusDB("");
		
	}
	
	public void dispose() {
		if (m_Frame != null)
			m_Frame.dispose();
		m_Frame = null;			
	}

	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == this.bPrinting )
		{
			bPrinting.setText("impresion activada");
			timer.start();
			m_Printing = true;
		}
		try {
			if (m_Printing)
			{
				timer.stop();
				printPendings();
				timer.start();
			}
		}
		catch (NullPointerException ex) {
			ex.printStackTrace();
		}		
	}	
	public void printPendings()
	{
//		Integer C_DocType_ID = (Integer) pickDocType.getValue();
//		MDocType dt = MDocType.get(Env.getCtx(), C_DocType_ID); 
//		String sql = "SELECT *  FROM C_PDDControl pl " 
//			.concat(" WHERE  C_DocType_ID = ? AND isprinted='N' AND processed = 'N' order by C_PDDControl_ID ");
//				
//		try {			
//			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
//			pstmt.setInt(1, C_DocType_ID );
//			ResultSet rs = pstmt.executeQuery();
//			bPrinting.setText("Imprimiendo...");
//			while (rs.next())
//			{		
//				
//				int C_PDDControl_ID = rs.getInt("C_PDDControl_ID");
//				int AD_PosPrintFormat_ID = rs.getInt("AD_LinePrinterFormat_ID");
//				int AD_LP_ID = dt.getAD_LP_ID();
//				int M_Movement_ID = rs.getInt("M_Movement_ID");
//
//				MMovement movement = new MMovement(Env.getCtx(), M_Movement_ID, null);
//				
//				String DocumentNo = DB.getDocumentNo(C_DocType_ID, null, false, movement);
//				
//				movement.setDocumentNo(DocumentNo);
//				movement.save();
//				
//				LinePrinterMovementFormatter ticket = new LinePrinterMovementFormatter(
//				DocumentNo, 
//				AD_LP_ID,
//				dt.getLineCount().intValue() /* lineas */,
//				AD_PosPrintFormat_ID, 
//				movement , null);				
//				boolean printok = ticket.print();
//				ticket.close();
//				if (printok)
//					DB.executeUpdate("UPDATE C_PDDControl set IsPrinted='Y' WHERE C_PDDControl_ID = ".concat(String.valueOf(C_PDDControl_ID)), null);						
//				else
//				{
//					String confirm = "Documento ".concat(DocumentNo);
//					confirm = confirm.concat(" no pudo imprimir, confirme reintento");
//					if (ADialog.ask(0, m_Frame, confirm ))
//					{
//						ticket = new LinePrinterMovementFormatter(
//						DocumentNo, 
//						AD_LP_ID,
//						dt.getLineCount().intValue() /* lineas */,
//						AD_PosPrintFormat_ID, 
//						movement , null);
//						log.log(Level.FINE, "preticketprinter");
//						printok = ticket.print();
//						ticket.close();
//						if ( printok )
//							DB.executeUpdate("UPDATE C_PDDControl set IsPrinted='Y' WHERE C_PDDControl_ID = ".concat(String.valueOf(C_PDDControl_ID)), null);						
//					}
//				}
//				DB.executeUpdate("UPDATE C_PDDControl set Processed='Y' WHERE C_PDDControl_ID = ".concat(String.valueOf(C_PDDControl_ID)), null);
//			}
//			bPrinting.setText("impresion activada");
//			pstmt.close();
//			rs.close();
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}		
	}
	public boolean candispose() {
		return true;
	}	
}