package org.compiere.model.operator;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Subtractdays_date 
{
 
@XendraOperator(OprName="-",OprProc="xendra.subtractdays",LeftType="date",RightType="numeric",
CompOp="-",Owner="xendra",Identifier="67631566-1fbe-4558-9b55-950ddfe1b96d",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "67631566-1fbe-4558-9b55-950ddfe1b96d";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0 @Identifier=67631566-1fbe-4558-9b55-950ddfe1b96d ");
	return sb.toString();
}
}
