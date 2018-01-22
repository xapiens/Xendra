package org.xendra.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.sf.extcos.ComponentQuery;
import net.sf.extcos.ComponentScanner;

import org.compiere.model.PO;
import org.compiere.process.SvrProcess;

public class test {

	public void doit() 
	{
		final Set<Class<? extends SvrProcess>> serializables = new HashSet<Class<? extends SvrProcess>>();
		ComponentScanner scanner = new ComponentScanner();
		Set<Class<?>> classes = scanner.getClasses(	new ComponentQuery() 
			{
				protected void query() {
					select().from("org.xendra.process").andStore(thoseExtending(SvrProcess.class).into(serializables))
					.returning(all());
				}
			}		
		);
		Iterator it = serializables.iterator();
		int i = 0;
		while (it.hasNext())
		{			
			Object ss = it.next();					
			Object startClass = null;
			try			
			{
//				Class<?> clazz = null;
//				clazz = Class.forName(((Class) ss).getName());
//				Method[] methods = clazz.getMethods();
//				Fields[] fields = clazz.getDeclaredFields();
//				System.out.println(String.valueOf(i)+"- "+clazz);
//				for (Method method:methods)
//				{
//					if (method.isAnnotationPresent(XendraProcess.class)) {
//						try 
//						{
//							XendraProcess xendraprocess = method.getAnnotation(XendraProcess.class);
//							//System.out.println(xendraprocess.comments());
//							xendraprocess.id();
//							String[] ParametersName = xendraprocess.ParametersName();
//							for (String paraname:ParametersName)
//							{
//								System.out.println(paraname);
//							}
//							int[] ParametersType = xendraprocess.ParametersType();
//							for (int pt:ParametersType)
//							{
//								System.out.println(pt);
//							}
//						}
//						catch (Exception e)
//						{
//							e.printStackTrace();
//						}
//					}
//					else
//					{
//						//System.out.println(method);
//					}
//				}				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			i++;
		}					
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test Test = new test();
		Test.doit();
	}	
}
