package org.compiere.apps.search;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import javax.swing.*;

import java.math.*;

import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.model.MRole;
import org.compiere.model.reference.REF_M_AttributeValueType;
import org.compiere.swing.*;
import org.compiere.util.*;

public class InfoQAttribute extends CDialog{
	
	public InfoQAttribute (JDialog parent)
	{
		super (parent, Msg.getMsg(Env.getCtx(), "InfoPAttribute"), true);
		try
		{
			jbInit();
			dynInit();
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "InfoPAttribute", e);
			
		}
		AEnv.showCenterWindow(parent, this);
	}	//	InfoQAttribute
	
	/**	Resulting Query			*/
	private String		m_query = "";
	/**	Product Attribure Editors	*/
	private ArrayList<Component>	m_productEditors = new ArrayList<Component>();
	private ArrayList<Component>	m_productEditorsTo = new ArrayList<Component>();
	/**	Instance Attribute Editors	*/
	private ArrayList<Component>	m_instanceEditors = new ArrayList<Component>();
	private ArrayList<Component>	m_instanceEditorsTo = new ArrayList<Component>();
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(InfoPAttribute.class);

	private CPanel mainPanel = new CPanel();
	private BorderLayout mainLayout = new BorderLayout();
	private CPanel centerPanel = new CPanel();
	private ConfirmPanel confirmPanel = new ConfirmPanel(true);
	//
	private CLabel serNoLabel = new CLabel(Msg.translate(Env.getCtx(), "SerNo"));
	private VString serNoField = new VString("SerNo", false, false, true, 10, 20, null, null); 
	private CLabel lotLabel = new CLabel(Msg.translate(Env.getCtx(), "Lot"));
	private VString lotField = new VString("Lot", false, false, true, 10, 20, null, null); 
	private VComboBox guaranteeDateSelection = null;
	private VDate guaranteeDateField = new VDate ("GuaranteeDate", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "GuaranteeDate")); 
	private CLabel lotLabel2 = new CLabel(Msg.translate(Env.getCtx(), "M_Lot_ID"));
	private VComboBox lotSelection = null; 
	
	private void jbInit() throws Exception
	{
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(mainLayout);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new ALayout());
		//	ConfirmPanel
		confirmPanel.addActionListener(this);
		mainPanel.add(confirmPanel, BorderLayout.SOUTH);
	}	//	jbInit

	/**
	 * 	Dynamic Init of the Center Panel
	 */
	private void dynInit()
	{
		int row = addAttributes();
		//
		String s = Msg.translate(Env.getCtx(), "GuaranteeDate");
		guaranteeDateSelection = new VComboBox (new Object[]
			{s + " <", s + " =", s + " >"});
	//	guaranteeDateSelection.setPreferredSize();
		initLotSelection();
		//	Fixed Instance Selection Fields		
		centerPanel.add(serNoLabel, new ALayoutConstraint(row++, 0));
		centerPanel.add(serNoField, null);
		centerPanel.add(lotLabel, new ALayoutConstraint(row++, 0));
		centerPanel.add(lotField, null);
		centerPanel.add(lotLabel2, new ALayoutConstraint(row++, 0));
		centerPanel.add(lotSelection, null);
		centerPanel.add(guaranteeDateSelection, new ALayoutConstraint(row++, 0));
		centerPanel.add(guaranteeDateField, null);
		//
		Dimension d = centerPanel.getPreferredSize();
		d.width = 400;
		centerPanel.setPreferredSize(d);
	}	//	dynInit
	
	private int addAttributes()
	{
		int row = 0;
		PreparedStatement pstmt = null;
		String sql = MRole.getDefault().addAccessSQL(
			"SELECT QAttribute_ID, Name, Description, AttributeValueType, IsInstanceAttribute "
			+ "FROM QAttribute "
			+ "WHERE IsActive='Y' "
			+ "ORDER BY IsInstanceAttribute, Name", 
			"QAttribute", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO);
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			ResultSet rs = pstmt.executeQuery();
			boolean instanceLine = false;
			while (rs.next())
			{
				int attribute_ID = rs.getInt(1);
				String name = rs.getString(2);
				String description = rs.getString(3);
				String attributeValueType = rs.getString(4);
				boolean isInstanceAttribute = "Y".equals(rs.getString(5)); 
				//	Instance switch
				if (!instanceLine && isInstanceAttribute)
				{
					CPanel group = new CPanel();
					group.setBorder(new VLine(Msg.translate(Env.getCtx(), "IsInstanceAttribute")));
					group.add(Box.createVerticalStrut(VLine.SPACE));
					centerPanel.add(group, new ALayoutConstraint(row++, 0));
					instanceLine = true;
				}
				//
				CLabel label = new CLabel(name);
				if (description != null && description.length() > 0)
					label.setToolTipText(description);
				centerPanel.add(label, new ALayoutConstraint(row++, 0));
				Component field = null;
				if (REF_M_AttributeValueType.List.equals(attributeValueType))
					field = new VComboBox(getAttributeList(attribute_ID));
				else if (REF_M_AttributeValueType.Number.equals(attributeValueType))
					field = new VNumber(name, false, false, true, DisplayType.Number, name);
				else
					field = new VString(name, false, false, true, 10, 40, null, null);
				label.setLabelFor(field);
				centerPanel.add(field, null);
				//
				field.setName(String.valueOf(attribute_ID));
				if (isInstanceAttribute)
					m_instanceEditors.add(field);
				else
					m_productEditors.add(field);
				
				//	To (numbers)
				Component fieldTo = null;
				if (REF_M_AttributeValueType.Number.equals(attributeValueType))
				{
					fieldTo = new VNumber(name, false, false, true, DisplayType.Number, name);
					centerPanel.add(new CLabel("-"), null);
					centerPanel.add(fieldTo, null);
				}
				if (isInstanceAttribute)
					m_instanceEditorsTo.add(fieldTo);
				else
					m_productEditorsTo.add(fieldTo);
			}
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
		return row;
	}	//	addProductAttributes
	
	private KeyNamePair[] getAttributeList(int M_Attribute_ID)
	{
		ArrayList<KeyNamePair> list = new ArrayList<KeyNamePair>();
		list.add(new KeyNamePair(-1, ""));
		
		PreparedStatement pstmt = null;
		String sql = MRole.getDefault().addAccessSQL( 
			"SELECT QAttributeValue_ID, Value, Name "
			+ "FROM QAttributeValue "
			+ "WHERE QAttribute_ID=? "
			+ "ORDER BY 2",
			"QAttributeValue", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO);
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, M_Attribute_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new KeyNamePair(rs.getInt(1), rs.getString(3)));
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
		KeyNamePair[] retValue = new KeyNamePair[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getAttributeList


	/**
	 * 	Initialize Lot Selection
	 */
	private void initLotSelection()
	{
		ArrayList<KeyNamePair> list = new ArrayList<KeyNamePair>();
		list.add(new KeyNamePair(-1, ""));
		
		String sql = MRole.getDefault().addAccessSQL(
			"SELECT M_Lot_ID, Name FROM M_Lot WHERE IsActive='Y' ORDER BY 2",
			"M_Lot", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO);
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new KeyNamePair(rs.getInt(1), rs.getString(2)));
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
		//	Create List
		KeyNamePair[] items = new KeyNamePair[list.size()];
		list.toArray(items);
		lotSelection = new VComboBox(items);
	}	//	initLotSelection


	
	/**
	 *	Action Listener
	 *	@param e event
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals(ConfirmPanel.A_OK))
		{
			createQuery();
			dispose();
		}
		else if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			m_query = null;
			dispose();
		}
	}	//	actionPerformed

	/**
	 * 	Create Query
	 *  <code>
	 * 	Available synonyms:
	 *		M_Product p
	 *		M_ProductPrice pr
	 *		M_AttributeSet pa
	 *	</code>
	 *	@return query
	 */
	private String createQuery()
	{
		/** Base Query
		SELECT *
		FROM M_Product p
 		 INNER JOIN M_ProductPrice pr ON (p.M_Product_ID=pr.M_Product_ID)
 		 LEFT OUTER JOIN M_AttributeSet pa ON (p.M_AttributeSet_ID=pa.M_AttributeSet_ID)
		WHERE
		**/
		
		/***	Instance Attributes		*/		
		StringBuffer sb = new StringBuffer();
		//	Serial No
		String s = serNoField.getText();
		if (s != null && s.length() > 0)
		{
			sb.append(" AND asi.SerNo");
			if (s.indexOf('%') == -1 && s.indexOf('_') == 1)
				sb.append("=");
			else
				sb.append(" LIKE ");
			sb.append(DB.TO_STRING(s));
		}
		//	Lot Number
		s = lotField.getText();
		if (s != null && s.length() > 0)
		{
			sb.append(" AND asi.Lot");
			if (s.indexOf('%') == -1 && s.indexOf('_') == 1)
				sb.append("=");
			else
				sb.append(" LIKE ");
			sb.append(DB.TO_STRING(s));
		}
		//	Lot ID
		KeyNamePair pp = (KeyNamePair)lotSelection.getSelectedItem();
		if (pp != null && pp.getKey() != -1)
		{
			int ID = pp.getKey();
			sb.append(" AND asi.M_Lot_ID=").append(ID);
		}
		
		//	Guarantee Date
		Timestamp ts = (Timestamp)guaranteeDateField.getValue();
		if (ts != null)
		{
			sb.append(" AND TRUNC(asi.GuaranteeDate)");
			int index = guaranteeDateSelection.getSelectedIndex();	//	 < = >
			if (index == 0)
				sb.append("<");
			else if (index == 1)
				sb.append("=");
			else
				sb.append(">");
			sb.append(DB.TO_DATE(ts,true));
		}
		
		//	Instance Editors
		for (int i = 0; i < m_instanceEditors.size(); i++)
		{
			StringBuffer iAttr = new StringBuffer();
			Component c = (Component)m_instanceEditors.get(i);
			Component cTo = (Component)m_instanceEditorsTo.get(i);
			int M_Attribute_ID = Integer.parseInt(c.getName());
			if (c instanceof VComboBox)
			{
				VComboBox field = (VComboBox)c;
				pp = (KeyNamePair)field.getSelectedItem();
				if (pp != null && pp.getKey() != -1)
				{
					iAttr.append("QAttribute_ID=").append(M_Attribute_ID)
						.append(" AND QAttributeValue_ID=").append(pp.getKey());
					
				} 
			}
			else if (c instanceof VNumber)
			{
				VNumber field = (VNumber)c;
				BigDecimal value = (BigDecimal)field.getValue();
				VNumber fieldTo = (VNumber)cTo;
				BigDecimal valueTo = (BigDecimal)fieldTo.getValue();
				if (value != null || valueTo != null)
				{
					iAttr.append("QAttribute_ID=").append(M_Attribute_ID)
						.append(" AND ValueNumber");
					if (value != null && valueTo == null)
						iAttr.append("=").append(value);
					else if (value == null && valueTo != null)
						iAttr.append("<=").append(valueTo);
					else if (value != null && valueTo != null)
						iAttr.append(" BETWEEN ").append(value)
							.append(" AND ").append(valueTo);
				} 
			}
			else
			{
				VString field = (VString)c;
				String value = field.getText();
				if (value != null && value.length() > 0)
				{
					iAttr.append("QAttribute_ID=").append(M_Attribute_ID)
						.append(" AND Value");
					if (value.indexOf('%') == -1 && value.indexOf('_') == -1)
						iAttr.append("=");
					else
						iAttr.append(" LIKE ");
					iAttr.append(DB.TO_STRING(value));
				}
			}
			//	Add to where
			if (iAttr.length() > 0)
				sb.append(" AND asi.QAttributeSetInstance_ID IN "
					+ "(SELECT QAttributeSetInstance_ID FROM QAttributeInstance "
					+ "WHERE ")
					.append(iAttr).append(")");
		}
		
		//	finish Instance Attributes
		if (sb.length() > 0)
		{
			sb.insert(0, " AND EXISTS (SELECT * FROM M_Storage s"
				+ " INNER JOIN QAttributeSetInstance asi ON (s.M_AttributeSetInstance_ID=asi.QAttributeSetInstance_ID) "
				+ "WHERE s.Q_Product_ID=p.M_Product_ID");
			sb.append(")");
		}
		
		
		//	Product Attributes 
		for (int i = 0; i < m_productEditors.size(); i++)
		{
			StringBuffer pAttr = new StringBuffer();
			Component c = (Component)m_productEditors.get(i);
			Component cTo = (Component)m_productEditorsTo.get(i);
			int M_Attribute_ID = Integer.parseInt(c.getName());
			if (c instanceof VComboBox)
			{
				VComboBox field = (VComboBox)c;
				pp = (KeyNamePair)field.getSelectedItem();
				if (pp != null && pp.getKey() != -1)
				{
					pAttr.append("QAttribute_ID=").append(M_Attribute_ID)
						.append(" AND QAttributeValue_ID=").append(pp.getKey());
				} 
			}
			else if (c instanceof VNumber)
			{
				VNumber field = (VNumber)c;
				BigDecimal value = (BigDecimal)field.getValue();
				VNumber fieldTo = (VNumber)cTo;
				BigDecimal valueTo = (BigDecimal)fieldTo.getValue();
				if (value != null || valueTo != null)
				{
					pAttr.append("QAttribute_ID=").append(M_Attribute_ID)
						.append(" AND ValueNumber");
					if (value != null && valueTo == null)
						pAttr.append("=").append(value);
					else if (value == null && valueTo != null)
						pAttr.append("<=").append(valueTo);
					else if (value != null && valueTo != null)
						pAttr.append(" BETWEEN ").append(value)
							.append(" AND ").append(valueTo);
				} 
			}
			else
			{
				VString field = (VString)c;
				String value = field.getText();
				if (value != null && value.length() > 0)
				{
					pAttr.append("QAttribute_ID=").append(M_Attribute_ID)
						.append(" AND Value");
					if (value.indexOf('%') == -1 && value.indexOf('_') == -1)
						pAttr.append("=");
					else
						pAttr.append(" LIKE ");
					pAttr.append(DB.TO_STRING(value));
				}
			}
			//	Add to Where
			if (pAttr.length() > 0)
				sb.append(" AND p.QAttributeSetInstance_ID IN "
					+ "(SELECT QAttributeSetInstance_ID "
					+ "FROM QAttributeInstance WHERE ")
					.append(pAttr).append(")");
		}
		//
		m_query = null;
		if (sb.length() > 0)
			m_query = sb.toString();
		log.config(m_query);		
		return m_query;
	}	//	createQuery

	/**
	 * 	Get resulting Query WHERE
	 *	@return query or null
	 */
	public String getWhereClause()
	{
		return m_query;
	}	//	getQuery

}
