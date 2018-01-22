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

import javax.swing.JLabel;

/**
 * Label that is placed under the @link org.columba.mail.gui.attachment.util.ClickableIcon.
 * The JLabel uses the {@link org.columba.mail.gui.attachment.Gui.OneSizeLabelFactory}  to
 * keep the same size for all labels.
 *
 * @author fdietz
 * @author redsolo
 */
final class OneSizeLabel extends JLabel {

    private OneSizeLabelFactory labelFactory;

    /**
     * @param factory the factory to use when determining the preferred size.
     * @param text the text to place in the label.
     */
    public OneSizeLabel(OneSizeLabelFactory factory, String text) {
        super(text);
        this.labelFactory = factory;
        adjustSize();
    }

    /**
     * Adjusts the size of this component.
     * Make sure that the factory is having the largest preferred width.
     */
    public void adjustSize() {
        Dimension mySize = super.getPreferredSize();

        if ((mySize != null) && (mySize.width > labelFactory.getPreferredSize().width)) {
            labelFactory.setPreferredSize(mySize);
        }
    }

    /** {@inheritDoc} */
    public Dimension getPreferredSize() {
        return labelFactory.getPreferredSize();
    }

    /** {@inheritDoc} */
    public void setPreferredSize(Dimension arg0) {
        labelFactory.setPreferredSize(arg0);
    }
}
