/**
 * 
 */
package com.hgn.kimi.vo.transfer;

import com.google.common.base.Strings;
import com.hgn.kimi.dal.dataobject.UserDO;
import com.hgn.kimi.vo.UserInfoVO;

/**
 * @author yinlei
 *
 */
public class UserInfoTransfer {

	
	
	public static UserInfoVO to(UserDO userDO) {
        if (null == userDO) return null;
        UserInfoVO userVO = new UserInfoVO();
        userVO.setUserId(userDO.getId());
        userVO.setName(userDO.getName());
        userVO.setUserName(userDO.getUserName());
        userVO.setSex(userDO.getSex());
        userVO.setStatus(userDO.getStatus());
        userVO.setCreateTime(userDO.getGmtCreate());
        userVO.setModifyTime(userDO.getGmtModified());

        if(!Strings.isNullOrEmpty(userDO.getCars())){
        	
        	
        	
        }
        return userVO;
	}
	
	public static UserDO voToDo(UserInfoVO vo){
		if(null== vo) return null;
		UserDO userDO = new UserDO();
		if(null!=vo.getUserId())
			userDO.setId(vo.getUserId());
		userDO.setName(vo.getName());
		userDO.setUserName(vo.getUserName());
		userDO.setGmtCreate(vo.getCreateTime());
		userDO.setGmtModified(vo.getModifyTime());
		if(null!=vo.getSex())
			userDO.setSex(vo.getSex());
		if(null!=vo.getStatus())
			userDO.setStatus(vo.getStatus());
		if(null!=vo.getCars() && vo.getCars().size()>0){
			//do sth
		}
		return userDO;
	}
	
}
