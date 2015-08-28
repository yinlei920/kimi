/**
 * 
 */
package com.hgn.kimi.dal.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;
import com.hgn.kimi.dal.dao.BaseDAO;
import com.hgn.kimi.dal.dao.ICarInfoDAO;
import com.hgn.kimi.dal.dataobject.CarInfoDO;
import com.hgn.kimi.exception.DAOException;

/**
 * @author yinlei
 *
 */
public class CarInfoDAOImpl extends BaseDAO implements ICarInfoDAO {

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.ICarInfoDAO#getCarInfo(java.lang.String)
	 */
	@Override
	public CarInfoDO getCarInfo(String carNum) throws DAOException {
		if(Strings.isNullOrEmpty(carNum)) return null;
		try{
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("carNum", carNum);
			map.put("status", 0);
			return (CarInfoDO)this.queryForObject("CarInfo.queryCars", map);
			
		}catch(DAOException e){
			throw new DAOException("CarInfoDAOImpl.getCarInfo",e);
		}
	}

	/* (non-Javadoc)
	 * @see com.hgn.kimi.dal.dao.ICarInfoDAO#getCarList(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CarInfoDO> getCarList(Long userId) throws DAOException {
		if(userId==0) return null;
		try{
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("userId", userId);
			map.put("status", 0);
			return (List<CarInfoDO>)this.queryForList("CarInfo.queryCars", map);
			
		}catch(DAOException e){
			throw new DAOException("CarInfoDAOImpl.getCarList",e);
		}
	}

}
