package org.xendra.pos.cardcomponent;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.KeyStroke;

import org.compiere.apps.AppsAction;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.persistence.X_HR_WorkShift;
import org.compiere.swing.CButton;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.common.Point;
import org.xendra.pos.PosPanel;
import org.xendra.util.KeyNameIdentifier;

import net.miginfocom.swing.MigLayout;

public class UserPanel extends JPanel implements ActionListener {

	private PosPanel pospanel;
	private JLabel usernameLabel = new JLabel("Usuario");
	private CTextField usernameTextField = new CTextField(10);
	private JLabel workshiftlabel = new JLabel(Msg.translate(Env.getCtx(), X_HR_WorkShift.COLUMNNAME_HR_WorkShift_ID));
	private JLabel pwdlabel = new JLabel("password");	
	private VLookup WorkShift = VLookup.create(X_C_Cash.Table_Name, X_C_Cash.COLUMNNAME_HR_WorkShift_ID, 0);
	private JPasswordField pwdTextField = new JPasswordField();
	private AppsAction aFinish, aExit;
	private CButton bFinish, bExit;	

	public UserPanel(PosPanel pp)	
	{
		try {
		pospanel = pp;
		java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
		forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
		setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);		
		jbInit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private void jbInit() {

		StringBuffer sb = new StringBuffer();
		sb.append(Msg.translate(Env.getCtx(), "Finish"));
		sb.append(" [F10]");
		aFinish = new AppsAction (Constants.A_FINISH, KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0) , sb.toString());
		aFinish.setDelegate(this);
		bFinish = (CButton) aFinish.getButton();		
		
		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (Constants.A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();	
		
		pwdTextField.setActionCommand(Constants.A_FINISH);
		
		JPanel panel = new JPanel(new MigLayout("fill"));
		panel.add(usernameLabel );
		panel.add(usernameTextField , "wrap");
		panel.add(pwdlabel );
		panel.add(pwdTextField ,"span, grow, wrap");		
		panel.add(workshiftlabel);
		panel.add(WorkShift, "wrap");
		panel.add(bFinish);
		panel.add(bExit);
		add(panel);
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();		
		if (c == bExit)
			//dispose();
			hideform();
		if (c == bFinish)
		{	
			char[] input = pwdTextField.getPassword();
			MUser user = MUser.get(Env.getCtx(), usernameTextField.getText(), String.valueOf(input));
			if (user != null)
			{
				pospanel.setUser(user);
			}			
			X_HR_WorkShift hr = new Query(Env.getCtx(), X_HR_WorkShift.Table_Name, "HR_WorkShift_ID = ?", null)
			.setParameters(WorkShift.getValue()).first();
			KeyNameIdentifier kp = new KeyNameIdentifier(hr.getHR_WorkShift_ID(), hr.getName(), hr.getIdentifier());			
			pospanel.setWorkShift(kp);
			hideform();
		}		
	}

	public void hideform()
	{
		setVisible(false);
		getPOSPanel().enableEnvironment();
	}	//	dispose	
	public Point getPOSPanel()
	{
		return pospanel;
	}	
}
