package org.compiere.apps.form;

/*
 * (swing1.1beta3)
 * 
 */

import java.awt.*;

/**
 * @version 1.0 11/22/98
 */

public interface CellAttribute {

  public void addColumn();

  public void addRow();

  public void insertRow(int row);

  public Dimension getSize();

  public void setSize(Dimension size);


}