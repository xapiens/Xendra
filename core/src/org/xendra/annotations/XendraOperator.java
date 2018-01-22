package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraOperator {
	String OprName();
	String OprProc();
	String LeftType();
	String RightType();
	String CompOp();
	String Owner();
	String Identifier();
	String Synchronized();
}
