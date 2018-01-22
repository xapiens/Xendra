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
package org.frapuccino.iconpanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;
import javax.swing.TransferHandler;
import javax.swing.event.MouseInputAdapter;

/**
 * Panel capable of displaying multiple icons.
 *
 * The icons can be selected one at the time, or multiple. The component
 * supports drag and drop to and from other components.
 *
 * @author fdietz
 * @author redsolo
 */
public class IconPanel extends JPanel {

    private int count;

    private List selection;

    private ArrayList selectionListener;

    private Action doubleClickAction;

    private Dimension preferredIconSize;

    private OneSizeLabelFactory labelFactory;

    private boolean dragAndDropEnabled;

    /**
     * Creates an IconPanel.
     */
    public IconPanel() {
        super();
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));

        //setOpaque(true);
        //setBackground(UIManager.getColor("List.background"));

        MousePanelListener mouseListener = new MousePanelListener();
        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);

        this.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
				
			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
				switch( e.getKeyCode()) {
				case KeyEvent.VK_DELETE : {
					removeSelected();
					break;
				}
				case KeyEvent.VK_ENTER : {
					doubleClickAction.actionPerformed(null);
				}
				}
			}
        	
        });
        
        count = 0;
        selection = new Vector();
        selectionListener = new ArrayList();

        labelFactory = new OneSizeLabelFactory(150);

        // Need to register this component as a tooltip provider, this is normally
        // done by the setTooltipText() method, but since this panel has no default
        // tool tip then it would not be registered correctly. The tooltip for the
        // icons are collected from the icons themselves.
        ToolTipManager.sharedInstance().registerComponent(this);
    }

    /**
     * (non-Javadoc)
     * @see java.awt.Component#getPreferredSize()
     */
    public Dimension getPreferredSize() {
        Dimension dim = new Dimension(super.getWidth(), 0);

        if ((dim != null) && (preferredIconSize != null)) {
            int componentWidth = preferredIconSize.width + 20;

            int iconsperline = dim.width / componentWidth;

            if (iconsperline == 0) {
                iconsperline = 1;
            }

            int lines = count / iconsperline;

            if ((count % iconsperline) != 0) {
                lines++;
            }

            dim.height = (preferredIconSize.height + 5) * lines;
        }
        return dim;
    }

    /**
     * Sets the background. {@inheritDoc}
     */
    /*
     * public void updateUI() { super.updateUI(); setBackground(UIManager.getColor("List.background"));
     */

    /**
     * Sets the action used when user double clicks on an icon.
     *
     * @param action the new action to use.
     */
    public void setDoubleClickAction(Action action) {
        doubleClickAction = action;
    }

    /**
     * Adds the icon to the panel.
     *
     * @param icon the new panel to append to the panel.
     */
    protected void addItem(ClickableIcon icon) {
        super.add(icon);
    }

    /**
     * Adds a new icon to panel.
     *
     * @param image the image for the icon.
     * @param text the text under the icon.
     */
    public void add(Icon image, String text) {
        add(image, text, null);
    }

    /**
     * Adds a new icon to panel.
     *
     * @param image the image for the icon.
     * @param text the text under the icon.
     * @param tooltip the tooltip for the icon.
     */
    public JComponent add(Icon image, String text, String tooltip) {
        ClickableIcon icon = new ClickableIcon(labelFactory, image, text, count);
        icon.setToolTip(tooltip);

        preferredIconSize = icon.getPreferredSize();
        addItem(icon);
        count++;

        revalidate();
        repaint();
        
        return icon;
    }

    /** {@inheritDoc} */
    public void removeAll() {
        super.removeAll();
        count = 0;

        selection.clear();
        labelFactory.reset();

        revalidate();
        repaint();
        fireSelectionChanged();
    }

    /**
     * Removes the selected item from the panel.
     */
    public void removeSelected() {
        for (Iterator it = selection.iterator(); it.hasNext();) {
            super.remove((ClickableIcon) it.next());

            // for (int i = 0; i < selection.size(); i++) {
            // super.remove((ClickableIcon) selection.get(i));
        }
        
        count -= selection.size();
        selection.clear();
        
        // update icon index
        for ( int i=0; i<getComponentCount(); i++) {
        	ClickableIcon icon = (ClickableIcon) getComponent(i);
        	icon.setIndex(i);
        }
      
        revalidate();
        repaint();
        fireSelectionChanged();
    }

    /**
     * Returns the index of the first selected item.
     *
     * @return the index of the first selected item.
     */
    public int getSelectedIndex() {
        int selectedIndex = -1;
        if (selection.size() != 0) {
            selectedIndex = ((ClickableIcon) selection.get(0)).getIndex();
        }

        return selectedIndex;
    }

    /**
     * Returns the selected text.
     *
     * @return the selected text; null if no object is selected.
     */
    public Object getSelectedValue() {
        Object selected = null;
        if (selection.size() != 0) {
            selected = ((ClickableIcon) selection.get(0)).getText();
        }
        return selected;
    }

    /**
     * Returns an array with the selected item's text.
     *
     * @return an array with the selected item's text.
     */
    public Object[] getSelectedValues() {
        Object[] output = new Object[selection.size()];

        for (int i = 0; i < selection.size(); i++) {
            output[i] = ((ClickableIcon) selection.get(i)).getText();
        }

        return output;
    }

    /**
     * Returns the selected <code>ClickableIcon</code>.
     *
     * @return the selected <code>ClickableIcon</code>; null if no object is selected.
     */
    protected Object getSelectedIcon() {
        Object selected = null;
        if (selection.size() != 0) {
            selected = ((ClickableIcon) selection.get(0));
        }
        return selected;
    }

    /**
     * Returns an array with the selected <code>ClickableIcon</code>s.
     *
     * @return an array with the selected <code>ClickableIcon</code>s.
     */
    protected ClickableIcon[] getSelectedIcons() {
        ClickableIcon[] output = new ClickableIcon[selection.size()];

        for (int i = 0; i < selection.size(); i++) {
            output[i] = (ClickableIcon) selection.get(i);
        }

        return output;
    }

    /**
     * Returns the number of selected items.
     *
     * @return the number of selected items.
     */
    public int countSelected() {
        return selection.size();
    }

    /**
     * Returns an array with the index of the selected items.
     *
     * @return an array with the index of the selected items.
     */
    public int[] getSelectedIndices() {
        int[] output = new int[selection.size()];

        for (int i = 0; i < selection.size(); i++) {
            output[i] = ((ClickableIcon) selection.get(i)).getIndex();
        }

        return output;
    }

    /**
     * Clears the selected items.
     */
    public void clearSelection() {
        for (Iterator it = selection.iterator(); it.hasNext();) {
            ((ClickableIcon) it.next()).setSelection(false);

            // for (int i = 0; i < selection.size(); i++) {
            // ((ClickableIcon) selection.get(i)).setSelection(false);
        }

        selection.clear();
        fireSelectionChanged();
    }

    /**
     * Selects the item at the position.
     *
     * @param pos the point to find the item for.
     * @param mode selection mode
     *            <ul>
     *            <li>0 - single selection, all previous items are deselected.
     *            <li>1 - multiple selection, previous selected items are still selected.
     *            </ul>
     */
    private void select(Point pos, int mode) {
    	this.requestFocus();
        Object clicked;
        ClickableIcon aktIcon;

        clicked = getComponentAt(pos);

        if (clicked instanceof ClickableIcon) {
            aktIcon = (ClickableIcon) clicked;

            switch (mode) {
            default:
            case (0):
                clearSelection();
                selection.add(aktIcon);
                aktIcon.setSelection(true);

                break;

            case (1):
                if (selection.contains(aktIcon)) {
                    selection.remove(aktIcon);
                    aktIcon.setSelection(false);
                } else {
                    selection.add(aktIcon);
                    aktIcon.setSelection(true);
                }

                break;
            }
        } else {
            if (mode == 0) {
                clearSelection();
            }
        }

        fireSelectionChanged();

        revalidate();
        repaint();
    }

    /**
     * Adds a selection listener.
     *
     * @param listener the listener to add.
     */
    public void addIconPanelSelectionListener(IconPanelSelectionListener listener) {
        selectionListener.add(listener);
    }

    /**
     * Removes the selection listener.
     *
     * @param listener the listener to remove.
     */
    public void removeIconPanelSelectionListener(IconPanelSelectionListener listener) {
        selectionListener.remove(listener);
    }

    /**
     * Notifies the selection listener that an item has been selected.
     */
    private void fireSelectionChanged() {
        int[] newSelection = getSelectedIndices();

        for (int i = 0; i < selectionListener.size(); i++) {
            ((IconPanelSelectionListener) selectionListener.get(i)).selectionChanged(newSelection);
        }
    }

    /**
     * Returns the tooltip for the icon under the mouse.
     * Since this parent panel is handling all mouse listening, it must also
     * manage the tooltip retrieving. This method locates the component under the mouse
     * and returns its tooltip.
     * @param event the mouse event.
     * @return the tooltip of the icon under the mouse; otherwise it returns the panels tooltip.
     */
    public String getToolTipText(MouseEvent event) {
        String panelTooltip = getToolTipText();
        Object clicked = getComponentAt(event.getPoint());

        if (clicked instanceof ClickableIcon) {
            panelTooltip = ((ClickableIcon) clicked).getToolTip();
        }

        return panelTooltip;
    }

    /**
     * Enables if this component should support drag and drop actions.
     *
     * @param enabled if DnD is enabled or not.
     */
    public void setDragEnabled(boolean enabled) {
        dragAndDropEnabled = enabled;
    }

    /**
     * Tries to initiate a drag and drop action.
     * @param icon the icon that is to copied or moved.
     * @param currentEvent the latest mouse event.
     */
    private void initiateDragAndDrop(ClickableIcon icon, MouseEvent currentEvent) {
        if (dragAndDropEnabled) {
            TransferHandler handler = getTransferHandler();
            if (handler != null) {

                int action = handler.getSourceActions(icon);
                if (action == TransferHandler.COPY_OR_MOVE) {

                    int ctrlMask = InputEvent.CTRL_DOWN_MASK;
                    if ((currentEvent.getModifiersEx() & ctrlMask) == ctrlMask) {
                        action = TransferHandler.COPY;
                    } else {
                        action = TransferHandler.MOVE;
                    }
                }
                handler.exportAsDrag(this, currentEvent, action);
            }
        }
    }

    /**
     * Internal mosue listener class.
     *
     * @author redsolo
     */
    private class MousePanelListener extends MouseInputAdapter {

        /** Mouse event to determine when the DnD action has started or not. */
        private MouseEvent firstMouseEvent;

        /** Flag for the mouse click to determine if it was a DnD action or not. */
        private boolean isDndAction = false;

        /**
         * Saves of the start event if it is a mouse motion action.
         *
         * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
         */
        public void mousePressed(MouseEvent event) {
            firstMouseEvent = event;
        }

        /**
         * Starts a drag and drop action.
         *
         * @see MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
         */
        public void mouseDragged(MouseEvent event) {

            if ((dragAndDropEnabled) && (firstMouseEvent != null)) {
                JComponent component = (JComponent) getComponentAt(firstMouseEvent.getX(), firstMouseEvent.getY());

                if (component instanceof ClickableIcon) {
                    ClickableIcon icon = (ClickableIcon) component;

                    if (!icon.isSelected()) {
                        if (event.isControlDown()) {
                            select(event.getPoint(), 1);
                        } else {
                            select(event.getPoint(), 0);
                        }
                    }

                    event.consume();

                    int dx = Math.abs(event.getX() - firstMouseEvent.getX());
                    int dy = Math.abs(event.getY() - firstMouseEvent.getY());

                    //Arbitrarily define a 5-pixel shift as the
                    //official beginning of a drag.
                    if (dx > 5 || dy > 5) {
                        initiateDragAndDrop(icon, event);
                        isDndAction = true;
                    }
                }
            }
        }

        /**
         * Selects the item under the mouse, or starts the double click action.
         *
         * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
         */
        public void mouseClicked(MouseEvent event) {
            if (((event.getModifiers() & MouseEvent.BUTTON1_MASK) != 0) && (!isDndAction)) {
                if ((countSelected() == 0) || (!event.isControlDown())) {
                    select(event.getPoint(), 0);
                    if (event.getClickCount() >= 2) {
                        if (doubleClickAction != null) {
                            doubleClickAction.actionPerformed(new ActionEvent(IconPanel.this, 0, "double-click"));
                        }
                    }
                } else {
                    select(event.getPoint(), 1);
                }
            }
            isDndAction = false;
        }

        /**
         * Dummy implementation.
         * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
         */
        public void mouseReleased(MouseEvent e) {
            firstMouseEvent = null;
        }
    }
}
