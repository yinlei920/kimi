/**
 * 
 */
package com.hgn.kimi.web.base;

import java.io.IOException;
import java.io.OutputStream;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @author yinlei
 *
 */
public class FastJsonpHttpMessageConverter extends FastJsonHttpMessageConverter {

	@Override
	protected void writeInternal(Object obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		OutputStream out = outputMessage.getBody();
        String text = JSON.toJSONString(obj, super.getFeatures());
        text =  "callback" + "(" +text+")";
        byte[] bytes = text.getBytes(super.getCharset());
        out.write(bytes);
	}
	
	
	
	

}
