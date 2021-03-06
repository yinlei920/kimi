/**
 * 
 */
package com.hgn.kimi.dal.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hgn.kimi.dal.dao.BaseDAO;
import com.hgn.kimi.dal.dao.IUserDAO;
import com.hgn.kimi.dal.dataobject.UserDO;
import com.hgn.kimi.exception.DAOException;

/**
 * @author yinlei
 *
 */
public class UserDAOImpl extends BaseDAO implements IUserDAO {
	
	protected Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.IUserDAO#CreateUserInfo(com.hgn.kimi.dal.dataobject.UserDO)
	 */
	@Override
	public boolean CreateUserInfo(UserDO userDO) {
		if(null==userDO) return false;
		try {
			Long lastId = (Long)this.insert("UserInfo.insertUserInfo", userDO);
			return (lastId!=null && lastId>0)?true:false;
		} catch (DAOException e) {
			logger.error("UserDAOImpl.CreateUserInfo  error", e.getMessage());
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.IUserDAO#queryUserInfoList()
	 */
	@Override
	public List<UserDO> queryUserInfoList() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.IUserDAO#queryUserInfo(long)
	 */
	@Override
	public UserDO queryUserInfo(long userId) throws DAOException {
		UserDO userDO = null;
		try {
			userDO = (UserDO)this.queryForObject("UserInfo.queryUserInfo", userId);
		} catch (DAOException e) {
			throw new DAOException("[UserDAO-queryUserInfo]",e);
		}
		return userDO;
	}

}
