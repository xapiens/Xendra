package org.compiere.model.operator;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Adddays_timestamp 
{
 
@XendraOperator(OprName="+",OprProc="xendra.adddays",LeftType="timestamp",RightType="numeric",
CompOp="+",Owner="xendra",Identifier="fb27f011-bca5-4d2f-9199-e560d97343fd",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "fb27f011-bca5-4d2f-9199-e560d97343fd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0 @Identifier=fb27f011-bca5-4d2f-9199-e560d97343fd ");
	return sb.toString();
}
}
