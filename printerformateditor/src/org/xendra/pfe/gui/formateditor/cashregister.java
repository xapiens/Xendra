package org.xendra.pfe.gui.formateditor;

import java.math.BigDecimal;

public class cashregister {
	BigDecimal counthuman = BigDecimal.ZERO;
	BigDecimal countsystem = BigDecimal.ZERO;
	BigDecimal countdiff = BigDecimal.ZERO;	
	String name = "";
	public BigDecimal getCounthuman() {
		return counthuman;
	}
	public void setCounthuman(BigDecimal counthuman) {
		this.counthuman = counthuman;
	}
	public BigDecimal getCountsystem() {
		return countsystem;
	}
	public void setCountsystem(BigDecimal countsystem) {
		this.countsystem = countsystem;
	}
	public BigDecimal getCountdiff() {
		return countdiff;
	}
	public void setCountdiff(BigDecimal countdiff) {
		this.countdiff = countdiff;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
