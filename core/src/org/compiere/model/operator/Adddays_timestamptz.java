package org.compiere.model.operator;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Adddays_timestamptz 
{
 
@XendraOperator(OprName="+",OprProc="xendra.adddays",LeftType="timestamptz",RightType="numeric",
CompOp="+",Owner="xendra",Identifier="ed2251c0-6a8c-48d8-a6bc-0cdef74dfb27",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "ed2251c0-6a8c-48d8-a6bc-0cdef74dfb27";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0 @Identifier=ed2251c0-6a8c-48d8-a6bc-0cdef74dfb27 ");
	return sb.toString();
}
}
