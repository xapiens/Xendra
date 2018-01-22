package org.compiere.model.operator;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Adddays_date 
{
 
@XendraOperator(OprName="+",OprProc="xendra.adddays",LeftType="date",RightType="numeric",
CompOp="+",Owner="xendra",Identifier="e3a9b7aa-5d72-46d3-8733-53f65495ca4b",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "e3a9b7aa-5d72-46d3-8733-53f65495ca4b";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0 @Identifier=e3a9b7aa-5d72-46d3-8733-53f65495ca4b ");
	return sb.toString();
}
}
