/**
 * 
 */
package com.hgn.kimi.dal.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;
import com.hgn.kimi.dal.dao.BaseDAO;
import com.hgn.kimi.dal.dao.IIllegalInfoDAO;
import com.hgn.kimi.dal.dataobject.IllegalCodeDO;
import com.hgn.kimi.dal.dataobject.IllegalInfoDO;
import com.hgn.kimi.exception.DAOException;

/**
 * @author yinlei
 *
 */
public class IllegalInfoDAOImpl extends BaseDAO implements IIllegalInfoDAO {

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.IIllegalInfoDAO#queryIllegalInfo(java.lang.String)
	 */
	@Override
	public IllegalInfoDO queryIllegalInfo(String carNum) throws DAOException {
		if(Strings.isNullOrEmpty(carNum)) return null;
		Map<String, String> map = new HashMap<String, String>();
		map.put("carNum", carNum);
		try{
			IllegalInfoDO infoDO= (IllegalInfoDO) this.queryForObject("IllegalCode.queryIllegalCode", map);
			return infoDO;
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
			Map<String, Long> map = new HashMap<String, Long>();
			map.put("userId", userId);
			infoDOList= (List<IllegalInfoDO>) this.queryForList("IllegalInfo.queryIllegalInfo", map);
			return infoDOList;
		}catch (DAOException e) {
			throw new DAOException("[IllegalInfoDAOImpl-queryIllegalInfo]",e);
		}
	}

}
