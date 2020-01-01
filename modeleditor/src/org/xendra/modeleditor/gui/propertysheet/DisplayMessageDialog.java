package org.xendra.modeleditor.gui.propertysheet;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;
import javax.swing.JOptionPane;
public class DisplayMessageDialog extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
        JList theList = (JList) e.getSource();
        //              if (SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 2) {
        if (e.getClickCount() == 2) {
            int index = theList.locationToIndex(e.getPoint());
            if (index >= 0) {
                Object o = theList.getModel().getElementAt(index);
                        //InstantMessageDialog imd = new InstantMessageDialog(null, o.toString());
                //imd.setVisible(true);
                JOptionPane.showMessageDialog(theList, "Double-clicked on: " + o.toString());
                System.out.println("Double-clicked on: " + o.toString());
            }
        }
    }
}
