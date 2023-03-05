package org.xendra.xendrian;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;


public class DownloadCallBack implements Callback  {
	CountDownLatch cd = null;
	String filename = "";
	public DownloadCallBack(CountDownLatch countDownLatch, String filename) {
		cd = countDownLatch;
		this.filename = filename;
	}

	@Override
	public void onFailure(Call call, IOException e) {
		e.printStackTrace();
	}

	@Override
	public void onResponse(Call call, Response response) throws IOException {					 
		if (response.isSuccessful()) {
			String contentType = response.header("Content-Type");
			if (contentType.equals("application/octet-stream") || contentType.equals("application/zip")) {
				String filedst = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),filename);
				File tmpfile = new File(filedst);
				BufferedSink sink = Okio.buffer(Okio.sink(tmpfile));
				sink.writeAll(response.body().source());
				sink.close();					
			}
		} else {
			String contentType = response.header("Content-Type");
		}
		cd.countDown();
	}
}
