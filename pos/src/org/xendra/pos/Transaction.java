package org.xendra.pos;

import java.util.List;
import java.util.Properties;

import org.compiere.model.MCoupon;
import org.compiere.model.MInOut;
import org.compiere.model.MInvoice;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Coupon;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.exceptions.XendraException;
import org.xendra.wf.WorkflowUtils;

public class Transaction {
	private static String m_processMsg;
	private static String m_voidMsg;
	private Properties	m_ctx = null;
	/**
	 * 	Get Server Context
	 *	@return context
	 */
	public Properties getCtx()
	{
		return m_ctx;
	}	//	getCtx

	public static Integer voidTransaction(Properties ctx, Integer C_Invoice_ID, String identifier)
	{
		Integer C_Order_ID = 0;
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();			            
		String trxName = trx.getTrxName();
		try 
		{						
			MInvoice invoice = null;
			invoice = MInvoice.getByIdentifier(identifier, trxName);
			if (invoice == null)
				invoice = new MInvoice(ctx, C_Invoice_ID, trxName);
			MInOut io = MInOut.getbyC_Invoice_ID(invoice.getC_Invoice_ID(), trxName);
			if (io == null)
			{
				throw new XendraException("Guia no encontrada");
			}			
			if (!io.getDocStatus().equals(DocAction.STATUS_Completed))
				throw new XendraException("guia "+io.toString()+" estado "+io.getDocStatusName());
			invoice.setDocAction(DocAction.ACTION_Void);
			if (!invoice.save())
				throw new XendraException(String.format("no se pudo cambiar el estado de %s",invoice));
			io.setDocAction(DocAction.ACTION_Void);
			if (!io.save())
				throw new XendraException(String.format("no se pudo cambiar el estado de %s", io));
			C_Order_ID = invoice.getC_Order_ID();
			ProcessInfo pi = WorkflowUtils.Process(invoice, trx.getTrxName());
			if (pi.isError())
				throw new Exception(pi.getSummary());
			pi = WorkflowUtils.Process(io, trx.getTrxName());
			if (pi.isError())
				throw new Exception(pi.getSummary());
		}
		catch (Exception e) {			
			C_Order_ID = 0;
			m_voidMsg = e.getMessage();
			e.printStackTrace();
			trx.rollback();						
		}
		finally {
			trx.close();
		};		
		return C_Order_ID;		
	}
	public static Integer voidTransaction2(Properties ctx, Integer C_Invoice_ID, String identifier)
	{
		Env.setCtx(ctx);
		Integer C_Order_ID = 0;
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();			            
		String trxName = trx.getTrxName();
		try 
		{						
			MInvoice invoice = null;
			invoice = MInvoice.getByIdentifier(identifier, trxName);
			if (invoice == null)
				invoice = new MInvoice(Env.getCtx(), C_Invoice_ID, trxName);
			MInOut io = MInOut.getbyC_Invoice_ID(invoice.getC_Invoice_ID(), trxName);
			if (io == null)
			{
				throw new XendraException("Guia no encontrada");
			}			

			MOrder order = new MOrder(Env.getCtx(), invoice.getC_Order_ID(), trxName);
			if (order.get_ID() == 0)
			{
				order = new MOrder(Env.getCtx(), io.getC_Order_ID(), trxName);
				if (order.get_ID() == 0)
				{
					throw new XendraException(" orden no encontrada ");
				}
			}					
			if (!io.getDocStatus().equals(DocAction.STATUS_Completed))
			{
				throw new XendraException("guia "+io.toString()+" estado "+io.getDocStatusName());
			}
			//if (M_Warehouse_ID > 0 && M_Warehouse_ID != io.getM_Warehouse_ID())
			//{				
			//	throw new XendraException("el ".concat(Msg.translate(Env.getCtx(), "M_Warehouse_ID")).concat(" de ").concat(Msg.translate(Env.getCtx(), "M_InOut_ID")).concat(" no es igual al de ").concat(Msg.translate(Env.getCtx(), "C_Order_ID")));
			//}
			if (invoice.RestoreIt()) {
				if (invoice.voidIt()) {
					if (invoice.save()) {
						// Antes de matar a la guia analizamos si su numero de items es igual al numero de items de la orden
						// si asi lo fuera usamos la misma orden, si fuera parte, tendriamos que crear un nuevo order						
						if (io.RestoreIt()) {
							if (io.voidIt()) {
								if (io.save()) {									
											if (trx.commit())
											{
												String where = "C_Order_ID = ?";
												List<MCoupon> coupons = new Query(Env.getCtx(), X_C_Coupon.Table_Name, where, null)
												.setParameters(order.getC_Order_ID()).list();
												for (MCoupon coupon:coupons)
												{
													coupon.setC_Order_ID(0);
													coupon.save();
												}
												MOrderLine[] lines = io.getOrderLines();
												if (lines.length == order.getLines().length)
													C_Order_ID = order.getC_Order_ID();
												else
												{
													MOrder newOrder = MOrder.copyFrom(order, 
																					  order.getDateOrdered(), 
																					  order.getC_DocTypeTarget_ID(), 
																					  order.isSOTrx(), 
																					  true, 
																					  true, /* copyASI */ 
																					  true, /* Include Lines */
																					  lines, trxName);
													newOrder.save();
													C_Order_ID = newOrder.getC_Order_ID();
												}
												if (!trx.commit())
													throw new XendraException("no se pudo commitear");
											}
											else
												throw new XendraException("no se pudo commitear");
								}
								else
									throw new XendraException("no grabo guia");
							}
							else
								throw new XendraException(io.getProcessMsg());
						}
						else
							throw new XendraException(io.getProcessMsg());	
					}
					else
						throw new XendraException("no grabo factura");				}
				else
				{
					throw new XendraException(invoice.getProcessMsg());
				}
			}
			else
				throw new XendraException(invoice.getProcessMsg());						
		} 
		catch (Exception e) {			
			m_voidMsg = e.getMessage();
			e.printStackTrace();
			trx.rollback();						
		}
		finally {
			trx.close();
		};		
		return C_Order_ID;
	}

	public static String getProcessMsg() {
		return m_processMsg;
	}

	public static String getVoidMssg() {
		return m_voidMsg;
	}
}