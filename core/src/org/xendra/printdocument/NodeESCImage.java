package org.xendra.printdocument;

import org.mvel2.integration.VariableResolverFactory;
import org.mvel2.templates.TemplateRuntime;
import org.mvel2.templates.res.Node;
import org.mvel2.templates.util.TemplateOutputStream;

public class NodeESCImage extends Node {

	@Override
	public Object eval(TemplateRuntime runtime, TemplateOutputStream appender,
			Object ctx, VariableResolverFactory factory) {
	    //int len = end - begin;
	    //if (len != 0) {
	    //  appender.append(new String(runtime.getTemplate(), begin, len));
	    //}
	    return next != null ? next.eval(runtime, appender, ctx, factory) : null;
	}

	@Override
	public boolean demarcate(Node terminatingNode, char[] template) {
		return false;
	}

}
