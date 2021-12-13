/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
package org.compiere.apps.search;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import org.compiere.util.DB;

//import javax.swing.JComponent;
//import javax.swing.ListSelectionModel;
//import javax.swing.table.DefaultTableColumnModel;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableColumnModel;
//import javax.swing.table.TableModel;

import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MPeriod;
//import org.compiere.plaf.*;
import org.compiere.swing.*;
import org.xendra.utils.ArrayHandler;
import org.xendra.utils.DateFormatter;
import org.compiere.util.*;

/**
 *	Cash Flow Information
 *	
 *  @author Francisco Morosini
 *  @version $Id: InfoCashFlow.java 4580 2012-12-26 23:08:10Z xapiens $
 */
public class InfoCashFlow extends Info implements VetoableChangeListener
{
	/**
	 *	Standard Constructor

	 * @param frame frame
	 * @param modal modal
	 * @param WindowNo window no
	 * @param A_Asset_ID asset
	 * @param value    Query Value or Name if enclosed in @
	 * @param multiSelection multiple selections
	 * @param whereClause where clause
	 */
	public InfoCashFlow (Frame frame, boolean modal, int WindowNo,
		int C_CashFlow_ID, String value,
		boolean multiSelection, String whereClause)
	{
		super (frame, modal, WindowNo, "a", "C_CashFlow_ID", multiSelection, whereClause);
		log.info(value + ", ID=" + C_CashFlow_ID + ", WHERE=" + whereClause);
		setTitle(Msg.getMsg(Env.getCtx(), "InfoCashFlow"));
		//
		statInit();
		
		initInfo (value, C_CashFlow_ID, whereClause);

		//
		int no = p_table.getRowCount();
		setStatusLine(Integer.toString(no) + " " + Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB(Integer.toString(no));
		//	AutoQuery
		if (value != null && value.length() > 0)
			executeQuery();
			
		p_loadedOK = true;
		
		//	Focus
	//	fieldValue.requestFocus();

		AEnv.positionCenterWindow(frame, this);
		
	}	//	InfoProduct

	/** From Clause             */
	private static String s_cashflowFROM = "C_CashFlow a";	

	/**  Array of Column Info    */
	private static Info_Column[] s_cashflowLayout = {
		
		new Info_Column(Msg.translate(Env.getCtx(), "Date"), "a.datetrx", Timestamp.class),		
		new Info_Column(Msg.translate(Env.getCtx(), "C_CashFlow_Group_Id"),
				"(SELECT cfg.description FROM c_cashflow_group cfg WHERE cfg.c_cashflow_group_id=a.C_CashFlow_Group_Id)", String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Description"),"a.description",String.class),
		new Info_Column(Msg.translate(Env.getCtx(), "Amount"), "a.amount", BigDecimal.class)		
	};
	
	private CLabel lDateFrom = new CLabel(Msg.translate(Env.getCtx(), "DateFrom"));
	private VDate fDateFrom = new VDate("DateFrom", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateFrom"));
	private CLabel lDateTo = new CLabel(Msg.translate(Env.getCtx(), "DateTo"));
	private VDate fDateTo = new VDate("DateTo", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "DateTo"));
	private CLabel orgLabel = new CLabel("test");
	private VComboBox orgCombo = new VComboBox();
		
    String[] periodSet;
    String[] categorySet;
    double[][] reportAmounts;
    double[] totalsByPeriod;
    double[] totalsByCategory;
    double reportTotal;
    double signedAmount;
	
	/**
	 *	Static Setup - add fields to parameterPanel
	 */
	private void statInit()
	{
		lDateFrom.setLabelFor(fDateFrom);
		fDateFrom.setBackground(XendraPLAF.getInfoBackground());
		fDateFrom.setToolTipText(Msg.translate(Env.getCtx(), "DateFrom"));		
		
		Timestamp p_Date = new Timestamp(System.currentTimeMillis());
		// rewrite the cashflow or migrate to BI
		MPeriod first = MPeriod.getFirstInYear (Env.getCtx(), p_Date, 0, 0);
		if (first != null)
			fDateFrom.setValue(first.getStartDate());		
		fDateFrom.addVetoableChangeListener(this);
		
		lDateTo.setLabelFor(fDateTo);		
		fDateTo.setBackground(XendraPLAF.getInfoBackground());
		fDateTo.setToolTipText(Msg.translate(Env.getCtx(), "DateTo"));
		fDateTo.setValue(p_Date);		
		fDateTo.addVetoableChangeListener(this);
		
		orgLabel.setLabelFor(orgCombo);		
		//
		orgCombo.addItem(new KeyNamePair (0, Msg.translate(Env.getCtx(),"CashDetailReport")));
		// cash balance in custom button.
		orgCombo.addItem(new KeyNamePair (1, Msg.translate(Env.getCtx(),"CashSummaryMonth")));
		orgCombo.addItem(new KeyNamePair (2, Msg.translate(Env.getCtx(),"CashSummaryYear")));
		orgCombo.addActionListener(this);
				
		parameterPanel.setLayout(new ALayout());

		parameterPanel.add(lDateFrom, null);
		parameterPanel.add(fDateFrom, null);
		parameterPanel.add(lDateTo, null);
		parameterPanel.add(fDateTo, null);
		parameterPanel.add(orgCombo, null);
	}	//	statInit

	/**
	 *	Dynamic Init
	 *  @param value value
	 *  @param whereClause where clause
	 */
	private void initInfo (String value, int C_CashFlow_ID, String whereClause)
	{
		//	Create Grid
		StringBuffer where = new StringBuffer();
		prepareTable(s_cashflowLayout, s_cashflowFROM,
			where.toString(),
			"1");

		//  Set Value
		if (value == null)
			value = "%";
		if (!value.endsWith("%"))
			value += "%";
		
	}	//	initInfo

	/*************************************************************************/

	/**
	 *	Construct SQL Where Clause and define parameters.
	 *  (setParameters needs to set parameters)
	 *  Includes first AND
	 *  @return WHERE clause
	 */
	String getSQLWhere()
	{
		StringBuffer sql = new StringBuffer();
		return sql.toString();
		
	}	//	getSQLWhere

	/**
	 *  Set Parameters for Query
	 *  (as defined in getSQLWhere)
	 *
	 * @param pstmt pstmt
	 *  @param forCount for counting records
	 * @throws SQLException
	 */
	void setParameters(PreparedStatement pstmt, boolean forCount) throws SQLException
	{
		
	}	//	setParameters

	/**
	 *  Save Selection Details
	 *  Get Location/Partner Info
	 */
	public void saveSelectionDetail()
	{
		
	}   //  saveSelectionDetail

	public void actionPerformed(ActionEvent e)
	{				
		if (e.getSource() == orgCombo || e.getSource() == fDateTo ||  e.getSource() == fDateFrom )
		{
			KeyNamePair resource = (KeyNamePair)orgCombo.getSelectedItem();
			if (resource != null)
			{
				switch( resource.getKey() )
				{
					case 0:				
						SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd Z");
						prepareTable(s_cashflowLayout, s_cashflowFROM,
								"datetrx>='"+ft.format(fDateFrom.getTimestamp())+"' and datetrx<='"+ft.format(fDateTo.getTimestamp())+"'",
								"1");						
						break;
					case 1:
						GroupbyMonth((Date)fDateFrom.getTimestamp(),(Date)fDateTo.getTimestamp());						
						break;
					case 2:
						GroupbyYear((Date)fDateFrom.getTimestamp(),(Date)fDateTo.getTimestamp());
						break;						
				}				
			}			
		}
		super.actionPerformed(e);		
	}

	void GroupbyMonth(Date fromDateIn,Date toDateIn)
	{		
		definePeriodSet(fromDateIn,toDateIn,"M");
		Info_Column[] m_Layout;
		ArrayList<Info_Column> list = new ArrayList<Info_Column>();						
		list.add(new Info_Column(Msg.translate(Env.getCtx(), "C_CashBook_ID"),
				"", 
				String.class));						
		for (int i = 0; i < periodSet.length; i++) {
			if (i == 0) {
				// WHERE datetrx>=? and datetrx<=?
		    	SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd Z");
	    		//String oa = ft.format(fDateFrom.getValue);				
				list.add(new Info_Column(Msg.translate(Env.getCtx(), periodSet[i]),
				" * from crosstab('" +
				"SELECT (SELECT cfg.description FROM c_cashflow_group cfg WHERE cfg.c_cashflow_group_id=a.C_CashFlow_Group_Id),  to_char(a.datetrx,''_YYYY_MM''), SUM(a.amount) from c_cashflow a WHERE datetrx>=''"+ft.format(fromDateIn)+"'' and datetrx<=''"+ft.format(toDateIn)+"'' GROUP BY 1,2 ORDER BY 1'," +
				"'SELECT DISTINCT to_char(datetrx,''_YYYY_MM'') from c_cashflow WHERE datetrx>=''"+ft.format(fromDateIn)+"'' and datetrx<=''"+ft.format(toDateIn)+"'' order by 1') AS c(c_cashflow_group_id text," + periodSet[i] + " float8 ",
				String.class));
			}
			else
				list.add(new Info_Column(Msg.translate(Env.getCtx(), periodSet[i]), periodSet[i] + " float8 ", String.class));															
		}						
		m_Layout = new Info_Column[list.size()];
		list.toArray(m_Layout);
		prepareTable(m_Layout, "","","");		
	}
	void GroupbyYear(Date fromDateIn,Date toDateIn)
	{		
		definePeriodSet(fromDateIn,toDateIn,"Y");
		Info_Column[] m_Layout;
		ArrayList<Info_Column> list = new ArrayList<Info_Column>();						
		list.add(new Info_Column(Msg.translate(Env.getCtx(), "C_CashBook_ID"),
				"", 
				String.class));						
		for (int i = 0; i < periodSet.length; i++) {
			if (i == 0) {				
		    	SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd Z");	    									
				list.add(new Info_Column(Msg.translate(Env.getCtx(), periodSet[i]),
				" * from crosstab('" +
				"SELECT (SELECT cfg.description FROM c_cashflow_group cfg WHERE cfg.c_cashflow_group_id=a.C_CashFlow_Group_Id),  to_char(a.datetrx,''_YYYY''), SUM(a.amount) from c_cashflow a WHERE datetrx>=''"+ft.format(fromDateIn)+"'' and datetrx<=''"+ft.format(toDateIn)+"'' GROUP BY 1,2 ORDER BY 1'," +
				"'SELECT DISTINCT to_char(datetrx,''_YYYY'') from c_cashflow WHERE datetrx>=''"+ft.format(fromDateIn)+"'' and datetrx<=''"+ft.format(toDateIn)+"'' order by 1') AS c(c_cashflow_group_id text," + periodSet[i] + " float8 ",
				String.class));
			}
			else
				list.add(new Info_Column(Msg.translate(Env.getCtx(), periodSet[i]), periodSet[i] + " float8 ", String.class));															
		}						
		m_Layout = new Info_Column[list.size()];
		list.toArray(m_Layout);
		prepareTable(m_Layout, "","","");		
	}	
	/*************************************************************************/
	/**
	 *	Show History
	 */
	void showHistory()
	{
		log.info( "InfoCashFlow.showHistory");
	}	//	showHistory

	/**
	 *	Has History
	 *  @return true
	 */
	boolean hasHistory()
	{
		return false;
	}	//	hasHistory

	/**
	 *	Zoom
	 */
	void zoom()
	{
		log.info( "InfoCashFlow.zoom");
/*		Integer A_Asset_ID = getSelectedRowKey();
		if (A_Asset_ID == null)
			return;
		MQuery query = new MQuery("A_Asset");
		query.addRestriction("A_Asset_ID", MQuery.EQUAL, A_Asset_ID);
		query.setRecordCount(1);
		int AD_WindowNo = getAD_Window_ID("A_Asset", true);
		zoom (AD_WindowNo, query);
*/		
	}	//	zoom

	/**
	 *	Has Zoom
	 *  @return true
	 */
	boolean hasZoom()
	{
		return true;
		//return false;
	}	//	hasZoom

	/**
	 *	Customize
	 */
	void customize()
	{
		log.info( "InfoCashFlow.customize");
	}	//	customize

	/**
	 *	Has Customize
	 *  @return false
	 */
	boolean hasCustomize()
	{
		return true;	//	for now
	}	//	hasCustomize
	
    void definePeriodSet(Date fromDateIn,Date toDateIn, String frequencyType) {    	
    	java.sql.Date fromDate = new java.sql.Date(fromDateIn.getTime());
    	java.sql.Date toDate    = new java.sql.Date(toDateIn.getTime());
    	int periodCounter = 0;
    	//StringBuffer sql = new StringBuffer ("");
    	String frequency = "";
    	String presentation = "";
    	if (frequencyType=="M")
    	{
    		frequency ="MM YYYY";
    		presentation = "MON_YYYY";
    	}
    	else if (frequencyType=="Y")
    	{
    		frequency ="YYYY";
    		presentation = "_YYYY";
    	}
    	String sql = "SELECT DISTINCT to_char(datetrx,'"+frequency+"'), to_char(datetrx,'"+presentation+"') AS name from c_cashflow where datetrx>=? and datetrx<=? order by 1";
    	
    	periodSet = new String[1];
    	try
		{    		
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			//pstmt.setString(1, p_tableName);
			pstmt.setDate(1,fromDate);
			pstmt.setDate(2,toDate);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				if (periodCounter == 0)
					periodSet[0] = rs.getString(2);
				else
					periodSet = ArrayHandler.growStringAndAdd(rs.getString(2), periodSet);
				periodCounter++;								
			}
			totalsByPeriod = new double[periodCounter+1]; // one more for totals column
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			//return false;
		}    	    	    	    	      	
    }
	
    public void vetoableChange (PropertyChangeEvent evt)
	throws PropertyVetoException
	{
    	String Property = evt.getPropertyName();
		Object value = evt.getNewValue();		
		if (value instanceof Timestamp)
		{			
			Date FromDate = (Date)fDateFrom.getTimestamp();
			Date ToDate = (Date)fDateTo.getTimestamp();
			if (Property == "DateFrom")
			{
				FromDate = (Date)value;
			}
			if (Property == "DateTo")
			{
				ToDate = (Date)value;
			}
			KeyNamePair resource = (KeyNamePair)orgCombo.getSelectedItem();
			if (resource != null)
			{
				switch( resource.getKey() )
				{
					case 0:
						SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd Z");
						prepareTable(s_cashflowLayout, s_cashflowFROM,
								"datetrx>='"+ft.format(FromDate)+"' and datetrx<='"+ft.format(ToDate)+"'",
								"1");	
						executeQuery();
						break;
					case 1:
						GroupbyMonth(FromDate,ToDate);
						executeQuery();
						break;
					case 2:
						GroupbyYear(FromDate,ToDate);
						executeQuery();						
						break;						
				}
			}						
		}			    	
	}

}	//	InfoCashFlow
