package org.xendra.transfer.process;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.model.persistence.X_M_Locator;
import org.compiere.model.persistence.X_M_Movement;
import org.compiere.model.persistence.X_M_MovementLine;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Warehouse;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendrian.rules.messages.IMessageProcessor;
import org.compiere.util.Env;
import org.compiere.util.JDom;
import org.compiere.util.Util;

public class TransferMessageProcessor implements IMessageProcessor {
	private String message;
	private MMovement movement;
	private MMovementLine[] movementlines;
	private Integer m_AD_Client_ID;
	private Integer m_AD_Org_ID;
	private String m_identifier;
	private Integer m_AD_User_ID;
	private Integer m_C_DocType_ID;
	private X_A_Xendrian_Message xmessage;

	public String setMessage(String m) {
		String error = "";
		if (m != null) {
			try {
				message = m;
				org.jdom.input.SAXBuilder saxBuilder = new SAXBuilder();
				org.jdom.Document doc = saxBuilder.build(new StringReader(m));
				Element e = doc.getRootElement();
				error = processDocument(e);
			} catch (Exception e) {
				e.printStackTrace();
				error = e.getMessage();
			}
		}
		return error;
	}

	public String processDocument(Element e) {
		String error = "";
		try {
			movement = getMovementHeader(e);
			movementlines = getMovementLines(e);
		} catch (Exception ex) {
			ex.printStackTrace();
			error = ex.getMessage();
		}
		return error;
	}

	public MMovementLine[] getMovementLines(Element e) throws Exception {
		List<MMovementLine> movementlines = new ArrayList<MMovementLine>();
		List list =  e.getChildren(Constants.XML_ATTRIBUTE_POSITEM);
		for (int i = 0; i < list.size(); i++) {
			Element item = (Element) list.get(i);
			String identifier = JDom.getattrStr(item, X_M_MovementLine.COLUMNNAME_Identifier);			
			MMovementLine ml = null;
			if (identifier.length() > 0) {
				ml = new Query(Env.getCtx(), MMovementLine.Table_Name, "Identifier = ?", null)
				.setParameters(identifier).first();
			}
			if (ml == null) {
				ml = new MMovementLine(movement);				
				ml.setConfirmedQty(JDom.getattrBD(item, X_M_MovementLine.COLUMNNAME_ConfirmedQty));
				ml.setM_Locator_ID(Util.getid(item, X_M_MovementLine.COLUMNNAME_M_Locator_ID, X_M_Locator.Table_Name, "Identifier"));
				ml.setM_LocatorTo_ID(Util.getid(item, X_M_MovementLine.COLUMNNAME_M_LocatorTo_ID, X_M_Locator.Table_Name, "Identifier"));
				ml.setM_Product_ID(Util.getid(item, X_M_MovementLine.COLUMNNAME_M_Product_ID, X_M_Product.Table_Name, "Identifier"));
				ml.setC_UOM_ID(Util.getid(item, X_M_MovementLine.COLUMNNAME_C_UOM_ID, X_C_UOM.Table_Name, "Identifier"));
				ml.setMovementQty(JDom.getattrBD(item, X_M_MovementLine.COLUMNNAME_MovementQty));
				ml.setProcessed(JDom.getattrBool(item, X_M_MovementLine.COLUMNNAME_Processed));
				ml.setQtyEntered(JDom.getattrBD(item, X_M_MovementLine.COLUMNNAME_QtyEntered));
				ml.setScrappedQty(JDom.getattrBD(item, X_M_MovementLine.COLUMNNAME_ScrappedQty));
				ml.setTargetQty(JDom.getattrBD(item, X_M_MovementLine.COLUMNNAME_TargetQty));
				if (!ml.save()) {
					throw new Exception("error");
				}
			}
			movementlines.add(ml);

		}
		MMovementLine[] lines = new MMovementLine[movementlines.size()];
		movementlines.toArray(lines);
		return lines;		
	}

