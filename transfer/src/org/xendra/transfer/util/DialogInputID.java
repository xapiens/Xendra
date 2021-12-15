package org.xendra.transfer.util;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextField;

import org.xendra.objectview.ObjectView;
import org.xendra.objectview.ObjectViewAdapter;
import org.xendra.transfer.Row;


import java.beans.*; //property change stuff
import java.awt.*;
import java.awt.event.*;

public class DialogInputID extends JDialog
                   implements ActionListener,
                              PropertyChangeListener {
    
	private JTextField textID = new JTextField();
    private JOptionPane optionPane;
    private String btnString1 = "Aceptar";
    private String btnString2 = "Cancelar";
    private ObjectView m_view;
    private int found;
    public int getFoundRow() {
    	return found; 
    }
    
    public DialogInputID(Frame aFrame,ObjectView view) {
        super(aFrame, "Acceso rapido a busqueda de producto",true);

        m_view = view;
        
        String msgString1 = "Ingrese el codigo: ";
        Object[] array = {msgString1, textID};

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
            	textID.requestFocusInWindow();
            }
        });
        textID.addActionListener(this);
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
            	String ID = textID.getText();
            	ObjectViewAdapter adapter = (ObjectViewAdapter) m_view.getModel();
		    	for (int j=0; j < m_view.getRowCount() ; j++)
				{					
					Row data = (Row) adapter.getNewRow(j);
					if (data.getValue().compareTo(ID) == 0)
					{
						 found = j+1;
						 break;
					}
				}            	
                if (found == 0 )
                {
                    JOptionPane.showMessageDialog(
                                    this,
                                    "no se encontro ningun producto",
                                    "intentar nuevamente",
                                    JOptionPane.ERROR_MESSAGE);
                    textID.setText("");
                    textID.requestFocusInWindow();             
                }
                else
                	setVisible(false);
            } 
            else  //user closed dialog or clicked cancel
            {
               setVisible(false);
            }
        }
    }
}