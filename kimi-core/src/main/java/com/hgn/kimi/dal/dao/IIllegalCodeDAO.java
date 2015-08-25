/**
 * 
 */
package com.hgn.kimi.dal.dao;

import com.hgn.kimi.dal.dataobject.IllegalCodeDO;
import com.hgn.kimi.exception.DAOException;

/**
 * @author yinlei
 *
 */
public interface IIllegalCodeDAO {

	
	public IllegalCodeDO queryIllegalCode(String code) throws DAOException;
}
