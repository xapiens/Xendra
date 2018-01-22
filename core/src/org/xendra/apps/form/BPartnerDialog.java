package org.xendra.apps.form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import org.compiere.apps.AEnv;
import org.compiere.apps.ConfirmPanel;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.util.Env;
import org.compiere.util.Msg;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class BPartnerDialog extends JDialog implements ActionListener, VetoableChangeListener {

	private final JPanel contentPanel = new JPanel();
	private JButton bCancel = new JButton("Cancel");
	private JButton bOK 	= new JButton("OK");
	private boolean m_ok;
	private VLookup pickPartner;
	private int m_WindowNo;
	private ConfirmPanel confirmPanel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BPartnerDialog dialog = new BPartnerDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BPartnerDialog() {
		Initialize();
	}

	public BPartnerDialog(JFrame owner, Integer C_BPartner_ID,String trxName) {
		super (owner, true);
		setTitle(Msg.getMsg(Env.getCtx(), X_C_BPartner.COLUMNNAME_C_BPartner_ID));
		//
//        java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
//        forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
//        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);		
		Initialize();
		pickPartner.setValue(C_BPartner_ID);
		AEnv.showCenterWindow(null, this);
	}

	private void Initialize() {
		setBounds(100, 100, 450, 109);
		//pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner = VLookup.createBPartner(0);
		pickPartner.setMandatory(true);
		pickPartner.addVetoableChangeListener(this);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel lblNewLabel = new JLabel("socio de negocio");
			contentPanel.add(lblNewLabel, BorderLayout.NORTH);
			contentPanel.add(pickPartner);
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			confirmPanel = new ConfirmPanel(true, false, false, false, false, false, false);
			confirmPanel.addActionListener(this);
			getContentPane().add(confirmPanel, BorderLayout.SOUTH);
//			{
//				bOK.addActionListener(this);
//				bOK.setActionCommand("OK");
//				buttonPane.add(bOK);
//				getRootPane().setDefaultButton(bOK);
//			}
//			{				
//				bCancel.addActionListener(this);
//				bCancel.setActionCommand("Cancel");
//				buttonPane.add(bCancel);
//			}
		}
	}

	public void actionPerformed(ActionEvent e) {		
		String cmd = e.getActionCommand();
		if (cmd.equals(ConfirmPanel.A_OK)) {
			dispose(true);
		} else if (cmd.equals(ConfirmPanel.A_CANCEL)) {
			dispose(false);
		}		
	}

	public void dispose(boolean ok) {
		m_ok = ok;
		removeAll();
		super.dispose();
	} // dispose
	
	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		String name = e.getPropertyName();
		Object value = e.getNewValue();
		
		if (name.equals("C_BPartner_ID"))
		{
//			Env.setContext(Env.getCtx(), m_WindowNo, "C_BPartner_ID", value.toString() );
//			pospanel.bPartner(value);
//			if (getPaymentTerm().equals(MOrder.PAYMENTRULE_OnCredit))
//			{				
//				checkCreditAvailable();
//				if (pospanel.getModel().getDefaultBPartner() != pospanel.getOrder().getC_BPartner_ID()  )
//					pickPaymentTerm.setValue(pospanel.getOrder().getC_PaymentTerm_ID());				
//			}	
//			pickBPartnerLocation.refresh();
//			pickBPartnerLocation.setFirstValue();
//			pickBPartnerLocation.setValue(pickBPartnerLocation.getValue());
//			pickBPartnerLocation.requestFocus();
//			if ( pospanel.getModel().config.IsBonusPoints() )
//				this.pickPartnerPoints.setValue(value);
		}
		
	}
	
	/**
	 * 	OK Pressed
	 *	@return true if OK
	 */
	public boolean isOK()
	{
		return m_ok;
	}	//	isOK

	public Integer getC_BPartner_ID() {
		return (Integer) pickPartner.getValue();
	}

}
