/**
 * 
 */
package com.hgn.kimi.common;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Date;
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
				return key;
	        }  
	    });  
	    cahce.put("a", "11111111111111");
	    
	    
	    
	    
	    String aaa = "aaaaaaa晚上来啊！！！中華";
	    String a1 = "aaa啊";
	    
	    
	    System.out.println(a1.length());
	    
	    
	    System.out.println(Charset.defaultCharset());
    	
//    	try {
//			String utf8 = new String(aaa.getBytes("GBK"));
//			System.out.println(utf8);	    
//			String unicode = new String(utf8.getBytes(),"GB2312");
//			System.out.println(unicode);
//			String gbk = new String(unicode.getBytes(),"utf8");
//			System.out.println(gbk);
//			
//			
//			
//			
//			Date date= new Date();
//			System.out.println(date);
//			
//			
//			
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    System.out.println(b);  
//	    Book b2=cahce.apply("q");  
//	    System.out.println(b2);  
//	    Thread.currentThread();  
//	    Thread.sleep(TimeUnit.SECONDS.toMillis(10));  
//	    Book b3=cahce.apply("q");  
//	    System.out.println(b3);  
	}
	
	
	
	
}
