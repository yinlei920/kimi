/**
 * 
 */
package com.hgn.kimi.web;

import com.hgn.kimi.dal.dao.impl.UserDAOImpl;
import com.hgn.kimi.dal.dataobject.UserDO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author yinlei
 *
 */
public class TestWeb extends ActionSupport{
	
	private UserDAOImpl userDAO;
	
	
	private long id;
	
	
	private UserDO userdo;

	/**
	 * 
	 */
	private static final long serialVersionUID = 541711397474524195L;

	@Override
	public String execute() throws Exception {
		
		userdo=userDAO.queryUserInfo(id);
		
		return super.execute();
	}

	public void setUserDAO(UserDAOImpl userDAO) {
		this.userDAO = userDAO;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserDO getUserdo() {
		return userdo;
	}

	public void setUserdo(UserDO userdo) {
		this.userdo = userdo;
	}
	
	
		
}