	public MMovement getMovementHeader(Element e)  {
		try {
			m_AD_Client_ID = Util.getid(e, Constants.COLUMNNAME_AD_Client_ID, X_AD_Client.Table_Name, "Value");
			if (m_AD_Client_ID == 0) {
				throw new Exception("Client not found");
			}
			m_AD_Org_ID = Util.getid(e, Constants.COLUMNNAME_AD_Org_ID, X_AD_Org.Table_Name, "Value");
			if (m_AD_Org_ID == 0)
				m_AD_Org_ID = Util.getid(e, Constants.COLUMNNAME_AD_Org_ID, X_AD_Org.Table_Name, "Identifier");
			m_identifier = e.getAttributeValue("id");
			m_AD_User_ID = Util.getid(e, X_AD_User.COLUMNNAME_AD_User_ID, X_AD_User.Table_Name, "Value");			    
			m_C_DocType_ID = Util.getid(e, X_C_DocType.COLUMNNAME_C_DocType_ID, X_C_DocType.Table_Name, "Identifier");

			Env.getCtx().setProperty("AD_Client_ID", getAD_Client_ID().toString());
			Env.getCtx().setProperty("#AD_Client_ID", getAD_Client_ID().toString());
			Env.getCtx().setProperty("AD_Org_ID", getAD_Org_ID().toString());
			Env.getCtx().setProperty("#AD_Org_ID", getAD_Org_ID().toString());
			Env.getCtx().setProperty("#AD_User_ID", getAD_User_ID().toString());

			String identifier = JDom.getattrStr(e, X_M_Movement.COLUMNNAME_Identifier);
			MMovement m = new Query(Env.getCtx(), X_M_Movement.Table_Name, "identifier = ? ", null)
			.setParameters(identifier).first();
			if (m == null) {
				try {
					m = new MMovement(Env.getCtx(), 0, null);
					m.setAD_Org_ID(getAD_Org_ID());
					m.setC_DocType_ID(Util.getid(e, X_M_Movement.COLUMNNAME_C_DocType_ID, X_M_Movement.Table_Name, "Identifier"));
					m.setDeliveryRule(JDom.getattrStr(e, X_M_Movement.COLUMNNAME_DeliveryRule));
					m.setDeliveryViaRule(JDom.getattrStr(e, X_M_Movement.COLUMNNAME_DeliveryViaRule));
					m.setDocAction(JDom.getattrStr(e, X_M_Movement.COLUMNNAME_DocAction));
					m.setDocStatus(JDom.getattrStr(e, X_M_Movement.COLUMNNAME_DocStatus));
					m.setIsApproved(JDom.getattrBool(e, X_M_Movement.COLUMNNAME_IsApproved));
					m.setIsInTransit(JDom.getattrBool(e, X_M_Movement.COLUMNNAME_IsInTransit));
					m.setMovementDate(JDom.getattrTs(e, X_M_Movement.COLUMNNAME_MovementDate));
					m.setPriorityRule(JDom.getattrStr(e, X_M_Movement.COLUMNNAME_PriorityRule));				
					if (!m.save())
						throw new Exception("no se pudo grabar el movement");
				} catch (Exception ex) {
					throw new Exception("error en xml");
				}
				return m;
			}		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public void setXendrianMessage(X_A_Xendrian_Message m) {
		xmessage = m;		
	}

	@Override
	public X_A_Xendrian_Message getXendrianMessage() {
		return xmessage;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getAD_Client_ID() {
		return m_AD_Client_ID;
	}

	public void setAD_Client_ID(Integer m_AD_Client_ID) {
		this.m_AD_Client_ID = m_AD_Client_ID;
	}

	public Integer getAD_Org_ID() {
		return m_AD_Org_ID;
	}

	public void setAD_Org_ID(Integer m_AD_Org_ID) {
		this.m_AD_Org_ID = m_AD_Org_ID;
	}

	public Integer getAD_User_ID() {
		return m_AD_User_ID;
	}

	public void setAD_User_ID(Integer m_AD_User_ID) {
		this.m_AD_User_ID = m_AD_User_ID;
	}

	public String getIdentifier() {
		return m_identifier;
	}

	public void setIdentifier(String identifier) {
		this.m_identifier = identifier;
	}

	public MMovement getMovement() {
		return movement;
	}

}
