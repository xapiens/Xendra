package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_B_TopicTypeAuctionType implements Reference 
{
 	@XendraRefItem(Name="Funding - All Bidders help funding a Topic",
		Value="F",
		Description="",
		Identifier="b1ed0f1a-ac5c-4880-8d1d-5dfb431cef8b")
	/** Funding - All Bidders help funding a Topic = F */
	public static final String Funding_AllBiddersHelpFundingATopic = "F";
	@XendraRefItem(Name="Auction - The highest Bidder wins the Topic",
		Value="A",
		Description="",
		Identifier="86da5773-22ce-44e4-a3d2-977f6bea5eb1")
	/** Auction - The highest Bidder wins the Topic = A */
	public static final String Auction_TheHighestBidderWinsTheTopic = "A";
	@XendraRef(Name="B_TopicType AuctionType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="2e08309a-b2a1-4cc6-b300-6aa7c6071f9c")
	public static final String Identifier = "2e08309a-b2a1-4cc6-b300-6aa7c6071f9c";

}
