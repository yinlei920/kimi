/**
 * 
 */
package com.hgn.kimi.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yinlei
 *
 */
@Controller
public class IndexController {

	
	@ResponseBody
	@RequestMapping(value="/index.html",method=RequestMethod.GET)
	public List<String> index(@RequestParam(value = "id") int id){
		System.out.println("id========="+id);
		List<String> list =new ArrayList<String>();
		list.add("hello");
		list.add("11111");
		list.add("22222");
		list.add("33333");
		list.add("44444");
		list.add("55555");
		list.add("66666");
		list.add("77777");
		
		
		return list;
	}
	
}
 