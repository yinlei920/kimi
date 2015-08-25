/**
 * 
 */
package com.hgn.kimi.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hgn.kimi.biz.IUserInfoService;
import com.hgn.kimi.vo.UserInfoVO;

/**
 * @author yinlei
 *
 */
@Controller
public class IndexController {
	
	@Resource
	private IUserInfoService userInfoService;

	
	@ResponseBody
	@RequestMapping(value="/index.html",method=RequestMethod.GET)
	public UserInfoVO index(@RequestParam(value = "id") Long id){
		
		UserInfoVO vo = userInfoService.getUserInfoVO(id);
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
		return vo;
	}
	
}
 