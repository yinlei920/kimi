/**
 * 
 */
package com.hgn.kimi.biz;

import com.hgn.kimi.vo.UserInfoVO;

/**
 * @author yinlei
 *
 */
public interface IUserInfoService {
	
	
	public UserInfoVO getUserInfoVO(Long userId);
	
	public boolean userInfoRegister(UserInfoVO userVO);
	
	

}
