package org.compiere.model.operator;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Subtractdays_timestamp 
{
 
@XendraOperator(OprName="-",OprProc="xendra.subtractdays",LeftType="timestamp",RightType="numeric",
CompOp="-",Owner="xendra",Identifier="c460ce88-263d-4df8-9bca-9d820ad7838e",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "c460ce88-263d-4df8-9bca-9d820ad7838e";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0 @Identifier=c460ce88-263d-4df8-9bca-9d820ad7838e ");
	return sb.toString();
}
}
