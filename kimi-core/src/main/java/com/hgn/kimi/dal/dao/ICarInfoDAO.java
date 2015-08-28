/**
 * 
 */
package com.hgn.kimi.dal.dao;

import java.util.List;

import com.hgn.kimi.dal.dataobject.CarInfoDO;
import com.hgn.kimi.exception.DAOException;

/**
 * @author yinlei
 *
 */
public interface ICarInfoDAO {

	
	
	
	public CarInfoDO getCarInfo(String carNum) throws DAOException;
	
	public List<CarInfoDO> getCarList(Long userId) throws DAOException;
	
}
