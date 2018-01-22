/**
 * Interface for the storage related classes
 */
package org.xendra.apps.form.kanban;

import java.util.List;


/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public interface DataStorage {
	public List<FCData> loadFCData();
	public void saveFCData(List<FCData> fcData);
	public void updateFCData(List<FCData> fcData);
	public void deleteFCData(List<FCData> fcData);
}
