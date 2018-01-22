/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.xendra.cost;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MAttributeSetInstance;
import org.compiere.model.MCostCalc;
import org.compiere.model.MCostElement;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.MStorage;
import org.compiere.model.MTable;
import org.compiere.model.MYear;
import org.compiere.model.PO;
import org.compiere.model.persistence.X_M_MovementLine;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.util.Util;

/**
 * Class to process the global average cost for products.
 * 
 * @author carana 24-09-2010 Support for product returns.
 * redesigned by xapiens
 */

public class CostAverageCalc implements ICostCalcMethod {
	private Properties m_ctx = null;
	private int m_product_id = 0;
	private String m_trxName = null;
	private String p_Error = "";
	private MCostElement costElement = null;
	private int m_costingPrecision = 2;
	private static final boolean DEBUG = false;
	private Boolean m_fromBeginning = false;
	private StringBuffer m_log = null;
	private ArrayList<invalidEntries> InvalidEntries = new ArrayList<invalidEntries>();
	private ArrayList<Vector> costprec = new ArrayList<Vector>();
	private int DefaultCurrency;
	private Timestamp m_CostedFrom;
	private invalidEntries ie;
	SimpleDateFormat m_dateFormat = DisplayType.getDateFormat(DisplayType.Date, Env.getLanguage(Env.getCtx()),"yyyy-MM-dd");
	private boolean m_calculateCost = false;
	private boolean m_forcePeriod = false;
	private boolean m_calculateStock;
	private int C_Calendar_ID;
	private List<Integer> products = new ArrayList<Integer>();
	private boolean SendToEnd = false;
	private boolean CostCalculateWhenNotFound = true;
	private int m_AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());

	/** Logger */
	private static CLogger log = CLogger.getCLogger(CostAverageCalc.class);

	/**
	 * Constructor for the calculation data. Important : The ctx need to contain
	 * the client ID
	 * 
	 * @param ctx
	 * @param ad_org_id
	 *            Because one client_id can have many subsidiaries represented
	 *            by ad_org_id , we need the specific org id to process.
	 *            Remember that each org can have one or more warehouses.
	 * @param m_product_id
	 *            if this is 0 prepare for process all products otherwise this
	 *            id will be used for process only that product.
	 * @param costingMethod
	 *            the costing method. Defined in MCostElement for example
	 *            MCostElement.COSTINGMETHOD_AveragePO
	 * @see MCostElement
	 */
	public CostAverageCalc(Properties ctx, int ad_org_id, int product_id,
			int m_CostElement_ID, int m_costingPrecision, Timestamp CostedFrom, Boolean Force, String trxName ) {
		super();
		MAcctSchema[] ass = MAcctSchema.getClientAcctSchema(ctx, Env.getAD_Client_ID(ctx));
		MCurrency currency = MCurrency.get(Env.getCtx(), ass[0].getC_Currency_ID());
		DefaultCurrency = currency.getC_Currency_ID();
		addCurrency(currency);
		this.m_ctx = ctx;
		costElement = new MCostElement(Env.getCtx(), m_CostElement_ID, null);
		this.m_costingPrecision = m_costingPrecision;
		this.m_product_id = product_id;
		//this.m_ad_client_id = Env.getAD_Client_ID(ctx);
		if (CostedFrom == null)
		{
			this.m_CostedFrom = ass[0].getCostedFrom();
		}
		else if (CostedFrom.compareTo(ass[0].getCostedFrom()) < 0)			
			this.m_CostedFrom = ass[0].getCostedFrom();
		else
			this.m_CostedFrom = CostedFrom;
		m_fromBeginning = Force;
		m_trxName = trxName;
		m_log = new StringBuffer(Env.getContext(Env.getCtx(), "CostLog"));
	}

	private void addCurrency(MCurrency currency) {
		Vector vct = new Vector();
		vct.add(currency.getC_Currency_ID());
		vct.add(currency.getCostingPrecision());		
		costprec.add(vct);		
	}

	/**
	 * Prepare the data for calculation , especifically get the cost element id
	 * for the method and get all the products actually involved with kardex
	 * movements.
	 * 
	 * @param iTipo
	 *            - 0 para casos normales no incluyen P+ ,
	 *            - 1 Para buscar y  procesar solo los P+
	 * @return Integer[] with the product ids to be processed or null if not
	 *         exist products to process or an erro happens.
	 * 
	 * @see org.xendra.cost.ICostCalcMethod#prepareCalc()
	 */
	public ArrayList<Integer> prepareCalc() {
		//Integer[] products = null;
		ArrayList<Integer> lproducts = null;
		try {			
			// 1 Get the cost element id based on the costing method.
			// obsolete
			// 2 Get the necessary products to process.
			// Nota : porque lo hago por producto , ya que como es un proceso
			// largo
			// si primero hago el query total ordenado por producto , puede y
			// sucedera
			// que mientra proceso los primeros muchos de los otros productos
			// estaran sufriendo ingresos o
			// salidas , al hacerlo de esta manera tengo mas oportunidad que
			// cada vez que proceso coja
			// la mayor cantidad de movimientos para cada producto.
			if (this.m_product_id > 0) { // && iTipo == Costing.AvgAllProductsWithoutProduction) {
				lproducts = new ArrayList<Integer>(1);
				lproducts.add(this.m_product_id);			
			} else {
				lproducts = (ArrayList<Integer>) getProductsWithMovement();
			}
			//if (lproducts != null && lproducts.size() > 0) {
			//	products = lproducts.toArray(new Integer[0]);
			//}
		} catch (Exception e) {
			log.log(Level.SEVERE,
					"CostAverageCalc::prepare() cant prepare cost data ", e);
		} finally {
			// Cleanup
			//if (lproducts != null)
			//	lproducts.clear();
			//lproducts = null;
		}
		return lproducts;
	}

	/**
	 * Cleanup
	 * 
	 * @see org.xendra.cost.ICostCalcMethod#clean()
	 */
	public void clean() {
		m_ctx = null;
	}

	
	/**
	 * Process the cost for the product id specified, get all the kardex
	 * assoicated movements and process each one.
	 * 
	 * Precondition , call to prepare() method.
	 * 
	 * @see org.xendra.cost.ICostCalcMethod#processCosts(int)
	 */
	public String processCosts(int m_product_id, Boolean force) {
		// prerequisites
		// esta definido un calendario en cliente ?
		SendToEnd = false;
		String sql = "";
		Statement pstmt = null;
		ResultSet rs = null;
		Statement ps = null;
		ResultSet rset = null;
		KardexEntry kentry = new KardexEntry();
		MCostCalc m_cost = null;
		boolean ok = true;
		BigDecimal oldStock;
		BigDecimal oldCost;
		BigDecimal oldInCost;
		BigDecimal StockToDate = Env.ZERO;		
		boolean isInputMovement = false;
		int count = 0;
		boolean deferCreate = true;
//		Trx trx = null;
		try {
			if (m_product_id > 0) {

				sql = "select count(*),sum(case when movementtype = 'P+' then 1 else 0 end) from m_carding  " ;
				if (m_fromBeginning)
				{			
					sql += "join m_product ON m_carding.m_product_id = m_product.m_product_id join ad_table " +
					"ON m_carding.ad_table_id = ad_table.ad_table_id " +
					"WHERE m_carding.m_product_id = "
					+ m_product_id
					+ " and m_carding.ad_client_id="
					+ m_AD_Client_ID;
					if (m_calculateCost)
					{
						sql += " AND (( m_carding.iscosted = 'N' OR COALESCE(m_carding.iscosted,'N') = 'N') "					
						+ " OR movementdate >= '"+m_dateFormat.format(m_CostedFrom)+"') ";
					}
					else
					{
						sql += " AND movementdate >= '"+m_dateFormat.format(m_CostedFrom)+"' ";						
					}
				}
				else
				{
					sql += "join m_product ON m_carding.m_product_id = m_product.m_product_id join ad_table " +
					"ON m_carding.ad_table_id = ad_table.ad_table_id " +
					"WHERE m_carding.m_product_id = "
					+ m_product_id
					+ " and m_carding.ad_client_id="
					+ m_AD_Client_ID
					+ " AND ( m_carding.iscosted = 'N' OR COALESCE(m_carding.iscosted,'N') = 'N') "
					+ " AND movementdate >= '"+m_dateFormat.format(m_CostedFrom)+"' ";
				}
				ps = DB.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY,m_trxName);
				rset = ps.executeQuery(sql);
				rset.next();
				int TotalToProcessed = rset.getInt(1);
				int InputForProduction = rset.getInt(2);
				if (InputForProduction > 0 && !force)
				{
					sql = "select distinct m_product_id from m_productionline  where m_productionplan_id in " ;
					sql += "(select m_productionplan_id from m_productionline where m_product_id = " + m_product_id+" AND movementqty > 0 )";
					sql += " and m_product_id != " + m_product_id;
					//pstmt = DB.createStatement();
					rset = ps.executeQuery(sql);
					while (rset.next())
					{
						int ProductSource = rset.getInt(1);
						if (!products.contains(ProductSource))
						{
							SendToEnd = true;
							break;
						}
					}
					if (SendToEnd)
					{
						return "";
					}
				}				
//				if (m_trxName == null)
//					m_trxName = Util.getUUID();
//				trx = Trx.get(m_trxName, true);		
//				trx.start();
				//StockToDate = DB.getQLValueBD(trx.getTrxName(), "SELECT sum(qtysource) from m_stock where m_product_id = ? AND movementdate <= ?",m_product_id,m_CostedFrom);					
				StockToDate = Env.ZERO; // no deberia existir stock anterior  a la fecha del corte.
				m_cost = new MCostCalc(m_ctx, 0, m_trxName);
				m_cost.setM_Product_ID(m_product_id);
				m_cost.setAD_Org_ID(0);
				m_cost.setM_CostElement_ID(costElement.getM_CostElement_ID());
				m_cost.setIsActive(true);
				m_cost.setIsCostedOk(true);
				m_cost.setM_Warehouse_ID(0);
				if (!m_fromBeginning)
				{
					// Busco la ultima entrada de costos valida para dicho producto
					// y tipo de costo.
					// De acuerdo a esto busco la siguientes entradas en m_carding
					// posteriores
					// al ultimo costeo valido				
					pstmt = DB.createStatement();
					rs = pstmt
					.executeQuery("SELECT * from m_costCalc WHERE m_costcalc_id = "
							+ "(select max(m_costcalc_id) from m_costCalc where m_product_id = "
							+ m_product_id
							+ " and ad_client_id ="
							+ m_AD_Client_ID
							+ " and ad_org_id=0 and m_costelement_id ="
							+ costElement.getM_CostElement_ID()
							+ " and ismanual = 'N')");								

					if (rs.next()) {					
						m_cost = new MCostCalc(m_ctx, rs, m_trxName);
						//Timestamp LastDateinCalc = m_cost.getOMovementDate() == null ? m_cost.getMovementDate() : m_cost.getOMovementDate();
						Timestamp LastDateinCalc = m_cost.getMovementDate().compareTo(m_cost.getOMovementDate()) == 1 ? m_cost.getMovementDate() : m_cost.getOMovementDate();
						BigDecimal StockInCalc = m_cost.getStock();			
						if (StockInCalc == null)
							StockInCalc = BigDecimal.ZERO;
						StockToDate = DB.getSQLValueBD(m_trxName, "SELECT sum(qtysource) from m_stock where m_product_id = ? AND movementdate <= ?",m_product_id,LastDateinCalc);
						if (StockToDate == null)
							StockToDate = BigDecimal.ZERO;
						// como estamos calculando un costo por alguna razon , pudiera ocurrir
						// que el saldo a la fecha no sea el correcto, asi que recalculamos el mismo y comparamos					 					
						if (StockInCalc.compareTo(StockToDate) != 0)
						{											
							m_cost.setStock(StockToDate);
							m_cost.save();
						}
						// PArche 25/03/2011
						// En el caso de reclaculo parcial y el siguiente a procesar
						// es un input
						// y el anterior era un input.
						// Pero si existe uno quiere decir que es un input
						// por ende si el que sigue es un input debera crearse un
						// nuevo
						// record en costcalc , por lo tanto defercreate debe entrar
						// en false.
						deferCreate = false;
					}
					rs.close();
					pstmt.close();					
				}

				if (m_fromBeginning)
				{			
					if (m_forcePeriod)
						sql = "select true as isperiodopen, ";
					else						
						sql = "select xendra.isperiodopen(c_doctype_id, dateacct, m_carding.ad_org_id, m_carding.ad_client_id) as isperiodopen, ";					
					sql += "ad_table.tablename, " +
					"m_product.name as productname, " +
					"m_carding.* from m_carding  " +
					"join m_product ON m_carding.m_product_id = m_product.m_product_id join ad_table " +
					"ON m_carding.ad_table_id = ad_table.ad_table_id " +
					"WHERE m_carding.m_product_id = "
					+ m_product_id
					+ " and m_carding.ad_client_id="
					+ m_AD_Client_ID;
					if (m_calculateCost)
					{
						sql += " AND (( m_carding.iscosted = 'N' OR COALESCE(m_carding.iscosted,'N') = 'N') "					
						+ " OR movementdate >= '"+m_dateFormat.format(m_CostedFrom)+"') ";
					}
					else
					{
						sql += " AND movementdate >= '"+m_dateFormat.format(m_CostedFrom)+"' ";						
					}
					sql += " order by m_carding.movementdate";					
				}
				else
				{
					if (m_forcePeriod)
						sql = "select true as isperiodopen, ";
					else
						sql = "select xendra.isperiodopen(c_doctype_id, dateacct, m_carding.ad_org_id, m_carding.ad_client_id) as isperiodopen, ";
					sql += "ad_table.tablename, " + 
					"m_product.name as productname, " +
					"m_carding.* from m_carding  " +
					"join m_product ON m_carding.m_product_id = m_product.m_product_id join ad_table " +
					"ON m_carding.ad_table_id = ad_table.ad_table_id " +
					"WHERE m_carding.m_product_id = "
					+ m_product_id
					+ " and m_carding.ad_client_id="
					+ m_AD_Client_ID
					+ " AND ( m_carding.iscosted = 'N' OR COALESCE(m_carding.iscosted,'N') = 'N') "
					+ " AND movementdate >= '"+m_dateFormat.format(m_CostedFrom)+"' "
					+ " order by m_carding.movementdate";
				}
				pstmt = DB.createStatement();
				rs = pstmt.executeQuery(sql);
				// Do the product cost process for each inventory movement
				int TotalProcessed = 0;
				count = 0;
				int oldpercent = 0;
				while (rs.next() && ok) {
					ok = false;
					p_Error = kentry.setup(rs);
					if (p_Error != null)
					{
						throw new Exception (p_Error);
//						trx.rollback();
//						trx.close();
//						return p_Error;
					}
					isInputMovement = kentry.isInput();
					if ((count == 0 && !isInputMovement) || kentry.isTransfer()) {
						deferCreate = true;
					}
					else
					{
						deferCreate = false;
					}
					// reset the id
					// Check if all the previous entries from the beginning
					// are out inventory and only create when is input
					// inventory,
					if (isInputMovement) {
						if (!deferCreate) {
							oldStock = m_cost.getStock();							
							oldCost = m_cost.getCost();
							oldInCost = m_cost.getInCost();
							m_cost = null;

							// Aqui ya se debe haber grabado al menos el primer entry de costcalc
							// y se inicia un nuevo grupo.
							// hacemos commit y reiniciamos transaccion.
//							trx.commit();

							m_cost = MCostCalc.get(kentry.getTable_id(),kentry.getRecord_id(), kentry.getMaster_ID(), kentry.getParent_ID(), m_trxName);							
							m_cost.setStock(oldStock);
							m_cost.setCost(oldCost);
							m_cost.setInCost(oldInCost);
							//
							m_cost.setM_Product_ID(m_product_id);
							m_cost.setAD_Org_ID(0);
							m_cost.setM_CostElement_ID(costElement.getM_CostElement_ID());
							m_cost.setIsActive(true);
							m_cost.setIsCostedOk(true);
							m_cost.setM_Warehouse_ID(0);							
							oldStock = null;
							oldCost = null;
						}
						deferCreate = false;
					}
					count++;
					p_Error = processProductCost(kentry, m_cost); 
					if (p_Error.length() == 0) {
						// Put not posted in each involved origin document.
						if (invalidateMovement(kentry, m_trxName)) {
							// Update for an output and add for an input
							// but if only exist outs also add.
							// redundante
							//saveCostEntry(m_cost, kentry);
							ok = true;
//							trx.commit();
						}
						TotalProcessed++;
						int percent = (int) (((float) TotalProcessed/TotalToProcessed)*100);
						if (percent != oldpercent)
						{
							oldpercent = percent;
							System.out.println("..."+percent+'%');
						}
						
					}
					else
					{
//						trx.rollback();
						throw new Exception(p_Error);
					}
				}
				if (TotalToProcessed != TotalProcessed)
				{
					System.out.println("no se completo");
				}
				else
				{
					products.add(m_product_id);
				}
				if (count == 0) {
				}
			}
		} catch (Exception e) {
			log.log(Level.SEVERE,
					"CostAverageCalc:processCosts() -Cant process cost for product : "
					+ m_product_id + " , Executing sql : " + sql, e);
		} finally {
			sql = null;
			// Cleanup
			kentry = null;
			m_cost = null;
			// Cleanup
			DB.close(rs, pstmt);
			DB.close(rset, ps);
			rs = null;
			pstmt = null;
			rset = null;
			ps = null;			
//			if (trx != null) {
//				// trx defined and save point defined , well some records
//				// processed.
//				//if (spoint != null) {
//				if (ok)
//					trx.commit();
//				else {
//					try {
//						trx.rollback();
//					} catch (Exception spex) {
//						spex.printStackTrace();
//					}
//
//				}
//				//}
//				trx.close();
//				//spoint = null;
//				//				trx = null;
//			}
		}
		return p_Error;
	}

	public void rePost() 
	{		
		if (InvalidEntries != null && InvalidEntries.size() > 0)
		{
			Iterator it = InvalidEntries.iterator();
			while (it.hasNext())
			{
				invalidEntries ie  = ((invalidEntries)it.next());
				Timestamp acctDate = ie.getAcctdate();
				Integer C_DocType_ID = ie.getC_DocType_ID();
				MDocType dt = MDocType.get(Env.getCtx(), C_DocType_ID);
				if (acctDate == null)
				{
					System.out.println("la tabla "+MTable.get(Env.getCtx(), ie.getMaster_ID()).getName()+" en el registro "+ie.getParent_ID()+" no tiene fecha contable ");
				}
				else
				{
					MPeriod period = MPeriod.get(Env.getCtx(), acctDate, 0);					
					//MYear year = MYear.get(C_Calendar_ID, acctDate, null);
					if  (period.isOpen(dt.getDocBaseType(), acctDate))
					{
						MTable table = MTable.get(Env.getCtx(), ie.getMaster_ID());				
						String sql = "UPDATE " + table.getTableName()
						+ " SET Posted = 'N' ,Processing = 'N' "
						+ " WHERE " + table.getTableName()
						+ "_ID = " + ie.getParent_ID();
						DB.executeUpdate(sql, getTrxName());							
						sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID="+ie.getMaster_ID()+" AND Record_ID="+ie.getParent_ID();
						DB.executeUpdate(sql, getTrxName());							
						//p_Error = DocumentEngine.postImmediate(
						//		Env.getCtx(), Env.getAD_Client_ID(Env.getCtx()), ie.getMaster_ID(), ie.getParent_ID(), true, null);
					}
					else 
					{
						System.out.println(" periodo cerrado "+period);
					}						
				}
			}
		}
	}
	/**
	 * Delete al costs entries after the last correctly processed for an
	 * specific product and the costing method.
	 * 
	 * @param product_id
	 *            the protduct id of the product in process.
	 * @return true si fue ok.
	 */
	private final boolean deletInvalidCosts(int product_id) {
		String sql = "";
		boolean ok = false;

		try {
			// Delete al mcost and cost detail entries in m cost after
			// invalid flag is found.
			sql = "delete from m_costCalc where m_costcalc_id >= "
				+ "(select min(m_costcalc_id) from m_costCalc where iscostedok = 'N' and m_product_id="
				+ product_id + " and ad_client_id = " + m_AD_Client_ID
				+ " and ad_org_id=0 and m_costelement_id = "
				+ costElement.getM_CostElement_ID()+ ")" + " and ad_client_id = "
				+ m_AD_Client_ID + " and ad_org_id=0 and m_product_id="
				+ product_id + " and m_costelement_id = "
				+ costElement.getM_CostElement_ID();

			// This is a delete.
			int no = DB.executeUpdate(sql, null);
			m_log = m_log.append("borrado de costeos anteriores para "+product_id+"<br>");
			if ( no != -1 )
			{
				ok = true;
				m_log = m_log.append("fue un exito ("+no+") registro(s)<br>");
			}
			else
				m_log = m_log.append("fue un fracaso<br>");

		} catch (Exception e) {
			log.log(Level.SEVERE,
					"CostAverageCalc:setupMCost() -Cant setup MCost for product : "
					+ product_id + " - SQL: " + sql.toString(), e);
		} finally {
			// Cleanup
			sql = null;
		}
		return ok;
	}

	/**
	 * Do the cost calculation for the movement specified by kentry and put the
	 * result on m_cost.
	 * 
	 * @param kentry
	 *            Descriptor of the movement to be processed
	 * @param m_cost
	 *            Holder for the calculation
	 * @return true if its processed otherwise false.
	 */
	private final String processProductCost(KardexEntry kentry,
			MCostCalc m_cost) {

		BigDecimal oldCost = m_cost.getCost();
		BigDecimal oldStock = m_cost.getStock();
		BigDecimal oldInCost = m_cost.getInCost();
		BigDecimal newCost = null;
		BigDecimal newStock = null;
		BigDecimal newAmount = null;

		p_Error = "";
		//		if (oldStock.compareTo(Env.ZERO) < 0)
		//		{
		//			m_log = m_log.append(m_cost.getMovementDate()+" old Stock NEGATIVO (la operacion se cancela verifique el stock antes de procesar costo) : "+oldStock+"<br>");
		//			log.log(Level.SEVERE, kentry.getProduct_id() + " tiene stock negativo" + m_costingMethod);			
		//			return false;
		//		}
		try {
			// Is a costable document type , continue.
			if (kentry.getCosted()) {
				// is input of merchandise
				// no deberia considerar transferencia porque el monto es global.
				if (kentry.isInput() && !kentry.isTransfer()) {
					// has an order referenced?
					if (kentry.hasOrder() || kentry.isProduction()) {
						newStock = oldStock.add(kentry.getQtySource());

						// Check if is a return of products
						// In that case the date for the cost can be diferent of
						// the date of the movement otherwise we need to do the
						// normal process.
						if (kentry.isReturn()) {
							m_log = m_log.append("es una devolucion <br>");
							if (kentry.getCostDate().compareTo(
									kentry.getMovementDate()) != 0) {
								newCost = getReturnCost(kentry);

								// If is <= 0 whe had a problem , see the
								// MCostCalc
								// class.
								if (newCost.signum() <= 0 && m_calculateCost) {
									//addError(" el costo para "+kentry.getTable_id()+" ID :"+kentry.getRecord_id()+" es negativo");
									throw new Exception(p_Error);
								}
								// For inputs the cost is the purchase price
								m_cost.setInCost(newCost);
							} else {
								// If oldcost not -1 (because the previos entry
								// was a
								// merchandise return , then we use the old in
								// cost.
								if (oldCost.compareTo(new BigDecimal(-1)) != 0)
									m_cost.setInCost(oldCost);
								else {
									m_cost.setInCost(oldInCost);
									// Here the old cost is -1 , because a new
									// cost wil be determined (below)
									// the old cost need to be a valid one ,
									oldCost = m_cost.getInCost();
								}

								// Esto solo puede suceder cuando .
								// 1) Es una devolucion
								// 2) No existe ningun ingreso para el producto.
								// cuando? cuando es un producto que no tiene
								// historia
								// y que no tenia stock al iniciarse el sistema
								// , por lo tanto
								// no tiene registrado costo inicial.
								// Al ser devuelto no tiene que costo encontrar.
								// 3) La fecha de costo es igual a la fecha de
								// devolucion , osea
								// la orden por devolucion no hace referencia a
								// documento alguno.
								//
								// En este caso no queda otra que buscar el
								// ultimo costo valido.
								// pero previamente ingresar al costcalc una
								// entrada manual con dicho costo
								// para la fecha requerida.
								//
								if (oldCost.signum() == 0) {
									newCost = getReturnCost(kentry);
									// If is <= 0 whe had a problem , see the
									// MCostCalc
									// class.
									if (newCost.signum() <= 0 && this.m_calculateCost) {
										addError(" el costo para "+kentry.getTableName()+" ID :"+kentry.getRecord_id()+" es negativo");
										throw new Exception(p_Error);
									}

									m_cost.setInCost(newCost);									
									// Here the old cost is -1 , because a new
									// cost wil be determined (below)
									// the old cost need to be a valid one ,
									oldCost = m_cost.getInCost();
								}
							}
						} else {
							if (kentry.isProduction()) {
								m_log = m_log.append("es una produccion <br>");
								Statement pstmt = DB.createStatement();
								ResultSet rs = pstmt
								.executeQuery("select M_Product_ID, qtysource from m_carding where m_productionplan_id = "
										+ kentry.getProductionPlan_id()
										+ " AND movementtype = 'P-' ");
								//+ " and  m_product_id != "
								//+ kentry.getProduct_id());
								BigDecimal newPrice = Env.ZERO;
								BigDecimal newItemPrice = Env.ZERO; 	
								while (rs.next()) {
									int m_preproduct_id = rs.getInt("M_Product_ID");
									BigDecimal QtySource 	    = rs.getBigDecimal("QtySource");
									newItemPrice = costElement.getCostForProduct(
											kentry.getClient_id(),
											kentry.getOrg_id(),
											m_preproduct_id,
											kentry.getCostDate(), true,	false, kentry.isReturn(), m_trxName);
									if (newItemPrice.signum() <= 0 && CostCalculateWhenNotFound) {
										// si bien al jalar el costo y no encontrar nada calculamos , solo
										// si es una compra forzamos, pero en una venta no se fuerza
										// asi que forzamos x aca en produccion 1 vez mas, si aun asi 
										// no se puede caballero.
										CostAverageCalc ac = new CostAverageCalc(Env.getCtx(), 0, m_preproduct_id, costElement.getM_CostElement_ID() ,2, m_CostedFrom, true, m_trxName);
										ac.setAD_Client_ID(kentry.getClient_id());
										ac.setCalculateCost(getCalculateCost());
										ac.setCalculateStock(false);
										ac.setForcePeriod(getForcePeriod());
										ac.whenCostNotFoundCalculate(false);
										String m_error = ac.processCosts(m_preproduct_id, true);
										newItemPrice = costElement.getCostForProduct(
												kentry.getClient_id(),
												kentry.getOrg_id(),
												m_preproduct_id,
												kentry.getCostDate(), true,
												false, kentry.isReturn(), m_trxName);										
									}
									if (newItemPrice.signum() <= 0) {										
										log.log(Level.SEVERE,
												"processProductCost() -Cant calculate the product cost for : "
												+ kentry.getProduct_id() + " the component id = "+m_preproduct_id + " has invalid cost of "+newItemPrice.intValue(),
												MCostCalc.getTextError(newItemPrice.intValue(), null));
										newPrice = new BigDecimal(-1);
										break;

									} else {										
										newPrice = newPrice.add(newItemPrice.multiply(QtySource.abs()));										
									}

								}
								rs.close();
								pstmt.close();
								//
								if (newPrice.signum() > 0) {
									newPrice = newPrice.divide(kentry.getQtySource(),10, BigDecimal.ROUND_HALF_UP);
									m_cost.setInCost(newPrice);
								} else if (m_calculateCost) {
									addError(" el costo para "+kentry.getTableName()+" ID :"+kentry.getRecord_id()+" es negativo");
									throw new Exception(p_Error);									
								}
							} 
							else
							{
								if (kentry.getPrice() == null && this.m_calculateCost)
								{
									addError(" el costo para "+kentry.productName+" es nulo, esto es debido a que no existe el Tipo de cambio en "+kentry.getTableName()+" ID :"+kentry.getRecord_id());
								}
								else if (kentry.getPrice().compareTo(Env.ZERO) <= 0 && this.m_calculateCost) {
									addError(" el costo para "+kentry.productName+" en "+kentry.getTableName()+" ID :"+kentry.getRecord_id()+" es "+kentry.getPrice().toString());
									throw new Exception(p_Error);				
								}
								m_cost.setInCost(kentry.getPrice());
							}
						}

						// if newCost is not null its calculated in the previous
						// operation.

						// if (newCost == null) {

						// Global cost stuff
						// IOf not is return the kentry price is > 0
						newAmount = oldStock.multiply(oldCost).add(
								kentry.getQtySource().multiply(
										m_cost.getInCost()));
						newAmount = newAmount.setScale(m_costingPrecision,
								BigDecimal.ROUND_HALF_UP);
						if (oldStock.compareTo(Env.ZERO) >= 0)
						{
							newCost = newAmount.divide(
									oldStock.add(kentry.getQtySource()),
									BigDecimal.ROUND_HALF_UP);
						}
						else
						{
							newCost = m_cost.getInCost();
						}
						// For inputs the cost is the purchase price
						// if (!kentry.isReturn())
						// m_cost.setinCost(kentry.getPrice());
						// }

						// Update the MCost Record for the next exntry.
						m_cost.setStock(newStock);
						//System.out.println(kentry.getMovementDate().toString()+" i->"+newStock.toString());
						m_cost.setCost(newCost);
						m_log = m_log.append("old Stock: "+oldStock+" old Cost: "+oldCost+"new Amount: "+newAmount+" new Stock: "+newStock+" new Cost: "+newCost+"<br>");

					} else {
						// Update the MCost Record for the next exntry.
						m_cost.setStock(oldStock.add(kentry.getQtySource()));
						//System.out.println(kentry.getMovementDate().toString()+" o->"+m_cost.getStock().toString());
						m_log = m_log.append("(ID="+kentry.getOrder_id()+" C="+m_cost.getStock()+")");
						m_cost.setInCost(oldCost);
					}
					m_cost.setMovementDate(kentry.getMovementDate());
					m_cost.setParent_ID(kentry.getParent_ID());
					m_cost.setMaster_ID(kentry.getMaster_ID());					
					m_cost.setAD_Table_ID(kentry.getTable_id());
					m_cost.setRecord_ID(kentry.getRecord_id());

					if (m_calculateStock)
					{
						MStorage.add(Env.getCtx(),
								 kentry.getwarehouse_id(), 
								 kentry.getlocator_id(),
								 kentry.getProduct_id(), 
								 kentry.getAttributeSetInstance_ID(), 
								 0, 
								 kentry.getQtySource(),						
								 Env.ZERO, 
								 Env.ZERO, 
								 true, 
								 0,
								 //kentry.getTable_id(), kentry.getRecord_id(), 
								 "ingreso", m_trxName);
					}
				} else { // Output
					// Is a transfer? no new cost only set movement date
					// otherwise is an normal out of merchandise
					if (!kentry.isTransfer()) { // out
						// Update the MCost Record for the next exntry.						
						m_cost.setStock(oldStock.add(kentry.getQtySource()));
						//System.out.println(kentry.getMovementDate().toString()+" o->"+m_cost.getStock().toString());
						if ( m_cost.getStock().compareTo(Env.ZERO) < 0 )
						{						
							//throw new Exception(kentry.getProduct_id()+" "+kentry.getProductName()+" stock negativo en "+kentry.getTableName()+ " Record:"+ kentry.getRecord_id());
							System.out.println(m_dateFormat.format(kentry.getMovementDate())+" - "+kentry.getProduct_id()+" "+kentry.getProductName()+" stock negativo en "+kentry.getTableName()+ " Record:"+ kentry.getRecord_id());
						}
						m_log = m_log.append("(ID="+kentry.getOrder_id()+" C="+m_cost.getStock()+")");
						m_cost.setOMovementDate(kentry.getMovementDate());
						if (m_calculateStock)
						{
							Integer AttributeSetInstance_ID = DB.getSQLValue(null, "SELECT * FROM getancientattributesetinstance(?, ?, ?, ?)", kentry.getwarehouse_id(), kentry.getProduct_id(), kentry.getQtySource().abs(), kentry.getOrg_id());						
							MStorage.add(Env.getCtx(), 
									 kentry.getwarehouse_id(), 
									 kentry.getlocator_id(),
									 kentry.getProduct_id(), 
									 /*kentry.getAttributeSetInstance_ID()*/ AttributeSetInstance_ID,  
									 0, 
									 kentry.getQtySource(), 
									 Env.ZERO, 
									 Env.ZERO, 
									 true, 						
									 //kentry.getTable_id(), kentry.getRecord_id(), 
									 0,
									 "salida", m_trxName);
						}
					}
					else
					{
						if (m_calculateStock)
						{						
							m_cost.setOMovementDate(kentry.getMovementDate());
							MStorage.add(Env.getCtx(),
									 kentry.getwarehouse_id(), 
									 kentry.getlocator_id(),
									 kentry.getProduct_id(), 
									 kentry.getAttributeSetInstance_ID(),  
									 0, 
									 kentry.getQtySource(), 
									 Env.ZERO, 
									 Env.ZERO, 									 
									 true, 		
									 0,
									 //kentry.getTable_id(), kentry.getRecord_id(),
									 "traslado", m_trxName);
						}
					}
				}
			} else { // no costed document
				// Update the the current stock and last processed date for
				// in/out inventory.
				m_cost.setStock(oldStock.add(kentry.getQtySource()));				
				m_log = m_log.append("(ID="+kentry.getOrder_id()+" C="+m_cost.getStock()+")");

				if (kentry.isInput())
					m_cost.setMovementDate(kentry.getMovementDate());
				else
					m_cost.setOMovementDate(kentry.getMovementDate());
				
				if (m_calculateStock)
				{
					MStorage.add(Env.getCtx(),
							 kentry.getwarehouse_id(), 
							 kentry.getlocator_id(),
							 kentry.getProduct_id(), 
							 kentry.getAttributeSetInstance_ID(),  
							 0, 
							 kentry.getQtySource(), 
							 Env.ZERO, 
							 Env.ZERO, 
							 true, 		
							 0,
							 //kentry.getTable_id(), kentry.getRecord_id(),
							 "traslado", m_trxName);
				}
			}
			if (p_Error.length() == 0)
			{
				if (m_calculateCost)
				{
					if (m_cost.save())
						return p_Error;
				}
			}
			else
				throw new Exception(p_Error);
		} catch (Exception ex) {
			p_Error = ex.getMessage();
		} finally {
			oldCost = null;
			oldStock = null;
			newCost = null;
			newStock = null;
			newAmount = null;
		}
		return p_Error;
	}

	private void whenCostNotFoundCalculate(boolean b) {
		CostCalculateWhenNotFound  = b;		
	}

	public void addError(String error)
	{
		if (p_Error != null)
			p_Error = p_Error.concat(error);													
		else							
			p_Error = error;								
	}
	/**
	 * Retorna el costos para una devolucion
	 * 
	 * @param kentry
	 *            la entrada de carding a procesar
	 * @return el costo o -1 si es error
	 */
	private final BigDecimal getReturnCost(KardexEntry kentry) {
		BigDecimal newCost;
		// Get the cost for the date , this date allways
		// need to be
		// minor because
		newCost = costElement.getCostForProduct(kentry.getClient_id(),
				kentry.getOrg_id(), kentry.getProduct_id(),
				kentry.getCostDate(), false, false, kentry.isReturn, null);
		if (newCost.signum() <= 0) {
			newCost = costElement.getCostForProduct(kentry.getClient_id(),
					kentry.getOrg_id(), kentry.getProduct_id(), 
					kentry.getCostDate(), false, false, kentry.isReturn, m_trxName);
		}
		// If is <= 0 whe had a problem , see the
		// MCostCalc
		// class.
		if (newCost.signum() <= 0) {
			String error = costElement.getLastCostError();
			if (error != null && error.length() > 0)
			{
				addError(error);	
			}			
			//			log.log(Level.SEVERE,
			//					"processProductCost() -Cant calculate the product cost for : "
			//					+ kentry.getProduct_id(),
			//					MCostCalc.getTextError(newCost.intValue(), null));
			//			newCost = new BigDecimal(-1);
		}
		return newCost;
	}

	/**
	 * Clean the posted (accounting stuff) of the source movement record to
	 * allow to be reprocessed by the accounting process. Of course this update
	 * only have sense in a reprocessed record otherwise is a new record that
	 * already its not accounted.
	 * 
	 * @param kentry
	 *            current movement descriptor.
	 * @return true if all went ok otherwise false.
	 */
	private final boolean invalidateMovement(KardexEntry kentry, String trxName) {
		
		if (!m_calculateCost)
			return true;
		
		ie = new invalidEntries();
		ie.setMaster_ID(kentry.getMaster_ID());
		ie.setParent_ID(kentry.getParent_ID());
		ie.setAcctdate(kentry.getAcctDate());
		ie.setC_DocType_ID(kentry.getDocType_id());
		MTable table = MTable.get(Env.getCtx(), kentry.getTable_id());		
		InvalidEntries.add(ie);	
		boolean ok = false;
		String sql = "UPDATE " + table.getTableName()
		+ " SET isCosted = 'Y' "
		+ " WHERE " + table.getTableName()
		+ "_ID = " + kentry.getRecord_id(); 
		try {
			if (DB.executeUpdate(sql, trxName) != -1) {
				ok = true;
			} else {
				log.log(Level.SEVERE,
						"CostAverageCalc:invalidateMovements() -Cant invalidate movement for : "
						+ kentry.getProduct_id() + " and doc = "
						+ kentry.getDocType_id() + "/"
						+ kentry.getRecord_id()+ ", The movement or fact_acct associated cant be deleted");					
			}
		} catch (Exception ex) {
			log.log(Level.SEVERE,
					"CostAverageCalc:invalidateMovements() -Cant invalidate movement for : "
					+ kentry.getProduct_id() + " and doc = "
					+ kentry.getDocType_id() + "/"
					+ kentry.getRecord_id(), ex);
		} finally {
			sql = null;
		}
		return ok;
	}

	/**
	 * After get in merchandise we need to save a cost record.
	 * 
	 * @param m_cost
	 *            the calcularted cost entru to save.
	 * @param kentry
	 *            the descriptor for the last movement.
	 * @return
	 */
	private final boolean saveCostEntry(MCostCalc m_cost, KardexEntry kentry) {

		m_cost.setM_Product_ID(kentry.getProduct_id());
		m_cost.setAD_Org_ID(0);
		m_cost.setM_CostElement_ID(costElement.getM_CostElement_ID());
		m_cost.setIsActive(true);
		m_cost.setIsCostedOk(true);
		m_cost.setM_Warehouse_ID(0);

		boolean ok = m_cost.save(m_trxName);

		if (!ok) {
			log.log(Level.SEVERE,
					"CostAverageCalc::saveCostEntry() - Cant save a cost entry for product ID = "
					+ kentry.getProduct_id());
		}
		return ok;
	}

	/*---------------------------------------------------------------------------------
	 * UTILS
	 */

	/**
	 * Get all the products that have inventory movements , this will be
	 * associated to the client_id and not the org id. Also the products need to
	 * be costable.
	 * 
	 * @param iTipo
	 *            - 0 para casos normales no incluyen P+ , 1 - Para buscar y
	 *            procesar solo los P+
	 * @return a List<Integer> with the products ids or null on error or nothing
	 *         to process.
	 */
	private final List<Integer> getProductsWithMovement() {
		List<Integer> products_id = null;
		Statement pstmt = null;
		ResultSet rs = null;
		boolean onError = false;

		// Muy lento en DB de 2GB
		// String sql = "select distinct(m_product_id) from m_carding where ad_client_id = "+ m_AD_Client_ID;
		String sql = "select distinct(m_product_id) from m_product where iscostable='Y' AND IsActive='Y' order by 1  ";
		// Get products with movement.
		//
		try {
			pstmt = DB.createStatement();
			System.out.print("...");
			rs = pstmt.executeQuery(sql);
			// Do the product cost process for each one
			while (rs.next()) {
				if (products_id == null) {
					products_id = new ArrayList<Integer>();
				}
				products_id.add(rs.getInt(1));
			}
			System.out.println("...");
		} catch (Exception ex) {
			onError = true;
			log.log(Level.SEVERE,
					"CostAverageCalc:getProductsWithMovement() -Cant read product list executing : "
					+ sql.toString(), ex);
		} finally {
			// Cleanup
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;

		}

		if (onError == false) {
			return products_id;
		} else {
			if (products_id != null)
				products_id.clear();
			return null;
		}
	}

	private final class invalidEntries {
		private int m_Master_ID;
		private int m_Parent_ID;
		private Timestamp m_Acctdate;
		private int C_DocType_ID;
		
		public int getMaster_ID() {
			return m_Master_ID;
		}
		public void setMaster_ID(int Master_ID) {
			m_Master_ID = Master_ID;
		}
		public int getParent_ID() {
			return m_Parent_ID;
		}
		public void setParent_ID(int Parent_ID) {
			m_Parent_ID = Parent_ID;
		}		
		public Timestamp getAcctdate() {
			return m_Acctdate;
		}
		public void setAcctdate(Timestamp acctDate)
		{
			m_Acctdate = acctDate;
		}
		public int getC_DocType_ID() {
			return C_DocType_ID;
		}
		public void setC_DocType_ID(int c_DocType_ID) {
			C_DocType_ID = c_DocType_ID;
		}		
	}
	/**
	 * Helper entity class for each m_carding entry . ITS MUTABLE, for save a
	 * lot of memory.
	 * 
	 * @author carana
	 * 
	 */
	private final class KardexEntry {
		private int org_id;
		private int client_id;
		private int product_id;
		private int record_id;
		private String productName;
		private int productionplan_id = 0;
		private int order_id;
		private java.sql.Timestamp movementDate = null;
		private Timestamp accountDate = null;
		private java.sql.Timestamp costDate = null;
		private BigDecimal qtySource;
		//private BigDecimal qtyDestiny;
		private Boolean m_isTransfer = false;
		private BigDecimal price;
		private String costed = null;
		private int doctype_id;
		private String tableName;
		private int table_id;
		private int master_id;
		private int parent_id;
		private int locator_id;
		private int warehouse_id;
		private int attributesetinstance_id;
		private boolean isReturn = false;
		private String movementtype;

		protected final String setup(ResultSet currecord) throws Exception {
			String error = null;
			try {
				Boolean IsPeriodOpen = currecord.getBoolean("isperiodopen");
				int c_currency_id = currecord.getInt("c_currency_id");
				if (c_currency_id == 0)
				{
					c_currency_id = DefaultCurrency;
				}
				Boolean foundcurrency = false;
				for (Vector df:costprec)
				{
					if ( (Integer) df.get(0) == c_currency_id )
					{
						m_costingPrecision = (Integer) df.get(1);						
						foundcurrency = true;
						break;
					}
				}
				if (!foundcurrency)
				{
					MCurrency currency = MCurrency.get(Env.getCtx(), c_currency_id);
					m_costingPrecision = currency.getCostingPrecision();
					addCurrency(currency);
				}
				org_id = currecord.getInt("ad_org_id");
				client_id = currecord.getInt("ad_client_id");			
				product_id = currecord.getInt("m_product_id");
				productName = currecord.getString("productname");
				order_id = currecord.getInt("c_order_id");
				productionplan_id = currecord.getInt("m_productionplan_id");
				doctype_id = currecord.getInt("c_doctype_id");
				accountDate = currecord.getTimestamp("dateacct");
				movementDate = currecord.getTimestamp("movementdate");
				costDate = currecord.getTimestamp("costdate");
				qtySource = currecord.getBigDecimal("qtysource");
				//qtyDestiny = currecord.getBigDecimal("qtydestiny");
				price = currecord.getBigDecimal("priceactual");
				costed = currecord.getString("costed");
				tableName = currecord.getString("tablename");
				table_id = currecord.getInt("ad_table_id");
				master_id = currecord.getInt("master_id");
				record_id = currecord.getInt("record_id");
				parent_id = currecord.getInt("parent_id");
				attributesetinstance_id = currecord.getInt("m_attributesetinstance_id");
				locator_id = currecord.getInt("m_locator_id");
				warehouse_id = currecord.getInt("m_warehouse_id");
				movementtype = currecord.getString("movementtype");
				m_isTransfer = movementtype.substring(0, 1).equals("M");
				isReturn = false;
				//if (!IsPeriodOpen )
				//{
				//	SimpleDateFormat m_dateFormat = DisplayType.getDateFormat(DisplayType.DateTime, Env.getLanguage(Env.getCtx()));					
				//	throw new Exception(productName+" se encontro un costo pendiente el "+m_dateFormat.format(accountDate)+" en "+tableName+" registro: "+String.valueOf(record_id)+" pero el esta periodo cerrado");
				//}

				String movReturn = currecord.getString("mov_isreturn"); 
				if ( movReturn != null)
				{
					if (movReturn.equals("Y")) {
						isReturn = true;
					}
				}
				else
				{
					MOrder order = new MOrder(Env.getCtx(), order_id, null);
					if (!order.getDocStatus().equals(DocAction.STATUS_Completed))
					{
						throw new Exception(order.getC_Order_ID()+"-"+order.getDocumentNo()+"- no completado estado actual :"+order.getDocStatus()+" "+productName);
					}
					else
					{
						throw new Exception(productName+" no existe una referencia de linea de orden valida para "+tableName+" registro: "+String.valueOf(record_id));
					}					
				}
			}
			catch (Exception e)
			{
				error = e.getMessage();
			}
			return error;
		}

		/**
		 * @return the product_id
		 */
		protected final int getProduct_id() {
			return product_id;
		}

		/**
		 * @return the costDate
		 */
		public java.sql.Timestamp getCostDate() {
			return costDate;
		}

		/**
		 * @return the isReturn
		 */
		public boolean isReturn() {
			return isReturn;
		}

		/**
		 * @return the order_id
		 */
		protected final int getOrder_id() {
			return order_id;
		}

		/**
		 * @return the productionPlan_id
		 */
		protected final int getProductionPlan_id() {
			return productionplan_id;
		}

		/**
		 * @return the movdoc_id
		 */
		public final int getRecord_id() {
			return record_id;
		}

		/**
		 * @return the order_id
		 */
		protected final int getDocType_id() {
			return doctype_id;
		}

		/**
		 * @return the movementDate
		 */
		public final java.sql.Timestamp getMovementDate() {
			return movementDate;
		}

		public Timestamp getAcctDate() {
			return accountDate;
		}
		
		/**
		 * @return the qtySource
		 */
		public final BigDecimal getQtySource() {
			return qtySource;
		}

		//		/**
		//		 * @return the qtyDestiny
		//		 */
		//		public final BigDecimal getQtyDestiny() {
		//			return qtyDestiny;
		//		}

		/**
		 * @return the price
		 */
		public final BigDecimal getPrice() {
			return price;
		}

		/**
		 * @return the costed
		 */
		public final boolean getCosted() {
			if (costed == null || costed.length() == 0 || costed.equals('N'))
				return false;
			return true;
		}

		/**
		 * @return the org_id
		 */
		public final int getOrg_id() {
			return org_id;
		}

		/**
		 * @return the client_id
		 */
		public final int getClient_id() {
			return client_id;
		}

		public final boolean isTransfer() {
			return this.m_isTransfer;
		}

		public final boolean isInput() {
			if (getQtySource().compareTo(Env.ZERO) > 0) {
				return true;
			}
			return false;
		}

		public final boolean hasOrder() {
			return (getOrder_id() > 0);
		}

		public final boolean isProduction() {
			return (getProductionPlan_id() > 0 );
		}

		/**
		 * @return the tableName
		 */
		public final String getTableName() {
			return tableName;
		}

		public final int getTable_id() {
			return table_id;
		}

		public final String getProductName() {
			return productName;
		}

		public int getParent_ID() {
			return parent_id;
		}

		public int getMaster_ID() {
			return master_id;
		}
		
		public int getAttributeSetInstance_ID(){
			return attributesetinstance_id;
		}
		
		public void setAttributeSetInstance_ID(int asi) {
			attributesetinstance_id = asi;
		}
		
		public int getlocator_id() {
			return locator_id;
		}
		public int getwarehouse_id() {
			return warehouse_id;
		}
		//		public String toString() {
		//			String value = "kardex element:";
		//			if (isReturn)
		//				value = value.concat(" IsReturn ");
		//			if (isInput())
		//				value = value.concat(" IsInput ");
		//			if (productionplan_id > 0)
		//				value = value.concat(" Production Plan ID="+productionplan_id+" ");
		//			//value = value.concat(",MovementDate="+ movementDate);
		//			//value = value.concat(",Price="+price);
		//			if (getCosted())
		//				value = value.concat(" IsCosted ");
		//			return value;
		//		}
	}

	@Override
	public String getLog() {
		return m_log.toString();
	}

	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		// CONDENSADOR 30uf ALPHA
		Env.setContext(Env.getCtx(), "#AD_Client_ID", 1000026);
		CostAverageCalc ac = new CostAverageCalc(Env.getCtx(), 0, 1017265, 1000050 ,2 , null, false, null);
		//ac.prepareCalc(0);
		String msg = ac.processCosts(1017265, true);
		System.out.println(msg);
	}

	public String Initialize() {
		String error = "";
		try {
			C_Calendar_ID = DB.getSQLValue(m_trxName, "SELECT C_Calendar_ID FROM AD_ClientInfo WHERE AD_Client_ID=?", m_AD_Client_ID); 
			if (C_Calendar_ID  == 0)
			{
				throw new Exception("no se definio un calendario para el cliente");			
			}	
			String sql = "";
			if (!m_fromBeginning && m_calculateStock)
			{
				throw new Exception ( " para calcular stock el estado desde el comienzo es obligatorio ");
			}
			return ""; // se comento esto porque en una DB de 2 GB demora demasiado
//			if (!m_forcePeriod)
//			{
//				sql = "select COUNT(*) from m_carding  WHERE ";
//				if (m_product_id > 0)
//				{
//					sql += " m_carding.m_product_id = ";
//					sql += m_product_id;
//					sql += " AND ";
//				}
//				sql += "m_carding.ad_client_id="
//				+ m_AD_Client_ID;
//				if (m_fromBeginning)
//				{
//					sql += " AND (( m_carding.iscosted = 'N' OR COALESCE(m_carding.iscosted,'N') = 'N') "					
//						+ " OR movementdate >= '"+m_dateFormat.format(m_CostedFrom)+"') ";
//				}
//				else
//				{
//					sql += " AND ( m_carding.iscosted = 'N' OR COALESCE(m_carding.iscosted,'N') = 'N') ";
//				}
//				sql += " AND NOT xendra.isperiodopen(c_doctype_id, dateacct, m_carding.ad_org_id, m_carding.ad_client_id)";
//				int no = DB.getSQLValue(m_trxName, sql);
//				if (no > 0)
//				{
//					throw new Exception("no se forzo periodo y existen periodos cerrados");
//				}
//			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();
		}
		return error;
	}

	public void setForcePeriod(boolean forcePeriod) {
		m_forcePeriod = forcePeriod; 
	}
	
	public Boolean getForcePeriod() {
		return m_forcePeriod;
	}
	
	public void setCalculateCost(boolean costed) {
		m_calculateCost = costed;
	}

	public Boolean getCalculateCost() {
		return m_calculateCost;
	}
	
	public void setCalculateStock(boolean calculateStock) {
		m_calculateStock = calculateStock;
	}
	
	public Boolean getCalculateStock() {
		return m_calculateStock;	
	}

	/**
	 * 	Get Trx Name and create Transaction
	 *	@return Trx Name
	 */
	public String getTrxName()
	{
		return m_trxName;
	}	//	getTrxName

	public boolean isSendToEnd() {
		return SendToEnd;
	}

	public void setSendToEnd(boolean sendToEnd) {
		SendToEnd = sendToEnd;
	}

	@Override
	public void setAD_Client_ID(int AD_Client_ID) {
		m_AD_Client_ID = AD_Client_ID;
	}

}
