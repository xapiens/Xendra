package org.xendra.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface XendraScheduler {
	String frequencytype();
	String frequency();
	String frequencystartat();
	String keeplogdays();
	String name();
	String type();
	String tag();
}
