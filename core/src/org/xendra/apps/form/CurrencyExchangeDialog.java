/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.xendra.apps.form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ConfirmPanel;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MConversionRate;
import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.swing.CButton;
import org.compiere.swing.CDialog;
import org.compiere.swing.CPanel;
import org.compiere.util.Env;
import org.compiere.util.Msg;



/**
 *	CurrencyExchangeDialog Dialog
 *	
 *  @author xapiens
 */
public class CurrencyExchangeDialog extends CDialog
{
	/**
	 * 	Constructor
	 * 	@param owner frame
	 */
	public CurrencyExchangeDialog (JFrame owner, HashMap<Integer, Vector<Integer>> processList, Timestamp convDate, Boolean canUpdate)
	{
		super (owner, true);
		
		int AD_Client_ID  = Env.getContextAsInt(Env.getCtx(), 0, "AD_Client_ID");
		if (AD_Client_ID == 0)
			AD_Client_ID = Env.getContextAsInt(Env.getCtx(), "AD_Client_ID");
		//
		ASchemas = MAcctSchema.getClientAcctSchema(Env.getCtx(), AD_Client_ID);
		if (ASchemas == null || ASchemas.length == 0)
		{
			ADialog.error(0, this, "Para iniciar operaciones debe definirse el esquema contable");
		}
		as = ASchemas[0];

		
		m_processList = processList;
		m_currencies = new Vector<Integer>(processList.keySet());
		
		m_convDate = convDate;
		
		setTitle(DateFormat.getDateInstance().format(m_convDate).concat(" ").concat(Msg.translate(Env.getCtx(), "C_ConversionType_ID")));
		//
		GridBagLayout customizeLayout = new GridBagLayout();
		customizePane.setLayout(customizeLayout);
		customizePane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		m_canUpdate = canUpdate;
		
		if (canUpdate)
		{
			// Tipos de conversion asociados a moneda.
			Vector<Integer> conversionTypes;
			//
			Integer counter = 0;
			CPanel[] coxPanel = new CPanel[m_currencies.size()];
			
			for (int x=0; x < m_currencies.size(); x++)
			{
				String title =	Msg.translate(Env.getCtx(), MCurrency.get(Env.getCtx(), m_currencies.get(x)).getDescription())
					.concat(" a ")
					.concat(MCurrency.get(Env.getCtx(), as.getC_Currency_ID()).getDescription());
				coxPanel[x] = new CPanel();			
				coxPanel[x].setBorder(BorderFactory.createTitledBorder(title));
				coxPanel[x].setLayout(new GridBagLayout());	
			
				conversionTypes = processList.get(m_currencies.get(x));
				
				for (int y=0; y < conversionTypes.size(); y++)
				{				
					vConversionType.add(new VNumber());
					MConversionType ct = new MConversionType(Env.getCtx(),  conversionTypes.get(y), null);
					coxPanel[x].add(new JLabel(ct.getName().trim()), new GridBagConstraints(0, y, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
					coxPanel[x].add(vConversionType.get(counter),new GridBagConstraints(1, y, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
					counter++;
				}
				customizePane.add(coxPanel[x], new GridBagConstraints(0, x, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));
			}
		}
		else
		{
			String aviso = new String("No es posible ingresar al sistema mientras no se complete los Tipos de cambio obligatorios");
			CPanel panel = new CPanel();
			panel.add(new JLabel(aviso), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
			customizePane.add(panel, new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));
		}		
		//
		jbInit();
		//
		AEnv.showCenterWindow(owner, this);
	}	//	CurrencyExchangeDialog
	


	public CurrencyExchangeDialog(JFrame owner, int C_Currency_ID, int C_CurrencyTO_ID, int conversiontype,	Timestamp convDate, boolean canUpdate) {
		super (owner, true);
		m_C_Currency_ID = C_Currency_ID;
		m_C_CurrencyTo_ID = C_CurrencyTO_ID;
		m_C_ConversionType_ID = conversiontype;
		m_convDate = convDate;		
		setTitle(DateFormat.getDateInstance().format(m_convDate).concat(" ").concat(Msg.translate(Env.getCtx(), "C_ConversionType_ID")));
		GridBagLayout customizeLayout = new GridBagLayout();
		customizePane.setLayout(customizeLayout);
		customizePane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		String title = "";
		if (C_Currency_ID > 0)
			title = title.concat(MCurrency.get(Env.getCtx(), C_Currency_ID).getDescription());
		else
			title = title.concat("Moneda no definida (0) ");			
		title = title.concat(" a ");
		if (C_CurrencyTO_ID > 0)
			title = title.concat(MCurrency.get(Env.getCtx(), C_CurrencyTO_ID).getDescription());
		else
			title = title.concat("Moneda no definida (0) ");
		CPanel coxPanel = new CPanel();			
		coxPanel.setBorder(BorderFactory.createTitledBorder(title));
		coxPanel.setLayout(new GridBagLayout());					
		C_ConversionType = new VNumber();
		MConversionType ct = null;
		if (m_C_ConversionType_ID > 0)
			ct = new MConversionType(Env.getCtx(),  m_C_ConversionType_ID, null);
		
			
		coxPanel.add(new JLabel(ct != null ? ct.getName().trim() : "sin ct"), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));			
		coxPanel.add(C_ConversionType,                new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));

		customizePane.add(coxPanel, new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));				
		//
		jbInit();
		//
		AEnv.showCenterWindow(owner, this);
	}

	private CButton		bOK = ConfirmPanel.createOKButton("OK");
	private CButton		bCancel = ConfirmPanel.createCancelButton("Cancel");
	private boolean		m_ok = false;
	private boolean     m_canUpdate = false;
	private CPanel customizePane = new CPanel();
	private ArrayList<VNumber> vConversionType = new ArrayList<VNumber>();
	private VNumber   C_ConversionType;
	private Vector<Integer> m_currencies;
	private HashMap<Integer, Vector<Integer>> m_processList;
	private Integer m_C_Currency_ID;
	private Integer m_C_CurrencyTo_ID;
	private Integer m_C_ConversionType_ID;
	private Timestamp m_convDate = null;
	private MAcctSchema as = null;
	public MAcctSchema[]    ASchemas = null;
	/**
	 * 	Static Layout
	 */
	private void jbInit()
	{
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add (customizePane, BorderLayout.CENTER);
		//
		CPanel confirmPanel = new CPanel(new FlowLayout(FlowLayout.RIGHT));
		if (m_canUpdate)
			confirmPanel.add(bCancel);
		confirmPanel.add(bOK);
		getContentPane().add (confirmPanel, BorderLayout.SOUTH);
		//
		bCancel.addActionListener(this);
		bOK.addActionListener(this);
	}	//	jbInit
	
	/**
	 * 	Action Listener
	 *	@param e evt
	 */
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource() == bOK && m_currencies != null)
		{
			int counter = 0;
			m_ok = true;
			Calendar cal = Calendar.getInstance();       // get calendar instance
			cal.setTime(m_convDate);                           // set cal to date
			cal.set(Calendar.HOUR_OF_DAY, 0);            // set hour to midnight
			cal.set(Calendar.MINUTE, 0);                 // set minute in hour
			cal.set(Calendar.SECOND, 0);                 // set second in minute
			cal.set(Calendar.MILLISECOND, 0);            // set millis in second
			Timestamp zeroedDate = new Timestamp(cal.getTime().getTime());   			
			
			// Verificacion previa , todo control tienen que tener un valor valido
			for (int y=0; y < vConversionType.size(); y++)
			{
				BigDecimal factor = (BigDecimal) vConversionType.get(counter++).getValue();
				// Si no esta definido detenemos el proceso hasta que lo esten
				if ( factor == null || factor.signum() != 1) {
					ADialog.error(0, this, "Ingrese todos los datos por favor");
					m_ok = false;
					return;
				}
			}
	
			
			// Ok todo ingresado alli vamos
			counter = 0;
			// Tipos de conversion asociados a moneda.
			Vector<Integer> conversionTypes;
			MathContext mc = new MathContext(4);
			
			for (int x=0; x < m_currencies.size(); x++)
			{
				conversionTypes = m_processList.get(m_currencies.get(x));
				for (int y=0; y < conversionTypes.size(); y++)
				{
					BigDecimal factor = (BigDecimal) vConversionType.get(counter++).getValue();
					MConversionRate ncr = new MConversionRate(Env.getCtx(), 0, null);
					ncr.setC_Currency_ID(m_currencies.get(x));
					ncr.setC_Currency_ID_To(as.getC_Currency_ID());					
					ncr.setValidFrom(zeroedDate);
					ncr.setValidTo(zeroedDate);
					ncr.setDivideRate(factor.round(mc));
					ncr.setC_ConversionType_ID(conversionTypes.get(y));
					if (!ncr.save())
					{
						m_ok = false;
					}
					ncr = new MConversionRate(Env.getCtx(), 0, null);
					ncr.setC_Currency_ID(as.getC_Currency_ID());
					ncr.setC_Currency_ID_To(m_currencies.get(x));					
					ncr.setValidFrom(zeroedDate);
					ncr.setValidTo(zeroedDate);		
					ncr.setMultiplyRate(factor.round(mc));					
					ncr.setC_ConversionType_ID(conversionTypes.get(y));
					if (!ncr.save())
					{
						m_ok = false;
					}					
				}
			}			
		}
		else if (e.getSource() == bOK )
		{
			
			Calendar cal = Calendar.getInstance();       // get calendar instance
			cal.setTime(m_convDate);                           // set cal to date
			cal.set(Calendar.HOUR_OF_DAY, 0);            // set hour to midnight
			cal.set(Calendar.MINUTE, 0);                 // set minute in hour
			cal.set(Calendar.SECOND, 0);                 // set second in minute
			cal.set(Calendar.MILLISECOND, 0);            // set millis in second
			Timestamp zeroedDate = new Timestamp(cal.getTime().getTime());
			
			BigDecimal factor = (BigDecimal) C_ConversionType.getValue();
			MConversionRate ncr = new MConversionRate(Env.getCtx(), 0, null);
			ncr.setC_Currency_ID(m_C_Currency_ID);
			ncr.setC_Currency_ID_To(m_C_CurrencyTo_ID);
			ncr.setValidFrom(zeroedDate);
			ncr.setValidTo(zeroedDate);
			ncr.setMultiplyRate(factor);
			ncr.setC_ConversionType_ID(m_C_ConversionType_ID);
			if (!ncr.save())
			{
				m_ok = false;
			}
			ncr = new MConversionRate(Env.getCtx(), 0, null);
			ncr.setC_Currency_ID(m_C_CurrencyTo_ID);
			ncr.setC_Currency_ID_To(m_C_Currency_ID);
			ncr.setValidFrom(zeroedDate);
			ncr.setValidTo(zeroedDate);		
			
			ncr.setDivideRate(factor);
			ncr.setC_ConversionType_ID(m_C_ConversionType_ID);
			if (!ncr.save())
			{
				m_ok = false;
			}					
			
		}
		else if (e.getSource() == bCancel )
		{
			m_ok = false;
		}
		dispose();
	}	//	actionPerformed
	
	/**
	 * 	OK Pressed
	 *	@return true if OK
	 */
	public boolean isOK()
	{
		return m_ok;
	}	//	isOK
	
	
}	//	CurrencyExchangeDialog
