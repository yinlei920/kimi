package org.kimi.biz;

import java.util.concurrent.Callable;


public class TaskWithResult implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		Thread.sleep(10000);
		return "hello";
	}

}
