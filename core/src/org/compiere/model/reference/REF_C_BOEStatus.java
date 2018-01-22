package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BOEStatus implements Reference 
{
 	@XendraRefItem(Name="Draft",
		Value="DR",
		Description="",
		Identifier="d0f94741-7c48-56c0-beef-a699fc34915d")
	/** Draft = DR */
	public static final String Draft = "DR";
	@XendraRefItem(Name="Refinanced",
		Value="RF",
		Description="",
		Identifier="37a25b63-e472-73dc-6379-60a0ce513a24")
	/** Refinanced = RF */
	public static final String Refinanced = "RF";
	@XendraRefItem(Name="Invalid",
		Value="IN",
		Description="",
		Identifier="b88033ed-ccc1-e36d-aa2b-c8a9ada45f67")
	/** Invalid = IN */
	public static final String Invalid = "IN";
	@XendraRefItem(Name="Receivables",
		Value="RC",
		Description="",
		Identifier="e5092396-8987-8ff7-a11c-310ffeb3446b")
	/** Receivables = RC */
	public static final String Receivables = "RC";
	@XendraRefItem(Name="Protested",
		Value="PD",
		Description="",
		Identifier="49928116-1d0d-9e07-543b-874d8d2a6abb")
	/** Protested = PD */
	public static final String Protested = "PD";
	@XendraRefItem(Name="Portfolio",
		Value="PT",
		Description="",
		Identifier="708c5e2f-e948-6ec1-3cb7-46033031ba19")
	/** Portfolio = PT */
	public static final String Portfolio = "PT";
	@XendraRefItem(Name="Discount",
		Value="DS",
		Description="",
		Identifier="b823cc84-ed51-cefc-3cb9-762030b0cd3e")
	/** Discount = DS */
	public static final String Discount = "DS";
	@XendraRefItem(Name="Warranty",
		Value="WR",
		Description="",
		Identifier="b699edb0-5058-a874-8d06-833425d397ed")
	/** Warranty = WR */
	public static final String Warranty = "WR";
	@XendraRefItem(Name="Canceled",
		Value="CN",
		Description="",
		Identifier="8be227d0-9bf0-62a7-359e-7f831d8bd203")
	/** Canceled = CN */
	public static final String Canceled = "CN";
	@XendraRef(Name="C_BOEStatus",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="LL",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="1b58b585-4d7b-c473-9e0c-13d85b7d49bb")
	public static final String Identifier = "1b58b585-4d7b-c473-9e0c-13d85b7d49bb";

}
