package org.columba.core.context.api;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.api.plugin.IExtensionInterface;
import org.columba.core.context.semantic.api.ISemanticContext;

public interface IContextProvider extends IExtensionInterface{
	
	/**
	 * Returns technical name. Should be unique.
	 * @return
	 */
	public String getTechnicalName();
	
	/**
	 * Return provider human-readable name
	 * @return
	 */
	public String getName();
	
	/**
	 * Return provider human-readable description
	 * @return
	 */
	public String getDescription();
	
	/**
	 * Return provider icon
	 * @return
	 */
	public ImageIcon getIcon();
	
	/**
	 * Return total number of search results. Method only returns valid result after calling
	 * <code>query</code> first.
	 * 
	 * @return	total number of search results. <code>-1</code>, in case <code>query</code> was not called, yet
	 */
	public int getTotalResultCount();
	
	public void search(ISemanticContext context, int startIndex, int resultCount);
	
	public void showResult();
	
	public void clear();
	
	public JComponent getView();
	
	public boolean isEnabledShowMoreLink();
	
	public void showMoreResults(IFrameMediator mediator);
	
}
