//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.
package org.xendra.printdocument.devicewizard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.printdocument.ResourceLoader;

import com.Verisign.payment.f;

class QueueStep extends AbstractStep {
    protected DataModel data;
    protected JTextField accountNameTextField;
   
    public QueueStep(DataModel data) {
        super(ResourceLoader.getString("dialog", "devicewizard", "device"),
              ResourceLoader.getString("dialog", "devicewizard", "device_description"));
        this.data = data;        
        setCanGoNext(false);
    }

    protected JComponent createComponent() {    	
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "devicewizard", "queue_text")));
        component.add(Box.createVerticalStrut(40));

        WizardTextField middlePanel = new WizardTextField();        

        DocumentListener fieldListener = new DocumentListener() {
            public void removeUpdate(DocumentEvent e) {
                checkqueue();
            }

            public void insertUpdate(DocumentEvent e) {
                checkqueue();
            }

            protected void checkqueue() {
            	
            	setCanGoNext(true);
            }

            public void changedUpdate(DocumentEvent e) {
            }
        };
        
        
        accountNameTextField = new JTextField();        
        
        LabelWithMnemonic queueNameLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "devicewizard", "queuename"));
        middlePanel.addLabel(queueNameLabel);
        Method method = null;
        try {
            method = accountNameTextField.getClass().getMethod("getText", null);
        } catch (NoSuchMethodException nsme) {}
        data.registerDataLookup("queuename", new DefaultDataLookup(accountNameTextField, method, null));
        accountNameTextField.getDocument().addDocumentListener(fieldListener);
        queueNameLabel.setLabelFor(accountNameTextField);
        middlePanel.addTextField(accountNameTextField);
                
        middlePanel.addEmptyExample();
        
        component.add(middlePanel);
        return component;
    }

    public void prepareRendering() {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	accountNameTextField.requestFocus();
                }
            });
    }
}