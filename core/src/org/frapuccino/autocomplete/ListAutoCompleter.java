// The contents of this file are subject to the Mozilla Public License Version
// 1.1
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
//The Initial Developers of the Original Code are Frederik Dietz and Timo
// Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.frapuccino.autocomplete;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

public class ListAutoCompleter extends AbstractAutoCompleter{ 
	 
    protected List completionList; 
    protected boolean ignoreCase; 
 
    public ListAutoCompleter(JTextComponent comp, List completionList, boolean ignoreCase){ 
        super(comp); 
        this.completionList = completionList; 
        this.ignoreCase = ignoreCase; 
        
        list.addMouseListener(new MouseAdapter(){ 
            public void mouseClicked(MouseEvent arg0){ 
                popup.setVisible(false); 
                acceptedListItem((String)list.getSelectedValue()); 
            } 
        });
    } 
 
   
    // update classes model depending on the data in textfield 
    protected boolean updateListData(){ 
        String value = textComp.getText(); 
 
        int substringLen = value.length(); 
 
        List possibleStrings = new ArrayList(); 
        Iterator iter = completionList.iterator(); 
        while(iter.hasNext()){ 
            String listEntry = (String)iter.next(); 
            if(substringLen>=listEntry.length()) 
                continue; 
 
            if(ignoreCase){ 
                if(value.equalsIgnoreCase(listEntry.substring(0, substringLen))) 
                    possibleStrings.add(listEntry); 
            }else if(listEntry.startsWith(value)) 
                possibleStrings.add(listEntry); 
        } 
 
        list.setListData(possibleStrings.toArray()); 
        return true; 
    } 
 
    // user has selected some item in the classes. update textfield accordingly... 
    protected void acceptedListItem(Object selected){ 
        if(selected==null) 
            return; 
 
        int prefixlen = textComp.getDocument().getLength(); 
 
        try{ 
            textComp.getDocument().insertString(textComp.getCaretPosition(), ((String)selected).substring(prefixlen), null); 
        } catch(BadLocationException e){ 
            e.printStackTrace(); 
        } 
 
        popup.setVisible(false); 
    } 
} 
