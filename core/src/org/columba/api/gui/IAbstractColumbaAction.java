package org.columba.api.gui;

import org.columba.api.gui.frame.IFrameMediator;

public interface IAbstractColumbaAction {

  /**
   * special label for toolbar buttons which is smaller
   * than the regular label
   *
   * Example: Reply to Sender -> Reply
   *
   */
  public static final String TOOLBAR_NAME = "ToolbarName";

  /**
   * The toolbar uses the large icon, whereas menuitems
   * use the small one.
   *
   */
  public static final String LARGE_ICON = "LargeIcon";

  /**
   * JavaHelp topic ID
   */
  public static final String TOPIC_ID = "TopicID";

  /**
   * Returns the frame controller
   *
   * @return FrameController
   */
  IFrameMediator getFrameMediator();

  /**
   * Sets the frameMediator.
   *
   * @param frameMediator
   */
  void setFrameMediator(IFrameMediator frameController);

  /**
   * Return true if toolbar text should be visible
   *
   * @return boolean        true, if toolbar text should be enabled, false otherwise
   *
   */
  boolean isShowToolBarText();

  /**
   * Sets whether the toolbar text should be visible or not.
   *
   * @param showToolbarText
   */
  void setShowToolBarText(boolean showToolbarText);

}