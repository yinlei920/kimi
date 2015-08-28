/**
 * 
 */
package com.hgn.kimi.common;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;

/**
 * @author yinlei
 *
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
	    Cache<String, String> cahce=CacheBuilder.newBuilder().expireAfterAccess(8, TimeUnit.SECONDS).maximumSize(10).build(new CacheLoader<String, String>() {
	        @Override  
	        public String load(String key) throws Exception {  
	            if(key.equals("a")) return "a啊你妹";
	            if(key.equals("b")) return "b啊你妹";
	            if(key.equals("c")) return "c啊你妹";
	            if(key.equals("d")) return "d啊你妹";
	            if(key.equals("e")) return "e啊你妹";
	            if(key.equals("f")) return "f啊你妹";
				return key;
	        }  
	    });  
	    cahce.put("a", "11111111111111");
//	    System.out.println(b);  
//	    Book b2=cahce.apply("q");  
//	    System.out.println(b2);  
//	    Thread.currentThread();  
//	    Thread.sleep(TimeUnit.SECONDS.toMillis(10));  
//	    Book b3=cahce.apply("q");  
//	    System.out.println(b3);  
	}
	
	
	
	
}
