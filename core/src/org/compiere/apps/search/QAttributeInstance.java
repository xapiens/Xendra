package org.compiere.apps.search;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import org.compiere.apps.*;
import org.compiere.minigrid.*;
import org.compiere.swing.*;
import org.compiere.util.*;

public class QAttributeInstance extends CDialog implements ListSelectionListener
{
	//QAttributeInstance pai = new QAttributeInstance (this, title, warehouse.getKey(), 0, productInteger.intValue(), m_C_BPartner_ID);*/
    //m_M_AttributeSetInstance_ID = pai.getM_AttributeSetInstance_ID();
    //m_M_Locator_ID = pai.getM_Locator_ID();
    //if (m_M_AttributeSetInstance_ID != -1)
	//dispose(true);

	public QAttributeInstance(JFrame parent, String title, int Q_Equipment_ID)
	{
		super (parent, Msg.getMsg(Env.getCtx(), "QAttributeInstance") + title, true);
		init(Q_Equipment_ID);
		AEnv.showCenterWindow(parent, this);
	}	//	PAttributeInstance
	
	public QAttributeInstance(JDialog parent, String title, int Q_Equipment_ID)
	{
		super (parent, Msg.getMsg(Env.getCtx(), "QAttributeInstance") + title, true);
		init (Q_Equipment_ID);
		AEnv.showCenterWindow(parent, this);
	}	//	PAttributeInstance

