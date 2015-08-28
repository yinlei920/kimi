/**
 * 
 */
package com.hgn.kimi.vo.transfer;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.hgn.kimi.dal.dataobject.IllegalInfoDO;
import com.hgn.kimi.vo.IllegalInfoVO;

/**
 * @author yinlei
 *
 */
public class IllegalInfoTransfer {

	
	
	public static IllegalInfoDO voTOdo(IllegalInfoVO vo){
		if(vo==null) return null;
		IllegalInfoDO info  = new IllegalInfoDO();
		info.setId(vo.getId());
		info.setAddress(vo.getAddress());
		info.setCarNum(vo.getCarNum());
		info.setCode(vo.getCode());
		info.setGmtCreate(vo.getCreateTime());
		info.setGmtModified(vo.getModifyTime());
		if(null!=vo.getPicURL() && vo.getPicURL().size()>0){
			info.setPicURL(Joiner.on(",").join(vo.getPicURL()));
		}
		info.setReportUserId(vo.getReportUserId());
		info.setStatus(vo.getStatus());
		info.setUserId(vo.getUserId());
		
		if(null!=vo.getVideoURL() && vo.getVideoURL().size()>0){
			info.setVideoURL(Joiner.on(",").join(vo.getVideoURL()));
		}
		return info;
	}
	
	
	
	public static void main(String args[]){
		
		Iterable<String> splitResults = Splitter.on(",").trimResults().omitEmptyStrings().split("1,2,23,4,3245,4645,6457,456756,756,756");
		for(String i :splitResults){
			System.out.println(i);
		}
	}
	
	
	
	public static IllegalInfoVO doTOvo(IllegalInfoDO info){
		if(info==null) return null;
		IllegalInfoVO vo  = new IllegalInfoVO();
		vo.setId(info.getId());
		vo.setAddress(info.getAddress());
		vo.setCarNum(info.getCarNum());
		vo.setCode(info.getCode());
		vo.setCreateTime(info.getGmtCreate());
		vo.setModifyTime(info.getGmtModified());
		if(!Strings.isNullOrEmpty(info.getPicURL())){
			vo.setPicURL(Splitter.onPattern(",").trimResults().omitEmptyStrings().splitToList(info.getPicURL()));//List 转成字符串
		}
		vo.setReportUserId(info.getReportUserId());
		vo.setStatus(info.getStatus());
		vo.setUserId(info.getUserId());
		if(!Strings.isNullOrEmpty(info.getVideoURL())){
			vo.setVideoURL(Splitter.onPattern(",").trimResults().omitEmptyStrings().splitToList(info.getVideoURL()));
		}
		if(null!=vo.getVideoURL() && vo.getVideoURL().size()>0){
			info.setVideoURL(Joiner.on(",").join(vo.getVideoURL()));
		}
		return vo;
	}
}
