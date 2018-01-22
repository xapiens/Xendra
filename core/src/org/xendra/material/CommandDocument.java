package org.xendra.material;

import java.io.OutputStream;

public class CommandDocument extends StockCommandHandler {

	public CommandDocument(StockWorker is, OutputStream os) {
		super(is, os);
	}

	@Override
	public void execute() {
		MaterialManager mm = MaterialManager.getInstance();
		mm.add(sw);							

	}

}
