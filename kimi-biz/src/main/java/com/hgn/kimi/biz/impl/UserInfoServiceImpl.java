/**
 * 
 */
package com.hgn.kimi.biz.impl;

import com.hgn.kimi.biz.IUserInfoService;
import com.hgn.kimi.dal.dao.IUserDAO;
import com.hgn.kimi.dal.dataobject.UserDO;
import com.hgn.kimi.exception.DAOException;
import com.hgn.kimi.vo.UserInfoVO;
import com.hgn.kimi.vo.transfer.UserInfoTransfer;

/**
 * @author yinlei
 *
 */
public class UserInfoServiceImpl implements IUserInfoService {

	private IUserDAO userDAO;
	
	
	/* (non-Javadoc)
	 * @see com.hgn.kimi.biz.IUserInfoService#getUserInfoVO(java.lang.Long)
	 */
	@Override
	public UserInfoVO getUserInfoVO(Long userId) {
		UserInfoVO userVO=null;
		try {
			if(null!=userId && userId>0){
				UserDO userDO = userDAO.queryUserInfo(userId);
				userVO = UserInfoTransfer.to(userDO);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
		return userVO;
	}

	/* (non-Javadoc)
	 * @see com.hgn.kimi.biz.IUserInfoService#userInfoRegister(com.hgn.kimi.vo.UserInfoVO)
	 */
	@Override
	public boolean userInfoRegister(UserInfoVO userVO) {
		if(null==userVO) return false;
		try {
			UserDO userDO = UserInfoTransfer.voToDo(userVO);
			return userDAO.CreateUserInfo(userDO);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	

}
