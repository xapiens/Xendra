package org.xendra.pos.cardcomponent;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.KeyStroke;

import org.compiere.apps.ADialog;
import org.compiere.apps.AppsAction;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MColumn;
import org.compiere.model.MLocation;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MOrder;
import org.compiere.model.MRole;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.Constants;
import org.xendra.pos.PosPanel;

import java.util.HashMap;
import java.util.logging.Level;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class ShippingPanel extends CardComponentPanel implements ActionListener  {
	private static CLogger log = CLogger.getCLogger(ShippingPanel.class);
	private int m_WindowNo = 0;
	private VLookup deliveryViaRule;
	private VLookup freightCostRule;
	private VLookup priorityRule;
	private boolean	m_readOnly = false;
	private CLabel lblDeliveryViaRule;
	private CLabel lblFreightCost;
	private CLabel lblPriority;
	private HashMap<String, AppsAction> AppsActions = new HashMap();
	private HashMap<String, CButton> buttons = new HashMap();	
	
	/**
	 * @wbp.parser.constructor
	 */
	public ShippingPanel (PosPanel pos)
	{						
		super(pos);						
		try
		{			
			java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
			forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
			setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();
			Evaluation();
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "Find", e);
		}				
	}
	void Evaluation()
	{		
		deliveryViaRule.setValue(getPOSPanel().getOrder().getDeliveryViaRule());
		freightCostRule.setValue(getPOSPanel().getOrder().getFreightCostRule());
		priorityRule.setValue(getPOSPanel().getOrder().getPriorityRule());
	}
	
	private void jbInit() {
		AppsActions.put(Constants.A_FINISH, new AppsAction(Constants.A_FINISH,  KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0), Msg.translate(Env.getCtx(), "Finish")));
		AppsActions.get(Constants.A_FINISH).setDelegate(this);
		buttons.put(Constants.A_FINISH, (CButton) AppsActions.get(Constants.A_FINISH).getButton());
		//
		AppsActions.put(Constants.A_EXIT,   new AppsAction(Constants.A_EXIT,    KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0), Msg.translate(Env.getCtx(), "Cancel")));
		AppsActions.get(Constants.A_EXIT).setDelegate(this);
		buttons.put(Constants.A_EXIT, (CButton) AppsActions.get(Constants.A_EXIT).getButton());

		deliveryViaRule = new VLookup (X_C_Order.COLUMNNAME_DeliveryViaRule, true, false, true, 
				MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_DeliveryViaRule, null),DisplayType.List)
				);
		deliveryViaRule.addActionListener(this);
		freightCostRule = new VLookup (X_C_Order.COLUMNNAME_FreightCostRule, false, false, true, 
				MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_FreightCostRule, null),DisplayType.List)
				);
		freightCostRule.addActionListener(this);

		priorityRule = new VLookup (X_C_Order.COLUMNNAME_PriorityRule, false, false, true, 
				MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_PriorityRule, null),DisplayType.List)
				);
		priorityRule.addActionListener(this);
		
		boolean ro = m_readOnly;
		if (!ro)
			ro = !MRole.getDefault().canUpdate(
					Env.getAD_Client_ID(Env.getCtx()), Env.getAD_Org_ID(Env.getCtx()), 
					MBPartnerLocation.Table_ID, 0, false);
		if (!ro)
			ro = !MRole.getDefault().canUpdate(
					Env.getAD_Client_ID(Env.getCtx()), Env.getAD_Org_ID(Env.getCtx()), 
					MLocation.Table_ID, 0, false);
		setLayout(new MigLayout("", "[315px]", "[78px][][74px]"));

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "DeliveryRule")));		
		panel.setLayout(new MigLayout("", "[100,grow,left][]", "[][]"));
		add(panel, "cell 0 0,alignx center,aligny top");

		lblDeliveryViaRule = new CLabel();
		lblDeliveryViaRule.setText("DeliveryViaRule");
		panel.add(lblDeliveryViaRule, "cell 0 0");
		panel.add(deliveryViaRule, "cell 1 0");			

		lblFreightCost = new CLabel();
		lblFreightCost.setText("FreightCost");
		panel.add(lblFreightCost, "cell 0 1");
		panel.add(freightCostRule, "cell 1 1");
		lblPriority = new CLabel();
		lblPriority.setText("Priority");
		panel.add(lblPriority, "cell 0 2");
		panel.add(priorityRule, "cell 1 2");
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
			MOrder order = this.getPOSPanel().getOrder();			
			order.setDeliveryViaRule((String) deliveryViaRule.getValue());
			order.setFreightCostRule((String) freightCostRule.getValue());
			order.setPriorityRule((String) priorityRule.getValue());
			this.getPOSPanel().updatePO(order);
			hideform();
		}			
	}
	
	@Override
	public void selection() {
		deliveryViaRule.grabFocus();		
	}		
	
	private void hideform() {
		this.getPOSPanel().enableEnvironment();
		setVisible(false);				
	}
}