	private void init (int Q_Equipment_ID)
	{
		log.info("Q_Equipment_ID=" + Q_Equipment_ID);
		m_M_Equipment_ID = Q_Equipment_ID;
		try
		{
			jbInit();
			dynInit();
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
	}	// init	

	private CPanel mainPanel = new CPanel();
	private BorderLayout mainLayout = new BorderLayout();
	private CPanel northPanel = new CPanel();
	private BorderLayout northLayout = new BorderLayout();
	private JScrollPane centerScrollPane = new JScrollPane();
	private ConfirmPanel confirmPanel = new ConfirmPanel (true);
	private CCheckBox showAll = new CCheckBox (Msg.getMsg(Env.getCtx(), "ShowAll"));
	//
	private MiniTable 			m_table = new MiniTable();
	private DefaultTableModel 	m_model;
	//	Parameter
	private int			 		m_M_Equipment_ID;
	//
	private int					m_Q_AttributeSetInstance_ID = -1;
	private String				m_Q_AttributeSetInstanceName = null;
	private String				m_sql;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(PAttributeInstance.class);

	/**
	 * 	Static Init
	 * 	@throws Exception
	 */
	private void jbInit() throws Exception
	{
		mainPanel.setLayout(mainLayout);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		//	North
		northPanel.setLayout(northLayout);
		northPanel.add(showAll, BorderLayout.EAST);
		showAll.addActionListener(this);
		mainPanel.add(northPanel, BorderLayout.NORTH);
		//	Center
		mainPanel.add(centerScrollPane, BorderLayout.CENTER);
		centerScrollPane.getViewport().add(m_table, null);
		//	South
		mainPanel.add(confirmPanel, BorderLayout.SOUTH);
		confirmPanel.addActionListener(this);
	}	//	jbInit

	/**	Table Column Layout Info			*/
	private static ColumnInfo[] s_layout = new ColumnInfo[] 
	{
		new ColumnInfo(" ", "a.QAttributeSetInstance_ID", IDColumn.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Equipment"), "e.name", String.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "Asset"), "a.name", String.class),
		new ColumnInfo(" ", "a.QAttributeSetInstance_ID", KeyNamePair.class,"a.QAttributeSetInstance_ID"),
		//new ColumnInfo(Msg.translate(Env.getCtx(), "SerNo"), "asi.SerNo", String.class), 
		//new ColumnInfo(Msg.translate(Env.getCtx(), "GuaranteeDate"), "asi.GuaranteeDate", Timestamp.class),
	/*	new ColumnInfo(Msg.translate(Env.getCtx(), "M_Locator_ID"), "l.Value", KeyNamePair.class, "s.M_Locator_ID"),
		new ColumnInfo(Msg.translate(Env.getCtx(), "QtyOnHand"), "s.QtyOnHand", Double.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "QtyReserved"), "s.QtyReserved", Double.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "QtyOrdered"), "s.QtyOrdered", Double.class),
		//	See RV_Storage
		new ColumnInfo(Msg.translate(Env.getCtx(), "GoodForDays"), "(TRUNC(asi.GuaranteeDate)-TRUNC(CURRENT_TIMESTAMP))-p.GuaranteeDaysMin", Integer.class, true, true, null),
		new ColumnInfo(Msg.translate(Env.getCtx(), "ShelfLifeDays"), "TRUNC(asi.GuaranteeDate)-TRUNC(CURRENT_TIMESTAMP)", Integer.class),
		new ColumnInfo(Msg.translate(Env.getCtx(), "ShelfLifeRemainingPct"), "CASE WHEN p.GuaranteeDays > 0 THEN TRUNC(((TRUNC(asi.GuaranteeDate)-TRUNC(CURRENT_TIMESTAMP))/p.GuaranteeDays)*100) ELSE 0 END", Integer.class),
	*/};
	/**	From Clause							*/
	private static String s_sqlFrom = " A_Asset a " 
			+ "JOIN Q_equipment e ON (a.Q_equipment_ID = e.Q_equipment_ID)";
	/** Where Clause						*/
	private static String s_sqlWhere = " a.Q_equipment_ID = ?"; 

	//private String	m_sqlNonZero = " AND (s.QtyOnHand<>0 OR s.QtyReserved<>0 OR s.QtyOrdered<>0)";
	//private String	m_sqlMinLife = "";

	/**
	 * 	Dynamic Init
	 * 	@param C_BPartner_ID BP
	 */
	private void dynInit()
	{
		m_sql = m_table.prepareTable (s_layout, s_sqlFrom, 
			s_sqlWhere, false, "a");
			//+ " ORDER BY asi.GuaranteeDate, s.QtyOnHand";	//	oldest, smallest first
		//
		m_table.setRowSelectionAllowed(true);
		m_table.setMultiSelection(false);
		m_table.addMouseListener(this);
		m_table.getSelectionModel().addListSelectionListener(this);
		//
		refresh();
	}	//	dynInit

	/**
	 * 	Refresh Query
	 */
	private void refresh()
	{
		String sql = m_sql;
		int pos = m_sql.lastIndexOf(" ORDER BY ");
		if (!showAll.isSelected())
		{
			/*sql = m_sql.substring(0, pos) 
				+ m_sqlNonZero;
			if (m_sqlMinLife.length() > 0)
				sql += m_sqlMinLife;
			sql += m_sql.substring(pos);*/
		}
		//
		log.finest(sql);
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			//pstmt.setInt(1, m_M_Warehouse_ID);
			pstmt.setInt(1, m_M_Equipment_ID);
			ResultSet rs = pstmt.executeQuery();
			m_table.loadTable(rs);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		enableButtons();
	}	//	refresh

	/**
	 * 	Action Listener
	 *	@param e event 
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals(ConfirmPanel.A_OK))
			dispose();
		else if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			dispose();
			m_Q_AttributeSetInstance_ID = -1;
			m_Q_AttributeSetInstanceName = null;
		}
		else if (e.getSource() == showAll)
		{
			refresh();
		}
	}	//	actionPerformed
 
	/**
	 * 	Table selection changed
	 *	@param e event
	 */
	public void valueChanged (ListSelectionEvent e)
	{
		if (e.getValueIsAdjusting())
			return;
		enableButtons();
	}	//	valueChanged

	/**
	 * 	Enable/Set Buttons and set ID
	 */
	private void enableButtons()
	{
		m_Q_AttributeSetInstance_ID = -1;
		m_Q_AttributeSetInstanceName = null;
	//	m_M_Locator_ID = 0;
		int row = m_table.getSelectedRow();
		boolean enabled = row != -1;
		if (enabled)
		{
			Integer ID = m_table.getSelectedRowKey();
			if (ID != null)
			{
				m_Q_AttributeSetInstance_ID = ID.intValue();
				m_Q_AttributeSetInstanceName = (String)m_table.getValueAt(row, 1);
				//
				//Object oo = m_table.getValueAt(row, 5);
				Object oo = m_table.getValueAt(row, 3);
				if (oo instanceof KeyNamePair)
				{
					KeyNamePair pp = (KeyNamePair)oo;
				//	m_M_Locator_ID = pp.getKey();
				}
			}
		}
		confirmPanel.getOKButton().setEnabled(enabled);
		/*log.fine("M_AttributeSetInstance_ID=" + m_M_AttributeSetInstance_ID 
			+ " - " + m_M_AttributeSetInstanceName
			+ "; M_Locator_ID=" + m_M_Locator_ID);*/
	}	//	enableButtons

	/**
	 *  Mouse Clicked
	 *  @param e event
	 */
	public void mouseClicked(MouseEvent e)
	{
		//  Double click with selected row => exit
		if (e.getClickCount() > 1 && m_table.getSelectedRow() != -1)
		{
			enableButtons();
			dispose();
		}
	}   //  mouseClicked


	/**
	 * 	Get Attribute Set Instance
	 *	@return M_AttributeSetInstance_ID or -1
	 */
	public int getQ_AttributeSetInstance_ID()
	{
		return m_Q_AttributeSetInstance_ID;
	}	//	getM_AttributeSetInstance_ID

	/**
	 * 	Get Instance Name
	 * 	@return Instance Name
	 */
	public String getQ_AttributeSetInstanceName()
	{
		return m_Q_AttributeSetInstanceName;
	}	//	getM_AttributeSetInstanceName

	/**
	 * 	Get Locator
	 *	@return M_Locator_ID or 0
	 */
	/*public int getM_Locator_ID()
	{
		return m_M_Locator_ID;
	}*/	//	getM_Locator_ID

}	//	PAttributeInstance


