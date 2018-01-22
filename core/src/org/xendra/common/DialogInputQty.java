package org.xendra.common;

import javax.swing.JOptionPane;
import javax.swing.JDialog;

import org.compiere.grid.ed.VNumber;
import org.compiere.util.Env;

import java.beans.*; //property change stuff
import java.math.BigDecimal;
import java.awt.*;
import java.awt.event.*;

public class DialogInputQty extends JDialog
                   implements ActionListener,
                              PropertyChangeListener {
    
	private VNumber Qty = new VNumber();
    private JOptionPane optionPane;
    private String btnString1 = "Aceptar";
    private String btnString2 = "Cancelar";

    public BigDecimal getQtyEntered() {
    	BigDecimal QtyEntered = (BigDecimal) Qty.getValue();
    	if (QtyEntered == null)
    		QtyEntered = BigDecimal.ZERO;
    	return QtyEntered; 
    }
    
    public DialogInputQty(Frame aFrame) {
        super(aFrame, "Acceso rapido a cantidad",true);

        String msgString1 = "Ingrese la cantidad: ";
        Object[] array = {msgString1, Qty};

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
                Qty.requestFocus();
            }
        });
        Qty.addActionListener(this);
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
            	BigDecimal QtyEntered = (BigDecimal) Qty.getValue();
            	if (QtyEntered == null)
            		QtyEntered = Env.ZERO;
                if (QtyEntered.compareTo(Env.ZERO) > 0) {
                	setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(
                                    this,
                                    "La cantidad debe ser mayor a 0",
                                    "intentar nuevamente",
                                    JOptionPane.ERROR_MESSAGE);
                    Qty.setValue(Env.ZERO);
                    Qty.requestFocusInWindow();
                }
            } else { //user closed dialog or clicked cancel
                setVisible(false);
            }
        }
    }
}