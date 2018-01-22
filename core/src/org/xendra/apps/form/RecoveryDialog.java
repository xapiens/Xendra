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
package org.xendra.apps.form;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.compiere.apps.*;
import org.compiere.minigrid.IDColumn;
import org.compiere.minigrid.MiniTable;
import org.compiere.model.MPriceList;
import org.compiere.model.MProduct;
import org.compiere.model.MSession;
import org.compiere.model.MUOM;
import org.compiere.model.persistence.X_M_ProductionPlan;
import org.compiere.swing.*;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.ObjectViewModel;


/**
 *	Recovery Dialog
 *	dialogo para recuperar archivos temporales en caso de cuelgues o caidas.
 *  @author xapiens
 */
@Deprecated
public class RecoveryDialog extends CDialog implements TableModelListener
{

	/**
	 * 	Constructor
	 * 	@param owner frame
	 * @param subfolder 
	 */
	public RecoveryDialog (JFrame owner, String subfolder)
	{
		super (owner, true);
		setTitle(Msg.getMsg(Env.getCtx(), "Description"));
		//
		jbInit(subfolder);
		//
		AEnv.showCenterWindow(owner, this);
	}	//	DescriptionDialog

	private MiniTable  recoveryfilesTable = new MiniTable();
	private MiniTable  contentfileTable = new MiniTable();

	private CButton		bOK = ConfirmPanel.createOKButton("OK");
	private CButton		bCancel = ConfirmPanel.createCancelButton("Cancel");
	private boolean		m_ok = false;

	private JSplitPane previewPanel;
	
	private JViewport recoveryviewport;
	private JViewport contentviewport;	
	private JScrollPane contentscrollPane;
	private JScrollPane recoveryscrollPane;
	
	private Waiting m_waiting;
	private String m_file = new String("");
	
	
	/**
	 * 	Static Layout
	 */
	private void jbInit(String subfolder)
	{
		setRecoveryfilesTable(true);
		setContentfileTable(true);
		//
		Collection<File> found = FileUtils.listFiles(new File(getBackupDirectory(subfolder)), new WildcardFileFilter("*.csv"), null);
		int row = 0;
		recoveryfilesTable.setRowCount(row);						
		
		for (File file:found)
		{
			recoveryfilesTable.setRowCount(row+1);
			recoveryfilesTable.setValueAt(new Boolean(false),row, 0);           	// 0 - printed
			recoveryfilesTable.setValueAt(file.getAbsolutePath(),row, 1);           	// 0 - printed
			recoveryfilesTable.setValueAt(new Boolean(false),row, 2);           	// 0 - printed
			row++;
		}

		recoveryfilesTable.autoSize();
		recoveryfilesTable.getModel().addTableModelListener(this);		
		recoveryscrollPane = new JScrollPane();//queueTable);		
		recoveryviewport = new JViewport();
		recoveryviewport.add(recoveryfilesTable);
		recoveryscrollPane.setOpaque(false);
		recoveryscrollPane.setViewport(recoveryviewport);
		
		contentscrollPane = new JScrollPane();//queueTable);		
		contentviewport = new JViewport();
		contentviewport.add(contentfileTable);
		contentscrollPane.setOpaque(false);
		contentscrollPane.setViewport(contentviewport);
		
		previewPanel = new JSplitPane();
		previewPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		previewPanel.setBorder(BorderFactory.createEtchedBorder());
		previewPanel.add(recoveryscrollPane, JSplitPane.TOP);
		previewPanel.add(contentscrollPane, JSplitPane.BOTTOM);
		previewPanel.setContinuousLayout(true);
		previewPanel.setPreferredSize(new Dimension(400,300));
		previewPanel.setDividerLocation(100);

		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add (previewPanel, BorderLayout.CENTER);
		//
		CPanel confirmPanel = new CPanel(new FlowLayout(FlowLayout.RIGHT));
		confirmPanel.add(bCancel);
		confirmPanel.add(bOK);
		getContentPane().add (confirmPanel, BorderLayout.SOUTH);
		//
		bCancel.addActionListener(this);
		bOK.addActionListener(this);
	}	//	jbInit
	
