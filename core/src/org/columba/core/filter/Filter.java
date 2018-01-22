package org.columba.core.filter;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Filter implements Cloneable {
	@XmlElement
	FilterActionList filteractionlist;
	@XmlAttribute
	String description  = "new filter";
	@XmlAttribute
	Boolean enabled;
	@XmlElement	
	FilterRule rules = new FilterRule();	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public FilterRule getFilterRule() {
		return rules;
	}
	public void setFilterRule(FilterRule rules) {
		this.rules = rules;
	}
	public FilterActionList getFilterActionList() {
		return filteractionlist;
	}
	public void setFilterActionList(FilterActionList actionlist) {
		this.filteractionlist = actionlist;
	}
	
	@Override
    public Filter clone() {
        try {
            final Filter other = (Filter) super.clone();
            return other;
        } catch (final CloneNotSupportedException cnse) {
            throw new InternalError("Could not clone DefaultItem: " + cnse); //$NON-NLS-1$
        }
    }	
}