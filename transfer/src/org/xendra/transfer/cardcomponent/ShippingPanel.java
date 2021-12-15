package org.xendra.transfer.cardcomponent;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.KeyStroke;

import org.compiere.apps.ADialog;
import org.compiere.apps.AppsAction;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MColumn;
import org.compiere.model.MLocation;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MMovement;
import org.compiere.model.MRole;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_M_Movement;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.Constants;
import org.xendra.transfer.CTransferWarehouse;

import java.util.HashMap;
import java.util.logging.Level;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;


public class ShippingPanel extends CardComponentPanel implements ActionListener, VetoableChangeListener  {
	private static CLogger log = CLogger.getCLogger(ShippingPanel.class);
	private int m_WindowNo = 0;
	private VLookup deliveryViaRule;
	private VLookup deliveryRule;
	private VLookup priorityRule;
	private boolean	m_readOnly = false;
	private CLabel lblDeliveryViaRule;	
	private CLabel lblPriority;
	private CLabel DeliveryRuleLabel;
	private HashMap<String, AppsAction> AppsActions = new HashMap();
	private HashMap<String, CButton> buttons = new HashMap();	
	
	/**
	 * @wbp.parser.constructor
	 */
	public ShippingPanel (CTransferWarehouse pos)
	{						
		super(pos);						
		try
		{			
			java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
			forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
			setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();
			deliveryViaRule.setValue(pos.getDeliveryViaRule());
			priorityRule.setValue(pos.getPriorityRule());
			deliveryRule.setValue(pos.getDeliveryRule());
			//Evaluation();
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "Find", e);
		}				
	}
	
	private void jbInit() {
		AppsActions.put(Constants.A_FINISH, new AppsAction(Constants.A_FINISH,  KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0), Msg.translate(Env.getCtx(), "Finish")));
		AppsActions.get(Constants.A_FINISH).setDelegate(this);
		buttons.put(Constants.A_FINISH, (CButton) AppsActions.get(Constants.A_FINISH).getButton());
		//
		AppsActions.put(Constants.A_EXIT,   new AppsAction(Constants.A_EXIT,    KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0), Msg.translate(Env.getCtx(), "Cancel")));
		AppsActions.get(Constants.A_EXIT).setDelegate(this);
		buttons.put(Constants.A_EXIT, (CButton) AppsActions.get(Constants.A_EXIT).getButton());

		deliveryViaRule = new VLookup (X_M_Movement.COLUMNNAME_DeliveryViaRule, true, false, true, 
				MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_DeliveryViaRule, null),DisplayType.List)
				);
		deliveryViaRule.addVetoableChangeListener(this);
		//deliveryViaRule.addActionListener(this);
		priorityRule = new VLookup (X_M_Movement.COLUMNNAME_PriorityRule, true, false, true, 
				MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_PriorityRule, null),DisplayType.List)
				);
		priorityRule.addVetoableChangeListener(this);
		
		deliveryRule = new VLookup(X_M_Movement.COLUMNNAME_DeliveryRule, true, false, true,
				MLookupFactory.get(Env.getCtx(), m_WindowNo, 0, MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_DeliveryRule, null), DisplayType.List)
				);
		deliveryRule.addVetoableChangeListener(this);
		
		setLayout(new MigLayout("", "[315px]", "[78px][][74px]"));

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "DeliveryRule")));		
		panel.setLayout(new MigLayout("", "[100,grow,left][]", "[][]"));
		add(panel, "cell 0 0,alignx center,aligny top");

		lblDeliveryViaRule = new CLabel();
		lblDeliveryViaRule.setText("DeliveryViaRule");
		panel.add(lblDeliveryViaRule, "cell 0 0");
		panel.add(deliveryViaRule, "cell 1 0");			
		lblPriority = new CLabel();
		lblPriority.setText("Priority");
		panel.add(lblPriority, "cell 0 1");
		panel.add(priorityRule, "cell 1 1");
		DeliveryRuleLabel = new CLabel();
		DeliveryRuleLabel.setText("DeliveryRule");
		panel.add(DeliveryRuleLabel, "cell 0 2");
		panel.add(deliveryRule,"cell 1 2");
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));		
		panel2.setLayout(new MigLayout("", "[100,grow,left][]", "[]"));
		add(panel2, "cell 0 1,alignx center,aligny top");		
		panel2.add(buttons.get(Constants.A_FINISH), "");		
		panel2.add(buttons.get(Constants.A_EXIT), "");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c.equals(buttons.get(Constants.A_EXIT)))
		{						
			hideform();			
		}
		if (c.equals(buttons.get(Constants.A_FINISH)))
		{			
			process();
		}			
	}
	
	private void process() {		
		String error;
		try {
			error = getPOSPanel().process();
			if (error.length() == 0)
			{
//				Void();
				hideform();
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	@Override
	public void selection() {
		
		if ((String) deliveryViaRule.getValue() != null)
			updateDeliveryViaRule((String) deliveryViaRule.getValue());
		
		if ((String) priorityRule.getValue() != null)
			updatePriorityRule((String) priorityRule.getValue());
		
		if ((String) deliveryRule.getValue() != null)
			updateDeliveryRule((String) deliveryRule.getValue());
		deliveryViaRule.grabFocus();
		
	}		
	
	private void hideform() {
		this.getPOSPanel().enableEnvironment();
		setVisible(false);				
	}

	private void updateDeliveryViaRule(String value) {
		MMovement movement = this.getPOSPanel().getMovement();
		movement.setDeliveryViaRule(value);
		getPOSPanel().updatePO(movement);		
	}
	
	private void updatePriorityRule(String value) {
		MMovement movement = this.getPOSPanel().getMovement();
		movement.setPriorityRule(value);
		getPOSPanel().updatePO(movement);		
	}
	
	private void updateDeliveryRule(String value) {
		MMovement m = getPOSPanel().getMovement();
		m.setDeliveryRule(value);
		getPOSPanel().updatePO(m);
	}
	
	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		if (e.getPropertyName().equals(X_M_Movement.COLUMNNAME_DeliveryViaRule)) {
			updateDeliveryViaRule((String) e.getNewValue());
		}
		else if  (e.getPropertyName().equals(X_M_Movement.COLUMNNAME_PriorityRule)) {
			updatePriorityRule((String) e.getNewValue());
		}
		else if (e.getPropertyName().equals(X_M_Movement.COLUMNNAME_DeliveryRule)) {
			updateDeliveryRule((String) e.getNewValue());
		}
	}
}
