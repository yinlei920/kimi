/**
 * 
 */
package com.hgn.kimi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author yinlei
 *
 */
@Controller
public class IndexController {

	
	@RequestMapping("/index.html?id={id}")
	public String index(@PathVariable("id") Long id,RedirectAttributes attr){
		attr.addAttribute("id", id);
		return "index";
	}
	
}