	private void setContentfileTable(boolean initialize) {
	if (initialize)
	{
		contentfileTable.addColumn("M_Product_ID");
		contentfileTable.addColumn("Value");
		contentfileTable.addColumn("Qty");
		contentfileTable.addColumn("UOM");
		contentfileTable.addColumn("Name");
		contentfileTable.addColumn("Brand");
		contentfileTable.addColumn("Price");
		
		contentfileTable.setMultiSelection(true);
		contentfileTable.setRowSelectionAllowed(true);
		//
		contentfileTable.setColumnClass(0, String.class, true, Msg.translate(Env.getCtx(),"M_Product_ID"));
		contentfileTable.setColumnClass(1, String.class, true, Msg.translate(Env.getCtx(),"Value"));
		contentfileTable.setColumnClass(2, String.class, true, Msg.translate(Env.getCtx(),"Qty"));
		contentfileTable.setColumnClass(3, String.class, true, Msg.translate(Env.getCtx(),"UOM"));
		contentfileTable.setColumnClass(4, String.class, true, Msg.translate(Env.getCtx(),"Name"));
		contentfileTable.setColumnClass(5, String.class, true, Msg.translate(Env.getCtx(),"Brand"));
		contentfileTable.setColumnClass(6, String.class, true, Msg.translate(Env.getCtx(),"Price"));
		
	}
	}
	
    private void previewcsv(String filename) {
        try {
        	
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringTokenizer st = null;
			boolean lContinue = true;
			int linenumber = 0, tokennumber = 0;
			int iM_Product_ID = 0, iValue = 0, iM_PriceList_ID = 0, iQty = 0, iUOM = 0, iName = 0, iBrand = 0, iPrice = 0;
			int M_Product_ID = 0, UOM = 0, M_PriceList_ID = 0;
			BigDecimal Qty = Env.ZERO, Price = Env.ZERO;

			int row = 0;
			contentfileTable.setRowCount(row);						
			
			
			while ((filename = br.readLine() ) != null)										
			{
				linenumber++;
				st = new StringTokenizer(filename, ",");
				while (st.hasMoreTokens() )
				{						
					String tok = st.nextToken();						
					if (linenumber == 1)
					{
						if ( tok.equals("M_Product_ID"))
							iM_Product_ID = tokennumber;
						else if ( tok.equals("Value"))
							iValue = tokennumber;
						else if (tok.equals("M_PriceList_ID"))
							iM_PriceList_ID = tokennumber;
						else if ( tok.equals("Qty"))
							iQty = tokennumber;
						else if ( tok.equals("UOM"))
							iUOM = tokennumber;
						else if ( tok.equals("Name"))
							iName = tokennumber;
						else if ( tok.equals("Brand"))
							iBrand = tokennumber;
						else if ( tok.equals("Price"))
							iPrice = tokennumber;
					}
					else
					{
						if (tokennumber == iM_Product_ID )
							M_Product_ID = Integer.parseInt(tok);
						else if ( tokennumber == iValue )
						{}
						else if (tokennumber == iM_PriceList_ID)
						{
							M_PriceList_ID = Integer.parseInt(tok);
						}
						else if ( tokennumber == iQty )
							Qty = new BigDecimal(tok);
						else if ( tokennumber == iUOM )
							UOM  = Integer.parseInt(tok);
						else if ( tokennumber == iName )
						{}
						else if ( tokennumber == iBrand )
						{}
						else if ( tokennumber == iPrice )
						{
							Price = new BigDecimal(tok);
						}
					}
					tokennumber++;
				}
				if (linenumber > 0)
				{
					if (M_Product_ID > 0 && UOM > 0 && Qty != null && Price != null )
					{
						
						MProduct product = MProduct.get(Env.getCtx(), M_Product_ID, null);
						MUOM uom = MUOM.get(Env.getCtx(), UOM);
						contentfileTable.setColumnClass(0, String.class, true, Msg.translate(Env.getCtx(),"M_Product_ID"));
						contentfileTable.setColumnClass(1, String.class, true, Msg.translate(Env.getCtx(),"Value"));
						contentfileTable.setColumnClass(2, String.class, true, Msg.translate(Env.getCtx(),"Qty"));
						contentfileTable.setColumnClass(3, String.class, true, Msg.translate(Env.getCtx(),"UOM"));
						contentfileTable.setColumnClass(4, String.class, true, Msg.translate(Env.getCtx(),"Name"));
						contentfileTable.setColumnClass(5, String.class, true, Msg.translate(Env.getCtx(),"Brand"));
						contentfileTable.setColumnClass(6, String.class, true, Msg.translate(Env.getCtx(),"Price"));
						
						//AddLine();
						//AddProduct(false, product,Qty, 0, UOM, Price, 0 ,false);
						contentfileTable.setRowCount(row+1);
						contentfileTable.setValueAt(M_Product_ID,row, 0);           	// 0 - printed
						contentfileTable.setValueAt(product.getValue(),row, 1);           	// 0 - printed
						contentfileTable.setValueAt(Qty,row, 2);           	// 0 - printed
						contentfileTable.setValueAt(uom.getName(),row, 3);           	// 0 - printed
						contentfileTable.setValueAt(product.getName(),row, 4);           	// 0 - printed
						contentfileTable.setValueAt(Price,row, 6);           	// 0 - printed
						row++;
						
					}
				}
				tokennumber = 0;
			}	
			br.close();
			contentfileTable.autoSize();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}			                	
    }
	

