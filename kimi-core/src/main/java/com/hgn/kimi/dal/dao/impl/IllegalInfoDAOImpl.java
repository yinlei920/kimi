/**
 * 
 */
package com.hgn.kimi.dal.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;
import com.hgn.kimi.dal.dao.BaseDAO;
import com.hgn.kimi.dal.dao.IIllegalInfoDAO;
import com.hgn.kimi.dal.dataobject.IllegalInfoDO;
import com.hgn.kimi.exception.DAOException;

/**
 * @author yinlei
 *
 */
public class IllegalInfoDAOImpl extends BaseDAO implements IIllegalInfoDAO {
	
	
	protected Logger logger = LoggerFactory.getLogger(IllegalInfoDAOImpl.class);

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.IIllegalInfoDAO#queryIllegalInfo(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<IllegalInfoDO> queryIllegalInfo(String carNum) throws DAOException {
		if(Strings.isNullOrEmpty(carNum)) return null;
		List<IllegalInfoDO> infoDOList=null;
		try{
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carNum", carNum);
			map.put("status", 0);
			infoDOList= (List<IllegalInfoDO>) this.queryForList("IllegalInfo.queryIllegalInfo", map);
			return infoDOList;
		}catch (DAOException e) {
			throw new DAOException("[IllegalInfoDAOImpl-queryIllegalInfo]",e);
		}
	}

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.IIllegalInfoDAO#queryListByUserId(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<IllegalInfoDO> queryListByUserId(Long userId)throws DAOException{
		try{
			List<IllegalInfoDO> infoDOList=null;
			if(userId==0l) return null;
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("userId", userId);
			map.put("status", 0);
			infoDOList= (List<IllegalInfoDO>) this.queryForList("IllegalInfo.queryIllegalInfo", map);
			return infoDOList;
		}catch (DAOException e) {
			throw new DAOException("[IllegalInfoDAOImpl-queryIllegalInfo]",e);
		}
	}

}
