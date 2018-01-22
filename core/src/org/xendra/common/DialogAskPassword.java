package org.xendra.common;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import java.beans.*; //property change stuff
import java.awt.*;
import java.awt.event.*;

public class DialogAskPassword extends JDialog
                   implements ActionListener,
                              PropertyChangeListener {
    
	private JPasswordField pwdField = new JPasswordField();
    private JOptionPane optionPane;
    private String btnString1 = "Aceptar";
    private String btnString2 = "Cancelar";
    private String m_Password;
    private boolean passwordOk = false;
    public boolean getPasswordOk() {
    	return passwordOk; 
    }
    
    public DialogAskPassword(Frame aFrame, String password) {
        super(aFrame, "Acceso Restringido",true);

        m_Password = password;
        
        String msgString1 = "Ingrese password: ";
        Object[] array = {msgString1, pwdField};

        Object[] options = {btnString1, btnString2};

        optionPane = new JOptionPane(array,
                                    JOptionPane.QUESTION_MESSAGE,
                                    JOptionPane.YES_NO_OPTION,
                                    null,
                                    options,
                                    options[0]);
        setContentPane(optionPane);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    optionPane.setValue(new Integer(
                                        JOptionPane.CLOSED_OPTION));
            }
        });

        addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent ce) {
            	pwdField.requestFocusInWindow();
            }
        });
        pwdField.addActionListener(this);
        optionPane.addPropertyChangeListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        optionPane.setValue(btnString1);
    }

    public void propertyChange(PropertyChangeEvent e) {
        String prop = e.getPropertyName();

        if (isVisible()
         && (e.getSource() == optionPane)
         && (JOptionPane.VALUE_PROPERTY.equals(prop) ||
             JOptionPane.INPUT_VALUE_PROPERTY.equals(prop))) {
            Object value = optionPane.getValue();

            if (value == JOptionPane.UNINITIALIZED_VALUE) {
                return;
            }

            optionPane.setValue(
                    JOptionPane.UNINITIALIZED_VALUE);

            if (btnString1.equals(value)) {
				String password = new String(pwdField.getPassword());
				if (password.compareTo(m_Password)==0)
				{
					passwordOk = true;
				}
            	setVisible(false);					
            } 
            else  //user closed dialog or clicked cancel
            {
               setVisible(false);
            }
        }
    }
}