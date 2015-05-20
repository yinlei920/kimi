package com.hgn.kimi.dal.dao;

import java.util.List;

import com.hgn.kimi.dal.dataobject.UserDO;
import com.hgn.kimi.exception.DAOException;

public interface IUserDAO {
	
	
	
	public boolean CreateUserInfo(UserDO userdo) throws DAOException;;
	
	public List<UserDO> queryUserInfoList() throws DAOException;;
	
	public UserDO queryUserInfo(long userId) throws DAOException;;

}
