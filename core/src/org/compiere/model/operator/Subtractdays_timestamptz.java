package org.compiere.model.operator;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Subtractdays_timestamptz 
{
 
@XendraOperator(OprName="-",OprProc="xendra.subtractdays",LeftType="timestamptz",
RightType="numeric",CompOp="-",Owner="xendra",Identifier="f546113d-c52f-482d-bea6-5cc8949cb5ab",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "f546113d-c52f-482d-bea6-5cc8949cb5ab";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0 @Identifier=f546113d-c52f-482d-bea6-5cc8949cb5ab ");
	return sb.toString();
}
}
