package org.xendra.material;

import java.io.OutputStream;

public class StorageCommandNotReserved extends StorageCommandHandler {
	protected StorageCommandNotReserved(StorageWorker i, OutputStream o) {
		super(i, o);
	}
	@Override
	public void execute() throws Exception {
		
	}
}
