/**
 * 
 */
package org.kimi.biz;

/**
 * @author yinlei
 *
 */
public class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	
	
	
	
	
}
