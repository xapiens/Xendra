package org.columba.core.tagging.api;

import java.util.Hashtable;
import java.util.Iterator;

import org.columba.api.exception.StoreException;

/**
 * Providers CRUD operations for <code>ITag</code>.
 * 
 * @author mhub
 * @author fdietz
 */
public interface ITagManager {

	/**
	 * Add tag with given name.
	 * 
	 * @param name
	 * @return
	 * @throws StoreException
	 */
	ITag addTag(String name) throws StoreException;
	
	/**
	 * Retrieve tag with specified id.
	 * 
	 * @param id
	 * @return
	 */
	ITag getTag(String id);
	
	/**
	 * Get iterator of all tags.
	 * @return
	 */
	Iterator<ITag> getAllTags();
	
	/**
	 * Update all changes in tag.
	 * 
	 * @param tag
	 * @throws StoreException
	 */
	void replaceTag(ITag tag) throws StoreException;
	
	/**
	 * Delete tag with given id.
	 * 
	 * @param id
	 * @throws StoreException
	 */
	void removeTag(String id) throws StoreException;
	

	/**
	 * Add listener for changes in tags.
	 */
	public void addTagListener(ITagListener l);
	
	/**
	 * Remove listener for changes in tags.
	 * @param l
	 */
	public void removeTagListener(ITagListener l);
}
