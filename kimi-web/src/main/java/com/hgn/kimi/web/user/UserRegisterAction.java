/**
 * 
 */
package com.hgn.kimi.web.user;

import com.hgn.kimi.biz.IUserInfoService;
import com.hgn.kimi.vo.UserInfoVO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author yinlei
 *
 */
public class UserRegisterAction extends ActionSupport {
	
	private IUserInfoService userInfoService;
	
	private UserInfoVO userVO;

	/**
	 * 
	 */
	private static final long serialVersionUID = -3970838190129674240L;

	@Override
	public String execute() throws Exception {
		String result = INPUT;
		if(null!=userVO){
			if(userInfoService.userInfoRegister(userVO)){
				result = SUCCESS;
			}
		}
		return result;
	}

	public void setUserVO(UserInfoVO userVO) {
		this.userVO = userVO;
	}

	public UserInfoVO getUserVO() {
		return userVO;
	}

	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
}
