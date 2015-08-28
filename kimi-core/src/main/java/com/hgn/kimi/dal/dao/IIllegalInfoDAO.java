package com.hgn.kimi.dal.dao;

import java.util.List;

import com.hgn.kimi.dal.dataobject.IllegalInfoDO;
import com.hgn.kimi.exception.DAOException;

public interface IIllegalInfoDAO {
	
	
	public List<IllegalInfoDO> queryIllegalInfo(String carNum) throws DAOException;

	
	public List<IllegalInfoDO> queryListByUserId(Long userId) throws DAOException;
}
