/**
 * 
 */
package com.hgn.kimi.dal.dao.impl;

import com.google.common.base.Strings;
import com.hgn.kimi.dal.dao.BaseDAO;
import com.hgn.kimi.dal.dao.IIllegalCodeDAO;
import com.hgn.kimi.dal.dataobject.IllegalCodeDO;
import com.hgn.kimi.exception.DAOException;

/**
 * @author yinlei
 *
 */
public class IllegalCodeDAOImpl extends BaseDAO implements IIllegalCodeDAO{

	/**
	 * 
	 */

	@Override
	public IllegalCodeDO queryIllegalCode(String code) throws DAOException {
		if(Strings.isNullOrEmpty(code)) return null;
		try{
			IllegalCodeDO codeDO= (IllegalCodeDO) this.queryForObject("IllegalCode.queryIllegalCode", code);
			return codeDO;
		}
		catch (DAOException e) {
			throw new DAOException("[UserDAO-queryUserInfo]",e);
		}
	}

	

}
