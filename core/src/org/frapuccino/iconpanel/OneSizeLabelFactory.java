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

/**
 * Factory class used by the OneSizeLabel component so all labels are of the same width.
 * @author fdietz
 * @author redsolo
 */
final class OneSizeLabelFactory {

    private Dimension preferredSize;

    private int labelMaxWidth;

    /**
     * Creates a new factory.
     * @param maxWidth the maximum width.
     */
    public OneSizeLabelFactory(int maxWidth) {
        this.labelMaxWidth = maxWidth;
        preferredSize = new Dimension(-1, -1);
    }

    /**
     * Creates a returns a new OneSizeLabel component.
     * @param text the text for the label.
     * @return a OneSizeLabel.
     */
    public OneSizeLabel createLabel(String text) {
        return new OneSizeLabel(this, text);
    }

    /**
     * Returns the maximum width of the OneSizeLabels.
     * @return the maximum width of the OneSizeLabels.
     */
    public int getMaxWidth() {
        return labelMaxWidth;
    }

    /**
     * Returns the preferred size of the OneSizelabels.
     * @return the preferred size of the OneSizelabels.
     */
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    /**
     * Sets a new maximum width.
     * @param width the new maximum width.
     */
    public void setMaxWidth(int width) {
        if (width < preferredSize.width) {
            preferredSize.width = width;
        }

        labelMaxWidth = width;
    }

    /**
     * Sets the new dimension for all icons.
     * The dimensions width can not be larger than the maximum width.
     * @param dimension the new dimension.
     */
    public void setPreferredSize(Dimension dimension) {
        preferredSize = dimension;

        if (preferredSize.width > labelMaxWidth) {
            preferredSize.width = labelMaxWidth;
        }
    }

    /**
     * Resets the preferred size.
     */
    public void reset() {
        preferredSize = new Dimension(-1, -1);
    }
}
