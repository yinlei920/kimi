/**
 * 
 */
package com.hgn.kimi.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hgn.kimi.biz.ICarInfoService;
import com.hgn.kimi.biz.IUserInfoService;
import com.hgn.kimi.vo.CarInfoVO;

/**
 * @author yinlei
 *
 */
@Controller
public class IllegalController {
	
	@Resource
	private IUserInfoService userInfoService;

	@Resource
	private ICarInfoService carInfoService;
	
	@ResponseBody
	@RequestMapping(value="/illegal.html",method=RequestMethod.GET)
	public CarInfoVO index(@RequestParam(value = "carNum") String carNum){
		CarInfoVO car = new CarInfoVO();
		car = carInfoService.getCarInfoVOByCarNum(carNum);
		return car;
	}
	
}
 