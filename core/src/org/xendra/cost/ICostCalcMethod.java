package org.xendra.cost;

import java.util.ArrayList;

/**
 *  Interface that defines the methods requiered for the 2 cost methods
 *  of cost calculation supported.
 *  
 *  @author carana
 */
public interface ICostCalcMethod {

	/**
	 * Prepare the calculation data and return the list of all the products
	 * ids requiered to be processed.
	 * 
	 * Before begin the calculation we need to preload some data like warehouses
	 * the cost element id for the costing method , the costing precision , etc.
	 * 
	 * @param  iTipo - 0 para casos normales no incluyen P+ , 1 - Para buscar y procesar solo los P+
	 * @return Integer[] with the list of the products to process or null if
	 *         something goes wrong or there are not products to process (near
	 *         to imposible).
	 */
	public abstract ArrayList<Integer> prepareCalc();

	/**
	 * Call to clean up the calculation instance.
	 */
	public abstract void clean();

	/**
	 * Process the cost for the product.
	 * 
	 * @param m_product_id the id of the product to process.
	 * @return true if the process for the product went ok.
	 */
	public abstract String processCosts(int m_product_id, Boolean force);

	public abstract String getLog();
	public abstract void rePost();		
	public abstract String getTrxName();
	public abstract String Initialize();

	public abstract void setForcePeriod(boolean forcePeriod);
	
	public abstract void setCalculateCost(boolean costed);

	public abstract void setCalculateStock(boolean calculateStock);

	public abstract boolean isSendToEnd();

	public abstract void setAD_Client_ID(int ad_Client_ID);
}