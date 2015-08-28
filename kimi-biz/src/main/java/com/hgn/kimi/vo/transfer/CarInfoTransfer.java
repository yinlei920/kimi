/**
 * 
 */
package com.hgn.kimi.vo.transfer;

import com.google.common.base.Strings;
import com.hgn.kimi.dal.dataobject.CarInfoDO;
import com.hgn.kimi.vo.CarInfoVO;

/**
 * @author yinlei
 *
 */
public class CarInfoTransfer {
	
	public static CarInfoDO voTOdo(CarInfoVO vo){
		if(vo==null) return null;
		CarInfoDO info = new CarInfoDO();
		info.setCarId(vo.getCarId());
		if(Strings.isNullOrEmpty(vo.getCarNum()))
			info.setCarNum(vo.getCarNum());
		info.setGmtCreate(vo.getCreateTime());
		info.setGmtModified(vo.getModifyTime());
		info.setCarPic(vo.getPicURL());
		info.setStatus(vo.getStatus());
		info.setUserId(vo.getUserId());
		return info;
	}
	
	
	public static CarInfoVO doTOvo(CarInfoDO info){
		if(info==null) return null;
		CarInfoVO vo  = new CarInfoVO();
		vo.setCarId(info.getCarId());
		if(Strings.isNullOrEmpty(info.getCarNum()))
			vo.setCarNum(info.getCarNum());
		vo.setCreateTime(info.getGmtCreate());
		vo.setModifyTime(info.getGmtModified());
		vo.setPicURL(info.getCarPic());
		vo.setStatus(info.getStatus());
		vo.setUserId(info.getUserId());
		return vo;
	}
	

}
