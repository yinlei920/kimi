package org.kimi.biz;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestCallble {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		
		ExecutorService exec=Executors.newCachedThreadPool();
		
		
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		exec.execute(new ThreadTest());
		
		
//	    Future<String> st=exec.submit(new TaskWithResult());
//	    
//	    /*同步结果，并且设置超时时间*/
//	    
//	    for(int i=1;i<100000;i++){
//	    	System.out.println(st.get(100000, TimeUnit.MILLISECONDS));
//	    	System.out.println("over");
//	    }
	    
		
	}

}
