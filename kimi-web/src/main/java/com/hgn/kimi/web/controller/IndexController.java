/**
 * 
 */
package com.hgn.kimi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yinlei
 *
 */
@Controller
public class IndexController {

	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
}