	private void setRecoveryfilesTable(boolean initialize) {
		
	if (initialize)
	{
		recoveryfilesTable.addColumn("Eliminar");
		recoveryfilesTable.addColumn("File");		
		recoveryfilesTable.addColumn("Recuperar");
		//
		recoveryfilesTable.setMultiSelection(true);
		recoveryfilesTable.setRowSelectionAllowed(true);
		//
		recoveryfilesTable.setColumnClass(0, Boolean.class, false,Msg.translate(Env.getCtx(),"Delete"));
		recoveryfilesTable.setColumnClass(1, String.class, true,Msg.translate(Env.getCtx(),"File"));		
		recoveryfilesTable.setColumnClass(2, Boolean.class,false, "Recovery");
		recoveryfilesTable.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {					
					public void valueChanged(ListSelectionEvent event) {						
						org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
						{
							public Object construct()
						    {
								int row = recoveryfilesTable.getSelectedRow();
								String file = (String) recoveryfilesTable.getValueAt(row, 1);           	// file
								previewcsv(file);
								return Boolean.TRUE;
						    }
						};
						worker.start();
					}
				}
		);
		
	}
	else
	{
		
	}
	}

	/**
	 * 	Action Listener
	 *	@param e evt
	 */
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource() == bOK )
		{
			int linesprocessed  = 0;
			DefaultTableModel adapter = (DefaultTableModel) recoveryfilesTable.getModel();
			while (linesprocessed <  adapter.getRowCount() )
			{
				if ( (Boolean) recoveryfilesTable.getValueAt(linesprocessed, 2))
				{
					m_file  =  (String) recoveryfilesTable.getValueAt(linesprocessed, 1);
				}
				else if ( (Boolean) recoveryfilesTable.getValueAt(linesprocessed, 0))
				{
					File file = new File((String) recoveryfilesTable.getValueAt(linesprocessed, 1));
					file.delete();
				}
				linesprocessed++;
			}
			m_ok = true;
		}			
		dispose();
	}	//	actionPerformed
	
	/**
	 * 	OK Pressed
	 *	@return true if OK
	 */
	public boolean isOK()
	{
		return m_ok;
	}	//	isOK

	public void tableChanged(TableModelEvent e) {
		
	}

	public String getFile() {
		return m_file;
	}

	public static String getBackupFileName(String subfolder) {
		MSession sesion = MSession.get (Env.getCtx(), false);
		StringBuffer mFileName = new StringBuffer();
		mFileName.append(getBackupDirectory(subfolder));
		mFileName.append(File.separatorChar);
		mFileName.append(sesion.getAD_Session_ID());
		mFileName.append(".csv");		
		return mFileName.toString();
	}

	public static String getBackupDirectory(String subfolder) {
		StringBuffer mFileName = new StringBuffer();
		mFileName.append(System.getProperty("user.home"))
				.append(File.separatorChar)
				.append(subfolder);				
		return mFileName.toString();
	}

	public static Collection<File> getBackupFiles(String subfolder) {
		File filebackupdir = new File(getBackupDirectory(subfolder));
		if (!filebackupdir.exists())
		{
			try {
				filebackupdir.mkdir();
			}
			catch (Exception e)
			{
				e.printStackTrace();
				return null;
			}
		}
		return FileUtils.listFiles(filebackupdir, new WildcardFileFilter("*.csv"), null);	
	}

	public static void dropBackupFile(String string) {
		File bp = new File(getBackupFileName("pop"));
		if (bp.exists())
			bp.delete();		
	}
	
	
}	//	Recovery Dialog
