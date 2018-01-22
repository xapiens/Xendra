package org.xendra.objectview;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;

import org.compiere.util.Util;

public class RowBase implements IRow {
    /**
	 * 
	 */
	// Drools stuff 
	private HashMap<String, Object> oldvalues = new HashMap();
	private String m_FieldName = "";
	private BigDecimal m_FieldValue = BigDecimal.ZERO;
	private Integer m_FieldIntValue = 0;
	//
	private static final long serialVersionUID = -4884114365362312199L;
	public String m_processMsg = null;
	public String m_orderid = "";
	public Boolean changed = false;
	public Boolean Enabled = true;
	public Integer RowID = 0;
	private String identifier = Util.getUUID();
	public Boolean IsChanged() 							{	return changed;  }
    public void setIsChanged(boolean Changed) 			
    {	
    	changed = Changed;  
    }  
    
    public RowBase() {
    	
    }
    
    public RowBase(Boolean Enabled) {
    	setEnabled(Enabled);
    }

	public Boolean IsEnabled() {
		return Enabled;
	}
	public void setEnabled(Boolean enabled) {
		Enabled = enabled;
	}
	public String getM_processMsg() {		return m_processMsg;	}
    public void setM_processMsg(String mProcessMsg) 
    {		
    	m_processMsg = mProcessMsg;	
    }
	public RowBase[] getChilds() {
		return null;
	}
	public String getName() {
		return null;
	}
	public Object getValue(Object value) {
		return null;
	}
	public Integer getRowID() 							{	return RowID;  }
	public void setRowID(Integer pRowID) 					{	RowID = pRowID;  }  

	public Object getFirstChild() {
		return null;
	}
	public void setFirstChild(RowBase row)
	{
		
	}
	public Object getPropertyValue(String property)
	{
		return null;
	}
	public String getIdentifier()
	{
		return identifier;
	}
	public void setField(String name, Object value) {
		if (value == null)
			return;
		if (oldvalues.containsKey(name))
		{
			if (oldvalues.get(name) != null)
				if (oldvalues.get(name).equals(value))
					return;							
		}		
		if (value instanceof BigDecimal)
		{
			m_FieldValue = (BigDecimal) value;
		}
		else if (value instanceof Integer)
		{
			m_FieldIntValue = (Integer) value;
		}
		oldvalues.put(name, value);
		m_FieldName = name;
		updateRow();
		setIsChanged(true);
	}
	public String getFieldName()
	{
		return m_FieldName;
	}
	public BigDecimal getFieldValue()
	{
		return m_FieldValue;
	}
	public int getFieldIntValue()
	{
		return m_FieldIntValue;
	}	
	public void updateRow() {
		
	}
	
	
}
